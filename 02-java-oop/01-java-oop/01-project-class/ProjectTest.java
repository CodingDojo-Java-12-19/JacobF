public class ProjectTest {
    public static void main(String[] args) {
        Project proj = new Project("name", "desc");
        String name = proj.getName();
        String desc = proj.getDesc();
        System.out.println(name);
        System.out.println(desc);
        proj.setDesc("Test");
        proj.setName("Jake");
        name = proj.getName();
        desc = proj.getDesc();
        System.out.println(name);
        System.out.println(desc);
        String elevatorPitch = proj.elevatorPitch();
        System.out.println(elevatorPitch);
    }
}