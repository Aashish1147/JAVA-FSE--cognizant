import { useState } from "react";
import ThemeContext from "./ThemeContext";
import EmployeeList from "./components/EmployeeList";

function App() {

  const [theme, setTheme] = useState("light");

  return (
    <ThemeContext.Provider value={theme}>

      <div style={{ padding: 30 }}>

        <h1>Employee Management</h1>

        <button
          onClick={() =>
            setTheme(theme === "light" ? "dark" : "light")
          }
          style={{
            marginBottom: 20,
            padding: "10px 18px"
          }}
        >
          Toggle Theme
        </button>

        <EmployeeList />

      </div>

    </ThemeContext.Provider>
  );
}

export default App;