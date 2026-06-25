package v;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import w.InterfaceC6878G;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l0.e f61632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f61633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC6878G f61634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f61635d;

    public h(l0.e eVar, Function1 function1, InterfaceC6878G interfaceC6878G, boolean z10) {
        this.f61632a = eVar;
        this.f61633b = function1;
        this.f61634c = interfaceC6878G;
        this.f61635d = z10;
    }

    public final l0.e a() {
        return this.f61632a;
    }

    public final InterfaceC6878G b() {
        return this.f61634c;
    }

    public final boolean c() {
        return this.f61635d;
    }

    public final Function1 d() {
        return this.f61633b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return AbstractC5504s.c(this.f61632a, hVar.f61632a) && AbstractC5504s.c(this.f61633b, hVar.f61633b) && AbstractC5504s.c(this.f61634c, hVar.f61634c) && this.f61635d == hVar.f61635d;
    }

    public int hashCode() {
        return (((((this.f61632a.hashCode() * 31) + this.f61633b.hashCode()) * 31) + this.f61634c.hashCode()) * 31) + Boolean.hashCode(this.f61635d);
    }

    public String toString() {
        return "ChangeSize(alignment=" + this.f61632a + ", size=" + this.f61633b + ", animationSpec=" + this.f61634c + ", clip=" + this.f61635d + ')';
    }
}
