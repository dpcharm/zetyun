//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Map;
//
//import org.apache.http.HttpResponse;
//import org.apache.http.HttpStatus;
//import org.apache.http.client.methods.HttpPost;
//import org.apache.http.entity.StringEntity;
//import org.apache.http.impl.client.CloseableHttpClient;
//import org.apache.http.impl.client.HttpClientBuilder;
//import org.apache.http.util.EntityUtils;
//
//import com.alibaba.fastjson.JSON;
//import com.alibaba.fastjson.JSONArray;
//import com.alibaba.fastjson.JSONObject;
//
//
//public class APSTest {
//    public void TestAPI() {
//        String url = "https://test.aps.zetyun.cn:443/aps/msserver/project/756871b5-1f2b-4599-bcc5-20829c5013b2/service/dea64e70-df94-4fdd-9969-045335d50660/predict";
//        String body = "";
//        //
//        JSONObject map = new JSONObject();
//        map.put("apiKey", "c24ab8d7-d6fb-435c-a250-f211e84b8821");
//        map.put("requestId", "2f82ec5c-18dc-4749-bfa4-e39ca5553989");
//
//        JSONArray maps = new JSONArray();
//        JSONArray mapsup = new JSONArray();
//
//        Map<String, String> submap1 = new HashMap<String, String>();
//        submap1.put("name", "age");
//        submap1.put("type", "int");
//        submap1.put("value", "58");
//        maps.add(submap1);
//
//        Map<String, String> submap2 = new HashMap<String, String>();
//        submap2.put("name", "job");
//        submap2.put("type", "string");
//        submap2.put("value", "unemployed");
//        maps.add(submap2);
//
//        Map<String, String> submap3 = new HashMap<String, String>();
//        submap3.put("name", "marital");
//        submap3.put("type", "string");
//        submap3.put("value", "married");
//        maps.add(submap3);
//
//
//        Map<String, String> submap4 = new HashMap<String, String>();
//        submap4.put("name", "education");
//        submap4.put("type", "string");
//        submap4.put("value", "tertiary");
//        maps.add(submap4);
//
//
//        Map<String, String> submap5 = new HashMap<String, String>();
//        submap5.put("name", "balance");
//        submap5.put("type", "int");
//        submap5.put("value", "2143");
//        maps.add(submap5);
//
//        Map<String, String> submap6 = new HashMap<String, String>();
//        submap6.put("name", "housing");
//        submap6.put("type", "string");
//        submap6.put("value", "yes");
//        maps.add(submap6);
//
//        Map<String, String> submap7 = new HashMap<String, String>();
//        submap7.put("name", "loan");
//        submap7.put("type", "string");
//        submap7.put("value", "no");
//        maps.add(submap7);
//
//        Map<String, String> submap8 = new HashMap<String, String>();
//        submap8.put("name", "contact");
//        submap8.put("type", "string");
//        submap8.put("value", "cellular");
//        maps.add(submap8);
//
//        Map<String, String> submap9 = new HashMap<String, String>();
//        submap9.put("name", "day");
//        submap9.put("type", "int");
//        submap9.put("value", "5");
//        maps.add(submap9);
//
//
//        Map<String, String> submap10 = new HashMap<String, String>();
//        submap10.put("name", "month");
//        submap10.put("type", "string");
//        submap10.put("value", "oct");
//        maps.add(submap10);
//
//        Map<String, String> submap11 = new HashMap<String, String>();
//        submap11.put("name", "duration");
//        submap11.put("type", "int");
//        submap11.put("value", "261");
//        maps.add(submap11);
//
//        Map<String, String> submap12 = new HashMap<String, String>();
//        submap12.put("name", "campaign");
//        submap12.put("type", "int");
//        submap12.put("value", "1");
//        maps.add(submap12);
//
//        Map<String, String> submap13 = new HashMap<String, String>();
//        submap13.put("name", "pdays");
//        submap13.put("type", "int");
//        submap13.put("value", "-1");
//        maps.add(submap13);
//
//        Map<String, String> submap14 = new HashMap<String, String>();
//        submap14.put("name", "previous");
//        submap14.put("type", "int");
//        submap14.put("value", "0");
//        maps.add(submap14);
//
//        Map<String, String> submap15 = new HashMap<String, String>();
//        submap15.put("name", "poutcome");
//        submap15.put("type", "string");
//        submap15.put("value", "unknown");
//        maps.add(submap15);
//
//        mapsup.add(maps);
//        map.put("data", mapsup);
//
//        //���������ת��Ϊjson�ַ���
//        String param = JSON.toJSONString(map);
//        System.out.println(param);
//        CloseableHttpClient httpclient = HttpClientBuilder.create().build();
//        HttpPost post = new HttpPost(url);
//        JSONObject response = null;
//        try {
//            StringEntity s = new StringEntity(param, "UTF-8");
//            s.setContentEncoding("UTF-8");
//            s.setContentType("application/json;format=v1");//����json������Ҫ����contentType
//            post.setEntity(s);
//            HttpResponse res = httpclient.execute(post);
//            if (res.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
//                body = EntityUtils.toString(res.getEntity());// ����json��ʽ��
//            }
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//        JSONObject ret = JSON.parseObject(body);
//
//        showJsonRes(ret);
//    }
//
//    /**
//     * @param
//     */
//    public void showJsonRes(JSONObject json) {
//        System.out.println("Results Showing:");
//        Iterator<String> keys = json.keySet().iterator();
//        while (keys.hasNext()) {
//            String tmpstr = keys.next();
//            System.out.println(tmpstr + ":" + json.getString(tmpstr));
//        }
//
//    }
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        new APSTest().TestAPI();
//    }
//
//}
