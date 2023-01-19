package name.dengchao.workflows.ts2date;

import com.alibaba.fastjson2.JSON;
import name.dengchao.workflows.model.Item;
import name.dengchao.workflows.model.Items;
import name.dengchao.workflows.utils.Lists;

public class Main {

    public static void main(String[] args) {
        Items items = new Items();
        try {
            TimestampToDate converter = new TimestampToDate();
            items.setItems(Lists.newArrayList(converter.convert(args[0])));
        } catch (Exception e) {
            Item item = new Item();
            item.setTitle("failed to convert timestamp");
            item.setSubtitle(e.getMessage());
            items.setItems(Lists.newArrayList(item));
        }
        System.out.println(JSON.toJSONString(items));
    }
}
