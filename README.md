# springcloud-demo
- 熔断器  
  http://localhost:8005/microservice-hystrix/get/33
- 消费者  
  http://localhost:8003/microservice-consumer/consumer/list
- provider  
  http://localhost:8002/microservice-provider/getUser/list
- feign负载均衡  
  http://localhost:8004/microservice-consumer-feign/consumer/list
- 负载均衡服务降级  
  http://localhost:8006/microservice-consumer-feign-hystrix/consumer/get/2
- 熔断器仪表  
  http://localhost:8007/microservice-hystrix-dashboard/hystrix
- Hystrix Stream  
  http://localhost:8005/microservice-hystrix/hystrix.stream
- zull  
  http://localhost:6001/provider/microservice-provider/getUser/list
- eureka  
  http://localhost:9001
