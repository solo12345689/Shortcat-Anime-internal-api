package io.sentry;

import com.adjust.sdk.AdjustConfig;
import com.adjust.sdk.Constants;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.C5305w1;
import io.sentry.profilemeasurements.a;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.v1 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5300v1 implements B0 {

    /* JADX INFO: renamed from: A */
    private final Map f51452A;

    /* JADX INFO: renamed from: B */
    private String f51453B;

    /* JADX INFO: renamed from: C */
    private Map f51454C;

    /* JADX INFO: renamed from: a */
    private final File f51455a;

    /* JADX INFO: renamed from: b */
    private final Callable f51456b;

    /* JADX INFO: renamed from: c */
    private int f51457c;

    /* JADX INFO: renamed from: d */
    private String f51458d;

    /* JADX INFO: renamed from: e */
    private String f51459e;

    /* JADX INFO: renamed from: f */
    private String f51460f;

    /* JADX INFO: renamed from: g */
    private String f51461g;

    /* JADX INFO: renamed from: h */
    private String f51462h;

    /* JADX INFO: renamed from: i */
    private String f51463i;

    /* JADX INFO: renamed from: j */
    private boolean f51464j;

    /* JADX INFO: renamed from: k */
    private String f51465k;

    /* JADX INFO: renamed from: l */
    private List f51466l;

    /* JADX INFO: renamed from: m */
    private String f51467m;

    /* JADX INFO: renamed from: n */
    private String f51468n;

    /* JADX INFO: renamed from: o */
    private String f51469o;

    /* JADX INFO: renamed from: p */
    private List f51470p;

    /* JADX INFO: renamed from: q */
    private String f51471q;

    /* JADX INFO: renamed from: r */
    private String f51472r;

    /* JADX INFO: renamed from: s */
    private String f51473s;

    /* JADX INFO: renamed from: t */
    private String f51474t;

    /* JADX INFO: renamed from: u */
    private String f51475u;

    /* JADX INFO: renamed from: v */
    private String f51476v;

    /* JADX INFO: renamed from: w */
    private String f51477w;

    /* JADX INFO: renamed from: x */
    private String f51478x;

    /* JADX INFO: renamed from: y */
    private String f51479y;

    /* JADX INFO: renamed from: z */
    private Date f51480z;

    /* JADX INFO: renamed from: io.sentry.v1$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements InterfaceC5267r0 {
        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b */
        public C5300v1 a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            String strR0;
            interfaceC5218j1.x();
            ConcurrentHashMap concurrentHashMap = null;
            C5300v1 c5300v1 = new C5300v1();
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                switch (strR0) {
                    case "device_manufacturer":
                        String strI1 = interfaceC5218j1.i1();
                        if (strI1 == null) {
                            break;
                        } else {
                            c5300v1.f51459e = strI1;
                            break;
                        }
                        break;
                    case "android_api_level":
                        Integer numB1 = interfaceC5218j1.b1();
                        if (numB1 == null) {
                            break;
                        } else {
                            c5300v1.f51457c = numB1.intValue();
                            break;
                        }
                        break;
                    case "build_id":
                        String strI12 = interfaceC5218j1.i1();
                        if (strI12 == null) {
                            break;
                        } else {
                            c5300v1.f51469o = strI12;
                            break;
                        }
                        break;
                    case "device_locale":
                        String strI13 = interfaceC5218j1.i1();
                        if (strI13 == null) {
                            break;
                        } else {
                            c5300v1.f51458d = strI13;
                            break;
                        }
                        break;
                    case "profile_id":
                        String strI14 = interfaceC5218j1.i1();
                        if (strI14 == null) {
                            break;
                        } else {
                            c5300v1.f51477w = strI14;
                            break;
                        }
                        break;
                    case "device_os_build_number":
                        String strI15 = interfaceC5218j1.i1();
                        if (strI15 == null) {
                            break;
                        } else {
                            c5300v1.f51461g = strI15;
                            break;
                        }
                        break;
                    case "device_model":
                        String strI16 = interfaceC5218j1.i1();
                        if (strI16 == null) {
                            break;
                        } else {
                            c5300v1.f51460f = strI16;
                            break;
                        }
                        break;
                    case "device_is_emulator":
                        Boolean boolW0 = interfaceC5218j1.w0();
                        if (boolW0 == null) {
                            break;
                        } else {
                            c5300v1.f51464j = boolW0.booleanValue();
                            break;
                        }
                        break;
                    case "duration_ns":
                        String strI17 = interfaceC5218j1.i1();
                        if (strI17 == null) {
                            break;
                        } else {
                            c5300v1.f51472r = strI17;
                            break;
                        }
                        break;
                    case "measurements":
                        Map mapK1 = interfaceC5218j1.k1(iLogger, new a.C0799a());
                        if (mapK1 == null) {
                            break;
                        } else {
                            c5300v1.f51452A.putAll(mapK1);
                            break;
                        }
                        break;
                    case "device_physical_memory_bytes":
                        String strI18 = interfaceC5218j1.i1();
                        if (strI18 == null) {
                            break;
                        } else {
                            c5300v1.f51467m = strI18;
                            break;
                        }
                        break;
                    case "device_cpu_frequencies":
                        List list = (List) interfaceC5218j1.N1();
                        if (list == null) {
                            break;
                        } else {
                            c5300v1.f51466l = list;
                            break;
                        }
                        break;
                    case "version_code":
                        String strI19 = interfaceC5218j1.i1();
                        if (strI19 == null) {
                            break;
                        } else {
                            c5300v1.f51473s = strI19;
                            break;
                        }
                        break;
                    case "version_name":
                        String strI110 = interfaceC5218j1.i1();
                        if (strI110 == null) {
                            break;
                        } else {
                            c5300v1.f51474t = strI110;
                            break;
                        }
                        break;
                    case "environment":
                        String strI111 = interfaceC5218j1.i1();
                        if (strI111 == null) {
                            break;
                        } else {
                            c5300v1.f51478x = strI111;
                            break;
                        }
                        break;
                    case "timestamp":
                        Date dateU0 = interfaceC5218j1.u0(iLogger);
                        if (dateU0 == null) {
                            break;
                        } else {
                            c5300v1.f51480z = dateU0;
                            break;
                        }
                        break;
                    case "transaction_name":
                        String strI112 = interfaceC5218j1.i1();
                        if (strI112 == null) {
                            break;
                        } else {
                            c5300v1.f51471q = strI112;
                            break;
                        }
                        break;
                    case "device_os_name":
                        String strI113 = interfaceC5218j1.i1();
                        if (strI113 == null) {
                            break;
                        } else {
                            c5300v1.f51462h = strI113;
                            break;
                        }
                        break;
                    case "architecture":
                        String strI114 = interfaceC5218j1.i1();
                        if (strI114 == null) {
                            break;
                        } else {
                            c5300v1.f51465k = strI114;
                            break;
                        }
                        break;
                    case "transaction_id":
                        String strI115 = interfaceC5218j1.i1();
                        if (strI115 == null) {
                            break;
                        } else {
                            c5300v1.f51475u = strI115;
                            break;
                        }
                        break;
                    case "device_os_version":
                        String strI116 = interfaceC5218j1.i1();
                        if (strI116 == null) {
                            break;
                        } else {
                            c5300v1.f51463i = strI116;
                            break;
                        }
                        break;
                    case "truncation_reason":
                        String strI117 = interfaceC5218j1.i1();
                        if (strI117 == null) {
                            break;
                        } else {
                            c5300v1.f51479y = strI117;
                            break;
                        }
                        break;
                    case "trace_id":
                        String strI118 = interfaceC5218j1.i1();
                        if (strI118 == null) {
                            break;
                        } else {
                            c5300v1.f51476v = strI118;
                            break;
                        }
                        break;
                    case "platform":
                        String strI119 = interfaceC5218j1.i1();
                        if (strI119 == null) {
                            break;
                        } else {
                            c5300v1.f51468n = strI119;
                            break;
                        }
                        break;
                    case "sampled_profile":
                        String strI120 = interfaceC5218j1.i1();
                        if (strI120 == null) {
                            break;
                        } else {
                            c5300v1.f51453B = strI120;
                            break;
                        }
                        break;
                    case "transactions":
                        List listT1 = interfaceC5218j1.T1(iLogger, new C5305w1.a());
                        if (listT1 == null) {
                            break;
                        } else {
                            c5300v1.f51470p.addAll(listT1);
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
            c5300v1.G(concurrentHashMap);
            interfaceC5218j1.I();
            return c5300v1;
        }
    }

    /* synthetic */ C5300v1(a aVar) {
        this();
    }

    private boolean D() {
        return this.f51479y.equals(Constants.NORMAL) || this.f51479y.equals("timeout") || this.f51479y.equals("backgrounded");
    }

    public static /* synthetic */ List a() {
        return new ArrayList();
    }

    public String B() {
        return this.f51477w;
    }

    public File C() {
        return this.f51455a;
    }

    public void E() {
        try {
            this.f51466l = (List) this.f51456b.call();
        } catch (Throwable unused) {
        }
    }

    public void F(String str) {
        this.f51453B = str;
    }

    public void G(Map map) {
        this.f51454C = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        interfaceC5223k1.e("android_api_level").j(iLogger, Integer.valueOf(this.f51457c));
        interfaceC5223k1.e("device_locale").j(iLogger, this.f51458d);
        interfaceC5223k1.e("device_manufacturer").f(this.f51459e);
        interfaceC5223k1.e("device_model").f(this.f51460f);
        interfaceC5223k1.e("device_os_build_number").f(this.f51461g);
        interfaceC5223k1.e("device_os_name").f(this.f51462h);
        interfaceC5223k1.e("device_os_version").f(this.f51463i);
        interfaceC5223k1.e("device_is_emulator").d(this.f51464j);
        interfaceC5223k1.e("architecture").j(iLogger, this.f51465k);
        interfaceC5223k1.e("device_cpu_frequencies").j(iLogger, this.f51466l);
        interfaceC5223k1.e("device_physical_memory_bytes").f(this.f51467m);
        interfaceC5223k1.e("platform").f(this.f51468n);
        interfaceC5223k1.e("build_id").f(this.f51469o);
        interfaceC5223k1.e("transaction_name").f(this.f51471q);
        interfaceC5223k1.e("duration_ns").f(this.f51472r);
        interfaceC5223k1.e("version_name").f(this.f51474t);
        interfaceC5223k1.e("version_code").f(this.f51473s);
        if (!this.f51470p.isEmpty()) {
            interfaceC5223k1.e("transactions").j(iLogger, this.f51470p);
        }
        interfaceC5223k1.e("transaction_id").f(this.f51475u);
        interfaceC5223k1.e("trace_id").f(this.f51476v);
        interfaceC5223k1.e("profile_id").f(this.f51477w);
        interfaceC5223k1.e("environment").f(this.f51478x);
        interfaceC5223k1.e("truncation_reason").f(this.f51479y);
        if (this.f51453B != null) {
            interfaceC5223k1.e("sampled_profile").f(this.f51453B);
        }
        String strB = interfaceC5223k1.b();
        interfaceC5223k1.h("");
        interfaceC5223k1.e("measurements").j(iLogger, this.f51452A);
        interfaceC5223k1.h(strB);
        interfaceC5223k1.e(DiagnosticsEntry.TIMESTAMP_KEY).j(iLogger, this.f51480z);
        Map map = this.f51454C;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f51454C.get(str);
                interfaceC5223k1.e(str);
                interfaceC5223k1.j(iLogger, obj);
            }
        }
        interfaceC5223k1.I();
    }

    private C5300v1() {
        this(new File("dummy"), C5198f1.u());
    }

    public C5300v1(File file, InterfaceC5217j0 interfaceC5217j0) {
        this(file, AbstractC5226l.d(), new ArrayList(), interfaceC5217j0.getName(), interfaceC5217j0.f().toString(), interfaceC5217j0.q().p().toString(), "0", 0, "", new Callable() { // from class: io.sentry.u1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C5300v1.a();
            }
        }, null, null, null, null, null, null, null, null, Constants.NORMAL, new HashMap());
    }

    public C5300v1(File file, Date date, List list, String str, String str2, String str3, String str4, int i10, String str5, Callable callable, String str6, String str7, String str8, Boolean bool, String str9, String str10, String str11, String str12, String str13, Map map) {
        this.f51466l = new ArrayList();
        this.f51453B = null;
        this.f51455a = file;
        this.f51480z = date;
        this.f51465k = str5;
        this.f51456b = callable;
        this.f51457c = i10;
        this.f51458d = Locale.getDefault().toString();
        this.f51459e = str6 == null ? "" : str6;
        this.f51460f = str7 == null ? "" : str7;
        this.f51463i = str8 == null ? "" : str8;
        this.f51464j = bool != null ? bool.booleanValue() : false;
        this.f51467m = str9 != null ? str9 : "0";
        this.f51461g = "";
        this.f51462h = "android";
        this.f51468n = "android";
        this.f51469o = str10 != null ? str10 : "";
        this.f51470p = list;
        this.f51471q = str.isEmpty() ? "unknown" : str;
        this.f51472r = str4;
        this.f51473s = "";
        this.f51474t = str11 != null ? str11 : "";
        this.f51475u = str2;
        this.f51476v = str3;
        this.f51477w = M3.a();
        this.f51478x = str12 != null ? str12 : AdjustConfig.ENVIRONMENT_PRODUCTION;
        this.f51479y = str13;
        if (!D()) {
            this.f51479y = Constants.NORMAL;
        }
        this.f51452A = map;
    }
}
