package androidx.compose.ui.platform;

import Y0.H;
import Y0.I;
import android.os.Parcel;
import android.util.Base64;
import g1.C4821a;
import g1.C4831k;
import i1.C5029v;
import i1.C5031x;
import s0.C6385r0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class E0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Parcel f27211a = Parcel.obtain();

    public final void a(byte b10) {
        this.f27211a.writeByte(b10);
    }

    public final void b(float f10) {
        this.f27211a.writeFloat(f10);
    }

    public final void c(int i10) {
        this.f27211a.writeInt(i10);
    }

    public final void d(U0.I0 i02) {
        long jG = i02.g();
        C6385r0.a aVar = C6385r0.f58985b;
        if (!C6385r0.s(jG, aVar.j())) {
            a((byte) 1);
            m(i02.g());
        }
        long jK = i02.k();
        C5029v.a aVar2 = C5029v.f48578b;
        if (!C5029v.e(jK, aVar2.a())) {
            a((byte) 2);
            j(i02.k());
        }
        Y0.L lN = i02.n();
        if (lN != null) {
            a((byte) 3);
            e(lN);
        }
        Y0.H hL = i02.l();
        if (hL != null) {
            int i10 = hL.i();
            a((byte) 4);
            o(i10);
        }
        Y0.I iM = i02.m();
        if (iM != null) {
            int iM2 = iM.m();
            a((byte) 5);
            l(iM2);
        }
        String strJ = i02.j();
        if (strJ != null) {
            a((byte) 6);
            h(strJ);
        }
        if (!C5029v.e(i02.o(), aVar2.a())) {
            a((byte) 7);
            j(i02.o());
        }
        C4821a c4821aE = i02.e();
        if (c4821aE != null) {
            float fH = c4821aE.h();
            a((byte) 8);
            k(fH);
        }
        g1.q qVarU = i02.u();
        if (qVarU != null) {
            a((byte) 9);
            g(qVarU);
        }
        if (!C6385r0.s(i02.d(), aVar.j())) {
            a((byte) 10);
            m(i02.d());
        }
        C4831k c4831kS = i02.s();
        if (c4831kS != null) {
            a((byte) 11);
            f(c4831kS);
        }
        s0.C1 c1R = i02.r();
        if (c1R != null) {
            a((byte) 12);
            i(c1R);
        }
    }

    public final void e(Y0.L l10) {
        c(l10.v());
    }

    public final void f(C4831k c4831k) {
        c(c4831k.e());
    }

    public final void g(g1.q qVar) {
        b(qVar.b());
        b(qVar.c());
    }

    public final void h(String str) {
        this.f27211a.writeString(str);
    }

    public final void i(s0.C1 c12) {
        m(c12.c());
        b(Float.intBitsToFloat((int) (c12.d() >> 32)));
        b(Float.intBitsToFloat((int) (c12.d() & 4294967295L)));
        b(c12.b());
    }

    public final void j(long j10) {
        long jG = C5029v.g(j10);
        C5031x.a aVar = C5031x.f48582b;
        byte b10 = 0;
        if (!C5031x.g(jG, aVar.c())) {
            if (C5031x.g(jG, aVar.b())) {
                b10 = 1;
            } else if (C5031x.g(jG, aVar.a())) {
                b10 = 2;
            }
        }
        a(b10);
        if (C5031x.g(C5029v.g(j10), aVar.c())) {
            return;
        }
        b(C5029v.h(j10));
    }

    public final void k(float f10) {
        b(f10);
    }

    public final void l(int i10) {
        I.a aVar = Y0.I.f22598b;
        byte b10 = 0;
        if (!Y0.I.h(i10, aVar.b())) {
            if (Y0.I.h(i10, aVar.a())) {
                b10 = 1;
            } else if (Y0.I.h(i10, aVar.d())) {
                b10 = 2;
            } else if (Y0.I.h(i10, aVar.c())) {
                b10 = 3;
            }
        }
        a(b10);
    }

    public final void m(long j10) {
        n(Td.F.b(s0.H.b(j10)));
    }

    public final void n(long j10) {
        this.f27211a.writeLong(j10);
    }

    public final void o(int i10) {
        H.a aVar = Y0.H.f22594b;
        byte b10 = 0;
        if (!Y0.H.f(i10, aVar.b()) && Y0.H.f(i10, aVar.a())) {
            b10 = 1;
        }
        a(b10);
    }

    public final String p() {
        return Base64.encodeToString(this.f27211a.marshall(), 0);
    }

    public final void q() {
        this.f27211a.recycle();
        this.f27211a = Parcel.obtain();
    }
}
