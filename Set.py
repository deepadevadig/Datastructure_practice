def student_data_analysys():
    comman_students = enlored_student_names and course_completed_students
    print("list of comman students")
    print(comman_students)

    all_students = enlored_student_names or course_completed_students
    print("all the students in the list are")
    print(all_students)

    course_not_complete = enlored_student_names - course_completed_students
    print("couse not completed students are")
    print(course_not_complete)

    final_list = enlored_student_names ^ course_not_complete
    print("final students", final_list)



Student_id = {10,23,45}
print(Student_id)

enlored_student_names = {"deepa","pramod","baby","pramod","deepa","priya"}
print(enlored_student_names)

course_completed_students ={"deepa","baby"}

student_data_analysys()
