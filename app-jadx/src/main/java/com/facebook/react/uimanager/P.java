package com.facebook.react.uimanager;

import com.facebook.yoga.YogaValue;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class P implements O {
    private static final com.facebook.yoga.c sYogaConfig;
    private ArrayList<P> mChildren;
    private Integer mHeightMeasureSpec;
    private boolean mIsLayoutOnly;
    private P mLayoutParent;
    private ArrayList<P> mNativeChildren;
    private P mNativeParent;
    private final float[] mPadding;
    private P mParent;
    private int mReactTag;
    private int mRootTag;
    private int mScreenHeight;
    private int mScreenWidth;
    private int mScreenX;
    private int mScreenY;
    private boolean mShouldNotifyOnLayout;
    private C3284b0 mThemedContext;
    private String mViewClassName;
    private Integer mWidthMeasureSpec;
    private com.facebook.yoga.r mYogaNode;
    private boolean mNodeUpdated = true;
    private int mTotalNativeChildren = 0;
    private final boolean[] mPaddingIsPercent = new boolean[9];
    private final Z mDefaultPadding = new Z(0.0f);

    static {
        com.facebook.yoga.c cVarA = com.facebook.yoga.d.a();
        sYogaConfig = cVarA;
        cVarA.b(0.0f);
        cVarA.a(com.facebook.yoga.k.ALL);
        W6.b.a("ReactShadowNodeImpl", W6.a.f20778b);
    }

    public P() {
        float[] fArr = new float[9];
        this.mPadding = fArr;
        if (isVirtual()) {
            this.mYogaNode = null;
            return;
        }
        com.facebook.yoga.r rVarA = com.facebook.yoga.s.a(sYogaConfig);
        this.mYogaNode = rVarA;
        rVarA.E(this);
        Arrays.fill(fArr, com.facebook.yoga.g.f38662b);
    }

    private void a(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
        sb2.append("<");
        sb2.append(getClass().getSimpleName());
        sb2.append(" view='");
        sb2.append(getViewClass());
        sb2.append("' tag=");
        sb2.append(getReactTag());
        if (this.mYogaNode != null) {
            sb2.append(" layout='x:");
            sb2.append(getScreenX());
            sb2.append(" y:");
            sb2.append(getScreenY());
            sb2.append(" w:");
            sb2.append(getLayoutWidth());
            sb2.append(" h:");
            sb2.append(getLayoutHeight());
            sb2.append("'");
        } else {
            sb2.append("(virtual node)");
        }
        sb2.append(">\n");
        if (getChildCount() == 0) {
            return;
        }
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            getChildAt(i12).a(sb2, i10 + 1);
        }
    }

    private int b() {
        EnumC3307x nativeKind = getNativeKind();
        if (nativeKind == EnumC3307x.f37850c) {
            return this.mTotalNativeChildren;
        }
        if (nativeKind == EnumC3307x.f37849b) {
            return this.mTotalNativeChildren + 1;
        }
        return 1;
    }

    private void c(int i10) {
        if (getNativeKind() != EnumC3307x.f37848a) {
            for (P parent = getParent(); parent != null; parent = parent.getParent()) {
                parent.mTotalNativeChildren += i10;
                if (parent.getNativeKind() == EnumC3307x.f37848a) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void d() {
        /*
            r4 = this;
            r0 = 0
        L1:
            r1 = 8
            if (r0 > r1) goto Lb6
            if (r0 == 0) goto L62
            r2 = 2
            if (r0 == r2) goto L62
            r2 = 4
            if (r0 == r2) goto L62
            r2 = 5
            if (r0 != r2) goto L11
            goto L62
        L11:
            r2 = 1
            if (r0 == r2) goto L33
            r2 = 3
            if (r0 != r2) goto L18
            goto L33
        L18:
            float[] r1 = r4.mPadding
            r1 = r1[r0]
            boolean r1 = com.facebook.yoga.g.a(r1)
            if (r1 == 0) goto L91
            com.facebook.yoga.r r1 = r4.mYogaNode
            com.facebook.yoga.j r2 = com.facebook.yoga.j.b(r0)
            com.facebook.react.uimanager.Z r3 = r4.mDefaultPadding
            float r3 = r3.b(r0)
            r1.h0(r2, r3)
            goto Lb2
        L33:
            float[] r2 = r4.mPadding
            r2 = r2[r0]
            boolean r2 = com.facebook.yoga.g.a(r2)
            if (r2 == 0) goto L91
            float[] r2 = r4.mPadding
            r3 = 7
            r2 = r2[r3]
            boolean r2 = com.facebook.yoga.g.a(r2)
            if (r2 == 0) goto L91
            float[] r2 = r4.mPadding
            r1 = r2[r1]
            boolean r1 = com.facebook.yoga.g.a(r1)
            if (r1 == 0) goto L91
            com.facebook.yoga.r r1 = r4.mYogaNode
            com.facebook.yoga.j r2 = com.facebook.yoga.j.b(r0)
            com.facebook.react.uimanager.Z r3 = r4.mDefaultPadding
            float r3 = r3.b(r0)
            r1.h0(r2, r3)
            goto Lb2
        L62:
            float[] r2 = r4.mPadding
            r2 = r2[r0]
            boolean r2 = com.facebook.yoga.g.a(r2)
            if (r2 == 0) goto L91
            float[] r2 = r4.mPadding
            r3 = 6
            r2 = r2[r3]
            boolean r2 = com.facebook.yoga.g.a(r2)
            if (r2 == 0) goto L91
            float[] r2 = r4.mPadding
            r1 = r2[r1]
            boolean r1 = com.facebook.yoga.g.a(r1)
            if (r1 == 0) goto L91
            com.facebook.yoga.r r1 = r4.mYogaNode
            com.facebook.yoga.j r2 = com.facebook.yoga.j.b(r0)
            com.facebook.react.uimanager.Z r3 = r4.mDefaultPadding
            float r3 = r3.b(r0)
            r1.h0(r2, r3)
            goto Lb2
        L91:
            boolean[] r1 = r4.mPaddingIsPercent
            boolean r1 = r1[r0]
            if (r1 == 0) goto La5
            com.facebook.yoga.r r1 = r4.mYogaNode
            com.facebook.yoga.j r2 = com.facebook.yoga.j.b(r0)
            float[] r3 = r4.mPadding
            r3 = r3[r0]
            r1.i0(r2, r3)
            goto Lb2
        La5:
            com.facebook.yoga.r r1 = r4.mYogaNode
            com.facebook.yoga.j r2 = com.facebook.yoga.j.b(r0)
            float[] r3 = r4.mPadding
            r3 = r3[r0]
            r1.h0(r2, r3)
        Lb2:
            int r0 = r0 + 1
            goto L1
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.P.d():void");
    }

    @Override // com.facebook.react.uimanager.O
    public void calculateLayout() {
        float f10 = com.facebook.yoga.g.f38662b;
        calculateLayout(f10, f10);
    }

    @Override // com.facebook.react.uimanager.O
    public Iterable<? extends O> calculateLayoutOnChildren() {
        if (isVirtualAnchor()) {
            return null;
        }
        return this.mChildren;
    }

    @Override // com.facebook.react.uimanager.O
    public void dirty() {
        if (!isVirtual()) {
            this.mYogaNode.d();
        } else if (getParent() != null) {
            getParent().dirty();
        }
    }

    @Override // com.facebook.react.uimanager.O
    public void dispatchUpdates(float f10, float f11, j0 j0Var, C3309z c3309z) {
        if (this.mNodeUpdated) {
            onCollectExtraUpdates(j0Var);
        }
        if (hasNewLayout()) {
            float layoutX = getLayoutX();
            float layoutY = getLayoutY();
            float f12 = f10 + layoutX;
            int iRound = Math.round(f12);
            float f13 = f11 + layoutY;
            int iRound2 = Math.round(f13);
            int iRound3 = Math.round(f12 + getLayoutWidth());
            int iRound4 = Math.round(f13 + getLayoutHeight());
            int iRound5 = Math.round(layoutX);
            int iRound6 = Math.round(layoutY);
            int i10 = iRound3 - iRound;
            int i11 = iRound4 - iRound2;
            boolean z10 = (iRound5 == this.mScreenX && iRound6 == this.mScreenY && i10 == this.mScreenWidth && i11 == this.mScreenHeight) ? false : true;
            this.mScreenX = iRound5;
            this.mScreenY = iRound6;
            this.mScreenWidth = i10;
            this.mScreenHeight = i11;
            if (z10) {
                if (c3309z != null) {
                    c3309z.l(this);
                } else {
                    j0Var.P(getParent().getReactTag(), getReactTag(), getScreenX(), getScreenY(), getScreenWidth(), getScreenHeight(), getLayoutDirection());
                }
            }
        }
    }

    @Override // com.facebook.react.uimanager.O
    public boolean dispatchUpdatesWillChangeLayout(float f10, float f11) {
        if (!hasNewLayout()) {
            return false;
        }
        float layoutX = getLayoutX();
        float layoutY = getLayoutY();
        float f12 = f10 + layoutX;
        int iRound = Math.round(f12);
        float f13 = f11 + layoutY;
        int iRound2 = Math.round(f13);
        return (Math.round(layoutX) == this.mScreenX && Math.round(layoutY) == this.mScreenY && Math.round(f12 + getLayoutWidth()) - iRound == this.mScreenWidth && Math.round(f13 + getLayoutHeight()) - iRound2 == this.mScreenHeight) ? false : true;
    }

    @Override // com.facebook.react.uimanager.O
    public void dispose() {
        com.facebook.yoga.r rVar = this.mYogaNode;
        if (rVar != null) {
            rVar.v();
        }
    }

    @Override // com.facebook.react.uimanager.O
    public final int getChildCount() {
        ArrayList<P> arrayList = this.mChildren;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public float getFlex() {
        return this.mYogaNode.e();
    }

    @Override // com.facebook.react.uimanager.O
    public Integer getHeightMeasureSpec() {
        return this.mHeightMeasureSpec;
    }

    public String getHierarchyInfo() {
        StringBuilder sb2 = new StringBuilder();
        a(sb2, 0);
        return sb2.toString();
    }

    @Override // com.facebook.react.uimanager.O
    public final com.facebook.yoga.h getLayoutDirection() {
        return this.mYogaNode.g();
    }

    @Override // com.facebook.react.uimanager.O
    public final float getLayoutHeight() {
        return this.mYogaNode.h();
    }

    @Override // com.facebook.react.uimanager.O
    public final float getLayoutWidth() {
        return this.mYogaNode.j();
    }

    @Override // com.facebook.react.uimanager.O
    public final float getLayoutX() {
        return this.mYogaNode.k();
    }

    @Override // com.facebook.react.uimanager.O
    public final float getLayoutY() {
        return this.mYogaNode.m();
    }

    @Override // com.facebook.react.uimanager.O
    public final int getNativeChildCount() {
        ArrayList<P> arrayList = this.mNativeChildren;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // com.facebook.react.uimanager.O
    public EnumC3307x getNativeKind() {
        return (isVirtual() || isLayoutOnly()) ? EnumC3307x.f37850c : hoistNativeChildren() ? EnumC3307x.f37849b : EnumC3307x.f37848a;
    }

    public final float getPadding(int i10) {
        return this.mYogaNode.i(com.facebook.yoga.j.b(i10));
    }

    @Override // com.facebook.react.uimanager.O
    public final int getReactTag() {
        return this.mReactTag;
    }

    @Override // com.facebook.react.uimanager.O
    public final int getRootTag() {
        Q6.a.a(this.mRootTag != 0);
        return this.mRootTag;
    }

    @Override // com.facebook.react.uimanager.O
    public int getScreenHeight() {
        return this.mScreenHeight;
    }

    @Override // com.facebook.react.uimanager.O
    public int getScreenWidth() {
        return this.mScreenWidth;
    }

    @Override // com.facebook.react.uimanager.O
    public int getScreenX() {
        return this.mScreenX;
    }

    @Override // com.facebook.react.uimanager.O
    public int getScreenY() {
        return this.mScreenY;
    }

    @Override // com.facebook.react.uimanager.O
    public final YogaValue getStyleHeight() {
        return this.mYogaNode.f();
    }

    public final YogaValue getStylePadding(int i10) {
        return this.mYogaNode.n(com.facebook.yoga.j.b(i10));
    }

    @Override // com.facebook.react.uimanager.O
    public final YogaValue getStyleWidth() {
        return this.mYogaNode.p();
    }

    @Override // com.facebook.react.uimanager.O
    public final C3284b0 getThemedContext() {
        return (C3284b0) Q6.a.c(this.mThemedContext);
    }

    public final int getTotalNativeChildren() {
        return this.mTotalNativeChildren;
    }

    @Override // com.facebook.react.uimanager.O
    public final String getViewClass() {
        return (String) Q6.a.c(this.mViewClassName);
    }

    @Override // com.facebook.react.uimanager.O
    public Integer getWidthMeasureSpec() {
        return this.mWidthMeasureSpec;
    }

    public final boolean hasNewLayout() {
        com.facebook.yoga.r rVar = this.mYogaNode;
        return rVar != null && rVar.q();
    }

    public final boolean hasUnseenUpdates() {
        return this.mNodeUpdated;
    }

    @Override // com.facebook.react.uimanager.O
    public final boolean hasUpdates() {
        return this.mNodeUpdated || hasNewLayout() || isDirty();
    }

    public boolean hoistNativeChildren() {
        return false;
    }

    public final boolean isDirty() {
        com.facebook.yoga.r rVar = this.mYogaNode;
        return rVar != null && rVar.r();
    }

    @Override // com.facebook.react.uimanager.O
    public final boolean isLayoutOnly() {
        return this.mIsLayoutOnly;
    }

    public boolean isMeasureDefined() {
        return this.mYogaNode.s();
    }

    @Override // com.facebook.react.uimanager.O
    public boolean isVirtual() {
        return false;
    }

    public boolean isVirtualAnchor() {
        return false;
    }

    public boolean isYogaLeafNode() {
        return isMeasureDefined();
    }

    public final void markLayoutSeen() {
        com.facebook.yoga.r rVar = this.mYogaNode;
        if (rVar != null) {
            rVar.t();
        }
    }

    @Override // com.facebook.react.uimanager.O
    public final void markUpdateSeen() {
        this.mNodeUpdated = false;
        if (hasNewLayout()) {
            markLayoutSeen();
        }
    }

    public void markUpdated() {
        if (this.mNodeUpdated) {
            return;
        }
        this.mNodeUpdated = true;
        P parent = getParent();
        if (parent != null) {
            parent.markUpdated();
        }
    }

    @Override // com.facebook.react.uimanager.O
    public final void removeAllNativeChildren() {
        ArrayList<P> arrayList = this.mNativeChildren;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                this.mNativeChildren.get(size).mNativeParent = null;
            }
            this.mNativeChildren.clear();
        }
    }

    @Override // com.facebook.react.uimanager.O
    public void removeAndDisposeAllChildren() {
        if (getChildCount() == 0) {
            return;
        }
        int iB = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (this.mYogaNode != null && !isYogaLeafNode()) {
                this.mYogaNode.u(childCount);
            }
            P childAt = getChildAt(childCount);
            childAt.mParent = null;
            iB += childAt.b();
            childAt.dispose();
        }
        ((ArrayList) Q6.a.c(this.mChildren)).clear();
        markUpdated();
        this.mTotalNativeChildren -= iB;
        c(-iB);
    }

    public void setAlignContent(com.facebook.yoga.a aVar) {
        this.mYogaNode.x(aVar);
    }

    public void setAlignItems(com.facebook.yoga.a aVar) {
        this.mYogaNode.y(aVar);
    }

    public void setAlignSelf(com.facebook.yoga.a aVar) {
        this.mYogaNode.A(aVar);
    }

    public void setBaselineFunction(com.facebook.yoga.b bVar) {
        this.mYogaNode.C(bVar);
    }

    public void setBorder(int i10, float f10) {
        this.mYogaNode.D(com.facebook.yoga.j.b(i10), f10);
    }

    public void setColumnGap(float f10) {
        this.mYogaNode.O(com.facebook.yoga.m.COLUMN, f10);
    }

    public void setColumnGapPercent(float f10) {
        this.mYogaNode.P(com.facebook.yoga.m.COLUMN, f10);
    }

    public void setDefaultPadding(int i10, float f10) {
        this.mDefaultPadding.c(i10, f10);
        d();
    }

    public void setDisplay(com.facebook.yoga.i iVar) {
        this.mYogaNode.G(iVar);
    }

    public void setFlex(float f10) {
        this.mYogaNode.H(f10);
    }

    public void setFlexBasis(float f10) {
        this.mYogaNode.I(f10);
    }

    public void setFlexBasisAuto() {
        this.mYogaNode.J();
    }

    public void setFlexBasisPercent(float f10) {
        this.mYogaNode.K(f10);
    }

    public void setFlexDirection(com.facebook.yoga.l lVar) {
        this.mYogaNode.L(lVar);
    }

    public void setFlexGrow(float f10) {
        this.mYogaNode.M(f10);
    }

    public void setFlexShrink(float f10) {
        this.mYogaNode.N(f10);
    }

    public void setFlexWrap(com.facebook.yoga.x xVar) {
        this.mYogaNode.p0(xVar);
    }

    public void setGap(float f10) {
        this.mYogaNode.O(com.facebook.yoga.m.ALL, f10);
    }

    public void setGapPercent(float f10) {
        this.mYogaNode.O(com.facebook.yoga.m.ALL, f10);
    }

    @Override // com.facebook.react.uimanager.O
    public final void setIsLayoutOnly(boolean z10) {
        Q6.a.b(getParent() == null, "Must remove from no opt parent first");
        Q6.a.b(this.mNativeParent == null, "Must remove from native parent first");
        Q6.a.b(getNativeChildCount() == 0, "Must remove all native children first");
        this.mIsLayoutOnly = z10;
    }

    public void setJustifyContent(com.facebook.yoga.n nVar) {
        this.mYogaNode.T(nVar);
    }

    @Override // com.facebook.react.uimanager.O
    public void setLayoutDirection(com.facebook.yoga.h hVar) {
        this.mYogaNode.F(hVar);
    }

    public void setMargin(int i10, float f10) {
        this.mYogaNode.U(com.facebook.yoga.j.b(i10), f10);
    }

    public void setMarginAuto(int i10) {
        this.mYogaNode.V(com.facebook.yoga.j.b(i10));
    }

    public void setMarginPercent(int i10, float f10) {
        this.mYogaNode.W(com.facebook.yoga.j.b(i10), f10);
    }

    public void setMeasureFunction(com.facebook.yoga.o oVar) {
        this.mYogaNode.b0(oVar);
    }

    @Override // com.facebook.react.uimanager.O
    public void setMeasureSpecs(int i10, int i11) {
        this.mWidthMeasureSpec = Integer.valueOf(i10);
        this.mHeightMeasureSpec = Integer.valueOf(i11);
    }

    public void setOverflow(com.facebook.yoga.u uVar) {
        this.mYogaNode.g0(uVar);
    }

    @Override // com.facebook.react.uimanager.O
    public void setPadding(int i10, float f10) {
        this.mPadding[i10] = f10;
        this.mPaddingIsPercent[i10] = false;
        d();
    }

    public void setPaddingPercent(int i10, float f10) {
        this.mPadding[i10] = f10;
        this.mPaddingIsPercent[i10] = !com.facebook.yoga.g.a(f10);
        d();
    }

    public void setPosition(int i10, float f10) {
        this.mYogaNode.j0(com.facebook.yoga.j.b(i10), f10);
    }

    public void setPositionPercent(int i10, float f10) {
        this.mYogaNode.k0(com.facebook.yoga.j.b(i10), f10);
    }

    public void setPositionType(com.facebook.yoga.v vVar) {
        this.mYogaNode.l0(vVar);
    }

    @Override // com.facebook.react.uimanager.O
    public void setReactTag(int i10) {
        this.mReactTag = i10;
    }

    @Override // com.facebook.react.uimanager.O
    public final void setRootTag(int i10) {
        this.mRootTag = i10;
    }

    public void setRowGap(float f10) {
        this.mYogaNode.O(com.facebook.yoga.m.ROW, f10);
    }

    public void setRowGapPercent(float f10) {
        this.mYogaNode.P(com.facebook.yoga.m.ROW, f10);
    }

    public void setShouldNotifyOnLayout(boolean z10) {
        this.mShouldNotifyOnLayout = z10;
    }

    public void setStyleAspectRatio(float f10) {
        this.mYogaNode.B(f10);
    }

    @Override // com.facebook.react.uimanager.O
    public void setStyleHeight(float f10) {
        this.mYogaNode.Q(f10);
    }

    public void setStyleHeightAuto() {
        this.mYogaNode.R();
    }

    public void setStyleHeightPercent(float f10) {
        this.mYogaNode.S(f10);
    }

    public void setStyleMaxHeight(float f10) {
        this.mYogaNode.X(f10);
    }

    public void setStyleMaxHeightPercent(float f10) {
        this.mYogaNode.Y(f10);
    }

    public void setStyleMaxWidth(float f10) {
        this.mYogaNode.Z(f10);
    }

    public void setStyleMaxWidthPercent(float f10) {
        this.mYogaNode.a0(f10);
    }

    public void setStyleMinHeight(float f10) {
        this.mYogaNode.c0(f10);
    }

    public void setStyleMinHeightPercent(float f10) {
        this.mYogaNode.d0(f10);
    }

    public void setStyleMinWidth(float f10) {
        this.mYogaNode.e0(f10);
    }

    public void setStyleMinWidthPercent(float f10) {
        this.mYogaNode.f0(f10);
    }

    @Override // com.facebook.react.uimanager.O
    public void setStyleWidth(float f10) {
        this.mYogaNode.m0(f10);
    }

    public void setStyleWidthAuto() {
        this.mYogaNode.n0();
    }

    public void setStyleWidthPercent(float f10) {
        this.mYogaNode.o0(f10);
    }

    @Override // com.facebook.react.uimanager.O
    public void setThemedContext(C3284b0 c3284b0) {
        this.mThemedContext = c3284b0;
    }

    @Override // com.facebook.react.uimanager.O
    public final void setViewClassName(String str) {
        this.mViewClassName = str;
    }

    @Override // com.facebook.react.uimanager.O
    public final boolean shouldNotifyOnLayout() {
        return this.mShouldNotifyOnLayout;
    }

    public String toString() {
        return "[" + this.mViewClassName + " " + getReactTag() + "]";
    }

    @Override // com.facebook.react.uimanager.O
    public final void updateProperties(Q q10) {
        r0.g(this, q10);
        onAfterUpdateTransaction();
    }

    @Override // com.facebook.react.uimanager.O
    public void addChildAt(P p10, int i10) {
        if (this.mChildren == null) {
            this.mChildren = new ArrayList<>(4);
        }
        this.mChildren.add(i10, p10);
        p10.mParent = this;
        if (this.mYogaNode != null && !isYogaLeafNode()) {
            com.facebook.yoga.r rVar = p10.mYogaNode;
            if (rVar == null) {
                throw new RuntimeException("Cannot add a child that doesn't have a YogaNode to a parent without a measure function! (Trying to add a '" + p10.toString() + "' to a '" + toString() + "')");
            }
            this.mYogaNode.a(rVar, i10);
        }
        markUpdated();
        int iB = p10.b();
        this.mTotalNativeChildren += iB;
        c(iB);
    }

    @Override // com.facebook.react.uimanager.O
    public final void addNativeChildAt(P p10, int i10) {
        Q6.a.a(getNativeKind() == EnumC3307x.f37848a);
        Q6.a.a(p10.getNativeKind() != EnumC3307x.f37850c);
        if (this.mNativeChildren == null) {
            this.mNativeChildren = new ArrayList<>(4);
        }
        this.mNativeChildren.add(i10, p10);
        p10.mNativeParent = this;
    }

    @Override // com.facebook.react.uimanager.O
    public void calculateLayout(float f10, float f11) {
        this.mYogaNode.c(f10, f11);
    }

    @Override // com.facebook.react.uimanager.O
    public final P getChildAt(int i10) {
        ArrayList<P> arrayList = this.mChildren;
        if (arrayList != null) {
            return arrayList.get(i10);
        }
        throw new ArrayIndexOutOfBoundsException("Index " + i10 + " out of bounds: node has no children");
    }

    @Override // com.facebook.react.uimanager.O
    public final P getLayoutParent() {
        P p10 = this.mLayoutParent;
        return p10 != null ? p10 : getNativeParent();
    }

    @Override // com.facebook.react.uimanager.O
    public final int getNativeOffsetForChild(P p10) {
        int iB = 0;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            P childAt = getChildAt(i10);
            if (p10 == childAt) {
                return iB;
            }
            iB += childAt.b();
        }
        throw new RuntimeException("Child " + p10.getReactTag() + " was not a child of " + this.mReactTag);
    }

    @Override // com.facebook.react.uimanager.O
    public final P getNativeParent() {
        return this.mNativeParent;
    }

    @Override // com.facebook.react.uimanager.O
    public final P getParent() {
        return this.mParent;
    }

    @Override // com.facebook.react.uimanager.O
    public final int indexOf(P p10) {
        ArrayList<P> arrayList = this.mChildren;
        if (arrayList == null) {
            return -1;
        }
        return arrayList.indexOf(p10);
    }

    @Override // com.facebook.react.uimanager.O
    public final int indexOfNativeChild(P p10) {
        Q6.a.c(this.mNativeChildren);
        return this.mNativeChildren.indexOf(p10);
    }

    @Override // com.facebook.react.uimanager.O
    public boolean isDescendantOf(P p10) {
        for (P parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent == p10) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.react.uimanager.O
    public P removeChildAt(int i10) {
        ArrayList<P> arrayList = this.mChildren;
        if (arrayList == null) {
            throw new ArrayIndexOutOfBoundsException("Index " + i10 + " out of bounds: node has no children");
        }
        P pRemove = arrayList.remove(i10);
        pRemove.mParent = null;
        if (this.mYogaNode != null && !isYogaLeafNode()) {
            this.mYogaNode.u(i10);
        }
        markUpdated();
        int iB = pRemove.b();
        this.mTotalNativeChildren -= iB;
        c(-iB);
        return pRemove;
    }

    @Override // com.facebook.react.uimanager.O
    public final P removeNativeChildAt(int i10) {
        Q6.a.c(this.mNativeChildren);
        P pRemove = this.mNativeChildren.remove(i10);
        pRemove.mNativeParent = null;
        return pRemove;
    }

    @Override // com.facebook.react.uimanager.O
    public final void setLayoutParent(P p10) {
        this.mLayoutParent = p10;
    }

    public void onAfterUpdateTransaction() {
    }

    @Override // com.facebook.react.uimanager.O
    public void onBeforeLayout(C3309z c3309z) {
    }

    public void onCollectExtraUpdates(j0 j0Var) {
    }

    @Override // com.facebook.react.uimanager.O
    public void setLocalData(Object obj) {
    }
}
