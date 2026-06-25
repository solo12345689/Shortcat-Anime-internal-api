package Og;

import gh.e;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map f13165a;

    static {
        HashMap map = new HashMap();
        f13165a = map;
        map.put(Sg.a.f16668b.b(), e.f47505d);
        f13165a.put(Sg.a.f16669c.b(), e.f47506e);
        f13165a.put(Sg.a.f16670d.b(), e.f47507f);
    }

    static e a(String str) {
        return (e) f13165a.get(str);
    }
}
