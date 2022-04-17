import org.json.simple.JSONObject;

import java.io.IOException;
import java.io.Reader;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

public class jsonReader {

    // method to read from .json file
    public static void readJson() {

        try {

            // create a reader
            Reader reader = Files.newBufferedReader(Paths.get("account_details.json"));

            // create parser
            JSONObject parser = (JSONObject) Jsoner.deserialize(reader);

            // read account details
            BigDecimal accountNb = (BigDecimal) parser.get("accountNb");
            String firstName = (String) parser.get("firstName");
            String lastName = (String) parser.get("lastName");
            String username = (String) parser.get("username");
            String password = (String) parser.get("password");
            BigDecimal balance = (BigDecimal) parser.get("balance");
            String dateCreated = (String) parser.get("dateCreated");

            // read accountType
            Map<Object, Object> accountType = (Map<Object, Object>) parser.get("accountType");
            accountType.forEach((key, value) -> System.out.println(key + ":" + value));

            // close reader
            reader.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
