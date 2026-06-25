.class public final Lcom/revenuecat/purchases/CustomVariableDefinitionSerializer;
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
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c1\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001f\u0010\r\u001a\u00020\u000c2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/revenuecat/purchases/CustomVariableDefinitionSerializer;",
        "LRf/b;",
        "Lcom/revenuecat/purchases/UiConfig$CustomVariableDefinition;",
        "<init>",
        "()V",
        "LUf/e;",
        "decoder",
        "deserialize",
        "(LUf/e;)Lcom/revenuecat/purchases/UiConfig$CustomVariableDefinition;",
        "LUf/f;",
        "encoder",
        "value",
        "LTd/L;",
        "serialize",
        "(LUf/f;Lcom/revenuecat/purchases/UiConfig$CustomVariableDefinition;)V",
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
.field public static final INSTANCE:Lcom/revenuecat/purchases/CustomVariableDefinitionSerializer;

.field private static final descriptor:LTf/e;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/CustomVariableDefinitionSerializer;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/revenuecat/purchases/CustomVariableDefinitionSerializer;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/revenuecat/purchases/CustomVariableDefinitionSerializer;->INSTANCE:Lcom/revenuecat/purchases/CustomVariableDefinitionSerializer;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    new-array v0, v0, [LTf/e;

    .line 10
    .line 11
    sget-object v1, Lcom/revenuecat/purchases/CustomVariableDefinitionSerializer$descriptor$1;->INSTANCE:Lcom/revenuecat/purchases/CustomVariableDefinitionSerializer$descriptor$1;

    .line 12
    .line 13
    const-string v2, "CustomVariableDefinition"

    .line 14
    .line 15
    invoke-static {v2, v0, v1}, LTf/k;->c(Ljava/lang/String;[LTf/e;Lkotlin/jvm/functions/Function1;)LTf/e;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lcom/revenuecat/purchases/CustomVariableDefinitionSerializer;->descriptor:LTf/e;

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
.method public deserialize(LUf/e;)Lcom/revenuecat/purchases/UiConfig$CustomVariableDefinition;
    .locals 4

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    instance-of v0, p1, LWf/h;

    if-eqz v0, :cond_b

    .line 3
    check-cast p1, LWf/h;

    invoke-interface {p1}, LWf/h;->g()LWf/i;

    move-result-object p1

    invoke-static {p1}, LWf/j;->n(LWf/i;)LWf/C;

    move-result-object p1

    .line 4
    const-string v0, "type"

    invoke-virtual {p1, v0}, LWf/C;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LWf/i;

    const-string v1, "string"

    if-eqz v0, :cond_0

    invoke-static {v0}, LWf/j;->o(LWf/i;)LWf/E;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LWf/E;->b()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    move-object v0, v1

    .line 5
    :cond_1
    const-string v2, "default_value"

    invoke-virtual {p1, v2}, LWf/C;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v2, p1, LWf/E;

    if-eqz v2, :cond_2

    check-cast p1, LWf/E;

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_3

    .line 6
    new-instance p1, Lcom/revenuecat/purchases/UiConfig$CustomVariableDefinition;

    const-string v1, ""

    invoke-direct {p1, v0, v1}, Lcom/revenuecat/purchases/UiConfig$CustomVariableDefinition;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    return-object p1

    .line 7
    :cond_3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v2

    const v3, -0x3da724b7

    if-eq v2, v3, :cond_7

    const v3, -0x352a9fef    # -6991880.5f

    if-eq v2, v3, :cond_6

    const v1, 0x3db6c28

    if-eq v2, v1, :cond_4

    goto :goto_1

    :cond_4
    const-string v1, "boolean"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_1

    .line 8
    :cond_5
    invoke-static {p1}, LWf/j;->e(LWf/E;)Ljava/lang/Boolean;

    move-result-object v1

    if-nez v1, :cond_a

    .line 9
    invoke-virtual {p1}, LWf/E;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LDf/r;->j1(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v1

    if-nez v1, :cond_a

    .line 10
    invoke-virtual {p1}, LWf/E;->b()Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    .line 11
    :cond_6
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 12
    invoke-virtual {p1}, LWf/E;->b()Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    .line 13
    :cond_7
    const-string v1, "number"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    .line 14
    :cond_8
    :goto_1
    invoke-virtual {p1}, LWf/E;->b()Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    .line 15
    :cond_9
    invoke-static {p1}, LWf/j;->h(LWf/E;)Ljava/lang/Double;

    move-result-object v1

    if-nez v1, :cond_a

    .line 16
    invoke-virtual {p1}, LWf/E;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LDf/r;->o(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v1

    if-nez v1, :cond_a

    .line 17
    invoke-virtual {p1}, LWf/E;->b()Ljava/lang/String;

    move-result-object v1

    .line 18
    :cond_a
    :goto_2
    new-instance p1, Lcom/revenuecat/purchases/UiConfig$CustomVariableDefinition;

    invoke-direct {p1, v0, v1}, Lcom/revenuecat/purchases/UiConfig$CustomVariableDefinition;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    return-object p1

    .line 19
    :cond_b
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "CustomVariableDefinition can only be deserialized from JSON"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic deserialize(LUf/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/revenuecat/purchases/CustomVariableDefinitionSerializer;->deserialize(LUf/e;)Lcom/revenuecat/purchases/UiConfig$CustomVariableDefinition;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()LTf/e;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/CustomVariableDefinitionSerializer;->descriptor:LTf/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public serialize(LUf/f;Lcom/revenuecat/purchases/UiConfig$CustomVariableDefinition;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "value"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/IllegalStateException;

    .line 2
    const-string p2, "Serialization of CustomVariableDefinition is not implemented as it is not needed."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic serialize(LUf/f;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/revenuecat/purchases/UiConfig$CustomVariableDefinition;

    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/CustomVariableDefinitionSerializer;->serialize(LUf/f;Lcom/revenuecat/purchases/UiConfig$CustomVariableDefinition;)V

    return-void
.end method
