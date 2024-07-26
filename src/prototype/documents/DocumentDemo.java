package prototype.documents;

public class DocumentDemo {
    public static void main(String[] args) {
        DocClient docClient = new DocClient();

        Report report = new Report("Annual Report");
        Invoice invoice = new Invoice("Invoice #1");

        docClient.addDocument("report", report);
        docClient.addDocument("invoice", invoice);

        Document clonedReport = docClient.createDocument("report");
        Document clonedInvoice = docClient.createDocument("invoice");

        clonedInvoice.print();
        clonedReport.print();
    }
}
