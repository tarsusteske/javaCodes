public class camel {
	
  public static void main(String[] args) {
		
    // Recebimento da string de entrada:
    String str = "cats AND*Dogs-are awesome"; // Exemplo
		
    // converter str em minúsculas:
    str = str.toLowerCase();
		
    // converter str em array de char:
    char[] strArray = str.toCharArray();
		
    // trasnformando as letras inicias em maiúsculas:
    for (int i = 0; i < strArray.length; i++) {
      if (strArray[i] < 'A' || (strArray[i] > 'Z' && strArray[i] < 'a') || strArray[i] > 'z') {
        if (strArray[i+1] >= 'A' && strArray[i+1] <= 'Z' || strArray[i+1] >= 'a' && strArray[i+1] <= 'z') {
          strArray[i+1] = (char) (strArray[i+1] - 32);
        }
      }
    }	
			
    // Criar string temporária e substituir os caracteres especiais por ' ': 
    String temp = "";
    for (int i = 0; i < strArray.length; i++) {
      if (strArray[i] < 'A' || (strArray[i] > 'Z' && strArray[i] < 'a') || strArray[i] > 'z') {
        strArray[i] = ' ';
        temp = temp + strArray[i];
      } else {
        temp = temp + strArray[i];
      }
    }
	      
    // remover o caractere " ":
    temp = temp.replace(" ", "");
		
    // conferir se o 1º caractere não está maiúsculo:
    char[] strArray2 = temp.toCharArray();    
    if (strArray2[0] >= 'A' && strArray2[0] <= 'Z') {
      strArray2[0] = (char) (strArray2[0] + 32);
      temp = "";
      for (int i = 0; i < strArray2.length; i++) {
        temp = temp + strArray2[i];
      }
    }  
	       
    // Criar a string de saída:
    str = "";
    str = temp;
    
    // imprimir a str:
    System.out.println(str); //Exemplo: catsAndDogsAreAwesome
	
  }

}
