package Wf;

import Td.AbstractC2163n;
import Tf.e;
import ie.InterfaceC5082a;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.O;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class r {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Tf.e {

        /* JADX INFO: renamed from: a */
        private final Lazy f20941a;

        a(InterfaceC5082a interfaceC5082a) {
            this.f20941a = AbstractC2163n.b(interfaceC5082a);
        }

        private final Tf.e a() {
            return (Tf.e) this.f20941a.getValue();
        }

        @Override // Tf.e
        public List getAnnotations() {
            return e.a.a(this);
        }

        @Override // Tf.e
        public Tf.l h() {
            return a().h();
        }

        @Override // Tf.e
        public boolean i() {
            return e.a.c(this);
        }

        @Override // Tf.e
        public boolean isInline() {
            return e.a.b(this);
        }

        @Override // Tf.e
        public int j(String name) {
            AbstractC5504s.h(name, "name");
            return a().j(name);
        }

        @Override // Tf.e
        public int k() {
            return a().k();
        }

        @Override // Tf.e
        public String l(int i10) {
            return a().l(i10);
        }

        @Override // Tf.e
        public List m(int i10) {
            return a().m(i10);
        }

        @Override // Tf.e
        public Tf.e n(int i10) {
            return a().n(i10);
        }

        @Override // Tf.e
        public String o() {
            return a().o();
        }

        @Override // Tf.e
        public boolean p(int i10) {
            return a().p(i10);
        }
    }

    public static final h d(Uf.e eVar) {
        AbstractC5504s.h(eVar, "<this>");
        h hVar = eVar instanceof h ? (h) eVar : null;
        if (hVar != null) {
            return hVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + O.b(eVar.getClass()));
    }

    public static final s e(Uf.f fVar) {
        AbstractC5504s.h(fVar, "<this>");
        s sVar = fVar instanceof s ? (s) fVar : null;
        if (sVar != null) {
            return sVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + O.b(fVar.getClass()));
    }

    public static final Tf.e f(InterfaceC5082a interfaceC5082a) {
        return new a(interfaceC5082a);
    }

    public static final void g(Uf.e eVar) {
        d(eVar);
    }

    public static final void h(Uf.f fVar) {
        e(fVar);
    }
}
