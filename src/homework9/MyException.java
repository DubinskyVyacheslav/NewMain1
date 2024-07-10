package homework9;

public class MyException extends RuntimeException {

    private ExeptionEnum code;

    public MyException(String message) {

        super(message);

    }

    public MyException(ExeptionEnum code, String message) {
        super(message);
        this.code = code;

    }

//    public int dividingNumbers(int dividend, int divider) {
//
//        if (divider == 0) {
//            try {
//                throw new ArithmeticException();
//            }catch (){
//
//            }
//        }
//
//        int result = dividend / divider;
//
//        return result;
//    }

//    public void addInIntArray(int Array, int position) {
//
//
//    }
//
//
}
