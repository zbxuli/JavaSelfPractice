package FileIO17;

import java.io.*;

/**
 * @author Zhongbo Li
 * @version 1.0
 *
 * 1.默认情况，读取文件是按照utf-8编码
 * 2.但是中文等其他文字不选用utf-8可能会乱码
 *
 * 把FileInputStream转成InputStreamReader
 * 指定编码GBK
 */
public class Hw8SystemStream {
    public static void main(String[] args) throws IOException {
        String path = "d:\\FilePractice\\c.txt";
        BufferedReader brr = new BufferedReader(new FileReader(path));
        //用这句话转化文字编码
        InputStreamReader isr = new InputStreamReader(new FileInputStream(path), "gbk");
        BufferedReader br = new BufferedReader(isr);

        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(path,true),"gbk");
        BufferedWriter bw = new BufferedWriter(osw);
        bw.write("我爱世界");
        String s = br.readLine();
        //转换后
        System.out.println(s);
        //直接读
        System.out.println(brr.readLine());
        bw.close();
        br.close();
        brr.close();
    }
}
//打印流只有输出流没有输入流
