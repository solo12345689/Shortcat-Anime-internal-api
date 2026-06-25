package R8;

/* JADX INFO: renamed from: R8.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2114o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final N f15345a = new K();

    /* JADX INFO: renamed from: R8.o$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        Object a(P8.k kVar);
    }

    public static n9.i a(P8.h hVar, a aVar) {
        N n10 = f15345a;
        n9.j jVar = new n9.j();
        hVar.addStatusListener(new L(hVar, jVar, aVar, n10));
        return jVar.a();
    }

    public static n9.i b(P8.h hVar) {
        return a(hVar, new M());
    }
}
