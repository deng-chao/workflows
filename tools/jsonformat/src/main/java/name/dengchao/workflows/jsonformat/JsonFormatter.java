package name.dengchao.workflows.jsonformat;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONWriter;
import name.dengchao.workflows.model.Item;
import name.dengchao.workflows.service.Converter;

public class JsonFormatter implements Converter {

    @Override
    public Item convert(String input) {
        Item item = new Item();
        JSONObject json = JSON.parseObject(input);
        String prettyJson = json.toJSONString(JSONWriter.Feature.PrettyFormat);
        item.setArg(prettyJson);
        item.setTitle("格式化完成");
        item.setSubtitle("回车查看，并复制到剪切板。");
        return item;
    }

    public static void main(String[] args) {
        JsonFormatter formatter = new JsonFormatter();
        System.out.println(formatter.convert("{\"aa\":\"bb\"}"));
    }
}
