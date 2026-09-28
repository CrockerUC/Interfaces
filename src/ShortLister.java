import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ShortLister
{
    public static void main(String[] args) throws FileNotFoundException
    {
        JFileChooser chooser = new JFileChooser();

        int result = chooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION)
        {
            File selectedFile = chooser.getSelectedFile();

            Scanner inFile = new Scanner(selectedFile);

            ShortWordFilter filter = new ShortWordFilter();

            while (inFile.hasNext())
            {
                String word = inFile.next();

                if (filter.accept(word))
                {
                    System.out.println(word);
                }
            }

            inFile.close();
        }
    }
}
