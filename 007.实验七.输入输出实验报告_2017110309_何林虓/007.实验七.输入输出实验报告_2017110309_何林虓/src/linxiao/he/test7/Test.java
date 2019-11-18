package linxiao.he.test7;

import java.io.File;

public class Test {

	public static void main(String[] args){
		File file = new File("D:"+File.separator+"demo.txt");
		LetterFrequencyCounter t = new LetterFrequencyCounter();
		t.loadFile(file);
		t.printFrequencies();

	}
}
