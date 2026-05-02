
let submit=document.getElementById("dabaona")
submit.onclick=function(){
    let naam= document.getElementById("name").value
    let subject=document.getElementById("sub").value
    let student={
        sname:naam,
        sub:subject
    }
    create(student)
}



function create(insert){
    const myHeaders = new Headers();
myHeaders.append("Content-Type", "application/json");


const requestOptions = {
  method: "POST",
  headers: myHeaders,
  body: JSON.stringify(insert),
  redirect: "follow"
};

fetch("http://localhost:8080/api/details", requestOptions)
  .then((response) => response.text())
  .then((result) => console.log(result))
  .catch((error) => console.error(error));
}
