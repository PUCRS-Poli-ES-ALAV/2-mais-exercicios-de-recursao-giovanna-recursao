public class Lista{
    /* 1 - Assinatura: int fatorial (int n) => return fatorial n
     * 2 - Casos de erro: n < 0 é erro.
     * 3 - Casos não recursivos: n=1 || n=0 return 1
     * 4 - Casos recursivos: fatorial(n) = n * (n-1) * (n-2)
     */
    public static int fatorialN(int n){
        if (n<0){
            throw new IllegalArgumentException("N menor que zero. Tente outro, acima de 0");
        }
        if (n == 1 || n == 0){
            return 1;
        }
        return n * fatorialN(n - 1);
    }

    /* 1 - Assinatura: int somatorio (int n) => return somatorio n até 0
     * 2 - Casos de erro: Não há, aceita números negativos também.
     * 3 - Casos não recursivos: n=0 return 0
     * 4 - Casos recursivos: if n>0: somatorio(n) = n + somatorio (n-1);
     *                       if n<0: somatorio(n) = n + somatorio (n+1);
     */
    public static int somatorio0(int n){
        if(n==0){
            return 0;
        }
        if(n>0){
            return n + somatorio0(n-1);
        }
        return n + somatorio0(n+1);
    }

    /* 1 - Assinatura: int fibonacci (int n) => return fibonacci do n-ésimo número
     * 2 - Casos de erro: n<0
     * 3 - Casos não recursivos: n=0 || n=1 return n
     * 4 - Casos recursivos: fibonacci(n) = fibonacci(n-1) + fibonacci(n-2)
     */
    public static int fibonacci(int n){
        if(n<0){
            throw new IllegalArgumentException("N menor que zero. Tente outro, acima de 0");
        }
        if(n==0 || n==1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

     /* 1 - Assinatura: int somatorioIntervalo(int k, int j) => somatorioIntervalo n
     * 2 - Casos de erro: Não há, pode números negativos.
     * 3 - Casos não recursivos: k == j return j
     * 4 - Casos recursivos: if k<j: k + somatorioInt(k+1, j) 
     *                       if k>j: k + somatorioInt(j,k)
     */
    public static int somatorioIntervalo(int k, int j){
        if(k==j){
            return j;
        }
        if(k<j){
            return k + somatorioIntervalo(k+1,j);
        }
        return somatorioIntervalo(j, k);
    }

    /* 1 - Assinatura: boolean isPalindromo(string s) => T or F
     * 2 - Casos de erro: s == null
     * 3 - Casos não recursivos: tam(s) == 1 || 0 return T
     *                           charAt(0) != charAt(tam(s) - 1) return F
     * 4 - Casos recursivos: charAt(0) == charAt(tam(s) - 1): isPalindromo(s.substring(1, tam(s))-1)
     */
    public static boolean isPalidromo(String palavra){
        if(palavra == null){
            throw new IllegalArgumentException("Por favor, digite uma palavra");
        }
        if(palavra.length() == 1 || palavra.length() == 0){
            return true;
        }
        if(palavra.charAt(0) != palavra.charAt(palavra.length()-1)){
            return false;
        }
        return isPalidromo(palavra.substring(1, palavra.length()-1));
    }

    /* 1 - Assinatura:
     * 2 - Casos de erro:
     * 3 - Casos não recursivos:
     * 4 - Casos recursivos:
     */

}