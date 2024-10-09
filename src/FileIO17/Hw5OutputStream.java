package FileIO17;

import org.testng.annotations.Test;

import java.io.*;

/**
 * @author Zhongbo Li
 * @version 1.0
 */
public class Hw5OutputStream {
  public static void main(String[] args) {

  }

  @Test
  public void writeFile01() throws IOException {
    String filePath = "d:\\FilePractice\\a.txt";
    //new FileOutputStream(filePath)写入内容，覆盖原内容
    //new FileOutputStream(filePath,true)写入内容，追加文件后
    FileOutputStream fop = new FileOutputStream(filePath,true);
    fop.write('a');
    String str= "hello a";
    //str.getBytes 可以把字符串 ->字节数组
    fop.write(str.getBytes());
    fop.write(str.getBytes(),0,3);
    fop.close();
  }
  @Test
  public void writeFile02() throws IOException {
    String filePath = "d:\\FilePractice\\note.txt";
    //new FileOutputStream(filePath)写入内容，覆盖原内容
    //new FileOutputStream(filePath,true)写入内容，追加文件后
    FileWriter fw =null;
    char[] chars = {'a','b','c'};
    fw  = new FileWriter(filePath);
    //write(int) 写入单个字符
    fw.write('c');
    //fw.write(chars[])写入指定数组
    fw.write('\n');
    fw.write(chars);
    fw.write('\n');
    //fw.write(chars[],off,len)写入指定数组的指定部分
    //.toCharArray() 是 Java 中 String 类的一个方法，
    // 它的作用是将字符串（String）转换成一个字符数组（char[]）
    fw.write("Java努力学习".toCharArray(),0,3);
    fw.write('\n');
    //write(String) 写入整个字符串
    fw.write("你好世界~");
    fw.write('\n');
    //wrire(string,off,len) 写入字符串的指定部分
    fw.write("呼和浩特",0,2);

    //close()= close()+ flush(),不使用，会导致数据写入不进去
    fw.close();
  }


  @Test
  public void writeFile03() throws IOException {
    String filePath ="d:\\FilePractice\\BufferedWriter_.txt";
    //注意：
    //1.new FileWriter(filePath,true) 表示追加的方式写入，而不是用BufferWriter后面
    //BufferWriter没有（filePath,true）这样的功能
    BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
    bw.write("good,I learnt it");
    bw.newLine();//换行
    bw.write("I will be a data engineer");
    bw.close();
  }

  @Test
  public void BufferedCopy() throws IOException {

    //BufferedReader和BufferedWriter 是安装字符操作
    //不要去操作 二进制文件【声音、视频
    // doc、pdf等等】,可能造成文件损坏
    String srcPath ="d:\\FilePractice\\a1.java";
    String DestPath ="d:\\mytemp\\a1.java";
    BufferedReader br = new BufferedReader(new FileReader(srcPath));
    BufferedWriter bw = new BufferedWriter(new FileWriter(DestPath));
    String line;
    while((line = br.readLine())!=null){
      bw.write(line);
      bw.newLine();
    }
    bw.close();
    br.close();
  }
  @Test
  public void BufferedStream() throws IOException {
    String src ="d:\\mytemp\\b.png";
    String dest = "d:\\mytemp\\c.png";

    BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
    BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));

    int readlen =0;
    byte[] buff= new byte[1024];
    while((readlen = bis.read(buff))!=-1){
      bos.write(buff,0,readlen);
    }

    bis.close();
    bos.close();
  }
}
