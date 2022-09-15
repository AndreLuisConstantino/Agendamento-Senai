package br.senai.sp.jandira;

import java.time.LocalDate;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class AgendaApp {

	public static void main(String[] args) {
		
		Especialidade especialidade = new Especialidade();
		especialidade.setNome("Cardiologia");
		
		Especialidade especialidade2 = new Especialidade();
		especialidade2.setNome("Otorrinolaringologia");
		
		//JOptionPane.showMessageDialog(null, especialidade2.getNome());
		//System.out.println(especialidade2.getNome());
		
		//especialidade.setDescricao("Cardiologia é a especialidade médica que realiza o diagnóstico e trata das doenças do coração. "
		//		+ "O padrão de excelência do Hcor em cardiologia é reconhecido nacional e internacionalmente. "
		//	+ "Seus estudos se tornaram referenciais na medicina.");
		//JOptionPane.showMessageDialog(null, especialidade.getDescricao());
		
		//especialidade2.setDescricao("O otorrinolaringologista é o médico especializado no diagnóstico e tratamento,"
		//		+ " clínico e cirúrgico, das doenças dos ouvidos, nariz, garganta, laringe e pescoço.");
		//JOptionPane.showMessageDialog(null, especialidade2.getDescricao());
		
		PlanoDeSaude plano1 = new PlanoDeSaude();
		plano1.setOperadora("Amil");
		plano1.setCategoria("Gold Ricão Mané");
		plano1.setNumero("12345678");
		plano1.setValidade(LocalDate.ofYearDay(2, 12));
		JOptionPane.showMessageDialog(null, plano1.getOperadora());
		JOptionPane.showMessageDialog(null, plano1.getCategoria());
		JOptionPane.showMessageDialog(null, plano1.getNumero());
		JOptionPane.showMessageDialog(null, plano1.getValidade());
	}

}
