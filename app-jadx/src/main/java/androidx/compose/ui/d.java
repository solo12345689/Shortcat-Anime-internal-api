package androidx.compose.ui;

import K0.AbstractC1796k;
import Y.I;
import androidx.compose.ui.e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends e.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private I f26577a;

    public d(I i10) {
        this.f26577a = i10;
    }

    public final void E1(I i10) {
        this.f26577a = i10;
        AbstractC1796k.n(this).k(i10);
    }

    @Override // androidx.compose.ui.e.c
    public void onAttach() {
        AbstractC1796k.n(this).k(this.f26577a);
    }
}
