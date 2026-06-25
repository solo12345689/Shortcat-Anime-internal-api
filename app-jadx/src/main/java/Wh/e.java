package Wh;

import Yh.A;
import Yh.s;
import Yh.t;
import Yh.y;
import Yh.z;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class e implements bi.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char f20951a;

    protected e(char c10) {
        this.f20951a = c10;
    }

    @Override // bi.a
    public char a() {
        return this.f20951a;
    }

    @Override // bi.a
    public int b() {
        return 1;
    }

    @Override // bi.a
    public char c() {
        return this.f20951a;
    }

    @Override // bi.a
    public int d(bi.b bVar, bi.b bVar2) {
        s gVar;
        if ((bVar.c() || bVar2.g()) && bVar2.f() % 3 != 0 && (bVar.f() + bVar2.f()) % 3 == 0) {
            return 0;
        }
        int i10 = 2;
        if (bVar.length() < 2 || bVar2.length() < 2) {
            gVar = new Yh.g(String.valueOf(this.f20951a));
            i10 = 1;
        } else {
            gVar = new z(String.valueOf(this.f20951a) + this.f20951a);
        }
        y yVarC = y.c();
        yVarC.b(bVar.a(i10));
        A aD = bVar.d();
        for (s sVar : t.a(aD, bVar2.b())) {
            gVar.b(sVar);
            yVarC.a(sVar.g());
        }
        yVarC.b(bVar2.e(i10));
        gVar.k(yVarC.d());
        aD.h(gVar);
        return i10;
    }
}
