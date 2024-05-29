package com.perscholas.java_basics.Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.*;

public class HackerRank {
    public static void main(String[] args) {
        String[] loggedMoves = {"x/", "y/", "../", "z/", "./"};

        List<String> varName = new ArrayList<String>();
        for (String move : loggedMoves) {
            varName.add(move);
        }

        int minSteps = 0;

        for (int i = 0; i < varName.size(); i++) {
            //System.out.println("\n" + loggedMoves[i]);
            if (varName.get(i) == "../")

                minSteps--;
            else if (varName.get(i) != "./")
                minSteps++;

        }
        System.out.println(minSteps);
    }
}