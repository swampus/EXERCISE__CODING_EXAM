package com.swampus.cooding.task.advanced;

import com.swampus.cooding.misc.Operation;
import com.swampus.cooding.misc.SwNode;
import com.swampus.cooding.misc.card.PlayerHand;

import java.util.List;
import java.util.Map;

public class Developer {

    /**
     * Task1
     * you have incoming param swNodes that is list with SwNode objects
     * SwNode object have ID, and reference to another SwNode
     * amount SwNodes in list there will be root (use getter to define is SwNode root or not)
     * you need to filter out (create new list without) all SwNodes that can not be access from root node by references
     * like (( -> have reference ); you have in List A,B,C,D where A is root, A have ref to B, B have ref to C, D have ref to B
     * so you need to get result A,B,C (D is filtered out because there is no reference to D if we go from A that is root )
     * (if node have reference, but still Root node can not access node (by references), that node should be filtered out)
     */
    public List<SwNode> makeGarbageCollection(List<SwNode> swNodes) {
        return null;
    }

    /**
     * Task2
     * /!\ Use StreamApi
     * you have List with Map as param. Each map contains ID as key and Long as value
     * you need to create Object Operation for each unique ID inside all maps. (id goes to field id)
     * in different maps can be same ID. For that ID that are same you need to SUM all values and put to field amount of Operation
     * for example you are given List [ Map1[{"id-1",55},{"id-2",15}], Map2[{"id-1",20},{"id-3",10}]}
     * as result you need return list<Operation> with 3 operations
     * 1. Operation(id="id-1", value=75},
     * 2. Operation(id="id-2", value=15}
     * 2. Operation(id="id-3", value=10}
     * create object operation for each unique ID inside map, summing all values from all maps with same ID and put into field amount
     */
    public List<Operation> calculateAllAmounts(List<Map<String, Long>> data) {
        return null;
    }

    /**
     * Task3
     * incoming Map tables - key is tableId (unique) and list of player hands on that table
     * you need find the winner (best hand) Find best hand and return map where ID will be table ID, and PlayerHand
     * - winning player hand on that table
     * PayerHand have unique ID and list of cards. Card have value and color.
     * (all next to be evaluated as 5 card poker.)
     * https://en.wikipedia.org/wiki/Five-card_draw
     * So table, hands (5 card poker) find winners on each table and collect to map.
     *  Colors: first letter caps from color name
     *  Value first letter or number from card (A, K, Q, J, 10, 9, 8, 7, 6, 5, 4, 3 and 2)
     */
    public Map<String, PlayerHand> getWinnersOnTables(Map<String, List<PlayerHand>> tables){
        return null;
    }




}
