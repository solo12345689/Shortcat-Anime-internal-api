package wf;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: wf.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C6973a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f63197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f63198b;

    public C6973a(Object obj, Object obj2) {
        this.f63197a = obj;
        this.f63198b = obj2;
    }

    public final Object a() {
        return this.f63197a;
    }

    public final Object b() {
        return this.f63198b;
    }

    public final Object c() {
        return this.f63197a;
    }

    public final Object d() {
        return this.f63198b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6973a)) {
            return false;
        }
        C6973a c6973a = (C6973a) obj;
        return AbstractC5504s.c(this.f63197a, c6973a.f63197a) && AbstractC5504s.c(this.f63198b, c6973a.f63198b);
    }

    public int hashCode() {
        Object obj = this.f63197a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f63198b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return "ApproximationBounds(lower=" + this.f63197a + ", upper=" + this.f63198b + ')';
    }
}
