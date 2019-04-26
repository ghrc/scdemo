#首先开启eureka，上篇文章中我们把eureka放在集群上，并单独写了一个脚本了，这里不在赘述
#然后开启zuul
cd /home/linjiaqin/log_stream_platform/source/scdemo/gateway;
nohup mvn spring-boot:run > /dev/null 2>&1  &
#开两个ribbon-consumer
cd /home/linjiaqin/log_stream_platform/source/scdemo/consumer
nohup mvn spring-boot:run -Dserver.port=30001 > /dev/null 2>&1  &
nohup mvn spring-boot:run -Dserver.port=30002 > /dev/null 2>&1  &
#开启三个provider
cd /home/linjiaqin/log_stream_platform/source/scdemo/provider
nohup mvn spring-boot:run -Dserver.port=20001 > /dev/null 2>&1  &
nohup mvn spring-boot:run -Dserver.port=20002 > /dev/null 2>&1  &
nohup mvn spring-boot:run -Dserver.port=20003 > /dev/null 2>&1  &