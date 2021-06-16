package com.pinkly;
import java.io.IOException;
import java.util.Scanner;
import register.Register;
import com.login.Login;
class register extends Register {}
class login extends Login {}
public class Main {
    static Scanner input = new Scanner(System.in);
    static void Register_User() throws IOException {
        register.register_user();
    }
    static void Login_User() throws IOException {
        login.login_user();
    }
    public static void main(String[] args) throws IOException {
        String pilih, masuk;
        System.out.println("\n" + "BELAJAR LOGIC FOR ACCOUNT LOGIN" + "\n");
        Register_User();
        do {
            System.out.println("login / exit" + "\n");
            System.out.print("masukan input : ");
            masuk = input.nextLine();
            switch (masuk) {
                case "login" :
                    System.out.println("\n" + "silahkan masukan username dan password");
                    System.out.print("\n");
                    Login_User();
                break;
                case "exit" : 
                    System.out.println("\n" + "keluar dari program" + "\n");
                    System.out.println("program selesai" + "\n");
                    System.exit(0);
                default : {
                    System.out.println("input salah");
                }
            }
            System.out.print("ingin login ulang [y/t] ? : ");
            pilih = input.nextLine();
            System.out.print("\n");
        } while (pilih.equals("y"));
        System.out.println("program selesai" + "\n");
    }
}
