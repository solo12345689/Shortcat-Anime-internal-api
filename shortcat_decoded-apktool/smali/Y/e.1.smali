.class public final LY/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LY/t0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LY/e$a;,
        LY/e$b;
    }
.end annotation


# instance fields
.field private final a:Lie/a;

.field private final b:Ljava/lang/Object;

.field private c:Ljava/lang/Throwable;

.field private final d:Lg0/a;

.field private e:Lt/L;

.field private f:Lt/L;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Lie/a;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LY/e;->a:Lie/a;

    .line 5
    .line 6
    new-instance p1, Ljava/lang/Object;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, LY/e;->b:Ljava/lang/Object;

    .line 12
    .line 13
    invoke-static {}, LY/e$a;->b()Lg0/a;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, LY/e;->d:Lg0/a;

    .line 18
    .line 19
    new-instance p1, Lt/L;

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    const/4 v1, 0x1

    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-direct {p1, v0, v1, v2}, Lt/L;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, LY/e;->e:Lt/L;

    .line 28
    .line 29
    new-instance p1, Lt/L;

    .line 30
    .line 31
    invoke-direct {p1, v0, v1, v2}, Lt/L;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, LY/e;->f:Lt/L;

    .line 35
    .line 36
    return-void
.end method

.method public static final synthetic a(LY/e;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LY/e;->m(Ljava/lang/Throwable;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic c(LY/e;)Lt/L;
    .locals 0

    .line 1
    iget-object p0, p0, LY/e;->e:Lt/L;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic d(LY/e;)Ljava/lang/Throwable;
    .locals 0

    .line 1
    iget-object p0, p0, LY/e;->c:Ljava/lang/Throwable;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic e(LY/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, LY/e;->b:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic f(LY/e;)Lie/a;
    .locals 0

    .line 1
    iget-object p0, p0, LY/e;->a:Lie/a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic i(LY/e;)Lg0/a;
    .locals 0

    .line 1
    iget-object p0, p0, LY/e;->d:Lg0/a;

    .line 2
    .line 3
    return-object p0
.end method

.method private final m(Ljava/lang/Throwable;)V
    .locals 6

    .line 1
    iget-object v0, p0, LY/e;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LY/e;->c:Ljava/lang/Throwable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    return-void

    .line 10
    :cond_0
    :try_start_1
    iput-object p1, p0, LY/e;->c:Ljava/lang/Throwable;

    .line 11
    .line 12
    iget-object v1, p0, LY/e;->e:Lt/L;

    .line 13
    .line 14
    iget-object v2, v1, Lt/V;->a:[Ljava/lang/Object;

    .line 15
    .line 16
    iget v1, v1, Lt/V;->b:I

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    move v4, v3

    .line 20
    :goto_0
    if-ge v4, v1, :cond_1

    .line 21
    .line 22
    aget-object v5, v2, v4

    .line 23
    .line 24
    check-cast v5, LY/e$b;

    .line 25
    .line 26
    invoke-virtual {v5, p1}, LY/e$b;->c(Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    add-int/lit8 v4, v4, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    iget-object p1, p0, LY/e;->e:Lt/L;

    .line 35
    .line 36
    invoke-virtual {p1}, Lt/L;->n()V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, LY/e;->d:Lg0/a;

    .line 40
    .line 41
    :cond_2
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    ushr-int/lit8 v2, v1, 0x1b

    .line 46
    .line 47
    and-int/lit8 v2, v2, 0xf

    .line 48
    .line 49
    add-int/lit8 v2, v2, 0x1

    .line 50
    .line 51
    invoke-static {p1, v2, v3}, LY/e$a;->a(Lg0/a;II)I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    invoke-virtual {p1, v1, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_2

    .line 60
    .line 61
    sget-object p1, LTd/L;->a:LTd/L;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 62
    .line 63
    monitor-exit v0

    .line 64
    return-void

    .line 65
    :goto_1
    monitor-exit v0

    .line 66
    throw p1
.end method


# virtual methods
.method public A1(Lkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;
    .locals 7

    .line 1
    new-instance v0, LGf/p;

    .line 2
    .line 3
    invoke-static {p2}, Lae/b;->c(LZd/e;)LZd/e;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v0, v1, v2}, LGf/p;-><init>(LZd/e;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, LGf/p;->C()V

    .line 12
    .line 13
    .line 14
    new-instance v1, LY/e$b;

    .line 15
    .line 16
    invoke-direct {v1, p1, v0}, LY/e$b;-><init>(Lkotlin/jvm/functions/Function1;LGf/n;)V

    .line 17
    .line 18
    .line 19
    new-instance p1, Lkotlin/jvm/internal/L;

    .line 20
    .line 21
    invoke-direct {p1}, Lkotlin/jvm/internal/L;-><init>()V

    .line 22
    .line 23
    .line 24
    const/4 v3, -0x1

    .line 25
    iput v3, p1, Lkotlin/jvm/internal/L;->a:I

    .line 26
    .line 27
    invoke-static {p0}, LY/e;->e(LY/e;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    monitor-enter v3

    .line 32
    :try_start_0
    invoke-static {p0}, LY/e;->d(LY/e;)Ljava/lang/Throwable;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    if-eqz v4, :cond_0

    .line 37
    .line 38
    sget-object p1, LTd/u;->b:LTd/u$a;

    .line 39
    .line 40
    invoke-static {v4}, LTd/v;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-static {p1}, LTd/u;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-interface {v0, p1}, LZd/e;->resumeWith(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    .line 51
    monitor-exit v3

    .line 52
    goto :goto_1

    .line 53
    :catchall_0
    move-exception p1

    .line 54
    goto :goto_2

    .line 55
    :cond_0
    :try_start_1
    invoke-static {p0}, LY/e;->i(LY/e;)Lg0/a;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    :cond_1
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    add-int/lit8 v6, v5, 0x1

    .line 64
    .line 65
    invoke-virtual {v4, v5, v6}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    if-eqz v5, :cond_1

    .line 70
    .line 71
    const v4, 0x7ffffff

    .line 72
    .line 73
    .line 74
    and-int/2addr v4, v6

    .line 75
    if-ne v4, v2, :cond_2

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_2
    const/4 v2, 0x0

    .line 79
    :goto_0
    ushr-int/lit8 v4, v6, 0x1b

    .line 80
    .line 81
    and-int/lit8 v4, v4, 0xf

    .line 82
    .line 83
    iput v4, p1, Lkotlin/jvm/internal/L;->a:I

    .line 84
    .line 85
    invoke-static {p0}, LY/e;->c(LY/e;)Lt/L;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    invoke-virtual {v4, v1}, Lt/L;->k(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 90
    .line 91
    .line 92
    monitor-exit v3

    .line 93
    new-instance v3, LY/e$c;

    .line 94
    .line 95
    invoke-direct {v3, v1, p0, p1}, LY/e$c;-><init>(LY/e$b;LY/e;Lkotlin/jvm/internal/L;)V

    .line 96
    .line 97
    .line 98
    invoke-interface {v0, v3}, LGf/n;->p(Lkotlin/jvm/functions/Function1;)V

    .line 99
    .line 100
    .line 101
    if-eqz v2, :cond_3

    .line 102
    .line 103
    invoke-static {p0}, LY/e;->f(LY/e;)Lie/a;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    if-eqz p1, :cond_3

    .line 108
    .line 109
    :try_start_2
    invoke-static {p0}, LY/e;->f(LY/e;)Lie/a;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-interface {p1}, Lie/a;->invoke()Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 114
    .line 115
    .line 116
    goto :goto_1

    .line 117
    :catchall_1
    move-exception p1

    .line 118
    invoke-static {p0, p1}, LY/e;->a(LY/e;Ljava/lang/Throwable;)V

    .line 119
    .line 120
    .line 121
    :cond_3
    :goto_1
    invoke-virtual {v0}, LGf/p;->v()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    if-ne p1, v0, :cond_4

    .line 130
    .line 131
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/h;->c(LZd/e;)V

    .line 132
    .line 133
    .line 134
    :cond_4
    return-object p1

    .line 135
    :goto_2
    monitor-exit v3

    .line 136
    throw p1
.end method

.method public a1(LZd/i$c;)LZd/i;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LY/t0$a;->c(LY/t0;LZd/i$c;)LZd/i;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public l(LZd/i$c;)LZd/i$b;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LY/t0$a;->b(LY/t0;LZd/i$c;)LZd/i$b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final n()Z
    .locals 2

    .line 1
    iget-object v0, p0, LY/e;->d:Lg0/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const v1, 0x7ffffff

    .line 8
    .line 9
    .line 10
    and-int/2addr v0, v1

    .line 11
    if-lez v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
.end method

.method public final p(J)V
    .locals 6

    .line 1
    iget-object v0, p0, LY/e;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LY/e;->e:Lt/L;

    .line 5
    .line 6
    iget-object v2, p0, LY/e;->f:Lt/L;

    .line 7
    .line 8
    iput-object v2, p0, LY/e;->e:Lt/L;

    .line 9
    .line 10
    iput-object v1, p0, LY/e;->f:Lt/L;

    .line 11
    .line 12
    iget-object v2, p0, LY/e;->d:Lg0/a;

    .line 13
    .line 14
    :cond_0
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    ushr-int/lit8 v4, v3, 0x1b

    .line 19
    .line 20
    and-int/lit8 v4, v4, 0xf

    .line 21
    .line 22
    add-int/lit8 v4, v4, 0x1

    .line 23
    .line 24
    const/4 v5, 0x0

    .line 25
    invoke-static {v2, v4, v5}, LY/e$a;->a(Lg0/a;II)I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eqz v3, :cond_0

    .line 34
    .line 35
    invoke-virtual {v1}, Lt/V;->d()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    :goto_0
    if-ge v5, v2, :cond_1

    .line 40
    .line 41
    invoke-virtual {v1, v5}, Lt/V;->c(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    check-cast v3, LY/e$b;

    .line 46
    .line 47
    invoke-virtual {v3, p1, p2}, LY/e$b;->b(J)V

    .line 48
    .line 49
    .line 50
    add-int/lit8 v5, v5, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catchall_0
    move-exception p1

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    invoke-virtual {v1}, Lt/L;->n()V

    .line 56
    .line 57
    .line 58
    sget-object p1, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    .line 60
    monitor-exit v0

    .line 61
    return-void

    .line 62
    :goto_1
    monitor-exit v0

    .line 63
    throw p1
.end method

.method public w(LZd/i;)LZd/i;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LY/t0$a;->d(LY/t0;LZd/i;)LZd/i;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public y1(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LY/t0$a;->a(LY/t0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
