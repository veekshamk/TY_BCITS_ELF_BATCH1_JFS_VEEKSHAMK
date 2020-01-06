var element=document.getElementById('demo');
console.log(element);
console.log(element.textContent);
element.textContent='content changed';

var pElement=document.createElement('p');
pElement.textContent='Hii';
document.body.appendChild(pElement);
pElement.style.fontSize='40px';
pElement.style.color='red'



