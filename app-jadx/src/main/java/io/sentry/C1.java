package io.sentry;

import java.net.URI;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5298v f49085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f49086b;

    public C1(C5322z3 c5322z3) {
        io.sentry.util.w.c(c5322z3, "options is required");
        this.f49085a = c5322z3.retrieveParsedDsn();
        this.f49086b = c5322z3.getSentryClientName();
    }

    public B1 a() {
        String str;
        URI uriC = this.f49085a.c();
        String string = uriC.resolve(uriC.getPath() + "/envelope/").toString();
        String strA = this.f49085a.a();
        String strB = this.f49085a.b();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Sentry sentry_version=7,sentry_client=");
        sb2.append(this.f49086b);
        sb2.append(",sentry_key=");
        sb2.append(strA);
        if (strB == null || strB.length() <= 0) {
            str = "";
        } else {
            str = ",sentry_secret=" + strB;
        }
        sb2.append(str);
        String string2 = sb2.toString();
        HashMap map = new HashMap();
        map.put("User-Agent", this.f49086b);
        map.put("X-Sentry-Auth", string2);
        return new B1(string, map);
    }
}
