package com.swampus.cooding.task.fluent;

import com.swampus.cooding.misc.DConnectionManager;
import com.swampus.cooding.misc.SecretAgent;

public class Junior {

    /**
     * Task1
     * throw IOException without restricting the caller to handle that exception
     */
    public void throwIOException() {

    }

    /**
     * Task2
     * incoming param instance of SecretAgent have private final field String somethingFinal - change it value to "123"
     */
    public void modifyPrivateFinal(SecretAgent secretAgent){

    }

    /**
     * Task3
     * //MODIFY file com.swampus.cooding.misc.aspect.ChangeAbcAspect
     * you have incoming param DConnectionManager dConnectionManager
     * change it`s field abc value to "12345"
     * the current method should remain empty.
     * Create aspect for performing that action. (file -> modify file: com.swampus.cooding.misc.aspect.ChangeAbcAspect)
     */
    public void makeAspect(DConnectionManager dConnectionManager){

    }

}
