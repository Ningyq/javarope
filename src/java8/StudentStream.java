package java8;

import java.time.LocalDate;
import java.util.*;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class StudentStream {

    private static List<Student> register() {
        Student student1 = new Student(1L, "zhw", Student.Gender.MALE, 100, LocalDate.of(2016, 9 ,1), Student.Department.AM);
        Student student2 = new Student(1L, "sjy", Student.Gender.FEMALE, 200, LocalDate.of(2016, 9 ,1), Student.Department.EL);
        Student student3 = new Student(1L, "tyy", Student.Gender.FEMALE, 300, LocalDate.of(2016, 9 ,1), Student.Department.CL);
        Student student4 = new Student(1L, "fjp", Student.Gender.MALE, 400, LocalDate.of(2016, 9 ,1), Student.Department.CN);
        Student student5 = new Student(1L, "nyq", Student.Gender.MALE, 500, LocalDate.of(2016, 9 ,1), Student.Department.CS);
        Student student6 = new Student(1L, "jhw", Student.Gender.MALE, 600, LocalDate.of(2016, 9 ,1), Student.Department.CN);
        Student student7 = new Student(1L, "zyq", Student.Gender.MALE, 700, LocalDate.of(2016, 9 ,1), Student.Department.EL);
        Student student8 = new Student(1L, "jjh", Student.Gender.MALE, 800, LocalDate.of(2016, 9 ,1), Student.Department.EE);
        Student student9 = new Student(1L, "fj", Student.Gender.MALE, 900, LocalDate.of(2016, 9 ,1), Student.Department.AM);

        return Arrays.asList(student1, student2, student3, student4, student5, student6, student7, student8, student9);
    }

    private static void _(Object o) {
        System.out.println(o);
    }

    private static void __(String prefix, Object o) {
        System.out.println(prefix + o);
    }

    public static void main(String[] args) {
        List<Student> students =register();

        // total number of students
        int studentCount = students.stream().mapToInt(s -> 1).sum();
        __("Total number of students is : ", studentCount);

        //Total credits
        int studentCredits = students.stream().mapToInt(Student::getCredit).sum();
        __("Total credit is : ",studentCredits);

        //Student number by gender
        Map<Student.Gender, Long> groupCountByGender =
                students.stream()
                .collect(Collectors.groupingBy(Student::getGender, Collectors.counting()));
        __("Student number by gender is : ", groupCountByGender);

        //Student with best credits
        Optional<Student> studentWithMaxCredit = students.stream()
                .max((s1, s2) -> s1.getCredit() - s2.getCredit());
        if (studentWithMaxCredit.isPresent()) {
            __("Student with best credit is : ", studentWithMaxCredit.get().getName());
            __("Best credit is : ", studentWithMaxCredit.get());
        } else {
            _("Can not find such student");
        }

        //Sum of credits
        Integer sumCredits = students.parallelStream()
                .reduce(0,
                        (Integer partialSum, Student student) -> {
                            Integer middleSum = partialSum + student.getCredit();
                            return middleSum;
                        },
                        (a, b) -> {
                            return a + b;
                        });
        __("The sum credits is : ", sumCredits);

        boolean allMale = students.stream().allMatch(Student::isMale);
        __("Is all students male: ", allMale);

        boolean anyMale = students.stream().anyMatch(Student::isMale);
        __("Is all students male: ", anyMale);

        LongSummaryStatistics creditStats = students.stream()
                .map(Student::getCredit)
                .collect(LongSummaryStatistics::new,
                         LongSummaryStatistics::accept,
                         LongSummaryStatistics::combine);
        __("Credit Stats : ",creditStats);

        LongSummaryStatistics creditStats2 = students.stream()
                .collect(Collectors.summarizingLong(Student::getCredit));
        __("Credit sum : ", creditStats2);

        Map<Student.Department, Long> groupbyDepartment = students.stream()
                .collect(Collectors.groupingBy(Student::getDepartment,Collectors.counting()));
        _(groupbyDepartment);
    }
}
