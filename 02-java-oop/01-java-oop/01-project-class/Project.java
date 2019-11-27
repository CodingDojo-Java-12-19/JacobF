public class Project {
    private String name;
    private String description;

    public Project() {
        this("Default Name", "Default Description");
    }

    public Project(String name) {
        this.name = name;
    }

    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return this.name;
    }

    public String getDesc() {
        return this.description;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setDesc(String desc) {
        this.description = desc;
    }

    public String elevatorPitch() {
        String returnStr = this.name.concat(" : ");
        returnStr = returnStr.concat(this.description);
        return returnStr;
    }

}