
public class Experience extends Resume {

    public Experience() {
        super();
        System.out.println("Experience");
    }

    @Override
    public String CreateExperienceInfo()
    {
        String result= "";



            result = result +  super.getJobtitle() + "\n" +
                    super.getCompany() + "\n" +
                    super.getStartdate() + "\n" +
                    super.getEnddate() + "\n" +
                    super.getJobdescription() + "\n";


        return result;

    }
}
