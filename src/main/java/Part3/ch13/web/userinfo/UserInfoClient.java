package Part3.ch13.web.userinfo;

import Part3.ch13.domain.userinfo.UserInfo;
import Part3.ch13.domain.userinfo.dao.UserInfoDao;
import Part3.ch13.domain.userinfo.dao.mysql.UserInfoMysqlDao;
import Part3.ch13.domain.userinfo.dao.oracle.UserInfoOracleDao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {
    public static void main(String[] args) throws IOException {

        try {
            FileInputStream fis = new FileInputStream("/Users/sum/Documents/Java/src/main/java/db.properties");
            Properties prop = new Properties();
            prop.load(fis);

            String dbType = prop.getProperty("DB-TYPE");

            UserInfo userInfo = new UserInfo();
            userInfo.setUserId("12345");
            userInfo.setPassword("!@#$%");
            userInfo.setUserName("이순신");


            UserInfoDao userInfoDao;

            if(dbType.equals("ORACLE")){
                userInfoDao = new UserInfoOracleDao();
            }
            else if(dbType.endsWith("MYSQL")){
                userInfoDao = new UserInfoMysqlDao();
            }
            else{
                System.out.println("db support error");
                return;
            }

            userInfoDao.insertUserInfo(userInfo);
            userInfoDao.updateUserInfo(userInfo);
            userInfoDao.deleteUserInfo(userInfo);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return;


    }
}

