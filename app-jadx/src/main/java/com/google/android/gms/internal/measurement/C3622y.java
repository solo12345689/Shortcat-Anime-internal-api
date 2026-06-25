package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3622y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map f40107a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final L f40108b = new L();

    public C3622y() {
        a(new C3606w());
        a(new C3630z());
        a(new A());
        a(new E());
        a(new J());
        a(new K());
        a(new M());
    }

    final void a(AbstractC3614x abstractC3614x) {
        Iterator it = abstractC3614x.f40020a.iterator();
        while (it.hasNext()) {
            this.f40107a.put(((N) it.next()).b().toString(), abstractC3614x);
        }
    }

    public final InterfaceC3553q b(Y1 y12, InterfaceC3553q interfaceC3553q) {
        AbstractC3633z2.l(y12);
        if (!(interfaceC3553q instanceof r)) {
            return interfaceC3553q;
        }
        r rVar = (r) interfaceC3553q;
        ArrayList arrayListB = rVar.b();
        String strA = rVar.a();
        Map map = this.f40107a;
        return (map.containsKey(strA) ? (AbstractC3614x) map.get(strA) : this.f40108b).a(strA, y12, arrayListB);
    }
}
