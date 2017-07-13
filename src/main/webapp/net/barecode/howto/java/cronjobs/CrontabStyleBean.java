package net.barecode.howto.java.cronjobs;

import java.util.Date;

import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 * This CrontabStyleBean is a simple example of how to create a Java
 * object which has regularly scheduled invocations of methods.
 * <p>
 * Documentation for EE7 annotations:
 * <ul>
 * <li>{@link http://docs.oracle.com/javaee/7/api/javax/ejb/Singleton.html}</li>
 * <li>{@link http://docs.oracle.com/javaee/7/api/javax/ejb/Startup.html}</li>
 * <li>{@link http://docs.oracle.com/javaee/7/api/javax/ejb/Schedule.html}</li>
 * </ul>
 */
@Singleton
@Startup
public class CrontabStyleBean {

	@Schedule(hour = "*", minute = "*", second = "*/5", persistent = false)
	public void runEvery5Seconds() {
		System.out.println(new Date() + ": Inside runEvery5Seconds");
	}

	@Schedule(hour = "*", minute = "*", second = "0", persistent = false)
	public void runEveryMinute() {
		System.out.println(new Date() + ": Inside runEveryMinute!!");
	}

}
