.class final Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconKt$PaywallIconPreview$1$1;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconKt;->PaywallIconPreview(LY/m;I)V
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
        "LE/C;",
        "LTd/L;",
        "invoke",
        "(LE/C;)V",
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
.field final synthetic $icons:[Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconName;


# direct methods
.method constructor <init>([Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconName;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconKt$PaywallIconPreview$1$1;->$icons:[Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconName;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LE/C;

    invoke-virtual {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconKt$PaywallIconPreview$1$1;->invoke(LE/C;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LE/C;)V
    .locals 9

    const-string v0, "$this$LazyVerticalGrid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconKt$PaywallIconPreview$1$1;->$icons:[Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconName;

    array-length v2, v0

    new-instance v1, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconKt$PaywallIconPreview$1$1$1;

    invoke-direct {v1, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconKt$PaywallIconPreview$1$1$1;-><init>([Lcom/revenuecat/purchases/ui/revenuecatui/composables/PaywallIconName;)V

    const v0, -0x131710a0

    const/4 v3, 0x1

    invoke-static {v0, v3, v1}, Lg0/i;->b(IZLjava/lang/Object;)Lg0/b;

    move-result-object v6

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v8}, LE/C;->b(LE/C;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lie/p;ILjava/lang/Object;)V

    return-void
.end method
