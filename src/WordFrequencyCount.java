import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class WordFrequencyCount {

//    public static void main(String[] args) throws FileNotFoundException,IOException{
//
//        System.out.println("The number of words are: "+countWordFrequency("/home/manik/Desktop/FileDemo.txt"));
//    }

    public int countWordFrequency(String path)
    {
        int count = 0;
        Map m1 = new HashMap();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                String[] words = line.split(" ");
                for (int i = 0; i < words.length; i++) {
                    if (m1.get(words[i]) == null) {
                        m1.put(words[i], 1);
                    } else {
                        int newValue = Integer.valueOf(String.valueOf(m1.get(words[i])));
                        newValue++;
                        m1.put(words[i], newValue);
                    }
                }
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Map<String, String> sorted = new TreeMap<String, String>(m1);
        for (Object key : sorted.keySet()) {
            System.out.println(key + " --> " + m1.get(key));
            count++;
        }
        return count;
    }

}
