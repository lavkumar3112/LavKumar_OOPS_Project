public class Power {
    static int Pow(int x,int y){
        int res = 1; 
 
        while (y > 0) {
 
            
            if ((y & 1) != 0)
                res = res * x;
 
            
            y = y >> 1; 
            x = x * x; 
        }
        return res;
    }
    public static void main(String args[]){
        System.out.println(Pow(2,0));
    }
    
}
