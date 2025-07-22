
CREATE OR REPLACE PROCEDURE show_grade(p_id IN NUMBER) IS
    v_name students.name%TYPE;
    v_grade students.grade%TYPE;
BEGIN
    SELECT name, grade INTO v_name, v_grade
    FROM students
    WHERE student_id = p_id;

    DBMS_OUTPUT.PUT_LINE('Student: ' || v_name || ', Grade: ' || v_grade);
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('No student found with ID ' || p_id);
END;
/
