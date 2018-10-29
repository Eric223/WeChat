// window.onload=function(){
//     var id= document.getElementById('#uid');
//     $.ajax({
//         type:'GET',
//         url:'/weChat/getAllRoom/'+2,
//         success: function (res) {
//             console.log('success');
//         },
//         error: function (res){
//             ShowResultMessage(res.message)
//         }
//     })
// }
function ShowResultMessage(message) {
    ms = document.getElementById("message");
    console.log('ShowResultMessage');
    console.log(message);
    ms.innerHTML = message
    var color=message='success'?'green':'red'
    ms.style.display = 'block';
    ms.style.color = color
    setTimeout("closeMessageDiv()", 1000)
}

function closeMessageDiv() {
    document.getElementById("message").style.display = 'none';
}
function getNowFormatDate(){
    var date = new Date();
    var seperator1 = "-";
    var seperator2 = ":";
    var month = date.getMonth() + 1;
    var strDate = date.getDate();
    <!-- /*/
   if (month >= 1&&month <= 9) {
         month = "0" + month;
     }
     if (strDate >= 0&&strDate <= 9) {
         strDate = "0" + strDate;
     }
    /*/ -->



    var currentdate = date.getFullYear() + seperator1 + month + seperator1 + strDate
        + " " + date.getHours() + seperator2 + date.getMinutes()
        + seperator2 + date.getSeconds();
    return currentdate;
}

function addRoom(){
    var title = document.getElementById("title").value;
    var detail = document.getElementById("detail").value;
    var date = getNowFormatDate();
    console.log('----->' + title + " " + detail);
    $.ajax({
        type: 'POST',
        url: '/weChat/addRoom',
        contentType: "application/json;charset=UTF-8",
        data: JSON.stringify({
            //ES6支持这种写法
            'id': -2,
            'name': title,
            detail,
            date,
            'create_user': '',
            'list': null,
        }),

        success: function () {
            message = "success"
            ShowResultMessage(message)
        },
        error: function () {
            message = "fail"
            ShowResultMessage(message)
        }
    })
}


function openRoom() {
    console.log("open")
}
