package androidx.compose.foundation.layout;

import I0.A;
import I0.C;
import K0.E;
import Td.L;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.s;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class o extends e.c implements E {

    /* JADX INFO: renamed from: a */
    private float f26175a;

    /* JADX INFO: renamed from: b */
    private float f26176b;

    /* JADX INFO: renamed from: c */
    private boolean f26177c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ androidx.compose.ui.layout.s f26179b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ androidx.compose.ui.layout.l f26180c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.layout.s sVar, androidx.compose.ui.layout.l lVar) {
            super(1);
            this.f26179b = sVar;
            this.f26180c = lVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((s.a) obj);
            return L.f17438a;
        }

        public final void invoke(s.a aVar) {
            if (o.this.E1()) {
                s.a.W(aVar, this.f26179b, this.f26180c.s0(o.this.F1()), this.f26180c.s0(o.this.G1()), 0.0f, 4, null);
            } else {
                s.a.N(aVar, this.f26179b, this.f26180c.s0(o.this.F1()), this.f26180c.s0(o.this.G1()), 0.0f, 4, null);
            }
        }
    }

    public /* synthetic */ o(float f10, float f11, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, z10);
    }

    public final boolean E1() {
        return this.f26177c;
    }

    public final float F1() {
        return this.f26175a;
    }

    public final float G1() {
        return this.f26176b;
    }

    public final void H1(boolean z10) {
        this.f26177c = z10;
    }

    public final void I1(float f10) {
        this.f26175a = f10;
    }

    public final void J1(float f10) {
        this.f26176b = f10;
    }

    @Override // K0.E
    /* JADX INFO: renamed from: measure-3p2s80s */
    public C mo5measure3p2s80s(androidx.compose.ui.layout.l lVar, A a10, long j10) {
        androidx.compose.ui.layout.s sVarV0 = a10.v0(j10);
        return androidx.compose.ui.layout.l.u0(lVar, sVarV0.W0(), sVarV0.P0(), null, new a(sVarV0, lVar), 4, null);
    }

    private o(float f10, float f11, boolean z10) {
        this.f26175a = f10;
        this.f26176b = f11;
        this.f26177c = z10;
    }
}
