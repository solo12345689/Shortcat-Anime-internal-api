package androidx.appcompat.widget;

import A1.AbstractC1002a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.X;
import i.AbstractC4956a;
import j.AbstractC5323a;

/* JADX INFO: renamed from: androidx.appcompat.widget.k */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2657k {

    /* JADX INFO: renamed from: b */
    private static final PorterDuff.Mode f25426b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c */
    private static C2657k f25427c;

    /* JADX INFO: renamed from: a */
    private X f25428a;

    /* JADX INFO: renamed from: androidx.appcompat.widget.k$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements X.c {

        /* JADX INFO: renamed from: a */
        private final int[] f25429a = {i.e.f48019R, i.e.f48017P, i.e.f48021a};

        /* JADX INFO: renamed from: b */
        private final int[] f25430b = {i.e.f48035o, i.e.f48003B, i.e.f48040t, i.e.f48036p, i.e.f48037q, i.e.f48039s, i.e.f48038r};

        /* JADX INFO: renamed from: c */
        private final int[] f25431c = {i.e.f48016O, i.e.f48018Q, i.e.f48031k, i.e.f48012K, i.e.f48013L, i.e.f48014M, i.e.f48015N};

        /* JADX INFO: renamed from: d */
        private final int[] f25432d = {i.e.f48043w, i.e.f48029i, i.e.f48042v};

        /* JADX INFO: renamed from: e */
        private final int[] f25433e = {i.e.f48011J, i.e.f48020S};

        /* JADX INFO: renamed from: f */
        private final int[] f25434f = {i.e.f48023c, i.e.f48027g, i.e.f48024d, i.e.f48028h};

        a() {
        }

        private boolean f(int[] iArr, int i10) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList g(Context context) {
            return h(context, 0);
        }

        private ColorStateList h(Context context, int i10) {
            int iC = d0.c(context, AbstractC4956a.f47973t);
            return new ColorStateList(new int[][]{d0.f25374b, d0.f25377e, d0.f25375c, d0.f25381i}, new int[]{d0.b(context, AbstractC4956a.f47971r), AbstractC1002a.g(iC, i10), AbstractC1002a.g(iC, i10), i10});
        }

        private ColorStateList i(Context context) {
            return h(context, d0.c(context, AbstractC4956a.f47970q));
        }

        private ColorStateList j(Context context) {
            return h(context, d0.c(context, AbstractC4956a.f47971r));
        }

        private ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList colorStateListE = d0.e(context, AbstractC4956a.f47977x);
            if (colorStateListE == null || !colorStateListE.isStateful()) {
                iArr[0] = d0.f25374b;
                iArr2[0] = d0.b(context, AbstractC4956a.f47977x);
                iArr[1] = d0.f25378f;
                iArr2[1] = d0.c(context, AbstractC4956a.f47972s);
                iArr[2] = d0.f25381i;
                iArr2[2] = d0.c(context, AbstractC4956a.f47977x);
            } else {
                int[] iArr3 = d0.f25374b;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListE.getColorForState(iArr3, 0);
                iArr[1] = d0.f25378f;
                iArr2[1] = d0.c(context, AbstractC4956a.f47972s);
                iArr[2] = d0.f25381i;
                iArr2[2] = colorStateListE.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        private LayerDrawable l(X x10, Context context, int i10) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
            Drawable drawableI = x10.i(context, i.e.f48007F);
            Drawable drawableI2 = x10.i(context, i.e.f48008G);
            if ((drawableI instanceof BitmapDrawable) && drawableI.getIntrinsicWidth() == dimensionPixelSize && drawableI.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawableI;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableI.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableI.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawableI2 instanceof BitmapDrawable) && drawableI2.getIntrinsicWidth() == dimensionPixelSize && drawableI2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawableI2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawableI2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableI2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        private void m(Drawable drawable, int i10, PorterDuff.Mode mode) {
            Drawable drawableMutate = drawable.mutate();
            if (mode == null) {
                mode = C2657k.f25426b;
            }
            drawableMutate.setColorFilter(C2657k.e(i10, mode));
        }

        @Override // androidx.appcompat.widget.X.c
        public Drawable a(X x10, Context context, int i10) {
            if (i10 == i.e.f48030j) {
                return new LayerDrawable(new Drawable[]{x10.i(context, i.e.f48029i), x10.i(context, i.e.f48031k)});
            }
            if (i10 == i.e.f48045y) {
                return l(x10, context, i.d.f47995g);
            }
            if (i10 == i.e.f48044x) {
                return l(x10, context, i.d.f47996h);
            }
            if (i10 == i.e.f48046z) {
                return l(x10, context, i.d.f47997i);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.X.c
        public ColorStateList b(Context context, int i10) {
            if (i10 == i.e.f48033m) {
                return AbstractC5323a.a(context, i.c.f47985e);
            }
            if (i10 == i.e.f48010I) {
                return AbstractC5323a.a(context, i.c.f47988h);
            }
            if (i10 == i.e.f48009H) {
                return k(context);
            }
            if (i10 == i.e.f48026f) {
                return j(context);
            }
            if (i10 == i.e.f48022b) {
                return g(context);
            }
            if (i10 == i.e.f48025e) {
                return i(context);
            }
            if (i10 == i.e.f48005D || i10 == i.e.f48006E) {
                return AbstractC5323a.a(context, i.c.f47987g);
            }
            if (f(this.f25430b, i10)) {
                return d0.e(context, AbstractC4956a.f47974u);
            }
            if (f(this.f25433e, i10)) {
                return AbstractC5323a.a(context, i.c.f47984d);
            }
            if (f(this.f25434f, i10)) {
                return AbstractC5323a.a(context, i.c.f47983c);
            }
            if (i10 == i.e.f48002A) {
                return AbstractC5323a.a(context, i.c.f47986f);
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:51:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0065 A[RETURN] */
        @Override // androidx.appcompat.widget.X.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean c(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C2657k.a()
                int[] r1 = r6.f25429a
                boolean r1 = r6.f(r1, r8)
                r2 = 1
                r3 = 0
                r4 = -1
                if (r1 == 0) goto L15
                int r8 = i.AbstractC4956a.f47974u
            L11:
                r1 = r0
                r5 = r2
            L13:
                r0 = r4
                goto L4e
            L15:
                int[] r1 = r6.f25431c
                boolean r1 = r6.f(r1, r8)
                if (r1 == 0) goto L20
                int r8 = i.AbstractC4956a.f47972s
                goto L11
            L20:
                int[] r1 = r6.f25432d
                boolean r1 = r6.f(r1, r8)
                r5 = 16842801(0x1010031, float:2.3693695E-38)
                if (r1 == 0) goto L32
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            L2d:
                r1 = r0
                r0 = r4
                r8 = r5
            L30:
                r5 = r2
                goto L4e
            L32:
                int r1 = i.e.f48041u
                if (r8 != r1) goto L45
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                r1 = 16842800(0x1010030, float:2.3693693E-38)
                r5 = r0
                r0 = r8
                r8 = r1
                r1 = r5
                goto L30
            L45:
                int r1 = i.e.f48032l
                if (r8 != r1) goto L4a
                goto L2d
            L4a:
                r1 = r0
                r8 = r3
                r5 = r8
                goto L13
            L4e:
                if (r5 == 0) goto L65
                android.graphics.drawable.Drawable r9 = r9.mutate()
                int r7 = androidx.appcompat.widget.d0.c(r7, r8)
                android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.C2657k.e(r7, r1)
                r9.setColorFilter(r7)
                if (r0 == r4) goto L64
                r9.setAlpha(r0)
            L64:
                return r2
            L65:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C2657k.a.c(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // androidx.appcompat.widget.X.c
        public PorterDuff.Mode d(int i10) {
            if (i10 == i.e.f48009H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.X.c
        public boolean e(Context context, int i10, Drawable drawable) {
            if (i10 == i.e.f48004C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                m(layerDrawable.findDrawableByLayerId(R.id.background), d0.c(context, AbstractC4956a.f47974u), C2657k.f25426b);
                m(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), d0.c(context, AbstractC4956a.f47974u), C2657k.f25426b);
                m(layerDrawable.findDrawableByLayerId(R.id.progress), d0.c(context, AbstractC4956a.f47972s), C2657k.f25426b);
                return true;
            }
            if (i10 != i.e.f48045y && i10 != i.e.f48044x && i10 != i.e.f48046z) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            m(layerDrawable2.findDrawableByLayerId(R.id.background), d0.b(context, AbstractC4956a.f47974u), C2657k.f25426b);
            m(layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress), d0.c(context, AbstractC4956a.f47972s), C2657k.f25426b);
            m(layerDrawable2.findDrawableByLayerId(R.id.progress), d0.c(context, AbstractC4956a.f47972s), C2657k.f25426b);
            return true;
        }
    }

    public static synchronized C2657k b() {
        try {
            if (f25427c == null) {
                h();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f25427c;
    }

    public static synchronized PorterDuffColorFilter e(int i10, PorterDuff.Mode mode) {
        return X.k(i10, mode);
    }

    public static synchronized void h() {
        if (f25427c == null) {
            C2657k c2657k = new C2657k();
            f25427c = c2657k;
            c2657k.f25428a = X.g();
            f25427c.f25428a.t(new a());
        }
    }

    static void i(Drawable drawable, f0 f0Var, int[] iArr) {
        X.v(drawable, f0Var, iArr);
    }

    public synchronized Drawable c(Context context, int i10) {
        return this.f25428a.i(context, i10);
    }

    synchronized Drawable d(Context context, int i10, boolean z10) {
        return this.f25428a.j(context, i10, z10);
    }

    synchronized ColorStateList f(Context context, int i10) {
        return this.f25428a.l(context, i10);
    }

    public synchronized void g(Context context) {
        this.f25428a.r(context);
    }
}
