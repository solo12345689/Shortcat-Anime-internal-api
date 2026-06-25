package com.google.android.material.button;

import H9.h;
import H9.l;
import H9.o;
import H9.q;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import b2.C2982n;
import com.google.android.material.internal.p;
import o9.AbstractC5838a;
import o9.AbstractC5848k;
import x9.AbstractC7066a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class e {

    /* JADX INFO: renamed from: a */
    private final MaterialButton f42128a;

    /* JADX INFO: renamed from: b */
    private l f42129b;

    /* JADX INFO: renamed from: c */
    private q f42130c;

    /* JADX INFO: renamed from: d */
    private C2982n f42131d;

    /* JADX INFO: renamed from: e */
    private h.d f42132e;

    /* JADX INFO: renamed from: f */
    private int f42133f;

    /* JADX INFO: renamed from: g */
    private int f42134g;

    /* JADX INFO: renamed from: h */
    private int f42135h;

    /* JADX INFO: renamed from: i */
    private int f42136i;

    /* JADX INFO: renamed from: j */
    private int f42137j;

    /* JADX INFO: renamed from: k */
    private int f42138k;

    /* JADX INFO: renamed from: l */
    private PorterDuff.Mode f42139l;

    /* JADX INFO: renamed from: m */
    private ColorStateList f42140m;

    /* JADX INFO: renamed from: n */
    private ColorStateList f42141n;

    /* JADX INFO: renamed from: o */
    private ColorStateList f42142o;

    /* JADX INFO: renamed from: p */
    private Drawable f42143p;

    /* JADX INFO: renamed from: t */
    private boolean f42147t;

    /* JADX INFO: renamed from: v */
    private LayerDrawable f42149v;

    /* JADX INFO: renamed from: w */
    private int f42150w;

    /* JADX INFO: renamed from: q */
    private boolean f42144q = false;

    /* JADX INFO: renamed from: r */
    private boolean f42145r = false;

    /* JADX INFO: renamed from: s */
    private boolean f42146s = false;

    /* JADX INFO: renamed from: u */
    private boolean f42148u = true;

    e(MaterialButton materialButton, l lVar) {
        this.f42128a = materialButton;
        this.f42129b = lVar;
    }

    private void L(int i10, int i11) {
        int paddingStart = this.f42128a.getPaddingStart();
        int paddingTop = this.f42128a.getPaddingTop();
        int paddingEnd = this.f42128a.getPaddingEnd();
        int paddingBottom = this.f42128a.getPaddingBottom();
        int i12 = this.f42135h;
        int i13 = this.f42136i;
        this.f42136i = i11;
        this.f42135h = i10;
        if (!this.f42145r) {
            M();
        }
        this.f42128a.setPaddingRelative(paddingStart, (paddingTop + i10) - i12, paddingEnd, (paddingBottom + i11) - i13);
    }

    private void M() {
        this.f42128a.setInternalBackground(a());
        h hVarG = g();
        if (hVarG != null) {
            hVarG.c0(this.f42150w);
            hVarG.setState(this.f42128a.getDrawableState());
        }
    }

    private void N() {
        h hVarG = g();
        if (hVarG != null) {
            q qVar = this.f42130c;
            if (qVar != null) {
                hVarG.i0(qVar);
            } else {
                hVarG.setShapeAppearanceModel(this.f42129b);
            }
            C2982n c2982n = this.f42131d;
            if (c2982n != null) {
                hVarG.b0(c2982n);
            }
        }
        h hVarP = p();
        if (hVarP != null) {
            q qVar2 = this.f42130c;
            if (qVar2 != null) {
                hVarP.i0(qVar2);
            } else {
                hVarP.setShapeAppearanceModel(this.f42129b);
            }
            C2982n c2982n2 = this.f42131d;
            if (c2982n2 != null) {
                hVarP.b0(c2982n2);
            }
        }
        o oVarF = f();
        if (oVarF != null) {
            oVarF.setShapeAppearanceModel(this.f42129b);
            if (oVarF instanceof h) {
                h hVar = (h) oVarF;
                q qVar3 = this.f42130c;
                if (qVar3 != null) {
                    hVar.i0(qVar3);
                }
                C2982n c2982n3 = this.f42131d;
                if (c2982n3 != null) {
                    hVar.b0(c2982n3);
                }
            }
        }
    }

    private void O() {
        h hVarG = g();
        h hVarP = p();
        if (hVarG != null) {
            hVarG.k0(this.f42138k, this.f42141n);
            if (hVarP != null) {
                hVarP.j0(this.f42138k, this.f42144q ? AbstractC7066a.d(this.f42128a, AbstractC5838a.f54604J) : 0);
            }
        }
    }

    private InsetDrawable P(Drawable drawable) {
        return new InsetDrawable(drawable, this.f42133f, this.f42135h, this.f42134g, this.f42136i);
    }

    private Drawable a() {
        h hVar = new h(this.f42129b);
        q qVar = this.f42130c;
        if (qVar != null) {
            hVar.i0(qVar);
        }
        C2982n c2982n = this.f42131d;
        if (c2982n != null) {
            hVar.b0(c2982n);
        }
        h.d dVar = this.f42132e;
        if (dVar != null) {
            hVar.f0(dVar);
        }
        hVar.R(this.f42128a.getContext());
        hVar.setTintList(this.f42140m);
        PorterDuff.Mode mode = this.f42139l;
        if (mode != null) {
            hVar.setTintMode(mode);
        }
        hVar.k0(this.f42138k, this.f42141n);
        h hVar2 = new h(this.f42129b);
        q qVar2 = this.f42130c;
        if (qVar2 != null) {
            hVar2.i0(qVar2);
        }
        C2982n c2982n2 = this.f42131d;
        if (c2982n2 != null) {
            hVar2.b0(c2982n2);
        }
        hVar2.setTint(0);
        hVar2.j0(this.f42138k, this.f42144q ? AbstractC7066a.d(this.f42128a, AbstractC5838a.f54604J) : 0);
        h hVar3 = new h(this.f42129b);
        this.f42143p = hVar3;
        q qVar3 = this.f42130c;
        if (qVar3 != null) {
            hVar3.i0(qVar3);
        }
        C2982n c2982n3 = this.f42131d;
        if (c2982n3 != null) {
            ((h) this.f42143p).b0(c2982n3);
        }
        this.f42143p.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(F9.a.d(this.f42142o), P(new LayerDrawable(new Drawable[]{hVar2, hVar})), this.f42143p);
        this.f42149v = rippleDrawable;
        return rippleDrawable;
    }

    private h h(boolean z10) {
        LayerDrawable layerDrawable = this.f42149v;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (h) ((LayerDrawable) ((InsetDrawable) this.f42149v.getDrawable(0)).getDrawable()).getDrawable(!z10 ? 1 : 0);
    }

    private h p() {
        return h(true);
    }

    public void A(int i10) {
        L(this.f42135h, i10);
    }

    public void B(int i10) {
        L(i10, this.f42136i);
    }

    void C(ColorStateList colorStateList) {
        if (this.f42142o != colorStateList) {
            this.f42142o = colorStateList;
            if (this.f42128a.getBackground() instanceof RippleDrawable) {
                ((RippleDrawable) this.f42128a.getBackground()).setColor(F9.a.d(colorStateList));
            }
        }
    }

    void D(l lVar) {
        this.f42129b = lVar;
        this.f42130c = null;
        N();
    }

    void E(boolean z10) {
        this.f42144q = z10;
        O();
    }

    void F(q qVar) {
        this.f42130c = qVar;
        N();
    }

    void G(ColorStateList colorStateList) {
        if (this.f42141n != colorStateList) {
            this.f42141n = colorStateList;
            O();
        }
    }

    void H(int i10) {
        if (this.f42138k != i10) {
            this.f42138k = i10;
            O();
        }
    }

    void I(ColorStateList colorStateList) {
        if (this.f42140m != colorStateList) {
            this.f42140m = colorStateList;
            if (g() != null) {
                g().setTintList(this.f42140m);
            }
        }
    }

    void J(PorterDuff.Mode mode) {
        if (this.f42139l != mode) {
            this.f42139l = mode;
            if (g() == null || this.f42139l == null) {
                return;
            }
            g().setTintMode(this.f42139l);
        }
    }

    void K(boolean z10) {
        this.f42148u = z10;
    }

    int b() {
        return this.f42137j;
    }

    C2982n c() {
        return this.f42131d;
    }

    public int d() {
        return this.f42136i;
    }

    public int e() {
        return this.f42135h;
    }

    public o f() {
        LayerDrawable layerDrawable = this.f42149v;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f42149v.getNumberOfLayers() > 2 ? (o) this.f42149v.getDrawable(2) : (o) this.f42149v.getDrawable(1);
    }

    h g() {
        return h(false);
    }

    ColorStateList i() {
        return this.f42142o;
    }

    l j() {
        return this.f42129b;
    }

    q k() {
        return this.f42130c;
    }

    ColorStateList l() {
        return this.f42141n;
    }

    int m() {
        return this.f42138k;
    }

    ColorStateList n() {
        return this.f42140m;
    }

    PorterDuff.Mode o() {
        return this.f42139l;
    }

    boolean q() {
        return this.f42145r;
    }

    boolean r() {
        return this.f42147t;
    }

    boolean s() {
        return this.f42148u;
    }

    void t(TypedArray typedArray) {
        this.f42133f = typedArray.getDimensionPixelOffset(AbstractC5848k.f55127c2, 0);
        this.f42134g = typedArray.getDimensionPixelOffset(AbstractC5848k.f55136d2, 0);
        this.f42135h = typedArray.getDimensionPixelOffset(AbstractC5848k.f55145e2, 0);
        this.f42136i = typedArray.getDimensionPixelOffset(AbstractC5848k.f55154f2, 0);
        if (typedArray.hasValue(AbstractC5848k.f55187j2)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(AbstractC5848k.f55187j2, -1);
            this.f42137j = dimensionPixelSize;
            D(this.f42129b.x(dimensionPixelSize));
            this.f42146s = true;
        }
        this.f42138k = typedArray.getDimensionPixelSize(AbstractC5848k.f55283v2, 0);
        this.f42139l = p.h(typedArray.getInt(AbstractC5848k.f55179i2, -1), PorterDuff.Mode.SRC_IN);
        this.f42140m = E9.c.a(this.f42128a.getContext(), typedArray, AbstractC5848k.f55171h2);
        this.f42141n = E9.c.a(this.f42128a.getContext(), typedArray, AbstractC5848k.f55275u2);
        this.f42142o = E9.c.a(this.f42128a.getContext(), typedArray, AbstractC5848k.f55259s2);
        this.f42147t = typedArray.getBoolean(AbstractC5848k.f55163g2, false);
        this.f42150w = typedArray.getDimensionPixelSize(AbstractC5848k.f55195k2, 0);
        this.f42148u = typedArray.getBoolean(AbstractC5848k.f55291w2, true);
        int paddingStart = this.f42128a.getPaddingStart();
        int paddingTop = this.f42128a.getPaddingTop();
        int paddingEnd = this.f42128a.getPaddingEnd();
        int paddingBottom = this.f42128a.getPaddingBottom();
        if (typedArray.hasValue(AbstractC5848k.f55109a2)) {
            v();
        } else {
            M();
        }
        this.f42128a.setPaddingRelative(paddingStart + this.f42133f, paddingTop + this.f42135h, paddingEnd + this.f42134g, paddingBottom + this.f42136i);
    }

    void u(int i10) {
        if (g() != null) {
            g().setTint(i10);
        }
    }

    void v() {
        this.f42145r = true;
        this.f42128a.setSupportBackgroundTintList(this.f42140m);
        this.f42128a.setSupportBackgroundTintMode(this.f42139l);
    }

    void w(boolean z10) {
        this.f42147t = z10;
    }

    void x(int i10) {
        if (this.f42146s && this.f42137j == i10) {
            return;
        }
        this.f42137j = i10;
        this.f42146s = true;
        D(this.f42129b.x(i10));
    }

    void y(h.d dVar) {
        this.f42132e = dVar;
        h hVarG = g();
        if (hVarG != null) {
            hVarG.f0(dVar);
        }
    }

    void z(C2982n c2982n) {
        this.f42131d = c2982n;
        if (this.f42130c != null) {
            N();
        }
    }
}
