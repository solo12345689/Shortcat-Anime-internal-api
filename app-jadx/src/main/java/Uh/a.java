package Uh;

import Yh.A;
import Yh.s;
import Yh.t;
import Yh.y;
import bi.b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class a implements bi.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f19586a;

    public a(boolean z10) {
        this.f19586a = z10;
    }

    @Override // bi.a
    public char a() {
        return '~';
    }

    @Override // bi.a
    public int b() {
        return this.f19586a ? 2 : 1;
    }

    @Override // bi.a
    public char c() {
        return '~';
    }

    @Override // bi.a
    public int d(b bVar, b bVar2) {
        if (bVar.length() != bVar2.length() || bVar.length() > 2) {
            return 0;
        }
        A aD = bVar.d();
        Th.a aVar = new Th.a();
        y yVar = new y();
        yVar.b(bVar.a(bVar.length()));
        for (s sVar : t.a(aD, bVar2.b())) {
            aVar.b(sVar);
            yVar.a(sVar.g());
        }
        yVar.b(bVar2.e(bVar2.length()));
        aVar.k(yVar.d());
        aD.h(aVar);
        return bVar.length();
    }
}
