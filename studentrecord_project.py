

student_DB = []

def add_data():
    id = int(input("enter your id : "))
    name = input("enter your name : ")

    student_record = id , name
    student_DB.append(student_record)

def print_all():    
    for student_record in student_DB:
        print(student_record)


if __name__ == "__main__":
    add_data()
    add_data()
    add_data()

    print_all()