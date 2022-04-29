
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int month, day;
        Scanner scan = new Scanner(System.in);
        System.out.print("Dogdugunuz ay: ");
        month = scan.nextInt();
        System.out.print("Dogdugunuz gun: ");
        day = scan.nextInt();

        switch (month) {
            case 1:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        System.out.println("Oglak Burcu");
                    }
                    System.out.println("Kova Burcu");
                } else {
                    System.out.println("Gecersiz bir gun girdiniz");
                }
                break;

            case 2:
                if (day >= 1 && day <= 28) {
                    if (day < 20) {
                        System.out.println("Kova Burcu");
                    }
                    System.out.println("Balık Burcu");
                } else {
                    System.out.println("Gecersiz bir gun girdiniz");
                }
                break;

            case 3:
                if (day >= 1 && day <= 31) {
                    if (day < 21) {
                        System.out.println("Balık Burcu");
                    }
                    System.out.println("Koc Burcu");
                } else {
                    System.out.println("Gecersiz bir gun girdiniz");
                }
                break;
            case 4 :
                if (day >= 1 && day <= 30) {
                    if (day < 22) {
                        System.out.println("Koc Burcu");
                    }
                    System.out.println("Boga Burcu");
                }else{
                    System.out.println("Gecersiz bir gun girdiniz");
                }
                break;
            case 5 :
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        System.out.println("Boga Burcu");
                    }
                    System.out.println("İkizler Burcu");
                }else{
                    System.out.println("Gecersiz bir gun girdiniz");
                }
                break;
            case 6:
                if (day >= 1 && day <= 30) {
                    if (day < 23) {
                        System.out.println("ikizler Burcu");
                    }
                    System.out.println("Yengec Burcu");
                }else{
                    System.out.println("Gecersiz bir gun girdiniz");
                }
                break;
            case 7 :
                if (day >= 1 && day <= 31) {
                    if (day < 24) {
                        System.out.println("Yengec Burcu");
                    }
                    System.out.println("Aslan Burcu");
                }else{
                    System.out.println("Gecersiz bir gun girdiniz");
                }
                break;
            case 8 :
                if (day >= 1 && day <= 31) {
                    if (day < 24) {
                        System.out.println("Aslan Burcu");
                    }
                    System.out.println("Basak Burcu");
                }else{
                    System.out.println("Gecersiz bir gun girdiniz");
                }
                break;
            case 9:
                if (day >= 1 && day <= 30) {
                    if (day < 24) {
                        System.out.println("Başak Burcu");
                    }
                    System.out.println("Terazi  Burcu");
                }else{
                    System.out.println("Gecersiz bir gun girdiniz");
                }
                break;
            case 10 :
                if (day >= 1 && day <= 31) {
                    if (day < 24) {
                        System.out.println("Terazi Burcu");
                    }
                    System.out.println("Akrep Burcu");
                }else{
                    System.out.println("Gecersiz bir gun girdiniz");
                }
                break;
            case 11:
                if (day >= 1 && day <= 30) {
                    if (day < 23) {
                        System.out.println("Akrep Burcu");
                    }
                    System.out.println("Yay Burcu");
                }else{
                    System.out.println("Gecersiz bir gun girdiniz");
                }
                break;
            case 12:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        System.out.println("Yay Burcu");
                    }
                    System.out.println("Oglak Burcu");
                }else{
                    System.out.println("Gecersiz bir gun girdiniz");
                }
                break;
            default:
                System.out.println("hatalı bir ay girdiniz");
        }
    }
}
