package arranjo;

public class Arranjo {	

	public static Integer menor()
    {
        int[] arranjo = {940, 880, 830, 790, 750, 660, 650, 590, 510, 940}; 
        int contador = 0;
        int menor = arranjo[0];{
        while(contador < arranjo.length)
        {
            if(arranjo[contador] < menor)
            {
                menor = arranjo[contador];
            }
            contador ++;
        }
        return menor;}
    }

    public static Integer maior()
    {
        int[] arranjo = {940, 880, 830, 790, 750, 660, 650, 590, 510, 940};
        int contador = 0;
        int maior = 0;
        while (contador < arranjo.length)
        {
            if (arranjo[contador] >= maior)
            {
                maior = arranjo[contador];
            }
            contador++;
        }
        return maior;
    }

    public static Integer soma()
    {
        int[] arranjo = {940, 880, 830, 790, 750, 660, 650, 590, 510, 940};
        int contador = 0;
        int soma = 0;
        while (contador < arranjo.length)
        {
            soma = soma + arranjo[contador];
            contador++;
        }
        return soma;
    }}