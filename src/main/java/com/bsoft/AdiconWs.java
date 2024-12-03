package com.bsoft;

import com.bsoft.client.AdiconWebService;
import com.bsoft.client.AdiconWebServiceSoap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

@Component
@EnableScheduling
public class AdiconWs {
    @Autowired
    AdiconWebService adiconWebService;

    @Scheduled(fixedRate = 10_000)
    public void adiconWs() {

//        AdiconWebService adiconWebService = new AdiconWebService();
        AdiconWebServiceSoap adiconWebServicePort = adiconWebService.getAdiconWebServiceSoap();

        String key = "0xedAmh6MJfgAJ1LOxRTyAUgFYFEjEv2jXtlhKt7Ik0srls1M7/uXg==";

        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        String key3 = adiconWebServicePort.login("261079", "abc123");
        System.out.println(key3);

//        String itemList = adiconWebServicePort.getReportItemListByCustomerBarocde(key, "401030199301", "常规报告");
//        ItemListProcess itemListProcess = new ItemListProcess();
//        itemListProcess.itemListProcess(itemList);

//        byte[] pdfData = adiconWebServicePort.getByteReportByYYtm("401030199301", key);
//        // 输出 PDF 文件路径
//        String outputFilePath = "output.pdf";
//        // 将 byte[] 数据写入 PDF 文件
//        try (FileOutputStream fos = new FileOutputStream(outputFilePath)) {
//            fos.write(pdfData);
//            System.out.println("PDF 文件已成功创建：" + outputFilePath);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
