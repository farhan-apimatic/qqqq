/*
 * CodeGenAndTransformerAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package io.apimatic.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Message 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 4865700397379462342L;
    private String message;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Message")
    public String getMessage ( ) { 
        return this.message;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Message")
    public void setMessage (String value) { 
        this.message = value;
        notifyObservers(this.message);
    }
 
}
 