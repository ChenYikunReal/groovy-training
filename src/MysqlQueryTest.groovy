import java.sql.*;
import groovy.sql.Sql

class MysqlQueryTest {
    static void main(String[] args) {
        def sql = Sql.newInstance('jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC', 'username',
                'password', 'com.mysql.cj.jdbc.Driver')
        sql.eachRow('select * from stu_info') {
            tp ->
                println([tp.id,tp.name,tp.age,tp.birthday,tp.country])
        }
        sql.close()
    }
}
