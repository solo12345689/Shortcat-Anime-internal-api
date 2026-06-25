package com.facebook.react.views.text;

import H7.v;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.appcompat.widget.D;
import androidx.appcompat.widget.e0;
import androidx.core.view.AbstractC2747a0;
import androidx.core.view.C2746a;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.B;
import com.facebook.react.uimanager.C3281a;
import com.facebook.react.uimanager.C3303t;
import com.facebook.react.uimanager.EnumC3304u;
import com.facebook.react.uimanager.H;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class m extends D implements H {

    /* JADX INFO: renamed from: t */
    private static final ViewGroup.LayoutParams f38287t = new ViewGroup.LayoutParams(0, 0);

    /* JADX INFO: renamed from: h */
    private boolean f38288h;

    /* JADX INFO: renamed from: i */
    private int f38289i;

    /* JADX INFO: renamed from: j */
    private TextUtils.TruncateAt f38290j;

    /* JADX INFO: renamed from: k */
    private boolean f38291k;

    /* JADX INFO: renamed from: l */
    private float f38292l;

    /* JADX INFO: renamed from: m */
    private float f38293m;

    /* JADX INFO: renamed from: n */
    private float f38294n;

    /* JADX INFO: renamed from: o */
    private int f38295o;

    /* JADX INFO: renamed from: p */
    private boolean f38296p;

    /* JADX INFO: renamed from: q */
    private boolean f38297q;

    /* JADX INFO: renamed from: r */
    private v f38298r;

    /* JADX INFO: renamed from: s */
    private Spannable f38299s;

    public m(Context context) {
        super(context);
        this.f38298r = v.f8136b;
        t();
    }

    private ReactContext getReactContext() {
        Context context = getContext();
        return context instanceof e0 ? (ReactContext) ((e0) context).getBaseContext() : (ReactContext) context;
    }

    private void s() {
        if (!Float.isNaN(this.f38292l)) {
            setTextSize(0, this.f38292l);
        }
        if (Float.isNaN(this.f38294n)) {
            return;
        }
        super.setLetterSpacing(this.f38294n);
    }

    private void t() {
        this.f38289i = Integer.MAX_VALUE;
        this.f38291k = false;
        this.f38295o = 0;
        this.f38296p = false;
        this.f38297q = false;
        this.f38290j = TextUtils.TruncateAt.END;
        this.f38292l = Float.NaN;
        this.f38293m = Float.NaN;
        this.f38294n = 0.0f;
        this.f38298r = v.f8136b;
        this.f38299s = null;
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (AbstractC2747a0.M(this)) {
            C2746a c2746aK = AbstractC2747a0.k(this);
            if (c2746aK instanceof R1.a) {
                return ((R1.a) c2746aK).v(motionEvent) || super.dispatchHoverEvent(motionEvent);
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C2746a c2746aK = AbstractC2747a0.k(this);
        return (c2746aK != null && getMovementMethod() == null && (c2746aK instanceof n) && ((n) c2746aK).w(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    int getGravityHorizontal() {
        return getGravity() & 8388615;
    }

    public Spannable getSpanned() {
        return this.f38299s;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        if (this.f38288h && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (P7.r rVar : (P7.r[]) spanned.getSpans(0, spanned.length(), P7.r.class)) {
                if (rVar.a() == drawable) {
                    invalidate();
                }
            }
        }
        super.invalidateDrawable(drawable);
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f38296p) {
            setTextIsSelectable(false);
            setTextIsSelectable(true);
        } else {
            setTextIsSelectable(false);
        }
        if (this.f38288h && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (P7.r rVar : (P7.r[]) spanned.getSpans(0, spanned.length(), P7.r.class)) {
                rVar.c();
            }
        }
    }

    @Override // androidx.appcompat.widget.D, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f38288h && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (P7.r rVar : (P7.r[]) spanned.getSpans(0, spanned.length(), P7.r.class)) {
                rVar.d();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        g7.c cVar = new g7.c("ReactTextView.onDraw");
        try {
            Spannable spanned = getSpanned();
            if (this.f38291k && spanned != null && this.f38297q) {
                this.f38297q = false;
                float width = getWidth();
                com.facebook.yoga.p pVar = com.facebook.yoga.p.EXACTLY;
                s.a(spanned, width, pVar, getHeight(), pVar, this.f38293m, this.f38289i, getIncludeFontPadding(), getBreakStrategy(), getHyphenationFrequency(), Layout.Alignment.ALIGN_NORMAL, Build.VERSION.SDK_INT < 26 ? -1 : getJustificationMode(), getPaint());
                setText(spanned);
            }
            if (this.f38298r != v.f8136b) {
                C3281a.a(this, canvas);
            }
            super.onDraw(canvas);
            cVar.close();
        } finally {
        }
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (this.f38288h && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (P7.r rVar : (P7.r[]) spanned.getSpans(0, spanned.length(), P7.r.class)) {
                rVar.e();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        C2746a c2746aK = AbstractC2747a0.k(this);
        if (c2746aK != null && (c2746aK instanceof n) && getMovementMethod() == null) {
            ((n) c2746aK).I(z10, i10, rect);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x010d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0112  */
    @Override // androidx.appcompat.widget.D, android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.m.onLayout(boolean, int, int, int, int):void");
    }

    @Override // androidx.appcompat.widget.D, android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        g7.c cVar = new g7.c("ReactTextView.onMeasure");
        try {
            super.onMeasure(i10, i11);
            cVar.close();
        } catch (Throwable th2) {
            try {
                cVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (this.f38288h && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (P7.r rVar : (P7.r[]) spanned.getSpans(0, spanned.length(), P7.r.class)) {
                rVar.f();
            }
        }
    }

    @Override // com.facebook.react.uimanager.H
    public int reactTagForTouch(float f10, float f11) {
        int i10;
        CharSequence text = getText();
        int id2 = getId();
        int i11 = (int) f10;
        int i12 = (int) f11;
        Layout layout = getLayout();
        if (layout != null) {
            int lineForVertical = layout.getLineForVertical(i12);
            int lineLeft = (int) layout.getLineLeft(lineForVertical);
            int lineRight = (int) layout.getLineRight(lineForVertical);
            if ((text instanceof Spanned) && i11 >= lineLeft && i11 <= lineRight) {
                Spanned spanned = (Spanned) text;
                try {
                    int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, i11);
                    P7.m[] mVarArr = (P7.m[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, P7.m.class);
                    if (mVarArr != null) {
                        int length = text.length();
                        for (int i13 = 0; i13 < mVarArr.length; i13++) {
                            int spanStart = spanned.getSpanStart(mVarArr[i13]);
                            int spanEnd = spanned.getSpanEnd(mVarArr[i13]);
                            if (spanEnd >= offsetForHorizontal && (i10 = spanEnd - spanStart) <= length) {
                                id2 = mVarArr[i13].a();
                                length = i10;
                            }
                        }
                        return id2;
                    }
                } catch (ArrayIndexOutOfBoundsException e10) {
                    AbstractC7283a.m("ReactNative", "Crash in HorizontalMeasurementProvider: " + e10.getMessage());
                }
            }
        }
        return id2;
    }

    public void setAdjustFontSizeToFit(boolean z10) {
        this.f38291k = z10;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        C3281a.m(this, Integer.valueOf(i10));
    }

    public void setBorderRadius(float f10) {
        v(f10, H7.i.f8043a.ordinal());
    }

    public void setBorderStyle(String str) {
        C3281a.t(this, str == null ? null : H7.k.b(str));
    }

    @Override // android.widget.TextView
    public void setBreakStrategy(int i10) {
        super.setBreakStrategy(i10);
        this.f38297q = true;
    }

    public void setEllipsizeLocation(TextUtils.TruncateAt truncateAt) {
        this.f38290j = truncateAt;
    }

    public void setFontSize(float f10) {
        this.f38292l = (float) (this.f38291k ? Math.ceil(B.k(f10)) : Math.ceil(B.i(f10)));
        s();
    }

    void setGravityHorizontal(int i10) {
        if (i10 == 0) {
            i10 = 8388611;
        }
        setGravity(i10 | (getGravity() & (-8388616)));
    }

    void setGravityVertical(int i10) {
        if (i10 == 0) {
            i10 = 48;
        }
        setGravity(i10 | (getGravity() & (-113)));
    }

    @Override // android.widget.TextView
    public void setHyphenationFrequency(int i10) {
        super.setHyphenationFrequency(i10);
        this.f38297q = true;
    }

    @Override // android.widget.TextView
    public void setIncludeFontPadding(boolean z10) {
        super.setIncludeFontPadding(z10);
        this.f38297q = true;
    }

    @Override // android.widget.TextView
    public void setLetterSpacing(float f10) {
        if (Float.isNaN(f10)) {
            return;
        }
        this.f38294n = B.i(f10) / this.f38292l;
        s();
    }

    public void setLinkifyMask(int i10) {
        this.f38295o = i10;
    }

    public void setMinimumFontSize(float f10) {
        this.f38293m = f10;
        this.f38297q = true;
    }

    public void setNumberOfLines(int i10) {
        if (i10 == 0) {
            i10 = Integer.MAX_VALUE;
        }
        this.f38289i = i10;
        setMaxLines(i10);
        this.f38297q = true;
    }

    public void setOverflow(String str) {
        if (str == null) {
            this.f38298r = v.f8136b;
        } else {
            v vVarB = v.b(str);
            if (vVarB == null) {
                vVarB = v.f8136b;
            }
            this.f38298r = vVarB;
        }
        invalidate();
    }

    public void setSpanned(Spannable spannable) {
        this.f38299s = spannable;
        this.f38297q = true;
    }

    public void setText(i iVar) {
        g7.c cVar = new g7.c("ReactTextView.setText(ReactTextUpdate)");
        try {
            this.f38288h = iVar.a();
            if (getLayoutParams() == null) {
                setLayoutParams(f38287t);
            }
            Spannable spannableH = iVar.h();
            int i10 = this.f38295o;
            if (i10 > 0) {
                Linkify.addLinks(spannableH, i10);
                setMovementMethod(LinkMovementMethod.getInstance());
            }
            setText(spannableH);
            float fE = iVar.e();
            float fG = iVar.g();
            float f10 = iVar.f();
            float fD = iVar.d();
            if (fE != -1.0f && fG != -1.0f && f10 != -1.0f && fD != -1.0f) {
                setPadding((int) Math.floor(fE), (int) Math.floor(fG), (int) Math.floor(f10), (int) Math.floor(fD));
            }
            int i11 = iVar.i();
            if (i11 != getGravityHorizontal()) {
                setGravityHorizontal(i11);
            }
            if (getBreakStrategy() != iVar.j()) {
                setBreakStrategy(iVar.j());
            }
            if (Build.VERSION.SDK_INT >= 26 && getJustificationMode() != iVar.c()) {
                setJustificationMode(iVar.c());
            }
            requestLayout();
            cVar.close();
        } catch (Throwable th2) {
            try {
                cVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // android.widget.TextView
    public void setTextIsSelectable(boolean z10) {
        this.f38296p = z10;
        super.setTextIsSelectable(z10);
    }

    void u() {
        t();
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
        C3281a.l(this);
        setBreakStrategy(0);
        setMovementMethod(getDefaultMovementMethod());
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            setJustificationMode(0);
        }
        setLayoutParams(f38287t);
        super.setText((CharSequence) null);
        s();
        setGravity(8388659);
        setNumberOfLines(this.f38289i);
        setAdjustFontSizeToFit(this.f38291k);
        setLinkifyMask(this.f38295o);
        setTextIsSelectable(this.f38296p);
        setIncludeFontPadding(true);
        setEnabled(true);
        setLinkifyMask(0);
        setEllipsizeLocation(this.f38290j);
        setEnabled(true);
        if (i10 >= 26) {
            setFocusable(16);
        }
        setHyphenationFrequency(0);
        w();
    }

    public void v(float f10, int i10) {
        C3281a.s(this, H7.i.values()[i10], Float.isNaN(f10) ? null : new C3303t(B.g(f10), EnumC3304u.f37832a));
    }

    @Override // android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (this.f38288h && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (P7.r rVar : (P7.r[]) spanned.getSpans(0, spanned.length(), P7.r.class)) {
                if (rVar.a() == drawable) {
                    return true;
                }
            }
        }
        return super.verifyDrawable(drawable);
    }

    public void w() {
        setEllipsize((this.f38289i == Integer.MAX_VALUE || this.f38291k) ? null : this.f38290j);
    }
}
