package FileIO17;

import java.io.*;

/**
 * @author Zhongbo Li
 * @version 1.0
 * 使用BufferedReader 读取一个文本文件，为每行加上行号，
 * 再连同内容一并输出到屏幕上
 *
 *  如果把文件编码改成gbk 出现中文乱码，思考如何解决
 *  1.默认是按照utf-8处理，开始没有乱码
 *  2.提示： 使用转换流，将FileInputStream -> InputStreamReader->BufferedReader
 */
public class hw2 {
  public static void main(String[] args) {
    String filePath = "d:\\mytemp\\a.txt";
    String line;
    int lineNum =0;
    BufferedReader br =null;

    try {
      br = new BufferedReader(new FileReader(filePath));
      while((line = br.readLine())!= null){
        System.out.println(++lineNum+line);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }finally {
      if(br != null){
        try {
          br.close();
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
    }
  }
}
