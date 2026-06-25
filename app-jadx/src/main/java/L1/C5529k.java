package l1;

import I0.InterfaceC1692s;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: l1.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C5529k implements InterfaceC1692s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5524f f52485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f52486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f52487c;

    public C5529k(C5524f c5524f, Function1 function1) {
        this.f52485a = c5524f;
        this.f52486b = function1;
        this.f52487c = c5524f.a();
    }

    @Override // I0.InterfaceC1692s
    public Object I0() {
        return this.f52487c;
    }

    public final Function1 a() {
        return this.f52486b;
    }

    public final C5524f b() {
        return this.f52485a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5529k)) {
            return false;
        }
        C5529k c5529k = (C5529k) obj;
        return AbstractC5504s.c(this.f52485a.a(), c5529k.f52485a.a()) && this.f52486b == c5529k.f52486b;
    }

    public int hashCode() {
        return (this.f52485a.a().hashCode() * 31) + this.f52486b.hashCode();
    }
}
