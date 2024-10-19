package WithoutSingleResponsibility;
public class Invoice{
    Marker marker;
    int quantity;
    public Invoice(Marker marker, int quantity){
        this.marker = marker;
        this.quantity = quantity;
    }

    public int getTotal(){
        return this.marker.cost*this.quantity;
    }

    public void printInvoice(){
        System.out.println("Invoice: Total Cost is "+ getTotal() );

    }

    public void saveToDb(){
        System.out.println("Successfully saved to DB");
    }


}