public class Skill extends Resume {
    public Skill() {
        super();
        System.out.println("Skills");
    }

    @Override
    public String CreateSkillInfo() {
        return super.getSkillname() + "\n" +
                super.getProficiency() + "\n";

    }
}
