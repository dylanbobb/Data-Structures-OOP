package virtualkeyboarddemo;

import java.util.Scanner;
import java.io.IOException;

public class VirtualKeyboardDemo
{
    public static void main(String[] args) throws IOException
    {
        Scanner input = new Scanner(System.in);
        Process proc = Runtime.getRuntime().exec("cmd /c C:\\Windows\\System32\\osk.exe");
        String name;
        System.out.println("Enter name >>");
        name = input.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}