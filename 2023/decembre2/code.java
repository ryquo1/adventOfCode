public class code {
	public static void main(String[] args) throws FileNotFoundException  {
		Scanner scanner = new Scanner(new File("./src/Decembre2/input.txt")); 
		ArrayList<String> line = new ArrayList<String>();
		Character c ;
		
		while (scanner.hasNext()) {
			line.add(scanner.next());
        	line.add("\n");
        }
		System.out.print(line);
	}
	//A finir



}
