var pelement=document.createElement('p')

function showAlert(){
    alert("Hii Welcome to Cinema Hall!!!")
}
function elementCreation(){
    
    pelement.textContent='element created'
    document.body.appendChild(pelement);


    
}
function displayElement(){
    var dispElement=document.getElementById('disp')
    var myBtn= document.getElementById('myBtn');
    if(dispElement.style.display==='' || dispElement.style.display==='none'){
        dispElement.style.display='block'
        myBtn.textContent='Click here to hide h1 Element'
    }else{
        dispElement.style.display='none'
        myBtn.textContent='Click here to show h1 Element'
    }
}
function changeColor1(){
    var color1=document.getElementById('clr')
    color1.style.backgroundColor='lightgreen'
    color1.style.fontSize='50px';
    
    
}
function changeColor2(){
    var color2=document.getElementById('clr')
    color2.style.backgroundColor='yellow'
    color2.style.fontSize='150px';
    
}
// function changeSize(){
//     var size1=document.getElementById('clr')
//     size1.style.fontSize=20px;
// }
function showData(){
    console.log("working!!!")
}
function showDetail(){
    console.log("onkey down executed")
}

function getInputValue(){
  var inpElement=  document.getElementById('inp')
  console.log(inpElement.value)
  var showElement=document.getElementById('show')
  showElement.textContent=inpElement.value
  
}
