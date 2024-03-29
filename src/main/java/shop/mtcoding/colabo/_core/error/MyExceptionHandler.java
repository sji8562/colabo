package shop.mtcoding.colabo._core.error;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import shop.mtcoding.colabo._core.error.ex.MyApiException;
import shop.mtcoding.colabo._core.error.ex.MyException;
import shop.mtcoding.colabo._core.util.ApiUtil;
import shop.mtcoding.colabo._core.util.Script;

@RestControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(MyException.class)
    public String error(MyException e) {
        return Script.back(e.getMessage());
    }

    @ExceptionHandler(MyApiException.class)
    public ApiUtil<String> error(MyApiException e) {
        return new ApiUtil<>(false, e.getMessage());
    }
}
