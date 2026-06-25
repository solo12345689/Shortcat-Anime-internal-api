package R8;

import P8.a;
import android.os.Bundle;

/* JADX INFO: renamed from: R8.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C2121w implements a.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2121w f15382b = a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15383a;

    /* JADX INFO: renamed from: R8.w$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f15384a;

        /* synthetic */ a(AbstractC2124z abstractC2124z) {
        }

        public C2121w a() {
            return new C2121w(this.f15384a, null);
        }

        public a b(String str) {
            this.f15384a = str;
            return this;
        }
    }

    /* synthetic */ C2121w(String str, A a10) {
        this.f15383a = str;
    }

    public static a a() {
        return new a(null);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        String str = this.f15383a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2121w) {
            return AbstractC2113n.a(this.f15383a, ((C2121w) obj).f15383a);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC2113n.b(this.f15383a);
    }
}
