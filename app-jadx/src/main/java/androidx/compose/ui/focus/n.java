package androidx.compose.ui.focus;

import androidx.compose.ui.e;
import q0.InterfaceC6067m;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class n extends e.c implements InterfaceC6067m {

    /* JADX INFO: renamed from: a */
    private k f26685a;

    public n(k kVar) {
        this.f26685a = kVar;
    }

    public final k E1() {
        return this.f26685a;
    }

    public final void F1(k kVar) {
        this.f26685a = kVar;
    }

    @Override // androidx.compose.ui.e.c
    public void onAttach() {
        super.onAttach();
        this.f26685a.e().c(this);
    }

    @Override // androidx.compose.ui.e.c
    public void onDetach() {
        this.f26685a.e().w(this);
        super.onDetach();
    }
}
