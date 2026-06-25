package ub;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: ub.d */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C6752d {

    /* JADX INFO: renamed from: a */
    private final List f61480a;

    /* JADX INFO: renamed from: b */
    private final int f61481b;

    /* JADX INFO: renamed from: ub.d$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC6753e {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ long f61482a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C6752d f61483b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Function1 f61484c;

        a(long j10, C6752d c6752d, Function1 function1) {
            this.f61482a = j10;
            this.f61483b = c6752d;
            this.f61484c = function1;
        }

        @Override // ub.InterfaceC6753e
        public long a() {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f61482a;
            C6752d.f(this.f61483b, EnumC6751c.f61469d, (String) this.f61484c.invoke(Long.valueOf(jCurrentTimeMillis)), null, 4, null);
            return Ef.c.t(jCurrentTimeMillis, Ef.d.f5970d);
        }
    }

    public C6752d(List logHandlers) {
        AbstractC5504s.h(logHandlers, "logHandlers");
        this.f61480a = logHandlers;
        this.f61481b = 4;
    }

    public static /* synthetic */ void c(C6752d c6752d, String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        c6752d.b(str, th2);
    }

    private final void e(EnumC6751c enumC6751c, String str, Throwable th2) {
        if (EnumC6751c.f61467b.a(enumC6751c) >= this.f61481b) {
            Iterator it = this.f61480a.iterator();
            while (it.hasNext()) {
                ((AbstractC6749a) it.next()).a(enumC6751c, str, th2);
            }
        }
    }

    static /* synthetic */ void f(C6752d c6752d, EnumC6751c enumC6751c, String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        c6752d.e(enumC6751c, str, th2);
    }

    public static /* synthetic */ void i(C6752d c6752d, String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        c6752d.h(str, th2);
    }

    public final void a(String message) {
        AbstractC5504s.h(message, "message");
        f(this, EnumC6751c.f61471f, message, null, 4, null);
    }

    public final void b(String message, Throwable th2) {
        AbstractC5504s.h(message, "message");
        e(EnumC6751c.f61474i, message, th2);
    }

    public final void d(String message) {
        AbstractC5504s.h(message, "message");
        f(this, EnumC6751c.f61472g, message, null, 4, null);
    }

    public final InterfaceC6753e g(Function1 logFormatter) {
        AbstractC5504s.h(logFormatter, "logFormatter");
        return new a(System.currentTimeMillis(), this, logFormatter);
    }

    public final void h(String message, Throwable th2) {
        AbstractC5504s.h(message, "message");
        e(EnumC6751c.f61473h, message, th2);
    }
}
