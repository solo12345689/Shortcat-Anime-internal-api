package v7;

import android.content.Context;
import dg.C4618A;
import dg.C4622c;
import java.io.File;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f61989a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static C4618A f61990b;

    private f() {
    }

    public static final C4618A a() {
        return c().c();
    }

    public static final C4618A b(Context context) {
        AbstractC5504s.h(context, "context");
        return d(context).c();
    }

    public static final C4618A.a c() {
        C4618A.a aVar = new C4618A.a();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return aVar.f(0L, timeUnit).P(0L, timeUnit).Q(0L, timeUnit).g(new k());
    }

    public static final C4618A.a d(Context context) {
        AbstractC5504s.h(context, "context");
        return e(context, 10485760);
    }

    public static final C4618A.a e(Context context, int i10) {
        AbstractC5504s.h(context, "context");
        C4618A.a aVarC = c();
        return i10 == 0 ? aVarC : aVarC.d(new C4622c(new File(context.getCacheDir(), "http-cache"), i10));
    }

    public static final C4618A f() {
        C4618A c4618a = f61990b;
        if (c4618a != null) {
            return c4618a;
        }
        C4618A c4618aA = a();
        f61990b = c4618aA;
        return c4618aA;
    }
}
