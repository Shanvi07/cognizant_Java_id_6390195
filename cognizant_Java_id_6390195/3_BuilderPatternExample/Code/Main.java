public class Main {
    public static void main(String[] args) {
        Computer basicComputer = new Computer.Builder("i3", "4GB").build();

        Computer gamingComputer = new Computer.Builder("i7", "16GB")
                                        .setStorage("1TB SSD")
                                        .setGraphicsCard("NVIDIA RTX 4070")
                                        .build();

        System.out.println("Basic Computer: " + basicComputer);
        System.out.println("Gaming Computer: " + gamingComputer);
    }
}
