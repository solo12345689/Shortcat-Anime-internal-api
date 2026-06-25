.class public final Lio/sentry/android/replay/screenshot/i;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lio/sentry/android/replay/screenshot/j;


# instance fields
.field private final a:Lio/sentry/android/replay/r;

.field private final b:Lio/sentry/z3;

.field private final c:Lio/sentry/android/replay/s;

.field private final d:Lio/sentry/android/replay/util/d;

.field private final e:Ljava/util/concurrent/ScheduledExecutorService;

.field private final f:Lio/sentry/android/replay/util/i;

.field private final g:Lkotlin/Lazy;

.field private final h:Landroid/graphics/Bitmap;

.field private final i:Lkotlin/Lazy;

.field private final j:Lkotlin/Lazy;

.field private final k:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final l:Lkotlin/Lazy;

.field private final m:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final n:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Lio/sentry/android/replay/b;Lio/sentry/android/replay/r;Lio/sentry/z3;Lio/sentry/android/replay/s;Lio/sentry/android/replay/util/d;)V
    .locals 1

    .line 1
    const-string v0, "executorProvider"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "options"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "config"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "debugOverlayDrawable"

    .line 17
    .line 18
    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p2, p0, Lio/sentry/android/replay/screenshot/i;->a:Lio/sentry/android/replay/r;

    .line 25
    .line 26
    iput-object p3, p0, Lio/sentry/android/replay/screenshot/i;->b:Lio/sentry/z3;

    .line 27
    .line 28
    iput-object p4, p0, Lio/sentry/android/replay/screenshot/i;->c:Lio/sentry/android/replay/s;

    .line 29
    .line 30
    iput-object p5, p0, Lio/sentry/android/replay/screenshot/i;->d:Lio/sentry/android/replay/util/d;

    .line 31
    .line 32
    invoke-interface {p1}, Lio/sentry/android/replay/b;->g()Ljava/util/concurrent/ScheduledExecutorService;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    iput-object p2, p0, Lio/sentry/android/replay/screenshot/i;->e:Ljava/util/concurrent/ScheduledExecutorService;

    .line 37
    .line 38
    invoke-interface {p1}, Lio/sentry/android/replay/b;->b()Lio/sentry/android/replay/util/i;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iput-object p1, p0, Lio/sentry/android/replay/screenshot/i;->f:Lio/sentry/android/replay/util/i;

    .line 43
    .line 44
    sget-object p1, LTd/q;->c:LTd/q;

    .line 45
    .line 46
    sget-object p2, Lio/sentry/android/replay/screenshot/i$d;->a:Lio/sentry/android/replay/screenshot/i$d;

    .line 47
    .line 48
    invoke-static {p1, p2}, LTd/n;->a(LTd/q;Lie/a;)Lkotlin/Lazy;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    iput-object p2, p0, Lio/sentry/android/replay/screenshot/i;->g:Lkotlin/Lazy;

    .line 53
    .line 54
    invoke-virtual {p4}, Lio/sentry/android/replay/s;->d()I

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    invoke-virtual {p4}, Lio/sentry/android/replay/s;->c()I

    .line 59
    .line 60
    .line 61
    move-result p3

    .line 62
    sget-object p4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 63
    .line 64
    invoke-static {p2, p3, p4}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    const-string p3, "createBitmap(...)"

    .line 69
    .line 70
    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    iput-object p2, p0, Lio/sentry/android/replay/screenshot/i;->h:Landroid/graphics/Bitmap;

    .line 74
    .line 75
    new-instance p2, Lio/sentry/android/replay/screenshot/i$e;

    .line 76
    .line 77
    invoke-direct {p2, p0}, Lio/sentry/android/replay/screenshot/i$e;-><init>(Lio/sentry/android/replay/screenshot/i;)V

    .line 78
    .line 79
    .line 80
    invoke-static {p1, p2}, LTd/n;->a(LTd/q;Lie/a;)Lkotlin/Lazy;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    iput-object p2, p0, Lio/sentry/android/replay/screenshot/i;->i:Lkotlin/Lazy;

    .line 85
    .line 86
    new-instance p2, Lio/sentry/android/replay/screenshot/i$c;

    .line 87
    .line 88
    invoke-direct {p2, p0}, Lio/sentry/android/replay/screenshot/i$c;-><init>(Lio/sentry/android/replay/screenshot/i;)V

    .line 89
    .line 90
    .line 91
    invoke-static {p1, p2}, LTd/n;->a(LTd/q;Lie/a;)Lkotlin/Lazy;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    iput-object p2, p0, Lio/sentry/android/replay/screenshot/i;->j:Lkotlin/Lazy;

    .line 96
    .line 97
    new-instance p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 98
    .line 99
    const/4 p3, 0x0

    .line 100
    invoke-direct {p2, p3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 101
    .line 102
    .line 103
    iput-object p2, p0, Lio/sentry/android/replay/screenshot/i;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 104
    .line 105
    sget-object p2, Lio/sentry/android/replay/screenshot/i$b;->a:Lio/sentry/android/replay/screenshot/i$b;

    .line 106
    .line 107
    invoke-static {p1, p2}, LTd/n;->a(LTd/q;Lie/a;)Lkotlin/Lazy;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    iput-object p1, p0, Lio/sentry/android/replay/screenshot/i;->l:Lkotlin/Lazy;

    .line 112
    .line 113
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 114
    .line 115
    invoke-direct {p1, p3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 116
    .line 117
    .line 118
    iput-object p1, p0, Lio/sentry/android/replay/screenshot/i;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 119
    .line 120
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 121
    .line 122
    invoke-direct {p1, p3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 123
    .line 124
    .line 125
    iput-object p1, p0, Lio/sentry/android/replay/screenshot/i;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 126
    .line 127
    return-void
.end method

.method public static synthetic d(Lio/sentry/android/replay/screenshot/i;Lio/sentry/android/replay/viewhierarchy/b;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/sentry/android/replay/screenshot/i;->o(Lio/sentry/android/replay/screenshot/i;Lio/sentry/android/replay/viewhierarchy/b;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic e(Lio/sentry/android/replay/screenshot/i;Landroid/view/View;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/sentry/android/replay/screenshot/i;->n(Lio/sentry/android/replay/screenshot/i;Landroid/view/View;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic f(Lio/sentry/android/replay/screenshot/i;Landroid/view/View;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/sentry/android/replay/screenshot/i;->p(Lio/sentry/android/replay/screenshot/i;Landroid/view/View;Ljava/util/List;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic g(Lio/sentry/android/replay/screenshot/i;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lio/sentry/android/replay/screenshot/i;->q(Lio/sentry/android/replay/screenshot/i;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic h(Lio/sentry/android/replay/screenshot/i;Landroid/graphics/Bitmap;Landroid/graphics/Rect;)I
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lio/sentry/android/replay/screenshot/i;->r(Landroid/graphics/Bitmap;Landroid/graphics/Rect;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic i(Lio/sentry/android/replay/screenshot/i;)Lio/sentry/android/replay/s;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/android/replay/screenshot/i;->c:Lio/sentry/android/replay/s;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic j(Lio/sentry/android/replay/screenshot/i;)Landroid/graphics/Paint;
    .locals 0

    .line 1
    invoke-direct {p0}, Lio/sentry/android/replay/screenshot/i;->s()Landroid/graphics/Paint;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic k(Lio/sentry/android/replay/screenshot/i;)Lio/sentry/z3;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/android/replay/screenshot/i;->b:Lio/sentry/z3;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic l(Lio/sentry/android/replay/screenshot/i;)Landroid/graphics/Bitmap;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/android/replay/screenshot/i;->h:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic m(Lio/sentry/android/replay/screenshot/i;)Landroid/graphics/Bitmap;
    .locals 0

    .line 1
    invoke-direct {p0}, Lio/sentry/android/replay/screenshot/i;->u()Landroid/graphics/Bitmap;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final n(Lio/sentry/android/replay/screenshot/i;Landroid/view/View;I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/screenshot/i;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object p0, p0, Lio/sentry/android/replay/screenshot/i;->b:Lio/sentry/z3;

    .line 11
    .line 12
    invoke-virtual {p0}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    sget-object p1, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 17
    .line 18
    const-string p2, "PixelCopyStrategy is closed, ignoring capture result"

    .line 19
    .line 20
    new-array v0, v1, [Ljava/lang/Object;

    .line 21
    .line 22
    invoke-interface {p0, p1, p2, v0}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    if-eqz p2, :cond_1

    .line 27
    .line 28
    iget-object p1, p0, Lio/sentry/android/replay/screenshot/i;->b:Lio/sentry/z3;

    .line 29
    .line 30
    invoke-virtual {p1}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    sget-object v0, Lio/sentry/i3;->INFO:Lio/sentry/i3;

    .line 35
    .line 36
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    const-string v2, "Failed to capture replay recording: %d"

    .line 45
    .line 46
    invoke-interface {p1, v0, v2, p2}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    iget-object p0, p0, Lio/sentry/android/replay/screenshot/i;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 50
    .line 51
    invoke-virtual {p0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_1
    iget-object p2, p0, Lio/sentry/android/replay/screenshot/i;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 56
    .line 57
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    if-eqz p2, :cond_2

    .line 62
    .line 63
    iget-object p1, p0, Lio/sentry/android/replay/screenshot/i;->b:Lio/sentry/z3;

    .line 64
    .line 65
    invoke-virtual {p1}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    sget-object p2, Lio/sentry/i3;->INFO:Lio/sentry/i3;

    .line 70
    .line 71
    const-string v0, "Failed to determine view hierarchy, not capturing"

    .line 72
    .line 73
    new-array v2, v1, [Ljava/lang/Object;

    .line 74
    .line 75
    invoke-interface {p1, p2, v0, v2}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    iget-object p0, p0, Lio/sentry/android/replay/screenshot/i;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 79
    .line 80
    invoke-virtual {p0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :cond_2
    sget-object p2, Lio/sentry/android/replay/viewhierarchy/b;->m:Lio/sentry/android/replay/viewhierarchy/b$a;

    .line 85
    .line 86
    const/4 v0, 0x0

    .line 87
    iget-object v2, p0, Lio/sentry/android/replay/screenshot/i;->b:Lio/sentry/z3;

    .line 88
    .line 89
    invoke-virtual {p2, p1, v0, v1, v2}, Lio/sentry/android/replay/viewhierarchy/b$a;->a(Landroid/view/View;Lio/sentry/android/replay/viewhierarchy/b;ILio/sentry/z3;)Lio/sentry/android/replay/viewhierarchy/b;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    iget-object v0, p0, Lio/sentry/android/replay/screenshot/i;->b:Lio/sentry/z3;

    .line 94
    .line 95
    invoke-static {p1, p2, v0}, Lio/sentry/android/replay/util/r;->k(Landroid/view/View;Lio/sentry/android/replay/viewhierarchy/b;Lio/sentry/z3;)V

    .line 96
    .line 97
    .line 98
    iget-object v0, p0, Lio/sentry/android/replay/screenshot/i;->e:Ljava/util/concurrent/ScheduledExecutorService;

    .line 99
    .line 100
    new-instance v1, Lio/sentry/android/replay/util/m;

    .line 101
    .line 102
    new-instance v2, Lio/sentry/android/replay/screenshot/g;

    .line 103
    .line 104
    invoke-direct {v2, p0, p2, p1}, Lio/sentry/android/replay/screenshot/g;-><init>(Lio/sentry/android/replay/screenshot/i;Lio/sentry/android/replay/viewhierarchy/b;Landroid/view/View;)V

    .line 105
    .line 106
    .line 107
    const-string p0, "screenshot_recorder.mask"

    .line 108
    .line 109
    invoke-direct {v1, p0, v2}, Lio/sentry/android/replay/util/m;-><init>(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 110
    .line 111
    .line 112
    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 113
    .line 114
    .line 115
    return-void
.end method

.method private static final o(Lio/sentry/android/replay/screenshot/i;Lio/sentry/android/replay/viewhierarchy/b;Landroid/view/View;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/screenshot/i;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_3

    .line 9
    .line 10
    iget-object v0, p0, Lio/sentry/android/replay/screenshot/i;->h:Landroid/graphics/Bitmap;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    new-instance v2, Landroid/graphics/Canvas;

    .line 25
    .line 26
    iget-object v3, p0, Lio/sentry/android/replay/screenshot/i;->h:Landroid/graphics/Bitmap;

    .line 27
    .line 28
    invoke-direct {v2, v3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p0}, Lio/sentry/android/replay/screenshot/i;->t()Landroid/graphics/Matrix;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-virtual {v2, v3}, Landroid/graphics/Canvas;->setMatrix(Landroid/graphics/Matrix;)V

    .line 36
    .line 37
    .line 38
    new-instance v3, Lio/sentry/android/replay/screenshot/i$a;

    .line 39
    .line 40
    invoke-direct {v3, p0, v0, v2}, Lio/sentry/android/replay/screenshot/i$a;-><init>(Lio/sentry/android/replay/screenshot/i;Ljava/util/List;Landroid/graphics/Canvas;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, v3}, Lio/sentry/android/replay/viewhierarchy/b;->h(Lkotlin/jvm/functions/Function1;)V

    .line 44
    .line 45
    .line 46
    iget-object p1, p0, Lio/sentry/android/replay/screenshot/i;->b:Lio/sentry/z3;

    .line 47
    .line 48
    invoke-virtual {p1}, Lio/sentry/z3;->getReplayController()Lio/sentry/z1;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-interface {p1}, Lio/sentry/z1;->o()Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-eqz p1, :cond_1

    .line 57
    .line 58
    iget-object p1, p0, Lio/sentry/android/replay/screenshot/i;->f:Lio/sentry/android/replay/util/i;

    .line 59
    .line 60
    new-instance v2, Lio/sentry/android/replay/screenshot/h;

    .line 61
    .line 62
    invoke-direct {v2, p0, p2, v0}, Lio/sentry/android/replay/screenshot/h;-><init>(Lio/sentry/android/replay/screenshot/i;Landroid/view/View;Ljava/util/List;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v2}, Lio/sentry/android/replay/util/i;->b(Ljava/lang/Runnable;)Z

    .line 66
    .line 67
    .line 68
    :cond_1
    iget-object p1, p0, Lio/sentry/android/replay/screenshot/i;->a:Lio/sentry/android/replay/r;

    .line 69
    .line 70
    if-eqz p1, :cond_2

    .line 71
    .line 72
    iget-object p2, p0, Lio/sentry/android/replay/screenshot/i;->h:Landroid/graphics/Bitmap;

    .line 73
    .line 74
    invoke-interface {p1, p2}, Lio/sentry/android/replay/r;->j(Landroid/graphics/Bitmap;)V

    .line 75
    .line 76
    .line 77
    :cond_2
    iget-object p1, p0, Lio/sentry/android/replay/screenshot/i;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 78
    .line 79
    const/4 p2, 0x1

    .line 80
    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 81
    .line 82
    .line 83
    iget-object p0, p0, Lio/sentry/android/replay/screenshot/i;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 84
    .line 85
    invoke-virtual {p0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :cond_3
    :goto_0
    iget-object p0, p0, Lio/sentry/android/replay/screenshot/i;->b:Lio/sentry/z3;

    .line 90
    .line 91
    invoke-virtual {p0}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    sget-object p1, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 96
    .line 97
    const-string p2, "PixelCopyStrategy is closed, skipping masking"

    .line 98
    .line 99
    new-array v0, v1, [Ljava/lang/Object;

    .line 100
    .line 101
    invoke-interface {p0, p1, p2, v0}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    return-void
.end method

.method private static final p(Lio/sentry/android/replay/screenshot/i;Landroid/view/View;Ljava/util/List;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/screenshot/i;->d:Lio/sentry/android/replay/util/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/View;->getOverlay()Landroid/view/ViewOverlay;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Lio/sentry/android/replay/screenshot/i;->d:Lio/sentry/android/replay/util/d;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/view/ViewOverlay;->add(Landroid/graphics/drawable/Drawable;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object p0, p0, Lio/sentry/android/replay/screenshot/i;->d:Lio/sentry/android/replay/util/d;

    .line 19
    .line 20
    invoke-virtual {p0, p2}, Lio/sentry/android/replay/util/d;->b(Ljava/util/List;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/view/View;->postInvalidate()V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method private static final q(Lio/sentry/android/replay/screenshot/i;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/screenshot/i;->h:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lio/sentry/android/replay/screenshot/i;->h:Landroid/graphics/Bitmap;

    .line 10
    .line 11
    monitor-enter v0

    .line 12
    :try_start_0
    iget-object v1, p0, Lio/sentry/android/replay/screenshot/i;->h:Landroid/graphics/Bitmap;

    .line 13
    .line 14
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    iget-object v1, p0, Lio/sentry/android/replay/screenshot/i;->h:Landroid/graphics/Bitmap;

    .line 21
    .line 22
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p0

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    :goto_0
    sget-object v1, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    monitor-exit v0

    .line 31
    goto :goto_2

    .line 32
    :goto_1
    monitor-exit v0

    .line 33
    throw p0

    .line 34
    :cond_1
    :goto_2
    invoke-direct {p0}, Lio/sentry/android/replay/screenshot/i;->u()Landroid/graphics/Bitmap;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_2

    .line 43
    .line 44
    invoke-direct {p0}, Lio/sentry/android/replay/screenshot/i;->u()Landroid/graphics/Bitmap;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V

    .line 49
    .line 50
    .line 51
    :cond_2
    return-void
.end method

.method private final r(Landroid/graphics/Bitmap;Landroid/graphics/Rect;)I
    .locals 4

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/screenshot/i;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    invoke-direct {p0}, Lio/sentry/android/replay/screenshot/i;->u()Landroid/graphics/Bitmap;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v0, Landroid/graphics/Rect;

    .line 27
    .line 28
    invoke-direct {v0, p2}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 29
    .line 30
    .line 31
    new-instance p2, Landroid/graphics/RectF;

    .line 32
    .line 33
    invoke-direct {p2, v0}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    .line 34
    .line 35
    .line 36
    invoke-direct {p0}, Lio/sentry/android/replay/screenshot/i;->t()Landroid/graphics/Matrix;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v1, p2}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 41
    .line 42
    .line 43
    invoke-virtual {p2, v0}, Landroid/graphics/RectF;->round(Landroid/graphics/Rect;)V

    .line 44
    .line 45
    .line 46
    invoke-direct {p0}, Lio/sentry/android/replay/screenshot/i;->v()Landroid/graphics/Canvas;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    new-instance v1, Landroid/graphics/Rect;

    .line 51
    .line 52
    const/4 v2, 0x0

    .line 53
    const/4 v3, 0x1

    .line 54
    invoke-direct {v1, v2, v2, v3, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 55
    .line 56
    .line 57
    const/4 v3, 0x0

    .line 58
    invoke-virtual {p2, p1, v0, v1, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 59
    .line 60
    .line 61
    invoke-direct {p0}, Lio/sentry/android/replay/screenshot/i;->u()Landroid/graphics/Bitmap;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {p1, v2, v2}, Landroid/graphics/Bitmap;->getPixel(II)I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    return p1

    .line 70
    :cond_1
    :goto_0
    const/high16 p1, -0x1000000

    .line 71
    .line 72
    return p1
.end method

.method private final s()Landroid/graphics/Paint;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/screenshot/i;->l:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/graphics/Paint;

    .line 8
    .line 9
    return-object v0
.end method

.method private final t()Landroid/graphics/Matrix;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/screenshot/i;->j:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/graphics/Matrix;

    .line 8
    .line 9
    return-object v0
.end method

.method private final u()Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/screenshot/i;->g:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/graphics/Bitmap;

    .line 8
    .line 9
    return-object v0
.end method

.method private final v()Landroid/graphics/Canvas;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/screenshot/i;->i:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/graphics/Canvas;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/screenshot/i;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public b()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lio/sentry/android/replay/screenshot/i;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lio/sentry/android/replay/screenshot/i;->h:Landroid/graphics/Bitmap;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lio/sentry/android/replay/screenshot/i;->a:Lio/sentry/android/replay/r;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v1, p0, Lio/sentry/android/replay/screenshot/i;->h:Landroid/graphics/Bitmap;

    .line 20
    .line 21
    invoke-interface {v0, v1}, Lio/sentry/android/replay/r;->j(Landroid/graphics/Bitmap;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public c(Landroid/view/View;)V
    .locals 4

    .line 1
    const-string v0, "root"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lio/sentry/android/replay/y;->a(Landroid/view/View;)Landroid/view/Window;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object p1, p0, Lio/sentry/android/replay/screenshot/i;->b:Lio/sentry/z3;

    .line 14
    .line 15
    invoke-virtual {p1}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    sget-object v0, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 20
    .line 21
    const-string v2, "Window is invalid, not capturing screenshot"

    .line 22
    .line 23
    new-array v1, v1, [Ljava/lang/Object;

    .line 24
    .line 25
    invoke-interface {p1, v0, v2, v1}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    iget-object v2, p0, Lio/sentry/android/replay/screenshot/i;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    iget-object p1, p0, Lio/sentry/android/replay/screenshot/i;->b:Lio/sentry/z3;

    .line 38
    .line 39
    invoke-virtual {p1}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    sget-object v0, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 44
    .line 45
    const-string v2, "PixelCopyStrategy is closed, not capturing screenshot"

    .line 46
    .line 47
    new-array v1, v1, [Ljava/lang/Object;

    .line 48
    .line 49
    invoke-interface {p1, v0, v2, v1}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_1
    :try_start_0
    iget-object v2, p0, Lio/sentry/android/replay/screenshot/i;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 54
    .line 55
    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 56
    .line 57
    .line 58
    iget-object v2, p0, Lio/sentry/android/replay/screenshot/i;->h:Landroid/graphics/Bitmap;

    .line 59
    .line 60
    new-instance v3, Lio/sentry/android/replay/screenshot/e;

    .line 61
    .line 62
    invoke-direct {v3, p0, p1}, Lio/sentry/android/replay/screenshot/e;-><init>(Lio/sentry/android/replay/screenshot/i;Landroid/view/View;)V

    .line 63
    .line 64
    .line 65
    iget-object p1, p0, Lio/sentry/android/replay/screenshot/i;->f:Lio/sentry/android/replay/util/i;

    .line 66
    .line 67
    invoke-virtual {p1}, Lio/sentry/android/replay/util/i;->a()Landroid/os/Handler;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-static {v0, v2, v3, p1}, Lb7/b;->a(Landroid/view/Window;Landroid/graphics/Bitmap;Landroid/view/PixelCopy$OnPixelCopyFinishedListener;Landroid/os/Handler;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :catchall_0
    move-exception p1

    .line 76
    iget-object v0, p0, Lio/sentry/android/replay/screenshot/i;->b:Lio/sentry/z3;

    .line 77
    .line 78
    invoke-virtual {v0}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    sget-object v2, Lio/sentry/i3;->WARNING:Lio/sentry/i3;

    .line 83
    .line 84
    const-string v3, "Failed to capture replay recording"

    .line 85
    .line 86
    invoke-interface {v0, v2, v3, p1}, Lio/sentry/ILogger;->b(Lio/sentry/i3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 87
    .line 88
    .line 89
    iget-object p1, p0, Lio/sentry/android/replay/screenshot/i;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 90
    .line 91
    invoke-virtual {p1, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 92
    .line 93
    .line 94
    return-void
.end method

.method public close()V
    .locals 4

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/screenshot/i;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lio/sentry/android/replay/screenshot/i;->e:Ljava/util/concurrent/ScheduledExecutorService;

    .line 8
    .line 9
    new-instance v1, Lio/sentry/android/replay/util/m;

    .line 10
    .line 11
    new-instance v2, Lio/sentry/android/replay/screenshot/f;

    .line 12
    .line 13
    invoke-direct {v2, p0}, Lio/sentry/android/replay/screenshot/f;-><init>(Lio/sentry/android/replay/screenshot/i;)V

    .line 14
    .line 15
    .line 16
    const-string v3, "PixelCopyStrategy.close"

    .line 17
    .line 18
    invoke-direct {v1, v3, v2}, Lio/sentry/android/replay/util/m;-><init>(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 19
    .line 20
    .line 21
    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public onContentChanged()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/screenshot/i;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method
