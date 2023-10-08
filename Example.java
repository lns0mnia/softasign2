public class Example {
    public static void main(String[] args) {

        Phone basicPhone = new BasicPhone();
        Phone casePhone = new CaseDecorator(basicPhone);
        Phone headphonesCasePhone = new HeadphonesDecorator(casePhone);






        basicPhone.use();
        System.out.println("Battery Charge is: " + basicPhone.getCharge());
        casePhone.use();
        System.out.println("Battery Charge now is: " + casePhone.getCharge());
        headphonesCasePhone.use();
        System.out.println("Battery Charge now is: " + headphonesCasePhone.getCharge());
    }
}