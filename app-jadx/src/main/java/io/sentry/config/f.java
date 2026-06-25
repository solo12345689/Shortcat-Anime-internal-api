package io.sentry.config;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public interface f {
    default List a(String str) {
        String property = getProperty(str);
        return property != null ? Arrays.asList(property.split(com.amazon.a.a.o.b.f.f34694a)) : Collections.EMPTY_LIST;
    }

    default Long b(String str) {
        String property = getProperty(str);
        if (property == null) {
            return null;
        }
        try {
            return Long.valueOf(property);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    default Double c(String str) {
        String property = getProperty(str);
        if (property == null) {
            return null;
        }
        try {
            return Double.valueOf(property);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    default String d(String str, String str2) {
        String property = getProperty(str);
        return property != null ? property : str2;
    }

    default Boolean e(String str) {
        String property = getProperty(str);
        if (property != null) {
            return Boolean.valueOf(property);
        }
        return null;
    }

    default List f(String str) {
        String property = getProperty(str);
        if (property != null) {
            return Arrays.asList(property.split(com.amazon.a.a.o.b.f.f34694a));
        }
        return null;
    }

    Map getMap(String str);

    String getProperty(String str);
}
