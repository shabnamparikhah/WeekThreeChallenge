public class Personal extends Resume {
    public Personal() {
        super();
        System.out.println("Please Enter Name and Email :");
    }
    @Override
    public String CreatePersonalInfo() {
        return   super.getName() + "\n" +
                super.getEmail();
    }
}
