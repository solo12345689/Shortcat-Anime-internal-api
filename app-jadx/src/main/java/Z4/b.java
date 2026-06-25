package Z4;

import S4.h;
import Y4.n;
import Y4.o;
import Y4.r;
import android.content.Context;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f23153a;

    public b(Context context) {
        this.f23153a = context.getApplicationContext();
    }

    @Override // Y4.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(Uri uri, int i10, int i11, h hVar) {
        if (T4.c.f(i10, i11)) {
            return new n.a(new n5.c(uri), T4.d.f(this.f23153a, uri));
        }
        return null;
    }

    @Override // Y4.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return T4.c.b(uri);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f23154a;

        public a(Context context) {
            this.f23154a = context;
        }

        @Override // Y4.o
        public n d(r rVar) {
            return new b(this.f23154a);
        }

        @Override // Y4.o
        public void teardown() {
        }
    }
}
