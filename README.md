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
