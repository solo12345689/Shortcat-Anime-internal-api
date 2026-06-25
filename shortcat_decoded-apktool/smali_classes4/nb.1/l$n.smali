.class public final Lnb/l$n;
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
    iput-object p2, p0, Lnb/l$n;->c:Lnb/l;

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
    new-instance p1, Lnb/l$n;

    .line 2
    .line 3
    iget-object v0, p0, Lnb/l$n;->c:Lnb/l;

    .line 4
    .line 5
    invoke-direct {p1, p3, v0}, Lnb/l$n;-><init>(LZd/e;Lnb/l;)V

    .line 6
    .line 7
    .line 8
    iput-object p2, p1, Lnb/l$n;->b:Ljava/lang/Object;

    .line 9
    .line 10
    sget-object p2, LTd/L;->a:LTd/L;

    .line 11
    .line 12
    invoke-virtual {p1, p2}, Lnb/l$n;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2, p3}, Lnb/l$n;->a(LGf/O;[Ljava/lang/Object;LZd/e;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lnb/l$n;->a:I

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
    goto :goto_0

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    goto :goto_1

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
    iget-object p1, p0, Lnb/l$n;->b:Ljava/lang/Object;

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
    check-cast p1, Ljava/lang/String;

    .line 37
    .line 38
    :try_start_1
    iget-object v1, p0, Lnb/l$n;->c:Lnb/l;

    .line 39
    .line 40
    invoke-static {v1}, Lnb/l;->C(Lnb/l;)Landroid/content/Context;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    iget-object v3, p0, Lnb/l$n;->c:Lnb/l;

    .line 45
    .line 46
    invoke-static {v3}, Lnb/l;->z(Lnb/l;)Ljava/io/File;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    iput v2, p0, Lnb/l$n;->a:I

    .line 51
    .line 52
    invoke-static {v1, p1, v3, p0}, Lexpo/modules/clipboard/a;->k(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;LZd/e;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    if-ne p1, v0, :cond_2

    .line 57
    .line 58
    return-object v0

    .line 59
    :cond_2
    :goto_0
    check-cast p1, Landroid/content/ClipData;

    .line 60
    .line 61
    iget-object v0, p0, Lnb/l$n;->c:Lnb/l;

    .line 62
    .line 63
    invoke-static {v0}, Lnb/l;->B(Lnb/l;)Landroid/content/ClipboardManager;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {v0, p1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 68
    .line 69
    .line 70
    sget-object p1, LTd/L;->a:LTd/L;

    .line 71
    .line 72
    return-object p1

    .line 73
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 74
    .line 75
    .line 76
    instance-of v0, p1, Lexpo/modules/kotlin/exception/CodedException;

    .line 77
    .line 78
    if-eqz v0, :cond_3

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_3
    new-instance v0, Lnb/p;

    .line 82
    .line 83
    const-string v1, "image"

    .line 84
    .line 85
    invoke-direct {v0, p1, v1}, Lnb/p;-><init>(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    move-object p1, v0

    .line 89
    :goto_2
    throw p1
.end method
