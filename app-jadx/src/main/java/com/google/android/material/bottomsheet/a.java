package com.google.android.material.bottomsheet;

import android.view.View;
import androidx.core.view.C2777p0;
import androidx.core.view.L0;
import java.util.Iterator;
import java.util.List;
import p9.AbstractC5946a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class a extends C2777p0.b {

    /* JADX INFO: renamed from: a */
    private final View f42067a;

    /* JADX INFO: renamed from: b */
    private int f42068b;

    /* JADX INFO: renamed from: c */
    private int f42069c;

    /* JADX INFO: renamed from: d */
    private final int[] f42070d;

    public a(View view) {
        super(0);
        this.f42070d = new int[2];
        this.f42067a = view;
    }

    @Override // androidx.core.view.C2777p0.b
    public void onEnd(C2777p0 c2777p0) {
        this.f42067a.setTranslationY(0.0f);
    }

    @Override // androidx.core.view.C2777p0.b
    public void onPrepare(C2777p0 c2777p0) {
        this.f42067a.getLocationOnScreen(this.f42070d);
        this.f42068b = this.f42070d[1];
    }

    @Override // androidx.core.view.C2777p0.b
    public L0 onProgress(L0 l02, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((C2777p0) it.next()).d() & L0.p.d()) != 0) {
                this.f42067a.setTranslationY(AbstractC5946a.c(this.f42069c, 0, r0.c()));
                break;
            }
        }
        return l02;
    }

    @Override // androidx.core.view.C2777p0.b
    public C2777p0.a onStart(C2777p0 c2777p0, C2777p0.a aVar) {
        this.f42067a.getLocationOnScreen(this.f42070d);
        int i10 = this.f42068b - this.f42070d[1];
        this.f42069c = i10;
        this.f42067a.setTranslationY(i10);
        return aVar;
    }
}
