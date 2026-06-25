.class public final Lcom/revenuecat/purchases/ui/revenuecatui/views/CompatComposeView$lifecycleObserver$1;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/views/CompatComposeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "com/revenuecat/purchases/ui/revenuecatui/views/CompatComposeView$lifecycleObserver$1",
        "Landroidx/lifecycle/DefaultLifecycleObserver;",
        "Landroidx/lifecycle/r;",
        "owner",
        "LTd/L;",
        "onDestroy",
        "(Landroidx/lifecycle/r;)V",
        "revenuecatui_defaultsBc8Release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lcom/revenuecat/purchases/ui/revenuecatui/views/CompatComposeView;


# direct methods
.method constructor <init>(Lcom/revenuecat/purchases/ui/revenuecatui/views/CompatComposeView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/views/CompatComposeView$lifecycleObserver$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/views/CompatComposeView;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onDestroy(Landroidx/lifecycle/r;)V
    .locals 1

    .line 1
    const-string v0, "owner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/views/CompatComposeView$lifecycleObserver$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/views/CompatComposeView;

    .line 7
    .line 8
    invoke-static {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/views/CompatComposeView;->access$onDestroy(Lcom/revenuecat/purchases/ui/revenuecatui/views/CompatComposeView;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
