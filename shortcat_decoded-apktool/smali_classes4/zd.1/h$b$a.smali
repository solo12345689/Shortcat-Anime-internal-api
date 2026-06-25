.class final Lzd/h$b$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzd/h$b;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lwd/s;

.field final synthetic c:Lzd/h;


# direct methods
.method constructor <init>(Lwd/s;Lzd/h;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lzd/h$b$a;->b:Lwd/s;

    .line 2
    .line 3
    iput-object p2, p0, Lzd/h$b$a;->c:Lzd/h;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static synthetic a(Lzd/h;Lwd/v;)Lwd/i$e;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lzd/h$b$a;->i(Lzd/h;Lwd/v;)Lwd/i$e;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final i(Lzd/h;Lwd/v;)Lwd/i$e;
    .locals 4

    .line 1
    invoke-virtual {p1}, Lwd/v;->a()Lwd/w$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lwd/w$a;->a()Lwd/u;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v1

    .line 14
    :goto_0
    const/4 v2, 0x0

    .line 15
    if-eqz v0, :cond_3

    .line 16
    .line 17
    new-instance p0, Lwd/i$e;

    .line 18
    .line 19
    instance-of p1, v0, Lwd/u$c;

    .line 20
    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    instance-of p1, v0, Lwd/u$b;

    .line 25
    .line 26
    if-eqz p1, :cond_2

    .line 27
    .line 28
    :goto_1
    invoke-direct {p0, v2}, Lwd/i$e;-><init>(Z)V

    .line 29
    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_2
    new-instance p0, LTd/r;

    .line 33
    .line 34
    invoke-direct {p0}, LTd/r;-><init>()V

    .line 35
    .line 36
    .line 37
    throw p0

    .line 38
    :cond_3
    invoke-virtual {p1}, Lwd/v;->b()Lwd/w$b;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    if-eqz v0, :cond_6

    .line 43
    .line 44
    invoke-virtual {v0}, Lwd/w$b;->a()Lyd/q;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    if-nez v0, :cond_4

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_4
    new-instance v2, Lwd/i$e;

    .line 52
    .line 53
    invoke-static {p0}, Lzd/h;->m(Lzd/h;)LBd/h;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-interface {v0}, Lyd/q;->c()Lrd/d;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {p0}, Lzd/h;->x()Lrd/d;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-virtual {p1}, Lwd/v;->c()Lyd/n;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    if-eqz p1, :cond_5

    .line 70
    .line 71
    invoke-virtual {p1}, Lyd/n;->d()Lorg/json/JSONObject;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    :cond_5
    invoke-virtual {v3, v0, p0, v1}, LBd/h;->c(Lrd/d;Lrd/d;Lorg/json/JSONObject;)Z

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    invoke-direct {v2, p0}, Lwd/i$e;-><init>(Z)V

    .line 80
    .line 81
    .line 82
    return-object v2

    .line 83
    :cond_6
    :goto_2
    new-instance p0, Lwd/i$e;

    .line 84
    .line 85
    invoke-direct {p0, v2}, Lwd/i$e;-><init>(Z)V

    .line 86
    .line 87
    .line 88
    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 2

    .line 1
    new-instance p1, Lzd/h$b$a;

    .line 2
    .line 3
    iget-object v0, p0, Lzd/h$b$a;->b:Lwd/s;

    .line 4
    .line 5
    iget-object v1, p0, Lzd/h$b$a;->c:Lzd/h;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lzd/h$b$a;-><init>(Lwd/s;Lzd/h;LZd/e;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lzd/h$b$a;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, Lzd/h$b$a;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, Lzd/h$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, Lzd/h$b$a;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lzd/h$b$a;->a:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    :try_start_0
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catch_0
    move-exception v0

    .line 17
    move-object p1, v0

    .line 18
    move-object v2, p1

    .line 19
    goto :goto_3

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    :try_start_1
    iget-object p1, p0, Lzd/h$b$a;->b:Lwd/s;

    .line 32
    .line 33
    iget-object v1, p0, Lzd/h$b$a;->c:Lzd/h;

    .line 34
    .line 35
    new-instance v3, Lzd/i;

    .line 36
    .line 37
    invoke-direct {v3, v1}, Lzd/i;-><init>(Lzd/h;)V

    .line 38
    .line 39
    .line 40
    iput v2, p0, Lzd/h$b$a;->a:I

    .line 41
    .line 42
    invoke-virtual {p1, v3, p0}, Lwd/i;->k(Lkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    if-ne p1, v0, :cond_2

    .line 47
    .line 48
    return-object v0

    .line 49
    :cond_2
    :goto_0
    check-cast p1, Lwd/i$d;

    .line 50
    .line 51
    iget-object v0, p0, Lzd/h$b$a;->c:Lzd/h;

    .line 52
    .line 53
    invoke-virtual {p1}, Lwd/i$d;->b()Lrd/d;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    if-nez v1, :cond_4

    .line 58
    .line 59
    invoke-virtual {p1}, Lwd/i$d;->a()Lwd/u;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    instance-of p1, p1, Lwd/u$c;

    .line 64
    .line 65
    if-eqz p1, :cond_3

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_3
    sget-object p1, Ltd/d$a;->a:Ltd/d$a;

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_4
    :goto_1
    sget-object p1, Ltd/d$a;->c:Ltd/d$a;

    .line 72
    .line 73
    :goto_2
    invoke-static {v0, p1}, Lzd/h;->s(Lzd/h;Ltd/d$a;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 74
    .line 75
    .line 76
    goto :goto_6

    .line 77
    :goto_3
    iget-object p1, p0, Lzd/h$b$a;->c:Lzd/h;

    .line 78
    .line 79
    invoke-static {p1}, Lzd/h;->i(Lzd/h;)Lxd/g;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    sget-object v3, Lxd/b;->h:Lxd/b;

    .line 84
    .line 85
    iget-object p1, p0, Lzd/h$b$a;->c:Lzd/h;

    .line 86
    .line 87
    invoke-virtual {p1}, Lzd/h;->x()Lrd/d;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    if-eqz p1, :cond_5

    .line 92
    .line 93
    invoke-virtual {p1}, Lrd/d;->h()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    :goto_4
    move-object v4, p1

    .line 98
    goto :goto_5

    .line 99
    :cond_5
    const/4 p1, 0x0

    .line 100
    goto :goto_4

    .line 101
    :goto_5
    const/4 v5, 0x0

    .line 102
    const-string v1, "UpdatesController loadRemoteUpdate onFailure"

    .line 103
    .line 104
    invoke-virtual/range {v0 .. v5}, Lxd/g;->g(Ljava/lang/String;Ljava/lang/Exception;Lxd/b;Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    iget-object p1, p0, Lzd/h$b$a;->c:Lzd/h;

    .line 108
    .line 109
    sget-object v0, Ltd/d$a;->a:Ltd/d$a;

    .line 110
    .line 111
    invoke-static {p1, v0}, Lzd/h;->s(Lzd/h;Ltd/d$a;)V

    .line 112
    .line 113
    .line 114
    :goto_6
    sget-object p1, LTd/L;->a:LTd/L;

    .line 115
    .line 116
    return-object p1
.end method
