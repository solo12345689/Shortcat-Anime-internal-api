package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.k */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3499k implements InterfaceC3553q, InterfaceC3517m {

    /* JADX INFO: renamed from: a */
    protected final String f39806a;

    /* JADX INFO: renamed from: b */
    protected final Map f39807b = new HashMap();

    public AbstractC3499k(String str) {
        this.f39806a = str;
    }

    public abstract InterfaceC3553q a(Y1 y12, List list);

    @Override // com.google.android.gms.internal.measurement.InterfaceC3517m
    public final InterfaceC3553q c(String str) {
        Map map = this.f39807b;
        return map.containsKey(str) ? (InterfaceC3553q) map.get(str) : InterfaceC3553q.f39929W;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3517m
    public final void d(String str, InterfaceC3553q interfaceC3553q) {
        if (interfaceC3553q == null) {
            this.f39807b.remove(str);
        } else {
            this.f39807b.put(str, interfaceC3553q);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC3499k)) {
            return false;
        }
        AbstractC3499k abstractC3499k = (AbstractC3499k) obj;
        String str = this.f39806a;
        if (str != null) {
            return str.equals(abstractC3499k.f39806a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3517m
    public final boolean f(String str) {
        return this.f39807b.containsKey(str);
    }

    public final String g() {
        return this.f39806a;
    }

    public final int hashCode() {
        String str = this.f39806a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3553q
    public final String k() {
        return this.f39806a;
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
        return InterfaceC3517m.e(this.f39807b);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3553q
    public final InterfaceC3553q r(String str, Y1 y12, List list) {
        return "toString".equals(str) ? new C3588u(this.f39806a) : InterfaceC3517m.b(this, new C3588u(str), y12, list);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3553q
    public InterfaceC3553q p() {
        return this;
    }
}
