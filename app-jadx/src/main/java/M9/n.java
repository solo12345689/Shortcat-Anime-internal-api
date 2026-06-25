package M9;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class n extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ t f12291b;

    n(t tVar) {
        this.f12291b = tVar;
    }

    @Override // M9.j
    public final void a() {
        t tVar = this.f12291b;
        if (tVar.f12309m != null) {
            tVar.f12298b.d("Unbind from service.", new Object[0]);
            t tVar2 = this.f12291b;
            tVar2.f12297a.unbindService(tVar2.f12308l);
            this.f12291b.f12303g = false;
            this.f12291b.f12309m = null;
            this.f12291b.f12308l = null;
        }
        this.f12291b.t();
    }
}
