package com.company.hw01;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//The class is called Object because I implement a method of this class
public class Object {

    //Оur lecturer said to implement only deep cloning(maybe I something not so understood)
    //If I use this method, the new instance already has a new hash code as well as its fields.
    // Otherwise, they are identical to the old instance
    public static Object deepClone(Object object){
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            ObjectOutputStream outputStrm = new ObjectOutputStream(outputStream);
            outputStrm.writeObject(object);
            ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
            ObjectInputStream objInputStream = new ObjectInputStream(inputStream);
            return (Object) objInputStream.readObject();
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
