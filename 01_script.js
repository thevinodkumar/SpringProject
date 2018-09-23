document.querySelector('#time').addEventListener('keyup',function() {
    var time = document.querySelector('#time').value;
    var h1Element = document.querySelector('#display');
    if(time === ''){
        h1Element.textContent = "";
    }
    else if(time <= 12){
        h1Element.textContent = "Good Morning";
    }
    else if(time >12 && time <=17){
        h1Element.textContent = "Good AfterNoon";
    }
    else if(time>17 && time <= 24){
        h1Element.textContent = "Good Evening";
    }
    else{
        h1Element.textContent = "Please enter proper time";
    }
});