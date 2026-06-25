package D;

import i1.AbstractC5010c;
import i1.C5009b;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u implements F.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f3498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final F.u f3499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f3500c;

    public /* synthetic */ u(long j10, boolean z10, m mVar, F.u uVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, z10, mVar, uVar);
    }

    public static /* synthetic */ t e(u uVar, int i10, long j10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAndMeasure-0kLqBqw");
        }
        if ((i11 & 2) != 0) {
            j10 = uVar.f3500c;
        }
        return uVar.d(i10, j10);
    }

    public abstract t b(int i10, Object obj, Object obj2, List list, long j10);

    @Override // F.x
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public t a(int i10, int i11, int i12, long j10) {
        return d(i10, j10);
    }

    public final t d(int i10, long j10) {
        return b(i10, this.f3498a.d(i10), this.f3498a.f(i10), this.f3499b.g0(i10, j10), j10);
    }

    public final long f() {
        return this.f3500c;
    }

    public final androidx.compose.foundation.lazy.layout.c g() {
        return this.f3498a.b();
    }

    private u(long j10, boolean z10, m mVar, F.u uVar) {
        this.f3498a = mVar;
        this.f3499b = uVar;
        this.f3500c = AbstractC5010c.b(0, z10 ? C5009b.l(j10) : Integer.MAX_VALUE, 0, z10 ? Integer.MAX_VALUE : C5009b.k(j10), 5, null);
    }
}
