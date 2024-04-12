package static_.Template;

abstract public class Template {
    abstract public int job();
    public void calculate(){
        long  start = System.currentTimeMillis();
        job();
        long end = System.currentTimeMillis();
        System.out.println("the mission spent " + (end - start));
    }
}
