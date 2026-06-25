package Vf;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: Vf.p0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC2347p0 extends AbstractC2346p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Tf.e f20223b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2347p0(Rf.b primitiveSerializer) {
        super(primitiveSerializer, null);
        AbstractC5504s.h(primitiveSerializer, "primitiveSerializer");
        this.f20223b = new C2345o0(primitiveSerializer.getDescriptor());
    }

    @Override // Vf.AbstractC2316a
    protected final Iterator d(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // Vf.AbstractC2316a, Rf.a
    public final Object deserialize(Uf.e decoder) {
        AbstractC5504s.h(decoder, "decoder");
        return f(decoder, null);
    }

    @Override // Vf.AbstractC2346p, Rf.b, Rf.k, Rf.a
    public final Tf.e getDescriptor() {
        return this.f20223b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Vf.AbstractC2316a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final AbstractC2343n0 a() {
        return (AbstractC2343n0) k(r());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Vf.AbstractC2316a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final int b(AbstractC2343n0 abstractC2343n0) {
        AbstractC5504s.h(abstractC2343n0, "<this>");
        return abstractC2343n0.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Vf.AbstractC2316a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void c(AbstractC2343n0 abstractC2343n0, int i10) {
        AbstractC5504s.h(abstractC2343n0, "<this>");
        abstractC2343n0.b(i10);
    }

    protected abstract Object r();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Vf.AbstractC2346p
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void n(AbstractC2343n0 abstractC2343n0, int i10, Object obj) {
        AbstractC5504s.h(abstractC2343n0, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    @Override // Vf.AbstractC2346p, Rf.k
    public final void serialize(Uf.f encoder, Object obj) {
        AbstractC5504s.h(encoder, "encoder");
        int iE = e(obj);
        Tf.e eVar = this.f20223b;
        Uf.d dVarR = encoder.r(eVar, iE);
        u(dVarR, obj, iE);
        dVarR.c(eVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Vf.AbstractC2316a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final Object l(AbstractC2343n0 abstractC2343n0) {
        AbstractC5504s.h(abstractC2343n0, "<this>");
        return abstractC2343n0.a();
    }

    protected abstract void u(Uf.d dVar, Object obj, int i10);
}
