public class LogicalFUn {
    public static void main(String[] args) {
        boolean isRaining  = true;
        boolean isWarm = true;
        boolean combined = isWarm && isRaining;
        System.out.println(combined);

        combined = isWarm || isRaining;
        System.out.println(combined);

        combined = !isWarm;
        System.out.println(combined);
    }
}
