package exercise1_Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Book {
	
	private String m_title;
	private List<String> m_authors = new ArrayList<String>();
	private int m_edition_year;
	private int key;
	private static int m_uniquekey=0; // only to count the objects
	
	public Book() {
		System.out.println("Everything has been properly set to default values!");
		++m_uniquekey;
		setKey(m_uniquekey);
	}
	
	public Book(String title, int edit_year) {
		m_title = title;
		m_edition_year = edit_year;
		++m_uniquekey;
		setKey(m_uniquekey);
	}
	
	public Book(Book o) {
		
		if(this != o)
		{
			this.m_title = o.m_title;
			this.m_edition_year = o.m_edition_year;
			++m_uniquekey;
			this.setKey(m_uniquekey);
			Collections.copy(this.m_authors, o.m_authors);
		}
		
		
	}
	
	void print() {
		System.out.println("Title:  " + m_title);
		System.out.println("Edition year:  " + m_edition_year);
		System.out.println("UQ:  " + m_uniquekey);
		System.out.println("Authors:  \n--------------------");
		
		for(String x : m_authors)
		{
			System.out.println("Name:  " + x);
		}
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}
	
	public String getTitle() {
		return m_title;
	}

	public void setTitle(String title) {
		this.m_title = title;
	}

	public int getEditionYear() {
		return m_edition_year;
	}

	public void setEditionYear(int EditionYear) {
		this.m_edition_year = EditionYear;
	}
	
	public void addAuthor(String full_name) {
		if(m_authors.contains(full_name) == false) {
			m_authors.add(full_name);
		}
		else {
			System.out.println("Author already exits in the book!");
		}
	}
	
	public void removeAuthor(String name) {
		if(m_authors.contains(name) == true) {
			m_authors.remove(name);
			System.out.println("Author has been removed");
		}
		else {
			System.out.println("Author does NOT exits in the book");
		}
	}
	
	public static int count() {
		return m_uniquekey;
	}
}