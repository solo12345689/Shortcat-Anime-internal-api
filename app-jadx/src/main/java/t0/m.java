package t0;

import t.AbstractC6566p;
import t.C6540F;
import t0.r;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C6540F f60241a;

    static {
        k kVar = k.f60205a;
        int iB = kVar.G().b();
        int iB2 = kVar.G().b();
        r.a aVar = r.f60259a;
        f60241a = AbstractC6566p.d(iB | (iB2 << 6) | (aVar.b() << 12), l.f60231g.c(kVar.G()), kVar.G().b() | (kVar.D().b() << 6) | (aVar.b() << 12), new l(kVar.G(), kVar.D(), aVar.b(), null), kVar.D().b() | (kVar.G().b() << 6) | (aVar.b() << 12), new l(kVar.D(), kVar.G(), aVar.b(), null));
    }

    public static final C6540F a() {
        return f60241a;
    }
}
