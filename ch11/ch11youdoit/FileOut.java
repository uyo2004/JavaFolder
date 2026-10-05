// Uyoojo Okene
// p.454   Figure 11-18

import java.io.*;
import java.nio.file.*;
import static java.nio.file.StandardOpenOption.*;

public class FileOut
{
    public static void main(String[] args)
    {
        Path file =
            Paths.get("name.txt");

        String s = "Uyoojo Okene";
        byte[] data = s.getBytes();
        OutputStream output;

        try
        {
            output = new
                BufferedOutputStream(
                    Files.newOutputStream(file, CREATE));

            output.write(data);
            output.flush();
            output.close();
        }
        catch(IOException e)
        {
            System.out.println("Message: " + e);
        }
    }
}


