public class salaried_Employee extends Employee {
    double bonus;
    double deduction;

    public salaried_Employee(){

    }
    public salaried_Employee(String n,double a,String ad,String nat,double sal,String r,String j,double b,double d){
        super(n,a,ad,nat,sal,r,j);
        bonus=b;
        deduction=d;
    }
    @Override
    public double getsalary(){
        return salary+bonus-deduction ;

    }
}
