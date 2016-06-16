<%-- 
    Document   : dashboard
    Created on : 14/06/2016, 04:26:04 PM
    Author     : retana
--%>
<%@include file="../include/sessionController.jsp" %>
<%@include file="../include/head2.jspf" %>
<div class="wrapper">  
    <%@include file="../include/header2.jspf" %>
    <!-- Full Width Column -->
    <div class="content-wrapper">
        <div class="container">
            <!-- Content Header (Page header) -->
            <section class="content-header">
                <h1>
                    EQUIPO
                    <small>Administraci�n</small>
                </h1>
                <ol class="breadcrumb">
                    <li><a href="#"><i class="fa fa-dashboard"></i> Dashboard</a></li>
                </ol>
            </section>

            <!-- Main content -->
            <section class="content">
                <div class="box">
                    <div class="box-header">
                        <h3 class="box-title">Listado de Equipo</h3>
                    </div>
                    <!-- /.box-header -->
                    <div class="box-body">
                        <table id="example1" class="table table-striped table-bordered">
                            <thead>
                                <tr>
                                    <th>Rendering engine</th>
                                    <th>Browser</th>
                                    <th>Platform(s)</th>
                                    <th>Engine version</th>
                                    <th>CSS grade</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>Trident</td>
                                    <td>Internet
                                        Explorer 4.0
                                    </td>
                                    <td>Win 95+</td>
                                    <td> 4</td>
                                    <td>X</td>
                                </tr>
                            </tbody>
                            <tfoot>
                                <tr>
                                    <th>Rendering engine</th>
                                    <th>Browser</th>
                                    <th>Platform(s)</th>
                                    <th>Engine version</th>
                                    <th>CSS grade</th>
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
    <%@include file="../include/footer.jspf" %>
</div>
<!-- ./wrapper -->
<%@include file="../include/imports2.jspf" %>
<!-- page script -->
<script>
  var editor;
  $(document).on('ready',function(){
        $("#example1").DataTable({
            "bProcessing": true,
            "sAjaxSource": '../equipo.do'
        });
    });
</script>
</body>
</html>
