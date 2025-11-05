import java.util.ArrayList;

public class Student {
    private String id;
    private String name;
    private ArrayList<Integer> grades;

    public Student(String id, String name){
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }
    public String getId(){
        return id;
    }
    public void addGrade(int grade){
        grades.add(grade);
    }
    @Override
    public String toString(){
        return "Id: " + id + ", Name: " + name + "; Grades: " + grades;
    }
}
