public class UserException extends Exception {
    final static int NO_F_NAME = 1;
    final static int NO_L_NAME = 2;
    private int code;

    public UserException(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
