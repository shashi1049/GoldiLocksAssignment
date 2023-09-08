function verifyCredentials() {
    var username = document.getElementById("username").value;
    var password = document.getElementById("password").value;

    
    if (username === "Shashi" && password === "12345") {
        document.getElementById("message").innerHTML = "Successfully Logged in!";
    } else {
        document.getElementById("message").innerHTML = "Invalid credentials.";
    }
}