package name.dengchao.workflows.helloworld;

import com.alibaba.fastjson2.JSON;
import name.dengchao.workflows.model.Item;
import name.dengchao.workflows.model.Items;
import name.dengchao.workflows.utils.Lists;

import java.util.UUID;

public class HelloWorld {

    public static void main(String[] args) {
        Item item = new Item();
        item.setTitle("hello world");
        item.setSubtitle("hello world");
        item.setArg(args[0]);
        item.setUid(UUID.randomUUID().toString());
        Items items = new Items();
        items.setItems(Lists.newArrayList(item));
        System.out.println(JSON.toJSONString(items));
    }
}
