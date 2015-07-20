package yocn.com.collection.utils;

import android.app.Activity;

/**
 * Created by JD on 2015/7/17.
 */
public class ListBean {
    private String name;
    private Class<?> activity;
    private String pic;

    public ListBean(String name, Class<?> activity) {
        this.name = name;
        this.activity = activity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Class getActivity() {
        return activity;
    }

    public void setActivity(Class<?> activity) {
        this.activity = activity;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    @Override
    public String toString() {
        return "ListBean{" +
                "name='" + name + '\'' +
                ", activity=" + activity +
                ", pic='" + pic + '\'' +
                '}';
    }
}
