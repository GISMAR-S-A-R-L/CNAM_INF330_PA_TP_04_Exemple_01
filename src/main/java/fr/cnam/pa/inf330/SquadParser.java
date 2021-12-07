package fr.cnam.pa.inf330;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.cnam.pa.inf330.beans.Squad;


import java.io.*;

public class SquadParser {

    public Squad parse(InputStream jsonStream) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Squad squad = null;
            squad = objectMapper.readValue(jsonStream, Squad.class);
        return squad;
    }

    public Squad parse(File jsonFile) throws IOException {
        return parse(new FileInputStream(jsonFile));
    }

    public Squad parse(String jsonFileName) throws IOException {
        return parse(new File(jsonFileName));
    }
}
