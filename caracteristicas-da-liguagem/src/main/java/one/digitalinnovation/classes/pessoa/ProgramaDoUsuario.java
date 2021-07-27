package one.digitalinnovation.classes.pessoa;

import one.digitalinnovation.classes.usuario.SuperUsuario;

public class ProgramaDoUsuario {

    public static void main(String[] args) {
        final var clodoaldo = new SuperUsuario("clodoaldo", "1234%$#@");

        clodoaldo.getLogin();

        //clodoaldo.getSenha();    //ERRO

        //String nomeDoCliente = clodoaldo.nome; //ERRO
    }

}