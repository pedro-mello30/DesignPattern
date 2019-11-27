public class StackFIFO extends StackArray {
    private StackArray stackArrayAux = new StackArray();

    public int pop(){
//        esvazio minha lista de trás pra frente, reordenando ela, assim o primeiro que entrou sera o ultimo a sair
        while (!isEmpty()){
            stackArrayAux.push(super.pop());
        }

        int aux = stackArrayAux.pop();
//        populo minha lista vazia novamente, utilizando a lsita auxiliar para poder repetir o processo
        while (!stackArrayAux.isEmpty()){
            push(stackArrayAux.pop());
        }
        return aux;
    }
}
