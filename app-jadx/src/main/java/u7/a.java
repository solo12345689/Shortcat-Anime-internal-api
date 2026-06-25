package U7;

import be.AbstractC3048a;
import com.amazon.a.a.o.b.f;
import com.facebook.systrace.TraceListener;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f19382a = new a();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: U7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class EnumC0330a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final EnumC0330a f19383b = new EnumC0330a("THREAD", 0, 't');

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final EnumC0330a f19384c = new EnumC0330a("PROCESS", 1, 'p');

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final EnumC0330a f19385d = new EnumC0330a("GLOBAL", 2, 'g');

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumC0330a[] f19386e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f19387f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final char f19388a;

        static {
            EnumC0330a[] enumC0330aArrA = a();
            f19386e = enumC0330aArrA;
            f19387f = AbstractC3048a.a(enumC0330aArrA);
        }

        private EnumC0330a(String str, int i10, char c10) {
            this.f19388a = c10;
        }

        private static final /* synthetic */ EnumC0330a[] a() {
            return new EnumC0330a[]{f19383b, f19384c, f19385d};
        }

        public static EnumC0330a valueOf(String str) {
            return (EnumC0330a) Enum.valueOf(EnumC0330a.class, str);
        }

        public static EnumC0330a[] values() {
            return (EnumC0330a[]) f19386e.clone();
        }
    }

    private a() {
    }

    public static final void a(long j10, String sectionName, int i10) {
        AbstractC5504s.h(sectionName, "sectionName");
        X3.a.a(sectionName, i10);
    }

    public static final void b(long j10, String sectionName, int i10, long j11) {
        AbstractC5504s.h(sectionName, "sectionName");
        a(j10, sectionName, i10);
    }

    public static final void c(long j10, String sectionName) {
        AbstractC5504s.h(sectionName, "sectionName");
        X3.a.c(sectionName);
    }

    public static final void d(long j10, String sectionName, String[] args, int i10) {
        AbstractC5504s.h(sectionName, "sectionName");
        AbstractC5504s.h(args, "args");
        X3.a.c(sectionName + f.f34696c + f19382a.e(args, i10));
    }

    private final String e(String[] strArr, int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 1; i11 < i10; i11 += 2) {
            String str = strArr[i11 - 1];
            String str2 = strArr[i11];
            sb2.append(str);
            sb2.append('=');
            sb2.append(str2);
            if (i11 < i10 - 1) {
                sb2.append(';');
            }
        }
        String string = sb2.toString();
        AbstractC5504s.g(string, "toString(...)");
        return string;
    }

    public static final void f(long j10, String sectionName, int i10) {
        AbstractC5504s.h(sectionName, "sectionName");
        g(j10, sectionName, i10);
    }

    public static final void g(long j10, String sectionName, int i10) {
        AbstractC5504s.h(sectionName, "sectionName");
        X3.a.d(sectionName, i10);
    }

    public static final void h(long j10, String sectionName, int i10, long j11) {
        AbstractC5504s.h(sectionName, "sectionName");
        g(j10, sectionName, i10);
    }

    public static final void i(long j10) {
        X3.a.f();
    }

    public static final boolean j(long j10) {
        return false;
    }

    public static final void l(long j10, String sectionName, int i10) {
        AbstractC5504s.h(sectionName, "sectionName");
        a(j10, sectionName, i10);
    }

    public static final void m(long j10, String counterName, int i10) {
        AbstractC5504s.h(counterName, "counterName");
        X3.a.j(counterName, i10);
    }

    public static final void o(long j10, String sectionName, Runnable block) {
        AbstractC5504s.h(sectionName, "sectionName");
        AbstractC5504s.h(block, "block");
        c(j10, sectionName);
        try {
            block.run();
        } finally {
            i(j10);
        }
    }

    public static final void k(TraceListener traceListener) {
    }

    public static final void p(TraceListener traceListener) {
    }

    public static final void n(long j10, String str, EnumC0330a enumC0330a) {
    }
}
