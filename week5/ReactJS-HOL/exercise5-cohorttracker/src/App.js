import CohortDetails from "./Components/CohortDetails";

function App() {
  return (
    <div>
      <h1 style={{ textAlign: "center" }}>Cohort Tracker</h1>

      <CohortDetails
        name="Java FSE"
        status="Ongoing"
        startDate="01-Jul-2026"
        coach="John"
        trainer="David"
      />

      <CohortDetails
        name="React"
        status="Completed"
        startDate="10-May-2026"
        coach="Steve"
        trainer="Robert"
      />

      <CohortDetails
        name="Angular"
        status="Scheduled"
        startDate="15-Aug-2026"
        coach="Kevin"
        trainer="Chris"
      />
    </div>
  );
}

export default App;