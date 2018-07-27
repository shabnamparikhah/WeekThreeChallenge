import java.util.ArrayList;

public class Educational extends Resume {


    public Educational() {
        //super();
        System.out.println("Education");
    }


    @Override
    public String CreateEducationalInfo() {
        return super.getDegreetype() + "\n" +
                super.getMajor() + "\n" +
                super.getUniversityname() + "\n" +
                super.getGraduationyear() + "\n";
    }



}
