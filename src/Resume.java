import java.util.ArrayList;

public class Resume {
    private String name;
    private String email;
    private String degreetype;
    private String major;
    private String universityname;
    private String graduationyear;
    private ArrayList<String> jobtitle = new ArrayList<>();
    private ArrayList<String> company = new ArrayList<>();
    private ArrayList<String> startdate = new ArrayList<>();
    private ArrayList<String> enddate= new ArrayList<>();
    private ArrayList<String> jobdescription = new ArrayList<>();
    private String skillname;
    private String proficiency;


    public Resume() {
       // System.out.println("A new resume is created...");
    }

    public String CreatePersonalInfo() {
        return "The personal info is : " + name + "\n" + email ;
    }
    public String CreateEducationalInfo() {
        return "You must enter 1 Educational achivment : " +  degreetype + "\n" +
                major + "\n" +
                universityname + "\n" +
                graduationyear + "\n";
    }

    public String CreateExperienceInfo() {
        return "You must enter 1 Experience achivment :" + jobtitle + "\n" + company + "\n" +
                startdate + "\n" +
                enddate + "\n" +
                jobdescription + "\n" ;
    }

    public String CreateSkillInfo() {
        return "You must enter 3 Skills :" + skillname +"\n" +
                                            proficiency + "\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDegreetype() {
        return degreetype;
    }

    public void setDegreetype(String degreetype) {
        this.degreetype = degreetype;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getUniversityname() {
        return universityname;
    }

    public void setUniversityname(String universityname) {
        this.universityname = universityname;
    }

    public String getGraduationyear() {
        return graduationyear;
    }

    public void setGraduationyear(String graduationyear) {
        this.graduationyear = graduationyear;
    }

    public ArrayList<String> getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(ArrayList<String> jobtitle) {
        this.jobtitle = jobtitle;
    }

    public ArrayList<String> getCompany() {
        return company;
    }

    public void setCompany(ArrayList<String> company) {
        this.company = company;
    }

    public ArrayList<String> getStartdate() {
        return startdate;
    }

    public void setStartdate(ArrayList<String> startdate) {
        this.startdate = startdate;
    }

    public ArrayList<String> getEnddate() {
        return enddate;
    }

    public void setEnddate(ArrayList<String> enddate) {
        this.enddate = enddate;
    }

    public ArrayList<String> getJobdescription() {
        return jobdescription;
    }

    public void setJobdescription(ArrayList<String> jobdescription) {
        this.jobdescription = jobdescription;
    }

    public String getSkillname() {
        return skillname;
    }

    public void setSkillname(String skillname) {
        this.skillname = skillname;
    }

    public String getProficiency() {
        return proficiency;
    }

    public void setProficiency(String proficiency) {
        this.proficiency = proficiency;
    }
}
