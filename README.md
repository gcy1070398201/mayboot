# 1.mayboot
创建 Spring Boot 项目 
# 2.分模块
 模型层 model
 持久层 persistence
 表示层 web
  persistence 依赖于 model
  web 依赖于 web
# 3.增加thymeleaf html 开发模板
   classPath:/templates/ #文件目录
# 4.增加Spring Boot 热部署 包括 java 代码和静态文件