import org.json.simple.JSONObject;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class jsonWriter {

    // method to read/write to .json file
    public static void writeJson() {

        try {

            // create a writer
            BufferedWriter writer = Files.newBufferedWriter(Paths.get("account_details.json"));

            // create customer object
            JSONObject customer = new JSONObject();
            customer.put("accountNb", 1);
            customer.put("firstName", "");
            customer.put("lastName", "");
            customer.put("username", "");
            customer.put("password", "");
            customer.put("balance", 1);
            customer.put("dateCreated", "");

            // create accountType object
            JSONObject accountType = new JSONObject();
            accountType.put("", "");

            // add accountType to customer
            customer.put("accountType", accountType);

            // write JSON to file
            Jsoner.serialize(customer, writer);

            // close the writer
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
