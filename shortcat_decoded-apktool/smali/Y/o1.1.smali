.class public final LY/o1;
.super LY/y;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LY/o1$a;,
        LY/o1$b;,
        LY/o1$c;,
        LY/o1$d;
    }
.end annotation


# static fields
.field public static final C:LY/o1$a;

.field public static final D:I

.field private static final E:LJf/u;

.field private static final F:Ljava/util/concurrent/atomic/AtomicReference;


# instance fields
.field private A:Lt/L;

.field private final B:LY/o1$c;

.field private a:J

.field private final b:LY/e;

.field private final c:Ljava/lang/Object;

.field private d:LGf/C0;

.field private e:Ljava/lang/Throwable;

.field private final f:Ljava/util/List;

.field private g:Ljava/util/List;

.field private h:Lt/Q;

.field private final i:La0/c;

.field private final j:Ljava/util/List;

.field private final k:Ljava/util/List;

.field private final l:Lt/P;

.field private final m:LY/E0;

.field private final n:Lt/P;

.field private final o:Lt/P;

.field private p:Ljava/util/List;

.field private q:Ljava/util/Set;

.field private r:LGf/n;

.field private s:I

.field private t:Z

.field private u:LY/o1$b;

.field private v:Z

.field private final w:LJf/u;

.field private final x:Lg0/r;

.field private final y:LGf/A;

.field private final z:LZd/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LY/o1$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LY/o1$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LY/o1;->C:LY/o1$a;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, LY/o1;->D:I

    .line 12
    .line 13
    invoke-static {}, Lb0/a;->c()Lb0/g;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, LJf/K;->a(Ljava/lang/Object;)LJf/u;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sput-object v0, LY/o1;->E:LJf/u;

    .line 22
    .line 23
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 24
    .line 25
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 26
    .line 27
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    sput-object v0, LY/o1;->F:Ljava/util/concurrent/atomic/AtomicReference;

    .line 31
    .line 32
    return-void
.end method

.method public constructor <init>(LZd/i;)V
    .locals 6

    .line 1
    invoke-direct {p0}, LY/y;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LY/e;

    .line 5
    .line 6
    new-instance v1, LY/j1;

    .line 7
    .line 8
    invoke-direct {v1, p0}, LY/j1;-><init>(LY/o1;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1}, LY/e;-><init>(Lie/a;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, LY/o1;->b:LY/e;

    .line 15
    .line 16
    new-instance v1, Ljava/lang/Object;

    .line 17
    .line 18
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v1, p0, LY/o1;->c:Ljava/lang/Object;

    .line 22
    .line 23
    new-instance v1, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, LY/o1;->f:Ljava/util/List;

    .line 29
    .line 30
    new-instance v1, Lt/Q;

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    const/4 v3, 0x1

    .line 34
    const/4 v4, 0x0

    .line 35
    invoke-direct {v1, v2, v3, v4}, Lt/Q;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 36
    .line 37
    .line 38
    iput-object v1, p0, LY/o1;->h:Lt/Q;

    .line 39
    .line 40
    new-instance v1, La0/c;

    .line 41
    .line 42
    const/16 v5, 0x10

    .line 43
    .line 44
    new-array v5, v5, [LY/Q;

    .line 45
    .line 46
    invoke-direct {v1, v5, v2}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 47
    .line 48
    .line 49
    iput-object v1, p0, LY/o1;->i:La0/c;

    .line 50
    .line 51
    new-instance v1, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object v1, p0, LY/o1;->j:Ljava/util/List;

    .line 57
    .line 58
    new-instance v1, Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 61
    .line 62
    .line 63
    iput-object v1, p0, LY/o1;->k:Ljava/util/List;

    .line 64
    .line 65
    invoke-static {v4, v3, v4}, La0/b;->e(Lt/P;ILkotlin/jvm/internal/DefaultConstructorMarker;)Lt/P;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    iput-object v1, p0, LY/o1;->l:Lt/P;

    .line 70
    .line 71
    new-instance v1, LY/E0;

    .line 72
    .line 73
    invoke-direct {v1}, LY/E0;-><init>()V

    .line 74
    .line 75
    .line 76
    iput-object v1, p0, LY/o1;->m:LY/E0;

    .line 77
    .line 78
    invoke-static {}, Lt/d0;->b()Lt/P;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    iput-object v1, p0, LY/o1;->n:Lt/P;

    .line 83
    .line 84
    invoke-static {v4, v3, v4}, La0/b;->e(Lt/P;ILkotlin/jvm/internal/DefaultConstructorMarker;)Lt/P;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    iput-object v1, p0, LY/o1;->o:Lt/P;

    .line 89
    .line 90
    sget-object v1, LY/o1$d;->c:LY/o1$d;

    .line 91
    .line 92
    invoke-static {v1}, LJf/K;->a(Ljava/lang/Object;)LJf/u;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    iput-object v1, p0, LY/o1;->w:LJf/u;

    .line 97
    .line 98
    new-instance v1, Lg0/r;

    .line 99
    .line 100
    invoke-direct {v1}, Lg0/r;-><init>()V

    .line 101
    .line 102
    .line 103
    iput-object v1, p0, LY/o1;->x:Lg0/r;

    .line 104
    .line 105
    sget-object v1, LGf/C0;->K:LGf/C0$b;

    .line 106
    .line 107
    invoke-interface {p1, v1}, LZd/i;->l(LZd/i$c;)LZd/i$b;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    check-cast v1, LGf/C0;

    .line 112
    .line 113
    invoke-static {v1}, LGf/F0;->a(LGf/C0;)LGf/A;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    new-instance v2, LY/k1;

    .line 118
    .line 119
    invoke-direct {v2, p0}, LY/k1;-><init>(LY/o1;)V

    .line 120
    .line 121
    .line 122
    invoke-interface {v1, v2}, LGf/C0;->H(Lkotlin/jvm/functions/Function1;)LGf/h0;

    .line 123
    .line 124
    .line 125
    iput-object v1, p0, LY/o1;->y:LGf/A;

    .line 126
    .line 127
    invoke-interface {p1, v0}, LZd/i;->w(LZd/i;)LZd/i;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-interface {p1, v1}, LZd/i;->w(LZd/i;)LZd/i;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    iput-object p1, p0, LY/o1;->z:LZd/i;

    .line 136
    .line 137
    new-instance p1, LY/o1$c;

    .line 138
    .line 139
    invoke-direct {p1, p0}, LY/o1$c;-><init>(LY/o1;)V

    .line 140
    .line 141
    .line 142
    iput-object p1, p0, LY/o1;->B:LY/o1$c;

    .line 143
    .line 144
    return-void
.end method

.method public static synthetic A(LY/Q;Lt/Q;Ljava/lang/Object;)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LY/o1;->Q0(LY/Q;Lt/Q;Ljava/lang/Object;)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final A0(LY/Q;Lt/Q;)LY/Q;
    .locals 5

    .line 1
    invoke-interface {p1}, LY/Q;->q()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_3

    .line 7
    .line 8
    invoke-interface {p1}, LY/x;->e()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_3

    .line 13
    .line 14
    iget-object v0, p0, LY/o1;->q:Ljava/util/Set;

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-ne v0, v2, :cond_0

    .line 24
    .line 25
    goto :goto_3

    .line 26
    :cond_0
    sget-object v0, Li0/l;->e:Li0/l$a;

    .line 27
    .line 28
    invoke-direct {p0, p1}, LY/o1;->E0(LY/Q;)Lkotlin/jvm/functions/Function1;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-direct {p0, p1, p2}, LY/o1;->P0(LY/Q;Lt/Q;)Lkotlin/jvm/functions/Function1;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-virtual {v0, v3, v4}, Li0/l$a;->n(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Li0/d;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    :try_start_0
    invoke-virtual {v0}, Li0/l;->l()Li0/l;

    .line 41
    .line 42
    .line 43
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 44
    if-eqz p2, :cond_1

    .line 45
    .line 46
    :try_start_1
    invoke-virtual {p2}, Lt/e0;->e()Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-ne v4, v2, :cond_1

    .line 51
    .line 52
    new-instance v2, LY/n1;

    .line 53
    .line 54
    invoke-direct {v2, p2, p1}, LY/n1;-><init>(Lt/Q;LY/Q;)V

    .line 55
    .line 56
    .line 57
    invoke-interface {p1, v2}, LY/Q;->f(Lie/a;)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :catchall_0
    move-exception p1

    .line 62
    goto :goto_1

    .line 63
    :cond_1
    :goto_0
    invoke-interface {p1}, LY/Q;->k()Z

    .line 64
    .line 65
    .line 66
    move-result p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 67
    :try_start_2
    invoke-virtual {v0, v3}, Li0/l;->s(Li0/l;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 68
    .line 69
    .line 70
    invoke-direct {p0, v0}, LY/o1;->d0(Li0/d;)V

    .line 71
    .line 72
    .line 73
    if-eqz p2, :cond_2

    .line 74
    .line 75
    return-object p1

    .line 76
    :cond_2
    return-object v1

    .line 77
    :catchall_1
    move-exception p1

    .line 78
    goto :goto_2

    .line 79
    :goto_1
    :try_start_3
    invoke-virtual {v0, v3}, Li0/l;->s(Li0/l;)V

    .line 80
    .line 81
    .line 82
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 83
    :goto_2
    invoke-direct {p0, v0}, LY/o1;->d0(Li0/d;)V

    .line 84
    .line 85
    .line 86
    throw p1

    .line 87
    :cond_3
    :goto_3
    return-object v1
.end method

.method public static synthetic B(LY/o1;Ljava/lang/Throwable;)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LY/o1;->k0(LY/o1;Ljava/lang/Throwable;)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final B0(Lt/Q;LY/Q;)LTd/L;
    .locals 13

    .line 1
    iget-object v0, p0, Lt/e0;->b:[Ljava/lang/Object;

    .line 2
    .line 3
    iget-object p0, p0, Lt/e0;->a:[J

    .line 4
    .line 5
    array-length v1, p0

    .line 6
    add-int/lit8 v1, v1, -0x2

    .line 7
    .line 8
    if-ltz v1, :cond_3

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    move v3, v2

    .line 12
    :goto_0
    aget-wide v4, p0, v3

    .line 13
    .line 14
    not-long v6, v4

    .line 15
    const/4 v8, 0x7

    .line 16
    shl-long/2addr v6, v8

    .line 17
    and-long/2addr v6, v4

    .line 18
    const-wide v8, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    and-long/2addr v6, v8

    .line 24
    cmp-long v6, v6, v8

    .line 25
    .line 26
    if-eqz v6, :cond_2

    .line 27
    .line 28
    sub-int v6, v3, v1

    .line 29
    .line 30
    not-int v6, v6

    .line 31
    ushr-int/lit8 v6, v6, 0x1f

    .line 32
    .line 33
    const/16 v7, 0x8

    .line 34
    .line 35
    rsub-int/lit8 v6, v6, 0x8

    .line 36
    .line 37
    move v8, v2

    .line 38
    :goto_1
    if-ge v8, v6, :cond_1

    .line 39
    .line 40
    const-wide/16 v9, 0xff

    .line 41
    .line 42
    and-long/2addr v9, v4

    .line 43
    const-wide/16 v11, 0x80

    .line 44
    .line 45
    cmp-long v9, v9, v11

    .line 46
    .line 47
    if-gez v9, :cond_0

    .line 48
    .line 49
    shl-int/lit8 v9, v3, 0x3

    .line 50
    .line 51
    add-int/2addr v9, v8

    .line 52
    aget-object v9, v0, v9

    .line 53
    .line 54
    invoke-interface {p1, v9}, LY/Q;->s(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    :cond_0
    shr-long/2addr v4, v7

    .line 58
    add-int/lit8 v8, v8, 0x1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    if-ne v6, v7, :cond_3

    .line 62
    .line 63
    :cond_2
    if-eq v3, v1, :cond_3

    .line 64
    .line 65
    add-int/lit8 v3, v3, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    sget-object p0, LTd/L;->a:LTd/L;

    .line 69
    .line 70
    return-object p0
.end method

.method public static final synthetic C(LY/o1;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LY/o1;->e0(LZd/e;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final C0(Ljava/lang/Throwable;LY/Q;Z)V
    .locals 5

    .line 1
    sget-object v0, LY/o1;->F:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    instance-of v0, p1, LY/k;

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, LY/o1;->c:Ljava/lang/Object;

    .line 21
    .line 22
    monitor-enter v0

    .line 23
    :try_start_0
    const-string v2, "Error was captured in composition while live edit was enabled."

    .line 24
    .line 25
    invoke-static {v2, p1}, Lg0/y;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    iget-object v2, p0, LY/o1;->j:Ljava/util/List;

    .line 29
    .line 30
    invoke-interface {v2}, Ljava/util/List;->clear()V

    .line 31
    .line 32
    .line 33
    iget-object v2, p0, LY/o1;->i:La0/c;

    .line 34
    .line 35
    invoke-virtual {v2}, La0/c;->i()V

    .line 36
    .line 37
    .line 38
    new-instance v2, Lt/Q;

    .line 39
    .line 40
    const/4 v3, 0x1

    .line 41
    const/4 v4, 0x0

    .line 42
    invoke-direct {v2, v1, v3, v4}, Lt/Q;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 43
    .line 44
    .line 45
    iput-object v2, p0, LY/o1;->h:Lt/Q;

    .line 46
    .line 47
    iget-object v1, p0, LY/o1;->k:Ljava/util/List;

    .line 48
    .line 49
    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 50
    .line 51
    .line 52
    iget-object v1, p0, LY/o1;->l:Lt/P;

    .line 53
    .line 54
    invoke-static {v1}, La0/b;->c(Lt/P;)V

    .line 55
    .line 56
    .line 57
    iget-object v1, p0, LY/o1;->n:Lt/P;

    .line 58
    .line 59
    invoke-virtual {v1}, Lt/P;->k()V

    .line 60
    .line 61
    .line 62
    new-instance v1, LY/o1$b;

    .line 63
    .line 64
    invoke-direct {v1, p3, p1}, LY/o1$b;-><init>(ZLjava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    iput-object v1, p0, LY/o1;->u:LY/o1$b;

    .line 68
    .line 69
    if-eqz p2, :cond_0

    .line 70
    .line 71
    invoke-direct {p0, p2}, LY/o1;->I0(LY/Q;)V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :catchall_0
    move-exception p1

    .line 76
    goto :goto_1

    .line 77
    :cond_0
    :goto_0
    invoke-direct {p0}, LY/o1;->i0()LGf/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 78
    .line 79
    .line 80
    monitor-exit v0

    .line 81
    return-void

    .line 82
    :goto_1
    monitor-exit v0

    .line 83
    throw p1

    .line 84
    :cond_1
    iget-object p2, p0, LY/o1;->c:Ljava/lang/Object;

    .line 85
    .line 86
    monitor-enter p2

    .line 87
    :try_start_1
    iget-object p3, p0, LY/o1;->u:LY/o1$b;

    .line 88
    .line 89
    if-nez p3, :cond_2

    .line 90
    .line 91
    new-instance p3, LY/o1$b;

    .line 92
    .line 93
    invoke-direct {p3, v1, p1}, LY/o1$b;-><init>(ZLjava/lang/Throwable;)V

    .line 94
    .line 95
    .line 96
    iput-object p3, p0, LY/o1;->u:LY/o1$b;

    .line 97
    .line 98
    sget-object p3, LTd/L;->a:LTd/L;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 99
    .line 100
    monitor-exit p2

    .line 101
    throw p1

    .line 102
    :catchall_1
    move-exception p1

    .line 103
    goto :goto_2

    .line 104
    :cond_2
    :try_start_2
    invoke-virtual {p3}, LY/o1$b;->a()Ljava/lang/Throwable;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 109
    :goto_2
    monitor-exit p2

    .line 110
    throw p1
.end method

.method public static final synthetic D(LY/o1;)LGf/n;
    .locals 0

    .line 1
    invoke-direct {p0}, LY/o1;->i0()LGf/n;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic D0(LY/o1;Ljava/lang/Throwable;LY/Q;ZILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x2

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 7
    .line 8
    if-eqz p4, :cond_1

    .line 9
    .line 10
    const/4 p3, 0x0

    .line 11
    :cond_1
    invoke-direct {p0, p1, p2, p3}, LY/o1;->C0(Ljava/lang/Throwable;LY/Q;Z)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static final synthetic E(LY/o1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LY/o1;->j0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final E0(LY/Q;)Lkotlin/jvm/functions/Function1;
    .locals 1

    .line 1
    new-instance v0, LY/i1;

    .line 2
    .line 3
    invoke-direct {v0, p1}, LY/i1;-><init>(LY/Q;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final synthetic F(LY/o1;)LY/e;
    .locals 0

    .line 1
    iget-object p0, p0, LY/o1;->b:LY/e;

    .line 2
    .line 3
    return-object p0
.end method

.method private static final F0(LY/Q;Ljava/lang/Object;)LTd/L;
    .locals 0

    .line 1
    invoke-interface {p0, p1}, LY/Q;->a(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    sget-object p0, LTd/L;->a:LTd/L;

    .line 5
    .line 6
    return-object p0
.end method

.method public static final synthetic G(LY/o1;)La0/c;
    .locals 0

    .line 1
    iget-object p0, p0, LY/o1;->i:La0/c;

    .line 2
    .line 3
    return-object p0
.end method

.method private final G0(Lie/o;LZd/e;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-interface {p2}, LZd/e;->getContext()LZd/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, LY/v0;->a(LZd/i;)LY/t0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, LY/o1;->b:LY/e;

    .line 10
    .line 11
    new-instance v2, LY/o1$f;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-direct {v2, p0, p1, v0, v3}, LY/o1$f;-><init>(LY/o1;Lie/o;LY/t0;LZd/e;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v1, v2, p2}, LGf/i;->g(LZd/i;Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    if-ne p1, p2, :cond_0

    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 29
    .line 30
    return-object p1
.end method

.method public static final synthetic H(LY/o1;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, LY/o1;->o0()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private final H0()Z
    .locals 7

    .line 1
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LY/o1;->c:Ljava/lang/Object;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    iget-object v1, p0, LY/o1;->h:Lt/Q;

    .line 8
    .line 9
    invoke-virtual {v1}, Lt/e0;->d()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-direct {p0}, LY/o1;->q0()Z

    .line 16
    .line 17
    .line 18
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    monitor-exit v0

    .line 20
    return v1

    .line 21
    :catchall_0
    move-exception v1

    .line 22
    goto :goto_3

    .line 23
    :cond_0
    :try_start_1
    invoke-direct {p0}, LY/o1;->v0()Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iget-object v2, p0, LY/o1;->h:Lt/Q;

    .line 28
    .line 29
    invoke-static {v2}, La0/f;->a(Lt/e0;)Ljava/util/Set;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    new-instance v3, Lt/Q;

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    const/4 v5, 0x1

    .line 37
    const/4 v6, 0x0

    .line 38
    invoke-direct {v3, v6, v5, v4}, Lt/Q;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 39
    .line 40
    .line 41
    iput-object v3, p0, LY/o1;->h:Lt/Q;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    .line 43
    monitor-exit v0

    .line 44
    :try_start_2
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    :goto_0
    if-ge v6, v0, :cond_1

    .line 49
    .line 50
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    check-cast v3, LY/Q;

    .line 55
    .line 56
    invoke-interface {v3, v2}, LY/Q;->o(Ljava/util/Set;)V

    .line 57
    .line 58
    .line 59
    iget-object v3, p0, LY/o1;->w:LJf/u;

    .line 60
    .line 61
    invoke-interface {v3}, LJf/u;->getValue()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    check-cast v3, LY/o1$d;

    .line 66
    .line 67
    sget-object v4, LY/o1$d;->b:LY/o1$d;

    .line 68
    .line 69
    invoke-virtual {v3, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 70
    .line 71
    .line 72
    move-result v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 73
    if-lez v3, :cond_1

    .line 74
    .line 75
    add-int/lit8 v6, v6, 0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :catchall_1
    move-exception v0

    .line 79
    goto :goto_2

    .line 80
    :cond_1
    iget-object v0, p0, LY/o1;->c:Ljava/lang/Object;

    .line 81
    .line 82
    monitor-enter v0

    .line 83
    :try_start_3
    invoke-direct {p0}, LY/o1;->i0()LGf/n;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    if-nez v1, :cond_2

    .line 88
    .line 89
    invoke-direct {p0}, LY/o1;->q0()Z

    .line 90
    .line 91
    .line 92
    move-result v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 93
    monitor-exit v0

    .line 94
    return v1

    .line 95
    :catchall_2
    move-exception v1

    .line 96
    goto :goto_1

    .line 97
    :cond_2
    :try_start_4
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 98
    .line 99
    const-string v2, "called outside of runRecomposeAndApplyChanges"

    .line 100
    .line 101
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 105
    :goto_1
    monitor-exit v0

    .line 106
    throw v1

    .line 107
    :goto_2
    iget-object v1, p0, LY/o1;->c:Ljava/lang/Object;

    .line 108
    .line 109
    monitor-enter v1

    .line 110
    :try_start_5
    iget-object v3, p0, LY/o1;->h:Lt/Q;

    .line 111
    .line 112
    check-cast v2, Ljava/lang/Iterable;

    .line 113
    .line 114
    invoke-virtual {v3, v2}, Lt/Q;->i(Ljava/lang/Iterable;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 115
    .line 116
    .line 117
    monitor-exit v1

    .line 118
    throw v0

    .line 119
    :catchall_3
    move-exception v0

    .line 120
    monitor-exit v1

    .line 121
    throw v0

    .line 122
    :goto_3
    monitor-exit v0

    .line 123
    throw v1
.end method

.method public static final synthetic I(LY/o1;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, LY/o1;->r0()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private final I0(LY/Q;)V
    .locals 2

    .line 1
    iget-object v0, p0, LY/o1;->p:Ljava/util/List;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, LY/o1;->p:Ljava/util/List;

    .line 11
    .line 12
    :cond_0
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    :cond_1
    invoke-direct {p0, p1}, LY/o1;->L0(LY/Q;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public static final synthetic J(LY/o1;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, LY/o1;->k:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method private final J0(LY/Q;)V
    .locals 4

    .line 1
    iget-object v0, p0, LY/o1;->A:Lt/L;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, v0, Lt/V;->a:[Ljava/lang/Object;

    .line 6
    .line 7
    iget v0, v0, Lt/V;->b:I

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v2, v0, :cond_1

    .line 11
    .line 12
    aget-object v3, v1, v2

    .line 13
    .line 14
    invoke-static {v3}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    instance-of v3, p1, Lk0/r;

    .line 18
    .line 19
    if-nez v3, :cond_0

    .line 20
    .line 21
    add-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    check-cast p1, Lk0/r;

    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    throw p1

    .line 28
    :cond_1
    return-void
.end method

.method public static final synthetic K(LY/o1;)LY/o1$c;
    .locals 0

    .line 1
    iget-object p0, p0, LY/o1;->B:LY/o1$c;

    .line 2
    .line 3
    return-object p0
.end method

.method private final K0(LGf/C0;)V
    .locals 3

    .line 1
    iget-object v0, p0, LY/o1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LY/o1;->e:Ljava/lang/Throwable;

    .line 5
    .line 6
    if-nez v1, :cond_2

    .line 7
    .line 8
    iget-object v1, p0, LY/o1;->w:LJf/u;

    .line 9
    .line 10
    invoke-interface {v1}, LJf/u;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, LY/o1$d;

    .line 15
    .line 16
    sget-object v2, LY/o1$d;->b:LY/o1$d;

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-lez v1, :cond_1

    .line 23
    .line 24
    iget-object v1, p0, LY/o1;->d:LGf/C0;

    .line 25
    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    iput-object p1, p0, LY/o1;->d:LGf/C0;

    .line 29
    .line 30
    invoke-direct {p0}, LY/o1;->i0()LGf/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    .line 33
    monitor-exit v0

    .line 34
    return-void

    .line 35
    :catchall_0
    move-exception p1

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 38
    .line 39
    const-string v1, "Recomposer already running"

    .line 40
    .line 41
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw p1

    .line 45
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string v1, "Recomposer shut down"

    .line 48
    .line 49
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_2
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 54
    :goto_0
    monitor-exit v0

    .line 55
    throw p1
.end method

.method public static final synthetic L(LY/o1;)LGf/C0;
    .locals 0

    .line 1
    iget-object p0, p0, LY/o1;->d:LGf/C0;

    .line 2
    .line 3
    return-object p0
.end method

.method private final L0(LY/Q;)V
    .locals 1

    .line 1
    iget-object v0, p0, LY/o1;->f:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, LY/o1;->g:Ljava/util/List;

    .line 11
    .line 12
    invoke-direct {p0, p1}, LY/o1;->O0(LY/Q;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public static final synthetic M(LY/o1;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, LY/o1;->s0()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic N(LY/o1;)Lt/Q;
    .locals 0

    .line 1
    iget-object p0, p0, LY/o1;->h:Lt/Q;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic O(LY/o1;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, LY/o1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method private final O0(LY/Q;)V
    .locals 4

    .line 1
    iget-object v0, p0, LY/o1;->A:Lt/L;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, v0, Lt/V;->a:[Ljava/lang/Object;

    .line 6
    .line 7
    iget v0, v0, Lt/V;->b:I

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v2, v0, :cond_1

    .line 11
    .line 12
    aget-object v3, v1, v2

    .line 13
    .line 14
    invoke-static {v3}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    instance-of v3, p1, Lk0/r;

    .line 18
    .line 19
    if-nez v3, :cond_0

    .line 20
    .line 21
    add-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    check-cast p1, Lk0/r;

    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    throw p1

    .line 28
    :cond_1
    return-void
.end method

.method public static final synthetic P()LJf/u;
    .locals 1

    .line 1
    sget-object v0, LY/o1;->E:LJf/u;

    .line 2
    .line 3
    return-object v0
.end method

.method private final P0(LY/Q;Lt/Q;)Lkotlin/jvm/functions/Function1;
    .locals 1

    .line 1
    new-instance v0, LY/l1;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, LY/l1;-><init>(LY/Q;Lt/Q;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final synthetic Q(LY/o1;)LJf/u;
    .locals 0

    .line 1
    iget-object p0, p0, LY/o1;->w:LJf/u;

    .line 2
    .line 3
    return-object p0
.end method

.method private static final Q0(LY/Q;Lt/Q;Ljava/lang/Object;)LTd/L;
    .locals 0

    .line 1
    invoke-interface {p0, p2}, LY/Q;->s(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p1, p2}, Lt/Q;->h(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    :cond_0
    sget-object p0, LTd/L;->a:LTd/L;

    .line 10
    .line 11
    return-object p0
.end method

.method public static final synthetic R(LY/o1;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-direct {p0}, LY/o1;->u0()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic S(LY/o1;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-direct {p0}, LY/o1;->v0()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic T(LY/o1;Ljava/util/List;Lt/Q;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LY/o1;->z0(Ljava/util/List;Lt/Q;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic U(LY/o1;LY/Q;Lt/Q;)LY/Q;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LY/o1;->A0(LY/Q;Lt/Q;)LY/Q;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic V(LY/o1;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, LY/o1;->H0()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic W(LY/o1;LY/Q;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LY/o1;->I0(LY/Q;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic X(LY/o1;LGf/C0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LY/o1;->K0(LGf/C0;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic Y(LY/o1;J)V
    .locals 0

    .line 1
    iput-wide p1, p0, LY/o1;->a:J

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic Z(LY/o1;Ljava/util/Set;)V
    .locals 0

    .line 1
    iput-object p1, p0, LY/o1;->q:Ljava/util/Set;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic a0(LY/o1;LGf/C0;)V
    .locals 0

    .line 1
    iput-object p1, p0, LY/o1;->d:LGf/C0;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic b0(LY/o1;LGf/n;)V
    .locals 0

    .line 1
    iput-object p1, p0, LY/o1;->r:LGf/n;

    .line 2
    .line 3
    return-void
.end method

.method private final c0(LY/Q;)V
    .locals 1

    .line 1
    iget-object v0, p0, LY/o1;->f:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, LY/o1;->g:Ljava/util/List;

    .line 8
    .line 9
    invoke-direct {p0, p1}, LY/o1;->J0(LY/Q;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method private final d0(Li0/d;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p1}, Li0/d;->C()Li0/m;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v0, v0, Li0/m$a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Li0/d;->d()V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 14
    .line 15
    const-string v1, "Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition."

    .line 16
    .line 17
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    invoke-virtual {p1}, Li0/d;->d()V

    .line 23
    .line 24
    .line 25
    throw v0
.end method

.method private final e0(LZd/e;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-direct {p0}, LY/o1;->r0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_4

    .line 6
    .line 7
    new-instance v0, LGf/p;

    .line 8
    .line 9
    invoke-static {p1}, Lae/b;->c(LZd/e;)LZd/e;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/4 v2, 0x1

    .line 14
    invoke-direct {v0, v1, v2}, LGf/p;-><init>(LZd/e;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, LGf/p;->C()V

    .line 18
    .line 19
    .line 20
    invoke-static {p0}, LY/o1;->O(LY/o1;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    monitor-enter v1

    .line 25
    :try_start_0
    invoke-static {p0}, LY/o1;->I(LY/o1;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    move-object v2, v0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-static {p0, v0}, LY/o1;->b0(LY/o1;LGf/n;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    :goto_0
    monitor-exit v1

    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    sget-object v1, LTd/u;->b:LTd/u$a;

    .line 41
    .line 42
    sget-object v1, LTd/L;->a:LTd/L;

    .line 43
    .line 44
    invoke-static {v1}, LTd/u;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-interface {v2, v1}, LZd/e;->resumeWith(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    invoke-virtual {v0}, LGf/p;->v()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    if-ne v0, v1, :cond_2

    .line 60
    .line 61
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/h;->c(LZd/e;)V

    .line 62
    .line 63
    .line 64
    :cond_2
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    if-ne v0, p1, :cond_3

    .line 69
    .line 70
    return-object v0

    .line 71
    :cond_3
    sget-object p1, LTd/L;->a:LTd/L;

    .line 72
    .line 73
    return-object p1

    .line 74
    :catchall_0
    move-exception p1

    .line 75
    monitor-exit v1

    .line 76
    throw p1

    .line 77
    :cond_4
    sget-object p1, LTd/L;->a:LTd/L;

    .line 78
    .line 79
    return-object p1
.end method

.method private static final f0(LY/o1;)LTd/L;
    .locals 4

    .line 1
    iget-object v0, p0, LY/o1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-direct {p0}, LY/o1;->i0()LGf/n;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    iget-object v2, p0, LY/o1;->w:LJf/u;

    .line 9
    .line 10
    invoke-interface {v2}, LJf/u;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    check-cast v2, LY/o1$d;

    .line 15
    .line 16
    sget-object v3, LY/o1$d;->b:LY/o1$d;

    .line 17
    .line 18
    invoke-virtual {v2, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 19
    .line 20
    .line 21
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    if-lez v2, :cond_1

    .line 23
    .line 24
    monitor-exit v0

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    sget-object p0, LTd/u;->b:LTd/u$a;

    .line 28
    .line 29
    sget-object p0, LTd/L;->a:LTd/L;

    .line 30
    .line 31
    invoke-static {p0}, LTd/u;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-interface {v1, p0}, LZd/e;->resumeWith(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    sget-object p0, LTd/L;->a:LTd/L;

    .line 39
    .line 40
    return-object p0

    .line 41
    :cond_1
    :try_start_1
    const-string v1, "Recomposer shutdown; frame clock awaiter will never resume"

    .line 42
    .line 43
    iget-object p0, p0, LY/o1;->e:Ljava/lang/Throwable;

    .line 44
    .line 45
    invoke-static {v1, p0}, LGf/q0;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 50
    :catchall_0
    move-exception p0

    .line 51
    monitor-exit v0

    .line 52
    throw p0
.end method

.method private final h0()V
    .locals 2

    .line 1
    invoke-direct {p0}, LY/o1;->v0()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, LY/Q;

    .line 20
    .line 21
    invoke-direct {p0, v1}, LY/o1;->O0(LY/Q;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v0, p0, LY/o1;->f:Ljava/util/List;

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 28
    .line 29
    .line 30
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, LY/o1;->g:Ljava/util/List;

    .line 35
    .line 36
    return-void
.end method

.method private final i0()LGf/n;
    .locals 4

    .line 1
    iget-object v0, p0, LY/o1;->w:LJf/u;

    .line 2
    .line 3
    invoke-interface {v0}, LJf/u;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LY/o1$d;

    .line 8
    .line 9
    sget-object v1, LY/o1$d;->b:LY/o1$d;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    const/4 v2, 0x1

    .line 17
    const/4 v3, 0x0

    .line 18
    if-gtz v0, :cond_1

    .line 19
    .line 20
    invoke-direct {p0}, LY/o1;->h0()V

    .line 21
    .line 22
    .line 23
    new-instance v0, Lt/Q;

    .line 24
    .line 25
    invoke-direct {v0, v1, v2, v3}, Lt/Q;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, LY/o1;->h:Lt/Q;

    .line 29
    .line 30
    iget-object v0, p0, LY/o1;->i:La0/c;

    .line 31
    .line 32
    invoke-virtual {v0}, La0/c;->i()V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, LY/o1;->j:Ljava/util/List;

    .line 36
    .line 37
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, LY/o1;->k:Ljava/util/List;

    .line 41
    .line 42
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 43
    .line 44
    .line 45
    iput-object v3, p0, LY/o1;->p:Ljava/util/List;

    .line 46
    .line 47
    iget-object v0, p0, LY/o1;->r:LGf/n;

    .line 48
    .line 49
    if-eqz v0, :cond_0

    .line 50
    .line 51
    invoke-static {v0, v3, v2, v3}, LGf/n$a;->a(LGf/n;Ljava/lang/Throwable;ILjava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    :cond_0
    iput-object v3, p0, LY/o1;->r:LGf/n;

    .line 55
    .line 56
    iput-object v3, p0, LY/o1;->u:LY/o1$b;

    .line 57
    .line 58
    return-object v3

    .line 59
    :cond_1
    iget-object v0, p0, LY/o1;->u:LY/o1$b;

    .line 60
    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    sget-object v0, LY/o1$d;->c:LY/o1$d;

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    iget-object v0, p0, LY/o1;->d:LGf/C0;

    .line 67
    .line 68
    if-nez v0, :cond_4

    .line 69
    .line 70
    new-instance v0, Lt/Q;

    .line 71
    .line 72
    invoke-direct {v0, v1, v2, v3}, Lt/Q;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 73
    .line 74
    .line 75
    iput-object v0, p0, LY/o1;->h:Lt/Q;

    .line 76
    .line 77
    iget-object v0, p0, LY/o1;->i:La0/c;

    .line 78
    .line 79
    invoke-virtual {v0}, La0/c;->i()V

    .line 80
    .line 81
    .line 82
    invoke-direct {p0}, LY/o1;->p0()Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-eqz v0, :cond_3

    .line 87
    .line 88
    sget-object v0, LY/o1$d;->d:LY/o1$d;

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_3
    sget-object v0, LY/o1$d;->c:LY/o1$d;

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_4
    iget-object v0, p0, LY/o1;->i:La0/c;

    .line 95
    .line 96
    invoke-virtual {v0}, La0/c;->p()I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-eqz v0, :cond_5

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_5
    iget-object v0, p0, LY/o1;->h:Lt/Q;

    .line 104
    .line 105
    invoke-virtual {v0}, Lt/e0;->e()Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-nez v0, :cond_7

    .line 110
    .line 111
    iget-object v0, p0, LY/o1;->j:Ljava/util/List;

    .line 112
    .line 113
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-eqz v0, :cond_7

    .line 118
    .line 119
    iget-object v0, p0, LY/o1;->k:Ljava/util/List;

    .line 120
    .line 121
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-eqz v0, :cond_7

    .line 126
    .line 127
    iget v0, p0, LY/o1;->s:I

    .line 128
    .line 129
    if-gtz v0, :cond_7

    .line 130
    .line 131
    invoke-direct {p0}, LY/o1;->p0()Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-nez v0, :cond_7

    .line 136
    .line 137
    iget-object v0, p0, LY/o1;->l:Lt/P;

    .line 138
    .line 139
    invoke-static {v0}, La0/b;->j(Lt/P;)Z

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    if-eqz v0, :cond_6

    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_6
    sget-object v0, LY/o1$d;->e:LY/o1$d;

    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_7
    :goto_0
    sget-object v0, LY/o1$d;->f:LY/o1$d;

    .line 150
    .line 151
    :goto_1
    iget-object v1, p0, LY/o1;->w:LJf/u;

    .line 152
    .line 153
    invoke-interface {v1, v0}, LJf/u;->setValue(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    sget-object v1, LY/o1$d;->f:LY/o1$d;

    .line 157
    .line 158
    if-ne v0, v1, :cond_8

    .line 159
    .line 160
    iget-object v0, p0, LY/o1;->r:LGf/n;

    .line 161
    .line 162
    iput-object v3, p0, LY/o1;->r:LGf/n;

    .line 163
    .line 164
    return-object v0

    .line 165
    :cond_8
    return-object v3
.end method

.method private final j0()V
    .locals 8

    .line 1
    iget-object v0, p0, LY/o1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LY/o1;->l:Lt/P;

    .line 5
    .line 6
    invoke-static {v1}, La0/b;->j(Lt/P;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x0

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    iget-object v1, p0, LY/o1;->l:Lt/P;

    .line 14
    .line 15
    invoke-static {v1}, La0/b;->p(Lt/P;)Lt/V;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget-object v3, p0, LY/o1;->l:Lt/P;

    .line 20
    .line 21
    invoke-static {v3}, La0/b;->c(Lt/P;)V

    .line 22
    .line 23
    .line 24
    iget-object v3, p0, LY/o1;->m:LY/E0;

    .line 25
    .line 26
    invoke-virtual {v3}, LY/E0;->b()V

    .line 27
    .line 28
    .line 29
    iget-object v3, p0, LY/o1;->o:Lt/P;

    .line 30
    .line 31
    invoke-static {v3}, La0/b;->c(Lt/P;)V

    .line 32
    .line 33
    .line 34
    new-instance v3, Lt/L;

    .line 35
    .line 36
    invoke-virtual {v1}, Lt/V;->d()I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    invoke-direct {v3, v4}, Lt/L;-><init>(I)V

    .line 41
    .line 42
    .line 43
    iget-object v4, v1, Lt/V;->a:[Ljava/lang/Object;

    .line 44
    .line 45
    iget v1, v1, Lt/V;->b:I

    .line 46
    .line 47
    move v5, v2

    .line 48
    :goto_0
    if-ge v5, v1, :cond_0

    .line 49
    .line 50
    aget-object v6, v4, v5

    .line 51
    .line 52
    check-cast v6, LY/y0;

    .line 53
    .line 54
    iget-object v7, p0, LY/o1;->n:Lt/P;

    .line 55
    .line 56
    invoke-virtual {v7, v6}, Lt/c0;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    invoke-static {v6, v7}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    invoke-virtual {v3, v6}, Lt/L;->k(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    add-int/lit8 v5, v5, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :catchall_0
    move-exception v1

    .line 71
    goto :goto_3

    .line 72
    :cond_0
    iget-object v1, p0, LY/o1;->n:Lt/P;

    .line 73
    .line 74
    invoke-virtual {v1}, Lt/P;->k()V

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_1
    invoke-static {}, Lt/W;->b()Lt/V;

    .line 79
    .line 80
    .line 81
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    :goto_1
    monitor-exit v0

    .line 83
    iget-object v0, v3, Lt/V;->a:[Ljava/lang/Object;

    .line 84
    .line 85
    iget v1, v3, Lt/V;->b:I

    .line 86
    .line 87
    :goto_2
    if-ge v2, v1, :cond_2

    .line 88
    .line 89
    aget-object v3, v0, v2

    .line 90
    .line 91
    check-cast v3, Lkotlin/Pair;

    .line 92
    .line 93
    invoke-virtual {v3}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    check-cast v4, LY/y0;

    .line 98
    .line 99
    invoke-virtual {v3}, Lkotlin/Pair;->b()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    check-cast v3, LY/x0;

    .line 104
    .line 105
    add-int/lit8 v2, v2, 0x1

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_2
    return-void

    .line 109
    :goto_3
    monitor-exit v0

    .line 110
    throw v1
.end method

.method private static final k0(LY/o1;Ljava/lang/Throwable;)LTd/L;
    .locals 6

    .line 1
    const-string v0, "Recomposer effect job completed"

    .line 2
    .line 3
    invoke-static {v0, p1}, LGf/q0;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, LY/o1;->c:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v1

    .line 10
    :try_start_0
    iget-object v2, p0, LY/o1;->d:LGf/C0;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    if-eqz v2, :cond_2

    .line 14
    .line 15
    iget-object v4, p0, LY/o1;->w:LJf/u;

    .line 16
    .line 17
    sget-object v5, LY/o1$d;->b:LY/o1$d;

    .line 18
    .line 19
    invoke-interface {v4, v5}, LJf/u;->setValue(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-boolean v4, p0, LY/o1;->t:Z

    .line 23
    .line 24
    if-nez v4, :cond_0

    .line 25
    .line 26
    invoke-interface {v2, v0}, LGf/C0;->k(Ljava/util/concurrent/CancellationException;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p0

    .line 31
    goto :goto_3

    .line 32
    :cond_0
    iget-object v0, p0, LY/o1;->r:LGf/n;

    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    :goto_0
    move-object v0, v3

    .line 38
    :goto_1
    iput-object v3, p0, LY/o1;->r:LGf/n;

    .line 39
    .line 40
    new-instance v3, LY/m1;

    .line 41
    .line 42
    invoke-direct {v3, p0, p1}, LY/m1;-><init>(LY/o1;Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    invoke-interface {v2, v3}, LGf/C0;->H(Lkotlin/jvm/functions/Function1;)LGf/h0;

    .line 46
    .line 47
    .line 48
    move-object v3, v0

    .line 49
    goto :goto_2

    .line 50
    :cond_2
    iput-object v0, p0, LY/o1;->e:Ljava/lang/Throwable;

    .line 51
    .line 52
    iget-object p0, p0, LY/o1;->w:LJf/u;

    .line 53
    .line 54
    sget-object p1, LY/o1$d;->a:LY/o1$d;

    .line 55
    .line 56
    invoke-interface {p0, p1}, LJf/u;->setValue(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    sget-object p0, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    :goto_2
    monitor-exit v1

    .line 62
    if-eqz v3, :cond_3

    .line 63
    .line 64
    sget-object p0, LTd/u;->b:LTd/u$a;

    .line 65
    .line 66
    sget-object p0, LTd/L;->a:LTd/L;

    .line 67
    .line 68
    invoke-static {p0}, LTd/u;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-interface {v3, p0}, LZd/e;->resumeWith(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    :cond_3
    sget-object p0, LTd/L;->a:LTd/L;

    .line 76
    .line 77
    return-object p0

    .line 78
    :goto_3
    monitor-exit v1

    .line 79
    throw p0
.end method

.method private static final l0(LY/o1;Ljava/lang/Throwable;Ljava/lang/Throwable;)LTd/L;
    .locals 3

    .line 1
    iget-object v0, p0, LY/o1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    if-eqz p2, :cond_2

    .line 8
    .line 9
    :try_start_0
    instance-of v2, p2, Ljava/util/concurrent/CancellationException;

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object p2, v1

    .line 15
    :goto_0
    if-eqz p2, :cond_2

    .line 16
    .line 17
    invoke-static {p1, p2}, LTd/g;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    goto :goto_1

    .line 21
    :catchall_0
    move-exception p0

    .line 22
    goto :goto_2

    .line 23
    :cond_1
    move-object p1, v1

    .line 24
    :cond_2
    :goto_1
    iput-object p1, p0, LY/o1;->e:Ljava/lang/Throwable;

    .line 25
    .line 26
    iget-object p0, p0, LY/o1;->w:LJf/u;

    .line 27
    .line 28
    sget-object p1, LY/o1$d;->a:LY/o1$d;

    .line 29
    .line 30
    invoke-interface {p0, p1}, LJf/u;->setValue(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    .line 33
    monitor-exit v0

    .line 34
    sget-object p0, LTd/L;->a:LTd/L;

    .line 35
    .line 36
    return-object p0

    .line 37
    :goto_2
    monitor-exit v0

    .line 38
    throw p0
.end method

.method private final o0()Z
    .locals 2

    .line 1
    iget-object v0, p0, LY/o1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-direct {p0}, LY/o1;->p0()Z

    .line 5
    .line 6
    .line 7
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    monitor-exit v0

    .line 9
    return v1

    .line 10
    :catchall_0
    move-exception v1

    .line 11
    monitor-exit v0

    .line 12
    throw v1
.end method

.method private final p0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LY/o1;->v:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LY/o1;->b:LY/e;

    .line 6
    .line 7
    invoke-virtual {v0}, LY/e;->n()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

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

.method private final q0()Z
    .locals 1

    .line 1
    iget-object v0, p0, LY/o1;->i:La0/c;

    .line 2
    .line 3
    invoke-virtual {v0}, La0/c;->p()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-direct {p0}, LY/o1;->p0()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_2

    .line 15
    .line 16
    iget-object v0, p0, LY/o1;->l:Lt/P;

    .line 17
    .line 18
    invoke-static {v0}, La0/b;->j(Lt/P;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 v0, 0x0

    .line 26
    return v0

    .line 27
    :cond_2
    :goto_0
    const/4 v0, 0x1

    .line 28
    return v0
.end method

.method private final r0()Z
    .locals 2

    .line 1
    iget-object v0, p0, LY/o1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LY/o1;->h:Lt/Q;

    .line 5
    .line 6
    invoke-virtual {v1}, Lt/e0;->e()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_2

    .line 11
    .line 12
    iget-object v1, p0, LY/o1;->i:La0/c;

    .line 13
    .line 14
    invoke-virtual {v1}, La0/c;->p()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-direct {p0}, LY/o1;->p0()Z

    .line 22
    .line 23
    .line 24
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/4 v1, 0x0

    .line 29
    goto :goto_1

    .line 30
    :catchall_0
    move-exception v1

    .line 31
    goto :goto_2

    .line 32
    :cond_2
    :goto_0
    const/4 v1, 0x1

    .line 33
    :goto_1
    monitor-exit v0

    .line 34
    return v1

    .line 35
    :goto_2
    monitor-exit v0

    .line 36
    throw v1
.end method

.method private final s0()Z
    .locals 2

    .line 1
    iget-object v0, p0, LY/o1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, LY/o1;->t:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    if-eqz v1, :cond_2

    .line 8
    .line 9
    iget-object v0, p0, LY/o1;->y:LGf/A;

    .line 10
    .line 11
    invoke-interface {v0}, LGf/C0;->g()LCf/i;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, LCf/i;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, LGf/C0;

    .line 30
    .line 31
    invoke-interface {v1}, LGf/C0;->b()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/4 v0, 0x0

    .line 39
    return v0

    .line 40
    :cond_2
    :goto_0
    const/4 v0, 0x1

    .line 41
    return v0

    .line 42
    :catchall_0
    move-exception v1

    .line 43
    monitor-exit v0

    .line 44
    throw v1
.end method

.method private final u0()Ljava/util/List;
    .locals 2

    .line 1
    iget-object v0, p0, LY/o1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-direct {p0}, LY/o1;->v0()Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    monitor-exit v0

    .line 9
    return-object v1

    .line 10
    :catchall_0
    move-exception v1

    .line 11
    monitor-exit v0

    .line 12
    throw v1
.end method

.method private final v0()Ljava/util/List;
    .locals 2

    .line 1
    iget-object v0, p0, LY/o1;->g:Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-object v0, p0, LY/o1;->f:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    goto :goto_0

    .line 19
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 22
    .line 23
    .line 24
    move-object v0, v1

    .line 25
    :goto_0
    iput-object v0, p0, LY/o1;->g:Ljava/util/List;

    .line 26
    .line 27
    return-object v0
.end method

.method public static synthetic w(LY/Q;Ljava/lang/Object;)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LY/o1;->F0(LY/Q;Ljava/lang/Object;)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic x(Lt/Q;LY/Q;)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LY/o1;->B0(Lt/Q;LY/Q;)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final x0(LY/Q;)V
    .locals 5

    .line 1
    iget-object v0, p0, LY/o1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LY/o1;->k:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    const/4 v3, 0x0

    .line 11
    :goto_0
    if-ge v3, v2, :cond_2

    .line 12
    .line 13
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    check-cast v4, LY/y0;

    .line 18
    .line 19
    invoke-virtual {v4}, LY/y0;->b()LY/Q;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-static {v4, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-eqz v4, :cond_1

    .line 28
    .line 29
    sget-object v1, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    monitor-exit v0

    .line 32
    new-instance v0, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-static {v0, p0, p1}, LY/o1;->y0(Ljava/util/List;LY/o1;LY/Q;)V

    .line 38
    .line 39
    .line 40
    :goto_1
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-nez v1, :cond_0

    .line 45
    .line 46
    const/4 v1, 0x0

    .line 47
    invoke-direct {p0, v0, v1}, LY/o1;->z0(Ljava/util/List;Lt/Q;)Ljava/util/List;

    .line 48
    .line 49
    .line 50
    invoke-static {v0, p0, p1}, LY/o1;->y0(Ljava/util/List;LY/o1;LY/Q;)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_0
    return-void

    .line 55
    :catchall_0
    move-exception p1

    .line 56
    goto :goto_2

    .line 57
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    monitor-exit v0

    .line 61
    return-void

    .line 62
    :goto_2
    monitor-exit v0

    .line 63
    throw p1
.end method

.method public static synthetic y(LY/o1;Ljava/lang/Throwable;Ljava/lang/Throwable;)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LY/o1;->l0(LY/o1;Ljava/lang/Throwable;Ljava/lang/Throwable;)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final y0(Ljava/util/List;LY/o1;LY/Q;)V
    .locals 3

    .line 1
    invoke-interface {p0}, Ljava/util/List;->clear()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, LY/o1;->c:Ljava/lang/Object;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    iget-object p1, p1, LY/o1;->k:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, LY/y0;

    .line 24
    .line 25
    invoke-virtual {v1}, LY/y0;->b()LY/Q;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-static {v2, p2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    invoke-interface {p0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception p0

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    sget-object p0, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    monitor-exit v0

    .line 47
    return-void

    .line 48
    :goto_1
    monitor-exit v0

    .line 49
    throw p0
.end method

.method public static synthetic z(LY/o1;)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0}, LY/o1;->f0(LY/o1;)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final z0(Ljava/util/List;Lt/Q;)Ljava/util/List;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    new-instance v0, Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    invoke-direct {v0, v2}, Ljava/util/HashMap;-><init>(I)V

    .line 10
    .line 11
    .line 12
    invoke-interface/range {p1 .. p1}, Ljava/util/Collection;->size()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const/4 v4, 0x0

    .line 17
    :goto_0
    if-ge v4, v2, :cond_1

    .line 18
    .line 19
    move-object/from16 v5, p1

    .line 20
    .line 21
    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    move-object v7, v6

    .line 26
    check-cast v7, LY/y0;

    .line 27
    .line 28
    invoke-virtual {v7}, LY/y0;->b()LY/Q;

    .line 29
    .line 30
    .line 31
    move-result-object v7

    .line 32
    invoke-interface {v0, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v8

    .line 36
    if-nez v8, :cond_0

    .line 37
    .line 38
    new-instance v8, Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-interface {v0, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    :cond_0
    check-cast v8, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    add-int/lit8 v4, v4, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-eqz v4, :cond_11

    .line 67
    .line 68
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    check-cast v4, Ljava/util/Map$Entry;

    .line 73
    .line 74
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    check-cast v5, LY/Q;

    .line 79
    .line 80
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    check-cast v4, Ljava/util/List;

    .line 85
    .line 86
    invoke-interface {v5}, LY/Q;->q()Z

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    if-eqz v6, :cond_2

    .line 91
    .line 92
    const-string v6, "Check failed"

    .line 93
    .line 94
    invoke-static {v6}, LY/w;->t(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    :cond_2
    sget-object v6, Li0/l;->e:Li0/l$a;

    .line 98
    .line 99
    invoke-direct {v1, v5}, LY/o1;->E0(LY/Q;)Lkotlin/jvm/functions/Function1;

    .line 100
    .line 101
    .line 102
    move-result-object v7

    .line 103
    move-object/from16 v8, p2

    .line 104
    .line 105
    invoke-direct {v1, v5, v8}, LY/o1;->P0(LY/Q;Lt/Q;)Lkotlin/jvm/functions/Function1;

    .line 106
    .line 107
    .line 108
    move-result-object v9

    .line 109
    invoke-virtual {v6, v7, v9}, Li0/l$a;->n(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Li0/d;

    .line 110
    .line 111
    .line 112
    move-result-object v6

    .line 113
    :try_start_0
    invoke-virtual {v6}, Li0/l;->l()Li0/l;

    .line 114
    .line 115
    .line 116
    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 117
    :try_start_1
    iget-object v9, v1, LY/o1;->c:Ljava/lang/Object;

    .line 118
    .line 119
    monitor-enter v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 120
    :try_start_2
    new-instance v10, Ljava/util/ArrayList;

    .line 121
    .line 122
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 123
    .line 124
    .line 125
    move-result v11

    .line 126
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 127
    .line 128
    .line 129
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 130
    .line 131
    .line 132
    move-result v11

    .line 133
    const/4 v12, 0x0

    .line 134
    :goto_2
    const/4 v13, 0x0

    .line 135
    if-ge v12, v11, :cond_4

    .line 136
    .line 137
    invoke-interface {v4, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v14

    .line 141
    check-cast v14, LY/y0;

    .line 142
    .line 143
    iget-object v15, v1, LY/o1;->l:Lt/P;

    .line 144
    .line 145
    invoke-virtual {v14}, LY/y0;->c()LY/w0;

    .line 146
    .line 147
    .line 148
    invoke-static {v15, v13}, La0/b;->l(Lt/P;Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v13

    .line 152
    move-object v15, v13

    .line 153
    check-cast v15, LY/y0;

    .line 154
    .line 155
    if-eqz v15, :cond_3

    .line 156
    .line 157
    iget-object v3, v1, LY/o1;->m:LY/E0;

    .line 158
    .line 159
    invoke-virtual {v3, v15}, LY/E0;->e(LY/y0;)V

    .line 160
    .line 161
    .line 162
    goto :goto_3

    .line 163
    :catchall_0
    move-exception v0

    .line 164
    goto/16 :goto_d

    .line 165
    .line 166
    :cond_3
    :goto_3
    invoke-static {v14, v13}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    invoke-interface {v10, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    add-int/lit8 v12, v12, 0x1

    .line 174
    .line 175
    goto :goto_2

    .line 176
    :cond_4
    sget-boolean v3, LY/l;->b:Z

    .line 177
    .line 178
    if-eqz v3, :cond_8

    .line 179
    .line 180
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 181
    .line 182
    .line 183
    move-result v3

    .line 184
    const/4 v4, 0x0

    .line 185
    :goto_4
    if-ge v4, v3, :cond_8

    .line 186
    .line 187
    invoke-interface {v10, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v11

    .line 191
    check-cast v11, Lkotlin/Pair;

    .line 192
    .line 193
    invoke-virtual {v11}, Lkotlin/Pair;->d()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v12

    .line 197
    if-nez v12, :cond_7

    .line 198
    .line 199
    iget-object v12, v1, LY/o1;->m:LY/E0;

    .line 200
    .line 201
    invoke-virtual {v11}, Lkotlin/Pair;->c()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v11

    .line 205
    check-cast v11, LY/y0;

    .line 206
    .line 207
    invoke-virtual {v11}, LY/y0;->c()LY/w0;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v12, v13}, LY/E0;->c(LY/w0;)Z

    .line 211
    .line 212
    .line 213
    move-result v11

    .line 214
    if-eqz v11, :cond_7

    .line 215
    .line 216
    new-instance v3, Ljava/util/ArrayList;

    .line 217
    .line 218
    const/16 v4, 0xa

    .line 219
    .line 220
    invoke-static {v10, v4}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 221
    .line 222
    .line 223
    move-result v4

    .line 224
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 225
    .line 226
    .line 227
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 228
    .line 229
    .line 230
    move-result-object v4

    .line 231
    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 232
    .line 233
    .line 234
    move-result v10

    .line 235
    if-eqz v10, :cond_6

    .line 236
    .line 237
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v10

    .line 241
    check-cast v10, Lkotlin/Pair;

    .line 242
    .line 243
    invoke-virtual {v10}, Lkotlin/Pair;->d()Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v11

    .line 247
    if-nez v11, :cond_5

    .line 248
    .line 249
    iget-object v11, v1, LY/o1;->m:LY/E0;

    .line 250
    .line 251
    invoke-virtual {v10}, Lkotlin/Pair;->c()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v12

    .line 255
    check-cast v12, LY/y0;

    .line 256
    .line 257
    invoke-virtual {v12}, LY/y0;->c()LY/w0;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v11, v13}, LY/E0;->d(LY/w0;)LY/F0;

    .line 261
    .line 262
    .line 263
    :cond_5
    invoke-interface {v3, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 264
    .line 265
    .line 266
    goto :goto_5

    .line 267
    :cond_6
    move-object v10, v3

    .line 268
    goto :goto_6

    .line 269
    :cond_7
    add-int/lit8 v4, v4, 0x1

    .line 270
    .line 271
    goto :goto_4

    .line 272
    :cond_8
    :goto_6
    :try_start_3
    monitor-exit v9

    .line 273
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 274
    .line 275
    .line 276
    move-result v3

    .line 277
    const/4 v4, 0x0

    .line 278
    :goto_7
    if-ge v4, v3, :cond_10

    .line 279
    .line 280
    invoke-interface {v10, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v9

    .line 284
    check-cast v9, Lkotlin/Pair;

    .line 285
    .line 286
    invoke-virtual {v9}, Lkotlin/Pair;->d()Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v9

    .line 290
    if-nez v9, :cond_9

    .line 291
    .line 292
    add-int/lit8 v4, v4, 0x1

    .line 293
    .line 294
    goto :goto_7

    .line 295
    :cond_9
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 296
    .line 297
    .line 298
    move-result v3

    .line 299
    const/4 v4, 0x0

    .line 300
    :goto_8
    if-ge v4, v3, :cond_10

    .line 301
    .line 302
    invoke-interface {v10, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v9

    .line 306
    check-cast v9, Lkotlin/Pair;

    .line 307
    .line 308
    invoke-virtual {v9}, Lkotlin/Pair;->d()Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v9

    .line 312
    if-eqz v9, :cond_a

    .line 313
    .line 314
    add-int/lit8 v4, v4, 0x1

    .line 315
    .line 316
    goto :goto_8

    .line 317
    :cond_a
    new-instance v3, Ljava/util/ArrayList;

    .line 318
    .line 319
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 320
    .line 321
    .line 322
    move-result v4

    .line 323
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 324
    .line 325
    .line 326
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 327
    .line 328
    .line 329
    move-result v4

    .line 330
    const/4 v9, 0x0

    .line 331
    :goto_9
    if-ge v9, v4, :cond_d

    .line 332
    .line 333
    invoke-interface {v10, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v11

    .line 337
    check-cast v11, Lkotlin/Pair;

    .line 338
    .line 339
    invoke-virtual {v11}, Lkotlin/Pair;->d()Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v12

    .line 343
    if-nez v12, :cond_b

    .line 344
    .line 345
    invoke-virtual {v11}, Lkotlin/Pair;->c()Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v11

    .line 349
    check-cast v11, LY/y0;

    .line 350
    .line 351
    goto :goto_a

    .line 352
    :catchall_1
    move-exception v0

    .line 353
    goto :goto_e

    .line 354
    :cond_b
    move-object v11, v13

    .line 355
    :goto_a
    if-eqz v11, :cond_c

    .line 356
    .line 357
    invoke-interface {v3, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    :cond_c
    add-int/lit8 v9, v9, 0x1

    .line 361
    .line 362
    goto :goto_9

    .line 363
    :cond_d
    iget-object v4, v1, LY/o1;->c:Ljava/lang/Object;

    .line 364
    .line 365
    monitor-enter v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 366
    :try_start_4
    iget-object v9, v1, LY/o1;->k:Ljava/util/List;

    .line 367
    .line 368
    invoke-static {v9, v3}, LUd/u;->D(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    .line 369
    .line 370
    .line 371
    sget-object v3, LTd/L;->a:LTd/L;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 372
    .line 373
    :try_start_5
    monitor-exit v4

    .line 374
    new-instance v3, Ljava/util/ArrayList;

    .line 375
    .line 376
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 377
    .line 378
    .line 379
    move-result v4

    .line 380
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 381
    .line 382
    .line 383
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 384
    .line 385
    .line 386
    move-result v4

    .line 387
    const/4 v9, 0x0

    .line 388
    :goto_b
    if-ge v9, v4, :cond_f

    .line 389
    .line 390
    invoke-interface {v10, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    move-result-object v11

    .line 394
    move-object v12, v11

    .line 395
    check-cast v12, Lkotlin/Pair;

    .line 396
    .line 397
    invoke-virtual {v12}, Lkotlin/Pair;->d()Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v12

    .line 401
    if-eqz v12, :cond_e

    .line 402
    .line 403
    invoke-interface {v3, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 404
    .line 405
    .line 406
    :cond_e
    add-int/lit8 v9, v9, 0x1

    .line 407
    .line 408
    goto :goto_b

    .line 409
    :cond_f
    move-object v10, v3

    .line 410
    goto :goto_c

    .line 411
    :catchall_2
    move-exception v0

    .line 412
    monitor-exit v4

    .line 413
    throw v0

    .line 414
    :cond_10
    :goto_c
    invoke-interface {v5, v10}, LY/Q;->j(Ljava/util/List;)V

    .line 415
    .line 416
    .line 417
    sget-object v3, LTd/L;->a:LTd/L;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 418
    .line 419
    :try_start_6
    invoke-virtual {v6, v7}, Li0/l;->s(Li0/l;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 420
    .line 421
    .line 422
    invoke-direct {v1, v6}, LY/o1;->d0(Li0/d;)V

    .line 423
    .line 424
    .line 425
    goto/16 :goto_1

    .line 426
    .line 427
    :catchall_3
    move-exception v0

    .line 428
    goto :goto_f

    .line 429
    :goto_d
    :try_start_7
    monitor-exit v9

    .line 430
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 431
    :goto_e
    :try_start_8
    invoke-virtual {v6, v7}, Li0/l;->s(Li0/l;)V

    .line 432
    .line 433
    .line 434
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 435
    :goto_f
    invoke-direct {v1, v6}, LY/o1;->d0(Li0/d;)V

    .line 436
    .line 437
    .line 438
    throw v0

    .line 439
    :cond_11
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    check-cast v0, Ljava/lang/Iterable;

    .line 444
    .line 445
    invoke-static {v0}, LUd/u;->b1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 446
    .line 447
    .line 448
    move-result-object v0

    .line 449
    return-object v0
.end method


# virtual methods
.method public final M0()V
    .locals 2

    .line 1
    iget-object v0, p0, LY/o1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, LY/o1;->v:Z

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    iput-boolean v1, p0, LY/o1;->v:Z

    .line 10
    .line 11
    invoke-direct {p0}, LY/o1;->i0()LGf/n;

    .line 12
    .line 13
    .line 14
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v1

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    const/4 v1, 0x0

    .line 19
    :goto_0
    monitor-exit v0

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    sget-object v0, LTd/u;->b:LTd/u$a;

    .line 23
    .line 24
    sget-object v0, LTd/L;->a:LTd/L;

    .line 25
    .line 26
    invoke-static {v0}, LTd/u;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-interface {v1, v0}, LZd/e;->resumeWith(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    return-void

    .line 34
    :goto_1
    monitor-exit v0

    .line 35
    throw v1
.end method

.method public final N0(LZd/e;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, LY/o1$g;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, LY/o1$g;-><init>(LY/o1;LZd/e;)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, v0, p1}, LY/o1;->G0(Lie/o;LZd/e;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-ne p1, v0, :cond_0

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 19
    .line 20
    return-object p1
.end method

.method public a(LY/Q;Lkotlin/jvm/functions/Function2;)V
    .locals 7

    .line 1
    invoke-interface {p1}, LY/Q;->q()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, LY/o1;->c:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v1

    .line 8
    :try_start_0
    iget-object v2, p0, LY/o1;->w:LJf/u;

    .line 9
    .line 10
    invoke-interface {v2}, LJf/u;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    check-cast v2, LY/o1$d;

    .line 15
    .line 16
    sget-object v3, LY/o1$d;->b:LY/o1$d;

    .line 17
    .line 18
    invoke-virtual {v2, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 19
    .line 20
    .line 21
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_9

    .line 22
    const/4 v3, 0x1

    .line 23
    if-lez v2, :cond_0

    .line 24
    .line 25
    :try_start_1
    invoke-direct {p0}, LY/o1;->v0()Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-interface {v2, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    xor-int/lit8 v4, v2, 0x1

    .line 34
    .line 35
    if-nez v2, :cond_1

    .line 36
    .line 37
    invoke-direct {p0, p1}, LY/o1;->c0(LY/Q;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception v0

    .line 42
    move-object p1, v0

    .line 43
    move-object p2, p0

    .line 44
    goto/16 :goto_4

    .line 45
    .line 46
    :cond_0
    move v4, v3

    .line 47
    :cond_1
    :goto_0
    monitor-exit v1

    .line 48
    :try_start_2
    sget-object v1, Li0/l;->e:Li0/l$a;

    .line 49
    .line 50
    invoke-direct {p0, p1}, LY/o1;->E0(LY/Q;)Lkotlin/jvm/functions/Function1;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    const/4 v5, 0x0

    .line 55
    invoke-direct {p0, p1, v5}, LY/o1;->P0(LY/Q;Lt/Q;)Lkotlin/jvm/functions/Function1;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    invoke-virtual {v1, v2, v5}, Li0/l$a;->n(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Li0/d;

    .line 60
    .line 61
    .line 62
    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 63
    :try_start_3
    invoke-virtual {v2}, Li0/l;->l()Li0/l;

    .line 64
    .line 65
    .line 66
    move-result-object v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 67
    :try_start_4
    invoke-interface {p1, p2}, LY/Q;->b(Lkotlin/jvm/functions/Function2;)V

    .line 68
    .line 69
    .line 70
    sget-object p2, LTd/L;->a:LTd/L;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 71
    .line 72
    :try_start_5
    invoke-virtual {v2, v5}, Li0/l;->s(Li0/l;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 73
    .line 74
    .line 75
    :try_start_6
    invoke-direct {p0, v2}, LY/o1;->d0(Li0/d;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 76
    .line 77
    .line 78
    if-nez v0, :cond_2

    .line 79
    .line 80
    invoke-virtual {v1}, Li0/l$a;->f()V

    .line 81
    .line 82
    .line 83
    :cond_2
    :try_start_7
    invoke-direct {p0, p1}, LY/o1;->x0(LY/Q;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 84
    .line 85
    .line 86
    :try_start_8
    invoke-interface {p1}, LY/Q;->p()V

    .line 87
    .line 88
    .line 89
    invoke-interface {p1}, LY/Q;->c()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 90
    .line 91
    .line 92
    if-nez v0, :cond_3

    .line 93
    .line 94
    invoke-virtual {v1}, Li0/l$a;->f()V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :cond_3
    move-object p2, p0

    .line 99
    goto :goto_3

    .line 100
    :catchall_1
    move-exception v0

    .line 101
    move-object p1, v0

    .line 102
    move-object v2, p1

    .line 103
    const/4 v5, 0x6

    .line 104
    const/4 v6, 0x0

    .line 105
    const/4 v3, 0x0

    .line 106
    const/4 v4, 0x0

    .line 107
    move-object v1, p0

    .line 108
    invoke-static/range {v1 .. v6}, LY/o1;->D0(LY/o1;Ljava/lang/Throwable;LY/Q;ZILjava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    move-object p2, v1

    .line 112
    return-void

    .line 113
    :catchall_2
    move-exception v0

    .line 114
    move-object p2, p0

    .line 115
    invoke-direct {p0, v0, p1, v3}, LY/o1;->C0(Ljava/lang/Throwable;LY/Q;Z)V

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :catchall_3
    move-exception v0

    .line 120
    move-object p2, p0

    .line 121
    goto :goto_2

    .line 122
    :catchall_4
    move-exception v0

    .line 123
    move-object p2, p0

    .line 124
    goto :goto_1

    .line 125
    :catchall_5
    move-exception v0

    .line 126
    move-object p2, p0

    .line 127
    :try_start_9
    invoke-virtual {v2, v5}, Li0/l;->s(Li0/l;)V

    .line 128
    .line 129
    .line 130
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    .line 131
    :catchall_6
    move-exception v0

    .line 132
    :goto_1
    :try_start_a
    invoke-direct {p0, v2}, LY/o1;->d0(Li0/d;)V

    .line 133
    .line 134
    .line 135
    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    .line 136
    :catchall_7
    move-exception v0

    .line 137
    :goto_2
    invoke-direct {p0, v0, p1, v3}, LY/o1;->C0(Ljava/lang/Throwable;LY/Q;Z)V

    .line 138
    .line 139
    .line 140
    if-eqz v4, :cond_4

    .line 141
    .line 142
    iget-object v1, p2, LY/o1;->c:Ljava/lang/Object;

    .line 143
    .line 144
    monitor-enter v1

    .line 145
    :try_start_b
    invoke-direct {p0, p1}, LY/o1;->L0(LY/Q;)V

    .line 146
    .line 147
    .line 148
    sget-object p1, LTd/L;->a:LTd/L;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_8

    .line 149
    .line 150
    monitor-exit v1

    .line 151
    goto :goto_3

    .line 152
    :catchall_8
    move-exception v0

    .line 153
    move-object p1, v0

    .line 154
    monitor-exit v1

    .line 155
    throw p1

    .line 156
    :cond_4
    :goto_3
    return-void

    .line 157
    :catchall_9
    move-exception v0

    .line 158
    move-object p2, p0

    .line 159
    move-object p1, v0

    .line 160
    :goto_4
    monitor-exit v1

    .line 161
    throw p1
.end method

.method public b(LY/Q;LY/C1;Lkotlin/jvm/functions/Function2;)Lt/e0;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-interface {p1, p2}, LY/Q;->i(LY/C1;)LY/C1;

    .line 3
    .line 4
    .line 5
    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    :try_start_1
    invoke-virtual {p0, p1, p3}, LY/o1;->a(LY/Q;Lkotlin/jvm/functions/Function2;)V

    .line 7
    .line 8
    .line 9
    iget-object p3, p0, LY/o1;->x:Lg0/r;

    .line 10
    .line 11
    invoke-virtual {p3}, Lg0/r;->a()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    check-cast p3, Lt/Q;

    .line 16
    .line 17
    if-eqz p3, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-static {}, Lt/f0;->a()Lt/e0;

    .line 21
    .line 22
    .line 23
    move-result-object p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 24
    :goto_0
    :try_start_2
    invoke-interface {p1, p2}, LY/Q;->i(LY/C1;)LY/C1;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, LY/o1;->x:Lg0/r;

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Lg0/r;->b(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    return-object p3

    .line 33
    :catchall_0
    move-exception p1

    .line 34
    goto :goto_1

    .line 35
    :catchall_1
    move-exception p3

    .line 36
    :try_start_3
    invoke-interface {p1, p2}, LY/Q;->i(LY/C1;)LY/C1;

    .line 37
    .line 38
    .line 39
    throw p3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 40
    :goto_1
    iget-object p2, p0, LY/o1;->x:Lg0/r;

    .line 41
    .line 42
    invoke-virtual {p2, v0}, Lg0/r;->b(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    throw p1
.end method

.method public d()Z
    .locals 1

    .line 1
    sget-object v0, LY/o1;->F:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public e()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public f()Z
    .locals 1

    .line 1
    invoke-static {}, LY/w;->B()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public g()J
    .locals 2

    .line 1
    const/16 v0, 0x3e8

    .line 2
    .line 3
    int-to-long v0, v0

    .line 4
    return-wide v0
.end method

.method public final g0()V
    .locals 3

    .line 1
    iget-object v0, p0, LY/o1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LY/o1;->w:LJf/u;

    .line 5
    .line 6
    invoke-interface {v1}, LJf/u;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, LY/o1$d;

    .line 11
    .line 12
    sget-object v2, LY/o1$d;->e:LY/o1$d;

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-ltz v1, :cond_0

    .line 19
    .line 20
    iget-object v1, p0, LY/o1;->w:LJf/u;

    .line 21
    .line 22
    sget-object v2, LY/o1$d;->b:LY/o1$d;

    .line 23
    .line 24
    invoke-interface {v1, v2}, LJf/u;->setValue(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception v1

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    :goto_0
    sget-object v1, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    monitor-exit v0

    .line 33
    iget-object v0, p0, LY/o1;->y:LGf/A;

    .line 34
    .line 35
    const/4 v1, 0x1

    .line 36
    const/4 v2, 0x0

    .line 37
    invoke-static {v0, v2, v1, v2}, LGf/C0$a;->a(LGf/C0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :goto_1
    monitor-exit v0

    .line 42
    throw v1
.end method

.method public h()LY/x;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public j()LZd/i;
    .locals 1

    .line 1
    iget-object v0, p0, LY/o1;->z:LZd/i;

    .line 2
    .line 3
    return-object v0
.end method

.method public l(LY/y0;)V
    .locals 2

    .line 1
    iget-object v0, p0, LY/o1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LY/o1;->k:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v1, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, LY/o1;->i0()LGf/n;

    .line 10
    .line 11
    .line 12
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    monitor-exit v0

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    sget-object v0, LTd/u;->b:LTd/u$a;

    .line 17
    .line 18
    sget-object v0, LTd/L;->a:LTd/L;

    .line 19
    .line 20
    invoke-static {v0}, LTd/u;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-interface {p1, v0}, LZd/e;->resumeWith(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    monitor-exit v0

    .line 30
    throw p1
.end method

.method public m(LY/Q;)V
    .locals 2

    .line 1
    iget-object v0, p0, LY/o1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LY/o1;->i:La0/c;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, La0/c;->l(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, LY/o1;->i:La0/c;

    .line 13
    .line 14
    invoke-virtual {v1, p1}, La0/c;->c(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    invoke-direct {p0}, LY/o1;->i0()LGf/n;

    .line 18
    .line 19
    .line 20
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    const/4 p1, 0x0

    .line 25
    :goto_0
    monitor-exit v0

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    sget-object v0, LTd/u;->b:LTd/u$a;

    .line 29
    .line 30
    sget-object v0, LTd/L;->a:LTd/L;

    .line 31
    .line 32
    invoke-static {v0}, LTd/u;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-interface {p1, v0}, LZd/e;->resumeWith(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    return-void

    .line 40
    :goto_1
    monitor-exit v0

    .line 41
    throw p1
.end method

.method public final m0()J
    .locals 2

    .line 1
    iget-wide v0, p0, LY/o1;->a:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public n(LY/y0;)LY/x0;
    .locals 2

    .line 1
    iget-object v0, p0, LY/o1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LY/o1;->n:Lt/P;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Lt/P;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, LY/x0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    monitor-exit v0

    .line 13
    return-object p1

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    monitor-exit v0

    .line 16
    throw p1
.end method

.method public final n0()LJf/I;
    .locals 1

    .line 1
    iget-object v0, p0, LY/o1;->w:LJf/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public o(LY/Q;LY/C1;Lt/e0;)Lt/e0;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-direct {p0}, LY/o1;->H0()Z

    .line 3
    .line 4
    .line 5
    invoke-static {p3}, La0/f;->a(Lt/e0;)Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    move-result-object p3

    .line 9
    invoke-interface {p1, p3}, LY/Q;->o(Ljava/util/Set;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p1, p2}, LY/Q;->i(LY/C1;)LY/C1;

    .line 13
    .line 14
    .line 15
    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 16
    :try_start_1
    invoke-direct {p0, p1, v0}, LY/o1;->A0(LY/Q;Lt/Q;)LY/Q;

    .line 17
    .line 18
    .line 19
    move-result-object p3

    .line 20
    if-eqz p3, :cond_0

    .line 21
    .line 22
    invoke-direct {p0, p1}, LY/o1;->x0(LY/Q;)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p3}, LY/Q;->p()V

    .line 26
    .line 27
    .line 28
    invoke-interface {p3}, LY/Q;->c()V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception p3

    .line 33
    goto :goto_2

    .line 34
    :cond_0
    :goto_0
    iget-object p3, p0, LY/o1;->x:Lg0/r;

    .line 35
    .line 36
    invoke-virtual {p3}, Lg0/r;->a()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p3

    .line 40
    check-cast p3, Lt/Q;

    .line 41
    .line 42
    if-eqz p3, :cond_1

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    invoke-static {}, Lt/f0;->a()Lt/e0;

    .line 46
    .line 47
    .line 48
    move-result-object p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    :goto_1
    :try_start_2
    invoke-interface {p1, p2}, LY/Q;->i(LY/C1;)LY/C1;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, LY/o1;->x:Lg0/r;

    .line 53
    .line 54
    invoke-virtual {p1, v0}, Lg0/r;->b(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    return-object p3

    .line 58
    :catchall_1
    move-exception p1

    .line 59
    goto :goto_3

    .line 60
    :goto_2
    :try_start_3
    invoke-interface {p1, p2}, LY/Q;->i(LY/C1;)LY/C1;

    .line 61
    .line 62
    .line 63
    throw p3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 64
    :goto_3
    iget-object p2, p0, LY/o1;->x:Lg0/r;

    .line 65
    .line 66
    invoke-virtual {p2, v0}, Lg0/r;->b(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    throw p1
.end method

.method public p(Ljava/util/Set;)V
    .locals 0

    .line 1
    return-void
.end method

.method public r(LY/f1;)V
    .locals 2

    .line 1
    iget-object v0, p0, LY/o1;->x:Lg0/r;

    .line 2
    .line 3
    invoke-virtual {v0}, Lg0/r;->a()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lt/Q;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-static {}, Lt/f0;->b()Lt/Q;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, LY/o1;->x:Lg0/r;

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Lg0/r;->b(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {v0, p1}, Lt/Q;->h(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public s(LY/Q;)V
    .locals 2

    .line 1
    iget-object v0, p0, LY/o1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LY/o1;->q:Ljava/util/Set;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v1, p0, LY/o1;->q:Ljava/util/Set;

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
    :goto_0
    invoke-interface {v1, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    monitor-exit v0

    .line 22
    return-void

    .line 23
    :goto_1
    monitor-exit v0

    .line 24
    throw p1
.end method

.method public final t0(LZd/e;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p0}, LY/o1;->n0()LJf/I;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, LY/o1$e;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, v2}, LY/o1$e;-><init>(LZd/e;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p1}, LJf/g;->o(LJf/e;Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-ne p1, v0, :cond_0

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 23
    .line 24
    return-object p1
.end method

.method public v(LY/Q;)V
    .locals 2

    .line 1
    iget-object v0, p0, LY/o1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-direct {p0, p1}, LY/o1;->L0(LY/Q;)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, LY/o1;->i:La0/c;

    .line 8
    .line 9
    invoke-virtual {v1, p1}, La0/c;->w(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, LY/o1;->j:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {v1, p1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    sget-object p1, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    monitor-exit v0

    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    monitor-exit v0

    .line 23
    throw p1
.end method

.method public final w0()V
    .locals 2

    .line 1
    iget-object v0, p0, LY/o1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    :try_start_0
    iput-boolean v1, p0, LY/o1;->v:Z

    .line 6
    .line 7
    sget-object v1, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    monitor-exit v0

    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception v1

    .line 12
    monitor-exit v0

    .line 13
    throw v1
.end method
