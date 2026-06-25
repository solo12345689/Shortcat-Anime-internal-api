.class final Lcom/google/common/util/concurrent/j$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/common/util/concurrent/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field final a:Ljava/util/concurrent/Future;

.field final b:Lcom/google/common/util/concurrent/i;


# direct methods
.method constructor <init>(Ljava/util/concurrent/Future;Lcom/google/common/util/concurrent/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/common/util/concurrent/j$a;->a:Ljava/util/concurrent/Future;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/common/util/concurrent/j$a;->b:Lcom/google/common/util/concurrent/i;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/common/util/concurrent/j$a;->a:Ljava/util/concurrent/Future;

    .line 2
    .line 3
    instance-of v1, v0, LT9/a;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, LT9/a;

    .line 8
    .line 9
    invoke-static {v0}, LT9/b;->a(LT9/a;)Ljava/lang/Throwable;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, Lcom/google/common/util/concurrent/j$a;->b:Lcom/google/common/util/concurrent/i;

    .line 16
    .line 17
    invoke-interface {v1, v0}, Lcom/google/common/util/concurrent/i;->a(Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/google/common/util/concurrent/j$a;->a:Ljava/util/concurrent/Future;

    .line 22
    .line 23
    invoke-static {v0}, Lcom/google/common/util/concurrent/j;->b(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    iget-object v1, p0, Lcom/google/common/util/concurrent/j$a;->b:Lcom/google/common/util/concurrent/i;

    .line 28
    .line 29
    invoke-interface {v1, v0}, Lcom/google/common/util/concurrent/i;->onSuccess(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :catchall_0
    move-exception v0

    .line 34
    goto :goto_0

    .line 35
    :catch_0
    move-exception v0

    .line 36
    goto :goto_1

    .line 37
    :goto_0
    iget-object v1, p0, Lcom/google/common/util/concurrent/j$a;->b:Lcom/google/common/util/concurrent/i;

    .line 38
    .line 39
    invoke-interface {v1, v0}, Lcom/google/common/util/concurrent/i;->a(Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :goto_1
    iget-object v1, p0, Lcom/google/common/util/concurrent/j$a;->b:Lcom/google/common/util/concurrent/i;

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-interface {v1, v0}, Lcom/google/common/util/concurrent/i;->a(Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {p0}, LO9/h;->b(Ljava/lang/Object;)LO9/h$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/google/common/util/concurrent/j$a;->b:Lcom/google/common/util/concurrent/i;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, LO9/h$b;->c(Ljava/lang/Object;)LO9/h$b;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, LO9/h$b;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method
