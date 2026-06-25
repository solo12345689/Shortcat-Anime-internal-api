.class public final Lcom/revenuecat/purchases/paywalls/components/ActionSurrogate$$serializer;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LVf/E;


# annotations
.annotation runtime LTd/e;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/revenuecat/purchases/paywalls/components/ActionSurrogate;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LVf/E;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00060\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "com/revenuecat/purchases/paywalls/components/ActionSurrogate.$serializer",
        "LVf/E;",
        "Lcom/revenuecat/purchases/paywalls/components/ActionSurrogate;",
        "<init>",
        "()V",
        "",
        "LRf/b;",
        "childSerializers",
        "()[LRf/b;",
        "LUf/e;",
        "decoder",
        "deserialize",
        "(LUf/e;)Lcom/revenuecat/purchases/paywalls/components/ActionSurrogate;",
        "LUf/f;",
        "encoder",
        "value",
        "LTd/L;",
        "serialize",
        "(LUf/f;Lcom/revenuecat/purchases/paywalls/components/ActionSurrogate;)V",
        "LTf/e;",
        "getDescriptor",
        "()LTf/e;",
        "descriptor",
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
.field public static final INSTANCE:Lcom/revenuecat/purchases/paywalls/components/ActionSurrogate$$serializer;

.field private static final synthetic descriptor:LVf/k0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/paywalls/components/ActionSurrogate$$serializer;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/revenuecat/purchases/paywalls/components/ActionSurrogate$$serializer;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/revenuecat/purchases/paywalls/components/ActionSurrogate$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/ActionSurrogate$$serializer;

    .line 7
    .line 8
    new-instance v1, LVf/k0;

    .line 9
    .line 10
    const-string v2, "com.revenuecat.purchases.paywalls.components.ActionSurrogate"

    .line 11
    .line 12
    const/4 v3, 0x4

    .line 13
    invoke-direct {v1, v2, v0, v3}, LVf/k0;-><init>(Ljava/lang/String;LVf/E;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "type"

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "destination"

    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "url"

    .line 29
    .line 30
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const-string v0, "sheet"

    .line 34
    .line 35
    invoke-virtual {v1, v0, v2}, LVf/k0;->g(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    sput-object v1, Lcom/revenuecat/purchases/paywalls/components/ActionSurrogate$$serializer;->descriptor:LVf/k0;

    .line 39
    .line 40
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
.method public childSerializers()[LRf/b;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "LRf/b;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/paywalls/components/DestinationSurrogateDeserializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/DestinationSurrogateDeserializer;

    .line 2
    .line 3
    invoke-static {v0}, LSf/a;->p(LRf/b;)LRf/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lcom/revenuecat/purchases/paywalls/components/UrlSurrogate$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/UrlSurrogate$$serializer;

    .line 8
    .line 9
    invoke-static {v1}, LSf/a;->p(LRf/b;)LRf/b;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    sget-object v2, Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Sheet$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Sheet$$serializer;

    .line 14
    .line 15
    invoke-static {v2}, LSf/a;->p(LRf/b;)LRf/b;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const/4 v3, 0x4

    .line 20
    new-array v3, v3, [LRf/b;

    .line 21
    .line 22
    sget-object v4, Lcom/revenuecat/purchases/paywalls/components/ActionTypeSurrogateDeserializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/ActionTypeSurrogateDeserializer;

    .line 23
    .line 24
    const/4 v5, 0x0

    .line 25
    aput-object v4, v3, v5

    .line 26
    .line 27
    const/4 v4, 0x1

    .line 28
    aput-object v0, v3, v4

    .line 29
    .line 30
    const/4 v0, 0x2

    .line 31
    aput-object v1, v3, v0

    .line 32
    .line 33
    const/4 v0, 0x3

    .line 34
    aput-object v2, v3, v0

    .line 35
    .line 36
    return-object v3
.end method

.method public deserialize(LUf/e;)Lcom/revenuecat/purchases/paywalls/components/ActionSurrogate;
    .locals 19

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual/range {p0 .. p0}, Lcom/revenuecat/purchases/paywalls/components/ActionSurrogate$$serializer;->getDescriptor()LTf/e;

    move-result-object v1

    invoke-interface {v0, v1}, LUf/e;->b(LTf/e;)LUf/c;

    move-result-object v0

    invoke-interface {v0}, LUf/c;->p()Z

    move-result v2

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    if-eqz v2, :cond_0

    sget-object v2, Lcom/revenuecat/purchases/paywalls/components/ActionTypeSurrogateDeserializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/ActionTypeSurrogateDeserializer;

    invoke-interface {v0, v1, v6, v2, v7}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/revenuecat/purchases/paywalls/components/ActionTypeSurrogate;

    sget-object v6, Lcom/revenuecat/purchases/paywalls/components/DestinationSurrogateDeserializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/DestinationSurrogateDeserializer;

    invoke-interface {v0, v1, v5, v6, v7}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/revenuecat/purchases/paywalls/components/DestinationSurrogate;

    sget-object v6, Lcom/revenuecat/purchases/paywalls/components/UrlSurrogate$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/UrlSurrogate$$serializer;

    invoke-interface {v0, v1, v4, v6, v7}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/revenuecat/purchases/paywalls/components/UrlSurrogate;

    sget-object v6, Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Sheet$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Sheet$$serializer;

    invoke-interface {v0, v1, v3, v6, v7}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Sheet;

    const/16 v6, 0xf

    move-object v14, v2

    move-object/from16 v17, v3

    move-object/from16 v16, v4

    move-object v15, v5

    move v13, v6

    goto :goto_1

    :cond_0
    move v11, v5

    move v2, v6

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    :goto_0
    if-eqz v11, :cond_6

    invoke-interface {v0, v1}, LUf/c;->i(LTf/e;)I

    move-result v12

    const/4 v13, -0x1

    if-eq v12, v13, :cond_5

    if-eqz v12, :cond_4

    if-eq v12, v5, :cond_3

    if-eq v12, v4, :cond_2

    if-ne v12, v3, :cond_1

    sget-object v12, Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Sheet$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Sheet$$serializer;

    invoke-interface {v0, v1, v3, v12, v10}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Sheet;

    or-int/lit8 v2, v2, 0x8

    goto :goto_0

    :cond_1
    new-instance v0, LRf/m;

    invoke-direct {v0, v12}, LRf/m;-><init>(I)V

    throw v0

    :cond_2
    sget-object v12, Lcom/revenuecat/purchases/paywalls/components/UrlSurrogate$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/UrlSurrogate$$serializer;

    invoke-interface {v0, v1, v4, v12, v9}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/revenuecat/purchases/paywalls/components/UrlSurrogate;

    or-int/lit8 v2, v2, 0x4

    goto :goto_0

    :cond_3
    sget-object v12, Lcom/revenuecat/purchases/paywalls/components/DestinationSurrogateDeserializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/DestinationSurrogateDeserializer;

    invoke-interface {v0, v1, v5, v12, v8}, LUf/c;->B(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/revenuecat/purchases/paywalls/components/DestinationSurrogate;

    or-int/lit8 v2, v2, 0x2

    goto :goto_0

    :cond_4
    sget-object v12, Lcom/revenuecat/purchases/paywalls/components/ActionTypeSurrogateDeserializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/ActionTypeSurrogateDeserializer;

    invoke-interface {v0, v1, v6, v12, v7}, LUf/c;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/revenuecat/purchases/paywalls/components/ActionTypeSurrogate;

    or-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_5
    move v11, v6

    goto :goto_0

    :cond_6
    move v13, v2

    move-object v14, v7

    move-object v15, v8

    move-object/from16 v16, v9

    move-object/from16 v17, v10

    :goto_1
    invoke-interface {v0, v1}, LUf/c;->c(LTf/e;)V

    new-instance v12, Lcom/revenuecat/purchases/paywalls/components/ActionSurrogate;

    const/16 v18, 0x0

    invoke-direct/range {v12 .. v18}, Lcom/revenuecat/purchases/paywalls/components/ActionSurrogate;-><init>(ILcom/revenuecat/purchases/paywalls/components/ActionTypeSurrogate;Lcom/revenuecat/purchases/paywalls/components/DestinationSurrogate;Lcom/revenuecat/purchases/paywalls/components/UrlSurrogate;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Sheet;LVf/t0;)V

    return-object v12
.end method

.method public bridge synthetic deserialize(LUf/e;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/revenuecat/purchases/paywalls/components/ActionSurrogate$$serializer;->deserialize(LUf/e;)Lcom/revenuecat/purchases/paywalls/components/ActionSurrogate;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()LTf/e;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/paywalls/components/ActionSurrogate$$serializer;->descriptor:LVf/k0;

    .line 2
    .line 3
    return-object v0
.end method

.method public serialize(LUf/f;Lcom/revenuecat/purchases/paywalls/components/ActionSurrogate;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/ActionSurrogate$$serializer;->getDescriptor()LTf/e;

    move-result-object v0

    invoke-interface {p1, v0}, LUf/f;->b(LTf/e;)LUf/d;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/revenuecat/purchases/paywalls/components/ActionSurrogate;->write$Self$purchases_defaultsBc8Release(Lcom/revenuecat/purchases/paywalls/components/ActionSurrogate;LUf/d;LTf/e;)V

    invoke-interface {p1, v0}, LUf/d;->c(LTf/e;)V

    return-void
.end method

.method public bridge synthetic serialize(LUf/f;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/revenuecat/purchases/paywalls/components/ActionSurrogate;

    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/paywalls/components/ActionSurrogate$$serializer;->serialize(LUf/f;Lcom/revenuecat/purchases/paywalls/components/ActionSurrogate;)V

    return-void
.end method

.method public typeParametersSerializers()[LRf/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "LRf/b;"
        }
    .end annotation

    .line 1
    invoke-static {p0}, LVf/E$a;->a(LVf/E;)[LRf/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
