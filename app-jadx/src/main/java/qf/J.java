package qf;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rf.AbstractC6317g;
import rf.InterfaceC6315e;
import vf.AbstractC6867d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class J extends I implements InterfaceC6212w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f57985e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f57986f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f57987d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(AbstractC6183d0 lowerBound, AbstractC6183d0 upperBound) {
        super(lowerBound, upperBound);
        AbstractC5504s.h(lowerBound, "lowerBound");
        AbstractC5504s.h(upperBound, "upperBound");
    }

    private final void Z0() {
        if (!f57986f || this.f57987d) {
            return;
        }
        this.f57987d = true;
        L.b(V0());
        L.b(W0());
        AbstractC5504s.c(V0(), W0());
        InterfaceC6315e.f58773a.a(V0(), W0());
    }

    @Override // qf.InterfaceC6212w
    public boolean F0() {
        return (V0().N0().p() instanceof ye.m0) && AbstractC5504s.c(V0().N0(), W0().N0());
    }

    @Override // qf.M0
    public M0 R0(boolean z10) {
        return V.e(V0().R0(z10), W0().R0(z10));
    }

    @Override // qf.InterfaceC6212w
    public S T(S replacement) {
        M0 m0E;
        AbstractC5504s.h(replacement, "replacement");
        M0 m0Q0 = replacement.Q0();
        if (m0Q0 instanceof I) {
            m0E = m0Q0;
        } else {
            if (!(m0Q0 instanceof AbstractC6183d0)) {
                throw new Td.r();
            }
            AbstractC6183d0 abstractC6183d0 = (AbstractC6183d0) m0Q0;
            m0E = V.e(abstractC6183d0, abstractC6183d0.R0(true));
        }
        return L0.b(m0E, m0Q0);
    }

    @Override // qf.M0
    public M0 T0(r0 newAttributes) {
        AbstractC5504s.h(newAttributes, "newAttributes");
        return V.e(V0().T0(newAttributes), W0().T0(newAttributes));
    }

    @Override // qf.I
    public AbstractC6183d0 U0() {
        Z0();
        return V0();
    }

    @Override // qf.I
    public String X0(af.n renderer, af.w options) {
        AbstractC5504s.h(renderer, "renderer");
        AbstractC5504s.h(options, "options");
        if (!options.i()) {
            return renderer.P(renderer.S(V0()), renderer.S(W0()), AbstractC6867d.n(this));
        }
        return '(' + renderer.S(V0()) + ".." + renderer.S(W0()) + ')';
    }

    @Override // qf.M0
    /* JADX INFO: renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public I X0(AbstractC6317g kotlinTypeRefiner) {
        AbstractC5504s.h(kotlinTypeRefiner, "kotlinTypeRefiner");
        S sA = kotlinTypeRefiner.a(V0());
        AbstractC5504s.f(sA, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        S sA2 = kotlinTypeRefiner.a(W0());
        AbstractC5504s.f(sA2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new J((AbstractC6183d0) sA, (AbstractC6183d0) sA2);
    }

    @Override // qf.I
    public String toString() {
        return '(' + V0() + ".." + W0() + ')';
    }
}
