package oop;

import java.io.IOException;
import java.sql.SQLException;

public interface proceedings
{
	public String getSchedule(Sport s) throws NumberFormatException, IOException;
	public String getScore(Sport s) throws NumberFormatException, IOException, SQLException ;
	public String getStandings(Sport s) throws NumberFormatException, IOException;
	public String regForNonSport(nonSportEvent n) ;
	public String getNonSportSchedule(nonSportEvent n);
}
