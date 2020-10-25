javac ^
 printserver/PrintAction.java ^
 printserver/QueueAction.java ^
 printserver/StartAction.java ^
 printserver/StopAction.java ^
 printserver/ResetAction.java ^
 printserver/StatusAction.java ^
 printserver/ReadConfigAction.java ^
 printserver/SetConfigAction.java ^
 printserver/TopQueueAction.java ^
 printserver/PrintServer.java ^
 printserver/PrintServerPermission.java ^
 printserver/SampleAction.java ^
 printserver/PrintserverAzn.java ^
 printserver/module/PrintserverLoginModule.java ^
 printserver/principal/PrintserverPrincipal.java


jar -cvf PrintserverAzn.jar printserver/PrintserverAzn.class printserver/MyCallbackHandler.class

jar -cvf PrintActions.jar ^
 printserver/PrintAction.class ^
 printserver/QueueAction.class ^
 printserver/StartAction.class ^
 printserver/StopAction.class ^
 printserver/ResetAction.class ^
 printserver/StatusAction.class ^
 printserver/ReadConfigAction.class ^
 printserver/SetConfigAction.class ^
 printserver/TopQueueAction.class ^
 printserver/PrintServer.class ^
 printserver/PrintServerPermission.class ^
 printserver/SampleAction.class

jar -cvf PrintserverLM.jar printserver/module/PrintserverLoginModule.class printserver/principal/PrintserverPrincipal.class

java -classpath PrintserverAzn.jar;PrintActions.jar;PrintserverLM.jar ^
 -Djava.security.manager ^
 -Djava.security.policy==printserverazn.policy ^
 -Djava.security.auth.login.config==printserver_jaas.config printserver.PrintserverAzn