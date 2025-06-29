-- Call procedure to insert dummy students
BEGIN
    insert_dummy_students;
END;
/

-- Call procedure to assign pass/fail
BEGIN
    assign_pass_fail;
END;
/

-- Call procedure to show grade for a specific student
BEGIN
    show_grade(101);
END;
/

-- View full student table
SELECT * FROM students;
