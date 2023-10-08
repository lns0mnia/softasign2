public class CaseDecorator extends PhoneDecorator {

    public CaseDecorator(Phone decoratedPhone) {
        super(decoratedPhone);
    }

    @Override
    public double getCharge() {
        return super.getCharge() - 5.50;
    }
    @Override
    public void use() {
        super.use();
        System.out.println("and  with phone case attached");
    }
}