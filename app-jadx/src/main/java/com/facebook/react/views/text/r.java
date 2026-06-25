package com.facebook.react.views.text;

import com.facebook.react.uimanager.B;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f38339h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f38340a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f38341b = Float.NaN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f38342c = Float.NaN;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f38343d = Float.NaN;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f38344e = Float.NaN;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t f38345f = t.f38369f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f38346g = Float.NaN;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final r a(r child) {
        AbstractC5504s.h(child, "child");
        r rVar = new r();
        rVar.f38340a = this.f38340a;
        rVar.f38341b = !Float.isNaN(child.f38341b) ? child.f38341b : this.f38341b;
        rVar.f38342c = !Float.isNaN(child.f38342c) ? child.f38342c : this.f38342c;
        rVar.f38343d = !Float.isNaN(child.f38343d) ? child.f38343d : this.f38343d;
        rVar.m(!Float.isNaN(child.f38346g) ? child.f38346g : this.f38346g);
        rVar.f38344e = !Float.isNaN(child.f38344e) ? child.f38344e : this.f38344e;
        t tVar = child.f38345f;
        if (tVar == t.f38369f) {
            tVar = this.f38345f;
        }
        rVar.f38345f = tVar;
        return rVar;
    }

    public final boolean b() {
        return this.f38340a;
    }

    public final int c() {
        float f10 = !Float.isNaN(this.f38341b) ? this.f38341b : 14.0f;
        return (int) (this.f38340a ? Math.ceil(B.l(f10, f())) : Math.ceil(B.i(f10)));
    }

    public final float d() {
        if (Float.isNaN(this.f38343d)) {
            return Float.NaN;
        }
        return (this.f38340a ? B.l(this.f38343d, f()) : B.i(this.f38343d)) / c();
    }

    public final float e() {
        if (Float.isNaN(this.f38342c)) {
            return Float.NaN;
        }
        float fL = this.f38340a ? B.l(this.f38342c, f()) : B.i(this.f38342c);
        if (!Float.isNaN(this.f38344e)) {
            float f10 = this.f38344e;
            if (f10 > fL) {
                return f10;
            }
        }
        return fL;
    }

    public final float f() {
        if (Float.isNaN(this.f38346g)) {
            return 0.0f;
        }
        return this.f38346g;
    }

    public final float g() {
        return this.f38346g;
    }

    public final void h(boolean z10) {
        this.f38340a = z10;
    }

    public final void i(float f10) {
        this.f38341b = f10;
    }

    public final void j(float f10) {
        this.f38344e = f10;
    }

    public final void k(float f10) {
        this.f38343d = f10;
    }

    public final void l(float f10) {
        this.f38342c = f10;
    }

    public final void m(float f10) {
        if (f10 == 0.0f || f10 >= 1.0f || Float.isNaN(f10)) {
            this.f38346g = f10;
        } else {
            AbstractC7283a.I("ReactNative", "maxFontSizeMultiplier must be NaN, 0, or >= 1");
            this.f38346g = Float.NaN;
        }
    }

    public String toString() {
        return Df.r.j("\n        TextAttributes {\n          getAllowFontScaling(): " + this.f38340a + "\n          getFontSize(): " + this.f38341b + "\n          getEffectiveFontSize(): " + c() + "\n          getHeightOfTallestInlineViewOrImage(): " + this.f38344e + "\n          getLetterSpacing(): " + this.f38343d + "\n          getEffectiveLetterSpacing(): " + d() + "\n          getLineHeight(): " + this.f38342c + "\n          getEffectiveLineHeight(): " + e() + "\n          getTextTransform(): " + this.f38345f + "\n          getMaxFontSizeMultiplier(): " + this.f38346g + "\n          getEffectiveMaxFontSizeMultiplier(): " + f() + "\n        }\n      ");
    }
}
