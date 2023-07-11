package writer;

public class OzdobnikKreski implements IOzdobnik {

    String ss = "------";
    @Override
    public String ozdob(String s) {
        return ss + s + ss;
    }

}
