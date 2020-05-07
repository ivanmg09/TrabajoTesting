package test;

public class FuncionesMatematicas {
	public static int suma (int a,int b) {
		return a+b;
	}
	public static int resta(int a,int b) {
		return a-b;	
	}
	public static int multiplicacion (int a,int b) {
		return a*b;
	}
	public static int division (int a,int b) {
		return a/b;
	}
	public static boolean esCapicua(int numero) {

       boolean esCapicua = true;

        int longitudNumero = digitos(numero);

        int[] digitos = obtenerDigitos(numero);

        int numeroDeComprobaciones = longitudNumero / 2;
        int indiceSuperior = longitudNumero - 1;
        int indiceInferior = 0;

        for (int i = 0; (i < numeroDeComprobaciones) && esCapicua; i++) {

            if (digitos[indiceInferior] != digitos[indiceSuperior]) {

                esCapicua = false;
            }

            indiceInferior++;
            indiceSuperior--;
        }

        return esCapicua;
        
        
    }
	 public static int digitos(int numero) {

	        if (numero != 0) {

	            int longitudNumero = 0;

	            while (numero > 0) {

	                longitudNumero++;

	                numero = numero / 10;
	            }

	            return longitudNumero;

	        } else {

	            return 1;
	        }
	    }

	 private static int[] obtenerDigitos(int numero) {

	        int longitudNumero = digitos(numero);

	        int[] digitos = new int[longitudNumero];

	        for (int i = longitudNumero - 1; i >= 0; i--) {

	            digitos[i] = numero % 10;

	            numero = numero / 10;
	        }
			return digitos;
	 
	 }
	
	 public static boolean esPrimo(int numero) {

	        if (numero == 0 || numero == 1) {

	            return false;
	        }
	        else {

	            boolean esPrimo = true;

	            int ultimoDivisor = numero / 2;

	            for (int i = 2; (i <= ultimoDivisor) && esPrimo; i++) {

	                if (numero % i == 0) {
	                    esPrimo = false;
	                }
	            }

	            return esPrimo;
	        }
	    }
	   public static  int siguientePrimo(int numero) {

	        int siguientePrimo = numero;

	        boolean esPrimo = false;

	        while ( !esPrimo ) {

	            esPrimo = esPrimo(++siguientePrimo);
	        }

	        return siguientePrimo;
	    }
	    public  static double potencia(int base, int exponente) {

	        double potencia = 1;

	        if (exponente > 0) {

	            for (int i = 0; i < exponente; i++) {

	                potencia = potencia * base;
	            }
	        }
	        // Soporte para exponentes negativos (requiere trabajar con datos float/double)
	        else if (exponente < 0) {

	            for (int i = 0; i < -exponente; i++) {

	                potencia = potencia / base;
	            }
	        }

	        return potencia;
	    }
	    public static  int voltea(int numero) {

	        int[] digitos = obtenerDigitos(numero);

	        int numeroVolteado = 0;

	        for (int i = 0; i < digitos.length; i++) {

	            numeroVolteado = numeroVolteado + digitos[i] * (int) potencia(10, i);
	        }

	        return numeroVolteado;
}
	    public static int digitoN(int numero, int posicion) {

	        int[] digitos = obtenerDigitos(numero);

	        if (posicion < digitos.length) {

	            return digitos[posicion];

	        } else {

	            return -1;
	        }
	    }
	    public static  int quitaPorDetras(int numero, int numeroDeDigitosARemover) {

	        for (int i = 0; i < numeroDeDigitosARemover; i++) {

	            numero = numero / 10;
	        }

	        return numero;
	    }
	    public static  int quitaPorDelante(int numero, int numeroDeDigitosARemover) {

	        int[] digitos = obtenerDigitos(numero);

	        int exponente = digitos.length - 1;

	        for (int i = 0; i < numeroDeDigitosARemover; i++) {

	            numero = numero - digitos[i] * (int) potencia(10, exponente--);
	        }

	        return numero;
	    }
	    public static int pegaPorDetras(int numero, int digitoAPegar) {

	        if ((digitoAPegar >= 0) && (digitoAPegar < 10)) {

	            return numero * 10 + digitoAPegar;

	        } else {

	            return -1;
	        }
	        
	
}
	    public static int pegaPorDelante(int numero, int digitoAPegar) {

	        if ((digitoAPegar >= 0) && (digitoAPegar < 10)) {

	            int exponente = digitos(numero);

	            return digitoAPegar * (int) potencia(10, exponente) + numero;

	        } else {

	            return -1;
	        }
	    }

	    public  static int trozoDeNumero(int numero, int posicionInicial, int posicionFinal) {

	        int longitudNumero = digitos(numero);

	        if ( (posicionInicial >= 0) && (posicionFinal < longitudNumero) ) {

	            int trozoDeNumero = quitaPorDelante(numero, posicionInicial);

	            int digitosARemoverPorDetras = longitudNumero - 1 - posicionFinal;

	            return quitaPorDetras(trozoDeNumero, digitosARemoverPorDetras);

	        } else {

	            return -1;
	        }
	    }
	    
	    public static int juntaNumeros(int numero, int numeroAJuntar) {

	        int longitudNumeroAJuntar = digitos(numeroAJuntar);

	        return numero * (int) potencia(10, longitudNumeroAJuntar) + numeroAJuntar;
	    }
	    }
