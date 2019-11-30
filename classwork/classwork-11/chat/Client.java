package com.company.chat;

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
                Socket socket = new Socket(InetAddress.getByName("localhost"), 8080);

                if (programMessage) {
                    System.out.println("To exit out of the session, type 'exit'");

                    programMessage = false;
                }

                // კლიენტის მესიჯი
                System.out.print("Type a message: ");
                String message = scanner.nextLine();

                // სესიიდან გამოსვლა
                if (message.equals("exit")) {
                    System.out.println("\nClosing the program...");
                    System.exit(0);
                }

                // კლიენტის მესიჯის სერვერთან გადაგზავნა
                ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
                out.writeObject(message);

                // სერვერის მესიჯის მიღება და დაბეჭდვა
                ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
                message = in.readObject().toString();

                System.out.println(String.format("Server: %s", message));
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}