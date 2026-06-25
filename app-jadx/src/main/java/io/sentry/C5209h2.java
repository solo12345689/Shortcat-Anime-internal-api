package io.sentry;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.h2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5209h2 implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f50716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Double f50717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f50718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Double f50719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f50720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f50721f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f50722g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f50723h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f50724i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    boolean f50725j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    boolean f50726k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    EnumC5278t1 f50727l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Map f50728m;

    /* JADX INFO: renamed from: io.sentry.h2$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C5209h2 a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            String strR0;
            interfaceC5218j1.x();
            C5209h2 c5209h2 = new C5209h2();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                switch (strR0) {
                    case "is_enable_app_start_profiling":
                        Boolean boolW0 = interfaceC5218j1.w0();
                        if (boolW0 != null) {
                            c5209h2.f50725j = boolW0.booleanValue();
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "trace_sampled":
                        Boolean boolW02 = interfaceC5218j1.w0();
                        if (boolW02 != null) {
                            c5209h2.f50718c = boolW02.booleanValue();
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "profiling_traces_dir_path":
                        String strI1 = interfaceC5218j1.i1();
                        if (strI1 != null) {
                            c5209h2.f50720e = strI1;
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "is_continuous_profiling_enabled":
                        Boolean boolW03 = interfaceC5218j1.w0();
                        if (boolW03 != null) {
                            c5209h2.f50722g = boolW03.booleanValue();
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "is_profiling_enabled":
                        Boolean boolW04 = interfaceC5218j1.w0();
                        if (boolW04 != null) {
                            c5209h2.f50721f = boolW04.booleanValue();
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "is_start_profiler_on_app_start":
                        Boolean boolW05 = interfaceC5218j1.w0();
                        if (boolW05 != null) {
                            c5209h2.f50726k = boolW05.booleanValue();
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "profile_sampled":
                        Boolean boolW06 = interfaceC5218j1.w0();
                        if (boolW06 != null) {
                            c5209h2.f50716a = boolW06.booleanValue();
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "profile_lifecycle":
                        String strI12 = interfaceC5218j1.i1();
                        if (strI12 != null) {
                            try {
                                c5209h2.f50727l = EnumC5278t1.valueOf(strI12);
                            } catch (IllegalArgumentException unused) {
                                iLogger.c(EnumC5215i3.ERROR, "Error when deserializing ProfileLifecycle: " + strI12, new Object[0]);
                            }
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "continuous_profile_sampled":
                        Boolean boolW07 = interfaceC5218j1.w0();
                        if (boolW07 != null) {
                            c5209h2.f50724i = boolW07.booleanValue();
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "profiling_traces_hz":
                        Integer numB1 = interfaceC5218j1.b1();
                        if (numB1 != null) {
                            c5209h2.f50723h = numB1.intValue();
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "trace_sample_rate":
                        Double dQ0 = interfaceC5218j1.q0();
                        if (dQ0 != null) {
                            c5209h2.f50719d = dQ0;
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "profile_sample_rate":
                        Double dQ02 = interfaceC5218j1.q0();
                        if (dQ02 != null) {
                            c5209h2.f50717b = dQ02;
                            break;
                        } else {
                            break;
                        }
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC5218j1.l1(iLogger, concurrentHashMap, strR0);
                        break;
                }
            }
            c5209h2.m(concurrentHashMap);
            interfaceC5218j1.I();
            return c5209h2;
        }
    }

    public C5209h2() {
        this.f50718c = false;
        this.f50719d = null;
        this.f50716a = false;
        this.f50717b = null;
        this.f50724i = false;
        this.f50720e = null;
        this.f50721f = false;
        this.f50722g = false;
        this.f50727l = EnumC5278t1.MANUAL;
        this.f50723h = 0;
        this.f50725j = true;
        this.f50726k = false;
    }

    public EnumC5278t1 a() {
        return this.f50727l;
    }

    public Double b() {
        return this.f50717b;
    }

    public String c() {
        return this.f50720e;
    }

    public int d() {
        return this.f50723h;
    }

    public Double e() {
        return this.f50719d;
    }

    public boolean f() {
        return this.f50724i;
    }

    public boolean g() {
        return this.f50722g;
    }

    public boolean h() {
        return this.f50725j;
    }

    public boolean i() {
        return this.f50716a;
    }

    public boolean j() {
        return this.f50721f;
    }

    public boolean k() {
        return this.f50726k;
    }

    public boolean l() {
        return this.f50718c;
    }

    public void m(Map map) {
        this.f50728m = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        interfaceC5223k1.e("profile_sampled").j(iLogger, Boolean.valueOf(this.f50716a));
        interfaceC5223k1.e("profile_sample_rate").j(iLogger, this.f50717b);
        interfaceC5223k1.e("continuous_profile_sampled").j(iLogger, Boolean.valueOf(this.f50724i));
        interfaceC5223k1.e("trace_sampled").j(iLogger, Boolean.valueOf(this.f50718c));
        interfaceC5223k1.e("trace_sample_rate").j(iLogger, this.f50719d);
        interfaceC5223k1.e("profiling_traces_dir_path").j(iLogger, this.f50720e);
        interfaceC5223k1.e("is_profiling_enabled").j(iLogger, Boolean.valueOf(this.f50721f));
        interfaceC5223k1.e("is_continuous_profiling_enabled").j(iLogger, Boolean.valueOf(this.f50722g));
        interfaceC5223k1.e("profile_lifecycle").j(iLogger, this.f50727l.name());
        interfaceC5223k1.e("profiling_traces_hz").j(iLogger, Integer.valueOf(this.f50723h));
        interfaceC5223k1.e("is_enable_app_start_profiling").j(iLogger, Boolean.valueOf(this.f50725j));
        interfaceC5223k1.e("is_start_profiler_on_app_start").j(iLogger, Boolean.valueOf(this.f50726k));
        Map map = this.f50728m;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f50728m.get(str);
                interfaceC5223k1.e(str);
                interfaceC5223k1.j(iLogger, obj);
            }
        }
        interfaceC5223k1.I();
    }

    C5209h2(C5322z3 c5322z3, h4 h4Var) {
        this.f50718c = h4Var.e().booleanValue();
        this.f50719d = h4Var.d();
        this.f50716a = h4Var.b().booleanValue();
        this.f50717b = h4Var.a();
        this.f50724i = c5322z3.getInternalTracesSampler().c(io.sentry.util.B.a().c());
        this.f50720e = c5322z3.getProfilingTracesDirPath();
        this.f50721f = c5322z3.isProfilingEnabled();
        this.f50722g = c5322z3.isContinuousProfilingEnabled();
        this.f50727l = c5322z3.getProfileLifecycle();
        this.f50723h = c5322z3.getProfilingTracesHz();
        this.f50725j = c5322z3.isEnableAppStartProfiling();
        this.f50726k = c5322z3.isStartProfilerOnAppStart();
    }
}
