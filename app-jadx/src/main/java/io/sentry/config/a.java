package io.sentry.config;

import io.sentry.util.D;
import io.sentry.util.w;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
abstract class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f50623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Properties f50624b;

    protected a(String str, Properties properties) {
        this.f50623a = (String) w.c(str, "prefix is required");
        this.f50624b = (Properties) w.c(properties, "properties are required");
    }

    @Override // io.sentry.config.f
    public Map getMap(String str) {
        String str2 = this.f50623a + str + ".";
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f50624b.entrySet()) {
            if ((entry.getKey() instanceof String) && (entry.getValue() instanceof String)) {
                String str3 = (String) entry.getKey();
                if (str3.startsWith(str2)) {
                    map.put(str3.substring(str2.length()), D.f((String) entry.getValue(), "\""));
                }
            }
        }
        return map;
    }

    @Override // io.sentry.config.f
    public String getProperty(String str) {
        return D.f(this.f50624b.getProperty(this.f50623a + str), "\"");
    }

    protected a(Properties properties) {
        this("", properties);
    }
}
