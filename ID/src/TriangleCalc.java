public class TriangleCalc {
	  int Triangle( int N )
	  {
	    if ( N == 1 )
	      return 1;
	    else
	      return N + Triangle( N-1 );
	  }
}
