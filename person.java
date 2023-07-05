public class person {



    String name;
    double age;
    String addres;
    String nationality;
    public person(){

    System.out.println("I'm the bass Class constructor");
    }
    public person(String n,double a,String ad,String nat){

        name=n;
        age=a;
        addres=ad;
        nationality=nat;

    }


    public void setName(String n){
        name=n;
    }
    public void setAge(double a){
        age=a;
    }

    public void setAddres(String ad){
        addres=ad;
    }
    public void setNationality(String nat){
        nationality=nat;
    }

    public String getName(){
        return name;
    }
    public double getAge(){
        return age;
    }

    public String getAddres(){
        return addres;
    }
    public String getNationality(){
        return nationality;
    }

}
