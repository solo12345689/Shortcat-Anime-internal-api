package com.facebook.react.views.text.frescosupport;

import K6.c;
import P7.r;
import android.content.res.Resources;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.widget.TextView;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.B;
import com.facebook.react.views.image.d;
import kotlin.jvm.internal.AbstractC5504s;
import s0.AbstractC6343c0;
import s0.AbstractC6346d0;
import u7.C6742b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f38258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ReadableMap f38259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final S5.b f38260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f38261e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f38262f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private TextView f38263g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Uri f38264h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f38265i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f38266j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Z5.b f38267k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Drawable f38268l;

    public b(Resources resources, int i10, int i11, int i12, Uri EMPTY, ReadableMap readableMap, S5.b draweeControllerBuilder, Object obj, String str) {
        AbstractC5504s.h(resources, "resources");
        AbstractC5504s.h(draweeControllerBuilder, "draweeControllerBuilder");
        this.f38258b = i12;
        this.f38259c = readableMap;
        this.f38260d = draweeControllerBuilder;
        this.f38261e = obj;
        this.f38262f = str;
        if (EMPTY == null) {
            EMPTY = Uri.EMPTY;
            AbstractC5504s.g(EMPTY, "EMPTY");
        }
        this.f38264h = EMPTY;
        this.f38265i = (int) B.h(i11);
        this.f38266j = (int) B.h(i10);
        this.f38267k = new Z5.b(W5.b.t(resources).a());
    }

    @Override // P7.r
    public Drawable a() {
        return this.f38268l;
    }

    @Override // P7.r
    public int b() {
        return this.f38266j;
    }

    @Override // P7.r
    public void c() {
        this.f38267k.i();
    }

    @Override // P7.r
    public void d() {
        this.f38267k.j();
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence text, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        AbstractC5504s.h(canvas, "canvas");
        AbstractC5504s.h(text, "text");
        AbstractC5504s.h(paint, "paint");
        if (a() == null) {
            c cVarX = c.x(this.f38264h);
            C6742b.a aVar = C6742b.f61408D;
            AbstractC5504s.e(cVarX);
            C6742b c6742bB = C6742b.a.b(aVar, cVarX, this.f38259c, null, 4, null);
            ((W5.a) this.f38267k.f()).t(d.c(this.f38262f));
            this.f38260d.x();
            this.f38260d.D(this.f38267k.e());
            Object obj = this.f38261e;
            if (obj != null) {
                AbstractC5504s.g(this.f38260d.z(obj), "setCallerContext(...)");
            }
            this.f38260d.B(c6742bB);
            S5.a aVarA = this.f38260d.a();
            AbstractC5504s.g(aVarA, "build(...)");
            this.f38267k.o(aVarA);
            this.f38260d.x();
            Drawable drawableG = this.f38267k.g();
            if (drawableG == null) {
                throw new IllegalStateException("Required value was null.");
            }
            drawableG.setBounds(0, 0, this.f38265i, this.f38266j);
            if (this.f38258b != 0) {
                if (Build.VERSION.SDK_INT >= 29) {
                    AbstractC6346d0.a();
                    drawableG.setColorFilter(AbstractC6343c0.a(this.f38258b, BlendMode.SRC_IN));
                } else {
                    drawableG.setColorFilter(new PorterDuffColorFilter(this.f38258b, PorterDuff.Mode.SRC_IN));
                }
            }
            drawableG.setCallback(this.f38263g);
            this.f38268l = drawableG;
        }
        canvas.save();
        Drawable drawableA = a();
        if (drawableA == null) {
            throw new IllegalStateException("Required value was null.");
        }
        canvas.translate(f10, ((i13 + ((int) paint.descent())) - (((int) (paint.descent() - paint.ascent())) / 2)) - (drawableA.getBounds().height() / 2));
        drawableA.draw(canvas);
        canvas.restore();
    }

    @Override // P7.r
    public void e() {
        this.f38267k.i();
    }

    @Override // P7.r
    public void f() {
        this.f38267k.j();
    }

    @Override // P7.r
    public void g(TextView textView) {
        this.f38263g = textView;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence text, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        AbstractC5504s.h(paint, "paint");
        AbstractC5504s.h(text, "text");
        if (fontMetricsInt != null) {
            int i12 = -this.f38266j;
            fontMetricsInt.ascent = i12;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = i12;
            fontMetricsInt.bottom = 0;
        }
        return this.f38265i;
    }
}
