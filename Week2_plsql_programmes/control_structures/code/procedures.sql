-- Procedure to assign grade based on marks
CREATE OR REPLACE PROCEDURE assign_grade IS
BEGIN
    FOR student IN (SELECT * FROM students) LOOP
        UPDATE students
        SET grade = CASE
            WHEN marks >= 75 THEN 'A'
            WHEN marks >= 50 THEN 'B'
            ELSE 'C'
        END
        WHERE student_id = student.student_id;
    END LOOP;
    COMMIT;
END;
/
