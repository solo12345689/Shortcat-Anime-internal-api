package l1;

import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import q1.b;

/* JADX INFO: renamed from: l1.A, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C5513A implements InterfaceC5532n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p1.f f52408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b.d f52409b = new b.d();

    public C5513A(p1.f fVar) {
        this.f52408a = fVar;
    }

    @Override // l1.InterfaceC5532n
    public void b(C5515C c5515c, List list) {
        q1.b.v(this.f52408a, c5515c, this.f52409b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC5504s.c(C5513A.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC5504s.f(obj, "null cannot be cast to non-null type androidx.constraintlayout.compose.RawConstraintSet");
        return AbstractC5504s.c(this.f52408a, ((C5513A) obj).f52408a);
    }

    public int hashCode() {
        return this.f52408a.hashCode();
    }
}
