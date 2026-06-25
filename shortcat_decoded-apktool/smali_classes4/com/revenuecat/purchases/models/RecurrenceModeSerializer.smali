.class public final Lcom/revenuecat/purchases/models/RecurrenceModeSerializer;
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
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c0\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/revenuecat/purchases/models/RecurrenceModeSerializer;",
        "LRf/b;",
        "Lcom/revenuecat/purchases/models/RecurrenceMode;",
        "<init>",
        "()V",
        "LUf/f;",
        "encoder",
        "value",
        "LTd/L;",
        "serialize",
        "(LUf/f;Lcom/revenuecat/purchases/models/RecurrenceMode;)V",
        "LUf/e;",
        "decoder",
        "deserialize",
        "(LUf/e;)Lcom/revenuecat/purchases/models/RecurrenceMode;",
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
.field public static final INSTANCE:Lcom/revenuecat/purchases/models/RecurrenceModeSerializer;

.field private static final descriptor:LTf/e;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/models/RecurrenceModeSerializer;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/revenuecat/purchases/models/RecurrenceModeSerializer;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/revenuecat/purchases/models/RecurrenceModeSerializer;->INSTANCE:Lcom/revenuecat/purchases/models/RecurrenceModeSerializer;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    new-array v0, v0, [LTf/e;

    .line 10
    .line 11
    sget-object v1, Lcom/revenuecat/purchases/models/RecurrenceModeSerializer$descriptor$1;->INSTANCE:Lcom/revenuecat/purchases/models/RecurrenceModeSerializer$descriptor$1;

    .line 12
    .line 13
    const-string v2, "RecurrenceMode"

    .line 14
    .line 15
    invoke-static {v2, v0, v1}, LTf/k;->c(Ljava/lang/String;[LTf/e;Lkotlin/jvm/functions/Function1;)LTf/e;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lcom/revenuecat/purchases/models/RecurrenceModeSerializer;->descriptor:LTf/e;

    .line 20
    .line 21
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


# virtual methods
.method public deserialize(LUf/e;)Lcom/revenuecat/purchases/models/RecurrenceMode;
    .locals 5

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/RecurrenceModeSerializer;->getDescriptor()LTf/e;

    move-result-object v0

    .line 3
    invoke-interface {p1, v0}, LUf/e;->b(LTf/e;)LUf/c;

    move-result-object p1

    .line 4
    const-string v1, ""

    .line 5
    :goto_0
    sget-object v2, Lcom/revenuecat/purchases/models/RecurrenceModeSerializer;->INSTANCE:Lcom/revenuecat/purchases/models/RecurrenceModeSerializer;

    invoke-virtual {v2}, Lcom/revenuecat/purchases/models/RecurrenceModeSerializer;->getDescriptor()LTf/e;

    move-result-object v3

    invoke-interface {p1, v3}, LUf/c;->i(LTf/e;)I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_1

    if-nez v3, :cond_0

    .line 6
    invoke-virtual {v2}, Lcom/revenuecat/purchases/models/RecurrenceModeSerializer;->getDescriptor()LTf/e;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {p1, v1, v2}, LUf/c;->l(LTf/e;I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 7
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 8
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

    .line 9
    :cond_1
    invoke-static {v1}, Lcom/revenuecat/purchases/models/RecurrenceMode;->valueOf(Ljava/lang/String;)Lcom/revenuecat/purchases/models/RecurrenceMode;

    move-result-object v1

    .line 10
    invoke-interface {p1, v0}, LUf/c;->c(LTf/e;)V

    return-object v1
.end method

.method public bridge synthetic deserialize(LUf/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/revenuecat/purchases/models/RecurrenceModeSerializer;->deserialize(LUf/e;)Lcom/revenuecat/purchases/models/RecurrenceMode;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()LTf/e;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/models/RecurrenceModeSerializer;->descriptor:LTf/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public serialize(LUf/f;Lcom/revenuecat/purchases/models/RecurrenceMode;)V
    .locals 3

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/RecurrenceModeSerializer;->getDescriptor()LTf/e;

    move-result-object v0

    .line 3
    invoke-interface {p1, v0}, LUf/f;->b(LTf/e;)LUf/d;

    move-result-object p1

    .line 4
    sget-object v1, Lcom/revenuecat/purchases/models/RecurrenceModeSerializer;->INSTANCE:Lcom/revenuecat/purchases/models/RecurrenceModeSerializer;

    invoke-virtual {v1}, Lcom/revenuecat/purchases/models/RecurrenceModeSerializer;->getDescriptor()LTf/e;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v1, v2, p2}, LUf/d;->k(LTf/e;ILjava/lang/String;)V

    .line 5
    invoke-interface {p1, v0}, LUf/d;->c(LTf/e;)V

    return-void
.end method

.method public bridge synthetic serialize(LUf/f;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/revenuecat/purchases/models/RecurrenceMode;

    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/models/RecurrenceModeSerializer;->serialize(LUf/f;Lcom/revenuecat/purchases/models/RecurrenceMode;)V

    return-void
.end method
