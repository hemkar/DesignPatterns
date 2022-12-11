package com.demo.abstractfactory.sudocode;
// Concrete factory
public class PublicUniversityFactoy extends UniversityFactory {
    @Override
    public AdmitCard getAdmitCard(String course) {
        switch(course){
            case "Math" :
                return new USCAdmitCard();
            case "Physics" :
                return new VSUAdmitCard();
            case "CS" :
                return new ASUAdmitCard();
            default :
                break;
        }
        return null;
    }

    @Override
    public FeeCalculator getFeeCalculator(String course) {
        switch(course){
            case "Math" :
                return new USCFeeCalculator();
            case "Physics" :
                return new VSUCalculator();
            case "CS" :
                return new ASUFeeCalculator();
            default :
                break;
        }
        return null;
    }
}
