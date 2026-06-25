package R0;

import K0.J;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import t.AbstractC6565o;
import t.C6546L;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final J f15021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2095d f15022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AbstractC6565o f15023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C6546L f15024d = new C6546L(2);

    public v(J j10, C2095d c2095d, AbstractC6565o abstractC6565o) {
        this.f15021a = j10;
        this.f15022b = c2095d;
        this.f15023c = abstractC6565o;
    }

    public final n a(int i10) {
        return (n) this.f15023c.c(i10);
    }

    public final C6546L b() {
        return this.f15024d;
    }

    public final n c() {
        return this.f15021a;
    }

    public final s d() {
        return new s(this.f15022b, false, this.f15021a, new SemanticsConfiguration());
    }

    public final void e(n nVar, SemanticsConfiguration semanticsConfiguration) {
        C6546L c6546l = this.f15024d;
        Object[] objArr = c6546l.f60006a;
        int i10 = c6546l.f60007b;
        for (int i11 = 0; i11 < i10; i11++) {
            ((p) objArr[i11]).a(nVar, semanticsConfiguration);
        }
    }
}
