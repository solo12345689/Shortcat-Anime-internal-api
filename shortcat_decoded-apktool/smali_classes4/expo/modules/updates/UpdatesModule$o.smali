.class public final Lexpo/modules/updates/UpdatesModule$o;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/updates/UpdatesModule;->n()Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field a:I


# direct methods
.method public constructor <init>(LZd/e;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-direct {p0, v0, p1}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public final a(LGf/O;[Ljava/lang/Object;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p1, Lexpo/modules/updates/UpdatesModule$o;

    .line 2
    .line 3
    invoke-direct {p1, p3}, Lexpo/modules/updates/UpdatesModule$o;-><init>(LZd/e;)V

    .line 4
    .line 5
    .line 6
    sget-object p2, LTd/L;->a:LTd/L;

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Lexpo/modules/updates/UpdatesModule$o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LGf/O;

    .line 2
    .line 3
    check-cast p2, [Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p3, LZd/e;

    .line 6
    .line 7
    invoke-virtual {p0, p1, p2, p3}, Lexpo/modules/updates/UpdatesModule$o;->a(LGf/O;[Ljava/lang/Object;LZd/e;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lexpo/modules/updates/UpdatesModule$o;->a:I

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
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-static {}, Lexpo/modules/updates/f;->a()Lexpo/modules/updates/c;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iput v2, p0, Lexpo/modules/updates/UpdatesModule$o;->a:I

    .line 32
    .line 33
    invoke-interface {p1, p0}, Lexpo/modules/updates/c;->q(LZd/e;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    if-ne p1, v0, :cond_2

    .line 38
    .line 39
    return-object v0

    .line 40
    :cond_2
    :goto_0
    check-cast p1, Lexpo/modules/updates/c$b;

    .line 41
    .line 42
    instance-of v0, p1, Lexpo/modules/updates/c$b$a;

    .line 43
    .line 44
    if-nez v0, :cond_6

    .line 45
    .line 46
    instance-of v0, p1, Lexpo/modules/updates/c$b$b;

    .line 47
    .line 48
    const-string v1, "isNew"

    .line 49
    .line 50
    const-string v3, "isRollBackToEmbedded"

    .line 51
    .line 52
    const/4 v4, 0x0

    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    new-instance p1, Landroid/os/Bundle;

    .line 56
    .line 57
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, v3, v4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, v1, v4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 64
    .line 65
    .line 66
    return-object p1

    .line 67
    :cond_3
    instance-of v0, p1, Lexpo/modules/updates/c$b$c;

    .line 68
    .line 69
    if-eqz v0, :cond_4

    .line 70
    .line 71
    new-instance p1, Landroid/os/Bundle;

    .line 72
    .line 73
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1, v3, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1, v1, v4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 80
    .line 81
    .line 82
    return-object p1

    .line 83
    :cond_4
    instance-of v0, p1, Lexpo/modules/updates/c$b$e;

    .line 84
    .line 85
    if-eqz v0, :cond_5

    .line 86
    .line 87
    new-instance v0, Landroid/os/Bundle;

    .line 88
    .line 89
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v3, v4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 96
    .line 97
    .line 98
    check-cast p1, Lexpo/modules/updates/c$b$e;

    .line 99
    .line 100
    invoke-virtual {p1}, Lexpo/modules/updates/c$b$e;->a()Lrd/d;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-virtual {p1}, Lrd/d;->i()Lorg/json/JSONObject;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    const-string v1, "manifestString"

    .line 113
    .line 114
    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    return-object v0

    .line 118
    :cond_5
    new-instance p1, LTd/r;

    .line 119
    .line 120
    invoke-direct {p1}, LTd/r;-><init>()V

    .line 121
    .line 122
    .line 123
    throw p1

    .line 124
    :cond_6
    new-instance v0, Lexpo/modules/kotlin/exception/CodedException;

    .line 125
    .line 126
    check-cast p1, Lexpo/modules/updates/c$b$a;

    .line 127
    .line 128
    invoke-virtual {p1}, Lexpo/modules/updates/c$b$a;->a()Ljava/lang/Exception;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    const-string v1, "ERR_UPDATES_FETCH"

    .line 133
    .line 134
    const-string v2, "Failed to download new update"

    .line 135
    .line 136
    invoke-direct {v0, v1, v2, p1}, Lexpo/modules/kotlin/exception/CodedException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 137
    .line 138
    .line 139
    throw v0
.end method
