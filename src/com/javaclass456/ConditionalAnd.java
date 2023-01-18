package com.javaclass456;

public class ConditionalAnd {
    public static void main(String[] args) {
// Conditional And is used when you
        // want to enforce multiple rules
        // before you execute your logic
        //all of the rules must be met

        //to issue certificate I want
        //students to have GPA more than 3.5
        //and students to have less than
        //3 missed classes
        boolean giveAidaiCertificate=false;
        double AidaiGPA=4.0;
        int AidaiMissedClasses=3;
                              //true            //false
        giveAidaiCertificate= AidaiGPA>3.5&&AidaiMissedClasses<3;
        System.out.println(giveAidaiCertificate);//result false because I missed 3 classes
        System.out.println("==============================================================================");
         boolean giveDriverLicence=false;
         int myage=22;
         boolean eyesight=true;
         double testresult=5.0;
         giveDriverLicence=myage>18&&eyesight&&testresult>4.0;
        System.out.print("Can we give Aidai driver licence? ");
        System.out.print(giveDriverLicence );
        System.out.println("==================================================================== \n");
        boolean giveFamilyHealthInsuranceCoverage=false;
        int creditscore=650;
        boolean married=true;
        int havechildren=2;
        giveFamilyHealthInsuranceCoverage=creditscore<680&&married&&havechildren>1;
        System.out.println(giveFamilyHealthInsuranceCoverage);
        System.out.println("=====================================================================");
        boolean IlikeBTS=true;
        int howmanyyear=7;
        int fanatfrom=2013;
        boolean Realfan=howmanyyear>5&&fanatfrom>2012&&IlikeBTS;
        System.out.println(Realfan);


    }
}
