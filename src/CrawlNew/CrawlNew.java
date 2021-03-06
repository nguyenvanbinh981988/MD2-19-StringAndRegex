package CrawlNew;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlNew {
    public static void main(String[] args) throws IOException {
        try{
            URL url = new URL("https://dantri.com.vn/the-gioi.htm");
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            scanner.close();
            content=content.replaceAll("\\n+","");

//         System.out.println(content);
            Pattern p = Pattern.compile("<h3 class=\"article-title\"> <a href=\"/(.*?)\">(.*?)</a>");
            Matcher m = p.matcher(content);
            while (m.find()){
                System.out.println(m.group(2));
            }

        } catch (MalformedURLException e){
            e.printStackTrace();
        } catch (UnsupportedEncodingException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
