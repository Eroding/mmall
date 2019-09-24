1.当mysql中有text的时候，在自动生成的时候需要设置成类型为varchar

2.没有自动生成代码的时候，把
 <dependencies>
                <dependency>
                    <groupId>mysql</groupId>
                    <artifactId>mysql-connector-java</artifactId>
                    <version>5.1.47</version>
                </dependency>
            </dependencies>
            放plungin 中
            
            3.当mysql时间是datetime的时候，mysql 的增删改查语句中 时间 改为now（），
            4.第三方下载的mybatis-plugin不好用，害的编译器打不开了
            5.调出problem窗口
6.setting inspections spring code 第二行改为waring