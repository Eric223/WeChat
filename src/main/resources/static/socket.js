
 function setConnected(){
     $("#connect").attr({"disabled":connected})
     $("#disconnect").attr({"disabled":connected})
     if(connected){
         $("#conversationDiv").show()
     }else {
         $("#conversationDiv").show()
     }
     $("#response").html("");
}

function connect(id){
    var socket= new SockJS('/socket');
    stompClient=Stomp.over(socket);
    stompClient.connect({},function(frame) {
        //建立连接后回调
        //setConnected(true)
        socket.subscribe("/room/"+id,function(data){
            sendMsg(id)
        })

    })
}

function disconnect(){
    if(stompClient!=null){
        stompClient.disconnect()
    }
    setConnected(false)
    console.log("Disconnected")
}

function sendMsg(id){
    var value=$("#message").val()
    stompClient.send("/request/send",{},value)
}
