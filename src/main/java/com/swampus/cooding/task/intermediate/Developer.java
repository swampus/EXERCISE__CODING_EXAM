package com.swampus.cooding.task.intermediate;

import com.swampus.cooding.misc.chess.ChessFigureSide;
import com.swampus.cooding.misc.chess.Figure;
import com.swampus.cooding.misc.gemstones.Gemstone;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class Developer {

    /**
     * Task1
     * you are given incoming param dateString that are string and contains a date in String format
     * like 2016-07-14 09:00:02  || or 2022-09-10 01:00:00
     * you need to create java.util.Date object using that string date.
     * (Date value should be like in string, days, seconds e.t.c)
     */
    public String convertStringToDate(String dateString) {
        return null;
    }

    /**
     * Task2
     * String filePath parameter is provided. You need to access file with with path = filePath (file located at filePath)
     * read all content from that file and return as String
     */
    public String consumeFile(String filePath){
        return null;
    }

    /**
     * Task3
     * import class com.swampus.cooding.misc.gemstones.Ruby
     * import class com.swampus.cooding.misc.gemstones.BlueSapphire
     * return set containing 732 unique BlueSapphire and unique 116 Ruby
     * (each Gemstone of same type should contain unique id: String)
     */
    public Set<Gemstone> createSetWithGemstones(){
        return null;
    }


    /**
     * Task4
     * List with Gemstone objects is provided. But there are same stones
     * same stones it are a stones with same Class (type) and id   (id+type)
     * you need filter out same stones and return. ( From provided list are removed all same stones )
     */
    public List<Gemstone> filterOutSameStones(List<Gemstone> agregatedOffersFromProviders){
        return null;
    }


    /**
     * Task5
     * incomming param chessBoard - is a chess board a Map with key - chess board Field and value - Figure
     * Figure have method to define side (Black or White) it is enum
     * Figure have method to get its value
     * task is to evaluate what side have advantage (more points, that are sum of all figures of that side)
     * if white Return enum value White if Black return enum value Black (class ChessFigureSide is enum)
     * if white and black are equals return null (value null)
     * wrap result (that method return) with Optional (option like above return value)
     */
    public Optional<ChessFigureSide> evaluateChessBoard(Map<String, Figure> chessBoard){
        return null;
    }
}
