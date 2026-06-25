package Y;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: Y.a0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2390a0 implements n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0 f22268a;

    public C2390a0(C0 c02) {
        this.f22268a = c02;
    }

    @Override // Y.n2
    public Object a(U0 u02) {
        return this.f22268a.getValue();
    }

    public final C0 b() {
        return this.f22268a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2390a0) && AbstractC5504s.c(this.f22268a, ((C2390a0) obj).f22268a);
    }

    public int hashCode() {
        return this.f22268a.hashCode();
    }

    public String toString() {
        return "DynamicValueHolder(state=" + this.f22268a + ')';
    }
}
