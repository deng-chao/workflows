package name.dengchao.workflows.jsonformat;

import com.alibaba.fastjson2.JSON;
import name.dengchao.workflows.model.Item;
import name.dengchao.workflows.model.Items;
import name.dengchao.workflows.utils.Lists;

public class Main {
    public static void main(String[] args) {
        StringBuilder input = new StringBuilder();
        for (String arg : args) {
            input.append(arg);
        }
        Items items = new Items();
        try {
            JsonFormatter formatter = new JsonFormatter();
            items.setItems(Lists.newArrayList(formatter.convert(input.toString())));
        } catch (Exception e) {
            Item item = new Item();
            item.setTitle("failed to parse json");
            item.setSubtitle(e.getMessage());
            items.setItems(Lists.newArrayList(item));
        }
        System.out.println(JSON.toJSONString(items));
    }
}