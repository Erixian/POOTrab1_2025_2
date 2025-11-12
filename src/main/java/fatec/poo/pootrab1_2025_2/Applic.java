/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fatec.poo.pootrab1_2025_2;

import fatec.poo.model.Consulta;
import fatec.poo.model.Exame;
import fatec.poo.model.Medico;
import fatec.poo.model.Paciente;
import java.time.LocalDate;

/**
 *
 * @author erixian
 */
public class Applic {

    public static void main(String[] args) {
        Medico medico1 = new Medico("001", "Gabi", "100", "cardio");
        Medico medico2 = new Medico("002", "Gra", "200", "reumato");
        
        Paciente paciente1 = new Paciente("003", "Du", LocalDate.of(2006,5,26));
        Paciente paciente2 = new Paciente("004", "VI", LocalDate.of(1998,12,24));
        
        Consulta consulta1 = new Consulta(1, "23/03/2025");
        Consulta consulta2 = new Consulta(2, "24/03/2025");
        
        medico1.addConsulta(consulta1);
        paciente1.addConsulta(consulta1);
        
        System.out.println("consulta: " + consulta1.getCodigo() + 
                            "\nMedico: " + consulta1.getMedico().getNome() + 
                            "\nPaciente: " + consulta1.getPaciente().getNome());
        
        medico1.addConsulta(consulta2);
        
        Exame exame1 = new Exame(10, "raio-x");
        Exame exame2 = new Exame(20, "urina1");
        Exame exame3 = new Exame(30, "urina2");
        exame1.setValor(100.0);
        exame2.setValor(200.0);
        exame3.setValor(10.57);
        
        //Medicacao medicacao1 = new Medicacao();
        
        consulta2.addExame(exame1);
        consulta2.addExame(exame2);
        consulta2.addExame(exame3);
        consulta1.addExame(exame3);
        
        Consulta consulta3 = new Consulta(3, "24/03/2025");
        consulta3.setValor(200);
        consulta3.addExame(exame1);
        medico1.getConsultas();
        
        
        System.out.println("\n\n\n");
        System.out.println("valor consulta " + consulta2.getCodigo() + ": " + consulta2.calcValorTotalPagar());
        System.out.println("total pagar consulta " + consulta3.getCodigo() + ": " + consulta3.calcValorTotalPagar());
        System.out.println("valor consulta " + consulta3.getCodigo() + ": " + consulta3.getValor());
        
         System.out.println("\n\n\n");
         System.out.println("Idade paciente 2: ");
         
         System.out.println(paciente2.calcIdade(LocalDate.now()));
         System.out.println("data nasc paciente 2: " + paciente2.getDataNascimento());
         paciente2.setAltura(1.65);
         paciente2.setPeso(68.8);
         System.out.println("IMC paciente 2: "+ paciente2.calcIMC());   
        
       
        
        
    }
}
