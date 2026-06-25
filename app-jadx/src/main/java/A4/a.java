package A4;

import A4.i;
import Ud.AbstractC2279u;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import tg.K;
import v4.InterfaceC6845d;
import x4.C7052a;
import x4.q;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final G4.m f270b;

    /* JADX INFO: renamed from: A4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0003a implements i.a {
        @Override // A4.i.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(Uri uri, G4.m mVar, InterfaceC6845d interfaceC6845d) {
            if (L4.j.p(uri)) {
                return new a(uri, mVar);
            }
            return null;
        }
    }

    public a(Uri uri, G4.m mVar) {
        this.f269a = uri;
        this.f270b = mVar;
    }

    @Override // A4.i
    public Object a(Zd.e eVar) {
        String strW0 = AbstractC2279u.w0(AbstractC2279u.g0(this.f269a.getPathSegments(), 1), "/", null, null, 0, null, null, 62, null);
        return new m(q.b(K.d(K.k(this.f270b.g().getAssets().open(strW0))), this.f270b.g(), new C7052a(strW0)), L4.j.j(MimeTypeMap.getSingleton(), strW0), x4.f.DISK);
    }
}
