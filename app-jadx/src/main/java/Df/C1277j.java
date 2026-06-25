package Df;

import kotlin.jvm.internal.AbstractC5504s;
import oe.C5870f;

/* JADX INFO: renamed from: Df.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1277j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f3772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5870f f3773b;

    public C1277j(String value, C5870f range) {
        AbstractC5504s.h(value, "value");
        AbstractC5504s.h(range, "range");
        this.f3772a = value;
        this.f3773b = range;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1277j)) {
            return false;
        }
        C1277j c1277j = (C1277j) obj;
        return AbstractC5504s.c(this.f3772a, c1277j.f3772a) && AbstractC5504s.c(this.f3773b, c1277j.f3773b);
    }

    public int hashCode() {
        return (this.f3772a.hashCode() * 31) + this.f3773b.hashCode();
    }

    public String toString() {
        return "MatchGroup(value=" + this.f3772a + ", range=" + this.f3773b + ')';
    }
}
