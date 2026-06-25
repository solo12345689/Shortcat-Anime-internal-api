package com.revenuecat.purchases.common.events;

import Rf.b;
import Rf.m;
import Td.InterfaceC2154e;
import Uf.c;
import Uf.d;
import Uf.e;
import Uf.f;
import Vf.C2337k0;
import Vf.E;
import Vf.J;
import Vf.Q;
import Vf.t0;
import Vf.x0;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.common.events.BackendEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/common/events/BackendEvent.CustomPaywall.$serializer", "LVf/E;", "Lcom/revenuecat/purchases/common/events/BackendEvent$CustomPaywall;", "<init>", "()V", "", "LRf/b;", "childSerializers", "()[LRf/b;", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/common/events/BackendEvent$CustomPaywall;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/common/events/BackendEvent$CustomPaywall;)V", "LTf/e;", "getDescriptor", "()LTf/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public final class BackendEvent$CustomPaywall$$serializer implements E {
    public static final BackendEvent$CustomPaywall$$serializer INSTANCE;
    private static final /* synthetic */ C2337k0 descriptor;

    static {
        BackendEvent$CustomPaywall$$serializer backendEvent$CustomPaywall$$serializer = new BackendEvent$CustomPaywall$$serializer();
        INSTANCE = backendEvent$CustomPaywall$$serializer;
        C2337k0 c2337k0 = new C2337k0("custom_paywall_event", backendEvent$CustomPaywall$$serializer, 8);
        c2337k0.g(DiagnosticsEntry.ID_KEY, false);
        c2337k0.g(DiagnosticsEntry.VERSION_KEY, false);
        c2337k0.g("type", false);
        c2337k0.g("app_user_id", false);
        c2337k0.g(DiagnosticsEntry.APP_SESSION_ID_KEY, true);
        c2337k0.g(DiagnosticsEntry.TIMESTAMP_KEY, false);
        c2337k0.g("paywall_id", true);
        c2337k0.g("offering_id", true);
        descriptor = c2337k0;
    }

    private BackendEvent$CustomPaywall$$serializer() {
    }

    @Override // Vf.E
    public b[] childSerializers() {
        x0 x0Var = x0.f20253a;
        return new b[]{x0Var, J.f20144a, x0Var, x0Var, Sf.a.p(x0Var), Q.f20164a, Sf.a.p(x0Var), Sf.a.p(x0Var)};
    }

    @Override // Rf.a
    public BackendEvent.CustomPaywall deserialize(e decoder) {
        int i10;
        String str;
        String str2;
        int i11;
        String str3;
        String str4;
        String str5;
        String str6;
        long j10;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        if (cVarB.p()) {
            String strL = cVarB.l(descriptor2, 0);
            int iM = cVarB.m(descriptor2, 1);
            String strL2 = cVarB.l(descriptor2, 2);
            String strL3 = cVarB.l(descriptor2, 3);
            x0 x0Var = x0.f20253a;
            String str7 = (String) cVarB.B(descriptor2, 4, x0Var, null);
            long jO = cVarB.o(descriptor2, 5);
            String str8 = (String) cVarB.B(descriptor2, 6, x0Var, null);
            str3 = strL;
            str = (String) cVarB.B(descriptor2, 7, x0Var, null);
            str2 = str8;
            i10 = 255;
            str5 = strL3;
            str6 = str7;
            str4 = strL2;
            i11 = iM;
            j10 = jO;
        } else {
            boolean z10 = true;
            int i12 = 0;
            String str9 = null;
            String strL4 = null;
            String str10 = null;
            long jO2 = 0;
            int iM2 = 0;
            String str11 = null;
            String strL5 = null;
            String strL6 = null;
            while (z10) {
                int i13 = cVarB.i(descriptor2);
                switch (i13) {
                    case -1:
                        z10 = false;
                        break;
                    case 0:
                        i12 |= 1;
                        strL5 = cVarB.l(descriptor2, 0);
                        continue;
                    case 1:
                        i12 |= 2;
                        iM2 = cVarB.m(descriptor2, 1);
                        continue;
                    case 2:
                        strL6 = cVarB.l(descriptor2, 2);
                        i12 |= 4;
                        continue;
                    case 3:
                        strL4 = cVarB.l(descriptor2, 3);
                        i12 |= 8;
                        break;
                    case 4:
                        str10 = (String) cVarB.B(descriptor2, 4, x0.f20253a, str10);
                        i12 |= 16;
                        break;
                    case 5:
                        jO2 = cVarB.o(descriptor2, 5);
                        i12 |= 32;
                        break;
                    case 6:
                        str11 = (String) cVarB.B(descriptor2, 6, x0.f20253a, str11);
                        i12 |= 64;
                        break;
                    case 7:
                        str9 = (String) cVarB.B(descriptor2, 7, x0.f20253a, str9);
                        i12 |= 128;
                        break;
                    default:
                        throw new m(i13);
                }
            }
            i10 = i12;
            str = str9;
            str2 = str11;
            i11 = iM2;
            str3 = strL5;
            str4 = strL6;
            str5 = strL4;
            str6 = str10;
            j10 = jO2;
        }
        cVarB.c(descriptor2);
        return new BackendEvent.CustomPaywall(i10, str3, i11, str4, str5, str6, j10, str2, str, (t0) null);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public void serialize(f encoder, BackendEvent.CustomPaywall value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        BackendEvent.CustomPaywall.write$Self$purchases_defaultsBc8Release(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // Vf.E
    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
