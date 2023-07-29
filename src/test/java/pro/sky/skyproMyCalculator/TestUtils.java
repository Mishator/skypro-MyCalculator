package pro.sky.skyproMyCalculator;

public class TestUtils {
    public static String buildResponse(int num1, int num2, int result, char action) {
        return String.format("%s %s %s = %s", num1, action, num2, result);
    }


}
