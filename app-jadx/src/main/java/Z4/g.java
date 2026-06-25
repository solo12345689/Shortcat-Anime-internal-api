package Z4;

import S4.h;
import Y4.n;
import Y4.o;
import Y4.r;
import java.io.InputStream;
import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f23174a;

    public g(n nVar) {
        this.f23174a = nVar;
    }

    @Override // Y4.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(URL url, int i10, int i11, h hVar) {
        return this.f23174a.b(new Y4.h(url), i10, i11, hVar);
    }

    @Override // Y4.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(URL url) {
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a implements o {
        @Override // Y4.o
        public n d(r rVar) {
            return new g(rVar.d(Y4.h.class, InputStream.class));
        }

        @Override // Y4.o
        public void teardown() {
        }
    }
}
