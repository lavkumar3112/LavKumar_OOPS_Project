import java.util.Scanner;
public class Palindrome {
   static boolean pal(String s){
        int n=s.length();
        if(n==0) return true;
        return checkPal(s,0,n-1);
    }
    static boolean checkPal(String s,int start,int end){
        if(start==end) return true;
        if(s.charAt(start)!=s.charAt(end)) return false;
        if(start<end+1) return checkPal(s, start+1, end-1);
        return true;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
        String str= sc.nextLine();          
        System.out.println(pal(str));
    }
    
}
