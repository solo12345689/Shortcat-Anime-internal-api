.class final Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/FeedbackSurveyViewKt$FeedbackSurveyView$1$1$1;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/FeedbackSurveyViewKt;->FeedbackSurveyView(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/FeedbackSurveyData;LY/m;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/u;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option;",
        "option",
        "LTd/L;",
        "invoke",
        "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic $data:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/FeedbackSurveyData;

.field final synthetic $loadingOption$delegate:LY/C0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY/C0;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/FeedbackSurveyData;LY/C0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/FeedbackSurveyData;",
            "LY/C0;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/FeedbackSurveyViewKt$FeedbackSurveyView$1$1$1;->$data:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/FeedbackSurveyData;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/FeedbackSurveyViewKt$FeedbackSurveyView$1$1$1;->$loadingOption$delegate:LY/C0;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option;

    invoke-virtual {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/FeedbackSurveyViewKt$FeedbackSurveyView$1$1$1;->invoke(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option;)V
    .locals 2

    const-string v0, "option"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/FeedbackSurveyViewKt$FeedbackSurveyView$1$1$1;->$loadingOption$delegate:LY/C0;

    invoke-virtual {p1}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/FeedbackSurveyViewKt;->access$FeedbackSurveyView$lambda$2(LY/C0;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/FeedbackSurveyViewKt$FeedbackSurveyView$1$1$1;->$data:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/FeedbackSurveyData;

    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/FeedbackSurveyData;->getOnAnswerSubmitted()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/FeedbackSurveyViewKt$FeedbackSurveyView$1$1$1;->$loadingOption$delegate:LY/C0;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/FeedbackSurveyViewKt;->access$FeedbackSurveyView$lambda$2(LY/C0;Ljava/lang/String;)V

    return-void
.end method
