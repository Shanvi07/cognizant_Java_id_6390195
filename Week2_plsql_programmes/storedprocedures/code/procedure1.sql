
CREATE OR REPLACE PROCEDURE assign_pass_fail IS
BEGIN
    FOR student IN (SELECT * FROM students) LOOP
        UPDATE students
        SET grade = CASE
            WHEN marks >= 40 THEN 'Pass'
            ELSE 'Fail'
        END
        WHERE student_id = student.student_id;
    END LOOP;
    COMMIT;
END;
/
