package expo.modules.image.okhttp;

import Df.r;
import Td.u;
import Td.v;
import Ud.AbstractC2279u;
import android.webkit.CookieManager;
import dg.m;
import dg.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
final class b implements n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f46107c = new b();

    private b() {
    }

    private final CookieManager e() {
        Object objB;
        try {
            u.a aVar = u.f17466b;
            objB = u.b(CookieManager.getInstance());
        } catch (Throwable th2) {
            u.a aVar2 = u.f17466b;
            objB = u.b(v.a(th2));
        }
        if (u.g(objB)) {
            objB = null;
        }
        return (CookieManager) objB;
    }

    @Override // dg.n
    public List b(dg.u url) {
        AbstractC5504s.h(url, "url");
        CookieManager cookieManagerE = e();
        if (cookieManagerE == null) {
            return AbstractC2279u.m();
        }
        String cookie = cookieManagerE.getCookie(url.toString());
        if (cookie == null) {
            return AbstractC2279u.m();
        }
        List listN0 = r.N0(cookie, new String[]{";"}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList();
        Iterator it = listN0.iterator();
        while (it.hasNext()) {
            m mVarC = m.f45533j.c(url, r.k1((String) it.next()).toString());
            if (mVarC != null) {
                arrayList.add(mVarC);
            }
        }
        return arrayList;
    }

    @Override // dg.n
    public void d(dg.u url, List cookies) {
        AbstractC5504s.h(url, "url");
        AbstractC5504s.h(cookies, "cookies");
        CookieManager cookieManagerE = e();
        if (cookieManagerE == null) {
            return;
        }
        String string = url.toString();
        Iterator it = cookies.iterator();
        while (it.hasNext()) {
            cookieManagerE.setCookie(string, ((m) it.next()).toString());
        }
        cookieManagerE.flush();
    }
}
