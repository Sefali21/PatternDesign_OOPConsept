package C15_TXT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Sefali21\\Desktop\\html_link.txt";
        FileInputStream fileInputStream = new FileInputStream(path);

        int control=0;
        String text="";
        while((control=fileInputStream.read())!=-1){
            //System.out.print((char)control);
            text+=(char)control;
        }
        System.out.println(text);

        System.out.println(String.format("integer %d",control));


    }
}
