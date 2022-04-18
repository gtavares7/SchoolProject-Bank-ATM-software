import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

import java.io.FileWriter;
import java.io.IOException;

public class jsonWriterTest {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        // create first account object
        JSONObject accountDetails = new JSONObject();
        // accountDetails.put("accountNb", 256834);
        accountDetails.put("firstName", "Gabriel");
        accountDetails.put("lastName", "Tavares");
        accountDetails.put("username", "Tavares7");
        accountDetails.put("password", "abcd1234");
        accountDetails.put("balance", 1000);
        accountDetails.put("dateCreated", "17-04-2022");

        // create accountType object within accountDetails
        // JSONObject accountType = new JSONObject();
        // accountType.put("Business", "");
        // add accountType to customer
        // accountDetails.put("accountType", accountType);

        JSONObject accountNbObject = new JSONObject();
        accountNbObject.put("accountNb", accountDetails);

        JSONObject accountObject = new JSONObject();
        accountObject.put("account", accountNbObject);

        // create second account object
        JSONObject accountDetails2 = new JSONObject();
        // accountDetails2.put("accountNb", 1);
        accountDetails2.put("firstName", "Eduardo");
        accountDetails2.put("lastName", "Mazzonna");
        accountDetails2.put("username", "eddy");
        accountDetails2.put("password", "abcd1234");
        accountDetails2.put("balance", 1000);
        accountDetails2.put("dateCreated", "17-04-2022");

        JSONObject accountNbObject2 = new JSONObject();
        accountNbObject.put("accountNb", accountDetails2);

        JSONObject accountObject2 = new JSONObject();
        accountObject.put("account", accountNbObject2);

        // JSONObject accountObject2 = new JSONObject();
        // accountObject2.put("account", accountDetails2);

        // create third account object
        JSONObject accountDetails3 = new JSONObject();
        // accountDetails3.put("accountNb", 1);
        accountDetails3.put("firstName", "Vincent");
        accountDetails3.put("lastName", "Mariani");
        accountDetails3.put("username", "vince");
        accountDetails3.put("password", "abcd1234");
        accountDetails3.put("balance", 1000);
        accountDetails3.put("dateCreated", "18-04-2022");

        JSONObject accountNbObject3 = new JSONObject();
        accountNbObject.put("accountNb", accountDetails3);

        JSONObject accountObject3 = new JSONObject();
        accountObject.put("account", accountNbObject3);

        // JSONObject accountObject3 = new JSONObject();
        // accountObject3.put("account", accountDetails3);

        // add accounts to list
        JSONArray accountList = new JSONArray();
        accountList.add(accountObject);
        accountList.add(accountObject2);
        accountList.add(accountObject3);

        // write JSON file
        try (FileWriter file = new FileWriter("account_details_test3.json")) {
            file.write(accountList.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
