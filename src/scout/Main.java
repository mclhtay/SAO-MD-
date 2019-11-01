package scout;

import java.awt.*;
import java.io.*;
import java.net.URL;
import javax.swing.*;
import javax.imageio.*;
import java.awt.image.*;
import java.awt.event.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

@SuppressWarnings("serial")
public class Main extends JFrame implements MouseListener {

	public static BufferedImage title, titlec, loading, banner, multi, multis, single, singles, result, bg, bannerback,
			intro1, intro2, vlucky, diamond;
	public static BufferedImage one, three, five, ten, fifteen, twenty, twentifive, thirty, forty, fifty, sixty,
			seventy, eighty, ninty, hundred;
	public static BufferedImage osk, oss, eugeo5, nope, yes;
	public static BufferedImage c1, c2, c3, c4, c5;
	public static BufferedImage PoT[] = new BufferedImage[21];
	public static BufferedImage leftarrow, rightarrow;
	public static ImageIcon icon;
	static Color skyBlue = new Color(135, 206, 250);
	public static Font arial = new Font("Calibri", Font.BOLD, 60);
	public static Font diamondFont = new Font("Arial", Font.PLAIN, 25);
	public static Font diamondnum = new Font("Calibri", Font.PLAIN, 20);
	private Clip clip[] = new Clip[23];
	private AudioInputStream activeClip[] = new AudioInputStream[23];
	public int progress = 0;
	public static JLabel logLabel;
	public static int eventnum = 0;
	public static int rand[] = new int[11];
	public static int temporary;
	public static int diamondamt = 500;
	public static BufferedImage Alicization[] = new BufferedImage[13];
	public static BufferedImage CelestialDancer[] = new BufferedImage[7];
	public static BufferedImage yuiLoading, diamondshop, nosingle, nomulti;
	public static BufferedImage friendshipthumbnail[] = new BufferedImage[12];
	public static BufferedImage friendshipportrait[] = new BufferedImage[12];
	public static BufferedImage Friendship, OP_Banner;

	public static BufferedImage portraits[] = new BufferedImage[37];
	public static BufferedImage thumbnails[] = new BufferedImage[37];

	public static void main(String arg[]) {

		new Main();
	}

	public Main() {
		setSize(600, 900);
		setResizable(false);
		setLocation(350, 50);
		setTitle("Scout Simulation By Carter J");
		try {
			title = ImageIO.read(ResourceLoader.load("images/title.png"));
			titlec = ImageIO.read(ResourceLoader.load("images/image_characters.png"));
			loading = ImageIO.read(ResourceLoader.load("images/loading.png"));
			banner = ImageIO.read(ResourceLoader.load("images/free/banner.png"));
			multi = ImageIO.read(ResourceLoader.load("images/multi.png"));
			multis = ImageIO.read(ResourceLoader.load("images/multis.png"));
			single = ImageIO.read(ResourceLoader.load("images/single.png"));
			singles = ImageIO.read(ResourceLoader.load("images/singles.png"));
			result = ImageIO.read(ResourceLoader.load("images/result.png"));
			bg = ImageIO.read(ResourceLoader.load("images/bg.png"));
			one = ImageIO.read(ResourceLoader.load("images/free/1.png"));
			three = ImageIO.read(ResourceLoader.load("images/free/3.png"));
			five = ImageIO.read(ResourceLoader.load("images/free/5.png"));
			ten = ImageIO.read(ResourceLoader.load("images/10.png"));
			fifteen = ImageIO.read(ResourceLoader.load("images/15.png"));
			twenty = ImageIO.read(ResourceLoader.load("images/20.png"));
			twentifive = ImageIO.read(ResourceLoader.load("images/25.png"));
			thirty = ImageIO.read(ResourceLoader.load("images/30.png"));
			forty = ImageIO.read(ResourceLoader.load("images/40.png"));
			fifty = ImageIO.read(ResourceLoader.load("images/50.png"));
			sixty = ImageIO.read(ResourceLoader.load("images/60.png"));
			seventy = ImageIO.read(ResourceLoader.load("images/70.png"));
			eighty = ImageIO.read(ResourceLoader.load("images/80.png"));
			ninty = ImageIO.read(ResourceLoader.load("images/90.png"));
			hundred = ImageIO.read(ResourceLoader.load("images/100.png"));
			bannerback = ImageIO.read(ResourceLoader.load("images/bannerback.png"));
			intro1 = ImageIO.read(ResourceLoader.load("images/intro1.png"));
			intro2 = ImageIO.read(ResourceLoader.load("images/intro2.png"));
			vlucky = ImageIO.read(ResourceLoader.load("images/lucky.png"));
			diamond = ImageIO.read(ResourceLoader.load("images/diamond.png"));
			osk = ImageIO.read(ResourceLoader.load("images/free/osk.png"));
			oss = ImageIO.read(ResourceLoader.load("images/free/oss.png"));
			yes = ImageIO.read(ResourceLoader.load("images/yes.png"));
			nope = ImageIO.read(ResourceLoader.load("images/nope.png"));
			eugeo5 = ImageIO.read(ResourceLoader.load("images/free/5eugeo.png"));
			c1 = ImageIO.read(ResourceLoader.load("images/c1.png"));
			c2 = ImageIO.read(ResourceLoader.load("images/c2.png"));
			c3 = ImageIO.read(ResourceLoader.load("images/c3.png"));
			c4 = ImageIO.read(ResourceLoader.load("images/c4.png"));
			c5 = ImageIO.read(ResourceLoader.load("images/c5.png"));
			PoT[0] = ImageIO.read(ResourceLoader.load("images/proof of trust/proof of trust.png"));
			PoT[1] = ImageIO.read(ResourceLoader.load("images/proof of trust/will-kirito.png"));
			PoT[2] = ImageIO.read(ResourceLoader.load("images/proof of trust/w-kirito.png"));
			PoT[3] = ImageIO.read(ResourceLoader.load("images/proof of trust/will-asuna.png"));
			PoT[4] = ImageIO.read(ResourceLoader.load("images/proof of trust/w-asuna.png"));
			PoT[5] = ImageIO.read(ResourceLoader.load("images/proof of trust/blade-leafa.png"));
			PoT[6] = ImageIO.read(ResourceLoader.load("images/proof of trust/b-leafa.png"));
			PoT[7] = ImageIO.read(ResourceLoader.load("images/proof of trust/archer-sinon.png"));
			PoT[8] = ImageIO.read(ResourceLoader.load("images/proof of trust/a-sinon.png"));
			PoT[9] = ImageIO.read(ResourceLoader.load("images/proof of trust/TDkirito.png"));
			PoT[10] = ImageIO.read(ResourceLoader.load("images/proof of trust/TD-kirito.png"));
			PoT[11] = ImageIO.read(ResourceLoader.load("images/proof of trust/TDyuuki.png"));
			PoT[12] = ImageIO.read(ResourceLoader.load("images/proof of trust/TD-yuuki.png"));
			PoT[13] = ImageIO.read(ResourceLoader.load("images/proof of trust/TDasuna.png"));
			PoT[14] = ImageIO.read(ResourceLoader.load("images/proof of trust/TD-asuna.png"));
			PoT[15] = ImageIO.read(ResourceLoader.load("images/proof of trust/TDalice.png"));
			PoT[16] = ImageIO.read(ResourceLoader.load("images/proof of trust/TD-alice.png"));
			PoT[17] = ImageIO.read(ResourceLoader.load("images/proof of trust/TDeugeo.png"));
			PoT[18] = ImageIO.read(ResourceLoader.load("images/proof of trust/TD-eugeo.png"));
			PoT[19] = ImageIO.read(ResourceLoader.load("images/proof of trust/yrain.png"));
			PoT[20] = ImageIO.read(ResourceLoader.load("images/proof of trust/Y-rain.png"));

			leftarrow = ImageIO.read(ResourceLoader.load("images/left.png"));
			rightarrow = ImageIO.read(ResourceLoader.load("images/right.png"));
			yuiLoading = ImageIO.read(ResourceLoader.load("images/yuiLoading.png"));
			diamondshop = ImageIO.read(ResourceLoader.load("images/diamondshop.png"));
			nosingle = ImageIO.read(ResourceLoader.load("images/nosingle.png"));
			nomulti = ImageIO.read(ResourceLoader.load("images/nomulti.png"));

			Alicization[0] = ImageIO.read(ResourceLoader.load("images/Alicization/Alicization 3.png"));
			Alicization[1] = ImageIO.read(ResourceLoader.load("images/Alicization/portrait/Eugeo1.png"));
			Alicization[2] = ImageIO.read(ResourceLoader.load("images/Alicization/portrait/Eugeo2.png"));
			Alicization[3] = ImageIO.read(ResourceLoader.load("images/Alicization/portrait/Eugeo3.png"));
			Alicization[4] = ImageIO.read(ResourceLoader.load("images/Alicization/portrait/Alice1.png"));
			Alicization[5] = ImageIO.read(ResourceLoader.load("images/Alicization/portrait/Alice2.png"));
			Alicization[6] = ImageIO.read(ResourceLoader.load("images/Alicization/portrait/Alice3.png"));
			Alicization[7] = ImageIO.read(ResourceLoader.load("images/Alicization/thumbnail/eugeo1.png"));
			Alicization[8] = ImageIO.read(ResourceLoader.load("images/Alicization/thumbnail/eugeo2.png"));
			Alicization[9] = ImageIO.read(ResourceLoader.load("images/Alicization/thumbnail/eugeo3.png"));
			Alicization[10] = ImageIO.read(ResourceLoader.load("images/Alicization/thumbnail/alice1.png"));
			Alicization[11] = ImageIO.read(ResourceLoader.load("images/Alicization/thumbnail/alice2.png"));
			Alicization[12] = ImageIO.read(ResourceLoader.load("images/Alicization/thumbnail/alice3.png"));

			CelestialDancer[0] = ImageIO.read(ResourceLoader.load("images/Celestial Dancer/Celestial Dancer.png"));
			CelestialDancer[1] = ImageIO.read(ResourceLoader.load("images/Celestial Dancer/portrait/CDyuuki.png"));
			CelestialDancer[2] = ImageIO.read(ResourceLoader.load("images/Celestial Dancer/portrait/CDsilica.png"));
			CelestialDancer[3] = ImageIO.read(ResourceLoader.load("images/Celestial Dancer/portrait/CDphilia.png"));
			CelestialDancer[4] = ImageIO.read(ResourceLoader.load("images/Celestial Dancer/thumbnail/cdyuuki.png"));
			CelestialDancer[5] = ImageIO.read(ResourceLoader.load("images/Celestial Dancer/thumbnail/cdsilica.png"));
			CelestialDancer[6] = ImageIO.read(ResourceLoader.load("images/Celestial Dancer/thumbnail/cdphilia.png"));

			Friendship = ImageIO.read(ResourceLoader.load("images/Friendship/friendship.png"));

			friendshipthumbnail[0] = ImageIO
					.read(ResourceLoader.load("images/Friendship/thumbnail/friendshipasuna.png"));
			friendshipthumbnail[1] = ImageIO
					.read(ResourceLoader.load("images/Friendship/thumbnail/friendshipyuuki.png"));
			friendshipthumbnail[2] = ImageIO
					.read(ResourceLoader.load("images/Friendship/thumbnail/friendshipsilica.png"));
			friendshipthumbnail[3] = ImageIO
					.read(ResourceLoader.load("images/Friendship/thumbnail/friendshiplisbeth.png"));
			friendshipthumbnail[4] = ImageIO.read(ResourceLoader.load("images/Friendship/thumbnail/oskirito.png"));
			friendshipthumbnail[5] = ImageIO.read(ResourceLoader.load("images/Friendship/thumbnail/osasuna.png"));
			friendshipthumbnail[6] = ImageIO.read(ResourceLoader.load("images/Friendship/thumbnail/osasuna2.png"));
			friendshipthumbnail[7] = ImageIO.read(ResourceLoader.load("images/Friendship/thumbnail/ossuguha.png"));
			friendshipthumbnail[8] = ImageIO.read(ResourceLoader.load("images/Friendship/thumbnail/piratekirito.png"));
			friendshipthumbnail[9] = ImageIO.read(ResourceLoader.load("images/Friendship/thumbnail/pirateasuna.png"));
			friendshipthumbnail[10] = ImageIO.read(ResourceLoader.load("images/Friendship/thumbnail/pirateleafa.png"));
			friendshipthumbnail[11] = ImageIO.read(ResourceLoader.load("images/Friendship/thumbnail/pirateyuuki.png"));

			friendshipportrait[0] = ImageIO.read(ResourceLoader.load("images/Friendship/portrait/friendshipasuna.png"));
			friendshipportrait[1] = ImageIO.read(ResourceLoader.load("images/Friendship/portrait/friendshipyuuki.png"));
			friendshipportrait[2] = ImageIO
					.read(ResourceLoader.load("images/Friendship/portrait/friendshipsilica.png"));
			friendshipportrait[3] = ImageIO
					.read(ResourceLoader.load("images/Friendship/portrait/friendshiplisbeth.png"));
			friendshipportrait[4] = ImageIO.read(ResourceLoader.load("images/Friendship/portrait/oskirito.png"));
			friendshipportrait[5] = ImageIO.read(ResourceLoader.load("images/Friendship/portrait/osasuna.png"));
			friendshipportrait[6] = ImageIO.read(ResourceLoader.load("images/Friendship/portrait/osasuna2.png"));
			friendshipportrait[7] = ImageIO.read(ResourceLoader.load("images/Friendship/portrait/ossuguha.png"));
			friendshipportrait[8] = ImageIO.read(ResourceLoader.load("images/Friendship/portrait/piratekirito.png"));
			friendshipportrait[9] = ImageIO.read(ResourceLoader.load("images/Friendship/portrait/pirateasuna.png"));
			friendshipportrait[10] = ImageIO.read(ResourceLoader.load("images/Friendship/portrait/pirateleafa.png"));
			friendshipportrait[11] = ImageIO.read(ResourceLoader.load("images/Friendship/portrait/pirateyuuki.png"));

			portraits[0] = ImageIO.read(ResourceLoader.load("images/OP/portrait/a-sinon.png"));
			portraits[1] = ImageIO.read(ResourceLoader.load("images/OP/portrait/Alice2.png"));
			portraits[2] = ImageIO.read(ResourceLoader.load("images/OP/portrait/Alice3.png"));
			portraits[3] = ImageIO.read(ResourceLoader.load("images/OP/portrait/b-leafa.png"));
			portraits[4] = ImageIO.read(ResourceLoader.load("images/OP/portrait/Eugeo3.png"));
			portraits[5] = ImageIO.read(ResourceLoader.load("images/OP/portrait/friendshipasuna.png"));
			portraits[6] = ImageIO.read(ResourceLoader.load("images/OP/portrait/friendshiplisbeth.png"));
			portraits[7] = ImageIO.read(ResourceLoader.load("images/OP/portrait/friendshipsilica.png"));
			portraits[8] = ImageIO.read(ResourceLoader.load("images/OP/portrait/friendshipyuuki.png"));
			portraits[9] = ImageIO.read(ResourceLoader.load("images/OP/portrait/hw-alice.png"));
			portraits[10] = ImageIO.read(ResourceLoader.load("images/OP/portrait/hw-asuna.png"));
			portraits[11] = ImageIO.read(ResourceLoader.load("images/OP/portrait/hw-eugeo.png"));
			portraits[12] = ImageIO.read(ResourceLoader.load("images/OP/portrait/hw-kirito.png"));
			portraits[13] = ImageIO.read(ResourceLoader.load("images/OP/portrait/hw-leafa.png"));
			portraits[14] = ImageIO.read(ResourceLoader.load("images/OP/portrait/hw-silica.png"));
			portraits[15] = ImageIO.read(ResourceLoader.load("images/OP/portrait/hw-sinon.png"));
			portraits[16] = ImageIO.read(ResourceLoader.load("images/OP/portrait/hw-yuuki.png"));
			portraits[17] = ImageIO.read(ResourceLoader.load("images/OP/portrait/onsen-asuna.png"));
			portraits[18] = ImageIO.read(ResourceLoader.load("images/OP/portrait/onsen-leafa.png"));
			portraits[19] = ImageIO.read(ResourceLoader.load("images/OP/portrait/onsen-silica.png"));
			portraits[20] = ImageIO.read(ResourceLoader.load("images/OP/portrait/onsen-sinon.png"));
			portraits[21] = ImageIO.read(ResourceLoader.load("images/OP/portrait/os-agil.png"));
			portraits[22] = ImageIO.read(ResourceLoader.load("images/OP/portrait/osasuna.png"));
			portraits[23] = ImageIO.read(ResourceLoader.load("images/OP/portrait/os-klein.png"));
			portraits[24] = ImageIO.read(ResourceLoader.load("images/OP/portrait/osk.png"));
			portraits[25] = ImageIO.read(ResourceLoader.load("images/OP/portrait/oss.png"));
			portraits[26] = ImageIO.read(ResourceLoader.load("images/OP/portrait/princess-asuna.png"));
			portraits[27] = ImageIO.read(ResourceLoader.load("images/OP/portrait/rainy-rain.png"));
			portraits[28] = ImageIO.read(ResourceLoader.load("images/OP/portrait/sport-asuna.png"));
			portraits[29] = ImageIO.read(ResourceLoader.load("images/OP/portrait/sport-leafa.png"));
			portraits[30] = ImageIO.read(ResourceLoader.load("images/OP/portrait/sport-lisbeth.png"));
			portraits[31] = ImageIO.read(ResourceLoader.load("images/OP/portrait/sport-yui.png"));
			portraits[32] = ImageIO.read(ResourceLoader.load("images/OP/portrait/TD-kirito.png"));
			portraits[33] = ImageIO.read(ResourceLoader.load("images/OP/portrait/w-asuna.png"));
			portraits[34] = ImageIO.read(ResourceLoader.load("images/OP/portrait/w-kirito.png"));
			portraits[35] = ImageIO.read(ResourceLoader.load("images/OP/portrait/wed-asuna.png"));
			portraits[36] = ImageIO.read(ResourceLoader.load("images/OP/portrait/wed-kirito.png"));

			thumbnails[0] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/a-sinon.png"));
			thumbnails[1] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/Alice2.png"));
			thumbnails[2] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/Alice3.png"));
			thumbnails[3] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/b-leafa.png"));
			thumbnails[4] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/Eugeo3.png"));
			thumbnails[5] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/friendshipasuna.png"));
			thumbnails[6] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/friendshiplisbeth.png"));
			thumbnails[7] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/friendshipsilica.png"));
			thumbnails[8] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/friendshipyuuki.png"));
			thumbnails[9] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/hw-alice.png"));
			thumbnails[10] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/hw-asuna.png"));
			thumbnails[11] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/hw-eugeo.png"));
			thumbnails[12] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/hw-kirito.png"));
			thumbnails[13] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/hw-leafa.png"));
			thumbnails[14] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/hw-silica.png"));
			thumbnails[15] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/hw-sinon.png"));
			thumbnails[16] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/hw-yuuki.png"));
			thumbnails[17] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/onsen-asuna.png"));
			thumbnails[18] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/onsen-leafa.png"));
			thumbnails[19] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/onsen-silica.png"));
			thumbnails[20] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/onsen-sinon.png"));
			thumbnails[21] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/os-agil.png"));
			thumbnails[22] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/os-asuna.png"));
			thumbnails[23] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/os-klein.png"));
			thumbnails[24] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/osk.png"));
			thumbnails[25] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/oss.png"));
			thumbnails[26] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/princess-asuna.png"));
			thumbnails[27] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/rainy-rain.png"));
			thumbnails[28] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/sport-asuna.png"));
			thumbnails[29] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/sport-leafa.png"));
			thumbnails[30] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/sport-lisbeth.png"));
			thumbnails[31] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/sport-yui.png"));
			thumbnails[32] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/TD-kirito.png"));
			thumbnails[33] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/w-asuna.png"));
			thumbnails[34] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/w-kirito.png"));
			thumbnails[35] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/wed-asuna.png"));
			thumbnails[36] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/wed-kirito.png"));

			OP_Banner = ImageIO.read(ResourceLoader.load("images/OP/banner.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		icon = new ImageIcon(getClass().getResource("/images/icon.jpg"));
		Image icons = icon.getImage();
		setIconImage(icons);
		addMouseListener(this);
		CustomCursor();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public void paint(Graphics g) {
		if (progress == 0) {
			super.paint(g);
			titleSound("1");
			g.setColor(Color.black);
			g.fillRect(0, 0, 600, 900);
			sleep(200);
			g.drawImage(intro2, 0, 300, null);
			sleep(1000);
			g.drawImage(intro1, 0, 300, null);
			sleep(500);
			super.paint(g);
			g.drawImage(title, 0, 0, null);
			g.drawImage(titlec, 0, 0, null);
			g.drawImage(intro2, 0, 10, null);
			g.setColor(Color.WHITE);
			g.setFont(arial);
			g.drawString("LINK START", 160, 770);

			int temp = (int) (Math.random() * 3);
			if (temp == 0) {
				asuna_link("1");
			} else if (temp == 1) {
				kirito_link("1");
			} else if (temp == 2) {
				eugeo_link("1");
			}
		} else if (progress == 1) {
			super.paint(g);
			dllo();
			g.setColor(Color.BLACK);
			g.setFont(arial);
			g.drawString("Click", 250, 800);
		} else if (progress == 2) {
			super.paint(g);
			g.drawImage(yuiLoading, 0, 0, null);
			g.drawImage(loading, 100, 700, null);
			g.setFont(new Font("Arial Black", Font.ITALIC, 50));
			g.setColor(Color.white);
			g.drawString("Yui", 350, 610);
			sleep(2000);
			progress = 3;
			gachaSound("1");
			repaint();
		} else if (progress == 3) {
			super.paint(g);
			g.drawImage(bannerback, 0, 0, null);
			if (eventnum == 0) {
				g.drawImage(banner, 50, 100, null);
				g.drawImage(single, 50, 720, null);
				g.drawImage(multi, 325, 720, null);
				g.drawImage(rightarrow, 500, 420, null);
				g.setFont(diamondnum);
				g.drawString("Diamond Cost 0", 110, 815);
				g.drawString("Diamond Cost 0", 385, 815);

			} else if (eventnum == 1) {
				g.drawImage(PoT[0], 50, 100, null);
				if (diamondamt < 25) {
					g.drawImage(nosingle, 50, 720, null);
					g.drawImage(nomulti, 325, 720, null);
				} else if (diamondamt >= 25 && diamondamt < 250) {
					g.drawImage(single, 50, 720, null);
					g.drawImage(nomulti, 325, 720, null);

				} else if (diamondamt >= 250) {
					g.drawImage(single, 50, 720, null);
					g.drawImage(multi, 325, 720, null);
				}
				g.drawImage(leftarrow, 0, 420, null);
				g.drawImage(rightarrow, 500, 420, null);
				g.setFont(diamondnum);
				g.drawString("Diamond Cost 25", 110, 815);
				g.drawString("Diamond Cost 250", 385, 815);
			} else if (eventnum == 2) {
				g.drawImage(Alicization[0], 50, 100, null);
				if (diamondamt < 25) {
					g.drawImage(nosingle, 50, 720, null);
					g.drawImage(nomulti, 325, 720, null);
				} else if (diamondamt >= 25 && diamondamt < 250) {
					g.drawImage(single, 50, 720, null);
					g.drawImage(nomulti, 325, 720, null);

				} else if (diamondamt >= 250) {
					g.drawImage(single, 50, 720, null);
					g.drawImage(multi, 325, 720, null);
				}
				g.drawImage(leftarrow, 0, 420, null);
				g.drawImage(rightarrow, 500, 420, null);
				g.setFont(diamondnum);
				g.drawString("Diamond Cost 25", 110, 815);
				g.drawString("Diamond Cost 250", 385, 815);
			} else if (eventnum == 3) {
				g.drawImage(CelestialDancer[0], 50, 100, null);
				if (diamondamt < 25) {
					g.drawImage(nosingle, 50, 720, null);
					g.drawImage(nomulti, 325, 720, null);
				} else if (diamondamt >= 25 && diamondamt < 250) {
					g.drawImage(single, 50, 720, null);
					g.drawImage(nomulti, 325, 720, null);

				} else if (diamondamt >= 250) {
					g.drawImage(single, 50, 720, null);
					g.drawImage(multi, 325, 720, null);
				}
				g.drawImage(leftarrow, 0, 420, null);
				g.drawImage(rightarrow, 500, 420, null);
				g.setFont(diamondnum);
				g.drawString("Diamond Cost 25", 110, 815);
				g.drawString("Diamond Cost 250", 385, 815);
			} else if (eventnum == 4) {
				g.drawImage(Friendship, 50, 100, null);
				if (diamondamt < 25) {
					g.drawImage(nosingle, 50, 720, null);
					g.drawImage(nomulti, 325, 720, null);
				} else if (diamondamt >= 25 && diamondamt < 250) {
					g.drawImage(single, 50, 720, null);
					g.drawImage(nomulti, 325, 720, null);

				} else if (diamondamt >= 250) {
					g.drawImage(single, 50, 720, null);
					g.drawImage(multi, 325, 720, null);
				}
				g.drawImage(leftarrow, 0, 420, null);
				g.drawImage(rightarrow, 500, 420, null);
				g.setFont(diamondnum);
				g.drawString("Diamond Cost 25", 110, 815);
				g.drawString("Diamond Cost 250", 385, 815);
			}

			else if (eventnum == 5) {
				g.drawImage(OP_Banner, 50, 100, null);
				if (diamondamt < 100) {
					g.drawImage(nosingle, 50, 720, null);
					g.drawImage(nomulti, 325, 720, null);
				} else if (diamondamt >= 100 && diamondamt < 1000) {
					g.drawImage(single, 50, 720, null);
					g.drawImage(nomulti, 325, 720, null);

				} else if (diamondamt >= 1000) {
					g.drawImage(single, 50, 720, null);
					g.drawImage(multi, 325, 720, null);
				}
				g.drawImage(leftarrow, 0, 420, null);
				g.setFont(diamondnum);
				g.drawString("Diamond Cost 100", 110, 815);
				g.drawString("Diamond Cost 1000", 385, 815);
			}

			g.drawImage(diamond, 220, 820, null);
			g.drawImage(diamond, -10, 820, null);
			g.drawImage(diamond, 0, 820, null);
			g.drawImage(diamond, 10, 820, null);
			g.setFont(diamondFont);
			g.setColor(Color.white);
			String str = Integer.toString(diamondamt);
			g.drawString(str, 270, 880);
			progress = 4;

		} else if (progress == 5) {
			super.paint(g);
			g.drawImage(bg, 0, 0, null);
			if (eventnum == 0) {
				bannerone("multi");
				g.drawImage(single, 50, 720, null);
				g.drawImage(multi, 325, 720, null);
				g.setFont(diamondnum);
				g.drawString("Diamond Cost 0", 110, 815);
				g.drawString("Diamond Cost 0", 385, 815);
			} else if (eventnum == 1) {
				proofOfTrust("multi");
				if (diamondamt < 25) {
					g.drawImage(nosingle, 50, 720, null);
					g.drawImage(nomulti, 325, 720, null);
				} else if (diamondamt >= 25 && diamondamt < 250) {
					g.drawImage(single, 50, 720, null);
					g.drawImage(nomulti, 325, 720, null);

				} else if (diamondamt >= 250) {
					g.drawImage(single, 50, 720, null);
					g.drawImage(multi, 325, 720, null);
				}
				g.setFont(diamondnum);
				g.drawString("Diamond Cost 25", 110, 815);
				g.drawString("Diamond Cost 250", 385, 815);
			} else if (eventnum == 2) {
				alicization("multi");
				if (diamondamt < 25) {
					g.drawImage(nosingle, 50, 720, null);
					g.drawImage(nomulti, 325, 720, null);
				} else if (diamondamt >= 25 && diamondamt < 250) {
					g.drawImage(single, 50, 720, null);
					g.drawImage(nomulti, 325, 720, null);

				} else if (diamondamt >= 250) {
					g.drawImage(single, 50, 720, null);
					g.drawImage(multi, 325, 720, null);
				}
				g.setFont(diamondnum);
				g.drawString("Diamond Cost 25", 110, 815);
				g.drawString("Diamond Cost 250", 385, 815);
			} else if (eventnum == 3) {
				celestialdancer("multi");
				if (diamondamt < 25) {
					g.drawImage(nosingle, 50, 720, null);
					g.drawImage(nomulti, 325, 720, null);
				} else if (diamondamt >= 25 && diamondamt < 250) {
					g.drawImage(single, 50, 720, null);
					g.drawImage(nomulti, 325, 720, null);

				} else if (diamondamt >= 250) {
					g.drawImage(single, 50, 720, null);
					g.drawImage(multi, 325, 720, null);
				}
				g.setFont(diamondnum);
				g.drawString("Diamond Cost 25", 110, 815);
				g.drawString("Diamond Cost 250", 385, 815);
			} else if (eventnum == 4) {
				friendship("multi");
				if (diamondamt < 25) {
					g.drawImage(nosingle, 50, 720, null);
					g.drawImage(nomulti, 325, 720, null);
				} else if (diamondamt >= 25 && diamondamt < 250) {
					g.drawImage(single, 50, 720, null);
					g.drawImage(nomulti, 325, 720, null);

				} else if (diamondamt >= 250) {
					g.drawImage(single, 50, 720, null);
					g.drawImage(multi, 325, 720, null);
				}
				g.setFont(diamondnum);
				g.drawString("Diamond Cost 25", 110, 815);
				g.drawString("Diamond Cost 250", 385, 815);
			} else if (eventnum == 5) {
				OP("multi");
				if (diamondamt < 100) {
					g.drawImage(nosingle, 50, 720, null);
					g.drawImage(nomulti, 325, 720, null);
				} else if (diamondamt >= 100 && diamondamt < 1000) {
					g.drawImage(single, 50, 720, null);
					g.drawImage(nomulti, 325, 720, null);

				} else if (diamondamt >= 1000) {
					g.drawImage(single, 50, 720, null);
					g.drawImage(multi, 325, 720, null);
				}
				g.setFont(diamondnum);
				g.drawString("Diamond Cost 100", 110, 815);
				g.drawString("Diamond Cost 1000", 385, 815);
			}
			g.drawImage(diamond, 220, 820, null);
			g.setFont(diamondFont);
			g.setColor(Color.white);
			String str = Integer.toString(diamondamt);
			g.drawString(str, 270, 880);
			progress = 7;

		} else if (progress == 6) {
			super.paint(g);
			g.drawImage(bg, 0, 0, null);
			if (eventnum == 0) {
				bannerone("single");
				g.drawImage(single, 50, 720, null);
				g.drawImage(multi, 325, 720, null);
				g.setFont(diamondnum);
				g.drawString("Diamond Cost 0", 110, 815);
				g.drawString("Diamond Cost 0", 385, 815);
			} else if (eventnum == 1) {
				proofOfTrust("single");
				if (diamondamt < 25) {
					g.drawImage(nosingle, 50, 720, null);
					g.drawImage(nomulti, 325, 720, null);
				} else if (diamondamt >= 25 && diamondamt < 250) {
					g.drawImage(single, 50, 720, null);
					g.drawImage(nomulti, 325, 720, null);

				} else if (diamondamt >= 250) {
					g.drawImage(single, 50, 720, null);
					g.drawImage(multi, 325, 720, null);
				}
				g.setFont(diamondnum);
				g.drawString("Diamond Cost 25", 110, 815);
				g.drawString("Diamond Cost 250", 385, 815);
			} else if (eventnum == 2) {
				alicization("single");
				if (diamondamt < 25) {
					g.drawImage(nosingle, 50, 720, null);
					g.drawImage(nomulti, 325, 720, null);
				} else if (diamondamt >= 25 && diamondamt < 250) {
					g.drawImage(single, 50, 720, null);
					g.drawImage(nomulti, 325, 720, null);

				} else if (diamondamt >= 250) {
					g.drawImage(single, 50, 720, null);
					g.drawImage(multi, 325, 720, null);
				}
				g.setFont(diamondnum);
				g.drawString("Diamond Cost 25", 110, 815);
				g.drawString("Diamond Cost 250", 385, 815);
			} else if (eventnum == 3) {
				celestialdancer("single");
				if (diamondamt < 25) {
					g.drawImage(nosingle, 50, 720, null);
					g.drawImage(nomulti, 325, 720, null);
				} else if (diamondamt >= 25 && diamondamt < 250) {
					g.drawImage(single, 50, 720, null);
					g.drawImage(nomulti, 325, 720, null);

				} else if (diamondamt >= 250) {
					g.drawImage(single, 50, 720, null);
					g.drawImage(multi, 325, 720, null);
				}
				g.setFont(diamondnum);
				g.drawString("Diamond Cost 25", 110, 815);
				g.drawString("Diamond Cost 250", 385, 815);
			} else if (eventnum == 4) {
				friendship("single");
				if (diamondamt < 25) {
					g.drawImage(nosingle, 50, 720, null);
					g.drawImage(nomulti, 325, 720, null);
				} else if (diamondamt >= 25 && diamondamt < 250) {
					g.drawImage(single, 50, 720, null);
					g.drawImage(nomulti, 325, 720, null);

				} else if (diamondamt >= 250) {
					g.drawImage(single, 50, 720, null);
					g.drawImage(multi, 325, 720, null);
				}
				g.setFont(diamondnum);
				g.drawString("Diamond Cost 25", 110, 815);
				g.drawString("Diamond Cost 250", 385, 815);
			} else if (eventnum == 5) {
				OP("single");
				if (diamondamt < 100) {
					g.drawImage(nosingle, 50, 720, null);
					g.drawImage(nomulti, 325, 720, null);
				} else if (diamondamt >= 100 && diamondamt < 1000) {
					g.drawImage(single, 50, 720, null);
					g.drawImage(nomulti, 325, 720, null);

				} else if (diamondamt >= 1000) {
					g.drawImage(single, 50, 720, null);
					g.drawImage(multi, 325, 720, null);
				}
				g.setFont(diamondnum);
				g.drawString("Diamond Cost 100", 110, 815);
				g.drawString("Diamond Cost 1000", 385, 815);
			}
			g.drawImage(diamond, 220, 820, null);
			g.setFont(diamondFont);
			g.setColor(Color.white);
			String str = Integer.toString(diamondamt);
			g.drawString(str, 270, 880);
			progress = 7;
		} else if (progress == 666) {
			g.drawImage(bg, 0, 0, null);
			g.drawImage(diamondshop, 0, 100, null);
			g.drawImage(diamondshop, 0, 350, null);
			g.drawImage(diamondshop, 0, 600, null);
			g.setFont(diamondnum);
			g.setColor(Color.white);
			g.drawString("Get 50 Memory Diamonds", 170, 200);
			g.drawString("Get 400 Memory Diamonds", 170, 450);
			g.drawString("Get 750 Memory Diamonds", 170, 700);
			g.setColor(Color.black);
			g.drawString("Offer A", 150, 150);
			g.drawString("Offer B", 150, 400);
			g.drawString("Offer C", 150, 650);
			g.setColor(Color.orange);
			g.fillRoundRect(420, 200, 150, 50, 20, 20);
			g.fillRoundRect(420, 450, 150, 50, 20, 20);
			g.fillRoundRect(420, 700, 150, 50, 20, 20);
			g.setColor(Color.white);
			g.setFont(diamondFont);
			g.drawString("Buy", 460, 230);
			g.drawString("Buy", 460, 480);
			g.drawString("Buy", 460, 730);

			g.drawImage(leftarrow, 0, 800, null);
			g.drawImage(diamond, 220, 820, null);
			g.setFont(diamondFont);
			g.setColor(Color.white);
			String str = Integer.toString(diamondamt);
			g.drawString(str, 270, 880);
		}
	}

	public void rarity() {
		boolean swapped = true;
		while (swapped) {
			swapped = false;
			for (int i = 1; i < 11; i++) {
				int temp = 0;
				if (rand[i - 1] > rand[i]) {
					temp = rand[i - 1];
					rand[i - 1] = rand[i];
					rand[i] = temp;
					swapped = true;
				}
			}
		}
	}

	public void dllo() {
		int hello = (int) (Math.random() * 3);
		URL link = Main.class.getResource("/images/log in.gif");
		ImageIcon log = new ImageIcon(link);
		logLabel = new JLabel(log);
		getContentPane().add(logLabel);
		logLabel.setBounds(0, 0, 600, 700);
		if (hello == 0) {
			asuna("1");
		} else if (hello == 1) {
			kirito("1");
		} else if (hello == 2) {
			eugeo("1");
		}
	}

	public void sleep(int x) {
		try {
			Thread.sleep(x);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		Graphics g = getGraphics();
		int x = e.getX();
		int y = e.getY();
		if (x > 0 && y > 0 && progress == 0) {
			titleSound("0");
			progress = 1;
			repaint();
		} else if (x > 0 && y > 0 && progress == 1) {
			remove(logLabel);
			progress = 2;
			repaint();
		} else if (x > 0 && x < 85 && y > 820 && y < 900 && progress == 4) {
			progress = 666;
			repaint();

		} else if (x > 420 && x < 570 && y > 200 && y < 250 && progress == 666) {
			g.setColor(Color.white);
			g.fillRoundRect(420, 200, 150, 50, 20, 20);
			g.setColor(Color.black);
			g.setFont(diamondFont);
			g.drawString("Buy", 460, 230);
			diamondamt = diamondamt + 50;
			sleep(500);
			repaint();
		} else if (x > 420 && x < 570 && y > 450 && y < 500 && progress == 666) {
			g.setColor(Color.white);
			g.fillRoundRect(420, 450, 150, 50, 20, 20);
			g.setColor(Color.black);
			g.setFont(diamondFont);
			g.drawString("Buy", 460, 480);
			diamondamt = diamondamt + 400;
			sleep(500);
			repaint();
		} else if (x > 420 && x < 570 && y > 700 && y < 750 && progress == 666) {
			g.setColor(Color.white);
			g.fillRoundRect(420, 700, 150, 50, 20, 20);
			g.setColor(Color.black);
			g.setFont(diamondFont);
			g.drawString("Buy", 460, 730);
			diamondamt = diamondamt + 750;
			sleep(500);
			repaint();
		} else if (x > 0 && x < 100 && y > 800 && y < 860 && progress == 666) {
			progress = 3;
			repaint();
		}

		else if (x > 50 && x < 275 && y > 750 && y < 863 && progress == 4) {
			if (eventnum == 0) {
				g.drawImage(singles, 50, 720, null);
				sleep(500);
				progress = 6;
				repaint();
			} else if (eventnum > 0 && eventnum != 5) {
				if (diamondamt >= 25) {
					g.drawImage(singles, 50, 720, null);
					diamondamt = diamondamt - 25;
					sleep(500);
					progress = 6;
					repaint();
				}
			} else if (eventnum == 5) {
				if (diamondamt >= 100) {
					g.drawImage(singles, 50, 720, null);
					diamondamt = diamondamt - 100;
					sleep(500);
					progress = 6;
					repaint();
				}
			}
		} else if (x > 325 && x < 550 && y > 750 && y < 863 && progress == 4) {
			if (eventnum == 0) {
				g.drawImage(multis, 325, 720, null);
				sleep(500);
				progress = 5;
				repaint();
			} else if (eventnum > 0 && eventnum != 5) {
				if (diamondamt >= 250) {
					g.drawImage(multis, 325, 720, null);
					diamondamt = diamondamt - 250;
					sleep(500);
					progress = 5;
					repaint();
				}
			} else if (eventnum == 5) {
				if (diamondamt >= 1000) {
					g.drawImage(multis, 325, 720, null);
					diamondamt = diamondamt - 1000;
					sleep(500);
					progress = 5;
					repaint();
				}
			}
		} else if (x > 500 && x < 600 && y > 420 && y < 480 && progress == 4 && eventnum == 0) {
			progress = 3;
			eventnum = 1;
			repaint();
		}

		else if (x > 0 && x < 100 && y > 420 && y < 480 && progress == 4 && eventnum == 1) {
			progress = 3;
			eventnum = 0;
			repaint();
		} else if (x > 500 && x < 600 && y > 420 && y < 480 && progress == 4 && eventnum == 1) {
			progress = 3;
			eventnum = 2;
			repaint();
		} else if (x > 500 && x < 600 && y > 420 && y < 480 && progress == 4 && eventnum == 2) {
			progress = 3;
			eventnum = 3;
			repaint();
		} else if (x > 0 && x < 100 && y > 420 && y < 480 && progress == 4 && eventnum == 2) {
			progress = 3;
			eventnum = 1;
			repaint();
		} else if (x > 0 && x < 100 && y > 420 && y < 480 && progress == 4 && eventnum == 3) {
			progress = 3;
			eventnum = 2;
			repaint();
		} else if (x > 500 && x < 600 && y > 420 && y < 480 && progress == 4 && eventnum == 3) {
			progress = 3;
			eventnum = 4;
			repaint();
		} else if (x > 0 && x < 100 && y > 420 && y < 480 && progress == 4 && eventnum == 4) {
			progress = 3;
			eventnum = 3;
			repaint();
		} else if (x > 500 && x < 600 && y > 420 && y < 480 && progress == 4 && eventnum == 4) {
			progress = 3;
			eventnum = 5;
			repaint();
		} else if (x > 0 && x < 100 && y > 420 && y < 480 && progress == 4 && eventnum == 5) {
			progress = 3;
			eventnum = 4;
			repaint();
		} else if (x > 50 && x < 275 && y > 750 && y < 863 && progress == 7) {
			if (eventnum == 0) {
				g.drawImage(singles, 50, 720, null);
				sleep(500);
				progress = 6;
				repaint();
			} else if (eventnum > 0 && eventnum != 5) {
				if (diamondamt >= 25) {
					g.drawImage(singles, 50, 720, null);
					sleep(500);
					diamondamt = diamondamt - 25;
					progress = 6;
					repaint();
				}
			} else if (eventnum == 5) {
				if (diamondamt >= 100) {
					g.drawImage(singles, 50, 720, null);
					sleep(500);
					diamondamt = diamondamt - 100;
					progress = 6;
					repaint();
				}
			}

		} else if (x > 325 && x < 550 && y > 750 && y < 863 && progress == 7)

		{
			if (eventnum == 0) {
				g.drawImage(multis, 325, 720, null);
				sleep(500);
				progress = 5;
				repaint();
			} else if (eventnum > 0 && eventnum != 5) {
				if (diamondamt >= 250) {
					g.drawImage(multis, 325, 720, null);
					sleep(500);
					diamondamt = diamondamt - 250;
					progress = 5;
					repaint();
				}
			} else if (eventnum == 5) {
				if (diamondamt >= 1000) {
					g.drawImage(multis, 325, 720, null);
					sleep(500);
					diamondamt = diamondamt - 1000;
					progress = 5;
					repaint();
				}

			}

		} else if (x > 0 && x < 100 && y > 800 && y < 860 && progress == 7) {
			progress = 3;
			repaint();
		}
	}

	public void titleSound(String x) {
		if (x.equals("1")) {
			try {
				clip[0] = AudioSystem.getClip();
				activeClip[0] = AudioSystem.getAudioInputStream(getClass().getResource("title.wav"));
				clip[0].open(activeClip[0]);
				clip[0].start();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (x.equals("0")) {
			if (x != null) {

				clip[0].stop();

			}

		}
	}

	public void gachaSound(String x) {
		if (x.equals("1")) {
			try {
				clip[1] = AudioSystem.getClip();
				activeClip[1] = AudioSystem.getAudioInputStream(getClass().getResource("gacha.wav"));
				clip[1].open(activeClip[1]);
				clip[1].loop(Clip.LOOP_CONTINUOUSLY);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (x.equals("0")) {
			if (x != null) {

				clip[1].stop();

			}

		}
	}

	public void asuna(String x) {
		if (x.equals("1")) {
			try {
				clip[2] = AudioSystem.getClip();
				activeClip[2] = AudioSystem.getAudioInputStream(getClass().getResource("asuna.wav"));
				clip[2].open(activeClip[2]);
				clip[2].start();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (x.equals("0")) {
			if (x != null) {

				clip[2].stop();

			}

		}
	}

	public void kirito(String x) {
		if (x.equals("1")) {
			try {
				clip[3] = AudioSystem.getClip();
				activeClip[3] = AudioSystem.getAudioInputStream(getClass().getResource("kirito.wav"));
				clip[3].open(activeClip[3]);
				clip[3].start();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (x.equals("0")) {
			if (x != null) {

				clip[3].stop();

			}

		}
	}

	public void eugeo(String x) {
		if (x.equals("1")) {
			try {
				clip[4] = AudioSystem.getClip();
				activeClip[4] = AudioSystem.getAudioInputStream(getClass().getResource("eugeo.wav"));
				clip[4].open(activeClip[4]);
				clip[4].start();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (x.equals("0")) {
			if (x != null) {

				clip[4].stop();

			}

		}
	}

	public void asuna_link(String x) {
		if (x.equals("1")) {
			try {
				clip[5] = AudioSystem.getClip();
				activeClip[5] = AudioSystem.getAudioInputStream(getClass().getResource("link-asuna.wav"));
				clip[5].open(activeClip[5]);
				clip[5].start();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (x.equals("0")) {
			if (x != null) {

				clip[5].stop();

			}

		}
	}

	public void kirito_link(String x) {
		if (x.equals("1")) {
			try {
				clip[6] = AudioSystem.getClip();
				activeClip[6] = AudioSystem.getAudioInputStream(getClass().getResource("link-kirito.wav"));
				clip[6].open(activeClip[6]);
				clip[6].start();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (x.equals("0")) {
			if (x != null) {

				clip[6].stop();

			}

		}
	}

	public void kirito_get(String x) {
		if (x.equals("1")) {
			try {
				clip[7] = AudioSystem.getClip();
				activeClip[7] = AudioSystem.getAudioInputStream(getClass().getResource("kirito-get.wav"));
				clip[7].open(activeClip[7]);
				clip[7].start();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (x.equals("0")) {
			if (x != null) {

				clip[7].stop();

			}

		}
	}

	public void silica_get(String x) {
		if (x.equals("1")) {
			try {
				clip[8] = AudioSystem.getClip();
				activeClip[8] = AudioSystem.getAudioInputStream(getClass().getResource("silica-get.wav"));
				clip[8].open(activeClip[8]);
				clip[8].start();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (x.equals("0")) {
			if (x != null) {

				clip[8].stop();

			}

		}
	}

	public void eugeo_get(String x) {
		if (x.equals("1")) {
			try {
				clip[9] = AudioSystem.getClip();
				activeClip[9] = AudioSystem.getAudioInputStream(getClass().getResource("eugeo-get.wav"));
				clip[9].open(activeClip[9]);
				clip[9].start();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (x.equals("0")) {
			if (x != null) {

				clip[9].stop();

			}

		}
	}

	public void eugeo_link(String x) {
		if (x.equals("1")) {
			try {
				clip[10] = AudioSystem.getClip();
				activeClip[10] = AudioSystem.getAudioInputStream(getClass().getResource("link-eugeo.wav"));
				clip[10].open(activeClip[10]);
				clip[10].start();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (x.equals("0")) {
			if (x != null) {

				clip[10].stop();

			}

		}
	}

	public void wasuna_get(String x) {
		if (x.equals("1")) {
			try {
				clip[11] = AudioSystem.getClip();
				activeClip[11] = AudioSystem.getAudioInputStream(getClass().getResource("asuna-get.wav"));
				clip[11].open(activeClip[11]);
				clip[11].start();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (x.equals("0")) {
			if (x != null) {

				clip[11].stop();

			}

		}
	}

	public void bleafa_get(String x) {
		if (x.equals("1")) {
			try {
				clip[12] = AudioSystem.getClip();
				activeClip[12] = AudioSystem.getAudioInputStream(getClass().getResource("leafa-get.wav"));
				clip[12].open(activeClip[12]);
				clip[12].start();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (x.equals("0")) {
			if (x != null) {

				clip[12].stop();

			}

		}
	}

	public void asinon_get(String x) {
		if (x.equals("1")) {
			try {
				clip[13] = AudioSystem.getClip();
				activeClip[13] = AudioSystem.getAudioInputStream(getClass().getResource("sinon-get.wav"));
				clip[13].open(activeClip[13]);
				clip[13].start();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (x.equals("0")) {
			if (x != null) {

				clip[13].stop();

			}

		}
	}

	public void alice_get(String x) {
		if (x.equals("1")) {
			try {
				clip[14] = AudioSystem.getClip();
				activeClip[14] = AudioSystem.getAudioInputStream(getClass().getResource("alice-get.wav"));
				clip[14].open(activeClip[14]);
				clip[14].start();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (x.equals("0")) {
			if (x != null) {

				clip[14].stop();

			}

		}
	}

	public void yuuki_get(String x) {
		if (x.equals("1")) {
			try {
				clip[15] = AudioSystem.getClip();
				activeClip[15] = AudioSystem.getAudioInputStream(getClass().getResource("yuuki-get.wav"));
				clip[15].open(activeClip[15]);
				clip[15].start();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (x.equals("0")) {
			if (x != null) {

				clip[15].stop();

			}

		}
	}

	public void rain_get(String x) {
		if (x.equals("1")) {
			try {
				clip[16] = AudioSystem.getClip();
				activeClip[16] = AudioSystem.getAudioInputStream(getClass().getResource("rain-get.wav"));
				clip[16].open(activeClip[16]);
				clip[16].start();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (x.equals("0")) {
			if (x != null) {

				clip[16].stop();

			}

		}
	}

	public void philia_get(String x) {
		if (x.equals("1")) {
			try {
				clip[17] = AudioSystem.getClip();
				activeClip[17] = AudioSystem.getAudioInputStream(getClass().getResource("philia-get.wav"));
				clip[17].open(activeClip[17]);
				clip[17].start();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (x.equals("0")) {
			if (x != null) {

				clip[17].stop();

			}

		}
	}

	public void lisbeth_get(String x) {
		if (x.equals("1")) {
			try {
				clip[18] = AudioSystem.getClip();
				activeClip[18] = AudioSystem.getAudioInputStream(getClass().getResource("lisbeth-get.wav"));
				clip[18].open(activeClip[18]);
				clip[18].start();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (x.equals("0")) {
			if (x != null) {

				clip[18].stop();

			}

		}
	}

	public void suguha_get(String x) {
		if (x.equals("1")) {
			try {
				clip[19] = AudioSystem.getClip();
				activeClip[19] = AudioSystem.getAudioInputStream(getClass().getResource("suguha-get.wav"));
				clip[19].open(activeClip[19]);
				clip[19].start();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (x.equals("0")) {
			if (x != null) {

				clip[19].stop();

			}

		}
	}

	public void agil_get(String x) {
		if (x.equals("1")) {
			try {
				clip[20] = AudioSystem.getClip();
				activeClip[20] = AudioSystem.getAudioInputStream(getClass().getResource("agil-get.wav"));
				clip[20].open(activeClip[20]);
				clip[20].start();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (x.equals("0")) {
			if (x != null) {

				clip[20].stop();

			}

		}
	}

	public void klein_get(String x) {
		if (x.equals("1")) {
			try {
				clip[21] = AudioSystem.getClip();
				activeClip[21] = AudioSystem.getAudioInputStream(getClass().getResource("klein-get.wav"));
				clip[21].open(activeClip[21]);
				clip[21].start();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (x.equals("0")) {
			if (x != null) {

				clip[21].stop();

			}

		}
	}

	public void yui_get(String x) {
		if (x.equals("1")) {
			try {
				clip[22] = AudioSystem.getClip();
				activeClip[22] = AudioSystem.getAudioInputStream(getClass().getResource("yui-get.wav"));
				clip[22].open(activeClip[22]);
				clip[22].start();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (x.equals("0")) {
			if (x != null) {

				clip[22].stop();

			}

		}
	}

	public void CustomCursor() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image img = toolkit.getImage(getClass().getResource("cursor.png"));
		Point point = new Point(0, 0);
		Cursor cursor = toolkit.createCustomCursor(img, point, "Cursor");
		setCursor(cursor);
	}

	///////////////////////// Banners//////////////////

	/////////////////// proof of trust banner ////////////////////
	public void proofOfTrust(String y) {
		Graphics g = getGraphics();
		if (y.equals("single")) {
			int lucky = (int) (Math.random() * 200);
			temporary = lucky;
			PoTSingle(temporary);
			g.drawImage(bg, 0, 0, null);
			g.drawImage(result, 0, -50, null);
			if (lucky == 0) {
				g.drawImage(PoT[1], 250, 250, null);
			} else if (lucky == 1) {
				g.drawImage(PoT[3], 250, 250, null);
			} else if (lucky == 2) {
				g.drawImage(PoT[5], 250, 250, null);
			} else if (lucky == 3) {
				g.drawImage(PoT[7], 250, 250, null);

			} else if (lucky == 4) {
				g.drawImage(three, 250, 250, null);
			} else if (lucky == 5) { ///////// add 4 star here
				g.drawImage(five, 250, 250, null);
			} else if (lucky == 6) {
				g.drawImage(PoT[9], 250, 250, null);
			} else if (lucky == 7) {
				g.drawImage(PoT[11], 250, 250, null);
			} else if (lucky == 8) {
				g.drawImage(PoT[13], 250, 250, null);
			} else if (lucky == 9) {
				g.drawImage(PoT[15], 250, 250, null);
			} else if (lucky == 10) {
				g.drawImage(PoT[17], 250, 250, null);
			} else if (lucky == 11) {
				g.drawImage(PoT[19], 250, 250, null);
			} else if (lucky > 11 && lucky <= 21) {
				g.drawImage(fifteen, 250, 250, null);
			} else if (lucky > 21 && lucky <= 31) {
				g.drawImage(twenty, 250, 250, null);

			} else if (lucky > 31 && lucky <= 41) {
				g.drawImage(twentifive, 250, 250, null);

			} else if (lucky > 41 && lucky <= 51) {
				g.drawImage(thirty, 250, 250, null);

			} else if (lucky > 51 && lucky <= 71) {
				g.drawImage(forty, 250, 250, null);

			} else if (lucky > 71 && lucky <= 91) {
				g.drawImage(fifty, 250, 250, null);

			} else if (lucky > 91 && lucky <= 111) {
				g.drawImage(sixty, 250, 250, null);

			} else if (lucky > 111 && lucky <= 131) {
				g.drawImage(seventy, 250, 250, null);

			} else if (lucky > 131 && lucky <= 151) {
				g.drawImage(eighty, 250, 250, null);

			} else if (lucky > 151 && lucky <= 171) {
				g.drawImage(ninty, 250, 250, null);

			} else if (lucky > 171 && lucky <= 191) {
				g.drawImage(hundred, 250, 250, null);

			} else if (lucky > 191) {
				g.drawImage(ten, 250, 250, null);
			}
		} else if (y.equals("multi")) {
			for (int x = 0; x <= 10; x++) {
				int lucky = (int) (Math.random() * 200);
				rand[x] = lucky;
			}
			rarity();
			if (rand[0] <= 11) {
				g.drawImage(yes, 100, 400, null);
				sleep(1000);
				PoTmulti();
			} else if (rand[0] > 11) {
				g.drawImage(nope, 100, 400, null);
				sleep(1000);
			}
			g.drawImage(bg, 0, 0, null);
			g.drawImage(result, 0, -50, null);
			for (int x = 0; x <= 3; x++) {
				if (rand[x] == 0) {
					g.drawImage(PoT[1], x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] == 1) {
					g.drawImage(PoT[3], x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] == 2) {
					g.drawImage(PoT[5], x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] == 3) {
					g.drawImage(PoT[7], x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] == 4) {
					g.drawImage(three, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] == 5) {
					g.drawImage(five, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] == 6) {
					g.drawImage(PoT[9], x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] == 7) {
					g.drawImage(PoT[11], x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] == 8) {
					g.drawImage(PoT[13], x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] == 9) {
					g.drawImage(PoT[15], x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] == 10) {
					g.drawImage(PoT[17], x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] == 11) {
					g.drawImage(PoT[19], x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 11 && rand[x] <= 21) {
					g.drawImage(twentifive, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 21 && rand[x] <= 31) {
					g.drawImage(ten, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 31 && rand[x] <= 41) {
					g.drawImage(fifteen, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 41 && rand[x] <= 51) {
					g.drawImage(twenty, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 51 && rand[x] <= 61) {
					g.drawImage(thirty, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 61 && rand[x] <= 81) {
					g.drawImage(forty, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 81 && rand[x] <= 101) {
					g.drawImage(fifty, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 101 && rand[x] <= 121) {
					g.drawImage(sixty, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 121 && rand[x] <= 141) {
					g.drawImage(seventy, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 141 && rand[x] <= 161) {
					g.drawImage(eighty, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 161 && rand[x] <= 181) {
					g.drawImage(ninty, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 181 && rand[x] <= 200) {
					g.drawImage(hundred, x * 100 + 50 * x + 15, 75, null);
				}
			}
			for (int x = 0; x <= 3; x++) {
				if (rand[x + 4] == 0) {
					g.drawImage(PoT[1], x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] == 1) {
					g.drawImage(PoT[3], x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] == 2) {
					g.drawImage(PoT[5], x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] == 3) {
					g.drawImage(PoT[7], x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] == 4) {
					g.drawImage(three, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] == 5) {
					g.drawImage(five, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] == 6) {
					g.drawImage(PoT[9], x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] == 7) {
					g.drawImage(PoT[11], x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] == 8) {
					g.drawImage(PoT[13], x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] == 9) {
					g.drawImage(PoT[15], x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] == 10) {
					g.drawImage(PoT[17], x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] == 11) {
					g.drawImage(PoT[19], x * 100 + 50 * x + 15, 283, null);
				}

				else if (rand[x + 4] > 11 && rand[x + 4] <= 21) {
					g.drawImage(twentifive, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] > 21 && rand[x + 4] <= 31) {
					g.drawImage(ten, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] > 31 && rand[x + 4] <= 41) {
					g.drawImage(fifteen, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] > 41 && rand[x + 4] <= 51) {
					g.drawImage(twenty, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] > 51 && rand[x + 4] <= 61) {
					g.drawImage(thirty, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] > 61 && rand[x + 4] <= 81) {
					g.drawImage(forty, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] > 81 && rand[x + 4] <= 101) {
					g.drawImage(fifty, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] > 101 && rand[x + 4] <= 121) {
					g.drawImage(sixty, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] > 121 && rand[x + 4] <= 141) {
					g.drawImage(seventy, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] > 141 && rand[x + 4] <= 161) {
					g.drawImage(eighty, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] > 161 && rand[x + 4] <= 181) {
					g.drawImage(ninty, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] > 181 && rand[x + 4] <= 200) {
					g.drawImage(hundred, x * 100 + 50 * x + 15, 283, null);
				}
			}

			for (int x = 0; x <= 2; x++) {
				if (rand[x + 8] == 0) {
					g.drawImage(PoT[1], x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] == 1) {
					g.drawImage(PoT[3], x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] == 2) {
					g.drawImage(PoT[5], x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] == 3) {
					g.drawImage(PoT[7], x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] == 4) {
					g.drawImage(three, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] == 5) {
					g.drawImage(five, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] == 6) {
					g.drawImage(PoT[9], x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] == 7) {
					g.drawImage(PoT[11], x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] == 8) {
					g.drawImage(PoT[13], x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] == 9) {
					g.drawImage(PoT[15], x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] == 10) {
					g.drawImage(PoT[17], x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] == 11) {
					g.drawImage(PoT[19], x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 11 && rand[x + 8] <= 21) {
					g.drawImage(twentifive, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 21 && rand[x + 8] <= 31) {
					g.drawImage(ten, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 31 && rand[x + 8] <= 41) {
					g.drawImage(fifteen, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 41 && rand[x + 8] <= 51) {
					g.drawImage(twenty, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 51 && rand[x + 8] <= 61) {
					g.drawImage(thirty, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 61 && rand[x + 8] <= 81) {
					g.drawImage(forty, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 81 && rand[x + 8] <= 101) {
					g.drawImage(fifty, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 101 && rand[x + 8] <= 121) {
					g.drawImage(sixty, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 121 && rand[x + 8] <= 141) {
					g.drawImage(seventy, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 141 && rand[x + 8] <= 161) {
					g.drawImage(eighty, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 161 && rand[x + 8] <= 181) {
					g.drawImage(ninty, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 181 && rand[x + 8] <= 200) {
					g.drawImage(hundred, x * 100 + 50 * x + 15, 501, null);
				}
			}
		}
		g.drawImage(leftarrow, 0, 800, null);

	}

	/////////////// proof of trust animation /////////////////////
	public void PoTSingle(int t) {
		Graphics g = getGraphics();
		if (t == 0) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(100);
			g.drawImage(c5, 20, 200, null);
			sleep(300);
			kirito_get("1");
			sleep(1000);
			g.drawImage(PoT[2], 0, 200, null);
			sleep(3000);
		} else if (t == 1) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(100);
			g.drawImage(c5, 20, 200, null);
			sleep(300);
			wasuna_get("1");
			sleep(1000);
			g.drawImage(PoT[4], 0, 200, null);
			sleep(3000);
		} else if (t == 2) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(100);
			g.drawImage(c5, 20, 200, null);
			sleep(300);
			bleafa_get("1");
			sleep(1000);
			g.drawImage(PoT[6], 0, 200, null);
			sleep(3000);
		} else if (t == 3) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(100);
			g.drawImage(c5, 20, 200, null);
			sleep(300);
			asinon_get("1");
			sleep(1000);
			g.drawImage(PoT[8], 0, 200, null);
			sleep(3000);
		} else if (t == 4) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(300);
			kirito_get("1");
			sleep(1000);
			g.drawImage(osk, 0, 200, null);
			sleep(3000);
		} else if (t == 5) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(300);
			silica_get("1");
			sleep(1000);
			g.drawImage(oss, 0, 200, null);
			sleep(3000);
		} else if (t == 6) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(300);
			kirito_get("1");
			sleep(1000);
			g.drawImage(PoT[10], 0, 200, null);
			sleep(3000);
		} else if (t == 7) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(300);
			yuuki_get("1");
			sleep(1000);
			g.drawImage(PoT[12], 0, 200, null);
			sleep(3000);
		} else if (t == 8) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(300);
			wasuna_get("1");
			sleep(1000);
			g.drawImage(PoT[14], 0, 200, null);
			sleep(3000);
		} else if (t == 9) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(300);
			alice_get("1");
			sleep(1000);
			g.drawImage(PoT[16], 0, 200, null);
			sleep(3000);
		} else if (t == 10) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(300);
			eugeo_get("1");
			sleep(1000);
			g.drawImage(PoT[18], 0, 200, null);
			sleep(3000);
		} else if (t == 11) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(300);
			rain_get("1");
			sleep(1000);
			g.drawImage(PoT[20], 0, 200, null);
			sleep(3000);
		} else {
			g.drawImage(nope, 100, 400, null);
			sleep(1000);
		}
	}

	public void PoTmulti() {
		Graphics g = getGraphics();
		for (int x = 0; x <= 10; x++) {
			if (rand[x] == 0) {
				sleep(1000);
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(100);
				g.drawImage(c5, 20, 200, null);
				sleep(300);
				kirito_get("1");
				sleep(1000);
				g.drawImage(PoT[2], 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 1) {
				sleep(1000);
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(100);
				g.drawImage(c5, 20, 200, null);
				sleep(300);
				wasuna_get("1");
				sleep(1000);
				g.drawImage(PoT[4], 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 2) {
				sleep(1000);
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(100);
				g.drawImage(c5, 20, 200, null);
				sleep(300);
				bleafa_get("1");
				sleep(1000);
				g.drawImage(PoT[6], 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 3) {
				sleep(1000);
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(100);
				g.drawImage(c5, 20, 200, null);
				sleep(300);
				asinon_get("1");
				sleep(1000);
				g.drawImage(PoT[8], 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 4) {
				sleep(1000);
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(300);
				kirito_get("1");
				sleep(1000);
				g.drawImage(osk, 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 5) {
				sleep(1000);
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(300);
				silica_get("1");
				sleep(1000);
				g.drawImage(oss, 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 6) {
				sleep(1000);
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(300);
				kirito_get("1");
				sleep(1000);
				g.drawImage(PoT[10], 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 7) {
				sleep(1000);
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(300);
				yuuki_get("1");
				sleep(1000);
				g.drawImage(PoT[12], 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 8) {
				sleep(1000);
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(300);
				wasuna_get("1");
				sleep(1000);
				g.drawImage(PoT[14], 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 9) {
				sleep(1000);
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(300);
				alice_get("1");
				sleep(1000);
				g.drawImage(PoT[16], 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 10) {
				sleep(1000);
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(300);
				eugeo_get("1");
				sleep(1000);
				g.drawImage(PoT[18], 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 11) {
				sleep(1000);
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(300);
				rain_get("1");
				sleep(1000);
				g.drawImage(PoT[20], 0, 200, null);
				sleep(3000);
			}
		}
	}

	////////////// free banner animation ////////////////////////////////
	public void animationSingle(int t) {
		Graphics g = getGraphics();
		if (t <= 1) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(100);
			g.drawImage(c5, 20, 200, null);
			sleep(300);
			eugeo_get("1");
			sleep(1000);
			g.drawImage(eugeo5, 0, 200, null);
			sleep(3000);
		} else if (t == 2 || t == 3) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(300);
			kirito_get("1");
			sleep(1000);
			g.drawImage(osk, 0, 200, null);
			sleep(3000);
		} else if (t == 4 || t == 5) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(300);
			silica_get("1");
			sleep(1000);
			g.drawImage(oss, 0, 200, null);
			sleep(3000);
		} else {
			g.drawImage(nope, 100, 400, null);
			sleep(1000);
		}
	}

	public void animationMulti() {
		Graphics g = getGraphics();
		for (int x = 0; x <= 10; x++) {
			if (rand[x] <= 1) {
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(100);
				g.drawImage(c5, 20, 200, null);
				sleep(300);
				eugeo_get("1");
				sleep(1000);
				g.drawImage(eugeo5, 0, 200, null);
				sleep(3000);
			} else if (rand[x] > 1 && rand[x] <= 3) {
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(300);
				kirito_get("1");
				sleep(1000);
				g.drawImage(osk, 0, 200, null);
				sleep(3000);
			} else if (rand[x] > 3 && rand[x] <= 5) {
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(300);
				silica_get("1");
				sleep(1000);
				g.drawImage(oss, 0, 200, null);
				sleep(3000);
			}
		}
	}

	////////////// free banner /////////////////
	public void bannerone(String y) {
		Graphics g = getGraphics();
		if (y.equals("single")) {
			int lucky = (int) (Math.random() * 100);
			temporary = lucky;
			animationSingle(temporary);
			g.drawImage(bg, 0, 0, null);
			g.drawImage(result, 0, -50, null);
			if (lucky == 0 || lucky == 1) {
				g.drawImage(one, 250, 250, null);
			} else if (lucky == 2 || lucky == 3) {
				g.drawImage(three, 250, 250, null);
			} else if (lucky == 4 || lucky == 5) {
				g.drawImage(five, 250, 250, null);
			} else if (lucky > 5 && lucky < 11) {
				g.drawImage(ten, 250, 250, null);

			} else if (lucky > 10 && lucky < 16) {
				g.drawImage(fifteen, 250, 250, null);
			} else if (lucky > 15 && lucky < 21) {
				g.drawImage(twenty, 250, 250, null);

			} else if (lucky > 20 && lucky < 26) {
				g.drawImage(twentifive, 250, 250, null);

			} else if (lucky > 25 && lucky < 31) {
				g.drawImage(thirty, 250, 250, null);

			} else if (lucky > 30 && lucky < 41) {
				g.drawImage(forty, 250, 250, null);

			} else if (lucky > 40 && lucky < 51) {
				g.drawImage(fifty, 250, 250, null);

			} else if (lucky > 50 && lucky < 61) {
				g.drawImage(sixty, 250, 250, null);

			} else if (lucky > 60 && lucky < 71) {
				g.drawImage(seventy, 250, 250, null);

			} else if (lucky > 70 && lucky < 81) {
				g.drawImage(eighty, 250, 250, null);

			} else if (lucky > 80 && lucky < 91) {
				g.drawImage(ninty, 250, 250, null);

			} else if (lucky > 90 && lucky <= 99) {
				g.drawImage(hundred, 250, 250, null);

			}
		} else if (y.equals("multi")) {
			for (int x = 0; x <= 10; x++) {
				int lucky = (int) (Math.random() * 100);
				rand[x] = lucky;
			}
			rarity();
			if (rand[0] <= 5) {
				g.drawImage(yes, 100, 400, null);
				sleep(1000);
				animationMulti();
			} else if (rand[0] > 5) {
				g.drawImage(nope, 100, 400, null);
				sleep(1000);
			}
			g.drawImage(bg, 0, 0, null);
			g.drawImage(result, 0, -50, null);
			for (int x = 0; x <= 3; x++) {
				if (rand[x] <= 1) {
					g.drawImage(one, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] == 2 || rand[x] == 3) {
					g.drawImage(three, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] == 4 || rand[x] == 5) {
					g.drawImage(five, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 5 && rand[x] <= 10) {
					g.drawImage(ten, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 10 && rand[x] <= 15) {
					g.drawImage(fifteen, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 15 && rand[x] <= 20) {
					g.drawImage(twenty, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 20 && rand[x] <= 25) {
					g.drawImage(twentifive, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 25 && rand[x] <= 30) {
					g.drawImage(thirty, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 30 && rand[x] <= 40) {
					g.drawImage(forty, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 40 && rand[x] <= 50) {
					g.drawImage(fifty, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 50 && rand[x] <= 60) {
					g.drawImage(sixty, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 60 && rand[x] <= 70) {
					g.drawImage(seventy, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 70 && rand[x] <= 80) {
					g.drawImage(eighty, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 80 && rand[x] <= 90) {
					g.drawImage(ninty, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 90 && rand[x] <= 99) {
					g.drawImage(hundred, x * 100 + 50 * x + 15, 75, null);
				}
			}
			for (int x = 0; x <= 3; x++) {
				if (rand[x + 4] <= 1) {
					g.drawImage(one, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] == 2 || rand[x + 4] == 3) {
					g.drawImage(three, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] == 4 || rand[x + 4] == 5) {
					g.drawImage(five, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] > 5 && rand[x + 4] <= 10) {
					g.drawImage(ten, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] > 10 && rand[x + 4] <= 15) {
					g.drawImage(fifteen, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] > 15 && rand[x + 4] <= 20) {
					g.drawImage(twenty, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] > 20 && rand[x + 4] <= 25) {
					g.drawImage(twentifive, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] > 25 && rand[x + 4] <= 30) {
					g.drawImage(thirty, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] > 30 && rand[x + 4] <= 40) {
					g.drawImage(forty, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] > 40 && rand[x + 4] <= 50) {
					g.drawImage(fifty, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] > 50 && rand[x + 4] <= 60) {
					g.drawImage(sixty, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] > 60 && rand[x + 4] <= 70) {
					g.drawImage(seventy, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] > 70 && rand[x + 4] <= 80) {
					g.drawImage(eighty, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] > 80 && rand[x + 4] <= 90) {
					g.drawImage(ninty, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] > 90 && rand[x + 4] <= 99) {
					g.drawImage(hundred, x * 100 + 50 * x + 15, 283, null);
				}
			}

			for (int x = 0; x <= 2; x++) {
				if (rand[x + 8] <= 1) {
					g.drawImage(one, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] == 2 || rand[x + 8] == 3) {
					g.drawImage(three, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] == 4 || rand[x + 8] == 5) {
					g.drawImage(five, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 5 && rand[x + 8] <= 10) {
					g.drawImage(ten, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 10 && rand[x + 8] <= 15) {
					g.drawImage(fifteen, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 15 && rand[x + 8] <= 20) {
					g.drawImage(twenty, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 20 && rand[x + 8] <= 25) {
					g.drawImage(twentifive, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 25 && rand[x + 8] <= 30) {
					g.drawImage(thirty, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 30 && rand[x + 8] <= 40) {
					g.drawImage(forty, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 40 && rand[x + 8] <= 50) {
					g.drawImage(fifty, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 50 && rand[x + 8] <= 60) {
					g.drawImage(sixty, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 60 && rand[x + 8] <= 70) {
					g.drawImage(seventy, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 70 && rand[x + 8] <= 80) {
					g.drawImage(eighty, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 80 && rand[x + 8] <= 90) {
					g.drawImage(ninty, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 90 && rand[x + 8] <= 99) {
					g.drawImage(hundred, x * 100 + 50 * x + 15, 501, null);
				}
			}
		}
		g.drawImage(leftarrow, 0, 800, null);
	}

	////////////////////////////////// Alicization 3 banner
	////////////////////////////////// //////////////////////
	public void alicization(String y) {
		Graphics g = getGraphics();
		if (y.equals("single")) {
			int lucky = (int) (Math.random() * 100);
			temporary = lucky;
			alicizationanimation(temporary);
			g.drawImage(bg, 0, 0, null);
			g.drawImage(result, 0, -50, null);
			if (lucky == 0) {
				g.drawImage(Alicization[9], 250, 250, null);
			} else if (lucky == 1) {
				g.drawImage(Alicization[12], 250, 250, null);
			} else if (lucky == 2) {
				g.drawImage(Alicization[7], 250, 250, null);
			} else if (lucky == 3) {
				g.drawImage(Alicization[8], 250, 250, null);
			} else if (lucky == 4) {
				g.drawImage(Alicization[10], 250, 250, null);
			} else if (lucky == 5) {
				g.drawImage(Alicization[11], 250, 250, null);
			} else if (lucky > 5 && lucky < 11) {
				g.drawImage(ten, 250, 250, null);

			} else if (lucky > 10 && lucky < 16) {
				g.drawImage(fifteen, 250, 250, null);
			} else if (lucky > 15 && lucky < 21) {
				g.drawImage(twenty, 250, 250, null);

			} else if (lucky > 20 && lucky < 26) {
				g.drawImage(twentifive, 250, 250, null);

			} else if (lucky > 25 && lucky < 31) {
				g.drawImage(thirty, 250, 250, null);

			} else if (lucky > 30 && lucky < 41) {
				g.drawImage(forty, 250, 250, null);

			} else if (lucky > 40 && lucky < 51) {
				g.drawImage(fifty, 250, 250, null);

			} else if (lucky > 50 && lucky < 61) {
				g.drawImage(sixty, 250, 250, null);

			} else if (lucky > 60 && lucky < 71) {
				g.drawImage(seventy, 250, 250, null);

			} else if (lucky > 70 && lucky < 81) {
				g.drawImage(eighty, 250, 250, null);

			} else if (lucky > 80 && lucky < 91) {
				g.drawImage(ninty, 250, 250, null);

			} else if (lucky > 90 && lucky <= 99) {
				g.drawImage(hundred, 250, 250, null);

			}
		} else if (y.equals("multi")) {
			for (int x = 0; x <= 10; x++) {
				int lucky = (int) (Math.random() * 100);
				rand[x] = lucky;
			}
			rarity();
			if (rand[0] <= 5) {
				g.drawImage(yes, 100, 400, null);
				sleep(1000);
				alicizationanimationMulti();
			} else if (rand[0] > 5) {
				g.drawImage(nope, 100, 400, null);
				sleep(1000);
			}
			g.drawImage(bg, 0, 0, null);
			g.drawImage(result, 0, -50, null);
			for (int x = 0; x <= 3; x++) {
				if (rand[x] == 0) {
					g.drawImage(Alicization[9], x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] == 1) {
					g.drawImage(Alicization[12], x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] == 2) {
					g.drawImage(Alicization[7], x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] == 3) {
					g.drawImage(Alicization[8], x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] == 4) {
					g.drawImage(Alicization[10], x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] == 5) {
					g.drawImage(Alicization[11], x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 5 && rand[x] <= 10) {
					g.drawImage(ten, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 10 && rand[x] <= 15) {
					g.drawImage(fifteen, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 15 && rand[x] <= 20) {
					g.drawImage(twenty, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 20 && rand[x] <= 25) {
					g.drawImage(twentifive, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 25 && rand[x] <= 30) {
					g.drawImage(thirty, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 30 && rand[x] <= 40) {
					g.drawImage(forty, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 40 && rand[x] <= 50) {
					g.drawImage(fifty, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 50 && rand[x] <= 60) {
					g.drawImage(sixty, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 60 && rand[x] <= 70) {
					g.drawImage(seventy, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 70 && rand[x] <= 80) {
					g.drawImage(eighty, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 80 && rand[x] <= 90) {
					g.drawImage(ninty, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 90 && rand[x] <= 99) {
					g.drawImage(hundred, x * 100 + 50 * x + 15, 75, null);
				}
			}
			for (int x = 0; x <= 3; x++) {
				if (rand[x + 4] == 0) {
					g.drawImage(Alicization[9], x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] == 1) {
					g.drawImage(Alicization[12], x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] == 2) {
					g.drawImage(Alicization[7], x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] == 3) {
					g.drawImage(Alicization[8], x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] == 4) {
					g.drawImage(Alicization[10], x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] == 5) {
					g.drawImage(Alicization[11], x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] > 5 && rand[x + 4] <= 10) {
					g.drawImage(ten, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] > 10 && rand[x + 4] <= 15) {
					g.drawImage(fifteen, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] > 15 && rand[x + 4] <= 20) {
					g.drawImage(twenty, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] > 20 && rand[x + 4] <= 25) {
					g.drawImage(twentifive, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] > 25 && rand[x + 4] <= 30) {
					g.drawImage(thirty, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] > 30 && rand[x + 4] <= 40) {
					g.drawImage(forty, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] > 40 && rand[x + 4] <= 50) {
					g.drawImage(fifty, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] > 50 && rand[x + 4] <= 60) {
					g.drawImage(sixty, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] > 60 && rand[x + 4] <= 70) {
					g.drawImage(seventy, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] > 70 && rand[x + 4] <= 80) {
					g.drawImage(eighty, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] > 80 && rand[x + 4] <= 90) {
					g.drawImage(ninty, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] > 90 && rand[x + 4] <= 99) {
					g.drawImage(hundred, x * 100 + 50 * x + 15, 283, null);
				}
			}

			for (int x = 0; x <= 2; x++) {
				if (rand[x + 8] == 0) {
					g.drawImage(Alicization[9], x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] == 1) {
					g.drawImage(Alicization[12], x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] == 2) {
					g.drawImage(Alicization[7], x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] == 3) {
					g.drawImage(Alicization[8], x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] == 4) {
					g.drawImage(Alicization[10], x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] == 5) {
					g.drawImage(Alicization[11], x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 5 && rand[x + 8] <= 10) {
					g.drawImage(ten, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 10 && rand[x + 8] <= 15) {
					g.drawImage(fifteen, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 15 && rand[x + 8] <= 20) {
					g.drawImage(twenty, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 20 && rand[x + 8] <= 25) {
					g.drawImage(twentifive, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 25 && rand[x + 8] <= 30) {
					g.drawImage(thirty, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 30 && rand[x + 8] <= 40) {
					g.drawImage(forty, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 40 && rand[x + 8] <= 50) {
					g.drawImage(fifty, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 50 && rand[x + 8] <= 60) {
					g.drawImage(sixty, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 60 && rand[x + 8] <= 70) {
					g.drawImage(seventy, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 70 && rand[x + 8] <= 80) {
					g.drawImage(eighty, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 80 && rand[x + 8] <= 90) {
					g.drawImage(ninty, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 90 && rand[x + 8] <= 99) {
					g.drawImage(hundred, x * 100 + 50 * x + 15, 501, null);
				}
			}
		}
		g.drawImage(leftarrow, 0, 800, null);
	}

	////////////////////////////////////////// Alicization 3 animation
	////////////////////////////////////////// ///////////////////////
	public void alicizationanimation(int z) {
		Graphics g = getGraphics();
		if (z == 0) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(100);
			g.drawImage(c5, 20, 200, null);
			sleep(300);
			eugeo_get("1");
			sleep(1000);
			g.drawImage(Alicization[3], 0, 200, null);
			sleep(3000);
		} else if (z == 1) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(100);
			g.drawImage(c5, 20, 200, null);
			sleep(300);
			alice_get("1");
			sleep(1000);
			g.drawImage(Alicization[6], 0, 200, null);
			sleep(3000);
		}

		else if (z == 2) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(300);
			eugeo_get("1");
			sleep(1000);
			g.drawImage(Alicization[1], 0, 200, null);
			sleep(3000);
		} else if (z == 3) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(300);
			eugeo_get("1");
			sleep(1000);
			g.drawImage(Alicization[2], 0, 200, null);
			sleep(3000);
		} else if (z == 4) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(300);
			alice_get("1");
			sleep(1000);
			g.drawImage(Alicization[4], 0, 200, null);
			sleep(3000);
		} else if (z == 5) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(300);
			alice_get("1");
			sleep(1000);
			g.drawImage(Alicization[5], 0, 200, null);
			sleep(3000);
		} else {
			g.drawImage(nope, 100, 400, null);
			sleep(1000);
		}
	}

	public void alicizationanimationMulti() {
		Graphics g = getGraphics();
		for (int x = 0; x <= 10; x++) {
			if (rand[x] == 0) {
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(100);
				g.drawImage(c5, 20, 200, null);
				sleep(300);
				eugeo_get("1");
				sleep(1000);
				g.drawImage(Alicization[3], 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 1) {
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(100);
				g.drawImage(c5, 20, 200, null);
				sleep(300);
				alice_get("1");
				sleep(1000);
				g.drawImage(Alicization[6], 0, 200, null);
				sleep(3000);
			}

			else if (rand[x] == 2) {
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(300);
				eugeo_get("1");
				sleep(1000);
				g.drawImage(Alicization[1], 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 3) {
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(300);
				eugeo_get("1");
				sleep(1000);
				g.drawImage(Alicization[2], 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 4) {
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(300);
				alice_get("1");
				sleep(1000);
				g.drawImage(Alicization[4], 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 5) {
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(300);
				alice_get("1");
				sleep(1000);
				g.drawImage(Alicization[5], 0, 200, null);
				sleep(3000);
			}
		}

	}

	////////////////////////////////////////// Celestial Dancer Banner
	////////////////////////////////////////// ////////////////////////
	public void celestialdancer(String y) {
		Graphics g = getGraphics();
		if (y.equals("single")) {
			int lucky = (int) (Math.random() * 100);
			temporary = lucky;
			celestialdanceranimation(temporary);
			g.drawImage(bg, 0, 0, null);
			g.drawImage(result, 0, -50, null);
			if (lucky == 0) {
				g.drawImage(CelestialDancer[4], 250, 250, null);
			} else if (lucky == 1) {
				g.drawImage(CelestialDancer[5], 250, 250, null);
			} else if (lucky == 2 || lucky == 3) {
				g.drawImage(CelestialDancer[6], 250, 250, null);
			} else if (lucky > 3 && lucky < 11) {
				g.drawImage(ten, 250, 250, null);

			} else if (lucky > 10 && lucky < 16) {
				g.drawImage(fifteen, 250, 250, null);
			} else if (lucky > 15 && lucky < 21) {
				g.drawImage(twenty, 250, 250, null);

			} else if (lucky > 20 && lucky < 26) {
				g.drawImage(twentifive, 250, 250, null);

			} else if (lucky > 25 && lucky < 31) {
				g.drawImage(thirty, 250, 250, null);

			} else if (lucky > 30 && lucky < 41) {
				g.drawImage(forty, 250, 250, null);

			} else if (lucky > 40 && lucky < 51) {
				g.drawImage(fifty, 250, 250, null);

			} else if (lucky > 50 && lucky < 61) {
				g.drawImage(sixty, 250, 250, null);

			} else if (lucky > 60 && lucky < 71) {
				g.drawImage(seventy, 250, 250, null);

			} else if (lucky > 70 && lucky < 81) {
				g.drawImage(eighty, 250, 250, null);

			} else if (lucky > 80 && lucky < 91) {
				g.drawImage(ninty, 250, 250, null);

			} else if (lucky > 90 && lucky <= 99) {
				g.drawImage(hundred, 250, 250, null);

			}
		} else if (y.equals("multi")) {
			for (int x = 0; x <= 10; x++) {
				int lucky = (int) (Math.random() * 100);
				rand[x] = lucky;
			}
			rarity();
			if (rand[0] <= 3) {
				g.drawImage(yes, 100, 400, null);
				sleep(1000);
				celestialdanceranimationMulti();
			} else if (rand[0] > 3) {
				g.drawImage(nope, 100, 400, null);
				sleep(1000);
			}
			g.drawImage(bg, 0, 0, null);
			g.drawImage(result, 0, -50, null);
			for (int x = 0; x <= 3; x++) {
				if (rand[x] == 0) {
					g.drawImage(CelestialDancer[4], x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] == 1) {
					g.drawImage(CelestialDancer[5], x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] == 2 || rand[x] == 3) {
					g.drawImage(CelestialDancer[6], x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 3 && rand[x] <= 10) {
					g.drawImage(ten, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 10 && rand[x] <= 15) {
					g.drawImage(fifteen, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 15 && rand[x] <= 20) {
					g.drawImage(twenty, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 20 && rand[x] <= 25) {
					g.drawImage(twentifive, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 25 && rand[x] <= 30) {
					g.drawImage(thirty, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 30 && rand[x] <= 40) {
					g.drawImage(forty, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 40 && rand[x] <= 50) {
					g.drawImage(fifty, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 50 && rand[x] <= 60) {
					g.drawImage(sixty, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 60 && rand[x] <= 70) {
					g.drawImage(seventy, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 70 && rand[x] <= 80) {
					g.drawImage(eighty, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 80 && rand[x] <= 90) {
					g.drawImage(ninty, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 90 && rand[x] <= 99) {
					g.drawImage(hundred, x * 100 + 50 * x + 15, 75, null);
				}
			}
			for (int x = 0; x <= 3; x++) {
				if (rand[x + 4] == 0) {
					g.drawImage(CelestialDancer[4], x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] == 1) {
					g.drawImage(CelestialDancer[5], x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] == 2 || rand[x + 4] == 3) {
					g.drawImage(CelestialDancer[6], x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] > 3 && rand[x + 4] <= 10) {
					g.drawImage(ten, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] > 10 && rand[x + 4] <= 15) {
					g.drawImage(fifteen, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] > 15 && rand[x + 4] <= 20) {
					g.drawImage(twenty, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] > 20 && rand[x + 4] <= 25) {
					g.drawImage(twentifive, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] > 25 && rand[x + 4] <= 30) {
					g.drawImage(thirty, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] > 30 && rand[x + 4] <= 40) {
					g.drawImage(forty, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] > 40 && rand[x + 4] <= 50) {
					g.drawImage(fifty, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] > 50 && rand[x + 4] <= 60) {
					g.drawImage(sixty, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] > 60 && rand[x + 4] <= 70) {
					g.drawImage(seventy, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] > 70 && rand[x + 4] <= 80) {
					g.drawImage(eighty, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] > 80 && rand[x + 4] <= 90) {
					g.drawImage(ninty, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] > 90 && rand[x + 4] <= 99) {
					g.drawImage(hundred, x * 100 + 50 * x + 15, 283, null);
				}
			}

			for (int x = 0; x <= 2; x++) {
				if (rand[x + 8] == 0) {
					g.drawImage(CelestialDancer[4], x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] == 1) {
					g.drawImage(CelestialDancer[5], x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] == 2 || rand[x + 8] == 3) {
					g.drawImage(CelestialDancer[6], x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 3 && rand[x + 8] <= 10) {
					g.drawImage(ten, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 10 && rand[x + 8] <= 15) {
					g.drawImage(fifteen, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 15 && rand[x + 8] <= 20) {
					g.drawImage(twenty, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 20 && rand[x + 8] <= 25) {
					g.drawImage(twentifive, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 25 && rand[x + 8] <= 30) {
					g.drawImage(thirty, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 30 && rand[x + 8] <= 40) {
					g.drawImage(forty, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 40 && rand[x + 8] <= 50) {
					g.drawImage(fifty, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 50 && rand[x + 8] <= 60) {
					g.drawImage(sixty, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 60 && rand[x + 8] <= 70) {
					g.drawImage(seventy, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 70 && rand[x + 8] <= 80) {
					g.drawImage(eighty, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 80 && rand[x + 8] <= 90) {
					g.drawImage(ninty, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 90 && rand[x + 8] <= 99) {
					g.drawImage(hundred, x * 100 + 50 * x + 15, 501, null);
				}
			}
		}
		g.drawImage(leftarrow, 0, 800, null);
	}

	//////////////////////////////// Celestial Dancer animation
	//////////////////////////////// ////////////////////////////////
	//////////////////////////////// /////////////////////////
	public void celestialdanceranimation(int z) {
		Graphics g = getGraphics();
		if (z == 0) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(300);
			yuuki_get("1");
			sleep(1000);
			g.drawImage(CelestialDancer[1], 0, 200, null);
			sleep(3000);
		} else if (z == 1) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(300);
			silica_get("1");
			sleep(1000);
			g.drawImage(CelestialDancer[2], 0, 200, null);
			sleep(3000);
		}
		if (z == 2 || z == 3) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(300);
			philia_get("1");
			sleep(1000);
			g.drawImage(CelestialDancer[3], 0, 200, null);
			sleep(3000);
		} else {
			g.drawImage(nope, 100, 400, null);
			sleep(1000);
		}
	}

	public void celestialdanceranimationMulti() {
		Graphics g = getGraphics();
		for (int x = 0; x <= 10; x++) {
			if (rand[x] == 0) {
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(300);
				yuuki_get("1");
				sleep(1000);
				g.drawImage(CelestialDancer[1], 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 1) {
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(300);
				silica_get("1");
				sleep(1000);
				g.drawImage(CelestialDancer[2], 0, 200, null);
				sleep(3000);
			}

			else if (rand[x] == 2 || rand[x] == 3) {
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(300);
				philia_get("1");
				sleep(1000);
				g.drawImage(CelestialDancer[3], 0, 200, null);
				sleep(3000);
			}
		}
	}

	///////////////////////// Friendship Banner
	///////////////////////// ///////////////////////////////////////
	public void friendship(String y) {
		Graphics g = getGraphics();
		if (y.equals("single")) {
			int lucky = (int) (Math.random() * 200);
			temporary = lucky;
			friendshipSingle(temporary);
			g.drawImage(bg, 0, 0, null);
			g.drawImage(result, 0, -50, null);
			if (lucky == 0) {
				g.drawImage(friendshipthumbnail[0], 250, 250, null);
			} else if (lucky == 1) {
				g.drawImage(friendshipthumbnail[1], 250, 250, null);
			} else if (lucky == 2) {
				g.drawImage(friendshipthumbnail[2], 250, 250, null);
			} else if (lucky == 3) {
				g.drawImage(friendshipthumbnail[3], 250, 250, null);
			} else if (lucky == 4) {
				g.drawImage(friendshipthumbnail[4], 250, 250, null);
			} else if (lucky == 5) { ///////// add 4 star here
				g.drawImage(friendshipthumbnail[5], 250, 250, null);
			} else if (lucky == 6) {
				g.drawImage(friendshipthumbnail[6], 250, 250, null);
			} else if (lucky == 7) {
				g.drawImage(friendshipthumbnail[7], 250, 250, null);
			} else if (lucky == 8) {
				g.drawImage(friendshipthumbnail[8], 250, 250, null);
			} else if (lucky == 9) {
				g.drawImage(friendshipthumbnail[9], 250, 250, null);
			} else if (lucky == 10) {
				g.drawImage(friendshipthumbnail[10], 250, 250, null);
			} else if (lucky == 11) {
				g.drawImage(friendshipthumbnail[11], 250, 250, null);
			} else if (lucky > 11 && lucky <= 21) {
				g.drawImage(fifteen, 250, 250, null);
			} else if (lucky > 21 && lucky <= 31) {
				g.drawImage(twenty, 250, 250, null);

			} else if (lucky > 31 && lucky <= 41) {
				g.drawImage(twentifive, 250, 250, null);

			} else if (lucky > 41 && lucky <= 51) {
				g.drawImage(thirty, 250, 250, null);

			} else if (lucky > 51 && lucky <= 71) {
				g.drawImage(forty, 250, 250, null);

			} else if (lucky > 71 && lucky <= 91) {
				g.drawImage(fifty, 250, 250, null);

			} else if (lucky > 91 && lucky <= 111) {
				g.drawImage(sixty, 250, 250, null);

			} else if (lucky > 111 && lucky <= 131) {
				g.drawImage(seventy, 250, 250, null);

			} else if (lucky > 131 && lucky <= 151) {
				g.drawImage(eighty, 250, 250, null);

			} else if (lucky > 151 && lucky <= 171) {
				g.drawImage(ninty, 250, 250, null);

			} else if (lucky > 171 && lucky <= 191) {
				g.drawImage(hundred, 250, 250, null);

			} else if (lucky > 191) {
				g.drawImage(ten, 250, 250, null);
			}
		} else if (y.equals("multi")) {
			for (int x = 0; x <= 10; x++) {
				int lucky = (int) (Math.random() * 200);
				rand[x] = lucky;
			}
			rarity();
			if (rand[0] <= 11) {
				g.drawImage(yes, 100, 400, null);
				sleep(1000);
				friendshipmulti();
			} else if (rand[0] > 11) {
				g.drawImage(nope, 100, 400, null);
				sleep(1000);
			}
			g.drawImage(bg, 0, 0, null);
			g.drawImage(result, 0, -50, null);
			for (int x = 0; x <= 3; x++) {
				if (rand[x] == 0) {
					g.drawImage(friendshipthumbnail[0], x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] == 1) {
					g.drawImage(friendshipthumbnail[1], x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] == 2) {
					g.drawImage(friendshipthumbnail[2], x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] == 3) {
					g.drawImage(friendshipthumbnail[3], x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] == 4) {
					g.drawImage(friendshipthumbnail[4], x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] == 5) {
					g.drawImage(friendshipthumbnail[5], x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] == 6) {
					g.drawImage(friendshipthumbnail[6], x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] == 7) {
					g.drawImage(friendshipthumbnail[7], x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] == 8) {
					g.drawImage(friendshipthumbnail[8], x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] == 9) {
					g.drawImage(friendshipthumbnail[9], x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] == 10) {
					g.drawImage(friendshipthumbnail[10], x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] == 11) {
					g.drawImage(friendshipthumbnail[11], x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 11 && rand[x] <= 21) {
					g.drawImage(twentifive, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 21 && rand[x] <= 31) {
					g.drawImage(ten, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 31 && rand[x] <= 41) {
					g.drawImage(fifteen, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 41 && rand[x] <= 51) {
					g.drawImage(twenty, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 51 && rand[x] <= 61) {
					g.drawImage(thirty, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 61 && rand[x] <= 81) {
					g.drawImage(forty, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 81 && rand[x] <= 101) {
					g.drawImage(fifty, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 101 && rand[x] <= 121) {
					g.drawImage(sixty, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 121 && rand[x] <= 141) {
					g.drawImage(seventy, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 141 && rand[x] <= 161) {
					g.drawImage(eighty, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 161 && rand[x] <= 181) {
					g.drawImage(ninty, x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] > 181 && rand[x] <= 200) {
					g.drawImage(hundred, x * 100 + 50 * x + 15, 75, null);
				}
			}
			for (int x = 0; x <= 3; x++) {
				if (rand[x + 4] == 0) {
					g.drawImage(friendshipthumbnail[0], x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] == 1) {
					g.drawImage(friendshipthumbnail[1], x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] == 2) {
					g.drawImage(friendshipthumbnail[2], x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] == 3) {
					g.drawImage(friendshipthumbnail[3], x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] == 4) {
					g.drawImage(friendshipthumbnail[4], x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] == 5) {
					g.drawImage(friendshipthumbnail[5], x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] == 6) {
					g.drawImage(friendshipthumbnail[6], x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] == 7) {
					g.drawImage(friendshipthumbnail[7], x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] == 8) {
					g.drawImage(friendshipthumbnail[8], x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] == 9) {
					g.drawImage(friendshipthumbnail[9], x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] == 10) {
					g.drawImage(friendshipthumbnail[10], x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] == 11) {
					g.drawImage(friendshipthumbnail[11], x * 100 + 50 * x + 15, 283, null);
				}

				else if (rand[x + 4] > 11 && rand[x + 4] <= 21) {
					g.drawImage(twentifive, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] > 21 && rand[x + 4] <= 31) {
					g.drawImage(ten, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] > 31 && rand[x + 4] <= 41) {
					g.drawImage(fifteen, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] > 41 && rand[x + 4] <= 51) {
					g.drawImage(twenty, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] > 51 && rand[x + 4] <= 61) {
					g.drawImage(thirty, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] > 61 && rand[x + 4] <= 81) {
					g.drawImage(forty, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] > 81 && rand[x + 4] <= 101) {
					g.drawImage(fifty, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] > 101 && rand[x + 4] <= 121) {
					g.drawImage(sixty, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] > 121 && rand[x + 4] <= 141) {
					g.drawImage(seventy, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] > 141 && rand[x + 4] <= 161) {
					g.drawImage(eighty, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] > 161 && rand[x + 4] <= 181) {
					g.drawImage(ninty, x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] > 181 && rand[x + 4] <= 200) {
					g.drawImage(hundred, x * 100 + 50 * x + 15, 283, null);
				}
			}

			for (int x = 0; x <= 2; x++) {
				if (rand[x + 8] == 0) {
					g.drawImage(friendshipthumbnail[0], x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] == 1) {
					g.drawImage(friendshipthumbnail[1], x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] == 2) {
					g.drawImage(friendshipthumbnail[2], x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] == 3) {
					g.drawImage(friendshipthumbnail[3], x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] == 4) {
					g.drawImage(friendshipthumbnail[4], x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] == 5) {
					g.drawImage(friendshipthumbnail[5], x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] == 6) {
					g.drawImage(friendshipthumbnail[6], x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] == 7) {
					g.drawImage(friendshipthumbnail[7], x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] == 8) {
					g.drawImage(friendshipthumbnail[8], x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] == 9) {
					g.drawImage(friendshipthumbnail[9], x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] == 10) {
					g.drawImage(friendshipthumbnail[10], x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] == 11) {
					g.drawImage(friendshipthumbnail[11], x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 11 && rand[x + 8] <= 21) {
					g.drawImage(twentifive, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 21 && rand[x + 8] <= 31) {
					g.drawImage(ten, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 31 && rand[x + 8] <= 41) {
					g.drawImage(fifteen, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 41 && rand[x + 8] <= 51) {
					g.drawImage(twenty, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 51 && rand[x + 8] <= 61) {
					g.drawImage(thirty, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 61 && rand[x + 8] <= 81) {
					g.drawImage(forty, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 81 && rand[x + 8] <= 101) {
					g.drawImage(fifty, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 101 && rand[x + 8] <= 121) {
					g.drawImage(sixty, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 121 && rand[x + 8] <= 141) {
					g.drawImage(seventy, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 141 && rand[x + 8] <= 161) {
					g.drawImage(eighty, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 161 && rand[x + 8] <= 181) {
					g.drawImage(ninty, x * 100 + 50 * x + 15, 501, null);
				} else if (rand[x + 8] > 181 && rand[x + 8] <= 200) {
					g.drawImage(hundred, x * 100 + 50 * x + 15, 501, null);
				}
			}
		}
		g.drawImage(leftarrow, 0, 800, null);

	}

	//////////////////////////////// Friendship Animation
	//////////////////////////////// ////////////////////////////////
	public void friendshipSingle(int t) {
		Graphics g = getGraphics();
		if (t == 0) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(100);
			g.drawImage(c5, 20, 200, null);
			sleep(300);
			wasuna_get("1");
			sleep(1000);
			g.drawImage(friendshipportrait[0], 0, 200, null);
			sleep(3000);
		} else if (t == 1) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(100);
			g.drawImage(c5, 20, 200, null);
			sleep(300);
			yuuki_get("1");
			sleep(1000);
			g.drawImage(friendshipportrait[1], 0, 200, null);
			sleep(3000);
		} else if (t == 2) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(100);
			g.drawImage(c5, 20, 200, null);
			sleep(300);
			silica_get("1");
			sleep(1000);
			g.drawImage(friendshipportrait[2], 0, 200, null);
			sleep(3000);
		} else if (t == 3) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(100);
			g.drawImage(c5, 20, 200, null);
			sleep(300);
			lisbeth_get("1");
			sleep(1000);
			g.drawImage(friendshipportrait[3], 0, 200, null);
			sleep(3000);
		} else if (t == 4) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(300);
			kirito_get("1");
			sleep(1000);
			g.drawImage(friendshipportrait[4], 0, 200, null);
			sleep(3000);
		} else if (t == 5) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(300);
			wasuna_get("1");
			sleep(1000);
			g.drawImage(friendshipportrait[5], 0, 200, null);
			sleep(3000);
		} else if (t == 6) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(300);
			wasuna_get("1");
			sleep(1000);
			g.drawImage(friendshipportrait[6], 0, 200, null);
			sleep(3000);
		} else if (t == 7) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(300);
			suguha_get("1");
			sleep(1000);
			g.drawImage(friendshipportrait[7], 0, 200, null);
			sleep(3000);
		} else if (t == 8) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(300);
			kirito_get("1");
			sleep(1000);
			g.drawImage(friendshipportrait[8], 0, 200, null);
			sleep(3000);
		} else if (t == 9) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(300);
			wasuna_get("1");
			sleep(1000);
			g.drawImage(friendshipportrait[9], 0, 200, null);
			sleep(3000);
		} else if (t == 10) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(300);
			bleafa_get("1");
			sleep(1000);
			g.drawImage(friendshipportrait[10], 0, 200, null);
			sleep(3000);
		} else if (t == 11) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(300);
			yuuki_get("1");
			sleep(1000);
			g.drawImage(friendshipportrait[11], 0, 200, null);
			sleep(3000);
		} else {
			g.drawImage(nope, 100, 400, null);
			sleep(1000);
		}
	}

	public void friendshipmulti() {
		Graphics g = getGraphics();
		for (int x = 0; x <= 10; x++) {
			if (rand[x] == 0) {
				sleep(1000);
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(100);
				g.drawImage(c5, 20, 200, null);
				sleep(300);
				wasuna_get("1");
				sleep(1000);
				g.drawImage(friendshipportrait[0], 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 1) {
				sleep(1000);
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(100);
				g.drawImage(c5, 20, 200, null);
				sleep(300);
				yuuki_get("1");
				sleep(1000);
				g.drawImage(friendshipportrait[1], 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 2) {
				sleep(1000);
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(100);
				g.drawImage(c5, 20, 200, null);
				sleep(300);
				silica_get("1");
				sleep(1000);
				g.drawImage(friendshipportrait[2], 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 3) {
				sleep(1000);
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(100);
				g.drawImage(c5, 20, 200, null);
				sleep(300);
				lisbeth_get("1");
				sleep(1000);
				g.drawImage(friendshipportrait[3], 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 4) {
				sleep(1000);
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(300);
				kirito_get("1");
				sleep(1000);
				g.drawImage(friendshipportrait[4], 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 5) {
				sleep(1000);
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(300);
				wasuna_get("1");
				sleep(1000);
				g.drawImage(friendshipportrait[5], 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 6) {
				sleep(1000);
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(300);
				wasuna_get("1");
				sleep(1000);
				g.drawImage(friendshipportrait[6], 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 7) {
				sleep(1000);
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(300);
				suguha_get("1");
				sleep(1000);
				g.drawImage(friendshipportrait[7], 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 8) {
				sleep(1000);
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(300);
				kirito_get("1");
				sleep(1000);
				g.drawImage(friendshipportrait[8], 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 9) {
				sleep(1000);
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(300);
				wasuna_get("1");
				sleep(1000);
				g.drawImage(friendshipportrait[9], 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 10) {
				sleep(1000);
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(300);
				bleafa_get("1");
				sleep(1000);
				g.drawImage(friendshipportrait[10], 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 11) {
				sleep(1000);
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(300);
				yuuki_get("1");
				sleep(1000);
				g.drawImage(friendshipportrait[11], 0, 200, null);
				sleep(3000);
			}
		}
	}

	/////// OP Banner //////////////////////////////////////
	public void OP(String y) {
		Graphics g = getGraphics();
		if (y.equals("single")) {
			int lucky = (int) (Math.random() * 100);
			temporary = lucky;
			OPSingle(temporary);
			g.drawImage(bg, 0, 0, null);
			g.drawImage(result, 0, -50, null);
			if (lucky == 0 || lucky == 1) {
				g.drawImage(thumbnails[0], 250, 250, null);
			} else if (lucky == 2 || lucky == 3) {
				g.drawImage(thumbnails[1], 250, 250, null);
			} else if (lucky == 4 || lucky == 5) {
				g.drawImage(thumbnails[2], 250, 250, null);
			} else if (lucky == 6 || lucky == 7) {
				g.drawImage(thumbnails[3], 250, 250, null);
			} else if (lucky == 8 || lucky == 9) {
				g.drawImage(thumbnails[4], 250, 250, null);
			} else if (lucky == 10 || lucky == 11) {
				g.drawImage(thumbnails[5], 250, 250, null);
			} else if (lucky == 12 || lucky == 13) {
				g.drawImage(thumbnails[6], 250, 250, null);
			} else if (lucky == 14 || lucky == 15) {
				g.drawImage(thumbnails[7], 250, 250, null);
			} else if (lucky == 16 || lucky == 17) {
				g.drawImage(thumbnails[8], 250, 250, null);
			} else if (lucky == 18 || lucky == 19) {
				g.drawImage(thumbnails[9], 250, 250, null);
			} else if (lucky == 20 || lucky == 21) {
				g.drawImage(thumbnails[10], 250, 250, null);
			} else if (lucky == 22 || lucky == 23) {
				g.drawImage(thumbnails[11], 250, 250, null);
			} else if (lucky == 24 || lucky == 25) {
				g.drawImage(thumbnails[12], 250, 250, null);
			} else if (lucky == 26 || lucky == 27) {
				g.drawImage(thumbnails[13], 250, 250, null);
			} else if (lucky == 28 || lucky == 29) {
				g.drawImage(thumbnails[14], 250, 250, null);
			} else if (lucky == 30 || lucky == 31) {
				g.drawImage(thumbnails[15], 250, 250, null);
			} else if (lucky == 32 || lucky == 33) {
				g.drawImage(thumbnails[16], 250, 250, null);
			} else if (lucky == 34 || lucky == 35) {
				g.drawImage(thumbnails[17], 250, 250, null);
			} else if (lucky == 36 || lucky == 37) {
				g.drawImage(thumbnails[18], 250, 250, null);
			} else if (lucky == 38 || lucky == 39) {
				g.drawImage(thumbnails[19], 250, 250, null);
			} else if (lucky == 40 || lucky == 41) {
				g.drawImage(thumbnails[20], 250, 250, null);
			} else if (lucky == 42 || lucky == 43) {
				g.drawImage(thumbnails[21], 250, 250, null);
			} else if (lucky == 44 || lucky == 45) {
				g.drawImage(thumbnails[22], 250, 250, null);
			} else if (lucky == 46 || lucky == 47) {
				g.drawImage(thumbnails[23], 250, 250, null);
			} else if (lucky == 48 || lucky == 49) {
				g.drawImage(thumbnails[24], 250, 250, null);
			} else if (lucky == 50 || lucky == 51) {
				g.drawImage(thumbnails[25], 250, 250, null);
			} else if (lucky == 52 || lucky == 53) {
				g.drawImage(thumbnails[26], 250, 250, null);
			} else if (lucky == 54 || lucky == 55) {
				g.drawImage(thumbnails[27], 250, 250, null);
			} else if (lucky == 56 || lucky == 57) {
				g.drawImage(thumbnails[28], 250, 250, null);
			} else if (lucky == 58 || lucky == 59) {
				g.drawImage(thumbnails[29], 250, 250, null);
			} else if (lucky == 60 || lucky == 61) {
				g.drawImage(thumbnails[30], 250, 250, null);
			} else if (lucky == 62 || lucky == 63) {
				g.drawImage(thumbnails[31], 250, 250, null);
			} else if (lucky == 64 || lucky == 65) {
				g.drawImage(thumbnails[32], 250, 250, null);
			} else if (lucky == 66 || lucky == 67) {
				g.drawImage(thumbnails[33], 250, 250, null);
			} else if (lucky == 68 || lucky == 69) {
				g.drawImage(thumbnails[34], 250, 250, null);
			} else if (lucky >= 70 && lucky <= 76) {
				g.drawImage(thumbnails[35], 250, 250, null);
			} else if (lucky >= 77 && lucky <= 79) {
				g.drawImage(thumbnails[36], 250, 250, null);
			} else if (lucky > 79 && lucky < 91) {
				g.drawImage(ninty, 250, 250, null);

			} else if (lucky > 91 && lucky <= 99) {
				g.drawImage(hundred, 250, 250, null);

			}
		} else if (y.equals("multi")) {
			for (int x = 0; x <= 10; x++) {
				int lucky = (int) (Math.random() * 100);
				rand[x] = lucky;
			}
			rarity();
			if (rand[0] <= 79) {
				g.drawImage(yes, 100, 400, null);
				sleep(1000);
				OPMulti();
			} else if (rand[0] > 79) {
				g.drawImage(nope, 100, 400, null);
				sleep(1000);
			}
			g.drawImage(bg, 0, 0, null);
			g.drawImage(result, 0, -50, null);
			for (int x = 0; x <= 3; x++) {
				if (rand[x] <= 69) {
					if (rand[x] % 2 != 0)
						g.drawImage(thumbnails[(rand[x] - 1) / 2], x * 100 + 50 * x + 15, 75, null);
					else if (rand[x] % 2 == 0)
						g.drawImage(thumbnails[(rand[x]) / 2], x * 100 + 50 * x + 15, 75, null);
				} else if (rand[x] >= 70 && rand[x] <= 76) {
					g.drawImage(thumbnails[35], x * 100 + 50 * x + 15, 75, null);

				} else if (rand[x] >= 77 && rand[x] <= 79) {
					g.drawImage(thumbnails[36], x * 100 + 50 * x + 15, 75, null);

				} else if (rand[x] > 79 && rand[x] <= 91)
					g.drawImage(ninty, x * 100 + 50 * x + 15, 75, null);
				else if (rand[x] > 91 && rand[x] <= 99)
					g.drawImage(hundred, x * 100 + 50 * x + 15, 75, null);

			}

			for (int x = 0; x <= 3; x++) {
				if (rand[x + 4] <= 69) {
					if (rand[x + 4] % 2 != 0)
						g.drawImage(thumbnails[(rand[x + 4] - 1) / 2], x * 100 + 50 * x + 15, 283, null);
					else if (rand[x + 4] % 2 == 0)
						g.drawImage(thumbnails[(rand[x + 4]) / 2], x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x+4] >= 70 && rand[x+4] <= 76) {
					g.drawImage(thumbnails[35], x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x+4] >= 77 && rand[x+4] <= 79) {
					g.drawImage(thumbnails[36], x * 100 + 50 * x + 15, 283, null);
				} else if (rand[x + 4] > 79 && rand[x + 4] <= 91)
					g.drawImage(ninty, x * 100 + 50 * x + 15, 283, null);
				else if (rand[x + 4] > 91 && rand[x + 4] <= 99)
					g.drawImage(hundred, x * 100 + 50 * x + 15, 283, null);
			}

			for (int x = 0; x <= 2; x++) {
				if (rand[x + 8] <= 69) {
					if (rand[x + 8] % 2 != 0)
						g.drawImage(thumbnails[(rand[x + 8] - 1) / 2], x * 100 + 50 * x + 15, 501, null);
					else if (rand[x + 8] % 2 == 0)
						g.drawImage(thumbnails[(rand[x + 8]) / 2], x * 100 + 50 * x + 15, 501, null);
				}  else if (rand[x+8] >= 70 && rand[x+8] <= 76) {
					g.drawImage(thumbnails[35], x * 100 + 50 * x + 15, 501, null);

				} else if (rand[x+8] >= 77 && rand[x+8] <= 79) {
					g.drawImage(thumbnails[36], x * 100 + 50 * x + 15, 501, null);

				}else if (rand[x + 8] > 79 && rand[x + 8] <= 91)
					g.drawImage(ninty, x * 100 + 50 * x + 15, 501, null);
				else if (rand[x + 8] > 91 && rand[x + 8] <= 99)
					g.drawImage(hundred, x * 100 + 50 * x + 15, 501, null);
			}
		}
		g.drawImage(leftarrow, 0, 800, null);
	}

	//////////////////// OP banner animation //////////////////////
	public void OPSingle(int t) {
		Graphics g = getGraphics();
		if (t == 1 || t == 0) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(100);
			g.drawImage(c5, 20, 200, null);
			sleep(300);
			asinon_get("1");
			sleep(1000);
			g.drawImage(portraits[0], 0, 200, null);
			sleep(3000);
		} else if (t == 2 || t == 3) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(100);
			g.drawImage(c5, 20, 200, null);
			sleep(300);
			alice_get("1");
			sleep(1000);
			g.drawImage(portraits[1], 0, 200, null);
			sleep(3000);
		} else if (t == 4 || t == 5) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(100);
			g.drawImage(c5, 20, 200, null);
			sleep(300);
			alice_get("1");
			sleep(1000);
			g.drawImage(portraits[2], 0, 200, null);
			sleep(3000);
		} else if (t == 6 || t == 7) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(100);
			g.drawImage(c5, 20, 200, null);
			sleep(300);
			bleafa_get("1");
			sleep(1000);
			g.drawImage(portraits[3], 0, 200, null);
			sleep(3000);
		} else if (t == 8 || t == 9) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(100);
			g.drawImage(c5, 20, 200, null);
			sleep(300);
			eugeo_get("1");
			sleep(1000);
			g.drawImage(portraits[4], 0, 200, null);
			sleep(3000);
		} else if (t == 10 || t == 11) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(100);
			g.drawImage(c5, 20, 200, null);
			sleep(300);
			wasuna_get("1");
			sleep(1000);
			g.drawImage(portraits[5], 0, 200, null);
			sleep(3000);
		} else if (t == 12 || t == 13) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(100);
			g.drawImage(c5, 20, 200, null);
			sleep(300);
			lisbeth_get("1");
			sleep(1000);
			g.drawImage(portraits[6], 0, 200, null);
			sleep(3000);
		} else if (t == 14 || t == 15) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(100);
			g.drawImage(c5, 20, 200, null);
			sleep(300);
			silica_get("1");
			sleep(1000);
			g.drawImage(portraits[7], 0, 200, null);
			sleep(3000);
		} else if (t == 16 || t == 17) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(100);
			g.drawImage(c5, 20, 200, null);
			sleep(300);
			yuuki_get("1");
			sleep(1000);
			g.drawImage(portraits[8], 0, 200, null);
			sleep(3000);
		} else if (t == 18 || t == 19) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(100);
			g.drawImage(c5, 20, 200, null);
			sleep(300);
			alice_get("1");
			sleep(1000);
			g.drawImage(portraits[9], 0, 200, null);
			sleep(3000);
		} else if (t == 20 || t == 21) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(100);
			g.drawImage(c5, 20, 200, null);
			sleep(300);
			wasuna_get("1");
			sleep(1000);
			g.drawImage(portraits[10], 0, 200, null);
			sleep(3000);
		} else if (t == 22 || t == 23) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(100);
			g.drawImage(c5, 20, 200, null);
			sleep(300);
			eugeo_get("1");
			sleep(1000);
			g.drawImage(portraits[11], 0, 200, null);
			sleep(3000);
		} else if (t == 24 || t == 25) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(100);
			g.drawImage(c5, 20, 200, null);
			sleep(300);
			kirito_get("1");
			sleep(1000);
			g.drawImage(portraits[12], 0, 200, null);
			sleep(3000);
		} else if (t == 26 || t == 27) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(100);
			g.drawImage(c5, 20, 200, null);
			sleep(300);
			bleafa_get("1");
			sleep(1000);
			g.drawImage(portraits[13], 0, 200, null);
			sleep(3000);
		} else if (t == 28 || t == 29) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(100);
			g.drawImage(c5, 20, 200, null);
			sleep(300);
			silica_get("1");
			sleep(1000);
			g.drawImage(portraits[14], 0, 200, null);
			sleep(3000);
		} else if (t == 30 || t == 31) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(100);
			g.drawImage(c5, 20, 200, null);
			sleep(300);
			asinon_get("1");
			sleep(1000);
			g.drawImage(portraits[15], 0, 200, null);
			sleep(3000);
		} else if (t == 32 || t == 33) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(100);
			g.drawImage(c5, 20, 200, null);
			sleep(300);
			yuuki_get("1");
			sleep(1000);
			g.drawImage(portraits[16], 0, 200, null);
			sleep(3000);
		} else if (t == 34 || t == 35) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(100);
			g.drawImage(c5, 20, 200, null);
			sleep(300);
			wasuna_get("1");
			sleep(1000);
			g.drawImage(portraits[17], 0, 200, null);
			sleep(3000);
		} else if (t == 36 || t == 37) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(100);
			g.drawImage(c5, 20, 200, null);
			sleep(300);
			bleafa_get("1");
			sleep(1000);
			g.drawImage(portraits[18], 0, 200, null);
			sleep(3000);
		} else if (t == 38 || t == 39) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(100);
			g.drawImage(c5, 20, 200, null);
			sleep(300);
			silica_get("1");
			sleep(1000);
			g.drawImage(portraits[19], 0, 200, null);
			sleep(3000);
		} else if (t == 40 || t == 41) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(100);
			g.drawImage(c5, 20, 200, null);
			sleep(300);
			asinon_get("1");
			sleep(1000);
			g.drawImage(portraits[20], 0, 200, null);
			sleep(3000);
		} else if (t == 42 || t == 43) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(100);
			g.drawImage(c5, 20, 200, null);
			sleep(300);
			agil_get("1");
			sleep(1000);
			g.drawImage(portraits[21], 0, 200, null);
			sleep(3000);
		} else if (t == 44 || t == 45) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(100);
			g.drawImage(c5, 20, 200, null);
			sleep(300);
			wasuna_get("1");
			sleep(1000);
			g.drawImage(portraits[22], 0, 200, null);
			sleep(3000);
		} else if (t == 46 || t == 47) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(100);
			g.drawImage(c5, 20, 200, null);
			sleep(300);
			klein_get("1");
			sleep(1000);
			g.drawImage(portraits[23], 0, 200, null);
			sleep(3000);
		} else if (t == 48 || t == 49) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(100);
			g.drawImage(c5, 20, 200, null);
			sleep(300);
			kirito_get("1");
			sleep(1000);
			g.drawImage(portraits[24], 0, 200, null);
			sleep(3000);
		} else if (t == 50 || t == 51) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(100);
			g.drawImage(c5, 20, 200, null);
			sleep(300);
			silica_get("1");
			sleep(1000);
			g.drawImage(portraits[25], 0, 200, null);
			sleep(3000);
		} else if (t == 52 || t == 53) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(100);
			g.drawImage(c5, 20, 200, null);
			sleep(300);
			wasuna_get("1");
			sleep(1000);
			g.drawImage(portraits[26], 0, 200, null);
			sleep(3000);
		} else if (t == 54 || t == 55) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(100);
			g.drawImage(c5, 20, 200, null);
			sleep(300);
			rain_get("1");
			sleep(1000);
			g.drawImage(portraits[27], 0, 200, null);
			sleep(3000);
		} else if (t == 56 || t == 57) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(100);
			g.drawImage(c5, 20, 200, null);
			sleep(300);
			wasuna_get("1");
			sleep(1000);
			g.drawImage(portraits[28], 0, 200, null);
			sleep(3000);
		} else if (t == 58 || t == 59) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(100);
			g.drawImage(c5, 20, 200, null);
			sleep(300);
			bleafa_get("1");
			sleep(1000);
			g.drawImage(portraits[29], 0, 200, null);
			sleep(3000);
		} else if (t == 60 || t == 61) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(100);
			g.drawImage(c5, 20, 200, null);
			sleep(300);
			lisbeth_get("1");
			sleep(1000);
			g.drawImage(portraits[30], 0, 200, null);
			sleep(3000);
		} else if (t == 62 || t == 63) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(100);
			g.drawImage(c5, 20, 200, null);
			sleep(300);
			yui_get("1");
			sleep(1000);
			g.drawImage(portraits[31], 0, 200, null);
			sleep(3000);
		} else if (t == 64 || t == 65) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(100);
			g.drawImage(c5, 20, 200, null);
			sleep(300);
			kirito_get("1");
			sleep(1000);
			g.drawImage(portraits[32], 0, 200, null);
			sleep(3000);
		} else if (t == 66 || t == 67) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(100);
			g.drawImage(c5, 20, 200, null);
			sleep(300);
			wasuna_get("1");
			sleep(1000);
			g.drawImage(portraits[33], 0, 200, null);
			sleep(3000);
		} else if (t == 68 || t == 69) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(100);
			g.drawImage(c5, 20, 200, null);
			sleep(300);
			kirito_get("1");
			sleep(1000);
			g.drawImage(portraits[34], 0, 200, null);
			sleep(3000);
		} else if (t >= 70 && t <= 76) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(100);
			g.drawImage(c5, 20, 200, null);
			sleep(300);
			wasuna_get("1");
			sleep(1000);
			g.drawImage(portraits[35], 0, 200, null);
			sleep(3000);
		} else if (t >= 77 && t <= 79) {
			g.drawImage(yes, 100, 400, null);
			sleep(1000);
			g.drawImage(vlucky, 0, 0, null);
			sleep(100);
			g.drawImage(c1, 200, 400, null);
			sleep(100);
			g.drawImage(c2, 150, 350, null);
			sleep(100);
			g.drawImage(c3, 100, 300, null);
			sleep(100);
			g.drawImage(c4, 50, 250, null);
			sleep(100);
			g.drawImage(c5, 20, 200, null);
			sleep(300);
			kirito_get("1");
			sleep(1000);
			g.drawImage(portraits[36], 0, 200, null);
			sleep(3000);
		} else {
			g.drawImage(nope, 100, 400, null);
			sleep(1000);
		}
	}

	public void OPMulti() {
		Graphics g = getGraphics();
		for (int x = 0; x <= 10; x++) {
			if (rand[x] == 1 || rand[x] == 0) {
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(100);
				g.drawImage(c5, 20, 200, null);
				sleep(300);
				asinon_get("1");
				sleep(1000);
				g.drawImage(portraits[0], 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 2 || rand[x] == 3) {
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(100);
				g.drawImage(c5, 20, 200, null);
				sleep(300);
				alice_get("1");
				sleep(1000);
				g.drawImage(portraits[1], 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 4 || rand[x] == 5) {

				sleep(1000);
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(100);
				g.drawImage(c5, 20, 200, null);
				sleep(300);
				alice_get("1");
				sleep(1000);
				g.drawImage(portraits[2], 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 6 || rand[x] == 7) {

				sleep(1000);
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(100);
				g.drawImage(c5, 20, 200, null);
				sleep(300);
				bleafa_get("1");
				sleep(1000);
				g.drawImage(portraits[3], 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 8 || rand[x] == 9) {

				sleep(1000);
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(100);
				g.drawImage(c5, 20, 200, null);
				sleep(300);
				eugeo_get("1");
				sleep(1000);
				g.drawImage(portraits[4], 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 10 || rand[x] == 11) {

				sleep(1000);
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(100);
				g.drawImage(c5, 20, 200, null);
				sleep(300);
				wasuna_get("1");
				sleep(1000);
				g.drawImage(portraits[5], 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 12 || rand[x] == 13) {

				sleep(1000);
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(100);
				g.drawImage(c5, 20, 200, null);
				sleep(300);
				lisbeth_get("1");
				sleep(1000);
				g.drawImage(portraits[6], 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 14 || rand[x] == 15) {

				sleep(1000);
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(100);
				g.drawImage(c5, 20, 200, null);
				sleep(300);
				silica_get("1");
				sleep(1000);
				g.drawImage(portraits[7], 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 16 || rand[x] == 17) {

				sleep(1000);
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(100);
				g.drawImage(c5, 20, 200, null);
				sleep(300);
				yuuki_get("1");
				sleep(1000);
				g.drawImage(portraits[8], 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 18 || rand[x] == 19) {

				sleep(1000);
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(100);
				g.drawImage(c5, 20, 200, null);
				sleep(300);
				alice_get("1");
				sleep(1000);
				g.drawImage(portraits[9], 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 20 || rand[x] == 21) {

				sleep(1000);
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(100);
				g.drawImage(c5, 20, 200, null);
				sleep(300);
				wasuna_get("1");
				sleep(1000);
				g.drawImage(portraits[10], 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 22 || rand[x] == 23) {

				sleep(1000);
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(100);
				g.drawImage(c5, 20, 200, null);
				sleep(300);
				eugeo_get("1");
				sleep(1000);
				g.drawImage(portraits[11], 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 24 || rand[x] == 25) {

				sleep(1000);
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(100);
				g.drawImage(c5, 20, 200, null);
				sleep(300);
				kirito_get("1");
				sleep(1000);
				g.drawImage(portraits[12], 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 26 || rand[x] == 27) {

				sleep(1000);
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(100);
				g.drawImage(c5, 20, 200, null);
				sleep(300);
				bleafa_get("1");
				sleep(1000);
				g.drawImage(portraits[13], 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 28 || rand[x] == 29) {

				sleep(1000);
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(100);
				g.drawImage(c5, 20, 200, null);
				sleep(300);
				silica_get("1");
				sleep(1000);
				g.drawImage(portraits[14], 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 30 || rand[x] == 31) {

				sleep(1000);
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(100);
				g.drawImage(c5, 20, 200, null);
				sleep(300);
				asinon_get("1");
				sleep(1000);
				g.drawImage(portraits[15], 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 32 || rand[x] == 33) {

				sleep(1000);
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(100);
				g.drawImage(c5, 20, 200, null);
				sleep(300);
				yuuki_get("1");
				sleep(1000);
				g.drawImage(portraits[16], 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 34 || rand[x] == 35) {

				sleep(1000);
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(100);
				g.drawImage(c5, 20, 200, null);
				sleep(300);
				wasuna_get("1");
				sleep(1000);
				g.drawImage(portraits[17], 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 36 || rand[x] == 37) {

				sleep(1000);
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(100);
				g.drawImage(c5, 20, 200, null);
				sleep(300);
				bleafa_get("1");
				sleep(1000);
				g.drawImage(portraits[18], 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 38 || rand[x] == 39) {

				sleep(1000);
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(100);
				g.drawImage(c5, 20, 200, null);
				sleep(300);
				silica_get("1");
				sleep(1000);
				g.drawImage(portraits[19], 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 40 || rand[x] == 41) {

				sleep(1000);
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(100);
				g.drawImage(c5, 20, 200, null);
				sleep(300);
				asinon_get("1");
				sleep(1000);
				g.drawImage(portraits[20], 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 42 || rand[x] == 43) {

				sleep(1000);
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(100);
				g.drawImage(c5, 20, 200, null);
				sleep(300);
				agil_get("1");
				sleep(1000);
				g.drawImage(portraits[21], 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 44 || rand[x] == 45) {

				sleep(1000);
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(100);
				g.drawImage(c5, 20, 200, null);
				sleep(300);
				wasuna_get("1");
				sleep(1000);
				g.drawImage(portraits[22], 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 46 || rand[x] == 47) {

				sleep(1000);
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(100);
				g.drawImage(c5, 20, 200, null);
				sleep(300);
				klein_get("1");
				sleep(1000);
				g.drawImage(portraits[23], 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 48 || rand[x] == 49) {

				sleep(1000);
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(100);
				g.drawImage(c5, 20, 200, null);
				sleep(300);
				kirito_get("1");
				sleep(1000);
				g.drawImage(portraits[24], 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 50 || rand[x] == 51) {

				sleep(1000);
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(100);
				g.drawImage(c5, 20, 200, null);
				sleep(300);
				silica_get("1");
				sleep(1000);
				g.drawImage(portraits[25], 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 52 || rand[x] == 53) {

				sleep(1000);
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(100);
				g.drawImage(c5, 20, 200, null);
				sleep(300);
				wasuna_get("1");
				sleep(1000);
				g.drawImage(portraits[26], 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 54 || rand[x] == 55) {

				sleep(1000);
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(100);
				g.drawImage(c5, 20, 200, null);
				sleep(300);
				rain_get("1");
				sleep(1000);
				g.drawImage(portraits[27], 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 56 || rand[x] == 57) {

				sleep(1000);
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(100);
				g.drawImage(c5, 20, 200, null);
				sleep(300);
				wasuna_get("1");
				sleep(1000);
				g.drawImage(portraits[28], 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 58 || rand[x] == 59) {

				sleep(1000);
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(100);
				g.drawImage(c5, 20, 200, null);
				sleep(300);
				bleafa_get("1");
				sleep(1000);
				g.drawImage(portraits[29], 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 60 || rand[x] == 61) {

				sleep(1000);
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(100);
				g.drawImage(c5, 20, 200, null);
				sleep(300);
				lisbeth_get("1");
				sleep(1000);
				g.drawImage(portraits[30], 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 62 || rand[x] == 63) {

				sleep(1000);
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(100);
				g.drawImage(c5, 20, 200, null);
				sleep(300);
				yui_get("1");
				sleep(1000);
				g.drawImage(portraits[31], 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 64 || rand[x] == 65) {

				sleep(1000);
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(100);
				g.drawImage(c5, 20, 200, null);
				sleep(300);
				kirito_get("1");
				sleep(1000);
				g.drawImage(portraits[32], 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 66 || rand[x] == 67) {

				sleep(1000);
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(100);
				g.drawImage(c5, 20, 200, null);
				sleep(300);
				wasuna_get("1");
				sleep(1000);
				g.drawImage(portraits[33], 0, 200, null);
				sleep(3000);
			} else if (rand[x] == 68 || rand[x] == 69) {

				sleep(1000);
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(100);
				g.drawImage(c5, 20, 200, null);
				sleep(300);
				kirito_get("1");
				sleep(1000);
				g.drawImage(portraits[34], 0, 200, null);
				sleep(3000);
			} else if (rand[x] >= 70 && rand[x] <= 76) {

				sleep(1000);
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(100);
				g.drawImage(c5, 20, 200, null);
				sleep(300);
				wasuna_get("1");
				sleep(1000);
				g.drawImage(portraits[35], 0, 200, null);
				sleep(3000);
			} else if (rand[x] >= 77 && rand[x] <= 79) {

				sleep(1000);
				g.drawImage(vlucky, 0, 0, null);
				sleep(100);
				g.drawImage(c1, 200, 400, null);
				sleep(100);
				g.drawImage(c2, 150, 350, null);
				sleep(100);
				g.drawImage(c3, 100, 300, null);
				sleep(100);
				g.drawImage(c4, 50, 250, null);
				sleep(100);
				g.drawImage(c5, 20, 200, null);
				sleep(300);
				kirito_get("1");
				sleep(1000);
				g.drawImage(portraits[36], 0, 200, null);
				sleep(3000);
			}
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}
}
