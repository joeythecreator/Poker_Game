import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class Assignment6_1 {

	public static void main(String[] args) {
		String formatting = "%-10s %-22s %-18s %-25s %-12s %-12s \n";

		System.out.printf(formatting, "ID", "Player Name", "Hand", "Hand Description", "Win Amount", "Player Bank");
		try (DataInputStream input = new DataInputStream(new FileInputStream("files/gamedata.dat"))) {
			while (true) {
				String id = input.readUTF();
				String name = input.readUTF();
				String hand = input.readUTF();
				String handDescr = input.readUTF();
				int win = input.readInt();
				int bank = input.readInt();

				System.out.printf(formatting, id, name, hand, handDescr, win, bank);
			}

		} catch (EOFException ex) {
			System.out.println("\nAll data has been read");
		} catch (IOException ex) {
			System.out.println("File not found");
		}

	}

}
