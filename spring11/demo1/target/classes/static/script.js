
let submit = document.getElementById("button");
submit.addEventListener("click", (a) => {
    a.preventDefault()

    let div1 = document.getElementById("div").value;
    let name1 = document.getElementById("name").value;
    let student = {
        name: name1,
        divv: div1
    }
    create(student)

})

function create(student) {
    const myHeaders = new Headers();
    myHeaders.append("Content-Type", "application/json");

    const requestOptions = {
        method: "POST",
        headers: myHeaders,
        body: JSON.stringify(student),
        redirect: "follow"
    };

    fetch("http://localhost:8080/api/details", requestOptions)
        .then((response) => response.text())
        .then((result) => console.log(result))
        .catch((error) => console.error(error));
}
