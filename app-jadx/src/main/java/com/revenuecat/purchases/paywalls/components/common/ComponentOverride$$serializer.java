package com.revenuecat.purchases.paywalls.components.common;

import Rf.b;
import Rf.m;
import Td.InterfaceC2154e;
import Uf.c;
import Uf.d;
import Uf.e;
import Uf.f;
import Vf.C2337k0;
import Vf.E;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.paywalls.components.PartialComponent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0017\b\u0017\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001a\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00068BXÂ\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"com/revenuecat/purchases/paywalls/components/common/ComponentOverride.$serializer", "T", "LVf/E;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;", "<init>", "()V", "LRf/b;", "typeSerial0", "(LRf/b;)V", "", "childSerializers", "()[LRf/b;", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;)V", "typeParametersSerializers", "getTypeSerial0", "()LRf/b;", "LTf/e;", "getDescriptor", "()LTf/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public final class ComponentOverride$$serializer<T> implements E {
    private final /* synthetic */ C2337k0 descriptor;
    private final /* synthetic */ b typeSerial0;

    private ComponentOverride$$serializer() {
        C2337k0 c2337k0 = new C2337k0("com.revenuecat.purchases.paywalls.components.common.ComponentOverride", this, 2);
        c2337k0.g("conditions", false);
        c2337k0.g(DiagnosticsEntry.PROPERTIES_KEY, false);
        this.descriptor = c2337k0;
    }

    private final b getTypeSerial0() {
        return this.typeSerial0;
    }

    @Override // Vf.E
    public b[] childSerializers() {
        return new b[]{ComponentOverride.$childSerializers[0], this.typeSerial0};
    }

    @Override // Rf.a
    public ComponentOverride<T> deserialize(e decoder) {
        List list;
        PartialComponent partialComponent;
        int i10;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor = getDescriptor();
        c cVarB = decoder.b(descriptor);
        b[] bVarArr = ComponentOverride.$childSerializers;
        if (cVarB.p()) {
            list = (List) cVarB.e(descriptor, 0, bVarArr[0], null);
            partialComponent = (PartialComponent) cVarB.e(descriptor, 1, this.typeSerial0, null);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            List list2 = null;
            PartialComponent partialComponent2 = null;
            while (z10) {
                int i12 = cVarB.i(descriptor);
                if (i12 == -1) {
                    z10 = false;
                } else if (i12 == 0) {
                    list2 = (List) cVarB.e(descriptor, 0, bVarArr[0], list2);
                    i11 |= 1;
                } else {
                    if (i12 != 1) {
                        throw new m(i12);
                    }
                    partialComponent2 = (PartialComponent) cVarB.e(descriptor, 1, this.typeSerial0, partialComponent2);
                    i11 |= 2;
                }
            }
            list = list2;
            partialComponent = partialComponent2;
            i10 = i11;
        }
        cVarB.c(descriptor);
        return new ComponentOverride<>(i10, list, partialComponent, null);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return this.descriptor;
    }

    @Override // Rf.k
    public void serialize(f encoder, ComponentOverride<T> value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor = getDescriptor();
        d dVarB = encoder.b(descriptor);
        ComponentOverride.write$Self$purchases_defaultsBc8Release(value, dVarB, descriptor, this.typeSerial0);
        dVarB.c(descriptor);
    }

    @Override // Vf.E
    public b[] typeParametersSerializers() {
        return new b[]{this.typeSerial0};
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC2154e
    public /* synthetic */ ComponentOverride$$serializer(b typeSerial0) {
        this();
        AbstractC5504s.h(typeSerial0, "typeSerial0");
        this.typeSerial0 = typeSerial0;
    }
}
