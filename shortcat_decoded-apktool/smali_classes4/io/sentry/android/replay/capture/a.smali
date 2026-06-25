.class public abstract Lio/sentry/android/replay/capture/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lio/sentry/android/replay/capture/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/sentry/android/replay/capture/a$a;,
        Lio/sentry/android/replay/capture/a$b;
    }
.end annotation


# static fields
.field public static final s:Lio/sentry/android/replay/capture/a$a;

.field static final synthetic t:[Lpe/m;

.field public static final u:I


# instance fields
.field private final b:Lio/sentry/z3;

.field private final c:Lio/sentry/a0;

.field private final d:Lio/sentry/transport/o;

.field private final e:Ljava/util/concurrent/ScheduledExecutorService;

.field private final f:Lkotlin/jvm/functions/Function1;

.field private final g:Lkotlin/Lazy;

.field private final h:Lio/sentry/android/replay/gestures/b;

.field private final i:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private j:Lio/sentry/android/replay/i;

.field private final k:Lle/d;

.field private final l:Lle/d;

.field private final m:Ljava/util/concurrent/atomic/AtomicLong;

.field private final n:Lle/d;

.field private final o:Lle/d;

.field private final p:Lle/d;

.field private final q:Lle/d;

.field private final r:Ljava/util/Deque;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    new-instance v0, Lkotlin/jvm/internal/z;

    .line 2
    .line 3
    const-class v1, Lio/sentry/android/replay/capture/a;

    .line 4
    .line 5
    const-string v2, "recorderConfig"

    .line 6
    .line 7
    const-string v3, "getRecorderConfig$sentry_android_replay_release()Lio/sentry/android/replay/ScreenshotRecorderConfig;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/z;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lkotlin/jvm/internal/O;->e(Lkotlin/jvm/internal/y;)Lpe/k;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v2, Lkotlin/jvm/internal/z;

    .line 18
    .line 19
    const-string v3, "segmentTimestamp"

    .line 20
    .line 21
    const-string v5, "getSegmentTimestamp()Ljava/util/Date;"

    .line 22
    .line 23
    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/z;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 24
    .line 25
    .line 26
    invoke-static {v2}, Lkotlin/jvm/internal/O;->e(Lkotlin/jvm/internal/y;)Lpe/k;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    new-instance v3, Lkotlin/jvm/internal/z;

    .line 31
    .line 32
    const-string v5, "screenAtStart"

    .line 33
    .line 34
    const-string v6, "getScreenAtStart()Ljava/lang/String;"

    .line 35
    .line 36
    invoke-direct {v3, v1, v5, v6, v4}, Lkotlin/jvm/internal/z;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    invoke-static {v3}, Lkotlin/jvm/internal/O;->e(Lkotlin/jvm/internal/y;)Lpe/k;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    new-instance v5, Lkotlin/jvm/internal/z;

    .line 44
    .line 45
    const-string v6, "currentReplayId"

    .line 46
    .line 47
    const-string v7, "getCurrentReplayId()Lio/sentry/protocol/SentryId;"

    .line 48
    .line 49
    invoke-direct {v5, v1, v6, v7, v4}, Lkotlin/jvm/internal/z;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 50
    .line 51
    .line 52
    invoke-static {v5}, Lkotlin/jvm/internal/O;->e(Lkotlin/jvm/internal/y;)Lpe/k;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    new-instance v6, Lkotlin/jvm/internal/z;

    .line 57
    .line 58
    const-string v7, "currentSegment"

    .line 59
    .line 60
    const-string v8, "getCurrentSegment()I"

    .line 61
    .line 62
    invoke-direct {v6, v1, v7, v8, v4}, Lkotlin/jvm/internal/z;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 63
    .line 64
    .line 65
    invoke-static {v6}, Lkotlin/jvm/internal/O;->e(Lkotlin/jvm/internal/y;)Lpe/k;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    new-instance v7, Lkotlin/jvm/internal/z;

    .line 70
    .line 71
    const-string v8, "replayType"

    .line 72
    .line 73
    const-string v9, "getReplayType()Lio/sentry/SentryReplayEvent$ReplayType;"

    .line 74
    .line 75
    invoke-direct {v7, v1, v8, v9, v4}, Lkotlin/jvm/internal/z;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 76
    .line 77
    .line 78
    invoke-static {v7}, Lkotlin/jvm/internal/O;->e(Lkotlin/jvm/internal/y;)Lpe/k;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    const/4 v7, 0x6

    .line 83
    new-array v7, v7, [Lpe/m;

    .line 84
    .line 85
    aput-object v0, v7, v4

    .line 86
    .line 87
    const/4 v0, 0x1

    .line 88
    aput-object v2, v7, v0

    .line 89
    .line 90
    const/4 v0, 0x2

    .line 91
    aput-object v3, v7, v0

    .line 92
    .line 93
    const/4 v0, 0x3

    .line 94
    aput-object v5, v7, v0

    .line 95
    .line 96
    const/4 v0, 0x4

    .line 97
    aput-object v6, v7, v0

    .line 98
    .line 99
    const/4 v0, 0x5

    .line 100
    aput-object v1, v7, v0

    .line 101
    .line 102
    sput-object v7, Lio/sentry/android/replay/capture/a;->t:[Lpe/m;

    .line 103
    .line 104
    new-instance v0, Lio/sentry/android/replay/capture/a$a;

    .line 105
    .line 106
    const/4 v1, 0x0

    .line 107
    invoke-direct {v0, v1}, Lio/sentry/android/replay/capture/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 108
    .line 109
    .line 110
    sput-object v0, Lio/sentry/android/replay/capture/a;->s:Lio/sentry/android/replay/capture/a$a;

    .line 111
    .line 112
    const/16 v0, 0x8

    .line 113
    .line 114
    sput v0, Lio/sentry/android/replay/capture/a;->u:I

    .line 115
    .line 116
    return-void
.end method

.method public constructor <init>(Lio/sentry/z3;Lio/sentry/a0;Lio/sentry/transport/o;Ljava/util/concurrent/ScheduledExecutorService;Lkotlin/jvm/functions/Function1;)V
    .locals 6

    .line 1
    const-string v4, "options"

    .line 2
    .line 3
    invoke-static {p1, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v4, "dateProvider"

    .line 7
    .line 8
    invoke-static {p3, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v4, "replayExecutor"

    .line 12
    .line 13
    invoke-static {p4, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lio/sentry/android/replay/capture/a;->b:Lio/sentry/z3;

    .line 20
    .line 21
    iput-object p2, p0, Lio/sentry/android/replay/capture/a;->c:Lio/sentry/a0;

    .line 22
    .line 23
    iput-object p3, p0, Lio/sentry/android/replay/capture/a;->d:Lio/sentry/transport/o;

    .line 24
    .line 25
    iput-object p4, p0, Lio/sentry/android/replay/capture/a;->e:Ljava/util/concurrent/ScheduledExecutorService;

    .line 26
    .line 27
    iput-object p5, p0, Lio/sentry/android/replay/capture/a;->f:Lkotlin/jvm/functions/Function1;

    .line 28
    .line 29
    new-instance v0, Lio/sentry/android/replay/capture/a$c;

    .line 30
    .line 31
    invoke-direct {v0, p0}, Lio/sentry/android/replay/capture/a$c;-><init>(Lio/sentry/android/replay/capture/a;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v0}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iput-object v0, p0, Lio/sentry/android/replay/capture/a;->g:Lkotlin/Lazy;

    .line 39
    .line 40
    new-instance v0, Lio/sentry/android/replay/gestures/b;

    .line 41
    .line 42
    invoke-direct {v0, p3}, Lio/sentry/android/replay/gestures/b;-><init>(Lio/sentry/transport/o;)V

    .line 43
    .line 44
    .line 45
    iput-object v0, p0, Lio/sentry/android/replay/capture/a;->h:Lio/sentry/android/replay/gestures/b;

    .line 46
    .line 47
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 48
    .line 49
    const/4 v1, 0x0

    .line 50
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 51
    .line 52
    .line 53
    iput-object v0, p0, Lio/sentry/android/replay/capture/a;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 54
    .line 55
    new-instance v0, Lio/sentry/android/replay/capture/a$g;

    .line 56
    .line 57
    const/4 v1, 0x0

    .line 58
    const-string v3, ""

    .line 59
    .line 60
    invoke-direct {v0, v1, p0, v3, p0}, Lio/sentry/android/replay/capture/a$g;-><init>(Ljava/lang/Object;Lio/sentry/android/replay/capture/a;Ljava/lang/String;Lio/sentry/android/replay/capture/a;)V

    .line 61
    .line 62
    .line 63
    iput-object v0, p0, Lio/sentry/android/replay/capture/a;->k:Lle/d;

    .line 64
    .line 65
    new-instance v0, Lio/sentry/android/replay/capture/a$h;

    .line 66
    .line 67
    const-string v3, "segment.timestamp"

    .line 68
    .line 69
    invoke-direct {v0, v1, p0, v3, p0}, Lio/sentry/android/replay/capture/a$h;-><init>(Ljava/lang/Object;Lio/sentry/android/replay/capture/a;Ljava/lang/String;Lio/sentry/android/replay/capture/a;)V

    .line 70
    .line 71
    .line 72
    iput-object v0, p0, Lio/sentry/android/replay/capture/a;->l:Lle/d;

    .line 73
    .line 74
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 75
    .line 76
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    .line 77
    .line 78
    .line 79
    iput-object v0, p0, Lio/sentry/android/replay/capture/a;->m:Ljava/util/concurrent/atomic/AtomicLong;

    .line 80
    .line 81
    new-instance v0, Lio/sentry/android/replay/capture/a$i;

    .line 82
    .line 83
    const-string v3, "replay.screen-at-start"

    .line 84
    .line 85
    move-object v4, p0

    .line 86
    move-object v5, v3

    .line 87
    move-object v2, p0

    .line 88
    invoke-direct/range {v0 .. v5}, Lio/sentry/android/replay/capture/a$i;-><init>(Ljava/lang/Object;Lio/sentry/android/replay/capture/a;Ljava/lang/String;Lio/sentry/android/replay/capture/a;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    iput-object v0, p0, Lio/sentry/android/replay/capture/a;->n:Lle/d;

    .line 92
    .line 93
    sget-object v1, Lio/sentry/protocol/x;->b:Lio/sentry/protocol/x;

    .line 94
    .line 95
    new-instance v0, Lio/sentry/android/replay/capture/a$d;

    .line 96
    .line 97
    const-string v3, "replay.id"

    .line 98
    .line 99
    move-object v5, v3

    .line 100
    invoke-direct/range {v0 .. v5}, Lio/sentry/android/replay/capture/a$d;-><init>(Ljava/lang/Object;Lio/sentry/android/replay/capture/a;Ljava/lang/String;Lio/sentry/android/replay/capture/a;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    iput-object v0, p0, Lio/sentry/android/replay/capture/a;->o:Lle/d;

    .line 104
    .line 105
    const/4 v0, -0x1

    .line 106
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    new-instance v0, Lio/sentry/android/replay/capture/a$e;

    .line 111
    .line 112
    const-string v3, "segment.id"

    .line 113
    .line 114
    move-object v5, v3

    .line 115
    invoke-direct/range {v0 .. v5}, Lio/sentry/android/replay/capture/a$e;-><init>(Ljava/lang/Object;Lio/sentry/android/replay/capture/a;Ljava/lang/String;Lio/sentry/android/replay/capture/a;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    iput-object v0, p0, Lio/sentry/android/replay/capture/a;->p:Lle/d;

    .line 119
    .line 120
    new-instance v0, Lio/sentry/android/replay/capture/a$f;

    .line 121
    .line 122
    const/4 v1, 0x0

    .line 123
    const-string v3, "replay.type"

    .line 124
    .line 125
    move-object v5, v3

    .line 126
    invoke-direct/range {v0 .. v5}, Lio/sentry/android/replay/capture/a$f;-><init>(Ljava/lang/Object;Lio/sentry/android/replay/capture/a;Ljava/lang/String;Lio/sentry/android/replay/capture/a;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    iput-object v0, p0, Lio/sentry/android/replay/capture/a;->q:Lle/d;

    .line 130
    .line 131
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedDeque;

    .line 132
    .line 133
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedDeque;-><init>()V

    .line 134
    .line 135
    .line 136
    iput-object v0, p0, Lio/sentry/android/replay/capture/a;->r:Ljava/util/Deque;

    .line 137
    .line 138
    return-void
.end method

.method public static final synthetic k(Lio/sentry/android/replay/capture/a;)Lio/sentry/z3;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/android/replay/capture/a;->b:Lio/sentry/z3;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic l(Lio/sentry/android/replay/capture/a;)Ljava/util/concurrent/ScheduledExecutorService;
    .locals 0

    .line 1
    invoke-direct {p0}, Lio/sentry/android/replay/capture/a;->q()Ljava/util/concurrent/ScheduledExecutorService;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic n(Lio/sentry/android/replay/capture/a;JLjava/util/Date;Lio/sentry/protocol/x;IIIIILio/sentry/A3$b;Lio/sentry/android/replay/i;Ljava/lang/String;Ljava/util/List;Ljava/util/Deque;ILjava/lang/Object;)Lio/sentry/android/replay/capture/h$c;
    .locals 15

    .line 1
    move/from16 v1, p15

    .line 2
    .line 3
    if-nez p16, :cond_5

    .line 4
    .line 5
    and-int/lit16 v2, v1, 0x100

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lio/sentry/android/replay/capture/a;->v()Lio/sentry/A3$b;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    move-object v10, v2

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object/from16 v10, p10

    .line 16
    .line 17
    :goto_0
    and-int/lit16 v2, v1, 0x200

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    iget-object v2, p0, Lio/sentry/android/replay/capture/a;->j:Lio/sentry/android/replay/i;

    .line 22
    .line 23
    move-object v11, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move-object/from16 v11, p11

    .line 26
    .line 27
    :goto_1
    and-int/lit16 v2, v1, 0x400

    .line 28
    .line 29
    if-eqz v2, :cond_2

    .line 30
    .line 31
    invoke-virtual {p0}, Lio/sentry/android/replay/capture/a;->w()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    move-object v12, v2

    .line 36
    goto :goto_2

    .line 37
    :cond_2
    move-object/from16 v12, p12

    .line 38
    .line 39
    :goto_2
    and-int/lit16 v2, v1, 0x800

    .line 40
    .line 41
    if-eqz v2, :cond_3

    .line 42
    .line 43
    const/4 v2, 0x0

    .line 44
    move-object v13, v2

    .line 45
    goto :goto_3

    .line 46
    :cond_3
    move-object/from16 v13, p13

    .line 47
    .line 48
    :goto_3
    and-int/lit16 v1, v1, 0x1000

    .line 49
    .line 50
    if-eqz v1, :cond_4

    .line 51
    .line 52
    iget-object v1, p0, Lio/sentry/android/replay/capture/a;->r:Ljava/util/Deque;

    .line 53
    .line 54
    move-object v14, v1

    .line 55
    move-object v0, p0

    .line 56
    move-object/from16 v3, p3

    .line 57
    .line 58
    move-object/from16 v4, p4

    .line 59
    .line 60
    move/from16 v5, p5

    .line 61
    .line 62
    move/from16 v6, p6

    .line 63
    .line 64
    move/from16 v7, p7

    .line 65
    .line 66
    move/from16 v8, p8

    .line 67
    .line 68
    move/from16 v9, p9

    .line 69
    .line 70
    move-wide/from16 v1, p1

    .line 71
    .line 72
    goto :goto_4

    .line 73
    :cond_4
    move-object/from16 v14, p14

    .line 74
    .line 75
    move-object v0, p0

    .line 76
    move-wide/from16 v1, p1

    .line 77
    .line 78
    move-object/from16 v3, p3

    .line 79
    .line 80
    move-object/from16 v4, p4

    .line 81
    .line 82
    move/from16 v5, p5

    .line 83
    .line 84
    move/from16 v6, p6

    .line 85
    .line 86
    move/from16 v7, p7

    .line 87
    .line 88
    move/from16 v8, p8

    .line 89
    .line 90
    move/from16 v9, p9

    .line 91
    .line 92
    :goto_4
    invoke-virtual/range {v0 .. v14}, Lio/sentry/android/replay/capture/a;->m(JLjava/util/Date;Lio/sentry/protocol/x;IIIIILio/sentry/A3$b;Lio/sentry/android/replay/i;Ljava/lang/String;Ljava/util/List;Ljava/util/Deque;)Lio/sentry/android/replay/capture/h$c;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    return-object v0

    .line 97
    :cond_5
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 98
    .line 99
    const-string v1, "Super calls with default arguments not supported in this target, function: createSegmentInternal"

    .line 100
    .line 101
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    throw v0
.end method

.method private final q()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/capture/a;->g:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/concurrent/ScheduledExecutorService;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final A(Lio/sentry/android/replay/s;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/capture/a;->k:Lle/d;

    .line 2
    .line 3
    sget-object v1, Lio/sentry/android/replay/capture/a;->t:[Lpe/m;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p0, v1, p1}, Lle/d;->b(Ljava/lang/Object;Lpe/m;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public B(Lio/sentry/A3$b;)V
    .locals 3

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lio/sentry/android/replay/capture/a;->q:Lle/d;

    .line 7
    .line 8
    sget-object v1, Lio/sentry/android/replay/capture/a;->t:[Lpe/m;

    .line 9
    .line 10
    const/4 v2, 0x5

    .line 11
    aget-object v1, v1, v2

    .line 12
    .line 13
    invoke-interface {v0, p0, v1, p1}, Lle/d;->b(Ljava/lang/Object;Lpe/m;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method protected final C(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/capture/a;->n:Lle/d;

    .line 2
    .line 3
    sget-object v1, Lio/sentry/android/replay/capture/a;->t:[Lpe/m;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p0, v1, p1}, Lle/d;->b(Ljava/lang/Object;Lpe/m;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public a()Lio/sentry/protocol/x;
    .locals 3

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/capture/a;->o:Lle/d;

    .line 2
    .line 3
    sget-object v1, Lio/sentry/android/replay/capture/a;->t:[Lpe/m;

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p0, v1}, Lle/d;->a(Ljava/lang/Object;Lpe/m;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lio/sentry/protocol/x;

    .line 13
    .line 14
    return-object v0
.end method

.method public b(Landroid/view/MotionEvent;)V
    .locals 2

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lio/sentry/android/replay/capture/a;->s()Lio/sentry/android/replay/s;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, Lio/sentry/android/replay/capture/a;->h:Lio/sentry/android/replay/gestures/b;

    .line 13
    .line 14
    invoke-virtual {v1, p1, v0}, Lio/sentry/android/replay/gestures/b;->a(Landroid/view/MotionEvent;Lio/sentry/android/replay/s;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, Lio/sentry/android/replay/capture/a;->r:Ljava/util/Deque;

    .line 21
    .line 22
    invoke-static {v0, p1}, LUd/u;->D(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public c(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/capture/a;->p:Lle/d;

    .line 2
    .line 3
    sget-object v1, Lio/sentry/android/replay/capture/a;->t:[Lpe/m;

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-interface {v0, p0, v1, p1}, Lle/d;->b(Ljava/lang/Object;Lpe/m;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public d()I
    .locals 3

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/capture/a;->p:Lle/d;

    .line 2
    .line 3
    sget-object v1, Lio/sentry/android/replay/capture/a;->t:[Lpe/m;

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p0, v1}, Lle/d;->a(Ljava/lang/Object;Lpe/m;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Number;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0
.end method

.method public h(ILio/sentry/protocol/x;Lio/sentry/A3$b;)V
    .locals 2

    .line 1
    const-string v0, "replayId"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lio/sentry/android/replay/capture/a;->f:Lkotlin/jvm/functions/Function1;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-interface {v0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lio/sentry/android/replay/i;

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    :cond_0
    new-instance v0, Lio/sentry/android/replay/i;

    .line 19
    .line 20
    iget-object v1, p0, Lio/sentry/android/replay/capture/a;->b:Lio/sentry/z3;

    .line 21
    .line 22
    invoke-direct {v0, v1, p2}, Lio/sentry/android/replay/i;-><init>(Lio/sentry/z3;Lio/sentry/protocol/x;)V

    .line 23
    .line 24
    .line 25
    :cond_1
    iput-object v0, p0, Lio/sentry/android/replay/capture/a;->j:Lio/sentry/android/replay/i;

    .line 26
    .line 27
    invoke-virtual {p0, p2}, Lio/sentry/android/replay/capture/a;->z(Lio/sentry/protocol/x;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, p1}, Lio/sentry/android/replay/capture/a;->c(I)V

    .line 31
    .line 32
    .line 33
    if-nez p3, :cond_3

    .line 34
    .line 35
    instance-of p1, p0, Lio/sentry/android/replay/capture/m;

    .line 36
    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    sget-object p3, Lio/sentry/A3$b;->SESSION:Lio/sentry/A3$b;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    sget-object p3, Lio/sentry/A3$b;->BUFFER:Lio/sentry/A3$b;

    .line 43
    .line 44
    :cond_3
    :goto_0
    invoke-virtual {p0, p3}, Lio/sentry/android/replay/capture/a;->B(Lio/sentry/A3$b;)V

    .line 45
    .line 46
    .line 47
    invoke-static {}, Lio/sentry/l;->d()Ljava/util/Date;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p0, p1}, Lio/sentry/android/replay/capture/a;->j(Ljava/util/Date;)V

    .line 52
    .line 53
    .line 54
    iget-object p1, p0, Lio/sentry/android/replay/capture/a;->m:Ljava/util/concurrent/atomic/AtomicLong;

    .line 55
    .line 56
    iget-object p2, p0, Lio/sentry/android/replay/capture/a;->d:Lio/sentry/transport/o;

    .line 57
    .line 58
    invoke-interface {p2}, Lio/sentry/transport/o;->getCurrentTimeMillis()J

    .line 59
    .line 60
    .line 61
    move-result-wide p2

    .line 62
    invoke-virtual {p1, p2, p3}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public i()V
    .locals 1

    .line 1
    invoke-static {}, Lio/sentry/l;->d()Ljava/util/Date;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Lio/sentry/android/replay/capture/a;->j(Ljava/util/Date;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public j(Ljava/util/Date;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/capture/a;->l:Lle/d;

    .line 2
    .line 3
    sget-object v1, Lio/sentry/android/replay/capture/a;->t:[Lpe/m;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p0, v1, p1}, Lle/d;->b(Ljava/lang/Object;Lpe/m;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method protected final m(JLjava/util/Date;Lio/sentry/protocol/x;IIIIILio/sentry/A3$b;Lio/sentry/android/replay/i;Ljava/lang/String;Ljava/util/List;Ljava/util/Deque;)Lio/sentry/android/replay/capture/h$c;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "currentSegmentTimestamp"

    .line 4
    .line 5
    move-object/from16 v7, p3

    .line 6
    .line 7
    invoke-static {v7, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v1, "replayId"

    .line 11
    .line 12
    move-object/from16 v8, p4

    .line 13
    .line 14
    invoke-static {v8, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-string v1, "replayType"

    .line 18
    .line 19
    move-object/from16 v12, p10

    .line 20
    .line 21
    invoke-static {v12, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const-string v1, "events"

    .line 25
    .line 26
    move-object/from16 v2, p14

    .line 27
    .line 28
    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    sget-object v2, Lio/sentry/android/replay/capture/h;->a:Lio/sentry/android/replay/capture/h$a;

    .line 32
    .line 33
    iget-object v3, v0, Lio/sentry/android/replay/capture/a;->c:Lio/sentry/a0;

    .line 34
    .line 35
    iget-object v4, v0, Lio/sentry/android/replay/capture/a;->b:Lio/sentry/z3;

    .line 36
    .line 37
    move-wide/from16 v5, p1

    .line 38
    .line 39
    move/from16 v9, p5

    .line 40
    .line 41
    move/from16 v10, p6

    .line 42
    .line 43
    move/from16 v11, p7

    .line 44
    .line 45
    move/from16 v14, p8

    .line 46
    .line 47
    move/from16 v15, p9

    .line 48
    .line 49
    move-object/from16 v13, p11

    .line 50
    .line 51
    move-object/from16 v16, p12

    .line 52
    .line 53
    move-object/from16 v17, p13

    .line 54
    .line 55
    move-object/from16 v18, p14

    .line 56
    .line 57
    invoke-virtual/range {v2 .. v18}, Lio/sentry/android/replay/capture/h$a;->c(Lio/sentry/a0;Lio/sentry/z3;JLjava/util/Date;Lio/sentry/protocol/x;IIILio/sentry/A3$b;Lio/sentry/android/replay/i;IILjava/lang/String;Ljava/util/List;Ljava/util/Deque;)Lio/sentry/android/replay/capture/h$c;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    return-object v1
.end method

.method protected final o()Lio/sentry/android/replay/i;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/capture/a;->j:Lio/sentry/android/replay/i;

    .line 2
    .line 3
    return-object v0
.end method

.method protected final p()Ljava/util/Deque;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/capture/a;->r:Ljava/util/Deque;

    .line 2
    .line 3
    return-object v0
.end method

.method public pause()V
    .locals 0

    .line 1
    return-void
.end method

.method public r(Lio/sentry/android/replay/s;)V
    .locals 1

    .line 1
    const-string v0, "recorderConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lio/sentry/android/replay/capture/a;->A(Lio/sentry/android/replay/s;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final s()Lio/sentry/android/replay/s;
    .locals 3

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/capture/a;->k:Lle/d;

    .line 2
    .line 3
    sget-object v1, Lio/sentry/android/replay/capture/a;->t:[Lpe/m;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p0, v1}, Lle/d;->a(Ljava/lang/Object;Lpe/m;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lio/sentry/android/replay/s;

    .line 13
    .line 14
    return-object v0
.end method

.method public stop()V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/capture/a;->j:Lio/sentry/android/replay/i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lio/sentry/android/replay/i;->close()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lio/sentry/android/replay/capture/a;->m:Ljava/util/concurrent/atomic/AtomicLong;

    .line 9
    .line 10
    const-wide/16 v1, 0x0

    .line 11
    .line 12
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-virtual {p0, v0}, Lio/sentry/android/replay/capture/a;->j(Ljava/util/Date;)V

    .line 17
    .line 18
    .line 19
    sget-object v0, Lio/sentry/protocol/x;->b:Lio/sentry/protocol/x;

    .line 20
    .line 21
    const-string v1, "EMPTY_ID"

    .line 22
    .line 23
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v0}, Lio/sentry/android/replay/capture/a;->z(Lio/sentry/protocol/x;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method protected final t()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/capture/a;->e:Ljava/util/concurrent/ScheduledExecutorService;

    .line 2
    .line 3
    return-object v0
.end method

.method protected final u()Ljava/util/concurrent/atomic/AtomicLong;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/capture/a;->m:Ljava/util/concurrent/atomic/AtomicLong;

    .line 2
    .line 3
    return-object v0
.end method

.method public v()Lio/sentry/A3$b;
    .locals 3

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/capture/a;->q:Lle/d;

    .line 2
    .line 3
    sget-object v1, Lio/sentry/android/replay/capture/a;->t:[Lpe/m;

    .line 4
    .line 5
    const/4 v2, 0x5

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p0, v1}, Lle/d;->a(Ljava/lang/Object;Lpe/m;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lio/sentry/A3$b;

    .line 13
    .line 14
    return-object v0
.end method

.method protected final w()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/capture/a;->n:Lle/d;

    .line 2
    .line 3
    sget-object v1, Lio/sentry/android/replay/capture/a;->t:[Lpe/m;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p0, v1}, Lle/d;->a(Ljava/lang/Object;Lpe/m;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/String;

    .line 13
    .line 14
    return-object v0
.end method

.method public x()Ljava/util/Date;
    .locals 3

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/capture/a;->l:Lle/d;

    .line 2
    .line 3
    sget-object v1, Lio/sentry/android/replay/capture/a;->t:[Lpe/m;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p0, v1}, Lle/d;->a(Ljava/lang/Object;Lpe/m;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/util/Date;

    .line 13
    .line 14
    return-object v0
.end method

.method protected final y()Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/capture/a;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    return-object v0
.end method

.method public z(Lio/sentry/protocol/x;)V
    .locals 3

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lio/sentry/android/replay/capture/a;->o:Lle/d;

    .line 7
    .line 8
    sget-object v1, Lio/sentry/android/replay/capture/a;->t:[Lpe/m;

    .line 9
    .line 10
    const/4 v2, 0x3

    .line 11
    aget-object v1, v1, v2

    .line 12
    .line 13
    invoke-interface {v0, p0, v1, p1}, Lle/d;->b(Ljava/lang/Object;Lpe/m;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
