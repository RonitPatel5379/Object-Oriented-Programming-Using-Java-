import java.util.Scanner;
import java.lang.String;
 class InnerVowelDemo {
    String sentence;
    int count;
    public void vowelDe(int count){
        this.sentence=sentence;
        this.count=count;
        int c1=0,c2=0,c3=0,c4=0,c5=0;
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("enter String:");
            sentence=sc.nextLine();
             for(int i=0;i<sentence.length();i++){
                sentence.equalsIgnoreCase(sentence);
                char ch=sentence.charAt(i);
                if (ch=='a') {
                    c1++;
                }
                else if (ch=='e') {
                    c2++;
                }
                else if (ch=='i') {
                    c3++;
                }
                else if (ch=='o') {
                    c4++;
                }
                else if (ch=='u') {
                    c5++;
                }
             }
             if (sentence.equals("quit")) {
                break;
             } 
        }
        c3-=1;
        c5-=1;
        System.out.println("a ="+c1+"\n e ="+c2+"\n i ="+c3+"\n o= "+c4+"\n u= "+c5);
        sc.close();
    }
}
public class VowelDemo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int count=0;
       InnerVowelDemo i1=new InnerVowelDemo();
       i1.vowelDe(count);
       sc.close();
    }
}