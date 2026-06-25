package Z4;

import Y4.h;
import Y4.m;
import Y4.n;
import Y4.o;
import Y4.r;
import com.bumptech.glide.load.data.j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class a implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final S4.g f23150b = S4.g.f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f23151a;

    public a(m mVar) {
        this.f23151a = mVar;
    }

    @Override // Y4.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(h hVar, int i10, int i11, S4.h hVar2) {
        m mVar = this.f23151a;
        if (mVar != null) {
            h hVar3 = (h) mVar.a(hVar, 0, 0);
            if (hVar3 == null) {
                this.f23151a.b(hVar, 0, 0, hVar);
            } else {
                hVar = hVar3;
            }
        }
        return new n.a(hVar, new j(hVar, ((Integer) hVar2.c(f23150b)).intValue()));
    }

    @Override // Y4.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(h hVar) {
        return true;
    }

    /* JADX INFO: renamed from: Z4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class C0397a implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final m f23152a = new m(500);

        @Override // Y4.o
        public n d(r rVar) {
            return new a(this.f23152a);
        }

        @Override // Y4.o
        public void teardown() {
        }
    }
}
