import { useContext } from "react";
import ThemeContext from "../ThemeContext";

function EmployeeCard({ employee }) {

  const theme = useContext(ThemeContext);

  return (
    <div
      style={{
        border: "1px solid gray",
        padding: 20,
        marginBottom: 15
      }}
    >
      <h3>{employee.name}</h3>

      <p>{employee.designation}</p>

      <button
        className={theme}
        style={{
          background: theme === "dark" ? "#333" : "#0d6efd",
          color: "white",
          padding: "8px 15px",
          border: "none"
        }}
      >
        View Profile
      </button>
    </div>
  );
}

export default EmployeeCard;