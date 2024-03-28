package com.scaler.productservicedecmwfeve.controlleradvices;

import com.scaler.productservicedecmwfeve.dtos.ArithmeticExceptionDto;
import com.scaler.productservicedecmwfeve.dtos.ExceptionDto;
import com.scaler.productservicedecmwfeve.exceptions.ProductNotExistsException;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlers {
//    @ExceptionHandler(ArithmeticException.class)
//    public ResponseEntity<Void> handlerArithmeticException(){
//        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//    }
    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<ArithmeticExceptionDto> handlerArithmeticException(){
        ArithmeticExceptionDto arithmeticExceptionDto = new ArithmeticExceptionDto();
        arithmeticExceptionDto.setMessage("Something went wrong");
        return new ResponseEntity<>(arithmeticExceptionDto,HttpStatus.INTERNAL_SERVER_ERROR);

    }

    @ExceptionHandler(ProductNotExistsException.class)
    public ResponseEntity<ExceptionDto> handleProductNotExistsException(
            ProductNotExistsException exception
    ){
        ExceptionDto dto = new ExceptionDto();
        dto.setMessage(exception.getMessage());
        return new ResponseEntity<>(dto,HttpStatus.OK);
    }
}