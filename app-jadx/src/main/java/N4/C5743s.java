package n4;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: n4.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5743s implements InterfaceC5742r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final M3.q f53933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final M3.i f53934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final M3.w f53935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final M3.w f53936d;

    /* JADX INFO: renamed from: n4.s$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends M3.i {
        a(M3.q qVar) {
            super(qVar);
        }

        @Override // M3.w
        public String e() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // M3.i
        public /* bridge */ /* synthetic */ void i(S3.k kVar, Object obj) {
            android.support.v4.media.session.b.a(obj);
            l(kVar, null);
        }

        public void l(S3.k kVar, AbstractC5741q abstractC5741q) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: n4.s$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b extends M3.w {
        b(M3.q qVar) {
            super(qVar);
        }

        @Override // M3.w
        public String e() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* JADX INFO: renamed from: n4.s$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class c extends M3.w {
        c(M3.q qVar) {
            super(qVar);
        }

        @Override // M3.w
        public String e() {
            return "DELETE FROM WorkProgress";
        }
    }

    public C5743s(M3.q qVar) {
        this.f53933a = qVar;
        this.f53934b = new a(qVar);
        this.f53935c = new b(qVar);
        this.f53936d = new c(qVar);
    }

    public static List c() {
        return Collections.EMPTY_LIST;
    }

    @Override // n4.InterfaceC5742r
    public void a(String str) {
        this.f53933a.d();
        S3.k kVarB = this.f53935c.b();
        if (str == null) {
            kVarB.I1(1);
        } else {
            kVarB.Z0(1, str);
        }
        this.f53933a.e();
        try {
            kVarB.Z();
            this.f53933a.B();
        } finally {
            this.f53933a.i();
            this.f53935c.h(kVarB);
        }
    }

    @Override // n4.InterfaceC5742r
    public void b() {
        this.f53933a.d();
        S3.k kVarB = this.f53936d.b();
        this.f53933a.e();
        try {
            kVarB.Z();
            this.f53933a.B();
        } finally {
            this.f53933a.i();
            this.f53936d.h(kVarB);
        }
    }
}
