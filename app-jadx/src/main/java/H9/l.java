package H9;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import o9.AbstractC5848k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class l {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final d f8256m = new j(0.5f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    e f8257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    e f8258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    e f8259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    e f8260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    d f8261e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    d f8262f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    d f8263g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    d f8264h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    g f8265i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    g f8266j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    g f8267k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    g f8268l;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface c {
        d a(d dVar);
    }

    public static b a() {
        return new b();
    }

    public static b b(Context context, int i10, int i11) {
        return c(context, i10, i11, 0);
    }

    private static b c(Context context, int i10, int i11, int i12) {
        return d(context, i10, i11, new H9.a(i12));
    }

    private static b d(Context context, int i10, int i11, d dVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
        if (i11 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i11, true);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(AbstractC5848k.f55055T4);
        try {
            int i12 = typedArrayObtainStyledAttributes.getInt(AbstractC5848k.f55063U4, 0);
            int i13 = typedArrayObtainStyledAttributes.getInt(AbstractC5848k.f55087X4, i12);
            int i14 = typedArrayObtainStyledAttributes.getInt(AbstractC5848k.f55095Y4, i12);
            int i15 = typedArrayObtainStyledAttributes.getInt(AbstractC5848k.f55079W4, i12);
            int i16 = typedArrayObtainStyledAttributes.getInt(AbstractC5848k.f55071V4, i12);
            d dVarM = m(typedArrayObtainStyledAttributes, AbstractC5848k.f55103Z4, dVar);
            d dVarM2 = m(typedArrayObtainStyledAttributes, AbstractC5848k.f55130c5, dVarM);
            d dVarM3 = m(typedArrayObtainStyledAttributes, AbstractC5848k.f55139d5, dVarM);
            d dVarM4 = m(typedArrayObtainStyledAttributes, AbstractC5848k.f55121b5, dVarM);
            return new b().B(i13, dVarM2).G(i14, dVarM3).w(i15, dVarM4).s(i16, m(typedArrayObtainStyledAttributes, AbstractC5848k.f55112a5, dVarM));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static b e(Context context, AttributeSet attributeSet, int i10, int i11) {
        return f(context, attributeSet, i10, i11, 0);
    }

    public static b f(Context context, AttributeSet attributeSet, int i10, int i11, int i12) {
        return g(context, attributeSet, i10, i11, new H9.a(i12));
    }

    public static b g(Context context, AttributeSet attributeSet, int i10, int i11, d dVar) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC5848k.f55316z3, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(AbstractC5848k.f54902A3, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(AbstractC5848k.f54910B3, 0);
        typedArrayObtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, dVar);
    }

    public static d m(TypedArray typedArray, int i10, d dVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i10);
        if (typedValuePeekValue != null) {
            int i11 = typedValuePeekValue.type;
            if (i11 == 5) {
                return new H9.a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i11 == 6) {
                return new j(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return dVar;
    }

    public g h() {
        return this.f8267k;
    }

    public e i() {
        return this.f8260d;
    }

    public d j() {
        return this.f8264h;
    }

    public e k() {
        return this.f8259c;
    }

    public d l() {
        return this.f8263g;
    }

    public g n() {
        return this.f8268l;
    }

    public g o() {
        return this.f8266j;
    }

    public g p() {
        return this.f8265i;
    }

    public e q() {
        return this.f8257a;
    }

    public d r() {
        return this.f8261e;
    }

    public e s() {
        return this.f8258b;
    }

    public d t() {
        return this.f8262f;
    }

    public String toString() {
        return "[" + r() + ", " + t() + ", " + l() + ", " + j() + "]";
    }

    public boolean u() {
        return (this.f8258b instanceof k) && (this.f8257a instanceof k) && (this.f8259c instanceof k) && (this.f8260d instanceof k);
    }

    public boolean v(RectF rectF) {
        boolean z10 = this.f8268l.getClass().equals(g.class) && this.f8266j.getClass().equals(g.class) && this.f8265i.getClass().equals(g.class) && this.f8267k.getClass().equals(g.class);
        float fA = this.f8261e.a(rectF);
        return z10 && ((this.f8262f.a(rectF) > fA ? 1 : (this.f8262f.a(rectF) == fA ? 0 : -1)) == 0 && (this.f8264h.a(rectF) > fA ? 1 : (this.f8264h.a(rectF) == fA ? 0 : -1)) == 0 && (this.f8263g.a(rectF) > fA ? 1 : (this.f8263g.a(rectF) == fA ? 0 : -1)) == 0) && u();
    }

    public b w() {
        return new b(this);
    }

    public l x(float f10) {
        return w().o(f10).m();
    }

    public l y(d dVar) {
        return w().p(dVar).m();
    }

    public l z(c cVar) {
        return w().E(cVar.a(r())).J(cVar.a(t())).v(cVar.a(j())).z(cVar.a(l())).m();
    }

    private l(b bVar) {
        this.f8257a = bVar.f8269a;
        this.f8258b = bVar.f8270b;
        this.f8259c = bVar.f8271c;
        this.f8260d = bVar.f8272d;
        this.f8261e = bVar.f8273e;
        this.f8262f = bVar.f8274f;
        this.f8263g = bVar.f8275g;
        this.f8264h = bVar.f8276h;
        this.f8265i = bVar.f8277i;
        this.f8266j = bVar.f8278j;
        this.f8267k = bVar.f8279k;
        this.f8268l = bVar.f8280l;
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private e f8269a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private e f8270b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private e f8271c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private e f8272d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private d f8273e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private d f8274f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private d f8275g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private d f8276h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private g f8277i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private g f8278j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private g f8279k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private g f8280l;

        public b() {
            this.f8269a = i.b();
            this.f8270b = i.b();
            this.f8271c = i.b();
            this.f8272d = i.b();
            this.f8273e = new H9.a(0.0f);
            this.f8274f = new H9.a(0.0f);
            this.f8275g = new H9.a(0.0f);
            this.f8276h = new H9.a(0.0f);
            this.f8277i = i.c();
            this.f8278j = i.c();
            this.f8279k = i.c();
            this.f8280l = i.c();
        }

        private static float n(e eVar) {
            if (eVar instanceof k) {
                return ((k) eVar).f8255a;
            }
            if (eVar instanceof f) {
                return ((f) eVar).f8192a;
            }
            return -1.0f;
        }

        public b A(int i10, float f10) {
            return C(i.a(i10)).D(f10);
        }

        public b B(int i10, d dVar) {
            return C(i.a(i10)).E(dVar);
        }

        public b C(e eVar) {
            this.f8269a = eVar;
            float fN = n(eVar);
            if (fN != -1.0f) {
                D(fN);
            }
            return this;
        }

        public b D(float f10) {
            this.f8273e = new H9.a(f10);
            return this;
        }

        public b E(d dVar) {
            this.f8273e = dVar;
            return this;
        }

        public b F(int i10, float f10) {
            return H(i.a(i10)).I(f10);
        }

        public b G(int i10, d dVar) {
            return H(i.a(i10)).J(dVar);
        }

        public b H(e eVar) {
            this.f8270b = eVar;
            float fN = n(eVar);
            if (fN != -1.0f) {
                I(fN);
            }
            return this;
        }

        public b I(float f10) {
            this.f8274f = new H9.a(f10);
            return this;
        }

        public b J(d dVar) {
            this.f8274f = dVar;
            return this;
        }

        public l m() {
            return new l(this);
        }

        public b o(float f10) {
            return D(f10).I(f10).y(f10).u(f10);
        }

        public b p(d dVar) {
            return E(dVar).J(dVar).z(dVar).v(dVar);
        }

        public b q(int i10, float f10) {
            return r(i.a(i10)).o(f10);
        }

        public b r(e eVar) {
            return C(eVar).H(eVar).x(eVar).t(eVar);
        }

        public b s(int i10, d dVar) {
            return t(i.a(i10)).v(dVar);
        }

        public b t(e eVar) {
            this.f8272d = eVar;
            float fN = n(eVar);
            if (fN != -1.0f) {
                u(fN);
            }
            return this;
        }

        public b u(float f10) {
            this.f8276h = new H9.a(f10);
            return this;
        }

        public b v(d dVar) {
            this.f8276h = dVar;
            return this;
        }

        public b w(int i10, d dVar) {
            return x(i.a(i10)).z(dVar);
        }

        public b x(e eVar) {
            this.f8271c = eVar;
            float fN = n(eVar);
            if (fN != -1.0f) {
                y(fN);
            }
            return this;
        }

        public b y(float f10) {
            this.f8275g = new H9.a(f10);
            return this;
        }

        public b z(d dVar) {
            this.f8275g = dVar;
            return this;
        }

        public b(l lVar) {
            this.f8269a = i.b();
            this.f8270b = i.b();
            this.f8271c = i.b();
            this.f8272d = i.b();
            this.f8273e = new H9.a(0.0f);
            this.f8274f = new H9.a(0.0f);
            this.f8275g = new H9.a(0.0f);
            this.f8276h = new H9.a(0.0f);
            this.f8277i = i.c();
            this.f8278j = i.c();
            this.f8279k = i.c();
            this.f8280l = i.c();
            this.f8269a = lVar.f8257a;
            this.f8270b = lVar.f8258b;
            this.f8271c = lVar.f8259c;
            this.f8272d = lVar.f8260d;
            this.f8273e = lVar.f8261e;
            this.f8274f = lVar.f8262f;
            this.f8275g = lVar.f8263g;
            this.f8276h = lVar.f8264h;
            this.f8277i = lVar.f8265i;
            this.f8278j = lVar.f8266j;
            this.f8279k = lVar.f8267k;
            this.f8280l = lVar.f8268l;
        }
    }

    public l() {
        this.f8257a = i.b();
        this.f8258b = i.b();
        this.f8259c = i.b();
        this.f8260d = i.b();
        this.f8261e = new H9.a(0.0f);
        this.f8262f = new H9.a(0.0f);
        this.f8263g = new H9.a(0.0f);
        this.f8264h = new H9.a(0.0f);
        this.f8265i = i.c();
        this.f8266j = i.c();
        this.f8267k = i.c();
        this.f8268l = i.c();
    }
}
