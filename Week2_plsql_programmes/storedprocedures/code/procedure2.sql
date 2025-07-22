
CREATE OR REPLACE PROCEDURE insert_dummy_students IS
BEGIN
    FOR i IN 101 .. 105 LOOP
        INSERT INTO students (student_id, name, marks)
        VALUES (i, 'Student_' || i, TRUNC(DBMS_RANDOM.VALUE(30, 90)));
    END LOOP;
    COMMIT;
END;
/
