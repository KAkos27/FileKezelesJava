package filebeolvasas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileBeolvasas {

    public static void main(String[] args) throws IOException {

        List<String> abszolut = Files.readAllLines(Path.of("C:\\adatok\\abszolut.txt"));
        System.out.println(abszolut);

        InputStream is = FileBeolvasas.class.getClassLoader().getResourceAsStream("res/res.txt");
        BufferedReader bf = new BufferedReader(new InputStreamReader(is));

        String sor;

        while ((sor = bf.readLine()) != null) {
            System.out.println();
        }

        InputStream in = FileBeolvasas.class.getClassLoader().getResourceAsStream("res/emberek.csv");

    }

}
