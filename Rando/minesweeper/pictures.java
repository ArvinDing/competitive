package minesweeper;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

public class pictures {

	public static void main(String[] args) throws Exception {
		Robot robot = new Robot();
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension dim = tk.getScreenSize();

		BufferedImage game = robot
				.createScreenCapture(new Rectangle(541, 184, (int) dim.getWidth(), (int) dim.getHeight()));
	
		ImageIO.write(game, "png", new File("save.png"));
	}
}
