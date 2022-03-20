public class Student
{
 // Attributes/states/data fields
    private String NameStudents;

    public String getNameStudent() {
        return NameStudents;
    }

    public void setNameStudent(String NameStudents) {
        this.NameStudents = NameStudents;
    }
    
    @Override
    public String toString() {
        return NameStudents;
    }  
}