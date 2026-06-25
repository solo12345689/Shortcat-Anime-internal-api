.class public final Lcom/facebook/react/modules/network/NetworkingModule$e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ldg/v;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/modules/network/NetworkingModule;->sendRequestInternalReal(Ljava/lang/String;Ljava/lang/String;ILcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;ZIZLjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/facebook/react/bridge/ReactApplicationContext;

.field final synthetic c:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/facebook/react/bridge/ReactApplicationContext;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/modules/network/NetworkingModule$e;->a:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/facebook/react/modules/network/NetworkingModule$e;->b:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 4
    .line 5
    iput p3, p0, Lcom/facebook/react/modules/network/NetworkingModule$e;->c:I

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Ldg/v$a;)Ldg/E;
    .locals 6

    .line 1
    const-string v0, "chain"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ldg/v$a;->z()Ldg/C;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {p1, v0}, Ldg/v$a;->a(Ldg/C;)Ldg/E;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1}, Ldg/E;->a()Ldg/F;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    new-instance v1, Lv7/i;

    .line 21
    .line 22
    new-instance v2, Lcom/facebook/react/modules/network/NetworkingModule$f;

    .line 23
    .line 24
    iget-object v3, p0, Lcom/facebook/react/modules/network/NetworkingModule$e;->a:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v4, p0, Lcom/facebook/react/modules/network/NetworkingModule$e;->b:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 27
    .line 28
    iget v5, p0, Lcom/facebook/react/modules/network/NetworkingModule$e;->c:I

    .line 29
    .line 30
    invoke-direct {v2, v3, v4, v5}, Lcom/facebook/react/modules/network/NetworkingModule$f;-><init>(Ljava/lang/String;Lcom/facebook/react/bridge/ReactApplicationContext;I)V

    .line 31
    .line 32
    .line 33
    invoke-direct {v1, v0, v2}, Lv7/i;-><init>(Ldg/F;Lv7/g;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Ldg/E;->Y()Ldg/E$a;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p1, v1}, Ldg/E$a;->b(Ldg/F;)Ldg/E$a;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p1}, Ldg/E$a;->c()Ldg/E;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    return-object p1

    .line 49
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string v0, "Required value was null."

    .line 52
    .line 53
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p1
.end method
