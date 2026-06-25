.class public final LId/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroid/media/AudioManager$OnAudioFocusChangeListener;
.implements LHd/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LId/e$a;
    }
.end annotation


# instance fields
.field private final a:LUb/d;

.field private final b:Lkotlin/Lazy;

.field private c:Ljava/util/List;

.field private d:Landroid/media/AudioFocusRequest;

.field private e:Lexpo/modules/video/enums/AudioMixingMode;


# direct methods
.method public constructor <init>(LUb/d;)V
    .locals 1

    .line 1
    const-string v0, "appContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LId/e;->a:LUb/d;

    .line 10
    .line 11
    new-instance p1, LId/d;

    .line 12
    .line 13
    invoke-direct {p1, p0}, LId/d;-><init>(LId/e;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p1}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, LId/e;->b:Lkotlin/Lazy;

    .line 21
    .line 22
    new-instance p1, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, LId/e;->c:Ljava/util/List;

    .line 28
    .line 29
    sget-object p1, Lexpo/modules/video/enums/AudioMixingMode;->MIX_WITH_OTHERS:Lexpo/modules/video/enums/AudioMixingMode;

    .line 30
    .line 31
    iput-object p1, p0, LId/e;->e:Lexpo/modules/video/enums/AudioMixingMode;

    .line 32
    .line 33
    return-void
.end method

.method public static synthetic a(LId/e;)Landroid/media/AudioManager;
    .locals 0

    .line 1
    invoke-static {p0}, LId/e;->i(LId/e;)Landroid/media/AudioManager;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic b(Lexpo/modules/video/player/VideoPlayer;Ljava/lang/ref/WeakReference;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, LId/e;->t(Lexpo/modules/video/player/VideoPlayer;Ljava/lang/ref/WeakReference;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private final c()V
    .locals 3

    .line 1
    iget-object v0, p0, LId/e;->d:Landroid/media/AudioFocusRequest;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    .line 7
    const/16 v2, 0x1a

    .line 8
    .line 9
    if-lt v1, v2, :cond_0

    .line 10
    .line 11
    invoke-direct {p0}, LId/e;->m()Landroid/media/AudioManager;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {v1, v0}, Lr2/j;->a(Landroid/media/AudioManager;Landroid/media/AudioFocusRequest;)I

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-direct {p0}, LId/e;->m()Landroid/media/AudioManager;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0, p0}, Landroid/media/AudioManager;->abandonAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;)I

    .line 24
    .line 25
    .line 26
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 27
    iput-object v0, p0, LId/e;->d:Landroid/media/AudioFocusRequest;

    .line 28
    .line 29
    return-void
.end method

.method public static final synthetic d(LId/e;Ljava/lang/ref/WeakReference;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LId/e;->j(Ljava/lang/ref/WeakReference;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic e(LId/e;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, LId/e;->c:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic f(LId/e;Ljava/lang/ref/WeakReference;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LId/e;->n(Ljava/lang/ref/WeakReference;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic g(LId/e;Landroid/media/AudioFocusRequest;)V
    .locals 0

    .line 1
    iput-object p1, p0, LId/e;->d:Landroid/media/AudioFocusRequest;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic h(LId/e;Ljava/lang/ref/WeakReference;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LId/e;->r(Ljava/lang/ref/WeakReference;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final i(LId/e;)Landroid/media/AudioManager;
    .locals 2

    .line 1
    iget-object p0, p0, LId/e;->a:LUb/d;

    .line 2
    .line 3
    invoke-virtual {p0}, LUb/d;->B()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    const-string v1, "audio"

    .line 11
    .line 12
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object p0, v0

    .line 18
    :goto_0
    instance-of v1, p0, Landroid/media/AudioManager;

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    move-object v0, p0

    .line 23
    check-cast v0, Landroid/media/AudioManager;

    .line 24
    .line 25
    :cond_1
    if-eqz v0, :cond_2

    .line 26
    .line 27
    return-object v0

    .line 28
    :cond_2
    new-instance p0, LFd/b;

    .line 29
    .line 30
    invoke-direct {p0}, LFd/b;-><init>()V

    .line 31
    .line 32
    .line 33
    throw p0
.end method

.method private final j(Ljava/lang/ref/WeakReference;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lexpo/modules/video/player/VideoPlayer;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LId/e;->a:LUb/d;

    .line 10
    .line 11
    invoke-virtual {v0}, LUb/d;->x()LGf/O;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    new-instance v4, LId/e$b;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {v4, p1, v0}, LId/e$b;-><init>(Lexpo/modules/video/player/VideoPlayer;LZd/e;)V

    .line 19
    .line 20
    .line 21
    const/4 v5, 0x3

    .line 22
    const/4 v6, 0x0

    .line 23
    const/4 v2, 0x0

    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-static/range {v1 .. v6}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method private final k()Lexpo/modules/video/enums/AudioMixingMode;
    .locals 6

    .line 1
    iget-object v0, p0, LId/e;->c:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {v0}, LUd/u;->b1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v3, 0x0

    .line 21
    if-eqz v2, :cond_3

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Lexpo/modules/video/player/VideoPlayer;

    .line 34
    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    invoke-virtual {v2}, Lexpo/modules/video/player/VideoPlayer;->z2()Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz v4, :cond_1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move-object v2, v3

    .line 45
    :goto_1
    if-eqz v2, :cond_2

    .line 46
    .line 47
    invoke-virtual {v2}, Lexpo/modules/video/player/VideoPlayer;->h2()Lexpo/modules/video/enums/AudioMixingMode;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    :cond_2
    if-eqz v3, :cond_0

    .line 52
    .line 53
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_3
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_4

    .line 62
    .line 63
    sget-object v0, Lexpo/modules/video/enums/AudioMixingMode;->MIX_WITH_OTHERS:Lexpo/modules/video/enums/AudioMixingMode;

    .line 64
    .line 65
    return-object v0

    .line 66
    :cond_4
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-eqz v1, :cond_8

    .line 75
    .line 76
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    if-eqz v2, :cond_7

    .line 85
    .line 86
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    check-cast v2, Lexpo/modules/video/enums/AudioMixingMode;

    .line 91
    .line 92
    check-cast v1, Lexpo/modules/video/enums/AudioMixingMode;

    .line 93
    .line 94
    invoke-virtual {v2}, Lexpo/modules/video/enums/AudioMixingMode;->getPriority()I

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    invoke-virtual {v1}, Lexpo/modules/video/enums/AudioMixingMode;->getPriority()I

    .line 99
    .line 100
    .line 101
    move-result v5

    .line 102
    if-le v4, v5, :cond_5

    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_5
    move-object v2, v3

    .line 106
    :goto_3
    if-nez v2, :cond_6

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_6
    move-object v1, v2

    .line 110
    goto :goto_2

    .line 111
    :cond_7
    check-cast v1, Lexpo/modules/video/enums/AudioMixingMode;

    .line 112
    .line 113
    return-object v1

    .line 114
    :cond_8
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 115
    .line 116
    const-string v1, "Empty collection can\'t be reduced."

    .line 117
    .line 118
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    throw v0
.end method

.method private final l()Z
    .locals 3

    .line 1
    iget-object v0, p0, LId/e;->c:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {v0}, LUd/u;->b1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    return v1

    .line 17
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_2

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 32
    .line 33
    invoke-direct {p0, v2}, LId/e;->o(Ljava/lang/ref/WeakReference;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    const/4 v0, 0x1

    .line 40
    return v0

    .line 41
    :cond_2
    return v1
.end method

.method private final m()Landroid/media/AudioManager;
    .locals 1

    .line 1
    iget-object v0, p0, LId/e;->b:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/media/AudioManager;

    .line 8
    .line 9
    return-object v0
.end method

.method private final n(Ljava/lang/ref/WeakReference;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lexpo/modules/video/player/VideoPlayer;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Lexpo/modules/video/player/VideoPlayer;->w2()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, LId/e;->a:LUb/d;

    .line 16
    .line 17
    invoke-virtual {v0}, LUb/d;->x()LGf/O;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    new-instance v4, LId/e$g;

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    invoke-direct {v4, p1, v0}, LId/e$g;-><init>(Lexpo/modules/video/player/VideoPlayer;LZd/e;)V

    .line 25
    .line 26
    .line 27
    const/4 v5, 0x3

    .line 28
    const/4 v6, 0x0

    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x0

    .line 31
    invoke-static/range {v1 .. v6}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 32
    .line 33
    .line 34
    :cond_0
    return-void
.end method

.method private final o(Ljava/lang/ref/WeakReference;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_3

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Lexpo/modules/video/player/VideoPlayer;

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {p1}, Lexpo/modules/video/player/VideoPlayer;->w2()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    invoke-virtual {p1}, Lexpo/modules/video/player/VideoPlayer;->z2()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-virtual {p1}, Lexpo/modules/video/player/VideoPlayer;->K2()F

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    const/4 v2, 0x0

    .line 30
    cmpl-float v1, v1, v2

    .line 31
    .line 32
    if-gtz v1, :cond_2

    .line 33
    .line 34
    :cond_1
    invoke-virtual {p1}, Lexpo/modules/video/player/VideoPlayer;->h2()Lexpo/modules/video/enums/AudioMixingMode;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    sget-object v1, Lexpo/modules/video/enums/AudioMixingMode;->DO_NOT_MIX:Lexpo/modules/video/enums/AudioMixingMode;

    .line 39
    .line 40
    if-ne p1, v1, :cond_3

    .line 41
    .line 42
    :cond_2
    const/4 p1, 0x1

    .line 43
    return p1

    .line 44
    :cond_3
    :goto_0
    return v0
.end method

.method private final q()V
    .locals 6

    .line 1
    invoke-direct {p0}, LId/e;->k()Lexpo/modules/video/enums/AudioMixingMode;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lexpo/modules/video/enums/AudioMixingMode;->MIX_WITH_OTHERS:Lexpo/modules/video/enums/AudioMixingMode;

    .line 6
    .line 7
    if-eq v0, v1, :cond_4

    .line 8
    .line 9
    invoke-direct {p0}, LId/e;->l()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    goto :goto_2

    .line 16
    :cond_0
    sget-object v1, LId/e$a;->a:[I

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    aget v1, v1, v2

    .line 23
    .line 24
    const/4 v2, 0x3

    .line 25
    const/4 v3, 0x1

    .line 26
    if-eq v1, v3, :cond_1

    .line 27
    .line 28
    move v1, v3

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move v1, v2

    .line 31
    :goto_0
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 32
    .line 33
    const/16 v5, 0x1a

    .line 34
    .line 35
    if-lt v4, v5, :cond_3

    .line 36
    .line 37
    iget-object v4, p0, LId/e;->d:Landroid/media/AudioFocusRequest;

    .line 38
    .line 39
    if-eqz v4, :cond_2

    .line 40
    .line 41
    invoke-static {v4}, LId/a;->a(Landroid/media/AudioFocusRequest;)I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-ne v4, v1, :cond_2

    .line 46
    .line 47
    return-void

    .line 48
    :cond_2
    invoke-static {v1}, Lr2/a;->a(I)Landroid/media/AudioFocusRequest$Builder;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    new-instance v4, Landroid/media/AudioAttributes$Builder;

    .line 53
    .line 54
    invoke-direct {v4}, Landroid/media/AudioAttributes$Builder;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v4, v3}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v4, v2}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    .line 61
    .line 62
    .line 63
    invoke-static {v1, p0}, LId/b;->a(Landroid/media/AudioFocusRequest$Builder;Landroid/media/AudioManager$OnAudioFocusChangeListener;)Landroid/media/AudioFocusRequest$Builder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v4}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-static {v1, v2}, Lr2/b;->a(Landroid/media/AudioFocusRequest$Builder;Landroid/media/AudioAttributes;)Landroid/media/AudioFocusRequest$Builder;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-static {v1}, Lr2/e;->a(Landroid/media/AudioFocusRequest$Builder;)Landroid/media/AudioFocusRequest;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    iput-object v1, p0, LId/e;->d:Landroid/media/AudioFocusRequest;

    .line 79
    .line 80
    invoke-direct {p0}, LId/e;->m()Landroid/media/AudioManager;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-static {v2, v1}, Lr2/k;->a(Landroid/media/AudioManager;Landroid/media/AudioFocusRequest;)I

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_3
    invoke-direct {p0}, LId/e;->m()Landroid/media/AudioManager;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    invoke-virtual {v3, p0, v2, v1}, Landroid/media/AudioManager;->requestAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;II)I

    .line 93
    .line 94
    .line 95
    :goto_1
    iput-object v0, p0, LId/e;->e:Lexpo/modules/video/enums/AudioMixingMode;

    .line 96
    .line 97
    return-void

    .line 98
    :cond_4
    :goto_2
    invoke-direct {p0}, LId/e;->c()V

    .line 99
    .line 100
    .line 101
    iput-object v0, p0, LId/e;->e:Lexpo/modules/video/enums/AudioMixingMode;

    .line 102
    .line 103
    return-void
.end method

.method private final r(Ljava/lang/ref/WeakReference;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lexpo/modules/video/player/VideoPlayer;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Lexpo/modules/video/player/VideoPlayer;->w2()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, LId/e;->a:LUb/d;

    .line 16
    .line 17
    invoke-virtual {v0}, LUb/d;->x()LGf/O;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    new-instance v4, LId/e$h;

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    invoke-direct {v4, p1, v0}, LId/e$h;-><init>(Lexpo/modules/video/player/VideoPlayer;LZd/e;)V

    .line 25
    .line 26
    .line 27
    const/4 v5, 0x3

    .line 28
    const/4 v6, 0x0

    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x0

    .line 31
    invoke-static/range {v1 .. v6}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 32
    .line 33
    .line 34
    :cond_0
    return-void
.end method

.method private static final t(Lexpo/modules/video/player/VideoPlayer;Ljava/lang/ref/WeakReference;)Z
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-static {p1, p0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0
.end method

.method private final u()V
    .locals 2

    .line 1
    invoke-direct {p0}, LId/e;->l()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-direct {p0}, LId/e;->k()Lexpo/modules/video/enums/AudioMixingMode;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, LId/e;->e:Lexpo/modules/video/enums/AudioMixingMode;

    .line 12
    .line 13
    if-eq v0, v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-direct {p0}, LId/e;->c()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    :goto_0
    invoke-direct {p0}, LId/e;->q()V

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public onAudioFocusChange(I)V
    .locals 8

    .line 1
    const/4 v0, -0x3

    .line 2
    const/4 v1, 0x0

    .line 3
    if-eq p1, v0, :cond_4

    .line 4
    .line 5
    const/4 v0, -0x2

    .line 6
    if-eq p1, v0, :cond_2

    .line 7
    .line 8
    const/4 v0, -0x1

    .line 9
    if-eq p1, v0, :cond_1

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    if-eq p1, v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object p1, p0, LId/e;->a:LUb/d;

    .line 16
    .line 17
    invoke-virtual {p1}, LUb/d;->x()LGf/O;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    new-instance v5, LId/e$f;

    .line 22
    .line 23
    invoke-direct {v5, p0, v1}, LId/e$f;-><init>(LId/e;LZd/e;)V

    .line 24
    .line 25
    .line 26
    const/4 v6, 0x3

    .line 27
    const/4 v7, 0x0

    .line 28
    const/4 v3, 0x0

    .line 29
    const/4 v4, 0x0

    .line 30
    invoke-static/range {v2 .. v7}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_1
    iget-object p1, p0, LId/e;->a:LUb/d;

    .line 35
    .line 36
    invoke-virtual {p1}, LUb/d;->x()LGf/O;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    new-instance v5, LId/e$c;

    .line 41
    .line 42
    invoke-direct {v5, p0, v1}, LId/e$c;-><init>(LId/e;LZd/e;)V

    .line 43
    .line 44
    .line 45
    const/4 v6, 0x3

    .line 46
    const/4 v7, 0x0

    .line 47
    const/4 v3, 0x0

    .line 48
    const/4 v4, 0x0

    .line 49
    invoke-static/range {v2 .. v7}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_2
    invoke-direct {p0}, LId/e;->k()Lexpo/modules/video/enums/AudioMixingMode;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    sget-object v0, Lexpo/modules/video/enums/AudioMixingMode;->MIX_WITH_OTHERS:Lexpo/modules/video/enums/AudioMixingMode;

    .line 58
    .line 59
    if-ne p1, v0, :cond_3

    .line 60
    .line 61
    :goto_0
    return-void

    .line 62
    :cond_3
    iget-object p1, p0, LId/e;->a:LUb/d;

    .line 63
    .line 64
    invoke-virtual {p1}, LUb/d;->x()LGf/O;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    new-instance v5, LId/e$d;

    .line 69
    .line 70
    invoke-direct {v5, p0, v1}, LId/e$d;-><init>(LId/e;LZd/e;)V

    .line 71
    .line 72
    .line 73
    const/4 v6, 0x3

    .line 74
    const/4 v7, 0x0

    .line 75
    const/4 v3, 0x0

    .line 76
    const/4 v4, 0x0

    .line 77
    invoke-static/range {v2 .. v7}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_4
    invoke-direct {p0}, LId/e;->k()Lexpo/modules/video/enums/AudioMixingMode;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    iget-object v0, p0, LId/e;->a:LUb/d;

    .line 86
    .line 87
    invoke-virtual {v0}, LUb/d;->x()LGf/O;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    new-instance v5, LId/e$e;

    .line 92
    .line 93
    invoke-direct {v5, p0, p1, v1}, LId/e$e;-><init>(LId/e;Lexpo/modules/video/enums/AudioMixingMode;LZd/e;)V

    .line 94
    .line 95
    .line 96
    const/4 v6, 0x3

    .line 97
    const/4 v7, 0x0

    .line 98
    const/4 v3, 0x0

    .line 99
    const/4 v4, 0x0

    .line 100
    invoke-static/range {v2 .. v7}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 101
    .line 102
    .line 103
    return-void
.end method

.method public onAudioMixingModeChanged(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/enums/AudioMixingMode;Lexpo/modules/video/enums/AudioMixingMode;)V
    .locals 1

    .line 1
    const-string v0, "player"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "audioMixingMode"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, LId/e;->q()V

    .line 12
    .line 13
    .line 14
    invoke-static {p0, p1, p2, p3}, LHd/b$a;->a(LHd/b;Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/enums/AudioMixingMode;Lexpo/modules/video/enums/AudioMixingMode;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public onIsPlayingChanged(Lexpo/modules/video/player/VideoPlayer;ZLjava/lang/Boolean;)V
    .locals 0

    .line 1
    const-string p3, "player"

    .line 2
    .line 3
    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-nez p2, :cond_0

    .line 7
    .line 8
    invoke-direct {p0}, LId/e;->l()Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    invoke-direct {p0}, LId/e;->c()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    if-eqz p2, :cond_1

    .line 19
    .line 20
    invoke-direct {p0}, LId/e;->l()Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    invoke-direct {p0}, LId/e;->q()V

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void
.end method

.method public onMutedChanged(Lexpo/modules/video/player/VideoPlayer;ZLjava/lang/Boolean;)V
    .locals 0

    .line 1
    const-string p2, "player"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, LId/e;->u()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public onPlaybackRateChanged(Lexpo/modules/video/player/VideoPlayer;FLjava/lang/Float;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, LHd/b$a;->d(LHd/b;Lexpo/modules/video/player/VideoPlayer;FLjava/lang/Float;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onPlayedToEnd(Lexpo/modules/video/player/VideoPlayer;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, LHd/b$a;->e(LHd/b;Lexpo/modules/video/player/VideoPlayer;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onRenderedFirstFrame(Lexpo/modules/video/player/VideoPlayer;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, LHd/b$a;->f(LHd/b;Lexpo/modules/video/player/VideoPlayer;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onSourceChanged(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/records/VideoSource;Lexpo/modules/video/records/VideoSource;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, LHd/b$a;->g(LHd/b;Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/records/VideoSource;Lexpo/modules/video/records/VideoSource;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onStatusChanged(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/enums/PlayerStatus;Lexpo/modules/video/enums/PlayerStatus;Lexpo/modules/video/records/PlaybackError;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, LHd/b$a;->h(LHd/b;Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/enums/PlayerStatus;Lexpo/modules/video/enums/PlayerStatus;Lexpo/modules/video/records/PlaybackError;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onTargetViewChanged(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/VideoView;Lexpo/modules/video/VideoView;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, LHd/b$a;->i(LHd/b;Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/VideoView;Lexpo/modules/video/VideoView;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onTimeUpdate(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/records/TimeUpdate;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LHd/b$a;->j(LHd/b;Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/records/TimeUpdate;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onTrackSelectionParametersChanged(Lexpo/modules/video/player/VideoPlayer;Lq2/d0;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LHd/b$a;->k(LHd/b;Lexpo/modules/video/player/VideoPlayer;Lq2/d0;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onTracksChanged(Lexpo/modules/video/player/VideoPlayer;Lq2/h0;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LHd/b$a;->l(LHd/b;Lexpo/modules/video/player/VideoPlayer;Lq2/h0;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onVideoSourceLoaded(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/records/VideoSource;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, LHd/b$a;->m(LHd/b;Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/records/VideoSource;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onVideoTrackChanged(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/records/VideoTrack;Lexpo/modules/video/records/VideoTrack;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, LHd/b$a;->n(LHd/b;Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/records/VideoTrack;Lexpo/modules/video/records/VideoTrack;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onVolumeChanged(Lexpo/modules/video/player/VideoPlayer;FLjava/lang/Float;)V
    .locals 0

    .line 1
    const-string p2, "player"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, LId/e;->u()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final p(Lexpo/modules/video/player/VideoPlayer;)V
    .locals 3

    .line 1
    const-string v0, "player"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LId/e;->c:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    move-object v2, v1

    .line 23
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-static {v2, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 v1, 0x0

    .line 37
    :goto_0
    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 38
    .line 39
    if-nez v1, :cond_2

    .line 40
    .line 41
    iget-object v0, p0, LId/e;->c:Ljava/util/List;

    .line 42
    .line 43
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 44
    .line 45
    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    :cond_2
    invoke-virtual {p1, p0}, Lexpo/modules/video/player/VideoPlayer;->a2(LHd/b;)V

    .line 52
    .line 53
    .line 54
    invoke-direct {p0}, LId/e;->u()V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public final s(Lexpo/modules/video/player/VideoPlayer;)V
    .locals 2

    .line 1
    const-string v0, "player"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, p0}, Lexpo/modules/video/player/VideoPlayer;->V2(LHd/b;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, LId/e;->c:Ljava/util/List;

    .line 10
    .line 11
    new-instance v1, LId/c;

    .line 12
    .line 13
    invoke-direct {v1, p1}, LId/c;-><init>(Lexpo/modules/video/player/VideoPlayer;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1}, LUd/u;->K(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, LId/e;->u()V

    .line 20
    .line 21
    .line 22
    return-void
.end method
