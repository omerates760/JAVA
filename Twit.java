package twitter;
import java.util.List;

import twitter4j.Status;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;
public class Twit {

	public static void main(String[] args) throws TwitterException {
		ConfigurationBuilder configBuilder=new ConfigurationBuilder();
		configBuilder.setDebugEnabled(true)
		.setOAuthConsumerKey("HvkcJqeYP3wYYpWGYTdDIVFMQ")
		.setOAuthConsumerSecret("UhP5XVwMvB1tcLIE8XI6UIxowZg9eczB96nju2zirvpZWzTU2F").
		setOAuthAccessToken("902954786940747777-cAlIheGmp696xOPdcvrKdODCrD37Ih7").
		setOAuthAccessTokenSecret("wgf3LmbcZHdhUSPVP9corhTvCOP46jqEoRQ7i889NNayV");
		
		TwitterFactory tf=new TwitterFactory(configBuilder.build());
		twitter4j.Twitter twit=tf.getInstance();
		List<Status> durum=twit.getHomeTimeline();
		for(Status s:durum)
			
		{
			//if(s.getUser().getName()=="ShiftDelete.Net")
			{
			System.out.println("GÖNDEREN : "+s.getUser().getName().toLowerCase());
			System.out.println("PAYLAÞILAN : "+s.getText());
			System.out.println("RETWEET SAYISI : "+s.getRetweetCount());		
			}
			//else
			{
				System.out.println("Bulunamadý");
			}
		}
	}

}
