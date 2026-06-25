package w;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class D0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC6913q f62335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC6875D f62336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f62337c;

    public /* synthetic */ D0(AbstractC6913q abstractC6913q, InterfaceC6875D interfaceC6875D, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC6913q, interfaceC6875D, i10);
    }

    public final int a() {
        return this.f62337c;
    }

    public final InterfaceC6875D b() {
        return this.f62336b;
    }

    public final AbstractC6913q c() {
        return this.f62335a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D0)) {
            return false;
        }
        D0 d02 = (D0) obj;
        return AbstractC5504s.c(this.f62335a, d02.f62335a) && AbstractC5504s.c(this.f62336b, d02.f62336b) && AbstractC6915t.c(this.f62337c, d02.f62337c);
    }

    public int hashCode() {
        return (((this.f62335a.hashCode() * 31) + this.f62336b.hashCode()) * 31) + AbstractC6915t.d(this.f62337c);
    }

    public String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.f62335a + ", easing=" + this.f62336b + ", arcMode=" + ((Object) AbstractC6915t.e(this.f62337c)) + ')';
    }

    private D0(AbstractC6913q abstractC6913q, InterfaceC6875D interfaceC6875D, int i10) {
        this.f62335a = abstractC6913q;
        this.f62336b = interfaceC6875D;
        this.f62337c = i10;
    }
}
