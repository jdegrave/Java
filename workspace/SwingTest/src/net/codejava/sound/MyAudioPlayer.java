package net.codejava.sound;
 
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
 
/**
 * This is an example program that demonstrates how to play back an audio file
 * using the Clip in Java Sound API.
 * @author http://www.codejava.net/coding/how-to-play-back-audio-in-java-with-examples
 * 
 * I don't understand everything in this code, but it works!  Also I modified this from the example on the Internet
 * so that it is called from the main SwingTestWindow.java class. The original example had all code in one file.
 * Plus I added additional comments. From what I can tell, these are the main steps:
 * 
 * Requirements:  It must be a .WAV, .AIFF, .AIFC, .AU, or .SND. The Java Sound API DOES NOT SUPPORT MP3!
 * - Pass the path of the audio file
 * - Create an AudioInputSteam from a sound file 
 * - Get the audio file format and create a DataLine.Info object
 * - Get the clip
 * - Open the AudioInputStream and start playing the clip
 * - Close and release the required resources
 * 
 * My add to the example is that it returns control to SwingTestWindow.java so it can close the frames and exist the program.
 *
 */



public class MyAudioPlayer implements LineListener {
     
	/**
     * this flag indicates whether the playback completes or not. You have to check for playback end or it will switch back to the other thread.
     * I understand this to meant the calling method. 
     */
    boolean playCompleted;
    
    
    
    public void play(String audioFilePath) {
        
    	//This gets the audio file path. In this case it's from the main function. 
    	
    	File audioFile = new File(audioFilePath);
 
        try {
        	
        	//Creat an audio stream for the given audio file
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
 
            //Acquire the audio format and create a DataLine.Info object
            AudioFormat format = audioStream.getFormat();
 
            DataLine.Info info = new DataLine.Info(Clip.class, format);
 
            Clip audioClip = (Clip) AudioSystem.getLine(info);
 
           audioClip.addLineListener(this);
 
            audioClip.open(audioStream);
             
            audioClip.start();
            
            while (!playCompleted) {
                // wait for the playback completes
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
             
                   
                     
            audioClip.close();
             
        } catch (UnsupportedAudioFileException ex) {
            System.out.println("The specified audio file is not supported.");
            ex.printStackTrace();
        } catch (LineUnavailableException ex) {
            System.out.println("Audio line for playing back is unavailable.");
            ex.printStackTrace();
        } catch (IOException ex) {
            System.out.println("Error playing the audio file.");
            ex.printStackTrace();
        }
         
    }

    /**
     * Listens to the START and STOP events of the audio line.
     */
   @Override
    public void update(LineEvent event) {
        LineEvent.Type type = event.getType();
                  
       if (type == LineEvent.Type.STOP) {
            playCompleted = true;
            
        }
 
    }
//This creates the audio player object that plays the sound files. I changed the arguments to accept the string from the SwingTestWindow.java object   
    public static void main(String audioFilePath) {
    	
        MyAudioPlayer player = new MyAudioPlayer();
        player.play(audioFilePath);
    }
}