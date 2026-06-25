package com.revenuecat.purchases.ui.revenuecatui.customercenter.data;

import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ2\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR%\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\r¨\u0006\u001e"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/FeedbackSurveyData;", "", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey;", "feedbackSurvey", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option;", "LTd/L;", "onAnswerSubmitted", "<init>", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey;Lkotlin/jvm/functions/Function1;)V", "component1", "()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey;", "component2", "()Lkotlin/jvm/functions/Function1;", "copy", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey;Lkotlin/jvm/functions/Function1;)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/FeedbackSurveyData;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey;", "getFeedbackSurvey", "Lkotlin/jvm/functions/Function1;", "getOnAnswerSubmitted", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class FeedbackSurveyData {
    public static final int $stable = 8;
    private final CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey feedbackSurvey;
    private final Function1 onAnswerSubmitted;

    public FeedbackSurveyData(CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey feedbackSurvey, Function1 onAnswerSubmitted) {
        AbstractC5504s.h(feedbackSurvey, "feedbackSurvey");
        AbstractC5504s.h(onAnswerSubmitted, "onAnswerSubmitted");
        this.feedbackSurvey = feedbackSurvey;
        this.onAnswerSubmitted = onAnswerSubmitted;
    }

    public static /* synthetic */ FeedbackSurveyData copy$default(FeedbackSurveyData feedbackSurveyData, CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey feedbackSurvey, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            feedbackSurvey = feedbackSurveyData.feedbackSurvey;
        }
        if ((i10 & 2) != 0) {
            function1 = feedbackSurveyData.onAnswerSubmitted;
        }
        return feedbackSurveyData.copy(feedbackSurvey, function1);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey getFeedbackSurvey() {
        return this.feedbackSurvey;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Function1 getOnAnswerSubmitted() {
        return this.onAnswerSubmitted;
    }

    public final FeedbackSurveyData copy(CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey feedbackSurvey, Function1 onAnswerSubmitted) {
        AbstractC5504s.h(feedbackSurvey, "feedbackSurvey");
        AbstractC5504s.h(onAnswerSubmitted, "onAnswerSubmitted");
        return new FeedbackSurveyData(feedbackSurvey, onAnswerSubmitted);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeedbackSurveyData)) {
            return false;
        }
        FeedbackSurveyData feedbackSurveyData = (FeedbackSurveyData) other;
        return AbstractC5504s.c(this.feedbackSurvey, feedbackSurveyData.feedbackSurvey) && AbstractC5504s.c(this.onAnswerSubmitted, feedbackSurveyData.onAnswerSubmitted);
    }

    public final /* synthetic */ CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey getFeedbackSurvey() {
        return this.feedbackSurvey;
    }

    public final /* synthetic */ Function1 getOnAnswerSubmitted() {
        return this.onAnswerSubmitted;
    }

    public int hashCode() {
        return (this.feedbackSurvey.hashCode() * 31) + this.onAnswerSubmitted.hashCode();
    }

    public String toString() {
        return "FeedbackSurveyData(feedbackSurvey=" + this.feedbackSurvey + ", onAnswerSubmitted=" + this.onAnswerSubmitted + ')';
    }
}
