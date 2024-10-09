package FileIO17;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Zhongbo Li
 * @version 1.0
 * 在判断e盘下是否有文件夹mytemp
 * 如果没有就创建
 * 在e:\\mytemp目录下，创建文件hello.txt
 * 如果已经存在文件，提示该文件已存在，就不要再重复创建了
 */
public class Hw1 {
  public static void main( String[] args) throws IOException {
    String directoryPath = "d:\\mytemp";
    File file = new File(directoryPath);
    if(!(file.exists())){
      if(file.mkdir()){
        System.out.println("create "+ directoryPath +"success");
      }else {
        System.out.println("failed");
      }
    }

    String filePath = directoryPath + "\\hello.txt";
    file = new File(filePath);
    if(!file.exists()){
      if(file.createNewFile()){
        System.out.println(filePath +"success");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        bufferedWriter.write("hello,world");
        bufferedWriter.close();
      }else{
        System.out.println("failed");
      }
    }else {
      BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
      bufferedWriter.write("hello,zb");
      bufferedWriter.close();
      System.out.println(filePath+"existed");
    }
  }
}
