//package com.schoolinformationmanagementsystem;
//
//import org.apache.commons.dbcp2.BasicDataSource;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.SQLFeatureNotSupportedException;
//import java.util.logging.Logger;
///**
// * Created by ao.ouyang on 15-11-18.
// */
//public class BasicDataSourceExt extends BasicDataSource {
//    @Override
//    public <T> T unwrap(Class<T> iface) throws SQLException {
//        // TODO Auto-generated method stub
//        return null;
//    }
//    @Override
//    public boolean isWrapperFor(Class<?> iface) throws SQLException {
//        // TODO Auto-generated method stub
//        return false;
//    }
//    @Override
//    public synchronized void close() throws SQLException {
//        DriverManager.deregisterDriver(DriverManager.getDriver(url));
//        super.close();
//    }
//    @Override
//    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
//        return null;
//    }
//    
//    
//    @Override
//    public void destroy() {
//        super.destroy();
//        try{
//            DriverManager.deregisterDriver(DriverManager.getDrivers().nextElement());
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//    }
//}