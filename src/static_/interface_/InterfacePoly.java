package static_.interface_;

public class InterfacePoly {
    public static void main(String[] args) {
        //Polymorphic parameters
        Phone p1 = new Phone();
        Camera camera = new Camera();
        Computer computer = new Computer();
        computer.work(p1);
        computer.work(camera);


        //Polymorphic Array
        System.out.println("~~~~~~~~~~~~~~");
        Usb[] usbs = new Usb[2];
        usbs[0] = new Camera();
        usbs[1] = new Phone();
        for (int i = 0; i < usbs.length; i++) {
            usbs[i].job();
            if(usbs[i] instanceof Phone){
                ((Phone) usbs[i]).call();
            }else if(usbs[i] instanceof Camera){
                ((Camera) usbs[i]).pic();
            }else{
                System.out.println("error");
            }
        }

        //Polymorphic transmission
        IA a = new test();
        IB b = new test();

    }
}
class Computer{
    public void work(Usb usb){
        usb.start();
        usb.stop();
    }
}
interface Usb{
    void start();
    void job();
    void stop();
}
class Phone implements Usb{

    @Override
    public void start() {
        System.out.println("Phone start working");
    }
    public void call(){
        System.out.println("Phone call");
    }

    @Override
    public void job() {
        System.out.println("Phone work");
    }

    @Override
    public void stop() {
        System.out.println("Phone stop working");
    }
}
class Camera implements Usb{
    @Override
    public void start() {
        System.out.println("camera start work");
    }
    public void pic(){
        System.out.println("take pictures");
    }



    @Override
    public void job() {
        System.out.println("Camera work");
    }

    @Override
    public void stop() {
        System.out.println("camera stop work");
    }
}

interface IA {
    void hi();
}
interface IB extends IA{}

class test implements IB {

    @Override
    public void hi() {
        System.out.println("test Polymorphic transmission");
    }
}