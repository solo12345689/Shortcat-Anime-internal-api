package r8;

import p8.AbstractC5939d;
import p8.C5938c;
import p8.InterfaceC5942g;
import p8.InterfaceC5943h;
import p8.InterfaceC5945j;

/* JADX INFO: renamed from: r8.r, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C6292r implements InterfaceC5943h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC6289o f58708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f58709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C5938c f58710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC5942g f58711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC6293s f58712e;

    C6292r(AbstractC6289o abstractC6289o, String str, C5938c c5938c, InterfaceC5942g interfaceC5942g, InterfaceC6293s interfaceC6293s) {
        this.f58708a = abstractC6289o;
        this.f58709b = str;
        this.f58710c = c5938c;
        this.f58711d = interfaceC5942g;
        this.f58712e = interfaceC6293s;
    }

    @Override // p8.InterfaceC5943h
    public void a(AbstractC5939d abstractC5939d) {
        c(abstractC5939d, new InterfaceC5945j() { // from class: r8.q
            @Override // p8.InterfaceC5945j
            public final void a(Exception exc) {
                C6292r.b(exc);
            }
        });
    }

    public void c(AbstractC5939d abstractC5939d, InterfaceC5945j interfaceC5945j) {
        this.f58712e.a(AbstractC6288n.a().e(this.f58708a).c(abstractC5939d).f(this.f58709b).d(this.f58711d).b(this.f58710c).a(), interfaceC5945j);
    }

    public static /* synthetic */ void b(Exception exc) {
    }
}
