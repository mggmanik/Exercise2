import java.io.*;

public class ReadFileContents {

//    public static void main(String[] args) throws IOException {
//        long len;
//        File file = new File("/home/manik/Desktop/test");
//
//        BufferedReader br = new BufferedReader(new FileReader(file));
//
//        String st;
//        while ((st = br.readLine()) != null)
//            System.out.println(st.toUpperCase());
//
//        len = file.length();
//        System.out.println("Length of the File: "+len);

//    }

    public long fileHandle(String fl) throws IOException {
        long len;

        File file = new File(fl);

        BufferedReader br = null;
        try {
            br = new BufferedReader((new FileReader(file)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String st;
        while ((st = br.readLine()) != null)
        {
            System.out.println(st.toUpperCase());
        }

        len=file.length();

        System.out.println("Length of the File: "+len);
        return len;
    }
}
