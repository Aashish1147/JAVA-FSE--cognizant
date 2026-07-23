import styles from "../Styles/CohortDetails.module.css";

function CohortDetails(props) {
  let statusColor = {};

  if (props.status === "Ongoing") {
    statusColor = { color: "green" };
  } else {
    statusColor = { color: "blue" };
  }

  return (
    <div className={styles.box}>
      <dl>
        <dt>Course Name</dt>
        <dd>{props.name}</dd>

        <dt>Status</dt>
        <dd style={statusColor}>{props.status}</dd>

        <dt>Start Date</dt>
        <dd>{props.startDate}</dd>

        <dt>Coach</dt>
        <dd>{props.coach}</dd>

        <dt>Trainer</dt>
        <dd>{props.trainer}</dd>
      </dl>
    </div>
  );
}

export default CohortDetails;