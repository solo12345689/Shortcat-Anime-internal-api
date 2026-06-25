package U;

import ie.InterfaceC5096o;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: U.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C2185w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f18673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC5096o f18674b;

    public C2185w(Object obj, InterfaceC5096o interfaceC5096o) {
        this.f18673a = obj;
        this.f18674b = interfaceC5096o;
    }

    public final Object a() {
        return this.f18673a;
    }

    public final InterfaceC5096o b() {
        return this.f18674b;
    }

    public final Object c() {
        return this.f18673a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2185w)) {
            return false;
        }
        C2185w c2185w = (C2185w) obj;
        return AbstractC5504s.c(this.f18673a, c2185w.f18673a) && AbstractC5504s.c(this.f18674b, c2185w.f18674b);
    }

    public int hashCode() {
        Object obj = this.f18673a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f18674b.hashCode();
    }

    public String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.f18673a + ", transition=" + this.f18674b + ')';
    }
}
