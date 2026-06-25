.class public final synthetic Lcom/revenuecat/purchases/react/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/revenuecat/purchases/react/RNPurchasesModule;


# direct methods
.method public synthetic constructor <init>(Lcom/revenuecat/purchases/react/RNPurchasesModule;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/revenuecat/purchases/react/a;->a:Lcom/revenuecat/purchases/react/RNPurchasesModule;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/react/a;->a:Lcom/revenuecat/purchases/react/RNPurchasesModule;

    .line 2
    .line 3
    check-cast p1, Ljava/util/Map;

    .line 4
    .line 5
    invoke-static {v0, p1}, Lcom/revenuecat/purchases/react/RNPurchasesModule;->a(Lcom/revenuecat/purchases/react/RNPurchasesModule;Ljava/util/Map;)LTd/L;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
