package androidx.compose.foundation;

import K0.A0;
import R0.A;
import R0.C;
import androidx.compose.ui.e;
import ie.InterfaceC5082a;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class n extends e.c implements A0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private o f26341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f26342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private z.n f26343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f26344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f26345e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5082a {
        a() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final Float invoke() {
            return Float.valueOf(n.this.E1().m());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements InterfaceC5082a {
        b() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final Float invoke() {
            return Float.valueOf(n.this.E1().l());
        }
    }

    public n(o oVar, boolean z10, z.n nVar, boolean z11, boolean z12) {
        this.f26341a = oVar;
        this.f26342b = z10;
        this.f26343c = nVar;
        this.f26344d = z11;
        this.f26345e = z12;
    }

    public final o E1() {
        return this.f26341a;
    }

    public final void F1(z.n nVar) {
        this.f26343c = nVar;
    }

    public final void G1(boolean z10) {
        this.f26342b = z10;
    }

    public final void H1(boolean z10) {
        this.f26344d = z10;
    }

    public final void I1(o oVar) {
        this.f26341a = oVar;
    }

    public final void J1(boolean z10) {
        this.f26345e = z10;
    }

    @Override // K0.A0
    public void Y(C c10) {
        A.q0(c10, true);
        R0.j jVar = new R0.j(new a(), new b(), this.f26342b);
        if (this.f26345e) {
            A.r0(c10, jVar);
        } else {
            A.Y(c10, jVar);
        }
    }
}
