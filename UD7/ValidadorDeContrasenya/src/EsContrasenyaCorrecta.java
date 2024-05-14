public class EsContrasenyaCorrecta {
    private boolean isError;
    private String msgError;

    public EsContrasenyaCorrecta(boolean isError, String msgError) {
        setError(isError);
        setMsgError(msgError);
    }

    public boolean isError() {
        return isError;
    }
    public void setError(boolean error) {
        isError = error;
    }

    public String getMsgError() {
        return msgError;
    }
    public void setMsgError(String msgError) {
        this.msgError = msgError;
    }
}
