package androidx.compose.ui.focus;

import K0.A0;
import K0.B0;
import K0.InterfaceC1794j;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f26695a = new u();

    private u() {
    }

    public final void a(FocusTargetNode focusTargetNode) {
        InterfaceC1794j node = focusTargetNode.getNode();
        A0 a02 = node instanceof A0 ? (A0) node : null;
        if (a02 != null) {
            B0.b(a02);
        }
    }
}
