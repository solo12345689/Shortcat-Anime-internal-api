package com.th3rdwave.safeareacontext;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.B;
import com.facebook.react.uimanager.C3309z;
import com.facebook.react.uimanager.D0;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class p extends com.facebook.react.uimanager.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n f44884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f44885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float[] f44886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f44887d;

    public p() {
        int[] iArr = D0.f37518c;
        this.f44885b = new float[iArr.length];
        this.f44886c = new float[iArr.length];
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f44885b[i10] = Float.NaN;
            this.f44886c[i10] = Float.NaN;
        }
    }

    private final float f(l lVar, float f10, float f11) {
        return lVar == l.f44868a ? f11 : lVar == l.f44870c ? Math.max(f10, f11) : f10 + f11;
    }

    private final void g(o oVar) {
        if (oVar == o.f44880a) {
            super.setPadding(1, this.f44885b[1]);
            super.setPadding(2, this.f44885b[2]);
            super.setPadding(3, this.f44885b[3]);
            super.setPadding(0, this.f44885b[0]);
        } else {
            super.setMargin(1, this.f44886c[1]);
            super.setMargin(2, this.f44886c[2]);
            super.setMargin(3, this.f44886c[3]);
            super.setMargin(0, this.f44886c[0]);
        }
        markUpdated();
    }

    private final void h() {
        n nVar = this.f44884a;
        if (nVar == null) {
            return;
        }
        o oVarC = nVar.c();
        o oVar = o.f44880a;
        float[] fArr = oVarC == oVar ? this.f44885b : this.f44886c;
        float f10 = fArr[8];
        if (Float.isNaN(f10)) {
            f10 = 0.0f;
        }
        float f11 = f10;
        float f12 = f11;
        float f13 = f12;
        float f14 = fArr[7];
        if (!Float.isNaN(f14)) {
            f10 = f14;
            f12 = f10;
        }
        float f15 = fArr[6];
        if (!Float.isNaN(f15)) {
            f11 = f15;
            f13 = f11;
        }
        float f16 = fArr[1];
        if (!Float.isNaN(f16)) {
            f10 = f16;
        }
        float f17 = fArr[2];
        if (!Float.isNaN(f17)) {
            f11 = f17;
        }
        float f18 = fArr[3];
        if (!Float.isNaN(f18)) {
            f12 = f18;
        }
        float f19 = fArr[0];
        if (!Float.isNaN(f19)) {
            f13 = f19;
        }
        float fI = B.i(f10);
        float fI2 = B.i(f11);
        float fI3 = B.i(f12);
        float fI4 = B.i(f13);
        m mVarA = nVar.a();
        a aVarB = nVar.b();
        if (nVar.c() == oVar) {
            super.setPadding(1, f(mVarA.d(), aVarB.d(), fI));
            super.setPadding(2, f(mVarA.c(), aVarB.c(), fI2));
            super.setPadding(3, f(mVarA.a(), aVarB.a(), fI3));
            super.setPadding(0, f(mVarA.b(), aVarB.b(), fI4));
            return;
        }
        super.setMargin(1, f(mVarA.d(), aVarB.d(), fI));
        super.setMargin(2, f(mVarA.c(), aVarB.c(), fI2));
        super.setMargin(3, f(mVarA.a(), aVarB.a(), fI3));
        super.setMargin(0, f(mVarA.b(), aVarB.b(), fI4));
    }

    @Override // com.facebook.react.uimanager.P, com.facebook.react.uimanager.O
    public void onBeforeLayout(C3309z nativeViewHierarchyOptimizer) {
        AbstractC5504s.h(nativeViewHierarchyOptimizer, "nativeViewHierarchyOptimizer");
        if (this.f44887d) {
            this.f44887d = false;
            h();
        }
    }

    @Override // com.facebook.react.uimanager.P, com.facebook.react.uimanager.O
    public void setLocalData(Object data) {
        AbstractC5504s.h(data, "data");
        if (data instanceof n) {
            n nVar = this.f44884a;
            if (nVar != null && nVar.c() != ((n) data).c()) {
                g(nVar.c());
            }
            this.f44884a = (n) data;
            this.f44887d = false;
            h();
        }
    }

    @Override // com.facebook.react.uimanager.r
    @B7.b(names = {"margin", "marginVertical", "marginHorizontal", "marginStart", "marginEnd", "marginTop", "marginBottom", "marginLeft", "marginRight"})
    public void setMargins(int i10, Dynamic margin) {
        AbstractC5504s.h(margin, "margin");
        this.f44886c[D0.f37518c[i10]] = margin.getType() == ReadableType.Number ? (float) margin.asDouble() : Float.NaN;
        super.setMargins(i10, margin);
        this.f44887d = true;
    }

    @Override // com.facebook.react.uimanager.r
    @B7.b(names = {"padding", "paddingVertical", "paddingHorizontal", "paddingStart", "paddingEnd", "paddingTop", "paddingBottom", "paddingLeft", "paddingRight"})
    public void setPaddings(int i10, Dynamic padding) {
        AbstractC5504s.h(padding, "padding");
        this.f44885b[D0.f37518c[i10]] = padding.getType() == ReadableType.Number ? (float) padding.asDouble() : Float.NaN;
        super.setPaddings(i10, padding);
        this.f44887d = true;
    }
}
