package com.swampus.cooding.begginer;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Senior {

    private Map<String, String> dictionary;
    private List<Integer> listOfNum;
    private Set<String> phones;

    /**
     * Task1
     * You have defined field dictionary. It contains keys and values
     * key - is a word, value - it is a translation
     * you have incoming parameter incommingSpeach that is string, that contains different words
     * you need translate all the words, that is possible. (Single word can be translated using dictionary)
     * (like key is word and value is translation)
     * so replace all words in incommingSpeach using dictionary and return updated result (string)
     * Splitter between words are " " (so if there is space, we can think it is a new word)
     * "aaa bb c" - 3 words, 1. aaa 2. bb  3. c
     */
    public String translateSpeech(String incommingSpeach) {
        return null;
    }

    /**
     * Task2
     * You have defined field listOfNum it is a list with integer numbers
     * remove from that list all numbers that are not prime
     * prime number - number that can be divided only by 1 and itself
     * 0, 1 - is not prime numbers
     */
    public List<Integer> filterPrimeNumbers() {
        return null;
    }


    /**
     * Task3
     * You have defined field phones it is a Set with Strings that is phoneNumbers
     * you have incomming param that are phone number, you need return true if such phone is in Set (phones)
     * and return false if not. BUT
     * But incomming phone can have + or country code 371 or both ignore spaces
     * +3712345, 37112345, 12345, 12 345 - it is a same phone, but different formats
     */
    public Boolean containsPhone(String phone) {
        return null;
    }

    /**
     * Task4
     * you have incomming param listOfLists it is a List that contains a list of strings
     * there a several string inside each list
     * You need to concatenate (Sum) all Strings of all lists to Single String
     */
    public String sumAllStringFromAllLists(List<List<String>> listOfLists) {
        return null;
    }

    /**
     * Task5
     * you have provided int[] array "ticket" that contains numbers from 0 to 9 (each element is a number)
     * you need to check is there five one`s in a row 1,1,1,1,1 or not.
     * like 0 1 2 3 4 5 6 = false 0 0 0 1 1 1 1 0 1 9 9 - false, 0 0 1 1 1 1 1 9 8 7 - true
     */
    public boolean isLuckyNumber(int[] ticket) {
        return false;
    }


    public Map<String, String> getDictionary() {
        return dictionary;
    }

    public void setDictionary(Map<String, String> dictionary) {
        this.dictionary = dictionary;
    }

    public List<Integer> getListOfNum() {
        return listOfNum;
    }

    public void setListOfNum(List<Integer> listOfNum) {
        this.listOfNum = listOfNum;
    }

    public Set<String> getPhones() {
        return phones;
    }

    public void setPhones(Set<String> phones) {
        this.phones = phones;
    }
}
