package com.company.chat;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server implements Runnable {
    @Override
    public void run() {
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            Scanner scanner = new Scanner(System.in);

            while (true) {
                Socket socket = serverSocket.accept();
                ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
                String message = in.readObject().toString();

                // კლიენტის მესიჯის დაბეჭდვა
                System.out.println(String.format("Client: %s", message));

                // სერვერის პასუხი კლიენტის მესიჯზე
                System.out.print("Type a message: ");
                message = scanner.nextLine();

                // სესიიდან გამოსვლა
                if (message.equals("exit")) {
                    System.out.println("\nClosing the program...");
                    System.exit(0);
                }

                // სერვერის მესიჯის კლიენტთან გაგზავნა
                ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
                out.writeObject(message);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}