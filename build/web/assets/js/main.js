/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).on('ready',function(){
    $("#btn-login").on('click',function (evt){
        evt.preventDefault();
        evt.stopImmediatePropagation();
        $.ajax({
            url: 'login.do',
            data: $("#form-login").serialize(),
            method: 'post',
            datatype: 'json'
        }).done(function(data){
            //console.log(data);
            if(data.bool){
                window.location.href="dashboard.jsp";
            }else{
                $.notify('<strong>'+data.estado+'</strong> '+data.descripcion, {
                        allow_dismiss: true,
                        showProgressbar: true,
                        element: 'body',
                        position: null,
                        placement: {
                            from: "top",
                            align: "right"
                        },
                        timer: 1000,
                        type: "warning"
                    });
            }
                
        }).error(function(error){
            throw error;
        });
    });
});

