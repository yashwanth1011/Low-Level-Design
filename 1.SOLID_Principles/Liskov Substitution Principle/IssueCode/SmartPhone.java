public class SmartPhone extends Phone {
    @Override
    public void playGames(){
        System.out.println("Playing Pubg in smart Phone");

    }

    @Override
    public String displayTouchFeatures(){
        return "\n" + "Haptic feedback enhancements\n" + //
                        "Pressure sensitivity (Force Touch)\n" + //
                        "Expanded multi-touch gestures\n" + //
                        "Air gestures (hover-based interactions)";
    }
}
