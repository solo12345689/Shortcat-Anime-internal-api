.class final Ln9/A;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ln9/i;

.field final synthetic b:Ln9/B;


# direct methods
.method constructor <init>(Ln9/B;Ln9/i;)V
    .locals 0

    .line 1
    iput-object p2, p0, Ln9/A;->a:Ln9/i;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Ln9/A;->b:Ln9/B;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Ln9/A;->b:Ln9/B;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln9/B;->c()Ln9/h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Ln9/A;->a:Ln9/i;

    .line 8
    .line 9
    invoke-virtual {v1}, Ln9/i;->k()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v0, v1}, Ln9/h;->a(Ljava/lang/Object;)Ln9/i;

    .line 14
    .line 15
    .line 16
    move-result-object v0
    :try_end_0
    .catch Ln9/g; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Ln9/A;->b:Ln9/B;

    .line 20
    .line 21
    new-instance v1, Ljava/lang/NullPointerException;

    .line 22
    .line 23
    const-string v2, "Continuation returned null"

    .line 24
    .line 25
    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ln9/B;->onFailure(Ljava/lang/Exception;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    iget-object v1, p0, Ln9/A;->b:Ln9/B;

    .line 33
    .line 34
    sget-object v2, Ln9/k;->b:Ljava/util/concurrent/Executor;

    .line 35
    .line 36
    invoke-virtual {v0, v2, v1}, Ln9/i;->f(Ljava/util/concurrent/Executor;Ln9/f;)Ln9/i;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v2, v1}, Ln9/i;->d(Ljava/util/concurrent/Executor;Ln9/e;)Ln9/i;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v2, v1}, Ln9/i;->a(Ljava/util/concurrent/Executor;Ln9/c;)Ln9/i;

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :catch_0
    move-exception v0

    .line 47
    goto :goto_0

    .line 48
    :catch_1
    move-exception v0

    .line 49
    goto :goto_1

    .line 50
    :goto_0
    iget-object v1, p0, Ln9/A;->b:Ln9/B;

    .line 51
    .line 52
    invoke-virtual {v1, v0}, Ln9/B;->onFailure(Ljava/lang/Exception;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :catch_2
    iget-object v0, p0, Ln9/A;->b:Ln9/B;

    .line 57
    .line 58
    invoke-virtual {v0}, Ln9/B;->a()V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    instance-of v1, v1, Ljava/lang/Exception;

    .line 67
    .line 68
    if-eqz v1, :cond_1

    .line 69
    .line 70
    iget-object v1, p0, Ln9/A;->b:Ln9/B;

    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    check-cast v0, Ljava/lang/Exception;

    .line 77
    .line 78
    invoke-virtual {v1, v0}, Ln9/B;->onFailure(Ljava/lang/Exception;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_1
    iget-object v1, p0, Ln9/A;->b:Ln9/B;

    .line 83
    .line 84
    invoke-virtual {v1, v0}, Ln9/B;->onFailure(Ljava/lang/Exception;)V

    .line 85
    .line 86
    .line 87
    return-void
.end method
