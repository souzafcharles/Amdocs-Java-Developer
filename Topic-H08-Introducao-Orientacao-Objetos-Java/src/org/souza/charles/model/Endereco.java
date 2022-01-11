package org.souza.charles.model;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Rodrigo Tavares
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 10, 2022
 */

public class Endereco {
    public enum TipoEndereco {RESIDENCIAL, ENTREGA, TRABALHO}
    public String endereco;
    public String numero;
    public String complemento;
    public String bairro;
    public String cidade;
    public String estado;
    public String cep;
    public TipoEndereco tipo;
}