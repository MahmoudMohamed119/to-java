
enum gender{Male,Female};
enum Course{Datebase,Programming,Math,ERP};
enum semester{Summer,Winter,Fall,Spring};
public class Registerform {

    String stdname;
    gender stdgender;
    Course cour;
    semester sem;
    public Registerform(){
        stdname="np name";
        stdgender=gender.Male;
        cour=Course.Datebase;
        sem=semester.Spring;
    }
}
