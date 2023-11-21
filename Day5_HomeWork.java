import java.util.Scanner;

public class Day5_HomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int n = sc.nextInt();
        
//        for(int i = 1;i<=n;i++){
//            for(int j = 1;j<=n;j++){
//                if(i ==1 ||j==1 ||i==n||j==n ){
//                    System.out.print(" * ");
//                }else{
//                    System.out.print("   ");
//                }
//            }
//            System.out.println();
//        }

//        for(int i = 1;i<=n;i++){
//
//            for(int j = i ;j<n;j++){
//                System.out.print(" ");
//            }
//            for(int k = 1; k<=i;k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        for(int i =1;i<=n;i++){
//            int num =1;
//            for(int j=i;j<=n;j++){
//                System.out.print(num);
//                num++;
//            }
//            System.out.println();
//        }

//        int num = 1;
//        for(int i = 1;i<=n;i++){
//            for(int j =1;j<=i;j++){
//                System.out.print(num+" ");
//                num++;
//            }
//            System.out.println();
//        }

//        int num =0;
//        for(int i =1; i<=n; i++){
//            for(int j =1; j<=i;j++){
//                if(num==1){
//                    num=0;
//                }else {
//                    num=1;
//                }
//                System.out.print(num);
//            }
//            System.out.println();
//        }

//        for(int i = 1 ; i <=n; i++){
//            for(int j = 1;j<=i;j++){
//                System.out.print(" * ");
//            }
//            for(int k = 1;k<=2*(n-i);k++){
//                System.out.print("   ");
//            }
//            for (int s = 1 ; s<=i;s++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//        for(int i = n ; i >0; i--){
//            for(int j = 1;j<=i;j++){
//                System.out.print(" * ");
//            }
//            for(int k = 1;k<=2*(n-i);k++){
//                System.out.print("   ");
//            }
//            for (int s = 1;s<=i;s++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }

//        for(int i = 1; i<=n;i++){
//            for(int j = n; j>=i;j--){
//                System.out.print("   ");
//            }
//            for(int s = 1 ; s<=n;s++){
//                if( s==1||s==n||i ==1|| i==n){
//                System.out.print(" * ");
//                }else {
//                    System.out.print("   ");
//                }
//            }
//            System.out.println();
//        }
//        for(int i = 1; i<=n;i++){
//            for (int j = n ; j>=i;j--){
//                System.out.print("   ");
//            }
//            for(int s = 1; s < (2*i); s++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//
//        for(int i = n;i>=0;i--){
//            for (int j = n ; j>=i;j--){
//                System.out.print("   ");
//            }
//            for(int s =1;s<(2*i);s++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }

//        int num= 1;
//        for(int i = 1; i<=n;i++){
//
//            for (int j = n ; j>=i;j--){
//                System.out.print("   ");
//            }
//            for(int s = 1; s <= (2*i)-1; s++){
//                if(s%2==0){
//                    System.out.print("   ");
//                }else {
//                    System.out.print(" "+num+" ");
//                }
//            }
//            num++;
//
//            System.out.println();
//        }

        for(int i = 1; i<=n;i++){
            for (int j = n ; j>=i;j--){
                System.out.print("   ");
            }
            for(int s= i;s>=1;s--){
                System.out.print(" "+s+" ");
            }
            for(int l = 2;l<=i;l++){
                System.out.print(" "+l+" ");
            }
            System.out.println();
        }

    }
}
