package fatec.poo.model;

/**
 * @author erixian
 */
public class Medicacao {
    
    private String nome;
    private String dosagem;
    private int qtdeDias;
    private Consulta consulta;
    
    /*
    Na documentação o contrutor da classe Medicacao recebe como parametro
    uma variavel chamada "descricao", que não existe em nenhuma outra parte
    da documentação.
    
    Devido a modelagem não pedir o metodo "setNome()", nós assumimos que o 
    parametro de entrada seria "nome" e não "descricao" como sugerido na 
    modelagem.
    
    FALAR COM O DIMAS
    */
    
    public Medicacao(String nome) {
        this.nome = nome;
    }
    
    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public String getDosagem() {
        return dosagem;
    }

    public void setDosagem(String dosagem) {
        this.dosagem = dosagem;
    }

    public int getQtdeDias() {
        return qtdeDias;
    }

    public void setQtdeDias(int qtdeDias) {
        this.qtdeDias = qtdeDias;
    }

    public String getNome() {
        return nome;
    }
}
