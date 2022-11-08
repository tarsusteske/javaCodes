public class maximoDivisorComum {

  public static void main(String[] args) {
		
    // Recebimento dos números:
    int num1 = 150; //Exemplo de entrada do número 1
    int num2 = 225;  //Exemplo de entrada do número 2
	
    // Criação das "arraylist's":
    ArrayList<String> listaFatoresNum1 = new ArrayList<String>();
    ArrayList<String> listaFatoresNum2 = new ArrayList<String>();
    ArrayList<String> listaFatoresComum = new ArrayList<String>();
	
    // Teste para encontar divisores do num1 e jogá-los na lista1:
    for (double i = 1.0; i <= num1; i++) {
      if (num1 % i == 0.0) {
        int x = (int) i;
        String fator = String.valueOf(x);
        listaFatoresNum1.add(fator);
      }
    }
		
    // Teste para encontar divisores do num2 e jogá-los na lista2:
    for (double i = 1.0; i <= num2; i++) {
      if (num2 % i == 0.0) {
        int x = (int) i;
        String fator = String.valueOf(x);
        listaFatoresNum2.add(fator);
      }
    }

    // Comparar divisores em comum e jogá-los na lista 3:
    int res = 0;		
    for (int i = (listaFatoresNum1.toArray().length - 1); i >= 0; i--) {
      String strFat1 = listaFatoresNum1.get(i);
      int intFat1 = Integer.parseInt(strFat1);
      for(int j = 0; j < listaFatoresNum2.toArray().length; j++) {		
        String strFat2 = listaFatoresNum2.get(j);
        int intFat2 = Integer.parseInt(strFat2);
        if (intFat1 == intFat2) {
          res = intFat1;
          String fatorComum = String.valueOf(res);
          listaFatoresComum.add(fatorComum);
        }	
      }
    }
	
    // Captar o maior divisor comum:
    int saida = Integer.parseInt(listaFatoresComum.get(0)); 
	
    // Imprimir resultados na tela:
    System.out.println("Os divisores comuns são: " + listaFatoresComum); // Exemplo de saída [75, 25, 15, 5, 3, 1]
    System.out.println("O maior divisor comum é: " + saida); // Exemplo de saída: 75
	
  }
				
}
