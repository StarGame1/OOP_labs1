
import java.net.http.HttpClient;

public class Main {
    public static void main(String[] args) {
        final NameValuePair[] data = {
                new BasicNameValuePair("phone", "5555555555"),
                new BasicNameValuePair("message", "Hello world"),
                new BasicNameValuePair("key", "textbelt")
        };
        HttpClient httpClient = HttpClients.createMinimal();
        HttpPost httpPost = new HttpPost("https://textbelt.com/text");
        httpPost.setEntity(new UrlEncodedFormEntity(Arrays.asList(data)));
        HttpResponse httpResponse = httpClient.execute(httpPost);

        String responseString = EntityUtils.toString(httpResponse.getEntity());
        JSONObject response = new JSONObject(responseString);

    }
}