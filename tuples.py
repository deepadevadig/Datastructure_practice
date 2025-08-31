# student = ("deepa","SDE full stack","no expireance",22)
student = "deepa","SDE full stack","no expireance",22
print(student)
print(student[0])
print(student[1])
print(student[2])
print(student[3])

college = student,["sgs" , "TNE" , "TNEPU","PPC","PPC","TNE"]
print(college)

student1 = "deepa","SDE full stack","no expireance" # packing
name , role , expireance = student1 # unpacking
print(name)
print(role)

college1 = "sgs","ppc","sgs","ppc"

print(college1.count("sgs"))
print(student.index("deepa"))