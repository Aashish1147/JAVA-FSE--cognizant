import { useState } from "react";

function Register() {
  const [user, setUser] = useState({
    name: "",
    email: "",
    password: ""
  });

  const handleChange = (e) => {
    setUser({
      ...user,
      [e.target.name]: e.target.value
    });
  };

  const handleSubmit = (e) => {
    e.preventDefault();

    if (user.name.length < 5) {
      alert("Name must be at least 5 characters");
      return;
    }

    if (!(user.email.includes("@") && user.email.includes("."))) {
      alert("Email is not valid");
      return;
    }

    if (user.password.length < 8) {
      alert("Password must be at least 8 characters");
      return;
    }

    alert("Registration Successful");
  };

  return (
    <div className="container">
      <h1>Register Here!!!</h1>

      <form onSubmit={handleSubmit}>
        <p>
          Name:
          <input
            type="text"
            name="name"
            value={user.name}
            onChange={handleChange}
          />
        </p>

        <p>
          Email:
          <input
            type="email"
            name="email"
            value={user.email}
            onChange={handleChange}
          />
        </p>

        <p>
          Password:
          <input
            type="password"
            name="password"
            value={user.password}
            onChange={handleChange}
          />
        </p>

        <button type="submit">Submit</button>
      </form>
    </div>
  );
}

export default Register;