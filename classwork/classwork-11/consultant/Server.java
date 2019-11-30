package com.company.consultant;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server implements Runnable {
    @Override
    public void run() {
        try {
            ServerSocket serverSocket = new ServerSocket(8081);
            FileOperations fileOperations = new FileOperations();
            fileOperations.writeToFile();

            while (true) {
                Socket socket = serverSocket.accept();
                ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
                String command = in.readObject().toString();

                // სესიიდან გამოსვლა
                if (command.equals("exit")) {
                    System.out.println("\nClosing the program...");
                    System.exit(0);
                }

                // სერვერიდან ბრძანების აღწერის კლიენტთან გაგზავნა
                ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
                String commandDescription = fileOperations.readFile(command.toLowerCase());
                out.writeObject(commandDescription);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}