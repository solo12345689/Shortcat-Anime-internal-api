package androidx.compose.ui.draw;

import s0.Z0;
import t.C6546L;
import t.W;
import v0.C6811c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class e implements Z0 {

    /* JADX INFO: renamed from: a */
    private C6546L f26611a;

    /* JADX INFO: renamed from: b */
    private Z0 f26612b;

    @Override // s0.Z0
    public C6811c a() {
        Z0 z02 = this.f26612b;
        if (!(z02 != null)) {
            H0.a.b("GraphicsContext not provided");
        }
        C6811c c6811cA = z02.a();
        C6546L c6546l = this.f26611a;
        if (c6546l == null) {
            this.f26611a = W.c(c6811cA);
            return c6811cA;
        }
        c6546l.k(c6811cA);
        return c6811cA;
    }

    @Override // s0.Z0
    public void b(C6811c c6811c) {
        Z0 z02 = this.f26612b;
        if (z02 != null) {
            z02.b(c6811c);
        }
    }

    public final Z0 c() {
        return this.f26612b;
    }

    public final void d() {
        C6546L c6546l = this.f26611a;
        if (c6546l != null) {
            Object[] objArr = c6546l.f60006a;
            int i10 = c6546l.f60007b;
            for (int i11 = 0; i11 < i10; i11++) {
                b((C6811c) objArr[i11]);
            }
            c6546l.n();
        }
    }

    public final void e(Z0 z02) {
        d();
        this.f26612b = z02;
    }
}
