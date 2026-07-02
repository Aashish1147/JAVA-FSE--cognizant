SET SERVEROUTPUT ON;

CREATE OR REPLACE PROCEDURE ShowMessage
IS
BEGIN
    DBMS_OUTPUT.PUT_LINE('Stored Procedure Executed Successfully');
END;
/

BEGIN
    ShowMessage;
END;
/