package I0;

import androidx.compose.ui.layout.C2678g;
import be.AbstractC3048a;
import i1.AbstractC5010c;
import i1.C5009b;
import i1.C5025r;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class E {

    /* JADX INFO: renamed from: a */
    public static final E f8653a = new E();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a implements A {

        /* JADX INFO: renamed from: a */
        private final InterfaceC1686l f8654a;

        /* JADX INFO: renamed from: b */
        private final c f8655b;

        /* JADX INFO: renamed from: c */
        private final d f8656c;

        public a(InterfaceC1686l interfaceC1686l, c cVar, d dVar) {
            this.f8654a = interfaceC1686l;
            this.f8655b = cVar;
            this.f8656c = dVar;
        }

        @Override // I0.InterfaceC1686l
        public int I(int i10) {
            return this.f8654a.I(i10);
        }

        @Override // I0.InterfaceC1686l
        public int Z(int i10) {
            return this.f8654a.Z(i10);
        }

        @Override // I0.InterfaceC1686l
        public Object j() {
            return this.f8654a.j();
        }

        @Override // I0.InterfaceC1686l
        public int l0(int i10) {
            return this.f8654a.l0(i10);
        }

        @Override // I0.InterfaceC1686l
        public int q0(int i10) {
            return this.f8654a.q0(i10);
        }

        @Override // I0.A
        public androidx.compose.ui.layout.s v0(long j10) {
            if (this.f8656c == d.f8661a) {
                return new b(this.f8655b == c.f8658b ? this.f8654a.q0(C5009b.k(j10)) : this.f8654a.l0(C5009b.k(j10)), C5009b.g(j10) ? C5009b.k(j10) : 32767);
            }
            return new b(C5009b.h(j10) ? C5009b.l(j10) : 32767, this.f8655b == c.f8658b ? this.f8654a.I(C5009b.l(j10)) : this.f8654a.Z(C5009b.l(j10)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c extends Enum {

        /* JADX INFO: renamed from: a */
        public static final c f8657a = new c("Min", 0);

        /* JADX INFO: renamed from: b */
        public static final c f8658b = new c("Max", 1);

        /* JADX INFO: renamed from: c */
        private static final /* synthetic */ c[] f8659c;

        /* JADX INFO: renamed from: d */
        private static final /* synthetic */ EnumEntries f8660d;

        static {
            c[] cVarArrA = a();
            f8659c = cVarArrA;
            f8660d = AbstractC3048a.a(cVarArrA);
        }

        private c(String str, int i10) {
            super(str, i10);
        }

        private static final /* synthetic */ c[] a() {
            return new c[]{f8657a, f8658b};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f8659c.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class d extends Enum {

        /* JADX INFO: renamed from: a */
        public static final d f8661a = new d("Width", 0);

        /* JADX INFO: renamed from: b */
        public static final d f8662b = new d("Height", 1);

        /* JADX INFO: renamed from: c */
        private static final /* synthetic */ d[] f8663c;

        /* JADX INFO: renamed from: d */
        private static final /* synthetic */ EnumEntries f8664d;

        static {
            d[] dVarArrA = a();
            f8663c = dVarArrA;
            f8664d = AbstractC3048a.a(dVarArrA);
        }

        private d(String str, int i10) {
            super(str, i10);
        }

        private static final /* synthetic */ d[] a() {
            return new d[]{f8661a, f8662b};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f8663c.clone();
        }
    }

    private E() {
    }

    public final int a(v vVar, InterfaceC1687m interfaceC1687m, InterfaceC1686l interfaceC1686l, int i10) {
        return vVar.mo2measure3p2s80s(new C2678g(interfaceC1687m, interfaceC1687m.getLayoutDirection()), new a(interfaceC1686l, c.f8658b, d.f8662b), AbstractC5010c.b(0, i10, 0, 0, 13, null)).getHeight();
    }

    public final int b(v vVar, InterfaceC1687m interfaceC1687m, InterfaceC1686l interfaceC1686l, int i10) {
        return vVar.mo2measure3p2s80s(new C2678g(interfaceC1687m, interfaceC1687m.getLayoutDirection()), new a(interfaceC1686l, c.f8658b, d.f8661a), AbstractC5010c.b(0, 0, 0, i10, 7, null)).getWidth();
    }

    public final int c(v vVar, InterfaceC1687m interfaceC1687m, InterfaceC1686l interfaceC1686l, int i10) {
        return vVar.mo2measure3p2s80s(new C2678g(interfaceC1687m, interfaceC1687m.getLayoutDirection()), new a(interfaceC1686l, c.f8657a, d.f8662b), AbstractC5010c.b(0, i10, 0, 0, 13, null)).getHeight();
    }

    public final int d(v vVar, InterfaceC1687m interfaceC1687m, InterfaceC1686l interfaceC1686l, int i10) {
        return vVar.mo2measure3p2s80s(new C2678g(interfaceC1687m, interfaceC1687m.getLayoutDirection()), new a(interfaceC1686l, c.f8657a, d.f8661a), AbstractC5010c.b(0, 0, 0, i10, 7, null)).getWidth();
    }

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
