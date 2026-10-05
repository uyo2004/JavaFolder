// Uyoojo Okene
// p.476

import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;
import static java.nio.file.StandardOpenOption.*;
import java.nio.file.attribute.*;
import java.util.*;

public class ReadStateFile
{
    public static void main(String[] args)
    {
        try (Scanner input = new Scanner(System.in)) {
            String fileName;

            System.out.print("Enter name of file to use >> ");
            fileName = input.nextLine();

            Path file = Paths.get(fileName);

            final String ID_FORMAT = "000";
            final String NAME_FORMAT = "          ";
            final String STATE_FORMAT = "  ";
            final String BALANCE_FORMAT = "0000.00";
            String delimiter = ",";

            String s = ID_FORMAT + delimiter +
                       NAME_FORMAT + delimiter +
                       STATE_FORMAT + delimiter +
                       BALANCE_FORMAT +
                       System.getProperty("line.separator");

            final int RECSIZE = s.length();

            byte[] data = s.getBytes();

            final String EMPTY_ACCT = "000";

            String[] array;

            double balance;
            double total = 0;

            try
            {
                BasicFileAttributes attr =
                    Files.readAttributes(
                        file, BasicFileAttributes.class);

                System.out.println(
                    "Creation time " + attr.creationTime());

                System.out.println(
                    "Size " + attr.size());
            }
            catch(IOException e)
            {
                System.out.println("IO Exception");
            }

            try
            {
                InputStream iStream =
                    new BufferedInputStream(
                        Files.newInputStream(file));

                try (BufferedReader reader = new BufferedReader(
                        new InputStreamReader(iStream))) {
                    System.out.println();
                    System.out.println("All non-default records:");
                    
                    s = reader.readLine();
                    
                    while(s != null)
                    {
                        array = s.split(delimiter);
                        
                        if(!array[0].equals(EMPTY_ACCT))
                        {
                            System.out.println(
                                    "ID #" + array[0] + " " +
                                            array[1] + " " +
                                            array[2] + " $" +
                                            array[3]);
                            
                            balance =
                                    Double.parseDouble(array[3]);
                            
                            total += balance;
                        }
                        
                        s = reader.readLine();
                    }
                    
                    System.out.println(
                            "Total of all balances is $" + total);
                }
            }
            catch(IOException | NumberFormatException e)
            {
                System.out.println("Error message: " + e);
            }

            try
            {
                try (FileChannel fc = (FileChannel)Files.newByteChannel(
                        file, READ)) {
                    ByteBuffer buffer =
                            ByteBuffer.wrap(data);
                    
                    int accountNum;
                    
                    System.out.print(
                            "Enter account number to search for >> ");
                    
                    accountNum = input.nextInt();
                    
                    fc.position(accountNum * RECSIZE);
                    
                    fc.read(buffer);
                    
                    s = new String(data);
                    
                    System.out.println(
                            "Desired record: " + s);
                }
            }
            catch(IOException | IllegalArgumentException | InputMismatchException e)
            {
                System.out.println("Error message: " + e);
            }
        }
    }
}
