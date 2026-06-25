package com.facebook.yoga;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class YogaNodeJNIBase extends r implements Cloneable {

    /* JADX INFO: renamed from: a */
    private YogaNodeJNIBase f38630a;
    private float[] arr;

    /* JADX INFO: renamed from: b */
    private c f38631b;

    /* JADX INFO: renamed from: c */
    private List f38632c;

    /* JADX INFO: renamed from: d */
    private o f38633d;

    /* JADX INFO: renamed from: e */
    private b f38634e;

    /* JADX INFO: renamed from: f */
    protected long f38635f;

    /* JADX INFO: renamed from: g */
    private Object f38636g;

    /* JADX INFO: renamed from: h */
    private boolean f38637h;
    private int mLayoutDirection;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f38638a;

        static {
            int[] iArr = new int[j.values().length];
            f38638a = iArr;
            try {
                iArr[j.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38638a[j.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38638a[j.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38638a[j.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f38638a[j.START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f38638a[j.END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private YogaNodeJNIBase(long j10) {
        this.arr = null;
        this.mLayoutDirection = 0;
        this.f38637h = true;
        if (j10 == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
        this.f38635f = j10;
    }

    private void q0(r rVar) {
        r0();
    }

    private final long replaceChild(YogaNodeJNIBase yogaNodeJNIBase, int i10) {
        List list = this.f38632c;
        if (list == null) {
            throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
        }
        list.remove(i10);
        this.f38632c.add(i10, yogaNodeJNIBase);
        yogaNodeJNIBase.f38630a = this;
        return yogaNodeJNIBase.f38635f;
    }

    private static YogaValue t0(long j10) {
        return new YogaValue(Float.intBitsToFloat((int) j10), (int) (j10 >> 32));
    }

    @Override // com.facebook.yoga.r
    public void A(com.facebook.yoga.a aVar) {
        YogaNative.jni_YGNodeStyleSetAlignSelfJNI(this.f38635f, aVar.b());
    }

    @Override // com.facebook.yoga.r
    public void B(float f10) {
        YogaNative.jni_YGNodeStyleSetAspectRatioJNI(this.f38635f, f10);
    }

    @Override // com.facebook.yoga.r
    public void C(b bVar) {
        this.f38634e = bVar;
        YogaNative.jni_YGNodeSetHasBaselineFuncJNI(this.f38635f, bVar != null);
    }

    @Override // com.facebook.yoga.r
    public void D(j jVar, float f10) {
        YogaNative.jni_YGNodeStyleSetBorderJNI(this.f38635f, jVar.c(), f10);
    }

    @Override // com.facebook.yoga.r
    public void E(Object obj) {
        this.f38636g = obj;
    }

    @Override // com.facebook.yoga.r
    public void F(h hVar) {
        YogaNative.jni_YGNodeStyleSetDirectionJNI(this.f38635f, hVar.c());
    }

    @Override // com.facebook.yoga.r
    public void G(i iVar) {
        YogaNative.jni_YGNodeStyleSetDisplayJNI(this.f38635f, iVar.b());
    }

    @Override // com.facebook.yoga.r
    public void H(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexJNI(this.f38635f, f10);
    }

    @Override // com.facebook.yoga.r
    public void I(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexBasisJNI(this.f38635f, f10);
    }

    @Override // com.facebook.yoga.r
    public void J() {
        YogaNative.jni_YGNodeStyleSetFlexBasisAutoJNI(this.f38635f);
    }

    @Override // com.facebook.yoga.r
    public void K(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexBasisPercentJNI(this.f38635f, f10);
    }

    @Override // com.facebook.yoga.r
    public void L(l lVar) {
        YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(this.f38635f, lVar.b());
    }

    @Override // com.facebook.yoga.r
    public void M(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexGrowJNI(this.f38635f, f10);
    }

    @Override // com.facebook.yoga.r
    public void N(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(this.f38635f, f10);
    }

    @Override // com.facebook.yoga.r
    public void O(m mVar, float f10) {
        YogaNative.jni_YGNodeStyleSetGapJNI(this.f38635f, mVar.b(), f10);
    }

    @Override // com.facebook.yoga.r
    public void P(m mVar, float f10) {
        YogaNative.jni_YGNodeStyleSetGapPercentJNI(this.f38635f, mVar.b(), f10);
    }

    @Override // com.facebook.yoga.r
    public void Q(float f10) {
        YogaNative.jni_YGNodeStyleSetHeightJNI(this.f38635f, f10);
    }

    @Override // com.facebook.yoga.r
    public void R() {
        YogaNative.jni_YGNodeStyleSetHeightAutoJNI(this.f38635f);
    }

    @Override // com.facebook.yoga.r
    public void S(float f10) {
        YogaNative.jni_YGNodeStyleSetHeightPercentJNI(this.f38635f, f10);
    }

    @Override // com.facebook.yoga.r
    public void T(n nVar) {
        YogaNative.jni_YGNodeStyleSetJustifyContentJNI(this.f38635f, nVar.b());
    }

    @Override // com.facebook.yoga.r
    public void U(j jVar, float f10) {
        YogaNative.jni_YGNodeStyleSetMarginJNI(this.f38635f, jVar.c(), f10);
    }

    @Override // com.facebook.yoga.r
    public void V(j jVar) {
        YogaNative.jni_YGNodeStyleSetMarginAutoJNI(this.f38635f, jVar.c());
    }

    @Override // com.facebook.yoga.r
    public void W(j jVar, float f10) {
        YogaNative.jni_YGNodeStyleSetMarginPercentJNI(this.f38635f, jVar.c(), f10);
    }

    @Override // com.facebook.yoga.r
    public void X(float f10) {
        YogaNative.jni_YGNodeStyleSetMaxHeightJNI(this.f38635f, f10);
    }

    @Override // com.facebook.yoga.r
    public void Y(float f10) {
        YogaNative.jni_YGNodeStyleSetMaxHeightPercentJNI(this.f38635f, f10);
    }

    @Override // com.facebook.yoga.r
    public void Z(float f10) {
        YogaNative.jni_YGNodeStyleSetMaxWidthJNI(this.f38635f, f10);
    }

    @Override // com.facebook.yoga.r
    public void a(r rVar, int i10) {
        if (rVar instanceof YogaNodeJNIBase) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) rVar;
            if (yogaNodeJNIBase.f38630a != null) {
                throw new IllegalStateException("Child already has a parent, it must be removed first.");
            }
            if (this.f38632c == null) {
                this.f38632c = new ArrayList(4);
            }
            this.f38632c.add(i10, yogaNodeJNIBase);
            yogaNodeJNIBase.f38630a = this;
            YogaNative.jni_YGNodeInsertChildJNI(this.f38635f, yogaNodeJNIBase.f38635f, i10);
        }
    }

    @Override // com.facebook.yoga.r
    public void a0(float f10) {
        YogaNative.jni_YGNodeStyleSetMaxWidthPercentJNI(this.f38635f, f10);
    }

    @Override // com.facebook.yoga.r
    public void b0(o oVar) {
        this.f38633d = oVar;
        YogaNative.jni_YGNodeSetHasMeasureFuncJNI(this.f38635f, oVar != null);
    }

    public final float baseline(float f10, float f11) {
        return this.f38634e.a(this, f10, f11);
    }

    @Override // com.facebook.yoga.r
    public void c(float f10, float f11) {
        q0(null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) arrayList.get(i10);
            List<YogaNodeJNIBase> list = yogaNodeJNIBase.f38632c;
            if (list != null) {
                for (YogaNodeJNIBase yogaNodeJNIBase2 : list) {
                    yogaNodeJNIBase2.q0(yogaNodeJNIBase);
                    arrayList.add(yogaNodeJNIBase2);
                }
            }
        }
        YogaNodeJNIBase[] yogaNodeJNIBaseArr = (YogaNodeJNIBase[]) arrayList.toArray(new YogaNodeJNIBase[arrayList.size()]);
        long[] jArr = new long[yogaNodeJNIBaseArr.length];
        for (int i11 = 0; i11 < yogaNodeJNIBaseArr.length; i11++) {
            jArr[i11] = yogaNodeJNIBaseArr[i11].f38635f;
        }
        YogaNative.jni_YGNodeCalculateLayoutJNI(this.f38635f, f10, f11, jArr, yogaNodeJNIBaseArr);
    }

    @Override // com.facebook.yoga.r
    public void c0(float f10) {
        YogaNative.jni_YGNodeStyleSetMinHeightJNI(this.f38635f, f10);
    }

    @Override // com.facebook.yoga.r
    public void d() {
        YogaNative.jni_YGNodeMarkDirtyJNI(this.f38635f);
    }

    @Override // com.facebook.yoga.r
    public void d0(float f10) {
        YogaNative.jni_YGNodeStyleSetMinHeightPercentJNI(this.f38635f, f10);
    }

    @Override // com.facebook.yoga.r
    public float e() {
        return YogaNative.jni_YGNodeStyleGetFlexJNI(this.f38635f);
    }

    @Override // com.facebook.yoga.r
    public void e0(float f10) {
        YogaNative.jni_YGNodeStyleSetMinWidthJNI(this.f38635f, f10);
    }

    @Override // com.facebook.yoga.r
    public YogaValue f() {
        return t0(YogaNative.jni_YGNodeStyleGetHeightJNI(this.f38635f));
    }

    @Override // com.facebook.yoga.r
    public void f0(float f10) {
        YogaNative.jni_YGNodeStyleSetMinWidthPercentJNI(this.f38635f, f10);
    }

    @Override // com.facebook.yoga.r
    public h g() {
        float[] fArr = this.arr;
        return h.b(fArr != null ? (int) fArr[5] : this.mLayoutDirection);
    }

    @Override // com.facebook.yoga.r
    public void g0(u uVar) {
        YogaNative.jni_YGNodeStyleSetOverflowJNI(this.f38635f, uVar.b());
    }

    @Override // com.facebook.yoga.r
    public float h() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[2];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.r
    public void h0(j jVar, float f10) {
        YogaNative.jni_YGNodeStyleSetPaddingJNI(this.f38635f, jVar.c(), f10);
    }

    @Override // com.facebook.yoga.r
    public float i(j jVar) {
        float[] fArr = this.arr;
        if (fArr == null) {
            return 0.0f;
        }
        float f10 = fArr[0];
        if ((((int) f10) & 2) != 2) {
            return 0.0f;
        }
        int i10 = (((int) f10) & 1) != 1 ? 4 : 0;
        int i11 = 10 - i10;
        switch (a.f38638a[jVar.ordinal()]) {
            case 1:
                return this.arr[i11];
            case 2:
                return this.arr[11 - i10];
            case 3:
                return this.arr[12 - i10];
            case 4:
                return this.arr[13 - i10];
            case 5:
                return g() == h.RTL ? this.arr[12 - i10] : this.arr[i11];
            case 6:
                return g() == h.RTL ? this.arr[i11] : this.arr[12 - i10];
            default:
                throw new IllegalArgumentException("Cannot get layout paddings of multi-edge shorthands");
        }
    }

    @Override // com.facebook.yoga.r
    public void i0(j jVar, float f10) {
        YogaNative.jni_YGNodeStyleSetPaddingPercentJNI(this.f38635f, jVar.c(), f10);
    }

    @Override // com.facebook.yoga.r
    public float j() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[1];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.r
    public void j0(j jVar, float f10) {
        YogaNative.jni_YGNodeStyleSetPositionJNI(this.f38635f, jVar.c(), f10);
    }

    @Override // com.facebook.yoga.r
    public float k() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[3];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.r
    public void k0(j jVar, float f10) {
        YogaNative.jni_YGNodeStyleSetPositionPercentJNI(this.f38635f, jVar.c(), f10);
    }

    @Override // com.facebook.yoga.r
    public void l0(v vVar) {
        YogaNative.jni_YGNodeStyleSetPositionTypeJNI(this.f38635f, vVar.b());
    }

    @Override // com.facebook.yoga.r
    public float m() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[4];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.r
    public void m0(float f10) {
        YogaNative.jni_YGNodeStyleSetWidthJNI(this.f38635f, f10);
    }

    public final long measure(float f10, int i10, float f11, int i11) {
        if (s()) {
            return this.f38633d.measure(this, f10, p.b(i10), f11, p.b(i11));
        }
        throw new RuntimeException("Measure function isn't defined!");
    }

    @Override // com.facebook.yoga.r
    public YogaValue n(j jVar) {
        return t0(YogaNative.jni_YGNodeStyleGetPaddingJNI(this.f38635f, jVar.c()));
    }

    @Override // com.facebook.yoga.r
    public void n0() {
        YogaNative.jni_YGNodeStyleSetWidthAutoJNI(this.f38635f);
    }

    @Override // com.facebook.yoga.r
    public void o0(float f10) {
        YogaNative.jni_YGNodeStyleSetWidthPercentJNI(this.f38635f, f10);
    }

    @Override // com.facebook.yoga.r
    public YogaValue p() {
        return t0(YogaNative.jni_YGNodeStyleGetWidthJNI(this.f38635f));
    }

    @Override // com.facebook.yoga.r
    public void p0(x xVar) {
        YogaNative.jni_YGNodeStyleSetFlexWrapJNI(this.f38635f, xVar.b());
    }

    @Override // com.facebook.yoga.r
    public boolean q() {
        float[] fArr = this.arr;
        return fArr != null ? (((int) fArr[0]) & 16) == 16 : this.f38637h;
    }

    @Override // com.facebook.yoga.r
    public boolean r() {
        return YogaNative.jni_YGNodeIsDirtyJNI(this.f38635f);
    }

    public Object r0() {
        return this.f38636g;
    }

    @Override // com.facebook.yoga.r
    public boolean s() {
        return this.f38633d != null;
    }

    @Override // com.facebook.yoga.r
    /* JADX INFO: renamed from: s0 */
    public YogaNodeJNIBase u(int i10) {
        List list = this.f38632c;
        if (list == null) {
            throw new IllegalStateException("Trying to remove a child of a YogaNode that does not have children");
        }
        YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) list.remove(i10);
        yogaNodeJNIBase.f38630a = null;
        YogaNative.jni_YGNodeRemoveChildJNI(this.f38635f, yogaNodeJNIBase.f38635f);
        return yogaNodeJNIBase;
    }

    @Override // com.facebook.yoga.r
    public void t() {
        float[] fArr = this.arr;
        if (fArr != null) {
            fArr[0] = ((int) fArr[0]) & (-17);
        }
        this.f38637h = false;
    }

    @Override // com.facebook.yoga.r
    public void v() {
        this.f38633d = null;
        this.f38634e = null;
        this.f38636g = null;
        this.arr = null;
        this.f38637h = true;
        this.mLayoutDirection = 0;
        YogaNative.jni_YGNodeResetJNI(this.f38635f);
    }

    @Override // com.facebook.yoga.r
    public void x(com.facebook.yoga.a aVar) {
        YogaNative.jni_YGNodeStyleSetAlignContentJNI(this.f38635f, aVar.b());
    }

    @Override // com.facebook.yoga.r
    public void y(com.facebook.yoga.a aVar) {
        YogaNative.jni_YGNodeStyleSetAlignItemsJNI(this.f38635f, aVar.b());
    }

    YogaNodeJNIBase() {
        this(YogaNative.jni_YGNodeNewJNI());
    }

    YogaNodeJNIBase(c cVar) {
        this(YogaNative.jni_YGNodeNewWithConfigJNI(((e) cVar).f38660c));
        this.f38631b = cVar;
    }
}
