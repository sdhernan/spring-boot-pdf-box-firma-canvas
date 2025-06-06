package com.java.ocr.servicios.utilerias.impl;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.Transparency;
import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.ComponentColorModel;
import java.awt.image.DataBuffer;
import java.awt.image.DataBufferByte;
import java.awt.image.FilteredImageSource;
import java.awt.image.ImageFilter;
import java.awt.image.ImageProducer;
import java.awt.image.RGBImageFilter;
import java.awt.image.renderable.ParameterBlock;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.media.jai.JAI;
import javax.media.jai.PlanarImage;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.PDPageContentStream.AppendMode;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.LosslessFactory;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;
import org.imgscalr.Scalr;
import org.opencv.core.Mat;
import org.opencv.core.MatOfPoint;
import org.opencv.core.Rect;
import org.opencv.core.Size;
import org.opencv.imgproc.Imgproc;
import org.springframework.stereotype.Component;

import com.java.ocr.servicios.utilerias.PDFUtils;
import com.lowagie.text.pdf.codec.Base64;

import net.coobird.thumbnailator.Thumbnails;
import nu.pattern.OpenCV;

/**
 * The Class PDFUtilsImpl.
 */
@Component
public class PDFUtilsImpl implements PDFUtils {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.java.ocr.servicios.utilerias.PDFUtils#agregarCirculo(org.apache.pdfbox.
	 * pdmodel.PDDocument, int, float, float, int, int)
	 */
	@Override
	public void agregarCirculo(PDDocument pdfDocument, int numPagina, float posX, float posY, int ancho, int alto)
			throws IOException {

		PDPage pagina = pdfDocument.getPage(numPagina);
		PDPageContentStream contentStream = new PDPageContentStream(pdfDocument, pagina, AppendMode.APPEND,
				Boolean.FALSE);

		PDImageXObject imagen = LosslessFactory.createFromImage(pdfDocument, circle(ancho * 2, alto * 2));
		contentStream.drawImage(imagen, posX, posY);
		contentStream.close();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.java.ocr.servicios.utilerias.PDFUtils#agregarFirma(java.lang.String,
	 * org.apache.pdfbox.pdmodel.PDDocument, int, float, float, int, int)
	 */
	@Override
	public void agregarFirma(String imagenCadena, PDDocument pdfDocument, int numPagina, float posX, float posY,
			int ancho, int alto) throws IOException {

		if (imagenCadena == null || imagenCadena.isEmpty()) {
			return;
		}

		PDPage pagina = pdfDocument.getPage(numPagina);
		PDPageContentStream contentStream = new PDPageContentStream(pdfDocument, pagina, AppendMode.APPEND,
				Boolean.FALSE);
		BufferedImage bufferImagen = obtenerImagenTamano(imagenCadena, ancho, alto);

		PDImageXObject imagen = LosslessFactory.createFromImage(pdfDocument, bufferImagen);
		contentStream.drawImage(imagen, posX, posY);
		contentStream.close();

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.java.ocr.servicios.utilerias.PDFUtils#agregarFirmaSinTransparencia(java.
	 * lang.String, org.apache.pdfbox.pdmodel.PDDocument, int, float, float, int,
	 * int)
	 */
	@Override
	public void agregarFirmaSinTransparencia(String imagenCadena, PDDocument pdfDocument, int numPagina, float posX,
			float posY, int ancho, int alto) throws IOException {

		if (imagenCadena == null || imagenCadena.isEmpty()) {
			return;
		}

		PDPage pagina = pdfDocument.getPage(numPagina);
		PDPageContentStream contentStream = new PDPageContentStream(pdfDocument, pagina, AppendMode.APPEND,
				Boolean.FALSE);

		BufferedImage bimagen;
		byte[] imagenByte;

		imagenByte = Base64.decode(imagenCadena);
		bimagen = ImageIO.read(new ByteArrayInputStream(imagenByte));

		BufferedImage cropped = cortarImagen(bimagen);

		BufferedImage scaledImage = Scalr.resize(cropped, Scalr.Method.ULTRA_QUALITY, ancho);

		PDImageXObject imagen = LosslessFactory.createFromImage(pdfDocument, scaledImage);
		contentStream.drawImage(imagen, posX, posY);
		contentStream.close();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.java.ocr.servicios.utilerias.PDFUtils#agregarTexto(java.lang.String,
	 * org.apache.pdfbox.pdmodel.PDDocument, int, float, float, java.lang.Integer)
	 */
	@Override
	public void agregarTexto(String texto, PDDocument pdfDocument, int numPagina, float posX, float posY,
			Integer fontSize) throws IOException {

		if (texto == null || texto.isEmpty()) {
			return;
		}

		PDPage pagina = pdfDocument.getPage(numPagina);
		PDPageContentStream contentStream = new PDPageContentStream(pdfDocument, pagina, AppendMode.APPEND,
				Boolean.FALSE, Boolean.TRUE);
		contentStream.beginText();
		contentStream.setFont(PDType1Font.HELVETICA, fontSize);

		contentStream.newLineAtOffset(posX, posY);
		contentStream.showText(texto);
		contentStream.endText();
		contentStream.close();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.java.ocr.servicios.utilerias.PDFUtils#agregarTexto(java.lang.String,
	 * org.apache.pdfbox.pdmodel.PDDocument, int, float, float, java.lang.String)
	 */
	@Override
	public void agregarTexto(String texto, PDDocument pdfDocument, int numPagina, float posX, float posY, String var)
			throws IOException {

		if (texto == null || texto.isEmpty()) {
			return;
		}

		PDPage pagina = pdfDocument.getPage(numPagina);
		PDPageContentStream contentStream = new PDPageContentStream(pdfDocument, pagina, AppendMode.APPEND,
				Boolean.FALSE, Boolean.TRUE);
		contentStream.beginText();
		if ("0".equals(var)) {
			contentStream.setFont(PDType1Font.HELVETICA, 6);
		} else {
			contentStream.setFont(PDType1Font.HELVETICA, 7);
		}

		contentStream.newLineAtOffset(posX, posY);
		contentStream.showText(texto);
		contentStream.endText();
		contentStream.close();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.java.ocr.servicios.utilerias.PDFUtils#agregarTextoConColor(java.lang.
	 * String, org.apache.pdfbox.pdmodel.PDDocument, int, float, float,
	 * java.lang.Integer)
	 */
	@Override
	public void agregarTextoConColor(String texto, PDDocument pdfDocument, int numPagina, float posX, float posY,
			Integer fontSize, Color color) throws IOException {
		if (texto == null || texto.isEmpty()) {
			return;
		}

		PDPage pagina = pdfDocument.getPage(numPagina);
		PDPageContentStream contentStream = new PDPageContentStream(pdfDocument, pagina, AppendMode.APPEND,
				Boolean.FALSE, Boolean.TRUE);
		contentStream.beginText();
		contentStream.setNonStrokingColor(color);
		contentStream.setFont(PDType1Font.HELVETICA, fontSize);

		contentStream.newLineAtOffset(posX, posY);
		contentStream.showText(texto);
		contentStream.endText();
		contentStream.close();

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.java.ocr.servicios.utilerias.PDFUtils#agregarTextoLargo(java.lang.String,
	 * org.apache.pdfbox.pdmodel.PDDocument, int, float, float, java.lang.Integer)
	 */
	@Override
	public void agregarTextoLargo(String text, PDDocument pdfDocument, int numPagina, float posX, float posY,
			Integer fontSize, Integer ancho) throws IOException {
		if (text == null || text.isEmpty()) {
			return;
		}

		PDPage pagina = pdfDocument.getPage(numPagina);
		PDPageContentStream contentStream = new PDPageContentStream(pdfDocument, pagina, AppendMode.APPEND,
				Boolean.FALSE, Boolean.TRUE);

		List<String> lines = new ArrayList<>();
		int lastSpace = -1;

		PDFont pdfFont = PDType1Font.HELVETICA;

		float leading = 1.5f * fontSize;

		while (text.length() > 0) {

			int spaceIndex = text.indexOf(' ', lastSpace + 1);

			if (spaceIndex < 0) {
				spaceIndex = text.length();
			}

			String subString = text.substring(0, spaceIndex);

			float size = fontSize * pdfFont.getStringWidth(subString) / 1000;

			if (size > ancho) {

				if (lastSpace < 0) {
					lastSpace = spaceIndex;
				}
				subString = text.substring(0, lastSpace);

				lines.add(subString);
				text = text.substring(lastSpace).trim();
				lastSpace = -1;

			} else if (spaceIndex == text.length()) {

				lines.add(text);
				text = "";

			} else {

				lastSpace = spaceIndex;
			}
		}

		contentStream.beginText();
		contentStream.setFont(PDType1Font.HELVETICA, fontSize);
		contentStream.newLineAtOffset(posX, posY);
		for (

		String line : lines) {
			contentStream.showText(line);
			contentStream.newLineAtOffset(0, -leading);
		}

		contentStream.endText();
		contentStream.close();

	}

	/**
	 * Obtener imagen tamano.
	 *
	 * @param imagenCadena the imagen cadena
	 * @param anchoFijo    the ancho fijo
	 * @param altoFijo     the alto fijo
	 * @return the buffered image
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public BufferedImage obtenerImagenTamano(String imagenCadena, int anchoFijo, int altoFijo) throws IOException {
		BufferedImage imagen;
		byte[] imagenByte;

		imagenByte = Base64.decode(imagenCadena);
		imagen = ImageIO.read(new ByteArrayInputStream(imagenByte));

		//BufferedImage cropped = cortarImagen(imagen);

		//Image tmpd = blancoATransparencia(cropped, new Color(cropped.getRGB(0, 0)));
		//BufferedImage imageTrans = imageToBuffered(tmpd, cropped.getWidth(), cropped.getHeight());

		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		Thumbnails.of(imagen).size(anchoFijo, altoFijo).outputFormat("PNG").outputQuality(1)
				.toOutputStream(outputStream);
		byte[] data = outputStream.toByteArray();

		ByteArrayInputStream inputStream = new ByteArrayInputStream(data);
		return ImageIO.read(inputStream);

	}

	/**
	 * Resize.
	 *
	 * @param ancho the ancho
	 * @param alto  the alto
	 * @param src   the src
	 * @return the buffered image
	 */
	public BufferedImage resize(int ancho, int alto, BufferedImage src) {

		final BufferedImage bufferedImage = new BufferedImage(ancho, alto, BufferedImage.TYPE_INT_ARGB);
		final Graphics2D graphics2D = bufferedImage.createGraphics();
		graphics2D.drawImage(src, 0, 0, ancho, alto, null);
		graphics2D.dispose();
		return bufferedImage;
	}

	/**
	 * Blanco A transparencia.
	 *
	 * @param image the image
	 * @param color the color
	 * @return the image
	 */
	private Image blancoATransparencia(BufferedImage image, final Color color) {

		ImageFilter filter = new RGBImageFilter() {

			public int markerRGB = color.getRGB() | 0xFFFFFFFF;

			@Override
			public int filterRGB(int x, int y, int rgb) {
				if ((rgb | 0xFF000000) == markerRGB) {
					return 0x00FFFFFF & rgb;
				} else {
					return rgb;
				}
			}
		};
		ImageProducer ip = new FilteredImageSource(image.getSource(), filter);
		return Toolkit.getDefaultToolkit().createImage(ip);
	}

	/**
	 * Circle.
	 *
	 * @param width  the width
	 * @param height the height
	 * @return the buffered image
	 */
	private BufferedImage circle(int width, int height) {

		BufferedImage dest = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g = dest.createGraphics();
		g.setPaint(new Color(5, 109, 174));
		g.fillOval(0, 0, width, height);
		g.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
		g.dispose();

		return dest;
	}

	/**
	 * Cortar imagen.
	 *
	 * @param source the source
	 * @return the buffered image
	 */
	private BufferedImage cortarImagen(BufferedImage source) {

		int baseColor = source.getRGB(0, 0);

		int width = source.getWidth();
		int height = source.getHeight();

		int topY = Integer.MAX_VALUE;
		int topX = Integer.MAX_VALUE;
		int bottomY = -1;
		int bottomX = -1;
		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				if (toleranciaColor(baseColor, source.getRGB(x, y), 0.0)) {
					if (x < topX)
						topX = x;
					if (y < topY)
						topY = y;
					if (x > bottomX)
						bottomX = x;
					if (y > bottomY)
						bottomY = y;
				}
			}
		}

		BufferedImage destination = new BufferedImage(bottomX - topX + 1, bottomY - topY + 1,
				BufferedImage.TYPE_INT_ARGB);

		destination.getGraphics().drawImage(source, 0, 0, destination.getWidth(), destination.getHeight(), topX, topY,
				bottomX, bottomY, null);

		return destination;
	}

	/**
	 * Image to buffered.
	 *
	 * @param image  the image
	 * @param width  the width
	 * @param height the height
	 * @return the buffered image
	 */
	private BufferedImage imageToBuffered(Image image, int width, int height) {

		BufferedImage dest = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g = dest.createGraphics();
		g.drawImage(image, 0, 0, null);
		g.dispose();
		return dest;

	}

	/**
	 * Tolerancia color.
	 *
	 * @param a          the a
	 * @param b          the b
	 * @param tolerancia the tolerancia
	 * @return true, if successful
	 */
	private boolean toleranciaColor(int a, int b, double tolerancia) {

		int aAlpha = (a & 0xFF000000 >>> 24);
		int aRed = (a & 0x00FF0000 >>> 16);
		int aGreen = (a & 0x0000FF00 >>> 8);
		int aBlue = (a & 0x000000FF);

		int bAlpha = (b & 0xFF000000 >>> 24);
		int bRed = (b & 0x00FF0000 >>> 16);
		int bGreen = (b & 0x0000FF00 >>> 8);
		int bBlue = (b & 0x000000FF);

		double distancia = Math.sqrt((aAlpha - bAlpha) * (aAlpha - bAlpha) + (aRed - bRed) * (aRed - bRed)
				+ (aGreen - bGreen) * (aGreen - bGreen) + (aBlue - bBlue) * (aBlue - bBlue));
		double porcentajeDistancia = distancia / 510.0d;

		return porcentajeDistancia > tolerancia;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * mx.com.procesar.aplicaciones.traspasos.pulssar.servicios.utilerias.PdfUtils#
	 * agregarFirmaSinTransparenciaSinRecorte(java.lang.String,
	 * org.apache.pdfbox.pdmodel.PDDocument, int, float, float, int, int)
	 */
	@Override
	public void agregarFirmaSinTransparenciaSinRecorte(String imagenCadena, PDDocument pdfDocument, int numPagina,
			float posX, float posY, int ancho, int alto) throws IOException {

		if (imagenCadena == null || imagenCadena.isEmpty()) {
			return;
		}
		
	

		PDPage pagina = pdfDocument.getPage(numPagina);
		PDPageContentStream contentStream = new PDPageContentStream(pdfDocument, pagina, AppendMode.APPEND,
				Boolean.FALSE);

		BufferedImage bimagen;
		byte[] imagenByte;

		imagenByte = Base64.decode(imagenCadena);
		bimagen = ImageIO.read(new ByteArrayInputStream(imagenByte));
		
		;
		
		//BufferedImage cropped = cortarImagen(convertirImagenAJPG(bimagen));

		//BufferedImage scaledImage = Scalr.resize(recortarFirma(convertirImagenAJPG(bimagen)), Scalr.Method.ULTRA_QUALITY, ancho);

		PDImageXObject imagen = LosslessFactory.createFromImage(pdfDocument, cambiarTamano(recortarFirma(convertirImagenAJPG(bimagen)), ancho,alto));
		contentStream.drawImage(imagen, posX, posY);
		contentStream.close();

	}

	
	private BufferedImage convertirImagenAJPG(BufferedImage bufferedImage) throws IOException{
		
		
		Path target = Paths.get("D:\\DATOS\\AT\\PULSSAR\\documentos\\552\\new.jpg");
		
		
		// create a blank, RGB, same width and height
        BufferedImage newBufferedImage = new BufferedImage(
        		bufferedImage.getWidth(),
        		bufferedImage.getHeight(),
                BufferedImage.TYPE_INT_RGB);
        
     // draw a white background and puts the originalImage on it.
        newBufferedImage.createGraphics()
                .drawImage(bufferedImage,
                        0,
                        0,
                        Color.WHITE,
                        null);
    	// save an image
        ImageIO.write(newBufferedImage, "jpg", target.toFile());
		return newBufferedImage;
		
	}
	
	public static BufferedImage recortarFirma(BufferedImage imagen) throws IOException {
		
		OpenCV.loadShared();
		
        BufferedImage imagenGrises = new BufferedImage(imagen.getWidth(), imagen.getHeight(), BufferedImage.TYPE_BYTE_GRAY);
        imagenGrises.getGraphics().drawImage(imagen, 0, 0, null);
        
        Mat matImagen = new Mat(imagenGrises.getHeight(), imagenGrises.getWidth(), org.opencv.core.CvType.CV_8UC1);
        byte[] data = ((DataBufferByte) imagenGrises.getRaster().getDataBuffer()).getData();
        matImagen.put(0, 0, data);
        
        Imgproc.GaussianBlur(matImagen, matImagen, new org.opencv.core.Size(5, 5), 0);
        
        Imgproc.threshold(matImagen, matImagen, 0, 255, Imgproc.THRESH_BINARY_INV | Imgproc.THRESH_OTSU);
        
        List<MatOfPoint> contornos = new ArrayList<>();
        Mat jerarquia = new Mat();
        Imgproc.findContours(matImagen, contornos, jerarquia, Imgproc.RETR_LIST, Imgproc.CHAIN_APPROX_SIMPLE);
        
        double areaMaxima = 0;
        int indiceMaximo = -1;
        for (int i = 0; i < contornos.size(); i++) {
            double area = Imgproc.contourArea(contornos.get(i));
            if (area > areaMaxima) {
                areaMaxima = area;
                indiceMaximo = i;
            }
        }
        
        Rect rectanguloFirma = null;
        if (indiceMaximo != -1) {
            MatOfPoint contornoFirma = contornos.get(indiceMaximo);
            rectanguloFirma = Imgproc.boundingRect(contornoFirma);
            
            // Ajustar el rectángulo para incluir un poco de margen
            int margen = 10;
            rectanguloFirma.x = Math.max(rectanguloFirma.x - margen, 0);
            rectanguloFirma.y = Math.max(rectanguloFirma.y - margen, 0);
            rectanguloFirma.width = Math.min(rectanguloFirma.width + margen * 2, imagen.getWidth() - rectanguloFirma.x);
            rectanguloFirma.height = Math.min(rectanguloFirma.height + margen * 2, imagen.getHeight() - rectanguloFirma.y);
        }
        
        if (rectanguloFirma != null) {
            BufferedImage firmaRecortada = imagen.getSubimage(rectanguloFirma.x, rectanguloFirma.y, rectanguloFirma.width, rectanguloFirma.height);
            

    		Path target = Paths.get("D:\\DATOS\\AT\\PULSSAR\\documentos\\552\\newss.jpg");
    		// save an image
            ImageIO.write(firmaRecortada, "jpg", target.toFile());
            return firmaRecortada;
        } else {
            return null;
        }
    }

	
	public static BufferedImage cambiarTamano(BufferedImage imagen, int nuevoAncho,int nuevoAlto) throws IOException {
        // Redimensionar la imagen utilizando Thumbnails
        BufferedImage imagenNueva = Thumbnails.of(imagen).outputQuality(1.0)
                .width(nuevoAncho)
                .height(nuevoAlto)
                .asBufferedImage();
        
        // Escribir la imagen redimensionada en una matriz de bytes
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ImageIO.write(imagenNueva, "png", outputStream);
        byte[] bytes = outputStream.toByteArray();
        
        // Leer la imagen desde la matriz de bytes
        BufferedImage imagenFinal = ImageIO.read(new ByteArrayInputStream(bytes));
        
        return imagenFinal;
    }
}
