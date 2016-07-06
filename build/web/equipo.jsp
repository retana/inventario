<%-- 
    Document   : dashboard
    Created on : 14/06/2016, 04:26:04 PM
    Author     : retana
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="include/sessionController.jsp" %>
<%@include file="include/head.jspf" %>
<div class="wrapper">  
    <%@include file="include/header.jspf" %>
    <!-- Full Width Column -->
    <div class="content-wrapper">
        <div class="container">
            <!-- Content Header (Page header) -->
            <section class="content-header">
                <h1>
                    EQUIPO 
                    <small>Administración</small>
                </h1>

                <ol class="breadcrumb">
                    <li><a href="#"><i class="fa fa-dashboard"></i> Dashboard</a></li>
                </ol>

            </section>

            <!-- Main content -->
            <section class="content">
                <div class="box">
                    <div class="box-header">
                        
                        <div class="dropdown">
                            <button class="btn btn-adn dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
                                Operación
                                <span class="caret"></span>
                            </button>
                            <ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
                                <li><a href="#" data-toggle="modal" data-target="#exampleModal" data-whatever="@mdo">Agregar Equipo</a></li>
                            </ul>
                        </div>
                    </div>
                    <!-- /.box-header -->
                    <div class="box-body">

                        <table id="example1" class="table table-striped table-bordered">
                            <thead>
                                <tr>
                                    <th>#</th>
                                    <th>Marca</th>
                                    <th>Modelo</th>
                                    <th>Serie</th>
                                    <th>Ubicación</th>
                                    <th>F. Compra</th>
                                    <th>Fin Garantia</th>
                                    <th>Tiempo de Vida</th>
                                    <th>Estado de Garantia</th>
                                    <th>Estado</th>
                                    <th>Tipo</th>
                                    <th>Empresa</th>
                                    <th>IP</th>
                                    <th>MAC</th>
                                    <th>ACTIVE DIRECTORY</th>
                                    <th>HOST</th>
                                    <th>LICENCIA</th>
                                    <th>OS</th>
                                    <th>Opciones</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach items="${listaEquipo}" var="equipo">
                                    <tr>
                                        <td>${equipo.getIdEquipo()}</td>
                                        <td>${equipo.getMarca()}</td>
                                        <td>${equipo.getModelo()}</td>
                                        <td>${equipo.getNumSerie()}</td>
                                        <td>${equipo.getUbicacion()}</td>
                                        <td>${equipo.getFechaCompra()}</td>
                                        <td>${equipo.getFinGarantia()}</td>
                                        <td>${equipo.getTiempoDeVida()}</td>
                                        <td>${equipo.getEstadoDeGarantia()}</td>
                                        <td>${equipo.getEstado().getNombre()}</td>
                                        <td>${equipo.getTipo().getNombre()}</td>
                                        <td>${equipo.getEmpresa().getNombre()}</td>
                                        <td>${equipo.getIp()}</td>
                                        <td>${equipo.getMacAddress()}</td>
                                        <td>${equipo.getUserActivedirectory()}</td>
                                        <td>${equipo.getHostName()}</td>
                                        <td>${equipo.getLicencia()}</td>
                                        <td>${equipo.getOs()}</td>
                                        <td>
                                            <a href="eliminarEquipo.do?idEquipo=${equipo.getIdEquipo()}"><span class="glyphicon glyphicon-erase"></a>
                                            <a href="#"><span class="glyphicon glyphicon-pencil"></span></a>
                                        </td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                            <tfoot>
                                <tr>
                                    <th>#</th>
                                    <th>Marca</th>
                                    <th>Modelo</th>
                                    <th>Serie</th>
                                    <th>Ubicación</th>
                                    <th>F. Compra</th>
                                    <th>Fin Garantia</th>
                                    <th>Tiempo de Vida</th>
                                    <th>Estado de Garantia</th>
                                    <th>Estado</th>
                                    <th>Tipo</th>
                                    <th>Empresa</th>
                                    <th>IP</th>
                                    <th>MAC</th>
                                    <th>ACTIVE DIRECTORY</th>
                                    <th>HOST</th>
                                    <th>LICENCIA</th>
                                    <th>OS</th>
                                    <th>Opciones</th>
                                </tr>
                            </tfoot>
                        </table>
                    </div>
                    <!-- /.box-body -->
                </div>
                <!-- /.box -->
            </section>            
        </div>
    </div>
    <!-- /.content-wrapper -->
    <%@include file="include/footer.jspf" %>
</div>
<!-- ./wrapper -->
<%@include file="include/imports.jspf" %>

<%@include file="agregarequipo.jspf" %>
<!-- page script -->
<script>

    $("#example1").DataTable();
    $('#exampleModal').on('show.bs.modal', function (event) {
        var button = $(event.relatedTarget) // Button that triggered the modal
        var recipient = button.data('whatever') // Extract info from data-* attributes
        // If necessary, you could initiate an AJAX request here (and then do the updating in a callback).
        // Update the modal's content. We'll use jQuery here, but you could use a data binding library or other methods instead.
        var modal = $(this)
        
        $('#btn-agregar').on('click',function(){
            $('#form-equipo').submit();
        });
    })
</script>
</body>
</html>
