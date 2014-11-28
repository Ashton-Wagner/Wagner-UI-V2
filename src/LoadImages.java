
import java.awt.Image;
import javax.swing.ImageIcon;

public class LoadImages {

    ImageIcon imgiTime = new ImageIcon("Time.png");
    ImageIcon imgiScore = new ImageIcon("Score.png");
    ImageIcon imgiLives = new ImageIcon("Lives.png");
    ImageIcon imgiCoins = new ImageIcon("Coins.png");
    ImageIcon img0 = new ImageIcon("img0.png");
    ImageIcon img1 = new ImageIcon("img1.png");
    ImageIcon img2 = new ImageIcon("img2.png");
    ImageIcon img3 = new ImageIcon("img3.png");
    ImageIcon img4 = new ImageIcon("img4.png");
    ImageIcon img5 = new ImageIcon("img5.png");
    ImageIcon img6 = new ImageIcon("img6.png");
    ImageIcon img7 = new ImageIcon("img7.png");
    ImageIcon img8 = new ImageIcon("img8.png");
    ImageIcon img9 = new ImageIcon("img9.png");
    ImageIcon imgBG = new ImageIcon("Background.png");
    public Image iBG;
    public Image ariNumbers[] = new Image[10];
    public Image imgTime;
    public Image imgScore;
    public Image imgLives;
    public Image imgCoins;
    public Image imgTimeCount1;
    public Image imgTimeCount2;
    public Image imgTimeCount3;

    public LoadImages() {
        iBG = imgBG.getImage();
        ariNumbers[0] = img0.getImage();
        ariNumbers[1] = img1.getImage();
        ariNumbers[2] = img2.getImage();
        ariNumbers[3] = img3.getImage();
        ariNumbers[4] = img4.getImage();
        ariNumbers[5] = img5.getImage();
        ariNumbers[6] = img6.getImage();
        ariNumbers[7] = img7.getImage();
        ariNumbers[8] = img8.getImage();
        ariNumbers[9] = img9.getImage();
        imgTime = imgiTime.getImage();
        imgScore = imgiScore.getImage();
        imgLives = imgiLives.getImage();
        imgCoins = imgiCoins.getImage();
    }
    
    public Image GetimgBG() {
        return iBG;
    }
    public Image GetimgTime() {
        return imgTime;
    }
    public Image GetimgScore() {
        return imgScore;
    }
    public Image GetimgLives() {
        return imgLives;
    }
    public Image GetimgCoins() {
        return imgCoins;
    }
    public Image[] GetNumbers() {
        return ariNumbers;
    }
}
