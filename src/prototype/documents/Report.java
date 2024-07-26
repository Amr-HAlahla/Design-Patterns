package prototype.documents;

public class Report implements Document {
    private String content;

    public Report(String content) {
        this.content = content;
    }

    @Override
    public void print() {
        System.out.println("Report content: " + this.content);
    }

    @Override
    public Document getClone() {
        return new Report(this.content);
    }
}

