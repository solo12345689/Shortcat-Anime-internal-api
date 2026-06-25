package h5;

import android.content.Context;
import h5.InterfaceC4905b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class d implements InterfaceC4905b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f47607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final InterfaceC4905b.a f47608b;

    d(Context context, InterfaceC4905b.a aVar) {
        this.f47607a = context.getApplicationContext();
        this.f47608b = aVar;
    }

    private void e() {
        r.a(this.f47607a).d(this.f47608b);
    }

    private void g() {
        r.a(this.f47607a).e(this.f47608b);
    }

    @Override // h5.l
    public void a() {
        g();
    }

    @Override // h5.l
    public void b() {
        e();
    }

    @Override // h5.l
    public void d() {
    }
}
