.class public abstract Lcom/revenuecat/purchases/utils/serializers/EmptyObjectToNullSerializer;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LRf/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LRf/b;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008 \u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0003B\u001f\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0019\u0010\u000b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ!\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0008\u0010\u000f\u001a\u0004\u0018\u00018\u0000H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/revenuecat/purchases/utils/serializers/EmptyObjectToNullSerializer;",
        "",
        "T",
        "LRf/b;",
        "delegate",
        "",
        "resilient",
        "<init>",
        "(LRf/b;Z)V",
        "LUf/e;",
        "decoder",
        "deserialize",
        "(LUf/e;)Ljava/lang/Object;",
        "LUf/f;",
        "encoder",
        "value",
        "LTd/L;",
        "serialize",
        "(LUf/f;Ljava/lang/Object;)V",
        "LRf/b;",
        "Z",
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


# instance fields
.field private final delegate:LRf/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LRf/b;"
        }
    .end annotation
.end field

.field private final descriptor:LTf/e;

.field private final resilient:Z


# direct methods
.method public constructor <init>(LRf/b;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LRf/b;",
            "Z)V"
        }
    .end annotation

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/revenuecat/purchases/utils/serializers/EmptyObjectToNullSerializer;->delegate:LRf/b;

    .line 3
    iput-boolean p2, p0, Lcom/revenuecat/purchases/utils/serializers/EmptyObjectToNullSerializer;->resilient:Z

    .line 4
    invoke-interface {p1}, LRf/b;->getDescriptor()LTf/e;

    move-result-object p1

    iput-object p1, p0, Lcom/revenuecat/purchases/utils/serializers/EmptyObjectToNullSerializer;->descriptor:LTf/e;

    return-void
.end method

.method public synthetic constructor <init>(LRf/b;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x1

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/revenuecat/purchases/utils/serializers/EmptyObjectToNullSerializer;-><init>(LRf/b;Z)V

    return-void
.end method


# virtual methods
.method public deserialize(LUf/e;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LUf/e;",
            ")TT;"
        }
    .end annotation

    .line 1
    const-string v0, "decoder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, LWf/h;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    move-object v0, p1

    .line 12
    check-cast v0, LWf/h;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v0, v1

    .line 16
    :goto_0
    if-nez v0, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, Lcom/revenuecat/purchases/utils/serializers/EmptyObjectToNullSerializer;->delegate:LRf/b;

    .line 19
    .line 20
    invoke-interface {v0, p1}, LRf/a;->deserialize(LUf/e;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1

    .line 25
    :cond_1
    invoke-interface {v0}, LWf/h;->g()LWf/i;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    instance-of v2, p1, LWf/C;

    .line 30
    .line 31
    if-eqz v2, :cond_4

    .line 32
    .line 33
    move-object v2, p1

    .line 34
    check-cast v2, LWf/C;

    .line 35
    .line 36
    invoke-virtual {v2}, LWf/C;->isEmpty()Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_2

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    iget-boolean v2, p0, Lcom/revenuecat/purchases/utils/serializers/EmptyObjectToNullSerializer;->resilient:Z

    .line 44
    .line 45
    if-eqz v2, :cond_3

    .line 46
    .line 47
    :try_start_0
    invoke-interface {v0}, LWf/h;->d()LWf/b;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iget-object v2, p0, Lcom/revenuecat/purchases/utils/serializers/EmptyObjectToNullSerializer;->delegate:LRf/b;

    .line 52
    .line 53
    invoke-virtual {v0, v2, p1}, LWf/b;->c(LRf/a;LWf/i;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1
    :try_end_0
    .catch LRf/j; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    :catch_0
    return-object v1

    .line 58
    :cond_3
    invoke-interface {v0}, LWf/h;->d()LWf/b;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iget-object v1, p0, Lcom/revenuecat/purchases/utils/serializers/EmptyObjectToNullSerializer;->delegate:LRf/b;

    .line 63
    .line 64
    invoke-virtual {v0, v1, p1}, LWf/b;->c(LRf/a;LWf/i;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    return-object p1

    .line 69
    :cond_4
    :goto_1
    return-object v1
.end method

.method public getDescriptor()LTf/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/utils/serializers/EmptyObjectToNullSerializer;->descriptor:LTf/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public serialize(LUf/f;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LUf/f;",
            "TT;)V"
        }
    .end annotation

    .line 1
    const-string v0, "encoder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lcom/revenuecat/purchases/utils/serializers/EmptyObjectToNullSerializer;->delegate:LRf/b;

    .line 9
    .line 10
    invoke-interface {v0, p1, p2}, LRf/k;->serialize(LUf/f;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method
