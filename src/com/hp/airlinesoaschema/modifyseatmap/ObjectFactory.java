
package com.hp.airlinesoaschema.modifyseatmap;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.hp.airlinesoaschema.modifyseatmap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.hp.airlinesoaschema.modifyseatmap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProcessModifySeatMap }
     * 
     */
    public ProcessModifySeatMap createProcessModifySeatMap() {
        return new ProcessModifySeatMap();
    }

    /**
     * Create an instance of {@link ProcessModifySeatMapResponse }
     * 
     */
    public ProcessModifySeatMapResponse createProcessModifySeatMapResponse() {
        return new ProcessModifySeatMapResponse();
    }

}
