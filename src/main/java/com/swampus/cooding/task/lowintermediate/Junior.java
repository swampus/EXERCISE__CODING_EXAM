package com.swampus.cooding.task.lowintermediate;

import com.swampus.cooding.misc.DataQHolder;
import com.swampus.cooding.misc.Operation;
import com.swampus.cooding.misc.SwNode;
import com.swampus.cooding.misc.gemstones.Emerald;
import com.swampus.cooding.misc.gemstones.Ruby;

import java.util.Map;

public class Junior {

    private SwNode localNode;

    public SwNode getLocalNode() {
        return localNode;
    }

    public void setLocalNode(SwNode localNode) {
        this.localNode = localNode;
    }

    /**
     * Task2
     * Create empty instance of Class DataQHolder and return
     */
    public DataQHolder createInstance() {
        return null;
    }

    /**
     * Task2
     * Create instance of class Operation with id = id (from provided value) and amount = amount from provided value
     * ( use constructor )
     * and return
     * (all for construct class you have as params)
     */
    public Operation createClassOperation(String id, Long amount) {
        return null;
    }

    /**
     * Task3
     * create instance of class Emerald. After assign ID for it (you already have setter) id should be "EM_1"
     * and return
     */
    public Emerald createEmelerald() {
        return null;
    }

    /**
     * Task4
     * Create map<String, Ruby> and insert key/value to it, Key is provided as param,
     * and for value you need to create instance of Class Ruby and assign id to it. Id is provided it is rubyId
     * and class already have setter
     * and return map after insert key/value
     */
    public Map<String, Ruby> createMap(String key, String rubyId) {
        return null;
    }

    /**
     * Task5
     * you have defined field SwNode localNode
     * you have to create new Class SwNode with ID="2" and root="false" (use constructor)
     * and then set to field SwNode of field SwNode that class (Class SwNode have field = reference to SwNode)
     * so for defined field localNode setSwNode (that swNode you need to set is a new created class (desc prev))
     */
    public void createAndReferecen() {

    }

}
