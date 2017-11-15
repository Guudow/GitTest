package Exam1;

import java.util.Arrays;

public class NoteBook {
	// Practicing Array
	private int numberOfNotes;
	private Note[] notes;
	
	public NoteBook(int maxNumberOfNotes) {
		
		numberOfNotes = 0;
		notes = new Note[maxNumberOfNotes];
	}
	
	public int getNumberOfNotes() {
		return numberOfNotes;
	}
	
	public Note getNote(int index) {
		return notes[index].copy();
	}
	public String getMessage(int index) {
		return notes[index].getMessage();
	}
	
	public void addNote(Note note) {
		notes[numberOfNotes] = note;
		numberOfNotes++;
		
	}
	
	public void addNote(String message) {
		
		notes[numberOfNotes] = new Note(message);  
		numberOfNotes++;
		
	}
	
	public void addHighPriorityNote(String message) {
		
		Note note = new Note(message);
		note.setToHighPriority();
		notes[numberOfNotes] = note;
		numberOfNotes++;
		
		
	}
	public void removeNotes(int index) {
		for(int i = index; i < numberOfNotes-1; i++) {
			notes[i] = notes[i+1];
		}
		notes[numberOfNotes-1] = null;
		numberOfNotes--;
	}
	
	public Note[] getAllNotes() {
		
		Note[] temp = new Note[numberOfNotes];
		for (int i=0; i<numberOfNotes; i++) {
			temp[i] = notes[i]; 
		}
		return temp;
		
	}
	public int getNumberOfHighPriorityNotes() {
		
		int count = 0;
		for(int i=0; i< numberOfNotes; i++) {
			if(notes[i].isHighPriority()) {
				count++;
			}
		}
		return count;
	}
	public Note[] getAllHighPriorityNotes() {
		
		Note[] temp = new Note[getNumberOfHighPriorityNotes()];
		for (int i=0; i <numberOfNotes; i++ )
		{
			if (notes[i].isHighPriority()) {
				temp[i] = notes[i];
			}
		}
		return temp;
	}
	
	public String toString() {
		
		return "Notebook [numberOfNotes=" + numberOfNotes + ", notes=" + 
		Arrays.toString(notes) + "]";
	}

}
