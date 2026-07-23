import { useState } from "react";

function ComplaintRegister() {

  const [name, setName] = useState("");
  const [complaint, setComplaint] = useState("");

  const handleSubmit = (e) => {
    e.preventDefault();

    const ref = Math.floor(100000 + Math.random() * 900000);

    alert(
      `Thanks ${name}\n\nYour complaint was submitted successfully.\nReference ID : ${ref}`
    );

    setName("");
    setComplaint("");
  };

  return (
    <div
      style={{
        width: "400px",
        margin: "40px auto",
        textAlign: "center"
      }}
    >
      <h2 style={{ color: "red" }}>
        Register your complaints here!!!
      </h2>

      <form onSubmit={handleSubmit}>

        <input
          type="text"
          placeholder="Employee Name"
          value={name}
          onChange={(e) => setName(e.target.value)}
          required
          style={{
            width: "100%",
            padding: "10px",
            marginBottom: "15px"
          }}
        />

        <textarea
          placeholder="Complaint"
          value={complaint}
          onChange={(e) => setComplaint(e.target.value)}
          rows="5"
          required
          style={{
            width: "100%",
            padding: "10px",
            marginBottom: "15px"
          }}
        />

        <button type="submit">
          Submit
        </button>

      </form>

    </div>
  );
}

export default ComplaintRegister;