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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/customercenter/CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey.Option.$serializer", "LVf/E;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option;", "<init>", "()V", "", "LRf/b;", "childSerializers", "()[LRf/b;", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option;)V", "LTf/e;", "getDescriptor", "()LTf/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public final class CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option$$serializer implements E {
    public static final CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option$$serializer INSTANCE;
    private static final /* synthetic */ C2337k0 descriptor;

    static {
        CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option$$serializer customerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option$$serializer = new CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option$$serializer();
        INSTANCE = customerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option$$serializer;
        C2337k0 c2337k0 = new C2337k0("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey.Option", customerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option$$serializer, 3);
        c2337k0.g(DiagnosticsEntry.ID_KEY, false);
        c2337k0.g(b.f34626S, false);
        c2337k0.g("promotional_offer", true);
        descriptor = c2337k0;
    }

    private CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option$$serializer() {
    }

    @Override // Vf.E
    public Rf.b[] childSerializers() {
        Rf.b bVarP = a.p(CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer.INSTANCE);
        x0 x0Var = x0.f20253a;
        return new Rf.b[]{x0Var, x0Var, bVarP};
    }

    @Override // Rf.a
    public CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey.Option deserialize(e decoder) {
        int i10;
        String str;
        String str2;
        CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer promotionalOffer;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        String strL = null;
        if (cVarB.p()) {
            String strL2 = cVarB.l(descriptor2, 0);
            String strL3 = cVarB.l(descriptor2, 1);
            str = strL2;
            promotionalOffer = (CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer) cVarB.B(descriptor2, 2, CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer.INSTANCE, null);
            str2 = strL3;
            i10 = 7;
        } else {
            boolean z10 = true;
            int i11 = 0;
            String strL4 = null;
            CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer promotionalOffer2 = null;
            while (z10) {
                int i12 = cVarB.i(descriptor2);
                if (i12 == -1) {
                    z10 = false;
                } else if (i12 == 0) {
                    strL = cVarB.l(descriptor2, 0);
                    i11 |= 1;
                } else if (i12 == 1) {
                    strL4 = cVarB.l(descriptor2, 1);
                    i11 |= 2;
                } else {
                    if (i12 != 2) {
                        throw new m(i12);
                    }
                    promotionalOffer2 = (CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer) cVarB.B(descriptor2, 2, CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer.INSTANCE, promotionalOffer2);
                    i11 |= 4;
                }
            }
            i10 = i11;
            str = strL;
            str2 = strL4;
            promotionalOffer = promotionalOffer2;
        }
        cVarB.c(descriptor2);
        return new CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey.Option(i10, str, str2, promotionalOffer, (t0) null);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public void serialize(f encoder, CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey.Option value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey.Option.write$Self$purchases_defaultsBc8Release(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // Vf.E
    public Rf.b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
