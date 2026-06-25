.class final Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/CreateSupportTicketViewKt$DescriptionInputField$1$1;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/CreateSupportTicketViewKt;->DescriptionInputField(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/DescriptionInputState;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;LY/m;I)V
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "LK/v;",
        "LTd/L;",
        "invoke",
        "(LK/v;)V",
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
.field final synthetic $currentOnSubmit$delegate:LY/h2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY/h2;"
        }
    .end annotation
.end field

.field final synthetic $state:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/DescriptionInputState;


# direct methods
.method constructor <init>(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/DescriptionInputState;LY/h2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/DescriptionInputState;",
            "LY/h2;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/CreateSupportTicketViewKt$DescriptionInputField$1$1;->$state:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/DescriptionInputState;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/CreateSupportTicketViewKt$DescriptionInputField$1$1;->$currentOnSubmit$delegate:LY/h2;

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
    check-cast p1, LK/v;

    invoke-virtual {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/CreateSupportTicketViewKt$DescriptionInputField$1$1;->invoke(LK/v;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LK/v;)V
    .locals 1

    const-string v0, "$this$$receiver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/CreateSupportTicketViewKt$DescriptionInputField$1$1;->$state:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/DescriptionInputState;

    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/DescriptionInputState;->getShowDone()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/CreateSupportTicketViewKt$DescriptionInputField$1$1;->$state:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/DescriptionInputState;

    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/DescriptionInputState;->getDescription()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LDf/r;->l0(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/CreateSupportTicketViewKt$DescriptionInputField$1$1;->$currentOnSubmit$delegate:LY/h2;

    invoke-static {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/CreateSupportTicketViewKt;->access$DescriptionInputField$lambda$23(LY/h2;)Lie/a;

    move-result-object p1

    invoke-interface {p1}, Lie/a;->invoke()Ljava/lang/Object;

    :cond_0
    return-void
.end method
