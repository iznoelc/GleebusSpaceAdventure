package Puzzle1;

public class Map {
    //change these to be arraylists or just list
    //so that I can set them later by adding
    int[] player_position;
    int[] ship_position;
    int max_x;
    int max_y;

    Map(int max_x,int max_y){
        this.max_x = max_x;
        this.max_y = max_y;
        //player position half of x and y
        //ship position random but cant be player position
    }

    public void update(){
        //update position
        //say hot or cold based on possition to ship
        //check if they've found an object, optional stretch goal
    }

}
