/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentlist;

/**
 *
 * @author jasmi
 */
public class Student {
  private String name;    //encapsulation
  private int sid;
  private int semester;
  public String getName(){
     return this.name; 
  }
  public void setName(String name){
      this.name=name;
  }
  public int getSid(){
      return this.sid;
  }
   public void setSid(int sid) {
        this.sid = sid;
   }

    /**
     * @return the semester
     */
    public int getSemester() {
        return semester;
    }

    /**
     * @param semester the semester to set
     */
    public void setSemester(int semester) {
        this.semester = semester;
    }
   
   
  
  
  
}
