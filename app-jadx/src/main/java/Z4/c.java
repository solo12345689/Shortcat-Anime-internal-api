package Z4;

import S4.h;
import Y4.n;
import Y4.o;
import Y4.r;
import android.content.Context;
import android.net.Uri;
import b5.b0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class c implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f23155a;

    public c(Context context) {
        this.f23155a = context.getApplicationContext();
    }

    private boolean e(h hVar) {
        Long l10 = (Long) hVar.c(b0.f33148d);
        return l10 != null && l10.longValue() == -1;
    }

    @Override // Y4.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(Uri uri, int i10, int i11, h hVar) {
        if (T4.c.f(i10, i11) && e(hVar)) {
            return new n.a(new n5.c(uri), T4.d.g(this.f23155a, uri));
        }
        return null;
    }

    @Override // Y4.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return T4.c.e(uri);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f23156a;

        public a(Context context) {
            this.f23156a = context;
        }

        @Override // Y4.o
        public n d(r rVar) {
            return new c(this.f23156a);
        }

        @Override // Y4.o
        public void teardown() {
        }
    }
}
