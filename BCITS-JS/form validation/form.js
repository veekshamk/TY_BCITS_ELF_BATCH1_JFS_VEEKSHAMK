function validateForm(){
    var loginForm=document.forms['loginForm'];
    var email=loginForm['email'].value;
    var password=loginForm['password'].value;

    console.log(loginForm)
    console.log('email', email)
    console.log('password', password)


if(email.trim().length>6){
    document.getElementById('emailError').style.display='none';
    console.log("mail is valid")
}else{
    document.getElementById('emailError').style.display='block';
    console.log("mail is not valid")
}
if(password.trim().length>5){
    console.log("paaword is valid")
}else{
    console.log("password is not valid")
}
}