import java.awt.Color;
public class Editor4 {
    public static void main (String[] args) {
        //taking the file name and n from the user
		String fileName = args[0];
		int n = Integer.parseInt(args[1]);
        //reading the image
		Color[][] image = Runigram.read(fileName);
        //creating an array witch is the image grey
		Color[][] grey = Runigram.grayScaled(image);
        //setting canvas
        Runigram.setCanvas(image);
        //morphing the images
		Runigram.morph(image, grey, n);
	}
}


