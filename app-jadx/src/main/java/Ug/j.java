package ug;

import Df.AbstractC1268a;
import Df.r;
import Td.L;
import Td.z;
import Ud.AbstractC2279u;
import Ud.S;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.J;
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.N;
import tg.AbstractC6688m;
import tg.AbstractC6690o;
import tg.C6689n;
import tg.InterfaceC6685j;
import tg.K;
import tg.P;
import tg.c0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class j {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Xd.a.d(((i) obj).a(), ((i) obj2).a());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ J f61552a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f61553b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ M f61554c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6685j f61555d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ M f61556e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ M f61557f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(J j10, long j11, M m10, InterfaceC6685j interfaceC6685j, M m11, M m12) {
            super(2);
            this.f61552a = j10;
            this.f61553b = j11;
            this.f61554c = m10;
            this.f61555d = interfaceC6685j;
            this.f61556e = m11;
            this.f61557f = m12;
        }

        public final void a(int i10, long j10) throws IOException {
            if (i10 == 1) {
                J j11 = this.f61552a;
                if (j11.f52255a) {
                    throw new IOException("bad zip: zip64 extra repeated");
                }
                j11.f52255a = true;
                if (j10 < this.f61553b) {
                    throw new IOException("bad zip: zip64 extra too short");
                }
                M m10 = this.f61554c;
                long jK0 = m10.f52258a;
                if (jK0 == 4294967295L) {
                    jK0 = this.f61555d.K0();
                }
                m10.f52258a = jK0;
                M m11 = this.f61556e;
                m11.f52258a = m11.f52258a == 4294967295L ? this.f61555d.K0() : 0L;
                M m12 = this.f61557f;
                m12.f52258a = m12.f52258a == 4294967295L ? this.f61555d.K0() : 0L;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws IOException {
            a(((Number) obj).intValue(), ((Number) obj2).longValue());
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6685j f61558a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ N f61559b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ N f61560c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ N f61561d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC6685j interfaceC6685j, N n10, N n11, N n12) {
            super(2);
            this.f61558a = interfaceC6685j;
            this.f61559b = n10;
            this.f61560c = n11;
            this.f61561d = n12;
        }

        public final void a(int i10, long j10) throws IOException {
            if (i10 == 21589) {
                if (j10 < 1) {
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
                byte b10 = this.f61558a.readByte();
                boolean z10 = (b10 & 1) == 1;
                boolean z11 = (b10 & 2) == 2;
                boolean z12 = (b10 & 4) == 4;
                InterfaceC6685j interfaceC6685j = this.f61558a;
                long j11 = z10 ? 5L : 1L;
                if (z11) {
                    j11 += 4;
                }
                if (z12) {
                    j11 += 4;
                }
                if (j10 < j11) {
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
                if (z10) {
                    this.f61559b.f52259a = Long.valueOf(((long) interfaceC6685j.J1()) * 1000);
                }
                if (z11) {
                    this.f61560c.f52259a = Long.valueOf(((long) this.f61558a.J1()) * 1000);
                }
                if (z12) {
                    this.f61561d.f52259a = Long.valueOf(((long) this.f61558a.J1()) * 1000);
                }
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws IOException {
            a(((Number) obj).intValue(), ((Number) obj2).longValue());
            return L.f17438a;
        }
    }

    private static final Map a(List list) {
        P pE = P.a.e(P.f60968b, "/", false, 1, null);
        Map mapN = S.n(z.a(pE, new i(pE, true, null, 0L, 0L, 0L, 0, null, 0L, 508, null)));
        for (i iVar : AbstractC2279u.R0(list, new a())) {
            if (((i) mapN.put(iVar.a(), iVar)) == null) {
                while (true) {
                    P pN = iVar.a().n();
                    if (pN != null) {
                        i iVar2 = (i) mapN.get(pN);
                        if (iVar2 != null) {
                            iVar2.b().add(iVar.a());
                            break;
                        }
                        i iVar3 = new i(pN, true, null, 0L, 0L, 0L, 0, null, 0L, 508, null);
                        mapN.put(pN, iVar3);
                        iVar3.b().add(iVar.a());
                        iVar = iVar3;
                    }
                }
            }
        }
        return mapN;
    }

    private static final Long b(int i10, int i11) {
        if (i11 == -1) {
            return null;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(14, 0);
        gregorianCalendar.set(((i10 >> 9) & 127) + 1980, ((i10 >> 5) & 15) - 1, i10 & 31, (i11 >> 11) & 31, (i11 >> 5) & 63, (i11 & 31) << 1);
        return Long.valueOf(gregorianCalendar.getTime().getTime());
    }

    private static final String c(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("0x");
        String string = Integer.toString(i10, AbstractC1268a.a(16));
        AbstractC5504s.g(string, "toString(this, checkRadix(radix))");
        sb2.append(string);
        return sb2.toString();
    }

    /* JADX WARN: Finally extract failed */
    public static final c0 d(P zipPath, AbstractC6690o fileSystem, Function1 predicate) throws IOException {
        long size;
        long j10;
        InterfaceC6685j interfaceC6685jD;
        AbstractC5504s.h(zipPath, "zipPath");
        AbstractC5504s.h(fileSystem, "fileSystem");
        AbstractC5504s.h(predicate, "predicate");
        AbstractC6688m abstractC6688mN = fileSystem.n(zipPath);
        try {
            size = abstractC6688mN.size() - ((long) 22);
        } finally {
        }
        if (size < 0) {
            throw new IOException("not a zip: size=" + abstractC6688mN.size());
        }
        long jMax = Math.max(size - 65536, 0L);
        do {
            InterfaceC6685j interfaceC6685jD2 = K.d(abstractC6688mN.q(size));
            try {
                if (interfaceC6685jD2.J1() == 101010256) {
                    f fVarF = f(interfaceC6685jD2);
                    String strV0 = interfaceC6685jD2.V0(fVarF.b());
                    interfaceC6685jD2.close();
                    long j11 = size - ((long) 20);
                    if (j11 > 0) {
                        interfaceC6685jD = K.d(abstractC6688mN.q(j11));
                        try {
                            if (interfaceC6685jD.J1() == 117853008) {
                                int iJ1 = interfaceC6685jD.J1();
                                long jK0 = interfaceC6685jD.K0();
                                if (interfaceC6685jD.J1() != 1 || iJ1 != 0) {
                                    throw new IOException("unsupported zip: spanned");
                                }
                                interfaceC6685jD = K.d(abstractC6688mN.q(jK0));
                                try {
                                    int iJ12 = interfaceC6685jD.J1();
                                    if (iJ12 != 101075792) {
                                        throw new IOException("bad zip: expected " + c(101075792) + " but was " + c(iJ12));
                                    }
                                    fVarF = j(interfaceC6685jD, fVarF);
                                    L l10 = L.f17438a;
                                    fe.c.a(interfaceC6685jD, null);
                                } finally {
                                }
                            }
                            L l11 = L.f17438a;
                            fe.c.a(interfaceC6685jD, null);
                        } finally {
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    interfaceC6685jD = K.d(abstractC6688mN.q(fVarF.a()));
                    try {
                        long jC = fVarF.c();
                        for (j10 = 0; j10 < jC; j10++) {
                            i iVarE = e(interfaceC6685jD);
                            if (iVarE.f() >= fVarF.a()) {
                                throw new IOException("bad zip: local file header offset >= central directory offset");
                            }
                            if (((Boolean) predicate.invoke(iVarE)).booleanValue()) {
                                arrayList.add(iVarE);
                            }
                        }
                        L l12 = L.f17438a;
                        fe.c.a(interfaceC6685jD, null);
                        c0 c0Var = new c0(zipPath, fileSystem, a(arrayList), strV0);
                        fe.c.a(abstractC6688mN, null);
                        return c0Var;
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } finally {
                        }
                    }
                }
                interfaceC6685jD2.close();
                size--;
            } finally {
                interfaceC6685jD2.close();
            }
        } while (size >= jMax);
        throw new IOException("not a zip: end of central directory signature not found");
    }

    public static final i e(InterfaceC6685j interfaceC6685j) throws IOException {
        AbstractC5504s.h(interfaceC6685j, "<this>");
        int iJ1 = interfaceC6685j.J1();
        if (iJ1 != 33639248) {
            throw new IOException("bad zip: expected " + c(33639248) + " but was " + c(iJ1));
        }
        interfaceC6685j.skip(4L);
        short sJ0 = interfaceC6685j.J0();
        int i10 = sJ0 & 65535;
        if ((sJ0 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + c(i10));
        }
        int iJ0 = interfaceC6685j.J0() & 65535;
        Long lB = b(interfaceC6685j.J0() & 65535, interfaceC6685j.J0() & 65535);
        long jJ1 = ((long) interfaceC6685j.J1()) & 4294967295L;
        M m10 = new M();
        m10.f52258a = ((long) interfaceC6685j.J1()) & 4294967295L;
        M m11 = new M();
        m11.f52258a = ((long) interfaceC6685j.J1()) & 4294967295L;
        int iJ02 = interfaceC6685j.J0() & 65535;
        int iJ03 = interfaceC6685j.J0() & 65535;
        int iJ04 = interfaceC6685j.J0() & 65535;
        interfaceC6685j.skip(8L);
        M m12 = new M();
        m12.f52258a = ((long) interfaceC6685j.J1()) & 4294967295L;
        String strV0 = interfaceC6685j.V0(iJ02);
        if (r.V(strV0, (char) 0, false, 2, null)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long j10 = m11.f52258a == 4294967295L ? 8 : 0L;
        if (m10.f52258a == 4294967295L) {
            j10 += (long) 8;
        }
        if (m12.f52258a == 4294967295L) {
            j10 += (long) 8;
        }
        J j11 = new J();
        g(interfaceC6685j, iJ03, new b(j11, j10, m11, interfaceC6685j, m10, m12));
        if (j10 <= 0 || j11.f52255a) {
            return new i(P.a.e(P.f60968b, "/", false, 1, null).q(strV0), r.A(strV0, "/", false, 2, null), interfaceC6685j.V0(iJ04), jJ1, m10.f52258a, m11.f52258a, iJ0, lB, m12.f52258a);
        }
        throw new IOException("bad zip: zip64 extra required but absent");
    }

    private static final f f(InterfaceC6685j interfaceC6685j) throws IOException {
        int iJ0 = interfaceC6685j.J0() & 65535;
        int iJ02 = interfaceC6685j.J0() & 65535;
        long jJ0 = interfaceC6685j.J0() & 65535;
        if (jJ0 != (interfaceC6685j.J0() & 65535) || iJ0 != 0 || iJ02 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        interfaceC6685j.skip(4L);
        return new f(jJ0, 4294967295L & ((long) interfaceC6685j.J1()), interfaceC6685j.J0() & 65535);
    }

    private static final void g(InterfaceC6685j interfaceC6685j, int i10, Function2 function2) throws IOException {
        long j10 = i10;
        while (j10 != 0) {
            if (j10 < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int iJ0 = interfaceC6685j.J0() & 65535;
            long jJ0 = ((long) interfaceC6685j.J0()) & 65535;
            long j11 = j10 - ((long) 4);
            if (j11 < jJ0) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            interfaceC6685j.R0(jJ0);
            long size = interfaceC6685j.s().size();
            function2.invoke(Integer.valueOf(iJ0), Long.valueOf(jJ0));
            long size2 = (interfaceC6685j.s().size() + jJ0) - size;
            if (size2 < 0) {
                throw new IOException("unsupported zip: too many bytes processed for " + iJ0);
            }
            if (size2 > 0) {
                interfaceC6685j.s().skip(size2);
            }
            j10 = j11 - jJ0;
        }
    }

    public static final C6689n h(InterfaceC6685j interfaceC6685j, C6689n basicMetadata) throws IOException {
        AbstractC5504s.h(interfaceC6685j, "<this>");
        AbstractC5504s.h(basicMetadata, "basicMetadata");
        C6689n c6689nI = i(interfaceC6685j, basicMetadata);
        AbstractC5504s.e(c6689nI);
        return c6689nI;
    }

    private static final C6689n i(InterfaceC6685j interfaceC6685j, C6689n c6689n) throws IOException {
        N n10 = new N();
        n10.f52259a = c6689n != null ? c6689n.c() : null;
        N n11 = new N();
        N n12 = new N();
        int iJ1 = interfaceC6685j.J1();
        if (iJ1 != 67324752) {
            throw new IOException("bad zip: expected " + c(67324752) + " but was " + c(iJ1));
        }
        interfaceC6685j.skip(2L);
        short sJ0 = interfaceC6685j.J0();
        int i10 = sJ0 & 65535;
        if ((sJ0 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + c(i10));
        }
        interfaceC6685j.skip(18L);
        long jJ0 = ((long) interfaceC6685j.J0()) & 65535;
        int iJ0 = interfaceC6685j.J0() & 65535;
        interfaceC6685j.skip(jJ0);
        if (c6689n == null) {
            interfaceC6685j.skip(iJ0);
            return null;
        }
        g(interfaceC6685j, iJ0, new c(interfaceC6685j, n10, n11, n12));
        return new C6689n(c6689n.g(), c6689n.f(), null, c6689n.d(), (Long) n12.f52259a, (Long) n10.f52259a, (Long) n11.f52259a, null, 128, null);
    }

    private static final f j(InterfaceC6685j interfaceC6685j, f fVar) throws IOException {
        interfaceC6685j.skip(12L);
        int iJ1 = interfaceC6685j.J1();
        int iJ12 = interfaceC6685j.J1();
        long jK0 = interfaceC6685j.K0();
        if (jK0 != interfaceC6685j.K0() || iJ1 != 0 || iJ12 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        interfaceC6685j.skip(8L);
        return new f(jK0, interfaceC6685j.K0(), fVar.b());
    }

    public static final void k(InterfaceC6685j interfaceC6685j) {
        AbstractC5504s.h(interfaceC6685j, "<this>");
        i(interfaceC6685j, null);
    }
}
