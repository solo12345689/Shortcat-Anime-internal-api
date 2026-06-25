package U2;

import P9.AbstractC2011u;
import U2.y;
import g3.C4837a;
import java.util.Arrays;
import java.util.List;
import q2.C6078J;
import q2.C6080L;
import t2.C6608H;
import t2.C6609I;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public y f19095a;

        public a(y yVar) {
            this.f19095a = yVar;
        }
    }

    public static boolean a(InterfaceC2256q interfaceC2256q) {
        C6609I c6609i = new C6609I(4);
        interfaceC2256q.o(c6609i.f(), 0, 4);
        return c6609i.O() == 1716281667;
    }

    public static int b(InterfaceC2256q interfaceC2256q) throws C6080L {
        interfaceC2256q.g();
        C6609I c6609i = new C6609I(2);
        interfaceC2256q.o(c6609i.f(), 0, 2);
        int iU = c6609i.U();
        if ((iU >> 2) == 16382) {
            interfaceC2256q.g();
            return iU;
        }
        interfaceC2256q.g();
        throw C6080L.a("First frame does not start with sync code.", null);
    }

    public static C6078J c(InterfaceC2256q interfaceC2256q, boolean z10) throws Throwable {
        C6078J c6078jA = new D().a(interfaceC2256q, z10 ? null : i3.h.f48615b);
        if (c6078jA == null || c6078jA.e() == 0) {
            return null;
        }
        return c6078jA;
    }

    public static C6078J d(InterfaceC2256q interfaceC2256q, boolean z10) throws Throwable {
        interfaceC2256q.g();
        long j10 = interfaceC2256q.j();
        C6078J c6078jC = c(interfaceC2256q, z10);
        interfaceC2256q.m((int) (interfaceC2256q.j() - j10));
        return c6078jC;
    }

    public static boolean e(InterfaceC2256q interfaceC2256q, a aVar) {
        interfaceC2256q.g();
        C6608H c6608h = new C6608H(new byte[4]);
        interfaceC2256q.o(c6608h.f60526a, 0, 4);
        boolean zG = c6608h.g();
        int iH = c6608h.h(7);
        int iH2 = c6608h.h(24) + 4;
        if (iH == 0) {
            aVar.f19095a = h(interfaceC2256q);
            return zG;
        }
        y yVar = aVar.f19095a;
        if (yVar == null) {
            throw new IllegalArgumentException();
        }
        if (iH == 3) {
            aVar.f19095a = yVar.b(f(interfaceC2256q, iH2));
            return zG;
        }
        if (iH == 4) {
            aVar.f19095a = yVar.c(j(interfaceC2256q, iH2));
            return zG;
        }
        if (iH != 6) {
            interfaceC2256q.m(iH2);
            return zG;
        }
        C6609I c6609i = new C6609I(iH2);
        interfaceC2256q.readFully(c6609i.f(), 0, iH2);
        c6609i.c0(4);
        aVar.f19095a = yVar.a(AbstractC2011u.B(C4837a.d(c6609i)));
        return zG;
    }

    private static y.a f(InterfaceC2256q interfaceC2256q, int i10) {
        C6609I c6609i = new C6609I(i10);
        interfaceC2256q.readFully(c6609i.f(), 0, i10);
        return g(c6609i);
    }

    public static y.a g(C6609I c6609i) {
        c6609i.c0(1);
        int iP = c6609i.P();
        long jG = ((long) c6609i.g()) + ((long) iP);
        int i10 = iP / 18;
        long[] jArrCopyOf = new long[i10];
        long[] jArrCopyOf2 = new long[i10];
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            long jF = c6609i.F();
            if (jF == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i11);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i11);
                break;
            }
            jArrCopyOf[i11] = jF;
            jArrCopyOf2[i11] = c6609i.F();
            c6609i.c0(2);
            i11++;
        }
        c6609i.c0((int) (jG - ((long) c6609i.g())));
        return new y.a(jArrCopyOf, jArrCopyOf2);
    }

    private static y h(InterfaceC2256q interfaceC2256q) {
        byte[] bArr = new byte[38];
        interfaceC2256q.readFully(bArr, 0, 38);
        return new y(bArr, 4);
    }

    public static void i(InterfaceC2256q interfaceC2256q) throws C6080L {
        C6609I c6609i = new C6609I(4);
        interfaceC2256q.readFully(c6609i.f(), 0, 4);
        if (c6609i.O() != 1716281667) {
            throw C6080L.a("Failed to read FLAC stream marker.", null);
        }
    }

    private static List j(InterfaceC2256q interfaceC2256q, int i10) {
        C6609I c6609i = new C6609I(i10);
        interfaceC2256q.readFully(c6609i.f(), 0, i10);
        c6609i.c0(4);
        return Arrays.asList(S.k(c6609i, false, false).f18950b);
    }
}
