package cosmin.learnspring.SpringLearningClinic.model;

import java.io.Serializable;



//The Java Serializable interface (java.io.Serializable is a marker interface your classes must implement
//if they are to be serialized and deserialized. Java object serialization (writing) is done with the ObjectOutputStream
//        and deserialization (reading) is done with the ObjectInputStream.

public class BaseEntity implements Serializable {

    private Long id;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
