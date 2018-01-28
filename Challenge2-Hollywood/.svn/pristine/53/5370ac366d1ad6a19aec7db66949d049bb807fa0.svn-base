/**
 * A program to run a simple survey and report the results. See MovieSurvey.txt
 * for more information. TODO: add your netid to the line below
 * 
 * @author xma29
 */
public class MovieSurvey {
	public static void main(String[] arg) {
		// TODO: Write your program here
		System.out.println("Welcome. We're interested in how people are watching movies this year.");
		System.out.println("Thanks for your time. - The WRITERS GUILD OF AMERICA.");
		System.out.println("Please tell us about how you've watched movies in the last month.");
		
		int cinemaMovies = 0;
		System.out.println("How many movies have you seen at the cinema?");
		cinemaMovies = TextIO.getlnInt();
		
		int dvdMovies = 0;
		System.out.println("How many movies have you seen using a DVD or VHS player?");
		dvdMovies = TextIO.getlnInt();
		
		int computerMovies = 0;
		System.out.println("How many movies have you seen using a Computer?");
		computerMovies = TextIO.getlnInt();
		
		System.out.println("Summary: " + cinemaMovies + " Cinema movies, " + dvdMovies + " DVD/VHS movies, " + computerMovies + " Computer movies");
		
		int total = cinemaMovies + dvdMovies + computerMovies;
		System.out.println("Total: " + total + " movies");
		
		double seenAtCinema = (double)(100 * (cinemaMovies) / (double)(total));
		System.out.printf( "Fraction of movies seen at a cinema: %.2f%%%n", seenAtCinema );
		
		double seenOutsideCinema = 100 - seenAtCinema;
		System.out.printf("Fraction of movies seen outside of a cinema: %.2f%%", seenOutsideCinema);
	}
}
