package com.amazon.device.drm.a.d;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements com.amazon.device.drm.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<Class, Class> f34973a;

    static {
        HashMap map = new HashMap();
        f34973a = map;
        map.put(com.amazon.device.drm.a.c.class, c.class);
    }

    @Override // com.amazon.device.drm.a.b
    public <T> Class<T> a(Class<T> cls) {
        return f34973a.get(cls);
    }
}
