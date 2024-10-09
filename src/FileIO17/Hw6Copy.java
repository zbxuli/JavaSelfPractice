package FileIO17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Zhongbo Li
 * @version 1.0
 */
public class Hw6Copy {
  public static void main(String[] args) throws IOException {
      FileInputStream fis =null;
      FileOutputStream fos =null;
      String inPath = "d:\\FilePractice\\a.txt";
      String outPath = "d:\\mytemp\\a.txt";
      fis= new FileInputStream(inPath);
      fos = new FileOutputStream(outPath);
      int readlen =0;
      byte[] buf = new byte[100];
      //读byte，必须放在read()括号里，要不然回报数组越界异常
      while((readlen = fis.read(buf)) !=-1){
          System.out.print(new String(buf,0,readlen));
          fos.write(buf,0,readlen);
      }

      fis.close();
      fos.close();
  }
}
