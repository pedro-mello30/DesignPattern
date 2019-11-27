public class SecurityCodeCheck {

    private int code = 1234;

    private int getCode(){ return code; }

    public boolean isCodeCorrect(int codeChecked){
        return getCode() == codeChecked ? true : false;
    }
}
