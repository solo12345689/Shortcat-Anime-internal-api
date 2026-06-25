package U0;

import U0.C2197e;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: U0.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2207j implements C2197e.a {

    /* JADX INFO: renamed from: U0.j$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends AbstractC2207j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f18841a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final U0 f18842b;

        public a(String str, U0 u02, InterfaceC2209k interfaceC2209k) {
            super(null);
            this.f18841a = str;
            this.f18842b = u02;
        }

        @Override // U0.AbstractC2207j
        public InterfaceC2209k a() {
            return null;
        }

        @Override // U0.AbstractC2207j
        public U0 b() {
            return this.f18842b;
        }

        public final String c() {
            return this.f18841a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!AbstractC5504s.c(this.f18841a, aVar.f18841a) || !AbstractC5504s.c(b(), aVar.b())) {
                return false;
            }
            a();
            aVar.a();
            return AbstractC5504s.c(null, null);
        }

        public int hashCode() {
            int iHashCode = this.f18841a.hashCode() * 31;
            U0 u0B = b();
            int iHashCode2 = (iHashCode + (u0B != null ? u0B.hashCode() : 0)) * 31;
            a();
            return iHashCode2;
        }

        public String toString() {
            return "LinkAnnotation.Clickable(tag=" + this.f18841a + ')';
        }
    }

    /* JADX INFO: renamed from: U0.j$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends AbstractC2207j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f18843a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final U0 f18844b;

        public /* synthetic */ b(String str, U0 u02, InterfaceC2209k interfaceC2209k, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? null : u02, (i10 & 4) != 0 ? null : interfaceC2209k);
        }

        @Override // U0.AbstractC2207j
        public InterfaceC2209k a() {
            return null;
        }

        @Override // U0.AbstractC2207j
        public U0 b() {
            return this.f18844b;
        }

        public final String c() {
            return this.f18843a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!AbstractC5504s.c(this.f18843a, bVar.f18843a) || !AbstractC5504s.c(b(), bVar.b())) {
                return false;
            }
            a();
            bVar.a();
            return AbstractC5504s.c(null, null);
        }

        public int hashCode() {
            int iHashCode = this.f18843a.hashCode() * 31;
            U0 u0B = b();
            int iHashCode2 = (iHashCode + (u0B != null ? u0B.hashCode() : 0)) * 31;
            a();
            return iHashCode2;
        }

        public String toString() {
            return "LinkAnnotation.Url(url=" + this.f18843a + ')';
        }

        public b(String str, U0 u02, InterfaceC2209k interfaceC2209k) {
            super(null);
            this.f18843a = str;
            this.f18844b = u02;
        }
    }

    public /* synthetic */ AbstractC2207j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract InterfaceC2209k a();

    public abstract U0 b();

    private AbstractC2207j() {
    }
}
