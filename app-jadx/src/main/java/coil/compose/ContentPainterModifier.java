package coil.compose;

import I0.A;
import I0.C;
import I0.InterfaceC1680f;
import I0.InterfaceC1686l;
import I0.InterfaceC1687m;
import I0.O;
import I0.v;
import Td.L;
import androidx.compose.ui.graphics.d;
import androidx.compose.ui.layout.l;
import androidx.compose.ui.layout.s;
import androidx.compose.ui.platform.T0;
import androidx.compose.ui.platform.V0;
import androidx.compose.ui.platform.W0;
import i1.AbstractC5010c;
import i1.C5009b;
import i1.C5021n;
import ke.AbstractC5466a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import l0.e;
import p0.i;
import r0.AbstractC6231m;
import r0.C6230l;
import u0.InterfaceC6708c;
import w0.AbstractC6923b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0013J)\u0010\u001d\u001a\u00020\u001a*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0014H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\"\u001a\u00020 *\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J#\u0010$\u001a\u00020 *\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b$\u0010#J#\u0010&\u001a\u00020 *\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020 H\u0016¢\u0006\u0004\b&\u0010#J#\u0010'\u001a\u00020 *\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020 H\u0016¢\u0006\u0004\b'\u0010#J\u0013\u0010*\u001a\u00020)*\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020,HÖ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020 HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00104\u001a\u0002032\b\u00102\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\b4\u00105R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00106R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00107R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006>"}, d2 = {"Lcoil/compose/ContentPainterModifier;", "LI0/v;", "Lp0/i;", "Landroidx/compose/ui/platform/W0;", "Lw0/b;", "painter", "Ll0/e;", "alignment", "LI0/f;", "contentScale", "", "alpha", "Landroidx/compose/ui/graphics/d;", "colorFilter", "<init>", "(Lw0/b;Ll0/e;LI0/f;FLandroidx/compose/ui/graphics/d;)V", "Lr0/l;", "dstSize", "a", "(J)J", "Li1/b;", "constraints", "c", "Landroidx/compose/ui/layout/l;", "LI0/A;", "measurable", "LI0/C;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/l;LI0/A;J)LI0/C;", "measure", "LI0/m;", "LI0/l;", "", "height", "minIntrinsicWidth", "(LI0/m;LI0/l;I)I", "maxIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicHeight", "Lu0/c;", "LTd/L;", "draw", "(Lu0/c;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lw0/b;", "Ll0/e;", "d", "LI0/f;", "e", "F", "f", "Landroidx/compose/ui/graphics/d;", "coil-compose-base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ContentPainterModifier extends W0 implements v, i {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final e alignment;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC1680f contentScale;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final float alpha;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final d colorFilter;
    private final AbstractC6923b painter;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ s f33825a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(s sVar) {
            super(1);
            this.f33825a = sVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((s.a) obj);
            return L.f17438a;
        }

        public final void invoke(s.a aVar) {
            s.a.W(aVar, this.f33825a, 0, 0, 0.0f, 4, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC6923b f33826a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f33827b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC1680f f33828c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f33829d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ d f33830e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC6923b abstractC6923b, e eVar, InterfaceC1680f interfaceC1680f, float f10, d dVar) {
            super(1);
            this.f33826a = abstractC6923b;
            this.f33827b = eVar;
            this.f33828c = interfaceC1680f;
            this.f33829d = f10;
            this.f33830e = dVar;
        }

        public final void a(V0 v02) {
            AbstractC5504s.h(v02, "$this$null");
            v02.d("content");
            v02.b().c("painter", this.f33826a);
            v02.b().c("alignment", this.f33827b);
            v02.b().c("contentScale", this.f33828c);
            v02.b().c("alpha", Float.valueOf(this.f33829d));
            v02.b().c("colorFilter", this.f33830e);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((V0) obj);
            return L.f17438a;
        }
    }

    public ContentPainterModifier(AbstractC6923b abstractC6923b, e eVar, InterfaceC1680f interfaceC1680f, float f10, d dVar) {
        AbstractC6923b abstractC6923b2;
        e eVar2;
        InterfaceC1680f interfaceC1680f2;
        float f11;
        d dVar2;
        Function1 function1A;
        if (T0.b()) {
            abstractC6923b2 = abstractC6923b;
            eVar2 = eVar;
            interfaceC1680f2 = interfaceC1680f;
            f11 = f10;
            dVar2 = dVar;
            function1A = new b(abstractC6923b2, eVar2, interfaceC1680f2, f11, dVar2);
        } else {
            abstractC6923b2 = abstractC6923b;
            eVar2 = eVar;
            interfaceC1680f2 = interfaceC1680f;
            f11 = f10;
            dVar2 = dVar;
            function1A = T0.a();
        }
        super(function1A);
        this.painter = abstractC6923b2;
        this.alignment = eVar2;
        this.contentScale = interfaceC1680f2;
        this.alpha = f11;
        this.colorFilter = dVar2;
    }

    private final long a(long dstSize) {
        if (C6230l.k(dstSize)) {
            return C6230l.f58350b.b();
        }
        long jK = this.painter.k();
        if (jK == C6230l.f58350b.a()) {
            return dstSize;
        }
        float fI = C6230l.i(jK);
        if (Float.isInfinite(fI) || Float.isNaN(fI)) {
            fI = C6230l.i(dstSize);
        }
        float fG = C6230l.g(jK);
        if (Float.isInfinite(fG) || Float.isNaN(fG)) {
            fG = C6230l.g(dstSize);
        }
        long jA = AbstractC6231m.a(fI, fG);
        return O.a(jA, this.contentScale.a(jA, dstSize));
    }

    private final long c(long constraints) {
        float fN;
        int iM;
        float fA;
        boolean zJ = C5009b.j(constraints);
        boolean zI = C5009b.i(constraints);
        if (!zJ || !zI) {
            boolean z10 = C5009b.h(constraints) && C5009b.g(constraints);
            long jK = this.painter.k();
            if (jK != C6230l.f58350b.a()) {
                if (z10 && (zJ || zI)) {
                    fN = C5009b.l(constraints);
                    iM = C5009b.k(constraints);
                } else {
                    float fI = C6230l.i(jK);
                    float fG = C6230l.g(jK);
                    fN = (Float.isInfinite(fI) || Float.isNaN(fI)) ? C5009b.n(constraints) : c.b(constraints, fI);
                    if (!Float.isInfinite(fG) && !Float.isNaN(fG)) {
                        fA = c.a(constraints, fG);
                        long jA = a(AbstractC6231m.a(fN, fA));
                        return C5009b.d(constraints, AbstractC5010c.g(constraints, AbstractC5466a.d(C6230l.i(jA))), 0, AbstractC5010c.f(constraints, AbstractC5466a.d(C6230l.g(jA))), 0, 10, null);
                    }
                    iM = C5009b.m(constraints);
                }
                fA = iM;
                long jA2 = a(AbstractC6231m.a(fN, fA));
                return C5009b.d(constraints, AbstractC5010c.g(constraints, AbstractC5466a.d(C6230l.i(jA2))), 0, AbstractC5010c.f(constraints, AbstractC5466a.d(C6230l.g(jA2))), 0, 10, null);
            }
            if (z10) {
                return C5009b.d(constraints, C5009b.l(constraints), 0, C5009b.k(constraints), 0, 10, null);
            }
        }
        return constraints;
    }

    @Override // p0.i
    public void draw(InterfaceC6708c interfaceC6708c) {
        long jA = a(interfaceC6708c.f());
        long jA2 = this.alignment.a(c.f(jA), c.f(interfaceC6708c.f()), interfaceC6708c.getLayoutDirection());
        float fD = C5021n.d(jA2);
        float fE = C5021n.e(jA2);
        interfaceC6708c.n1().a().d(fD, fE);
        this.painter.j(interfaceC6708c, jA, this.alpha, this.colorFilter);
        interfaceC6708c.n1().a().d(-fD, -fE);
        interfaceC6708c.B1();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentPainterModifier)) {
            return false;
        }
        ContentPainterModifier contentPainterModifier = (ContentPainterModifier) other;
        return AbstractC5504s.c(this.painter, contentPainterModifier.painter) && AbstractC5504s.c(this.alignment, contentPainterModifier.alignment) && AbstractC5504s.c(this.contentScale, contentPainterModifier.contentScale) && Float.compare(this.alpha, contentPainterModifier.alpha) == 0 && AbstractC5504s.c(this.colorFilter, contentPainterModifier.colorFilter);
    }

    public int hashCode() {
        int iHashCode = ((((((this.painter.hashCode() * 31) + this.alignment.hashCode()) * 31) + this.contentScale.hashCode()) * 31) + Float.hashCode(this.alpha)) * 31;
        d dVar = this.colorFilter;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }

    @Override // I0.v
    public int maxIntrinsicHeight(InterfaceC1687m interfaceC1687m, InterfaceC1686l interfaceC1686l, int i10) {
        if (this.painter.k() == C6230l.f58350b.a()) {
            return interfaceC1686l.I(i10);
        }
        int I10 = interfaceC1686l.I(C5009b.l(c(AbstractC5010c.b(0, i10, 0, 0, 13, null))));
        return Math.max(AbstractC5466a.d(C6230l.g(a(AbstractC6231m.a(i10, I10)))), I10);
    }

    @Override // I0.v
    public int maxIntrinsicWidth(InterfaceC1687m interfaceC1687m, InterfaceC1686l interfaceC1686l, int i10) {
        if (this.painter.k() == C6230l.f58350b.a()) {
            return interfaceC1686l.q0(i10);
        }
        int iQ0 = interfaceC1686l.q0(C5009b.k(c(AbstractC5010c.b(0, 0, 0, i10, 7, null))));
        return Math.max(AbstractC5466a.d(C6230l.i(a(AbstractC6231m.a(iQ0, i10)))), iQ0);
    }

    @Override // I0.v
    /* JADX INFO: renamed from: measure-3p2s80s */
    public C mo2measure3p2s80s(l lVar, A a10, long j10) {
        s sVarV0 = a10.v0(c(j10));
        return l.u0(lVar, sVarV0.W0(), sVarV0.P0(), null, new a(sVarV0), 4, null);
    }

    @Override // I0.v
    public int minIntrinsicHeight(InterfaceC1687m interfaceC1687m, InterfaceC1686l interfaceC1686l, int i10) {
        if (this.painter.k() == C6230l.f58350b.a()) {
            return interfaceC1686l.Z(i10);
        }
        int iZ = interfaceC1686l.Z(C5009b.l(c(AbstractC5010c.b(0, i10, 0, 0, 13, null))));
        return Math.max(AbstractC5466a.d(C6230l.g(a(AbstractC6231m.a(i10, iZ)))), iZ);
    }

    @Override // I0.v
    public int minIntrinsicWidth(InterfaceC1687m interfaceC1687m, InterfaceC1686l interfaceC1686l, int i10) {
        if (this.painter.k() == C6230l.f58350b.a()) {
            return interfaceC1686l.l0(i10);
        }
        int iL0 = interfaceC1686l.l0(C5009b.k(c(AbstractC5010c.b(0, 0, 0, i10, 7, null))));
        return Math.max(AbstractC5466a.d(C6230l.i(a(AbstractC6231m.a(iL0, i10)))), iL0);
    }

    public String toString() {
        return "ContentPainterModifier(painter=" + this.painter + ", alignment=" + this.alignment + ", contentScale=" + this.contentScale + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }
}
