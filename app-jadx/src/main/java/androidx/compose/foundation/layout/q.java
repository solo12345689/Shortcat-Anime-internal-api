package androidx.compose.foundation.layout;

import I0.A;
import I0.C;
import K0.E;
import Td.L;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.s;
import i1.AbstractC5010c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class q extends e.c implements E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f26189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f26190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f26191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f26192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f26193e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.s f26195b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.l f26196c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.layout.s sVar, androidx.compose.ui.layout.l lVar) {
            super(1);
            this.f26195b = sVar;
            this.f26196c = lVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((s.a) obj);
            return L.f17438a;
        }

        public final void invoke(s.a aVar) {
            if (q.this.E1()) {
                s.a.W(aVar, this.f26195b, this.f26196c.s0(q.this.F1()), this.f26196c.s0(q.this.G1()), 0.0f, 4, null);
            } else {
                s.a.N(aVar, this.f26195b, this.f26196c.s0(q.this.F1()), this.f26196c.s0(q.this.G1()), 0.0f, 4, null);
            }
        }
    }

    public /* synthetic */ q(float f10, float f11, float f12, float f13, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, z10);
    }

    public final boolean E1() {
        return this.f26193e;
    }

    public final float F1() {
        return this.f26189a;
    }

    public final float G1() {
        return this.f26190b;
    }

    public final void H1(float f10) {
        this.f26192d = f10;
    }

    public final void I1(float f10) {
        this.f26191c = f10;
    }

    public final void J1(boolean z10) {
        this.f26193e = z10;
    }

    public final void K1(float f10) {
        this.f26189a = f10;
    }

    public final void L1(float f10) {
        this.f26190b = f10;
    }

    @Override // K0.E
    /* JADX INFO: renamed from: measure-3p2s80s */
    public C mo5measure3p2s80s(androidx.compose.ui.layout.l lVar, A a10, long j10) {
        int iS0 = lVar.s0(this.f26189a) + lVar.s0(this.f26191c);
        int iS02 = lVar.s0(this.f26190b) + lVar.s0(this.f26192d);
        androidx.compose.ui.layout.s sVarV0 = a10.v0(AbstractC5010c.j(j10, -iS0, -iS02));
        return androidx.compose.ui.layout.l.u0(lVar, AbstractC5010c.g(j10, sVarV0.W0() + iS0), AbstractC5010c.f(j10, sVarV0.P0() + iS02), null, new a(sVarV0, lVar), 4, null);
    }

    private q(float f10, float f11, float f12, float f13, boolean z10) {
        this.f26189a = f10;
        this.f26190b = f11;
        this.f26191c = f12;
        this.f26192d = f13;
        this.f26193e = z10;
    }
}
