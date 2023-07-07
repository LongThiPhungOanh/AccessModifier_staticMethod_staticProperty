package BaiTap.Java;

public class Student {
    private String name =  "John";
    private String classes = "C02";
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getClasses() {
        return classes;
    }
    public void setClasses(String classes) {
        this.classes = classes;
    }
    public Student(){}
}
class Test {
    public static void main(String[] args) {
        Student object = new Student();
        object.setClasses("C02");
        object.setName("Hihi");
        System.out.println(object.getClasses());
        System.out.println(object.getName());
    }
}

