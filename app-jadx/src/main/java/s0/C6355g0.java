package s0;

import android.graphics.RenderEffect;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: s0.g0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6355g0 extends u1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u1 f58947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f58948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f58949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f58950e;

    public /* synthetic */ C6355g0(u1 u1Var, float f10, float f11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(u1Var, f10, f11, i10);
    }

    @Override // s0.u1
    protected RenderEffect b() {
        return z1.f59003a.a(this.f58947b, this.f58948c, this.f58949d, this.f58950e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6355g0)) {
            return false;
        }
        C6355g0 c6355g0 = (C6355g0) obj;
        return this.f58948c == c6355g0.f58948c && this.f58949d == c6355g0.f58949d && I1.f(this.f58950e, c6355g0.f58950e) && AbstractC5504s.c(this.f58947b, c6355g0.f58947b);
    }

    public int hashCode() {
        u1 u1Var = this.f58947b;
        return ((((((u1Var != null ? u1Var.hashCode() : 0) * 31) + Float.hashCode(this.f58948c)) * 31) + Float.hashCode(this.f58949d)) * 31) + I1.g(this.f58950e);
    }

    public String toString() {
        return "BlurEffect(renderEffect=" + this.f58947b + ", radiusX=" + this.f58948c + ", radiusY=" + this.f58949d + ", edgeTreatment=" + ((Object) I1.h(this.f58950e)) + ')';
    }

    private C6355g0(u1 u1Var, float f10, float f11, int i10) {
        super(null);
        this.f58947b = u1Var;
        this.f58948c = f10;
        this.f58949d = f11;
        this.f58950e = i10;
    }
}
