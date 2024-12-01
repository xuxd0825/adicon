package com.bsoft;

import java.io.ByteArrayInputStream;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;

public class ItemListProcess {
    private static final Logger log = LoggerFactory.getLogger(ItemListProcess.class);
    private String itemList;

    public String getItemList() {
        return itemList;
    }

    public void setItemList(String itemList) {
        this.itemList = itemList;
    }

    public void itemListProcess(String itemList) {
        String url = "jdbc:mysql://localhost:3306/mysql";
        String user = "root";
        String password = "mysql";
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

//            itemList = itemList.replace("<?xml version=\"1.0\" encoding=\"utf-8\"?>","");
            // 将 XML 字符串转换为 InputStream
            ByteArrayInputStream inputStream = new ByteArrayInputStream(itemList.getBytes());

            Document doc = dBuilder.parse(inputStream);
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("item");
            String sql = "INSERT INTO l_testresult (AdiconBarcode, PatientName, Sex, Age, AgeType, sfzid, Department, BedNo, CollectionDate, ReceivedDate, LisDate, ReportDate, CustomerBarcode, Doctor, Technician, Checkedby, Remark, Instrument, SerialNumber, SampleType, ClinicalDiagnosis, ItemCode, ItemName_CN, ItemName_EN, Result, ResultHint, ResultReference, ResultUnit, TestMethod, TestMethod_EN, Result_Pathology, SampleChar, PatientNumber, PatientPhone, BirthDate, jyjs, Str1, Str2, Str3, Str4, Str5, technicianid, checkedbyid, approver, approverid, CustomRequestitemid, Customitemid, CriticalValueFlag, CustomerPositiveFlag, Xmbh, Ybzt, zhmc, Bgjyjs) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Element eElement = (Element) nList.item(temp);
                pstmt.setString(1, getElementTextContent(eElement, "AdiconBarcode"));
                pstmt.setString(2, getElementTextContent(eElement, "PatientName"));
                pstmt.setString(3, getElementTextContent(eElement, "Sex"));
                pstmt.setString(4, getElementTextContent(eElement, "Age"));
                pstmt.setString(5, getElementTextContent(eElement, "AgeType"));
                pstmt.setString(6, getElementTextContent(eElement, "sfzid"));
                pstmt.setString(7, getElementTextContent(eElement, "Department"));
                pstmt.setString(8, getElementTextContent(eElement, "BedNo"));
                pstmt.setString(9, getElementTextContent(eElement, "CollectionDate"));
                pstmt.setString(10, getElementTextContent(eElement, "ReceivedDate"));
                pstmt.setString(11, getElementTextContent(eElement, "LisDate"));
                pstmt.setString(12, getElementTextContent(eElement, "ReportDate"));
                pstmt.setString(13, getElementTextContent(eElement, "CustomerBarcode"));
                pstmt.setString(14, getElementTextContent(eElement, "Doctor"));
                pstmt.setString(15, getElementTextContent(eElement, "Technician"));
                pstmt.setString(16, getElementTextContent(eElement, "Checkedby"));
                pstmt.setString(17, getElementTextContent(eElement, "Remark"));
                pstmt.setString(18, getElementTextContent(eElement, "Instrument"));
                pstmt.setString(19, getElementTextContent(eElement, "SerialNumber"));
                pstmt.setString(20, getElementTextContent(eElement, "SampleType"));
                pstmt.setString(21, getElementTextContent(eElement, "ClinicalDiagnosis"));
                pstmt.setString(22, getElementTextContent(eElement, "ItemCode"));
                pstmt.setString(23, getElementTextContent(eElement, "ItemName_CN"));
                pstmt.setString(24, getElementTextContent(eElement, "ItemName_EN"));
                pstmt.setString(25, getElementTextContent(eElement, "Result"));
                pstmt.setString(26, getElementTextContent(eElement, "ResultHint"));
                pstmt.setString(27, getElementTextContent(eElement, "ResultReference"));
                pstmt.setString(28, getElementTextContent(eElement, "ResultUnit"));
                pstmt.setString(29, getElementTextContent(eElement, "TestMethod"));
                pstmt.setString(30, getElementTextContent(eElement, "TestMethod_EN"));
                pstmt.setString(31, getElementTextContent(eElement, "Result_Pathology"));
                pstmt.setString(32, getElementTextContent(eElement, "SampleChar"));
                pstmt.setString(33, getElementTextContent(eElement, "PatientNumber"));
                pstmt.setString(34, getElementTextContent(eElement, "PatientPhone"));
                pstmt.setString(35, getElementTextContent(eElement, "BirthDate"));
                pstmt.setString(36, getElementTextContent(eElement, "jyjs"));
                pstmt.setString(37, getElementTextContent(eElement, "Str1"));
                pstmt.setString(38, getElementTextContent(eElement, "Str2"));
                pstmt.setString(39, getElementTextContent(eElement, "Str3"));
                pstmt.setString(40, getElementTextContent(eElement, "Str4"));
                pstmt.setString(41, getElementTextContent(eElement, "Str5"));
                pstmt.setString(42, getElementTextContent(eElement, "technicianid"));
                pstmt.setString(43, getElementTextContent(eElement, "checkedbyid"));
                pstmt.setString(44, getElementTextContent(eElement, "approver"));
                pstmt.setString(45, getElementTextContent(eElement, "approverid"));
                pstmt.setString(46, getElementTextContent(eElement, "CustomRequestitemid"));
                pstmt.setString(47, getElementTextContent(eElement, "Customitemid"));
                pstmt.setString(48, getElementTextContent(eElement, "CriticalValueFlag"));
                pstmt.setString(49, getElementTextContent(eElement, "CustomerPositiveFlag"));
                pstmt.setString(50, getElementTextContent(eElement, "Xmbh"));
                pstmt.setString(51, getElementTextContent(eElement, "Ybzt"));
                pstmt.setString(52, getElementTextContent(eElement, "zhmc"));
                pstmt.setString(53, getElementTextContent(eElement, "Bgjyjs"));
                pstmt.executeUpdate();
            }
            pstmt.close();
            conn.close();
            System.out.println("数据插入成功！");
        } catch (Exception e) {
            log.error("e: ", e);
        }
    }

    private static String getElementTextContent(Element element, String tagName) {
        return element.getElementsByTagName(tagName).item(0).getTextContent();
    }

}