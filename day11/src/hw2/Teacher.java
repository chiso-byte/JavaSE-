package hw2;

public class Teacher {
    private String name;
    private String profession;


    public Teacher() {
    }

    public Teacher(String name, String profession) {
        this.name = name;
        this.profession = profession;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return profession
     */
    public String getProfession() {
        return profession;
    }

    /**
     * 设置
     * @param profession
     */
    public void setProfession(String profession) {
        this.profession = profession;
    }


}
