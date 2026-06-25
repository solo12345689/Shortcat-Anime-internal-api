package io.sentry;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: io.sentry.w0 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5304w0 {

    /* JADX INFO: renamed from: a */
    private final ArrayList f51531a = new ArrayList();

    /* JADX INFO: renamed from: io.sentry.w0$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f51532a;

        static {
            int[] iArr = new int[io.sentry.vendor.gson.stream.b.values().length];
            f51532a = iArr;
            try {
                iArr[io.sentry.vendor.gson.stream.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f51532a[io.sentry.vendor.gson.stream.b.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f51532a[io.sentry.vendor.gson.stream.b.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f51532a[io.sentry.vendor.gson.stream.b.END_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f51532a[io.sentry.vendor.gson.stream.b.NAME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f51532a[io.sentry.vendor.gson.stream.b.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f51532a[io.sentry.vendor.gson.stream.b.NUMBER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f51532a[io.sentry.vendor.gson.stream.b.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f51532a[io.sentry.vendor.gson.stream.b.NULL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f51532a[io.sentry.vendor.gson.stream.b.END_DOCUMENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: renamed from: io.sentry.w0$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface b {
        Object a();
    }

    /* JADX INFO: renamed from: io.sentry.w0$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private interface c {
        Object getValue();
    }

    /* JADX INFO: renamed from: io.sentry.w0$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class f implements c {

        /* JADX INFO: renamed from: a */
        final String f51535a;

        f(String str) {
            this.f51535a = str;
        }

        @Override // io.sentry.C5304w0.c
        public Object getValue() {
            return this.f51535a;
        }
    }

    /* JADX INFO: renamed from: io.sentry.w0$g */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class g implements c {

        /* JADX INFO: renamed from: a */
        final Object f51536a;

        g(Object obj) {
            this.f51536a = obj;
        }

        @Override // io.sentry.C5304w0.c
        public Object getValue() {
            return this.f51536a;
        }
    }

    public static /* synthetic */ Object a() {
        return null;
    }

    private c f() {
        if (this.f51531a.isEmpty()) {
            return null;
        }
        return (c) this.f51531a.get(r0.size() - 1);
    }

    private boolean g() {
        if (i()) {
            return true;
        }
        c cVarF = f();
        l();
        if (!(f() instanceof f)) {
            if (!(f() instanceof d)) {
                return false;
            }
            d dVar = (d) f();
            if (cVarF == null || dVar == null) {
                return false;
            }
            dVar.f51533a.add(cVarF.getValue());
            return false;
        }
        f fVar = (f) f();
        l();
        e eVar = (e) f();
        if (fVar == null || cVarF == null || eVar == null) {
            return false;
        }
        eVar.f51534a.put(fVar.f51535a, cVarF.getValue());
        return false;
    }

    private boolean h(b bVar) {
        Object objA = bVar.a();
        if (f() == null && objA != null) {
            m(new g(objA));
            return true;
        }
        if (f() instanceof f) {
            f fVar = (f) f();
            l();
            ((e) f()).f51534a.put(fVar.f51535a, objA);
            return false;
        }
        if (!(f() instanceof d)) {
            return false;
        }
        ((d) f()).f51533a.add(objA);
        return false;
    }

    private boolean i() {
        return this.f51531a.size() == 1;
    }

    public Object j(C5309x0 c5309x0) {
        try {
            try {
                return Integer.valueOf(c5309x0.nextInt());
            } catch (Exception unused) {
                return Long.valueOf(c5309x0.nextLong());
            }
        } catch (Exception unused2) {
            return Double.valueOf(c5309x0.nextDouble());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void k(final C5309x0 c5309x0) {
        boolean zG;
        switch (a.f51532a[c5309x0.peek().ordinal()]) {
            case 1:
                c5309x0.B();
                m(new d(null));
                zG = false;
                break;
            case 2:
                c5309x0.y();
                zG = g();
                break;
            case 3:
                c5309x0.x();
                m(new e(null));
                zG = false;
                break;
            case 4:
                c5309x0.I();
                zG = g();
                break;
            case 5:
                m(new f(c5309x0.r0()));
                zG = false;
                break;
            case 6:
                zG = h(new b() { // from class: io.sentry.s0
                    @Override // io.sentry.C5304w0.b
                    public final Object a() {
                        return c5309x0.X0();
                    }
                });
                break;
            case 7:
                zG = h(new b() { // from class: io.sentry.t0
                    @Override // io.sentry.C5304w0.b
                    public final Object a() {
                        return this.f51349a.j(c5309x0);
                    }
                });
                break;
            case 8:
                zG = h(new b() { // from class: io.sentry.u0
                    @Override // io.sentry.C5304w0.b
                    public final Object a() {
                        return Boolean.valueOf(c5309x0.a());
                    }
                });
                break;
            case 9:
                c5309x0.b();
                zG = h(new b() { // from class: io.sentry.v0
                    @Override // io.sentry.C5304w0.b
                    public final Object a() {
                        return C5304w0.a();
                    }
                });
                break;
            case 10:
                zG = true;
                break;
            default:
                zG = false;
                break;
        }
        if (zG) {
            return;
        }
        k(c5309x0);
    }

    private void l() {
        if (this.f51531a.isEmpty()) {
            return;
        }
        this.f51531a.remove(r0.size() - 1);
    }

    private void m(c cVar) {
        this.f51531a.add(cVar);
    }

    public Object e(C5309x0 c5309x0) {
        k(c5309x0);
        c cVarF = f();
        if (cVarF != null) {
            return cVarF.getValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: io.sentry.w0$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class d implements c {

        /* JADX INFO: renamed from: a */
        final ArrayList f51533a;

        private d() {
            this.f51533a = new ArrayList();
        }

        @Override // io.sentry.C5304w0.c
        public Object getValue() {
            return this.f51533a;
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: io.sentry.w0$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class e implements c {

        /* JADX INFO: renamed from: a */
        final HashMap f51534a;

        private e() {
            this.f51534a = new HashMap();
        }

        @Override // io.sentry.C5304w0.c
        public Object getValue() {
            return this.f51534a;
        }

        /* synthetic */ e(a aVar) {
            this();
        }
    }
}
