   
 ### log4j配置文件：
 
     log4j.rootLogger=info,A1
     log4j.logger.com.youhujia = DEBUG

     log4j.appender.A1=org.apache.log4j.ConsoleAppender
     log4j.appender.A1.layout=org.apache.log4j.PatternLayout
     log4j.appender.A1.layout=org.apache.log4j.PatternLayout
     log4j.appender.A1.layout.ConversionPattern=%-d{yyyy-MM-dd HH:mm:ss,SSS} [%t] [%c]-[%p] %m%n
     
  第一行是根，必须配置，其他的log可以配置也可以不配置。等号后面的第一个参数表示日志级别，
  
  可以填五个级别中的一种（Log4j默认把日志信息分为五个等级 **debug < info < warn < error < fatal**），
  
  后面的参数都是让Log知道输出到哪里，如果你想让日志输出到两个地方就加两个输出参数，比如
     
  ### log4j的日志级别：
   这里的info表示，该Log的日志级别为info，所有级别小于info的日志都不会被记录。比如第一行，
   
   