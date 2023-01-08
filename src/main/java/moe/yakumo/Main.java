package moe.yakumo;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import org.json.*;
import io.github.cdimascio.dotenv.Dotenv;
import io.github.cdimascio.dotenv.DotenvException;
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Dotenv dotenv = Dotenv.configure().load();
        int bruh = 1429;
        HttpClient flandre = HttpClient.newHttpClient();
        HttpRequest fuck = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("https://animebytes.tv/scrape.php?torrent_pass="+ dotenv.get("GLOWIES")+"&username=" + dotenv.get("SETSUGEN")+"&type=music"))
                .build();


        HttpResponse<String> cirno = flandre.send(fuck, HttpResponse.BodyHandlers.ofString());

        //System.out.println(cirno.body());

        JSONObject yeah = new JSONObject(cirno.body());
        ArrayList<fujiwara> fujiwara = new ArrayList<fujiwara>();
        ArrayList<Sumireko> sumireko = new ArrayList<Sumireko>();
        ArrayList<racism> racism = new ArrayList<racism>();
        ArrayList<kogasa> kogasa = new ArrayList<kogasa>();
        ArrayList<String> st = new ArrayList<String>();
        //ArrayList<>

        System.out.println(yeah.names());
        JSONArray suika = yeah.getJSONArray("Groups");

        for(int i = 0; i < suika.length(); i++){
            //System.out.println(suika.getJSONObject(i).getJSONObject("Artists").keys());
            for(int w = 0; w < suika.getJSONObject(i).getJSONObject("Artists").length(); w++){
                Tenshi tenshi = new Tenshi(null);
                Sumireko sumireko1 = new Sumireko(suika.getJSONObject(i).getJSONObject("Artists").keys().next(), tenshi);
                sumireko.add(w, sumireko1);
            }
            yuyuko yuyuko = new yuyuko(null, null, null, null);
            for(int c = 0; c < suika.getJSONObject(i).getJSONArray("Torrents").length(); c++){
                for(int q = 0; q < suika.getJSONObject(i).getJSONArray("Torrents").getJSONObject(c).getJSONArray("FileList").length(); q++){
                    kogasa kogasa1 = new kogasa(suika.getJSONObject(i).getJSONArray("Torrents").getJSONObject(c).getJSONArray("FileList").getJSONObject(q).getString("filename"), suika.getJSONObject(i).getJSONArray("Torrents").getJSONObject(c).getJSONArray("FileList").getJSONObject(q).getString("size"));
                    kogasa.add(q, kogasa1);
                }
                wakasagihime wakasagihime = new wakasagihime(suika.getJSONObject(i).getJSONArray("Torrents").getJSONObject(c).getJSONObject("EditionData").getString("EditionTitle"), suika.getJSONObject(i).getJSONArray("Torrents").getJSONObject(c).getJSONObject("EditionData").has("ReleaseDate")? suika.getJSONObject(i).getJSONArray("Torrents").getJSONObject(c).getJSONObject("EditionData").getString("ReleaseDate"): null, suika.getJSONObject(i).getJSONArray("Torrents").getJSONObject(c).getJSONObject("EditionData").has("CatalogNumber")? suika.getJSONObject(i).getJSONArray("Torrents").getJSONObject(c).getJSONObject("EditionData").getString("CatalogNumber"): null);
                racism racism1 = new racism(suika.getJSONObject(i).getJSONArray("Torrents").getJSONObject(c).getInt("ID"), wakasagihime, suika.getJSONObject(i).getJSONArray("Torrents").getJSONObject(c).getDouble("RawDownMultiplier"), suika.getJSONObject(i).getJSONArray("Torrents").getJSONObject(c).getDouble("RawUpMultiplier"), suika.getJSONObject(i).getJSONArray("Torrents").getJSONObject(c).getString("Link"), suika.getJSONObject(i).getJSONArray("Torrents").getJSONObject(c).getString("Property"), suika.getJSONObject(i).getJSONArray("Torrents").getJSONObject(c).getInt("Snatched"), suika.getJSONObject(i).getJSONArray("Torrents").getJSONObject(c).getInt("Seeders"), suika.getJSONObject(i).getJSONArray("Torrents").getJSONObject(c).getInt("Leechers"), suika.getJSONObject(i).getJSONArray("Torrents").getJSONObject(c).getInt("Size"), suika.getJSONObject(i).getJSONArray("Torrents").getJSONObject(c).getInt("FileCount"), kogasa, suika.getJSONObject(i).getJSONArray("Torrents").getJSONObject(c).getString("UploadTime"));
                racism.add(c, racism1);

                for(int u = 0; u < suika.getJSONObject(i).getJSONArray("Tags").length(); u++){
                    String str = suika.getJSONObject(i).getJSONArray("Tags").getString(u);
                    st.add(u, str);
                }
            }

            fujiwara fujiwara1 = new fujiwara(suika.getJSONObject(i).getInt("ID"), suika.getJSONObject(i).getString("CategoryName"), suika.getJSONObject(i).getString("FullName"), suika.getJSONObject(i).getString("GroupName"), null, null, sumireko, suika.getJSONObject(i).getString("Year"), suika.getJSONObject(i).getString("Image"), null, suika.getJSONObject(i).getInt("Snatched"), suika.getJSONObject(i).getInt("Comments"), yuyuko, suika.getJSONObject(i).getInt("Votes"), suika.getJSONObject(i).getInt("AvgVote"), suika.getJSONObject(i).isNull("Associations")?null:suika.getJSONObject(i).getString("Associations"), suika.getJSONObject(i).getString("Description"), suika.getJSONObject(i).getString("DescriptionHTML"), suika.getJSONObject(i).getInt("EpCount"), null, suika.getJSONObject(i).getInt("PastWeek"), suika.getJSONObject(i).getBoolean("Incomplete"), suika.getJSONObject(i).getBoolean("Ongoing"), st, racism);
            fujiwara.add(i, fujiwara1);
            //System.out.println(suika.getJSONObject(i).getString("FullName"));
            /*for(int x = 0; x < suika.getJSONObject(i).getJSONArray("Torrents").length(); x++){
                for(int y = 0; y < suika.getJSONObject(i).getJSONArray("Torrents").getJSONObject(x).getJSONArray("FileList").length(); y++ ){
                    //System.out.println(suika.getJSONObject(i).getJSONArray("Torrents").getJSONObject(x).getJSONArray("FileList").getJSONObject(y).getString("filename"));
                }

            }
*/

        }
        reimu reimu = new reimu(yeah.getInt("Matches"), yeah.getInt("Limit"), yeah.getString("Results"), fujiwara);
        System.out.println(reimu.Groups.get(2).Torrents.get(0).Seeders);



        //System.out.println(yeah.getJSONArray("Groups"));

    }
}