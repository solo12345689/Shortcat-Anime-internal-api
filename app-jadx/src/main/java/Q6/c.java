package q6;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f57671c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f57672d = new c("UNKNOWN", null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f57673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f57674b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
        c a(byte[] bArr, int i10);

        int b();
    }

    public c(String name, String str) {
        AbstractC5504s.h(name, "name");
        this.f57673a = name;
        this.f57674b = str;
    }

    public final String a() {
        return this.f57673a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return AbstractC5504s.c(this.f57673a, cVar.f57673a) && AbstractC5504s.c(this.f57674b, cVar.f57674b);
    }

    public int hashCode() {
        int iHashCode = this.f57673a.hashCode() * 31;
        String str = this.f57674b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return this.f57673a;
    }
}
