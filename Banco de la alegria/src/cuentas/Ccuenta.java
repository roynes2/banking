package cuentas;

import java.util.*;

public abstract class Ccuenta {
	
	private String nombre;
	private String cuenta; 
	private double saldo;
	private double tipoDeInteres;
	
	public Ccuenta() {};
	public Ccuenta(String nom, String cue, double sal, double tipo)
	
	{
		asignarNombre(nom);
		asignarCuenta(cue);
		ingreso(sal);
		asignarTipoDeInteres(tipo);
	}
	
	public boolean asignarNombre(String nom)
	{
		if (nom.length() == 0)
		{
	System.out.println("Error:cadena vacía");
	return false;
		}
		nombre = nom;
		return nom.length() != 0;
	}
	
	public String obtenerNombre()
	{
		return nombre;
	}
	
	public boolean asignarCuenta(String cue)
	{
		if (cue.length() == 0)
		{
			System.out.println("Error: cuenta no valida");
			return false;
		}
		cuenta = cue;
		return cue.length() != 0;
	}
	
	public String obtenerCuenta()
	{
		return cuenta;
	}
	
	public double estado()
	{
		return saldo;
	}
	
	public abstract void comisiones();
	public abstract double intereses();
	public boolean ingreso(double cantidad)
	{
		if (cantidad < 0)
		{
			System.out.println("Error: cantidad negativa");
			return false;
		}
		saldo += cantidad;
		return cantidad >= 0;
	}
	 public void reintegro(double cantidad)
	 {
		 if (saldo - cantidad < 0)
		 {
			 System.out.println("Error: no dispone de saldo");
			 return;
		 }
		 saldo -= cantidad;
		 }
	 public double obtenerTipoDeInteres()
	 {
		 return tipoDeInteres;
	 }
	 
	 public boolean asignarTipoDeInteres(double tipo)
	 {
		 if (tipo < 0)
		 {
			 System.out.println("Error: tipo no valido");
			 return false;
		 }
		 tipoDeInteres = tipo;
	 
	 return tipo >= 0;
}
	 }






