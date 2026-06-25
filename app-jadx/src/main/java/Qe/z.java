package Qe;

import kotlin.jvm.internal.AbstractC5504s;
import mf.C5693y;
import of.InterfaceC5895s;
import ye.i0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class z implements InterfaceC5895s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x f14917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C5693y f14918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f14919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final of.r f14920e;

    public z(x binaryClass, C5693y c5693y, boolean z10, of.r abiStability) {
        AbstractC5504s.h(binaryClass, "binaryClass");
        AbstractC5504s.h(abiStability, "abiStability");
        this.f14917b = binaryClass;
        this.f14918c = c5693y;
        this.f14919d = z10;
        this.f14920e = abiStability;
    }

    @Override // of.InterfaceC5895s
    public String a() {
        return "Class '" + this.f14917b.g().a().a() + '\'';
    }

    @Override // ye.h0
    public i0 b() {
        i0 NO_SOURCE_FILE = i0.f65113a;
        AbstractC5504s.g(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }

    public final x d() {
        return this.f14917b;
    }

    public String toString() {
        return z.class.getSimpleName() + ": " + this.f14917b;
    }
}
