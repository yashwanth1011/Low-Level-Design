package WithSingleResponsibility;


public class InvoicePrint {

    InvoiceSR invoice;
    public InvoicePrint(InvoiceSR invoice){
        this.invoice = invoice;
    }

    public void printInvoice(){
        System.out.println("Printing the Invoice\nTotal Cost: "+ invoice.getTotal());
    }

   
}
