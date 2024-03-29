package gui;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Seed {

	private Class 	_class;
	private Image 	img;
	private Integer price;

	public Class get_class(){return _class;}
	public void set_class(Class _class){this._class = _class;}
	public Image getImg(){return img;}
	public void setImg(Image img){this.img = img;}
	public Integer getPrice(){return price;}
	public void setPrice(Integer price){this.price = price;}

	/**
	 * Create Seed with class, img and price
	 * @param _class Classname
	 * @param img	Image
	 * @param price	Price
	 */
	public Seed(Class _class, Image img, Integer price) {
		this._class = _class;
		this.img = img;
		this.price = price;
	}

	/**
	 * Crete Seed with class, img directory and price
	 * @param _class Classname
	 * @param img	Filename directory
	 * @param price	Price
	 */
	public Seed(Class _class, String img, Integer price) {
		this._class = _class;
		try {
			this.img = new Image(img);
		} catch (SlickException e) {
			e.printStackTrace();
		}
		this.price = price;
	}
}
