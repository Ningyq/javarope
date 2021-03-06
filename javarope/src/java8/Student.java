package java8;

import java.time.LocalDate;

public class Student {
    public enum Gender {
        FEMALE, MALE
    }

    public enum Department {
        CS, CN, EE, AM, CL, EL
    }

    private long id;
    private String name;
    private Gender gender;
    private Integer credit;
    private LocalDate localDate;
    private Department department;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Student(long id, String name, Gender gender, Integer credit, LocalDate localDate, Department department) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.credit = credit;
        this.localDate = localDate;
        this.department = department;
    }

    public boolean isMale() {
        return this.gender == Gender.MALE;
    }

    public boolean isFemale() {
        return this.gender == Gender.FEMALE;
    }

    @Override
    public String toString() {
        return "Student { " +
                "id = " + id +
                " gender = " + gender +
                " credit = " + credit +
                " localDate = " + localDate +
                " department = " + department +
                " }";
    }
}
