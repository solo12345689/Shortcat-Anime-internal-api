package com.google.android.material.chip;

import A1.AbstractC1002a;
import E9.c;
import E9.e;
import H9.h;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.drawable.d;
import com.google.android.material.internal.j;
import com.google.android.material.internal.m;
import com.google.android.material.internal.p;
import j.AbstractC5323a;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import o9.AbstractC5848k;
import p9.C5948c;
import t9.AbstractC6654a;
import x9.AbstractC7066a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class a extends h implements Drawable.Callback, j.b {

    /* JADX INFO: renamed from: s1 */
    private static final int[] f42250s1 = {R.attr.state_enabled};

    /* JADX INFO: renamed from: t1 */
    private static final ShapeDrawable f42251t1 = new ShapeDrawable(new OvalShape());

    /* JADX INFO: renamed from: A0 */
    private CharSequence f42252A0;

    /* JADX INFO: renamed from: B0 */
    private boolean f42253B0;

    /* JADX INFO: renamed from: C0 */
    private boolean f42254C0;

    /* JADX INFO: renamed from: D0 */
    private Drawable f42255D0;

    /* JADX INFO: renamed from: E0 */
    private ColorStateList f42256E0;

    /* JADX INFO: renamed from: F0 */
    private C5948c f42257F0;

    /* JADX INFO: renamed from: G0 */
    private C5948c f42258G0;

    /* JADX INFO: renamed from: H0 */
    private float f42259H0;

    /* JADX INFO: renamed from: I0 */
    private float f42260I0;

    /* JADX INFO: renamed from: J0 */
    private float f42261J0;

    /* JADX INFO: renamed from: K0 */
    private float f42262K0;

    /* JADX INFO: renamed from: L0 */
    private float f42263L0;

    /* JADX INFO: renamed from: M0 */
    private float f42264M0;

    /* JADX INFO: renamed from: N0 */
    private float f42265N0;

    /* JADX INFO: renamed from: O0 */
    private float f42266O0;

    /* JADX INFO: renamed from: P0 */
    private final Context f42267P0;

    /* JADX INFO: renamed from: Q0 */
    private final Paint f42268Q0;

    /* JADX INFO: renamed from: R0 */
    private final Paint f42269R0;

    /* JADX INFO: renamed from: S0 */
    private final Paint.FontMetrics f42270S0;

    /* JADX INFO: renamed from: T0 */
    private final RectF f42271T0;

    /* JADX INFO: renamed from: U0 */
    private final PointF f42272U0;

    /* JADX INFO: renamed from: V0 */
    private final Path f42273V0;

    /* JADX INFO: renamed from: W0 */
    private final j f42274W0;

    /* JADX INFO: renamed from: X */
    private ColorStateList f42275X;

    /* JADX INFO: renamed from: X0 */
    private int f42276X0;

    /* JADX INFO: renamed from: Y */
    private ColorStateList f42277Y;

    /* JADX INFO: renamed from: Y0 */
    private int f42278Y0;

    /* JADX INFO: renamed from: Z */
    private float f42279Z;

    /* JADX INFO: renamed from: Z0 */
    private int f42280Z0;

    /* JADX INFO: renamed from: a1 */
    private int f42281a1;

    /* JADX INFO: renamed from: b1 */
    private int f42282b1;

    /* JADX INFO: renamed from: c1 */
    private int f42283c1;

    /* JADX INFO: renamed from: d1 */
    private boolean f42284d1;

    /* JADX INFO: renamed from: e1 */
    private int f42285e1;

    /* JADX INFO: renamed from: f1 */
    private int f42286f1;

    /* JADX INFO: renamed from: g1 */
    private ColorFilter f42287g1;

    /* JADX INFO: renamed from: h1 */
    private PorterDuffColorFilter f42288h1;

    /* JADX INFO: renamed from: i1 */
    private ColorStateList f42289i1;

    /* JADX INFO: renamed from: j1 */
    private PorterDuff.Mode f42290j1;

    /* JADX INFO: renamed from: k1 */
    private int[] f42291k1;

    /* JADX INFO: renamed from: l0 */
    private float f42292l0;

    /* JADX INFO: renamed from: l1 */
    private boolean f42293l1;

    /* JADX INFO: renamed from: m0 */
    private ColorStateList f42294m0;

    /* JADX INFO: renamed from: m1 */
    private ColorStateList f42295m1;

    /* JADX INFO: renamed from: n0 */
    private float f42296n0;

    /* JADX INFO: renamed from: n1 */
    private WeakReference f42297n1;

    /* JADX INFO: renamed from: o0 */
    private ColorStateList f42298o0;

    /* JADX INFO: renamed from: o1 */
    private TextUtils.TruncateAt f42299o1;

    /* JADX INFO: renamed from: p0 */
    private CharSequence f42300p0;

    /* JADX INFO: renamed from: p1 */
    private boolean f42301p1;

    /* JADX INFO: renamed from: q0 */
    private boolean f42302q0;

    /* JADX INFO: renamed from: q1 */
    private int f42303q1;

    /* JADX INFO: renamed from: r0 */
    private Drawable f42304r0;

    /* JADX INFO: renamed from: r1 */
    private boolean f42305r1;

    /* JADX INFO: renamed from: s0 */
    private ColorStateList f42306s0;

    /* JADX INFO: renamed from: t0 */
    private float f42307t0;

    /* JADX INFO: renamed from: u0 */
    private boolean f42308u0;

    /* JADX INFO: renamed from: v0 */
    private boolean f42309v0;

    /* JADX INFO: renamed from: w0 */
    private Drawable f42310w0;

    /* JADX INFO: renamed from: x0 */
    private Drawable f42311x0;

    /* JADX INFO: renamed from: y0 */
    private ColorStateList f42312y0;

    /* JADX INFO: renamed from: z0 */
    private float f42313z0;

    /* JADX INFO: renamed from: com.google.android.material.chip.a$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface InterfaceC0640a {
        void a();
    }

    private a(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f42292l0 = -1.0f;
        this.f42268Q0 = new Paint(1);
        this.f42270S0 = new Paint.FontMetrics();
        this.f42271T0 = new RectF();
        this.f42272U0 = new PointF();
        this.f42273V0 = new Path();
        this.f42286f1 = 255;
        this.f42290j1 = PorterDuff.Mode.SRC_IN;
        this.f42297n1 = new WeakReference(null);
        R(context);
        this.f42267P0 = context;
        j jVar = new j(this);
        this.f42274W0 = jVar;
        this.f42300p0 = "";
        jVar.g().density = context.getResources().getDisplayMetrics().density;
        this.f42269R0 = null;
        int[] iArr = f42250s1;
        setState(iArr);
        v2(iArr);
        this.f42301p1 = true;
        f42251t1.setTint(-1);
    }

    private void A0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.f42300p0 != null) {
            float fV0 = this.f42259H0 + v0() + this.f42262K0;
            float fZ0 = this.f42266O0 + z0() + this.f42263L0;
            if (B1.a.f(this) == 0) {
                rectF.left = rect.left + fV0;
                rectF.right = rect.right - fZ0;
            } else {
                rectF.left = rect.left + fZ0;
                rectF.right = rect.right - fV0;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private static boolean A1(e eVar) {
        return (eVar == null || eVar.j() == null || !eVar.j().isStateful()) ? false : true;
    }

    private float B0() {
        this.f42274W0.g().getFontMetrics(this.f42270S0);
        Paint.FontMetrics fontMetrics = this.f42270S0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private static boolean B1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private static boolean C1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    private boolean D0() {
        return this.f42254C0 && this.f42255D0 != null && this.f42253B0;
    }

    private void D1(AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayI = m.i(this.f42267P0, attributeSet, AbstractC5848k.f55305y0, i10, i11, new int[0]);
        this.f42305r1 = typedArrayI.hasValue(AbstractC5848k.f55186j1);
        l2(c.a(this.f42267P0, typedArrayI, AbstractC5848k.f55075W0));
        P1(c.a(this.f42267P0, typedArrayI, AbstractC5848k.f54971J0));
        d2(typedArrayI.getDimension(AbstractC5848k.f55035R0, 0.0f));
        if (typedArrayI.hasValue(AbstractC5848k.f54979K0)) {
            R1(typedArrayI.getDimension(AbstractC5848k.f54979K0, 0.0f));
        }
        h2(c.a(this.f42267P0, typedArrayI, AbstractC5848k.f55059U0));
        j2(typedArrayI.getDimension(AbstractC5848k.f55067V0, 0.0f));
        I2(c.a(this.f42267P0, typedArrayI, AbstractC5848k.f55178i1));
        N2(typedArrayI.getText(AbstractC5848k.f54923D0));
        e eVarH = c.h(this.f42267P0, typedArrayI, AbstractC5848k.f55313z0);
        eVarH.o(typedArrayI.getDimension(AbstractC5848k.f54899A0, eVarH.k()));
        O2(eVarH);
        int i12 = typedArrayI.getInt(AbstractC5848k.f54907B0, 0);
        if (i12 == 1) {
            A2(TextUtils.TruncateAt.START);
        } else if (i12 == 2) {
            A2(TextUtils.TruncateAt.MIDDLE);
        } else if (i12 == 3) {
            A2(TextUtils.TruncateAt.END);
        }
        c2(typedArrayI.getBoolean(AbstractC5848k.f55027Q0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            c2(typedArrayI.getBoolean(AbstractC5848k.f55003N0, false));
        }
        V1(c.e(this.f42267P0, typedArrayI, AbstractC5848k.f54995M0));
        if (typedArrayI.hasValue(AbstractC5848k.f55019P0)) {
            Z1(c.a(this.f42267P0, typedArrayI, AbstractC5848k.f55019P0));
        }
        X1(typedArrayI.getDimension(AbstractC5848k.f55011O0, -1.0f));
        y2(typedArrayI.getBoolean(AbstractC5848k.f55135d1, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            y2(typedArrayI.getBoolean(AbstractC5848k.f55091Y0, false));
        }
        m2(c.e(this.f42267P0, typedArrayI, AbstractC5848k.f55083X0));
        w2(c.a(this.f42267P0, typedArrayI, AbstractC5848k.f55126c1));
        r2(typedArrayI.getDimension(AbstractC5848k.f55108a1, 0.0f));
        H1(typedArrayI.getBoolean(AbstractC5848k.f54931E0, false));
        O1(typedArrayI.getBoolean(AbstractC5848k.f54963I0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            O1(typedArrayI.getBoolean(AbstractC5848k.f54947G0, false));
        }
        J1(c.e(this.f42267P0, typedArrayI, AbstractC5848k.f54939F0));
        if (typedArrayI.hasValue(AbstractC5848k.f54955H0)) {
            L1(c.a(this.f42267P0, typedArrayI, AbstractC5848k.f54955H0));
        }
        L2(C5948c.b(this.f42267P0, typedArrayI, AbstractC5848k.f55194k1));
        B2(C5948c.b(this.f42267P0, typedArrayI, AbstractC5848k.f55153f1));
        f2(typedArrayI.getDimension(AbstractC5848k.f55051T0, 0.0f));
        F2(typedArrayI.getDimension(AbstractC5848k.f55170h1, 0.0f));
        D2(typedArrayI.getDimension(AbstractC5848k.f55162g1, 0.0f));
        T2(typedArrayI.getDimension(AbstractC5848k.f55210m1, 0.0f));
        Q2(typedArrayI.getDimension(AbstractC5848k.f55202l1, 0.0f));
        t2(typedArrayI.getDimension(AbstractC5848k.f55117b1, 0.0f));
        o2(typedArrayI.getDimension(AbstractC5848k.f55099Z0, 0.0f));
        T1(typedArrayI.getDimension(AbstractC5848k.f54987L0, 0.0f));
        H2(typedArrayI.getDimensionPixelSize(AbstractC5848k.f54915C0, Integer.MAX_VALUE));
        typedArrayI.recycle();
    }

    public static a E0(Context context, AttributeSet attributeSet, int i10, int i11) {
        a aVar = new a(context, attributeSet, i10, i11);
        aVar.D1(attributeSet, i10, i11);
        return aVar;
    }

    private void F0(Canvas canvas, Rect rect) {
        if (X2()) {
            u0(rect, this.f42271T0);
            RectF rectF = this.f42271T0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f42255D0.setBounds(0, 0, (int) this.f42271T0.width(), (int) this.f42271T0.height());
            this.f42255D0.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    private boolean F1(int[] iArr, int[] iArr2) {
        boolean z10;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.f42275X;
        int iQ = q(colorStateList != null ? colorStateList.getColorForState(iArr, this.f42276X0) : 0);
        boolean state = true;
        if (this.f42276X0 != iQ) {
            this.f42276X0 = iQ;
            zOnStateChange = true;
        }
        ColorStateList colorStateList2 = this.f42277Y;
        int iQ2 = q(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f42278Y0) : 0);
        if (this.f42278Y0 != iQ2) {
            this.f42278Y0 = iQ2;
            zOnStateChange = true;
        }
        int i10 = AbstractC7066a.i(iQ, iQ2);
        if ((this.f42280Z0 != i10) | (B() == null)) {
            this.f42280Z0 = i10;
            d0(ColorStateList.valueOf(i10));
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f42294m0;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f42281a1) : 0;
        if (this.f42281a1 != colorForState) {
            this.f42281a1 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.f42295m1 == null || !F9.a.e(iArr)) ? 0 : this.f42295m1.getColorForState(iArr, this.f42282b1);
        if (this.f42282b1 != colorForState2) {
            this.f42282b1 = colorForState2;
            if (this.f42293l1) {
                zOnStateChange = true;
            }
        }
        int colorForState3 = (this.f42274W0.e() == null || this.f42274W0.e().j() == null) ? 0 : this.f42274W0.e().j().getColorForState(iArr, this.f42283c1);
        if (this.f42283c1 != colorForState3) {
            this.f42283c1 = colorForState3;
            zOnStateChange = true;
        }
        boolean z11 = w1(getState(), R.attr.state_checked) && this.f42253B0;
        if (this.f42284d1 == z11 || this.f42255D0 == null) {
            z10 = false;
        } else {
            float fV0 = v0();
            this.f42284d1 = z11;
            if (fV0 != v0()) {
                zOnStateChange = true;
                z10 = true;
            } else {
                z10 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.f42289i1;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f42285e1) : 0;
        if (this.f42285e1 != colorForState4) {
            this.f42285e1 = colorForState4;
            this.f42288h1 = d.k(this, this.f42289i1, this.f42290j1);
        } else {
            state = zOnStateChange;
        }
        if (C1(this.f42304r0)) {
            state |= this.f42304r0.setState(iArr);
        }
        if (C1(this.f42255D0)) {
            state |= this.f42255D0.setState(iArr);
        }
        if (C1(this.f42310w0)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.f42310w0.setState(iArr3);
        }
        if (C1(this.f42311x0)) {
            state |= this.f42311x0.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z10) {
            E1();
        }
        return state;
    }

    private void G0(Canvas canvas, Rect rect) {
        if (this.f42305r1) {
            return;
        }
        this.f42268Q0.setColor(this.f42278Y0);
        this.f42268Q0.setStyle(Paint.Style.FILL);
        this.f42268Q0.setColorFilter(u1());
        this.f42271T0.set(rect);
        canvas.drawRoundRect(this.f42271T0, R0(), R0(), this.f42268Q0);
    }

    private void H0(Canvas canvas, Rect rect) {
        if (Y2()) {
            u0(rect, this.f42271T0);
            RectF rectF = this.f42271T0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f42304r0.setBounds(0, 0, (int) this.f42271T0.width(), (int) this.f42271T0.height());
            this.f42304r0.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    private void I0(Canvas canvas, Rect rect) {
        if (this.f42296n0 <= 0.0f || this.f42305r1) {
            return;
        }
        this.f42268Q0.setColor(this.f42281a1);
        this.f42268Q0.setStyle(Paint.Style.STROKE);
        if (!this.f42305r1) {
            this.f42268Q0.setColorFilter(u1());
        }
        RectF rectF = this.f42271T0;
        float f10 = rect.left;
        float f11 = this.f42296n0;
        rectF.set(f10 + (f11 / 2.0f), rect.top + (f11 / 2.0f), rect.right - (f11 / 2.0f), rect.bottom - (f11 / 2.0f));
        float f12 = this.f42292l0 - (this.f42296n0 / 2.0f);
        canvas.drawRoundRect(this.f42271T0, f12, f12, this.f42268Q0);
    }

    private void J0(Canvas canvas, Rect rect) {
        if (this.f42305r1) {
            return;
        }
        this.f42268Q0.setColor(this.f42276X0);
        this.f42268Q0.setStyle(Paint.Style.FILL);
        this.f42271T0.set(rect);
        canvas.drawRoundRect(this.f42271T0, R0(), R0(), this.f42268Q0);
    }

    private void K0(Canvas canvas, Rect rect) {
        if (Z2()) {
            x0(rect, this.f42271T0);
            RectF rectF = this.f42271T0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f42310w0.setBounds(0, 0, (int) this.f42271T0.width(), (int) this.f42271T0.height());
            this.f42311x0.setBounds(this.f42310w0.getBounds());
            this.f42311x0.jumpToCurrentState();
            this.f42311x0.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    private void L0(Canvas canvas, Rect rect) {
        this.f42268Q0.setColor(this.f42282b1);
        this.f42268Q0.setStyle(Paint.Style.FILL);
        this.f42271T0.set(rect);
        if (!this.f42305r1) {
            canvas.drawRoundRect(this.f42271T0, R0(), R0(), this.f42268Q0);
        } else {
            l(new RectF(rect), this.f42273V0);
            super.v(canvas, this.f42268Q0, this.f42273V0, x());
        }
    }

    private void M0(Canvas canvas, Rect rect) {
        Canvas canvas2;
        Paint paint = this.f42269R0;
        if (paint != null) {
            paint.setColor(AbstractC1002a.k(-16777216, 127));
            canvas.drawRect(rect, this.f42269R0);
            if (Y2() || X2()) {
                u0(rect, this.f42271T0);
                canvas.drawRect(this.f42271T0, this.f42269R0);
            }
            if (this.f42300p0 != null) {
                canvas2 = canvas;
                canvas2.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.f42269R0);
            } else {
                canvas2 = canvas;
            }
            if (Z2()) {
                x0(rect, this.f42271T0);
                canvas2.drawRect(this.f42271T0, this.f42269R0);
            }
            this.f42269R0.setColor(AbstractC1002a.k(-65536, 127));
            w0(rect, this.f42271T0);
            canvas2.drawRect(this.f42271T0, this.f42269R0);
            this.f42269R0.setColor(AbstractC1002a.k(-16711936, 127));
            y0(rect, this.f42271T0);
            canvas2.drawRect(this.f42271T0, this.f42269R0);
        }
    }

    private void N0(Canvas canvas, Rect rect) {
        if (this.f42300p0 != null) {
            Paint.Align alignC0 = C0(rect, this.f42272U0);
            A0(rect, this.f42271T0);
            if (this.f42274W0.e() != null) {
                this.f42274W0.g().drawableState = getState();
                this.f42274W0.n(this.f42267P0);
            }
            this.f42274W0.g().setTextAlign(alignC0);
            int iSave = 0;
            boolean z10 = Math.round(this.f42274W0.h(q1().toString())) > Math.round(this.f42271T0.width());
            if (z10) {
                iSave = canvas.save();
                canvas.clipRect(this.f42271T0);
            }
            CharSequence charSequenceEllipsize = this.f42300p0;
            if (z10 && this.f42299o1 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f42274W0.g(), this.f42271T0.width(), this.f42299o1);
            }
            CharSequence charSequence = charSequenceEllipsize;
            int length = charSequence.length();
            PointF pointF = this.f42272U0;
            canvas.drawText(charSequence, 0, length, pointF.x, pointF.y, this.f42274W0.g());
            if (z10) {
                canvas.restoreToCount(iSave);
            }
        }
    }

    private boolean X2() {
        return this.f42254C0 && this.f42255D0 != null && this.f42284d1;
    }

    private boolean Y2() {
        return this.f42302q0 && this.f42304r0 != null;
    }

    private boolean Z2() {
        return this.f42309v0 && this.f42310w0 != null;
    }

    private void a3(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    private void b3() {
        this.f42295m1 = this.f42293l1 ? F9.a.d(this.f42298o0) : null;
    }

    private void c3() {
        this.f42311x0 = new RippleDrawable(F9.a.d(o1()), this.f42310w0, f42251t1);
    }

    private float i1() {
        Drawable drawable = this.f42284d1 ? this.f42255D0 : this.f42304r0;
        float fCeil = this.f42307t0;
        if (fCeil <= 0.0f && drawable != null) {
            fCeil = (float) Math.ceil(p.c(this.f42267P0, 24));
            if (drawable.getIntrinsicHeight() <= fCeil) {
                return drawable.getIntrinsicHeight();
            }
        }
        return fCeil;
    }

    private float j1() {
        Drawable drawable = this.f42284d1 ? this.f42255D0 : this.f42304r0;
        float f10 = this.f42307t0;
        return (f10 > 0.0f || drawable == null) ? f10 : drawable.getIntrinsicWidth();
    }

    private void l2(ColorStateList colorStateList) {
        if (this.f42275X != colorStateList) {
            this.f42275X = colorStateList;
            onStateChange(getState());
        }
    }

    private void t0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        B1.a.m(drawable, B1.a.f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f42310w0) {
            if (drawable.isStateful()) {
                drawable.setState(f1());
            }
            drawable.setTintList(this.f42312y0);
            return;
        }
        Drawable drawable2 = this.f42304r0;
        if (drawable == drawable2 && this.f42308u0) {
            drawable2.setTintList(this.f42306s0);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    private void u0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (Y2() || X2()) {
            float f10 = this.f42259H0 + this.f42260I0;
            float fJ1 = j1();
            if (B1.a.f(this) == 0) {
                float f11 = rect.left + f10;
                rectF.left = f11;
                rectF.right = f11 + fJ1;
            } else {
                float f12 = rect.right - f10;
                rectF.right = f12;
                rectF.left = f12 - fJ1;
            }
            float fI1 = i1();
            float fExactCenterY = rect.exactCenterY() - (fI1 / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fI1;
        }
    }

    private ColorFilter u1() {
        ColorFilter colorFilter = this.f42287g1;
        return colorFilter != null ? colorFilter : this.f42288h1;
    }

    private void w0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (Z2()) {
            float f10 = this.f42266O0 + this.f42265N0 + this.f42313z0 + this.f42264M0 + this.f42263L0;
            if (B1.a.f(this) == 0) {
                rectF.right = rect.right - f10;
            } else {
                rectF.left = rect.left + f10;
            }
        }
    }

    private static boolean w1(int[] iArr, int i10) {
        if (iArr == null) {
            return false;
        }
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    private void x0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (Z2()) {
            float f10 = this.f42266O0 + this.f42265N0;
            if (B1.a.f(this) == 0) {
                float f11 = rect.right - f10;
                rectF.right = f11;
                rectF.left = f11 - this.f42313z0;
            } else {
                float f12 = rect.left + f10;
                rectF.left = f12;
                rectF.right = f12 + this.f42313z0;
            }
            float fExactCenterY = rect.exactCenterY();
            float f13 = this.f42313z0;
            float f14 = fExactCenterY - (f13 / 2.0f);
            rectF.top = f14;
            rectF.bottom = f14 + f13;
        }
    }

    private void y0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (Z2()) {
            float f10 = this.f42266O0 + this.f42265N0 + this.f42313z0 + this.f42264M0 + this.f42263L0;
            if (B1.a.f(this) == 0) {
                float f11 = rect.right;
                rectF.right = f11;
                rectF.left = f11 - f10;
            } else {
                int i10 = rect.left;
                rectF.left = i10;
                rectF.right = i10 + f10;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    public void A2(TextUtils.TruncateAt truncateAt) {
        this.f42299o1 = truncateAt;
    }

    public void B2(C5948c c5948c) {
        this.f42258G0 = c5948c;
    }

    Paint.Align C0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f42300p0 != null) {
            float fV0 = this.f42259H0 + v0() + this.f42262K0;
            if (B1.a.f(this) == 0) {
                pointF.x = rect.left + fV0;
            } else {
                pointF.x = rect.right - fV0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - B0();
        }
        return align;
    }

    public void C2(int i10) {
        B2(C5948c.c(this.f42267P0, i10));
    }

    public void D2(float f10) {
        if (this.f42261J0 != f10) {
            float fV0 = v0();
            this.f42261J0 = f10;
            float fV02 = v0();
            invalidateSelf();
            if (fV0 != fV02) {
                E1();
            }
        }
    }

    protected void E1() {
        InterfaceC0640a interfaceC0640a = (InterfaceC0640a) this.f42297n1.get();
        if (interfaceC0640a != null) {
            interfaceC0640a.a();
        }
    }

    public void E2(int i10) {
        D2(this.f42267P0.getResources().getDimension(i10));
    }

    public void F2(float f10) {
        if (this.f42260I0 != f10) {
            float fV0 = v0();
            this.f42260I0 = f10;
            float fV02 = v0();
            invalidateSelf();
            if (fV0 != fV02) {
                E1();
            }
        }
    }

    boolean G1(boolean z10) {
        if (this.f42310w0 != null) {
            return v2(z10 ? new int[]{R.attr.state_pressed, R.attr.state_enabled} : f42250s1);
        }
        return false;
    }

    public void G2(int i10) {
        F2(this.f42267P0.getResources().getDimension(i10));
    }

    public void H1(boolean z10) {
        if (this.f42253B0 != z10) {
            this.f42253B0 = z10;
            float fV0 = v0();
            if (!z10 && this.f42284d1) {
                this.f42284d1 = false;
            }
            float fV02 = v0();
            invalidateSelf();
            if (fV0 != fV02) {
                E1();
            }
        }
    }

    public void H2(int i10) {
        this.f42303q1 = i10;
    }

    public void I1(int i10) {
        H1(this.f42267P0.getResources().getBoolean(i10));
    }

    public void I2(ColorStateList colorStateList) {
        if (this.f42298o0 != colorStateList) {
            this.f42298o0 = colorStateList;
            b3();
            onStateChange(getState());
        }
    }

    public void J1(Drawable drawable) {
        if (this.f42255D0 != drawable) {
            float fV0 = v0();
            this.f42255D0 = drawable;
            float fV02 = v0();
            a3(this.f42255D0);
            t0(this.f42255D0);
            invalidateSelf();
            if (fV0 != fV02) {
                E1();
            }
        }
    }

    public void J2(int i10) {
        I2(AbstractC5323a.a(this.f42267P0, i10));
    }

    public void K1(int i10) {
        J1(AbstractC5323a.b(this.f42267P0, i10));
    }

    void K2(boolean z10) {
        this.f42301p1 = z10;
    }

    public void L1(ColorStateList colorStateList) {
        if (this.f42256E0 != colorStateList) {
            this.f42256E0 = colorStateList;
            if (D0()) {
                this.f42255D0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void L2(C5948c c5948c) {
        this.f42257F0 = c5948c;
    }

    public void M1(int i10) {
        L1(AbstractC5323a.a(this.f42267P0, i10));
    }

    public void M2(int i10) {
        L2(C5948c.c(this.f42267P0, i10));
    }

    public void N1(int i10) {
        O1(this.f42267P0.getResources().getBoolean(i10));
    }

    public void N2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.f42300p0, charSequence)) {
            return;
        }
        this.f42300p0 = charSequence;
        this.f42274W0.m(true);
        invalidateSelf();
        E1();
    }

    public Drawable O0() {
        return this.f42255D0;
    }

    public void O1(boolean z10) {
        if (this.f42254C0 != z10) {
            boolean zX2 = X2();
            this.f42254C0 = z10;
            boolean zX22 = X2();
            if (zX2 != zX22) {
                if (zX22) {
                    t0(this.f42255D0);
                } else {
                    a3(this.f42255D0);
                }
                invalidateSelf();
                E1();
            }
        }
    }

    public void O2(e eVar) {
        this.f42274W0.k(eVar, this.f42267P0);
    }

    public ColorStateList P0() {
        return this.f42256E0;
    }

    public void P1(ColorStateList colorStateList) {
        if (this.f42277Y != colorStateList) {
            this.f42277Y = colorStateList;
            onStateChange(getState());
        }
    }

    public void P2(int i10) {
        O2(new e(this.f42267P0, i10));
    }

    public ColorStateList Q0() {
        return this.f42277Y;
    }

    public void Q1(int i10) {
        P1(AbstractC5323a.a(this.f42267P0, i10));
    }

    public void Q2(float f10) {
        if (this.f42263L0 != f10) {
            this.f42263L0 = f10;
            invalidateSelf();
            E1();
        }
    }

    public float R0() {
        return this.f42305r1 ? K() : this.f42292l0;
    }

    public void R1(float f10) {
        if (this.f42292l0 != f10) {
            this.f42292l0 = f10;
            setShapeAppearanceModel(H().x(f10));
        }
    }

    public void R2(int i10) {
        Q2(this.f42267P0.getResources().getDimension(i10));
    }

    public float S0() {
        return this.f42266O0;
    }

    public void S1(int i10) {
        R1(this.f42267P0.getResources().getDimension(i10));
    }

    public void S2(float f10) {
        e eVarR1 = r1();
        if (eVarR1 != null) {
            eVarR1.o(f10);
            this.f42274W0.g().setTextSize(f10);
            a();
        }
    }

    public Drawable T0() {
        Drawable drawable = this.f42304r0;
        if (drawable != null) {
            return B1.a.q(drawable);
        }
        return null;
    }

    public void T1(float f10) {
        if (this.f42266O0 != f10) {
            this.f42266O0 = f10;
            invalidateSelf();
            E1();
        }
    }

    public void T2(float f10) {
        if (this.f42262K0 != f10) {
            this.f42262K0 = f10;
            invalidateSelf();
            E1();
        }
    }

    public float U0() {
        return this.f42307t0;
    }

    public void U1(int i10) {
        T1(this.f42267P0.getResources().getDimension(i10));
    }

    public void U2(int i10) {
        T2(this.f42267P0.getResources().getDimension(i10));
    }

    public ColorStateList V0() {
        return this.f42306s0;
    }

    public void V1(Drawable drawable) {
        Drawable drawableT0 = T0();
        if (drawableT0 != drawable) {
            float fV0 = v0();
            this.f42304r0 = drawable != null ? B1.a.r(drawable).mutate() : null;
            float fV02 = v0();
            a3(drawableT0);
            if (Y2()) {
                t0(this.f42304r0);
            }
            invalidateSelf();
            if (fV0 != fV02) {
                E1();
            }
        }
    }

    public void V2(boolean z10) {
        if (this.f42293l1 != z10) {
            this.f42293l1 = z10;
            b3();
            onStateChange(getState());
        }
    }

    public float W0() {
        return this.f42279Z;
    }

    public void W1(int i10) {
        V1(AbstractC5323a.b(this.f42267P0, i10));
    }

    boolean W2() {
        return this.f42301p1;
    }

    public float X0() {
        return this.f42259H0;
    }

    public void X1(float f10) {
        if (this.f42307t0 != f10) {
            float fV0 = v0();
            this.f42307t0 = f10;
            float fV02 = v0();
            invalidateSelf();
            if (fV0 != fV02) {
                E1();
            }
        }
    }

    public ColorStateList Y0() {
        return this.f42294m0;
    }

    public void Y1(int i10) {
        X1(this.f42267P0.getResources().getDimension(i10));
    }

    public float Z0() {
        return this.f42296n0;
    }

    public void Z1(ColorStateList colorStateList) {
        this.f42308u0 = true;
        if (this.f42306s0 != colorStateList) {
            this.f42306s0 = colorStateList;
            if (Y2()) {
                this.f42304r0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    @Override // com.google.android.material.internal.j.b
    public void a() {
        E1();
        invalidateSelf();
    }

    public Drawable a1() {
        Drawable drawable = this.f42310w0;
        if (drawable != null) {
            return B1.a.q(drawable);
        }
        return null;
    }

    public void a2(int i10) {
        Z1(AbstractC5323a.a(this.f42267P0, i10));
    }

    public CharSequence b1() {
        return this.f42252A0;
    }

    public void b2(int i10) {
        c2(this.f42267P0.getResources().getBoolean(i10));
    }

    public float c1() {
        return this.f42265N0;
    }

    public void c2(boolean z10) {
        if (this.f42302q0 != z10) {
            boolean zY2 = Y2();
            this.f42302q0 = z10;
            boolean zY22 = Y2();
            if (zY2 != zY22) {
                if (zY22) {
                    t0(this.f42304r0);
                } else {
                    a3(this.f42304r0);
                }
                invalidateSelf();
                E1();
            }
        }
    }

    public float d1() {
        return this.f42313z0;
    }

    public void d2(float f10) {
        if (this.f42279Z != f10) {
            this.f42279Z = f10;
            invalidateSelf();
            E1();
        }
    }

    @Override // H9.h, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Canvas canvas2;
        int iA;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i10 = this.f42286f1;
        if (i10 < 255) {
            canvas2 = canvas;
            iA = AbstractC6654a.a(canvas2, bounds.left, bounds.top, bounds.right, bounds.bottom, i10);
        } else {
            canvas2 = canvas;
            iA = 0;
        }
        J0(canvas2, bounds);
        G0(canvas2, bounds);
        if (this.f42305r1) {
            super.draw(canvas2);
        }
        I0(canvas2, bounds);
        L0(canvas2, bounds);
        H0(canvas2, bounds);
        F0(canvas2, bounds);
        if (this.f42301p1) {
            N0(canvas2, bounds);
        }
        K0(canvas2, bounds);
        M0(canvas2, bounds);
        if (this.f42286f1 < 255) {
            canvas2.restoreToCount(iA);
        }
    }

    public float e1() {
        return this.f42264M0;
    }

    public void e2(int i10) {
        d2(this.f42267P0.getResources().getDimension(i10));
    }

    public int[] f1() {
        return this.f42291k1;
    }

    public void f2(float f10) {
        if (this.f42259H0 != f10) {
            this.f42259H0 = f10;
            invalidateSelf();
            E1();
        }
    }

    public ColorStateList g1() {
        return this.f42312y0;
    }

    public void g2(int i10) {
        f2(this.f42267P0.getResources().getDimension(i10));
    }

    @Override // H9.h, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f42286f1;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f42287g1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.f42279Z;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f42259H0 + v0() + this.f42262K0 + this.f42274W0.h(q1().toString()) + this.f42263L0 + z0() + this.f42266O0), this.f42303q1);
    }

    @Override // H9.h, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // H9.h, android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Outline outline2;
        if (this.f42305r1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f42292l0);
        } else {
            outline.setRoundRect(bounds, this.f42292l0);
            outline2 = outline;
        }
        outline2.setAlpha(getAlpha() / 255.0f);
    }

    public void h1(RectF rectF) {
        y0(getBounds(), rectF);
    }

    public void h2(ColorStateList colorStateList) {
        if (this.f42294m0 != colorStateList) {
            this.f42294m0 = colorStateList;
            if (this.f42305r1) {
                l0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void i2(int i10) {
        h2(AbstractC5323a.a(this.f42267P0, i10));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // H9.h, android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (B1(this.f42275X) || B1(this.f42277Y) || B1(this.f42294m0)) {
            return true;
        }
        return (this.f42293l1 && B1(this.f42295m1)) || A1(this.f42274W0.e()) || D0() || C1(this.f42304r0) || C1(this.f42255D0) || B1(this.f42289i1);
    }

    public void j2(float f10) {
        if (this.f42296n0 != f10) {
            this.f42296n0 = f10;
            this.f42268Q0.setStrokeWidth(f10);
            if (this.f42305r1) {
                super.m0(f10);
            }
            invalidateSelf();
        }
    }

    public TextUtils.TruncateAt k1() {
        return this.f42299o1;
    }

    public void k2(int i10) {
        j2(this.f42267P0.getResources().getDimension(i10));
    }

    public C5948c l1() {
        return this.f42258G0;
    }

    public float m1() {
        return this.f42261J0;
    }

    public void m2(Drawable drawable) {
        Drawable drawableA1 = a1();
        if (drawableA1 != drawable) {
            float fZ0 = z0();
            this.f42310w0 = drawable != null ? B1.a.r(drawable).mutate() : null;
            c3();
            float fZ02 = z0();
            a3(drawableA1);
            if (Z2()) {
                t0(this.f42310w0);
            }
            invalidateSelf();
            if (fZ0 != fZ02) {
                E1();
            }
        }
    }

    public float n1() {
        return this.f42260I0;
    }

    public void n2(CharSequence charSequence) {
        if (this.f42252A0 != charSequence) {
            this.f42252A0 = J1.a.c().h(charSequence);
            invalidateSelf();
        }
    }

    public ColorStateList o1() {
        return this.f42298o0;
    }

    public void o2(float f10) {
        if (this.f42265N0 != f10) {
            this.f42265N0 = f10;
            invalidateSelf();
            if (Z2()) {
                E1();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (Y2()) {
            zOnLayoutDirectionChanged |= B1.a.m(this.f42304r0, i10);
        }
        if (X2()) {
            zOnLayoutDirectionChanged |= B1.a.m(this.f42255D0, i10);
        }
        if (Z2()) {
            zOnLayoutDirectionChanged |= B1.a.m(this.f42310w0, i10);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        boolean zOnLevelChange = super.onLevelChange(i10);
        if (Y2()) {
            zOnLevelChange |= this.f42304r0.setLevel(i10);
        }
        if (X2()) {
            zOnLevelChange |= this.f42255D0.setLevel(i10);
        }
        if (Z2()) {
            zOnLevelChange |= this.f42310w0.setLevel(i10);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // H9.h, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.f42305r1) {
            super.onStateChange(iArr);
        }
        return F1(iArr, f1());
    }

    public C5948c p1() {
        return this.f42257F0;
    }

    public void p2(int i10) {
        o2(this.f42267P0.getResources().getDimension(i10));
    }

    public CharSequence q1() {
        return this.f42300p0;
    }

    public void q2(int i10) {
        m2(AbstractC5323a.b(this.f42267P0, i10));
    }

    public e r1() {
        return this.f42274W0.e();
    }

    public void r2(float f10) {
        if (this.f42313z0 != f10) {
            this.f42313z0 = f10;
            invalidateSelf();
            if (Z2()) {
                E1();
            }
        }
    }

    public float s1() {
        return this.f42263L0;
    }

    public void s2(int i10) {
        r2(this.f42267P0.getResources().getDimension(i10));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    @Override // H9.h, android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f42286f1 != i10) {
            this.f42286f1 = i10;
            invalidateSelf();
        }
    }

    @Override // H9.h, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f42287g1 != colorFilter) {
            this.f42287g1 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // H9.h, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.f42289i1 != colorStateList) {
            this.f42289i1 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // H9.h, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f42290j1 != mode) {
            this.f42290j1 = mode;
            this.f42288h1 = d.k(this, this.f42289i1, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (Y2()) {
            visible |= this.f42304r0.setVisible(z10, z11);
        }
        if (X2()) {
            visible |= this.f42255D0.setVisible(z10, z11);
        }
        if (Z2()) {
            visible |= this.f42310w0.setVisible(z10, z11);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public float t1() {
        return this.f42262K0;
    }

    public void t2(float f10) {
        if (this.f42264M0 != f10) {
            this.f42264M0 = f10;
            invalidateSelf();
            if (Z2()) {
                E1();
            }
        }
    }

    public void u2(int i10) {
        t2(this.f42267P0.getResources().getDimension(i10));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    float v0() {
        if (Y2() || X2()) {
            return this.f42260I0 + j1() + this.f42261J0;
        }
        return 0.0f;
    }

    public boolean v1() {
        return this.f42293l1;
    }

    public boolean v2(int[] iArr) {
        if (Arrays.equals(this.f42291k1, iArr)) {
            return false;
        }
        this.f42291k1 = iArr;
        if (Z2()) {
            return F1(getState(), iArr);
        }
        return false;
    }

    public void w2(ColorStateList colorStateList) {
        if (this.f42312y0 != colorStateList) {
            this.f42312y0 = colorStateList;
            if (Z2()) {
                this.f42310w0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public boolean x1() {
        return this.f42253B0;
    }

    public void x2(int i10) {
        w2(AbstractC5323a.a(this.f42267P0, i10));
    }

    public boolean y1() {
        return C1(this.f42310w0);
    }

    public void y2(boolean z10) {
        if (this.f42309v0 != z10) {
            boolean zZ2 = Z2();
            this.f42309v0 = z10;
            boolean zZ22 = Z2();
            if (zZ2 != zZ22) {
                if (zZ22) {
                    t0(this.f42310w0);
                } else {
                    a3(this.f42310w0);
                }
                invalidateSelf();
                E1();
            }
        }
    }

    float z0() {
        if (Z2()) {
            return this.f42264M0 + this.f42313z0 + this.f42265N0;
        }
        return 0.0f;
    }

    public boolean z1() {
        return this.f42309v0;
    }

    public void z2(InterfaceC0640a interfaceC0640a) {
        this.f42297n1 = new WeakReference(interfaceC0640a);
    }
}
