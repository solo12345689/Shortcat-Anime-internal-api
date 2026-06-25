.class final Ln9/o;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ln9/i;

.field final synthetic b:Ln9/p;


# direct methods
.method constructor <init>(Ln9/p;Ln9/i;)V
    .locals 0

    .line 1
    iput-object p2, p0, Ln9/o;->a:Ln9/i;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Ln9/o;->b:Ln9/p;

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
    .locals 2

    .line 1
    iget-object v0, p0, Ln9/o;->a:Ln9/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln9/i;->m()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Ln9/o;->b:Ln9/p;

    .line 10
    .line 11
    invoke-virtual {v0}, Ln9/p;->c()Ln9/G;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ln9/G;->v()Z

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    :try_start_0
    iget-object v1, p0, Ln9/o;->b:Ln9/p;

    .line 20
    .line 21
    invoke-virtual {v1}, Ln9/p;->a()Ln9/a;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-interface {v1, v0}, Ln9/a;->a(Ln9/i;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0
    :try_end_0
    .catch Ln9/g; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    iget-object v1, p0, Ln9/o;->b:Ln9/p;

    .line 30
    .line 31
    invoke-virtual {v1}, Ln9/p;->c()Ln9/G;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1, v0}, Ln9/G;->r(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :catch_0
    move-exception v0

    .line 40
    goto :goto_0

    .line 41
    :catch_1
    move-exception v0

    .line 42
    goto :goto_1

    .line 43
    :goto_0
    iget-object v1, p0, Ln9/o;->b:Ln9/p;

    .line 44
    .line 45
    invoke-virtual {v1}, Ln9/p;->c()Ln9/G;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v1, v0}, Ln9/G;->t(Ljava/lang/Exception;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    instance-of v1, v1, Ljava/lang/Exception;

    .line 58
    .line 59
    if-eqz v1, :cond_1

    .line 60
    .line 61
    iget-object v1, p0, Ln9/o;->b:Ln9/p;

    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    check-cast v0, Ljava/lang/Exception;

    .line 68
    .line 69
    invoke-virtual {v1}, Ln9/p;->c()Ln9/G;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {v1, v0}, Ln9/G;->t(Ljava/lang/Exception;)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_1
    iget-object v1, p0, Ln9/o;->b:Ln9/p;

    .line 78
    .line 79
    invoke-virtual {v1}, Ln9/p;->c()Ln9/G;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-virtual {v1, v0}, Ln9/G;->t(Ljava/lang/Exception;)V

    .line 84
    .line 85
    .line 86
    return-void
.end method
