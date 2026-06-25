package K0;

import androidx.compose.ui.e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class E0 extends e.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f10410a;

    public E0() {
        setAggregateChildKindSet$ui_release(0);
    }

    public final boolean E1() {
        return this.f10410a;
    }

    @Override // androidx.compose.ui.e.c
    public void onAttach() {
        this.f10410a = true;
    }

    @Override // androidx.compose.ui.e.c
    public void onDetach() {
        this.f10410a = false;
    }

    public String toString() {
        return "<tail>";
    }
}
