package hw1;

public class Employee {
    private String id;
    private String name;
    private String profession;

    public void work() {
        System.out.println("员工正在工作");
    }

    public Employee() {
    }

    public Employee(String id, String name, String profession) {
        this.id = id;
        this.name = name;
        this.profession = profession;
    }

    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
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

    public void show() {
        System.out.println(id + ", " + name + ", " + profession);
    }
}
