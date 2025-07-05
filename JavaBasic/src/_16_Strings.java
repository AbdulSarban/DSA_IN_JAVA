import java.util.*;

public class _16_Strings {

    public static void Print_Letters(String s){
        for(int i=0;i<s.length();i++){
            System.out.print(s.charAt(i)+" ");
        }
        System.out.println();
    }

    public static void Palindrome(String str){
        boolean b=true;
        for(int i=0,j=str.length()-1;i<j;i++,j--){
            if(str.charAt(i)==str.charAt(j)){
                b=true;
                
            }else{
                b=false;
                
            }
        }
        if(b){
            System.out.println(str+": Is a Palindrome ");
        }else{
            System.out.println(str+": Is not a palindrome ");
        }
    }

    public static boolean Palindrone_2(String s){
        int n=s.length();
        for(int i=0;i<n/2;i++){
            if(s.charAt(i)!=s.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }

    public static float Shortest_Distance(String s){
        int x=0;
        int y=0;
        for(int i=0;i<s.length();i++){
            char dir=s.charAt(i);

            if(dir=='S'){
                y--;
            }else if(dir=='N'){
                y++;
            }else if(dir=='E'){
                x++;
            }else{
                x--;
            }

        }
        int X2=x*x;
        int Y2=y*y;

        return (float)Math.sqrt(X2+Y2);
    }

    public static String Substring(String s,int si,int ei){
        String Subs="";
        for(int i=si;i<ei;i++){
            Subs+=s.charAt(i);
        }
        return Subs;
    }

    public static String Largest_String(String str[]){
        String largest=str[0];
        for(int i=1;i<str.length;i++){
            if((largest.compareTo(str[i])<0)){
                largest=str[i];
            }
        }
        return largest;
    }

    public static String First_Upper(String str){
        StringBuilder sb=new StringBuilder("");

        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String String_Compression(String str){

        StringBuilder sb=new StringBuilder("");

        for(int i=0;i<str.length();i++){
            Integer count=1;//We can convert Integer to string , int can not be converted.

            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count > 1){
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }

/*
 * --------------------------------------------------------Practice Problems: --------------------------------------------
 */
    public static void Vowels_Count(String str){
        int count=0;
        String str2=str.toLowerCase();
        for(int i=0;i<str2.length();i++){
            char ch=str2.charAt(i);
            if(ch=='a'||ch=='e'|| ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }
        System.out.println("Vowels Count: "+count);
    }

    public static void Anagrams(String s1,String s2){
        
        String str1=s1.toLowerCase();
        String str2=s2.toLowerCase();

        if(str1.length()==str2.length()){

            char str1_char_Array[]=str1.toCharArray();
            char str2_char_Array[]=str2.toCharArray();

            Arrays.sort(str1_char_Array);
            Arrays.sort(str2_char_Array);
            boolean result=Arrays.equals(str1_char_Array,str2_char_Array);

            if(result){
                System.out.println(str1+" And "+str2+" Are Anagrams");
            }else{
                System.out.println(str1+" And "+str2+" Are Not Anagrams");
            }


        }else{
            System.out.println(str1+" And "+str2+" Are not of same length ");
        }

    }


    public static void main(String[] args){

        System.out.println("--------------------------- Decleration and intialiazation of String: ------------------");
        char ch[]={'a','b','c','d'};

        String str="abcd";
        String str2=new String("Tony Stark");

        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]+" ");
        }
        System.out.println();
        System.out.println(str);
        System.out.println(str2);

        /*Strings are immutable :
            WE can not change the original string, if we wish to apply some changes to the string 
                then we have to use another string to save the changes.
             
        */
        System.out.println("----------------------------------------Length of Sting: ------------------------------- ");
        System.out.println("Length of str: "+str.length());
        System.out.println("Length of str2: "+str2.length());
        System.out.println("--------------- Method to print the letters inside string :------------------------------");
        Print_Letters(str2);

        String str3="madam";
        String str4="racecar";
        String str5="racpar";
        String str6="noon";
        System.out.println("----------------------------------Method 1 to check Palindrome ---------------------------");
        Palindrome(str3);
        Palindrome(str4);
        Palindrome(str5);
        Palindrome(str6);
        System.out.println("----------------------------------Method 2 to check Palindrome ----------------------------");

        if(Palindrone_2(str5)){
            System.out.println(str5+": Is a Palindrome ");
        }else{
            System.out.println(str5+": Is not a palindrome ");
        }

        System.out.println("-------------------------------Method to find shorted distance: ----------------------------");
        String path="WNEENESENNN";
        String path2="NSEW";
        System.out.println("Shorted distance for path: "+path+" is: "+Shortest_Distance(path));
        System.out.println("Shorted distance for path: "+path2+" is: "+Shortest_Distance(path2));
        
        System.out.println("------------------------------String Comparision: ------------------------------------------");
        String s1="Tony";
        String s2="Tony";
        String s3=new String("Tony");

        if(s1==s2){
            System.out.println("Both are equal");
        }else{
            System.out.println("Both are not equal");
        }
        /*
         * In above string comparision both object having same value , in such condition new object will point to value of old object
         * AS (==) comparing the objects and both objects point to same so both are equal.
         */
        if(s1==s3){
            System.out.println("Both are equal");
        }else{
            System.out.println("Both are not equal");
        }
        /*
         * In the above method one object is created by default method and another one by New method , in such condition the 
         * object created using "new" keyword will create another new value even if (s1 and s3) are equal so this will print not equal.
        */

        System.out.println("----------------------------String Comparision using Inbuilt method: -----------------------");
        if(s1.equals(s2)){
           System.out.println("Both are equal");
        }else{
           System.out.println("Both are not equal");
        }
        if(s1.equals(s3)){
           System.out.println("Both are equal");
        }else{
           System.out.println("Both are not equal");
        }


        System.out.println("--------------------------------------Method to print substring: -----------------------------");
        String s4="Helloworld";
        System.out.println(Substring(s4,0,5));
        System.out.println("---------------------------------------------Inbuilt SubString metod :------------------------");
        System.out.println(s4.substring(0,5));

        System.out.println("------------------------------Largest string from array of string: ---------------------------");
        String fruits[]={"apple","mango","banaba","greps"};
        System.out.println(Largest_String(fruits));

        System.out.println("--------------------------------------------String Builder: ----------------------------------");

        StringBuilder sb=new StringBuilder("");

        for(char i='a';i<='z';i++){
            sb.append(i);
        }
        System.out.println(sb);
        System.out.println("Length: "+sb.length());
        String s5=sb.toString();
        System.out.println("StringBuilder object to String: "+s5);

        System.out.println("-------------------------------String Uppercase And LowerCase: --------------------------------");
        String s6="hello world";
        System.out.println(s6.toUpperCase());
        System.out.println(s5.toUpperCase());

        System.out.println("Method for First letter of each word capital : ");
        
        String s7="hello i am abdul sarban";
        System.out.println("Lower case: "+s7);
        System.out.println("Upper case: "+First_Upper(s7));
        System.out.println("----------------------------------------------String Compression: -----------------------------");
        String s8="aaaabbccdd";
        System.out.println(String_Compression(s8));

        System.out.println("------------------------------------------------Practice problems: ----------------------------");
        //1)
        String n1="ABDUL SARBAN";
        Vowels_Count(n1);
        //2)
        String n2 = "ShradhaDidi";
        String n3 = "ApnaCollege";
        String n4 = "ShradhaDidi";
        System.out.println(n2.equals(n3) + " " + n2.equals(n4));//it gives boolen value;

        String n5 = "ApnaCollege";
        n5.replace("l", "");
        System.out.println(n5);

        System.out.println("-------Mehod to check Anagrams: --------");
        String n6="earth";
        String n7="heart";
        Anagrams(n6,n7);

    }
}
