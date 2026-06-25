package io.sentry;

import io.sentry.EnumC5210h3;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class U2 implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f49346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f49347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f49348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f49349d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final EnumC5210h3 f49350e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f49351f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Callable f49352g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f49353h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map f49354i;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        private Exception c(String str, ILogger iLogger) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            iLogger.b(EnumC5215i3.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public U2 a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) throws Exception {
            String strR0;
            interfaceC5218j1.x();
            HashMap map = null;
            EnumC5210h3 enumC5210h3 = null;
            String strI1 = null;
            String strI12 = null;
            String strI13 = null;
            String strI14 = null;
            Integer numB1 = null;
            int iNextInt = 0;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                switch (strR0) {
                    case "item_count":
                        numB1 = interfaceC5218j1.b1();
                        break;
                    case "length":
                        iNextInt = interfaceC5218j1.nextInt();
                        break;
                    case "filename":
                        strI12 = interfaceC5218j1.i1();
                        break;
                    case "attachment_type":
                        strI13 = interfaceC5218j1.i1();
                        break;
                    case "type":
                        enumC5210h3 = (EnumC5210h3) interfaceC5218j1.C0(iLogger, new EnumC5210h3.a());
                        break;
                    case "content_type":
                        strI1 = interfaceC5218j1.i1();
                        break;
                    case "platform":
                        strI14 = interfaceC5218j1.i1();
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        interfaceC5218j1.l1(iLogger, map, strR0);
                        break;
                }
            }
            if (enumC5210h3 == null) {
                throw c("type", iLogger);
            }
            U2 u22 = new U2(enumC5210h3, iNextInt, strI1, strI12, strI13, strI14, numB1);
            u22.c(map);
            interfaceC5218j1.I();
            return u22;
        }
    }

    public U2(EnumC5210h3 enumC5210h3, int i10, String str, String str2, String str3, String str4, Integer num) {
        this.f49350e = (EnumC5210h3) io.sentry.util.w.c(enumC5210h3, "type is required");
        this.f49346a = str;
        this.f49351f = i10;
        this.f49348c = str2;
        this.f49352g = null;
        this.f49353h = str3;
        this.f49349d = str4;
        this.f49347b = num;
    }

    public int a() {
        Callable callable = this.f49352g;
        if (callable == null) {
            return this.f49351f;
        }
        try {
            return ((Integer) callable.call()).intValue();
        } catch (Throwable unused) {
            return -1;
        }
    }

    public EnumC5210h3 b() {
        return this.f49350e;
    }

    public void c(Map map) {
        this.f49354i = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        if (this.f49346a != null) {
            interfaceC5223k1.e("content_type").f(this.f49346a);
        }
        if (this.f49348c != null) {
            interfaceC5223k1.e("filename").f(this.f49348c);
        }
        interfaceC5223k1.e("type").j(iLogger, this.f49350e);
        if (this.f49353h != null) {
            interfaceC5223k1.e("attachment_type").f(this.f49353h);
        }
        if (this.f49349d != null) {
            interfaceC5223k1.e("platform").f(this.f49349d);
        }
        if (this.f49347b != null) {
            interfaceC5223k1.e("item_count").i(this.f49347b);
        }
        interfaceC5223k1.e("length").a(a());
        Map map = this.f49354i;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f49354i.get(str);
                interfaceC5223k1.e(str);
                interfaceC5223k1.j(iLogger, obj);
            }
        }
        interfaceC5223k1.I();
    }

    U2(EnumC5210h3 enumC5210h3, Callable callable, String str, String str2, String str3) {
        this(enumC5210h3, callable, str, str2, str3, (String) null, (Integer) null);
    }

    U2(EnumC5210h3 enumC5210h3, Callable callable, String str, String str2, String str3, String str4, Integer num) {
        this.f49350e = (EnumC5210h3) io.sentry.util.w.c(enumC5210h3, "type is required");
        this.f49346a = str;
        this.f49351f = -1;
        this.f49348c = str2;
        this.f49352g = callable;
        this.f49353h = str3;
        this.f49349d = str4;
        this.f49347b = num;
    }

    U2(EnumC5210h3 enumC5210h3, Callable callable, String str, String str2) {
        this(enumC5210h3, callable, str, str2, null);
    }
}
