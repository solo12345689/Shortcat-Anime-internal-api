package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.a3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3413a3 {
    public static InterfaceC3553q a(Object obj) {
        if (obj == null) {
            return InterfaceC3553q.f39930a0;
        }
        if (obj instanceof String) {
            return new C3588u((String) obj);
        }
        if (obj instanceof Double) {
            return new C3490j((Double) obj);
        }
        if (obj instanceof Long) {
            return new C3490j(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C3490j(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new C3463g((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            C3454f c3454f = new C3454f();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c3454f.w(c3454f.t(), a(it.next()));
            }
            return c3454f;
        }
        C3526n c3526n = new C3526n();
        Map map = (Map) obj;
        for (Object string : map.keySet()) {
            InterfaceC3553q interfaceC3553qA = a(map.get(string));
            if (string != null) {
                if (!(string instanceof String)) {
                    string = string.toString();
                }
                c3526n.d((String) string, interfaceC3553qA);
            }
        }
        return c3526n;
    }

    public static InterfaceC3553q b(G3 g32) {
        if (g32 == null) {
            return InterfaceC3553q.f39929W;
        }
        int iL = g32.L() - 1;
        if (iL == 1) {
            return g32.E() ? new C3588u(g32.F()) : InterfaceC3553q.f39936g0;
        }
        if (iL == 2) {
            return g32.I() ? new C3490j(Double.valueOf(g32.J())) : new C3490j(null);
        }
        if (iL == 3) {
            return g32.G() ? new C3463g(Boolean.valueOf(g32.H())) : new C3463g(null);
        }
        if (iL != 4) {
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
        List listC = g32.C();
        ArrayList arrayList = new ArrayList();
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(b((G3) it.next()));
        }
        return new r(g32.D(), arrayList);
    }
}
