package PackageAssignment.college2;
import PackageAssignment.college2.student.Students;
import PackageAssignment.college2.faculty.Faculty;
import PackageAssignment.college2.department.Department;
import static java.lang.Math.*;
public class Runner{
    public static void main(String[] args){
        Students s=new Students("Manvi Varshney",43);
        Faculty f=new Faculty("Tanmay Sir","Java-OOPs");
        Department d=new Department("Computer Science Engineering","Block VIII");
        System.out.println("College Management System");
        d.displayDepartment();
        f.displayFaculty();
        s.displayStudents();
        System.out.println("Static Import sqrt(25): "+sqrt(25));
    }
}