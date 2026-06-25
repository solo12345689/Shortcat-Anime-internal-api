package androidx.work.impl;

import Ud.AbstractC2279u;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import n4.AbstractC5748x;
import n4.C5737m;
import n4.C5745u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: a */
    private final Object f32947a = new Object();

    /* JADX INFO: renamed from: b */
    private final Map f32948b = new LinkedHashMap();

    public final boolean a(C5737m id2) {
        boolean zContainsKey;
        AbstractC5504s.h(id2, "id");
        synchronized (this.f32947a) {
            zContainsKey = this.f32948b.containsKey(id2);
        }
        return zContainsKey;
    }

    public final v b(C5737m id2) {
        v vVar;
        AbstractC5504s.h(id2, "id");
        synchronized (this.f32947a) {
            vVar = (v) this.f32948b.remove(id2);
        }
        return vVar;
    }

    public final List c(String workSpecId) {
        List listB1;
        AbstractC5504s.h(workSpecId, "workSpecId");
        synchronized (this.f32947a) {
            try {
                Map map = this.f32948b;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (AbstractC5504s.c(((C5737m) entry.getKey()).b(), workSpecId)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it = linkedHashMap.keySet().iterator();
                while (it.hasNext()) {
                    this.f32948b.remove((C5737m) it.next());
                }
                listB1 = AbstractC2279u.b1(linkedHashMap.values());
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return listB1;
    }

    public final v d(C5737m id2) {
        v vVar;
        AbstractC5504s.h(id2, "id");
        synchronized (this.f32947a) {
            try {
                Map map = this.f32948b;
                Object vVar2 = map.get(id2);
                if (vVar2 == null) {
                    vVar2 = new v(id2);
                    map.put(id2, vVar2);
                }
                vVar = (v) vVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return vVar;
    }

    public final v e(C5745u spec) {
        AbstractC5504s.h(spec, "spec");
        return d(AbstractC5748x.a(spec));
    }
}
