import java.util.ArrayList;
import java.util.Collections;

public class SelectionSorter {

	public static void selectionSort(ArrayList<String> wordList) {
		String o;
		String t;

		for (int h = wordList.size() - 1; h > 0; h--) { // index nums START AND END OF ARRAYS
			for (int i = 0; i < wordList.size(); i++) { // sweep thru
				o = wordList.get(i);
				t = wordList.get(h);
				if (o.compareTo(t) > 0) {
					Collections.swap(wordList, h, i);

				}
			}
		}

	}
}
