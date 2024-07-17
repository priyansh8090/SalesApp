package Database;

import java.time.Duration;

import org.bson.Document;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import BaseSales.BaseSales;

import org.bson.conversions.Bson;
import static com.mongodb.client.model.Sorts.descending; // Import Sorts.descending method

public class TestData extends BaseSales {

	public String OTP_page() {
		String otp="" ;

		// MongoDB connection string
		String uri = "mongodb://admin:lSyYLchnqBo4AriN@ac-gj7cs03-shard-00-00.oggwrtm.mongodb.net:27017,ac-gj7cs03-shard-00-01.oggwrtm.mongodb.net:27017,ac-gj7cs03-shard-00-02.oggwrtm.mongodb.net:27017/?replicaSet=atlas-59563o-shard-0&ssl=true&authSource=admin";
		String collectionName = "users-otp";

		ServerApi serverApi = ServerApi.builder().version(ServerApiVersion.V1).build();

		MongoClientSettings settings = MongoClientSettings.builder().applyConnectionString(new ConnectionString(uri))
				.serverApi(serverApi).build();

		try (MongoClient mongoClient = MongoClients.create(settings)) {
			MongoDatabase database = mongoClient.getDatabase("SalesApp_TestDB");
			MongoCollection<Document> collection = database.getCollection(collectionName);

			// Query to find the latest OTP for a specific user_id
			Document filter = new Document("userId", "priyansh.jauhari@innoage.in");
			Bson sort = descending("createDate");
			Document otpDocument = collection.find(filter).sort(sort).first();

			if (otpDocument != null) {
				// Extract the OTP from the document
				 otp = otpDocument.getString("otpNumber");
				//System.out.println("OTP: " + otp);

				//return otp;
				//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				// Assuming there's a method or logic to use the OTP with the driver
				// Example: Enter the OTP into

			}
		}
		return otp;

	}
}
