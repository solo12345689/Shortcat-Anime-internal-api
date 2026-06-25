package A6;

import com.facebook.imagepipeline.producers.d0;
import com.facebook.imagepipeline.producers.e0;
import com.facebook.imagepipeline.producers.l0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class c extends a {
    private c(d0 d0Var, l0 l0Var, G6.d dVar) {
        super(d0Var, l0Var, dVar);
    }

    public static I5.c G(d0 d0Var, l0 l0Var, G6.d dVar) {
        if (L6.b.d()) {
            L6.b.a("CloseableProducerToDataSourceAdapter#create");
        }
        c cVar = new c(d0Var, l0Var, dVar);
        if (L6.b.d()) {
            L6.b.b();
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // I5.a
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void g(C5.a aVar) {
        C5.a.m(aVar);
    }

    @Override // I5.a, I5.c
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public C5.a a() {
        return C5.a.j((C5.a) super.a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.a
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void E(C5.a aVar, int i10, e0 e0Var) {
        super.E(C5.a.j(aVar), i10, e0Var);
    }
}
