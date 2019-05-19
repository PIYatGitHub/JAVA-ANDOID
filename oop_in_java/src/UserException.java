class UserException extends Exception {
    final static int SHORT_LOGIN = 1;
    final static int LONG_LOGIN = 2;
    final static int IS_NULL = 3;
    final static int NOT_A_NUMBER = 4;
    private int code;
    UserException(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
