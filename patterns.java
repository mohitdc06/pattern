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
    
    public static void hollowtriangle(int n) {
        
    }
    
    public static void main(String[] args) {
        Kpattern(11);
    }
}
