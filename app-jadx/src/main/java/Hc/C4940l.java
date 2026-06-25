package hc;

import dc.r;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: hc.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class C4940l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f47841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private r f47842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private r f47843c;

    public C4940l(String name) {
        AbstractC5504s.h(name, "name");
        this.f47841a = name;
    }

    public final C4939k a() {
        return new C4939k(this.f47841a, this.f47842b, this.f47843c);
    }

    public final void b(r rVar) {
        this.f47842b = rVar;
    }

    public final void c(r rVar) {
        this.f47843c = rVar;
    }
}
