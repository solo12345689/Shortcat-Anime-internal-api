package x0;

import Ud.AbstractC2279u;
import androidx.compose.ui.graphics.c;
import java.util.List;
import s0.AbstractC6380o1;
import s0.C6340b0;
import s0.C6385r0;
import s0.G1;
import s0.H1;

/* JADX INFO: renamed from: x0.o */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7043o {

    /* JADX INFO: renamed from: a */
    private static final List f63582a = AbstractC2279u.m();

    /* JADX INFO: renamed from: b */
    private static final int f63583b = G1.f58877a.a();

    /* JADX INFO: renamed from: c */
    private static final int f63584c = H1.f58881a.b();

    /* JADX INFO: renamed from: d */
    private static final int f63585d = androidx.compose.ui.graphics.c.f26737b.z();

    /* JADX INFO: renamed from: e */
    private static final long f63586e = C6385r0.f58985b.i();

    /* JADX INFO: renamed from: f */
    private static final int f63587f = AbstractC6380o1.f58972a.b();

    public static final int a() {
        return f63587f;
    }

    public static final int b() {
        return f63583b;
    }

    public static final int c() {
        return f63584c;
    }

    public static final List d() {
        return f63582a;
    }

    public static final boolean e(long j10, long j11) {
        return C6385r0.x(j10) == C6385r0.x(j11) && C6385r0.w(j10) == C6385r0.w(j11) && C6385r0.u(j10) == C6385r0.u(j11);
    }

    public static final boolean f(androidx.compose.ui.graphics.d dVar) {
        if (!(dVar instanceof C6340b0)) {
            return dVar == null;
        }
        C6340b0 c6340b0 = (C6340b0) dVar;
        int iB = c6340b0.b();
        c.a aVar = androidx.compose.ui.graphics.c.f26737b;
        return androidx.compose.ui.graphics.c.G(iB, aVar.z()) || androidx.compose.ui.graphics.c.G(c6340b0.b(), aVar.B());
    }
}
