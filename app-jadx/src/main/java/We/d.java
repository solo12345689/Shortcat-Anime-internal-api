package We;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class d {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f20865a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f20866b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String name, String desc) {
            super(null);
            AbstractC5504s.h(name, "name");
            AbstractC5504s.h(desc, "desc");
            this.f20865a = name;
            this.f20866b = desc;
        }

        @Override // We.d
        public String a() {
            return e() + ':' + d();
        }

        public final String b() {
            return this.f20865a;
        }

        public final String c() {
            return this.f20866b;
        }

        public String d() {
            return this.f20866b;
        }

        public String e() {
            return this.f20865a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC5504s.c(this.f20865a, aVar.f20865a) && AbstractC5504s.c(this.f20866b, aVar.f20866b);
        }

        public int hashCode() {
            return (this.f20865a.hashCode() * 31) + this.f20866b.hashCode();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f20867a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f20868b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String name, String desc) {
            super(null);
            AbstractC5504s.h(name, "name");
            AbstractC5504s.h(desc, "desc");
            this.f20867a = name;
            this.f20868b = desc;
        }

        public static /* synthetic */ b c(b bVar, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = bVar.f20867a;
            }
            if ((i10 & 2) != 0) {
                str2 = bVar.f20868b;
            }
            return bVar.b(str, str2);
        }

        @Override // We.d
        public String a() {
            return e() + d();
        }

        public final b b(String name, String desc) {
            AbstractC5504s.h(name, "name");
            AbstractC5504s.h(desc, "desc");
            return new b(name, desc);
        }

        public String d() {
            return this.f20868b;
        }

        public String e() {
            return this.f20867a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC5504s.c(this.f20867a, bVar.f20867a) && AbstractC5504s.c(this.f20868b, bVar.f20868b);
        }

        public int hashCode() {
            return (this.f20867a.hashCode() * 31) + this.f20868b.hashCode();
        }
    }

    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String a();

    public final String toString() {
        return a();
    }

    private d() {
    }
}
