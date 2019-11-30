package com.company.consultant;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client implements Runnable {
    @Override
    public void run() {
        try {
            Scanner scanner = new Scanner(System.in);
            boolean programMessage = true;

            while (true) {
                Socket socket = new Socket(InetAddress.getByName("localhost"), 8081);

                if (programMessage) {
                    System.out.println("To exit out of the session, type 'exit'");

                    programMessage = false;
                }

                // კლიენტის მიერ ბრძანების შეყვანა
                System.out.print(">");
                String command = scanner.nextLine();

                // სესიიდან გამოსვლა
                if (command.equals("exit")) {
                    System.out.println("\nClosing the program...");
                    System.exit(0);
                }

                // კლიენტის მიერ შეყვანილი ბრძანების სერვერთან გადაგზავნა
                ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
                out.writeObject(command);

                // სერვერის მესიჯის მიღება და დაბეჭდვა
                ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
                String commandDescription = in.readObject().toString();

                System.out.println(commandDescription);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
