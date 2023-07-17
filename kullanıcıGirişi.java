import java.util.Scanner;

public class kullanıcıGirişi {
    public static void main(String[] args) {
        String userName, pasaword, VerificationCode;
        Scanner inp = new Scanner(System.in);

        System.out.println("Kullanıcı Adınızı Giriniz : ");
        userName = inp.nextLine();

        System.out.println("Şifrenizi Giriniz : ");
        pasaword = inp.nextLine();

        System.out.println("Doğrulama Kodunu Giriniz : ");
        VerificationCode = inp.nextLine();

        if (userName.equals("mert@hotmail.com") && pasaword.equals("12345") && VerificationCode.equals("98")) {

            System.out.println("Giriş Başarılı :) ");
        } else {
            System.out.println("Hatalı Giriş :( ");


        }


    }

}

