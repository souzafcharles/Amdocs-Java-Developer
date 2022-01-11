package org.souza.charles.model;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Rodrigo Tavares
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 10, 2022
 */
public class App {
    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.cep = "000000";

        Cliente cliente = new Cliente();

        try {
            cliente.adicionaEndereco(endereco);
            System.out.println("Endereço adicionado com sucesso.");
        } catch (Exception e) {
            System.err.println("Houve um erro ao adicionar o endereço: " + e.getMessage());
        }
    }
}
