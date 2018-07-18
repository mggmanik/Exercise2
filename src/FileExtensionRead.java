import java.io.*;

public class FileExtensionRead {

//    public static void main(String[] args) {
//        listOfFiles("/home/manik/Desktop/TestFolder");
//    }

    public String[] listOfFiles(String path)
    {
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();

        System.out.println("List of Files: ");
        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                System.out.println("File " + listOfFiles[i].getName());
            }
        }

        String[] lof = folder.list(new FilenameFilter(){
            @Override
            public boolean accept(File file, String s) {
                if(s.toLowerCase().endsWith(".html")) {
                    return true;
                }
                else
                    return false;
            }
        });

        System.out.println("Files:");
        for(String f : lof)
        {
            System.out.println(f);
        }

        System.out.println("File Content: ");

        String fileName = path+"/"+lof[0];
        InputStream is = null;
        try {
            is = new FileInputStream(fileName);
            byte content[] = new byte[2*1024];
            int readCount = 0;
            while((readCount = is.read(content)) > 0){
                System.out.println(new String(content, 0, readCount-1));

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                if(is != null) is.close();
            } catch(Exception ex){

            }
        }
        return lof;
    }
}
