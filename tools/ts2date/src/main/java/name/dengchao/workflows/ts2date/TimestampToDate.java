package name.dengchao.workflows.ts2date;

import name.dengchao.workflows.model.Item;
import name.dengchao.workflows.service.Converter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimestampToDate implements Converter {

    @Override
    public Item convert(String input) {
        long ts = Long.parseLong(input);
        Date date = new Date(ts);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String dateStr = sdf.format(date);
        Item item = new Item();
        item.setTitle(dateStr);
        item.setArg(dateStr);
        item.setSubtitle("回车复制结果到剪切板");
        return item;
    }
}
