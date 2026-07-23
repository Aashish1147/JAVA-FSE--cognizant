import CohortDetails from "./components/CohortDetails";
import CohortData from "./Cohort";
import "./App.css";

function App() {
  return (
    <div>
      <h1>Cohort Tracker</h1>

      {CohortData.map((c, i) => (
        <CohortDetails key={i} cohort={c} />
      ))}
    </div>
  );
}

export default App;