package register;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;
public class Register {
    public static Scanner input = new Scanner(System.in);
    static FileReader user_admin_file, user_1_file, user_2_file = null;
    static BufferedReader user_admin_reader, user_1_reader, user_2_reader = null;
    public static void register_user() throws IOException {
        String username_admin = "Elviana";
        String username_1 = "Pinkly";
        String username_2 = "Guest";
        String password_admin = "elv";
        String password_1 = "pin";
        String password_2 = "Guest";
        FileWriter user_admin_file_writer, pass_admin_file_writer = null;
        BufferedWriter user_admin_buffered_writer, pass_admin_buffered_writer = null;
        FileWriter username_1_file_writer, password_1_file_writer = null;
        BufferedWriter username_1_buffered_writer, password_1_buffered_writer = null;
        FileWriter username_2_file_writer, password_2_file_writer = null;
        BufferedWriter username_2_buffered_writer, password_2_buffered_writer = null;
        user_admin_file_writer = new FileWriter("user_admin.txt");
        username_1_file_writer = new FileWriter("username_1.txt");
        username_2_file_writer = new FileWriter("username_2.txt");
        pass_admin_file_writer = new FileWriter("pass_admin.txt");
        password_1_file_writer = new FileWriter("password_1.txt");
        password_2_file_writer = new FileWriter("password_2.txt");
        user_admin_buffered_writer = new BufferedWriter(user_admin_file_writer);
        pass_admin_buffered_writer = new BufferedWriter(pass_admin_file_writer);
        username_1_buffered_writer = new BufferedWriter(username_1_file_writer);
        password_1_buffered_writer = new BufferedWriter(password_1_file_writer);
        username_2_buffered_writer = new BufferedWriter(username_2_file_writer);
        password_2_buffered_writer = new BufferedWriter(password_2_file_writer);
        user_admin_buffered_writer.write(username_admin);
        username_1_buffered_writer.write(username_1);
        username_2_buffered_writer.write(username_2);
        pass_admin_buffered_writer.write(password_admin);
        password_1_buffered_writer.write(password_1);
        password_2_buffered_writer.write(password_2);
        user_admin_buffered_writer.close();
        username_1_buffered_writer.close();
        username_2_buffered_writer.close();
        pass_admin_buffered_writer.close();
        password_1_buffered_writer.close();
        password_2_buffered_writer.close();
    }
}