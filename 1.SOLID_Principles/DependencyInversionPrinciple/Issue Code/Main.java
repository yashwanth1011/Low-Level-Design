class WiredKeyboard{
    WiredKeyboard(){
        System.out.println("Using Wired Keyboard");
    }
}

class WiredMouse{
    WiredMouse(){
        System.out.println("Using Wired Mouse");
    }
}

class Computer{
    public static WiredKeyboard keyboard;
    public static WiredMouse Mouse;
    public Computer(){
        keyboard = new WiredKeyboard();
        Mouse = new WiredMouse();
    }
}

public class Main
{
	public static void main(String[] args) {
		Computer c = new Computer();
	}
}