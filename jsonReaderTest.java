import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class jsonReaderTest {

    @SuppressWarnings("unchecked")
    public static void readJson() {

        // create parser object to read file
        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader("account_details.json")) {

            // read JSON file
            Object obj = jsonParser.parse(reader);

            JSONArray accountList = (JSONArray) obj;
            System.out.println(accountList);

            // iterate over account array
            accountList.forEach( acc -> parseAccountObject( (JSONObject) acc) );

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}
