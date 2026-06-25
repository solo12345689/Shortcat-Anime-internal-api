.class public final LCb/i$m;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LCb/i;->n()Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field a:I

.field synthetic b:Ljava/lang/Object;

.field final synthetic c:Lkotlin/jvm/internal/N;


# direct methods
.method public constructor <init>(LZd/e;Lkotlin/jvm/internal/N;)V
    .locals 0

    .line 1
    iput-object p2, p0, LCb/i$m;->c:Lkotlin/jvm/internal/N;

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
    new-instance p1, LCb/i$m;

    .line 2
    .line 3
    iget-object v0, p0, LCb/i$m;->c:Lkotlin/jvm/internal/N;

    .line 4
    .line 5
    invoke-direct {p1, p3, v0}, LCb/i$m;-><init>(LZd/e;Lkotlin/jvm/internal/N;)V

    .line 6
    .line 7
    .line 8
    iput-object p2, p1, LCb/i$m;->b:Ljava/lang/Object;

    .line 9
    .line 10
    sget-object p2, LTd/L;->a:LTd/L;

    .line 11
    .line 12
    invoke-virtual {p1, p2}, LCb/i$m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2, p3}, LCb/i$m;->a(LGf/O;[Ljava/lang/Object;LZd/e;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
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
    iget v1, p0, LCb/i$m;->a:I

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
    goto :goto_1

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
    iget-object p1, p0, LCb/i$m;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, [Ljava/lang/Object;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    aget-object p1, p1, v1

    .line 33
    .line 34
    check-cast p1, Landroid/net/Uri;

    .line 35
    .line 36
    iget-object v1, p0, LCb/i$m;->c:Lkotlin/jvm/internal/N;

    .line 37
    .line 38
    iget-object v1, v1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 39
    .line 40
    const/4 v3, 0x0

    .line 41
    if-nez v1, :cond_2

    .line 42
    .line 43
    const-string v1, "filePickerLauncher"

    .line 44
    .line 45
    invoke-static {v1}, Lkotlin/jvm/internal/s;->u(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    move-object v1, v3

    .line 49
    goto :goto_0

    .line 50
    :cond_2
    check-cast v1, LWb/f;

    .line 51
    .line 52
    :goto_0
    new-instance v4, LCb/e;

    .line 53
    .line 54
    sget-object v5, LCb/r;->b:LCb/r;

    .line 55
    .line 56
    invoke-direct {v4, p1, v3, v5}, LCb/e;-><init>(Landroid/net/Uri;Ljava/lang/String;LCb/r;)V

    .line 57
    .line 58
    .line 59
    iput v2, p0, LCb/i$m;->a:I

    .line 60
    .line 61
    invoke-virtual {v1, v4, p0}, LWb/f;->a(Ljava/io/Serializable;LZd/e;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    if-ne p1, v0, :cond_3

    .line 66
    .line 67
    return-object v0

    .line 68
    :cond_3
    :goto_1
    check-cast p1, LCb/f;

    .line 69
    .line 70
    instance-of v0, p1, LCb/f$b;

    .line 71
    .line 72
    if-eqz v0, :cond_4

    .line 73
    .line 74
    check-cast p1, LCb/f$b;

    .line 75
    .line 76
    invoke-virtual {p1}, LCb/f$b;->a()Lexpo/modules/filesystem/FileSystemPath;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    const-string v0, "null cannot be cast to non-null type expo.modules.filesystem.FileSystemDirectory"

    .line 81
    .line 82
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    check-cast p1, Lexpo/modules/filesystem/FileSystemDirectory;

    .line 86
    .line 87
    return-object p1

    .line 88
    :cond_4
    instance-of p1, p1, LCb/f$a;

    .line 89
    .line 90
    if-eqz p1, :cond_5

    .line 91
    .line 92
    new-instance p1, LCb/q;

    .line 93
    .line 94
    invoke-direct {p1}, LCb/q;-><init>()V

    .line 95
    .line 96
    .line 97
    throw p1

    .line 98
    :cond_5
    new-instance p1, LTd/r;

    .line 99
    .line 100
    invoke-direct {p1}, LTd/r;-><init>()V

    .line 101
    .line 102
    .line 103
    throw p1
.end method
