package rh;

import Oh.g;
import Vg.h;
import Vg.i;
import Vg.j;
import Vg.k;
import Vg.l;
import Vg.m;
import Vg.o;
import ah.C2630c;
import dh.C4632c;
import eh.C4678c;
import fh.C4810c;
import hh.C4954a;
import java.io.IOException;
import jh.C5405c;
import jh.C5409g;
import kh.C5486c;
import mh.C5700e;
import nh.C5795e;
import nh.C5796f;
import oh.C5902b;
import ph.C6052b;
import qh.f;
import rh.AbstractC6327c;
import sh.AbstractC6533A;
import sh.C6534a;
import sh.r;
import sh.s;
import sh.x;
import sh.y;
import zg.AbstractC7387B;
import zg.AbstractC7394b;
import zg.AbstractC7428u;
import zg.AbstractC7432y;
import zg.C7419n0;
import zg.C7420o;
import zg.C7427t;
import zg.InterfaceC7400e;

/* JADX INFO: renamed from: rh.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC6325a {
    private static short[] a(byte[] bArr) {
        int length = bArr.length / 2;
        short[] sArr = new short[length];
        for (int i10 = 0; i10 != length; i10++) {
            sArr[i10] = g.g(bArr, i10 * 2);
        }
        return sArr;
    }

    public static Kg.a b(Cg.b bVar) throws IOException {
        if (bVar == null) {
            throw new IllegalArgumentException("keyInfo array null");
        }
        Dg.a aVarR = bVar.r();
        C7427t c7427tL = aVarR.l();
        if (c7427tL.K(Vg.g.f20312W)) {
            return new Lh.a(AbstractC6330e.F(aVarR), AbstractC7428u.z(bVar.u()).B());
        }
        if (c7427tL.u(Vg.g.f20342r)) {
            return new C6052b(AbstractC7428u.z(bVar.u()).B(), AbstractC6330e.S(h.l(aVarR.p())));
        }
        if (c7427tL.u(Vg.g.f20346v)) {
            return new C4954a(a(AbstractC7428u.z(bVar.u()).B()));
        }
        if (c7427tL.u(Cg.a.f3192R0)) {
            byte[] bArrB = c(bVar.p(), 64).B();
            AbstractC7394b abstractC7394bS = bVar.s();
            if (abstractC7394bS != null) {
                return C4632c.d(Oh.a.m(bArrB, 4, bArrB.length), abstractC7394bS.D());
            }
            return C4632c.c(Oh.a.m(bArrB, 4, bArrB.length));
        }
        if (c7427tL.K(Ag.a.f596a0) || c7427tL.K(Ag.a.f506L0)) {
            qh.e eVarU = AbstractC6330e.U(c7427tL);
            InterfaceC7400e interfaceC7400eU = bVar.u();
            if (!(interfaceC7400eU instanceof AbstractC7387B)) {
                return new f(eVarU, AbstractC7428u.z(interfaceC7400eU).B());
            }
            i iVarL = i.l(interfaceC7400eU);
            j jVarN = iVarL.n();
            return new f(eVarU, iVarL.r(), iVarL.p(), jVarN.p(), jVarN.n());
        }
        if (AbstractC6330e.f58834Q.containsKey(c7427tL)) {
            C5795e c5795eM = AbstractC6330e.M(c7427tL);
            return new C5796f(c5795eM, c(bVar.p(), c5795eM.a() * 4).B());
        }
        if (c7427tL.K(Ag.a.f694o1)) {
            return new C5486c(AbstractC6330e.D(c7427tL), AbstractC7428u.z(bVar.u()).B());
        }
        if (c7427tL.K(Ag.a.f454C2)) {
            Vg.a aVarS = Vg.a.s(bVar.u());
            return new Yg.g(AbstractC6330e.r(c7427tL), aVarS.p(), aVarS.n(), aVarS.r(), aVarS.l(), aVarS.t());
        }
        if (c7427tL.K(Ag.a.f520N2)) {
            return new bh.e(AbstractC6330e.h(c7427tL), AbstractC7428u.z(bVar.u()).B());
        }
        if (c7427tL.K(Ag.a.f562U2)) {
            return new C5700e(AbstractC6330e.K(c7427tL), AbstractC7428u.z(bVar.u()).B());
        }
        if (c7427tL.K(Ag.a.f744w3)) {
            return new ih.c(AbstractC6330e.x(c7427tL), AbstractC7428u.z(bVar.u()).B());
        }
        if (c7427tL.u(Bg.a.f1949X0) || c7427tL.u(Bg.a.f1951Y0) || c7427tL.u(Bg.a.f1953Z0)) {
            AbstractC7432y abstractC7432yD = d(bVar.p(), 64);
            gh.e eVarV = AbstractC6330e.v(c7427tL);
            gh.g gVarB = bVar.s() != null ? AbstractC6327c.j.b(eVarV, bVar.s()) : null;
            if (abstractC7432yD instanceof AbstractC7428u) {
                return new gh.f(eVarV, ((AbstractC7428u) abstractC7432yD).B(), gVarB);
            }
            if (!(abstractC7432yD instanceof AbstractC7387B)) {
                throw new IllegalArgumentException("invalid " + eVarV.b() + " private key");
            }
            AbstractC7387B abstractC7387B = (AbstractC7387B) abstractC7432yD;
            byte[] bArrB2 = AbstractC7428u.z(abstractC7387B.B(0)).B();
            byte[] bArrB3 = AbstractC7428u.z(abstractC7387B.B(1)).B();
            gh.f fVar = new gh.f(eVarV, bArrB2, gVarB);
            if (Oh.a.k(fVar.getEncoded(), bArrB3)) {
                return fVar;
            }
            throw new IllegalArgumentException("inconsistent " + eVarV.b() + " private key");
        }
        if (c7427tL.K(Ag.a.f509L3)) {
            AbstractC7387B abstractC7387BA = AbstractC7387B.A(bVar.u());
            return new C5405c(AbstractC6330e.z(c7427tL), AbstractC7428u.z(abstractC7387BA.B(0)).B(), AbstractC7428u.z(abstractC7387BA.B(1)).B(), AbstractC7428u.z(abstractC7387BA.B(2)).B(), AbstractC7428u.z(abstractC7387BA.B(3)).B());
        }
        if (c7427tL.K(Ag.a.f551S3)) {
            AbstractC7387B abstractC7387BA2 = AbstractC7387B.A(bVar.u());
            return new C5409g(AbstractC6330e.Q(c7427tL), AbstractC7428u.z(abstractC7387BA2.B(0)).B(), AbstractC7428u.z(abstractC7387BA2.B(1)).B(), AbstractC7428u.z(abstractC7387BA2.B(2)).B(), AbstractC7428u.z(abstractC7387BA2.B(3)).B(), AbstractC7428u.z(abstractC7387BA2.B(4)).B());
        }
        if (AbstractC6330e.f58832O.containsKey(c7427tL)) {
            AbstractC7432y abstractC7432yD2 = d(bVar.p(), 32);
            C4810c c4810cT = AbstractC6330e.t(c7427tL);
            fh.e eVarB = bVar.s() != null ? AbstractC6327c.i.b(c4810cT, bVar.s()) : null;
            if (abstractC7432yD2 instanceof AbstractC7428u) {
                return new fh.d(c4810cT, ((AbstractC7428u) abstractC7432yD2).B(), eVarB);
            }
            if (!(abstractC7432yD2 instanceof AbstractC7387B)) {
                throw new IllegalArgumentException("invalid " + c4810cT.b() + " private key");
            }
            AbstractC7387B abstractC7387B2 = (AbstractC7387B) abstractC7432yD2;
            byte[] bArrB4 = AbstractC7428u.z(abstractC7387B2.B(0)).B();
            byte[] bArrB5 = AbstractC7428u.z(abstractC7387B2.B(1)).B();
            fh.d dVar = new fh.d(c4810cT, bArrB4, eVarB);
            if (Oh.a.k(dVar.getEncoded(), bArrB5)) {
                return dVar;
            }
            throw new IllegalArgumentException("inconsistent " + c4810cT.b() + " private key");
        }
        if (c7427tL.u(Ag.a.f549S1) || c7427tL.u(Ag.a.f555T1) || c7427tL.u(Ag.a.f561U1)) {
            InterfaceC7400e interfaceC7400eU2 = bVar.u();
            Zg.c cVarD = AbstractC6330e.d(c7427tL);
            if (!(interfaceC7400eU2 instanceof AbstractC7387B)) {
                if (!(interfaceC7400eU2 instanceof C7419n0)) {
                    throw new IOException("not supported");
                }
                byte[] bArrB6 = AbstractC7428u.z(interfaceC7400eU2).B();
                return bVar.s() != null ? new Zg.d(cVarD, bArrB6, AbstractC6327c.d.b(cVarD, bVar.s())) : new Zg.d(cVarD, bArrB6, null);
            }
            AbstractC7387B abstractC7387BA3 = AbstractC7387B.A(interfaceC7400eU2);
            int iG = C7420o.z(abstractC7387BA3.B(0)).G();
            if (iG == 0) {
                if (bVar.s() != null) {
                    return new Zg.d(cVarD, AbstractC7394b.A(abstractC7387BA3.B(1)).D(), AbstractC7394b.A(abstractC7387BA3.B(2)).D(), AbstractC7394b.A(abstractC7387BA3.B(3)).D(), AbstractC7394b.A(abstractC7387BA3.B(4)).D(), AbstractC7394b.A(abstractC7387BA3.B(5)).D(), AbstractC7394b.A(abstractC7387BA3.B(6)).D(), AbstractC6327c.d.b(cVarD, bVar.s()).d());
                }
                return new Zg.d(cVarD, AbstractC7394b.A(abstractC7387BA3.B(1)).D(), AbstractC7394b.A(abstractC7387BA3.B(2)).D(), AbstractC7394b.A(abstractC7387BA3.B(3)).D(), AbstractC7394b.A(abstractC7387BA3.B(4)).D(), AbstractC7394b.A(abstractC7387BA3.B(5)).D(), AbstractC7394b.A(abstractC7387BA3.B(6)).D(), null);
            }
            throw new IOException("unknown private key version: " + iG);
        }
        if (c7427tL.u(Ag.a.f483H1) || c7427tL.u(Ag.a.f501K1)) {
            Vg.c cVarP = Vg.c.p(bVar.u());
            return new C2630c(AbstractC6330e.f(c7427tL), cVarP.s(), cVarP.n(), cVarP.l(), cVarP.r().l());
        }
        if (c7427tL.K(Ag.a.f593Z3)) {
            byte[] bArrB7 = AbstractC7428u.z(bVar.u()).B();
            Xg.c cVarB = AbstractC6330e.b(c7427tL);
            return new Xg.d(cVarB, Oh.a.m(bArrB7, 0, cVarB.b()), Oh.a.m(bArrB7, cVarB.b(), cVarB.b() * 2), Oh.a.m(bArrB7, cVarB.b() * 2, bArrB7.length));
        }
        if (c7427tL.K(Ag.a.f621d4)) {
            return new ch.e(AbstractC6330e.m(c7427tL), AbstractC7428u.z(bVar.u()).B());
        }
        if (c7427tL.K(Ag.a.f701p2)) {
            return new lh.g(AbstractC6330e.H(c7427tL), AbstractC7428u.z(bVar.u()).B());
        }
        if (c7427tL.u(Vg.g.f20347w)) {
            k kVarN = k.n(aVarR.p());
            C7427t c7427tL2 = kVarN.p().l();
            o oVarP = o.p(bVar.u());
            try {
                y.b bVarO = new y.b(new x(kVarN.l(), AbstractC6330e.j(c7427tL2))).l(oVarP.n()).q(oVarP.v()).p(oVarP.u()).n(oVarP.s()).o(oVarP.t());
                if (oVarP.w() != 0) {
                    bVarO.m(oVarP.r());
                }
                if (oVarP.l() != null) {
                    bVarO.k(((C6534a) AbstractC6533A.f(oVarP.l(), C6534a.class)).h(c7427tL2));
                }
                return bVarO.j();
            } catch (ClassNotFoundException e10) {
                throw new IOException("ClassNotFoundException processing BDS state: " + e10.getMessage());
            }
        }
        if (!c7427tL.u(Vg.g.f20295F)) {
            if (c7427tL.u(Vg.g.f20338n)) {
                Vg.e eVarR = Vg.e.r(bVar.u());
                return new Kh.b(eVarR.t(), eVarR.s(), eVarR.n(), eVarR.p(), eVarR.u(), AbstractC6330e.k(eVarR.l().l()));
            }
            if (c7427tL.K(Ag.a.f649h4)) {
                return new C4678c(AbstractC6330e.p(c7427tL), AbstractC7428u.z(bVar.u()).B());
            }
            if (c7427tL.K(Ag.a.f733u4)) {
                return new C5902b(AbstractC6330e.O(c7427tL), AbstractC7428u.z(bVar.u()).B());
            }
            throw new RuntimeException("algorithm identifier in private key not recognised");
        }
        l lVarN = l.n(aVarR.p());
        C7427t c7427tL3 = lVarN.r().l();
        try {
            m mVarP = m.p(bVar.u());
            s.b bVarP = new s.b(new r(lVarN.l(), lVarN.p(), AbstractC6330e.j(c7427tL3))).m(mVarP.n()).r(mVarP.v()).q(mVarP.u()).o(mVarP.s()).p(mVarP.t());
            if (mVarP.w() != 0) {
                bVarP.n(mVarP.r());
            }
            if (mVarP.l() != null) {
                bVarP.l(((sh.b) AbstractC6533A.f(mVarP.l(), sh.b.class)).f(c7427tL3));
            }
            return bVarP.k();
        } catch (ClassNotFoundException e11) {
            throw new IOException("ClassNotFoundException processing BDS state: " + e11.getMessage());
        }
    }

    private static AbstractC7428u c(AbstractC7428u abstractC7428u, int i10) {
        AbstractC7428u abstractC7428uB;
        byte[] bArrB = abstractC7428u.B();
        return (bArrB.length == i10 || (abstractC7428uB = AbstractC6330e.B(bArrB)) == null) ? abstractC7428u : AbstractC7428u.z(abstractC7428uB);
    }

    private static AbstractC7432y d(AbstractC7428u abstractC7428u, int i10) {
        byte[] bArrB = abstractC7428u.B();
        if (bArrB.length == i10) {
            return abstractC7428u;
        }
        AbstractC7432y abstractC7432yA = AbstractC6330e.A(bArrB);
        return abstractC7432yA instanceof AbstractC7428u ? AbstractC7428u.z(abstractC7432yA) : abstractC7432yA instanceof AbstractC7387B ? AbstractC7387B.A(abstractC7432yA) : abstractC7428u;
    }
}
