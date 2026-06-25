package expo.modules.fetch;

import Bb.f;
import Df.r;
import android.content.Context;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import dg.C;
import dg.E;
import dg.EnumC4619B;
import dg.F;
import dg.u;
import dg.v;
import dg.x;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tg.InterfaceC6685j;
import tg.K;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f46090b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f46091a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final URL a(URL url) {
            AbstractC5504s.h(url, "url");
            if (!AbstractC5504s.c(url.getProtocol(), "file")) {
                return url;
            }
            return new URL("http://filesystem.local" + url.getPath());
        }

        private a() {
        }
    }

    public b(Context context) {
        AbstractC5504s.h(context, "context");
        this.f46091a = new WeakReference(context);
    }

    private final E c(C c10) {
        return new E.a().s(c10).p(EnumC4619B.HTTP_1_1).g(RCHTTPStatusCodes.NOT_FOUND).m("File not found").b(F.f45298a.b("File not found", x.f45605e.b("text/plain"))).c();
    }

    private final x d(String str) {
        String strGuessContentTypeFromName = URLConnection.guessContentTypeFromName(str);
        if (strGuessContentTypeFromName == null) {
            strGuessContentTypeFromName = "application/octet-stream";
        }
        x.a aVar = x.f45605e;
        x xVarC = aVar.c(strGuessContentTypeFromName);
        return xVarC == null ? aVar.b("application/octet-stream") : xVarC;
    }

    private final String e(u uVar) {
        return r.M(uVar.toString(), "http://filesystem.local", "file://", false, 4, null);
    }

    @Override // dg.v
    public E a(v.a chain) throws f {
        AbstractC5504s.h(chain, "chain");
        C cZ = chain.z();
        String strE = e(cZ.p());
        if (!r.Q(strE, "file://", false, 2, null)) {
            return chain.a(cZ);
        }
        if (r.Q(strE, "file:///android_asset/", false, 2, null)) {
            String strC0 = r.C0(strE, "file:///android_asset/");
            Context context = (Context) this.f46091a.get();
            if (context == null) {
                throw new f();
            }
            try {
                return new E.a().s(cZ).p(EnumC4619B.HTTP_1_1).g(200).m("OK").b(b(context, strC0)).c();
            } catch (IOException unused) {
                return c(cZ);
            }
        }
        String strSubstring = strE.substring(7);
        AbstractC5504s.g(strSubstring, "substring(...)");
        File file = new File(strSubstring);
        if (!file.exists()) {
            return c(cZ);
        }
        F.a aVar = F.f45298a;
        InterfaceC6685j interfaceC6685jD = K.d(K.j(file));
        String name = file.getName();
        AbstractC5504s.g(name, "getName(...)");
        return new E.a().s(cZ).p(EnumC4619B.HTTP_1_1).g(200).m("OK").b(aVar.c(interfaceC6685jD, d(name), file.length())).c();
    }

    public final F b(Context context, String fileName) throws IOException {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(fileName, "fileName");
        InputStream inputStreamOpen = context.getAssets().open(fileName);
        AbstractC5504s.g(inputStreamOpen, "open(...)");
        return F.a.e(F.f45298a, K.d(K.k(inputStreamOpen)), d(fileName), 0L, 2, null);
    }
}
