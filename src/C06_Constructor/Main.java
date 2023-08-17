package C06_Constructor;

public class Main {
    public static void main(String[] args) {
        Teacher teacher=new Teacher();
        System.out.println(teacher.name+" "+teacher.surname+" "+teacher.branch);
        teacher.name="Ömeren";
        teacher.surname="Güclun Cocuk";
        teacher.branch="Arbeiter";
        System.out.println(teacher.name+", "+teacher.surname+", "+teacher.branch);


    }
}
