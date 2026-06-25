package androidx.compose.foundation.relocation;

import androidx.compose.ui.e;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends e.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private H.b f26372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f26373b;

    public e(H.b bVar) {
        this.f26372a = bVar;
    }

    private final void E1() {
        H.b bVar = this.f26372a;
        if (bVar instanceof a) {
            AbstractC5504s.f(bVar, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            ((a) bVar).b().w(this);
        }
    }

    public final void F1(H.b bVar) {
        E1();
        if (bVar instanceof a) {
            ((a) bVar).b().c(this);
        }
        this.f26372a = bVar;
    }

    @Override // androidx.compose.ui.e.c
    public boolean getShouldAutoInvalidate() {
        return this.f26373b;
    }

    @Override // androidx.compose.ui.e.c
    public void onAttach() {
        F1(this.f26372a);
    }

    @Override // androidx.compose.ui.e.c
    public void onDetach() {
        E1();
    }
}
