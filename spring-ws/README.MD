spring-ws服务端示例

参考文档 https://docs.spring.io/spring-ws/docs/3.0.4.RELEASE/reference/
参考示例 https://github.com/spring-projects/spring-ws-samples

发布项目有两种方式
1. 直接采用全注解方式，具体参加上述 `参考示例` 里面的示例
或采用本示例所示，由于ws比较老，一般都是比较老的项目才使用ws，所以本示例采用配置文件的方式来编写
2. 执行mvn clean compile jetty:run （或打好包放入tomcat里面运行效果是一样的）

访问地址： http://localhost:8080/holiday.wsdl


说明：
由于spring-ws采用契约优先原则，所以这种方式编写ws是非常稳定和方便的。便于后期版本维护
能解决java其他ws框架中一个比较棘手的问题，且也无法解决的问题，那就是O/M问题

契约优先，可以是节点更加好控制，并且和其他语言做到更好的兼容