$(function () {
    console.log('1');
})
function queryUser(val) {
  console.log(val);

    $.ajax({
        url:'user/queryUserByPages',
        data:{},
        type:"Post",
        dataType:"json",
        success:function(data){
            console.log(data);
        },
        error:function(data){

        }
    });
    /*$.ajax({
        url: "",
        data: {},
        dataTypel: "json",
        type: 'post',
        async: false,
        success: function (data) {
        }
    })*/
}