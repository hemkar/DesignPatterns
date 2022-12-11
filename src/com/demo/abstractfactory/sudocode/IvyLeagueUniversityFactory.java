package com.demo.abstractfactory.sudocode;
// Concrete factory
public class IvyLeagueUniversityFactory extends UniversityFactory {
    @Override
    public AdmitCard getAdmitCard(String course) {
        switch(course){
            case "Math" :
                return new MITAdmitCard();
            case "Physics" :
                return new CalTechAdmintCard();
            case "CS" :
                return new GeorgiaTechAdmitCard();
            default :
                break;
        }
        return null;
    }

    @Override
    public FeeCalculator getFeeCalculator(String course) {
        switch(course){
            case "Math" :
                return new MITFeeCalculator();
            case "Physics" :
                return new CalTechFeeCalculator();
            case "CS" :
                return new GeorgiaTechFeeCalculator();
            default :
                break;
        }
        return null;
    }
}
