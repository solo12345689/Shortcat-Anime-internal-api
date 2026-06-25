package q5;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.Base64;
import android.util.Log;
import io.sentry.C5322z3;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;
import q5.C6116b;
import q5.e;
import q5.g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static HashSet f57429i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Canvas f57430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f57431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private q5.g f57432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C0870h f57433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Stack f57434e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Stack f57435f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Stack f57436g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private C6116b.q f57437h = null;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f57438a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f57439b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f57440c;

        static {
            int[] iArr = new int[g.E.d.values().length];
            f57440c = iArr;
            try {
                iArr[g.E.d.Miter.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57440c[g.E.d.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57440c[g.E.d.Bevel.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[g.E.c.values().length];
            f57439b = iArr2;
            try {
                iArr2[g.E.c.Butt.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f57439b[g.E.c.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f57439b[g.E.c.Square.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[e.a.values().length];
            f57438a = iArr3;
            try {
                iArr3[e.a.xMidYMin.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f57438a[e.a.xMidYMid.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f57438a[e.a.xMidYMax.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f57438a[e.a.xMaxYMin.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f57438a[e.a.xMaxYMid.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f57438a[e.a.xMaxYMax.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f57438a[e.a.xMinYMid.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f57438a[e.a.xMinYMax.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class b implements g.InterfaceC6139x {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f57442b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f57443c;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f57448h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f57441a = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private c f57444d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f57445e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f57446f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f57447g = -1;

        b(g.C6138w c6138w) {
            if (c6138w == null) {
                return;
            }
            c6138w.h(this);
            if (this.f57448h) {
                this.f57444d.b((c) this.f57441a.get(this.f57447g));
                this.f57441a.set(this.f57447g, this.f57444d);
                this.f57448h = false;
            }
            c cVar = this.f57444d;
            if (cVar != null) {
                this.f57441a.add(cVar);
            }
        }

        @Override // q5.g.InterfaceC6139x
        public void a(float f10, float f11) {
            if (this.f57448h) {
                this.f57444d.b((c) this.f57441a.get(this.f57447g));
                this.f57441a.set(this.f57447g, this.f57444d);
                this.f57448h = false;
            }
            c cVar = this.f57444d;
            if (cVar != null) {
                this.f57441a.add(cVar);
            }
            this.f57442b = f10;
            this.f57443c = f11;
            this.f57444d = h.this.new c(f10, f11, 0.0f, 0.0f);
            this.f57447g = this.f57441a.size();
        }

        @Override // q5.g.InterfaceC6139x
        public void b(float f10, float f11, float f12, float f13, float f14, float f15) {
            if (this.f57446f || this.f57445e) {
                this.f57444d.a(f10, f11);
                this.f57441a.add(this.f57444d);
                this.f57445e = false;
            }
            this.f57444d = h.this.new c(f14, f15, f14 - f12, f15 - f13);
            this.f57448h = false;
        }

        @Override // q5.g.InterfaceC6139x
        public void c(float f10, float f11) {
            this.f57444d.a(f10, f11);
            this.f57441a.add(this.f57444d);
            h hVar = h.this;
            c cVar = this.f57444d;
            this.f57444d = hVar.new c(f10, f11, f10 - cVar.f57450a, f11 - cVar.f57451b);
            this.f57448h = false;
        }

        @Override // q5.g.InterfaceC6139x
        public void close() {
            this.f57441a.add(this.f57444d);
            c(this.f57442b, this.f57443c);
            this.f57448h = true;
        }

        @Override // q5.g.InterfaceC6139x
        public void d(float f10, float f11, float f12, float f13) {
            this.f57444d.a(f10, f11);
            this.f57441a.add(this.f57444d);
            this.f57444d = h.this.new c(f12, f13, f12 - f10, f13 - f11);
            this.f57448h = false;
        }

        @Override // q5.g.InterfaceC6139x
        public void e(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            this.f57445e = true;
            this.f57446f = false;
            c cVar = this.f57444d;
            h.h(cVar.f57450a, cVar.f57451b, f10, f11, f12, z10, z11, f13, f14, this);
            this.f57446f = true;
            this.f57448h = false;
        }

        List f() {
            return this.f57441a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f57450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f57451b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f57452c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f57453d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f57454e = false;

        c(float f10, float f11, float f12, float f13) {
            this.f57452c = 0.0f;
            this.f57453d = 0.0f;
            this.f57450a = f10;
            this.f57451b = f11;
            double dSqrt = Math.sqrt((f12 * f12) + (f13 * f13));
            if (dSqrt != 0.0d) {
                this.f57452c = (float) (((double) f12) / dSqrt);
                this.f57453d = (float) (((double) f13) / dSqrt);
            }
        }

        void a(float f10, float f11) {
            float f12 = f10 - this.f57450a;
            float f13 = f11 - this.f57451b;
            double dSqrt = Math.sqrt((f12 * f12) + (f13 * f13));
            if (dSqrt != 0.0d) {
                f12 = (float) (((double) f12) / dSqrt);
                f13 = (float) (((double) f13) / dSqrt);
            }
            float f14 = this.f57452c;
            if (f12 != (-f14) || f13 != (-this.f57453d)) {
                this.f57452c = f14 + f12;
                this.f57453d += f13;
            } else {
                this.f57454e = true;
                this.f57452c = -f13;
                this.f57453d = f12;
            }
        }

        void b(c cVar) {
            float f10 = cVar.f57452c;
            float f11 = this.f57452c;
            if (f10 == (-f11)) {
                float f12 = cVar.f57453d;
                if (f12 == (-this.f57453d)) {
                    this.f57454e = true;
                    this.f57452c = -f12;
                    this.f57453d = cVar.f57452c;
                    return;
                }
            }
            this.f57452c = f11 + f10;
            this.f57453d += cVar.f57453d;
        }

        public String toString() {
            return "(" + this.f57450a + com.amazon.a.a.o.b.f.f34694a + this.f57451b + " " + this.f57452c + com.amazon.a.a.o.b.f.f34694a + this.f57453d + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class d implements g.InterfaceC6139x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Path f57456a = new Path();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f57457b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f57458c;

        d(g.C6138w c6138w) {
            if (c6138w == null) {
                return;
            }
            c6138w.h(this);
        }

        @Override // q5.g.InterfaceC6139x
        public void a(float f10, float f11) {
            this.f57456a.moveTo(f10, f11);
            this.f57457b = f10;
            this.f57458c = f11;
        }

        @Override // q5.g.InterfaceC6139x
        public void b(float f10, float f11, float f12, float f13, float f14, float f15) {
            this.f57456a.cubicTo(f10, f11, f12, f13, f14, f15);
            this.f57457b = f14;
            this.f57458c = f15;
        }

        @Override // q5.g.InterfaceC6139x
        public void c(float f10, float f11) {
            this.f57456a.lineTo(f10, f11);
            this.f57457b = f10;
            this.f57458c = f11;
        }

        @Override // q5.g.InterfaceC6139x
        public void close() {
            this.f57456a.close();
        }

        @Override // q5.g.InterfaceC6139x
        public void d(float f10, float f11, float f12, float f13) {
            this.f57456a.quadTo(f10, f11, f12, f13);
            this.f57457b = f12;
            this.f57458c = f13;
        }

        @Override // q5.g.InterfaceC6139x
        public void e(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            h.h(this.f57457b, this.f57458c, f10, f11, f12, z10, z11, f13, f14, this);
            this.f57457b = f13;
            this.f57458c = f14;
        }

        Path f() {
            return this.f57456a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class e extends f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Path f57460e;

        e(Path path, float f10, float f11) {
            super(f10, f11);
            this.f57460e = path;
        }

        @Override // q5.h.f, q5.h.j
        public void b(String str) {
            String str2;
            if (h.this.Y0()) {
                if (h.this.f57433d.f57470b) {
                    str2 = str;
                    h.this.f57430a.drawTextOnPath(str2, this.f57460e, this.f57462b, this.f57463c, h.this.f57433d.f57472d);
                } else {
                    str2 = str;
                }
                if (h.this.f57433d.f57471c) {
                    h.this.f57430a.drawTextOnPath(str2, this.f57460e, this.f57462b, this.f57463c, h.this.f57433d.f57473e);
                }
            } else {
                str2 = str;
            }
            this.f57462b += h.this.f57433d.f57472d.measureText(str2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class f extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f57462b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f57463c;

        f(float f10, float f11) {
            super(h.this, null);
            this.f57462b = f10;
            this.f57463c = f11;
        }

        @Override // q5.h.j
        public void b(String str) {
            h.y("TextSequence render", new Object[0]);
            if (h.this.Y0()) {
                if (h.this.f57433d.f57470b) {
                    h.this.f57430a.drawText(str, this.f57462b, this.f57463c, h.this.f57433d.f57472d);
                }
                if (h.this.f57433d.f57471c) {
                    h.this.f57430a.drawText(str, this.f57462b, this.f57463c, h.this.f57433d.f57473e);
                }
            }
            this.f57462b += h.this.f57433d.f57472d.measureText(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class g extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f57465b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f57466c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Path f57467d;

        g(float f10, float f11, Path path) {
            super(h.this, null);
            this.f57465b = f10;
            this.f57466c = f11;
            this.f57467d = path;
        }

        @Override // q5.h.j
        public boolean a(g.Y y10) {
            if (!(y10 instanceof g.Z)) {
                return true;
            }
            h.Z0("Using <textPath> elements in a clip path is not supported.", new Object[0]);
            return false;
        }

        @Override // q5.h.j
        public void b(String str) {
            String str2;
            if (h.this.Y0()) {
                Path path = new Path();
                str2 = str;
                h.this.f57433d.f57472d.getTextPath(str2, 0, str.length(), this.f57465b, this.f57466c, path);
                this.f57467d.addPath(path);
            } else {
                str2 = str;
            }
            this.f57465b += h.this.f57433d.f57472d.measureText(str2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class i extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f57478b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f57479c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        RectF f57480d;

        i(float f10, float f11) {
            super(h.this, null);
            this.f57480d = new RectF();
            this.f57478b = f10;
            this.f57479c = f11;
        }

        @Override // q5.h.j
        public boolean a(g.Y y10) {
            if (!(y10 instanceof g.Z)) {
                return true;
            }
            g.Z z10 = (g.Z) y10;
            g.N nR = y10.f57319a.r(z10.f57332o);
            if (nR == null) {
                h.F("TextPath path reference '%s' not found", z10.f57332o);
                return false;
            }
            g.C6137v c6137v = (g.C6137v) nR;
            Path pathF = h.this.new d(c6137v.f57414o).f();
            Matrix matrix = c6137v.f57386n;
            if (matrix != null) {
                pathF.transform(matrix);
            }
            RectF rectF = new RectF();
            pathF.computeBounds(rectF, true);
            this.f57480d.union(rectF);
            return false;
        }

        @Override // q5.h.j
        public void b(String str) {
            if (h.this.Y0()) {
                Rect rect = new Rect();
                h.this.f57433d.f57472d.getTextBounds(str, 0, str.length(), rect);
                RectF rectF = new RectF(rect);
                rectF.offset(this.f57478b, this.f57479c);
                this.f57480d.union(rectF);
            }
            this.f57478b += h.this.f57433d.f57472d.measureText(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private abstract class j {
        private j() {
        }

        public boolean a(g.Y y10) {
            return true;
        }

        public abstract void b(String str);

        /* synthetic */ j(h hVar, a aVar) {
            this();
        }
    }

    h(Canvas canvas, float f10) {
        this.f57430a = canvas;
        this.f57431b = f10;
    }

    private boolean A() {
        Boolean bool = this.f57433d.f57469a.f57219A;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private void A0(g.N n10) {
        if (n10 instanceof g.InterfaceC6135t) {
            return;
        }
        S0();
        u(n10);
        if (n10 instanceof g.F) {
            x0((g.F) n10);
        } else if (n10 instanceof g.e0) {
            E0((g.e0) n10);
        } else if (n10 instanceof g.S) {
            B0((g.S) n10);
        } else if (n10 instanceof g.C6128m) {
            q0((g.C6128m) n10);
        } else if (n10 instanceof g.C6130o) {
            r0((g.C6130o) n10);
        } else if (n10 instanceof g.C6137v) {
            t0((g.C6137v) n10);
        } else if (n10 instanceof g.B) {
            w0((g.B) n10);
        } else if (n10 instanceof g.C6120d) {
            o0((g.C6120d) n10);
        } else if (n10 instanceof g.C6124i) {
            p0((g.C6124i) n10);
        } else if (n10 instanceof g.C6132q) {
            s0((g.C6132q) n10);
        } else if (n10 instanceof g.A) {
            v0((g.A) n10);
        } else if (n10 instanceof g.C6141z) {
            u0((g.C6141z) n10);
        } else if (n10 instanceof g.W) {
            D0((g.W) n10);
        }
        R0();
    }

    private void B(g.K k10, Path path) {
        g.O o10 = this.f57433d.f57469a.f57232b;
        if (o10 instanceof g.C6136u) {
            g.N nR = this.f57432c.r(((g.C6136u) o10).f57412a);
            if (nR instanceof g.C6140y) {
                L(k10, path, (g.C6140y) nR);
                return;
            }
        }
        this.f57430a.drawPath(path, this.f57433d.f57472d);
    }

    private void B0(g.S s10) {
        y("Switch render", new Object[0]);
        W0(this.f57433d, s10);
        if (A()) {
            Matrix matrix = s10.f57387o;
            if (matrix != null) {
                this.f57430a.concat(matrix);
            }
            p(s10);
            boolean zM0 = m0();
            K0(s10);
            if (zM0) {
                j0(s10);
            }
            U0(s10);
        }
    }

    private void C(Path path) {
        C0870h c0870h = this.f57433d;
        if (c0870h.f57469a.f57230Z != g.E.i.NonScalingStroke) {
            this.f57430a.drawPath(path, c0870h.f57473e);
            return;
        }
        Matrix matrix = this.f57430a.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        this.f57430a.setMatrix(new Matrix());
        Shader shader = this.f57433d.f57473e.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        this.f57430a.drawPath(path2, this.f57433d.f57473e);
        this.f57430a.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    private void C0(g.T t10, g.C6118b c6118b) {
        y("Symbol render", new Object[0]);
        if (c6118b.f57342c == 0.0f || c6118b.f57343d == 0.0f) {
            return;
        }
        q5.e eVar = t10.f57321o;
        if (eVar == null) {
            eVar = q5.e.f57176e;
        }
        W0(this.f57433d, t10);
        C0870h c0870h = this.f57433d;
        c0870h.f57474f = c6118b;
        if (!c0870h.f57469a.f57253v.booleanValue()) {
            g.C6118b c6118b2 = this.f57433d.f57474f;
            O0(c6118b2.f57340a, c6118b2.f57341b, c6118b2.f57342c, c6118b2.f57343d);
        }
        g.C6118b c6118b3 = t10.f57327p;
        if (c6118b3 != null) {
            this.f57430a.concat(o(this.f57433d.f57474f, c6118b3, eVar));
            this.f57433d.f57475g = t10.f57327p;
        } else {
            Canvas canvas = this.f57430a;
            g.C6118b c6118b4 = this.f57433d.f57474f;
            canvas.translate(c6118b4.f57340a, c6118b4.f57341b);
        }
        boolean zM0 = m0();
        F0(t10, true);
        if (zM0) {
            j0(t10);
        }
        U0(t10);
    }

    private float D(float f10, float f11, float f12, float f13) {
        return (f10 * f12) + (f11 * f13);
    }

    private void D0(g.W w10) {
        y("Text render", new Object[0]);
        W0(this.f57433d, w10);
        if (A()) {
            Matrix matrix = w10.f57331s;
            if (matrix != null) {
                this.f57430a.concat(matrix);
            }
            List list = w10.f57336o;
            float fG = 0.0f;
            float f10 = (list == null || list.size() == 0) ? 0.0f : ((g.C6131p) w10.f57336o.get(0)).f(this);
            List list2 = w10.f57337p;
            float fG2 = (list2 == null || list2.size() == 0) ? 0.0f : ((g.C6131p) w10.f57337p.get(0)).g(this);
            List list3 = w10.f57338q;
            float f11 = (list3 == null || list3.size() == 0) ? 0.0f : ((g.C6131p) w10.f57338q.get(0)).f(this);
            List list4 = w10.f57339r;
            if (list4 != null && list4.size() != 0) {
                fG = ((g.C6131p) w10.f57339r.get(0)).g(this);
            }
            g.E.f fVarO = O();
            if (fVarO != g.E.f.Start) {
                float fN = n(w10);
                if (fVarO == g.E.f.Middle) {
                    fN /= 2.0f;
                }
                f10 -= fN;
            }
            if (w10.f57309h == null) {
                i iVar = new i(f10, fG2);
                E(w10, iVar);
                RectF rectF = iVar.f57480d;
                w10.f57309h = new g.C6118b(rectF.left, rectF.top, rectF.width(), iVar.f57480d.height());
            }
            U0(w10);
            r(w10);
            p(w10);
            boolean zM0 = m0();
            E(w10, new f(f10 + f11, fG2 + fG));
            if (zM0) {
                j0(w10);
            }
        }
    }

    private void E(g.Y y10, j jVar) {
        if (A()) {
            Iterator it = y10.f57298i.iterator();
            boolean z10 = true;
            while (it.hasNext()) {
                g.N n10 = (g.N) it.next();
                if (n10 instanceof g.c0) {
                    jVar.b(T0(((g.c0) n10).f57348c, z10, !it.hasNext()));
                } else {
                    l0(n10, jVar);
                }
                z10 = false;
            }
        }
    }

    private void E0(g.e0 e0Var) {
        y("Use render", new Object[0]);
        g.C6131p c6131p = e0Var.f57367s;
        if (c6131p == null || !c6131p.i()) {
            g.C6131p c6131p2 = e0Var.f57368t;
            if (c6131p2 == null || !c6131p2.i()) {
                W0(this.f57433d, e0Var);
                if (A()) {
                    g.N nR = e0Var.f57319a.r(e0Var.f57364p);
                    if (nR == null) {
                        F("Use reference '%s' not found", e0Var.f57364p);
                        return;
                    }
                    Matrix matrix = e0Var.f57387o;
                    if (matrix != null) {
                        this.f57430a.concat(matrix);
                    }
                    g.C6131p c6131p3 = e0Var.f57365q;
                    float f10 = c6131p3 != null ? c6131p3.f(this) : 0.0f;
                    g.C6131p c6131p4 = e0Var.f57366r;
                    this.f57430a.translate(f10, c6131p4 != null ? c6131p4.g(this) : 0.0f);
                    p(e0Var);
                    boolean zM0 = m0();
                    i0(e0Var);
                    if (nR instanceof g.F) {
                        g.C6118b c6118bF0 = f0(null, null, e0Var.f57367s, e0Var.f57368t);
                        S0();
                        y0((g.F) nR, c6118bF0);
                        R0();
                    } else if (nR instanceof g.T) {
                        g.C6131p c6131p5 = e0Var.f57367s;
                        if (c6131p5 == null) {
                            c6131p5 = new g.C6131p(100.0f, g.d0.percent);
                        }
                        g.C6131p c6131p6 = e0Var.f57368t;
                        if (c6131p6 == null) {
                            c6131p6 = new g.C6131p(100.0f, g.d0.percent);
                        }
                        g.C6118b c6118bF02 = f0(null, null, c6131p5, c6131p6);
                        S0();
                        C0((g.T) nR, c6118bF02);
                        R0();
                    } else {
                        A0(nR);
                    }
                    h0();
                    if (zM0) {
                        j0(e0Var);
                    }
                    U0(e0Var);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void F(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    private void F0(g.J j10, boolean z10) {
        if (z10) {
            i0(j10);
        }
        Iterator it = j10.g().iterator();
        while (it.hasNext()) {
            A0((g.N) it.next());
        }
        if (z10) {
            h0();
        }
    }

    private void G(g.Y y10, StringBuilder sb2) {
        Iterator it = y10.f57298i.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            g.N n10 = (g.N) it.next();
            if (n10 instanceof g.Y) {
                G((g.Y) n10, sb2);
            } else if (n10 instanceof g.c0) {
                sb2.append(T0(((g.c0) n10).f57348c, z10, !it.hasNext()));
            }
            z10 = false;
        }
    }

    private void H(g.AbstractC6125j abstractC6125j, String str) {
        g.N nR = abstractC6125j.f57319a.r(str);
        if (nR == null) {
            Z0("Gradient reference '%s' not found", str);
            return;
        }
        if (!(nR instanceof g.AbstractC6125j)) {
            F("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (nR == abstractC6125j) {
            F("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        g.AbstractC6125j abstractC6125j2 = (g.AbstractC6125j) nR;
        if (abstractC6125j.f57378i == null) {
            abstractC6125j.f57378i = abstractC6125j2.f57378i;
        }
        if (abstractC6125j.f57379j == null) {
            abstractC6125j.f57379j = abstractC6125j2.f57379j;
        }
        if (abstractC6125j.f57380k == null) {
            abstractC6125j.f57380k = abstractC6125j2.f57380k;
        }
        if (abstractC6125j.f57377h.isEmpty()) {
            abstractC6125j.f57377h = abstractC6125j2.f57377h;
        }
        try {
            if (abstractC6125j instanceof g.M) {
                I((g.M) abstractC6125j, (g.M) nR);
            } else {
                J((g.Q) abstractC6125j, (g.Q) nR);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = abstractC6125j2.f57381l;
        if (str2 != null) {
            H(abstractC6125j, str2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0101, code lost:
    
        if (r7 != 8) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void H0(q5.g.C6133r r12, q5.h.c r13) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.h.H0(q5.g$r, q5.h$c):void");
    }

    private void I(g.M m10, g.M m11) {
        if (m10.f57315m == null) {
            m10.f57315m = m11.f57315m;
        }
        if (m10.f57316n == null) {
            m10.f57316n = m11.f57316n;
        }
        if (m10.f57317o == null) {
            m10.f57317o = m11.f57317o;
        }
        if (m10.f57318p == null) {
            m10.f57318p = m11.f57318p;
        }
    }

    private void I0(g.AbstractC6127l abstractC6127l) {
        g.C6133r c6133r;
        g.C6133r c6133r2;
        g.C6133r c6133r3;
        int size;
        g.E e10 = this.f57433d.f57469a;
        String str = e10.f57255x;
        if (str == null && e10.f57256y == null && e10.f57257z == null) {
            return;
        }
        if (str == null) {
            c6133r = null;
        } else {
            g.N nR = abstractC6127l.f57319a.r(str);
            if (nR != null) {
                c6133r = (g.C6133r) nR;
            } else {
                F("Marker reference '%s' not found", this.f57433d.f57469a.f57255x);
                c6133r = null;
            }
        }
        String str2 = this.f57433d.f57469a.f57256y;
        if (str2 == null) {
            c6133r2 = null;
        } else {
            g.N nR2 = abstractC6127l.f57319a.r(str2);
            if (nR2 != null) {
                c6133r2 = (g.C6133r) nR2;
            } else {
                F("Marker reference '%s' not found", this.f57433d.f57469a.f57256y);
                c6133r2 = null;
            }
        }
        String str3 = this.f57433d.f57469a.f57257z;
        if (str3 == null) {
            c6133r3 = null;
        } else {
            g.N nR3 = abstractC6127l.f57319a.r(str3);
            if (nR3 != null) {
                c6133r3 = (g.C6133r) nR3;
            } else {
                F("Marker reference '%s' not found", this.f57433d.f57469a.f57257z);
                c6133r3 = null;
            }
        }
        List listF = abstractC6127l instanceof g.C6137v ? new b(((g.C6137v) abstractC6127l).f57414o).f() : abstractC6127l instanceof g.C6132q ? k((g.C6132q) abstractC6127l) : l((g.C6141z) abstractC6127l);
        if (listF == null || (size = listF.size()) == 0) {
            return;
        }
        g.E e11 = this.f57433d.f57469a;
        e11.f57257z = null;
        e11.f57256y = null;
        e11.f57255x = null;
        if (c6133r != null) {
            H0(c6133r, (c) listF.get(0));
        }
        if (c6133r2 != null && listF.size() > 2) {
            c cVarN0 = (c) listF.get(0);
            c cVar = (c) listF.get(1);
            int i10 = 1;
            while (i10 < size - 1) {
                i10++;
                c cVar2 = (c) listF.get(i10);
                cVarN0 = cVar.f57454e ? n0(cVarN0, cVar, cVar2) : cVar;
                H0(c6133r2, cVarN0);
                cVar = cVar2;
            }
        }
        if (c6133r3 != null) {
            H0(c6133r3, (c) listF.get(size - 1));
        }
    }

    private void J(g.Q q10, g.Q q11) {
        if (q10.f57322m == null) {
            q10.f57322m = q11.f57322m;
        }
        if (q10.f57323n == null) {
            q10.f57323n = q11.f57323n;
        }
        if (q10.f57324o == null) {
            q10.f57324o = q11.f57324o;
        }
        if (q10.f57325p == null) {
            q10.f57325p = q11.f57325p;
        }
        if (q10.f57326q == null) {
            q10.f57326q = q11.f57326q;
        }
    }

    private void J0(g.C6134s c6134s, g.K k10, g.C6118b c6118b) {
        float f10;
        float fG;
        y("Mask render", new Object[0]);
        Boolean bool = c6134s.f57406o;
        if (bool == null || !bool.booleanValue()) {
            g.C6131p c6131p = c6134s.f57410s;
            float fE = c6131p != null ? c6131p.e(this, 1.0f) : 1.2f;
            g.C6131p c6131p2 = c6134s.f57411t;
            float fE2 = c6131p2 != null ? c6131p2.e(this, 1.0f) : 1.2f;
            f10 = fE * c6118b.f57342c;
            fG = fE2 * c6118b.f57343d;
        } else {
            g.C6131p c6131p3 = c6134s.f57410s;
            f10 = c6131p3 != null ? c6131p3.f(this) : c6118b.f57342c;
            g.C6131p c6131p4 = c6134s.f57411t;
            fG = c6131p4 != null ? c6131p4.g(this) : c6118b.f57343d;
        }
        if (f10 == 0.0f || fG == 0.0f) {
            return;
        }
        S0();
        C0870h c0870hM = M(c6134s);
        this.f57433d = c0870hM;
        c0870hM.f57469a.f57244m = Float.valueOf(1.0f);
        boolean zM0 = m0();
        this.f57430a.save();
        Boolean bool2 = c6134s.f57407p;
        if (bool2 != null && !bool2.booleanValue()) {
            this.f57430a.translate(c6118b.f57340a, c6118b.f57341b);
            this.f57430a.scale(c6118b.f57342c, c6118b.f57343d);
        }
        F0(c6134s, false);
        this.f57430a.restore();
        if (zM0) {
            k0(k10, c6118b);
        }
        R0();
    }

    private void K(g.C6140y c6140y, String str) {
        g.N nR = c6140y.f57319a.r(str);
        if (nR == null) {
            Z0("Pattern reference '%s' not found", str);
            return;
        }
        if (!(nR instanceof g.C6140y)) {
            F("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (nR == c6140y) {
            F("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        g.C6140y c6140y2 = (g.C6140y) nR;
        if (c6140y.f57420q == null) {
            c6140y.f57420q = c6140y2.f57420q;
        }
        if (c6140y.f57421r == null) {
            c6140y.f57421r = c6140y2.f57421r;
        }
        if (c6140y.f57422s == null) {
            c6140y.f57422s = c6140y2.f57422s;
        }
        if (c6140y.f57423t == null) {
            c6140y.f57423t = c6140y2.f57423t;
        }
        if (c6140y.f57424u == null) {
            c6140y.f57424u = c6140y2.f57424u;
        }
        if (c6140y.f57425v == null) {
            c6140y.f57425v = c6140y2.f57425v;
        }
        if (c6140y.f57426w == null) {
            c6140y.f57426w = c6140y2.f57426w;
        }
        if (c6140y.f57298i.isEmpty()) {
            c6140y.f57298i = c6140y2.f57298i;
        }
        if (c6140y.f57327p == null) {
            c6140y.f57327p = c6140y2.f57327p;
        }
        if (c6140y.f57321o == null) {
            c6140y.f57321o = c6140y2.f57321o;
        }
        String str2 = c6140y2.f57427x;
        if (str2 != null) {
            K(c6140y, str2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void K0(g.S s10) {
        Set setA;
        String language = Locale.getDefault().getLanguage();
        q5.g.k();
        for (g.N n10 : s10.g()) {
            if (n10 instanceof g.G) {
                g.G g10 = (g.G) n10;
                if (g10.b() == null && ((setA = g10.a()) == null || (!setA.isEmpty() && setA.contains(language)))) {
                    Set setF = g10.f();
                    if (setF != null) {
                        if (f57429i == null) {
                            V();
                        }
                        if (setF.isEmpty() || !f57429i.containsAll(setF)) {
                        }
                    }
                    Set setM = g10.m();
                    if (setM != null) {
                        setM.isEmpty();
                    } else {
                        Set setN = g10.n();
                        if (setN == null) {
                            A0(n10);
                            return;
                        }
                        setN.isEmpty();
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void L(q5.g.K r21, android.graphics.Path r22, q5.g.C6140y r23) {
        /*
            Method dump skipped, instruction units count: 530
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.h.L(q5.g$K, android.graphics.Path, q5.g$y):void");
    }

    private void L0(g.Z z10) {
        y("TextPath render", new Object[0]);
        W0(this.f57433d, z10);
        if (A() && Y0()) {
            g.N nR = z10.f57319a.r(z10.f57332o);
            if (nR == null) {
                F("TextPath reference '%s' not found", z10.f57332o);
                return;
            }
            g.C6137v c6137v = (g.C6137v) nR;
            Path pathF = new d(c6137v.f57414o).f();
            Matrix matrix = c6137v.f57386n;
            if (matrix != null) {
                pathF.transform(matrix);
            }
            PathMeasure pathMeasure = new PathMeasure(pathF, false);
            g.C6131p c6131p = z10.f57333p;
            float fE = c6131p != null ? c6131p.e(this, pathMeasure.getLength()) : 0.0f;
            g.E.f fVarO = O();
            if (fVarO != g.E.f.Start) {
                float fN = n(z10);
                if (fVarO == g.E.f.Middle) {
                    fN /= 2.0f;
                }
                fE -= fN;
            }
            r((g.K) z10.d());
            boolean zM0 = m0();
            E(z10, new e(pathF, fE, 0.0f));
            if (zM0) {
                j0(z10);
            }
        }
    }

    private C0870h M(g.N n10) {
        C0870h c0870h = new C0870h();
        V0(c0870h, g.E.a());
        return N(n10, c0870h);
    }

    private boolean M0() {
        return this.f57433d.f57469a.f57244m.floatValue() < 1.0f || this.f57433d.f57469a.f57225G != null;
    }

    private C0870h N(g.N n10, C0870h c0870h) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (n10 instanceof g.L) {
                arrayList.add(0, (g.L) n10);
            }
            Object obj = n10.f57320b;
            if (obj == null) {
                break;
            }
            n10 = (g.N) obj;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            W0(c0870h, (g.L) it.next());
        }
        C0870h c0870h2 = this.f57433d;
        c0870h.f57475g = c0870h2.f57475g;
        c0870h.f57474f = c0870h2.f57474f;
        return c0870h;
    }

    private void N0() {
        this.f57433d = new C0870h();
        this.f57434e = new Stack();
        V0(this.f57433d, g.E.a());
        C0870h c0870h = this.f57433d;
        c0870h.f57474f = null;
        c0870h.f57476h = false;
        this.f57434e.push(new C0870h(c0870h));
        this.f57436g = new Stack();
        this.f57435f = new Stack();
    }

    private g.E.f O() {
        g.E.f fVar;
        g.E e10 = this.f57433d.f57469a;
        if (e10.f57251t == g.E.h.LTR || (fVar = e10.f57252u) == g.E.f.Middle) {
            return e10.f57252u;
        }
        g.E.f fVar2 = g.E.f.Start;
        return fVar == fVar2 ? g.E.f.End : fVar2;
    }

    private void O0(float f10, float f11, float f12, float f13) {
        float f14 = f12 + f10;
        float fG = f13 + f11;
        g.C6119c c6119c = this.f57433d.f57469a.f57254w;
        if (c6119c != null) {
            f10 += c6119c.f57347d.f(this);
            f11 += this.f57433d.f57469a.f57254w.f57344a.g(this);
            f14 -= this.f57433d.f57469a.f57254w.f57345b.f(this);
            fG -= this.f57433d.f57469a.f57254w.f57346c.g(this);
        }
        this.f57430a.clipRect(f10, f11, f14, fG);
    }

    private Path.FillType P() {
        g.E.a aVar = this.f57433d.f57469a.f57224F;
        return (aVar == null || aVar != g.E.a.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    private void P0(C0870h c0870h, boolean z10, g.O o10) {
        int i10;
        g.E e10 = c0870h.f57469a;
        float fFloatValue = (z10 ? e10.f57234d : e10.f57236f).floatValue();
        if (o10 instanceof g.C6122f) {
            i10 = ((g.C6122f) o10).f57371a;
        } else if (!(o10 instanceof g.C0869g)) {
            return;
        } else {
            i10 = c0870h.f57469a.f57245n.f57371a;
        }
        int iX = x(i10, fFloatValue);
        if (z10) {
            c0870h.f57472d.setColor(iX);
        } else {
            c0870h.f57473e.setColor(iX);
        }
    }

    private void Q0(boolean z10, g.C c10) {
        if (z10) {
            if (W(c10.f57312e, 2147483648L)) {
                C0870h c0870h = this.f57433d;
                g.E e10 = c0870h.f57469a;
                g.O o10 = c10.f57312e.f57226H;
                e10.f57232b = o10;
                c0870h.f57470b = o10 != null;
            }
            if (W(c10.f57312e, 4294967296L)) {
                this.f57433d.f57469a.f57234d = c10.f57312e.f57227I;
            }
            if (W(c10.f57312e, 6442450944L)) {
                C0870h c0870h2 = this.f57433d;
                P0(c0870h2, z10, c0870h2.f57469a.f57232b);
                return;
            }
            return;
        }
        if (W(c10.f57312e, 2147483648L)) {
            C0870h c0870h3 = this.f57433d;
            g.E e11 = c0870h3.f57469a;
            g.O o11 = c10.f57312e.f57226H;
            e11.f57235e = o11;
            c0870h3.f57471c = o11 != null;
        }
        if (W(c10.f57312e, 4294967296L)) {
            this.f57433d.f57469a.f57236f = c10.f57312e.f57227I;
        }
        if (W(c10.f57312e, 6442450944L)) {
            C0870h c0870h4 = this.f57433d;
            P0(c0870h4, z10, c0870h4.f57469a.f57235e);
        }
    }

    private void R0() {
        this.f57430a.restore();
        this.f57433d = (C0870h) this.f57434e.pop();
    }

    private void S0() {
        this.f57430a.save();
        this.f57434e.push(this.f57433d);
        this.f57433d = new C0870h(this.f57433d);
    }

    private String T0(String str, boolean z10, boolean z11) {
        if (this.f57433d.f57476h) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String strReplaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z10) {
            strReplaceAll = strReplaceAll.replaceAll("^\\s+", "");
        }
        if (z11) {
            strReplaceAll = strReplaceAll.replaceAll("\\s+$", "");
        }
        return strReplaceAll.replaceAll("\\s{2,}", " ");
    }

    private Path.FillType U() {
        g.E.a aVar = this.f57433d.f57469a.f57233c;
        return (aVar == null || aVar != g.E.a.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    private void U0(g.K k10) {
        if (k10.f57320b == null || k10.f57309h == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (((Matrix) this.f57436g.peek()).invert(matrix)) {
            g.C6118b c6118b = k10.f57309h;
            float f10 = c6118b.f57340a;
            float f11 = c6118b.f57341b;
            float fB = c6118b.b();
            g.C6118b c6118b2 = k10.f57309h;
            float f12 = c6118b2.f57341b;
            float fB2 = c6118b2.b();
            float fC = k10.f57309h.c();
            g.C6118b c6118b3 = k10.f57309h;
            float[] fArr = {f10, f11, fB, f12, fB2, fC, c6118b3.f57340a, c6118b3.c()};
            matrix.preConcat(this.f57430a.getMatrix());
            matrix.mapPoints(fArr);
            float f13 = fArr[0];
            float f14 = fArr[1];
            RectF rectF = new RectF(f13, f14, f13, f14);
            for (int i10 = 2; i10 <= 6; i10 += 2) {
                float f15 = fArr[i10];
                if (f15 < rectF.left) {
                    rectF.left = f15;
                }
                if (f15 > rectF.right) {
                    rectF.right = f15;
                }
                float f16 = fArr[i10 + 1];
                if (f16 < rectF.top) {
                    rectF.top = f16;
                }
                if (f16 > rectF.bottom) {
                    rectF.bottom = f16;
                }
            }
            g.K k11 = (g.K) this.f57435f.peek();
            g.C6118b c6118b4 = k11.f57309h;
            if (c6118b4 == null) {
                k11.f57309h = g.C6118b.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
            } else {
                c6118b4.e(g.C6118b.a(rectF.left, rectF.top, rectF.right, rectF.bottom));
            }
        }
    }

    private static synchronized void V() {
        HashSet hashSet = new HashSet();
        f57429i = hashSet;
        hashSet.add("Structure");
        f57429i.add("BasicStructure");
        f57429i.add("ConditionalProcessing");
        f57429i.add("Image");
        f57429i.add("Style");
        f57429i.add("ViewportAttribute");
        f57429i.add("Shape");
        f57429i.add("BasicText");
        f57429i.add("PaintAttribute");
        f57429i.add("BasicPaintAttribute");
        f57429i.add("OpacityAttribute");
        f57429i.add("BasicGraphicsAttribute");
        f57429i.add("Marker");
        f57429i.add("Gradient");
        f57429i.add("Pattern");
        f57429i.add("Clip");
        f57429i.add("BasicClip");
        f57429i.add("Mask");
        f57429i.add("View");
    }

    private void V0(C0870h c0870h, g.E e10) {
        if (W(e10, 4096L)) {
            c0870h.f57469a.f57245n = e10.f57245n;
        }
        if (W(e10, 2048L)) {
            c0870h.f57469a.f57244m = e10.f57244m;
        }
        if (W(e10, 1L)) {
            c0870h.f57469a.f57232b = e10.f57232b;
            g.O o10 = e10.f57232b;
            c0870h.f57470b = (o10 == null || o10 == g.C6122f.f57370c) ? false : true;
        }
        if (W(e10, 4L)) {
            c0870h.f57469a.f57234d = e10.f57234d;
        }
        if (W(e10, 6149L)) {
            P0(c0870h, true, c0870h.f57469a.f57232b);
        }
        if (W(e10, 2L)) {
            c0870h.f57469a.f57233c = e10.f57233c;
        }
        if (W(e10, 8L)) {
            c0870h.f57469a.f57235e = e10.f57235e;
            g.O o11 = e10.f57235e;
            c0870h.f57471c = (o11 == null || o11 == g.C6122f.f57370c) ? false : true;
        }
        if (W(e10, 16L)) {
            c0870h.f57469a.f57236f = e10.f57236f;
        }
        if (W(e10, 6168L)) {
            P0(c0870h, false, c0870h.f57469a.f57235e);
        }
        if (W(e10, 34359738368L)) {
            c0870h.f57469a.f57230Z = e10.f57230Z;
        }
        if (W(e10, 32L)) {
            g.E e11 = c0870h.f57469a;
            g.C6131p c6131p = e10.f57237g;
            e11.f57237g = c6131p;
            c0870h.f57473e.setStrokeWidth(c6131p.d(this));
        }
        if (W(e10, 64L)) {
            c0870h.f57469a.f57238h = e10.f57238h;
            int i10 = a.f57439b[e10.f57238h.ordinal()];
            if (i10 == 1) {
                c0870h.f57473e.setStrokeCap(Paint.Cap.BUTT);
            } else if (i10 == 2) {
                c0870h.f57473e.setStrokeCap(Paint.Cap.ROUND);
            } else if (i10 == 3) {
                c0870h.f57473e.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (W(e10, 128L)) {
            c0870h.f57469a.f57239i = e10.f57239i;
            int i11 = a.f57440c[e10.f57239i.ordinal()];
            if (i11 == 1) {
                c0870h.f57473e.setStrokeJoin(Paint.Join.MITER);
            } else if (i11 == 2) {
                c0870h.f57473e.setStrokeJoin(Paint.Join.ROUND);
            } else if (i11 == 3) {
                c0870h.f57473e.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (W(e10, 256L)) {
            c0870h.f57469a.f57240j = e10.f57240j;
            c0870h.f57473e.setStrokeMiter(e10.f57240j.floatValue());
        }
        if (W(e10, 512L)) {
            c0870h.f57469a.f57241k = e10.f57241k;
        }
        if (W(e10, 1024L)) {
            c0870h.f57469a.f57242l = e10.f57242l;
        }
        Typeface typefaceT = null;
        if (W(e10, 1536L)) {
            g.C6131p[] c6131pArr = c0870h.f57469a.f57241k;
            if (c6131pArr == null) {
                c0870h.f57473e.setPathEffect(null);
            } else {
                int length = c6131pArr.length;
                int i12 = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i12];
                float f10 = 0.0f;
                for (int i13 = 0; i13 < i12; i13++) {
                    float fD = c0870h.f57469a.f57241k[i13 % length].d(this);
                    fArr[i13] = fD;
                    f10 += fD;
                }
                if (f10 == 0.0f) {
                    c0870h.f57473e.setPathEffect(null);
                } else {
                    float fD2 = c0870h.f57469a.f57242l.d(this);
                    if (fD2 < 0.0f) {
                        fD2 = (fD2 % f10) + f10;
                    }
                    c0870h.f57473e.setPathEffect(new DashPathEffect(fArr, fD2));
                }
            }
        }
        if (W(e10, 16384L)) {
            float fQ = Q();
            c0870h.f57469a.f57247p = e10.f57247p;
            c0870h.f57472d.setTextSize(e10.f57247p.e(this, fQ));
            c0870h.f57473e.setTextSize(e10.f57247p.e(this, fQ));
        }
        if (W(e10, 8192L)) {
            c0870h.f57469a.f57246o = e10.f57246o;
        }
        if (W(e10, 32768L)) {
            if (e10.f57248q.intValue() == -1 && c0870h.f57469a.f57248q.intValue() > 100) {
                g.E e12 = c0870h.f57469a;
                e12.f57248q = Integer.valueOf(e12.f57248q.intValue() - 100);
            } else if (e10.f57248q.intValue() != 1 || c0870h.f57469a.f57248q.intValue() >= 900) {
                c0870h.f57469a.f57248q = e10.f57248q;
            } else {
                g.E e13 = c0870h.f57469a;
                e13.f57248q = Integer.valueOf(e13.f57248q.intValue() + 100);
            }
        }
        if (W(e10, 65536L)) {
            c0870h.f57469a.f57249r = e10.f57249r;
        }
        if (W(e10, 106496L)) {
            if (c0870h.f57469a.f57246o != null && this.f57432c != null) {
                q5.g.k();
                for (String str : c0870h.f57469a.f57246o) {
                    g.E e14 = c0870h.f57469a;
                    typefaceT = t(str, e14.f57248q, e14.f57249r);
                    if (typefaceT != null) {
                        break;
                    }
                }
            }
            if (typefaceT == null) {
                g.E e15 = c0870h.f57469a;
                typefaceT = t("serif", e15.f57248q, e15.f57249r);
            }
            c0870h.f57472d.setTypeface(typefaceT);
            c0870h.f57473e.setTypeface(typefaceT);
        }
        if (W(e10, 131072L)) {
            c0870h.f57469a.f57250s = e10.f57250s;
            Paint paint = c0870h.f57472d;
            g.E.EnumC0868g enumC0868g = e10.f57250s;
            g.E.EnumC0868g enumC0868g2 = g.E.EnumC0868g.LineThrough;
            paint.setStrikeThruText(enumC0868g == enumC0868g2);
            Paint paint2 = c0870h.f57472d;
            g.E.EnumC0868g enumC0868g3 = e10.f57250s;
            g.E.EnumC0868g enumC0868g4 = g.E.EnumC0868g.Underline;
            paint2.setUnderlineText(enumC0868g3 == enumC0868g4);
            c0870h.f57473e.setStrikeThruText(e10.f57250s == enumC0868g2);
            c0870h.f57473e.setUnderlineText(e10.f57250s == enumC0868g4);
        }
        if (W(e10, 68719476736L)) {
            c0870h.f57469a.f57251t = e10.f57251t;
        }
        if (W(e10, 262144L)) {
            c0870h.f57469a.f57252u = e10.f57252u;
        }
        if (W(e10, 524288L)) {
            c0870h.f57469a.f57253v = e10.f57253v;
        }
        if (W(e10, 2097152L)) {
            c0870h.f57469a.f57255x = e10.f57255x;
        }
        if (W(e10, 4194304L)) {
            c0870h.f57469a.f57256y = e10.f57256y;
        }
        if (W(e10, 8388608L)) {
            c0870h.f57469a.f57257z = e10.f57257z;
        }
        if (W(e10, 16777216L)) {
            c0870h.f57469a.f57219A = e10.f57219A;
        }
        if (W(e10, 33554432L)) {
            c0870h.f57469a.f57220B = e10.f57220B;
        }
        if (W(e10, C5322z3.MAX_EVENT_SIZE_BYTES)) {
            c0870h.f57469a.f57254w = e10.f57254w;
        }
        if (W(e10, 268435456L)) {
            c0870h.f57469a.f57223E = e10.f57223E;
        }
        if (W(e10, 536870912L)) {
            c0870h.f57469a.f57224F = e10.f57224F;
        }
        if (W(e10, 1073741824L)) {
            c0870h.f57469a.f57225G = e10.f57225G;
        }
        if (W(e10, 67108864L)) {
            c0870h.f57469a.f57221C = e10.f57221C;
        }
        if (W(e10, 134217728L)) {
            c0870h.f57469a.f57222D = e10.f57222D;
        }
        if (W(e10, 8589934592L)) {
            c0870h.f57469a.f57228X = e10.f57228X;
        }
        if (W(e10, 17179869184L)) {
            c0870h.f57469a.f57229Y = e10.f57229Y;
        }
        if (W(e10, 137438953472L)) {
            c0870h.f57469a.f57243l0 = e10.f57243l0;
        }
    }

    private boolean W(g.E e10, long j10) {
        return (e10.f57231a & j10) != 0;
    }

    private void W0(C0870h c0870h, g.L l10) {
        c0870h.f57469a.c(l10.f57320b == null);
        g.E e10 = l10.f57312e;
        if (e10 != null) {
            V0(c0870h, e10);
        }
        if (this.f57432c.n()) {
            for (C6116b.p pVar : this.f57432c.d()) {
                if (C6116b.l(this.f57437h, pVar.f57155a, l10)) {
                    V0(c0870h, pVar.f57156b);
                }
            }
        }
        g.E e11 = l10.f57313f;
        if (e11 != null) {
            V0(c0870h, e11);
        }
    }

    private void X(boolean z10, g.C6118b c6118b, g.M m10) {
        float fE;
        float f10;
        float fE2;
        float f11;
        String str = m10.f57381l;
        if (str != null) {
            H(m10, str);
        }
        Boolean bool = m10.f57378i;
        int i10 = 0;
        boolean z11 = bool != null && bool.booleanValue();
        C0870h c0870h = this.f57433d;
        Paint paint = z10 ? c0870h.f57472d : c0870h.f57473e;
        if (z11) {
            g.C6118b c6118bS = S();
            g.C6131p c6131p = m10.f57315m;
            float f12 = c6131p != null ? c6131p.f(this) : 0.0f;
            g.C6131p c6131p2 = m10.f57316n;
            fE = c6131p2 != null ? c6131p2.g(this) : 0.0f;
            g.C6131p c6131p3 = m10.f57317o;
            float f13 = c6131p3 != null ? c6131p3.f(this) : c6118bS.f57342c;
            g.C6131p c6131p4 = m10.f57318p;
            f11 = f13;
            f10 = f12;
            fE2 = c6131p4 != null ? c6131p4.g(this) : 0.0f;
        } else {
            g.C6131p c6131p5 = m10.f57315m;
            float fE3 = c6131p5 != null ? c6131p5.e(this, 1.0f) : 0.0f;
            g.C6131p c6131p6 = m10.f57316n;
            fE = c6131p6 != null ? c6131p6.e(this, 1.0f) : 0.0f;
            g.C6131p c6131p7 = m10.f57317o;
            float fE4 = c6131p7 != null ? c6131p7.e(this, 1.0f) : 1.0f;
            g.C6131p c6131p8 = m10.f57318p;
            f10 = fE3;
            fE2 = c6131p8 != null ? c6131p8.e(this, 1.0f) : 0.0f;
            f11 = fE4;
        }
        float f14 = fE;
        S0();
        this.f57433d = M(m10);
        Matrix matrix = new Matrix();
        if (!z11) {
            matrix.preTranslate(c6118b.f57340a, c6118b.f57341b);
            matrix.preScale(c6118b.f57342c, c6118b.f57343d);
        }
        Matrix matrix2 = m10.f57379j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = m10.f57377h.size();
        if (size == 0) {
            R0();
            if (z10) {
                this.f57433d.f57470b = false;
                return;
            } else {
                this.f57433d.f57471c = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        Iterator it = m10.f57377h.iterator();
        float f15 = -1.0f;
        while (it.hasNext()) {
            g.D d10 = (g.D) ((g.N) it.next());
            Float f16 = d10.f57218h;
            float fFloatValue = f16 != null ? f16.floatValue() : 0.0f;
            if (i10 == 0 || fFloatValue >= f15) {
                fArr[i10] = fFloatValue;
                f15 = fFloatValue;
            } else {
                fArr[i10] = f15;
            }
            S0();
            W0(this.f57433d, d10);
            g.E e10 = this.f57433d.f57469a;
            g.C6122f c6122f = (g.C6122f) e10.f57221C;
            if (c6122f == null) {
                c6122f = g.C6122f.f57369b;
            }
            iArr[i10] = x(c6122f.f57371a, e10.f57222D.floatValue());
            i10++;
            R0();
        }
        if ((f10 == f11 && f14 == fE2) || size == 1) {
            R0();
            paint.setColor(iArr[size - 1]);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        g.EnumC6126k enumC6126k = m10.f57380k;
        if (enumC6126k != null) {
            if (enumC6126k == g.EnumC6126k.reflect) {
                tileMode = Shader.TileMode.MIRROR;
            } else if (enumC6126k == g.EnumC6126k.repeat) {
                tileMode = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode2 = tileMode;
        R0();
        LinearGradient linearGradient = new LinearGradient(f10, f14, f11, fE2, iArr, fArr, tileMode2);
        linearGradient.setLocalMatrix(matrix);
        paint.setShader(linearGradient);
        paint.setAlpha(w(this.f57433d.f57469a.f57234d.floatValue()));
    }

    private void X0() {
        int iX;
        g.E e10 = this.f57433d.f57469a;
        g.O o10 = e10.f57228X;
        if (o10 instanceof g.C6122f) {
            iX = ((g.C6122f) o10).f57371a;
        } else if (!(o10 instanceof g.C0869g)) {
            return;
        } else {
            iX = e10.f57245n.f57371a;
        }
        Float f10 = e10.f57229Y;
        if (f10 != null) {
            iX = x(iX, f10.floatValue());
        }
        this.f57430a.drawColor(iX);
    }

    private Path Y(g.C6120d c6120d) {
        g.C6131p c6131p = c6120d.f57350o;
        float f10 = c6131p != null ? c6131p.f(this) : 0.0f;
        g.C6131p c6131p2 = c6120d.f57351p;
        float fG = c6131p2 != null ? c6131p2.g(this) : 0.0f;
        float fD = c6120d.f57352q.d(this);
        float f11 = f10 - fD;
        float f12 = fG - fD;
        float f13 = f10 + fD;
        float f14 = fG + fD;
        if (c6120d.f57309h == null) {
            float f15 = 2.0f * fD;
            c6120d.f57309h = new g.C6118b(f11, f12, f15, f15);
        }
        float f16 = fD * 0.5522848f;
        Path path = new Path();
        path.moveTo(f10, f12);
        float f17 = f10 + f16;
        float f18 = fG - f16;
        path.cubicTo(f17, f12, f13, f18, f13, fG);
        float f19 = fG + f16;
        path.cubicTo(f13, f19, f17, f14, f10, f14);
        float f20 = f10 - f16;
        path.cubicTo(f20, f14, f11, f19, f11, fG);
        path.cubicTo(f11, f18, f20, f12, f10, f12);
        path.close();
        return path;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Y0() {
        Boolean bool = this.f57433d.f57469a.f57220B;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private Path Z(g.C6124i c6124i) {
        g.C6131p c6131p = c6124i.f57373o;
        float f10 = c6131p != null ? c6131p.f(this) : 0.0f;
        g.C6131p c6131p2 = c6124i.f57374p;
        float fG = c6131p2 != null ? c6131p2.g(this) : 0.0f;
        float f11 = c6124i.f57375q.f(this);
        float fG2 = c6124i.f57376r.g(this);
        float f12 = f10 - f11;
        float f13 = fG - fG2;
        float f14 = f10 + f11;
        float f15 = fG + fG2;
        if (c6124i.f57309h == null) {
            c6124i.f57309h = new g.C6118b(f12, f13, f11 * 2.0f, 2.0f * fG2);
        }
        float f16 = f11 * 0.5522848f;
        float f17 = fG2 * 0.5522848f;
        Path path = new Path();
        path.moveTo(f10, f13);
        float f18 = f10 + f16;
        float f19 = fG - f17;
        path.cubicTo(f18, f13, f14, f19, f14, fG);
        float f20 = fG + f17;
        path.cubicTo(f14, f20, f18, f15, f10, f15);
        float f21 = f10 - f16;
        path.cubicTo(f21, f15, f12, f20, f12, fG);
        path.cubicTo(f12, f19, f21, f13, f10, f13);
        path.close();
        return path;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Z0(String str, Object... objArr) {
        Log.w("SVGAndroidRenderer", String.format(str, objArr));
    }

    private Path a0(g.C6132q c6132q) {
        g.C6131p c6131p = c6132q.f57396o;
        float f10 = c6131p == null ? 0.0f : c6131p.f(this);
        g.C6131p c6131p2 = c6132q.f57397p;
        float fG = c6131p2 == null ? 0.0f : c6131p2.g(this);
        g.C6131p c6131p3 = c6132q.f57398q;
        float f11 = c6131p3 == null ? 0.0f : c6131p3.f(this);
        g.C6131p c6131p4 = c6132q.f57399r;
        float fG2 = c6131p4 != null ? c6131p4.g(this) : 0.0f;
        if (c6132q.f57309h == null) {
            c6132q.f57309h = new g.C6118b(Math.min(f10, f11), Math.min(fG, fG2), Math.abs(f11 - f10), Math.abs(fG2 - fG));
        }
        Path path = new Path();
        path.moveTo(f10, fG);
        path.lineTo(f11, fG2);
        return path;
    }

    private Path b0(g.C6141z c6141z) {
        Path path = new Path();
        float[] fArr = c6141z.f57428o;
        path.moveTo(fArr[0], fArr[1]);
        int i10 = 2;
        while (true) {
            float[] fArr2 = c6141z.f57428o;
            if (i10 >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i10], fArr2[i10 + 1]);
            i10 += 2;
        }
        if (c6141z instanceof g.A) {
            path.close();
        }
        if (c6141z.f57309h == null) {
            c6141z.f57309h = m(path);
        }
        return path;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.graphics.Path c0(q5.g.B r20) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.h.c0(q5.g$B):android.graphics.Path");
    }

    private Path d0(g.W w10) {
        List list = w10.f57336o;
        float fG = 0.0f;
        float f10 = (list == null || list.size() == 0) ? 0.0f : ((g.C6131p) w10.f57336o.get(0)).f(this);
        List list2 = w10.f57337p;
        float fG2 = (list2 == null || list2.size() == 0) ? 0.0f : ((g.C6131p) w10.f57337p.get(0)).g(this);
        List list3 = w10.f57338q;
        float f11 = (list3 == null || list3.size() == 0) ? 0.0f : ((g.C6131p) w10.f57338q.get(0)).f(this);
        List list4 = w10.f57339r;
        if (list4 != null && list4.size() != 0) {
            fG = ((g.C6131p) w10.f57339r.get(0)).g(this);
        }
        if (this.f57433d.f57469a.f57252u != g.E.f.Start) {
            float fN = n(w10);
            if (this.f57433d.f57469a.f57252u == g.E.f.Middle) {
                fN /= 2.0f;
            }
            f10 -= fN;
        }
        if (w10.f57309h == null) {
            i iVar = new i(f10, fG2);
            E(w10, iVar);
            RectF rectF = iVar.f57480d;
            w10.f57309h = new g.C6118b(rectF.left, rectF.top, rectF.width(), iVar.f57480d.height());
        }
        Path path = new Path();
        E(w10, new g(f10 + f11, fG2 + fG, path));
        return path;
    }

    private void e0(boolean z10, g.C6118b c6118b, g.Q q10) {
        float f10;
        float fE;
        float f11;
        String str = q10.f57381l;
        if (str != null) {
            H(q10, str);
        }
        Boolean bool = q10.f57378i;
        int i10 = 0;
        boolean z11 = bool != null && bool.booleanValue();
        C0870h c0870h = this.f57433d;
        Paint paint = z10 ? c0870h.f57472d : c0870h.f57473e;
        if (z11) {
            g.C6131p c6131p = new g.C6131p(50.0f, g.d0.percent);
            g.C6131p c6131p2 = q10.f57322m;
            float f12 = c6131p2 != null ? c6131p2.f(this) : c6131p.f(this);
            g.C6131p c6131p3 = q10.f57323n;
            float fG = c6131p3 != null ? c6131p3.g(this) : c6131p.g(this);
            g.C6131p c6131p4 = q10.f57324o;
            fE = c6131p4 != null ? c6131p4.d(this) : c6131p.d(this);
            f10 = f12;
            f11 = fG;
        } else {
            g.C6131p c6131p5 = q10.f57322m;
            float fE2 = c6131p5 != null ? c6131p5.e(this, 1.0f) : 0.5f;
            g.C6131p c6131p6 = q10.f57323n;
            float fE3 = c6131p6 != null ? c6131p6.e(this, 1.0f) : 0.5f;
            g.C6131p c6131p7 = q10.f57324o;
            f10 = fE2;
            fE = c6131p7 != null ? c6131p7.e(this, 1.0f) : 0.5f;
            f11 = fE3;
        }
        S0();
        this.f57433d = M(q10);
        Matrix matrix = new Matrix();
        if (!z11) {
            matrix.preTranslate(c6118b.f57340a, c6118b.f57341b);
            matrix.preScale(c6118b.f57342c, c6118b.f57343d);
        }
        Matrix matrix2 = q10.f57379j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = q10.f57377h.size();
        if (size == 0) {
            R0();
            if (z10) {
                this.f57433d.f57470b = false;
                return;
            } else {
                this.f57433d.f57471c = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        Iterator it = q10.f57377h.iterator();
        float f13 = -1.0f;
        while (it.hasNext()) {
            g.D d10 = (g.D) ((g.N) it.next());
            Float f14 = d10.f57218h;
            float fFloatValue = f14 != null ? f14.floatValue() : 0.0f;
            if (i10 == 0 || fFloatValue >= f13) {
                fArr[i10] = fFloatValue;
                f13 = fFloatValue;
            } else {
                fArr[i10] = f13;
            }
            S0();
            W0(this.f57433d, d10);
            g.E e10 = this.f57433d.f57469a;
            g.C6122f c6122f = (g.C6122f) e10.f57221C;
            if (c6122f == null) {
                c6122f = g.C6122f.f57369b;
            }
            iArr[i10] = x(c6122f.f57371a, e10.f57222D.floatValue());
            i10++;
            R0();
        }
        if (fE == 0.0f || size == 1) {
            R0();
            paint.setColor(iArr[size - 1]);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        g.EnumC6126k enumC6126k = q10.f57380k;
        if (enumC6126k != null) {
            if (enumC6126k == g.EnumC6126k.reflect) {
                tileMode = Shader.TileMode.MIRROR;
            } else if (enumC6126k == g.EnumC6126k.repeat) {
                tileMode = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode2 = tileMode;
        R0();
        RadialGradient radialGradient = new RadialGradient(f10, f11, fE, iArr, fArr, tileMode2);
        radialGradient.setLocalMatrix(matrix);
        paint.setShader(radialGradient);
        paint.setAlpha(w(this.f57433d.f57469a.f57234d.floatValue()));
    }

    private g.C6118b f0(g.C6131p c6131p, g.C6131p c6131p2, g.C6131p c6131p3, g.C6131p c6131p4) {
        float f10 = c6131p != null ? c6131p.f(this) : 0.0f;
        float fG = c6131p2 != null ? c6131p2.g(this) : 0.0f;
        g.C6118b c6118bS = S();
        return new g.C6118b(f10, fG, c6131p3 != null ? c6131p3.f(this) : c6118bS.f57342c, c6131p4 != null ? c6131p4.g(this) : c6118bS.f57343d);
    }

    private Path g0(g.K k10, boolean z10) {
        Path pathD0;
        Path pathJ;
        this.f57434e.push(this.f57433d);
        C0870h c0870h = new C0870h(this.f57433d);
        this.f57433d = c0870h;
        W0(c0870h, k10);
        if (!A() || !Y0()) {
            this.f57433d = (C0870h) this.f57434e.pop();
            return null;
        }
        if (k10 instanceof g.e0) {
            if (!z10) {
                F("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            g.e0 e0Var = (g.e0) k10;
            g.N nR = k10.f57319a.r(e0Var.f57364p);
            if (nR == null) {
                F("Use reference '%s' not found", e0Var.f57364p);
                this.f57433d = (C0870h) this.f57434e.pop();
                return null;
            }
            if (!(nR instanceof g.K)) {
                this.f57433d = (C0870h) this.f57434e.pop();
                return null;
            }
            pathD0 = g0((g.K) nR, false);
            if (pathD0 == null) {
                return null;
            }
            if (e0Var.f57309h == null) {
                e0Var.f57309h = m(pathD0);
            }
            Matrix matrix = e0Var.f57387o;
            if (matrix != null) {
                pathD0.transform(matrix);
            }
        } else if (k10 instanceof g.AbstractC6127l) {
            g.AbstractC6127l abstractC6127l = (g.AbstractC6127l) k10;
            if (k10 instanceof g.C6137v) {
                pathD0 = new d(((g.C6137v) k10).f57414o).f();
                if (k10.f57309h == null) {
                    k10.f57309h = m(pathD0);
                }
            } else {
                pathD0 = k10 instanceof g.B ? c0((g.B) k10) : k10 instanceof g.C6120d ? Y((g.C6120d) k10) : k10 instanceof g.C6124i ? Z((g.C6124i) k10) : k10 instanceof g.C6141z ? b0((g.C6141z) k10) : null;
            }
            if (pathD0 == null) {
                return null;
            }
            if (abstractC6127l.f57309h == null) {
                abstractC6127l.f57309h = m(pathD0);
            }
            Matrix matrix2 = abstractC6127l.f57386n;
            if (matrix2 != null) {
                pathD0.transform(matrix2);
            }
            pathD0.setFillType(P());
        } else {
            if (!(k10 instanceof g.W)) {
                F("Invalid %s element found in clipPath definition", k10.o());
                return null;
            }
            g.W w10 = (g.W) k10;
            pathD0 = d0(w10);
            if (pathD0 == null) {
                return null;
            }
            Matrix matrix3 = w10.f57331s;
            if (matrix3 != null) {
                pathD0.transform(matrix3);
            }
            pathD0.setFillType(P());
        }
        if (this.f57433d.f57469a.f57223E != null && (pathJ = j(k10, k10.f57309h)) != null) {
            pathD0.op(pathJ, Path.Op.INTERSECT);
        }
        this.f57433d = (C0870h) this.f57434e.pop();
        return pathD0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(float f10, float f11, float f12, float f13, float f14, boolean z10, boolean z11, float f15, float f16, g.InterfaceC6139x interfaceC6139x) {
        if (f10 == f15 && f11 == f16) {
            return;
        }
        if (f12 == 0.0f || f13 == 0.0f) {
            interfaceC6139x.c(f15, f16);
            return;
        }
        float fAbs = Math.abs(f12);
        float fAbs2 = Math.abs(f13);
        double radians = Math.toRadians(((double) f14) % 360.0d);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d10 = ((double) (f10 - f15)) / 2.0d;
        double d11 = ((double) (f11 - f16)) / 2.0d;
        double d12 = (dCos * d10) + (dSin * d11);
        double d13 = ((-dSin) * d10) + (dCos * d11);
        double d14 = fAbs * fAbs;
        double d15 = fAbs2 * fAbs2;
        double d16 = d12 * d12;
        double d17 = d13 * d13;
        double d18 = (d16 / d14) + (d17 / d15);
        if (d18 > 0.99999d) {
            double dSqrt = Math.sqrt(d18) * 1.00001d;
            fAbs = (float) (((double) fAbs) * dSqrt);
            fAbs2 = (float) (dSqrt * ((double) fAbs2));
            d14 = fAbs * fAbs;
            d15 = fAbs2 * fAbs2;
        }
        double d19 = z10 == z11 ? -1.0d : 1.0d;
        double d20 = d14 * d15;
        double d21 = d14 * d17;
        double d22 = d15 * d16;
        double d23 = ((d20 - d21) - d22) / (d21 + d22);
        if (d23 < 0.0d) {
            d23 = 0.0d;
        }
        double dSqrt2 = d19 * Math.sqrt(d23);
        double d24 = fAbs;
        double d25 = fAbs2;
        double d26 = ((d24 * d13) / d25) * dSqrt2;
        double d27 = (-((d25 * d12) / d24)) * dSqrt2;
        double d28 = (((double) (f10 + f15)) / 2.0d) + ((dCos * d26) - (dSin * d27));
        double d29 = (((double) (f11 + f16)) / 2.0d) + (dSin * d26) + (dCos * d27);
        double d30 = (d12 - d26) / d24;
        double d31 = (d13 - d27) / d25;
        double d32 = ((-d12) - d26) / d24;
        double d33 = ((-d13) - d27) / d25;
        double d34 = (d30 * d30) + (d31 * d31);
        double dAcos = (d31 < 0.0d ? -1.0d : 1.0d) * Math.acos(d30 / Math.sqrt(d34));
        double dV = ((d30 * d33) - (d31 * d32) < 0.0d ? -1.0d : 1.0d) * v(((d30 * d32) + (d31 * d33)) / Math.sqrt(d34 * ((d32 * d32) + (d33 * d33))));
        if (!z11 && dV > 0.0d) {
            dV -= 6.283185307179586d;
        } else if (z11 && dV < 0.0d) {
            dV += 6.283185307179586d;
        }
        float[] fArrI = i(dAcos % 6.283185307179586d, dV % 6.283185307179586d);
        Matrix matrix = new Matrix();
        matrix.postScale(fAbs, fAbs2);
        matrix.postRotate(f14);
        matrix.postTranslate((float) d28, (float) d29);
        matrix.mapPoints(fArrI);
        fArrI[fArrI.length - 2] = f15;
        fArrI[fArrI.length - 1] = f16;
        for (int i10 = 0; i10 < fArrI.length; i10 += 6) {
            interfaceC6139x.b(fArrI[i10], fArrI[i10 + 1], fArrI[i10 + 2], fArrI[i10 + 3], fArrI[i10 + 4], fArrI[i10 + 5]);
        }
    }

    private void h0() {
        this.f57435f.pop();
        this.f57436g.pop();
    }

    private static float[] i(double d10, double d11) {
        int iCeil = (int) Math.ceil((Math.abs(d11) * 2.0d) / 3.141592653589793d);
        double d12 = d11 / ((double) iCeil);
        double d13 = d12 / 2.0d;
        double dSin = (Math.sin(d13) * 1.3333333333333333d) / (Math.cos(d13) + 1.0d);
        float[] fArr = new float[iCeil * 6];
        int i10 = 0;
        int i11 = 0;
        while (i10 < iCeil) {
            double d14 = d10 + (((double) i10) * d12);
            double dCos = Math.cos(d14);
            double dSin2 = Math.sin(d14);
            float[] fArr2 = fArr;
            fArr2[i11] = (float) (dCos - (dSin * dSin2));
            fArr2[i11 + 1] = (float) (dSin2 + (dCos * dSin));
            double d15 = d14 + d12;
            double dCos2 = Math.cos(d15);
            double dSin3 = Math.sin(d15);
            fArr2[i11 + 2] = (float) ((dSin * dSin3) + dCos2);
            fArr2[i11 + 3] = (float) (dSin3 - (dSin * dCos2));
            int i12 = i11 + 5;
            fArr2[i11 + 4] = (float) dCos2;
            i11 += 6;
            fArr2[i12] = (float) dSin3;
            i10++;
            fArr = fArr2;
            iCeil = iCeil;
        }
        return fArr;
    }

    private void i0(g.J j10) {
        this.f57435f.push(j10);
        this.f57436g.push(this.f57430a.getMatrix());
    }

    private Path j(g.K k10, g.C6118b c6118b) {
        Path pathG0;
        g.N nR = k10.f57319a.r(this.f57433d.f57469a.f57223E);
        if (nR == null) {
            F("ClipPath reference '%s' not found", this.f57433d.f57469a.f57223E);
            return null;
        }
        g.C6121e c6121e = (g.C6121e) nR;
        this.f57434e.push(this.f57433d);
        this.f57433d = M(c6121e);
        Boolean bool = c6121e.f57363p;
        boolean z10 = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z10) {
            matrix.preTranslate(c6118b.f57340a, c6118b.f57341b);
            matrix.preScale(c6118b.f57342c, c6118b.f57343d);
        }
        Matrix matrix2 = c6121e.f57387o;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (g.N n10 : c6121e.f57298i) {
            if ((n10 instanceof g.K) && (pathG0 = g0((g.K) n10, true)) != null) {
                path.op(pathG0, Path.Op.UNION);
            }
        }
        if (this.f57433d.f57469a.f57223E != null) {
            if (c6121e.f57309h == null) {
                c6121e.f57309h = m(path);
            }
            Path pathJ = j(c6121e, c6121e.f57309h);
            if (pathJ != null) {
                path.op(pathJ, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.f57433d = (C0870h) this.f57434e.pop();
        return path;
    }

    private void j0(g.K k10) {
        k0(k10, k10.f57309h);
    }

    private List k(g.C6132q c6132q) {
        g.C6131p c6131p = c6132q.f57396o;
        float f10 = c6131p != null ? c6131p.f(this) : 0.0f;
        g.C6131p c6131p2 = c6132q.f57397p;
        float fG = c6131p2 != null ? c6131p2.g(this) : 0.0f;
        g.C6131p c6131p3 = c6132q.f57398q;
        float f11 = c6131p3 != null ? c6131p3.f(this) : 0.0f;
        g.C6131p c6131p4 = c6132q.f57399r;
        float fG2 = c6131p4 != null ? c6131p4.g(this) : 0.0f;
        ArrayList arrayList = new ArrayList(2);
        float f12 = f11 - f10;
        float f13 = fG2 - fG;
        arrayList.add(new c(f10, fG, f12, f13));
        arrayList.add(new c(f11, fG2, f12, f13));
        return arrayList;
    }

    private void k0(g.K k10, g.C6118b c6118b) {
        if (this.f57433d.f57469a.f57225G != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            this.f57430a.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            this.f57430a.saveLayer(null, paint2, 31);
            g.C6134s c6134s = (g.C6134s) this.f57432c.r(this.f57433d.f57469a.f57225G);
            J0(c6134s, k10, c6118b);
            this.f57430a.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            this.f57430a.saveLayer(null, paint3, 31);
            J0(c6134s, k10, c6118b);
            this.f57430a.restore();
            this.f57430a.restore();
        }
        R0();
    }

    private List l(g.C6141z c6141z) {
        int length = c6141z.f57428o.length;
        int i10 = 2;
        if (length < 2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        float[] fArr = c6141z.f57428o;
        c cVar = new c(fArr[0], fArr[1], 0.0f, 0.0f);
        float f10 = 0.0f;
        float f11 = 0.0f;
        while (i10 < length) {
            float[] fArr2 = c6141z.f57428o;
            float f12 = fArr2[i10];
            float f13 = fArr2[i10 + 1];
            cVar.a(f12, f13);
            arrayList.add(cVar);
            i10 += 2;
            cVar = new c(f12, f13, f12 - cVar.f57450a, f13 - cVar.f57451b);
            f10 = f12;
            f11 = f13;
        }
        if (!(c6141z instanceof g.A)) {
            arrayList.add(cVar);
            return arrayList;
        }
        float[] fArr3 = c6141z.f57428o;
        float f14 = fArr3[0];
        if (f10 != f14) {
            float f15 = fArr3[1];
            if (f11 != f15) {
                cVar.a(f14, f15);
                arrayList.add(cVar);
                c cVar2 = new c(f14, f15, f14 - cVar.f57450a, f15 - cVar.f57451b);
                cVar2.b((c) arrayList.get(0));
                arrayList.add(cVar2);
                arrayList.set(0, cVar2);
            }
        }
        return arrayList;
    }

    private void l0(g.N n10, j jVar) {
        float f10;
        float fG;
        float f11;
        g.E.f fVarO;
        if (jVar.a((g.Y) n10)) {
            if (n10 instanceof g.Z) {
                S0();
                L0((g.Z) n10);
                R0();
                return;
            }
            if (!(n10 instanceof g.V)) {
                if (n10 instanceof g.U) {
                    S0();
                    g.U u10 = (g.U) n10;
                    W0(this.f57433d, u10);
                    if (A()) {
                        r((g.K) u10.d());
                        g.N nR = n10.f57319a.r(u10.f57328o);
                        if (nR == null || !(nR instanceof g.Y)) {
                            F("Tref reference '%s' not found", u10.f57328o);
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            G((g.Y) nR, sb2);
                            if (sb2.length() > 0) {
                                jVar.b(sb2.toString());
                            }
                        }
                    }
                    R0();
                    return;
                }
                return;
            }
            y("TSpan render", new Object[0]);
            S0();
            g.V v10 = (g.V) n10;
            W0(this.f57433d, v10);
            if (A()) {
                List list = v10.f57336o;
                boolean z10 = list != null && list.size() > 0;
                boolean z11 = jVar instanceof f;
                float fG2 = 0.0f;
                if (z11) {
                    float f12 = !z10 ? ((f) jVar).f57462b : ((g.C6131p) v10.f57336o.get(0)).f(this);
                    List list2 = v10.f57337p;
                    fG = (list2 == null || list2.size() == 0) ? ((f) jVar).f57463c : ((g.C6131p) v10.f57337p.get(0)).g(this);
                    List list3 = v10.f57338q;
                    f11 = (list3 == null || list3.size() == 0) ? 0.0f : ((g.C6131p) v10.f57338q.get(0)).f(this);
                    List list4 = v10.f57339r;
                    if (list4 != null && list4.size() != 0) {
                        fG2 = ((g.C6131p) v10.f57339r.get(0)).g(this);
                    }
                    f10 = fG2;
                    fG2 = f12;
                } else {
                    f10 = 0.0f;
                    fG = 0.0f;
                    f11 = 0.0f;
                }
                if (z10 && (fVarO = O()) != g.E.f.Start) {
                    float fN = n(v10);
                    if (fVarO == g.E.f.Middle) {
                        fN /= 2.0f;
                    }
                    fG2 -= fN;
                }
                r((g.K) v10.d());
                if (z11) {
                    f fVar = (f) jVar;
                    fVar.f57462b = fG2 + f11;
                    fVar.f57463c = fG + f10;
                }
                boolean zM0 = m0();
                E(v10, jVar);
                if (zM0) {
                    j0(v10);
                }
            }
            R0();
        }
    }

    private g.C6118b m(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new g.C6118b(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    private boolean m0() {
        g.N nR;
        if (!M0()) {
            return false;
        }
        this.f57430a.saveLayerAlpha(null, w(this.f57433d.f57469a.f57244m.floatValue()), 31);
        this.f57434e.push(this.f57433d);
        C0870h c0870h = new C0870h(this.f57433d);
        this.f57433d = c0870h;
        String str = c0870h.f57469a.f57225G;
        if (str != null && ((nR = this.f57432c.r(str)) == null || !(nR instanceof g.C6134s))) {
            F("Mask reference '%s' not found", this.f57433d.f57469a.f57225G);
            this.f57433d.f57469a.f57225G = null;
        }
        return true;
    }

    private float n(g.Y y10) {
        k kVar = new k(this, null);
        E(y10, kVar);
        return kVar.f57483b;
    }

    private c n0(c cVar, c cVar2, c cVar3) {
        float fD = D(cVar2.f57452c, cVar2.f57453d, cVar2.f57450a - cVar.f57450a, cVar2.f57451b - cVar.f57451b);
        if (fD == 0.0f) {
            fD = D(cVar2.f57452c, cVar2.f57453d, cVar3.f57450a - cVar2.f57450a, cVar3.f57451b - cVar2.f57451b);
        }
        if (fD > 0.0f || (fD == 0.0f && (cVar2.f57452c > 0.0f || cVar2.f57453d >= 0.0f))) {
            return cVar2;
        }
        cVar2.f57452c = -cVar2.f57452c;
        cVar2.f57453d = -cVar2.f57453d;
        return cVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (r12 != 8) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.graphics.Matrix o(q5.g.C6118b r10, q5.g.C6118b r11, q5.e r12) {
        /*
            r9 = this;
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            if (r12 == 0) goto L9d
            q5.e$a r1 = r12.a()
            if (r1 != 0) goto Lf
            goto L9d
        Lf:
            float r1 = r10.f57342c
            float r2 = r11.f57342c
            float r1 = r1 / r2
            float r2 = r10.f57343d
            float r3 = r11.f57343d
            float r2 = r2 / r3
            float r3 = r11.f57340a
            float r3 = -r3
            float r4 = r11.f57341b
            float r4 = -r4
            q5.e r5 = q5.e.f57175d
            boolean r5 = r12.equals(r5)
            if (r5 == 0) goto L35
            float r11 = r10.f57340a
            float r10 = r10.f57341b
            r0.preTranslate(r11, r10)
            r0.preScale(r1, r2)
            r0.preTranslate(r3, r4)
            return r0
        L35:
            q5.e$b r5 = r12.b()
            q5.e$b r6 = q5.e.b.slice
            if (r5 != r6) goto L42
            float r1 = java.lang.Math.max(r1, r2)
            goto L46
        L42:
            float r1 = java.lang.Math.min(r1, r2)
        L46:
            float r2 = r10.f57342c
            float r2 = r2 / r1
            float r5 = r10.f57343d
            float r5 = r5 / r1
            int[] r6 = q5.h.a.f57438a
            q5.e$a r7 = r12.a()
            int r7 = r7.ordinal()
            r7 = r6[r7]
            r8 = 1073741824(0x40000000, float:2.0)
            switch(r7) {
                case 1: goto L63;
                case 2: goto L63;
                case 3: goto L63;
                case 4: goto L5e;
                case 5: goto L5e;
                case 6: goto L5e;
                default: goto L5d;
            }
        L5d:
            goto L68
        L5e:
            float r7 = r11.f57342c
            float r7 = r7 - r2
        L61:
            float r3 = r3 - r7
            goto L68
        L63:
            float r7 = r11.f57342c
            float r7 = r7 - r2
            float r7 = r7 / r8
            goto L61
        L68:
            q5.e$a r12 = r12.a()
            int r12 = r12.ordinal()
            r12 = r6[r12]
            r2 = 2
            if (r12 == r2) goto L8b
            r2 = 3
            if (r12 == r2) goto L86
            r2 = 5
            if (r12 == r2) goto L8b
            r2 = 6
            if (r12 == r2) goto L86
            r2 = 7
            if (r12 == r2) goto L8b
            r2 = 8
            if (r12 == r2) goto L86
            goto L90
        L86:
            float r11 = r11.f57343d
            float r11 = r11 - r5
        L89:
            float r4 = r4 - r11
            goto L90
        L8b:
            float r11 = r11.f57343d
            float r11 = r11 - r5
            float r11 = r11 / r8
            goto L89
        L90:
            float r11 = r10.f57340a
            float r10 = r10.f57341b
            r0.preTranslate(r11, r10)
            r0.preScale(r1, r1)
            r0.preTranslate(r3, r4)
        L9d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.h.o(q5.g$b, q5.g$b, q5.e):android.graphics.Matrix");
    }

    private void o0(g.C6120d c6120d) {
        y("Circle render", new Object[0]);
        g.C6131p c6131p = c6120d.f57352q;
        if (c6131p == null || c6131p.i()) {
            return;
        }
        W0(this.f57433d, c6120d);
        if (A() && Y0()) {
            Matrix matrix = c6120d.f57386n;
            if (matrix != null) {
                this.f57430a.concat(matrix);
            }
            Path pathY = Y(c6120d);
            U0(c6120d);
            r(c6120d);
            p(c6120d);
            boolean zM0 = m0();
            if (this.f57433d.f57470b) {
                B(c6120d, pathY);
            }
            if (this.f57433d.f57471c) {
                C(pathY);
            }
            if (zM0) {
                j0(c6120d);
            }
        }
    }

    private void p(g.K k10) {
        q(k10, k10.f57309h);
    }

    private void p0(g.C6124i c6124i) {
        y("Ellipse render", new Object[0]);
        g.C6131p c6131p = c6124i.f57375q;
        if (c6131p == null || c6124i.f57376r == null || c6131p.i() || c6124i.f57376r.i()) {
            return;
        }
        W0(this.f57433d, c6124i);
        if (A() && Y0()) {
            Matrix matrix = c6124i.f57386n;
            if (matrix != null) {
                this.f57430a.concat(matrix);
            }
            Path pathZ = Z(c6124i);
            U0(c6124i);
            r(c6124i);
            p(c6124i);
            boolean zM0 = m0();
            if (this.f57433d.f57470b) {
                B(c6124i, pathZ);
            }
            if (this.f57433d.f57471c) {
                C(pathZ);
            }
            if (zM0) {
                j0(c6124i);
            }
        }
    }

    private void q(g.K k10, g.C6118b c6118b) {
        Path pathJ;
        if (this.f57433d.f57469a.f57223E == null || (pathJ = j(k10, c6118b)) == null) {
            return;
        }
        this.f57430a.clipPath(pathJ);
    }

    private void q0(g.C6128m c6128m) {
        y("Group render", new Object[0]);
        W0(this.f57433d, c6128m);
        if (A()) {
            Matrix matrix = c6128m.f57387o;
            if (matrix != null) {
                this.f57430a.concat(matrix);
            }
            p(c6128m);
            boolean zM0 = m0();
            F0(c6128m, true);
            if (zM0) {
                j0(c6128m);
            }
            U0(c6128m);
        }
    }

    private void r(g.K k10) {
        g.O o10 = this.f57433d.f57469a.f57232b;
        if (o10 instanceof g.C6136u) {
            z(true, k10.f57309h, (g.C6136u) o10);
        }
        g.O o11 = this.f57433d.f57469a.f57235e;
        if (o11 instanceof g.C6136u) {
            z(false, k10.f57309h, (g.C6136u) o11);
        }
    }

    private void r0(g.C6130o c6130o) {
        g.C6131p c6131p;
        String str;
        y("Image render", new Object[0]);
        g.C6131p c6131p2 = c6130o.f57391s;
        if (c6131p2 == null || c6131p2.i() || (c6131p = c6130o.f57392t) == null || c6131p.i() || (str = c6130o.f57388p) == null) {
            return;
        }
        q5.e eVar = c6130o.f57321o;
        if (eVar == null) {
            eVar = q5.e.f57176e;
        }
        Bitmap bitmapS = s(str);
        if (bitmapS == null) {
            q5.g.k();
            return;
        }
        g.C6118b c6118b = new g.C6118b(0.0f, 0.0f, bitmapS.getWidth(), bitmapS.getHeight());
        W0(this.f57433d, c6130o);
        if (A() && Y0()) {
            Matrix matrix = c6130o.f57393u;
            if (matrix != null) {
                this.f57430a.concat(matrix);
            }
            g.C6131p c6131p3 = c6130o.f57389q;
            float f10 = c6131p3 != null ? c6131p3.f(this) : 0.0f;
            g.C6131p c6131p4 = c6130o.f57390r;
            this.f57433d.f57474f = new g.C6118b(f10, c6131p4 != null ? c6131p4.g(this) : 0.0f, c6130o.f57391s.f(this), c6130o.f57392t.f(this));
            if (!this.f57433d.f57469a.f57253v.booleanValue()) {
                g.C6118b c6118b2 = this.f57433d.f57474f;
                O0(c6118b2.f57340a, c6118b2.f57341b, c6118b2.f57342c, c6118b2.f57343d);
            }
            c6130o.f57309h = this.f57433d.f57474f;
            U0(c6130o);
            p(c6130o);
            boolean zM0 = m0();
            X0();
            this.f57430a.save();
            this.f57430a.concat(o(this.f57433d.f57474f, c6118b, eVar));
            this.f57430a.drawBitmap(bitmapS, 0.0f, 0.0f, new Paint(this.f57433d.f57469a.f57243l0 != g.E.e.optimizeSpeed ? 2 : 0));
            this.f57430a.restore();
            if (zM0) {
                j0(c6130o);
            }
        }
    }

    private Bitmap s(String str) {
        int iIndexOf;
        if (!str.startsWith("data:") || str.length() < 14 || (iIndexOf = str.indexOf(44)) < 12 || !";base64".equals(str.substring(iIndexOf - 7, iIndexOf))) {
            return null;
        }
        try {
            byte[] bArrDecode = Base64.decode(str.substring(iIndexOf + 1), 0);
            return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        } catch (Exception e10) {
            Log.e("SVGAndroidRenderer", "Could not decode bad Data URL", e10);
            return null;
        }
    }

    private void s0(g.C6132q c6132q) {
        y("Line render", new Object[0]);
        W0(this.f57433d, c6132q);
        if (A() && Y0() && this.f57433d.f57471c) {
            Matrix matrix = c6132q.f57386n;
            if (matrix != null) {
                this.f57430a.concat(matrix);
            }
            Path pathA0 = a0(c6132q);
            U0(c6132q);
            r(c6132q);
            p(c6132q);
            boolean zM0 = m0();
            C(pathA0);
            I0(c6132q);
            if (zM0) {
                j0(c6132q);
            }
        }
    }

    private Typeface t(String str, Integer num, g.E.b bVar) {
        int i10;
        boolean z10 = bVar == g.E.b.Italic;
        i10 = num.intValue() > 500 ? z10 ? 3 : 1 : z10 ? 2 : 0;
        str.getClass();
        switch (str) {
            case "sans-serif":
                return Typeface.create(Typeface.SANS_SERIF, i10);
            case "monospace":
                return Typeface.create(Typeface.MONOSPACE, i10);
            case "fantasy":
                return Typeface.create(Typeface.SANS_SERIF, i10);
            case "serif":
                return Typeface.create(Typeface.SERIF, i10);
            case "cursive":
                return Typeface.create(Typeface.SANS_SERIF, i10);
            default:
                return null;
        }
    }

    private void t0(g.C6137v c6137v) {
        y("Path render", new Object[0]);
        if (c6137v.f57414o == null) {
            return;
        }
        W0(this.f57433d, c6137v);
        if (A() && Y0()) {
            C0870h c0870h = this.f57433d;
            if (c0870h.f57471c || c0870h.f57470b) {
                Matrix matrix = c6137v.f57386n;
                if (matrix != null) {
                    this.f57430a.concat(matrix);
                }
                Path pathF = new d(c6137v.f57414o).f();
                if (c6137v.f57309h == null) {
                    c6137v.f57309h = m(pathF);
                }
                U0(c6137v);
                r(c6137v);
                p(c6137v);
                boolean zM0 = m0();
                if (this.f57433d.f57470b) {
                    pathF.setFillType(U());
                    B(c6137v, pathF);
                }
                if (this.f57433d.f57471c) {
                    C(pathF);
                }
                I0(c6137v);
                if (zM0) {
                    j0(c6137v);
                }
            }
        }
    }

    private void u(g.N n10) {
        Boolean bool;
        if ((n10 instanceof g.L) && (bool = ((g.L) n10).f57311d) != null) {
            this.f57433d.f57476h = bool.booleanValue();
        }
    }

    private void u0(g.C6141z c6141z) {
        y("PolyLine render", new Object[0]);
        W0(this.f57433d, c6141z);
        if (A() && Y0()) {
            C0870h c0870h = this.f57433d;
            if (c0870h.f57471c || c0870h.f57470b) {
                Matrix matrix = c6141z.f57386n;
                if (matrix != null) {
                    this.f57430a.concat(matrix);
                }
                if (c6141z.f57428o.length < 2) {
                    return;
                }
                Path pathB0 = b0(c6141z);
                U0(c6141z);
                pathB0.setFillType(U());
                r(c6141z);
                p(c6141z);
                boolean zM0 = m0();
                if (this.f57433d.f57470b) {
                    B(c6141z, pathB0);
                }
                if (this.f57433d.f57471c) {
                    C(pathB0);
                }
                I0(c6141z);
                if (zM0) {
                    j0(c6141z);
                }
            }
        }
    }

    private static double v(double d10) {
        if (d10 < -1.0d) {
            return 3.141592653589793d;
        }
        if (d10 > 1.0d) {
            return 0.0d;
        }
        return Math.acos(d10);
    }

    private void v0(g.A a10) {
        y("Polygon render", new Object[0]);
        W0(this.f57433d, a10);
        if (A() && Y0()) {
            C0870h c0870h = this.f57433d;
            if (c0870h.f57471c || c0870h.f57470b) {
                Matrix matrix = a10.f57386n;
                if (matrix != null) {
                    this.f57430a.concat(matrix);
                }
                if (a10.f57428o.length < 2) {
                    return;
                }
                Path pathB0 = b0(a10);
                U0(a10);
                r(a10);
                p(a10);
                boolean zM0 = m0();
                if (this.f57433d.f57470b) {
                    B(a10, pathB0);
                }
                if (this.f57433d.f57471c) {
                    C(pathB0);
                }
                I0(a10);
                if (zM0) {
                    j0(a10);
                }
            }
        }
    }

    private static int w(float f10) {
        int i10 = (int) (f10 * 256.0f);
        if (i10 < 0) {
            return 0;
        }
        if (i10 > 255) {
            return 255;
        }
        return i10;
    }

    private void w0(g.B b10) {
        y("Rect render", new Object[0]);
        g.C6131p c6131p = b10.f57214q;
        if (c6131p == null || b10.f57215r == null || c6131p.i() || b10.f57215r.i()) {
            return;
        }
        W0(this.f57433d, b10);
        if (A() && Y0()) {
            Matrix matrix = b10.f57386n;
            if (matrix != null) {
                this.f57430a.concat(matrix);
            }
            Path pathC0 = c0(b10);
            U0(b10);
            r(b10);
            p(b10);
            boolean zM0 = m0();
            if (this.f57433d.f57470b) {
                B(b10, pathC0);
            }
            if (this.f57433d.f57471c) {
                C(pathC0);
            }
            if (zM0) {
                j0(b10);
            }
        }
    }

    private static int x(int i10, float f10) {
        int i11 = 255;
        int iRound = Math.round(((i10 >> 24) & 255) * f10);
        if (iRound < 0) {
            i11 = 0;
        } else if (iRound <= 255) {
            i11 = iRound;
        }
        return (i10 & 16777215) | (i11 << 24);
    }

    private void x0(g.F f10) {
        z0(f10, f0(f10.f57293q, f10.f57294r, f10.f57295s, f10.f57296t), f10.f57327p, f10.f57321o);
    }

    private void y0(g.F f10, g.C6118b c6118b) {
        z0(f10, c6118b, f10.f57327p, f10.f57321o);
    }

    private void z(boolean z10, g.C6118b c6118b, g.C6136u c6136u) {
        g.N nR = this.f57432c.r(c6136u.f57412a);
        if (nR == null) {
            F("%s reference '%s' not found", z10 ? "Fill" : "Stroke", c6136u.f57412a);
            g.O o10 = c6136u.f57413b;
            if (o10 != null) {
                P0(this.f57433d, z10, o10);
                return;
            } else if (z10) {
                this.f57433d.f57470b = false;
                return;
            } else {
                this.f57433d.f57471c = false;
                return;
            }
        }
        if (nR instanceof g.M) {
            X(z10, c6118b, (g.M) nR);
        } else if (nR instanceof g.Q) {
            e0(z10, c6118b, (g.Q) nR);
        } else if (nR instanceof g.C) {
            Q0(z10, (g.C) nR);
        }
    }

    private void z0(g.F f10, g.C6118b c6118b, g.C6118b c6118b2, q5.e eVar) {
        y("Svg render", new Object[0]);
        if (c6118b.f57342c == 0.0f || c6118b.f57343d == 0.0f) {
            return;
        }
        if (eVar == null && (eVar = f10.f57321o) == null) {
            eVar = q5.e.f57176e;
        }
        W0(this.f57433d, f10);
        if (A()) {
            C0870h c0870h = this.f57433d;
            c0870h.f57474f = c6118b;
            if (!c0870h.f57469a.f57253v.booleanValue()) {
                g.C6118b c6118b3 = this.f57433d.f57474f;
                O0(c6118b3.f57340a, c6118b3.f57341b, c6118b3.f57342c, c6118b3.f57343d);
            }
            q(f10, this.f57433d.f57474f);
            if (c6118b2 != null) {
                this.f57430a.concat(o(this.f57433d.f57474f, c6118b2, eVar));
                this.f57433d.f57475g = f10.f57327p;
            } else {
                Canvas canvas = this.f57430a;
                g.C6118b c6118b4 = this.f57433d.f57474f;
                canvas.translate(c6118b4.f57340a, c6118b4.f57341b);
            }
            boolean zM0 = m0();
            X0();
            F0(f10, true);
            if (zM0) {
                j0(f10);
            }
            U0(f10);
        }
    }

    void G0(q5.g gVar, q5.f fVar) {
        g.C6118b c6118b;
        q5.e eVar;
        if (fVar == null) {
            throw new NullPointerException("renderOptions shouldn't be null");
        }
        this.f57432c = gVar;
        g.F fM = gVar.m();
        if (fM == null) {
            Z0("Nothing to render. Document is empty.", new Object[0]);
            return;
        }
        if (fVar.d()) {
            g.L lI = this.f57432c.i(fVar.f57203e);
            if (lI == null || !(lI instanceof g.f0)) {
                Log.w("SVGAndroidRenderer", String.format("View element with id \"%s\" not found.", fVar.f57203e));
                return;
            }
            g.f0 f0Var = (g.f0) lI;
            c6118b = f0Var.f57327p;
            if (c6118b == null) {
                Log.w("SVGAndroidRenderer", String.format("View element with id \"%s\" is missing a viewBox attribute.", fVar.f57203e));
                return;
            }
            eVar = f0Var.f57321o;
        } else {
            c6118b = fVar.e() ? fVar.f57202d : fM.f57327p;
            eVar = fVar.b() ? fVar.f57200b : fM.f57321o;
        }
        if (fVar.a()) {
            gVar.a(fVar.f57199a);
        }
        if (fVar.c()) {
            C6116b.q qVar = new C6116b.q();
            this.f57437h = qVar;
            qVar.f57158a = gVar.i(fVar.f57201c);
        }
        N0();
        u(fM);
        S0();
        g.C6118b c6118b2 = new g.C6118b(fVar.f57204f);
        g.C6131p c6131p = fM.f57295s;
        if (c6131p != null) {
            c6118b2.f57342c = c6131p.e(this, c6118b2.f57342c);
        }
        g.C6131p c6131p2 = fM.f57296t;
        if (c6131p2 != null) {
            c6118b2.f57343d = c6131p2.e(this, c6118b2.f57343d);
        }
        z0(fM, c6118b2, c6118b, eVar);
        R0();
        if (fVar.a()) {
            gVar.b();
        }
    }

    float Q() {
        return this.f57433d.f57472d.getTextSize();
    }

    float R() {
        return this.f57433d.f57472d.getTextSize() / 2.0f;
    }

    g.C6118b S() {
        C0870h c0870h = this.f57433d;
        g.C6118b c6118b = c0870h.f57475g;
        return c6118b != null ? c6118b : c0870h.f57474f;
    }

    float T() {
        return this.f57431b;
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class k extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f57483b;

        private k() {
            super(h.this, null);
            this.f57483b = 0.0f;
        }

        @Override // q5.h.j
        public void b(String str) {
            this.f57483b += h.this.f57433d.f57472d.measureText(str);
        }

        /* synthetic */ k(h hVar, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: q5.h$h, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class C0870h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        g.E f57469a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f57470b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f57471c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Paint f57472d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Paint f57473e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        g.C6118b f57474f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        g.C6118b f57475g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f57476h;

        C0870h() {
            Paint paint = new Paint();
            this.f57472d = paint;
            paint.setFlags(193);
            this.f57472d.setHinting(0);
            this.f57472d.setStyle(Paint.Style.FILL);
            Paint paint2 = this.f57472d;
            Typeface typeface = Typeface.DEFAULT;
            paint2.setTypeface(typeface);
            Paint paint3 = new Paint();
            this.f57473e = paint3;
            paint3.setFlags(193);
            this.f57473e.setHinting(0);
            this.f57473e.setStyle(Paint.Style.STROKE);
            this.f57473e.setTypeface(typeface);
            this.f57469a = g.E.a();
        }

        C0870h(C0870h c0870h) {
            this.f57470b = c0870h.f57470b;
            this.f57471c = c0870h.f57471c;
            this.f57472d = new Paint(c0870h.f57472d);
            this.f57473e = new Paint(c0870h.f57473e);
            g.C6118b c6118b = c0870h.f57474f;
            if (c6118b != null) {
                this.f57474f = new g.C6118b(c6118b);
            }
            g.C6118b c6118b2 = c0870h.f57475g;
            if (c6118b2 != null) {
                this.f57475g = new g.C6118b(c6118b2);
            }
            this.f57476h = c0870h.f57476h;
            try {
                this.f57469a = (g.E) c0870h.f57469a.clone();
            } catch (CloneNotSupportedException e10) {
                Log.e("SVGAndroidRenderer", "Unexpected clone error", e10);
                this.f57469a = g.E.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void y(String str, Object... objArr) {
    }
}
