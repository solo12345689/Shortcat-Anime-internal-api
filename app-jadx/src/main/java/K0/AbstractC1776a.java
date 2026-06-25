package K0;

import I0.AbstractC1675a;
import I0.AbstractC1676b;
import I0.C1685k;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C6224f;

/* JADX INFO: renamed from: K0.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1776a {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1778b f10645a;

    /* JADX INFO: renamed from: b */
    private boolean f10646b;

    /* JADX INFO: renamed from: c */
    private boolean f10647c;

    /* JADX INFO: renamed from: d */
    private boolean f10648d;

    /* JADX INFO: renamed from: e */
    private boolean f10649e;

    /* JADX INFO: renamed from: f */
    private boolean f10650f;

    /* JADX INFO: renamed from: g */
    private boolean f10651g;

    /* JADX INFO: renamed from: h */
    private InterfaceC1778b f10652h;

    /* JADX INFO: renamed from: i */
    private final Map f10653i;

    /* JADX INFO: renamed from: K0.a$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0165a extends AbstractC5506u implements Function1 {
        C0165a() {
            super(1);
        }

        public final void a(InterfaceC1778b interfaceC1778b) {
            if (interfaceC1778b.p()) {
                if (interfaceC1778b.z().g()) {
                    interfaceC1778b.Y();
                }
                Map map = interfaceC1778b.z().f10653i;
                AbstractC1776a abstractC1776a = AbstractC1776a.this;
                for (Map.Entry entry : map.entrySet()) {
                    abstractC1776a.c((AbstractC1675a) entry.getKey(), ((Number) entry.getValue()).intValue(), interfaceC1778b.f0());
                }
                AbstractC1785e0 abstractC1785e0P2 = interfaceC1778b.f0().P2();
                AbstractC5504s.e(abstractC1785e0P2);
                while (!AbstractC5504s.c(abstractC1785e0P2, AbstractC1776a.this.f().f0())) {
                    Set<AbstractC1675a> setKeySet = AbstractC1776a.this.e(abstractC1785e0P2).keySet();
                    AbstractC1776a abstractC1776a2 = AbstractC1776a.this;
                    for (AbstractC1675a abstractC1675a : setKeySet) {
                        abstractC1776a2.c(abstractC1675a, abstractC1776a2.i(abstractC1785e0P2, abstractC1675a), abstractC1785e0P2);
                    }
                    abstractC1785e0P2 = abstractC1785e0P2.P2();
                    AbstractC5504s.e(abstractC1785e0P2);
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC1778b) obj);
            return Td.L.f17438a;
        }
    }

    public /* synthetic */ AbstractC1776a(InterfaceC1778b interfaceC1778b, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC1778b);
    }

    public final void c(AbstractC1675a abstractC1675a, int i10, AbstractC1785e0 abstractC1785e0) {
        float f10 = i10;
        long jE = C6224f.e((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L));
        while (true) {
            jE = d(abstractC1785e0, jE);
            abstractC1785e0 = abstractC1785e0.P2();
            AbstractC5504s.e(abstractC1785e0);
            if (AbstractC5504s.c(abstractC1785e0, this.f10645a.f0())) {
                break;
            } else if (e(abstractC1785e0).containsKey(abstractC1675a)) {
                float fI = i(abstractC1785e0, abstractC1675a);
                jE = C6224f.e((((long) Float.floatToRawIntBits(fI)) << 32) | (((long) Float.floatToRawIntBits(fI)) & 4294967295L));
            }
        }
        int iRound = Math.round(abstractC1675a instanceof C1685k ? Float.intBitsToFloat((int) (jE & 4294967295L)) : Float.intBitsToFloat((int) (jE >> 32)));
        Map map = this.f10653i;
        if (map.containsKey(abstractC1675a)) {
            iRound = AbstractC1676b.c(abstractC1675a, ((Number) Ud.S.j(this.f10653i, abstractC1675a)).intValue(), iRound);
        }
        map.put(abstractC1675a, Integer.valueOf(iRound));
    }

    protected abstract long d(AbstractC1785e0 abstractC1785e0, long j10);

    protected abstract Map e(AbstractC1785e0 abstractC1785e0);

    public final InterfaceC1778b f() {
        return this.f10645a;
    }

    public final boolean g() {
        return this.f10646b;
    }

    public final Map h() {
        return this.f10653i;
    }

    protected abstract int i(AbstractC1785e0 abstractC1785e0, AbstractC1675a abstractC1675a);

    public final boolean j() {
        return this.f10647c || this.f10649e || this.f10650f || this.f10651g;
    }

    public final boolean k() {
        o();
        return this.f10652h != null;
    }

    public final boolean l() {
        return this.f10648d;
    }

    public final void m() {
        this.f10646b = true;
        InterfaceC1778b interfaceC1778bS = this.f10645a.S();
        if (interfaceC1778bS == null) {
            return;
        }
        if (this.f10647c) {
            interfaceC1778bS.G0();
        } else if (this.f10649e || this.f10648d) {
            interfaceC1778bS.requestLayout();
        }
        if (this.f10650f) {
            this.f10645a.G0();
        }
        if (this.f10651g) {
            this.f10645a.requestLayout();
        }
        interfaceC1778bS.z().m();
    }

    public final void n() {
        this.f10653i.clear();
        this.f10645a.C0(new C0165a());
        this.f10653i.putAll(e(this.f10645a.f0()));
        this.f10646b = false;
    }

    public final void o() {
        InterfaceC1778b interfaceC1778b;
        AbstractC1776a abstractC1776aZ;
        AbstractC1776a abstractC1776aZ2;
        if (j()) {
            interfaceC1778b = this.f10645a;
        } else {
            InterfaceC1778b interfaceC1778bS = this.f10645a.S();
            if (interfaceC1778bS == null) {
                return;
            }
            interfaceC1778b = interfaceC1778bS.z().f10652h;
            if (interfaceC1778b == null || !interfaceC1778b.z().j()) {
                InterfaceC1778b interfaceC1778b2 = this.f10652h;
                if (interfaceC1778b2 == null || interfaceC1778b2.z().j()) {
                    return;
                }
                InterfaceC1778b interfaceC1778bS2 = interfaceC1778b2.S();
                if (interfaceC1778bS2 != null && (abstractC1776aZ2 = interfaceC1778bS2.z()) != null) {
                    abstractC1776aZ2.o();
                }
                InterfaceC1778b interfaceC1778bS3 = interfaceC1778b2.S();
                interfaceC1778b = (interfaceC1778bS3 == null || (abstractC1776aZ = interfaceC1778bS3.z()) == null) ? null : abstractC1776aZ.f10652h;
            }
        }
        this.f10652h = interfaceC1778b;
    }

    public final void p() {
        this.f10646b = true;
        this.f10647c = false;
        this.f10649e = false;
        this.f10648d = false;
        this.f10650f = false;
        this.f10651g = false;
        this.f10652h = null;
    }

    public final void q(boolean z10) {
        this.f10649e = z10;
    }

    public final void r(boolean z10) {
        this.f10651g = z10;
    }

    public final void s(boolean z10) {
        this.f10650f = z10;
    }

    public final void t(boolean z10) {
        this.f10648d = z10;
    }

    public final void u(boolean z10) {
        this.f10647c = z10;
    }

    private AbstractC1776a(InterfaceC1778b interfaceC1778b) {
        this.f10645a = interfaceC1778b;
        this.f10646b = true;
        this.f10653i = new HashMap();
    }
}
