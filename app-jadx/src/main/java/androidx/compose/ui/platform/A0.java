package androidx.compose.ui.platform;

import h0.p;
import ie.InterfaceC5082a;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class A0 implements h0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ h0.p f27025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC5082a f27026b;

    public A0(h0.p pVar, InterfaceC5082a interfaceC5082a) {
        this.f27025a = pVar;
        this.f27026b = interfaceC5082a;
    }

    @Override // h0.p
    public boolean a(Object obj) {
        return this.f27025a.a(obj);
    }

    public final void b() {
        this.f27026b.invoke();
    }

    @Override // h0.p
    public Map d() {
        return this.f27025a.d();
    }

    @Override // h0.p
    public Object e(String str) {
        return this.f27025a.e(str);
    }

    @Override // h0.p
    public p.a f(String str, InterfaceC5082a interfaceC5082a) {
        return this.f27025a.f(str, interfaceC5082a);
    }
}
