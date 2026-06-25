package com.revenuecat.purchases.utils.serializers;

import Rf.b;
import Rf.j;
import Tf.e;
import Uf.f;
import Wf.C;
import Wf.h;
import Wf.i;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0003B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/revenuecat/purchases/utils/serializers/EmptyObjectToNullSerializer;", "", "T", "LRf/b;", "delegate", "", "resilient", "<init>", "(LRf/b;Z)V", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Ljava/lang/Object;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Ljava/lang/Object;)V", "LRf/b;", "Z", "LTf/e;", "descriptor", "LTf/e;", "getDescriptor", "()LTf/e;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class EmptyObjectToNullSerializer<T> implements b {
    private final b delegate;
    private final e descriptor;
    private final boolean resilient;

    public EmptyObjectToNullSerializer(b delegate, boolean z10) {
        AbstractC5504s.h(delegate, "delegate");
        this.delegate = delegate;
        this.resilient = z10;
        this.descriptor = delegate.getDescriptor();
    }

    @Override // Rf.a
    public T deserialize(Uf.e decoder) {
        AbstractC5504s.h(decoder, "decoder");
        h hVar = decoder instanceof h ? (h) decoder : null;
        if (hVar == null) {
            return (T) this.delegate.deserialize(decoder);
        }
        i iVarG = hVar.g();
        if (!(iVarG instanceof C) || ((C) iVarG).isEmpty()) {
            return null;
        }
        if (!this.resilient) {
            return (T) hVar.d().c(this.delegate, iVarG);
        }
        try {
            return (T) hVar.d().c(this.delegate, iVarG);
        } catch (j unused) {
            return null;
        }
    }

    @Override // Rf.b, Rf.k, Rf.a
    public e getDescriptor() {
        return this.descriptor;
    }

    @Override // Rf.k
    public void serialize(f encoder, T value) {
        AbstractC5504s.h(encoder, "encoder");
        if (value != null) {
            this.delegate.serialize(encoder, value);
        }
    }

    public /* synthetic */ EmptyObjectToNullSerializer(b bVar, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, (i10 & 2) != 0 ? true : z10);
    }
}
