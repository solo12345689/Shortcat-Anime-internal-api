package Dd;

import Df.r;
import android.content.Context;
import android.net.Uri;
import com.amazon.a.a.o.c.a.b;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import rb.C6303d;
import rd.C6306a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f3689a = new a();

    /* JADX INFO: renamed from: Dd.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0043a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f3690a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f3691b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f3692c;

        public C0043a(String str, String str2, String str3) {
            this.f3690a = str;
            this.f3691b = str2;
            this.f3692c = str3;
        }

        public final String a() {
            return this.f3690a;
        }

        public final String b() {
            return this.f3691b;
        }

        public final String c() {
            return this.f3692c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0043a)) {
                return false;
            }
            C0043a c0043a = (C0043a) obj;
            return AbstractC5504s.c(this.f3690a, c0043a.f3690a) && AbstractC5504s.c(this.f3691b, c0043a.f3691b) && AbstractC5504s.c(this.f3692c, c0043a.f3692c);
        }

        public int hashCode() {
            String str = this.f3690a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f3691b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f3692c;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "AndroidResourceAsset(embeddedAssetFilename=" + this.f3690a + ", resourcesFolder=" + this.f3691b + ", resourceFilename=" + this.f3692c + ")";
        }
    }

    private a() {
    }

    private final String b(Float f10) {
        return AbstractC5504s.b(f10, 0.75f) ? "-ldpi" : AbstractC5504s.b(f10, 1.0f) ? "-mdpi" : AbstractC5504s.b(f10, 1.5f) ? "-hdpi" : AbstractC5504s.b(f10, 2.0f) ? "-xhdpi" : AbstractC5504s.b(f10, 3.0f) ? "-xxhdpi" : AbstractC5504s.b(f10, 4.0f) ? "-xxxhdpi" : "";
    }

    public final String a(C6306a asset) {
        AbstractC5504s.h(asset, "asset");
        String strE = asset.e();
        if (asset.b() != null) {
            return "file:///android_asset/" + asset.b() + strE;
        }
        if (asset.o() == null || asset.n() == null) {
            return null;
        }
        return "file:///android_res/" + asset.o() + b(asset.p()) + "/" + asset.n() + strE;
    }

    public final boolean c(Context context, String name) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(name, "name");
        try {
            context.getAssets().open(name).close();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public final boolean d(Context context, String filePath) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(filePath, "filePath");
        C0043a c0043aG = g(filePath);
        String strA = c0043aG.a();
        String strB = c0043aG.b();
        String strC = c0043aG.c();
        if (strA != null) {
            return c(context, strA);
        }
        if (strB == null || strC == null) {
            return false;
        }
        return f(context, strB, strC);
    }

    public final boolean e(String filePath) {
        AbstractC5504s.h(filePath, "filePath");
        return r.Q(filePath, "file:///android_res/", false, 2, null) || r.Q(filePath, "file:///android_asset/", false, 2, null);
    }

    public final boolean f(Context context, String resourceFolder, String resourceFilename) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(resourceFolder, "resourceFolder");
        AbstractC5504s.h(resourceFilename, "resourceFilename");
        return context.getResources().getIdentifier(resourceFilename, resourceFolder, context.getPackageName()) != 0;
    }

    public final C0043a g(String filePath) {
        AbstractC5504s.h(filePath, "filePath");
        if (!r.Q(filePath, "file:///android_res/", false, 2, null)) {
            return r.Q(filePath, "file:///android_asset/", false, 2, null) ? new C0043a(r.Z0(filePath, '/', null, 2, null), null, null) : new C0043a(null, null, null);
        }
        List<String> pathSegments = Uri.parse(filePath).getPathSegments();
        if (pathSegments.size() < 3) {
            throw new C6303d("Invalid resource file path: " + filePath);
        }
        String str = pathSegments.get(1);
        AbstractC5504s.g(str, "get(...)");
        String strD1 = r.d1(str, '-', null, 2, null);
        String str2 = pathSegments.get(2);
        AbstractC5504s.g(str2, "get(...)");
        String str3 = pathSegments.get(2);
        AbstractC5504s.g(str3, "get(...)");
        return new C0043a(null, strD1, r.f1(str2, b.f34706a, str3));
    }
}
