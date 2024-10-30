interface Keyboard{
    
}

interface Mouse{
    
}

class WiredKeyboard implements Keyboard{
    WiredKeyboard(){
        System.out.println("Using Wired Keyboard");
    }
}

class BluetoothKeyboard implements Keyboard{
    BluetoothKeyboard(){
        System.out.println("Using Bluetooth Keyboard");
    }
}

class BluetoothMouse implements Mouse{
    BluetoothMouse(){
        System.out.println("Using Bluetooth Mouse");
    }
}

class WiredMouse implements Mouse{
    WiredMouse(){
        System.out.println("Using Wired Mouse");
    }
}

class Computer{
    public Keyboard keyboard;
    public Mouse Mouse;
    public Computer(Keyboard keyboard, Mouse mouse){
        this.keyboard = keyboard;
        this.Mouse = mouse;
    }
}

public class Main
{
	public static void main(String[] args) {
		Computer c1 = new Computer(new BluetoothKeyboard(), new WiredMouse());
		Computer c2 = new Computer(new WiredKeyboard(), new BluetoothMouse());
	}
}