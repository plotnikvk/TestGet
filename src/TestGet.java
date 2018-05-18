import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class TestGet {
public  static void main(String[] args) {
                try {
                        CloseableHttpClient httpClient = HttpClients.createDefault();
                        HttpGet httpGet = new HttpGet("http://speller.yandex.net/services/spellservice/checkText?" +
                                "text=как+правельно+песать+слова");
                        CloseableHttpResponse resp1;
                        resp1 = httpClient.execute(httpGet);

                        System.out.println(EntityUtils.toString(resp1.getEntity()));

                        resp1.close();

                } catch (ClientProtocolException e){
                        e.printStackTrace();
                } catch (IOException e) {
                        e.printStackTrace();
                }
        }
}
