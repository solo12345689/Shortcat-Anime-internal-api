package xd;

import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ub.C6750b;
import ub.C6752d;
import ub.EnumC6751c;
import ub.InterfaceC6753e;

/* JADX INFO: renamed from: xd.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7136g implements InterfaceC7130a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f64369b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C6752d f64370a;

    /* JADX INFO: renamed from: xd.g$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C7136g(File filesDirectory) {
        AbstractC5504s.h(filesDirectory, "filesDirectory");
        C6750b c6750b = C6750b.f61466a;
        this.f64370a = new C6752d(AbstractC2279u.p(c6750b.a("dev.expo.updates"), c6750b.b(filesDirectory, "dev.expo.updates")));
    }

    public static /* synthetic */ void e(C7136g c7136g, String str, EnumC7131b enumC7131b, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            enumC7131b = EnumC7131b.f64340b;
        }
        c7136g.c(str, enumC7131b);
    }

    public static /* synthetic */ void h(C7136g c7136g, String str, Exception exc, EnumC7131b enumC7131b, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            enumC7131b = EnumC7131b.f64340b;
        }
        c7136g.f(str, exc, enumC7131b);
    }

    public static /* synthetic */ void k(C7136g c7136g, String str, EnumC7131b enumC7131b, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            enumC7131b = EnumC7131b.f64340b;
        }
        c7136g.i(str, enumC7131b);
    }

    private final String l(String str, EnumC7131b enumC7131b, EnumC6751c enumC6751c, Long l10, String str2, String str3) {
        return new C7132c(new Date().getTime(), str, enumC7131b.b(), enumC6751c.b(), l10, str2, str3, null).a();
    }

    private final String m(String str, Exception exc, EnumC7131b enumC7131b, EnumC6751c enumC6751c, Long l10, String str2, String str3) {
        long time = new Date().getTime();
        String strB = enumC7131b.b();
        String strB2 = enumC6751c.b();
        StackTraceElement[] stackTrace = exc.getStackTrace();
        AbstractC5504s.g(stackTrace, "getStackTrace(...)");
        List listL0 = AbstractC2273n.L0(stackTrace, 20);
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(listL0, 10));
        Iterator it = listL0.iterator();
        while (it.hasNext()) {
            String string = ((StackTraceElement) it.next()).toString();
            AbstractC5504s.g(string, "toString(...)");
            arrayList.add(string);
        }
        return new C7132c(time, str, strB, strB2, l10, str2, str3, arrayList).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String n(C7136g c7136g, String str, long j10) {
        return c7136g.l(str, EnumC7131b.f64340b, EnumC6751c.f61469d, Long.valueOf(j10), null, null);
    }

    public static /* synthetic */ void q(C7136g c7136g, String str, EnumC7131b enumC7131b, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            enumC7131b = EnumC7131b.f64340b;
        }
        c7136g.o(str, enumC7131b);
    }

    @Override // xd.InterfaceC7130a
    public InterfaceC6753e a(final String label) {
        AbstractC5504s.h(label, "label");
        return this.f64370a.g(new Function1() { // from class: xd.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C7136g.n(this.f64367a, label, ((Long) obj).longValue());
            }
        });
    }

    public final void c(String message, EnumC7131b code) {
        AbstractC5504s.h(message, "message");
        AbstractC5504s.h(code, "code");
        d(message, code, null, null);
    }

    public final void d(String message, EnumC7131b code, String str, String str2) {
        AbstractC5504s.h(message, "message");
        AbstractC5504s.h(code, "code");
        this.f64370a.a(l(message, code, EnumC6751c.f61471f, null, str, str2));
    }

    public final void f(String message, Exception cause, EnumC7131b code) {
        AbstractC5504s.h(message, "message");
        AbstractC5504s.h(cause, "cause");
        AbstractC5504s.h(code, "code");
        g(message, cause, code, null, null);
    }

    public final void g(String message, Exception cause, EnumC7131b code, String str, String str2) {
        AbstractC5504s.h(message, "message");
        AbstractC5504s.h(cause, "cause");
        AbstractC5504s.h(code, "code");
        C6752d.c(this.f64370a, m(message, cause, code, EnumC6751c.f61474i, null, str, str2), null, 2, null);
    }

    public final void i(String message, EnumC7131b code) {
        AbstractC5504s.h(message, "message");
        AbstractC5504s.h(code, "code");
        j(message, code, null, null);
    }

    public final void j(String message, EnumC7131b code, String str, String str2) {
        AbstractC5504s.h(message, "message");
        AbstractC5504s.h(code, "code");
        this.f64370a.d(l(message, code, EnumC6751c.f61472g, null, str, str2));
    }

    public final void o(String message, EnumC7131b code) {
        AbstractC5504s.h(message, "message");
        AbstractC5504s.h(code, "code");
        p(message, code, null, null);
    }

    public final void p(String message, EnumC7131b code, String str, String str2) {
        AbstractC5504s.h(message, "message");
        AbstractC5504s.h(code, "code");
        C6752d.i(this.f64370a, l(message, code, EnumC6751c.f61473h, null, str, str2), null, 2, null);
    }
}
