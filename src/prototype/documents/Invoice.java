package prototype.documents;

public class Invoice implements Document {
    private String content;

    public Invoice(String content) {
        this.content = content;
    }

    @Override
    public void print() {
        System.out.println("Invoice content: " + this.content);
    }

    @Override
    public Document getClone() {
        return new Invoice(this.content);
    }
}
