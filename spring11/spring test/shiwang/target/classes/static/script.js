let users = JSON.parse(localStorage.getItem("users")) || [];

        function getSelectedSkills() {
            let checkboxes = document.querySelectorAll('input[type="checkbox"]:checked');
            let skills = [];

            checkboxes.forEach(function (cb) {
                skills.push(cb.value);
            });

            return skills;
        }

        function getCareers(skills) {

            let careers = [];

            if (skills.includes("html") && skills.includes("css")) {
                careers.push("Frontend Developer");
            }

            if (skills.includes("java")) {
                careers.push("Backend Developer");
            }

            if (skills.includes("python")) {
                careers.push("Data Analyst");
            }

            if (skills.includes("communication")) {
                careers.push("Marketing / HR");
            }

            if (careers.length === 0) {
                careers.push("No match found");
            }

            return careers;
        }

        function addUser() {

            let name = document.getElementById("name").value;
            let age = document.getElementById("age").value;
            let course = document.getElementById("course").value;
            let skills = getSelectedSkills();

            if (name === "" || age === "" || course === "" || skills.length === 0) {
                alert("Fill all fields");
                return;
            }

            let careers = getCareers(skills);

            let user = {
                name: name,
                age: age,
                course: course,
                skills: skills,
                careers: careers
            };

            users.push(user);

            localStorage.setItem("users", JSON.stringify(users));

            displayUsers();
            clearForm();
        }

        function displayUsers() {

            let container = document.getElementById("userCards");
            container.innerHTML = "";

            users.forEach(function (user, index) {

                container.innerHTML += `
                <div class="user-card">
                    <h3>${user.name}</h3>
                    <p><b>Age:</b> ${user.age}</p>
                    <p><b>Course:</b> ${user.course}</p>
                    <p><b>Skills:</b> ${user.skills.join(", ")}</p>
                    <p><b>Careers:</b> ${user.careers.join(", ")}</p>

                    <button class="edit" onclick="editUser(${index})">Edit</button>
                    <button class="delete" onclick="deleteUser(${index})">Delete</button>
                </div>
                `;
            });
        }

        function deleteUser(index) {
            users.splice(index, 1);
            localStorage.setItem("users", JSON.stringify(users));
            displayUsers();
        }

        function editUser(index) {

            let user = users[index];

            document.getElementById("name").value = user.name;
            document.getElementById("age").value = user.age;
            document.getElementById("course").value = user.course;

            
            document.querySelectorAll('input[type="checkbox"]').forEach(function (cb) {
                cb.checked = false;
            });

            
            user.skills.forEach(function (skill) {
                let box = document.querySelector('input[value="' + skill + '"]');
                if (box) box.checked = true;
            });

            deleteUser(index);
        }

        function clearForm() {
            document.getElementById("name").value = "";
            document.getElementById("age").value = "";
            document.getElementById("course").value = "";

            document.querySelectorAll('input[type="checkbox"]').forEach(function (cb) {
                cb.checked = false;
            });
        }

        displayUsers();