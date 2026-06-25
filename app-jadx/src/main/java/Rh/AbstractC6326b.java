package rh;

import Vg.g;
import Vg.h;
import Vg.l;
import Vg.m;
import Vg.o;
import ah.C2630c;
import dh.C4630a;
import dh.C4632c;
import dh.k;
import eh.C4678c;
import hh.C4954a;
import java.io.IOException;
import jh.C5405c;
import jh.C5409g;
import kh.C5486c;
import mh.C5700e;
import nh.C5796f;
import oh.C5902b;
import ph.C6052b;
import qh.f;
import sh.AbstractC6533A;
import sh.C6534a;
import sh.s;
import sh.y;
import zg.AbstractC7387B;
import zg.AbstractC7388C;
import zg.C7402f;
import zg.C7419n0;
import zg.r0;
import zg.u0;

/* JADX INFO: renamed from: rh.b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC6326b {
    public static Cg.b a(Kg.a aVar, AbstractC7388C abstractC7388C) throws IOException {
        if (aVar instanceof Lh.a) {
            Lh.a aVar2 = (Lh.a) aVar;
            return new Cg.b(AbstractC6330e.E(aVar2.c()), new C7419n0(aVar2.b()), abstractC7388C);
        }
        if (aVar instanceof C6052b) {
            C6052b c6052b = (C6052b) aVar;
            return new Cg.b(new Dg.a(g.f20342r, new h(AbstractC6330e.R(c6052b.b()))), new C7419n0(c6052b.c()));
        }
        if (aVar instanceof C4954a) {
            Dg.a aVar3 = new Dg.a(g.f20346v);
            short[] sArrB = ((C4954a) aVar).b();
            byte[] bArr = new byte[sArrB.length * 2];
            for (int i10 = 0; i10 != sArrB.length; i10++) {
                Oh.g.l(sArrB[i10], bArr, i10 * 2);
            }
            return new Cg.b(aVar3, new C7419n0(bArr));
        }
        if (aVar instanceof k) {
            k kVar = (k) aVar;
            return new Cg.b(new Dg.a(Cg.a.f3192R0), new C7419n0(C4630a.f().i(1).c(kVar).b()), abstractC7388C, C4630a.f().i(1).c(kVar.m()).b());
        }
        if (aVar instanceof C4632c) {
            C4632c c4632c = (C4632c) aVar;
            return new Cg.b(new Dg.a(Cg.a.f3192R0), new C7419n0(C4630a.f().i(c4632c.f()).c(c4632c).b()), abstractC7388C, C4630a.f().i(c4632c.f()).c(c4632c.g().d()).b());
        }
        if (aVar instanceof f) {
            f fVar = (f) aVar;
            return new Cg.b(new Dg.a(AbstractC6330e.T(fVar.b())), new C7419n0(fVar.getEncoded()), abstractC7388C, fVar.c());
        }
        if (aVar instanceof C5796f) {
            C5796f c5796f = (C5796f) aVar;
            return new Cg.b(new Dg.a(AbstractC6330e.L(c5796f.b())), c5796f.getEncoded(), abstractC7388C);
        }
        if (aVar instanceof C5486c) {
            C5486c c5486c = (C5486c) aVar;
            return new Cg.b(new Dg.a(AbstractC6330e.C(c5486c.b())), new C7419n0(c5486c.getEncoded()), abstractC7388C);
        }
        if (aVar instanceof Yg.g) {
            Yg.g gVar = (Yg.g) aVar;
            return new Cg.b(new Dg.a(AbstractC6330e.q(gVar.b())), new Vg.a(0, gVar.e(), gVar.d(), gVar.f(), gVar.c(), gVar.g(), new Vg.b(gVar.h())), abstractC7388C);
        }
        if (aVar instanceof y) {
            y yVar = (y) aVar;
            return new Cg.b(new Dg.a(g.f20347w, new Vg.k(yVar.c().b(), AbstractC6330e.V(yVar.b()))), c(yVar), abstractC7388C);
        }
        if (aVar instanceof s) {
            s sVar = (s) aVar;
            return new Cg.b(new Dg.a(g.f20295F, new l(sVar.c().a(), sVar.c().b(), AbstractC6330e.V(sVar.b()))), d(sVar), abstractC7388C);
        }
        if (aVar instanceof Kh.b) {
            Kh.b bVar = (Kh.b) aVar;
            return new Cg.b(new Dg.a(g.f20338n), new Vg.e(bVar.f(), bVar.e(), bVar.c(), bVar.d(), bVar.g(), AbstractC6330e.i(bVar.b())));
        }
        if (aVar instanceof bh.e) {
            bh.e eVar = (bh.e) aVar;
            return new Cg.b(new Dg.a(AbstractC6330e.g(eVar.b())), new C7419n0(eVar.getEncoded()), abstractC7388C);
        }
        if (aVar instanceof C5700e) {
            C5700e c5700e = (C5700e) aVar;
            return new Cg.b(new Dg.a(AbstractC6330e.J(c5700e.b())), new C7419n0(c5700e.getEncoded()), abstractC7388C);
        }
        if (aVar instanceof ih.c) {
            ih.c cVar = (ih.c) aVar;
            return new Cg.b(new Dg.a(AbstractC6330e.w(cVar.b())), new C7419n0(cVar.getEncoded()), abstractC7388C);
        }
        if (aVar instanceof C2630c) {
            C2630c c2630c = (C2630c) aVar;
            return new Cg.b(new Dg.a(AbstractC6330e.e(c2630c.b())), new Vg.c(0, c2630c.f(), c2630c.c(), c2630c.e(), new Vg.d(c2630c.d())), abstractC7388C);
        }
        if (aVar instanceof gh.f) {
            gh.f fVar2 = (gh.f) aVar;
            Dg.a aVar4 = new Dg.a(AbstractC6330e.u(fVar2.b()));
            return fVar2.c() == 1 ? new Cg.b(aVar4, new u0(false, 0, new C7419n0(fVar2.f())), abstractC7388C) : fVar2.c() == 2 ? new Cg.b(aVar4, new C7419n0(fVar2.getEncoded()), abstractC7388C) : new Cg.b(aVar4, b(fVar2.f(), fVar2.getEncoded()), abstractC7388C);
        }
        if (aVar instanceof C5405c) {
            C5405c c5405c = (C5405c) aVar;
            C7402f c7402f = new C7402f();
            c7402f.a(new C7419n0(c5405c.c()));
            c7402f.a(new C7419n0(c5405c.e()));
            c7402f.a(new C7419n0(c5405c.f()));
            c7402f.a(new C7419n0(c5405c.d()));
            return new Cg.b(new Dg.a(AbstractC6330e.y(c5405c.b())), new r0(c7402f), abstractC7388C);
        }
        if (aVar instanceof C5409g) {
            C5409g c5409g = (C5409g) aVar;
            C7402f c7402f2 = new C7402f();
            c7402f2.a(new C7419n0(c5409g.c()));
            c7402f2.a(new C7419n0(c5409g.d()));
            c7402f2.a(new C7419n0(c5409g.f()));
            c7402f2.a(new C7419n0(c5409g.g()));
            c7402f2.a(new C7419n0(c5409g.e()));
            return new Cg.b(new Dg.a(AbstractC6330e.P(c5409g.b())), new r0(c7402f2), abstractC7388C);
        }
        if (aVar instanceof fh.d) {
            fh.d dVar = (fh.d) aVar;
            Dg.a aVar5 = new Dg.a(AbstractC6330e.s(dVar.b()));
            return dVar.c() == 1 ? new Cg.b(aVar5, new u0(false, 0, new C7419n0(dVar.d())), abstractC7388C) : dVar.c() == 2 ? new Cg.b(aVar5, new C7419n0(dVar.getEncoded()), abstractC7388C) : new Cg.b(aVar5, b(dVar.d(), dVar.getEncoded()), abstractC7388C);
        }
        if (aVar instanceof Zg.d) {
            Zg.d dVar2 = (Zg.d) aVar;
            return new Cg.b(new Dg.a(AbstractC6330e.c(dVar2.b())), new C7419n0(dVar2.getEncoded()), abstractC7388C, dVar2.c().getEncoded());
        }
        if (aVar instanceof Xg.d) {
            Xg.d dVar3 = (Xg.d) aVar;
            return new Cg.b(new Dg.a(AbstractC6330e.a(dVar3.b())), new C7419n0(dVar3.getEncoded()), abstractC7388C);
        }
        if (aVar instanceof ch.e) {
            ch.e eVar2 = (ch.e) aVar;
            return new Cg.b(new Dg.a(AbstractC6330e.l(eVar2.b())), new C7419n0(eVar2.getEncoded()), abstractC7388C);
        }
        if (aVar instanceof lh.g) {
            lh.g gVar2 = (lh.g) aVar;
            return new Cg.b(new Dg.a(AbstractC6330e.G(gVar2.b())), new C7419n0(gVar2.getEncoded()), abstractC7388C);
        }
        if (aVar instanceof C4678c) {
            C4678c c4678c = (C4678c) aVar;
            return new Cg.b(new Dg.a(AbstractC6330e.o(c4678c.b())), new C7419n0(c4678c.getEncoded()), abstractC7388C);
        }
        if (!(aVar instanceof C5902b)) {
            throw new IOException("key parameters not recognized");
        }
        C5902b c5902b = (C5902b) aVar;
        return new Cg.b(new Dg.a(AbstractC6330e.N(c5902b.b())), new C7419n0(c5902b.getEncoded()), abstractC7388C);
    }

    private static AbstractC7387B b(byte[] bArr, byte[] bArr2) {
        C7402f c7402f = new C7402f(2);
        c7402f.a(new C7419n0(bArr));
        c7402f.a(new C7419n0(bArr2));
        return new r0(c7402f);
    }

    private static o c(y yVar) throws IOException {
        byte[] encoded = yVar.getEncoded();
        int iH = yVar.c().h();
        int iB = yVar.c().b();
        int iA = (int) AbstractC6533A.a(encoded, 0, 4);
        if (!AbstractC6533A.l(iB, iA)) {
            throw new IllegalArgumentException("index out of bounds");
        }
        byte[] bArrG = AbstractC6533A.g(encoded, 4, iH);
        int i10 = 4 + iH;
        byte[] bArrG2 = AbstractC6533A.g(encoded, i10, iH);
        int i11 = i10 + iH;
        byte[] bArrG3 = AbstractC6533A.g(encoded, i11, iH);
        int i12 = i11 + iH;
        byte[] bArrG4 = AbstractC6533A.g(encoded, i12, iH);
        int i13 = i12 + iH;
        byte[] bArrG5 = AbstractC6533A.g(encoded, i13, encoded.length - i13);
        try {
            C6534a c6534a = (C6534a) AbstractC6533A.f(bArrG5, C6534a.class);
            return c6534a.c() != (1 << iB) - 1 ? new o(iA, bArrG, bArrG2, bArrG3, bArrG4, bArrG5, c6534a.c()) : new o(iA, bArrG, bArrG2, bArrG3, bArrG4, bArrG5);
        } catch (ClassNotFoundException e10) {
            throw new IOException("cannot parse BDS: " + e10.getMessage());
        }
    }

    private static m d(s sVar) throws IOException {
        byte[] encoded = sVar.getEncoded();
        int iF = sVar.c().f();
        int iA = sVar.c().a();
        int i10 = (iA + 7) / 8;
        long jA = (int) AbstractC6533A.a(encoded, 0, i10);
        if (!AbstractC6533A.l(iA, jA)) {
            throw new IllegalArgumentException("index out of bounds");
        }
        byte[] bArrG = AbstractC6533A.g(encoded, i10, iF);
        int i11 = i10 + iF;
        byte[] bArrG2 = AbstractC6533A.g(encoded, i11, iF);
        int i12 = i11 + iF;
        byte[] bArrG3 = AbstractC6533A.g(encoded, i12, iF);
        int i13 = i12 + iF;
        byte[] bArrG4 = AbstractC6533A.g(encoded, i13, iF);
        int i14 = i13 + iF;
        byte[] bArrG5 = AbstractC6533A.g(encoded, i14, encoded.length - i14);
        try {
            sh.b bVar = (sh.b) AbstractC6533A.f(bArrG5, sh.b.class);
            return bVar.b() != (1 << iA) - 1 ? new m(jA, bArrG, bArrG2, bArrG3, bArrG4, bArrG5, bVar.b()) : new m(jA, bArrG, bArrG2, bArrG3, bArrG4, bArrG5);
        } catch (ClassNotFoundException e10) {
            throw new IOException("cannot parse BDSStateMap: " + e10.getMessage());
        }
    }
}
