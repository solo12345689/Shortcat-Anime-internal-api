package F2;

import F2.A;
import P9.AbstractC2012v;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import q2.AbstractC6096k;
import t2.AbstractC6614a;
import t2.a0;
import w2.InterfaceC6940g;
import w2.o;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class K implements M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6940g.a f6157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f6158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f6159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f6160d;

    public K(String str, boolean z10, InterfaceC6940g.a aVar) {
        AbstractC6614a.a((z10 && TextUtils.isEmpty(str)) ? false : true);
        this.f6157a = aVar;
        this.f6158b = str;
        this.f6159c = z10;
        this.f6160d = new HashMap();
    }

    @Override // F2.M
    public byte[] a(UUID uuid, A.d dVar) {
        return x.a(this.f6157a.a(), dVar.b() + "&signedRequest=" + a0.J(dVar.a()), null, Collections.EMPTY_MAP);
    }

    @Override // F2.M
    public byte[] b(UUID uuid, A.a aVar) throws N {
        String strB = aVar.b();
        if (this.f6159c || TextUtils.isEmpty(strB)) {
            strB = this.f6158b;
        }
        if (TextUtils.isEmpty(strB)) {
            o.b bVar = new o.b();
            Uri uri = Uri.EMPTY;
            throw new N(bVar.i(uri).a(), uri, AbstractC2012v.k(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap map = new HashMap();
        UUID uuid2 = AbstractC6096k.f56897e;
        map.put("Content-Type", uuid2.equals(uuid) ? "text/xml" : AbstractC6096k.f56895c.equals(uuid) ? "application/json" : "application/octet-stream");
        if (uuid2.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f6160d) {
            map.putAll(this.f6160d);
        }
        return x.a(this.f6157a.a(), strB, aVar.a(), map);
    }

    public void c(String str, String str2) {
        AbstractC6614a.e(str);
        AbstractC6614a.e(str2);
        synchronized (this.f6160d) {
            this.f6160d.put(str, str2);
        }
    }
}
