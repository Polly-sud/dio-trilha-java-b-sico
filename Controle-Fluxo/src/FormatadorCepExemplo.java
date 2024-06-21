
public class FormatadorCepExemplo  extends Exception {
    public static void main(String[] args) {
        try {
            String CepFormatado = formatarCep("23765064");
            System.out.println(CepFormatado);
        } 
            catch (CepInvalidoException e) {
            e.printStackTrace();
            System.out.println("O cep não é correspondente");
        }

        static String formatarCep(String cep) throws CepInvalidoException{
            if(cep.length() != 8)
              throw new CepInvalidoException();
            
            
              return "23.765-064"; 
        }
    
    }

    private static String formatarCep(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'formatarCep'");
    }

}
