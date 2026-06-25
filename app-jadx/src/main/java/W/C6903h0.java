package w;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: w.h0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6903h0 implements InterfaceC6878G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f62529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f62530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f62531c;

    public C6903h0(float f10, float f11, Object obj) {
        this.f62529a = f10;
        this.f62530b = f11;
        this.f62531c = obj;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C6903h0) {
            C6903h0 c6903h0 = (C6903h0) obj;
            if (c6903h0.f62529a == this.f62529a && c6903h0.f62530b == this.f62530b && AbstractC5504s.c(c6903h0.f62531c, this.f62531c)) {
                return true;
            }
        }
        return false;
    }

    public final float f() {
        return this.f62529a;
    }

    public final float g() {
        return this.f62530b;
    }

    public final Object h() {
        return this.f62531c;
    }

    public int hashCode() {
        Object obj = this.f62531c;
        return ((((obj != null ? obj.hashCode() : 0) * 31) + Float.hashCode(this.f62529a)) * 31) + Float.hashCode(this.f62530b);
    }

    @Override // w.InterfaceC6904i
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public G0 a(s0 s0Var) {
        return new G0(this.f62529a, this.f62530b, AbstractC6906j.b(s0Var, this.f62531c));
    }

    public /* synthetic */ C6903h0(float f10, float f11, Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 1.0f : f10, (i10 & 2) != 0 ? 1500.0f : f11, (i10 & 4) != 0 ? null : obj);
    }
}
