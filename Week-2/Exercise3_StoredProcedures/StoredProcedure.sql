-- Stored Procedure to Fetch Employee Details

CREATE OR REPLACE PROCEDURE GetEmployeeDetails(
    p_empid IN NUMBER
)
IS
    v_name Employees.EmpName%TYPE;
    v_salary Employees.Salary%TYPE;
BEGIN

    SELECT EmpName, Salary
    INTO v_name, v_salary
    FROM Employees
    WHERE EmpID = p_empid;

    DBMS_OUTPUT.PUT_LINE('Employee Name : ' || v_name);
    DBMS_OUTPUT.PUT_LINE('Salary        : ' || v_salary);

EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('Employee Not Found');
END;
/