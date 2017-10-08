package com.javatpoint.util;

import java.io.Serializable;

public class JsonRequest<A> implements Serializable {

	private static final long serialVersionUID = 1L;

	private A data;

	public A getData() {
		return data;
	}

	public void setData(A data) {
		this.data = data;
	}

}
