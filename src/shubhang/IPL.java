package shubhang;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IPL {

    public static Match createMatch(String [] matchArray){
        Match match = new Match();
        match.setMatchId(Integer.parseInt(matchArray[0]));
        match.setSeason(matchArray[1]);
        match.setCity(matchArray[2]);
        match.setDate(matchArray[3]);
        match.setTeam1(matchArray[4]);
        match.setTeam2(matchArray[5]);
        match.setTossWinner(matchArray[6]);
        match.setTossDecision(matchArray[7]);
        match.setResult(matchArray[8]);
        match.setWinner(matchArray[9]);
        return match;
    }


    public static void main(String[] args) {

        String csvMatchFile = "/Users/akash.sharma/Desktop/iplDataSet/matches.csv";
        BufferedReader br = null;
        List<Match> matches = new ArrayList<Match>();
        String line = "";
        try {

            br = new BufferedReader(new FileReader(csvMatchFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] mat = line.split(",");
                matches.add(createMatch(mat));

            }

            //Query 1: Top 4 teams which elected to field first after winning toss in the year 2016 and
            //2017.
            for(Match m: matches){
                String year = m.getDate().substring(0,4);
                String decision = m.getTossDecision();
                String tossWinner = m.getTossWinner();
                if((year == "2016" || year == "2017") && decision.equalsIgnoreCase("field")){

                }
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}

