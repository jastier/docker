# clone a git repo into an sbt-based image

from sbt_image

run git clone -b dialog_agent_edits --single-branch https://github.com/clulab/tomcat-text

run java -version
entrypoint \ 
  cd tomcat-text &&\
  sbt "runMain org.clulab.asist.DialogAgentTest"

