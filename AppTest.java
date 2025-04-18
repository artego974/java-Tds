/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package estoquecomteste;

import java.util.ArrayList;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    private Estoque est;
    
    @BeforeEach
    public void criar(){
        est = new Estoque();
    }
    
    @Test
    public void testeAdicionar(){
    est.addProd("uva", 6);
    assertEquals("uva",est.prodMoreEst());
        
        
    }
    @Test
    public void testeRemover(){
    est.addProd("uva", 6);
    est.rmProd("uva", 1);
    assertEquals("uva",est.prodMoreEst());
    }
    
    @Test
    public void testeConferirQuantidade(){
    est.addProd("uva", 6);
    est.consQntd("uva");
    assertEquals(6,est.consQntd("uva"));
    }
    @Test
    public void testeConferirQualOMaior(){
    est.addProd("uva", 6);
    est.addProd("banana", 8);
    assertEquals("banana",est.prodMoreEst());
    }    
    
    @Test
    public void testeLimpar(){
    ArrayList<Produto> vazia = new ArrayList<>();
    est.addProd("uva", 6);
    est.limparEst();
    assertEquals(vazia,est.limparEst());
    } 
    
    @Test
    public void testeReabastecerEst(){
    est.addProd("uva", 6);
    est.rebastEst(2);
    assertEquals(8,est.consQntd("uva"));
    } 
    
   
     @Test
    public void testeListarProdutos(){
    est.addProd("uva", 6);
    est.listProd();
    assertEquals("uva",est.prodMoreEst());
    } 
    
    
}
