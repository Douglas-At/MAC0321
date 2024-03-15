class Exercicio1{  
	 public static int CalcFatorial(int number){  
		 int i,fatorial=1;  
			 for(i=1;i<=number;i++){    
				 fatorial = fatorial*i;
			 }
		 return fatorial; 	    
	 }  
    public static void main(String args[]) {  
        int number = 5;
        int fatorial = CalcFatorial(number);
        System.out.println("Fatorial de " + number + " é: " + fatorial); 
    }  
}  

