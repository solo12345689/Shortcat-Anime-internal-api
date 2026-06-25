package com.facebook.react.devsupport;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.Settings;
import b7.C3026a;
import be.AbstractC3048a;
import com.adjust.sdk.Constants;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.devsupport.C3212b;
import dg.C;
import dg.C4618A;
import dg.InterfaceC4624e;
import dg.InterfaceC4625f;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r7.InterfaceC6274a;
import x7.h;
import z5.AbstractC7283a;

/* JADX INFO: renamed from: com.facebook.react.devsupport.v */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C3235v {

    /* JADX INFO: renamed from: j */
    private static final b f36827j = new b(null);

    /* JADX INFO: renamed from: a */
    private final InterfaceC6274a f36828a;

    /* JADX INFO: renamed from: b */
    private final Context f36829b;

    /* JADX INFO: renamed from: c */
    private final x7.f f36830c;

    /* JADX INFO: renamed from: d */
    private final C4618A f36831d;

    /* JADX INFO: renamed from: e */
    private final C3212b f36832e;

    /* JADX INFO: renamed from: f */
    private final o0 f36833f;

    /* JADX INFO: renamed from: g */
    private final String f36834g;

    /* JADX INFO: renamed from: h */
    private x7.c f36835h;

    /* JADX INFO: renamed from: i */
    private f0 f36836i;

    /* JADX INFO: renamed from: com.facebook.react.devsupport.v$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a extends Enum {

        /* JADX INFO: renamed from: b */
        public static final a f36837b = new a("BUNDLE", 0, "bundle");

        /* JADX INFO: renamed from: c */
        public static final a f36838c = new a("MAP", 1, "map");

        /* JADX INFO: renamed from: d */
        private static final /* synthetic */ a[] f36839d;

        /* JADX INFO: renamed from: e */
        private static final /* synthetic */ EnumEntries f36840e;

        /* JADX INFO: renamed from: a */
        private final String f36841a;

        static {
            a[] aVarArrA = a();
            f36839d = aVarArrA;
            f36840e = AbstractC3048a.a(aVarArrA);
        }

        private a(String str, int i10, String str2) {
            super(str, i10);
            this.f36841a = str2;
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f36837b, f36838c};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f36839d.clone();
        }

        public final String b() {
            return this.f36841a;
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.devsupport.v$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String b(String str) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.reset();
                try {
                    Charset charsetForName = Charset.forName(Constants.ENCODING);
                    AbstractC5504s.g(charsetForName, "forName(...)");
                    byte[] bytes = str.getBytes(charsetForName);
                    AbstractC5504s.g(bytes, "getBytes(...)");
                    byte[] bArrDigest = messageDigest.digest(bytes);
                    kotlin.jvm.internal.U u10 = kotlin.jvm.internal.U.f52264a;
                    String str2 = String.format("%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x", Arrays.copyOf(new Object[]{Byte.valueOf(bArrDigest[0]), Byte.valueOf(bArrDigest[1]), Byte.valueOf(bArrDigest[2]), Byte.valueOf(bArrDigest[3]), Byte.valueOf(bArrDigest[4]), Byte.valueOf(bArrDigest[5]), Byte.valueOf(bArrDigest[6]), Byte.valueOf(bArrDigest[7]), Byte.valueOf(bArrDigest[8]), Byte.valueOf(bArrDigest[9]), Byte.valueOf(bArrDigest[10]), Byte.valueOf(bArrDigest[11]), Byte.valueOf(bArrDigest[12]), Byte.valueOf(bArrDigest[13]), Byte.valueOf(bArrDigest[14]), Byte.valueOf(bArrDigest[15]), Byte.valueOf(bArrDigest[16]), Byte.valueOf(bArrDigest[17]), Byte.valueOf(bArrDigest[18]), Byte.valueOf(bArrDigest[19])}, 20));
                    AbstractC5504s.g(str2, "format(...)");
                    return str2;
                } catch (UnsupportedEncodingException e10) {
                    throw new AssertionError("This environment doesn't support UTF-8 encoding", e10);
                }
            } catch (NoSuchAlgorithmException e11) {
                throw new AssertionError("Could not get standard SHA-256 algorithm", e11);
            }
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.devsupport.v$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface c {
        void a();

        void b();

        void c();

        void d();

        Map e();
    }

    /* JADX INFO: renamed from: com.facebook.react.devsupport.v$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d extends AsyncTask {
        d() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a */
        public Void doInBackground(Void... params) {
            AbstractC5504s.h(params, "params");
            f0 f0Var = C3235v.this.f36836i;
            if (f0Var != null) {
                f0Var.closeQuietly();
            }
            C3235v.this.f36836i = null;
            return null;
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.devsupport.v$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e extends AsyncTask {
        e() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a */
        public Void doInBackground(Void... params) {
            AbstractC5504s.h(params, "params");
            x7.c cVar = C3235v.this.f36835h;
            if (cVar != null) {
                cVar.f();
            }
            C3235v.this.f36835h = null;
            return null;
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.devsupport.v$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class f implements InterfaceC4625f {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ReactContext f36844a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f36845b;

        f(ReactContext reactContext, String str) {
            this.f36844a = reactContext;
            this.f36845b = str;
        }

        @Override // dg.InterfaceC4625f
        public void h(InterfaceC4624e call, dg.E response) {
            AbstractC5504s.h(call, "call");
            AbstractC5504s.h(response, "response");
        }

        @Override // dg.InterfaceC4625f
        public void j(InterfaceC4624e call, IOException e10) {
            AbstractC5504s.h(call, "call");
            AbstractC5504s.h(e10, "e");
            ReactContext reactContext = this.f36844a;
            String str = this.f36845b;
            if (str == null) {
                str = "openDebugger error";
            }
            J7.d.d(reactContext, str);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.devsupport.v$g */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class g extends AsyncTask {
        g() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a */
        public Void doInBackground(Void... params) {
            AbstractC5504s.h(params, "params");
            String str = (String) com.facebook.react.modules.systeminfo.a.f(C3235v.this.f36829b).get("deviceName");
            if (str == null) {
                AbstractC7283a.I("ReactNative", "Could not get device name from Inspector Host Metadata.");
                return null;
            }
            C3235v c3235v = C3235v.this;
            CxxInspectorPackagerConnection cxxInspectorPackagerConnection = new CxxInspectorPackagerConnection(C3235v.this.s(), str, C3235v.this.f36834g);
            cxxInspectorPackagerConnection.connect();
            c3235v.f36836i = cxxInspectorPackagerConnection;
            return null;
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.devsupport.v$h */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class h extends AsyncTask {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ c f36847a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f36848b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C3235v f36849c;

        /* JADX INFO: renamed from: com.facebook.react.devsupport.v$h$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a extends x7.d {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ c f36850a;

            a(c cVar) {
                this.f36850a = cVar;
            }

            @Override // x7.i
            public void a(Object obj) {
                this.f36850a.c();
            }
        }

        /* JADX INFO: renamed from: com.facebook.react.devsupport.v$h$b */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class b extends x7.d {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ c f36851a;

            b(c cVar) {
                this.f36851a = cVar;
            }

            @Override // x7.i
            public void a(Object obj) {
                this.f36851a.b();
            }
        }

        /* JADX INFO: renamed from: com.facebook.react.devsupport.v$h$c */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class c implements h.b {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ c f36852a;

            c(c cVar) {
                this.f36852a = cVar;
            }

            @Override // x7.h.b
            public void a() {
                this.f36852a.d();
            }

            @Override // x7.h.b
            public void onConnected() {
                this.f36852a.a();
            }
        }

        h(c cVar, String str, C3235v c3235v) {
            this.f36847a = cVar;
            this.f36848b = str;
            this.f36849c = c3235v;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a */
        public Void doInBackground(Void... backgroundParams) {
            AbstractC5504s.h(backgroundParams, "backgroundParams");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("reload", new a(this.f36847a));
            linkedHashMap.put("devMenu", new b(this.f36847a));
            Map mapE = this.f36847a.e();
            if (mapE != null) {
                linkedHashMap.putAll(mapE);
            }
            linkedHashMap.putAll(new x7.b().e());
            c cVar = new c(this.f36847a);
            if (this.f36848b == null) {
                throw new IllegalStateException("Required value was null.");
            }
            C3235v c3235v = this.f36849c;
            x7.c cVar2 = new x7.c(this.f36848b, this.f36849c.f36830c, linkedHashMap, cVar);
            cVar2.g();
            c3235v.f36835h = cVar2;
            return null;
        }
    }

    public C3235v(InterfaceC6274a settings, Context applicationContext, x7.f packagerConnectionSettings) {
        AbstractC5504s.h(settings, "settings");
        AbstractC5504s.h(applicationContext, "applicationContext");
        AbstractC5504s.h(packagerConnectionSettings, "packagerConnectionSettings");
        this.f36828a = settings;
        this.f36829b = applicationContext;
        this.f36830c = packagerConnectionSettings;
        C4618A c4618aA = C3026a.f33222a.a();
        this.f36831d = c4618aA;
        this.f36832e = new C3212b(c4618aA);
        this.f36833f = new o0(c4618aA);
        String packageName = applicationContext.getPackageName();
        AbstractC5504s.g(packageName, "getPackageName(...)");
        this.f36834g = packageName;
    }

    private final String k(String str, a aVar, String str2, boolean z10, boolean z11) {
        boolean zP = p();
        StringBuilder sb2 = new StringBuilder();
        x7.f fVar = this.f36830c;
        for (Map.Entry entry : fVar.h(fVar.c()).entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            if (str4.length() != 0) {
                sb2.append("&" + str3 + com.amazon.a.a.o.b.f.f34695b + Uri.encode(str4));
            }
        }
        kotlin.jvm.internal.U u10 = kotlin.jvm.internal.U.f52264a;
        String str5 = String.format(Locale.US, "%s://%s/%s.%s?platform=android&dev=%s&lazy=%s&minify=%s&app=%s&modulesOnly=%s&runModule=%s", Arrays.copyOf(new Object[]{C3026a.f33222a.c(str2), str2, str, aVar.b(), Boolean.valueOf(zP), Boolean.valueOf(zP), Boolean.valueOf(t()), this.f36834g, z10 ? com.amazon.a.a.o.b.f34640af : com.amazon.a.a.o.b.f34641ag, z11 ? com.amazon.a.a.o.b.f34640af : com.amazon.a.a.o.b.f34641ag}, 10));
        AbstractC5504s.g(str5, "format(...)");
        return str5 + (InspectorFlags.getFuseboxEnabled() ? "&excludeSource=true&sourcePaths=url-server" : "") + ((Object) sb2);
    }

    static /* synthetic */ String l(C3235v c3235v, String str, a aVar, String str2, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createBundleURL");
        }
        if ((i10 & 4) != 0) {
            str2 = c3235v.f36830c.d();
        }
        String str3 = str2;
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        boolean z12 = z10;
        if ((i10 & 16) != 0) {
            z11 = true;
        }
        return c3235v.k(str, aVar, str3, z12, z11);
    }

    public static /* synthetic */ void o(C3235v c3235v, c7.c cVar, File file, String str, C3212b.a aVar, C.a aVar2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: downloadBundleFromURL");
        }
        if ((i10 & 16) != 0) {
            aVar2 = new C.a();
        }
        c3235v.n(cVar, file, str, aVar, aVar2);
    }

    private final boolean p() {
        return this.f36828a.h();
    }

    private final String r() {
        String str = this.f36834g;
        String string = Settings.Secure.getString(this.f36829b.getContentResolver(), "android_id");
        kotlin.jvm.internal.U u10 = kotlin.jvm.internal.U.f52264a;
        String str2 = String.format(Locale.US, "android-%s-%s-%s", Arrays.copyOf(new Object[]{str, string, InspectorFlags.getFuseboxEnabled() ? "fusebox" : "legacy"}, 3));
        AbstractC5504s.g(str2, "format(...)");
        return f36827j.b(str2);
    }

    public final String s() {
        kotlin.jvm.internal.U u10 = kotlin.jvm.internal.U.f52264a;
        String str = String.format(Locale.US, "%s://%s/inspector/device?name=%s&app=%s&device=%s&profiling=%b", Arrays.copyOf(new Object[]{C3026a.f33222a.c(this.f36830c.d()), this.f36830c.d(), Uri.encode(com.facebook.react.modules.systeminfo.a.e()), Uri.encode(this.f36834g), Uri.encode(r()), Boolean.valueOf(InspectorFlags.getIsProfilingBuild())}, 6));
        AbstractC5504s.g(str, "format(...)");
        return str;
    }

    private final boolean t() {
        return this.f36828a.g();
    }

    public final void i() {
        new d().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public final void j() {
        new e().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public final void m() {
        f0 f0Var = this.f36836i;
        if (f0Var != null) {
            f0Var.sendEventToAllConnections("{ \"id\":1,\"method\":\"Debugger.disable\" }");
        }
    }

    public final void n(c7.c callback, File outputFile, String str, C3212b.a aVar, C.a requestBuilder) {
        AbstractC5504s.h(callback, "callback");
        AbstractC5504s.h(outputFile, "outputFile");
        AbstractC5504s.h(requestBuilder, "requestBuilder");
        this.f36832e.e(callback, outputFile, str, aVar, requestBuilder);
    }

    public String q(String jsModulePath) {
        AbstractC5504s.h(jsModulePath, "jsModulePath");
        return l(this, jsModulePath, a.f36837b, this.f36830c.d(), false, false, 24, null);
    }

    public String u(String mainModuleName) {
        AbstractC5504s.h(mainModuleName, "mainModuleName");
        return l(this, mainModuleName, a.f36837b, null, false, false, 28, null);
    }

    public void v(c7.h callback) {
        AbstractC5504s.h(callback, "callback");
        this.f36833f.a(this.f36830c.d(), callback);
    }

    public final void w(ReactContext reactContext, String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        kotlin.jvm.internal.U u10 = kotlin.jvm.internal.U.f52264a;
        String str3 = String.format(Locale.US, "%s://%s/open-debugger?device=%s", Arrays.copyOf(new Object[]{C3026a.f33222a.c(this.f36830c.d()), this.f36830c.d(), Uri.encode(r())}, 3));
        AbstractC5504s.g(str3, "format(...)");
        sb2.append(str3);
        if (str2 != null) {
            sb2.append("&panel=" + Uri.encode(str2));
        }
        C.a aVar = new C.a();
        String string = sb2.toString();
        AbstractC5504s.g(string, "toString(...)");
        this.f36831d.a(aVar.m(string).g("POST", dg.D.f45262a.a(null, "")).b()).O1(new f(reactContext, str));
    }

    public final void x() {
        if (this.f36836i != null) {
            AbstractC7283a.I("ReactNative", "Inspector connection already open, nooping.");
        } else {
            new g().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public final void y(String str, c commandListener) {
        AbstractC5504s.h(commandListener, "commandListener");
        if (this.f36835h != null) {
            AbstractC7283a.I("ReactNative", "Packager connection already open, nooping.");
        } else {
            new h(commandListener, str, this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }
}
