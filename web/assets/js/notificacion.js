/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
module.exports=function (){
    return {
        warning:function(){
            return $.notify('<strong>Warning Message</strong> Do not close this page...', {
                        allow_dismiss: true,
                        showProgressbar: true,
                        element: 'html',
                        position: null,
                        placement: {
                            from: "top",
                            align: "right"
                        },
                        timer: 1000,
                    });
        }
    }
};

