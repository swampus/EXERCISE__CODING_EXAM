package com.swampus.cooding.begginer;

import java.util.Map;
import java.util.Set;

public class Developer {
    private Map<String, Integer> holder;
    private Set<Integer> numbers;

    /**
     * Task1
     * you given String array arrayOfStrings as parameter there are several elements
     * you need modify that elements and make all Strings CAPS UP (WITH BIGGER LETTERS)
     */
    public String[] modifyArray(String[] arrayOfStrings) {
        return null;
    }

    /**
     * Task2
     * you have field "holder" it is a Map. it contains keys and values
     * you need to find how many Values that are equals to 5 are in holder
     * (there are several values, that can be same, find how many values are equals to 5)
     */
    public int howManyFivesInValues() {
        return 0;
    }

    /**
     * Task3
     * you have incoming param array that are Array of String
     * you need return first half of that array rounded UP
     * ["1","2","3","4"] return ["1","2"]
     * ["1","2","3" return ["1","2"]
     */
    public String[] getFirstHalfOfArray(String[] array) {
        return null;
    }

    /**
     * Task4
     * you have 3 incomming params: string1,string2,string3 that are strings
     * you need to return number of longest string. (How many characters are in longest string)
     * Warning string may be null
     * null value have length 0
     */
    public int getLongestStringSizeFromParams(String string1, String string2, String string3) {
        return 0;
    }

    /**
     * Task5
     * you have defined field "numbers" that is set of Integers
     * you have incomming param setTwo, that are set of Strings, all Strings inside represents number
     * you need to add all numbers from "setTwo" to "numbers" that are not in setTwo
     * note that numbers in setTwo saved as String so you need to convert prob.
     */
    public void getSetOnePlusUniqueNumbersFromSetTwo(Set<String> setTwo) {

    }


    public Map<String, Integer> getHolder() {
        return holder;
    }

    public void setHolder(Map<String, Integer> holder) {
        this.holder = holder;
    }

    public Set<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(Set<Integer> numbers) {
        this.numbers = numbers;
    }
}
