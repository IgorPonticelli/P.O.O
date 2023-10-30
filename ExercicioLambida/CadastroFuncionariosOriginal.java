import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CadastroFuncionariosOriginal {
	private List<Funcionario> lstf;

	public CadastroFuncionariosOriginal() {
		lstf = new LinkedList<>();

		Random r = new Random();

		for (int i = 0; i < 40; i++) {
			int matricula = r.nextInt(1000) + 100;
			String nome = "Fulano" + i;
			boolean insalubridade = r.nextBoolean();
			int nroDep = r.nextInt(3) + 1;
			double salBase = (r.nextDouble() * 15000) + 500;
			Funcionario f = new Funcionario(matricula, nome, salBase, nroDep, insalubridade);
			lstf.add(f);
		}
	}

	public List<Funcionario> getFuncionarios() {
		return Collections.unmodifiableList(lstf);
	}

	@Override
	public String toString() {
		return "CadastroFuncionarios [lstf=" + lstf + "]";
	}

	// 2a
	public List<Funcionario> getInsalubridadeDependentes() {
		List<Funcionario> pessoas = lstf.stream()
		.filter(f -> f.getInsalubridade() )
		.filter(f -> f.getNroDependentes() > 0)
		.toList();
		return pessoas;
	}

	// 2b
	public long quantidadeFuncionariosComDependentes() {


		return lstf.stream()
		.filter(f -> f.getNroDependentes() > 0)
		.count();
	}

	// 2c
	public double somatorioSalarioBruto() {

		return lstf.stream()
		.filter(f -> f.getSalarioBruto() > 5000)
		//.map(f -> f.getSalarioBruto())
		.collect(Collectors.summingDouble(f -> f.getSalarioBruto()));

	}

	// 2d
	public void aumentaSalarioInsalubres(double taxa) {
		lstf.stream().filter(f -> f.getInsalubridade())
		.forEach(f -> f.aumentaSalBase(taxa));
	}

	// 2e
	public List<String> getNomeMatriculaSalarioBrutoMaiorQueBase() {

		List <String> b = lstf.stream()
		.filter(f -> f.getSalarioBruto() > f.getSalarioBase()*1.10)
		.map(f -> f.getNome() + " " + f.getMatricula())
		.collect(Collectors.toList());

		return b;
	}

	// 2f
	public double mediaSalarialDosQueNaoTemInsalubridade() {

		double c = lstf.stream()
		.filter(f -> f.getInsalubridade() == false)
		.count();

		if(c == 0){
			return 0;
		}

		double d = lstf.stream()
		.filter(f -> f.getInsalubridade() == false)
		.collect(Collectors.summingDouble(f -> f.getSalarioBruto()))
		;

		return d/c;
	}

	// 2g
	public List<String> nomesDosQueTemMatriculaMenorQue500() {
		List <String> a = lstf.stream()
		.filter(f -> f.getMatricula() < 500)
		.map(f -> f.getNome())
		.collect(Collectors.toList());

		return a;
	}

	// 2h
	public double getSalarioLiquido(int matricula) {

		return 0;
	}


}
