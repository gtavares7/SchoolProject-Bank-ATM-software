import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

import java.io.FileWriter;
import java.io.IOException;

public class jsonWriterTest {

    public static void writeJson() {

        // first account
        JSONObject accountDetails = new JSONObject();
        accountDetails.put("accountNb", 1);
        accountDetails.put("firstName", "");
        accountDetails.put("lastName", "");
        accountDetails.put("password", "");
        accountDetails.put("balance", 1);
        accountDetails.put("dateCreated", "");

        JSONObject accountObject = new JSONObject();
        accountObject.put("account", accountDetails);

        // second account
        JSONObject accountDetails2 = new JSONObject();
        accountDetails2.put("accountNb", 1);
        accountDetails2.put("firstName", "");
        accountDetails2.put("lastName", "");
        accountDetails2.put("password", "");
        accountDetails2.put("balance", 1);
        accountDetails2.put("dateCreated", "");

        JSONObject accountObject2 = new JSONObject();
        accountObject2.put("account", accountDetails2);

        // third account
        JSONObject accountDetails3 = new JSONObject();
        accountDetails3.put("accountNb", 1);
        accountDetails3.put("firstName", "");
        accountDetails3.put("lastName", "");
        accountDetails3.put("password", "");
        accountDetails3.put("balance", 1);
        accountDetails3.put("dateCreated", "");

        JSONObject accountObject3 = new JSONObject();
        accountObject3.put("account", accountDetails3);

        // add accounts to list
        JSONArray accountList = new JSONArray();
        accountList.add(accountObject);
        accountList.add(accountObject2);
        accountList.add(accountObject3);

        // write JSON file
        try (FileWriter file = new FileWriter("account_details.json")) {
            file.write(accountList.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
