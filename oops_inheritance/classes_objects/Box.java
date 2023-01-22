package oops_inheritance.classes_objects;

public class Box {
		double width;
		double height;
		double depth;
		
		Box(int width, int height, int depth){
			this.width = width;
			this.height = height;
			this.depth = depth;
		}
		
		double volume() {
			return width * height * depth;
		}
		
		public static void main(String[] args) {
			Box b1 = new Box(5,6,4);
			System.out.print("The volume of the Box is " + b1.volume());
		}

	}