package w0;

import Td.L;
import androidx.compose.ui.graphics.d;
import i1.EnumC5027t;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import r0.AbstractC6227i;
import r0.C6224f;
import r0.C6226h;
import r0.C6230l;
import s0.InterfaceC6364j0;
import s0.InterfaceC6368k1;
import s0.Q;
import u0.InterfaceC6711f;

/* JADX INFO: renamed from: w0.b */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6923b {

    /* JADX INFO: renamed from: a */
    private InterfaceC6368k1 f62745a;

    /* JADX INFO: renamed from: b */
    private boolean f62746b;

    /* JADX INFO: renamed from: c */
    private d f62747c;

    /* JADX INFO: renamed from: d */
    private float f62748d = 1.0f;

    /* JADX INFO: renamed from: e */
    private EnumC5027t f62749e = EnumC5027t.f48573a;

    /* JADX INFO: renamed from: f */
    private final Function1 f62750f = new a();

    /* JADX INFO: renamed from: w0.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC6711f) obj);
            return L.f17438a;
        }

        public final void invoke(InterfaceC6711f interfaceC6711f) {
            AbstractC6923b.this.m(interfaceC6711f);
        }
    }

    private final void g(float f10) {
        if (this.f62748d == f10) {
            return;
        }
        if (!a(f10)) {
            if (f10 == 1.0f) {
                InterfaceC6368k1 interfaceC6368k1 = this.f62745a;
                if (interfaceC6368k1 != null) {
                    interfaceC6368k1.e(f10);
                }
                this.f62746b = false;
            } else {
                l().e(f10);
                this.f62746b = true;
            }
        }
        this.f62748d = f10;
    }

    private final void h(d dVar) {
        if (AbstractC5504s.c(this.f62747c, dVar)) {
            return;
        }
        if (!b(dVar)) {
            if (dVar == null) {
                InterfaceC6368k1 interfaceC6368k1 = this.f62745a;
                if (interfaceC6368k1 != null) {
                    interfaceC6368k1.d(null);
                }
                this.f62746b = false;
            } else {
                l().d(dVar);
                this.f62746b = true;
            }
        }
        this.f62747c = dVar;
    }

    private final void i(EnumC5027t enumC5027t) {
        if (this.f62749e != enumC5027t) {
            f(enumC5027t);
            this.f62749e = enumC5027t;
        }
    }

    private final InterfaceC6368k1 l() {
        InterfaceC6368k1 interfaceC6368k1 = this.f62745a;
        if (interfaceC6368k1 != null) {
            return interfaceC6368k1;
        }
        InterfaceC6368k1 interfaceC6368k1A = Q.a();
        this.f62745a = interfaceC6368k1A;
        return interfaceC6368k1A;
    }

    protected abstract boolean a(float f10);

    protected abstract boolean b(d dVar);

    protected boolean f(EnumC5027t enumC5027t) {
        return false;
    }

    public final void j(InterfaceC6711f interfaceC6711f, long j10, float f10, d dVar) {
        g(f10);
        h(dVar);
        i(interfaceC6711f.getLayoutDirection());
        int i10 = (int) (j10 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC6711f.f() >> 32)) - Float.intBitsToFloat(i10);
        int i11 = (int) (j10 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC6711f.f() & 4294967295L)) - Float.intBitsToFloat(i11);
        interfaceC6711f.n1().a().i(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
        if (f10 > 0.0f) {
            try {
                if (Float.intBitsToFloat(i10) > 0.0f && Float.intBitsToFloat(i11) > 0.0f) {
                    if (this.f62746b) {
                        long jC = C6224f.f58329b.c();
                        float fIntBitsToFloat3 = Float.intBitsToFloat(i10);
                        C6226h c6226hB = AbstractC6227i.b(jC, C6230l.d((((long) Float.floatToRawIntBits(Float.intBitsToFloat(i11))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32)));
                        InterfaceC6364j0 interfaceC6364j0B = interfaceC6711f.n1().b();
                        try {
                            interfaceC6364j0B.s(c6226hB, l());
                            m(interfaceC6711f);
                            interfaceC6364j0B.k();
                        } catch (Throwable th2) {
                            interfaceC6364j0B.k();
                            throw th2;
                        }
                    } else {
                        m(interfaceC6711f);
                    }
                }
            } catch (Throwable th3) {
                interfaceC6711f.n1().a().i(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
                throw th3;
            }
        }
        interfaceC6711f.n1().a().i(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
    }

    public abstract long k();

    protected abstract void m(InterfaceC6711f interfaceC6711f);
}
