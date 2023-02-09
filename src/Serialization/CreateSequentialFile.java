package Serialization;

import org.jcp.xml.dsig.internal.dom.DOMCryptoBinary;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateSequentialFile {
    private static final DOMCryptoBinary JAXB = null ;

    public static void main(String[] args) throws IOException {
        try(BufferedWriter output = Files.newBufferedWriter(Paths.get("clients.xml"))) {
            Scanner input = new Scanner(System.in);

            Accounts accounts = new Accounts();

            System.out.printf("%s%n%s%n? ",
                    "Enter account number, first name, last name and balance.",
                    "Enter end-of-file indicator to end input.");

            while (input.hasNext()) {
                try {
                    Account records = new Account(input.nextInt(),
                            input.next(), input.next(), input.nextDouble());

                    accounts.getAccounts().add(records);
                } catch (NoSuchElementException elementException) {
                    System.err.println("Invalid input. Please try again.");
                    input.nextLine();
                }
                System.out.println("? ");
            }
            //JAXB.marshal(accounts, output);
        }
        catch (IOException ioException) {
            System.err.println("Error opening file. Terminating.");
        }
    }
}
