package com.org.utility;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Helper {

	// Screenshots, Alert, Frames

	

	public static String getCurrentDateTime() {
		DateFormat customFormat = new SimpleDateFormat("MM_dd_yyyy_HH_ss");
		Date currentDate = new Date();
		return customFormat.format(currentDate);
	}
}
