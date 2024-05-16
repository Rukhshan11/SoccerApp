import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

/***
 * Player Class extends Soccer Class.
 * Player Class takes the name and Stats( currently Goals only) of Players from two
 * teams and compare the teams Stats in Current Season and Top Goal Scorers in those teams
 *
 */

public class PlayerClass extends SoccerClass implements Comparison {

    /*** Player One is Team One Player */
    private String playerOneName;
    private int playerOneGoals;
    private int playerOneAppearances;

    /*** Player Two is Team Two Player */
    private String playerTwoName;
    private int playerTwoGoals;
    private int playerTwoAppearances;

    public PlayerClass(){

    }

    public PlayerClass(//String teamOneName, String teamTwoName, int teamOneScore, int teamTwoScore,
                       //int teamOneShots ,int teamTwoShots, int teamOneGames, int teamTwoGames,
                       GregorianCalendar gameDate,String playerOneName, int playerOneGoals,
                       int playerOneAppearances, String playerTwoName, int playerTwoGoals,
                       int playerTwoAppearances){

        ////super(teamOneName, teamTwoName, teamOneScore, teamTwoScore,
           //     teamOneShots,teamTwoShots, teamOneGames, teamTwoGames, gameDate );

        this.playerOneName = playerOneName;
        this.playerOneAppearances = playerOneAppearances;
        this.playerOneGoals = playerOneGoals;
        this.playerTwoName = playerTwoName;
        this.playerTwoAppearances = playerTwoAppearances;
        this.playerTwoGoals = playerTwoGoals;

    }

    /*** Setters and Getter */

    /***
     * @return playerOneName Top Scorer from Team One
     */
    public String getPlayerOneName(){

        return playerOneName;

    }

    /***
     * @return playerOneAppearances Games played
     */
    public int getPlayerOneAppearances() {

        return playerOneAppearances;

    }

    /***
     * @return playerOneGoals Goals Scored
     */
    public int getPlayerOneGoals() {

        return playerOneGoals;

    }

    /***
     * @return playerTwoName Top Scorer from Team Two
     */
    public String getPlayerTwoName() {

        return playerTwoName;

    }

    /***
     * @return playerTwoAppearances Games played
     */
    public int getPlayerTwoAppearances() {

        return playerTwoAppearances;

    }

    /***
     * @return playerTwoGoals Goals Scored
     */
    public int getPlayerTwoGoals() {

        return playerTwoGoals;

    }

    /***
     * @param playerOneName
     */
    public void setPlayerOneName(String playerOneName) {

        this.playerOneName = playerOneName;

    }

    /***
     * @param playerOneAppearances
     */
    public void setPlayerOneAppearances(int playerOneAppearances) {


        this.playerOneAppearances = playerOneAppearances;

    }

    /***
     * @param playerOneGoals
     */
    public void setPlayerOneGoals(int playerOneGoals) {

        if (playerOneGoals <= getTeamOneScore())

            this.playerOneGoals = playerOneGoals;

    }

    /***
     * @param playerTwoName
     */
    public void setPlayerTwoName(String playerTwoName) {

        this.playerTwoName = playerTwoName;

    }

    /***
     * @param playerTwoAppearances
     */
    public void setPlayerTwoAppearances(int playerTwoAppearances) {

        this.playerTwoAppearances = playerTwoAppearances;

    }

    /***
     * @param playerTwoGoals
     */
    public void setPlayerTwoGoals(int playerTwoGoals) {

        if (playerTwoGoals <= getTeamTwoScore()) {
            this.playerTwoGoals = playerTwoGoals;

        }

    }

    /***
     * @return avgGoal Calculating Average Goals Scored per game
     */
    public double playerOneGoalPerGame(){

        double avgGoal = ((double) playerOneGoals / playerOneAppearances);

        return avgGoal;

    }

    /***
     * @return avgGoal Calculating Average Goals Scored per game
     */
    public double playerTwoGoalPerGame(){

        double avgGoal = ((double)playerTwoGoals / playerTwoAppearances);

        return avgGoal;

    }

    /***
     * @param s
     * @return String comparing both players goals
     */
    @Override
    public String equals(SoccerClass s) {

        if (playerOneGoals == playerTwoGoals){

            return playerOneName + " " + playerTwoName + " are equally good";

        }

        return "";
    }

    /***
     * @param s
     * @return String comparing both players goals
     */
    @Override
    public String isBetter(SoccerClass s) {

        if (playerOneGoals < playerTwoGoals){

            return playerTwoName + " is Leading Goal Scorer";

        } else if (playerOneGoals > playerTwoGoals) {

            return playerOneName + " is Leading Goal Scorer";

        }
        return "";
    }

    /***
     * @return output Printing Team Stats and Player Stats on screen for Comparison
     */
    @Override
    public String toString(){

        SimpleDateFormat date = new SimpleDateFormat("MM-dd-yyyy 'at' hh:mm a");
        String dateFormatted = date.format(this.getGameDate().getTime());

        return  "" + getTeamOneName() + " vs " + getTeamTwoName() +" Game Time " + dateFormatted + "\n" +
                " Current Season Stats \n" +
                "Teams                     |\t" + getTeamOneName() + "\t" + getTeamTwoName() + "\n" +
                "------------------------------------------------\n" +
                "Games Played           |\t" + getTeamOneGames() + "\t\t\t" + getTeamTwoGames() + "\n" +
                "Goals Scored           |\t" + getTeamOneScore() + "\t\t\t" + getTeamTwoScore() + "\n" +
                "Shots on Target        |\t" +  getTeamOneShots() + "\t\t\t" + getTeamTwoShots() + "\n" +
                "Goal Conversion Rate   |\t" + df.format(getTeamOneGoalConversionRate()) + "%" +
                "\t\t" + df.format(getTeamTwoGoalConversionRate()) + "%" + "\n" +
                //"\n" + equals(getTeamOneScore(), getTeamTwoScore(), getTeamOneName(), getTeamTwoName()) +
                //"\n\nAre same teams playing against each other? " + equals() + "\n" +
                "\n Top Players from " + getTeamOneName() + " vs " + getTeamTwoName() + "\n\n" +
                "Name               |\t" + getPlayerOneName() + "\t\t\t" + getPlayerTwoName() + "\n" +
                "------------------------------------------------\n" +
                "Appearances        |\t" + getPlayerOneAppearances() + "\t\t\t" + getPlayerTwoAppearances() + "\n" +
                "Goals Scored       |\t" + getPlayerOneGoals() + "\t\t\t" + getPlayerTwoGoals() + "\n" +
                "Avg Goals per Game |\t" + df.format(playerOneGoalPerGame()) + "\t\t\t"
                + df.format(playerTwoGoalPerGame());


    }


}

