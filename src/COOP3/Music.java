package COOP3;

/**
 * @author Zhongbo Li
 * @version 1.0
 */
public class Music {
  //定义music类，里面有音乐名name，时长times，并有播放功能和返回本身属性信息的功能方法getInfo
  String name;
  int times;

  public Music(String name, int times) {
    this.name = name;
    this.times = times;
  }

  public void play(){
    System.out.println("the song :"+ name + "is playing!");
  }
  public void  getInfo(){
    System.out.println( "the song: "+ name+
            "it will sing for "+ times);
  }

  public static void main(String[] args) {
     Music m =new Music("intrusion",3);
     m.play();
     m.getInfo();
  }
}
