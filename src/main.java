import model.Student;

public class main {
    public static void main(String[] args){
        Student student=new Student("ann",24,"female",12);
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.sex);
        System.out.println(student.id);
    }
}
