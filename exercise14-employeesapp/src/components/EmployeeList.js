import Employees from "../Employees";
import EmployeeCard from "./EmployeeCard";

function EmployeeList() {

  return (
    <>
      {Employees.map((emp) => (
        <EmployeeCard
          key={emp.id}
          employee={emp}
        />
      ))}
    </>
  );
}

export default EmployeeList;