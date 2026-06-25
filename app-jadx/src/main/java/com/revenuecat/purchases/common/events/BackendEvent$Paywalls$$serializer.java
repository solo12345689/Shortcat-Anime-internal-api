package com.revenuecat.purchases.common.events;

import Rf.b;
import Rf.m;
import Td.InterfaceC2154e;
import Uf.c;
import Uf.d;
import Uf.e;
import Uf.f;
import Vf.C2330h;
import Vf.C2337k0;
import Vf.E;
import Vf.J;
import Vf.Q;
import Vf.t0;
import Vf.x0;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.common.events.BackendEvent;
import com.revenuecat.purchases.common.verification.SigningManager;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/common/events/BackendEvent.Paywalls.$serializer", "LVf/E;", "Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;", "<init>", "()V", "", "LRf/b;", "childSerializers", "()[LRf/b;", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;)V", "LTf/e;", "getDescriptor", "()LTf/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public final class BackendEvent$Paywalls$$serializer implements E {
    public static final BackendEvent$Paywalls$$serializer INSTANCE;
    private static final /* synthetic */ C2337k0 descriptor;

    static {
        BackendEvent$Paywalls$$serializer backendEvent$Paywalls$$serializer = new BackendEvent$Paywalls$$serializer();
        INSTANCE = backendEvent$Paywalls$$serializer;
        C2337k0 c2337k0 = new C2337k0("paywalls", backendEvent$Paywalls$$serializer, 18);
        c2337k0.g(DiagnosticsEntry.ID_KEY, false);
        c2337k0.g(DiagnosticsEntry.VERSION_KEY, false);
        c2337k0.g("type", false);
        c2337k0.g("app_user_id", false);
        c2337k0.g("session_id", false);
        c2337k0.g("offering_id", false);
        c2337k0.g("paywall_id", false);
        c2337k0.g("paywall_revision", false);
        c2337k0.g(DiagnosticsEntry.TIMESTAMP_KEY, false);
        c2337k0.g("display_mode", false);
        c2337k0.g("dark_mode", false);
        c2337k0.g("locale", false);
        c2337k0.g("exit_offer_type", true);
        c2337k0.g("exit_offering_id", true);
        c2337k0.g("package_id", true);
        c2337k0.g(DiagnosticsTracker.PRODUCT_ID_KEY, true);
        c2337k0.g(DiagnosticsTracker.ERROR_CODE_KEY, true);
        c2337k0.g(DiagnosticsTracker.ERROR_MESSAGE_KEY, true);
        descriptor = c2337k0;
    }

    private BackendEvent$Paywalls$$serializer() {
    }

    @Override // Vf.E
    public b[] childSerializers() {
        x0 x0Var = x0.f20253a;
        J j10 = J.f20144a;
        return new b[]{x0Var, j10, x0Var, x0Var, x0Var, x0Var, Sf.a.p(x0Var), j10, Q.f20164a, x0Var, C2330h.f20193a, x0Var, Sf.a.p(x0Var), Sf.a.p(x0Var), Sf.a.p(x0Var), Sf.a.p(x0Var), Sf.a.p(j10), Sf.a.p(x0Var)};
    }

    @Override // Rf.a
    public BackendEvent.Paywalls deserialize(e decoder) {
        int i10;
        int i11;
        String str;
        String str2;
        String str3;
        String str4;
        Integer num;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        boolean z10;
        int i12;
        long j10;
        int i13;
        int i14;
        int i15;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        int i16 = 11;
        int i17 = 8;
        if (cVarB.p()) {
            String strL = cVarB.l(descriptor2, 0);
            int iM = cVarB.m(descriptor2, 1);
            String strL2 = cVarB.l(descriptor2, 2);
            String strL3 = cVarB.l(descriptor2, 3);
            String strL4 = cVarB.l(descriptor2, 4);
            String strL5 = cVarB.l(descriptor2, 5);
            x0 x0Var = x0.f20253a;
            String str14 = (String) cVarB.B(descriptor2, 6, x0Var, null);
            int iM2 = cVarB.m(descriptor2, 7);
            long jO = cVarB.o(descriptor2, 8);
            String strL6 = cVarB.l(descriptor2, 9);
            boolean zW = cVarB.w(descriptor2, 10);
            String strL7 = cVarB.l(descriptor2, 11);
            String str15 = (String) cVarB.B(descriptor2, 12, x0Var, null);
            String str16 = (String) cVarB.B(descriptor2, 13, x0Var, null);
            String str17 = (String) cVarB.B(descriptor2, 14, x0Var, null);
            String str18 = (String) cVarB.B(descriptor2, 15, x0Var, null);
            i10 = 262143;
            num = (Integer) cVarB.B(descriptor2, 16, J.f20144a, null);
            str4 = (String) cVarB.B(descriptor2, 17, x0Var, null);
            str8 = strL2;
            i11 = iM;
            str9 = strL3;
            str13 = strL7;
            z10 = zW;
            str2 = str15;
            i12 = iM2;
            str3 = str14;
            str11 = strL5;
            str10 = strL4;
            str6 = str18;
            str5 = str17;
            str = str16;
            str7 = strL;
            j10 = jO;
            str12 = strL6;
        } else {
            boolean z11 = true;
            int iM3 = 0;
            boolean zW2 = false;
            int iM4 = 0;
            String str19 = null;
            String str20 = null;
            String str21 = null;
            Integer num2 = null;
            String str22 = null;
            String str23 = null;
            String strL8 = null;
            String strL9 = null;
            String strL10 = null;
            String strL11 = null;
            String strL12 = null;
            long jO2 = 0;
            i10 = 0;
            String str24 = null;
            String strL13 = null;
            String strL14 = null;
            while (z11) {
                int i18 = cVarB.i(descriptor2);
                switch (i18) {
                    case -1:
                        i13 = i17;
                        z11 = false;
                        i17 = i13;
                        break;
                    case 0:
                        i14 = i17;
                        strL13 = cVarB.l(descriptor2, 0);
                        i10 |= 1;
                        i17 = i14;
                        i16 = 11;
                        break;
                    case 1:
                        i10 |= 2;
                        i17 = i17;
                        iM3 = cVarB.m(descriptor2, 1);
                        i16 = 11;
                        break;
                    case 2:
                        i14 = i17;
                        strL14 = cVarB.l(descriptor2, 2);
                        i10 |= 4;
                        i17 = i14;
                        i16 = 11;
                        break;
                    case 3:
                        i14 = i17;
                        strL8 = cVarB.l(descriptor2, 3);
                        i10 |= 8;
                        i17 = i14;
                        i16 = 11;
                        break;
                    case 4:
                        i14 = i17;
                        strL9 = cVarB.l(descriptor2, 4);
                        i10 |= 16;
                        i17 = i14;
                        i16 = 11;
                        break;
                    case 5:
                        i14 = i17;
                        strL10 = cVarB.l(descriptor2, 5);
                        i10 |= 32;
                        i17 = i14;
                        i16 = 11;
                        break;
                    case 6:
                        i14 = i17;
                        str24 = (String) cVarB.B(descriptor2, 6, x0.f20253a, str24);
                        i10 |= 64;
                        i17 = i14;
                        i16 = 11;
                        break;
                    case 7:
                        iM4 = cVarB.m(descriptor2, 7);
                        i10 |= 128;
                        i17 = i17;
                        break;
                    case 8:
                        i13 = i17;
                        jO2 = cVarB.o(descriptor2, i13);
                        i10 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        i17 = i13;
                        break;
                    case 9:
                        strL11 = cVarB.l(descriptor2, 9);
                        i10 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        i17 = 8;
                        break;
                    case 10:
                        zW2 = cVarB.w(descriptor2, 10);
                        i10 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                        i17 = 8;
                        break;
                    case 11:
                        strL12 = cVarB.l(descriptor2, i16);
                        i10 |= 2048;
                        i17 = 8;
                        break;
                    case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                        str20 = (String) cVarB.B(descriptor2, 12, x0.f20253a, str20);
                        i10 |= 4096;
                        i17 = 8;
                        break;
                    case 13:
                        str19 = (String) cVarB.B(descriptor2, 13, x0.f20253a, str19);
                        i10 |= 8192;
                        i17 = 8;
                        break;
                    case 14:
                        str22 = (String) cVarB.B(descriptor2, 14, x0.f20253a, str22);
                        i10 |= 16384;
                        i17 = 8;
                        break;
                    case 15:
                        str23 = (String) cVarB.B(descriptor2, 15, x0.f20253a, str23);
                        i15 = 32768;
                        i10 |= i15;
                        i17 = 8;
                        break;
                    case 16:
                        num2 = (Integer) cVarB.B(descriptor2, 16, J.f20144a, num2);
                        i15 = 65536;
                        i10 |= i15;
                        i17 = 8;
                        break;
                    case 17:
                        str21 = (String) cVarB.B(descriptor2, 17, x0.f20253a, str21);
                        i15 = 131072;
                        i10 |= i15;
                        i17 = 8;
                        break;
                    default:
                        throw new m(i18);
                }
            }
            i11 = iM3;
            str = str19;
            str2 = str20;
            str3 = str24;
            str4 = str21;
            num = num2;
            str5 = str22;
            str6 = str23;
            str7 = strL13;
            str8 = strL14;
            str9 = strL8;
            str10 = strL9;
            str11 = strL10;
            str12 = strL11;
            str13 = strL12;
            z10 = zW2;
            i12 = iM4;
            j10 = jO2;
        }
        int i19 = i10;
        cVarB.c(descriptor2);
        return new BackendEvent.Paywalls(i19, str7, i11, str8, str9, str10, str11, str3, i12, j10, str12, z10, str13, str2, str, str5, str6, num, str4, (t0) null);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public void serialize(f encoder, BackendEvent.Paywalls value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        BackendEvent.Paywalls.write$Self$purchases_defaultsBc8Release(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // Vf.E
    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
