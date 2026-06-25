package Q;

import E0.C1307q;
import androidx.compose.ui.platform.A1;

/* JADX INFO: renamed from: Q.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C2044d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A1 f14115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f14116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private E0.C f14117c;

    public C2044d(A1 a12) {
        this.f14115a = a12;
    }

    public final int a() {
        return this.f14116b;
    }

    public final boolean b(E0.C c10, E0.C c11) {
        return s.f(this.f14115a, c10, c11);
    }

    public final boolean c(E0.C c10, E0.C c11) {
        return c11.o() - c10.o() < this.f14115a.a();
    }

    public final void d(C1307q c1307q) {
        E0.C c10 = this.f14117c;
        E0.C c11 = (E0.C) c1307q.c().get(0);
        if (c10 != null && c(c10, c11) && b(c10, c11)) {
            this.f14116b++;
        } else {
            this.f14116b = 1;
        }
        this.f14117c = c11;
    }
}
