package Db;

import dg.D;
import dg.x;
import kotlin.jvm.internal.AbstractC5504s;
import tg.InterfaceC6684i;
import tg.K;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final D f3565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f3566c;

    public a(D requestBody, b progressListener) {
        AbstractC5504s.h(requestBody, "requestBody");
        AbstractC5504s.h(progressListener, "progressListener");
        this.f3565b = requestBody;
        this.f3566c = progressListener;
    }

    @Override // dg.D
    public long a() {
        return this.f3565b.a();
    }

    @Override // dg.D
    public x b() {
        return this.f3565b.b();
    }

    @Override // dg.D
    public void f(InterfaceC6684i sink) {
        AbstractC5504s.h(sink, "sink");
        InterfaceC6684i interfaceC6684iC = K.c(new c(sink, this, this.f3566c));
        this.f3565b.f(interfaceC6684iC);
        interfaceC6684iC.flush();
    }
}
