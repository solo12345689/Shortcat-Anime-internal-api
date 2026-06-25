package Z0;

import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f23103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f23104b;

    public c(String str, boolean z10) {
        this.f23103a = str;
        this.f23104b = z10;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name cannot be empty");
        }
    }

    public final boolean a() {
        return this.f23104b;
    }

    public final String b() {
        return this.f23103a;
    }

    public /* synthetic */ c(String str, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? true : z10);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f23105a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f23106b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f23107c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f23108d;

        private a(String str, String str2, List list, int i10) {
            this.f23105a = str;
            this.f23106b = str2;
            this.f23107c = list;
            this.f23108d = i10;
        }

        public final List a() {
            return this.f23107c;
        }

        public final int b() {
            return this.f23108d;
        }

        public final String c() {
            return this.f23105a;
        }

        public final String d() {
            return this.f23106b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC5504s.c(this.f23105a, aVar.f23105a) && AbstractC5504s.c(this.f23106b, aVar.f23106b) && AbstractC5504s.c(this.f23107c, aVar.f23107c) && this.f23108d == aVar.f23108d;
        }

        public int hashCode() {
            int iHashCode = ((this.f23105a.hashCode() * 31) + this.f23106b.hashCode()) * 31;
            List list = this.f23107c;
            return ((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + this.f23108d;
        }

        public a(String str, String str2, int i10) {
            this(str, str2, null, i10);
        }
    }
}
