Enunciado: A partir da modelagem do diagrama faça a sua implementação na linguagem de
programação Java. 


```mermaid
classDiagram
    class Pessoa {
        -cpf: String
        -nome: String
        -endereco: String
        -telefone: String
        +Pessoa(String, String)
        +setEndereco(String): void
        +setTelefone(String): void
        +setCpf(): void
        +getNome(): String
        +getEndereco(): String
        +getTelefone(): String
    }

    class Medico {
        -crm: String
        -especialidade: String
        +Medico(String, String, String, String)
        +getCrm(): String
        +getEspecialidade(): String
    }

    class Paciente {
        -dataNascimento: LocalDate
        -altura: double
        -peso: double
        +Paciente(String, String, LocalDate)
        +setAltura(double): void
        +setPeso(): double
        +getDataNascimento(): String
        +getAltura(): double
        +getPeso(): double
        +calcIMC(): double
        +calcIdade(LocalDate): int
    }

    class Consulta {
        -codigo: int
        -data: String
        -valor: double
        +Consulta(int, String)
        +setValor(double): void
        +setCodigo(): int
        +getData(): String
        +getValor(): double
        +calcValorTotalPagar(): double
    }

    class Exame {
        -codigo: int
        -descricao: String
        -data: String
        -horario: String
        -valor: double
        +Exame(int, String)
        +setData(String): void
        +setHorario(String): void
        +setValor(double): void
        +getCodigo(): int
        +getDescricao(): String
        +getData(): String
        +getHorario(): String
        +getValor(): double
    }

    class Medicacao {
        -nome: String
        -dosagem: String
        -qtdDias: int
        +Medicacao(String)
        +setDosagem(String): void
        +setQtdDias(int): void
        +getNome(): String
        +getDosagem(): String
        +getQtdDias(): int
    }

    %% Herança
    Medico --|> Pessoa
    Paciente --|> Pessoa

    %% Associações (agora com multiplicidade nos dois lados)
    Consulta "0..*" -- "1" Medico : 
    Consulta "1..*" -- "1" Paciente : 
    Consulta "1" -- "0..*" Exame : 
    Consulta "1" -- "0..*" Medicacao : 
```



| **Classe**   | **Método**                | **Especificação**                                                                                                                                                          |
|--------------|--------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Pessoa       | Pessoa()                 | - Tem como parâmetros de entrada o cpf e o nome.                                                                                                                           |
| Medico       | Medico()                 | - Tem como parâmetros de entrada o cpf, o nome, o crm e a especialidade médica.                                                                                            |
| Paciente     | Paciente()               | - Tem como parâmetros de entrada o cpf, o nome e a data de nascimento.                                                                                                     |
|              | getDataNascimento()      | - Retorna a data de nascimento no formato dd/mm/aaaa                                                                                                                       |
|              | calcIMC()                | - Calcula e devolve o valor do IMC (índice de massa corporal). Este índice é calculado a partir da seguinte fórmula: IMC = Peso/Altura²                                     |
|              | calcIdade()              | - Tem como parâmetro a data atual. Calcula e devolve a idade do paciente.                                                                                                  |
| Consulta     | Consulta()               | - Tem como parâmetros de entrada o código e a data.                                                                                                                        |
|              | calcValorTotalPagar()    | - Calcula e devolve o valor total que deve ser pago pelo paciente. Este cálculo representa o valor da consulta adicionado com os valores de todos os exames que o paciente realizou na clínica do médico. |
| Exame        | Exame()                  | Tem como parâmetros de entrada o código e a descrição.                                                                                                                     |
| Medicacao    | Medicacao()              | Tem como parâmetro de entrada a descrição.                                                                                                                                 |


Considerações
- As classes definidas no diagrama de classes devem ser inseridas no pacote fatec.poo.model
- O atributo dataNascimento da classe Paciente é um atributo definido a partir da classe LocalDate.
- As multiplicidades 0..* e 1..* devem ser implementadas utilizando a classe ArrayList.
- Nas associações binárias bidirecionais deve ser utilizado o this.
