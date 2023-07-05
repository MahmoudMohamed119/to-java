public class Employee extends person {
    double salary;
    String rank;
    String job;

    public Employee(){

    }
    public Employee(String n,double a,String ad,String nat,double sal,String r,String j){
        super(n,a,ad,nat);
        salary=sal;
        rank=r;
        job=j;
    }

    public void setSalary(double sal){
        salary=sal;
    }
    public void setRank(String r){
        rank=r;
    }
    public void setJob(String j){job=j;}
    public double getsalary(){
        return salary;
    }
    public String getRank(){
        return rank;
    }
    public String getJob(){
        return job;
    }
}
