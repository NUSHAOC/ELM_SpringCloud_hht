package com.shm.product.exception;

import com.shm.product.enums.ResultEnum;


public class ProductException extends RuntimeException{

    private static final long serialVersionUID = 3364378382582176339L;
    private Integer code;

    public ProductException(Integer code,String message){
        super(message);
        this.code = code;
    }

    public ProductException(ResultEnum resultEnum){
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }



}
