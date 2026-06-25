package x7;

import Td.L;
import Ud.AbstractC2279u;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import com.revenuecat.purchases.common.networking.HTTPTimeoutManager;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.V;
import org.json.JSONObject;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final d f64011e = new d(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f64012f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f64013a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f64014b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f64015c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f64016d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends j {
        a() {
        }

        @Override // x7.i
        public void b(Object obj, k responder) {
            JSONObject jSONObject;
            AbstractC5504s.h(responder, "responder");
            Map map = b.this.f64015c;
            b bVar = b.this;
            synchronized (map) {
                try {
                    try {
                        jSONObject = (JSONObject) obj;
                    } catch (Exception e10) {
                        responder.b(e10.toString());
                    }
                    if (jSONObject == null) {
                        throw new Exception("params must be an object { mode: string, filename: string }");
                    }
                    String strOptString = jSONObject.optString("mode");
                    if (strOptString == null) {
                        throw new Exception("missing params.mode");
                    }
                    String strOptString2 = jSONObject.optString("filename");
                    if (strOptString2 == null) {
                        throw new Exception("missing params.filename");
                    }
                    if (!AbstractC5504s.c(strOptString, "r")) {
                        throw new IllegalArgumentException(("unsupported mode: " + strOptString).toString());
                    }
                    responder.a(Integer.valueOf(bVar.d(strOptString2)));
                    L l10 = L.f17438a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: x7.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0964b extends j {
        C0964b() {
        }

        @Override // x7.i
        public void b(Object obj, k responder) {
            AbstractC5504s.h(responder, "responder");
            Map map = b.this.f64015c;
            b bVar = b.this;
            synchronized (map) {
                try {
                    try {
                    } catch (Exception e10) {
                        responder.b(e10.toString());
                    }
                    if (!(obj instanceof Number)) {
                        throw new Exception("params must be a file handle");
                    }
                    e eVar = (e) bVar.f64015c.get(obj);
                    if (eVar == null) {
                        throw new Exception("invalid file handle, it might have timed out");
                    }
                    V.c(bVar.f64015c).remove(obj);
                    eVar.a();
                    responder.a("");
                    L l10 = L.f17438a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c extends j {
        c() {
        }

        @Override // x7.i
        public void b(Object obj, k responder) {
            JSONObject jSONObject;
            AbstractC5504s.h(responder, "responder");
            Map map = b.this.f64015c;
            b bVar = b.this;
            synchronized (map) {
                try {
                    try {
                        jSONObject = (JSONObject) obj;
                    } catch (Exception e10) {
                        responder.b(e10.toString());
                    }
                    if (jSONObject == null) {
                        throw new Exception("params must be an object { file: handle, size: number }");
                    }
                    int iOptInt = jSONObject.optInt("file");
                    if (iOptInt == 0) {
                        throw new Exception("invalid or missing file handle");
                    }
                    int iOptInt2 = jSONObject.optInt("size");
                    if (iOptInt2 == 0) {
                        throw new Exception("invalid or missing read size");
                    }
                    e eVar = (e) bVar.f64015c.get(Integer.valueOf(iOptInt));
                    if (eVar == null) {
                        throw new Exception("invalid file handle, it might have timed out");
                    }
                    responder.a(eVar.d(iOptInt2));
                    L l10 = L.f17438a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final FileInputStream f64020a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f64021b = System.currentTimeMillis() + HTTPTimeoutManager.DEFAULT_TIMEOUT_MS;

        public e(String str) {
            this.f64020a = new FileInputStream(str);
        }

        private final void c() {
            this.f64021b = System.currentTimeMillis() + HTTPTimeoutManager.DEFAULT_TIMEOUT_MS;
        }

        public final void a() throws IOException {
            this.f64020a.close();
        }

        public final boolean b() {
            return System.currentTimeMillis() >= this.f64021b;
        }

        public final String d(int i10) {
            c();
            byte[] bArr = new byte[i10];
            String strEncodeToString = Base64.encodeToString(bArr, 0, this.f64020a.read(bArr), 0);
            AbstractC5504s.g(strEncodeToString, "encodeToString(...)");
            return strEncodeToString;
        }
    }

    static {
        String simpleName = x7.c.class.getSimpleName();
        AbstractC5504s.g(simpleName, "getSimpleName(...)");
        f64012f = simpleName;
    }

    public b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f64016d = linkedHashMap;
        linkedHashMap.put("fopen", new a());
        linkedHashMap.put("fclose", new C0964b());
        linkedHashMap.put("fread", new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int d(String str) {
        int i10 = this.f64013a;
        this.f64013a = i10 + 1;
        this.f64015c.put(Integer.valueOf(i10), new e(str));
        if (this.f64015c.size() == 1) {
            this.f64014b.postDelayed(this, HTTPTimeoutManager.DEFAULT_TIMEOUT_MS);
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(Map.Entry entry) {
        AbstractC5504s.h(entry, "<destruct>");
        e eVar = (e) entry.getValue();
        if (!eVar.b()) {
            return false;
        }
        try {
            eVar.a();
            return true;
        } catch (IOException e10) {
            AbstractC7283a.n(f64012f, "Failed to close expired file", e10);
            return true;
        }
    }

    public final Map e() {
        return this.f64016d;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f64015c) {
            try {
                AbstractC2279u.I(this.f64015c.entrySet(), new Function1() { // from class: x7.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(b.f((Map.Entry) obj));
                    }
                });
                if (!this.f64015c.isEmpty()) {
                    this.f64014b.postDelayed(this, HTTPTimeoutManager.DEFAULT_TIMEOUT_MS);
                }
                L l10 = L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
