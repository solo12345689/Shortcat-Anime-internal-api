package O6;

import C6.c;
import Df.r;
import E6.e;
import E6.j;
import E6.k;
import E6.p;
import G5.f;
import Ud.AbstractC2279u;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import y6.d;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f13042c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f13043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f13044b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(Resources resources) {
        AbstractC5504s.h(resources, "resources");
        this.f13043a = resources;
        this.f13044b = new ConcurrentHashMap();
    }

    private final int b(String str) {
        Map map = this.f13044b;
        Object objValueOf = map.get(str);
        if (objValueOf == null) {
            Uri uri = Uri.parse(str);
            AbstractC5504s.g(uri, "parse(...)");
            objValueOf = Integer.valueOf(c(uri));
            map.put(str, objValueOf);
        }
        return ((Number) objValueOf).intValue();
    }

    private final int c(Uri uri) {
        Integer numR;
        if (!f.m(uri) && !f.o(uri)) {
            throw new IllegalStateException(("Unsupported uri " + uri).toString());
        }
        List<String> pathSegments = uri.getPathSegments();
        AbstractC5504s.g(pathSegments, "getPathSegments(...)");
        String str = (String) AbstractC2279u.A0(pathSegments);
        if (str != null && (numR = r.r(str)) != null) {
            return numR.intValue();
        }
        throw new IllegalStateException(("Unable to read resource ID from " + uri.getPath()).toString());
    }

    @Override // C6.c
    public e a(k encodedImage, int i10, p qualityInfo, d options) {
        AbstractC5504s.h(encodedImage, "encodedImage");
        AbstractC5504s.h(qualityInfo, "qualityInfo");
        AbstractC5504s.h(options, "options");
        try {
            String strD = encodedImage.D();
            if (strD == null) {
                throw new IllegalStateException("No source in encoded image");
            }
            Drawable drawableF = z1.k.f(this.f13043a, b(strD), null);
            if (drawableF != null) {
                return new j(drawableF);
            }
            return null;
        } catch (Throwable th2) {
            AbstractC7283a.n("XmlFormatDecoder", "Cannot decode xml", th2);
            return null;
        }
    }
}
