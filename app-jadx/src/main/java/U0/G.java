package U0;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F f18727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final E f18728b;

    public G(F f10, E e10) {
        this.f18727a = f10;
        this.f18728b = e10;
    }

    public final E a() {
        return this.f18728b;
    }

    public final F b() {
        return this.f18727a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g10 = (G) obj;
        return AbstractC5504s.c(this.f18728b, g10.f18728b) && AbstractC5504s.c(this.f18727a, g10.f18727a);
    }

    public int hashCode() {
        F f10 = this.f18727a;
        int iHashCode = (f10 != null ? f10.hashCode() : 0) * 31;
        E e10 = this.f18728b;
        return iHashCode + (e10 != null ? e10.hashCode() : 0);
    }

    public String toString() {
        return "PlatformTextStyle(spanStyle=" + this.f18727a + ", paragraphSyle=" + this.f18728b + ')';
    }

    public G(boolean z10) {
        this(null, new E(z10));
    }
}
