package EaCollection14;

import java.util.ArrayList;

/**
 * @author Zhongbo Li
 * @version 1.0
 */
public class Hw1 {
  public static void main(String[] args) {
    News news = new News("covid 19 make 100 people died in australia during 1000");
    News fishing = new News("fishing");
    ArrayList<News> news1 = new ArrayList<>();
    news1.add(news);
    news1.add(fishing);
    int size = news1.size();
    for (int i = size -1; i >=0 ; i--) {
     /* System.out.println(news1.get(i));
     * 不做任何处理直接输出*/
      //按照题目处理，这个记住
      News newst = (News)news1.get(i);
      System.out.println(processTitle(newst.getTitle()));
    }

  }
  public static String processTitle(String  title){
    if(title == null){
      return "";
    }
    if(title.length()>15){
      return title.substring(0,15)+ "...";
    }else {
      return title;
    }
  }
}

class News{
  public String title;
  public String content;

  public News(String title) {
    this.title = title;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  @Override
  public String toString() {
    return "News{" +
            "title='" + title + '\'' +
            '}';
  }
}