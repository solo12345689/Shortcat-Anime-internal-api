.class public final Lcom/revenuecat/purchases/react/ui/CustomerCenterViewManager$createCustomerCenterListener$1;
.super Lcom/revenuecat/purchases/hybridcommon/ui/CustomerCenterListenerWrapper;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/react/ui/CustomerCenterViewManager;->createCustomerCenterListener(Lcom/facebook/react/uimanager/b0;Lcom/revenuecat/purchases/react/ui/views/WrappedCustomerCenterView;)Lcom/revenuecat/purchases/hybridcommon/ui/CustomerCenterListenerWrapper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0008\u0017*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J%\u0010\t\u001a\u00020\u00022\u0014\u0010\u0008\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ%\u0010\u000c\u001a\u00020\u00022\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005H\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\nJ\u000f\u0010\r\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u0004J\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00062\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0006H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J+\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00062\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0017J!\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00062\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u0014JC\u0010\u001c\u001a\u00020\u00022\u0014\u0010\u0008\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00052\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00052\u0006\u0010\u001b\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "com/revenuecat/purchases/react/ui/CustomerCenterViewManager$createCustomerCenterListener$1",
        "Lcom/revenuecat/purchases/hybridcommon/ui/CustomerCenterListenerWrapper;",
        "LTd/L;",
        "onRestoreStartedWrapper",
        "()V",
        "",
        "",
        "",
        "customerInfo",
        "onRestoreCompletedWrapper",
        "(Ljava/util/Map;)V",
        "error",
        "onRestoreFailedWrapper",
        "onShowingManageSubscriptionsWrapper",
        "feedbackSurveyOptionId",
        "onFeedbackSurveyCompletedWrapper",
        "(Ljava/lang/String;)V",
        "action",
        "url",
        "onManagementOptionSelectedWrapper",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "customAction",
        "purchaseIdentifier",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "actionId",
        "onCustomActionSelectedWrapper",
        "transaction",
        "offerId",
        "onPromotionalOfferSucceededWrapper",
        "(Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;)V",
        "react-native-purchases-ui_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $themedReactContext:Lcom/facebook/react/uimanager/b0;

.field final synthetic $view:Lcom/revenuecat/purchases/react/ui/views/WrappedCustomerCenterView;

.field final synthetic this$0:Lcom/revenuecat/purchases/react/ui/CustomerCenterViewManager;


# direct methods
.method constructor <init>(Lcom/revenuecat/purchases/react/ui/CustomerCenterViewManager;Lcom/facebook/react/uimanager/b0;Lcom/revenuecat/purchases/react/ui/views/WrappedCustomerCenterView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/react/ui/CustomerCenterViewManager$createCustomerCenterListener$1;->this$0:Lcom/revenuecat/purchases/react/ui/CustomerCenterViewManager;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/revenuecat/purchases/react/ui/CustomerCenterViewManager$createCustomerCenterListener$1;->$themedReactContext:Lcom/facebook/react/uimanager/b0;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/revenuecat/purchases/react/ui/CustomerCenterViewManager$createCustomerCenterListener$1;->$view:Lcom/revenuecat/purchases/react/ui/views/WrappedCustomerCenterView;

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/revenuecat/purchases/hybridcommon/ui/CustomerCenterListenerWrapper;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public onCustomActionSelectedWrapper(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    const-string v0, "actionId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/revenuecat/purchases/react/ui/CustomerCenterViewManager$createCustomerCenterListener$1;->this$0:Lcom/revenuecat/purchases/react/ui/CustomerCenterViewManager;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/revenuecat/purchases/react/ui/CustomerCenterViewManager$createCustomerCenterListener$1;->$themedReactContext:Lcom/facebook/react/uimanager/b0;

    .line 9
    .line 10
    iget-object v2, p0, Lcom/revenuecat/purchases/react/ui/CustomerCenterViewManager$createCustomerCenterListener$1;->$view:Lcom/revenuecat/purchases/react/ui/views/WrappedCustomerCenterView;

    .line 11
    .line 12
    invoke-static {v0, v1, v2, p1, p2}, Lcom/revenuecat/purchases/react/ui/CustomerCenterViewManager;->access$emitCustomActionSelectedEvent(Lcom/revenuecat/purchases/react/ui/CustomerCenterViewManager;Lcom/facebook/react/bridge/ReactContext;Lcom/revenuecat/purchases/react/ui/views/WrappedCustomerCenterView;Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public onFeedbackSurveyCompletedWrapper(Ljava/lang/String;)V
    .locals 4

    .line 1
    const-string v0, "feedbackSurveyOptionId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lcom/facebook/react/bridge/WritableNativeMap;

    .line 7
    .line 8
    invoke-direct {v1}, Lcom/facebook/react/bridge/WritableNativeMap;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, v0, p1}, Lcom/facebook/react/bridge/WritableNativeMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lcom/revenuecat/purchases/react/ui/CustomerCenterViewManager$createCustomerCenterListener$1;->this$0:Lcom/revenuecat/purchases/react/ui/CustomerCenterViewManager;

    .line 15
    .line 16
    iget-object v0, p0, Lcom/revenuecat/purchases/react/ui/CustomerCenterViewManager$createCustomerCenterListener$1;->$themedReactContext:Lcom/facebook/react/uimanager/b0;

    .line 17
    .line 18
    iget-object v2, p0, Lcom/revenuecat/purchases/react/ui/CustomerCenterViewManager$createCustomerCenterListener$1;->$view:Lcom/revenuecat/purchases/react/ui/views/WrappedCustomerCenterView;

    .line 19
    .line 20
    sget-object v3, Lcom/revenuecat/purchases/react/ui/customercenter/events/CustomerCenterEventName;->ON_FEEDBACK_SURVEY_COMPLETED:Lcom/revenuecat/purchases/react/ui/customercenter/events/CustomerCenterEventName;

    .line 21
    .line 22
    invoke-static {p1, v0, v2, v3, v1}, Lcom/revenuecat/purchases/react/ui/CustomerCenterViewManager;->access$emitEvent(Lcom/revenuecat/purchases/react/ui/CustomerCenterViewManager;Lcom/facebook/react/bridge/ReactContext;Lcom/revenuecat/purchases/react/ui/views/WrappedCustomerCenterView;Lcom/revenuecat/purchases/react/ui/customercenter/events/CustomerCenterEventName;Lcom/facebook/react/bridge/WritableMap;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public onManagementOptionSelectedWrapper(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/revenuecat/purchases/react/ui/CustomerCenterViewManager$createCustomerCenterListener$1;->this$0:Lcom/revenuecat/purchases/react/ui/CustomerCenterViewManager;

    iget-object v1, p0, Lcom/revenuecat/purchases/react/ui/CustomerCenterViewManager$createCustomerCenterListener$1;->$themedReactContext:Lcom/facebook/react/uimanager/b0;

    iget-object v2, p0, Lcom/revenuecat/purchases/react/ui/CustomerCenterViewManager$createCustomerCenterListener$1;->$view:Lcom/revenuecat/purchases/react/ui/views/WrappedCustomerCenterView;

    invoke-static {v0, v1, v2, p1, p2}, Lcom/revenuecat/purchases/react/ui/CustomerCenterViewManager;->access$emitManagementOptionSelectedEvent(Lcom/revenuecat/purchases/react/ui/CustomerCenterViewManager;Lcom/facebook/react/bridge/ReactContext;Lcom/revenuecat/purchases/react/ui/views/WrappedCustomerCenterView;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onManagementOptionSelectedWrapper(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    const-string p2, "action"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onPromotionalOfferSucceededWrapper(Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "customerInfo"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v1, "transaction"

    .line 7
    .line 8
    invoke-static {p2, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v2, "offerId"

    .line 12
    .line 13
    invoke-static {p3, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v3, Lcom/facebook/react/bridge/WritableNativeMap;

    .line 17
    .line 18
    invoke-direct {v3}, Lcom/facebook/react/bridge/WritableNativeMap;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-static {p1}, Lcom/revenuecat/purchases/react/ui/RNPurchasesConverters;->convertMapToWriteableMap(Ljava/util/Map;)Lcom/facebook/react/bridge/WritableMap;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {v3, v0, p1}, Lcom/facebook/react/bridge/WritableNativeMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 26
    .line 27
    .line 28
    invoke-static {p2}, Lcom/revenuecat/purchases/react/ui/RNPurchasesConverters;->convertMapToWriteableMap(Ljava/util/Map;)Lcom/facebook/react/bridge/WritableMap;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {v3, v1, p1}, Lcom/facebook/react/bridge/WritableNativeMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3, v2, p3}, Lcom/facebook/react/bridge/WritableNativeMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lcom/revenuecat/purchases/react/ui/CustomerCenterViewManager$createCustomerCenterListener$1;->this$0:Lcom/revenuecat/purchases/react/ui/CustomerCenterViewManager;

    .line 39
    .line 40
    iget-object p2, p0, Lcom/revenuecat/purchases/react/ui/CustomerCenterViewManager$createCustomerCenterListener$1;->$themedReactContext:Lcom/facebook/react/uimanager/b0;

    .line 41
    .line 42
    iget-object p3, p0, Lcom/revenuecat/purchases/react/ui/CustomerCenterViewManager$createCustomerCenterListener$1;->$view:Lcom/revenuecat/purchases/react/ui/views/WrappedCustomerCenterView;

    .line 43
    .line 44
    sget-object v0, Lcom/revenuecat/purchases/react/ui/customercenter/events/CustomerCenterEventName;->ON_PROMOTIONAL_OFFER_SUCCEEDED:Lcom/revenuecat/purchases/react/ui/customercenter/events/CustomerCenterEventName;

    .line 45
    .line 46
    invoke-static {p1, p2, p3, v0, v3}, Lcom/revenuecat/purchases/react/ui/CustomerCenterViewManager;->access$emitEvent(Lcom/revenuecat/purchases/react/ui/CustomerCenterViewManager;Lcom/facebook/react/bridge/ReactContext;Lcom/revenuecat/purchases/react/ui/views/WrappedCustomerCenterView;Lcom/revenuecat/purchases/react/ui/customercenter/events/CustomerCenterEventName;Lcom/facebook/react/bridge/WritableMap;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public onRestoreCompletedWrapper(Ljava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "customerInfo"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lcom/facebook/react/bridge/WritableNativeMap;

    .line 7
    .line 8
    invoke-direct {v1}, Lcom/facebook/react/bridge/WritableNativeMap;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Lcom/revenuecat/purchases/react/ui/RNPurchasesConverters;->convertMapToWriteableMap(Ljava/util/Map;)Lcom/facebook/react/bridge/WritableMap;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {v1, v0, p1}, Lcom/facebook/react/bridge/WritableNativeMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/revenuecat/purchases/react/ui/CustomerCenterViewManager$createCustomerCenterListener$1;->this$0:Lcom/revenuecat/purchases/react/ui/CustomerCenterViewManager;

    .line 19
    .line 20
    iget-object v0, p0, Lcom/revenuecat/purchases/react/ui/CustomerCenterViewManager$createCustomerCenterListener$1;->$themedReactContext:Lcom/facebook/react/uimanager/b0;

    .line 21
    .line 22
    iget-object v2, p0, Lcom/revenuecat/purchases/react/ui/CustomerCenterViewManager$createCustomerCenterListener$1;->$view:Lcom/revenuecat/purchases/react/ui/views/WrappedCustomerCenterView;

    .line 23
    .line 24
    sget-object v3, Lcom/revenuecat/purchases/react/ui/customercenter/events/CustomerCenterEventName;->ON_RESTORE_COMPLETED:Lcom/revenuecat/purchases/react/ui/customercenter/events/CustomerCenterEventName;

    .line 25
    .line 26
    invoke-static {p1, v0, v2, v3, v1}, Lcom/revenuecat/purchases/react/ui/CustomerCenterViewManager;->access$emitEvent(Lcom/revenuecat/purchases/react/ui/CustomerCenterViewManager;Lcom/facebook/react/bridge/ReactContext;Lcom/revenuecat/purchases/react/ui/views/WrappedCustomerCenterView;Lcom/revenuecat/purchases/react/ui/customercenter/events/CustomerCenterEventName;Lcom/facebook/react/bridge/WritableMap;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public onRestoreFailedWrapper(Ljava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "error"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lcom/facebook/react/bridge/WritableNativeMap;

    .line 7
    .line 8
    invoke-direct {v1}, Lcom/facebook/react/bridge/WritableNativeMap;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Lcom/revenuecat/purchases/react/ui/RNPurchasesConverters;->convertMapToWriteableMap(Ljava/util/Map;)Lcom/facebook/react/bridge/WritableMap;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {v1, v0, p1}, Lcom/facebook/react/bridge/WritableNativeMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/revenuecat/purchases/react/ui/CustomerCenterViewManager$createCustomerCenterListener$1;->this$0:Lcom/revenuecat/purchases/react/ui/CustomerCenterViewManager;

    .line 19
    .line 20
    iget-object v0, p0, Lcom/revenuecat/purchases/react/ui/CustomerCenterViewManager$createCustomerCenterListener$1;->$themedReactContext:Lcom/facebook/react/uimanager/b0;

    .line 21
    .line 22
    iget-object v2, p0, Lcom/revenuecat/purchases/react/ui/CustomerCenterViewManager$createCustomerCenterListener$1;->$view:Lcom/revenuecat/purchases/react/ui/views/WrappedCustomerCenterView;

    .line 23
    .line 24
    sget-object v3, Lcom/revenuecat/purchases/react/ui/customercenter/events/CustomerCenterEventName;->ON_RESTORE_FAILED:Lcom/revenuecat/purchases/react/ui/customercenter/events/CustomerCenterEventName;

    .line 25
    .line 26
    invoke-static {p1, v0, v2, v3, v1}, Lcom/revenuecat/purchases/react/ui/CustomerCenterViewManager;->access$emitEvent(Lcom/revenuecat/purchases/react/ui/CustomerCenterViewManager;Lcom/facebook/react/bridge/ReactContext;Lcom/revenuecat/purchases/react/ui/views/WrappedCustomerCenterView;Lcom/revenuecat/purchases/react/ui/customercenter/events/CustomerCenterEventName;Lcom/facebook/react/bridge/WritableMap;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public onRestoreStartedWrapper()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/react/ui/CustomerCenterViewManager$createCustomerCenterListener$1;->this$0:Lcom/revenuecat/purchases/react/ui/CustomerCenterViewManager;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/revenuecat/purchases/react/ui/CustomerCenterViewManager$createCustomerCenterListener$1;->$themedReactContext:Lcom/facebook/react/uimanager/b0;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/revenuecat/purchases/react/ui/CustomerCenterViewManager$createCustomerCenterListener$1;->$view:Lcom/revenuecat/purchases/react/ui/views/WrappedCustomerCenterView;

    .line 6
    .line 7
    sget-object v3, Lcom/revenuecat/purchases/react/ui/customercenter/events/CustomerCenterEventName;->ON_RESTORE_STARTED:Lcom/revenuecat/purchases/react/ui/customercenter/events/CustomerCenterEventName;

    .line 8
    .line 9
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    invoke-static {v0, v1, v2, v3, v4}, Lcom/revenuecat/purchases/react/ui/CustomerCenterViewManager;->access$emitEvent(Lcom/revenuecat/purchases/react/ui/CustomerCenterViewManager;Lcom/facebook/react/bridge/ReactContext;Lcom/revenuecat/purchases/react/ui/views/WrappedCustomerCenterView;Lcom/revenuecat/purchases/react/ui/customercenter/events/CustomerCenterEventName;Lcom/facebook/react/bridge/WritableMap;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public onShowingManageSubscriptionsWrapper()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/react/ui/CustomerCenterViewManager$createCustomerCenterListener$1;->this$0:Lcom/revenuecat/purchases/react/ui/CustomerCenterViewManager;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/revenuecat/purchases/react/ui/CustomerCenterViewManager$createCustomerCenterListener$1;->$themedReactContext:Lcom/facebook/react/uimanager/b0;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/revenuecat/purchases/react/ui/CustomerCenterViewManager$createCustomerCenterListener$1;->$view:Lcom/revenuecat/purchases/react/ui/views/WrappedCustomerCenterView;

    .line 6
    .line 7
    sget-object v3, Lcom/revenuecat/purchases/react/ui/customercenter/events/CustomerCenterEventName;->ON_SHOWING_MANAGE_SUBSCRIPTIONS:Lcom/revenuecat/purchases/react/ui/customercenter/events/CustomerCenterEventName;

    .line 8
    .line 9
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    invoke-static {v0, v1, v2, v3, v4}, Lcom/revenuecat/purchases/react/ui/CustomerCenterViewManager;->access$emitEvent(Lcom/revenuecat/purchases/react/ui/CustomerCenterViewManager;Lcom/facebook/react/bridge/ReactContext;Lcom/revenuecat/purchases/react/ui/views/WrappedCustomerCenterView;Lcom/revenuecat/purchases/react/ui/customercenter/events/CustomerCenterEventName;Lcom/facebook/react/bridge/WritableMap;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
