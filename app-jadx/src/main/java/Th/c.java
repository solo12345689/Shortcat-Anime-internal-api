package Th;

import Zh.e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class c implements e.c, Sh.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f17569a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f17570a = false;

        public Sh.a b() {
            return new c(this, null);
        }
    }

    /* synthetic */ c(a aVar, b bVar) {
        this(aVar);
    }

    public static a b() {
        return new a();
    }

    public static Sh.a c() {
        return b().b();
    }

    @Override // Zh.e.c
    public void a(e.b bVar) {
        bVar.h(new Uh.a(this.f17569a));
    }

    private c(a aVar) {
        this.f17569a = aVar.f17570a;
    }
}
