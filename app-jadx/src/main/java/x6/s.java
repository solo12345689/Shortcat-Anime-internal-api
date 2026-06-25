package x6;

import s5.InterfaceC6433d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class s {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f63986a;

        a(t tVar) {
            this.f63986a = tVar;
        }

        @Override // x6.z
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(InterfaceC6433d interfaceC6433d) {
            this.f63986a.i(interfaceC6433d);
        }

        @Override // x6.z
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(InterfaceC6433d interfaceC6433d) {
            this.f63986a.g(interfaceC6433d);
        }

        @Override // x6.z
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void c(InterfaceC6433d interfaceC6433d) {
            this.f63986a.d(interfaceC6433d);
        }
    }

    public static u a(x xVar, t tVar) {
        tVar.b(xVar);
        return new u(xVar, new a(tVar));
    }
}
