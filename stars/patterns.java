public class patterns {
    public static void Kpattern(int n) {
        //1st half
        for (int i = 1; i <= (n + 1) / 2; i++) {
            for (int str = 1; str <= n / 2 + 2 - i; str++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        //2nd half
        for (int i = 1; i <= n / 2; i++) {
            for (int str = 1; str <= i + 1; str++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
    
    public static void numbertriangular(int n) {
        for (int i = 1; i <= n; i++) {
            //outer space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //stars + spaces
            for(int j = 1; j <=2*i-1; j++){
                //odd(j)- star
                if(j%2!=0){
                    System.out.print(i);
                }
                //even(j)- space
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Kpattern(11);
        numbertriangular(5);
    }
}
