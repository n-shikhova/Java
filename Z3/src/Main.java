public class Main {

    public static String getVin(String[] ms) {
        int t, p = -1, m = 0;
        String nm = "";
        for (int i = 0; i < ms.length; i++) {
            String[] data = ms[i].split(" ");
            t = Integer.parseInt(data[1]);
            if (t > m) {
                m = t;
                nm = data[0];
            }
        }
        return nm;
    }

    public static void main(String[] args) {
        String []ms = {"Ivan 5", "Petr 3", "Alex 10", "Petr 8", "Ivan 6", "Alex 5", "Ivan 1", "Petr 5", "Alex 1"};
        System.out.println("Победитель: " + getVin(ms));
    }
}
