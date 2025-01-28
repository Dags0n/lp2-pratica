package br.ufrn.imd.controller;

public class PistaException extends Exception {
    public PistaException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
