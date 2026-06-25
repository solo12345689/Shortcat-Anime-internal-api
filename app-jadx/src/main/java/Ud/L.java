package Ud;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f19488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f19489b;

    public L(int i10, Object obj) {
        this.f19488a = i10;
        this.f19489b = obj;
    }

    public final int a() {
        return this.f19488a;
    }

    public final Object b() {
        return this.f19489b;
    }

    public final int c() {
        return this.f19488a;
    }

    public final Object d() {
        return this.f19489b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l10 = (L) obj;
        return this.f19488a == l10.f19488a && AbstractC5504s.c(this.f19489b, l10.f19489b);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f19488a) * 31;
        Object obj = this.f19489b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "IndexedValue(index=" + this.f19488a + ", value=" + this.f19489b + ')';
    }
}
