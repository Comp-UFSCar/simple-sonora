import org.jfugue.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Canon {

  public final static String   BASS   = "D4q A3q B3q F3q G3q D3q G3q A3q";
  public final static String   HEADER = "T240 KDmaj V0 I48 V1 I48 V2 I48 V3 I42";
  public final static String[] RESTS  = {"Rw Rw", "Rw Rw Rw Rw", "Rw Rw Rw Rw Rw Rw"};
  public final static String   FOOTER = "V0 A5 Rq Rh V1 F6q Rq Rh V2 D6q Rq Rh V3 D4q Rq Rh";

  public static void main(String[] args) {
    if (args.length < 2) {
      System.out.println("Usage: java -cp .;jfugue.jar Canon musicfile MIDIfile");
      System.exit(1);
    }
    try {
      //Read notes from music file
      BufferedReader br = new BufferedReader(new FileReader(args[0]));
      ArrayList lines = new ArrayList();
      String line = null;
      while ((line = br.readLine()) != null) {
        if (!line.startsWith("#")) {
          lines.add(line.trim());
        }
      }
      br.close();

      // Create note pattern with tempo, key, and voice information
      Pattern p = new Pattern(HEADER);

      // Add bass line
      p.add(BASS, 28);

      // Add treble lines
      for (int x = 0; x < 3; x++) {
        // Add "voice" command to identify which voice this is
        p.add("V" + x);
        // Add specific initial rests for this voice
        p.add(RESTS[x]);
        // Stagger the end of the notes to synchronize ending
        int lastLineToAdd = lines.size() - (x * 2);
        for (int y = 0; y < lastLineToAdd; y++) {
          p.add((String)lines.get(y));
        }
      }

      // Add footer notes
      p.add(FOOTER);

      // Save the MIDI file
      System.out.println(p.getMusicString());
      Player player = new Player();
      //player.play(p);
      player.save(p, new File(args[1]));

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
