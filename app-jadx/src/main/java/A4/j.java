package A4;

import A4.i;
import android.webkit.MimeTypeMap;
import java.io.File;
import tg.P;
import v4.InterfaceC6845d;
import x4.q;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class j implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f282a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements i.a {
        @Override // A4.i.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(File file, G4.m mVar, InterfaceC6845d interfaceC6845d) {
            return new j(file);
        }
    }

    public j(File file) {
        this.f282a = file;
    }

    @Override // A4.i
    public Object a(Zd.e eVar) {
        return new m(q.d(P.a.d(P.f60968b, this.f282a, false, 1, null), null, null, null, 14, null), MimeTypeMap.getSingleton().getMimeTypeFromExtension(fe.k.A(this.f282a)), x4.f.DISK);
    }
}
