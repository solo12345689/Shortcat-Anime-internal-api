package dg;

import Ud.AbstractC2279u;
import Ud.S;
import dg.m;
import fg.AbstractC4804b;
import fg.AbstractC4807e;
import java.io.IOException;
import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class w implements n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CookieHandler f45604c;

    public w(CookieHandler cookieHandler) {
        AbstractC5504s.h(cookieHandler, "cookieHandler");
        this.f45604c = cookieHandler;
    }

    private final List e(u uVar, String str) {
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            int iQ = AbstractC4807e.q(str, ";,", i10, length);
            int iP = AbstractC4807e.p(str, '=', i10, iQ);
            String strZ = AbstractC4807e.Z(str, i10, iP);
            if (!Df.r.Q(strZ, "$", false, 2, null)) {
                String strZ2 = iP < iQ ? AbstractC4807e.Z(str, iP + 1, iQ) : "";
                if (Df.r.Q(strZ2, "\"", false, 2, null) && Df.r.A(strZ2, "\"", false, 2, null)) {
                    strZ2 = strZ2.substring(1, strZ2.length() - 1);
                    AbstractC5504s.g(strZ2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                }
                arrayList.add(new m.a().d(strZ).e(strZ2).b(uVar.h()).a());
            }
            i10 = iQ + 1;
        }
        return arrayList;
    }

    @Override // dg.n
    public List b(u url) {
        AbstractC5504s.h(url, "url");
        try {
            Map<String, List<String>> cookieHeaders = this.f45604c.get(url.r(), S.i());
            AbstractC5504s.g(cookieHeaders, "cookieHeaders");
            ArrayList arrayList = null;
            for (Map.Entry<String, List<String>> entry : cookieHeaders.entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                if (Df.r.B("Cookie", key, true) || Df.r.B("Cookie2", key, true)) {
                    AbstractC5504s.g(value, "value");
                    if (!value.isEmpty()) {
                        for (String header : value) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            AbstractC5504s.g(header, "header");
                            arrayList.addAll(e(url, header));
                        }
                    }
                }
            }
            if (arrayList == null) {
                return AbstractC2279u.m();
            }
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            AbstractC5504s.g(listUnmodifiableList, "Collections.unmodifiableList(cookies)");
            return listUnmodifiableList;
        } catch (IOException e10) {
            og.j jVarG = og.j.f55583a.g();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Loading cookies failed for ");
            u uVarP = url.p("/...");
            AbstractC5504s.e(uVarP);
            sb2.append(uVarP);
            jVarG.k(sb2.toString(), 5, e10);
            return AbstractC2279u.m();
        }
    }

    @Override // dg.n
    public void d(u url, List cookies) {
        AbstractC5504s.h(url, "url");
        AbstractC5504s.h(cookies, "cookies");
        ArrayList arrayList = new ArrayList();
        Iterator it = cookies.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC4804b.a((m) it.next(), true));
        }
        try {
            this.f45604c.put(url.r(), S.f(Td.z.a("Set-Cookie", arrayList)));
        } catch (IOException e10) {
            og.j jVarG = og.j.f55583a.g();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Saving cookies failed for ");
            u uVarP = url.p("/...");
            AbstractC5504s.e(uVarP);
            sb2.append(uVarP);
            jVarG.k(sb2.toString(), 5, e10);
        }
    }
}
