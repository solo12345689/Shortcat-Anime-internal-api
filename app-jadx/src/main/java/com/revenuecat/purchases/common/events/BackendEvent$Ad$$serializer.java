package com.revenuecat.purchases.common.events;

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
import com.amazon.a.a.o.b;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.common.events.BackendEvent;
import com.revenuecat.purchases.common.verification.SigningManager;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/common/events/BackendEvent.Ad.$serializer", "LVf/E;", "Lcom/revenuecat/purchases/common/events/BackendEvent$Ad;", "<init>", "()V", "", "LRf/b;", "childSerializers", "()[LRf/b;", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/common/events/BackendEvent$Ad;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/common/events/BackendEvent$Ad;)V", "LTf/e;", "getDescriptor", "()LTf/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public final class BackendEvent$Ad$$serializer implements E {
    public static final BackendEvent$Ad$$serializer INSTANCE;
    private static final /* synthetic */ C2337k0 descriptor;

    static {
        BackendEvent$Ad$$serializer backendEvent$Ad$$serializer = new BackendEvent$Ad$$serializer();
        INSTANCE = backendEvent$Ad$$serializer;
        C2337k0 c2337k0 = new C2337k0("ad", backendEvent$Ad$$serializer, 16);
        c2337k0.g(DiagnosticsEntry.ID_KEY, false);
        c2337k0.g(DiagnosticsEntry.VERSION_KEY, false);
        c2337k0.g("type", false);
        c2337k0.g("timestamp_ms", false);
        c2337k0.g("network_name", true);
        c2337k0.g("mediator_name", false);
        c2337k0.g("ad_format", true);
        c2337k0.g("placement", false);
        c2337k0.g("ad_unit_id", false);
        c2337k0.g("impression_id", false);
        c2337k0.g("app_user_id", false);
        c2337k0.g(DiagnosticsEntry.APP_SESSION_ID_KEY, false);
        c2337k0.g("revenue_micros", true);
        c2337k0.g(b.f34634a, true);
        c2337k0.g("precision", true);
        c2337k0.g("mediator_error_code", true);
        descriptor = c2337k0;
    }

    private BackendEvent$Ad$$serializer() {
    }

    @Override // Vf.E
    public Rf.b[] childSerializers() {
        x0 x0Var = x0.f20253a;
        J j10 = J.f20144a;
        Q q10 = Q.f20164a;
        return new Rf.b[]{x0Var, j10, x0Var, q10, Sf.a.p(x0Var), x0Var, Sf.a.p(x0Var), Sf.a.p(x0Var), x0Var, Sf.a.p(x0Var), x0Var, x0Var, Sf.a.p(q10), Sf.a.p(x0Var), Sf.a.p(x0Var), Sf.a.p(j10)};
    }

    @Override // Rf.a
    public BackendEvent.Ad deserialize(e decoder) {
        int i10;
        String str;
        String str2;
        String str3;
        int i11;
        Integer num;
        String str4;
        String str5;
        String str6;
        Long l10;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        long j10;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        int i12 = 11;
        int i13 = 10;
        char c10 = '\t';
        if (cVarB.p()) {
            String strL = cVarB.l(descriptor2, 0);
            int iM = cVarB.m(descriptor2, 1);
            String strL2 = cVarB.l(descriptor2, 2);
            long jO = cVarB.o(descriptor2, 3);
            x0 x0Var = x0.f20253a;
            String str13 = (String) cVarB.B(descriptor2, 4, x0Var, null);
            String strL3 = cVarB.l(descriptor2, 5);
            String str14 = (String) cVarB.B(descriptor2, 6, x0Var, null);
            String str15 = (String) cVarB.B(descriptor2, 7, x0Var, null);
            String strL4 = cVarB.l(descriptor2, 8);
            String str16 = (String) cVarB.B(descriptor2, 9, x0Var, null);
            String strL5 = cVarB.l(descriptor2, 10);
            String strL6 = cVarB.l(descriptor2, 11);
            Long l11 = (Long) cVarB.B(descriptor2, 12, Q.f20164a, null);
            String str17 = (String) cVarB.B(descriptor2, 13, x0Var, null);
            String str18 = (String) cVarB.B(descriptor2, 14, x0Var, null);
            num = (Integer) cVarB.B(descriptor2, 15, J.f20144a, null);
            str8 = strL2;
            i10 = iM;
            i11 = 65535;
            str12 = strL6;
            str11 = strL5;
            str6 = str16;
            str = str15;
            str2 = str14;
            str9 = strL3;
            str3 = str13;
            str10 = strL4;
            str5 = str17;
            str4 = str18;
            l10 = l11;
            j10 = jO;
            str7 = strL;
        } else {
            boolean z10 = true;
            int iM2 = 0;
            String str19 = null;
            String str20 = null;
            Integer num2 = null;
            String str21 = null;
            String str22 = null;
            String str23 = null;
            Long l12 = null;
            String strL7 = null;
            String strL8 = null;
            String strL9 = null;
            String strL10 = null;
            long jO2 = 0;
            int i14 = 0;
            String str24 = null;
            String strL11 = null;
            String strL12 = null;
            while (z10) {
                int i15 = cVarB.i(descriptor2);
                switch (i15) {
                    case -1:
                        z10 = false;
                        i12 = 11;
                        c10 = '\t';
                        break;
                    case 0:
                        strL11 = cVarB.l(descriptor2, 0);
                        i14 |= 1;
                        i12 = 11;
                        i13 = 10;
                        c10 = '\t';
                        break;
                    case 1:
                        i14 |= 2;
                        iM2 = cVarB.m(descriptor2, 1);
                        i12 = 11;
                        i13 = 10;
                        c10 = '\t';
                        break;
                    case 2:
                        strL12 = cVarB.l(descriptor2, 2);
                        i14 |= 4;
                        i12 = 11;
                        i13 = 10;
                        c10 = '\t';
                        break;
                    case 3:
                        jO2 = cVarB.o(descriptor2, 3);
                        i14 |= 8;
                        i12 = 11;
                        i13 = 10;
                        c10 = '\t';
                        break;
                    case 4:
                        str24 = (String) cVarB.B(descriptor2, 4, x0.f20253a, str24);
                        i14 |= 16;
                        i12 = 11;
                        i13 = 10;
                        c10 = '\t';
                        break;
                    case 5:
                        strL7 = cVarB.l(descriptor2, 5);
                        i14 |= 32;
                        i12 = 11;
                        i13 = 10;
                        c10 = '\t';
                        break;
                    case 6:
                        str20 = (String) cVarB.B(descriptor2, 6, x0.f20253a, str20);
                        i14 |= 64;
                        i12 = 11;
                        i13 = 10;
                        c10 = '\t';
                        break;
                    case 7:
                        str19 = (String) cVarB.B(descriptor2, 7, x0.f20253a, str19);
                        i14 |= 128;
                        i12 = 11;
                        i13 = 10;
                        c10 = '\t';
                        break;
                    case 8:
                        strL8 = cVarB.l(descriptor2, 8);
                        i14 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        c10 = c10;
                        i12 = 11;
                        break;
                    case 9:
                        str23 = (String) cVarB.B(descriptor2, 9, x0.f20253a, str23);
                        i14 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        c10 = '\t';
                        i12 = 11;
                        break;
                    case 10:
                        strL9 = cVarB.l(descriptor2, i13);
                        i14 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                        c10 = '\t';
                        break;
                    case 11:
                        strL10 = cVarB.l(descriptor2, i12);
                        i14 |= 2048;
                        c10 = '\t';
                        break;
                    case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                        l12 = (Long) cVarB.B(descriptor2, 12, Q.f20164a, l12);
                        i14 |= 4096;
                        c10 = '\t';
                        break;
                    case 13:
                        str22 = (String) cVarB.B(descriptor2, 13, x0.f20253a, str22);
                        i14 |= 8192;
                        c10 = '\t';
                        break;
                    case 14:
                        str21 = (String) cVarB.B(descriptor2, 14, x0.f20253a, str21);
                        i14 |= 16384;
                        c10 = '\t';
                        break;
                    case 15:
                        num2 = (Integer) cVarB.B(descriptor2, 15, J.f20144a, num2);
                        i14 |= 32768;
                        c10 = '\t';
                        break;
                    default:
                        throw new m(i15);
                }
            }
            i10 = iM2;
            str = str19;
            str2 = str20;
            str3 = str24;
            i11 = i14;
            num = num2;
            str4 = str21;
            str5 = str22;
            str6 = str23;
            l10 = l12;
            str7 = strL11;
            str8 = strL12;
            str9 = strL7;
            str10 = strL8;
            str11 = strL9;
            str12 = strL10;
            j10 = jO2;
        }
        cVarB.c(descriptor2);
        return new BackendEvent.Ad(i11, str7, i10, str8, j10, str3, str9, str2, str, str10, str6, str11, str12, l10, str5, str4, num, (t0) null);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public void serialize(f encoder, BackendEvent.Ad value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        BackendEvent.Ad.write$Self$purchases_defaultsBc8Release(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // Vf.E
    public Rf.b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
