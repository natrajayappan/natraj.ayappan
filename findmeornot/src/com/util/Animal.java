package com.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Natraj Ayappan
 *
 */
public class Animal {
	
	
	static List<String> lst = new ArrayList<String>();
	private static Animal animal = null; //Wanted to initialize as Singleton

	private Animal() {
		loadAnimalsFromTextFile();
	}
	
	private static void loadAnimalsFromTextFile() 
	{
		try {
			InputStream instream = Animal.class.getClassLoader().getResourceAsStream("AnimalList.txt");
			BufferedReader reader = new BufferedReader(new InputStreamReader(instream));
			String animal;
			while ((animal = reader.readLine()) != null) {
				lst.add(animal.toLowerCase());
			}
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public static List<String> getAnimals() {
		
		if (animal == null) {
			new Animal();
		}
		return lst;
	}

}
