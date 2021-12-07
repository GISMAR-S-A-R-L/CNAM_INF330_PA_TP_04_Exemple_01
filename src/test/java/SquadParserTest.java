import fr.cnam.pa.inf330.SquadParser;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SquadParserTest {

    @DisplayName("On tester l'exception levée quand le fichier n'existe pas ")
    @Test
    void checkIfFileDoesNotExist(){
        String filename = "dummyFilename.json";
        SquadParser squadParser = new SquadParser();
        IOException thrown = assertThrows(
                IOException.class,
                () -> squadParser.parse(filename));
        assertTrue(thrown.getMessage().contains(filename));
    }
}
