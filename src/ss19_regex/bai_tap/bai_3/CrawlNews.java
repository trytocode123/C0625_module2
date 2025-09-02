package ss19_regex.bai_tap.bai_3;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlNews {

    public static void main(String[] args) {

        try {
            URL url = new URL("https://dantri.com.vn");
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream(), "UTF-8"));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            scanner.close();

            content = content.replaceAll("\\n+", " ");


            Pattern p = Pattern.compile("<a[^>]*href=\"([^\"]+\\.htm)\"[^>]*>\\s*([^<]{60,})\\s*</a>");
            Matcher m = p.matcher(content);

            int count = 0;
            while (m.find()) {
                String title = m.group(2);
                System.out.println(title);
                count++;
            }

            if (count == 0) {
                System.out.println("Không tìm thấy tin tức nào phù hợp!");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
