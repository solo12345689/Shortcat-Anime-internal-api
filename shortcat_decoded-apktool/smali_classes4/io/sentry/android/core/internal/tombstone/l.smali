.class public final Lio/sentry/android/core/internal/tombstone/l;
.super Lxa/p;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lxa/E;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/sentry/android/core/internal/tombstone/l$a;
    }
.end annotation


# static fields
.field private static final l:Lio/sentry/android/core/internal/tombstone/l;

.field private static volatile m:Lxa/L;


# instance fields
.field private e:I

.field private f:Ljava/lang/String;

.field private g:Lxa/q$b;

.field private h:Lxa/q$b;

.field private i:Lxa/q$b;

.field private j:Lxa/q$b;

.field private k:Lxa/q$b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lio/sentry/android/core/internal/tombstone/l;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/sentry/android/core/internal/tombstone/l;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lio/sentry/android/core/internal/tombstone/l;->l:Lio/sentry/android/core/internal/tombstone/l;

    .line 7
    .line 8
    const-class v1, Lio/sentry/android/core/internal/tombstone/l;

    .line 9
    .line 10
    invoke-static {v1, v0}, Lxa/p;->C(Ljava/lang/Class;Lxa/p;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lxa/p;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, Lio/sentry/android/core/internal/tombstone/l;->f:Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {}, Lxa/p;->l()Lxa/q$b;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, Lio/sentry/android/core/internal/tombstone/l;->g:Lxa/q$b;

    .line 13
    .line 14
    invoke-static {}, Lxa/p;->l()Lxa/q$b;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Lio/sentry/android/core/internal/tombstone/l;->h:Lxa/q$b;

    .line 19
    .line 20
    invoke-static {}, Lxa/p;->l()Lxa/q$b;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, Lio/sentry/android/core/internal/tombstone/l;->i:Lxa/q$b;

    .line 25
    .line 26
    invoke-static {}, Lxa/p;->l()Lxa/q$b;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, Lio/sentry/android/core/internal/tombstone/l;->j:Lxa/q$b;

    .line 31
    .line 32
    invoke-static {}, Lxa/p;->l()Lxa/q$b;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iput-object v0, p0, Lio/sentry/android/core/internal/tombstone/l;->k:Lxa/q$b;

    .line 37
    .line 38
    return-void
.end method

.method static synthetic F()Lio/sentry/android/core/internal/tombstone/l;
    .locals 1

    .line 1
    sget-object v0, Lio/sentry/android/core/internal/tombstone/l;->l:Lio/sentry/android/core/internal/tombstone/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public static H()Lio/sentry/android/core/internal/tombstone/l;
    .locals 1

    .line 1
    sget-object v0, Lio/sentry/android/core/internal/tombstone/l;->l:Lio/sentry/android/core/internal/tombstone/l;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public G()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/internal/tombstone/l;->j:Lxa/q$b;

    .line 2
    .line 3
    return-object v0
.end method

.method public I()I
    .locals 1

    .line 1
    iget v0, p0, Lio/sentry/android/core/internal/tombstone/l;->e:I

    .line 2
    .line 3
    return v0
.end method

.method public J()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/internal/tombstone/l;->f:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public K()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/internal/tombstone/l;->g:Lxa/q$b;

    .line 2
    .line 3
    return-object v0
.end method

.method protected final k(Lxa/p$d;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    sget-object p2, Lio/sentry/android/core/internal/tombstone/b;->a:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    aget p1, p2, p1

    .line 8
    .line 9
    const/4 p2, 0x0

    .line 10
    packed-switch p1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 14
    .line 15
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 16
    .line 17
    .line 18
    throw p1

    .line 19
    :pswitch_0
    return-object p2

    .line 20
    :pswitch_1
    const/4 p1, 0x1

    .line 21
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1

    .line 26
    :pswitch_2
    sget-object p1, Lio/sentry/android/core/internal/tombstone/l;->m:Lxa/L;

    .line 27
    .line 28
    if-nez p1, :cond_1

    .line 29
    .line 30
    const-class p2, Lio/sentry/android/core/internal/tombstone/l;

    .line 31
    .line 32
    monitor-enter p2

    .line 33
    :try_start_0
    sget-object p1, Lio/sentry/android/core/internal/tombstone/l;->m:Lxa/L;

    .line 34
    .line 35
    if-nez p1, :cond_0

    .line 36
    .line 37
    new-instance p1, Lxa/p$b;

    .line 38
    .line 39
    sget-object p3, Lio/sentry/android/core/internal/tombstone/l;->l:Lio/sentry/android/core/internal/tombstone/l;

    .line 40
    .line 41
    invoke-direct {p1, p3}, Lxa/p$b;-><init>(Lxa/p;)V

    .line 42
    .line 43
    .line 44
    sput-object p1, Lio/sentry/android/core/internal/tombstone/l;->m:Lxa/L;

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception v0

    .line 48
    move-object p1, v0

    .line 49
    goto :goto_1

    .line 50
    :cond_0
    :goto_0
    monitor-exit p2

    .line 51
    return-object p1

    .line 52
    :goto_1
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    throw p1

    .line 54
    :cond_1
    return-object p1

    .line 55
    :pswitch_3
    sget-object p1, Lio/sentry/android/core/internal/tombstone/l;->l:Lio/sentry/android/core/internal/tombstone/l;

    .line 56
    .line 57
    return-object p1

    .line 58
    :pswitch_4
    const-string v0, "id_"

    .line 59
    .line 60
    const-string v1, "name_"

    .line 61
    .line 62
    const-string v2, "registers_"

    .line 63
    .line 64
    const-class v3, Lio/sentry/android/core/internal/tombstone/j;

    .line 65
    .line 66
    const-string v4, "currentBacktrace_"

    .line 67
    .line 68
    const-class v5, Lio/sentry/android/core/internal/tombstone/c;

    .line 69
    .line 70
    const-string v6, "memoryDump_"

    .line 71
    .line 72
    const-class v7, Lio/sentry/android/core/internal/tombstone/h;

    .line 73
    .line 74
    const-string v8, "taggedAddrCtrl_"

    .line 75
    .line 76
    const-string v9, "backtraceNote_"

    .line 77
    .line 78
    const-string v10, "pacEnabledKeys_"

    .line 79
    .line 80
    const-string v11, "unreadableElfFiles_"

    .line 81
    .line 82
    filled-new-array/range {v0 .. v11}, [Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    const-string p2, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0005\u0000\u0001\u0004\u0002\u0208\u0003\u001b\u0004\u001b\u0005\u001b\u0006\u0002\u0007\u021a\u0008\u0002\t\u021a"

    .line 87
    .line 88
    sget-object p3, Lio/sentry/android/core/internal/tombstone/l;->l:Lio/sentry/android/core/internal/tombstone/l;

    .line 89
    .line 90
    invoke-static {p3, p2, p1}, Lxa/p;->y(Lxa/D;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    return-object p1

    .line 95
    :pswitch_5
    new-instance p1, Lio/sentry/android/core/internal/tombstone/l$a;

    .line 96
    .line 97
    invoke-direct {p1, p2}, Lio/sentry/android/core/internal/tombstone/l$a;-><init>(Lio/sentry/android/core/internal/tombstone/b;)V

    .line 98
    .line 99
    .line 100
    return-object p1

    .line 101
    :pswitch_6
    new-instance p1, Lio/sentry/android/core/internal/tombstone/l;

    .line 102
    .line 103
    invoke-direct {p1}, Lio/sentry/android/core/internal/tombstone/l;-><init>()V

    .line 104
    .line 105
    .line 106
    return-object p1

    .line 107
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
