package dto;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

public class GameBean implements Serializable {

	private int gameId;
	private Date gameDate;
	private Time startTime;
	private int homeTeamId;
	private int awayTeamId;
	private int stadiumId;
	private Date gameDeleteAt;
	
	public GameBean(int gameId, Date gameDate, int homeTeamId, int awayTeamId, int stadiumId) {
		this.gameId = gameId;
		this.gameDate = gameDate;
		this.homeTeamId = homeTeamId;
		this.awayTeamId = awayTeamId;
		this.stadiumId = stadiumId;
	}

	public GameBean(int gId, java.sql.Date gDay, Time gTime, String gHomeTeam, String gAwayTeam, String gStadium) {
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public Date getGameDate() {
		return gameDate;
	}

	public void setGameDate(Date gameDate) {
		this.gameDate = gameDate;
	}

	public Time getStartTime() {
		return startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

	public int getHomeTeamId() {
		return homeTeamId;
	}

	public void setHomeTeamId(int homeTeamId) {
		this.homeTeamId = homeTeamId;
	}

	public int getAwayTeamId() {
		return awayTeamId;
	}

	public void setAwayTeamId(int awayTeamId) {
		this.awayTeamId = awayTeamId;
	}

	public int getStadiumId() {
		return stadiumId;
	}

	public void setStadiumId(int stadiumId) {
		this.stadiumId = stadiumId;
	}

	public Date getGameDeleteAt() {
		return gameDeleteAt;
	}

	public void setGameDeleteAt(Date gameDeleteAt) {
		this.gameDeleteAt = gameDeleteAt;
	}
	
	
	
	

	

}
