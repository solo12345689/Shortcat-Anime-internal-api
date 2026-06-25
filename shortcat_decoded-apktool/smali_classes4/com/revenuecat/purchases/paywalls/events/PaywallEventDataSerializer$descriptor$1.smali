.class final Lcom/revenuecat/purchases/paywalls/events/PaywallEventDataSerializer$descriptor$1;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/revenuecat/purchases/paywalls/events/PaywallEventDataSerializer;
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
        "LTf/a;",
        "LTd/L;",
        "invoke",
        "(LTf/a;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/revenuecat/purchases/paywalls/events/PaywallEventDataSerializer$descriptor$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/paywalls/events/PaywallEventDataSerializer$descriptor$1;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/revenuecat/purchases/paywalls/events/PaywallEventDataSerializer$descriptor$1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/revenuecat/purchases/paywalls/events/PaywallEventDataSerializer$descriptor$1;->INSTANCE:Lcom/revenuecat/purchases/paywalls/events/PaywallEventDataSerializer$descriptor$1;

    .line 7
    .line 8
    return-void
.end method

.method constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LTf/a;

    invoke-virtual {p0, p1}, Lcom/revenuecat/purchases/paywalls/events/PaywallEventDataSerializer$descriptor$1;->invoke(LTf/a;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LTf/a;)V
    .locals 8

    const-string v0, "$this$buildClassSerialDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-static {}, Lcom/revenuecat/purchases/paywalls/events/PaywallEventDataSerializer;->access$getNullableStringSerializer$p()LRf/b;

    move-result-object v0

    invoke-interface {v0}, LRf/b;->getDescriptor()LTf/e;

    move-result-object v3

    const/16 v6, 0xc

    const/4 v7, 0x0

    const-string v2, "paywallIdentifier"

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v7}, LTf/a;->b(LTf/a;Ljava/lang/String;LTf/e;Ljava/util/List;ZILjava/lang/Object;)V

    .line 3
    sget-object v0, Lcom/revenuecat/purchases/PresentedOfferingContextSerializer;->INSTANCE:Lcom/revenuecat/purchases/PresentedOfferingContextSerializer;

    invoke-virtual {v0}, Lcom/revenuecat/purchases/PresentedOfferingContextSerializer;->getDescriptor()LTf/e;

    move-result-object v3

    const-string v2, "presentedOfferingContext"

    invoke-static/range {v1 .. v7}, LTf/a;->b(LTf/a;Ljava/lang/String;LTf/e;Ljava/util/List;ZILjava/lang/Object;)V

    .line 4
    sget-object v0, Lkotlin/jvm/internal/r;->a:Lkotlin/jvm/internal/r;

    invoke-static {v0}, LSf/a;->C(Lkotlin/jvm/internal/r;)LRf/b;

    move-result-object v0

    invoke-interface {v0}, LRf/b;->getDescriptor()LTf/e;

    move-result-object v3

    const-string v2, "paywallRevision"

    invoke-static/range {v1 .. v7}, LTf/a;->b(LTf/a;Ljava/lang/String;LTf/e;Ljava/util/List;ZILjava/lang/Object;)V

    .line 5
    sget-object v0, Lcom/revenuecat/purchases/utils/serializers/UUIDSerializer;->INSTANCE:Lcom/revenuecat/purchases/utils/serializers/UUIDSerializer;

    invoke-virtual {v0}, Lcom/revenuecat/purchases/utils/serializers/UUIDSerializer;->getDescriptor()LTf/e;

    move-result-object v3

    const-string v2, "sessionIdentifier"

    invoke-static/range {v1 .. v7}, LTf/a;->b(LTf/a;Ljava/lang/String;LTf/e;Ljava/util/List;ZILjava/lang/Object;)V

    .line 6
    sget-object v0, Lkotlin/jvm/internal/U;->a:Lkotlin/jvm/internal/U;

    invoke-static {v0}, LSf/a;->F(Lkotlin/jvm/internal/U;)LRf/b;

    move-result-object v1

    invoke-interface {v1}, LRf/b;->getDescriptor()LTf/e;

    move-result-object v3

    const-string v2, "displayMode"

    move-object v1, p1

    invoke-static/range {v1 .. v7}, LTf/a;->b(LTf/a;Ljava/lang/String;LTf/e;Ljava/util/List;ZILjava/lang/Object;)V

    .line 7
    invoke-static {v0}, LSf/a;->F(Lkotlin/jvm/internal/U;)LRf/b;

    move-result-object v1

    invoke-interface {v1}, LRf/b;->getDescriptor()LTf/e;

    move-result-object v3

    const-string v2, "localeIdentifier"

    move-object v1, p1

    invoke-static/range {v1 .. v7}, LTf/a;->b(LTf/a;Ljava/lang/String;LTf/e;Ljava/util/List;ZILjava/lang/Object;)V

    .line 8
    sget-object v1, Lkotlin/jvm/internal/d;->a:Lkotlin/jvm/internal/d;

    invoke-static {v1}, LSf/a;->x(Lkotlin/jvm/internal/d;)LRf/b;

    move-result-object v1

    invoke-interface {v1}, LRf/b;->getDescriptor()LTf/e;

    move-result-object v3

    const-string v2, "darkMode"

    move-object v1, p1

    invoke-static/range {v1 .. v7}, LTf/a;->b(LTf/a;Ljava/lang/String;LTf/e;Ljava/util/List;ZILjava/lang/Object;)V

    .line 9
    invoke-static {}, Lcom/revenuecat/purchases/paywalls/events/PaywallEventDataSerializer;->access$getNullableExitOfferTypeSerializer$p()LRf/b;

    move-result-object v1

    invoke-interface {v1}, LRf/b;->getDescriptor()LTf/e;

    move-result-object v3

    const-string v2, "exitOfferType"

    move-object v1, p1

    invoke-static/range {v1 .. v7}, LTf/a;->b(LTf/a;Ljava/lang/String;LTf/e;Ljava/util/List;ZILjava/lang/Object;)V

    .line 10
    invoke-static {}, Lcom/revenuecat/purchases/paywalls/events/PaywallEventDataSerializer;->access$getNullableStringSerializer$p()LRf/b;

    move-result-object v1

    invoke-interface {v1}, LRf/b;->getDescriptor()LTf/e;

    move-result-object v3

    const-string v2, "exitOfferingIdentifier"

    move-object v1, p1

    invoke-static/range {v1 .. v7}, LTf/a;->b(LTf/a;Ljava/lang/String;LTf/e;Ljava/util/List;ZILjava/lang/Object;)V

    .line 11
    invoke-static {}, Lcom/revenuecat/purchases/paywalls/events/PaywallEventDataSerializer;->access$getNullableStringSerializer$p()LRf/b;

    move-result-object v1

    invoke-interface {v1}, LRf/b;->getDescriptor()LTf/e;

    move-result-object v3

    const-string v2, "packageIdentifier"

    move-object v1, p1

    invoke-static/range {v1 .. v7}, LTf/a;->b(LTf/a;Ljava/lang/String;LTf/e;Ljava/util/List;ZILjava/lang/Object;)V

    .line 12
    invoke-static {}, Lcom/revenuecat/purchases/paywalls/events/PaywallEventDataSerializer;->access$getNullableStringSerializer$p()LRf/b;

    move-result-object v1

    invoke-interface {v1}, LRf/b;->getDescriptor()LTf/e;

    move-result-object v3

    const-string v2, "productIdentifier"

    move-object v1, p1

    invoke-static/range {v1 .. v7}, LTf/a;->b(LTf/a;Ljava/lang/String;LTf/e;Ljava/util/List;ZILjava/lang/Object;)V

    .line 13
    invoke-static {}, Lcom/revenuecat/purchases/paywalls/events/PaywallEventDataSerializer;->access$getNullableIntSerializer$p()LRf/b;

    move-result-object v1

    invoke-interface {v1}, LRf/b;->getDescriptor()LTf/e;

    move-result-object v3

    const-string v2, "errorCode"

    move-object v1, p1

    invoke-static/range {v1 .. v7}, LTf/a;->b(LTf/a;Ljava/lang/String;LTf/e;Ljava/util/List;ZILjava/lang/Object;)V

    .line 14
    invoke-static {}, Lcom/revenuecat/purchases/paywalls/events/PaywallEventDataSerializer;->access$getNullableStringSerializer$p()LRf/b;

    move-result-object v1

    invoke-interface {v1}, LRf/b;->getDescriptor()LTf/e;

    move-result-object v3

    const-string v2, "errorMessage"

    move-object v1, p1

    invoke-static/range {v1 .. v7}, LTf/a;->b(LTf/a;Ljava/lang/String;LTf/e;Ljava/util/List;ZILjava/lang/Object;)V

    .line 15
    invoke-static {v0}, LSf/a;->F(Lkotlin/jvm/internal/U;)LRf/b;

    move-result-object v0

    invoke-interface {v0}, LRf/b;->getDescriptor()LTf/e;

    move-result-object v3

    const-string v2, "offeringIdentifier"

    invoke-static/range {v1 .. v7}, LTf/a;->b(LTf/a;Ljava/lang/String;LTf/e;Ljava/util/List;ZILjava/lang/Object;)V

    return-void
.end method
