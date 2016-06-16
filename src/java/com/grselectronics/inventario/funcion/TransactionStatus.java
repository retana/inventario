package com.grselectronics.inventario.funcion;
import java.util.ArrayList;
import java.util.Calendar;

import com.google.gson.Gson;

public class TransactionStatus {
	private String estado = "Estado"; /* estado de la peticion/trasacci�n */
	private String descripcion = "Descripci�n del Estado"; /*  descripcion del estado */
	private boolean bool = false; /* Valor boleano del estado */
	private ArrayList<Object> data; /* objeto data para envio de datos adicionales */
	private String fecha;
	public TransactionStatus(){
		data = new ArrayList<Object>();
		fecha = Calendar.getInstance().get(Calendar.DAY_OF_MONTH) + "/" +
		(Calendar.getInstance().get(Calendar.MONTH)+1) + "/" + Calendar.getInstance().get(Calendar.YEAR);
	}
	
	public TransactionStatus(String estado, String descripcion,boolean bool){
		this.estado = estado;
		this.descripcion = descripcion;
		this.bool = bool;
		data = new ArrayList<Object>();
		fecha = Calendar.getInstance().get(Calendar.DAY_OF_MONTH) + "/" +
		(Calendar.getInstance().get(Calendar.MONTH)+1) + "/" + Calendar.getInstance().get(Calendar.YEAR);
	}
	
	public void setData(Object...objects){
		for(Object objeto : objects){
			data.add(objeto);
		}
	}
	
	public void setData(ArrayList<Object> list){
		data = list;
	}
	
	public ArrayList<Object> getData(){
		return data;
	}
	
	public String getJSONFormat(){
		Gson json = new Gson(); /*objecto json para conversi�n */
		return json.toJson(this);
	}

	public void setBool(boolean bool){
		this.bool = bool;
	}
	public boolean getBool(){
		return bool;
	}
	public void setEstado(String estado){
		this.estado = estado;
	}
	public String getEstado(){
		return estado;
	}
	public void setDescripcion(String descripcion){
		this.descripcion = descripcion;
	}
	public String getDescripcion(){
		return descripcion;
	}
	public String getFecha(){
		return fecha;
	}
}
