SET SERVEROUTPUT ON;

DECLARE
    v_marks NUMBER := 85;
    v_grade VARCHAR2(2);
BEGIN

    -- IF-ELSE Control Structure

    IF v_marks >= 90 THEN
        v_grade := 'A+';

    ELSIF v_marks >= 80 THEN
        v_grade := 'A';

    ELSIF v_marks >= 70 THEN
        v_grade := 'B';

    ELSIF v_marks >= 60 THEN
        v_grade := 'C';

    ELSE
        v_grade := 'F';

    END IF;

    DBMS_OUTPUT.PUT_LINE('Marks: ' || v_marks);
    DBMS_OUTPUT.PUT_LINE('Grade: ' || v_grade);

    DBMS_OUTPUT.PUT_LINE('Numbers from 1 to 5:');

    -- FOR Loop

    FOR i IN 1..5 LOOP
        DBMS_OUTPUT.PUT_LINE(i);
    END LOOP;

END;
/