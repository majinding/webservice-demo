cxf-client端示例

执行如下命令生成客户端代码
wsdl2java -client https://www.majingjing.cn/tmblog/webservice/hellodemo?wsdl

调用示例代码 参见 cn.majingjing.tm.blog.webservice.api.HelloPortImpl_HelloPortImplPort_Client.java

设置超时时间
```java
 //连接参数设定
Client proxy = ClientProxy.getClient(port);
HTTPConduit conduit = (HTTPConduit) proxy.getConduit();
HTTPClientPolicy policy = new HTTPClientPolicy();
// 连接超时时间
policy.setConnectionTimeout(10);
// 请求超时时间
policy.setReceiveTimeout(10);
conduit.setClient(policy);
```
