package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import u9.InterfaceC6744a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f42222d = {1};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f42223e = {1, 0};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f42224c = 0;

    @Override // com.google.android.material.carousel.c
    public e g(InterfaceC6744a interfaceC6744a, View view) {
        boolean z10;
        int iC = interfaceC6744a.c();
        if (interfaceC6744a.f()) {
            iC = interfaceC6744a.b();
        }
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        float f10 = ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (interfaceC6744a.f()) {
            f10 = ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float fD = d() + f10;
        float fMax = Math.max(c() + f10, fD);
        float f11 = iC;
        float fMin = Math.min(measuredHeight + f10, f11);
        float fA = E1.a.a((measuredHeight / 3.0f) + f10, fD + f10, fMax + f10);
        float f12 = (fMin + fA) / 2.0f;
        int[] iArrA = f42222d;
        float f13 = 2.0f * fD;
        if (f11 <= f13) {
            iArrA = new int[]{0};
        }
        int[] iArrA2 = f42223e;
        if (interfaceC6744a.e() == 1) {
            iArrA = c.a(iArrA);
            iArrA2 = c.a(iArrA2);
        }
        int[] iArr = iArrA2;
        int[] iArr2 = iArrA;
        float f14 = f10;
        int iMax = (int) Math.max(1.0d, Math.floor(((f11 - (d.i(iArr) * f12)) - (d.i(iArr2) * fMax)) / fMin));
        int iCeil = (int) Math.ceil(f11 / fMin);
        int i10 = (iCeil - iMax) + 1;
        int[] iArr3 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr3[i11] = iCeil - i11;
        }
        a aVarC = a.c(f11, fA, fD, fMax, iArr2, f12, iArr, fMin, iArr3);
        this.f42224c = aVarC.e();
        boolean zI = i(aVarC, interfaceC6744a.a());
        int i12 = aVarC.f42178d;
        if (i12 == 0 && aVarC.f42177c == 0 && f11 > f13) {
            aVarC.f42177c = 1;
            z10 = true;
        } else {
            z10 = zI;
        }
        if (z10) {
            aVarC = a.c(f11, fA, fD, fMax, new int[]{aVarC.f42177c}, f12, new int[]{i12}, fMin, new int[]{aVarC.f42181g});
        }
        return d.d(view.getContext(), f14, iC, aVarC, interfaceC6744a.e());
    }

    @Override // com.google.android.material.carousel.c
    public boolean h(InterfaceC6744a interfaceC6744a, int i10) {
        if (i10 >= this.f42224c || interfaceC6744a.a() < this.f42224c) {
            return i10 >= this.f42224c && interfaceC6744a.a() < this.f42224c;
        }
        return true;
    }

    boolean i(a aVar, int i10) {
        int iE = aVar.e() - i10;
        boolean z10 = iE > 0 && (aVar.f42177c > 0 || aVar.f42178d > 1);
        while (iE > 0) {
            int i11 = aVar.f42177c;
            if (i11 > 0) {
                aVar.f42177c = i11 - 1;
            } else {
                int i12 = aVar.f42178d;
                if (i12 > 1) {
                    aVar.f42178d = i12 - 1;
                }
            }
            iE--;
        }
        return z10;
    }
}
