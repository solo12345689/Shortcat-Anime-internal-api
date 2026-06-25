package coil.compose;

import I0.InterfaceC1680f;
import I0.O;
import Y.C0;
import Y.b2;
import android.os.SystemClock;
import androidx.compose.ui.graphics.d;
import kotlin.Metadata;
import oe.AbstractC5874j;
import r0.AbstractC6231m;
import r0.C6230l;
import u0.InterfaceC6711f;
import u0.InterfaceC6713h;
import w0.AbstractC6923b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\t\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\rH\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0015\u001a\u00020\u0014*\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\rH\u0002ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u0014*\u00020\u0010H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0014¢\u0006\u0004\b!\u0010\"R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010+R+\u00103\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0016\u00106\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u00105R\u0016\u00107\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010+R+\u0010<\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u00128B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010.\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R/\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010-\u001a\u0004\u0018\u00010\u001f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b=\u0010.\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001d\u0010A\u001a\u00020\r8VX\u0096\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b*\u0010\u000f\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006B"}, d2 = {"Lcoil/compose/CrossfadePainter;", "Lw0/b;", "start", "end", "LI0/f;", "contentScale", "", "durationMillis", "", "fadeStart", "preferExactIntrinsicSize", "<init>", "(Lw0/b;Lw0/b;LI0/f;IZZ)V", "Lr0/l;", "o", "()J", "Lu0/f;", "painter", "", "alpha", "LTd/L;", "p", "(Lu0/f;Lw0/b;F)V", "srcSize", "dstSize", "n", "(JJ)J", "m", "(Lu0/f;)V", "a", "(F)Z", "Landroidx/compose/ui/graphics/d;", "colorFilter", "b", "(Landroidx/compose/ui/graphics/d;)Z", "g", "Lw0/b;", "h", "i", "LI0/f;", "j", "I", "k", "Z", "l", "<set-?>", "LY/C0;", "r", "()I", "u", "(I)V", "invalidateTick", "", "J", "startTimeMillis", "isDone", "s", "()F", "v", "(F)V", "maxAlpha", "q", "()Landroidx/compose/ui/graphics/d;", "t", "(Landroidx/compose/ui/graphics/d;)V", "intrinsicSize", "coil-compose-base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CrossfadePainter extends AbstractC6923b {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private AbstractC6923b start;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final AbstractC6923b end;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final InterfaceC1680f contentScale;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final int durationMillis;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final boolean fadeStart;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final boolean preferExactIntrinsicSize;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private boolean isDone;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final C0 invalidateTick = b2.e(0, null, 2, null);

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private long startTimeMillis = -1;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final C0 maxAlpha = b2.e(Float.valueOf(1.0f), null, 2, null);

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final C0 colorFilter = b2.e(null, null, 2, null);

    public CrossfadePainter(AbstractC6923b abstractC6923b, AbstractC6923b abstractC6923b2, InterfaceC1680f interfaceC1680f, int i10, boolean z10, boolean z11) {
        this.start = abstractC6923b;
        this.end = abstractC6923b2;
        this.contentScale = interfaceC1680f;
        this.durationMillis = i10;
        this.fadeStart = z10;
        this.preferExactIntrinsicSize = z11;
    }

    private final long n(long srcSize, long dstSize) {
        C6230l.a aVar = C6230l.f58350b;
        return (srcSize == aVar.a() || C6230l.k(srcSize) || dstSize == aVar.a() || C6230l.k(dstSize)) ? dstSize : O.a(srcSize, this.contentScale.a(srcSize, dstSize));
    }

    private final long o() {
        AbstractC6923b abstractC6923b = this.start;
        long jK = abstractC6923b != null ? abstractC6923b.k() : C6230l.f58350b.b();
        AbstractC6923b abstractC6923b2 = this.end;
        long jK2 = abstractC6923b2 != null ? abstractC6923b2.k() : C6230l.f58350b.b();
        C6230l.a aVar = C6230l.f58350b;
        boolean z10 = jK != aVar.a();
        boolean z11 = jK2 != aVar.a();
        if (z10 && z11) {
            return AbstractC6231m.a(Math.max(C6230l.i(jK), C6230l.i(jK2)), Math.max(C6230l.g(jK), C6230l.g(jK2)));
        }
        if (this.preferExactIntrinsicSize) {
            if (z10) {
                return jK;
            }
            if (z11) {
                return jK2;
            }
        }
        return aVar.a();
    }

    private final void p(InterfaceC6711f interfaceC6711f, AbstractC6923b abstractC6923b, float f10) {
        if (abstractC6923b == null || f10 <= 0.0f) {
            return;
        }
        long jF = interfaceC6711f.f();
        long jN = n(abstractC6923b.k(), jF);
        if (jF == C6230l.f58350b.a() || C6230l.k(jF)) {
            abstractC6923b.j(interfaceC6711f, jN, f10, q());
            return;
        }
        float f11 = 2;
        float fI = (C6230l.i(jF) - C6230l.i(jN)) / f11;
        float fG = (C6230l.g(jF) - C6230l.g(jN)) / f11;
        interfaceC6711f.n1().a().i(fI, fG, fI, fG);
        abstractC6923b.j(interfaceC6711f, jN, f10, q());
        InterfaceC6713h interfaceC6713hA = interfaceC6711f.n1().a();
        float f12 = -fI;
        float f13 = -fG;
        interfaceC6713hA.i(f12, f13, f12, f13);
    }

    private final d q() {
        return (d) this.colorFilter.getValue();
    }

    private final int r() {
        return ((Number) this.invalidateTick.getValue()).intValue();
    }

    private final float s() {
        return ((Number) this.maxAlpha.getValue()).floatValue();
    }

    private final void t(d dVar) {
        this.colorFilter.setValue(dVar);
    }

    private final void u(int i10) {
        this.invalidateTick.setValue(Integer.valueOf(i10));
    }

    private final void v(float f10) {
        this.maxAlpha.setValue(Float.valueOf(f10));
    }

    @Override // w0.AbstractC6923b
    protected boolean a(float alpha) {
        v(alpha);
        return true;
    }

    @Override // w0.AbstractC6923b
    protected boolean b(d colorFilter) {
        t(colorFilter);
        return true;
    }

    @Override // w0.AbstractC6923b
    public long k() {
        return o();
    }

    @Override // w0.AbstractC6923b
    protected void m(InterfaceC6711f interfaceC6711f) {
        if (this.isDone) {
            p(interfaceC6711f, this.end, s());
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.startTimeMillis == -1) {
            this.startTimeMillis = jUptimeMillis;
        }
        float f10 = (jUptimeMillis - this.startTimeMillis) / this.durationMillis;
        float fL = AbstractC5874j.l(f10, 0.0f, 1.0f) * s();
        float fS = this.fadeStart ? s() - fL : s();
        this.isDone = f10 >= 1.0f;
        p(interfaceC6711f, this.start, fS);
        p(interfaceC6711f, this.end, fL);
        if (this.isDone) {
            this.start = null;
        } else {
            u(r() + 1);
        }
    }
}
