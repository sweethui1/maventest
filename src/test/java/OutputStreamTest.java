import java.io.File;
import java.io.FileOutputStream;

/**
 * Created by wanghui on 2017/8/3.
 */
public class OutputStreamTest {

    public static void main(String[] args) {
        try {
            File file = new File("D:\\aa.txt");
            FileOutputStream fo = new FileOutputStream(file);
            byte [] b = "hello world ! 这是一个实例".getBytes() ;
            fo.write(b);
            fo.close();

        }catch (Exception e){

        }
    }
}
