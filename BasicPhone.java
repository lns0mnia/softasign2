public class BasicPhone implements Phone {

    @Override
    public double getCharge() {
        return 100.0;
    }
    @Override
    public void use() {
        System.out.println("using default phone");
    }
}