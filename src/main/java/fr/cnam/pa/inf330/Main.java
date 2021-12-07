package fr.cnam.pa.inf330;

import fr.cnam.pa.inf330.beans.Squad;

import java.io.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        if(args.length == 0)
        {
            System.out.println("Usage : java program filename");
            System.exit(0);
        }
        String jsonFileName = args[0];
        try {
            InputStream inputStream = new FileInputStream(new File(args[0]));
            SquadParser squadParser = new SquadParser();
            Squad squad = squadParser.parse(inputStream);
            System.out.println("C'est une squad vide? " + squad.isEmptyMemberSqaud());

            // On check les données de la squad
            SquadControler squadControler = new SquadControler(squad);
            List<String> nomDeSquadDuppliques = squadControler.checkDuplicateMemberNames();
            if (nomDeSquadDuppliques.size() > 0) {
                System.out.println(nomDeSquadDuppliques);
            }

        } catch (IOException e) {
            System.out.println(String.format("Erreur lors de la lecture du fichier %s : %",jsonFileName,e.getMessage()));
            System.exit(0);
        }
    }
}
