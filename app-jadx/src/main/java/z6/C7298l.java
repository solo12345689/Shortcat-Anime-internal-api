package z6;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import t5.g;

/* JADX INFO: renamed from: z6.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C7298l implements InterfaceC7303q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC7299m f65733a;

    public C7298l(InterfaceC7299m interfaceC7299m) {
        this.f65733a = interfaceC7299m;
    }

    private static t5.g b(t5.d dVar, t5.f fVar) {
        return c(dVar, fVar, Executors.newSingleThreadExecutor());
    }

    private static t5.g c(t5.d dVar, t5.f fVar, Executor executor) {
        return new t5.g(fVar, dVar.h(), new g.c(dVar.k(), dVar.j(), dVar.f()), dVar.e(), dVar.d(), dVar.g(), executor, dVar.i());
    }

    @Override // z6.InterfaceC7303q
    public t5.k a(t5.d dVar) {
        return b(dVar, this.f65733a.a(dVar));
    }
}
