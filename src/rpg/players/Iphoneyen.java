package rpg.players;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Iphoneyen extends Player {
	public Iphoneyen(int a, int b) {
		u[0] = getToolkit().getImage("img/npc/iphoneyen/u.png");
		u[1] = getToolkit().getImage("img/npc/iphoneyen/u.png");
		u[2] = getToolkit().getImage("img/npc/iphoneyen/u.png");
		d[0] = getToolkit().getImage("img/npc/iphoneyen/d.png");
		d[1] = getToolkit().getImage("img/npc/iphoneyen/d.png");
		d[2] = getToolkit().getImage("img/npc/iphoneyen/d.png");
		l[0] = getToolkit().getImage("img/npc/iphoneyen/l.png");
		l[1] = getToolkit().getImage("img/npc/iphoneyen/l.png");
		l[2] = getToolkit().getImage("img/npc/iphoneyen/l.png");
		r[0] = getToolkit().getImage("img/npc/iphoneyen/r.png");
		r[1] = getToolkit().getImage("img/npc/iphoneyen/r.png");
		r[2] = getToolkit().getImage("img/npc/iphoneyen/r.png");
		img = "img/npc/iphoneyen/iphoneyen.jpg";
		word = new String[2];
		word[0]= "npc/iceland/iphoneyen_d.txt";
		word[1]= "npc/iceland/iphoneyen1.txt";
		x = a;
		y = b;
	}
	public String getWord() {
		if(!state[9]) {
			return word[0];
		}
		state[10] = true;
		return word[1];
	}
}