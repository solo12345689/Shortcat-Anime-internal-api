package androidx.compose.ui;

import I0.A;
import I0.C;
import K0.E;
import Td.L;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.l;
import androidx.compose.ui.layout.s;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends e.c implements E {

    /* JADX INFO: renamed from: a */
    private float f26615a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ s f26616a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ f f26617b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(s sVar, f fVar) {
            super(1);
            this.f26616a = sVar;
            this.f26617b = fVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((s.a) obj);
            return L.f17438a;
        }

        public final void invoke(s.a aVar) {
            aVar.L(this.f26616a, 0, 0, this.f26617b.E1());
        }
    }

    public f(float f10) {
        this.f26615a = f10;
    }

    public final float E1() {
        return this.f26615a;
    }

    public final void F1(float f10) {
        this.f26615a = f10;
    }

    @Override // K0.E
    /* JADX INFO: renamed from: measure-3p2s80s */
    public C mo5measure3p2s80s(l lVar, A a10, long j10) {
        s sVarV0 = a10.v0(j10);
        return l.u0(lVar, sVarV0.W0(), sVarV0.P0(), null, new a(sVarV0, this), 4, null);
    }

    public String toString() {
        return "ZIndexModifier(zIndex=" + this.f26615a + ')';
    }
}
