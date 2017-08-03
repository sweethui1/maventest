import java.io.File;
import java.io.FileInputStream;

/**
 * Created by user on 2017/2/4.
 */
public class test {
    public static void main(String[] args) {
        try{

            File file = new File("C:\\Users\\wanghui\\Desktop\\1.txt");
            FileInputStream stream = new FileInputStream(file);
//            byte [] b = new byte[(int)file.length()];
//            fileInputStream.read(b);
//            fileInputStream.close();
//            System.out.println(new String(b));

            //如果文件不知道有多大，需要判断是否读到文件末尾

            byte [] b = new byte [1024];
            int count = 0;
            int temp = 0;
            while((temp=stream.read())!= -1){
                b[count++] = (byte)temp;
            }
            stream.close();
            System.out.println(new String(b));


        }catch (Exception e){
            System.out.println("流输入异常！");
        }



    }
}
