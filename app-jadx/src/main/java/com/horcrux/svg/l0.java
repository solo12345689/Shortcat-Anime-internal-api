package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class l0 extends B {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    SVGLength f43836f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    SVGLength f43837g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f43838h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    g0 f43839i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private a0 f43840j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ArrayList f43841k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ArrayList f43842l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ArrayList f43843m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ArrayList f43844n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ArrayList f43845o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    double f43846p;

    public l0(ReactContext reactContext) {
        super(reactContext);
        this.f43836f = null;
        this.f43837g = null;
        this.f43838h = null;
        this.f43839i = g0.spacing;
        this.f43846p = Double.NaN;
    }

    @Override // com.horcrux.svg.B
    Path E(Canvas canvas, Paint paint, Region.Op op) {
        return getPath(canvas, paint);
    }

    @Override // com.horcrux.svg.B
    void H() {
        F().p(((this instanceof Z) || (this instanceof Y)) ? false : true, this, this.f43535a, this.f43841k, this.f43842l, this.f43844n, this.f43845o, this.f43843m);
    }

    a0 M() {
        a0 a0Var;
        if (this.f43840j == null) {
            for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
                if ((parent instanceof l0) && (a0Var = ((l0) parent).f43840j) != null) {
                    this.f43840j = a0Var;
                    return a0Var;
                }
            }
        }
        if (this.f43840j == null) {
            this.f43840j = a0.baseline;
        }
        return this.f43840j;
    }

    String N() {
        String str;
        if (this.f43838h == null) {
            for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
                if ((parent instanceof l0) && (str = ((l0) parent).f43838h) != null) {
                    this.f43838h = str;
                    return str;
                }
            }
        }
        return this.f43838h;
    }

    Path O(Canvas canvas, Paint paint) {
        Path path = this.mPath;
        if (path != null) {
            return path;
        }
        H();
        this.mPath = super.getPath(canvas, paint);
        G();
        return this.mPath;
    }

    double P(Paint paint) {
        if (!Double.isNaN(this.f43846p)) {
            return this.f43846p;
        }
        double dP = 0.0d;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof l0) {
                dP += ((l0) childAt).P(paint);
            }
        }
        this.f43846p = dP;
        return dP;
    }

    l0 Q() {
        ArrayList arrayList = F().f43945a;
        ViewParent parent = getParent();
        l0 l0Var = this;
        for (int size = arrayList.size() - 1; size >= 0 && (parent instanceof l0) && ((C4015x) arrayList.get(size)).f43916j != e0.start && l0Var.f43841k == null; size--) {
            l0Var = (l0) parent;
            parent = l0Var.getParent();
        }
        return l0Var;
    }

    l0 R() {
        ViewParent parent = getParent();
        l0 l0Var = this;
        while (parent instanceof l0) {
            l0Var = (l0) parent;
            parent = l0Var.getParent();
        }
        return l0Var;
    }

    public void S(Dynamic dynamic) {
        this.f43838h = SVGLength.c(dynamic);
        invalidate();
    }

    public void T(Dynamic dynamic) {
        this.f43844n = SVGLength.a(dynamic);
        invalidate();
    }

    public void U(Dynamic dynamic) {
        this.f43845o = SVGLength.a(dynamic);
        invalidate();
    }

    public void V(Dynamic dynamic) {
        this.f43836f = SVGLength.b(dynamic);
        invalidate();
    }

    public void W(String str) {
        this.f43839i = g0.valueOf(str);
        invalidate();
    }

    public void X(String str) {
        this.f43840j = a0.b(str);
        invalidate();
    }

    public void Y(Dynamic dynamic) {
        this.f43841k = SVGLength.a(dynamic);
        invalidate();
    }

    public void Z(Dynamic dynamic) {
        this.f43842l = SVGLength.a(dynamic);
        invalidate();
    }

    public void a0(Dynamic dynamic) {
        this.f43843m = SVGLength.a(dynamic);
        invalidate();
    }

    public void b0(Dynamic dynamic) {
        this.f43837g = SVGLength.b(dynamic);
        invalidate();
    }

    public void c0(Dynamic dynamic) {
        String strC = SVGLength.c(dynamic);
        if (strC != null) {
            String strTrim = strC.trim();
            int iLastIndexOf = strTrim.lastIndexOf(32);
            try {
                this.f43840j = a0.b(strTrim.substring(iLastIndexOf));
            } catch (IllegalArgumentException unused) {
                this.f43840j = a0.baseline;
            }
            try {
                this.f43838h = strTrim.substring(0, iLastIndexOf);
            } catch (IndexOutOfBoundsException unused2) {
                this.f43838h = null;
            }
        } else {
            this.f43840j = a0.baseline;
            this.f43838h = null;
        }
        invalidate();
    }

    @Override // com.horcrux.svg.VirtualView
    void clearCache() {
        this.f43846p = Double.NaN;
        super.clearCache();
    }

    @Override // com.horcrux.svg.B, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f10) {
        L(canvas);
        clip(canvas, paint);
        O(canvas, paint);
        H();
        B(canvas, paint, f10);
        G();
    }

    @Override // com.horcrux.svg.B, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        Path path = this.mPath;
        if (path != null) {
            return path;
        }
        L(canvas);
        return O(canvas, paint);
    }

    @Override // com.horcrux.svg.VirtualView, android.view.View
    public void invalidate() {
        if (this.mPath == null) {
            return;
        }
        super.invalidate();
        R().clearChildCache();
    }
}
