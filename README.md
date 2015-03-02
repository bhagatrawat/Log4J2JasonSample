# Log4J2JasonSample
This is Log4J 2.2 JSON configuration sample application.

Clone URL: https://github.com/bhagatsingh/Log4J2JasonSample.git

Run through maven: mvn clean install
Run From Eclipse: Right click on project->Run As -> Maven install 
Note: You have have maven plugin installed in your eclipse.

Once maven install is successful

Check log file at <PROJECT HOME>/target/logs/test.log

You log will looks like:
xxxx-xx-xx xx:xx:xx,xxx DEBUG com.github.bhagatsingh.log4j2.Log4J2JasonSample [main] Entering writeToLog()
xxxx-xx-xx xx:xx:xx,xxx INFO com.github.bhagatsingh.log4j2.Log4J2JasonSample [main] Hello Log4J 2.2 World!!! You rock.
xxxx-xx-xx xx:xx:xx,xxx DEBUG com.github.bhagatsingh.log4j2.Log4J2JasonSample [main] Exiting writeToLog()

