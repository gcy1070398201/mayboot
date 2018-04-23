# 1.mayboot
  创建 Spring Boot 项目 
# 2.分模块
  模型层 model
  持久层 mappor
  表示层 web
  mappor 依赖于 model
  web 依赖于 mappor
# 3.增加thymeleaf html 开发模板
   classPath:/templates/ #文件目录
# 4.增加Spring Boot 热部署 包括 java 代码和静态文件
# 5.整合Mybatis  
    1.mapper 包下 通过 @Mapper 注解的形式 映射到resources/mapper/.xml
    文件下；
    2.在appliction.properties 增加 mybatis 配置
      mybatis.mapper-locations=classpath*:mapper/*.xml
      mybatis.type-aliases-package=gcy.model
    3.在MaybootApplication 启动类下增加扫描文件
    @SpringBootApplication(scanBasePackages = {"gcy"})
    @MapperScan(basePackages = {"gcy.mapper"})
    否侧会出现org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with
    这个异常；
# 6.在 项目 的  pom.xml 中增加 mysql 和  druid 依赖
    分别在 appliction.properties 增加对应配置
    1.mySql:
    spring.datasource.type=com.alibaba.druid.pool.DruidDataSource
    spring.datasource.driver-class-name=com.mysql.jdbc.Driver
    spring.datasource.url=jdbc:mysql://localhost:3306/dbgril
    spring.datasource.username=账户
    spring.datasource.password=密码
    2.druid：
    # 下面为连接池的补充设置，应用到上面所有数据源中
    spring.datasource.dbcp2.min-idle=5
    spring.datasource.dbcp2.max-idle=10
    spring.datasource.dbcp2.initial-size=5
    # 配置获取连接等待超时的时间
    spring.datasource.dbcp2.max-wait-millis=6000
    # 配置间隔多久才进行一次检测，检测需要关闭的空闲连接，单位是毫秒
    spring.datasource.dbcp2.time-between-eviction-runs-millis=3000
    # 配置一个连接在池中最小生存的时间，单位是毫秒
    spring.datasource.dbcp2.min-evictable-idle-time-millis=300000
    spring.datasource.dbcp2.validation-query=SELECT 1 FROM DUAL
    spring.datasource.dbcp2.test-while-idle=true
    spring.datasource.dbcp2.test-on-borrow=true
    spring.datasource.dbcp2.test-on-return=true
    # 打开PSCache，并且指定每个连接上PSCache的大小
    spring.datasource.dbcp2.pool-prepared-statements=true
    spring.datasource.dbcp2.max-open-prepared-statements=10
