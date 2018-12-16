package net.sf.vgrs.gamesys.utils;

import net.sf.vgrs.gamesys.domain.Article;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class TestConstants {
    public static final String TEST_ARTICLES_URL_JSON_RESPONSE = "{ \"status\":\"ok\", \"totalResults\":10, \"articles\":[  { \"source\":{ \"id\":\"bbc-news\", \"name\":\"BBC News\" }, \"author\":\"BBC News\", \"title\":\"US school shooting thwarted after phone tip\", \"description\":\"\\\"Someone knew something, and they said something,\\\" an official says about a tipster who alerted police.\", \"url\":\"http://www.bbc.co.uk/news/world-us-canada-46561524\", \"urlToImage\":\"https://ichef.bbci.co.uk/news/1024/branded_news/CE79/production/_104775825_capsdf33ture.jpg\", \"publishedAt\":\"2018-12-14T17:04:49Z\", \"content\":\"Image copyright CBS Indiana police say a phone tip has helped prevent an armed 14-year-old from committing a school shooting. As the student was en route to the Dennis Intermediate School on Thursday, the Richmond school district received a warning call and i… [+2882 chars]\" }, { \"source\":{ \"id\":\"bbc-news\", \"name\":\"BBC News\" }, \"author\":\"BBC News\", \"title\":\"US student stabbed to death in Dutch city\", \"description\":\"A young American who came to Europe after a family tragedy is stabbed to death in her student complex.\", \"url\":\"http://www.bbc.co.uk/news/world-europe-46571782\", \"urlToImage\":\"https://ichef.bbci.co.uk/news/1024/branded_news/11E4/production/_104808540_sarah.jpg\", \"publishedAt\":\"2018-12-14T15:59:38Z\", \"content\":\"Image copyright Sarah Papenheim Facebook page Image caption Tributes have been posted to Ms Papenheim's Facebook page A young woman from the US who moved to the Netherlands to study after a family tragedy has been stabbed to death in her student complex in Ro… [+1588 chars]\" }] }";
    public static final String TEST_ARTICLES_URL_XML_RESPONSE = "<response><articles><article><author>BBC News</author><content>Image copyright Fox News A decorated US special forces soldier has been charged with an Afghan man's murder, which he reportedly admitted while applying for a job with the CIA. US Army Green Beret Major Matthew Golsteyn allegedly shot someone he described as … [+2382 chars]</content><description>The Green Beret allegedly shot someone he described as a Taliban bomb-maker in Afghanistan in 2010.</description><publishedAt>2018-12-14T17:20:43Z</publishedAt><source><id>bbc-news</id><name>BBC News</name></source><title>US soldier 'admits murder in job interview'</title><url>http://www.bbc.co.uk/news/world-us-canada-46573452</url><urlToImage>https://ichef.bbci.co.uk/news/1024/branded_news/0EA7/production/_104815730_mfox.jpg</urlToImage></article><article><author>BBC News</author><content>Image copyright Reuters A major stadium in Los Angeles has confirmed that it uses facial recognition tech during sport and music events, to spot known troublemakers. The Rose Bowl told news site Gizmodo that it used the tech \"inside and outside\" the stadium g… [+2168 chars]</content><description>A stadium in LA confirms it uses facial recognition technology at pop concerts.</description><publishedAt>2018-12-14T16:28:35Z</publishedAt><source><id>bbc-news</id><name>BBC News</name></source><title>Were Taylor Swift fans tracked at her gig?</title><url>http://www.bbc.co.uk/news/technology-46567125</url><urlToImage>https://ichef.bbci.co.uk/news/1024/branded_news/15CC0/production/_104808298_mediaitem104802804.jpg</urlToImage></article></articles><status>ok</status><totalResults>10</totalResults></response>";

    public static final List ARTICLE_LIST_1 = new ArrayList(Arrays.asList(
            new Article("example1.com", "Test", "Test", new Date(), "Test", "Test"),
            new Article("example2.com", "Test", "Test", new Date(), "Test", "Test")
    ));

    public static final List ARTICLE_LIST_2 = new ArrayList(Arrays.asList(
            new Article("example1.com", "Test", "Test", new Date(), "Test", "Test"),
            new Article("example2.com", "Test", "Test", new Date(), "Test", "Test"),
            new Article("example3.com", "Test", "Test", new Date(), "Test", "Test")
    ));


}
