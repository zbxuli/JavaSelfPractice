package EbGeneric15;

/**
 * @author Zhongbo Li
 * @version 1.0
 * 1.接口中，静态成员也不能使用泛型
 * 2.泛型接口类型，在继承接口或者实现接口时确定
 * 3.没有指定类型，默认Object
 */
public class HwInterface {
}
interface IA extends IUsb<String,Integer>{
//接口继承格式记住！！！
}
class Aa implements IA{

  @Override
  public Integer get(String s) {
    return null;
  }

  @Override
  public void hi(Integer integer) {

  }

  @Override
  public void run(Integer r1, Integer r2, String u1, String u2) {

  }
}
//类实现接口格式记住！！！
class Bb implements IUsb<String,Integer>{

  @Override
  public Integer get(String s) {
    return null;

  }

  @Override
  public void hi(Integer integer) {

  }

  @Override
  public void run(Integer r1, Integer r2, String u1, String u2) {

  }
}
interface IUsb<U,R>{
  R get(U u);
  void hi(R r);
  void run(R r1,R r2,U u1,U u2);
  default R method(U u){return null;}
}