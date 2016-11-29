package com.geling.datastructure;

public class ParamErrorException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ParamErrorException(){
		
	}
	public ParamErrorException(String msg){
		super(msg);
	}
}
