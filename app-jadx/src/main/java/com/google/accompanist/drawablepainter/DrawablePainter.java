package com.google.accompanist.drawablepainter;

import Td.AbstractC2163n;
import Td.r;
import Y.C0;
import Y.InterfaceC2453v1;
import Y.b2;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.compose.ui.graphics.d;
import i1.EnumC5027t;
import ie.InterfaceC5082a;
import ke.AbstractC5466a;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import n8.AbstractC5755a;
import oe.AbstractC5874j;
import r0.C6230l;
import s0.E;
import s0.F;
import s0.InterfaceC6364j0;
import u0.InterfaceC6711f;
import w0.AbstractC6923b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001a\u001a\u00020\u0007*\u00020\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR+\u0010(\u001a\u00020 2\u0006\u0010!\u001a\u00020 8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R4\u0010/\u001a\u00020)2\u0006\u0010!\u001a\u00020)8B@BX\u0082\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b*\u0010#\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001b\u00105\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001d\u00107\u001a\u00020)8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b6\u0010,\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00068"}, d2 = {"Lcom/google/accompanist/drawablepainter/DrawablePainter;", "Lw0/b;", "LY/v1;", "Landroid/graphics/drawable/Drawable;", "drawable", "<init>", "(Landroid/graphics/drawable/Drawable;)V", "LTd/L;", "c", "()V", "d", "e", "", "alpha", "", "a", "(F)Z", "Landroidx/compose/ui/graphics/d;", "colorFilter", "b", "(Landroidx/compose/ui/graphics/d;)Z", "Li1/t;", "layoutDirection", "f", "(Li1/t;)Z", "Lu0/f;", "m", "(Lu0/f;)V", "g", "Landroid/graphics/drawable/Drawable;", "s", "()Landroid/graphics/drawable/Drawable;", "", "<set-?>", "h", "LY/C0;", "r", "()I", "u", "(I)V", "drawInvalidateTick", "Lr0/l;", "i", "t", "()J", "v", "(J)V", "drawableIntrinsicSize", "Landroid/graphics/drawable/Drawable$Callback;", "j", "Lkotlin/Lazy;", "q", "()Landroid/graphics/drawable/Drawable$Callback;", "callback", "k", "intrinsicSize", "drawablepainter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DrawablePainter extends AbstractC6923b implements InterfaceC2453v1 {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Drawable drawable;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C0 drawInvalidateTick;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C0 drawableIntrinsicSize;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final Lazy callback;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f38801a;

        static {
            int[] iArr = new int[EnumC5027t.values().length];
            try {
                iArr[EnumC5027t.f48573a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC5027t.f48574b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f38801a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a implements Drawable.Callback {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ DrawablePainter f38803a;

            a(DrawablePainter drawablePainter) {
                this.f38803a = drawablePainter;
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void invalidateDrawable(Drawable d10) {
                AbstractC5504s.h(d10, "d");
                DrawablePainter drawablePainter = this.f38803a;
                drawablePainter.u(drawablePainter.r() + 1);
                DrawablePainter drawablePainter2 = this.f38803a;
                drawablePainter2.v(AbstractC5755a.c(drawablePainter2.getDrawable()));
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void scheduleDrawable(Drawable d10, Runnable what, long j10) {
                AbstractC5504s.h(d10, "d");
                AbstractC5504s.h(what, "what");
                AbstractC5755a.d().postAtTime(what, j10);
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void unscheduleDrawable(Drawable d10, Runnable what) {
                AbstractC5504s.h(d10, "d");
                AbstractC5504s.h(what, "what");
                AbstractC5755a.d().removeCallbacks(what);
            }
        }

        b() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a */
        public final a invoke() {
            return new a(DrawablePainter.this);
        }
    }

    public DrawablePainter(Drawable drawable) {
        AbstractC5504s.h(drawable, "drawable");
        this.drawable = drawable;
        this.drawInvalidateTick = b2.e(0, null, 2, null);
        this.drawableIntrinsicSize = b2.e(C6230l.c(AbstractC5755a.c(drawable)), null, 2, null);
        this.callback = AbstractC2163n.b(new b());
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    private final Drawable.Callback q() {
        return (Drawable.Callback) this.callback.getValue();
    }

    public final int r() {
        return ((Number) this.drawInvalidateTick.getValue()).intValue();
    }

    private final long t() {
        return ((C6230l) this.drawableIntrinsicSize.getValue()).m();
    }

    public final void u(int i10) {
        this.drawInvalidateTick.setValue(Integer.valueOf(i10));
    }

    public final void v(long j10) {
        this.drawableIntrinsicSize.setValue(C6230l.c(j10));
    }

    @Override // w0.AbstractC6923b
    protected boolean a(float alpha) {
        this.drawable.setAlpha(AbstractC5874j.m(AbstractC5466a.d(alpha * 255), 0, 255));
        return true;
    }

    @Override // w0.AbstractC6923b
    protected boolean b(d colorFilter) {
        this.drawable.setColorFilter(colorFilter != null ? F.b(colorFilter) : null);
        return true;
    }

    @Override // Y.InterfaceC2453v1
    public void c() {
        this.drawable.setCallback(q());
        this.drawable.setVisible(true, true);
        Object obj = this.drawable;
        if (obj instanceof Animatable) {
            ((Animatable) obj).start();
        }
    }

    @Override // Y.InterfaceC2453v1
    public void d() {
        e();
    }

    @Override // Y.InterfaceC2453v1
    public void e() {
        Object obj = this.drawable;
        if (obj instanceof Animatable) {
            ((Animatable) obj).stop();
        }
        this.drawable.setVisible(false, false);
        this.drawable.setCallback(null);
    }

    @Override // w0.AbstractC6923b
    protected boolean f(EnumC5027t layoutDirection) {
        AbstractC5504s.h(layoutDirection, "layoutDirection");
        Drawable drawable = this.drawable;
        int i10 = a.f38801a[layoutDirection.ordinal()];
        int i11 = 1;
        if (i10 == 1) {
            i11 = 0;
        } else if (i10 != 2) {
            throw new r();
        }
        return drawable.setLayoutDirection(i11);
    }

    @Override // w0.AbstractC6923b
    public long k() {
        return t();
    }

    @Override // w0.AbstractC6923b
    protected void m(InterfaceC6711f interfaceC6711f) {
        AbstractC5504s.h(interfaceC6711f, "<this>");
        InterfaceC6364j0 interfaceC6364j0B = interfaceC6711f.n1().b();
        r();
        this.drawable.setBounds(0, 0, AbstractC5466a.d(C6230l.i(interfaceC6711f.f())), AbstractC5466a.d(C6230l.g(interfaceC6711f.f())));
        try {
            interfaceC6364j0B.p();
            this.drawable.draw(E.d(interfaceC6364j0B));
        } finally {
            interfaceC6364j0B.k();
        }
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final Drawable getDrawable() {
        return this.drawable;
    }
}
