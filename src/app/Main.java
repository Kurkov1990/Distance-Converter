package app;

public class Main {

    private static double CONV_K = 0.62137;

    public static void main(String[] args) {
        System.out.println("App for distance converting.");

        double mls = 25;
        double kilomtrs = convMlsToKms(mls);
        System.out.println("Result is " + kilomtrs + " kilometers");
    }

    private static double convMlsToKms(double mls) {
        return mls/CONV_K;
    }

}