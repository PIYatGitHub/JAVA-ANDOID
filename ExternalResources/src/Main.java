import javax.swing.*;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String[] args) {
        // WORKS WELL FOR ENGLISH - not for other languages 1 EN char = 1 byte; 1CYR char = 2 bytes;
        //String path = "files/fix the radix web app.txt";
        /*try {
//            FileInputStream in = new FileInputStream(path);
//            int b = in.read();
//            while (b!= -1) {
//                System.out.print((char) b);
//                b = in.read();
//            }
//            in.close();

            // approach # 2 File reader
//            FileReader fr = new FileReader(path);
//            int code = fr.read();       // here it will return a code let's say 1901 whereas with the inp. stream it will be 19, so you loose massive amount of data
//            while (code!= -1) {         // and total pizdec occurs
//                System.out.print((char) code);
//                code = fr.read();
//            }
//            fr.close();

            // option # 3 the buffered reader
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line; // reading line by line
            while ((line=reader.readLine())!= null) {
                System.out.println(line);
            }
            reader.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage() + "!");
        }

        //now lets make a dir
        new File("files/myFileExperiments").mkdir();
        File one = new File("files/myFileExperiments/one.txt");
        try {
            one.createNewFile();
            FileWriter writer = new FileWriter(one.getAbsolutePath());
            //BufferedWriter b_writer = new BufferedWriter(new FileWriter(one.getAbsolutePath())); --> another approach - be carful not to mix & match...

            writer.write("Line 1: And so the story begins...\r\n");
            writer.write("Line 2: Once upon a time there was a little sausage..." +
                         "and it lived happily ever after\r\n");
            writer.write("Line 3: The end...\r\n");

            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


        //INSPECT FILE PROPS
//        File fix_app = new File("files/fix the radix web app.txt");
//        System.out.println("Is file available to read - " + fix_app.canRead());
//        System.out.println("Is file available to write - " + fix_app.canWrite());
//        System.out.println("Is file available to write - " + fix_app);
    }*/
//        JFileChooser fc = new JFileChooser();
//        int r = fc.showOpenDialog(null);
//        if(r == JFileChooser.APPROVE_OPTION) {
//            File f = fc.getSelectedFile();
//            try {
//                FileInputStream inputStream = new FileInputStream(f.getAbsolutePath());
//                FileOutputStream outputStream = new FileOutputStream("files/myFileExperiments/" + f.getName());
//                //byte [] buffer = new byte[inputStream.available()]; // DANGER if file is up to a certain size - no problem, but beware of large files!!!!
//                byte [] buffer = new byte[8192]; // compromise solution we fix th size of the buffer!
//                //inputStream.read(buffer); - lightning fast copy if there is memory
//                while (inputStream.read(buffer)!=-1){
//                    outputStream.write(buffer);
//                }
//                inputStream.close();
//                outputStream.close();
//                JOptionPane.showMessageDialog(null,"Copied the img for you!");
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            } catch (IOException e) {
//                System.out.println("pizdec!");
//            }
//
//        }
        //Working with URLS
//        try {
//            URL web = new URL("https://www.myrusakov.ru");
//            BufferedReader reader = new BufferedReader(new InputStreamReader(web.openStream()));
//            String result ="",line;
//            while ((line= reader.readLine())!=null){
//                result += line + "\r\n";
//            }
//            reader.close();
//            System.out.println(result);
//
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            //pizdec
//        }

    }
}
