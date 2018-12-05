package w1l5.problem3;

public class Driver {

	public static void main(String[] args) {
		
		Figure[] figures = {new UpwardHat(), new UpwardHat(), new DownwardHat(), new FaceMaker(), new Vertical()};
		
		for(Figure figure: figures) 
			figure.getFigure();
		
		System.out.println("\n");
		for(Figure figure: figures) {
			System.out.print(figure.getClass().getSimpleName()+": ");
			figure.getFigure();
			System.out.println();
		}
		
		
		
	}
	/*
	 * OUTPUT:
	 * 
	  	/\/\\/:)||

		UpwardHat: /\
		UpwardHat: /\
		DownwardHat: \/
		FaceMaker: :)
		Vertical: ||

	 */
}
