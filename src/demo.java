import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = null;
        try{
            fin = new FileInputStream("E:\\test.txt");
            int i = 0;
            while((i=fin.read())!= -1){
                System.out.print((char)i);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }finally{
            fin.close();
        }
    }
}
