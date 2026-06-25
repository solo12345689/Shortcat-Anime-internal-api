package rh;

import Vg.f;
import Vg.g;
import Vg.h;
import Vg.k;
import Vg.n;
import Vg.p;
import dh.C4630a;
import dh.l;
import hh.C4955b;
import java.io.IOException;
import jh.C5406d;
import mh.C5701f;
import nh.C5797g;
import oh.C5903c;
import ph.C6053c;
import sh.t;
import sh.z;
import zg.C7419n0;
import zg.r0;

/* JADX INFO: renamed from: rh.d */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC6329d {
    public static Dg.b a(Kg.a aVar) throws IOException {
        if (aVar instanceof Lh.b) {
            Lh.b bVar = (Lh.b) aVar;
            return new Dg.b(AbstractC6330e.E(bVar.c()), bVar.b());
        }
        if (aVar instanceof C6053c) {
            C6053c c6053c = (C6053c) aVar;
            return new Dg.b(new Dg.a(g.f20342r, new h(AbstractC6330e.R(c6053c.b()))), c6053c.c());
        }
        if (aVar instanceof C4955b) {
            return new Dg.b(new Dg.a(g.f20346v), ((C4955b) aVar).b());
        }
        if (aVar instanceof l) {
            return new Dg.b(new Dg.a(Cg.a.f3192R0), C4630a.f().i(1).c((l) aVar).b());
        }
        if (aVar instanceof dh.d) {
            dh.d dVar = (dh.d) aVar;
            return new Dg.b(new Dg.a(Cg.a.f3192R0), C4630a.f().i(dVar.c()).c(dVar.d()).b());
        }
        if (aVar instanceof C5797g) {
            C5797g c5797g = (C5797g) aVar;
            return new Dg.b(new Dg.a(AbstractC6330e.L(c5797g.b())), c5797g.getEncoded());
        }
        if (aVar instanceof qh.g) {
            qh.g gVar = (qh.g) aVar;
            return new Dg.b(new Dg.a(AbstractC6330e.T(gVar.b())), gVar.getEncoded());
        }
        if (aVar instanceof Yg.h) {
            Yg.h hVar = (Yg.h) aVar;
            return new Dg.b(new Dg.a(AbstractC6330e.q(hVar.b())), hVar.getEncoded());
        }
        if (aVar instanceof z) {
            z zVar = (z) aVar;
            byte[] bArrD = zVar.d();
            byte[] bArrE = zVar.e();
            byte[] encoded = zVar.getEncoded();
            return encoded.length > bArrD.length + bArrE.length ? new Dg.b(new Dg.a(Lg.a.f11606a), new C7419n0(encoded)) : new Dg.b(new Dg.a(g.f20347w, new k(zVar.c().b(), AbstractC6330e.V(zVar.b()))), new p(bArrD, bArrE));
        }
        if (aVar instanceof t) {
            t tVar = (t) aVar;
            byte[] bArrD2 = tVar.d();
            byte[] bArrE2 = tVar.e();
            byte[] encoded2 = tVar.getEncoded();
            return encoded2.length > bArrD2.length + bArrE2.length ? new Dg.b(new Dg.a(Lg.a.f11607b), new C7419n0(encoded2)) : new Dg.b(new Dg.a(g.f20295F, new Vg.l(tVar.c().a(), tVar.c().b(), AbstractC6330e.V(tVar.b()))), new n(tVar.d(), tVar.e()));
        }
        if (aVar instanceof Kh.c) {
            Kh.c cVar = (Kh.c) aVar;
            return new Dg.b(new Dg.a(g.f20338n), new f(cVar.d(), cVar.e(), cVar.c(), AbstractC6330e.i(cVar.b())));
        }
        if (aVar instanceof bh.f) {
            bh.f fVar = (bh.f) aVar;
            return new Dg.b(new Dg.a(AbstractC6330e.g(fVar.b())), new C7419n0(fVar.getEncoded()));
        }
        if (aVar instanceof C5701f) {
            C5701f c5701f = (C5701f) aVar;
            return new Dg.b(new Dg.a(AbstractC6330e.J(c5701f.b())), new r0(new C7419n0(c5701f.getEncoded())));
        }
        if (aVar instanceof kh.d) {
            kh.d dVar2 = (kh.d) aVar;
            return new Dg.b(new Dg.a(AbstractC6330e.C(dVar2.b())), new C7419n0(dVar2.getEncoded()));
        }
        if (aVar instanceof ih.d) {
            ih.d dVar3 = (ih.d) aVar;
            return new Dg.b(new Dg.a(AbstractC6330e.w(dVar3.b())), dVar3.getEncoded());
        }
        if (aVar instanceof ah.d) {
            ah.d dVar4 = (ah.d) aVar;
            byte[] bArrC = dVar4.c();
            Dg.a aVar2 = new Dg.a(AbstractC6330e.e(dVar4.b()));
            byte[] bArr = new byte[bArrC.length + 1];
            bArr[0] = (byte) dVar4.b().a();
            System.arraycopy(bArrC, 0, bArr, 1, bArrC.length);
            return new Dg.b(aVar2, bArr);
        }
        if (aVar instanceof gh.g) {
            gh.g gVar2 = (gh.g) aVar;
            return new Dg.b(new Dg.a(AbstractC6330e.u(gVar2.b())), gVar2.getEncoded());
        }
        if (aVar instanceof C5406d) {
            C5406d c5406d = (C5406d) aVar;
            return new Dg.b(new Dg.a(AbstractC6330e.y(c5406d.b())), new C7419n0(c5406d.getEncoded()));
        }
        if (aVar instanceof jh.h) {
            jh.h hVar2 = (jh.h) aVar;
            return new Dg.b(new Dg.a(AbstractC6330e.P(hVar2.b())), new C7419n0(hVar2.getEncoded()));
        }
        if (aVar instanceof Zg.e) {
            Zg.e eVar = (Zg.e) aVar;
            return new Dg.b(new Dg.a(AbstractC6330e.c(eVar.b())), eVar.getEncoded());
        }
        if (aVar instanceof fh.e) {
            fh.e eVar2 = (fh.e) aVar;
            return new Dg.b(new Dg.a(AbstractC6330e.s(eVar2.b())), eVar2.getEncoded());
        }
        if (aVar instanceof Xg.e) {
            Xg.e eVar3 = (Xg.e) aVar;
            return new Dg.b(new Dg.a(AbstractC6330e.a(eVar3.b())), eVar3.getEncoded());
        }
        if (aVar instanceof ch.f) {
            ch.f fVar2 = (ch.f) aVar;
            return new Dg.b(new Dg.a(AbstractC6330e.l(fVar2.b())), fVar2.getEncoded());
        }
        if (aVar instanceof lh.h) {
            lh.h hVar3 = (lh.h) aVar;
            return new Dg.b(new Dg.a(AbstractC6330e.G(hVar3.b())), new C7419n0(hVar3.getEncoded()));
        }
        if (aVar instanceof eh.d) {
            eh.d dVar5 = (eh.d) aVar;
            return new Dg.b(new Dg.a(AbstractC6330e.o(dVar5.b())), new C7419n0(dVar5.getEncoded()));
        }
        if (!(aVar instanceof C5903c)) {
            throw new IOException("key parameters not recognized");
        }
        C5903c c5903c = (C5903c) aVar;
        return new Dg.b(new Dg.a(AbstractC6330e.N(c5903c.b())), new C7419n0(c5903c.getEncoded()));
    }
}
