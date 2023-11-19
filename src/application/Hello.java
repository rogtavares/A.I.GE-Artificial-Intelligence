public class DiasEntreDatas {

    public static void main(String[] args) {

        // Define as datas
        Date data1 = new Date(2023, 11, 18);
        Date data2 = new Date(2023, 12, 25);

        // Calcula a diferença entre as datas
        long diferenca = data2.getTime() - data1.getTime();

        // Converte a diferença para dias
        long dias = diferenca / (1000 * 60 * 60 * 24);

        // Imprime o número de dias
        System.out.println("O número de dias entre as datas é: " + dias);
    }
}


}
