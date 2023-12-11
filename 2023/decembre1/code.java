package decembre1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class code {
	public static void main(String[] args) throws FileNotFoundException  {
        ArrayList<String> line = new ArrayList<String>() ;
        ArrayList<Integer> valeur = new ArrayList<Integer>();
        ArrayList<Integer> valeur2 = new ArrayList<Integer>();
        ArrayList<String> val = new ArrayList<String>();
        Scanner scanner = new Scanner(new File("./src/decembre1/input.txt")); 
        int b = 0;
        String msg;
        
        while (scanner.hasNext()) {
        	line.add(scanner.next());
        }
        
        for (int i = 0; i < line.size(); i++) {
			msg = line.get(i);
			int c;	
			for (int j = 0; j < msg.length(); j++) {
				if(msg.charAt(j) == '1'||msg.charAt(j) == '2'||msg.charAt(j) == '3'||msg.charAt(j) == '4'||msg.charAt(j) == '5'||msg.charAt(j) == '6'||msg.charAt(j) == '7'||msg.charAt(j) == '8'||msg.charAt(j) == '9') {
					c = msg.charAt(j);
					valeur.add(c);	
				}	
			}
			valeur.add(0);	
		}
        System.out.println(valeur);
        
        for (int i = 0; i < valeur.size(); i++) {
        	if (valeur.get(i) != 0) {
				valeur2.add(Character.getNumericValue(valeur.get(i)));
				if(valeur.get(i+1) == 0){
					valeur2.add(Character.getNumericValue(valeur.get(i)));
					valeur2.add(0);
				}
			}     	 	
		}
        System.out.println(valeur2);
        
        String s1 = new String();
        String s2 = new String();
        String s3 = new String();
        int cpt =0 ;
        for (int i = 0; i < valeur2.size(); i++) {
			if(valeur2.get(i)!=0) {
				cpt++;
			}
			if(valeur2.get(i)==0) {
				//System.out.println(cpt);
				for (int j = 0; j <= cpt; j++) {
					if (j == 1) {
						s1 =s1.valueOf( valeur2.get(i-cpt));
						//System.out.println(s1);
					}if(j == cpt){
						s2 = s2.valueOf(valeur2.get(i-1));
						//System.out.println(s2);
					}	
				}
				s3 = s1.concat(s2);
				//System.out.println(s3);
				cpt = 0;
				val.add(s3);
			}		
		}
         System.out.println(val);
		for (int i = 0; i < val.size(); i++) {
			b += Integer.valueOf(val.get(i));
		}
       System.out.println(b);   
    }
}
