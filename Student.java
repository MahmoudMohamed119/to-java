public class Student extends person{

    int study_level;
    String specialization;
    double GPA;

    public Student(){

        System.out.println("I'm the Derived Class constructor");

    }

    public Student(String n,double a,String ad,String nat,int lvl, String special,double gpa){

      super(n,a,ad,nat);
      study_level=lvl;
      specialization=special;
      GPA=gpa;
    }
    public void setStudy_level(int lvl){
        study_level=lvl;
    }
    public void setSpecialization(String special){
        specialization=special;
    }
    public void setGPA(double gpa){
        GPA=gpa;
    }
    public int getStudy_level(){
       return study_level;
    }
    public String getSpecialization(){
       return specialization;
    }
    public double getGPA(){
       return GPA;
    }


}
