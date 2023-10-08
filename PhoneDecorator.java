public abstract class PhoneDecorator implements Phone {

    protected Phone decoratedPhone;

    public PhoneDecorator(Phone decoratedPhone) {
        this.decoratedPhone = decoratedPhone;
    }

    @Override
    public double getCharge() {
        return decoratedPhone.getCharge();
    }
    @Override
    public void use() {
        decoratedPhone.use();
    }
}