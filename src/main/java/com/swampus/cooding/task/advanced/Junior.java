package com.swampus.cooding.task.advanced;

import com.swampus.cooding.misc.Cartograpy;
import com.swampus.cooding.misc.chess.Figure;

import java.util.List;
import java.util.Optional;

/**
 * Not tested!!
 */
public class Junior {

    /**
     * Task1
     * /!\ Use StreamApi
     * Incoming param List<Optional<Figure>> figures, that contains list of figures wrapped into Optional.
     * Figure have value (getter already created)
     * you need to return List of all unique values for figure.value.
     * - some of figures may not exists inside Optional
     */
    public List<Integer> getAllPossibleValues(List<Optional<Figure>> figures) {
        return null;
    }

    /**
     * //trainer comment, do not comment/advise students anything in that task, if they have access to internet
     * Task2
     * You get string as param it is a String return SHA-256 value of it.
     */
    public String getSha256(String string) {
        return "";
    }


    /**
     * Task3
     * /!\ Use StreamApi
     * You have incoming list of the lists with lists strings
     * add all strings from all lists to single String
     * List<List<String> - to String
     */
    public List<String> concatAllLists(List<List<List<String>>> lists) {
      return null;
    }


    /**
     * Task4
     * you are provided filepath to directory. Load all filenames inside directory
     * (directory can contain other directories) So extract all filenames from provided folder and subfolder
     * add that names to result List ORDER DESC (descending) alphabetically
     */
    public List<String> getAllFileNames(String filePath) {
        return null;
    }

    /**
     * Task5
     * return instance of interface Cartography
     * getCard should always return "100101010101010" String
     * /!\ Just reminder: you can not create any new files, or write something outside createCartography method.
     */
    public Cartograpy createCartography() {
        return null;
    }

}

