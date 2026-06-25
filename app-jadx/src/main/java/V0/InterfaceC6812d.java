package v0;

import android.graphics.Matrix;
import android.graphics.Outline;
import i1.EnumC5027t;
import i1.InterfaceC5011d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;
import s0.C6385r0;
import s0.InterfaceC6364j0;
import s0.u1;
import u0.InterfaceC6711f;

/* JADX INFO: renamed from: v0.d */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC6812d {

    /* JADX INFO: renamed from: a */
    public static final a f61821a = a.f61822a;

    /* JADX INFO: renamed from: v0.d$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ a f61822a = new a();

        /* JADX INFO: renamed from: b */
        private static final Function1 f61823b = C0927a.f61824a;

        /* JADX INFO: renamed from: v0.d$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0927a extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a */
            public static final C0927a f61824a = new C0927a();

            C0927a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC6711f) obj);
                return Td.L.f17438a;
            }

            public final void invoke(InterfaceC6711f interfaceC6711f) {
                InterfaceC6711f.B0(interfaceC6711f, C6385r0.f58985b.i(), 0L, 0L, 0.0f, null, null, 0, 126, null);
            }
        }

        private a() {
        }

        public final Function1 a() {
            return f61823b;
        }
    }

    long A();

    void B(InterfaceC5011d interfaceC5011d, EnumC5027t enumC5027t, C6811c c6811c, Function1 function1);

    float C();

    float D();

    float E();

    void F(float f10);

    void G(u1 u1Var);

    float H();

    long I();

    Matrix J();

    void K(InterfaceC6364j0 interfaceC6364j0);

    default boolean L() {
        return false;
    }

    void M(boolean z10);

    void N(Outline outline, long j10);

    void O(long j10);

    void P(int i10);

    float Q();

    float a();

    u1 b();

    void c(int i10);

    void d(androidx.compose.ui.graphics.d dVar);

    void e(float f10);

    androidx.compose.ui.graphics.d f();

    void g(float f10);

    float h();

    float i();

    int j();

    void k(long j10);

    void l(float f10);

    float m();

    void n(boolean z10);

    void o(long j10);

    void p();

    int q();

    void r(float f10);

    void s(float f10);

    void t(float f10);

    float u();

    void v(float f10);

    void w(float f10);

    void x(int i10, int i11, long j10);

    void y(float f10);

    default boolean z() {
        return true;
    }
}
