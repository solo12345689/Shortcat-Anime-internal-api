package Wf;

import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: Wf.d */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2360d implements Rf.b {

    /* JADX INFO: renamed from: a */
    public static final C2360d f20900a = new C2360d();

    /* JADX INFO: renamed from: b */
    private static final Tf.e f20901b = a.f20902b;

    /* JADX INFO: renamed from: Wf.d$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a implements Tf.e {

        /* JADX INFO: renamed from: b */
        public static final a f20902b = new a();

        /* JADX INFO: renamed from: c */
        private static final String f20903c = "kotlinx.serialization.json.JsonArray";

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Tf.e f20904a = Sf.a.g(q.f20939a).getDescriptor();

        private a() {
        }

        @Override // Tf.e
        public List getAnnotations() {
            return this.f20904a.getAnnotations();
        }

        @Override // Tf.e
        public Tf.l h() {
            return this.f20904a.h();
        }

        @Override // Tf.e
        public boolean i() {
            return this.f20904a.i();
        }

        @Override // Tf.e
        public boolean isInline() {
            return this.f20904a.isInline();
        }

        @Override // Tf.e
        public int j(String name) {
            AbstractC5504s.h(name, "name");
            return this.f20904a.j(name);
        }

        @Override // Tf.e
        public int k() {
            return this.f20904a.k();
        }

        @Override // Tf.e
        public String l(int i10) {
            return this.f20904a.l(i10);
        }

        @Override // Tf.e
        public List m(int i10) {
            return this.f20904a.m(i10);
        }

        @Override // Tf.e
        public Tf.e n(int i10) {
            return this.f20904a.n(i10);
        }

        @Override // Tf.e
        public String o() {
            return f20903c;
        }

        @Override // Tf.e
        public boolean p(int i10) {
            return this.f20904a.p(i10);
        }
    }

    private C2360d() {
    }

    @Override // Rf.a
    /* JADX INFO: renamed from: a */
    public C2359c deserialize(Uf.e decoder) {
        AbstractC5504s.h(decoder, "decoder");
        r.g(decoder);
        return new C2359c((List) Sf.a.g(q.f20939a).deserialize(decoder));
    }

    @Override // Rf.k
    /* JADX INFO: renamed from: b */
    public void serialize(Uf.f encoder, C2359c value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        r.h(encoder);
        Sf.a.g(q.f20939a).serialize(encoder, value);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return f20901b;
    }
}
