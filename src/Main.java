public class Main {
    public static void main(String[] args) {
        Student student = new Student("sky",32,'男',22);
        System.out.println("姓名："+student.getName());
        System.out.println("ID:"+student.getID());
        System.out.println("性别:"+student.getGender());
        System.out.println("年龄:"+student.getAge());
    }
}
