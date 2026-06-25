.class final Lcom/facebook/react/animated/NativeAnimatedModule$c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/animated/NativeAnimatedModule;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation


# instance fields
.field private final a:Ljava/util/Queue;

.field private b:Lcom/facebook/react/animated/NativeAnimatedModule$d;

.field final synthetic c:Lcom/facebook/react/animated/NativeAnimatedModule;


# direct methods
.method public constructor <init>(Lcom/facebook/react/animated/NativeAnimatedModule;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$c;->c:Lcom/facebook/react/animated/NativeAnimatedModule;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$c;->a:Ljava/util/Queue;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a(Lcom/facebook/react/animated/NativeAnimatedModule$d;)V
    .locals 1

    .line 1
    const-string v0, "operation"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule$c;->a:Ljava/util/Queue;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final b(J)Ljava/util/List;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/animated/NativeAnimatedModule$c;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    :goto_0
    iget-object v2, p0, Lcom/facebook/react/animated/NativeAnimatedModule$c;->b:Lcom/facebook/react/animated/NativeAnimatedModule$d;

    .line 15
    .line 16
    if-eqz v2, :cond_2

    .line 17
    .line 18
    invoke-virtual {v2}, Lcom/facebook/react/animated/NativeAnimatedModule$d;->b()J

    .line 19
    .line 20
    .line 21
    move-result-wide v3

    .line 22
    cmp-long v3, v3, p1

    .line 23
    .line 24
    if-lez v3, :cond_1

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    iput-object v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$c;->b:Lcom/facebook/react/animated/NativeAnimatedModule$d;

    .line 31
    .line 32
    :cond_2
    iget-object v2, p0, Lcom/facebook/react/animated/NativeAnimatedModule$c;->a:Ljava/util/Queue;

    .line 33
    .line 34
    invoke-interface {v2}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    check-cast v2, Lcom/facebook/react/animated/NativeAnimatedModule$d;

    .line 39
    .line 40
    if-nez v2, :cond_3

    .line 41
    .line 42
    :goto_1
    return-object v0

    .line 43
    :cond_3
    invoke-virtual {v2}, Lcom/facebook/react/animated/NativeAnimatedModule$d;->b()J

    .line 44
    .line 45
    .line 46
    move-result-wide v3

    .line 47
    cmp-long v3, v3, p1

    .line 48
    .line 49
    if-lez v3, :cond_4

    .line 50
    .line 51
    iput-object v2, p0, Lcom/facebook/react/animated/NativeAnimatedModule$c;->b:Lcom/facebook/react/animated/NativeAnimatedModule$d;

    .line 52
    .line 53
    return-object v0

    .line 54
    :cond_4
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    goto :goto_0
.end method

.method public final c(JLT6/t;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/animated/NativeAnimatedModule$c;->b(J)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    if-eqz p2, :cond_1

    .line 16
    .line 17
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    check-cast p2, Lcom/facebook/react/animated/NativeAnimatedModule$d;

    .line 22
    .line 23
    if-eqz p3, :cond_0

    .line 24
    .line 25
    invoke-virtual {p2, p3}, Lcom/facebook/react/animated/NativeAnimatedModule$d;->a(LT6/t;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 30
    .line 31
    const-string p2, "Required value was null."

    .line 32
    .line 33
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw p1

    .line 37
    :cond_1
    return-void
.end method

.method public final d()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule$c;->a:Ljava/util/Queue;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule$c;->b:Lcom/facebook/react/animated/NativeAnimatedModule$d;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
.end method
