package rpg.maps;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import rpg.players.*;

public class MagicSquare extends Map {
	public MagicSquare(Map src) {
		//get Image and set min,max (x,y)
		bg = getToolkit().getImage("img/map/iceland/magicsquare.png");
		//get op from file
		try {
			RandomAccessFile randomAccessFile = new RandomAccessFile("map/iceland/magicsquare", "r");
			randomAccessFile.seek(0);
			for(int i =0; i < (maxX*maxY); i++)
				op[i] = (int) (randomAccessFile.readChar() - 48);
		}
		catch(IOException ie){
			System.out.print(ie);
		}
		//set gateway, map switching, source and destination's (x,y)
		gateway = new Map[1];
		sx = new int[1]; sy = new int[1]; dx = new int[1]; dy = new int[1];
		gateway[0] = src;
		sx[0] = 42; sy[0] = 68; dx[0] = 48; dy[0] = 43;
		//set NPC
		npc_exist = true;
		npc = new Player[1];
		npc[0] = new TeacherP(42,46);
	}
}