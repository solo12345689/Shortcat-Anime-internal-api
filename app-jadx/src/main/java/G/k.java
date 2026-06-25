package G;

import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import androidx.compose.ui.platform.AbstractC2739w0;
import i1.EnumC5027t;
import i1.InterfaceC5011d;
import ie.InterfaceC5096o;
import kotlin.jvm.internal.AbstractC5506u;
import v.AbstractC6778A;
import w.AbstractC6906j;
import w.I0;
import w.InterfaceC6904i;
import w.InterfaceC6921z;
import z.InterfaceC7255B;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f6852a = new k();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5096o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C f6853a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ EnumC5027t f6854b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f6855c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C c10, EnumC5027t enumC5027t, float f10) {
            super(3);
            this.f6853a = c10;
            this.f6854b = enumC5027t;
            this.f6855c = f10;
        }

        public final Float a(float f10, float f11, float f12) {
            return Float.valueOf(A.g.d(this.f6853a, this.f6854b, this.f6855c, f10, f11, f12));
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a(((Number) obj).floatValue(), ((Number) obj2).floatValue(), ((Number) obj3).floatValue());
        }
    }

    private k() {
    }

    public final InterfaceC7255B a(C c10, A a10, InterfaceC6921z interfaceC6921z, InterfaceC6904i interfaceC6904i, float f10, InterfaceC2425m interfaceC2425m, int i10, int i11) {
        boolean z10 = true;
        if ((i11 & 2) != 0) {
            a10 = A.f6697a.a(1);
        }
        if ((i11 & 4) != 0) {
            interfaceC6921z = AbstractC6778A.b(interfaceC2425m, 0);
        }
        if ((i11 & 8) != 0) {
            interfaceC6904i = AbstractC6906j.h(0.0f, 400.0f, Float.valueOf(I0.b(kotlin.jvm.internal.r.f52290a)), 1, null);
        }
        if ((i11 & 16) != 0) {
            f10 = 0.5f;
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(1559769181, i10, -1, "androidx.compose.foundation.pager.PagerDefaults.flingBehavior (Pager.kt:301)");
        }
        if (0.0f > f10 || f10 > 1.0f) {
            throw new IllegalArgumentException(("snapPositionalThreshold should be a number between 0 and 1. You've specified " + f10).toString());
        }
        Object obj = (InterfaceC5011d) interfaceC2425m.n(AbstractC2739w0.e());
        EnumC5027t enumC5027t = (EnumC5027t) interfaceC2425m.n(AbstractC2739w0.k());
        boolean zU = ((((i10 & 14) ^ 6) > 4 && interfaceC2425m.U(c10)) || (i10 & 6) == 4) | interfaceC2425m.U(interfaceC6921z) | interfaceC2425m.U(interfaceC6904i);
        if ((((i10 & 112) ^ 48) <= 32 || !interfaceC2425m.U(a10)) && (i10 & 48) != 32) {
            z10 = false;
        }
        boolean zU2 = zU | z10 | interfaceC2425m.U(obj) | interfaceC2425m.U(enumC5027t);
        Object objD = interfaceC2425m.D();
        if (zU2 || objD == InterfaceC2425m.f22370a.a()) {
            objD = A.i.l(A.g.a(c10, a10, new a(c10, enumC5027t, f10)), interfaceC6921z, interfaceC6904i);
            interfaceC2425m.u(objD);
        }
        InterfaceC7255B interfaceC7255B = (InterfaceC7255B) objD;
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return interfaceC7255B;
    }

    public final D0.a b(C c10, z.q qVar, InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(877583120, i10, -1, "androidx.compose.foundation.pager.PagerDefaults.pageNestedScrollConnection (Pager.kt:350)");
        }
        boolean z10 = ((((i10 & 14) ^ 6) > 4 && interfaceC2425m.U(c10)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && interfaceC2425m.U(qVar)) || (i10 & 48) == 32);
        Object objD = interfaceC2425m.D();
        if (z10 || objD == InterfaceC2425m.f22370a.a()) {
            objD = new C1587a(c10, qVar);
            interfaceC2425m.u(objD);
        }
        C1587a c1587a = (C1587a) objD;
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return c1587a;
    }
}
