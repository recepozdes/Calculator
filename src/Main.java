import java.util.Scanner;

public class Main {
    static void sum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz : ");
        int a = sc.nextInt();
        System.out.println("İkinci sayıyı giriniz : ");
        int b = sc.nextInt();
        int result = a + b;
        System.out.println("sum : " + a + " + " + b + " = " + result);
    }

    static void minus() {
        Scanner sc = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz : ");
        int a = sc.nextInt();
        System.out.println("İkinci sayıyı giriniz : ");
        int b = sc.nextInt();
        int result = a - b;
        System.out.println("minus : " + a + " - " + b + " = " + result);
    }

    static void multiply() {
        Scanner sc = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz : ");
        int a = sc.nextInt();
        System.out.println("İkinci sayıyı giriniz : ");
        int b = sc.nextInt();
        int result = a * b;
        System.out.println("multiply : " + a + " * " + b + " = " + result);
    }

    static void divide() {
        Scanner sc = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz : ");
        int a = sc.nextInt();
        System.out.println("İkinci sayıyı giriniz : ");
        int b = sc.nextInt();
        if (b == 0) {
            System.out.println("b sayısı 0 olamaz");
        } else {
            double result = (double) a / b;
            System.out.println("divide : " + a + " / " + b + " = " + result);
        }
    }

    static void pow() {
        Scanner sc = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz : ");
        int a = sc.nextInt();
        System.out.println("İkinci sayıyı giriniz : ");
        int b = sc.nextInt();
        double result = Math.pow(a, b);
        System.out.println("pow : " + a + " ^ " + b + " = " + result);

    }

    static void mod() {
        Scanner sc = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz : ");
        int a = sc.nextInt();
        System.out.println("İkinci sayıyı giriniz : ");
        int b = sc.nextInt();
        if (b <= 0) {
            System.out.println("b sayısı 0 olamaz");
        } else {
            int result = a % b;
            System.out.println("mod : " + a + " % " + b + " = " + result);
        }
    }

    static void rectangle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz : ");
        int a = sc.nextInt();
        System.out.println("İkinci sayıyı giriniz : ");
        int b = sc.nextInt();

        if (a > 0 && b > 0) {
            int result = a * b;
            System.out.println("rectangle area: " + a + " * " + b + " = " + result);
            result = 2 * (a + b);
            System.out.println("rectangle perimeter: " + a + " + " + b + " = " + result);
        } else {
            System.out.println("Girilen değerler ile bir dikdörtgen oluşturulamaz");
        }
    }

    static int factorial(int a) {
        int result = 1;
        if(a>=1){
            result = a * factorial(a - 1);
            return result;
        }else{
            return result;
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int select;

        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme İşlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Mod Alma\n"
                + "7- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "8- Faktöriyel\n"
                + "0- Çıkış";

        while (true) {
            System.out.println("Bir İşlem Seçiniz");
            System.out.println(menu);
            select = scanner.nextInt();
            switch (select) {
                case 1:
                    sum();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    multiply();
                    break;
                case 4:
                    divide();
                    break;
                case 5:
                    pow();
                    break;
                case 6:
                    mod();
                    break;
                case 7:
                    rectangle();
                    break;
                case 8:
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Bir sayı giriniz : ");
                    int a = sc.nextInt();
                    factorial(a);
                    System.out.println("Faktöriyel : " + a + "! = " + factorial(a));
                    break;
                default:
                    System.out.println("Geçersiz İşlem");
                    break;
            }
        }
    }
}
