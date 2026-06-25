package dg;

import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC5504s;
import tg.C6686k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f45559a = new o();

    private o() {
    }

    public static final String a(String username, String password, Charset charset) {
        AbstractC5504s.h(username, "username");
        AbstractC5504s.h(password, "password");
        AbstractC5504s.h(charset, "charset");
        return "Basic " + C6686k.f61044d.f(username + ':' + password, charset).b();
    }
}
