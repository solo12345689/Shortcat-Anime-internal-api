package L2;

import Q2.o;
import android.net.Uri;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements o.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o.a f11247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f11248b;

    public b(o.a aVar, List list) {
        this.f11247a = aVar;
        this.f11248b = list;
    }

    @Override // Q2.o.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a a(Uri uri, InputStream inputStream) {
        a aVar = (a) this.f11247a.a(uri, inputStream);
        List list = this.f11248b;
        return (list == null || list.isEmpty()) ? aVar : (a) aVar.a(this.f11248b);
    }
}
