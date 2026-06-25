package dg;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: dg.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C4627h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f45392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f45393b;

    public C4627h(String scheme, Map authParams) {
        String lowerCase;
        AbstractC5504s.h(scheme, "scheme");
        AbstractC5504s.h(authParams, "authParams");
        this.f45392a = scheme;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : authParams.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (str != null) {
                Locale US = Locale.US;
                AbstractC5504s.g(US, "US");
                lowerCase = str.toLowerCase(US);
                AbstractC5504s.g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            linkedHashMap.put(lowerCase, str2);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        AbstractC5504s.g(mapUnmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.f45393b = mapUnmodifiableMap;
    }

    public final Charset a() {
        String str = (String) this.f45393b.get("charset");
        if (str != null) {
            try {
                Charset charsetForName = Charset.forName(str);
                AbstractC5504s.g(charsetForName, "forName(charset)");
                return charsetForName;
            } catch (Exception unused) {
            }
        }
        Charset ISO_8859_1 = StandardCharsets.ISO_8859_1;
        AbstractC5504s.g(ISO_8859_1, "ISO_8859_1");
        return ISO_8859_1;
    }

    public final String b() {
        return (String) this.f45393b.get("realm");
    }

    public final String c() {
        return this.f45392a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4627h)) {
            return false;
        }
        C4627h c4627h = (C4627h) obj;
        return AbstractC5504s.c(c4627h.f45392a, this.f45392a) && AbstractC5504s.c(c4627h.f45393b, this.f45393b);
    }

    public int hashCode() {
        return ((899 + this.f45392a.hashCode()) * 31) + this.f45393b.hashCode();
    }

    public String toString() {
        return this.f45392a + " authParams=" + this.f45393b;
    }
}
