function CohortDetails({ cohort }) {
  return (
    <div className="card">
      <h3>{cohort.code}</h3>

      <p>
        <b>Technology :</b> {cohort.technology}
      </p>

      <p>
        <b>Status :</b> {cohort.status}
      </p>
    </div>
  );
}

export default CohortDetails;