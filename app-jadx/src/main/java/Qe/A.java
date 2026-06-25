package Qe;

import Ve.a;
import We.d;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class A {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f14801b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f14802a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final A a(String name, String desc) {
            AbstractC5504s.h(name, "name");
            AbstractC5504s.h(desc, "desc");
            return new A(name + '#' + desc, null);
        }

        public final A b(We.d signature) {
            AbstractC5504s.h(signature, "signature");
            if (signature instanceof d.b) {
                d.b bVar = (d.b) signature;
                return d(bVar.e(), bVar.d());
            }
            if (!(signature instanceof d.a)) {
                throw new Td.r();
            }
            d.a aVar = (d.a) signature;
            return a(aVar.e(), aVar.d());
        }

        public final A c(Ue.d nameResolver, a.c signature) {
            AbstractC5504s.h(nameResolver, "nameResolver");
            AbstractC5504s.h(signature, "signature");
            return d(nameResolver.getString(signature.y()), nameResolver.getString(signature.x()));
        }

        public final A d(String name, String desc) {
            AbstractC5504s.h(name, "name");
            AbstractC5504s.h(desc, "desc");
            return new A(name + desc, null);
        }

        public final A e(A signature, int i10) {
            AbstractC5504s.h(signature, "signature");
            return new A(signature.a() + '@' + i10, null);
        }

        private a() {
        }
    }

    public /* synthetic */ A(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String a() {
        return this.f14802a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof A) && AbstractC5504s.c(this.f14802a, ((A) obj).f14802a);
    }

    public int hashCode() {
        return this.f14802a.hashCode();
    }

    public String toString() {
        return "MemberSignature(signature=" + this.f14802a + ')';
    }

    private A(String str) {
        this.f14802a = str;
    }
}
