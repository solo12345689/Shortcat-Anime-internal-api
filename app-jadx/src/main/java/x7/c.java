package x7;

import android.net.Uri;
import app.notifee.core.event.LogEvent;
import b7.C3026a;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;
import tg.C6686k;
import x7.h;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements h.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f64022c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f64023d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f64024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f64025b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class b implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f64026a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f64027b;

        public b(c cVar, Object id2) {
            AbstractC5504s.h(id2, "id");
            this.f64027b = cVar;
            this.f64026a = id2;
        }

        @Override // x7.k
        public void a(Object result) {
            AbstractC5504s.h(result, "result");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(DiagnosticsEntry.VERSION_KEY, 2);
                jSONObject.put(DiagnosticsEntry.ID_KEY, this.f64026a);
                jSONObject.put("result", result);
                h hVar = this.f64027b.f64025b;
                String string = jSONObject.toString();
                AbstractC5504s.g(string, "toString(...)");
                hVar.o(string);
            } catch (Exception e10) {
                AbstractC7283a.n(c.f64023d, "Responding failed", e10);
            }
        }

        @Override // x7.k
        public void b(Object error) {
            AbstractC5504s.h(error, "error");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(DiagnosticsEntry.VERSION_KEY, 2);
                jSONObject.put(DiagnosticsEntry.ID_KEY, this.f64026a);
                jSONObject.put(LogEvent.LEVEL_ERROR, error);
                h hVar = this.f64027b.f64025b;
                String string = jSONObject.toString();
                AbstractC5504s.g(string, "toString(...)");
                hVar.o(string);
            } catch (Exception e10) {
                AbstractC7283a.n(c.f64023d, "Responding with error failed", e10);
            }
        }
    }

    static {
        String simpleName = c.class.getSimpleName();
        AbstractC5504s.g(simpleName, "getSimpleName(...)");
        f64023d = simpleName;
    }

    public c(String clientId, f settings, Map requestHandlers, h.b bVar) {
        AbstractC5504s.h(clientId, "clientId");
        AbstractC5504s.h(settings, "settings");
        AbstractC5504s.h(requestHandlers, "requestHandlers");
        this.f64024a = requestHandlers;
        String string = new Uri.Builder().scheme(C3026a.f33222a.d(settings.d())).encodedAuthority(settings.d()).appendPath("message").appendQueryParameter("device", com.facebook.react.modules.systeminfo.a.e()).appendQueryParameter("app", settings.e()).appendQueryParameter("clientid", clientId).build().toString();
        AbstractC5504s.g(string, "toString(...)");
        this.f64025b = new h(string, this, bVar);
    }

    private final void c(Object obj, String str) {
        if (obj != null) {
            new b(this, obj).b(str);
        }
        AbstractC7283a.m(f64023d, "Handling the message failed with reason: " + str);
    }

    @Override // x7.h.c
    public void a(String text) {
        AbstractC5504s.h(text, "text");
        try {
            JSONObject jSONObject = new JSONObject(text);
            int iOptInt = jSONObject.optInt(DiagnosticsEntry.VERSION_KEY);
            String strOptString = jSONObject.optString("method");
            Object objOpt = jSONObject.opt(DiagnosticsEntry.ID_KEY);
            Object objOpt2 = jSONObject.opt("params");
            if (iOptInt != 2) {
                AbstractC7283a.m(f64023d, "Message with incompatible or missing version of protocol received: " + iOptInt);
                return;
            }
            if (strOptString == null) {
                c(objOpt, "No method provided");
                return;
            }
            i iVar = (i) this.f64024a.get(strOptString);
            if (iVar == null) {
                c(objOpt, "No request handler for method: " + strOptString);
                return;
            }
            if (objOpt == null) {
                iVar.a(objOpt2);
            } else {
                iVar.b(objOpt2, new b(this, objOpt));
            }
        } catch (Exception e10) {
            AbstractC7283a.n(f64023d, "Handling the message failed", e10);
        }
    }

    @Override // x7.h.c
    public void b(C6686k bytes) {
        AbstractC5504s.h(bytes, "bytes");
        AbstractC7283a.I(f64023d, "Websocket received message with payload of unexpected type binary");
    }

    public final void f() {
        this.f64025b.i();
    }

    public final void g() {
        this.f64025b.k();
    }
}
