package sos;

public class Veículo {
String placa;
String modelo;
String tamanho;
int horaEntrada = 0;
int minEntrada = 0;
int horaSaida = 0;
int minSaida =0;
int precoFinal = 0;
public Veículo() {
	
}

public Veículo(String placa, String modelo, String tamanho, int horaEntrada, int minEntrada, int horaSaida,
		int minSaida) {
	
	this.placa = placa;
	this.modelo = modelo;
	this.tamanho = tamanho;
	this.horaEntrada = horaEntrada;
	this.minEntrada = minEntrada;
	this.horaSaida = horaSaida;
	this.minSaida = minSaida;
}

public String getPlaca() {
	return placa;
}

public void setPlaca(String placa) {
	this.placa = placa;
}

public String getModelo() {
	return modelo;
}

public void setModelo(String modelo) {
	this.modelo = modelo;
}

public String getTamanho() {
	return tamanho;
}

public void setTamanho(String tamanho) {
	this.tamanho = tamanho;
}

public int getHoraEntrada() {
	return horaEntrada;
}

public void setHoraEntrada(int horaEntrada) {
	this.horaEntrada = horaEntrada;
}

public int getMinEntrada() {
	return minEntrada;
}

public void setMinEntrada(int minEntrada) {
	this.minEntrada = minEntrada;
}

public int getHoraSaida() {
	return horaSaida;
}

public void setHoraSaida(int horaSaida) {
	if (horaSaida < 8 || horaSaida > 22) {
		System.out.println("Hora de saída deve estar entre 08:00 e 22:00.");
        return;
	}
	this.horaSaida = horaSaida;
	
}

public int getMinSaida() {
	return minSaida;
}

public void setMinSaida(int minSaida) {
	this.minSaida = minSaida;
}
public void calcularValor() {
	if (horaEntrada <= 0 || horaSaida <= 0) {
		System.out.println("Horário de entrada ou saída não registrado");
	}
	int minutosEntrada = (horaEntrada * 60) + minEntrada;
	int minutosSaida = (horaSaida * 60) + minSaida;
	int minFinal = minutosSaida - minutosEntrada;
	
		if (minFinal < 0) {
        System.out.println("A hora de saída deve ser posterior à hora de entrada.");
        return;
    }
	
	if (minFinal <= 60) {
		precoFinal = 5;
	}
	else if (minFinal<=180) {
		precoFinal = 10;
	}
	else if (minFinal > 180) {
		precoFinal = 15;
	}
}
    @Override
    public String toString() {
        return "Placa: " + placa + 
               " Modelo: " + modelo + 
               " Tamanho: " + tamanho + 
               " Horário de entrada: " + horaEntrada + ":" + minEntrada +
               " Horário de saída: " + horaSaida + ":" + minSaida +
               ", totalizando: R$ " + precoFinal;
    }
}