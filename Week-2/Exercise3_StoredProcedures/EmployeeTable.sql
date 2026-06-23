-- Create Employee Table

CREATE TABLE Employees (
    EmpID NUMBER PRIMARY KEY,
    EmpName VARCHAR2(50),
    Salary NUMBER
);

-- Insert Sample Records

INSERT INTO Employees VALUES (101, 'John', 50000);
INSERT INTO Employees VALUES (102, 'Alice', 60000);
INSERT INTO Employees VALUES (103, 'David', 55000);

COMMIT;