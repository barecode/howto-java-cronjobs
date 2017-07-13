# howto-java-cronjobs
How To Guide: creating "cronjob" like tasks in Java

# Prereq

Gradle
Liberty
WebSphere Developer Tools (wdt)


# Build and Deploy

Step 1 - Build the WAR

Run `gradle` to build the WAR in `build/libs/howto-java-cronjobs.war`

Step 2 - Create the server

Copy `howto-java-cronjobs` to your Liberty deployment
`cp -r howto-java-cronjobs/ wlp_install/usr/servers/howto-java-cronjobs/`

Step 3 - Deploy the WAR

Create the `dropins` directory in the `howto-java-cronjobs`
`mkdir /Users/mcthomps/Documents/workspace/wlp/usr/servers/howto-java-cronjobs/dropin`

Move the built WAR into `dropins`
`mv build/libs/howto-java-cronjobs.war /Users/mcthomps/Documents/workspace/wlp/usr/servers/howto-java-cronjobs/dropins`

Step 4 - Start the server

`bin/server run howto-java-cronjobs`

# Acknowledgements

A big thank you to Andy Guibert @aguibert for the pointer to this technology
and his [TimerBean.java](https://github.com/aguibert/coms319-project4/blob/master/430_EJBs/src/web/ejb/TimerBean.java)