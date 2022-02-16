public class Main {
    public static void main(String[] args) {
//        MobilePhone mobilePhone = new MobilePhone();
//        System.out.println(String.format("Рівень заряду: %s%%", mobilePhone.getPercentCharging()));
//        mobilePhone.call(10);
//        Charger chargerMicroUsb = new Charger(5.0f, 1.0f);
//        mobilePhone.pluginCharger(chargerMicroUsb);
//        mobilePhone.charge(180);
//        System.out.println(String.format("Рівень заряду: %s%%", mobilePhone.getPercentCharging()));
//        mobilePhone.call(10);
//        System.out.println(String.format("Рівень заряду: %s%%", mobilePhone.getPercentCharging()));

        MobilePhoneWithTypeC samsungS22Ultra = new MobilePhoneWithTypeC();
        samsungS22Ultra.call(10);

        ChargerSamsungS22 chargerSamsungS22 = new ChargerSamsungS22(18);
        samsungS22Ultra.plugin(chargerSamsungS22);
        samsungS22Ultra.charge(50);

        samsungS22Ultra.call(180);
        samsungS22Ultra.unplug();

        Charger chargerMicroUsb = new Charger(5.0f, 1.0f);
        AdapterMicroUsbToTypeC adapterMicroUsbToTypeC = new AdapterMicroUsbToTypeC(chargerMicroUsb);
        samsungS22Ultra.plugin(adapterMicroUsbToTypeC);
        samsungS22Ultra.charge(20);

        AdapterMicroUsbToTypeC_inharitance adapterMicroUsbToTypeC2 = new AdapterMicroUsbToTypeC_inharitance(5.0f, 1.0f);
        samsungS22Ultra.plugin(adapterMicroUsbToTypeC2);
        samsungS22Ultra.charge(10);

        MobilePhone mobilePhone = new MobilePhone();
        mobilePhone.pluginCharger(new AdapterTypeCToMicroUsb(chargerSamsungS22));
        mobilePhone.charge(10);
    }
}