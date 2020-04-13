package JavaBasic.test5.Demo11;

public class Computer {
    public void powerOn() {
        System.out.println("笔记本电脑开机");
    }

    public void powerOff() {
        System.out.println("笔记本电脑关机");
    }

    //使用USB接口作为方法的参数
    public void useDevice(USB usb) {
        usb.open();//打开USB设备
        //判断接口的实例是属于哪个类
        if (usb instanceof Mouse) {
            Mouse mouse = (Mouse) usb;
            mouse.click();
        } else if (usb instanceof Keyboard) {
            Keyboard keyboard = (Keyboard) usb;
            keyboard.type();
        }


        usb.close();//关闭USB设备
    }
}
