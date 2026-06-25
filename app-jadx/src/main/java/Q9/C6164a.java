package q9;

import E9.e;
import H9.h;
import H9.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.material.internal.j;
import com.google.android.material.internal.m;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import o9.AbstractC5838a;
import o9.AbstractC5846i;
import o9.AbstractC5847j;
import p9.AbstractC5946a;
import q9.b;

/* JADX INFO: renamed from: q9.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C6164a extends Drawable implements j.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f57849n = AbstractC5847j.f54889r;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f57850o = AbstractC5838a.f54625b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f57851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f57852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j f57853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f57854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f57855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f57856f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f57857g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f57858h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f57859i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f57860j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f57861k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private WeakReference f57862l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private WeakReference f57863m;

    private C6164a(Context context, int i10, int i11, int i12, b.a aVar) {
        this.f57851a = new WeakReference(context);
        m.c(context);
        this.f57854d = new Rect();
        j jVar = new j(this);
        this.f57853c = jVar;
        jVar.g().setTextAlign(Paint.Align.CENTER);
        b bVar = new b(context, i10, i11, i12, aVar);
        this.f57855e = bVar;
        this.f57852b = new h(l.b(context, D() ? bVar.o() : bVar.k(), D() ? bVar.n() : bVar.j()).m());
        R();
    }

    private float A(float f10) {
        return (this.f57857g - this.f57861k) + f10;
    }

    private int B() {
        int iT = D() ? this.f57855e.t() : this.f57855e.u();
        if (this.f57855e.f57874k == 1) {
            iT += D() ? this.f57855e.f57873j : this.f57855e.f57872i;
        }
        return iT + this.f57855e.d();
    }

    private int C() {
        int iE = this.f57855e.E();
        if (D()) {
            iE = this.f57855e.D();
            Context context = (Context) this.f57851a.get();
            if (context != null) {
                iE = AbstractC5946a.c(iE, iE - this.f57855e.v(), AbstractC5946a.b(0.0f, 1.0f, 0.3f, 1.0f, E9.c.f(context) - 1.0f));
            }
        }
        if (this.f57855e.f57874k == 0) {
            iE -= Math.round(this.f57861k);
        }
        return iE + this.f57855e.e();
    }

    private boolean D() {
        return F() || E();
    }

    private void G() {
        this.f57853c.g().setAlpha(getAlpha());
        invalidateSelf();
    }

    private void H() {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(this.f57855e.g());
        if (this.f57852b.B() != colorStateListValueOf) {
            this.f57852b.d0(colorStateListValueOf);
            invalidateSelf();
        }
    }

    private void I() {
        this.f57853c.l(true);
        K();
        a0();
        invalidateSelf();
    }

    private void J() {
        WeakReference weakReference = this.f57862l;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.f57862l.get();
        WeakReference weakReference2 = this.f57863m;
        Z(view, weakReference2 != null ? (FrameLayout) weakReference2.get() : null);
    }

    private void K() {
        Context context = (Context) this.f57851a.get();
        if (context == null) {
            return;
        }
        this.f57852b.setShapeAppearanceModel(l.b(context, D() ? this.f57855e.o() : this.f57855e.k(), D() ? this.f57855e.n() : this.f57855e.j()).m());
        invalidateSelf();
    }

    private void L() {
        e eVar;
        Context context = (Context) this.f57851a.get();
        if (context == null || this.f57853c.e() == (eVar = new e(context, this.f57855e.C()))) {
            return;
        }
        this.f57853c.k(eVar, context);
        M();
        a0();
        invalidateSelf();
    }

    private void M() {
        this.f57853c.g().setColor(this.f57855e.l());
        invalidateSelf();
    }

    private void N() {
        b0();
        this.f57853c.l(true);
        a0();
        invalidateSelf();
    }

    private void O() {
        if (F()) {
            return;
        }
        I();
    }

    private void P() {
        I();
    }

    private void Q() {
        setVisible(this.f57855e.I(), false);
    }

    private void R() {
        K();
        L();
        N();
        I();
        G();
        H();
        M();
        J();
        a0();
        Q();
    }

    private static void Y(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    private void a0() {
        Context context = (Context) this.f57851a.get();
        WeakReference weakReference = this.f57862l;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.f57854d);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference weakReference2 = this.f57863m;
        ViewGroup viewGroup = weakReference2 != null ? (ViewGroup) weakReference2.get() : null;
        if (viewGroup != null) {
            viewGroup.offsetDescendantRectToMyCoords(view, rect2);
        }
        d(rect2, view);
        c.g(this.f57854d, this.f57856f, this.f57857g, this.f57860j, this.f57861k);
        float f10 = this.f57859i;
        if (f10 != -1.0f) {
            this.f57852b.Z(f10);
        }
        if (rect.equals(this.f57854d)) {
            return;
        }
        this.f57852b.setBounds(this.f57854d);
    }

    private void b(View view) {
        ViewParent viewParentM = m();
        if (viewParentM == null) {
            viewParentM = view.getParent();
        }
        if ((viewParentM instanceof View) && (viewParentM.getParent() instanceof View)) {
            c(view, (View) viewParentM.getParent());
        }
    }

    private void b0() {
        if (q() != -2) {
            this.f57858h = ((int) Math.pow(10.0d, ((double) q()) - 1.0d)) - 1;
        } else {
            this.f57858h = r();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void c(View view, View view2) {
        float y10;
        float x10;
        ViewParent parent;
        boolean z10;
        FrameLayout frameLayoutM = m();
        if (frameLayoutM == null) {
            float y11 = view.getY();
            x10 = view.getX();
            parent = view.getParent();
            y10 = y11;
        } else {
            y10 = 0.0f;
            x10 = 0.0f;
            parent = frameLayoutM;
        }
        while (true) {
            z10 = parent instanceof View;
            if (!z10 || parent == view2) {
                break;
            }
            ViewParent parent2 = parent.getParent();
            if (!(parent2 instanceof ViewGroup) || ((ViewGroup) parent2).getClipChildren()) {
                break;
            }
            View view3 = (View) parent;
            y10 += view3.getY();
            x10 += view3.getX();
            parent = parent.getParent();
        }
        if (z10) {
            float fA = A(y10);
            float fP = p(x10);
            View view4 = (View) parent;
            float fK = k(view4.getHeight(), y10);
            float fV = v(view4.getWidth(), x10);
            if (fA < 0.0f) {
                this.f57857g += Math.abs(fA);
            }
            if (fP < 0.0f) {
                this.f57856f += Math.abs(fP);
            }
            if (fK > 0.0f) {
                this.f57857g -= Math.abs(fK);
            }
            if (fV > 0.0f) {
                this.f57856f -= Math.abs(fV);
            }
        }
    }

    private void d(Rect rect, View view) {
        float f10 = D() ? this.f57855e.f57867d : this.f57855e.f57866c;
        this.f57859i = f10;
        if (f10 != -1.0f) {
            this.f57860j = f10;
            this.f57861k = f10;
        } else {
            this.f57860j = Math.round((D() ? this.f57855e.f57870g : this.f57855e.f57868e) / 2.0f);
            this.f57861k = Math.round((D() ? this.f57855e.f57871h : this.f57855e.f57869f) / 2.0f);
        }
        if (D()) {
            String strJ = j();
            this.f57860j = Math.max(this.f57860j, (this.f57853c.h(strJ) / 2.0f) + this.f57855e.i());
            float fMax = Math.max(this.f57861k, (this.f57853c.f(strJ) / 2.0f) + this.f57855e.m());
            this.f57861k = fMax;
            this.f57860j = Math.max(this.f57860j, fMax);
        }
        int iC = C();
        int iH = this.f57855e.h();
        if (iH == 8388691 || iH == 8388693) {
            this.f57857g = rect.bottom - iC;
        } else {
            this.f57857g = rect.top + iC;
        }
        int iB = B();
        int iH2 = this.f57855e.h();
        if (iH2 == 8388659 || iH2 == 8388691) {
            this.f57856f = this.f57855e.f57875l == 0 ? view.getLayoutDirection() == 0 ? (rect.left + this.f57860j) - ((this.f57861k * 2.0f) - iB) : (rect.right - this.f57860j) + ((this.f57861k * 2.0f) - iB) : view.getLayoutDirection() == 0 ? (rect.left - this.f57860j) + iB : (rect.right + this.f57860j) - iB;
        } else {
            this.f57856f = this.f57855e.f57875l == 0 ? view.getLayoutDirection() == 0 ? (rect.right + this.f57860j) - iB : (rect.left - this.f57860j) + iB : view.getLayoutDirection() == 0 ? (rect.right - this.f57860j) + ((this.f57861k * 2.0f) - iB) : (rect.left + this.f57860j) - ((this.f57861k * 2.0f) - iB);
        }
        if (this.f57855e.H()) {
            b(view);
        } else {
            c(view, null);
        }
    }

    public static C6164a g(Context context) {
        return new C6164a(context, 0, f57850o, f57849n, null);
    }

    static C6164a h(Context context, b.a aVar) {
        return new C6164a(context, 0, f57850o, f57849n, aVar);
    }

    private void i(Canvas canvas) {
        String strJ = j();
        if (strJ != null) {
            Rect rect = new Rect();
            this.f57853c.g().getTextBounds(strJ, 0, strJ.length(), rect);
            float fExactCenterY = this.f57857g - rect.exactCenterY();
            canvas.drawText(strJ, this.f57856f, rect.bottom <= 0 ? (int) fExactCenterY : Math.round(fExactCenterY), this.f57853c.g());
        }
    }

    private String j() {
        if (F()) {
            return y();
        }
        if (E()) {
            return t();
        }
        return null;
    }

    private float k(float f10, float f11) {
        return ((this.f57857g + this.f57861k) - f10) + f11;
    }

    private CharSequence n() {
        return this.f57855e.r();
    }

    private float p(float f10) {
        return (this.f57856f - this.f57860j) + f10;
    }

    private String t() {
        if (this.f57858h == -2 || s() <= this.f57858h) {
            return NumberFormat.getInstance(this.f57855e.z()).format(s());
        }
        Context context = (Context) this.f57851a.get();
        return context == null ? "" : String.format(this.f57855e.z(), context.getString(AbstractC5846i.f54858p), Integer.valueOf(this.f57858h), "+");
    }

    private String u() {
        Context context;
        if (this.f57855e.s() == 0 || (context = (Context) this.f57851a.get()) == null) {
            return null;
        }
        return (this.f57858h == -2 || s() <= this.f57858h) ? context.getResources().getQuantityString(this.f57855e.s(), s(), Integer.valueOf(s())) : context.getString(this.f57855e.p(), Integer.valueOf(this.f57858h));
    }

    private float v(float f10, float f11) {
        return ((this.f57856f + this.f57860j) - f10) + f11;
    }

    private String y() {
        String strX = x();
        int iQ = q();
        if (iQ == -2 || strX == null || strX.length() <= iQ) {
            return strX;
        }
        Context context = (Context) this.f57851a.get();
        if (context == null) {
            return "";
        }
        return String.format(context.getString(AbstractC5846i.f54851i), strX.substring(0, iQ - 1), "…");
    }

    private CharSequence z() {
        CharSequence charSequenceQ = this.f57855e.q();
        return charSequenceQ != null ? charSequenceQ : x();
    }

    public boolean E() {
        return !this.f57855e.G() && this.f57855e.F();
    }

    public boolean F() {
        return this.f57855e.G();
    }

    public void S(int i10) {
        this.f57855e.L(i10);
        H();
    }

    public void T(int i10) {
        b bVar = this.f57855e;
        if (bVar.f57875l != i10) {
            bVar.f57875l = i10;
            a0();
        }
    }

    public void U(int i10) {
        if (this.f57853c.g().getColor() != i10) {
            this.f57855e.M(i10);
            M();
        }
    }

    public void V(int i10) {
        int iMax = Math.max(0, i10);
        if (this.f57855e.y() != iMax) {
            this.f57855e.N(iMax);
            O();
        }
    }

    public void W(String str) {
        if (TextUtils.equals(this.f57855e.B(), str)) {
            return;
        }
        this.f57855e.O(str);
        P();
    }

    public void X(boolean z10) {
        this.f57855e.P(z10);
        Q();
    }

    public void Z(View view, FrameLayout frameLayout) {
        this.f57862l = new WeakReference(view);
        this.f57863m = new WeakReference(frameLayout);
        Y(view);
        a0();
        invalidateSelf();
    }

    @Override // com.google.android.material.internal.j.b
    public void a() {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f57852b.draw(canvas);
        if (D()) {
            i(canvas);
        }
    }

    public void e() {
        if (this.f57855e.F()) {
            this.f57855e.a();
            O();
        }
    }

    public void f() {
        if (this.f57855e.G()) {
            this.f57855e.b();
            P();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f57855e.f();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f57854d.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f57854d.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    public CharSequence l() {
        if (isVisible()) {
            return F() ? z() : E() ? u() : n();
        }
        return null;
    }

    public FrameLayout m() {
        WeakReference weakReference = this.f57863m;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    public int o() {
        return this.f57855e.u();
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.j.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public int q() {
        return this.f57855e.w();
    }

    public int r() {
        return this.f57855e.x();
    }

    public int s() {
        if (this.f57855e.F()) {
            return this.f57855e.y();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f57855e.K(i10);
        G();
    }

    b.a w() {
        return this.f57855e.A();
    }

    public String x() {
        return this.f57855e.B();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
