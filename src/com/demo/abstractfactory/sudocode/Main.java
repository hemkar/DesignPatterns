package com.demo.abstractfactory.sudocode;

public class Main {
    public static void main(String[] args) {
        UniversityFactory factory = UniversityFactory.getUniversityFactory(125);
        AdmitCard admitCard= factory.getAdmitCard("Math");
        FeeCalculator feeCalculator = factory.getFeeCalculator("Math");
        System.out.println(admitCard.getAdmitCard());
        System.out.println(feeCalculator.getFee());

        admitCard = factory.getAdmitCard("Physics");
        feeCalculator = factory.getFeeCalculator("Physics");
        System.out.println(admitCard.getAdmitCard());
        System.out.println(feeCalculator.getFee());

        factory = UniversityFactory.getUniversityFactory(100);
        admitCard = factory.getAdmitCard("CS");
        feeCalculator = factory.getFeeCalculator("CS");
        System.out.println(admitCard.getAdmitCard());
        System.out.println(feeCalculator.getFee());

    }
}
