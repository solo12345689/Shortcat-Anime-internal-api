.class public final Lcom/revenuecat/purchases/models/PricingPhaseSerializer;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LRf/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LRf/b;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c0\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u00178\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/revenuecat/purchases/models/PricingPhaseSerializer;",
        "LRf/b;",
        "Lcom/revenuecat/purchases/models/PricingPhase;",
        "<init>",
        "()V",
        "LUf/f;",
        "encoder",
        "value",
        "LTd/L;",
        "serialize",
        "(LUf/f;Lcom/revenuecat/purchases/models/PricingPhase;)V",
        "LUf/e;",
        "decoder",
        "deserialize",
        "(LUf/e;)Lcom/revenuecat/purchases/models/PricingPhase;",
        "",
        "nullableIntSerializer",
        "LRf/b;",
        "BILLING_PERIOD_INDEX",
        "I",
        "RECURRENCE_MODE_INDEX",
        "BILLING_CYCLE_COUNT_INDEX",
        "PRICE_INDEX",
        "LTf/e;",
        "descriptor",
        "LTf/e;",
        "getDescriptor",
        "()LTf/e;",
        "purchases_defaultsBc8Release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final BILLING_CYCLE_COUNT_INDEX:I = 0x2

.field private static final BILLING_PERIOD_INDEX:I = 0x0

.field public static final INSTANCE:Lcom/revenuecat/purchases/models/PricingPhaseSerializer;

.field private static final PRICE_INDEX:I = 0x3

.field private static final RECURRENCE_MODE_INDEX:I = 0x1

.field private static final descriptor:LTf/e;

.field private static final nullableIntSerializer:LRf/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LRf/b;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/models/PricingPhaseSerializer;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/revenuecat/purchases/models/PricingPhaseSerializer;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/revenuecat/purchases/models/PricingPhaseSerializer;->INSTANCE:Lcom/revenuecat/purchases/models/PricingPhaseSerializer;

    .line 7
    .line 8
    sget-object v0, Lkotlin/jvm/internal/r;->a:Lkotlin/jvm/internal/r;

    .line 9
    .line 10
    invoke-static {v0}, LSf/a;->C(Lkotlin/jvm/internal/r;)LRf/b;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0}, LSf/a;->p(LRf/b;)LRf/b;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sput-object v0, Lcom/revenuecat/purchases/models/PricingPhaseSerializer;->nullableIntSerializer:LRf/b;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    new-array v0, v0, [LTf/e;

    .line 22
    .line 23
    sget-object v1, Lcom/revenuecat/purchases/models/PricingPhaseSerializer$descriptor$1;->INSTANCE:Lcom/revenuecat/purchases/models/PricingPhaseSerializer$descriptor$1;

    .line 24
    .line 25
    const-string v2, "PricingPhase"

    .line 26
    .line 27
    invoke-static {v2, v0, v1}, LTf/k;->c(Ljava/lang/String;[LTf/e;Lkotlin/jvm/functions/Function1;)LTf/e;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lcom/revenuecat/purchases/models/PricingPhaseSerializer;->descriptor:LTf/e;

    .line 32
    .line 33
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getNullableIntSerializer$p()LRf/b;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/models/PricingPhaseSerializer;->nullableIntSerializer:LRf/b;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public deserialize(LUf/e;)Lcom/revenuecat/purchases/models/PricingPhase;
    .locals 11

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/PricingPhaseSerializer;->getDescriptor()LTf/e;

    move-result-object v0

    .line 3
    invoke-interface {p1, v0}, LUf/e;->b(LTf/e;)LUf/c;

    move-result-object v1

    const/4 p1, 0x0

    move-object v8, p1

    move-object v9, v8

    move-object v10, v9

    .line 4
    :goto_0
    sget-object v2, Lcom/revenuecat/purchases/models/PricingPhaseSerializer;->INSTANCE:Lcom/revenuecat/purchases/models/PricingPhaseSerializer;

    invoke-virtual {v2}, Lcom/revenuecat/purchases/models/PricingPhaseSerializer;->getDescriptor()LTf/e;

    move-result-object v3

    invoke-interface {v1, v3}, LUf/c;->i(LTf/e;)I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_4

    if-eqz v3, :cond_3

    const/4 v4, 0x1

    if-eq v3, v4, :cond_2

    const/4 v4, 0x2

    if-eq v3, v4, :cond_1

    const/4 v4, 0x3

    if-ne v3, v4, :cond_0

    .line 5
    invoke-virtual {v2}, Lcom/revenuecat/purchases/models/PricingPhaseSerializer;->getDescriptor()LTf/e;

    move-result-object v2

    sget-object v4, Lcom/revenuecat/purchases/models/PriceSerializer;->INSTANCE:Lcom/revenuecat/purchases/models/PriceSerializer;

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v3, 0x3

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, LUf/c$a;->c(LUf/c;LTf/e;ILRf/a;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Lcom/revenuecat/purchases/models/Price;

    goto :goto_0

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unexpected index: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 8
    :cond_1
    invoke-virtual {v2}, Lcom/revenuecat/purchases/models/PricingPhaseSerializer;->getDescriptor()LTf/e;

    move-result-object v2

    .line 9
    invoke-static {}, Lcom/revenuecat/purchases/models/PricingPhaseSerializer;->access$getNullableIntSerializer$p()LRf/b;

    move-result-object v4

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v3, 0x2

    const/4 v5, 0x0

    .line 10
    invoke-static/range {v1 .. v7}, LUf/c$a;->c(LUf/c;LTf/e;ILRf/a;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Ljava/lang/Integer;

    goto :goto_0

    .line 11
    :cond_2
    invoke-virtual {v2}, Lcom/revenuecat/purchases/models/PricingPhaseSerializer;->getDescriptor()LTf/e;

    move-result-object v2

    .line 12
    sget-object v4, Lcom/revenuecat/purchases/models/RecurrenceModeSerializer;->INSTANCE:Lcom/revenuecat/purchases/models/RecurrenceModeSerializer;

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v3, 0x1

    const/4 v5, 0x0

    .line 13
    invoke-static/range {v1 .. v7}, LUf/c$a;->c(LUf/c;LTf/e;ILRf/a;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Lcom/revenuecat/purchases/models/RecurrenceMode;

    goto :goto_0

    .line 14
    :cond_3
    invoke-virtual {v2}, Lcom/revenuecat/purchases/models/PricingPhaseSerializer;->getDescriptor()LTf/e;

    move-result-object v2

    .line 15
    sget-object v4, Lcom/revenuecat/purchases/models/PeriodSerializer;->INSTANCE:Lcom/revenuecat/purchases/models/PeriodSerializer;

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    .line 16
    invoke-static/range {v1 .. v7}, LUf/c$a;->c(LUf/c;LTf/e;ILRf/a;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/revenuecat/purchases/models/Period;

    goto :goto_0

    .line 17
    :cond_4
    new-instance v2, Lcom/revenuecat/purchases/models/PricingPhase;

    .line 18
    invoke-static {p1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 19
    invoke-static {v8}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 20
    invoke-static {v10}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 21
    invoke-direct {v2, p1, v8, v9, v10}, Lcom/revenuecat/purchases/models/PricingPhase;-><init>(Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/RecurrenceMode;Ljava/lang/Integer;Lcom/revenuecat/purchases/models/Price;)V

    .line 22
    invoke-interface {v1, v0}, LUf/c;->c(LTf/e;)V

    return-object v2
.end method

.method public bridge synthetic deserialize(LUf/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/revenuecat/purchases/models/PricingPhaseSerializer;->deserialize(LUf/e;)Lcom/revenuecat/purchases/models/PricingPhase;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()LTf/e;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/models/PricingPhaseSerializer;->descriptor:LTf/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public serialize(LUf/f;Lcom/revenuecat/purchases/models/PricingPhase;)V
    .locals 6

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/PricingPhaseSerializer;->getDescriptor()LTf/e;

    move-result-object v0

    .line 3
    invoke-interface {p1, v0}, LUf/f;->b(LTf/e;)LUf/d;

    move-result-object p1

    .line 4
    sget-object v1, Lcom/revenuecat/purchases/models/PricingPhaseSerializer;->INSTANCE:Lcom/revenuecat/purchases/models/PricingPhaseSerializer;

    invoke-virtual {v1}, Lcom/revenuecat/purchases/models/PricingPhaseSerializer;->getDescriptor()LTf/e;

    move-result-object v2

    sget-object v3, Lcom/revenuecat/purchases/models/PeriodSerializer;->INSTANCE:Lcom/revenuecat/purchases/models/PeriodSerializer;

    invoke-virtual {p2}, Lcom/revenuecat/purchases/models/PricingPhase;->getBillingPeriod()Lcom/revenuecat/purchases/models/Period;

    move-result-object v4

    const/4 v5, 0x0

    invoke-interface {p1, v2, v5, v3, v4}, LUf/d;->m(LTf/e;ILRf/k;Ljava/lang/Object;)V

    .line 5
    invoke-virtual {v1}, Lcom/revenuecat/purchases/models/PricingPhaseSerializer;->getDescriptor()LTf/e;

    move-result-object v2

    sget-object v3, Lcom/revenuecat/purchases/models/RecurrenceModeSerializer;->INSTANCE:Lcom/revenuecat/purchases/models/RecurrenceModeSerializer;

    invoke-virtual {p2}, Lcom/revenuecat/purchases/models/PricingPhase;->getRecurrenceMode()Lcom/revenuecat/purchases/models/RecurrenceMode;

    move-result-object v4

    const/4 v5, 0x1

    invoke-interface {p1, v2, v5, v3, v4}, LUf/d;->m(LTf/e;ILRf/k;Ljava/lang/Object;)V

    .line 6
    invoke-virtual {v1}, Lcom/revenuecat/purchases/models/PricingPhaseSerializer;->getDescriptor()LTf/e;

    move-result-object v2

    .line 7
    invoke-static {}, Lcom/revenuecat/purchases/models/PricingPhaseSerializer;->access$getNullableIntSerializer$p()LRf/b;

    move-result-object v3

    .line 8
    invoke-virtual {p2}, Lcom/revenuecat/purchases/models/PricingPhase;->getBillingCycleCount()Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x2

    .line 9
    invoke-interface {p1, v2, v5, v3, v4}, LUf/d;->m(LTf/e;ILRf/k;Ljava/lang/Object;)V

    .line 10
    invoke-virtual {v1}, Lcom/revenuecat/purchases/models/PricingPhaseSerializer;->getDescriptor()LTf/e;

    move-result-object v1

    sget-object v2, Lcom/revenuecat/purchases/models/PriceSerializer;->INSTANCE:Lcom/revenuecat/purchases/models/PriceSerializer;

    invoke-virtual {p2}, Lcom/revenuecat/purchases/models/PricingPhase;->getPrice()Lcom/revenuecat/purchases/models/Price;

    move-result-object p2

    const/4 v3, 0x3

    invoke-interface {p1, v1, v3, v2, p2}, LUf/d;->m(LTf/e;ILRf/k;Ljava/lang/Object;)V

    .line 11
    invoke-interface {p1, v0}, LUf/d;->c(LTf/e;)V

    return-void
.end method

.method public bridge synthetic serialize(LUf/f;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/revenuecat/purchases/models/PricingPhase;

    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/models/PricingPhaseSerializer;->serialize(LUf/f;Lcom/revenuecat/purchases/models/PricingPhase;)V

    return-void
.end method
