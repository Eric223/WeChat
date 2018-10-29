
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

function connect(){
    var socket= new SockJS('/socket');
    stompClient=Stomp.over(socket);
    stompClient.connect({},function(frame) {
        //建立连接后回调
        setConnected(true)
    })
}

function disconnect(){
    if(stompClient!=null){
        stompClient.disconnect()
    }
    setConnected(false)
    console.log("Disconnected")
}

function sendMsg(){
    var value=$("#message").val()
    stompClient.send("/request/send",{},value)
}
