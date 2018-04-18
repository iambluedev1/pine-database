package fr.iambluedev.pine.api.database;

import fr.iambluedev.pine.api.table.ITable;

public interface IDatabase {

	ITable getTable(String name);
	
	boolean dropTable(String name);
	
	boolean truncateTable(String name);
	
	boolean connect();
	
	boolean close();
	
	boolean status();
}