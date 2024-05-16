/***
 * This program is a basic Soccer webapp / mobile app. This shows results, stats and time of a soccer match.
 *
 */

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public abstract class SoccerClass implements Cloneable{

    DecimalFormat df = new DecimalFormat("#.#");
    private String teamOneName;
    private String teamTwoName;
    private int teamOneScore;
    private int teamTwoScore;
    private GregorianCalendar gameDate;
    private int teamOneShots;
    private int teamTwoShots;
    /*** Game played by teams in this season*/
    private int teamOneGames;
    private int teamTwoGames;


    /***
     * Default constructor class
     */
    public SoccerClass(){

    }

    /***
     *
     * @param teamOneName
     * @param teamTwoName
     * @param teamOneScore
     * @param teamTwoScore
     * @param teamOneShots
     * @param teamTwoShots
     * @param gameDate
     * @param teamOneGames
     * @param teamTwoGames
     */
    public SoccerClass(String teamOneName, String teamTwoName, int teamOneScore, int teamTwoScore,
                       int teamOneShots ,int teamTwoShots, int teamOneGames, int teamTwoGames, GregorianCalendar gameDate){

        this.teamOneName = teamOneName;
        this.teamTwoName = teamTwoName;
        this.teamOneScore = teamOneScore;
        this.teamTwoScore = teamTwoScore;
        this.gameDate = gameDate;
        this.teamOneShots = teamOneShots;
        this.teamTwoShots = teamTwoShots;
        this.teamOneGames = teamOneGames;
        this.teamTwoGames = teamTwoGames;

    }

    /***
     * @param other Copy Constructor
     */
    public SoccerClass(SoccerClass other){

        this.teamOneName = other.teamOneName;
        this.teamTwoName = other.teamTwoName;
        this.teamOneScore = other.teamOneScore;
        this.teamTwoScore = other.teamTwoScore;
        this.gameDate = other.gameDate;
        this.teamOneShots = other.teamOneShots;
        this.teamTwoShots  = other.teamTwoShots;
        this.teamOneGames = other.teamOneGames;
        this.teamTwoGames = other.teamTwoGames;

    }

    /***
     * @return teamOneName Name of Home Team
     */
    public String getTeamOneName() {

        return teamOneName;

    }

    /***
     * @return teamTwoName Name of Away Team
     */
    public String getTeamTwoName() {

        return teamTwoName;

    }

    /***
     * @return teamOneScore Home Team Final Score
     */
    public int getTeamOneScore() {

        return teamOneScore;

    }

    /***
     * @return teamTwoScore Away team Final Score
     */
    public int getTeamTwoScore() {

        return teamTwoScore;

    }

    /***
     * @return teamOneShots Home Team Total Shots
     */
    public int getTeamOneShots(){

        return this.teamOneShots;

    }

    /***
     * @return teamTwoShots Away Team Total Shots
     */
    public int getTeamTwoShots(){

        return this.teamTwoShots;

    }

    /***
     * @return gameDate Date and Time when the Match Starts
     */
    public GregorianCalendar getGameDate() {

        return this.gameDate;

    }

    /***
     * @return teamOneGames
     */
    public int getTeamOneGames() {

        return teamOneGames;

    }
    /***
     * @return teamTwoGames
     */
    public int getTeamTwoGames() {

        return teamTwoGames;

    }

    /***
     * @param teamOneName
     */
    public void setTeamOneName(String teamOneName) {

        this.teamOneName = teamOneName;

    }

    /***
     * @param teamTwoName
     */
    public void setTeamTwoName(String teamTwoName) {

        this.teamTwoName = teamTwoName;

    }

    /***
     * @param teamOneScore
     */
    public void setTeamOneScore(int teamOneScore) {

        if (teamOneScore >= 0) {

            this.teamOneScore = teamOneScore;

        }

    }

    /***
     * @param teamTwoScore
     */
    public void setTeamTwoScore(int teamTwoScore) {

        if (teamTwoScore >= 0) {

            this.teamTwoScore = teamTwoScore;

        }

    }

    /***
     * @param teamOneShots
     */
    public void setTeamOneShots(int teamOneShots){

        if (teamOneShots >= teamOneScore){

            this.teamOneShots = teamOneShots;

        }

    }

    /***
     * @param teamTwoShots
     */
    public void setTeamTwoShots(int teamTwoShots) {

        if (teamTwoShots >= teamTwoScore) {

            this.teamTwoShots = teamTwoShots;

        }

    }

    /***
     * @param teamOneGames
     */
    public void setTeamOneGames(int teamOneGames) {

        if (teamOneGames > 0){

            this.teamOneGames = teamOneGames;

        }

    }

    /***
     * @param teamTwoGames
     */
    public void setTeamTwoGames(int teamTwoGames){

        if (teamTwoGames > 0){

            this.teamTwoGames = teamTwoGames;

        }


    }

    /***
     * @param year
     * @param month
     * @param dayOfMonth
     * @param hourOfDay
     * @param minute
     */
    public void setGameDate(int year, int month, int dayOfMonth, int hourOfDay, int minute) {

        this.gameDate = new GregorianCalendar(year, month, dayOfMonth, hourOfDay, minute);

    }

    /***
     * @return rate
     */
    public double getTeamOneGoalConversionRate(){

        double rate = ((double) teamOneScore / teamOneShots) * 100;
        return rate;

    }

    /***
     * @return rate
     */
    public double getTeamTwoGoalConversionRate(){

        double rate = ((double) teamTwoScore / teamTwoShots) * 100;
        return rate;

    }

    /***
     * @return boolean
     */
    public boolean equals(){

        if (teamOneName.equals(teamTwoName)){
            return true;

        } else {

            return false;
        }
    }


    /***
     * @param teamOneScore
     * @param teamTwoScore
     * @param teamOneName
     * @param teamTwoName
     * @return result Win or Draw
     */
    public String equals(int teamOneScore, int teamTwoScore, String teamOneName, String teamTwoName){

        String result;

        if (teamOneScore == teamTwoScore){

            result = "Game Ended in Draw";
            return result ;

        } else if (teamOneScore < teamTwoScore) {

            result = "Winner: " + teamTwoName;
            return result;

        } else {

            result = "Winner: " + teamOneName;
            return result;

        }

    }

    /***
     * @return output String output
     */
    @Override
    public String toString(){

        SimpleDateFormat date = new SimpleDateFormat("MM-dd-yyyy 'at' hh:mm a");
        String dateFormatted = date.format(this.gameDate.getTime());

        String output = "\nGame Time " + dateFormatted + "\n" +
                "Teams               |\t" + getTeamOneName() + "\t" + getTeamTwoName() + "\n" +
                "------------------------------------------------\n" +
                "Score               |\t" + getTeamOneScore() + "\t\t\t" + getTeamTwoScore() + "\n" +
                "Shots               |\t" +  getTeamOneShots() + "\t\t\t" + getTeamTwoShots() + "\n" +
                "Goal Conversion Rate|\t" + df.format(getTeamOneGoalConversionRate()) + "%" +
                "\t\t\t" + df.format(getTeamTwoGoalConversionRate()) + "%" +
                "\n" + equals(teamOneScore, teamTwoScore, teamOneName, teamTwoName) +
                "\n\nAre same teams playing against each other? " + equals();
        return output;

    }

}


