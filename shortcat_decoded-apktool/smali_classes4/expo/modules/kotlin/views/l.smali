.class public final Lexpo/modules/kotlin/views/l;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/facebook/react/bridge/ReadableMapKeySetIterator;


# instance fields
.field private final a:Lcom/facebook/react/bridge/ReadableMapKeySetIterator;

.field private final b:LUb/l;

.field private c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReadableMapKeySetIterator;LUb/l;)V
    .locals 1

    .line 1
    const-string v0, "iterator"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "filter"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lexpo/modules/kotlin/views/l;->a:Lcom/facebook/react/bridge/ReadableMapKeySetIterator;

    .line 15
    .line 16
    iput-object p2, p0, Lexpo/modules/kotlin/views/l;->b:LUb/l;

    .line 17
    .line 18
    invoke-direct {p0}, Lexpo/modules/kotlin/views/l;->a()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method private final a()V
    .locals 2

    .line 1
    :cond_0
    iget-object v0, p0, Lexpo/modules/kotlin/views/l;->a:Lcom/facebook/react/bridge/ReadableMapKeySetIterator;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/bridge/ReadableMapKeySetIterator;->hasNextKey()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lexpo/modules/kotlin/views/l;->a:Lcom/facebook/react/bridge/ReadableMapKeySetIterator;

    .line 10
    .line 11
    invoke-interface {v0}, Lcom/facebook/react/bridge/ReadableMapKeySetIterator;->nextKey()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lexpo/modules/kotlin/views/l;->c:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v1, p0, Lexpo/modules/kotlin/views/l;->b:LUb/l;

    .line 18
    .line 19
    invoke-interface {v1, v0}, LUb/l;->apply(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    const/4 v0, 0x0

    .line 27
    iput-object v0, p0, Lexpo/modules/kotlin/views/l;->c:Ljava/lang/String;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public hasNextKey()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/views/l;->c:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public nextKey()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/views/l;->c:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lexpo/modules/kotlin/views/l;->a()V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method
