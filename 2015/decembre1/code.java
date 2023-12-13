public class code {
	
	public static void main(String[] args) throws IOException{
		code test = new code();
		System.out.println(test.compte("./src/code/input.txt"));
	}	
	
	public code() {
	}
	
	public int compte(String file) throws IOException {
		Reader reader = new FileReader(file);
		int data = reader.read();
		int compteurDEtage = 0;
		int position = 1;
		for (int i = 0; i < position; i++) {
			if(data == 40) {
				compteurDEtage++;
			}else {
				compteurDEtage--;
			}
			if(compteurDEtage == -1) {
				return position;
			}
			position++;
			data  = reader.read();
		}	
		return 0;
	}
}