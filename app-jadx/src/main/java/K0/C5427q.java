package k0;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: k0.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C5427q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f51986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f51987b;

    public C5427q(int i10, Integer num) {
        this.f51986a = i10;
        this.f51987b = num;
    }

    public final int a() {
        return this.f51986a;
    }

    public final Integer b() {
        return this.f51987b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5427q)) {
            return false;
        }
        C5427q c5427q = (C5427q) obj;
        return this.f51986a == c5427q.f51986a && AbstractC5504s.c(this.f51987b, c5427q.f51987b);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f51986a) * 31;
        Integer num = this.f51987b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "ObjectLocation(group=" + this.f51986a + ", dataOffset=" + this.f51987b + ')';
    }
}
