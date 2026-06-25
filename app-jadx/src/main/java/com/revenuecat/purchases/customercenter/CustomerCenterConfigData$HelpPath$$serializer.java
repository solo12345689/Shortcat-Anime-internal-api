package com.revenuecat.purchases.customercenter;

import Rf.m;
import Sf.a;
import Td.InterfaceC2154e;
import Uf.c;
import Uf.d;
import Uf.e;
import Uf.f;
import Vf.C2337k0;
import Vf.E;
import Vf.t0;
import Vf.x0;
import com.amazon.a.a.o.b;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/customercenter/CustomerCenterConfigData.HelpPath.$serializer", "LVf/E;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;", "<init>", "()V", "", "LRf/b;", "childSerializers", "()[LRf/b;", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;)V", "LTf/e;", "getDescriptor", "()LTf/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public final class CustomerCenterConfigData$HelpPath$$serializer implements E {
    public static final CustomerCenterConfigData$HelpPath$$serializer INSTANCE;
    private static final /* synthetic */ C2337k0 descriptor;

    static {
        CustomerCenterConfigData$HelpPath$$serializer customerCenterConfigData$HelpPath$$serializer = new CustomerCenterConfigData$HelpPath$$serializer();
        INSTANCE = customerCenterConfigData$HelpPath$$serializer;
        C2337k0 c2337k0 = new C2337k0("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.HelpPath", customerCenterConfigData$HelpPath$$serializer, 8);
        c2337k0.g(DiagnosticsEntry.ID_KEY, false);
        c2337k0.g(b.f34626S, false);
        c2337k0.g("type", false);
        c2337k0.g("promotional_offer", true);
        c2337k0.g("feedback_survey", true);
        c2337k0.g("url", true);
        c2337k0.g("open_method", true);
        c2337k0.g("action_identifier", true);
        descriptor = c2337k0;
    }

    private CustomerCenterConfigData$HelpPath$$serializer() {
    }

    @Override // Vf.E
    public Rf.b[] childSerializers() {
        Rf.b[] bVarArr = CustomerCenterConfigData.HelpPath.$childSerializers;
        x0 x0Var = x0.f20253a;
        return new Rf.b[]{x0Var, x0Var, bVarArr[2], a.p(CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer.INSTANCE), a.p(CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$$serializer.INSTANCE), a.p(x0Var), a.p(bVarArr[6]), a.p(x0Var)};
    }

    @Override // Rf.a
    public CustomerCenterConfigData.HelpPath deserialize(e decoder) {
        int i10;
        String str;
        CustomerCenterConfigData.HelpPath.OpenMethod openMethod;
        String str2;
        CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey feedbackSurvey;
        String str3;
        String str4;
        CustomerCenterConfigData.HelpPath.PathType pathType;
        CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer promotionalOffer;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        Rf.b[] bVarArr = CustomerCenterConfigData.HelpPath.$childSerializers;
        int i11 = 7;
        String strL = null;
        if (cVarB.p()) {
            String strL2 = cVarB.l(descriptor2, 0);
            String strL3 = cVarB.l(descriptor2, 1);
            CustomerCenterConfigData.HelpPath.PathType pathType2 = (CustomerCenterConfigData.HelpPath.PathType) cVarB.e(descriptor2, 2, bVarArr[2], null);
            CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer promotionalOffer2 = (CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer) cVarB.B(descriptor2, 3, CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer.INSTANCE, null);
            CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey feedbackSurvey2 = (CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey) cVarB.B(descriptor2, 4, CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$$serializer.INSTANCE, null);
            x0 x0Var = x0.f20253a;
            String str5 = (String) cVarB.B(descriptor2, 5, x0Var, null);
            openMethod = (CustomerCenterConfigData.HelpPath.OpenMethod) cVarB.B(descriptor2, 6, bVarArr[6], null);
            str3 = strL2;
            str = (String) cVarB.B(descriptor2, 7, x0Var, null);
            str2 = str5;
            promotionalOffer = promotionalOffer2;
            feedbackSurvey = feedbackSurvey2;
            i10 = 255;
            pathType = pathType2;
            str4 = strL3;
        } else {
            boolean z10 = true;
            int i12 = 0;
            String str6 = null;
            CustomerCenterConfigData.HelpPath.OpenMethod openMethod2 = null;
            String str7 = null;
            CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey feedbackSurvey3 = null;
            String strL4 = null;
            CustomerCenterConfigData.HelpPath.PathType pathType3 = null;
            CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer promotionalOffer3 = null;
            while (z10) {
                int i13 = cVarB.i(descriptor2);
                switch (i13) {
                    case -1:
                        z10 = false;
                        break;
                    case 0:
                        i12 |= 1;
                        strL = cVarB.l(descriptor2, 0);
                        i11 = 7;
                        break;
                    case 1:
                        strL4 = cVarB.l(descriptor2, 1);
                        i12 |= 2;
                        i11 = 7;
                        break;
                    case 2:
                        pathType3 = (CustomerCenterConfigData.HelpPath.PathType) cVarB.e(descriptor2, 2, bVarArr[2], pathType3);
                        i12 |= 4;
                        i11 = 7;
                        break;
                    case 3:
                        promotionalOffer3 = (CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer) cVarB.B(descriptor2, 3, CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer.INSTANCE, promotionalOffer3);
                        i12 |= 8;
                        i11 = 7;
                        break;
                    case 4:
                        feedbackSurvey3 = (CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey) cVarB.B(descriptor2, 4, CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$$serializer.INSTANCE, feedbackSurvey3);
                        i12 |= 16;
                        i11 = 7;
                        break;
                    case 5:
                        str7 = (String) cVarB.B(descriptor2, 5, x0.f20253a, str7);
                        i12 |= 32;
                        break;
                    case 6:
                        openMethod2 = (CustomerCenterConfigData.HelpPath.OpenMethod) cVarB.B(descriptor2, 6, bVarArr[6], openMethod2);
                        i12 |= 64;
                        break;
                    case 7:
                        str6 = (String) cVarB.B(descriptor2, i11, x0.f20253a, str6);
                        i12 |= 128;
                        break;
                    default:
                        throw new m(i13);
                }
            }
            i10 = i12;
            str = str6;
            openMethod = openMethod2;
            str2 = str7;
            feedbackSurvey = feedbackSurvey3;
            str3 = strL;
            str4 = strL4;
            pathType = pathType3;
            promotionalOffer = promotionalOffer3;
        }
        cVarB.c(descriptor2);
        return new CustomerCenterConfigData.HelpPath(i10, str3, str4, pathType, promotionalOffer, feedbackSurvey, str2, openMethod, str, (t0) null);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public void serialize(f encoder, CustomerCenterConfigData.HelpPath value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        CustomerCenterConfigData.HelpPath.write$Self$purchases_defaultsBc8Release(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // Vf.E
    public Rf.b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
