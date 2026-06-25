package androidx.compose.ui.focus;

import K0.AbstractC1796k;
import K0.J;
import a0.C2507c;
import java.util.Comparator;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class t implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f26694a = new t();

    private t() {
    }

    private final C2507c b(J j10) {
        C2507c c2507c = new C2507c(new J[16], 0);
        while (j10 != null) {
            c2507c.b(0, j10);
            j10 = j10.A0();
        }
        return c2507c;
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2) {
        int i10 = 0;
        if (!r.g(focusTargetNode) || !r.g(focusTargetNode2)) {
            if (r.g(focusTargetNode)) {
                return -1;
            }
            return r.g(focusTargetNode2) ? 1 : 0;
        }
        J jN = AbstractC1796k.n(focusTargetNode);
        J jN2 = AbstractC1796k.n(focusTargetNode2);
        if (AbstractC5504s.c(jN, jN2)) {
            return 0;
        }
        C2507c c2507cB = b(jN);
        C2507c c2507cB2 = b(jN2);
        int iMin = Math.min(c2507cB.p() - 1, c2507cB2.p() - 1);
        if (iMin >= 0) {
            while (AbstractC5504s.c(c2507cB.f23496a[i10], c2507cB2.f23496a[i10])) {
                if (i10 != iMin) {
                    i10++;
                }
            }
            return AbstractC5504s.i(((J) c2507cB.f23496a[i10]).B0(), ((J) c2507cB2.f23496a[i10]).B0());
        }
        throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
    }
}
