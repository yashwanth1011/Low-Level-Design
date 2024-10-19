package WithSingleResponsibility;

public class InvoiceSR {
    MarkerSR marker;
    int quantity;
    public InvoiceSR(MarkerSR marker, int quantity){
        this.marker = marker;
        this.quantity = quantity;
    }

    public int getTotal(){
        return marker.cost*quantity;
    }

    
}
