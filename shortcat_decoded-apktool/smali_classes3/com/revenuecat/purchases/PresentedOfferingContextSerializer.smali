.class public final Lcom/revenuecat/purchases/PresentedOfferingContextSerializer;
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
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c0\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0011R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u00198\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/revenuecat/purchases/PresentedOfferingContextSerializer;",
        "LRf/b;",
        "Lcom/revenuecat/purchases/PresentedOfferingContext;",
        "<init>",
        "()V",
        "LUf/f;",
        "encoder",
        "value",
        "LTd/L;",
        "serialize",
        "(LUf/f;Lcom/revenuecat/purchases/PresentedOfferingContext;)V",
        "LUf/e;",
        "decoder",
        "deserialize",
        "(LUf/e;)Lcom/revenuecat/purchases/PresentedOfferingContext;",
        "",
        "OFFERING_IDENTIFIER_INDEX",
        "I",
        "PLACEMENT_IDENTIFIER_INDEX",
        "TARGETING_CONTEXT_INDEX",
        "",
        "nullableStringSerializer",
        "LRf/b;",
        "Lcom/revenuecat/purchases/PresentedOfferingContext$TargetingContext;",
        "nullableTargetingContextSerializer",
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
.field public static final INSTANCE:Lcom/revenuecat/purchases/PresentedOfferingContextSerializer;

.field private static final OFFERING_IDENTIFIER_INDEX:I = 0x0

.field private static final PLACEMENT_IDENTIFIER_INDEX:I = 0x1

.field private static final TARGETING_CONTEXT_INDEX:I = 0x2

.field private static final descriptor:LTf/e;

.field private static final nullableStringSerializer:LRf/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LRf/b;"
        }
    .end annotation
.end field

.field private static final nullableTargetingContextSerializer:LRf/b;
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
    new-instance v0, Lcom/revenuecat/purchases/PresentedOfferingContextSerializer;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/revenuecat/purchases/PresentedOfferingContextSerializer;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/revenuecat/purchases/PresentedOfferingContextSerializer;->INSTANCE:Lcom/revenuecat/purchases/PresentedOfferingContextSerializer;

    .line 7
    .line 8
    sget-object v0, Lkotlin/jvm/internal/U;->a:Lkotlin/jvm/internal/U;

    .line 9
    .line 10
    invoke-static {v0}, LSf/a;->F(Lkotlin/jvm/internal/U;)LRf/b;

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
    sput-object v0, Lcom/revenuecat/purchases/PresentedOfferingContextSerializer;->nullableStringSerializer:LRf/b;

    .line 19
    .line 20
    sget-object v0, Lcom/revenuecat/purchases/TargetingContextSerializer;->INSTANCE:Lcom/revenuecat/purchases/TargetingContextSerializer;

    .line 21
    .line 22
    invoke-static {v0}, LSf/a;->p(LRf/b;)LRf/b;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sput-object v0, Lcom/revenuecat/purchases/PresentedOfferingContextSerializer;->nullableTargetingContextSerializer:LRf/b;

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    new-array v0, v0, [LTf/e;

    .line 30
    .line 31
    sget-object v1, Lcom/revenuecat/purchases/PresentedOfferingContextSerializer$descriptor$1;->INSTANCE:Lcom/revenuecat/purchases/PresentedOfferingContextSerializer$descriptor$1;

    .line 32
    .line 33
    const-string v2, "PresentedOfferingContext"

    .line 34
    .line 35
    invoke-static {v2, v0, v1}, LTf/k;->c(Ljava/lang/String;[LTf/e;Lkotlin/jvm/functions/Function1;)LTf/e;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, Lcom/revenuecat/purchases/PresentedOfferingContextSerializer;->descriptor:LTf/e;

    .line 40
    .line 41
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

.method public static final synthetic access$getNullableStringSerializer$p()LRf/b;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/PresentedOfferingContextSerializer;->nullableStringSerializer:LRf/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getNullableTargetingContextSerializer$p()LRf/b;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/PresentedOfferingContextSerializer;->nullableTargetingContextSerializer:LRf/b;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public deserialize(LUf/e;)Lcom/revenuecat/purchases/PresentedOfferingContext;
    .locals 10

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Lcom/revenuecat/purchases/PresentedOfferingContextSerializer;->getDescriptor()LTf/e;

    move-result-object v0

    .line 3
    invoke-interface {p1, v0}, LUf/e;->b(LTf/e;)LUf/c;

    move-result-object v1

    .line 4
    const-string p1, ""

    const/4 v2, 0x0

    move-object v8, v2

    move-object v9, v8

    .line 5
    :goto_0
    sget-object v2, Lcom/revenuecat/purchases/PresentedOfferingContextSerializer;->INSTANCE:Lcom/revenuecat/purchases/PresentedOfferingContextSerializer;

    invoke-virtual {v2}, Lcom/revenuecat/purchases/PresentedOfferingContextSerializer;->getDescriptor()LTf/e;

    move-result-object v3

    invoke-interface {v1, v3}, LUf/c;->i(LTf/e;)I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_3

    if-eqz v3, :cond_2

    const/4 v4, 0x1

    if-eq v3, v4, :cond_1

    const/4 v4, 0x2

    if-ne v3, v4, :cond_0

    .line 6
    invoke-virtual {v2}, Lcom/revenuecat/purchases/PresentedOfferingContextSerializer;->getDescriptor()LTf/e;

    move-result-object v2

    .line 7
    invoke-static {}, Lcom/revenuecat/purchases/PresentedOfferingContextSerializer;->access$getNullableTargetingContextSerializer$p()LRf/b;

    move-result-object v4

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v3, 0x2

    const/4 v5, 0x0

    .line 8
    invoke-static/range {v1 .. v7}, LUf/c$a;->c(LUf/c;LTf/e;ILRf/a;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Lcom/revenuecat/purchases/PresentedOfferingContext$TargetingContext;

    goto :goto_0

    .line 9
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 10
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

    .line 11
    :cond_1
    invoke-virtual {v2}, Lcom/revenuecat/purchases/PresentedOfferingContextSerializer;->getDescriptor()LTf/e;

    move-result-object v2

    .line 12
    invoke-static {}, Lcom/revenuecat/purchases/PresentedOfferingContextSerializer;->access$getNullableStringSerializer$p()LRf/b;

    move-result-object v4

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v3, 0x1

    const/4 v5, 0x0

    .line 13
    invoke-static/range {v1 .. v7}, LUf/c$a;->c(LUf/c;LTf/e;ILRf/a;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Ljava/lang/String;

    goto :goto_0

    .line 14
    :cond_2
    invoke-virtual {v2}, Lcom/revenuecat/purchases/PresentedOfferingContextSerializer;->getDescriptor()LTf/e;

    move-result-object p1

    const/4 v2, 0x0

    .line 15
    invoke-interface {v1, p1, v2}, LUf/c;->l(LTf/e;I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 16
    :cond_3
    new-instance v2, Lcom/revenuecat/purchases/PresentedOfferingContext;

    invoke-direct {v2, p1, v8, v9}, Lcom/revenuecat/purchases/PresentedOfferingContext;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/PresentedOfferingContext$TargetingContext;)V

    .line 17
    invoke-interface {v1, v0}, LUf/c;->c(LTf/e;)V

    return-object v2
.end method

.method public bridge synthetic deserialize(LUf/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/revenuecat/purchases/PresentedOfferingContextSerializer;->deserialize(LUf/e;)Lcom/revenuecat/purchases/PresentedOfferingContext;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()LTf/e;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/PresentedOfferingContextSerializer;->descriptor:LTf/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public serialize(LUf/f;Lcom/revenuecat/purchases/PresentedOfferingContext;)V
    .locals 6

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Lcom/revenuecat/purchases/PresentedOfferingContextSerializer;->getDescriptor()LTf/e;

    move-result-object v0

    .line 3
    invoke-interface {p1, v0}, LUf/f;->b(LTf/e;)LUf/d;

    move-result-object p1

    .line 4
    sget-object v1, Lcom/revenuecat/purchases/PresentedOfferingContextSerializer;->INSTANCE:Lcom/revenuecat/purchases/PresentedOfferingContextSerializer;

    invoke-virtual {v1}, Lcom/revenuecat/purchases/PresentedOfferingContextSerializer;->getDescriptor()LTf/e;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {p2}, Lcom/revenuecat/purchases/PresentedOfferingContext;->getOfferingIdentifier()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p1, v2, v3, v4}, LUf/d;->k(LTf/e;ILjava/lang/String;)V

    .line 5
    invoke-virtual {v1}, Lcom/revenuecat/purchases/PresentedOfferingContextSerializer;->getDescriptor()LTf/e;

    move-result-object v2

    .line 6
    invoke-static {}, Lcom/revenuecat/purchases/PresentedOfferingContextSerializer;->access$getNullableStringSerializer$p()LRf/b;

    move-result-object v3

    .line 7
    invoke-virtual {p2}, Lcom/revenuecat/purchases/PresentedOfferingContext;->getPlacementIdentifier()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    .line 8
    invoke-interface {p1, v2, v5, v3, v4}, LUf/d;->m(LTf/e;ILRf/k;Ljava/lang/Object;)V

    .line 9
    invoke-virtual {v1}, Lcom/revenuecat/purchases/PresentedOfferingContextSerializer;->getDescriptor()LTf/e;

    move-result-object v1

    .line 10
    invoke-static {}, Lcom/revenuecat/purchases/PresentedOfferingContextSerializer;->access$getNullableTargetingContextSerializer$p()LRf/b;

    move-result-object v2

    .line 11
    invoke-virtual {p2}, Lcom/revenuecat/purchases/PresentedOfferingContext;->getTargetingContext()Lcom/revenuecat/purchases/PresentedOfferingContext$TargetingContext;

    move-result-object p2

    const/4 v3, 0x2

    .line 12
    invoke-interface {p1, v1, v3, v2, p2}, LUf/d;->m(LTf/e;ILRf/k;Ljava/lang/Object;)V

    .line 13
    invoke-interface {p1, v0}, LUf/d;->c(LTf/e;)V

    return-void
.end method

.method public bridge synthetic serialize(LUf/f;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/revenuecat/purchases/PresentedOfferingContext;

    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/PresentedOfferingContextSerializer;->serialize(LUf/f;Lcom/revenuecat/purchases/PresentedOfferingContext;)V

    return-void
.end method
