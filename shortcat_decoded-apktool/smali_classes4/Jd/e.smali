.class public final LJd/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LE3/h3$d;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public f(LE3/h3;LE3/h3$g;LE3/T6;Landroid/os/Bundle;)Lcom/google/common/util/concurrent/p;
    .locals 5

    .line 1
    const-string v0, "session"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "controller"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "customCommand"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "args"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p3, LE3/T6;->b:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    const v2, -0x4b521f9e

    .line 28
    .line 29
    .line 30
    const-wide/16 v3, 0x2710

    .line 31
    .line 32
    if-eq v1, v2, :cond_2

    .line 33
    .line 34
    const v2, 0x771393de

    .line 35
    .line 36
    .line 37
    if-eq v1, v2, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const-string v1, "SEEK_FORWARD"

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-nez v0, :cond_1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    invoke-virtual {p1}, LE3/h3;->j()Lq2/P;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {p1}, LE3/h3;->j()Lq2/P;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-interface {v1}, Lq2/P;->getCurrentPosition()J

    .line 58
    .line 59
    .line 60
    move-result-wide v1

    .line 61
    add-long/2addr v1, v3

    .line 62
    invoke-interface {v0, v1, v2}, Lq2/P;->z(J)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    const-string v1, "SEEK_REWIND"

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-nez v0, :cond_3

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_3
    invoke-virtual {p1}, LE3/h3;->j()Lq2/P;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {p1}, LE3/h3;->j()Lq2/P;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-interface {v1}, Lq2/P;->getCurrentPosition()J

    .line 84
    .line 85
    .line 86
    move-result-wide v1

    .line 87
    sub-long/2addr v1, v3

    .line 88
    invoke-interface {v0, v1, v2}, Lq2/P;->z(J)V

    .line 89
    .line 90
    .line 91
    :goto_0
    invoke-super {p0, p1, p2, p3, p4}, LE3/h3$d;->f(LE3/h3;LE3/h3$g;LE3/T6;Landroid/os/Bundle;)Lcom/google/common/util/concurrent/p;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    const-string p2, "onCustomCommand(...)"

    .line 96
    .line 97
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    return-object p1
.end method

.method public j(LE3/h3;LE3/h3$g;)LE3/h3$e;
    .locals 3

    .line 1
    const-string v0, "session"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "controller"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    :try_start_0
    new-instance p2, LE3/h3$e$a;

    .line 12
    .line 13
    invoke-direct {p2, p1}, LE3/h3$e$a;-><init>(LE3/h3;)V

    .line 14
    .line 15
    .line 16
    sget-object p1, LE3/h3$e;->j:Lq2/P$b;

    .line 17
    .line 18
    invoke-virtual {p1}, Lq2/P$b;->b()Lq2/P$b$a;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const/16 v0, 0xc

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Lq2/P$b$a;->a(I)Lq2/P$b$a;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const/16 v0, 0xb

    .line 29
    .line 30
    invoke-virtual {p1, v0}, Lq2/P$b$a;->a(I)Lq2/P$b$a;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p1}, Lq2/P$b$a;->f()Lq2/P$b;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p2, p1}, LE3/h3$e$a;->b(Lq2/P$b;)LE3/h3$e$a;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    sget-object p2, LE3/h3$e;->h:LE3/U6;

    .line 43
    .line 44
    invoke-virtual {p2}, LE3/U6;->a()LE3/U6$b;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    new-instance v0, LE3/T6;

    .line 49
    .line 50
    const-string v1, "SEEK_REWIND"

    .line 51
    .line 52
    sget-object v2, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 53
    .line 54
    invoke-direct {v0, v1, v2}, LE3/T6;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p2, v0}, LE3/U6$b;->a(LE3/T6;)LE3/U6$b;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    new-instance v0, LE3/T6;

    .line 62
    .line 63
    const-string v1, "SEEK_FORWARD"

    .line 64
    .line 65
    invoke-direct {v0, v1, v2}, LE3/T6;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p2, v0}, LE3/U6$b;->a(LE3/T6;)LE3/U6$b;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    invoke-virtual {p2}, LE3/U6$b;->e()LE3/U6;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    invoke-virtual {p1, p2}, LE3/h3$e$a;->c(LE3/U6;)LE3/h3$e$a;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {p1}, LE3/h3$e$a;->a()LE3/h3$e;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    const-string p2, "build(...)"

    .line 85
    .line 86
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 87
    .line 88
    .line 89
    return-object p1

    .line 90
    :catch_0
    invoke-static {}, LE3/h3$e;->b()LE3/h3$e;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    const-string p2, "reject(...)"

    .line 95
    .line 96
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    return-object p1
.end method
