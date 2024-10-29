package sos;

public class Vagas {
	
 int vaga = 0;
 String tamanho;
 boolean disponivel;
 
public Vagas() {

}

public Vagas(int vaga, String tamanho, boolean disponível) {
	super();
	this.vaga = vaga;
	this.tamanho = tamanho;
	this.disponivel = disponível;
}

public int getVaga() {
	return vaga;
}

public void setVaga(int vaga) {
	this.vaga = vaga;
}

public String getTamanho() {
	return tamanho;
}

public void setTamanho(String tamanho) {
	this.tamanho = tamanho;
}

public boolean isDisponível() {
	return disponivel;
}

public void setDisponível(boolean disponível) {
	this.disponivel = disponível;
}

@Override
public String toString() {
	if (disponivel) {
	return "Vaga número: " + vaga + " Tamanho:" + tamanho + " A vaga está disponível";

}
	else {
		return "Vaga número: " + vaga + " Tamanho:" + tamanho + " A vaga não está disponível";
	
	}
}
}


 

