import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /*
        //دى اشتغلت على الConstructors عشان مدخلتش حاجه فخد الثابت
        Rectangle r1= new Rectangle();
     //   r1.setLenght(12);
       // r1.setWidth(2);
       // r1.getLenght();
      //  r1.getWidth();
        //  r1.getarea();
        //ممكن نخلى الشكل احسن ان احنا نكتب رسايل زى ادخل الطول....ّ
        System.out.println("lenght you set"+r1.getLenght());
        System.out.println("width you set"+r1.getWidth());
        System.out.println("The Area="+r1.getarea());

        //هنا عشان دخلت الطول و العرض فخدهم هما
        Rectangle r2= new Rectangle();
        r2.setLenght(10);
        r2.setWidth(2);
       // r2.getLenght();
       // r2.getWidth();
       // r2.getarea();
        System.out.println("lenght you set"+r2.getLenght());
        System.out.println("width you set"+r2.getWidth());
        System.out.println("The Area="+r2.getarea());

         */
        /*
        System.out.println("use the calc class");
       System.out.println(calc.add(20,2));
       System.out.println(calc.multiple(20,2));

         */

     /*  Rectangle r1=new Rectangle(10,12);
       Rectangle r2=new Rectangle(r1);
        System.out.println(r2.getWidth());
        System.out.println(r2.getarea());

      */
/*
      //  person and Student class

        Student std1= new Student("Ahmed",20,"Egypt","Egyption",3,"IS",3.5);

        System.out.println(std1.getName());
        System.out.println(std1.getSpecialization());

        Student std2= new Student(); //  هنا عمل ال constructor بتاع الbass الاول بعد كده الDerived Class

 */

        /*
       // Employee and salaried_Employee class
        salaried_Employee se1= new salaried_Employee("AHMED",30,"Riydh","saudi",3000,"Manager","Engineer",500,100);
        System.out.println(se1.getsalary());

         */
        /*
      //  RetailItem and Desplayable and CD classes and interfaceses
        RetailItem r1=new CD();
        r1.getitemprice();
        Desplayable r2=new CD();
        r2.Display();

         */
        /*
       // Registerform
        Course c1=Course.Datebase;
        Course c2=Course.Math;
        System.out.println(c1.toString());
        System.out.println(c1.ordinal());
        System.out.println(c2.compareTo(c1));
        System.out.println(c2.equals(c1));

         */
           // ArrayList example
        ArrayList<String> list=new ArrayList<String>();
        list.add("Ahmed");
        list.add("Mohamed");
        list.add("Ali");

        System.out.println(list.size());
        System.out.println(list);
        System.out.println(list.get(2));

        list.add("saad");
        System.out.println(list);
        list.set(3,"turky");
        System.out.println(list);
        list.remove(2);
        System.out.println(list.size());
        System.out.println(list);

    }
}