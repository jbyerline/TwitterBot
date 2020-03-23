import twitter4j.*;
import java.io.*;


public class TwitterAutoBot {

    public static void main(String[] args) {

        String statusMessage = "How about dis berry";
        File img = new File("/Users/jacobbyerline/Desktop/straw.png");

        Twitter twitter = new TwitterFactory().getInstance();

        StatusUpdate status = new StatusUpdate(statusMessage);
        status.setMedia(img); // set the image to be uploaded here.
        try{
            twitter.updateStatus(status);
        } catch (TwitterException e){
            System.out.println("OOPS, we found an error...");
        }

    }

}