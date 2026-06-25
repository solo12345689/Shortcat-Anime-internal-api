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
import Vf.x0;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.common.events.BackendEvent;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.customercenter.events.CustomerCenterDisplayMode;
import com.revenuecat.purchases.customercenter.events.CustomerCenterEventType;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/common/events/BackendEvent.CustomerCenter.$serializer", "LVf/E;", "Lcom/revenuecat/purchases/common/events/BackendEvent$CustomerCenter;", "<init>", "()V", "", "LRf/b;", "childSerializers", "()[LRf/b;", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/common/events/BackendEvent$CustomerCenter;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/common/events/BackendEvent$CustomerCenter;)V", "LTf/e;", "getDescriptor", "()LTf/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public final class BackendEvent$CustomerCenter$$serializer implements E {
    public static final BackendEvent$CustomerCenter$$serializer INSTANCE;
    private static final /* synthetic */ C2337k0 descriptor;

    static {
        BackendEvent$CustomerCenter$$serializer backendEvent$CustomerCenter$$serializer = new BackendEvent$CustomerCenter$$serializer();
        INSTANCE = backendEvent$CustomerCenter$$serializer;
        C2337k0 c2337k0 = new C2337k0("customer_center", backendEvent$CustomerCenter$$serializer, 12);
        c2337k0.g(DiagnosticsEntry.ID_KEY, false);
        c2337k0.g("revision_id", false);
        c2337k0.g("type", false);
        c2337k0.g("app_user_id", false);
        c2337k0.g(DiagnosticsEntry.APP_SESSION_ID_KEY, false);
        c2337k0.g(DiagnosticsEntry.TIMESTAMP_KEY, false);
        c2337k0.g("dark_mode", false);
        c2337k0.g("locale", false);
        c2337k0.g("display_mode", false);
        c2337k0.g("path", false);
        c2337k0.g("url", false);
        c2337k0.g("survey_option_id", false);
        descriptor = c2337k0;
    }

    private BackendEvent$CustomerCenter$$serializer() {
    }

    @Override // Vf.E
    public b[] childSerializers() {
        b[] bVarArr = BackendEvent.CustomerCenter.$childSerializers;
        x0 x0Var = x0.f20253a;
        return new b[]{x0Var, J.f20144a, bVarArr[2], x0Var, x0Var, Q.f20164a, C2330h.f20193a, x0Var, bVarArr[8], Sf.a.p(bVarArr[9]), Sf.a.p(x0Var), Sf.a.p(x0Var)};
    }

    @Override // Rf.a
    public BackendEvent.CustomerCenter deserialize(e decoder) {
        CustomerCenterEventType customerCenterEventType;
        String str;
        String str2;
        int i10;
        String str3;
        CustomerCenterConfigData.HelpPath.PathType pathType;
        CustomerCenterDisplayMode customerCenterDisplayMode;
        String str4;
        String str5;
        String str6;
        boolean z10;
        int i11;
        long j10;
        int i12;
        int i13;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        b[] bVarArr = BackendEvent.CustomerCenter.$childSerializers;
        int i14 = 10;
        int i15 = 7;
        int i16 = 6;
        String strL = null;
        if (cVarB.p()) {
            String strL2 = cVarB.l(descriptor2, 0);
            int iM = cVarB.m(descriptor2, 1);
            CustomerCenterEventType customerCenterEventType2 = (CustomerCenterEventType) cVarB.e(descriptor2, 2, bVarArr[2], null);
            String strL3 = cVarB.l(descriptor2, 3);
            String strL4 = cVarB.l(descriptor2, 4);
            long jO = cVarB.o(descriptor2, 5);
            boolean zW = cVarB.w(descriptor2, 6);
            String strL5 = cVarB.l(descriptor2, 7);
            CustomerCenterDisplayMode customerCenterDisplayMode2 = (CustomerCenterDisplayMode) cVarB.e(descriptor2, 8, bVarArr[8], null);
            CustomerCenterConfigData.HelpPath.PathType pathType2 = (CustomerCenterConfigData.HelpPath.PathType) cVarB.B(descriptor2, 9, bVarArr[9], null);
            x0 x0Var = x0.f20253a;
            String str7 = (String) cVarB.B(descriptor2, 10, x0Var, null);
            pathType = pathType2;
            str = strL2;
            str2 = (String) cVarB.B(descriptor2, 11, x0Var, null);
            str3 = str7;
            str6 = strL5;
            z10 = zW;
            customerCenterDisplayMode = customerCenterDisplayMode2;
            str4 = strL3;
            str5 = strL4;
            i10 = 4095;
            customerCenterEventType = customerCenterEventType2;
            i11 = iM;
            j10 = jO;
        } else {
            CustomerCenterEventType customerCenterEventType3 = null;
            String str8 = null;
            String strL6 = null;
            boolean z11 = true;
            int i17 = 0;
            boolean zW2 = false;
            int iM2 = 0;
            long jO2 = 0;
            String str9 = null;
            CustomerCenterConfigData.HelpPath.PathType pathType3 = null;
            CustomerCenterDisplayMode customerCenterDisplayMode3 = null;
            String strL7 = null;
            String strL8 = null;
            while (z11) {
                int i18 = cVarB.i(descriptor2);
                switch (i18) {
                    case -1:
                        z11 = false;
                        break;
                    case 0:
                        i17 |= 1;
                        i16 = i16;
                        strL = cVarB.l(descriptor2, 0);
                        i14 = 10;
                        i15 = 7;
                        break;
                    case 1:
                        i12 = i16;
                        iM2 = cVarB.m(descriptor2, 1);
                        i17 |= 2;
                        i16 = i12;
                        i14 = 10;
                        i15 = 7;
                        break;
                    case 2:
                        i12 = i16;
                        customerCenterEventType3 = (CustomerCenterEventType) cVarB.e(descriptor2, 2, bVarArr[2], customerCenterEventType3);
                        i17 |= 4;
                        i16 = i12;
                        i14 = 10;
                        i15 = 7;
                        break;
                    case 3:
                        i13 = i16;
                        strL7 = cVarB.l(descriptor2, 3);
                        i17 |= 8;
                        i16 = i13;
                        i14 = 10;
                        break;
                    case 4:
                        i13 = i16;
                        strL8 = cVarB.l(descriptor2, 4);
                        i17 |= 16;
                        i16 = i13;
                        i14 = 10;
                        break;
                    case 5:
                        jO2 = cVarB.o(descriptor2, 5);
                        i17 |= 32;
                        i16 = i16;
                        i14 = 10;
                        break;
                    case 6:
                        int i19 = i16;
                        zW2 = cVarB.w(descriptor2, i19);
                        i17 |= 64;
                        i16 = i19;
                        break;
                    case 7:
                        strL6 = cVarB.l(descriptor2, i15);
                        i17 |= 128;
                        i16 = 6;
                        break;
                    case 8:
                        customerCenterDisplayMode3 = (CustomerCenterDisplayMode) cVarB.e(descriptor2, 8, bVarArr[8], customerCenterDisplayMode3);
                        i17 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        i16 = 6;
                        break;
                    case 9:
                        pathType3 = (CustomerCenterConfigData.HelpPath.PathType) cVarB.B(descriptor2, 9, bVarArr[9], pathType3);
                        i17 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        i16 = 6;
                        break;
                    case 10:
                        str9 = (String) cVarB.B(descriptor2, i14, x0.f20253a, str9);
                        i17 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                        i16 = 6;
                        break;
                    case 11:
                        str8 = (String) cVarB.B(descriptor2, 11, x0.f20253a, str8);
                        i17 |= 2048;
                        i16 = 6;
                        break;
                    default:
                        throw new m(i18);
                }
            }
            customerCenterEventType = customerCenterEventType3;
            str = strL;
            str2 = str8;
            i10 = i17;
            str3 = str9;
            pathType = pathType3;
            customerCenterDisplayMode = customerCenterDisplayMode3;
            str4 = strL7;
            str5 = strL8;
            str6 = strL6;
            z10 = zW2;
            i11 = iM2;
            j10 = jO2;
        }
        cVarB.c(descriptor2);
        return new BackendEvent.CustomerCenter(i10, str, i11, customerCenterEventType, str4, str5, j10, z10, str6, customerCenterDisplayMode, pathType, str3, str2, null);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public void serialize(f encoder, BackendEvent.CustomerCenter value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        BackendEvent.CustomerCenter.write$Self$purchases_defaultsBc8Release(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // Vf.E
    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
