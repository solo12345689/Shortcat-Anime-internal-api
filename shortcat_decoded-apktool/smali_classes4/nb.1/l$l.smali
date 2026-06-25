.class public final Lnb/l$l;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnb/l;->n()Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field a:I

.field synthetic b:Ljava/lang/Object;

.field final synthetic c:Lnb/l;


# direct methods
.method public constructor <init>(LZd/e;Lnb/l;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lnb/l$l;->c:Lnb/l;

    .line 2
    .line 3
    const/4 p2, 0x3

    .line 4
    invoke-direct {p0, p2, p1}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final a(LGf/O;[Ljava/lang/Object;LZd/e;)Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance p1, Lnb/l$l;

    .line 2
    .line 3
    iget-object v0, p0, Lnb/l$l;->c:Lnb/l;

    .line 4
    .line 5
    invoke-direct {p1, p3, v0}, Lnb/l$l;-><init>(LZd/e;Lnb/l;)V

    .line 6
    .line 7
    .line 8
    iput-object p2, p1, Lnb/l$l;->b:Ljava/lang/Object;

    .line 9
    .line 10
    sget-object p2, LTd/L;->a:LTd/L;

    .line 11
    .line 12
    invoke-virtual {p1, p2}, Lnb/l$l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
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
    invoke-virtual {p0, p1, p2, p3}, Lnb/l$l;->a(LGf/O;[Ljava/lang/Object;LZd/e;)Ljava/lang/Object;

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
    iget v1, p0, Lnb/l$l;->a:I

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
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    goto :goto_2

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    goto :goto_3

    .line 18
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 19
    .line 20
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 21
    .line 22
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p1

    .line 26
    :cond_1
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lnb/l$l;->b:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p1, [Ljava/lang/Object;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    aget-object p1, p1, v1

    .line 35
    .line 36
    check-cast p1, Lexpo/modules/clipboard/GetImageOptions;

    .line 37
    .line 38
    iget-object v1, p0, Lnb/l$l;->c:Lnb/l;

    .line 39
    .line 40
    invoke-static {v1}, Lnb/l;->B(Lnb/l;)Landroid/content/ClipboardManager;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    iget-object v3, p0, Lnb/l$l;->c:Lnb/l;

    .line 45
    .line 46
    const-string v4, "image/*"

    .line 47
    .line 48
    invoke-static {v3, v4}, Lnb/l;->y(Lnb/l;Ljava/lang/String;)Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    const/4 v4, 0x0

    .line 53
    if-eqz v3, :cond_2

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    move-object v1, v4

    .line 57
    :goto_0
    if-eqz v1, :cond_3

    .line 58
    .line 59
    iget-object v3, p0, Lnb/l$l;->c:Lnb/l;

    .line 60
    .line 61
    invoke-static {v3, v1}, Lnb/l;->D(Lnb/l;Landroid/content/ClipboardManager;)Landroid/content/ClipData$Item;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    if-eqz v1, :cond_3

    .line 66
    .line 67
    invoke-virtual {v1}, Landroid/content/ClipData$Item;->getUri()Landroid/net/Uri;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    goto :goto_1

    .line 72
    :cond_3
    move-object v1, v4

    .line 73
    :goto_1
    if-nez v1, :cond_4

    .line 74
    .line 75
    return-object v4

    .line 76
    :cond_4
    :try_start_1
    iget-object v3, p0, Lnb/l$l;->c:Lnb/l;

    .line 77
    .line 78
    invoke-static {v3}, Lnb/l;->C(Lnb/l;)Landroid/content/Context;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    iput v2, p0, Lnb/l$l;->a:I

    .line 83
    .line 84
    invoke-static {v3, v1, p1, p0}, Lexpo/modules/clipboard/a;->t(Landroid/content/Context;Landroid/net/Uri;Lexpo/modules/clipboard/GetImageOptions;LZd/e;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    if-ne p1, v0, :cond_5

    .line 89
    .line 90
    return-object v0

    .line 91
    :cond_5
    :goto_2
    check-cast p1, Lnb/q;

    .line 92
    .line 93
    invoke-virtual {p1}, Lnb/q;->a()Landroid/os/Bundle;

    .line 94
    .line 95
    .line 96
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 97
    return-object p1

    .line 98
    :goto_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 99
    .line 100
    .line 101
    instance-of v0, p1, Lexpo/modules/kotlin/exception/CodedException;

    .line 102
    .line 103
    if-nez v0, :cond_7

    .line 104
    .line 105
    instance-of v0, p1, Ljava/lang/SecurityException;

    .line 106
    .line 107
    if-eqz v0, :cond_6

    .line 108
    .line 109
    new-instance v0, Lnb/s;

    .line 110
    .line 111
    check-cast p1, Ljava/lang/SecurityException;

    .line 112
    .line 113
    invoke-direct {v0, p1}, Lnb/s;-><init>(Ljava/lang/SecurityException;)V

    .line 114
    .line 115
    .line 116
    :goto_4
    move-object p1, v0

    .line 117
    goto :goto_5

    .line 118
    :cond_6
    new-instance v0, Lnb/t;

    .line 119
    .line 120
    const-string v1, "image"

    .line 121
    .line 122
    invoke-direct {v0, p1, v1}, Lnb/t;-><init>(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    goto :goto_4

    .line 126
    :cond_7
    :goto_5
    throw p1
.end method
