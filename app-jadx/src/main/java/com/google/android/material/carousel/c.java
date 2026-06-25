package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;
import u9.InterfaceC6744a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a */
    private float f42186a;

    /* JADX INFO: renamed from: b */
    private float f42187b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    enum a {
        CONTAINED,
        UNCONTAINED
    }

    static int[] a(int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr2[i10] = iArr[i10] * 2;
        }
        return iArr2;
    }

    public static float b(float f10, float f11, float f12) {
        return 1.0f - ((f10 - f12) / (f11 - f12));
    }

    public float c() {
        return this.f42187b;
    }

    public float d() {
        return this.f42186a;
    }

    a e() {
        return a.CONTAINED;
    }

    void f(Context context) {
        float fH = this.f42186a;
        if (fH <= 0.0f) {
            fH = d.h(context);
        }
        this.f42186a = fH;
        float fG = this.f42187b;
        if (fG <= 0.0f) {
            fG = d.g(context);
        }
        this.f42187b = fG;
    }

    public abstract e g(InterfaceC6744a interfaceC6744a, View view);

    public abstract boolean h(InterfaceC6744a interfaceC6744a, int i10);
}
