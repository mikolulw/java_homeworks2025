import java.util.HashMap;

public class GradeBook {
    private HashMap<String, Student> students;

    public GradeBook(){
        students = new HashMap<>();
    }
    public void putStudent(Student student){
        students.put(student.getId(), student);
    }
    public void removeStudent(String id){
        students.remove(id);
    }
    public void findStudent(String id){
        Student student = students.get(id);
        if(student == null){
            System.out.println("Student is not on the list");
        } else{
            System.out.println(student);
        }
    }
    public void printStudents(){
        for(Student s : students.values()){
            System.out.println(s);
        }
    }
}
