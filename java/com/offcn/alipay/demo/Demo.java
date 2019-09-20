package com.offcn.alipay.demo;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.alipay.api.request.AlipayTradePrecreateRequest;
import com.alipay.api.response.AlipayTradePagePayResponse;
import com.alipay.api.response.AlipayTradePrecreateResponse;

/**
 * 预下单接口
 */
public class Demo {
    public static void main(String[] args) throws AlipayApiException {
        // https://openapi.alipaydev.com/gateway.do  沙箱环境
        // https://openapi.alipay.com/gateway.do     正式环境
        AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipaydev.com/gateway.do","2016092900624384","MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCrH2/ehyXwWOzaaigfjumaW1+nUUzjY5MJhIsgnWxsBKE6XXJGQQutsamqE5EmU1VcWyeo/befjQDRQdUhARBbb2ze9adv7OkD/TGm+ahDFIhPRRkkkyiag1j/r/5HwHj3Q1tBoFJK4eAQ3RDMdbJbLztomm85x107hfb2hHDvo0wzvxGl+QhLw9lb7RPyuUBqrRxHMP6gxMGxZUySxPdTd8I7TvL2vNhbQOcSxhm+bFnJDK+65U6dW3cMQKRatG/xWUgJs5oTSksQ72n3ss0dryqAY+xQWS1OgCqouJSfvT76zbeig97Na1oZWh12Rmu7ZHgG5iln6PceCK/yQzO1AgMBAAECggEAaA9E6xBKPN8GoUc+wPoaCjiYcVnaJMjPiFEmfZ3dac5i8OgUbq5tWKGaKAegE6tHVFNGSdiHyilnntimr1xDQyb+EJNXz5NEm51jjUNyU+Bvh6zgPkKSxWssOsgeHCnqJYq7OqwwfsLei8KyzXKhFBwjx1dqXbtjcafkZ0JgnwgvrnUL+qXj2a9tLwLsZw8RS0bxawlxg18FD4Pac41rQar4mDYkZogSWtp40GOL6GT7ReDTafsuItu++UvNXx9sFMZuK8PwtJSq2wAvjI4/f257GugwCgZ2XAhu2rsfiwM0hq0UUhU+v60Syv+lu/1F7A6XtvHHMs4mgglNs3yTPQKBgQD1Wi5lFHUv7EG8cEv8mS+1oGXLYKf3Ra8srIQA8l5mgEmBxOdOI9JScucj7j1Nf52EI0kpU4ullAjs7OXjPP1p28sAFDP8NX1VXWBJtT2b1R4eIq1iXxc2T6q9ZzXi5OgXb4Hp0m2eTW9gw3SUXN6lC5zjdtGxo75N/1Awv2MIDwKBgQCyjJR3t4mFPdIyaTdtOHwbrcaH9ReQphOU4xyZLr3/qENaBv01CTSU4avTdAFCANcSXurMDLjgbUs0cbM93pJ8J76A4ju/jGea9Q3NbCRRp3GC6UbgrC5w5kPFsErM+laJCTUvu7bKtE/m3Fvxj/CtNV/dwaDktPdVgLHbRqvj+wKBgF2TBmzQr50Waz/WSHTPa83GnexCMe1x60yLg1DlHzHSrbZLhbhcmyOM5TDj9Qdwq3+xAX88eN8upXTPKSJQqYnNJRAjpGwFboa3NTkHYbbkQjdWHHCPOcgh/El+aqPdj9MYWSD3e41LlTX/dZ/8B4JE+pIaSAGLJNKUlF3zMG7rAoGAfBG7yUS8Rt4ihe0fGsI5W3Jxll/1NApzaO44HSmh1VkzFAfvQz9WTm5SW+ksRpUW3iketxPQFANeUt7/UmqrF6L2edC6++uwwriuEqSmyCa2deVr3wtGaiVXyrMqBy2dnDPNxZGG/2w0aZOOQFlpQLLqHspB5yrpA30eGeUN5KkCgYEAgy8zwACj0ICXjhBVCNIWHNK5zz1gUSM18PCfB7ffOnIRGbuCjbXTd59VEF03VVAD8GWH3MHMGuSk/2ftN2FpkjN4hZUcRk/ksy1TAzWLa/ObGDAqSzA5DaU0NVsZ7EBrVg05g8dh4ftepGzgPQe0ay8GmdlbaI/bGbUfilD6dsg=","json","GBK","MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAjIHcSHGNY3e3YknRd6eHLHMbYlhGic3tlSw0PlkkKwPsoKIAlgUcnKGnWkYcODBZqMq2r9LFN2rNLcQg198RFxtmu9w6GBQUfjwVRVb5VvVdOdAFhOwBs7Zk2tatuP+Y841pqhLnf/GrfN/p6frroUpBI++7p430ftw2aGBdjiJj98zEmxVGw+EoWxhxHA6tlJpxEVZFBzlAKWeXiokh6YL8bgG4+HG1C1AH++RQx09PI0Oz6lI/EeDJj3vjUb9B8KI0Y0Iq6kWaFNttNepPtWtAXa4Pa4vjf7StmeqPWZo6nn9GWy/WMN+J8SJVve1q93tNeywpX0JQl1+YtSueTwIDAQAB","RSA2");
        AlipayTradePrecreateRequest request = new AlipayTradePrecreateRequest();
        request.setBizContent("{" +
                "\"out_trade_no\":\"20150320010101001\"," +
                "\"total_amount\":88.88," +
                "\"subject\":\"Iphone6 16G\"," +
                "\"qr_code_timeout_express\":\"90m\"" +
                "  }");
        AlipayTradePrecreateResponse response = alipayClient.execute(request);
        String code = response.getCode();
        String qrCode = response.getQrCode();
        System.out.println(qrCode);
        System.out.println(code);
        if(response.isSuccess()){
            System.out.println("调用成功");
        } else {
            System.out.println("调用失败");
        }
    }
}
