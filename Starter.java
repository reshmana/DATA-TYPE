class Starter{
	
	public static void main(String[] apply){
		
		System.out.println("Starting main in Starter");
		System.out.println("Starting Tent");
		Colour colour=Colour.RED;
		Tent tent=new Tent();
		Agent agent=new Agent();
		tent.showInfo(23,colour,35,50);
		agent.openTent(tent);
		agent.closeTent(tent);
		agent.showInfo();
		System.out.println("Ending Tent");
		
		System.out.println("==================================");
		
		System.out.println("Starting Game");
		TotalPlayers totalPlayers=TotalPlayers.HUNDERED;
		Game game=new Game(20,"Football",totalPlayers,"Outdoor");
		Player player=new Player("Richard",game);
		
		game.showInfo();
		player.showInfo();
		player.playGame();
		player.pauseGame();
		player.endGame();
		
		System.out.println("Starting main in Starter");
	}

}