package app;

public class Main {

    private static double CONV_K = 0.62137;

    public static void main(String[] args) {
        System.out.println("App for distance converting.");

        double kms = 12;
        double mls = 25;
        double kilomtrs = convMlsToKms(mls);
        double miles = convKmsToMld(kms);
        System.out.println("Result is " + miles + " miles and "
                + kilomtrs + " kilometers");
    }

    private static double convMlsToKms(double mls) {
        return mls/CONV_K;
    }

    private static double convKmsToMld(double kms) {
        return kms*CONV_K;
    }
    
}
