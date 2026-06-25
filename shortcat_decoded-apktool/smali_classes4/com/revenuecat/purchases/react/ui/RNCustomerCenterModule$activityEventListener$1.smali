.class public final Lcom/revenuecat/purchases/react/ui/RNCustomerCenterModule$activityEventListener$1;
.super Lcom/facebook/react/bridge/BaseActivityEventListener;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/react/ui/RNCustomerCenterModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J1\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "com/revenuecat/purchases/react/ui/RNCustomerCenterModule$activityEventListener$1",
        "Lcom/facebook/react/bridge/BaseActivityEventListener;",
        "Landroid/app/Activity;",
        "activity",
        "",
        "requestCode",
        "resultCode",
        "Landroid/content/Intent;",
        "intent",
        "LTd/L;",
        "onActivityResult",
        "(Landroid/app/Activity;IILandroid/content/Intent;)V",
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
.field final synthetic this$0:Lcom/revenuecat/purchases/react/ui/RNCustomerCenterModule;


# direct methods
.method constructor <init>(Lcom/revenuecat/purchases/react/ui/RNCustomerCenterModule;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/react/ui/RNCustomerCenterModule$activityEventListener$1;->this$0:Lcom/revenuecat/purchases/react/ui/RNCustomerCenterModule;

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/facebook/react/bridge/BaseActivityEventListener;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onActivityResult(Landroid/app/Activity;IILandroid/content/Intent;)V
    .locals 1

    .line 1
    const-string p4, "activity"

    .line 2
    .line 3
    invoke-static {p1, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/16 p1, 0x3e9

    .line 7
    .line 8
    if-ne p2, p1, :cond_2

    .line 9
    .line 10
    const/4 p1, -0x1

    .line 11
    const/4 p2, 0x0

    .line 12
    if-ne p3, p1, :cond_0

    .line 13
    .line 14
    iget-object p1, p0, Lcom/revenuecat/purchases/react/ui/RNCustomerCenterModule$activityEventListener$1;->this$0:Lcom/revenuecat/purchases/react/ui/RNCustomerCenterModule;

    .line 15
    .line 16
    invoke-static {p1}, Lcom/revenuecat/purchases/react/ui/RNCustomerCenterModule;->access$getCustomerCenterPromise$p(Lcom/revenuecat/purchases/react/ui/RNCustomerCenterModule;)Lcom/facebook/react/bridge/Promise;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    invoke-interface {p1, p2}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object p1, p0, Lcom/revenuecat/purchases/react/ui/RNCustomerCenterModule$activityEventListener$1;->this$0:Lcom/revenuecat/purchases/react/ui/RNCustomerCenterModule;

    .line 27
    .line 28
    invoke-static {p1}, Lcom/revenuecat/purchases/react/ui/RNCustomerCenterModule;->access$getCustomerCenterPromise$p(Lcom/revenuecat/purchases/react/ui/RNCustomerCenterModule;)Lcom/facebook/react/bridge/Promise;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    new-instance p4, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    const-string v0, "Customer Center closed with result code: "

    .line 40
    .line 41
    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p3

    .line 51
    const-string p4, "CUSTOMER_CENTER_ERROR"

    .line 52
    .line 53
    invoke-interface {p1, p4, p3, p2}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 54
    .line 55
    .line 56
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/revenuecat/purchases/react/ui/RNCustomerCenterModule$activityEventListener$1;->this$0:Lcom/revenuecat/purchases/react/ui/RNCustomerCenterModule;

    .line 57
    .line 58
    invoke-static {p1, p2}, Lcom/revenuecat/purchases/react/ui/RNCustomerCenterModule;->access$setCustomerCenterPromise$p(Lcom/revenuecat/purchases/react/ui/RNCustomerCenterModule;Lcom/facebook/react/bridge/Promise;)V

    .line 59
    .line 60
    .line 61
    :cond_2
    return-void
.end method
