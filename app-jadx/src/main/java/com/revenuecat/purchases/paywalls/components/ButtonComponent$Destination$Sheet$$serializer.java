package com.revenuecat.purchases.paywalls.components;

import Rf.b;
import Rf.m;
import Sf.a;
import Td.InterfaceC2154e;
import Uf.c;
import Uf.d;
import Uf.e;
import Uf.f;
import Vf.C2330h;
import Vf.C2337k0;
import Vf.E;
import Vf.x0;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.paywalls.components.ButtonComponent;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/ButtonComponent.Destination.Sheet.$serializer", "LVf/E;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Sheet;", "<init>", "()V", "", "LRf/b;", "childSerializers", "()[LRf/b;", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Sheet;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Sheet;)V", "LTf/e;", "getDescriptor", "()LTf/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public final class ButtonComponent$Destination$Sheet$$serializer implements E {
    public static final ButtonComponent$Destination$Sheet$$serializer INSTANCE;
    private static final /* synthetic */ C2337k0 descriptor;

    static {
        ButtonComponent$Destination$Sheet$$serializer buttonComponent$Destination$Sheet$$serializer = new ButtonComponent$Destination$Sheet$$serializer();
        INSTANCE = buttonComponent$Destination$Sheet$$serializer;
        C2337k0 c2337k0 = new C2337k0("com.revenuecat.purchases.paywalls.components.ButtonComponent.Destination.Sheet", buttonComponent$Destination$Sheet$$serializer, 5);
        c2337k0.g(DiagnosticsEntry.ID_KEY, false);
        c2337k0.g("name", false);
        c2337k0.g("stack", false);
        c2337k0.g("background_blur", false);
        c2337k0.g("size", false);
        descriptor = c2337k0;
    }

    private ButtonComponent$Destination$Sheet$$serializer() {
    }

    @Override // Vf.E
    public b[] childSerializers() {
        x0 x0Var = x0.f20253a;
        return new b[]{x0Var, a.p(x0Var), StackComponent$$serializer.INSTANCE, C2330h.f20193a, a.p(Size$$serializer.INSTANCE)};
    }

    @Override // Rf.a
    public ButtonComponent.Destination.Sheet deserialize(e decoder) {
        boolean zW;
        int i10;
        String str;
        String str2;
        StackComponent stackComponent;
        Size size;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        if (cVarB.p()) {
            String strL = cVarB.l(descriptor2, 0);
            String str3 = (String) cVarB.B(descriptor2, 1, x0.f20253a, null);
            StackComponent stackComponent2 = (StackComponent) cVarB.e(descriptor2, 2, StackComponent$$serializer.INSTANCE, null);
            str = strL;
            zW = cVarB.w(descriptor2, 3);
            size = (Size) cVarB.B(descriptor2, 4, Size$$serializer.INSTANCE, null);
            stackComponent = stackComponent2;
            str2 = str3;
            i10 = 31;
        } else {
            boolean z10 = true;
            boolean zW2 = false;
            String strL2 = null;
            String str4 = null;
            StackComponent stackComponent3 = null;
            Size size2 = null;
            int i11 = 0;
            while (z10) {
                int i12 = cVarB.i(descriptor2);
                if (i12 == -1) {
                    z10 = false;
                } else if (i12 == 0) {
                    strL2 = cVarB.l(descriptor2, 0);
                    i11 |= 1;
                } else if (i12 == 1) {
                    str4 = (String) cVarB.B(descriptor2, 1, x0.f20253a, str4);
                    i11 |= 2;
                } else if (i12 == 2) {
                    stackComponent3 = (StackComponent) cVarB.e(descriptor2, 2, StackComponent$$serializer.INSTANCE, stackComponent3);
                    i11 |= 4;
                } else if (i12 == 3) {
                    zW2 = cVarB.w(descriptor2, 3);
                    i11 |= 8;
                } else {
                    if (i12 != 4) {
                        throw new m(i12);
                    }
                    size2 = (Size) cVarB.B(descriptor2, 4, Size$$serializer.INSTANCE, size2);
                    i11 |= 16;
                }
            }
            zW = zW2;
            i10 = i11;
            str = strL2;
            str2 = str4;
            stackComponent = stackComponent3;
            size = size2;
        }
        cVarB.c(descriptor2);
        return new ButtonComponent.Destination.Sheet(i10, str, str2, stackComponent, zW, size, null);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public void serialize(f encoder, ButtonComponent.Destination.Sheet value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        ButtonComponent.Destination.Sheet.write$Self$purchases_defaultsBc8Release(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // Vf.E
    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
