package rpg.players;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Jeremy extends Player {
	public Jeremy(int a, int b) {
		u[0] = getToolkit().getImage("img/npc/jeremy/u.png");
		u[1] = getToolkit().getImage("img/npc/jeremy/u.png");
		u[2] = getToolkit().getImage("img/npc/jeremy/u.png");
		d[0] = getToolkit().getImage("img/npc/jeremy/d.png");
		d[1] = getToolkit().getImage("img/npc/jeremy/d.png");
		d[2] = getToolkit().getImage("img/npc/jeremy/d.png");
		l[0] = getToolkit().getImage("img/npc/jeremy/l.png");
		l[1] = getToolkit().getImage("img/npc/jeremy/l.png");
		l[2] = getToolkit().getImage("img/npc/jeremy/l.png");
		r[0] = getToolkit().getImage("img/npc/jeremy/r.png");
		r[1] = getToolkit().getImage("img/npc/jeremy/r.png");
		r[2] = getToolkit().getImage("img/npc/jeremy/r.png");
		img = "img/npc/jeremy/jeremy.jpg";
		word = new String[1];
		word[0]= "npc/iceland/jeremy_d.txt";
		x = a;
		y = b;
	}
}