package io.sentry.config;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f50628a;

    public c(List list) {
        this.f50628a = list;
    }

    @Override // io.sentry.config.f
    public Map getMap(String str) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Iterator it = this.f50628a.iterator();
        while (it.hasNext()) {
            concurrentHashMap.putAll(((f) it.next()).getMap(str));
        }
        return concurrentHashMap;
    }

    @Override // io.sentry.config.f
    public String getProperty(String str) {
        Iterator it = this.f50628a.iterator();
        while (it.hasNext()) {
            String property = ((f) it.next()).getProperty(str);
            if (property != null) {
                return property;
            }
        }
        return null;
    }
}
