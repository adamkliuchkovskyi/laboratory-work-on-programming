class Student:
    def __init__(self, school: bool(), institute: bool(), group, schedule, progress):
        self.school = school
        self.institute = institute
        self.group = group
        self.schedule = schedule
        self.progress = progress
    
    def __str__(self):
        if self.school:
            return f"School: {self.school} Group: {self.group} Schedule: {self.schedule} Progress: {self.progress}"
        else:
            return f"Institute: {self.institute} Group: {self.group} Schedule: {self.schedule} Progress: {self.progress}"
    
    def __repr__(self):
        if self.school:
            return f"School: {self.school} Group: {self.group} Schedule: {self.schedule} Progress: {self.progress}"
        else:
            return f"Institute: {self.institute} Group: {self.group} Schedule: {self.schedule} Progress: {self.progress}"

class School(Student):
    def __init__(self, name, surname, school: bool(), group, schedule, progress):
        super().__init__(school, None, group, schedule, progress)
        self.name = name
        self.surname = surname
    
    def __str__(self):
        return f"Name: {self.name} Surname: {self.surname} School: {self.school} Group: {self.group} Schedule: {self.schedule} Progress: {self.progress}"

    def __repr__(self):
        return f"Name: {self.name} Surname: {self.surname} School: {self.school} Group: {self.group} Schedule: {self.schedule} Progress: {self.progress}"
    
class Institute(Student):
    def __init__(self, name, surname, institute: bool(), group, schedule, progress):
        super().__init__(None, institute, group, schedule, progress)
        self.name = name
        self.surname = surname
    
    def __str__(self):
        return f"Name: {self.name} Surname: {self.surname} Institute: {self.institute} Group: {self.group} Schedule: {self.schedule} Progress: {self.progress}"

    def __repr__(self):
        return f"Name: {self.name} Surname: {self.surname} Institute: {self.institute} Group: {self.group} Schedule: {self.schedule} Progress: {self.progress}"


if __name__ == "__main__":
    student1 = School("Bill", "True", True, "12A", "8:00-13:00", "Good")
    student2 = Institute("John", "hohn", False, "10A", "8:00-13:00", "Excellent")
    student3 = School("John", "Smith", True, "11A", "8:00-13:00", "Good")
    student4 = Institute("Bread", "Peet", False, "7A", "8:00-13:00", "Very good")

    print(student1)
    print(student2)
    print(student3)
    print(student4)

    