package builder.computer;

public class ComputerDemo {
    public static void main(String[] args) {
        Computer computer1 = new Computer.ComputerBuilder("Intel i9", "32GB")
                .setStorage("1TB SSD").setGraphicsCard("NVIDIA RTX 4090").Build();
        System.out.println(computer1.toString());

    }
}
