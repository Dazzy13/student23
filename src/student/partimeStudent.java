
package student;
public class partimeStudent extends Student {
    private int numOfCourses;
    
    public partimeStudent(int numOfcourses, String studentName, String studentId){
        super(studentId, studentName);
        this.numOfCourses = numOfcourses;
    }

    public int getNumOfCourses() {
        return numOfCourses;
    }
    
    
    
    public static void main(String[] args){
        
    }
}
