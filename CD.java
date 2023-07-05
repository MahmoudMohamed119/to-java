public class CD implements RetailItem,Desplayable {

    double price;
    String titel;
    String artist;
    public CD(){

    }
    public CD( double price,String titel,String artist){
        this.price=price;
        this.titel=titel;
        this.artist=artist;
    }
    public double getitemprice(){
        return price;
    }
    public void Display(){
        System.out.println("store\n"+store+"price\n"+price+"titel\n"+titel+"Artist\n"+artist);
    }
}
