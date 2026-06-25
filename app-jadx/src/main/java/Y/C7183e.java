package y;

import androidx.compose.ui.window.s;
import i1.AbstractC5022o;
import i1.C5021n;
import i1.C5023p;
import i1.C5025r;
import i1.EnumC5027t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: y.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C7183e implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f64622a;

    public /* synthetic */ C7183e(long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10);
    }

    @Override // androidx.compose.ui.window.s
    public long a(C5023p c5023p, long j10, EnumC5027t enumC5027t, long j11) {
        return AbstractC5022o.a(AbstractC7184f.b(c5023p.f() + C5021n.k(this.f64622a), C5025r.g(j11), C5025r.g(j10), enumC5027t == EnumC5027t.f48573a), AbstractC7184f.c(c5023p.h() + C5021n.l(this.f64622a), C5025r.f(j11), C5025r.f(j10), false, 8, null));
    }

    private C7183e(long j10) {
        this.f64622a = j10;
    }
}
