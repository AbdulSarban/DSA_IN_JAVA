
public class static_exp {

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("======== Static keyward example ========");
        Student s1 = new Student();
        s1.setname("aj");
        s1.School_Name = "SAE";
        System.out.println("Name: " + s1.getname());
        System.out.println("s1'School name: " + s1.School_Name);
        Student s2 = new Student();
        System.out.println("s2'School name: " + s2.School_Name);
        Student s3 = new Student();
        s3.School_Name = "SAOE";
        System.out.println("s3'School name: " + s3.School_Name);
        System.out.println("s1'School name: " + s1.School_Name);

        Student s4 = new Student();
        System.out.println("Persantage: " + s4.return_persantage(90, 98, 100));

        //Static Method.
    }
}

//Static example.
class Student {

    static int return_persantage(int phy, int chem, int math) {
        return (phy + chem + math) / 3;
    }
    String name;
    int roll_no;
    static String School_Name;

    void setname(String name) {
        this.name = name;
    }

    String getname() {
        return this.name;
    }
}
