student_list = {}
student_list[0] = "ramesh"

#syntax variable_name_dictionary[key] = value

student_dict = {'satish':123 , 'mahesh':124 , 'yatish':125}

print(student_list)
print(student_dict)

name = student_dict.get('satish')
print(f"name of the student is{name}")

student_dict.pop('yatish')
print(f" final ist ={student_dict}")

print(student_dict.keys())

print(student_dict.values())

student_dict.clear()
print(student_dict)