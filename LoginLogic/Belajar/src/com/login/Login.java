package com.login;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
public class Login {
    static FileReader user_admin_file, username_1_file, username_2_file = null;
    static FileReader pass_admin_file, password_1_file, password_2_file = null;
    static BufferedReader user_admin_reader, username_1_reader, username_2_reader = null;
    static BufferedReader pass_admin_reader, password_1_reader, password_2_reader = null;
    static Scanner input = new Scanner(System.in);
    public static void login_user() throws IOException {
        String username, password, masuk;
        user_admin_file = new FileReader("user_admin.txt");
        username_1_file = new FileReader("username_1.txt");
        username_2_file = new FileReader("username_2.txt");
        pass_admin_file = new FileReader("pass_admin.txt");
        password_1_file = new FileReader("password_1.txt");
        password_2_file = new FileReader("password_2.txt");
        user_admin_reader = new BufferedReader(user_admin_file);
        username_1_reader = new BufferedReader(username_1_file);
        username_2_reader = new BufferedReader(username_2_file);
        pass_admin_reader = new BufferedReader(pass_admin_file);
        password_1_reader = new BufferedReader(password_1_file);
        password_2_reader = new BufferedReader(password_2_file);
        String user_admin = user_admin_reader.readLine();
        String username_1 = username_1_reader.readLine();
        String username_2 = username_2_reader.readLine();
        String pass_admin = pass_admin_reader.readLine();
        String password_1 = password_1_reader.readLine();
        String password_2 = password_2_reader.readLine();
        do {
            System.out.print("masukan username : ");
            username = input.nextLine();
            System.out.print("masukan password : ");
            password = input.nextLine();
            if (username.equals(user_admin)) {
                if (password.equals(pass_admin)) {
                    break;
                } else { 
                    System.out.println("\n" + "password salah" + "\n"); 
                }
            } else if (!user_admin.equals(username) || !pass_admin.equals(password)) {
                if (username.equals(username_1)) {
                    if (password.equals(password_1)) {
                        break;
                    } else {
                        System.out.println("\n" + "password salah" + "\n"); 
                    }
                } else if (!username_1.equals(username) || !password_1.equals(password)) {
                    if (username.equals(username_2)) {
                        if (password.equals(password_2)) {
                            break;
                        } else {
                            System.out.println("\n" + "password salah" + "\n");
                        }
                    } else if (!user_admin.equals(username) && !pass_admin.equals(password)
                            && !username_1.equals(username) && !password_1.equals(password) 
                            && !username_2.equals(username) && !password_2.equals(password)) {
                        System.out.println("\n" + "username dan password salah" + "\n");
                    } else {
                        System.out.println("\n" + "username salah" + "\n");
                    }
                } 
            }  
            System.out.print("ingin login lagi ? [y/t] : ");
            masuk = input.nextLine();
            System.out.print("\n");
        } while (masuk.equals("y") || username.equals(user_admin) && password.equals(pass_admin));
        if (username.equals(user_admin) && password.equals(pass_admin)) {
            System.out.println( "\n" + "@" + user_admin + " berhasil masuk sebagai admin" + "\n");
        } else if (username.equals(username_1) && password.equals(password_1)) { 
            System.out.println( "\n" + "@" + username_1 + " berhasil masuk sebagai user" + "\n");
        } else if (username.equals(username_2) && password.equals(password_2)) {
            System.out.println( "\n" + "@" + username_2 + " berhasil masuk sebagai user" + "\n");
        } else {
            System.out.println("login gagal" + "\n");
        }
    }
}
