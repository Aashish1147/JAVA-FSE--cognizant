SET SERVEROUTPUT ON;

BEGIN
   FOR emp IN (
      SELECT employee_id, salary
      FROM HR.EMPLOYEES
      WHERE ROWNUM <= 10
   )
   LOOP
      IF emp.salary > 5000 THEN
         DBMS_OUTPUT.PUT_LINE(
            'Employee ID: ' || emp.employee_id ||
            ' Salary: ' || emp.salary
         );
      END IF;
   END LOOP;
END;
/