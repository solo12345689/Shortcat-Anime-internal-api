package w;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 implements InterfaceC6874C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f62665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f62666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC6875D f62667c;

    public r0(int i10, int i11, InterfaceC6875D interfaceC6875D) {
        this.f62665a = i10;
        this.f62666b = i11;
        this.f62667c = interfaceC6875D;
    }

    public boolean equals(Object obj) {
        if (obj instanceof r0) {
            r0 r0Var = (r0) obj;
            if (r0Var.f62665a == this.f62665a && r0Var.f62666b == this.f62666b && AbstractC5504s.c(r0Var.f62667c, this.f62667c)) {
                return true;
            }
        }
        return false;
    }

    @Override // w.InterfaceC6874C, w.InterfaceC6904i
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public H0 a(s0 s0Var) {
        return new H0(this.f62665a, this.f62666b, this.f62667c);
    }

    public int hashCode() {
        return (((this.f62665a * 31) + this.f62667c.hashCode()) * 31) + this.f62666b;
    }

    public /* synthetic */ r0(int i10, int i11, InterfaceC6875D interfaceC6875D, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 300 : i10, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? AbstractC6877F.d() : interfaceC6875D);
    }
}
