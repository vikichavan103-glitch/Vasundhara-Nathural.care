let slides=document.querySelectorAll(".slide")
let index=0

function showSlides(){
slides.forEach(s=>s.style.display="none")
index++
if(index>slides.length){index=1}
slides[index-1].style.display="block"
setTimeout(showSlides,2500)
}
showSlides()

document.getElementById("orderForm").onsubmit=function(e){
e.preventDefault()

window.onload=function(){

let slides=document.querySelectorAll(".slide")
let index=0

function showSlides(){
slides.forEach(s=>s.style.display="none")
index++
if(index>slides.length){index=1}
slides[index-1].style.display="block"
setTimeout(showSlides,2500)
}
showSlides()

document.getElementById("orderForm").onsubmit=function(e){
e.preventDefault()
