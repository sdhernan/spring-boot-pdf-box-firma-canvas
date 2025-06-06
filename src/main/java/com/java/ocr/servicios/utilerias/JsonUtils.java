package com.java.ocr.servicios.utilerias;

import java.util.List;

/**
 * Metodo de parseo de objetos a Json y visceversa.
 *
 * @author cmejia 08-10-2015
 */
public interface JsonUtils {

	/**
	 * cre auna lista de objetos T.
	 *
	 * @param <T>       the generic type
	 * @param json      the json
	 * @param typeClass the type class
	 * @return the list
	 */
	<T> List<T> convertirJsonListaObjetos(String json, Class<T> typeClass);

	/**
	 * convierte ena cadena JSON a objeto de la clase T.
	 *
	 * @param <T>            the generic type
	 * @param json           the json
	 * @param typeParamClass the type param class
	 * @return the t
	 */
	<T> T convertirJsonObjeto(String json, Class<T> typeParamClass);

	/**
	 * convierte un alista de objetos a su correspondiente cadena JSON.
	 *
	 * @param <T>  the generic type
	 * @param objs the objs
	 * @return the string
	 */
	<T> String convertirListaObjetosJson(List<T> objs);

	/**
	 * Este metodo parsea un objeto a un String con formato JSON.
	 *
	 * @param <T> the generic type
	 * @param obj el objeto que se quiere parsear a formato JSON
	 * @return un String con formato JSON del objeto parseado
	 */
	<T> String convertirObjectJson(T obj);

	/**
	 * convierte objeto a xml.
	 *
	 * @param <T> the generic type
	 * @param obj the obj
	 * @return the string
	 */
	<T> String convertirObjetoAXml(T obj);

	/**
	 * Convertir objeto json.
	 *
	 * @param <T> the generic type
	 * @param obj the obj
	 * @return the string
	 */
	<T> String convertirObjetoJson(T obj);

	/**
	 * convierte ena cadena JSON a objeto de la clase T.
	 *
	 * @param <T>            the generic type
	 * @param json           the json
	 * @param typeParamClass the type param class
	 * @return the t
	 */
	<T> T parseJsonToObject(String json, Class<T> typeParamClass);

	/**
	 * Conviente una cadena json de arreglo a una lista del objeto de la clase T.
	 *
	 * @param <T>       the generic type
	 * @param json      the json
	 * @param typeClass the type class
	 * @return the list
	 */
	<T> List<T> parseJsonToObjectList(String json, Class<T> typeClass);

	/**
	 * convierte un alista de objetos a su correspondiente cadena JSON.
	 *
	 * @param <T>  the generic type
	 * @param objs the objs
	 * @return the string
	 */
	<T> String parseListObjectToJson(List<T> objs);

	/**
	 * Metodo para tranformar una lista de objetos en una lista Pojo.
	 *
	 * @author Ricardo Alcantara Ramirez (RALCANTA@inet.procesar.com.mx) Oct 31,
	 *         2019
	 * @param <T>       the generic type
	 * @param lstObjs   the lst objs
	 * @param typeClass the type class
	 * @return lista del tipo de clase
	 */
	<T> List<T> parseListObjectToListPojo(List<T> lstObjs, Class<T> typeClass);

	/**
	 * Este metodo parsea un objeto a un String con formato JSON.
	 *
	 * @param <T> the generic type
	 * @param obj el objeto que se quiere parsear a formato JSON
	 * @return un String con formato JSON del objeto parseado
	 */
	<T> String parseObjectToJson(T obj);

	/**
	 * Este metodo parsea un objeto a un String con formato JSON.
	 *
	 * @param <T> the generic type
	 * @param obj el objeto que se quiere parsear a formato JSON
	 * @return un String con formato JSON del objeto parseado
	 */
	<T> String parseObjectToJsonSC(T obj);
	
	/**
	 * Convierte linkeds
	 * @param json
	 * @param typeParamClass
	 * @return
	 */
	<T> T convertirJsonObjetoLinked(Object json, Class<T> typeParamClass);
	
	/**
	 * Arreglo de byte
	 * @param json
	 * @return
	 */
	byte[] convertirJsonObjetoByte(Object json);
	
	/**
	 * Convierte un linked list
	 * @param json
	 * @param typeClass
	 * @return
	 */
	<T> List<T> convertirJsonListObjetoLinked(Object json, Class<T> typeClass);
}