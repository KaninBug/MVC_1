public class Controller extends Model{
    private String color;
    private int numID;

    Controller(String c, int n) {
        color = c;
        numID = n;
    }

    public boolean checkColorCow() {
        for(String e : getColorList()) {
            if(color.equals(e)) {
                System.out.println();
                return true;
            }
        }
        return false;
    }

}
