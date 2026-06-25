package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.n */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C3526n implements InterfaceC3553q, InterfaceC3517m {

    /* JADX INFO: renamed from: a */
    final Map f39866a = new HashMap();

    public final List a() {
        return new ArrayList(this.f39866a.keySet());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3517m
    public final InterfaceC3553q c(String str) {
        Map map = this.f39866a;
        return map.containsKey(str) ? (InterfaceC3553q) map.get(str) : InterfaceC3553q.f39929W;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3517m
    public final void d(String str, InterfaceC3553q interfaceC3553q) {
        if (interfaceC3553q == null) {
            this.f39866a.remove(str);
        } else {
            this.f39866a.put(str, interfaceC3553q);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3526n) {
            return this.f39866a.equals(((C3526n) obj).f39866a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3517m
    public final boolean f(String str) {
        return this.f39866a.containsKey(str);
    }

    public final int hashCode() {
        return this.f39866a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3553q
    public final String k() {
        return "[object Object]";
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3553q
    public final Double l() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3553q
    public final Boolean m() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3553q
    public final Iterator n() {
        return InterfaceC3517m.e(this.f39866a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3553q
    public final InterfaceC3553q p() {
        C3526n c3526n = new C3526n();
        for (Map.Entry entry : this.f39866a.entrySet()) {
            if (entry.getValue() instanceof InterfaceC3517m) {
                c3526n.f39866a.put((String) entry.getKey(), (InterfaceC3553q) entry.getValue());
            } else {
                c3526n.f39866a.put((String) entry.getKey(), ((InterfaceC3553q) entry.getValue()).p());
            }
        }
        return c3526n;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3553q
    public InterfaceC3553q r(String str, Y1 y12, List list) {
        return "toString".equals(str) ? new C3588u(toString()) : InterfaceC3517m.b(this, new C3588u(str), y12, list);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        Map map = this.f39866a;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb2.append(String.format("%s: %s,", str, map.get(str)));
            }
            sb2.deleteCharAt(sb2.lastIndexOf(com.amazon.a.a.o.b.f.f34694a));
        }
        sb2.append("}");
        return sb2.toString();
    }
}
