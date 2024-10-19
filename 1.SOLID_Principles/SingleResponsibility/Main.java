import WithoutSingleResponsibility.Marker;
import WithSingleResponsibility.InvoiceDB;
import WithSingleResponsibility.InvoiceFile;
import WithSingleResponsibility.InvoicePrint;
import WithoutSingleResponsibility.Invoice;
import WithSingleResponsibility.MarkerSR;

import WithSingleResponsibility.InvoiceSR;


public class Main{
    public static void main(String[] args){

        /* Without Single Responsibility */


        Marker marker = new Marker("green", 90);
        Invoice invoice = new Invoice(marker, 4);

        System.out.println("Total Price is " + invoice.getTotal());  // Getting the Total

        invoice.saveToDb(); // Saving the file to DB functionality

        invoice.printInvoice();  // Printing Invoice

        


        /* Single Responsibility */

        System.out.println("\n\nAfter Applying Single Responsibility Principle");

        MarkerSR markerSR = new MarkerSR("pink", 80);
        InvoiceSR invoiceSR = new InvoiceSR(markerSR, 3);

        System.out.println("Current, Total Price" + invoiceSR.getTotal());


        InvoicePrint invoicePrint = new InvoicePrint(invoiceSR);
        invoicePrint.printInvoice();


        // Saving to Database

        InvoiceFile invoiceFile = new InvoiceFile();
        invoiceFile.save();

        InvoiceDB invoiceDB = new InvoiceDB();
        invoiceDB.save();



        

    }
}