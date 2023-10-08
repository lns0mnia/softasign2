public class HeadphonesDecorator extends PhoneDecorator {

    public HeadphonesDecorator(Phone decoratedPhone) {
        super(decoratedPhone);
    }

    @Override
    public double getCharge() {
        return super.getCharge() - 30.0;
    }
    @Override
    public void use() {
        super.use();
        System.out.println("and also with connected headphones too");
    }
}