from : http://wiki.jikexueyuan.com/project/java-socket/nio.html
javac *.java
# 启动server
java -cp /home/zhoudazhuang/IdeaProjects/jottings/src/main/java com.anteoy.coreJava.niotest.TCPServerSelector 2000 2001 2002 2003 2004 2005
# 启动client
java -cp /home/zhoudazhuang/IdeaProjects/jottings/src/main/java com.anteoy.coreJava.niotest.TCPEchoClientNonblocking localhost hellotest 2002