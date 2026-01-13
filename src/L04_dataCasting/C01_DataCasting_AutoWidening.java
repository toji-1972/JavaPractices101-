package L04_dataCasting;

public class C01_DataCasting_AutoWidening {

	public static void main(String[] args) {

		boolean bl = true;
		char chr = 'a';
		byte byt = 24;
		short shrt = 23;
		int numbInt = 30;
		long lng = 40;
		float flt = 3.5F;
		double dbl = 4.5;
		String str = "Java is Beautiful";



		int numb2 = numbInt;
		//If we assign a value of type int to a variable of type int,
		// this is not data casting, it's an assignment.

		// Can a variable be assigned a value of one type or another?


		// bl = chr; // 'a'
//         bl = byt; // 24
//         bl = shrt; // 23
//         bl = sayiInt; // 30
//         bl = str; // "Java Candir"


//         chr = bl; // true
//         chr = flt; // 3.5F
//         chr = dbl; // 4.5
//         chr = str; // "Java Candir";
//         chr = 45;


//         str = bl; // true
//         str = byt; // 24
//         str = chr; // 'a'
//         str = shrt; // 23
//         str = lng; // 40


        /*
         We cannot assign values of other data types to a variable of boolean or string data type.
         CHAR data type is a special type of data, and we will examine it further.
         */

		// At compile time, Java ONLY deals with syntax.
		// That is, it looks at the DATA TYPE of the value, not the value itself.

//        byt = shrt; // 23
//        byt = sayiInt; // 30
//        byt = lng; // 40
//        byt = flt; // 3.5F
//        byt = dbl; // 4.5

		shrt = byt;
//        shrt = sayiInt;
//        shrt = lng;
//        shrt = flt;
//        shrt = dbl;

		numbInt = byt;
		numbInt = shrt;
//        sayiInt = lng;
//        sayiInt = flt;
//        sayiInt = dbl;

		lng = byt;
		lng = shrt;
		lng = numbInt;
//        lng = flt;
//        lng = dbl;

		flt = byt;
		flt = shrt;
		flt = numbInt;
		flt = lng;
//        flt = dbl;

		dbl = byt;
		dbl = shrt;
		dbl = numbInt;
		dbl = lng;
		dbl = flt;

        /*

         The variables we use for numbers, such as byte, short, int, long, float, and double,
          accept values of data types that are narrower in scope than the variable's data type without
           us having to perform any operations. This is called Auto Widening.
         */




	}
}
