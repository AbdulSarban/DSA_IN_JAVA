
public class Constructor_Chaining {

    public static void main(String[] args) {
        System.out.println("Hello World");

        /*Constructor chaining is the process of calling one constructor 
        from another constructor with respect to current object.  */
        temp t = new temp();
        /*the chaing for single class is done by using the this keyward.*/
 /*In case of Parent - Child it is done by using super keyward*/

        temp_derived td = new temp_derived();
    }
}

class temp {

    int temp_var;

    temp() {
        this(5);
        System.out.println("temp_var: " + temp_var);

        System.out.println("Default Constructor");
    }

    temp(int temp_var) {
        this.temp_var = temp_var;
        System.out.println("2nd Constructor");
    }
}

class temp_base {

    temp_base() {
        System.out.println("Base Constructor");
    }
}

class temp_derived extends temp_base {

    temp_derived() {
        super();
    }
}
