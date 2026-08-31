import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PizzaTest {

    Pizza pizza;

    @BeforeEach
    public void setUp(){
        //Arrange
         pizza = new Pizza();
         pizza.adicionarIngredientes(2);
    }

    @Test
    public void adicionaIngredientesCorretamente(){
        //Act
        int quantos = 
            pizza.adicionarIngredientes(4);

        //Assert
        assertEquals(6, quantos);
    }
        
    @Test // avisar que que mvai roda risso não é o java
    //public pois quem roda é a Junite
    public void naoAdicionaIngredienteNegativo() {
        //Act
        int quantidade = pizza.adicionarIngredientes(-5);

        //Assert : valor esperado valor testado
        assertEquals (2, quantidade);

    }

    @Test
    public void naoUltrapassaMaximoDeIngredientes(){
        //act
        int quantidade = pizza.adicionarIngredientes(7);

        //Assert
        assertEquals(2, quantidade);
    }

    @Test
    public void calculaOPrecoCorretamente (){
        //Act
        double preco = pizza.valorFinal();

        //Assert
        assertEquals(39, preco,0.01);

    }

}
