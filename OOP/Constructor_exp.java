
public class Constructor_exp {

    public static void main(String[] args) {
        System.out.println("Hello World");
        //Types of Constructor;
        Student s1 = new Student();
        Student s2 = new Student("aj");
        System.out.println("s2'name: " + s2.name);
        System.out.println("Shallow Constructor");
        Student s3 = new Student();
        s3.name = "DK";
        s3.id = 19;
        s3.marks[0] = 100;
        s3.marks[1] = 90;
        s3.marks[2] = 95;
        Student s4 = new Student(s3);//all varialble references of s3 will be shared 
        //with the new object s4.
        //Due to this if some changes in s3 has done then that reflects in s4. .... because 
        //reference is same.
        System.out.println("S4's marks");
        for (int i = 0; i < 3; i++) {
            System.out.println(s4.marks[i]);
        }
        //change in marks
        s3.marks[2] = 100;
        System.out.println("S4's marks after chaange");
        for (int i = 0; i < 3; i++) {
            System.out.println(s4.marks[i]);
        }

        //Deep Constuctor.
        System.out.println("======== Deep Constuctor using Student1 class ========");
        Student1 s5 = new Student1();
        s5.name = "DK";
        s5.id = 19;
        s5.marks[0] = 100;
        s5.marks[1] = 90;
        s5.marks[2] = 95;

        Student1 s6 = new Student1(s5);
        System.out.println("S6's marks");

        for (int i = 0; i < 3; i++) {
            System.out.println(s6.marks[i]);
        }

        s5.marks[2] = 100;
        System.out.println("S6's marks after chaange");
        for (int i = 0; i < 3; i++) {
            System.out.println(s6.marks[i]);
        }
        //no change refleted 
        System.out.println("S5's marks after chaange");
        for (int i = 0; i < 3; i++) {
            System.out.println(s5.marks[i]);
        }

    }

}

class Student {

    String name;
    int id;
    int marks[];

    Student() {
        marks = new int[3];
        System.out.println("Constructor called");
    }

    Student(String name) {
        //parameterized Constuctor
        this.name = name;
    }

    // shallow copy Constructor;
    Student(Student s1) {
        this.name = s1.name;
        this.id = s1.id;
        marks = new int[3];
        this.marks = s1.marks;
    }

}
//example of deep constuctor

class Student1 {

    String name;
    int id;
    int marks[];

    Student1() {
        marks = new int[3];
        System.out.println("Constructor called");
    }

    /*Student1(String name) {
        //parameterized Constuctor
        this.name = name;
    }*/
    // shallow copy Constructor;
    /*Student1(Student s1) {
        this.name = s1.name;
        this.id = s1.id;
        marks = new int[3];
        this.marks = s1.marks;
    }
     */
    //deep copy Constructor;
    Student1(Student1 s1) {
        this.name = s1.name;
        this.id = s1.id;
        marks = new int[3];
        //this.marks = s1.marks; instead of this assign 
        //value respetively.
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
        //a new array will be created for new object.
    }

}
