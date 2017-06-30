//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2017.06.30 às 03:06:39 PM BRT 
//


package localhost._8080.somaws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="op1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="op2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "op1",
    "op2"
})
@XmlRootElement(name = "getSomaRequest")
public class GetSomaRequest {

    protected int op1;
    protected int op2;

    /**
     * Obtém o valor da propriedade op1.
     * 
     */
    public int getOp1() {
        return op1;
    }

    /**
     * Define o valor da propriedade op1.
     * 
     */
    public void setOp1(int value) {
        this.op1 = value;
    }

    /**
     * Obtém o valor da propriedade op2.
     * 
     */
    public int getOp2() {
        return op2;
    }

    /**
     * Define o valor da propriedade op2.
     * 
     */
    public void setOp2(int value) {
        this.op2 = value;
    }

}
