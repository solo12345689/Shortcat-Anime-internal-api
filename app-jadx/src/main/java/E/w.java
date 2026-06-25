package E;

import i1.C5009b;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w implements F.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f4007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final F.u f4008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f4009c;

    public w(l lVar, F.u uVar, int i10) {
        this.f4007a = lVar;
        this.f4008b = uVar;
        this.f4009c = i10;
    }

    public abstract v b(int i10, Object obj, Object obj2, int i11, int i12, List list, long j10, int i13, int i14);

    @Override // F.x
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public v a(int i10, int i11, int i12, long j10) {
        return d(i10, j10, i11, i12, this.f4009c);
    }

    public final v d(int i10, long j10, int i11, int i12, int i13) {
        int iM;
        Object objD = this.f4007a.d(i10);
        Object objF = this.f4007a.f(i10);
        List listG0 = this.f4008b.g0(i10, j10);
        if (C5009b.j(j10)) {
            iM = C5009b.n(j10);
        } else {
            if (!C5009b.i(j10)) {
                throw new IllegalArgumentException("does not have fixed height");
            }
            iM = C5009b.m(j10);
        }
        return b(i10, objD, objF, iM, i13, listG0, j10, i11, i12);
    }

    public final androidx.compose.foundation.lazy.layout.c e() {
        return this.f4007a.b();
    }
}
