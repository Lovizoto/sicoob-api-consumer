/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.br.com.lovizoto.integracaosicoob.exception;

/**
 *
 * @author michel
 */
public class SicoobApiException extends RuntimeException {

    public SicoobApiException(String message) {
        super(message);
    }

    public SicoobApiException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
