
# mybatisdemo


# 参照
https://blog.csdn.net/csucsgoat/article/details/125454703



# MBG（MyBatis Generator）
https://blog.csdn.net/isea533/article/details/42102297

## 1.添加依赖

```
    <build>
        <plugins>
   
            <plugin>
                <groupId>org.mybatis.generator</groupId>
                <artifactId>mybatis-generator-maven-plugin</artifactId>
                <version>1.3.2</version>
                <configuration>
                    <configurationFile>${basedir}/src/main/resources/generator/generatorConfig.xml</configurationFile>
                    <overwrite>true</overwrite>
                    <verbose>true</verbose>
                </configuration>
                <dependencies>
                    <dependency>
                        <groupId>mysql</groupId>
                        <artifactId>mysql-connector-java</artifactId>
                        <version>${mysql.version}</version>
                    </dependency>
                    <dependency>
                        <groupId>tk.mybatis</groupId>
                        <artifactId>mapper-generator</artifactId>
                        <version>1.0.0</version>
                    </dependency>
                </dependencies>
            </plugin>
        </plugins>
    </build>


```

## 2.创建generatorConfig.xml (默认路径：resources/generator/generatorConfig.xml)
```

<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE generatorConfiguration
        PUBLIC "-//mybatis.org//DTD MyBatis Generator Configuration 1.0//EN"
        "http://mybatis.org/dtd/mybatis-generator-config_1_0.dtd">

<generatorConfiguration>

    <properties resource="application.properties"  />

    <context id="Mysql" targetRuntime="MyBatis3Simple" defaultModelType="flat">
        <property name="beginningDelimiter" value="`"/>
        <property name="endingDelimiter" value="`"/>

        <plugin type="tk.mybatis.mapper.generator.MapperPlugin">
            <property name="mappers" value="tk.mybatis.springboot.util.MyMapper"/>
        </plugin>

        <!--自定义生成注释，用于生成vo的@ApiModel注解，在MyCommentGenerator中配置-->
<!--        <commentGenerator type="com.mklinfo.generator.RemarkCommentGenerator">-->
<!--        </commentGenerator>-->

        <jdbcConnection driverClass="${spring.datasource.driver-class-name}"
                        connectionURL="${spring.datasource.url}"
                        userId="${spring.datasource.username}"
                        password="${spring.datasource.password}">
        </jdbcConnection>

        <javaTypeResolver>
            <property name="forceBigDecimals" value="false"/>
            <property name="useJSR310Types" value="true"/>
        </javaTypeResolver>

        <javaModelGenerator targetPackage="com.example.mybatisdemo.model" targetProject="src/main/java"/>

        <sqlMapGenerator targetPackage="mapper" targetProject="src/main/resources"/>

        <javaClientGenerator targetPackage="com.example.mybatisdemo.mapper" targetProject="src/main/java"
                             type="XMLMAPPER"/>


        <table tableName="%"></table>
<!--        <table tableName="country">-->
<!--            <!–mysql 配置–>-->
<!--            <generatedKey column="id" sqlStatement="Mysql" identity="true"/>-->
<!--            <!–oracle 配置–>-->
<!--            <!–<generatedKey column="id" sqlStatement="select SEQ_{1}.nextval from dual" identity="false" type="pre"/>–>-->
<!--        </table>-->
    </context>

</generatorConfiguration>
```


## 3.执行生成命令
```
mvn mybatis-generator:generate
```


# mybatis-plus 生成代码

## 1.添加依赖
```
 <!-- mybatis-plus-generator 代码生成-->
<dependency>
    <groupId>com.baomidou</groupId>
    <artifactId>mybatis-plus-generator</artifactId>
    <version>3.1.0</version>
    <scope>test</scope>
</dependency>

```

## 2.通过AutoGenerator生成
```
参照 https://www.baomidou.com/pages/d357af/

```
