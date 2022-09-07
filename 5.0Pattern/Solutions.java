public class Solutions{

    // Problem 1
    public static void pr_01(int n){
            // outer Loop
        for(int i = 1; i<= n; i++){
            // inner Loop
            for(int j = 1; j<= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Problem 2
    public static void pr_02(int n){
            // outer Loop
        for(int i = 1; i <=n; i++){
            // inner Loop
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Problem 3
    public static void pr_03(int n){
            // outer Loop
        for(int i = 1; i <=n; i++){
            // inner Loop
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Problem 4
    public static void pr_04(int n){
            // outer Loop
        for(int i = 1; i <=n; i++){
            // inner Loop
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // Problem 5
    public static void pr_05(int n){
            // outer Loop
        for(int i = 1; i <=2*n-1; i++){
            // inner Loop - Half Condition
            int j = i>n ? 2*n-i : i;
            for(int k=1;k<=j;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Problem 6
    public static void pr_06(int n){
            // outer Loop
        for (int i = 1; i<=n; i++){
            // Spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
                // Star
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
            System.out.println();
        }
    }

    // Problem 7 -- Important
    public static void pr_07(int n){
        // outer Loop
        for(int i=1; i<=n; i++){
            //Spaces
            for (int j = 1; j<=i-1;j++){
                System.out.print(" ");
            }
                //star
                for(int j=1;j<=n-i+1;j++){
                    System.out.print("*");
                }
            System.out.println();
        }
    }

    // Question 8
    public static void pr_08(int n){
        // outer Loop
        for(int i= 1; i<=n; i++){
            //Spaces
            for(int j =1; j<=n-i;j++){
                System.out.print(" ");
            }
                //star
                for(int j = 1; j<=2*i-1;j++){
                    System.out.print("*");
                }
            System.out.println();
        }
    }

    // Question 9
    public static void pr_09(int n){
        // outer loop
        for(int i= 1;i<=n;i++){
            //space
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
                // star
                for(int j=2*(n-i)+1; j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    // Question 10
    public static void pr_10(int n){
        // outer loop
        for (int i=1; i<=n; i++){
            // spaces
            for (int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            // Star with spaces
            for (int j=1; j<=i; j++){
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
    }

        // Question 11
        public static void pr_11(int n){
            // outer loop
            for (int i=1; i<=n; i++){
                // spaces
                for (int j=1; j<=i-1;j++){
                    System.out.print(" ");
                }
                // Star with spaces
                for (int j=1; j<=n-i+1; j++){
                    System.out.print("*"+ " ");
                }
                System.out.println();
            }
        }

            // Question 12
    public static void pr_12(int n){
        // outer loop -1st half
        for (int i=1; i<=n; i++){
            // spaces 
            for (int j=1; j<=i-1;j++){
                System.out.print(" ");
            }
            // Star with spaces
            for (int j=1; j<=n-i+1; j++){
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
            // outer loop - 2nd Half
            for (int i=n; i>=1; i--){
            // spaces 
            for (int j=1; j<=i-1;j++){
                System.out.print(" ");
            }
            // Star with spaces
            for (int j=1; j<=n-i+1; j++){
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
            
    }

    // Question 13 - IMPORTANT (2*i-1)
    public static void pr_13(int n){
        // outer loop
        for (int i = 1; i<=n;i++){
            // spaces
            for (int j =1; j<= n-i; j++){
                System.out.print(" ");
            }
            // inner loop
            for (int j=1; j<=2*i-1; j++){
                if (j == 1 || j ==2*i-1 || i == 1 || i == n ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Question 14
    public static void pr_14(int n){
        // outer loop
        for (int i = n; i>=1;i--){
            // inner loop -spaces
            for (int j =1; j<=n-i; j++){
                System.out.print(" ");
            }
            // inner loop
            for (int j=1 ; j<= 2*i-1;j++){
                // star
                if(i == 1 || i == n || j == 1 || j == 2*i-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Question 15
    public static void pr_15(int n){
        // outer loop
        for (int i = 1; i<=2n-1;i++){
            // spaces
            for (int j = 1; j<=n-i;j++){
                System.out.print(" ");
            }
            // star
            for (int j=1; j<=2*i-1;j++){
                j = i<=n ? 2*i-1 : 
            }
        }
    }

    // Main -- important (7,9,12,13)
    public static void main(String args[]){
        pr_14(5);
    }
}