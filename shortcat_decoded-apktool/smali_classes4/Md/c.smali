.class public final LMd/c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lexpo/modules/video/records/FullscreenOptions;

.field private final c:Lie/a;

.field private final d:Lie/a;

.field private e:Z

.field private final f:Z

.field private final g:Z

.field private final h:Lkotlin/Lazy;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lexpo/modules/video/records/FullscreenOptions;Lie/a;Lie/a;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "options"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "onShouldAutoExit"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "onShouldReleaseOrientation"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, LMd/c;->a:Landroid/content/Context;

    .line 25
    .line 26
    iput-object p2, p0, LMd/c;->b:Lexpo/modules/video/records/FullscreenOptions;

    .line 27
    .line 28
    iput-object p3, p0, LMd/c;->c:Lie/a;

    .line 29
    .line 30
    iput-object p4, p0, LMd/c;->d:Lie/a;

    .line 31
    .line 32
    invoke-virtual {p2}, Lexpo/modules/video/records/FullscreenOptions;->getOrientation()Lexpo/modules/video/enums/FullscreenOrientation;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    sget-object p3, Lexpo/modules/video/enums/FullscreenOrientation;->LANDSCAPE:Lexpo/modules/video/enums/FullscreenOrientation;

    .line 37
    .line 38
    const/4 p4, 0x1

    .line 39
    const/4 v0, 0x0

    .line 40
    if-eq p1, p3, :cond_1

    .line 41
    .line 42
    invoke-virtual {p2}, Lexpo/modules/video/records/FullscreenOptions;->getOrientation()Lexpo/modules/video/enums/FullscreenOrientation;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    sget-object p3, Lexpo/modules/video/enums/FullscreenOrientation;->LANDSCAPE_LEFT:Lexpo/modules/video/enums/FullscreenOrientation;

    .line 47
    .line 48
    if-eq p1, p3, :cond_1

    .line 49
    .line 50
    invoke-virtual {p2}, Lexpo/modules/video/records/FullscreenOptions;->getOrientation()Lexpo/modules/video/enums/FullscreenOrientation;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    sget-object p3, Lexpo/modules/video/enums/FullscreenOrientation;->LANDSCAPE_RIGHT:Lexpo/modules/video/enums/FullscreenOrientation;

    .line 55
    .line 56
    if-ne p1, p3, :cond_0

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    move p1, v0

    .line 60
    goto :goto_1

    .line 61
    :cond_1
    :goto_0
    move p1, p4

    .line 62
    :goto_1
    iput-boolean p1, p0, LMd/c;->f:Z

    .line 63
    .line 64
    invoke-virtual {p2}, Lexpo/modules/video/records/FullscreenOptions;->getOrientation()Lexpo/modules/video/enums/FullscreenOrientation;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    sget-object p3, Lexpo/modules/video/enums/FullscreenOrientation;->PORTRAIT:Lexpo/modules/video/enums/FullscreenOrientation;

    .line 69
    .line 70
    if-eq p1, p3, :cond_3

    .line 71
    .line 72
    invoke-virtual {p2}, Lexpo/modules/video/records/FullscreenOptions;->getOrientation()Lexpo/modules/video/enums/FullscreenOrientation;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    sget-object p3, Lexpo/modules/video/enums/FullscreenOrientation;->PORTRAIT_UP:Lexpo/modules/video/enums/FullscreenOrientation;

    .line 77
    .line 78
    if-eq p1, p3, :cond_3

    .line 79
    .line 80
    invoke-virtual {p2}, Lexpo/modules/video/records/FullscreenOptions;->getOrientation()Lexpo/modules/video/enums/FullscreenOrientation;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    sget-object p2, Lexpo/modules/video/enums/FullscreenOrientation;->PORTRAIT_DOWN:Lexpo/modules/video/enums/FullscreenOrientation;

    .line 85
    .line 86
    if-ne p1, p2, :cond_2

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_2
    move p4, v0

    .line 90
    :cond_3
    :goto_2
    iput-boolean p4, p0, LMd/c;->g:Z

    .line 91
    .line 92
    new-instance p1, LMd/b;

    .line 93
    .line 94
    invoke-direct {p1, p0}, LMd/b;-><init>(LMd/c;)V

    .line 95
    .line 96
    .line 97
    invoke-static {p1}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    iput-object p1, p0, LMd/c;->h:Lkotlin/Lazy;

    .line 102
    .line 103
    return-void
.end method

.method public static synthetic a(LMd/c;)LMd/c$a;
    .locals 0

    .line 1
    invoke-static {p0}, LMd/c;->k(LMd/c;)LMd/c$a;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic b(LMd/c;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, LMd/c;->e:Z

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic c(LMd/c;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, LMd/c;->f:Z

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic d(LMd/c;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, LMd/c;->g:Z

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic e(LMd/c;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LMd/c;->e:Z

    .line 2
    .line 3
    return-void
.end method

.method private final h()LMd/c$a;
    .locals 1

    .line 1
    iget-object v0, p0, LMd/c;->h:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LMd/c$a;

    .line 8
    .line 9
    return-object v0
.end method

.method private static final k(LMd/c;)LMd/c$a;
    .locals 2

    .line 1
    iget-object v0, p0, LMd/c;->a:Landroid/content/Context;

    .line 2
    .line 3
    new-instance v1, LMd/c$a;

    .line 4
    .line 5
    invoke-direct {v1, p0, v0}, LMd/c$a;-><init>(LMd/c;Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    return-object v1
.end method


# virtual methods
.method public final f()Lie/a;
    .locals 1

    .line 1
    iget-object v0, p0, LMd/c;->d:Lie/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()Lexpo/modules/video/records/FullscreenOptions;
    .locals 1

    .line 1
    iget-object v0, p0, LMd/c;->b:Lexpo/modules/video/records/FullscreenOptions;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i()Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, LMd/c;->a:Landroid/content/Context;

    .line 3
    .line 4
    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    const-string v2, "accelerometer_rotation"

    .line 9
    .line 10
    invoke-static {v1, v2, v0}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    .line 11
    .line 12
    .line 13
    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    const/4 v2, 0x1

    .line 15
    if-ne v1, v2, :cond_0

    .line 16
    .line 17
    return v2

    .line 18
    :catch_0
    :cond_0
    return v0
.end method

.method public final j(Landroid/content/res/Configuration;)V
    .locals 1

    .line 1
    const-string v0, "newConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget p1, p1, Landroid/content/res/Configuration;->orientation:I

    .line 7
    .line 8
    iget-object v0, p0, LMd/c;->b:Lexpo/modules/video/records/FullscreenOptions;

    .line 9
    .line 10
    invoke-virtual {v0}, Lexpo/modules/video/records/FullscreenOptions;->getAutoExitOnRotate()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-boolean v0, p0, LMd/c;->g:Z

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    const/4 v0, 0x2

    .line 22
    if-ne p1, v0, :cond_1

    .line 23
    .line 24
    iget-object p1, p0, LMd/c;->c:Lie/a;

    .line 25
    .line 26
    invoke-interface {p1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    iget-boolean v0, p0, LMd/c;->f:Z

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    const/4 v0, 0x1

    .line 35
    if-ne p1, v0, :cond_2

    .line 36
    .line 37
    iget-object p1, p0, LMd/c;->c:Lie/a;

    .line 38
    .line 39
    invoke-interface {p1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    :cond_2
    :goto_0
    return-void
.end method

.method public final l()V
    .locals 1

    .line 1
    invoke-direct {p0}, LMd/c;->h()LMd/c$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/view/OrientationEventListener;->canDetectOrientation()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-direct {p0}, LMd/c;->h()LMd/c$a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Landroid/view/OrientationEventListener;->enable()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final m()V
    .locals 1

    .line 1
    invoke-direct {p0}, LMd/c;->h()LMd/c$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/view/OrientationEventListener;->disable()V

    .line 6
    .line 7
    .line 8
    return-void
.end method
