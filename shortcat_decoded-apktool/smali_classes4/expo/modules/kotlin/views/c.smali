.class public Lexpo/modules/kotlin/views/c;
.super Lexpo/modules/kotlin/views/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final c:Lkotlin/jvm/functions/Function2;

.field private final d:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Lpc/b;Lkotlin/jvm/functions/Function2;)V
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "propType"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "setter"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p1, p2}, Lexpo/modules/kotlin/views/a;-><init>(Ljava/lang/String;Lpc/b;)V

    .line 17
    .line 18
    .line 19
    iput-object p3, p0, Lexpo/modules/kotlin/views/c;->c:Lkotlin/jvm/functions/Function2;

    .line 20
    .line 21
    invoke-virtual {p2}, Lpc/b;->g()Lpe/q;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-interface {p1}, Lpe/q;->b()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    iput-boolean p1, p0, Lexpo/modules/kotlin/views/c;->d:Z

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public c(Lcom/facebook/react/bridge/Dynamic;Landroid/view/View;LUb/d;)V
    .locals 7

    .line 1
    const-string v0, "prop"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onView"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    :try_start_0
    invoke-virtual {p0}, Lexpo/modules/kotlin/views/c;->d()Lkotlin/jvm/functions/Function2;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p0}, Lexpo/modules/kotlin/views/a;->b()Lpc/b;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const/4 v5, 0x4

    .line 20
    const/4 v6, 0x0

    .line 21
    const/4 v4, 0x0

    .line 22
    move-object v2, p1

    .line 23
    move-object v3, p3

    .line 24
    invoke-static/range {v1 .. v6}, Lpc/b;->c(Lpc/b;Ljava/lang/Object;LUb/d;ZILjava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-interface {v0, p2, p1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    sget-object p1, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    return-void

    .line 34
    :catchall_0
    move-exception v0

    .line 35
    move-object p1, v0

    .line 36
    instance-of p3, p1, Lexpo/modules/kotlin/exception/CodedException;

    .line 37
    .line 38
    if-nez p3, :cond_1

    .line 39
    .line 40
    instance-of p3, p1, Lrb/a;

    .line 41
    .line 42
    if-eqz p3, :cond_0

    .line 43
    .line 44
    new-instance p3, Lexpo/modules/kotlin/exception/CodedException;

    .line 45
    .line 46
    check-cast p1, Lrb/a;

    .line 47
    .line 48
    invoke-virtual {p1}, Lrb/a;->a()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    const-string v1, "getCode(...)"

    .line 53
    .line 54
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-direct {p3, v0, v1, p1}, Lexpo/modules/kotlin/exception/CodedException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    new-instance p3, Lexpo/modules/kotlin/exception/UnexpectedException;

    .line 70
    .line 71
    invoke-direct {p3, p1}, Lexpo/modules/kotlin/exception/UnexpectedException;-><init>(Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_1
    move-object p3, p1

    .line 76
    check-cast p3, Lexpo/modules/kotlin/exception/CodedException;

    .line 77
    .line 78
    :goto_0
    new-instance p1, Lcc/v;

    .line 79
    .line 80
    invoke-virtual {p0}, Lexpo/modules/kotlin/views/a;->a()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    invoke-static {p2}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    invoke-direct {p1, v0, p2, p3}, Lcc/v;-><init>(Ljava/lang/String;Lpe/d;Lexpo/modules/kotlin/exception/CodedException;)V

    .line 93
    .line 94
    .line 95
    throw p1
.end method

.method protected final d()Lkotlin/jvm/functions/Function2;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/views/c;->c:Lkotlin/jvm/functions/Function2;

    .line 2
    .line 3
    return-object v0
.end method
