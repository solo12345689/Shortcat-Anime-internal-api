package androidx.compose.ui.draw;

import I0.A;
import I0.C;
import I0.InterfaceC1680f;
import I0.InterfaceC1686l;
import I0.InterfaceC1687m;
import I0.O;
import K0.E;
import K0.InterfaceC1806t;
import Td.L;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.l;
import androidx.compose.ui.layout.s;
import i1.AbstractC5010c;
import i1.C5009b;
import i1.C5021n;
import i1.C5025r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;
import r0.C6230l;
import u0.InterfaceC6708c;
import w0.AbstractC6923b;

/* JADX INFO: renamed from: androidx.compose.ui.draw.PainterNode, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b(\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BA\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0015J\u0013\u0010\u0019\u001a\u00020\u0006*\u00020\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u0006*\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ#\u0010\"\u001a\u00020\u001f*\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b \u0010!J#\u0010'\u001a\u00020%*\u00020#2\u0006\u0010\u001e\u001a\u00020$2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J#\u0010)\u001a\u00020%*\u00020#2\u0006\u0010\u001e\u001a\u00020$2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b)\u0010(J#\u0010+\u001a\u00020%*\u00020#2\u0006\u0010\u001e\u001a\u00020$2\u0006\u0010*\u001a\u00020%H\u0016¢\u0006\u0004\b+\u0010(J#\u0010,\u001a\u00020%*\u00020#2\u0006\u0010\u001e\u001a\u00020$2\u0006\u0010*\u001a\u00020%H\u0016¢\u0006\u0004\b,\u0010(J\u0013\u0010/\u001a\u00020.*\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00102\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bK\u0010TR\u0014\u0010V\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bU\u0010<R\u0014\u0010X\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010<¨\u0006Y"}, d2 = {"Landroidx/compose/ui/draw/PainterNode;", "LK0/E;", "Landroidx/compose/ui/e$c;", "LK0/t;", "Lw0/b;", "painter", "", "sizeToIntrinsics", "Ll0/e;", "alignment", "LI0/f;", "contentScale", "", "alpha", "Landroidx/compose/ui/graphics/d;", "colorFilter", "<init>", "(Lw0/b;ZLl0/e;LI0/f;FLandroidx/compose/ui/graphics/d;)V", "Lr0/l;", "dstSize", "E1", "(J)J", "Li1/b;", "constraints", "K1", "J1", "(J)Z", "I1", "Landroidx/compose/ui/layout/l;", "LI0/A;", "measurable", "LI0/C;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/l;LI0/A;J)LI0/C;", "measure", "LI0/m;", "LI0/l;", "", "height", "minIntrinsicWidth", "(LI0/m;LI0/l;I)I", "maxIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicHeight", "Lu0/c;", "LTd/L;", "draw", "(Lu0/c;)V", "", "toString", "()Ljava/lang/String;", "Lw0/b;", "F1", "()Lw0/b;", "N1", "(Lw0/b;)V", "a", "Z", "G1", "()Z", "O1", "(Z)V", "b", "Ll0/e;", "getAlignment", "()Ll0/e;", "L1", "(Ll0/e;)V", "c", "LI0/f;", "getContentScale", "()LI0/f;", "M1", "(LI0/f;)V", "d", "F", "getAlpha", "()F", "e", "(F)V", "Landroidx/compose/ui/graphics/d;", "getColorFilter", "()Landroidx/compose/ui/graphics/d;", "(Landroidx/compose/ui/graphics/d;)V", "H1", "useIntrinsicSize", "getShouldAutoInvalidate", "shouldAutoInvalidate", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class PainterModifier extends e.c implements E, InterfaceC1806t {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private boolean sizeToIntrinsics;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private l0.e alignment;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private InterfaceC1680f contentScale;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private float alpha;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private androidx.compose.ui.graphics.d colorFilter;
    private AbstractC6923b painter;

    /* JADX INFO: renamed from: androidx.compose.ui.draw.PainterNode$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ s f26596a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(s sVar) {
            super(1);
            this.f26596a = sVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((s.a) obj);
            return L.f17438a;
        }

        public final void invoke(s.a aVar) {
            s.a.W(aVar, this.f26596a, 0, 0, 0.0f, 4, null);
        }
    }

    public PainterModifier(AbstractC6923b abstractC6923b, boolean z10, l0.e eVar, InterfaceC1680f interfaceC1680f, float f10, androidx.compose.ui.graphics.d dVar) {
        this.painter = abstractC6923b;
        this.sizeToIntrinsics = z10;
        this.alignment = eVar;
        this.contentScale = interfaceC1680f;
        this.alpha = f10;
        this.colorFilter = dVar;
    }

    private final long E1(long dstSize) {
        if (!H1()) {
            return dstSize;
        }
        long jD = C6230l.d((((long) Float.floatToRawIntBits(!J1(this.painter.k()) ? Float.intBitsToFloat((int) (dstSize >> 32)) : Float.intBitsToFloat((int) (this.painter.k() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(!I1(this.painter.k()) ? Float.intBitsToFloat((int) (dstSize & 4294967295L)) : Float.intBitsToFloat((int) (this.painter.k() & 4294967295L)))) & 4294967295L));
        return (Float.intBitsToFloat((int) (dstSize >> 32)) == 0.0f || Float.intBitsToFloat((int) (dstSize & 4294967295L)) == 0.0f) ? C6230l.f58350b.b() : O.a(jD, this.contentScale.a(jD, dstSize));
    }

    private final boolean H1() {
        return this.sizeToIntrinsics && this.painter.k() != 9205357640488583168L;
    }

    private final boolean I1(long j10) {
        return !C6230l.f(j10, C6230l.f58350b.a()) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    private final boolean J1(long j10) {
        return !C6230l.f(j10, C6230l.f58350b.a()) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    private final long K1(long constraints) {
        boolean z10 = false;
        boolean z11 = C5009b.h(constraints) && C5009b.g(constraints);
        if (C5009b.j(constraints) && C5009b.i(constraints)) {
            z10 = true;
        }
        if ((!H1() && z11) || z10) {
            return C5009b.d(constraints, C5009b.l(constraints), 0, C5009b.k(constraints), 0, 10, null);
        }
        long jK = this.painter.k();
        int iRound = J1(jK) ? Math.round(Float.intBitsToFloat((int) (jK >> 32))) : C5009b.n(constraints);
        int iRound2 = I1(jK) ? Math.round(Float.intBitsToFloat((int) (jK & 4294967295L))) : C5009b.m(constraints);
        long jE1 = E1(C6230l.d((((long) Float.floatToRawIntBits(AbstractC5010c.f(constraints, iRound2))) & 4294967295L) | (((long) Float.floatToRawIntBits(AbstractC5010c.g(constraints, iRound))) << 32)));
        return C5009b.d(constraints, AbstractC5010c.g(constraints, Math.round(Float.intBitsToFloat((int) (jE1 >> 32)))), 0, AbstractC5010c.f(constraints, Math.round(Float.intBitsToFloat((int) (jE1 & 4294967295L)))), 0, 10, null);
    }

    /* JADX INFO: renamed from: F1, reason: from getter */
    public final AbstractC6923b getPainter() {
        return this.painter;
    }

    /* JADX INFO: renamed from: G1, reason: from getter */
    public final boolean getSizeToIntrinsics() {
        return this.sizeToIntrinsics;
    }

    public final void L1(l0.e eVar) {
        this.alignment = eVar;
    }

    public final void M1(InterfaceC1680f interfaceC1680f) {
        this.contentScale = interfaceC1680f;
    }

    public final void N1(AbstractC6923b abstractC6923b) {
        this.painter = abstractC6923b;
    }

    public final void O1(boolean z10) {
        this.sizeToIntrinsics = z10;
    }

    public final void d(androidx.compose.ui.graphics.d dVar) {
        this.colorFilter = dVar;
    }

    @Override // K0.InterfaceC1806t
    public void draw(InterfaceC6708c interfaceC6708c) {
        long jK = this.painter.k();
        float fIntBitsToFloat = J1(jK) ? Float.intBitsToFloat((int) (jK >> 32)) : Float.intBitsToFloat((int) (interfaceC6708c.f() >> 32));
        long jD = C6230l.d((((long) Float.floatToRawIntBits(I1(jK) ? Float.intBitsToFloat((int) (jK & 4294967295L)) : Float.intBitsToFloat((int) (interfaceC6708c.f() & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32));
        long jB = (Float.intBitsToFloat((int) (interfaceC6708c.f() >> 32)) == 0.0f || Float.intBitsToFloat((int) (interfaceC6708c.f() & 4294967295L)) == 0.0f) ? C6230l.f58350b.b() : O.a(jD, this.contentScale.a(jD, interfaceC6708c.f()));
        long jA = this.alignment.a(C5025r.c((((long) Math.round(Float.intBitsToFloat((int) (jB & 4294967295L)))) & 4294967295L) | (((long) Math.round(Float.intBitsToFloat((int) (jB >> 32)))) << 32)), C5025r.c((((long) Math.round(Float.intBitsToFloat((int) (interfaceC6708c.f() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (interfaceC6708c.f() & 4294967295L)))) & 4294967295L)), interfaceC6708c.getLayoutDirection());
        float fK = C5021n.k(jA);
        float fL = C5021n.l(jA);
        interfaceC6708c.n1().a().d(fK, fL);
        try {
            this.painter.j(interfaceC6708c, jB, this.alpha, this.colorFilter);
            interfaceC6708c.n1().a().d(-fK, -fL);
            interfaceC6708c.B1();
        } catch (Throwable th2) {
            interfaceC6708c.n1().a().d(-fK, -fL);
            throw th2;
        }
    }

    public final void e(float f10) {
        this.alpha = f10;
    }

    @Override // androidx.compose.ui.e.c
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // K0.E
    public int maxIntrinsicHeight(InterfaceC1687m interfaceC1687m, InterfaceC1686l interfaceC1686l, int i10) {
        if (!H1()) {
            return interfaceC1686l.I(i10);
        }
        long jK1 = K1(AbstractC5010c.b(0, i10, 0, 0, 13, null));
        return Math.max(C5009b.m(jK1), interfaceC1686l.I(i10));
    }

    @Override // K0.E
    public int maxIntrinsicWidth(InterfaceC1687m interfaceC1687m, InterfaceC1686l interfaceC1686l, int i10) {
        if (!H1()) {
            return interfaceC1686l.q0(i10);
        }
        long jK1 = K1(AbstractC5010c.b(0, 0, 0, i10, 7, null));
        return Math.max(C5009b.n(jK1), interfaceC1686l.q0(i10));
    }

    @Override // K0.E
    /* JADX INFO: renamed from: measure-3p2s80s */
    public C mo5measure3p2s80s(l lVar, A a10, long j10) {
        s sVarV0 = a10.v0(K1(j10));
        return l.u0(lVar, sVarV0.W0(), sVarV0.P0(), null, new a(sVarV0), 4, null);
    }

    @Override // K0.E
    public int minIntrinsicHeight(InterfaceC1687m interfaceC1687m, InterfaceC1686l interfaceC1686l, int i10) {
        if (!H1()) {
            return interfaceC1686l.Z(i10);
        }
        long jK1 = K1(AbstractC5010c.b(0, i10, 0, 0, 13, null));
        return Math.max(C5009b.m(jK1), interfaceC1686l.Z(i10));
    }

    @Override // K0.E
    public int minIntrinsicWidth(InterfaceC1687m interfaceC1687m, InterfaceC1686l interfaceC1686l, int i10) {
        if (!H1()) {
            return interfaceC1686l.l0(i10);
        }
        long jK1 = K1(AbstractC5010c.b(0, 0, 0, i10, 7, null));
        return Math.max(C5009b.n(jK1), interfaceC1686l.l0(i10));
    }

    public String toString() {
        return "PainterModifier(painter=" + this.painter + ", sizeToIntrinsics=" + this.sizeToIntrinsics + ", alignment=" + this.alignment + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }
}
