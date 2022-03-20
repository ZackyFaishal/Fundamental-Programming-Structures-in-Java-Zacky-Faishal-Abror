import java.util.*; 
/**
 *
 * @author Zacky Faishal Abror
 */

public class mainAssociation {
        public static void main(String[] args) {
        // Attributes
        Teacher teacher1 = new Teacher();
        teacher1.setNameTeacher("Mr Zulkifli");
        
        Student S1 = new Student();
        S1.setNameStudent("Zacky");
        Student S2 = new Student();
        S2.setNameStudent("Faishal");
        Student S3 = new Student();
        S3.setNameStudent("Abror");
      
        
        List<Student> empList = new ArrayList<Student>();
        empList.add(S1);
        empList.add(S2);
        empList.add(S3);
        
        teacher1.setNameStudent(empList);
        
        System.out.println(teacher1.getNameStudent() + 
                " Who teach by " + teacher1.getNameTeacher());
    }
}


