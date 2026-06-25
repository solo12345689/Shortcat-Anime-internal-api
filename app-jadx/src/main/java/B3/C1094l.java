package B3;

import B3.L;
import java.util.Collections;
import java.util.List;
import q2.C6109x;
import t2.AbstractC6614a;
import t2.C6609I;

/* JADX INFO: renamed from: B3.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1094l implements InterfaceC1095m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f1247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f1248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final U2.O[] f1249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f1250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f1251e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f1252f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f1253g = -9223372036854775807L;

    public C1094l(List list, String str) {
        this.f1247a = list;
        this.f1248b = str;
        this.f1249c = new U2.O[list.size()];
    }

    private boolean a(C6609I c6609i, int i10) {
        if (c6609i.a() == 0) {
            return false;
        }
        if (c6609i.M() != i10) {
            this.f1250d = false;
        }
        this.f1251e--;
        return this.f1250d;
    }

    @Override // B3.InterfaceC1095m
    public void b(C6609I c6609i) {
        if (this.f1250d) {
            if (this.f1251e != 2 || a(c6609i, 32)) {
                if (this.f1251e != 1 || a(c6609i, 0)) {
                    int iG = c6609i.g();
                    int iA = c6609i.a();
                    for (U2.O o10 : this.f1249c) {
                        c6609i.b0(iG);
                        o10.f(c6609i, iA);
                    }
                    this.f1252f += iA;
                }
            }
        }
    }

    @Override // B3.InterfaceC1095m
    public void c() {
        this.f1250d = false;
        this.f1253g = -9223372036854775807L;
    }

    @Override // B3.InterfaceC1095m
    public void d(boolean z10) {
        if (this.f1250d) {
            AbstractC6614a.g(this.f1253g != -9223372036854775807L);
            for (U2.O o10 : this.f1249c) {
                o10.a(this.f1253g, 1, this.f1252f, 0, null);
            }
            this.f1250d = false;
        }
    }

    @Override // B3.InterfaceC1095m
    public void e(U2.r rVar, L.d dVar) {
        for (int i10 = 0; i10 < this.f1249c.length; i10++) {
            L.a aVar = (L.a) this.f1247a.get(i10);
            dVar.a();
            U2.O oE = rVar.e(dVar.c(), 3);
            oE.c(new C6109x.b().j0(dVar.b()).W(this.f1248b).y0("application/dvbsubs").k0(Collections.singletonList(aVar.f1138c)).n0(aVar.f1136a).P());
            this.f1249c[i10] = oE;
        }
    }

    @Override // B3.InterfaceC1095m
    public void f(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f1250d = true;
        this.f1253g = j10;
        this.f1252f = 0;
        this.f1251e = 2;
    }
}
