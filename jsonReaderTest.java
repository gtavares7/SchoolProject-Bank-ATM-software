import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;

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

    private static void parseAccountObject(JSONObject account) {

        // get account object within list
        JSONObject accountObject = (JSONObject) account.get("account");

        // get account number
        String accountNb = (String) accountObject.get("accountNb");
        System.out.println(accountNb);

        // get account holder first name
        String firstName = (String) accountObject.get("firstName");
        System.out.println(firstName);

        // get account holder last name
        String lastName = (String) accountObject.get("lastName");
        System.out.println(lastName);

        // get account holder username
        String username = (String) accountObject.get("username");
        System.out.println(username);

        // get account holder
        BigDecimal balance = (BigDecimal) accountObject.get("balance");

        // get account dateCreated
        String dateCreated = (String) accountObject.get("dateCreated");
        System.out.println(dateCreated);

        // get account type
        String accountType = (String) accountObject.get("accountType");
        System.out.println(accountType);

    }

}
