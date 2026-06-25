package Wf;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.U;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class D implements Rf.b {

    /* JADX INFO: renamed from: a */
    public static final D f20883a = new D();

    /* JADX INFO: renamed from: b */
    private static final Tf.e f20884b = a.f20885b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a implements Tf.e {

        /* JADX INFO: renamed from: b */
        public static final a f20885b = new a();

        /* JADX INFO: renamed from: c */
        private static final String f20886c = "kotlinx.serialization.json.JsonObject";

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Tf.e f20887a = Sf.a.i(Sf.a.F(U.f52264a), q.f20939a).getDescriptor();

        private a() {
        }

        @Override // Tf.e
        public List getAnnotations() {
            return this.f20887a.getAnnotations();
        }

        @Override // Tf.e
        public Tf.l h() {
            return this.f20887a.h();
        }

        @Override // Tf.e
        public boolean i() {
            return this.f20887a.i();
        }

        @Override // Tf.e
        public boolean isInline() {
            return this.f20887a.isInline();
        }

        @Override // Tf.e
        public int j(String name) {
            AbstractC5504s.h(name, "name");
            return this.f20887a.j(name);
        }

        @Override // Tf.e
        public int k() {
            return this.f20887a.k();
        }

        @Override // Tf.e
        public String l(int i10) {
            return this.f20887a.l(i10);
        }

        @Override // Tf.e
        public List m(int i10) {
            return this.f20887a.m(i10);
        }

        @Override // Tf.e
        public Tf.e n(int i10) {
            return this.f20887a.n(i10);
        }

        @Override // Tf.e
        public String o() {
            return f20886c;
        }

        @Override // Tf.e
        public boolean p(int i10) {
            return this.f20887a.p(i10);
        }
    }

    private D() {
    }

    @Override // Rf.a
    /* JADX INFO: renamed from: a */
    public C deserialize(Uf.e decoder) {
        AbstractC5504s.h(decoder, "decoder");
        r.g(decoder);
        return new C((Map) Sf.a.i(Sf.a.F(U.f52264a), q.f20939a).deserialize(decoder));
    }

    @Override // Rf.k
    /* JADX INFO: renamed from: b */
    public void serialize(Uf.f encoder, C value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        r.h(encoder);
        Sf.a.i(Sf.a.F(U.f52264a), q.f20939a).serialize(encoder, value);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return f20884b;
    }
}
