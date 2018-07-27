import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        Personal personal = new Personal();
        Scanner myScan = new Scanner(System.in);
        personal.setName(myScan.nextLine());
        output("Please enter email :");
        personal.setEmail(myScan.nextLine());
//////////////////////////////////////////////////////////////
        Educational education = new Educational();
          education.setDegreetype(myScan.nextLine());
        education.setMajor(myScan.nextLine());
        education.setUniversityname(myScan.nextLine());
        education.setGraduationyear(myScan.nextLine());
        /////////////////////////////////////////////////////////////////
        Experience experiance = new Experience();
        ArrayList<String> setcompanyArrayNew = new ArrayList<>();
        ArrayList<String> setcompanyArray = new ArrayList<>();
        ArrayList<String> setJobtitleArray = new ArrayList<>();
        ArrayList<String> setJobdescriptionArray = new ArrayList<>();
        ArrayList<String> setStartdateArray = new ArrayList<>();
        ArrayList<String> setEnddateArray = new ArrayList<>();


        for (int j= 0; j <= 2; j++) {

            setJobtitleArray.add(myScan.nextLine());
         //  sb.append(setJobtitleArray+ "\n");
            setcompanyArray.add(myScan.nextLine());
           // sb.append(setcompanyArray+ "\n");
            setStartdateArray.add(myScan.nextLine());
           // sb.append(setStartdateArray+ "\n");
            setEnddateArray.add(myScan.nextLine());
           // sb.append(setEnddateArray+ "\n");
            setJobdescriptionArray.add(myScan.nextLine());
           // sb.append(setJobdescriptionArray+ "\n");

            experiance.setJobtitle(setJobtitleArray);
            experiance.setCompany(setcompanyArray);
            experiance.setStartdate(setStartdateArray);
            experiance.setEnddate(setEnddateArray);
            experiance.setJobdescription(setJobdescriptionArray);


        }

        ////////////////////////////////////////////////////////////////
            Skill skill = new Skill();

            for (int i = 0; i < 3; i++) {

                sb.append(myScan.nextLine()+ "\n");
                skill.setSkillname(sb.toString() );

            }
            output("Personal Information");
            output(personal.CreatePersonalInfo());
        output("Education");
            output(education.CreateEducationalInfo());
        output("Experience");
            output(experiance.CreateExperienceInfo());
        output("Skill");
            output(skill.CreateSkillInfo());



    }
        public static void output (String message){
            System.out.println("\n" + message);

    }
}
