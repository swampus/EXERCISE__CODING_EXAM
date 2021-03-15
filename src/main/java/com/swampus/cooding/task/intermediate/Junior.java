package com.swampus.cooding.task.intermediate;

import com.swampus.cooding.misc.DConnectionManager;
import com.swampus.cooding.misc.DataQHolder;
import com.swampus.cooding.misc.LoadCommandThread;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Junior {

    /**
     * Task1
     * return current Date (java utils.date)
     */
    public Date returnCurrentDate() {
        return null;
    }

    /**
     * Task2
     * you have incomming param Class com.swampus.cooding.misc.DConnectionManager instance
     * call method connect() from that class with no params; (method of instance)
     */
    public void callConnect(DConnectionManager dConnectionManager) {

    }

    /**
     * Task3
     * loadCommandThread Object is provided as parameter it is a Thread it is Running (started)
     * you need method waitForTaskToComplete (main thread) to wait for loadCommandThread to FINISH
     * ( thread loadCommandThread should finish before method  waitForTaskToComplete )
     */
    public void waitForTaskToComplete(LoadCommandThread loadCommandThread) {

    }

    /**
     * Task4
     * optHolder Object is provided as parameter it is an Optional that contains DataQHolder type object
     * if DataQHolder object exists inside optional: you need to return getHolder() method result. (getHolder method of DataQHolder)
     * if DataQHolder object not exists inside optional return "D_Default" String;
     */
    public String callMethodIfObjectExists(Optional<DataQHolder> optHolder) {
        return null;
    }


    /**
     * Task5
     * parameter streamOfStrings is provided it is a Stream of Strings, you need convert it to List.
     * return List containing all Strings from Stream
     */
    public List<String> consumeStream(Stream<String> streamOfStrings) {
        return null;
    }

}
