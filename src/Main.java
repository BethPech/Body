public class Main {
    public static void main(String[] args) {
        BodyIndex service = new BodyIndex();
        float index = service.calculate(1.78F, 56.5F);
        System.out.println(index);

    }
}
