<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF8"%>
<html xmlns="http://www.w3.org/1999/xhtml" lang="es">

<head>
  <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css"/>
  <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
  <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
  <!------ Include the above in your HEAD tag ---------->
  <style>
    .tree,
    .tree ul {
      margin: 0;
      padding: 0;
      list-style: none
    }

    .tree ul {
      margin-left: 1em;
      position: relative
    }

    .tree ul ul {
      margin-left: .5em
    }

    .tree ul:before {
      content: "";
      display: block;
      width: 0;
      position: absolute;
      top: 0;
      bottom: 0;
      left: 0;
      border-left: 1px solid
    }

    .tree li {
      margin: 0;
      padding: 0 1em;
      line-height: 2em;
      color: #369;
      font-weight: 700;
      position: relative
    }

    .tree ul li:before {
      content: "";
      display: block;
      width: 10px;
      height: 0;
      border-top: 1px solid;
      margin-top: -1px;
      position: absolute;
      top: 1em;
      left: 0
    }

    .tree ul li:last-child:before {
      background: #fff;
      height: auto;
      top: 1em;
      bottom: 0
    }

    .indicator {
      margin-right: 5px;
    }

    .tree li a {
      text-decoration: none;
      color: #369;
    }

    .tree li button,
    .tree li button:active,
    .tree li button:focus {
      text-decoration: none;
      color: #369;
      border: none;
      background: transparent;
      margin: 0px 0px 0px 0px;
      padding: 0px 0px 0px 0px;
      outline: 0;
    }

    .cursor-hand {
      cursor: pointer;
    }
  </style>


</head>

<body>
  <div class="container" style="margin-top:30px;">
    <div class="row">
      <div class="col-md-4">
        <ul id="tree2">
          <li><a href="#">REPORTES</a>
            <ul>
               <c:forEach items="${directorios}" var="directorio">
                <c:if test="${directorio.nombre != ''}">
                   <li>Reports ${directorio.nombre} 
                    <ul>
                      <li><a href="">01 - Enero</a></li>
                      <li><a href="">02 - Febrero</a></li>
                      <li><a href="">03 - Marzo</a></li>
                      <li><a href="">04 - Abril</a></li>
                      <li><a href="">05 - Mayo</a></li>      
                      <li><a href="">06 - Junio</a></li>
                      <li><a href="">07 - Julio</a></li>
                      <li><a href="">08 - Agosto</a></li>
                      <li><a href="">09 - Septiembre</a></li>
                      <li><a href="">10 - Octubre</a></li>
                      <li><a href="">11 - Noviembre</a></li>
                      <li><a href="">12 - Diciembre</a></li>
                    </ul>
                  </li>
        		</c:if>
        		 <c:if test="${directorio.nombre == ''}">
		        	<li>No hay directorios</li>
		        </c:if>
             </c:forEach>
            </ul>
          </li>
        </ul>
      </div>
      <div class="col-md-8">

        <table class="table table-striped">
          <thead>
            <tr>
              <th scope="col">#</th>
              <th scope="col"></th>
              <th class="text-center" scope="col">Nombre</th>
              <th class="text-center" scope="col">Tamaño</th>
              <th class="text-center" scope="col">Fecha Creación</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <th scope="row">1</th>
              <td><a href="/dowloadExcel"> <i class="fa-sharp fa-solid fa-file-excel fa-2x text-success cursor-hand" title="Descargar"></i></a></td>
              <td>MODOSFJHEHFJDGHDF.xls</td>
              <td class="text-center">3KB</td>
              <td class="text-center">12/12/2022</td>
            </tr>
            <tr>
              <th scope="row">2</th>
              <td><i class="fa-sharp fa-solid fa-file-excel fa-2x text-success cursor-hand" title="Descargar"></i></td>
              <td>MODOSFJHEHFJDGHDF.xls</td>
              <td class="text-center">3KB</td>
              <td class="text-center">12/12/2022</td>
            </tr>
            <tr>
              <th scope="row">3</th>
              <td><i class="fa-sharp fa-solid fa-file-excel fa-2x text-success cursor-hand" title="Descargar"></i></td>
              <td>MODOSFJHEHFJDGHDF.xls</td>
              <td class="text-center">3KB</td>
              <td class="text-center">12/12/2022</td>
            </tr>
            <tr>
              <th scope="row">4</th>
              <td><i class="fa-sharp fa-solid fa-file-excel fa-2x text-success cursor-hand" title="Descargar"></i></td>
              <td>MODOSFJHEHFJDGHDF.xls</td>
              <td class="text-center">3KB</td>
              <td class="text-center">12/12/2022</td>
            </tr>
            <tr>
              <th scope="row">5</th>
              <td><i class="fa-sharp fa-solid fa-file-excel fa-2x text-success cursor-hand" title="Descargar"></i></td>
              <td>MODOSFJHEHFJDGHDF.xls</td>
              <td class="text-center">3KB</td>
              <td class="text-center">12/12/2022</td>
            </tr>
          </tbody>
        </table>

      </div>
    </div>
  </div>
  <script>

    $.fn.extend({
      treed: function (o) {

        var openedClass = 'glyphicon-minus-sign';
        var closedClass = 'glyphicon-plus-sign';

        if (typeof o != 'undefined') {
          if (typeof o.openedClass != 'undefined') {
            openedClass = o.openedClass;
          }
          if (typeof o.closedClass != 'undefined') {
            closedClass = o.closedClass;
          }
        };

        //initialize each of the top levels
        var tree = $(this);
        tree.addClass("tree");
        tree.find('li').has("ul").each(function () {
          var branch = $(this); //li with children ul
          branch.prepend("<i class='indicator glyphicon " + closedClass + "'></i>");
          branch.addClass('branch');
          branch.on('click', function (e) {
            if (this == e.target) {
              var icon = $(this).children('i:first');
              icon.toggleClass(openedClass + " " + closedClass);
              $(this).children().children().toggle();
            }
          })
          branch.children().children().toggle();
        });
        //fire event from the dynamically added icon
        tree.find('.branch .indicator').each(function () {
          $(this).on('click', function () {
            $(this).closest('li').click();
          });
        });
        //fire event to open branch if the li contains an anchor instead of text
        tree.find('.branch>a').each(function () {
          $(this).on('click', function (e) {
            $(this).closest('li').click();
            e.preventDefault();
          });
        });
        //fire event to open branch if the li contains a button instead of text
        tree.find('.branch>button').each(function () {
          $(this).on('click', function (e) {
            $(this).closest('li').click();
            e.preventDefault();
          });
        });
      }
    });

    //Initialization of treeviews

    $('#tree1').treed();

    $('#tree2').treed({ openedClass: 'glyphicon-folder-open', closedClass: 'glyphicon-folder-close' });

    $('#tree3').treed({ openedClass: 'glyphicon-chevron-right', closedClass: 'glyphicon-chevron-down' });


  </script>
</body>

</html>