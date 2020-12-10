package com.clearminds.sdi.servicios;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	public static String fecha() {
		Date fecha = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String f = sdf.format(fecha);
		return f;
	}

}
