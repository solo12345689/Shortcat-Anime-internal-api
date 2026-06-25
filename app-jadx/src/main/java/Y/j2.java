package Y;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class j2 implements n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f22351a;

    public j2(Object obj) {
        this.f22351a = obj;
    }

    @Override // Y.n2
    public Object a(U0 u02) {
        return this.f22351a;
    }

    public final Object b() {
        return this.f22351a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j2) && AbstractC5504s.c(this.f22351a, ((j2) obj).f22351a);
    }

    public int hashCode() {
        Object obj = this.f22351a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return "StaticValueHolder(value=" + this.f22351a + ')';
    }
}
