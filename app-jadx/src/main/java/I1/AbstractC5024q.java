package i1;

import r0.C6226h;

/* JADX INFO: renamed from: i1.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5024q {
    public static final C5023p a(long j10, long j11) {
        return new C5023p(C5021n.k(j10), C5021n.l(j10), C5021n.k(j10) + ((int) (j11 >> 32)), C5021n.l(j10) + ((int) (j11 & 4294967295L)));
    }

    public static final C5023p b(C6226h c6226h) {
        return new C5023p(Math.round(c6226h.i()), Math.round(c6226h.l()), Math.round(c6226h.j()), Math.round(c6226h.e()));
    }

    public static final C6226h c(C5023p c5023p) {
        return new C6226h(c5023p.f(), c5023p.h(), c5023p.g(), c5023p.d());
    }
}
