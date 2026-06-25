package s0;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;
import r0.C6224f;
import r0.C6226h;
import r0.C6228j;

/* JADX INFO: renamed from: s0.m1 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC6374m1 {

    /* JADX INFO: renamed from: a */
    public static final a f58966a = a.f58967a;

    /* JADX INFO: renamed from: s0.m1$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ a f58967a = new a();

        private a() {
        }
    }

    /* JADX INFO: renamed from: s0.m1$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends Enum {

        /* JADX INFO: renamed from: a */
        public static final b f58968a = new b("CounterClockwise", 0);

        /* JADX INFO: renamed from: b */
        public static final b f58969b = new b("Clockwise", 1);

        /* JADX INFO: renamed from: c */
        private static final /* synthetic */ b[] f58970c;

        /* JADX INFO: renamed from: d */
        private static final /* synthetic */ EnumEntries f58971d;

        static {
            b[] bVarArrA = a();
            f58970c = bVarArrA;
            f58971d = AbstractC3048a.a(bVarArrA);
        }

        private b(String str, int i10) {
            super(str, i10);
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f58968a, f58969b};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f58970c.clone();
        }
    }

    static /* synthetic */ void n(InterfaceC6374m1 interfaceC6374m1, InterfaceC6374m1 interfaceC6374m12, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPath-Uv8p0NA");
        }
        if ((i10 & 2) != 0) {
            j10 = C6224f.f58329b.c();
        }
        interfaceC6374m1.q(interfaceC6374m12, j10);
    }

    static /* synthetic */ void p(InterfaceC6374m1 interfaceC6374m1, C6226h c6226h, b bVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addOval");
        }
        if ((i10 & 2) != 0) {
            bVar = b.f58968a;
        }
        interfaceC6374m1.e(c6226h, bVar);
    }

    static /* synthetic */ void s(InterfaceC6374m1 interfaceC6374m1, C6228j c6228j, b bVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addRoundRect");
        }
        if ((i10 & 2) != 0) {
            bVar = b.f58968a;
        }
        interfaceC6374m1.k(c6228j, bVar);
    }

    static /* synthetic */ void t(InterfaceC6374m1 interfaceC6374m1, C6226h c6226h, b bVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addRect");
        }
        if ((i10 & 2) != 0) {
            bVar = b.f58968a;
        }
        interfaceC6374m1.i(c6226h, bVar);
    }

    void C();

    void a(float f10, float f11);

    void b(float f10, float f11, float f12, float f13, float f14, float f15);

    void c(float f10, float f11);

    void close();

    boolean d();

    void e(C6226h c6226h, b bVar);

    void f(float f10, float f11);

    void g(float f10, float f11, float f12, float f13, float f14, float f15);

    C6226h getBounds();

    void h(int i10);

    void i(C6226h c6226h, b bVar);

    boolean isEmpty();

    void j(float f10, float f11, float f12, float f13);

    void k(C6228j c6228j, b bVar);

    void l(long j10);

    boolean m(InterfaceC6374m1 interfaceC6374m1, InterfaceC6374m1 interfaceC6374m12, int i10);

    void o(float f10, float f11, float f12, float f13);

    void q(InterfaceC6374m1 interfaceC6374m1, long j10);

    int r();

    void reset();

    void u(float f10, float f11);
}
