package Xf;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: Xf.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2378o extends C2377n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f22005c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2378o(InterfaceC2385w writer, boolean z10) {
        super(writer);
        AbstractC5504s.h(writer, "writer");
        this.f22005c = z10;
    }

    @Override // Xf.C2377n
    public void n(String value) {
        AbstractC5504s.h(value, "value");
        if (this.f22005c) {
            super.n(value);
        } else {
            super.k(value);
        }
    }
}
