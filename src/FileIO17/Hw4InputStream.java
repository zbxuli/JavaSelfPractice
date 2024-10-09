package FileIO17;

import org.testng.annotations.Test;

import java.io.*;

/**
 * @author Zhongbo Li
 * @version 1.0
 * input读取
 */
public class Hw4InputStream {
  public static void main(String[] args) {

  }


  @Test
  public void readFile01() throws IOException {
    //节点流 :
    //访问文件的字节输入流，按照单个字节读取
    String filePath = "d:\\FilePractice\\hello.txt";
    FileInputStream fis = new FileInputStream(filePath);
    int readData =0;
    while((readData = fis.read()) !=-1){
      System.out.print((char)readData);
    }
    fis.close();
  }

  @Test
  public void readFile02() throws IOException {
    //节点流 :
    //访问文件的字节输入流，按照字节数组读取
    String filePath = "d:\\FilePractice\\hello.txt";
    FileInputStream fis = new FileInputStream(filePath);
    int readlen =0;
    byte[] buf = new byte[8];
    //读byte，必须放在read()括号里，要不然回报数组越界异常
    while((readlen = fis.read(buf)) !=-1){
      System.out.print(new String(buf,0,readlen));
    }
    fis.close();
  }
  @Test
  public void readFile03() throws IOException {
    //节点流 :
    //访问文件的字符输入流，按照单个字符读取
    String filePath = "d:\\FilePractice\\hello.txt";
    FileReader fr = new FileReader(filePath);
    int data = 0;
    while((data = fr.read())!=-1){
      System.out.print((char) data);
    }
    fr.close();

  }
  @Test
  public void readFile04()  {
    //节点流 :
    //访问文件的字节输入流，按照字符数组读取
    String filePath = "d:\\FilePractice\\hello.txt";
    FileReader fr = null;

    int readLen=0;
    char[] buf = new char[8];

    try {
      fr = new FileReader(filePath);
      while((readLen=fr.read(buf)) !=  -1){
        System.out.print(new String(buf,0,readLen));
      }

    } catch (IOException e) {
      e.printStackTrace();
    }finally {
      try {
        fr.close();
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }


  }

  @Test
  public void readFile05() throws IOException {
    //处理流 :
    //访问文件的字符输入流
    String filePath = "d:\\FilePractice\\hello.txt";
    BufferedReader br = new BufferedReader(new FileReader(filePath));
    String line;
    //按行读取效率高
    //1.br.readline()是按行读取文件
    //2.当返回null时，表示文件读取完毕
    while((line = br.readLine())!=null){
      System.out.println(line);
    }

    br.close();
  }

}
