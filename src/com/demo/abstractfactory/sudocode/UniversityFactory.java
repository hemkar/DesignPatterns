package com.demo.abstractfactory.sudocode;
// Abstract factory
public abstract class UniversityFactory {
    private static final int cutoff = 109;
    public static UniversityFactory getUniversityFactory(int score){
        if(score > cutoff){
            return new IvyLeagueUniversityFactory();
        }else {
            return new PublicUniversityFactoy();
        }
    }

    public abstract AdmitCard getAdmitCard(String course);
    public abstract FeeCalculator getFeeCalculator(String course);
}
