package name.dengchao.workflows.model;

import lombok.Data;

@Data
public class Item {
    private String uid;
    private String type;
    private String title;
    private String subtitle;
    private String arg;
    private String autocomplete;
    private Icon icon;
}
