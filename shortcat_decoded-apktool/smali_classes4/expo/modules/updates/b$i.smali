.class final Lexpo/modules/updates/b$i;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/updates/b;->h(Ljava/lang/String;Ljava/lang/String;LZd/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:Lexpo/modules/updates/b;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Ljava/lang/String;

.field final synthetic f:LGf/n;


# direct methods
.method constructor <init>(Lexpo/modules/updates/b;Ljava/lang/String;Ljava/lang/String;LGf/n;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/updates/b$i;->c:Lexpo/modules/updates/b;

    .line 2
    .line 3
    iput-object p2, p0, Lexpo/modules/updates/b$i;->d:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lexpo/modules/updates/b$i;->e:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Lexpo/modules/updates/b$i;->f:LGf/n;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 6

    .line 1
    new-instance v0, Lexpo/modules/updates/b$i;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/updates/b$i;->c:Lexpo/modules/updates/b;

    .line 4
    .line 5
    iget-object v2, p0, Lexpo/modules/updates/b$i;->d:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lexpo/modules/updates/b$i;->e:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lexpo/modules/updates/b$i;->f:LGf/n;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lexpo/modules/updates/b$i;-><init>(Lexpo/modules/updates/b;Ljava/lang/String;Ljava/lang/String;LGf/n;LZd/e;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, Lexpo/modules/updates/b$i;->b:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lexpo/modules/updates/b$i;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, Lexpo/modules/updates/b$i;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, Lexpo/modules/updates/b$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/updates/b$i;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lexpo/modules/updates/b$i;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_3

    .line 7
    .line 8
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lexpo/modules/updates/b$i;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, LGf/O;

    .line 14
    .line 15
    iget-object p1, p0, Lexpo/modules/updates/b$i;->c:Lexpo/modules/updates/b;

    .line 16
    .line 17
    iget-object v0, p0, Lexpo/modules/updates/b$i;->d:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v1, p0, Lexpo/modules/updates/b$i;->e:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v2, p0, Lexpo/modules/updates/b$i;->f:LGf/n;

    .line 22
    .line 23
    :try_start_0
    sget-object v3, LTd/u;->b:LTd/u$a;

    .line 24
    .line 25
    sget-object v3, Lyd/k;->a:Lyd/k;

    .line 26
    .line 27
    invoke-static {p1}, Lexpo/modules/updates/b;->x(Lexpo/modules/updates/b;)Lpd/c;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-virtual {v4}, Lpd/c;->c()Lexpo/modules/updates/db/UpdatesDatabase;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-static {p1}, Lexpo/modules/updates/b;->F(Lexpo/modules/updates/b;)Lexpo/modules/updates/d;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {v3, v4, p1, v0, v1}, Lyd/k;->i(Lexpo/modules/updates/db/UpdatesDatabase;Lexpo/modules/updates/d;Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    sget-object p1, LTd/L;->a:LTd/L;

    .line 43
    .line 44
    invoke-static {p1}, LTd/u;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-interface {v2, v0}, LZd/e;->resumeWith(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-static {p1}, LTd/u;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    goto :goto_0

    .line 56
    :catchall_0
    move-exception p1

    .line 57
    sget-object v0, LTd/u;->b:LTd/u$a;

    .line 58
    .line 59
    invoke-static {p1}, LTd/v;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-static {p1}, LTd/u;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    :goto_0
    iget-object v0, p0, Lexpo/modules/updates/b$i;->f:LGf/n;

    .line 68
    .line 69
    invoke-static {p1}, LTd/u;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    if-eqz p1, :cond_2

    .line 74
    .line 75
    instance-of v1, p1, Lexpo/modules/kotlin/exception/CodedException;

    .line 76
    .line 77
    if-eqz v1, :cond_0

    .line 78
    .line 79
    check-cast p1, Lexpo/modules/kotlin/exception/CodedException;

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_0
    instance-of v1, p1, Lrb/a;

    .line 83
    .line 84
    if-eqz v1, :cond_1

    .line 85
    .line 86
    new-instance v1, Lexpo/modules/kotlin/exception/CodedException;

    .line 87
    .line 88
    check-cast p1, Lrb/a;

    .line 89
    .line 90
    invoke-virtual {p1}, Lrb/a;->a()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    const-string v3, "getCode(...)"

    .line 95
    .line 96
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-direct {v1, v2, v3, p1}, Lexpo/modules/kotlin/exception/CodedException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 108
    .line 109
    .line 110
    :goto_1
    move-object p1, v1

    .line 111
    goto :goto_2

    .line 112
    :cond_1
    new-instance v1, Lexpo/modules/kotlin/exception/UnexpectedException;

    .line 113
    .line 114
    invoke-direct {v1, p1}, Lexpo/modules/kotlin/exception/UnexpectedException;-><init>(Ljava/lang/Throwable;)V

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    :goto_2
    invoke-static {p1}, LTd/v;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-static {p1}, LTd/u;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-interface {v0, p1}, LZd/e;->resumeWith(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    :cond_2
    sget-object p1, LTd/L;->a:LTd/L;

    .line 130
    .line 131
    return-object p1

    .line 132
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 133
    .line 134
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 135
    .line 136
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    throw p1
.end method
