package Y;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: Y.m0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2426m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f22373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f22374b;

    public C2426m0(Object obj, Object obj2) {
        this.f22373a = obj;
        this.f22374b = obj2;
    }

    private final int a(Object obj) {
        if (obj instanceof Enum) {
            return ((Enum) obj).ordinal();
        }
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2426m0)) {
            return false;
        }
        C2426m0 c2426m0 = (C2426m0) obj;
        return AbstractC5504s.c(this.f22373a, c2426m0.f22373a) && AbstractC5504s.c(this.f22374b, c2426m0.f22374b);
    }

    public int hashCode() {
        return (a(this.f22373a) * 31) + a(this.f22374b);
    }

    public String toString() {
        return "JoinedKey(left=" + this.f22373a + ", right=" + this.f22374b + ')';
    }
}
