package b7;

import Df.r;
import com.adjust.sdk.Constants;
import dg.C4618A;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: b7.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3026a {

    /* JADX INFO: renamed from: a */
    public static final C3026a f33222a = new C3026a();

    /* JADX INFO: renamed from: b */
    private static final C4618A f33223b;

    /* JADX INFO: renamed from: c */
    private static final C4618A f33224c;

    static {
        C4618A.a aVarF = v7.f.f().F();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        C4618A c4618aC = aVarF.f(5L, timeUnit).Q(0L, TimeUnit.MILLISECONDS).P(0L, TimeUnit.MINUTES).c();
        f33223b = c4618aC;
        f33224c = c4618aC.F().f(10L, timeUnit).Q(10L, timeUnit).c();
    }

    private C3026a() {
    }

    public final C4618A a() {
        return f33223b;
    }

    public final C4618A b() {
        return f33224c;
    }

    public final String c(String host) {
        AbstractC5504s.h(host, "host");
        return r.A(host, ":443", false, 2, null) ? Constants.SCHEME : "http";
    }

    public final String d(String host) {
        AbstractC5504s.h(host, "host");
        return r.A(host, ":443", false, 2, null) ? "wss" : "ws";
    }
}
