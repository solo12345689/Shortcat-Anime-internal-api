package K0;

import I0.AbstractC1675a;
import I0.InterfaceC1686l;
import I0.InterfaceC1687m;
import androidx.compose.ui.layout.C2678g;
import be.AbstractC3048a;
import i1.AbstractC5010c;
import i1.C5009b;
import i1.C5025r;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: K0.i0 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1793i0 {

    /* JADX INFO: renamed from: a */
    public static final C1793i0 f10765a = new C1793i0();

    /* JADX INFO: renamed from: K0.i0$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a implements I0.A {

        /* JADX INFO: renamed from: a */
        private final InterfaceC1686l f10766a;

        /* JADX INFO: renamed from: b */
        private final c f10767b;

        /* JADX INFO: renamed from: c */
        private final d f10768c;

        public a(InterfaceC1686l interfaceC1686l, c cVar, d dVar) {
            this.f10766a = interfaceC1686l;
            this.f10767b = cVar;
            this.f10768c = dVar;
        }

        @Override // I0.InterfaceC1686l
        public int I(int i10) {
            return this.f10766a.I(i10);
        }

        @Override // I0.InterfaceC1686l
        public int Z(int i10) {
            return this.f10766a.Z(i10);
        }

        @Override // I0.InterfaceC1686l
        public Object j() {
            return this.f10766a.j();
        }

        @Override // I0.InterfaceC1686l
        public int l0(int i10) {
            return this.f10766a.l0(i10);
        }

        @Override // I0.InterfaceC1686l
        public int q0(int i10) {
            return this.f10766a.q0(i10);
        }

        @Override // I0.A
        public androidx.compose.ui.layout.s v0(long j10) {
            if (this.f10768c == d.f10773a) {
                return new b(this.f10767b == c.f10770b ? this.f10766a.q0(C5009b.k(j10)) : this.f10766a.l0(C5009b.k(j10)), C5009b.g(j10) ? C5009b.k(j10) : 32767);
            }
            return new b(C5009b.h(j10) ? C5009b.l(j10) : 32767, this.f10767b == c.f10770b ? this.f10766a.I(C5009b.l(j10)) : this.f10766a.Z(C5009b.l(j10)));
        }
    }

    /* JADX INFO: renamed from: K0.i0$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c extends Enum {

        /* JADX INFO: renamed from: a */
        public static final c f10769a = new c("Min", 0);

        /* JADX INFO: renamed from: b */
        public static final c f10770b = new c("Max", 1);

        /* JADX INFO: renamed from: c */
        private static final /* synthetic */ c[] f10771c;

        /* JADX INFO: renamed from: d */
        private static final /* synthetic */ EnumEntries f10772d;

        static {
            c[] cVarArrA = a();
            f10771c = cVarArrA;
            f10772d = AbstractC3048a.a(cVarArrA);
        }

        private c(String str, int i10) {
            super(str, i10);
        }

        private static final /* synthetic */ c[] a() {
            return new c[]{f10769a, f10770b};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f10771c.clone();
        }
    }

    /* JADX INFO: renamed from: K0.i0$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class d extends Enum {

        /* JADX INFO: renamed from: a */
        public static final d f10773a = new d("Width", 0);

        /* JADX INFO: renamed from: b */
        public static final d f10774b = new d("Height", 1);

        /* JADX INFO: renamed from: c */
        private static final /* synthetic */ d[] f10775c;

        /* JADX INFO: renamed from: d */
        private static final /* synthetic */ EnumEntries f10776d;

        static {
            d[] dVarArrA = a();
            f10775c = dVarArrA;
            f10776d = AbstractC3048a.a(dVarArrA);
        }

        private d(String str, int i10) {
            super(str, i10);
        }

        private static final /* synthetic */ d[] a() {
            return new d[]{f10773a, f10774b};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f10775c.clone();
        }
    }

    /* JADX INFO: renamed from: K0.i0$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface e {
        /* JADX INFO: renamed from: measure-3p2s80s */
        I0.C mo14measure3p2s80s(androidx.compose.ui.layout.l lVar, I0.A a10, long j10);
    }

    private C1793i0() {
    }

    public final int a(e eVar, InterfaceC1687m interfaceC1687m, InterfaceC1686l interfaceC1686l, int i10) {
        return eVar.mo14measure3p2s80s(new C2678g(interfaceC1687m, interfaceC1687m.getLayoutDirection()), new a(interfaceC1686l, c.f10770b, d.f10774b), AbstractC5010c.b(0, i10, 0, 0, 13, null)).getHeight();
    }

    public final int b(e eVar, InterfaceC1687m interfaceC1687m, InterfaceC1686l interfaceC1686l, int i10) {
        return eVar.mo14measure3p2s80s(new C2678g(interfaceC1687m, interfaceC1687m.getLayoutDirection()), new a(interfaceC1686l, c.f10770b, d.f10773a), AbstractC5010c.b(0, 0, 0, i10, 7, null)).getWidth();
    }

    public final int c(e eVar, InterfaceC1687m interfaceC1687m, InterfaceC1686l interfaceC1686l, int i10) {
        return eVar.mo14measure3p2s80s(new C2678g(interfaceC1687m, interfaceC1687m.getLayoutDirection()), new a(interfaceC1686l, c.f10769a, d.f10774b), AbstractC5010c.b(0, i10, 0, 0, 13, null)).getHeight();
    }

    public final int d(e eVar, InterfaceC1687m interfaceC1687m, InterfaceC1686l interfaceC1686l, int i10) {
        return eVar.mo14measure3p2s80s(new C2678g(interfaceC1687m, interfaceC1687m.getLayoutDirection()), new a(interfaceC1686l, c.f10769a, d.f10773a), AbstractC5010c.b(0, 0, 0, i10, 7, null)).getWidth();
    }

    /* JADX INFO: renamed from: K0.i0$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b extends androidx.compose.ui.layout.s {
        public b(int i10, int i11) {
            b1(C5025r.c((((long) i11) & 4294967295L) | (((long) i10) << 32)));
        }

        @Override // I0.D
        public int N(AbstractC1675a abstractC1675a) {
            return Integer.MIN_VALUE;
        }

        @Override // androidx.compose.ui.layout.s
        public void Y0(long j10, float f10, Function1 function1) {
        }
    }
}
