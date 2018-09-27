import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import org.json.JSONArray;

public class Translator {

    public  String translate(String langFrom ,String langTo, String words) throws Exception
    {
try{
        Translator http = new Translator();
        String word = http.callUrlAndParseResult(langFrom, langTo, words);
        System.out.print(word);
        return word;}
        catch(Exception E){
    return words;
    }
    }

    private String callUrlAndParseResult(String langFrom, String langTo,
                                         String word) throws Exception
    {
try {
    String url = "https://translate.googleapis.com/translate_a/single?" +
            "client=gtx&" +
            "sl=" + langFrom +
            "&tl=" + langTo +
            "&dt=t&q=" + URLEncoder.encode(word, "UTF-8");

    URL obj = new URL(url);
    HttpURLConnection con = (HttpURLConnection) obj.openConnection();
    con.setRequestProperty("User-Agent", "Mozilla/5.0");

    BufferedReader in = new BufferedReader(
            new InputStreamReader(con.getInputStream()));
    String inputLine;
    StringBuffer response = new StringBuffer();

    while ((inputLine = in.readLine()) != null) {
        response.append(inputLine);
    }
    in.close();

    return parseResult(response.toString());
}
catch(Exception E){
    return word;
}
    }

    private String parseResult(String inputJson) throws Exception
    {


        JSONArray jsonArray = new JSONArray(inputJson);
        JSONArray jsonArray2 = (JSONArray) jsonArray.get(0);
        JSONArray jsonArray3 = (JSONArray) jsonArray2.get(0);

        return jsonArray3.get(0).toString();
    }
}