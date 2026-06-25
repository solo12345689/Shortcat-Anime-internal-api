package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.horcrux.svg.events.SvgLoadEvent;
import java.util.concurrent.atomic.AtomicBoolean;
import z5.AbstractC7283a;
import z6.C7305t;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class C extends RenderableView {

    /* JADX INFO: renamed from: a */
    private SVGLength f43540a;

    /* JADX INFO: renamed from: b */
    private SVGLength f43541b;

    /* JADX INFO: renamed from: c */
    private SVGLength f43542c;

    /* JADX INFO: renamed from: d */
    private SVGLength f43543d;

    /* JADX INFO: renamed from: e */
    private String f43544e;

    /* JADX INFO: renamed from: f */
    private int f43545f;

    /* JADX INFO: renamed from: g */
    private int f43546g;

    /* JADX INFO: renamed from: h */
    private String f43547h;

    /* JADX INFO: renamed from: i */
    private int f43548i;

    /* JADX INFO: renamed from: j */
    private final AtomicBoolean f43549j;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends A6.b {
        a() {
        }

        @Override // I5.b
        public void e(I5.c cVar) {
            C.this.f43549j.set(false);
            AbstractC7283a.L("ReactNative", cVar.c(), "RNSVG: fetchDecodedImage failed!", new Object[0]);
        }

        @Override // A6.b
        public void g(Bitmap bitmap) {
            C c10 = C.this;
            EventDispatcher eventDispatcherC = com.facebook.react.uimanager.f0.c(c10.mContext, c10.getId());
            int iF = com.facebook.react.uimanager.f0.f(C.this);
            int id2 = C.this.getId();
            C c11 = C.this;
            eventDispatcherC.d(new SvgLoadEvent(iF, id2, c11.mContext, c11.f43544e, bitmap.getWidth(), bitmap.getHeight()));
            C.this.f43549j.set(false);
            SvgView svgView = C.this.getSvgView();
            if (svgView != null) {
                svgView.invalidate();
            }
        }
    }

    public C(ReactContext reactContext) {
        super(reactContext);
        this.f43549j = new AtomicBoolean(false);
    }

    private void D(Canvas canvas, Paint paint, Bitmap bitmap, float f10) {
        if (this.f43545f == 0 || this.f43546g == 0) {
            this.f43545f = bitmap.getWidth();
            this.f43546g = bitmap.getHeight();
        }
        RectF rectFE = E();
        RectF rectF = new RectF(0.0f, 0.0f, this.f43545f, this.f43546g);
        n0.a(rectF, rectFE, this.f43547h, this.f43548i).mapRect(rectF);
        canvas.clipPath(getPath(canvas, paint));
        Path clipPath = getClipPath(canvas, paint);
        if (clipPath != null) {
            canvas.clipPath(clipPath);
        }
        Paint paint2 = new Paint();
        paint2.setAlpha((int) (f10 * 255.0f));
        canvas.drawBitmap(bitmap, (Rect) null, rectF, paint2);
        this.mCTM.mapRect(rectF);
        setClientRect(rectF);
    }

    private RectF E() {
        double dRelativeOnWidth = relativeOnWidth(this.f43540a);
        double dRelativeOnHeight = relativeOnHeight(this.f43541b);
        double dRelativeOnWidth2 = relativeOnWidth(this.f43542c);
        double dRelativeOnHeight2 = relativeOnHeight(this.f43543d);
        if (dRelativeOnWidth2 == 0.0d) {
            dRelativeOnWidth2 = this.f43545f * this.mScale;
        }
        if (dRelativeOnHeight2 == 0.0d) {
            dRelativeOnHeight2 = this.f43546g * this.mScale;
        }
        return new RectF((float) dRelativeOnWidth, (float) dRelativeOnHeight, (float) (dRelativeOnWidth + dRelativeOnWidth2), (float) (dRelativeOnHeight + dRelativeOnHeight2));
    }

    private void F(C7305t c7305t, K6.b bVar) {
        this.f43549j.set(true);
        c7305t.k(bVar, this.mContext).f(new a(), w5.i.o());
    }

    private void L(C7305t c7305t, K6.b bVar, Canvas canvas, Paint paint, float f10) {
        I5.c cVarO = c7305t.o(bVar, this.mContext);
        try {
            try {
                C5.a aVar = (C5.a) cVarO.a();
                try {
                    if (aVar == null) {
                        return;
                    }
                    try {
                        E6.e eVar = (E6.e) aVar.C();
                        if (eVar instanceof E6.d) {
                            Bitmap bitmapG1 = ((E6.d) eVar).G1();
                            if (bitmapG1 == null) {
                                return;
                            }
                            D(canvas, paint, bitmapG1, f10);
                        }
                    } catch (Exception e10) {
                        throw new IllegalStateException(e10);
                    }
                } finally {
                    C5.a.m(aVar);
                }
            } catch (Exception e11) {
                throw new IllegalStateException(e11);
            }
        } finally {
            cVarO.close();
        }
    }

    public void G(Dynamic dynamic) {
        this.f43543d = SVGLength.b(dynamic);
        invalidate();
    }

    public void H(ReadableMap readableMap) {
        if (readableMap != null) {
            String string = readableMap.getString("uri");
            this.f43544e = string;
            if (string == null || string.isEmpty()) {
                return;
            }
            if (readableMap.hasKey("width") && readableMap.hasKey("height")) {
                this.f43545f = readableMap.getInt("width");
                this.f43546g = readableMap.getInt("height");
            } else {
                this.f43545f = 0;
                this.f43546g = 0;
            }
            if (Uri.parse(this.f43544e).getScheme() == null) {
                N7.c.c();
                N7.c.f(this.mContext, this.f43544e);
            }
        }
    }

    public void I(Dynamic dynamic) {
        this.f43542c = SVGLength.b(dynamic);
        invalidate();
    }

    public void J(Dynamic dynamic) {
        this.f43540a = SVGLength.b(dynamic);
        invalidate();
    }

    public void K(Dynamic dynamic) {
        this.f43541b = SVGLength.b(dynamic);
        invalidate();
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f10) {
        if (this.f43549j.get()) {
            return;
        }
        C7305t c7305tA = O5.d.a();
        K6.b bVarA = K6.b.a(new N7.a(this.mContext, this.f43544e).f());
        if (c7305tA.t(bVarA)) {
            L(c7305tA, bVarA, canvas, paint, f10 * this.mOpacity);
        } else {
            F(c7305tA, bVarA);
        }
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        this.mPath = path;
        path.addRect(E(), Path.Direction.CW);
        return this.mPath;
    }

    public void setAlign(String str) {
        this.f43547h = str;
        invalidate();
    }

    public void setMeetOrSlice(int i10) {
        this.f43548i = i10;
        invalidate();
    }
}
