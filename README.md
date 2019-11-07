# MybatisGenerated
mybatis逆向生成工具
一:修改src\main\resources\mybatis-generator/mybatisGeneratorinit.properties数据库配置

    jdbc_driver=com.mysql.jdbc.Driver
    jdbc_url=jdbc:mysql://localhost:3306/microsands_dev?useSSL=false&autoReconnect=true&useUnicode=true&characterEncoding=UTF-8&useAffectedRows=true
    jdbc_user=root
    jdbc_password=密码
    #实体类生成的路径
    models=D:\\ideaProjects\\mybatisgenerated\\src\\main\\java
    #mapper文件生成的路径
    resources=D:\\ideaProjects\\mybatisgenerated\\src\\main\\resources
    #dao层生成的包路径
    dao=D:\\ideaProjects\\mybatisgenerated\\src\\main\\java



二:修改src\main\resources\mybatis-generator\generatorConfig.xml相关配置(百度一下)


三:Idea工具右边导航栏点开maven, 点击运行项目下的 mybatis-generator:generate即可生成代码

