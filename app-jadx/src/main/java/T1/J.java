package T1;

import Zd.i;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class J implements i.b {

    /* JADX INFO: renamed from: c */
    public static final a f16790c = new a(null);

    /* JADX INFO: renamed from: d */
    private static final String f16791d = "Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.";

    /* JADX INFO: renamed from: a */
    private final J f16792a;

    /* JADX INFO: renamed from: b */
    private final C2147k f16793b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: T1.J$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0287a implements i.c {

            /* JADX INFO: renamed from: a */
            public static final C0287a f16794a = new C0287a();

            private C0287a() {
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public J(J j10, C2147k instance) {
        AbstractC5504s.h(instance, "instance");
        this.f16792a = j10;
        this.f16793b = instance;
    }

    public final void a(InterfaceC2145i candidate) {
        AbstractC5504s.h(candidate, "candidate");
        if (this.f16793b == candidate) {
            throw new IllegalStateException(f16791d.toString());
        }
        J j10 = this.f16792a;
        if (j10 != null) {
            j10.a(candidate);
        }
    }

    @Override // Zd.i
    public Zd.i a1(i.c cVar) {
        return i.b.a.c(this, cVar);
    }

    @Override // Zd.i.b
    public i.c getKey() {
        return a.C0287a.f16794a;
    }

    @Override // Zd.i.b, Zd.i
    public i.b l(i.c cVar) {
        return i.b.a.b(this, cVar);
    }

    @Override // Zd.i
    public Zd.i w(Zd.i iVar) {
        return i.b.a.d(this, iVar);
    }

    @Override // Zd.i
    public Object y1(Object obj, Function2 function2) {
        return i.b.a.a(this, obj, function2);
    }
}
