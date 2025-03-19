import java.util.Scanner;  

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);               
        System.out.print("Wprowadź tekst: ");
        String input = scanner.nextLine();     
        String wynik = input.toLowerCase();               
        System.out.println("Tekst po zamianie na małe litery: " + wynik);
        scanner.close();
    }
}