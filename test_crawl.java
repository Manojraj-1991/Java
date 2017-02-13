import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlDivision;
import com.gargoylesoftware.htmlunit.html.HtmlHeading1;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class test_crawl {

	public static void main(String[] args) throws Exception  {
		try {
			test_crawl.xpath();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void xpath() throws Exception {
	    try (final WebClient webClient = new WebClient()) {
	        final HtmlPage page = webClient.getPage("http://www.example.com/");
	        System.out.println(page.asText());
	        //get list of all divs
	      //  final List<?> divs = page.getByXPath("//div");

	        //get div which has a 'name' attribute of 'John'
	        final HtmlHeading1 div = (HtmlHeading1) page.getByXPath("//h1").get(0);
	     System.out.println(div.asText());   
	    }
	}
}
