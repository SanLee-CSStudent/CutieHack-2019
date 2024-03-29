package GUI;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.*;

import javax.imageio.ImageIO;

public class Images {

	public Images() {
		// TODO Auto-generated constructor stub
		Player = new BufferedImage[PLAYER_STATES * PLAYER_FACING_DIRECTION][PLAYER_MAX_FRAMES];
		Cursor = new Image[CURSOR_MAX_FRAMES];
		Heart = new BufferedImage[HEART_MAX_FRAMES];
		Food = new BufferedImage[FOOD_MAX_FRAMES];
		Buttons = new Image[BUTTON_TYPES][BUTTON_STATES];
		try {
			loadPlayer();
			loadCursor();
			loadObjects();
			loadUI();
		} catch(IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
	
	private void loadPlayer() throws IOException {
		for(int j=0; j<PLAYER_IDLE_FRAMES; j++) {// loading Idle Image looking to the left
			if(j < 10) {
				Player[0][j] = ImageIO.read(new FileInputStream("src//Sprites//Images//IdleImage_Tictoc//idle_L0" + j +".png"));
			}
			else {
				Player[0][j] = ImageIO.read(new FileInputStream("src//Sprites//Images//IdleImage_Tictoc//idle_L" + j +".png"));
			}
		}
		
		for(int j=0; j<PLAYER_IDLE_FRAMES; j++) {// loading Idle Image looking to the right
			if(j < 10) {
				Player[1][j] = ImageIO.read(new FileInputStream("src//Sprites//Images//IdleImage_Tictoc//idle_R0" + j +".png"));
			}
			else {
				Player[1][j] = ImageIO.read(new FileInputStream("src//Sprites//Images//IdleImage_Tictoc//idle_R" + j +".png"));
			}
		}
		
		for(int i=0; i<PLAYER_MOVE_FRAMES; i++) {// loading Move Image looking to the right
			Player[2][i] = ImageIO.read(new FileInputStream("src//Sprites//Images//RunImage_Tictoc//run_L" + i + ".png"));
		}
		
		for(int i=0; i<PLAYER_MOVE_FRAMES; i++) {// loading Move Image looking to the right
			Player[3][i] = ImageIO.read(new FileInputStream("src//Sprites//Images//RunImage_Tictoc//run_R" + i + ".png"));
		}
		
		for(int i=0; i<PLAYER_SIT_FRAMES; i++) {
			if(i < 10) {
				Player[4][i] = ImageIO.read(new FileInputStream("src//Sprites//Images//SitImage_Tictoc//sit_L0" + i +".png"));
			}
			else {
				Player[4][i] = ImageIO.read(new FileInputStream("src//Sprites//Images//SitImage_Tictoc//sit_L" + i +".png"));
			}
		}
		
		for(int i=0; i<PLAYER_SIT_FRAMES; i++) {
			if(i < 10) {
				Player[5][i] = ImageIO.read(new FileInputStream("src//Sprites//Images//SitImage_Tictoc//sit_R0" + i +".png"));
			}
			else {
				Player[5][i] = ImageIO.read(new FileInputStream("src//Sprites//Images//SitImage_Tictoc//sit_R" + i +".png"));
			}
		}
		
		for(int i=0; i<PLAYER_SLEEP_FRAMES; i++) {
			if(i < 10) {
				Player[6][i] = ImageIO.read(new FileInputStream("src//Sprites//Images//SleepImage_Tictoc//sleep_L0" + i +".png"));
			}

		}
		
		for(int i=0; i<PLAYER_SLEEP_FRAMES; i++) {
			if(i < 10) {
				Player[7][i] = ImageIO.read(new FileInputStream("src//Sprites//Images//SleepImage_Tictoc//sleep_R0" + i +".png"));
			}

		}
		
		for(int i=0; i<PLAYER_SLEEPING_FRAMES; i++) {
			if(i < 10) {
				Player[8][i] = ImageIO.read(new FileInputStream("src//Sprites//Images//SleepImage_Tictoc//sleeping_L0" + i +".png"));
			}
			else {
				Player[8][i] = ImageIO.read(new FileInputStream("src//Sprites//Images//SleepImage_Tictoc//sleeping_L" + i +".png"));
			}
		}
		
		for(int i=0; i<PLAYER_SLEEPING_FRAMES; i++) {
			if(i < 10) {
				Player[9][i] = ImageIO.read(new FileInputStream("src//Sprites//Images//SleepImage_Tictoc//sleeping_R0" + i +".png"));
			}
			else {
				Player[9][i] = ImageIO.read(new FileInputStream("src//Sprites//Images//SleepImage_Tictoc//sleeping_R" + i +".png"));
			}
		}
	}
	
	private void loadCursor() throws IOException {
		for(int i=0; i<CURSOR_MAX_FRAMES;i++) {
			Cursor[i] = ImageIO.read(new FileInputStream("src\\Sprites\\Icons\\Cursor\\Cursor" + i + ".png"));
		}
	}
	
	private void loadObjects() throws IOException {
		for(int i=0; i<HEART_MAX_FRAMES; i++) {
			Heart[i] = ImageIO.read(new FileInputStream("src\\Sprites\\Icons\\Heart\\heart" + (i+1) + ".png"));
		}
		
		for(int i=0; i<FOOD_MAX_FRAMES; i++) {
			Food[i] = ImageIO.read(new FileInputStream("src\\Sprites\\Icons\\Food\\Food" + (i+1) + ".png"));
		}
	}
	
	private void loadUI() throws IOException{
		for(int j=0; j<BUTTON_TYPES; j++) {
			for(int i=0; i<BUTTON_STATES; i++) {
				// System.out.println(j + "; " + i + "; " + (2*j + i));
				Buttons[j][i] = ImageIO.read(new FileInputStream("src\\Sprites\\Images\\UI\\UI_Button" + (2*j + i) + ".png" ));

			}
		}
		
		UI = ImageIO.read(new FileInputStream("src\\Sprites\\Images\\UI\\UI_Background.png"));
	}
	
	private final int PLAYER_STATES = 5;
	private final int PLAYER_FACING_DIRECTION = 2;
	public static final int PLAYER_MOVE_FRAMES = 6;
	public static final int PLAYER_IDLE_FRAMES = 12;
	public static final int PLAYER_SIT_FRAMES = 12;
	public static final int PLAYER_SLEEP_FRAMES = 5;
	public static final int PLAYER_SLEEPING_FRAMES = 12;
	public static final int BUTTON_TYPES = 4;
	public static final int BUTTON_STATES = 2;
	public static final int FOOD_MAX_FRAMES = 8;
	
	private final int PLAYER_MAX_FRAMES = 12;
	private final int CURSOR_MAX_FRAMES = 5;
	public static final int HEART_MAX_FRAMES = 19;

	public static final int PLAYER_WIDTH = 134;
	public static final int PLAYER_HEIGHT = 134;
	public static Image[] Cursor;
	public static Image[][] Buttons;
	public static Image UI;
	public static BufferedImage[] Heart;
	public static BufferedImage[] Food;
	public static BufferedImage[][] Player;// 0~1 Idle_left and Idle_right
}
