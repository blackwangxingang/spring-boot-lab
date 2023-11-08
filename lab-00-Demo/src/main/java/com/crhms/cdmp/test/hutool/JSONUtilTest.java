package com.crhms.cdmp.test.hutool;

import cn.hutool.json.JSON;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 王新刚
 * @date 2023/11/07 14:12
 */
@Slf4j
public class JSONUtilTest {


    public static void main(String[] args) {
        String xml = "<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\"><soap:Body><bus:requestResponse xmlns:bus=\"http://crhms.cn/bus\"><repMessage>&lt;BusResponseData&gt;&lt;reqTimestamp&gt;1699410093597&lt;/reqTimestamp&gt;&lt;data&gt;&lt;queryData&gt;&lt;YUANNEI_CODE/&gt;&lt;LAST_UPDATED_DATE&gt;1684143973000&lt;/LAST_UPDATED_DATE&gt;&lt;ID&gt;1&lt;/ID&gt;&lt;YIBAO_CODE&gt;1&lt;/YIBAO_CODE&gt;&lt;/queryData&gt;&lt;queryData&gt;&lt;YUANNEI_CODE/&gt;&lt;LAST_UPDATED_DATE&gt;1684143973000&lt;/LAST_UPDATED_DATE&gt;&lt;ID&gt;2&lt;/ID&gt;&lt;YIBAO_CODE&gt;2&lt;/YIBAO_CODE&gt;&lt;/queryData&gt;&lt;queryData&gt;&lt;YUANNEI_CODE&gt; &lt;/YUANNEI_CODE&gt;&lt;ID&gt;3&lt;/ID&gt;&lt;YIBAO_CODE&gt;3&lt;/YIBAO_CODE&gt;&lt;/queryData&gt;&lt;queryData&gt;&lt;YUANNEI_CODE&gt; &lt;/YUANNEI_CODE&gt;&lt;ID&gt;4&lt;/ID&gt;&lt;YIBAO_CODE&gt;4&lt;/YIBAO_CODE&gt;&lt;/queryData&gt;&lt;queryData&gt;&lt;YUANNEI_CODE&gt; &lt;/YUANNEI_CODE&gt;&lt;LAST_UPDATED_DATE&gt;1683464409000&lt;/LAST_UPDATED_DATE&gt;&lt;ID&gt;5&lt;/ID&gt;&lt;YIBAO_CODE&gt;5&lt;/YIBAO_CODE&gt;&lt;/queryData&gt;&lt;/data&gt;&lt;processTime&gt;108&lt;/processTime&gt;&lt;errorMsg/&gt;&lt;requestId&gt;1722076863671803905&lt;/requestId&gt;&lt;status&gt;SUCCESS&lt;/status&gt;&lt;/BusResponseData&gt;</repMessage></bus:requestResponse></soap:Body></soap:Envelope>";
        JSONObject entries = JSONUtil.xmlToJson(xml);
        System.out.println(entries);

        System.out.println("====================================");

        String dataXml = "<BusResponseData><reqTimestamp>1699410093597</reqTimestamp><data><queryData><YUANNEI_CODE/><LAST_UPDATED_DATE>1684143973000</LAST_UPDATED_DATE><ID>1</ID><YIBAO_CODE>1</YIBAO_CODE></queryData><queryData><YUANNEI_CODE/><LAST_UPDATED_DATE>1684143973000</LAST_UPDATED_DATE><ID>2</ID><YIBAO_CODE>2</YIBAO_CODE></queryData><queryData><YUANNEI_CODE> </YUANNEI_CODE><ID>3</ID><YIBAO_CODE>3</YIBAO_CODE></queryData><queryData><YUANNEI_CODE> </YUANNEI_CODE><ID>4</ID><YIBAO_CODE>4</YIBAO_CODE></queryData><queryData><YUANNEI_CODE> </YUANNEI_CODE><LAST_UPDATED_DATE>1683464409000</LAST_UPDATED_DATE><ID>5</ID><YIBAO_CODE>5</YIBAO_CODE></queryData></data><processTime>108</processTime><errorMsg/><requestId>1722076863671803905</requestId><status>SUCCESS</status></BusResponseData>";
        JSONObject dataEntries = JSONUtil.xmlToJson(dataXml);
        System.out.println(dataEntries);
    }
}
