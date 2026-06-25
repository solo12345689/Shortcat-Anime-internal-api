package z;

import E0.C1307q;
import i1.C5015h;
import i1.InterfaceC5011d;
import java.util.List;
import r0.C6224f;

/* JADX INFO: renamed from: z.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C7259a implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C7259a f65277a = new C7259a();

    private C7259a() {
    }

    @Override // z.t
    public long a(InterfaceC5011d interfaceC5011d, C1307q c1307q, long j10) {
        List listC = c1307q.c();
        C6224f c6224fD = C6224f.d(C6224f.f58329b.c());
        int size = listC.size();
        for (int i10 = 0; i10 < size; i10++) {
            c6224fD = C6224f.d(C6224f.q(c6224fD.u(), ((E0.C) listC.get(i10)).m()));
        }
        return C6224f.r(c6224fD.u(), -interfaceC5011d.l1(C5015h.n(64)));
    }
}
