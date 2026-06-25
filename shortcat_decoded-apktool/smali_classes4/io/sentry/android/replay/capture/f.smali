.class public final Lio/sentry/android/replay/capture/f;
.super Lio/sentry/android/replay/capture/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/sentry/android/replay/capture/f$a;
    }
.end annotation


# static fields
.field public static final A:Lio/sentry/android/replay/capture/f$a;

.field public static final B:I


# instance fields
.field private final v:Lio/sentry/z3;

.field private final w:Lio/sentry/a0;

.field private final x:Lio/sentry/transport/o;

.field private final y:Lio/sentry/util/z;

.field private final z:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lio/sentry/android/replay/capture/f$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lio/sentry/android/replay/capture/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lio/sentry/android/replay/capture/f;->A:Lio/sentry/android/replay/capture/f$a;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, Lio/sentry/android/replay/capture/f;->B:I

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Lio/sentry/z3;Lio/sentry/a0;Lio/sentry/transport/o;Lio/sentry/util/z;Ljava/util/concurrent/ScheduledExecutorService;Lkotlin/jvm/functions/Function1;)V
    .locals 7

    .line 1
    const-string v0, "options"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "dateProvider"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "random"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "executor"

    .line 17
    .line 18
    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    move-object v1, p0

    .line 22
    move-object v2, p1

    .line 23
    move-object v3, p2

    .line 24
    move-object v4, p3

    .line 25
    move-object v5, p5

    .line 26
    move-object v6, p6

    .line 27
    invoke-direct/range {v1 .. v6}, Lio/sentry/android/replay/capture/a;-><init>(Lio/sentry/z3;Lio/sentry/a0;Lio/sentry/transport/o;Ljava/util/concurrent/ScheduledExecutorService;Lkotlin/jvm/functions/Function1;)V

    .line 28
    .line 29
    .line 30
    iput-object v2, v1, Lio/sentry/android/replay/capture/f;->v:Lio/sentry/z3;

    .line 31
    .line 32
    iput-object v3, v1, Lio/sentry/android/replay/capture/f;->w:Lio/sentry/a0;

    .line 33
    .line 34
    iput-object v4, v1, Lio/sentry/android/replay/capture/f;->x:Lio/sentry/transport/o;

    .line 35
    .line 36
    iput-object p4, v1, Lio/sentry/android/replay/capture/f;->y:Lio/sentry/util/z;

    .line 37
    .line 38
    new-instance p1, Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object p1, v1, Lio/sentry/android/replay/capture/f;->z:Ljava/util/List;

    .line 44
    .line 45
    return-void
.end method

.method public static synthetic D(Lio/sentry/android/replay/capture/f;Lkotlin/jvm/functions/Function2;J)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lio/sentry/android/replay/capture/f;->Q(Lio/sentry/android/replay/capture/f;Lkotlin/jvm/functions/Function2;J)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic E(Ljava/io/File;Lio/sentry/android/replay/capture/f;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lio/sentry/android/replay/capture/f;->S(Ljava/io/File;Lio/sentry/android/replay/capture/f;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic F(Lio/sentry/android/replay/capture/f;Lio/sentry/Y;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lio/sentry/android/replay/capture/f;->M(Lio/sentry/android/replay/capture/f;Lio/sentry/Y;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic G(Lio/sentry/android/replay/capture/f;JLjava/util/Date;Lio/sentry/protocol/x;Lio/sentry/android/replay/s;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Lio/sentry/android/replay/capture/f;->O(Lio/sentry/android/replay/capture/f;JLjava/util/Date;Lio/sentry/protocol/x;Lio/sentry/android/replay/s;Lkotlin/jvm/functions/Function1;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic H(Lio/sentry/android/replay/capture/f;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lio/sentry/android/replay/capture/f;->L(Ljava/util/List;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic I(Lio/sentry/android/replay/capture/f;Ljava/io/File;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lio/sentry/android/replay/capture/f;->P(Ljava/io/File;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic J(Lio/sentry/android/replay/capture/f;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/android/replay/capture/f;->z:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic K(Lio/sentry/android/replay/capture/f;)Lio/sentry/a0;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/android/replay/capture/f;->w:Lio/sentry/a0;

    .line 2
    .line 3
    return-object p0
.end method

.method private final L(Ljava/util/List;)V
    .locals 4

    .line 1
    invoke-static {p1}, LUd/u;->L(Ljava/util/List;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lio/sentry/android/replay/capture/h$c$a;

    .line 6
    .line 7
    :goto_0
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lio/sentry/android/replay/capture/f;->w:Lio/sentry/a0;

    .line 10
    .line 11
    const/4 v2, 0x2

    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-static {v0, v1, v3, v2, v3}, Lio/sentry/android/replay/capture/h$c$a;->b(Lio/sentry/android/replay/capture/h$c$a;Lio/sentry/a0;Lio/sentry/H;ILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p1}, LUd/u;->L(Ljava/util/List;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lio/sentry/android/replay/capture/h$c$a;

    .line 21
    .line 22
    const-wide/16 v1, 0x64

    .line 23
    .line 24
    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-void
.end method

.method private static final M(Lio/sentry/android/replay/capture/f;Lio/sentry/Y;)V
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lio/sentry/android/replay/capture/a;->a()Lio/sentry/protocol/x;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-interface {p1, p0}, Lio/sentry/Y;->o(Lio/sentry/protocol/x;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private final N(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Lio/sentry/android/replay/capture/a;->s()Lio/sentry/android/replay/s;

    .line 2
    .line 3
    .line 4
    move-result-object v6

    .line 5
    if-nez v6, :cond_0

    .line 6
    .line 7
    iget-object p2, p0, Lio/sentry/android/replay/capture/f;->v:Lio/sentry/z3;

    .line 8
    .line 9
    invoke-virtual {p2}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    sget-object v0, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 14
    .line 15
    new-instance v1, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    const-string v2, "Recorder config is not set, not creating segment for task: "

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const/4 v1, 0x0

    .line 33
    new-array v1, v1, [Ljava/lang/Object;

    .line 34
    .line 35
    invoke-interface {p2, v0, p1, v1}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_0
    iget-object v0, p0, Lio/sentry/android/replay/capture/f;->v:Lio/sentry/z3;

    .line 40
    .line 41
    invoke-virtual {v0}, Lio/sentry/z3;->getSessionReplay()Lio/sentry/B3;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, Lio/sentry/B3;->c()J

    .line 46
    .line 47
    .line 48
    move-result-wide v0

    .line 49
    iget-object v2, p0, Lio/sentry/android/replay/capture/f;->x:Lio/sentry/transport/o;

    .line 50
    .line 51
    invoke-interface {v2}, Lio/sentry/transport/o;->getCurrentTimeMillis()J

    .line 52
    .line 53
    .line 54
    move-result-wide v2

    .line 55
    invoke-virtual {p0}, Lio/sentry/android/replay/capture/a;->o()Lio/sentry/android/replay/i;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    if-eqz v4, :cond_1

    .line 60
    .line 61
    invoke-virtual {v4}, Lio/sentry/android/replay/i;->w()Ljava/lang/Long;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    if-eqz v4, :cond_1

    .line 66
    .line 67
    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    .line 68
    .line 69
    .line 70
    move-result-wide v4

    .line 71
    invoke-static {v4, v5}, Lio/sentry/l;->e(J)Ljava/util/Date;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    if-nez v4, :cond_2

    .line 76
    .line 77
    :cond_1
    sub-long v0, v2, v0

    .line 78
    .line 79
    invoke-static {v0, v1}, Lio/sentry/l;->e(J)Ljava/util/Date;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    :cond_2
    invoke-static {v4}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v4}, Ljava/util/Date;->getTime()J

    .line 87
    .line 88
    .line 89
    move-result-wide v0

    .line 90
    sub-long/2addr v2, v0

    .line 91
    invoke-virtual {p0}, Lio/sentry/android/replay/capture/a;->a()Lio/sentry/protocol/x;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    invoke-virtual {p0}, Lio/sentry/android/replay/capture/a;->t()Ljava/util/concurrent/ScheduledExecutorService;

    .line 96
    .line 97
    .line 98
    move-result-object v8

    .line 99
    new-instance v9, Lio/sentry/android/replay/util/m;

    .line 100
    .line 101
    new-instance v0, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 104
    .line 105
    .line 106
    const-string v1, "BufferCaptureStrategy."

    .line 107
    .line 108
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    new-instance v0, Lio/sentry/android/replay/capture/b;

    .line 119
    .line 120
    move-object v1, p0

    .line 121
    move-object v7, p2

    .line 122
    invoke-direct/range {v0 .. v7}, Lio/sentry/android/replay/capture/b;-><init>(Lio/sentry/android/replay/capture/f;JLjava/util/Date;Lio/sentry/protocol/x;Lio/sentry/android/replay/s;Lkotlin/jvm/functions/Function1;)V

    .line 123
    .line 124
    .line 125
    invoke-direct {v9, p1, v0}, Lio/sentry/android/replay/util/m;-><init>(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 126
    .line 127
    .line 128
    invoke-interface {v8, v9}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 129
    .line 130
    .line 131
    return-void
.end method

.method private static final O(Lio/sentry/android/replay/capture/f;JLjava/util/Date;Lio/sentry/protocol/x;Lio/sentry/android/replay/s;Lkotlin/jvm/functions/Function1;)V
    .locals 18

    .line 1
    invoke-virtual/range {p0 .. p0}, Lio/sentry/android/replay/capture/a;->d()I

    .line 2
    .line 3
    .line 4
    move-result v6

    .line 5
    invoke-virtual/range {p5 .. p5}, Lio/sentry/android/replay/s;->c()I

    .line 6
    .line 7
    .line 8
    move-result v7

    .line 9
    invoke-virtual/range {p5 .. p5}, Lio/sentry/android/replay/s;->d()I

    .line 10
    .line 11
    .line 12
    move-result v8

    .line 13
    invoke-virtual/range {p5 .. p5}, Lio/sentry/android/replay/s;->b()I

    .line 14
    .line 15
    .line 16
    move-result v9

    .line 17
    invoke-virtual/range {p5 .. p5}, Lio/sentry/android/replay/s;->a()I

    .line 18
    .line 19
    .line 20
    move-result v10

    .line 21
    const/16 v16, 0x1f00

    .line 22
    .line 23
    const/16 v17, 0x0

    .line 24
    .line 25
    const/4 v11, 0x0

    .line 26
    const/4 v12, 0x0

    .line 27
    const/4 v13, 0x0

    .line 28
    const/4 v14, 0x0

    .line 29
    const/4 v15, 0x0

    .line 30
    move-object/from16 v1, p0

    .line 31
    .line 32
    move-wide/from16 v2, p1

    .line 33
    .line 34
    move-object/from16 v4, p3

    .line 35
    .line 36
    move-object/from16 v5, p4

    .line 37
    .line 38
    invoke-static/range {v1 .. v17}, Lio/sentry/android/replay/capture/a;->n(Lio/sentry/android/replay/capture/a;JLjava/util/Date;Lio/sentry/protocol/x;IIIIILio/sentry/A3$b;Lio/sentry/android/replay/i;Ljava/lang/String;Ljava/util/List;Ljava/util/Deque;ILjava/lang/Object;)Lio/sentry/android/replay/capture/h$c;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    move-object/from16 v1, p6

    .line 43
    .line 44
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method private final P(Ljava/io/File;)V
    .locals 4

    .line 1
    const-string v0, "Failed to delete replay segment: %s"

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    iget-object v1, p0, Lio/sentry/android/replay/capture/f;->v:Lio/sentry/z3;

    .line 13
    .line 14
    invoke-virtual {v1}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    sget-object v2, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-interface {v1, v2, v0, v3}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :catchall_0
    move-exception v1

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    :goto_0
    return-void

    .line 35
    :goto_1
    iget-object v2, p0, Lio/sentry/android/replay/capture/f;->v:Lio/sentry/z3;

    .line 36
    .line 37
    invoke-virtual {v2}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    sget-object v3, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-interface {v2, v3, v1, v0, p1}, Lio/sentry/ILogger;->a(Lio/sentry/i3;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method private static final Q(Lio/sentry/android/replay/capture/f;Lkotlin/jvm/functions/Function2;J)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lio/sentry/android/replay/capture/a;->o()Lio/sentry/android/replay/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-interface {p1, v0, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object p1, p0, Lio/sentry/android/replay/capture/f;->x:Lio/sentry/transport/o;

    .line 15
    .line 16
    invoke-interface {p1}, Lio/sentry/transport/o;->getCurrentTimeMillis()J

    .line 17
    .line 18
    .line 19
    move-result-wide p1

    .line 20
    iget-object p3, p0, Lio/sentry/android/replay/capture/f;->v:Lio/sentry/z3;

    .line 21
    .line 22
    invoke-virtual {p3}, Lio/sentry/z3;->getSessionReplay()Lio/sentry/B3;

    .line 23
    .line 24
    .line 25
    move-result-object p3

    .line 26
    invoke-virtual {p3}, Lio/sentry/B3;->c()J

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    sub-long/2addr p1, v0

    .line 31
    invoke-virtual {p0}, Lio/sentry/android/replay/capture/a;->o()Lio/sentry/android/replay/i;

    .line 32
    .line 33
    .line 34
    move-result-object p3

    .line 35
    if-eqz p3, :cond_1

    .line 36
    .line 37
    invoke-virtual {p3, p1, p2}, Lio/sentry/android/replay/i;->H(J)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p3

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    const/4 p3, 0x0

    .line 43
    :goto_0
    invoke-virtual {p0, p3}, Lio/sentry/android/replay/capture/a;->C(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iget-object p3, p0, Lio/sentry/android/replay/capture/f;->z:Ljava/util/List;

    .line 47
    .line 48
    invoke-direct {p0, p3, p1, p2}, Lio/sentry/android/replay/capture/f;->R(Ljava/util/List;J)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method private final R(Ljava/util/List;J)V
    .locals 2

    .line 1
    new-instance v0, Lkotlin/jvm/internal/J;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlin/jvm/internal/J;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lio/sentry/android/replay/capture/f$e;

    .line 7
    .line 8
    invoke-direct {v1, p2, p3, p0, v0}, Lio/sentry/android/replay/capture/f$e;-><init>(JLio/sentry/android/replay/capture/f;Lkotlin/jvm/internal/J;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p1, v1}, LUd/u;->K(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z

    .line 12
    .line 13
    .line 14
    iget-boolean p2, v0, Lkotlin/jvm/internal/J;->a:Z

    .line 15
    .line 16
    if-eqz p2, :cond_1

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const/4 p2, 0x0

    .line 23
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result p3

    .line 27
    if-eqz p3, :cond_1

    .line 28
    .line 29
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p3

    .line 33
    add-int/lit8 v0, p2, 0x1

    .line 34
    .line 35
    if-gez p2, :cond_0

    .line 36
    .line 37
    invoke-static {}, LUd/u;->w()V

    .line 38
    .line 39
    .line 40
    :cond_0
    check-cast p3, Lio/sentry/android/replay/capture/h$c$a;

    .line 41
    .line 42
    invoke-virtual {p3, p2}, Lio/sentry/android/replay/capture/h$c$a;->d(I)V

    .line 43
    .line 44
    .line 45
    move p2, v0

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    return-void
.end method

.method private static final S(Ljava/io/File;Lio/sentry/android/replay/capture/f;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lio/sentry/util/i;->a(Ljava/io/File;)Z

    .line 2
    .line 3
    .line 4
    const/4 p0, -0x1

    .line 5
    invoke-virtual {p1, p0}, Lio/sentry/android/replay/capture/a;->c(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public b(Landroid/view/MotionEvent;)V
    .locals 11

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lio/sentry/android/replay/capture/a;->b(Landroid/view/MotionEvent;)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lio/sentry/android/replay/capture/f;->x:Lio/sentry/transport/o;

    .line 10
    .line 11
    invoke-interface {p1}, Lio/sentry/transport/o;->getCurrentTimeMillis()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    iget-object p1, p0, Lio/sentry/android/replay/capture/f;->v:Lio/sentry/z3;

    .line 16
    .line 17
    invoke-virtual {p1}, Lio/sentry/z3;->getSessionReplay()Lio/sentry/B3;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1}, Lio/sentry/B3;->c()J

    .line 22
    .line 23
    .line 24
    move-result-wide v2

    .line 25
    sub-long v6, v0, v2

    .line 26
    .line 27
    sget-object v4, Lio/sentry/android/replay/capture/h;->a:Lio/sentry/android/replay/capture/h$a;

    .line 28
    .line 29
    invoke-virtual {p0}, Lio/sentry/android/replay/capture/a;->p()Ljava/util/Deque;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    const/4 v9, 0x4

    .line 34
    const/4 v10, 0x0

    .line 35
    const/4 v8, 0x0

    .line 36
    invoke-static/range {v4 .. v10}, Lio/sentry/android/replay/capture/h$a;->h(Lio/sentry/android/replay/capture/h$a;Ljava/util/Deque;JLkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public e(ZLkotlin/jvm/functions/Function1;)V
    .locals 3

    .line 1
    const-string v0, "onSegmentSent"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lio/sentry/android/replay/capture/f;->y:Lio/sentry/util/z;

    .line 7
    .line 8
    iget-object v1, p0, Lio/sentry/android/replay/capture/f;->v:Lio/sentry/z3;

    .line 9
    .line 10
    invoke-virtual {v1}, Lio/sentry/z3;->getSessionReplay()Lio/sentry/B3;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Lio/sentry/B3;->l()Ljava/lang/Double;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-static {v0, v1}, Lio/sentry/android/replay/util/n;->a(Lio/sentry/util/z;Ljava/lang/Double;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    iget-object p1, p0, Lio/sentry/android/replay/capture/f;->v:Lio/sentry/z3;

    .line 26
    .line 27
    invoke-virtual {p1}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    sget-object p2, Lio/sentry/i3;->INFO:Lio/sentry/i3;

    .line 32
    .line 33
    const-string v0, "Replay wasn\'t sampled by onErrorSampleRate, not capturing for event"

    .line 34
    .line 35
    new-array v1, v1, [Ljava/lang/Object;

    .line 36
    .line 37
    invoke-interface {p1, p2, v0, v1}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    iget-object v0, p0, Lio/sentry/android/replay/capture/f;->w:Lio/sentry/a0;

    .line 42
    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    new-instance v2, Lio/sentry/android/replay/capture/c;

    .line 46
    .line 47
    invoke-direct {v2, p0}, Lio/sentry/android/replay/capture/c;-><init>(Lio/sentry/android/replay/capture/f;)V

    .line 48
    .line 49
    .line 50
    invoke-interface {v0, v2}, Lio/sentry/a0;->r(Lio/sentry/G1;)V

    .line 51
    .line 52
    .line 53
    :cond_1
    if-eqz p1, :cond_2

    .line 54
    .line 55
    invoke-virtual {p0}, Lio/sentry/android/replay/capture/a;->y()Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    const/4 p2, 0x1

    .line 60
    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 61
    .line 62
    .line 63
    iget-object p1, p0, Lio/sentry/android/replay/capture/f;->v:Lio/sentry/z3;

    .line 64
    .line 65
    invoke-virtual {p1}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    sget-object p2, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 70
    .line 71
    const-string v0, "Not capturing replay for crashed event, will be captured on next launch"

    .line 72
    .line 73
    new-array v1, v1, [Ljava/lang/Object;

    .line 74
    .line 75
    invoke-interface {p1, p2, v0, v1}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_2
    new-instance p1, Lio/sentry/android/replay/capture/f$b;

    .line 80
    .line 81
    invoke-direct {p1, p0, p2}, Lio/sentry/android/replay/capture/f$b;-><init>(Lio/sentry/android/replay/capture/f;Lkotlin/jvm/functions/Function1;)V

    .line 82
    .line 83
    .line 84
    const-string p2, "capture_replay"

    .line 85
    .line 86
    invoke-direct {p0, p2, p1}, Lio/sentry/android/replay/capture/f;->N(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 87
    .line 88
    .line 89
    return-void
.end method

.method public f(Landroid/graphics/Bitmap;Lkotlin/jvm/functions/Function2;)V
    .locals 4

    .line 1
    const-string p1, "store"

    .line 2
    .line 3
    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lio/sentry/android/replay/capture/f;->x:Lio/sentry/transport/o;

    .line 7
    .line 8
    invoke-interface {p1}, Lio/sentry/transport/o;->getCurrentTimeMillis()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    invoke-virtual {p0}, Lio/sentry/android/replay/capture/a;->t()Ljava/util/concurrent/ScheduledExecutorService;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    new-instance v2, Lio/sentry/android/replay/util/m;

    .line 17
    .line 18
    new-instance v3, Lio/sentry/android/replay/capture/e;

    .line 19
    .line 20
    invoke-direct {v3, p0, p2, v0, v1}, Lio/sentry/android/replay/capture/e;-><init>(Lio/sentry/android/replay/capture/f;Lkotlin/jvm/functions/Function2;J)V

    .line 21
    .line 22
    .line 23
    const-string p2, "BufferCaptureStrategy.add_frame"

    .line 24
    .line 25
    invoke-direct {v2, p2, v3}, Lio/sentry/android/replay/util/m;-><init>(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 26
    .line 27
    .line 28
    invoke-interface {p1, v2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public g()Lio/sentry/android/replay/capture/h;
    .locals 12

    .line 1
    invoke-virtual {p0}, Lio/sentry/android/replay/capture/a;->y()Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lio/sentry/android/replay/capture/f;->v:Lio/sentry/z3;

    .line 12
    .line 13
    invoke-virtual {v0}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v1, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    new-array v2, v2, [Ljava/lang/Object;

    .line 21
    .line 22
    const-string v3, "Not converting to session mode, because the process is about to terminate"

    .line 23
    .line 24
    invoke-interface {v0, v1, v3, v2}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_0
    new-instance v4, Lio/sentry/android/replay/capture/m;

    .line 29
    .line 30
    iget-object v5, p0, Lio/sentry/android/replay/capture/f;->v:Lio/sentry/z3;

    .line 31
    .line 32
    iget-object v6, p0, Lio/sentry/android/replay/capture/f;->w:Lio/sentry/a0;

    .line 33
    .line 34
    iget-object v7, p0, Lio/sentry/android/replay/capture/f;->x:Lio/sentry/transport/o;

    .line 35
    .line 36
    invoke-virtual {p0}, Lio/sentry/android/replay/capture/a;->t()Ljava/util/concurrent/ScheduledExecutorService;

    .line 37
    .line 38
    .line 39
    move-result-object v8

    .line 40
    const/16 v10, 0x10

    .line 41
    .line 42
    const/4 v11, 0x0

    .line 43
    const/4 v9, 0x0

    .line 44
    invoke-direct/range {v4 .. v11}, Lio/sentry/android/replay/capture/m;-><init>(Lio/sentry/z3;Lio/sentry/a0;Lio/sentry/transport/o;Ljava/util/concurrent/ScheduledExecutorService;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Lio/sentry/android/replay/capture/a;->s()Lio/sentry/android/replay/s;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v4, v0}, Lio/sentry/android/replay/capture/a;->A(Lio/sentry/android/replay/s;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Lio/sentry/android/replay/capture/a;->d()I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    invoke-virtual {p0}, Lio/sentry/android/replay/capture/a;->a()Lio/sentry/protocol/x;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    sget-object v2, Lio/sentry/A3$b;->BUFFER:Lio/sentry/A3$b;

    .line 63
    .line 64
    invoke-virtual {v4, v0, v1, v2}, Lio/sentry/android/replay/capture/m;->h(ILio/sentry/protocol/x;Lio/sentry/A3$b;)V

    .line 65
    .line 66
    .line 67
    return-object v4
.end method

.method public pause()V
    .locals 2

    .line 1
    new-instance v0, Lio/sentry/android/replay/capture/f$d;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lio/sentry/android/replay/capture/f$d;-><init>(Lio/sentry/android/replay/capture/f;)V

    .line 4
    .line 5
    .line 6
    const-string v1, "pause"

    .line 7
    .line 8
    invoke-direct {p0, v1, v0}, Lio/sentry/android/replay/capture/f;->N(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 9
    .line 10
    .line 11
    invoke-super {p0}, Lio/sentry/android/replay/capture/a;->pause()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public r(Lio/sentry/android/replay/s;)V
    .locals 2

    .line 1
    const-string v0, "recorderConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lio/sentry/android/replay/capture/f$c;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lio/sentry/android/replay/capture/f$c;-><init>(Lio/sentry/android/replay/capture/f;)V

    .line 9
    .line 10
    .line 11
    const-string v1, "configuration_changed"

    .line 12
    .line 13
    invoke-direct {p0, v1, v0}, Lio/sentry/android/replay/capture/f;->N(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 14
    .line 15
    .line 16
    invoke-super {p0, p1}, Lio/sentry/android/replay/capture/a;->r(Lio/sentry/android/replay/s;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public stop()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lio/sentry/android/replay/capture/a;->o()Lio/sentry/android/replay/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lio/sentry/android/replay/i;->D()Ljava/io/File;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    invoke-virtual {p0}, Lio/sentry/android/replay/capture/a;->t()Ljava/util/concurrent/ScheduledExecutorService;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    new-instance v2, Lio/sentry/android/replay/util/m;

    .line 18
    .line 19
    new-instance v3, Lio/sentry/android/replay/capture/d;

    .line 20
    .line 21
    invoke-direct {v3, v0, p0}, Lio/sentry/android/replay/capture/d;-><init>(Ljava/io/File;Lio/sentry/android/replay/capture/f;)V

    .line 22
    .line 23
    .line 24
    const-string v0, "BufferCaptureStrategy.stop"

    .line 25
    .line 26
    invoke-direct {v2, v0, v3}, Lio/sentry/android/replay/util/m;-><init>(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 27
    .line 28
    .line 29
    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 30
    .line 31
    .line 32
    invoke-super {p0}, Lio/sentry/android/replay/capture/a;->stop()V

    .line 33
    .line 34
    .line 35
    return-void
.end method
