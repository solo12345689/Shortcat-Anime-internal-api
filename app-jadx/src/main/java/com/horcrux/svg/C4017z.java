package com.horcrux.svg;

import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.horcrux.svg.z */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class C4017z {

    /* JADX INFO: renamed from: A */
    private double[] f43930A;

    /* JADX INFO: renamed from: B */
    private int f43931B;

    /* JADX INFO: renamed from: C */
    private int f43932C;

    /* JADX INFO: renamed from: D */
    private int f43933D;

    /* JADX INFO: renamed from: E */
    private int f43934E;

    /* JADX INFO: renamed from: F */
    private int f43935F;

    /* JADX INFO: renamed from: G */
    private int f43936G;

    /* JADX INFO: renamed from: H */
    private int f43937H;

    /* JADX INFO: renamed from: I */
    private int f43938I;

    /* JADX INFO: renamed from: J */
    private int f43939J;

    /* JADX INFO: renamed from: K */
    private int f43940K;

    /* JADX INFO: renamed from: L */
    private int f43941L;

    /* JADX INFO: renamed from: M */
    private final float f43942M;

    /* JADX INFO: renamed from: N */
    private final float f43943N;

    /* JADX INFO: renamed from: O */
    private final float f43944O;

    /* JADX INFO: renamed from: a */
    final ArrayList f43945a;

    /* JADX INFO: renamed from: b */
    private final ArrayList f43946b;

    /* JADX INFO: renamed from: c */
    private final ArrayList f43947c;

    /* JADX INFO: renamed from: d */
    private final ArrayList f43948d;

    /* JADX INFO: renamed from: e */
    private final ArrayList f43949e;

    /* JADX INFO: renamed from: f */
    private final ArrayList f43950f;

    /* JADX INFO: renamed from: g */
    private final ArrayList f43951g;

    /* JADX INFO: renamed from: h */
    private final ArrayList f43952h;

    /* JADX INFO: renamed from: i */
    private final ArrayList f43953i;

    /* JADX INFO: renamed from: j */
    private final ArrayList f43954j;

    /* JADX INFO: renamed from: k */
    private final ArrayList f43955k;

    /* JADX INFO: renamed from: l */
    private final ArrayList f43956l;

    /* JADX INFO: renamed from: m */
    private final ArrayList f43957m;

    /* JADX INFO: renamed from: n */
    private final ArrayList f43958n;

    /* JADX INFO: renamed from: o */
    private final ArrayList f43959o;

    /* JADX INFO: renamed from: p */
    private final ArrayList f43960p;

    /* JADX INFO: renamed from: q */
    private double f43961q;

    /* JADX INFO: renamed from: r */
    private C4015x f43962r;

    /* JADX INFO: renamed from: s */
    private double f43963s;

    /* JADX INFO: renamed from: t */
    private double f43964t;

    /* JADX INFO: renamed from: u */
    private double f43965u;

    /* JADX INFO: renamed from: v */
    private double f43966v;

    /* JADX INFO: renamed from: w */
    private SVGLength[] f43967w;

    /* JADX INFO: renamed from: x */
    private SVGLength[] f43968x;

    /* JADX INFO: renamed from: y */
    private SVGLength[] f43969y;

    /* JADX INFO: renamed from: z */
    private SVGLength[] f43970z;

    C4017z(float f10, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        this.f43945a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f43946b = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.f43947c = arrayList3;
        ArrayList arrayList4 = new ArrayList();
        this.f43948d = arrayList4;
        ArrayList arrayList5 = new ArrayList();
        this.f43949e = arrayList5;
        ArrayList arrayList6 = new ArrayList();
        this.f43950f = arrayList6;
        ArrayList arrayList7 = new ArrayList();
        this.f43951g = arrayList7;
        ArrayList arrayList8 = new ArrayList();
        this.f43952h = arrayList8;
        ArrayList arrayList9 = new ArrayList();
        this.f43953i = arrayList9;
        ArrayList arrayList10 = new ArrayList();
        this.f43954j = arrayList10;
        ArrayList arrayList11 = new ArrayList();
        this.f43955k = arrayList11;
        this.f43956l = new ArrayList();
        this.f43957m = new ArrayList();
        this.f43958n = new ArrayList();
        this.f43959o = new ArrayList();
        this.f43960p = new ArrayList();
        this.f43961q = 12.0d;
        this.f43962r = C4015x.f43906p;
        SVGLength[] sVGLengthArr = new SVGLength[0];
        this.f43967w = sVGLengthArr;
        this.f43968x = new SVGLength[0];
        this.f43969y = new SVGLength[0];
        this.f43970z = new SVGLength[0];
        this.f43930A = new double[]{0.0d};
        this.f43936G = -1;
        this.f43937H = -1;
        this.f43938I = -1;
        this.f43939J = -1;
        this.f43940K = -1;
        this.f43942M = f10;
        this.f43943N = f11;
        this.f43944O = f12;
        arrayList2.add(sVGLengthArr);
        arrayList3.add(this.f43968x);
        arrayList4.add(this.f43969y);
        arrayList5.add(this.f43970z);
        arrayList6.add(this.f43930A);
        arrayList7.add(Integer.valueOf(this.f43936G));
        arrayList8.add(Integer.valueOf(this.f43937H));
        arrayList9.add(Integer.valueOf(this.f43938I));
        arrayList10.add(Integer.valueOf(this.f43939J));
        arrayList11.add(Integer.valueOf(this.f43940K));
        arrayList.add(this.f43962r);
        q();
    }

    private double[] a(ArrayList arrayList) {
        int size = arrayList.size();
        double[] dArr = new double[size];
        for (int i10 = 0; i10 < size; i10++) {
            dArr[i10] = ((SVGLength) arrayList.get(i10)).f43656a;
        }
        return dArr;
    }

    private SVGLength[] e(ArrayList arrayList) {
        int size = arrayList.size();
        SVGLength[] sVGLengthArr = new SVGLength[size];
        for (int i10 = 0; i10 < size; i10++) {
            sVGLengthArr[i10] = (SVGLength) arrayList.get(i10);
        }
        return sVGLengthArr;
    }

    private C4015x f(B b10) {
        if (this.f43941L > 0) {
            return this.f43962r;
        }
        for (B parentTextRoot = b10.getParentTextRoot(); parentTextRoot != null; parentTextRoot = parentTextRoot.getParentTextRoot()) {
            C4015x c4015xB = parentTextRoot.D().b();
            if (c4015xB != C4015x.f43906p) {
                return c4015xB;
            }
        }
        return C4015x.f43906p;
    }

    private static void h(ArrayList arrayList, int i10) {
        while (i10 >= 0) {
            arrayList.set(i10, Integer.valueOf(((Integer) arrayList.get(i10)).intValue() + 1));
            i10--;
        }
    }

    private void q() {
        this.f43956l.add(Integer.valueOf(this.f43931B));
        this.f43957m.add(Integer.valueOf(this.f43932C));
        this.f43958n.add(Integer.valueOf(this.f43933D));
        this.f43959o.add(Integer.valueOf(this.f43934E));
        this.f43960p.add(Integer.valueOf(this.f43935F));
    }

    private void r(B b10, ReadableMap readableMap) {
        C4015x c4015xF = f(b10);
        this.f43941L++;
        if (readableMap == null) {
            this.f43945a.add(c4015xF);
            return;
        }
        C4015x c4015x = new C4015x(readableMap, c4015xF, this.f43942M);
        this.f43961q = c4015x.f43907a;
        this.f43945a.add(c4015x);
        this.f43962r = c4015x;
    }

    private void s() {
        this.f43935F = 0;
        this.f43934E = 0;
        this.f43933D = 0;
        this.f43932C = 0;
        this.f43931B = 0;
        this.f43940K = -1;
        this.f43939J = -1;
        this.f43938I = -1;
        this.f43937H = -1;
        this.f43936G = -1;
        this.f43966v = 0.0d;
        this.f43965u = 0.0d;
        this.f43964t = 0.0d;
        this.f43963s = 0.0d;
    }

    C4015x b() {
        return this.f43962r;
    }

    double c() {
        return this.f43961q;
    }

    float d() {
        return this.f43944O;
    }

    float g() {
        return this.f43943N;
    }

    double i() {
        h(this.f43953i, this.f43933D);
        int i10 = this.f43938I + 1;
        SVGLength[] sVGLengthArr = this.f43969y;
        if (i10 < sVGLengthArr.length) {
            this.f43938I = i10;
            this.f43965u += M.a(sVGLengthArr[i10], this.f43943N, 0.0d, this.f43942M, this.f43961q);
        }
        return this.f43965u;
    }

    double j() {
        h(this.f43954j, this.f43934E);
        int i10 = this.f43939J + 1;
        SVGLength[] sVGLengthArr = this.f43970z;
        if (i10 < sVGLengthArr.length) {
            this.f43939J = i10;
            this.f43966v += M.a(sVGLengthArr[i10], this.f43944O, 0.0d, this.f43942M, this.f43961q);
        }
        return this.f43966v;
    }

    double k() {
        h(this.f43955k, this.f43935F);
        int iMin = Math.min(this.f43940K + 1, this.f43930A.length - 1);
        this.f43940K = iMin;
        return this.f43930A[iMin];
    }

    double l(double d10) {
        h(this.f43951g, this.f43931B);
        int i10 = this.f43936G + 1;
        SVGLength[] sVGLengthArr = this.f43967w;
        if (i10 < sVGLengthArr.length) {
            this.f43965u = 0.0d;
            this.f43936G = i10;
            this.f43963s = M.a(sVGLengthArr[i10], this.f43943N, 0.0d, this.f43942M, this.f43961q);
        }
        double d11 = this.f43963s + d10;
        this.f43963s = d11;
        return d11;
    }

    double m() {
        h(this.f43952h, this.f43932C);
        int i10 = this.f43937H + 1;
        SVGLength[] sVGLengthArr = this.f43968x;
        if (i10 < sVGLengthArr.length) {
            this.f43966v = 0.0d;
            this.f43937H = i10;
            this.f43964t = M.a(sVGLengthArr[i10], this.f43944O, 0.0d, this.f43942M, this.f43961q);
        }
        return this.f43964t;
    }

    void n() {
        this.f43945a.remove(this.f43941L);
        this.f43956l.remove(this.f43941L);
        this.f43957m.remove(this.f43941L);
        this.f43958n.remove(this.f43941L);
        this.f43959o.remove(this.f43941L);
        this.f43960p.remove(this.f43941L);
        int i10 = this.f43941L - 1;
        this.f43941L = i10;
        int i11 = this.f43931B;
        int i12 = this.f43932C;
        int i13 = this.f43933D;
        int i14 = this.f43934E;
        int i15 = this.f43935F;
        this.f43962r = (C4015x) this.f43945a.get(i10);
        this.f43931B = ((Integer) this.f43956l.get(this.f43941L)).intValue();
        this.f43932C = ((Integer) this.f43957m.get(this.f43941L)).intValue();
        this.f43933D = ((Integer) this.f43958n.get(this.f43941L)).intValue();
        this.f43934E = ((Integer) this.f43959o.get(this.f43941L)).intValue();
        this.f43935F = ((Integer) this.f43960p.get(this.f43941L)).intValue();
        if (i11 != this.f43931B) {
            this.f43946b.remove(i11);
            this.f43967w = (SVGLength[]) this.f43946b.get(this.f43931B);
            this.f43936G = ((Integer) this.f43951g.get(this.f43931B)).intValue();
        }
        if (i12 != this.f43932C) {
            this.f43947c.remove(i12);
            this.f43968x = (SVGLength[]) this.f43947c.get(this.f43932C);
            this.f43937H = ((Integer) this.f43952h.get(this.f43932C)).intValue();
        }
        if (i13 != this.f43933D) {
            this.f43948d.remove(i13);
            this.f43969y = (SVGLength[]) this.f43948d.get(this.f43933D);
            this.f43938I = ((Integer) this.f43953i.get(this.f43933D)).intValue();
        }
        if (i14 != this.f43934E) {
            this.f43949e.remove(i14);
            this.f43970z = (SVGLength[]) this.f43949e.get(this.f43934E);
            this.f43939J = ((Integer) this.f43954j.get(this.f43934E)).intValue();
        }
        if (i15 != this.f43935F) {
            this.f43950f.remove(i15);
            this.f43930A = (double[]) this.f43950f.get(this.f43935F);
            this.f43940K = ((Integer) this.f43955k.get(this.f43935F)).intValue();
        }
    }

    void o(B b10, ReadableMap readableMap) {
        r(b10, readableMap);
        q();
    }

    void p(boolean z10, l0 l0Var, ReadableMap readableMap, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5) {
        if (z10) {
            s();
        }
        r(l0Var, readableMap);
        if (arrayList != null && arrayList.size() != 0) {
            this.f43931B++;
            this.f43936G = -1;
            this.f43951g.add(-1);
            SVGLength[] sVGLengthArrE = e(arrayList);
            this.f43967w = sVGLengthArrE;
            this.f43946b.add(sVGLengthArrE);
        }
        if (arrayList2 != null && arrayList2.size() != 0) {
            this.f43932C++;
            this.f43937H = -1;
            this.f43952h.add(-1);
            SVGLength[] sVGLengthArrE2 = e(arrayList2);
            this.f43968x = sVGLengthArrE2;
            this.f43947c.add(sVGLengthArrE2);
        }
        if (arrayList3 != null && arrayList3.size() != 0) {
            this.f43933D++;
            this.f43938I = -1;
            this.f43953i.add(-1);
            SVGLength[] sVGLengthArrE3 = e(arrayList3);
            this.f43969y = sVGLengthArrE3;
            this.f43948d.add(sVGLengthArrE3);
        }
        if (arrayList4 != null && arrayList4.size() != 0) {
            this.f43934E++;
            this.f43939J = -1;
            this.f43954j.add(-1);
            SVGLength[] sVGLengthArrE4 = e(arrayList4);
            this.f43970z = sVGLengthArrE4;
            this.f43949e.add(sVGLengthArrE4);
        }
        if (arrayList5 != null && arrayList5.size() != 0) {
            this.f43935F++;
            this.f43940K = -1;
            this.f43955k.add(-1);
            double[] dArrA = a(arrayList5);
            this.f43930A = dArrA;
            this.f43950f.add(dArrA);
        }
        q();
    }
}
