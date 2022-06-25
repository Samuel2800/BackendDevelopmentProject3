//Daniel Ramos
//Gustavo Matamoros
//Carlos Peñafiel
//Samuel Pantoja
package Items;
public class CylindricalBox extends item {
	public CylindricalBox(String itemName, int amount, double weight, double x, double y, double height, double volume, String baseShape) {
		super(itemName, amount, weight, x, y, height, volume, baseShape);
	}

	public double calculateArea(double x, double y) {
		return Math.PI * (x / 2) * (x / 2);
	}
}
