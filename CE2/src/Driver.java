public class Driver {

    public static void main(String[] args){

        PlayerClass game2 = new PlayerClass();

        game2.setTeamOneName("Wildcats");
        game2.setPlayerOneName("Leo");
        game2.setTeamOneScore(12);
        game2.setPlayerOneGoals(4);
        game2.setPlayerOneAppearances(2);
        game2.setTeamOneShots(66);
        game2.setTeamOneGames(14);

        game2.setTeamTwoName("Panaroma");
        game2.setTeamTwoGames(14);
        game2.setTeamTwoScore(19);
        game2.setTeamTwoShots(66);

        game2.setPlayerTwoName("Borja");
        game2.setPlayerTwoAppearances(6);
        game2.setPlayerTwoGoals(10);

        game2.setGameDate(2024, 9, 24, 21, 15);

        System.out.println(game2);
        System.out.println(game2.isBetter(game2));
    }
}

