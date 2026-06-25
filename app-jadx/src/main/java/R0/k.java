package R0;

import android.graphics.Region;
import i1.C5023p;
import kotlin.jvm.internal.AbstractC5504s;
import s0.s1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class k implements D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Region f14975a = new Region();

    @Override // R0.D
    public boolean a(C5023p c5023p) {
        return this.f14975a.op(c5023p.f(), c5023p.h(), c5023p.g(), c5023p.d(), Region.Op.DIFFERENCE);
    }

    @Override // R0.D
    public void b(C5023p c5023p) {
        this.f14975a.set(c5023p.f(), c5023p.h(), c5023p.g(), c5023p.d());
    }

    @Override // R0.D
    public boolean c(D d10) {
        Region region = this.f14975a;
        AbstractC5504s.f(d10, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticRegionImpl");
        return region.op(((k) d10).f14975a, Region.Op.INTERSECT);
    }

    @Override // R0.D
    public C5023p getBounds() {
        return s1.d(this.f14975a.getBounds());
    }

    @Override // R0.D
    public boolean isEmpty() {
        return this.f14975a.isEmpty();
    }
}
