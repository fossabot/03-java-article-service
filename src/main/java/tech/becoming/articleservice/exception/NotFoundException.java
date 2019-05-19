package tech.becoming.articleservice.exception;

public class NotFoundException extends RuntimeException {

    @Override
    public String getMessage() {
        return "Not Found";
    }

}
