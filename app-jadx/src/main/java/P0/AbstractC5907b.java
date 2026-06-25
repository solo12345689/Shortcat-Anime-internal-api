package p0;

import Td.L;
import i1.C5015h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;
import s0.E1;
import s0.I1;
import s0.t1;
import s0.v1;

/* JADX INFO: renamed from: p0.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5907b {

    /* JADX INFO: renamed from: p0.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f55670a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f55671b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f55672c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ E1 f55673d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f55674e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f10, float f11, int i10, E1 e12, boolean z10) {
            super(1);
            this.f55670a = f10;
            this.f55671b = f11;
            this.f55672c = i10;
            this.f55673d = e12;
            this.f55674e = z10;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((androidx.compose.ui.graphics.g) obj);
            return L.f17438a;
        }

        public final void invoke(androidx.compose.ui.graphics.g gVar) {
            float fL1 = gVar.l1(this.f55670a);
            float fL12 = gVar.l1(this.f55671b);
            gVar.G((fL1 <= 0.0f || fL12 <= 0.0f) ? null : v1.a(fL1, fL12, this.f55672c));
            E1 e1A = this.f55673d;
            if (e1A == null) {
                e1A = t1.a();
            }
            gVar.s1(e1A);
            gVar.n(this.f55674e);
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, float f10, float f11, E1 e12) {
        int iB;
        boolean z10;
        if (e12 != null) {
            iB = I1.f58895a.a();
            z10 = true;
        } else {
            iB = I1.f58895a.b();
            z10 = false;
        }
        float f12 = 0;
        return ((C5015h.m(f10, C5015h.n(f12)) <= 0 || C5015h.m(f11, C5015h.n(f12)) <= 0) && !z10) ? eVar : androidx.compose.ui.graphics.f.a(eVar, new a(f10, f11, iB, e12, z10));
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, float f10, E1 e12) {
        return a(eVar, f10, f10, e12);
    }

    public static /* synthetic */ androidx.compose.ui.e c(androidx.compose.ui.e eVar, float f10, C5908c c5908c, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            c5908c = C5908c.c(C5908c.f55675b.a());
        }
        return b(eVar, f10, c5908c.h());
    }
}
