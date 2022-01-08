package org.souza.charles.base;
/**
  * Bootcamp title: Amdocs Java Developer
  * Instructor: Daniel Hatanaka
  * Example adapted by: Charles Fernandes de Souza
  * Date: January 4, 2022
 */
import java.math.BigDecimal;

public class Order {
    /**
     * @author Charles Fernandes de Souza
     * @version 1.0.0
     * @see BigDecimal
     * @since 1.0.0
     */

    private final String code;
    private final BigDecimal totalValue;

    /**
     * Construtor da classe
     * @param code          Código do pedido
     * @param totalValue    Valor total do pedido
     */
    public Order(String code, BigDecimal totalValue){
        this.code = code;
        this.totalValue = totalValue;
    }

    /**
     * Calcula o valor total de acordo com o valor do pedido
     * Se o valor for maior que R$100,00 uma taxa é cobrada
     * @return valor total do pedido com as taxas
     * @throws RuntimeException  Se o pedido for um valor negativo
     */
    public BigDecimal calculateFee() throws RuntimeException{
        if(this.totalValue.signum() < 0){
            throw new RuntimeException("O pedido não pode ter valor negativo.");
        }
        if(this.totalValue.compareTo(new BigDecimal("100.00")) > 100){
            return this.totalValue.multiply(new BigDecimal("0.99"));
        }
        return this.totalValue;
    }

    @Override
    public String toString(){
        return "Order={" +
                "code='" + code + "', " +
                "valorTotal=" + totalValue +
                "}";
    }

}
