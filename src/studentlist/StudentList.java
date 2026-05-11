/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package studentlist;


/**
 *
 * @author jasmi
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student s1=new Student();
        s1.setName("Peter");
        s1.setSid(1);
        Student s2=new Student();
        s2.setName("John");
        s2.setSid(2);
        Student studentList[] =new Student[2];
        studentList[0]=s1;
        studentList[1]=(s2);
        for(int i=0; i<studentList.length; i++){
            System.out.println(studentList[i].getName()+" has I'd: "+studentList[i].getSid());
        }
    }
    
}
