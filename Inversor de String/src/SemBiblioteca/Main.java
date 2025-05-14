package SemBiblioteca;

class Main {
    public static void main(String[] args) {
        String frase1 = "UM CIENTISTA DA COMPUTAÇAO E UM TECNÓLOGO EM SISTEMAS PARA INTERNET DEVEM RESOLVER OS PROBLEMAS LOGICAMENTE";
        String frase2 = "ESARF :ATERCES ODALERAHCAB ME AICNEIC AD OAÇATUPMOC E O OGOLÓNCET ME SAMETSIS ARAP TENRETNI OD FI ONAIOG SUPMAC SOHNIRROM OÃS SO SEROHLEM SOSRUC ED OAÇATUPMOC OD ODATSE ED .SAIOG";
        Pilha pilha = new Pilha(500);
        StringBuilder resultado1 = new StringBuilder();
        StringBuilder resultado2 = new StringBuilder();
        for(int i = 0; i < frase1.length(); i++){
            char c = frase1.charAt(i);
            if(c != ' '){
                pilha.push(c);
            }
            else{
                while(!pilha.estaVazia()){
                    resultado1.append(pilha.pop());
                }
                resultado1.append(' ');
            }
        }
        while (!pilha.estaVazia()) {
            resultado1.append(pilha.pop());
        }
        pilha.limpar();
        for(int i = 0; i < frase2.length(); i++){
            char c = frase2.charAt(i);
            if(c != ' '){
                pilha.push(c);
            }
            else{
                while(!pilha.estaVazia()){
                    resultado2.append(pilha.pop());
                }
                resultado2.append(' ');
            }
        }
        while (!pilha.estaVazia()) {
            resultado2.append(pilha.pop());
        }
        pilha.limpar();

        System.out.println(resultado1.toString());
        System.out.print("\n");
        System.out.println(resultado2.toString());
    }
}