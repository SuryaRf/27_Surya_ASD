package Praktikum09;

import java.util.Scanner;

public class ScavengerHunt27 {
    Point27 head;

    public ScavengerHunt27() {
        this.head = null;
    }

    public void addPoint(String question, String answer) {
        Point27 newPoint = new Point27(question, answer);

        if (head == null) {
            head = newPoint;
        } else {
            Point27 current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newPoint;
        }
    }

    public void startHunt() {
        Point27 current = head;
        Scanner scanner = new Scanner(System.in);

        while (current != null) {
            System.out.println("Question: " + current.question);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(current.answer)) {
                System.out.println();
                System.out.println("\u001B[32mBenar! Pindah ke titik berikutnya.\u001B[0m");
                current = current.next;
            } else {
                System.out.println();
                System.out.println("\u001B[31mJawaban salah. Silahkan Coba lagi.\u001B[0m");
            }
        }
        System.out.println();
        System.out.println("\u001B[32mSelamat! Anda telah menemukan harta karunnya!\u001B[0m");

        scanner.close();
    }
}
