
class student{
    int rollno ;
    String name;
    
    static String college = "gect";

    // constructor
    student(int id ,String n){  
        rollno = id;
        name = n;
    }

    // method
    void dislay(){
        System.out.println(rollno + " " + name + " " + college);
    }
}


public class statc {
    public static void main(String[] args) {
        
        student s1 = new student(100, "mashood");
        student s2 = new student(101, "shanavas");
        student s3 = new student(102, "adeeb");

        s1.dislay();
        s2.dislay();

        student.college = "cet";
        s3.dislay();
    }
}
