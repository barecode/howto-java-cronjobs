# How To: Java Cronjobs

This "How To Guide" dives into cronjob like behaviour in Java. Styled after crontab, Java EE EJBs support the [@Schedule](http://docs.oracle.com/javaee/7/api/javax/ejb/Schedule.html) annotation:

`@Schedule(hour = "*", minute = "*", second = "*/5", persistent = false)`


# Prerequisite

This guide presumes knowledge on install and use of the following:
* Gradle
* Liberty
* WebSphere Developer Tools (WDT)


# Build and Deploy

* Step 1 - Build the WAR
  * Run `gradle` to build the WAR in `build/libs/howto-java-cronjobs.war`
* Step 2 - Create the server
  * Copy `howto-java-cronjobs` to your Liberty servers directory
  * `cp -r howto-java-cronjobs/ wlp_user_dir/servers/howto-java-cronjobs/`
* Step 3 - Deploy the WAR
  * Create the `dropins` directory in the `howto-java-cronjobs`
  * `mkdir wlp_user_dir/servers/howto-java-cronjobs/dropin`
  * Move the built WAR into `dropins`
  * `mv build/libs/howto-java-cronjobs.war wlp_user_dir/servers/howto-java-cronjobs/dropins`
* Step 4 - Start the server
  * `bin/server run howto-java-cronjobs`


# Import into Eclipse

The following are high-level instructions for importing this project into Eclipse

1. Import -> Projects from Git
2. Add `howto-java-cronjobs` to your Servers view
3. You may need to modify your `.classpath` entry to point to your Liberty installation


# Acknowledgements

A big thank you to Andy Guibert @aguibert for the pointer to this technology
and his [TimerBean.java](https://github.com/aguibert/coms319-project4/blob/master/430_EJBs/src/web/ejb/TimerBean.java)
