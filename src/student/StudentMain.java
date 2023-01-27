
package student;

public class StudentMain {
    public static void main(String[] args){
       Student[] studentList = new Student[3];
       studentList[0] = new Student("90", "Dazz");
       studentList[1] = new Student("91", "Jim");
       studentList[2] = new Student("92", "Lainey");
       
       for(int i =0; i < studentList.length; i++) 
       {
           System.out.println(studentList[i].getStudentName());
       }
    }
     

    
}
