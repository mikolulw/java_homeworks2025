public class Main{
    public static void main(String[] args){
        GradeBook gradeBook = new GradeBook();
        Student s1 = new Student("1001", "Jane");
        Student s2 = new Student("1002", "Vitaliy");
        Student s3 = new Student("1003", "Eugene");
        Student s4 = new Student("1004", "John");
        Student s5 = new Student("1005", "Sofiia");
        s1.addGrade(100);
        s1.addGrade(99);
        s2.addGrade(100);
        s2.addGrade(99);
        s3.addGrade(90);
        s3.addGrade(100);
        s4.addGrade(75);
        s4.addGrade(60);
        s5.addGrade(100);
        gradeBook.putStudent(s1);
        gradeBook.putStudent(s2);
        gradeBook.putStudent(s3);
        gradeBook.putStudent(s4);
        gradeBook.putStudent(s5);
        System.out.println("GradeBook:");
        gradeBook.printStudents();
        gradeBook.findStudent("1005");
        gradeBook.findStudent("1001");
        gradeBook.findStudent("1002");
        gradeBook.findStudent("1006");
        gradeBook.removeStudent("1004");
        System.out.println("GradeBook:");
        gradeBook.printStudents();
    }
}