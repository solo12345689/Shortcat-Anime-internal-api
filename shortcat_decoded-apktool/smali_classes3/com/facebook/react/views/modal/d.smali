.class public final Lcom/facebook/react/views/modal/d;
.super Landroid/view/ViewGroup;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/facebook/react/bridge/LifecycleEventListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/modal/d$a;,
        Lcom/facebook/react/views/modal/d$b;,
        Lcom/facebook/react/views/modal/d$c;
    }
.end annotation


# static fields
.field private static final k:Lcom/facebook/react/views/modal/d$a;


# instance fields
.field private a:Landroidx/activity/r;

.field private b:Z

.field private c:Landroid/content/DialogInterface$OnShowListener;

.field private d:Lcom/facebook/react/views/modal/d$c;

.field private e:Z

.field private f:Z

.field private g:Ljava/lang/String;

.field private h:Z

.field private final i:Lcom/facebook/react/views/modal/d$b;

.field private j:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/views/modal/d$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/views/modal/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/views/modal/d;->k:Lcom/facebook/react/views/modal/d$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/uimanager/b0;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    new-instance v0, Lcom/facebook/react/views/modal/d$b;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Lcom/facebook/react/views/modal/d$b;-><init>(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/facebook/react/views/modal/d;->i:Lcom/facebook/react/views/modal/d$b;

    .line 15
    .line 16
    return-void
.end method

.method public static synthetic a(Lcom/facebook/react/views/modal/d;Landroidx/activity/r;)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/facebook/react/views/modal/d;->f(Lcom/facebook/react/views/modal/d;Landroidx/activity/r;)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final b()V
    .locals 3

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/facebook/react/views/modal/d;->a:Landroidx/activity/r;

    .line 5
    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const-class v2, Landroid/app/Activity;

    .line 19
    .line 20
    invoke-static {v1, v2}, LL7/a;->a(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Landroid/app/Activity;

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_1

    .line 33
    .line 34
    :cond_0
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 35
    .line 36
    .line 37
    :cond_1
    const/4 v0, 0x0

    .line 38
    iput-object v0, p0, Lcom/facebook/react/views/modal/d;->a:Landroidx/activity/r;

    .line 39
    .line 40
    const/4 v1, 0x1

    .line 41
    iput-boolean v1, p0, Lcom/facebook/react/views/modal/d;->j:Z

    .line 42
    .line 43
    iget-object v1, p0, Lcom/facebook/react/views/modal/d;->i:Lcom/facebook/react/views/modal/d$b;

    .line 44
    .line 45
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    instance-of v2, v1, Landroid/view/ViewGroup;

    .line 50
    .line 51
    if-eqz v2, :cond_2

    .line 52
    .line 53
    move-object v0, v1

    .line 54
    check-cast v0, Landroid/view/ViewGroup;

    .line 55
    .line 56
    :cond_2
    if-eqz v0, :cond_3

    .line 57
    .line 58
    const/4 v1, 0x0

    .line 59
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 60
    .line 61
    .line 62
    :cond_3
    return-void
.end method

.method private final c(Landroid/app/Activity;)Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget p1, p1, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 14
    .line 15
    and-int/lit16 p1, p1, 0x2000

    .line 16
    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    return p1

    .line 21
    :cond_1
    return v0
.end method

.method private static final f(Lcom/facebook/react/views/modal/d;Landroidx/activity/r;)LTd/L;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/views/modal/d;->d:Lcom/facebook/react/views/modal/d$c;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0, p1}, Lcom/facebook/react/views/modal/d$c;->a(Landroid/content/DialogInterface;)V

    .line 6
    .line 7
    .line 8
    sget-object p0, LTd/L;->a:LTd/L;

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 12
    .line 13
    const-string p1, "onRequestClose callback must be set if back key is expected to close the modal"

    .line 14
    .line 15
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw p0
.end method

.method private final g(Landroidx/core/view/L0;Landroidx/core/view/l1;Ljava/util/List;)V
    .locals 2

    .line 1
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    :cond_0
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ljava/lang/Number;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-virtual {p1, v0}, Landroidx/core/view/L0;->r(I)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    if-eqz p2, :cond_0

    .line 28
    .line 29
    invoke-virtual {p2, v0}, Landroidx/core/view/l1;->g(I)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    if-eqz p2, :cond_0

    .line 34
    .line 35
    invoke-virtual {p2, v0}, Landroidx/core/view/l1;->b(I)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    return-void
.end method

.method private final getContentView()Landroid/view/View;
    .locals 2

    .line 1
    new-instance v0, Landroid/widget/FrameLayout;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lcom/facebook/react/views/modal/d;->i:Lcom/facebook/react/views/modal/d$b;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/facebook/react/views/modal/d;->getStatusBarTranslucent()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-virtual {v0, v1}, Landroid/view/View;->setFitsSystemWindows(Z)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-object v0
.end method

.method private final getCurrentActivity()Landroid/app/Activity;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    check-cast v0, Lcom/facebook/react/uimanager/b0;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/b0;->getCurrentActivity()Landroid/app/Activity;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
.end method

.method static synthetic h(Lcom/facebook/react/views/modal/d;Landroidx/core/view/L0;Landroidx/core/view/l1;Ljava/util/List;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x4

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    invoke-static {}, Landroidx/core/view/L0$p;->h()I

    .line 6
    .line 7
    .line 8
    move-result p3

    .line 9
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    invoke-static {}, Landroidx/core/view/L0$p;->g()I

    .line 14
    .line 15
    .line 16
    move-result p4

    .line 17
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object p4

    .line 21
    filled-new-array {p3, p4}, [Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object p3

    .line 25
    invoke-static {p3}, LUd/u;->p([Ljava/lang/Object;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object p3

    .line 29
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/react/views/modal/d;->g(Landroidx/core/view/L0;Landroidx/core/view/l1;Ljava/util/List;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method private final i()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/modal/d;->a:Landroidx/activity/r;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_6

    .line 10
    .line 11
    invoke-direct {p0}, Lcom/facebook/react/views/modal/d;->getCurrentActivity()Landroid/app/Activity;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz v1, :cond_5

    .line 16
    .line 17
    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-nez v2, :cond_5

    .line 22
    .line 23
    invoke-virtual {v1}, Landroid/app/Activity;->isDestroyed()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    goto :goto_3

    .line 30
    :cond_0
    :try_start_0
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    invoke-virtual {v1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iget v1, v1, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 41
    .line 42
    const/16 v2, 0x400

    .line 43
    .line 44
    and-int/2addr v1, v2

    .line 45
    if-eqz v1, :cond_1

    .line 46
    .line 47
    invoke-virtual {v0, v2}, Landroid/view/Window;->addFlags(I)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catch_0
    move-exception v0

    .line 52
    goto :goto_2

    .line 53
    :cond_1
    invoke-virtual {v0, v2}, Landroid/view/Window;->clearFlags(I)V

    .line 54
    .line 55
    .line 56
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lcom/facebook/react/views/modal/d;->getNavigationBarTranslucent()Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_3

    .line 61
    .line 62
    invoke-static {v0}, Lcom/facebook/react/views/view/WindowUtilKt;->enableEdgeToEdge(Landroid/view/Window;)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_3
    invoke-static {v0}, Lcom/facebook/react/views/view/WindowUtilKt;->disableEdgeToEdge(Landroid/view/Window;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Lcom/facebook/react/views/modal/d;->getStatusBarTranslucent()Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    invoke-static {v0, v1}, Lcom/facebook/react/views/view/WindowUtilKt;->setStatusBarTranslucency(Landroid/view/Window;Z)V

    .line 74
    .line 75
    .line 76
    :goto_1
    iget-boolean v1, p0, Lcom/facebook/react/views/modal/d;->b:Z

    .line 77
    .line 78
    const/4 v2, 0x2

    .line 79
    if-eqz v1, :cond_4

    .line 80
    .line 81
    invoke-virtual {v0, v2}, Landroid/view/Window;->clearFlags(I)V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :cond_4
    const/high16 v1, 0x3f000000    # 0.5f

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Landroid/view/Window;->setDimAmount(F)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v2, v2}, Landroid/view/Window;->setFlags(II)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :goto_2
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    const-string v1, "ReactModalHost"

    .line 103
    .line 104
    const-string v2, "ReactModalHostView: error while setting window flags: "

    .line 105
    .line 106
    invoke-static {v1, v2, v0}, Lz5/a;->o(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    :cond_5
    :goto_3
    return-void

    .line 110
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 111
    .line 112
    const-string v1, "dialog must have window when we call updateProperties"

    .line 113
    .line 114
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    throw v0

    .line 118
    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 119
    .line 120
    const-string v1, "dialog must exist when we call updateProperties"

    .line 121
    .line 122
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    throw v0
.end method

.method private final j()V
    .locals 10

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/views/modal/d;->getCurrentActivity()Landroid/app/Activity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v1, p0, Lcom/facebook/react/views/modal/d;->a:Landroidx/activity/r;

    .line 9
    .line 10
    if-eqz v1, :cond_5

    .line 11
    .line 12
    invoke-virtual {v1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-eqz v1, :cond_4

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 23
    .line 24
    const/16 v3, 0x1e

    .line 25
    .line 26
    if-le v2, v3, :cond_3

    .line 27
    .line 28
    new-instance v2, Landroidx/core/view/l1;

    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-direct {v2, v0, v3}, Landroidx/core/view/l1;-><init>(Landroid/view/Window;Landroid/view/View;)V

    .line 35
    .line 36
    .line 37
    new-instance v6, Landroidx/core/view/l1;

    .line 38
    .line 39
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-direct {v6, v1, v3}, Landroidx/core/view/l1;-><init>(Landroid/view/Window;Landroid/view/View;)V

    .line 44
    .line 45
    .line 46
    invoke-static {}, Lcom/facebook/react/views/view/WindowUtilKt;->isEdgeToEdgeFeatureFlagOn()Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_1

    .line 51
    .line 52
    const/4 v1, 0x2

    .line 53
    invoke-virtual {v2, v1}, Landroidx/core/view/l1;->f(I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v6, v1}, Landroidx/core/view/l1;->f(I)V

    .line 57
    .line 58
    .line 59
    :cond_1
    invoke-virtual {v2}, Landroidx/core/view/l1;->c()Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    invoke-virtual {v6, v1}, Landroidx/core/view/l1;->e(Z)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {v0}, Landroid/view/View;->getRootWindowInsets()Landroid/view/WindowInsets;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    if-eqz v0, :cond_2

    .line 75
    .line 76
    invoke-static {v0}, Landroidx/core/view/L0;->z(Landroid/view/WindowInsets;)Landroidx/core/view/L0;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    const-string v0, "toWindowInsetsCompat(...)"

    .line 81
    .line 82
    invoke-static {v5, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    const/4 v8, 0x4

    .line 86
    const/4 v9, 0x0

    .line 87
    const/4 v7, 0x0

    .line 88
    move-object v4, p0

    .line 89
    invoke-static/range {v4 .. v9}, Lcom/facebook/react/views/modal/d;->h(Lcom/facebook/react/views/modal/d;Landroidx/core/view/L0;Landroidx/core/view/l1;Ljava/util/List;ILjava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    :cond_2
    :goto_0
    return-void

    .line 93
    :cond_3
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-virtual {v0}, Landroid/view/View;->getSystemUiVisibility()I

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    invoke-virtual {v1, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 110
    .line 111
    const-string v1, "dialog must have window when we call updateProperties"

    .line 112
    .line 113
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    throw v0

    .line 117
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 118
    .line 119
    const-string v1, "dialog must exist when we call updateProperties"

    .line 120
    .line 121
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    throw v0
.end method


# virtual methods
.method public addChildrenForAccessibility(Ljava/util/ArrayList;)V
    .locals 1

    .line 1
    const-string v0, "outChildren"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public addView(Landroid/view/View;I)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/facebook/react/views/modal/d;->i:Lcom/facebook/react/views/modal/d$b;

    .line 5
    .line 6
    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final d()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    check-cast v0, Lcom/facebook/react/uimanager/b0;

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Lcom/facebook/react/uimanager/b0;->removeLifecycleEventListener(Lcom/facebook/react/bridge/LifecycleEventListener;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Lcom/facebook/react/views/modal/d;->b()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    return p1
.end method

.method public dispatchProvideStructure(Landroid/view/ViewStructure;)V
    .locals 1

    .line 1
    const-string v0, "structure"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/views/modal/d;->i:Lcom/facebook/react/views/modal/d$b;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/facebook/react/views/view/g;->dispatchProvideStructure(Landroid/view/ViewStructure;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final e()V
    .locals 7

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/facebook/react/views/modal/d;->j:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-direct {p0}, Lcom/facebook/react/views/modal/d;->b()V

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/modal/d;->a:Landroidx/activity/r;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-direct {p0}, Lcom/facebook/react/views/modal/d;->i()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 21
    iput-boolean v0, p0, Lcom/facebook/react/views/modal/d;->j:Z

    .line 22
    .line 23
    iget-object v0, p0, Lcom/facebook/react/views/modal/d;->g:Ljava/lang/String;

    .line 24
    .line 25
    const-string v1, "fade"

    .line 26
    .line 27
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    sget v0, Lcom/facebook/react/p;->e:I

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_2
    const-string v1, "slide"

    .line 37
    .line 38
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_3

    .line 43
    .line 44
    sget v0, Lcom/facebook/react/p;->f:I

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_3
    sget v0, Lcom/facebook/react/p;->d:I

    .line 48
    .line 49
    :goto_1
    invoke-direct {p0}, Lcom/facebook/react/views/modal/d;->getCurrentActivity()Landroid/app/Activity;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    new-instance v2, Landroidx/activity/r;

    .line 54
    .line 55
    if-eqz v1, :cond_4

    .line 56
    .line 57
    move-object v3, v1

    .line 58
    goto :goto_2

    .line 59
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    :goto_2
    invoke-static {v3}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    invoke-direct {v2, v3, v0}, Landroidx/activity/r;-><init>(Landroid/content/Context;I)V

    .line 67
    .line 68
    .line 69
    iput-object v2, p0, Lcom/facebook/react/views/modal/d;->a:Landroidx/activity/r;

    .line 70
    .line 71
    invoke-virtual {v2}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    if-eqz v0, :cond_8

    .line 76
    .line 77
    const/16 v3, 0x8

    .line 78
    .line 79
    invoke-virtual {v0, v3, v3}, Landroid/view/Window;->setFlags(II)V

    .line 80
    .line 81
    .line 82
    invoke-direct {p0}, Lcom/facebook/react/views/modal/d;->getContentView()Landroid/view/View;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    invoke-virtual {v2, v4}, Landroidx/activity/r;->setContentView(Landroid/view/View;)V

    .line 87
    .line 88
    .line 89
    invoke-direct {p0}, Lcom/facebook/react/views/modal/d;->i()V

    .line 90
    .line 91
    .line 92
    iget-object v4, p0, Lcom/facebook/react/views/modal/d;->c:Landroid/content/DialogInterface$OnShowListener;

    .line 93
    .line 94
    invoke-virtual {v2, v4}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 95
    .line 96
    .line 97
    new-instance v4, Lcom/facebook/react/views/modal/c;

    .line 98
    .line 99
    invoke-direct {v4, p0, v2}, Lcom/facebook/react/views/modal/c;-><init>(Lcom/facebook/react/views/modal/d;Landroidx/activity/r;)V

    .line 100
    .line 101
    .line 102
    new-instance v5, Lcom/facebook/react/views/modal/d$e;

    .line 103
    .line 104
    invoke-direct {v5, v4}, Lcom/facebook/react/views/modal/d$e;-><init>(Lie/a;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2}, Landroidx/activity/r;->getOnBackPressedDispatcher()Landroidx/activity/H;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    invoke-virtual {v6, v2, v5}, Landroidx/activity/H;->i(Landroidx/lifecycle/r;Landroidx/activity/G;)V

    .line 112
    .line 113
    .line 114
    new-instance v5, Lcom/facebook/react/views/modal/d$d;

    .line 115
    .line 116
    invoke-direct {v5, v4, p0}, Lcom/facebook/react/views/modal/d$d;-><init>(Lie/a;Lcom/facebook/react/views/modal/d;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2, v5}, Landroid/app/Dialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 120
    .line 121
    .line 122
    const/16 v4, 0x10

    .line 123
    .line 124
    invoke-virtual {v0, v4}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 125
    .line 126
    .line 127
    iget-boolean v4, p0, Lcom/facebook/react/views/modal/d;->h:Z

    .line 128
    .line 129
    if-eqz v4, :cond_5

    .line 130
    .line 131
    const/high16 v4, 0x1000000

    .line 132
    .line 133
    invoke-virtual {v0, v4}, Landroid/view/Window;->addFlags(I)V

    .line 134
    .line 135
    .line 136
    :cond_5
    invoke-direct {p0, v1}, Lcom/facebook/react/views/modal/d;->c(Landroid/app/Activity;)Z

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    if-eqz v4, :cond_6

    .line 141
    .line 142
    const/16 v4, 0x2000

    .line 143
    .line 144
    invoke-virtual {v0, v4, v4}, Landroid/view/Window;->setFlags(II)V

    .line 145
    .line 146
    .line 147
    :cond_6
    if-eqz v1, :cond_7

    .line 148
    .line 149
    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    if-nez v1, :cond_7

    .line 154
    .line 155
    invoke-virtual {v2}, Landroid/app/Dialog;->show()V

    .line 156
    .line 157
    .line 158
    invoke-direct {p0}, Lcom/facebook/react/views/modal/d;->j()V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0, v3}, Landroid/view/Window;->clearFlags(I)V

    .line 162
    .line 163
    .line 164
    :cond_7
    return-void

    .line 165
    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 166
    .line 167
    const-string v1, "Required value was null."

    .line 168
    .line 169
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    throw v0
.end method

.method public final getAnimationType()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/modal/d;->g:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getChildAt(I)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/modal/d;->i:Lcom/facebook/react/views/modal/d$b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public getChildCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/modal/d;->i:Lcom/facebook/react/views/modal/d$b;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final getDialog()Landroidx/activity/r;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/modal/d;->a:Landroidx/activity/r;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getEventDispatcher()Lcom/facebook/react/uimanager/events/EventDispatcher;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/modal/d;->i:Lcom/facebook/react/views/modal/d$b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/views/modal/d$b;->getEventDispatcher$ReactAndroid_release()Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final getHardwareAccelerated()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/views/modal/d;->h:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getNavigationBarTranslucent()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/views/modal/d;->f:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-static {}, Lcom/facebook/react/views/view/WindowUtilKt;->isEdgeToEdgeFeatureFlagOn()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return v0

    .line 14
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 15
    return v0
.end method

.method public final getOnRequestCloseListener()Lcom/facebook/react/views/modal/d$c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/modal/d;->d:Lcom/facebook/react/views/modal/d$c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getOnShowListener()Landroid/content/DialogInterface$OnShowListener;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/modal/d;->c:Landroid/content/DialogInterface$OnShowListener;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getStateWrapper()Lcom/facebook/react/uimanager/a0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/modal/d;->i:Lcom/facebook/react/views/modal/d$b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/views/modal/d$b;->getStateWrapper$ReactAndroid_release()Lcom/facebook/react/uimanager/a0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final getStatusBarTranslucent()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/views/modal/d;->e:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-static {}, Lcom/facebook/react/views/view/WindowUtilKt;->isEdgeToEdgeFeatureFlagOn()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return v0

    .line 14
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 15
    return v0
.end method

.method public final getTransparent()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/views/modal/d;->b:Z

    .line 2
    .line 3
    return v0
.end method

.method protected onAttachedToWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext"

    .line 9
    .line 10
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    check-cast v0, Lcom/facebook/react/uimanager/b0;

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Lcom/facebook/react/uimanager/b0;->addLifecycleEventListener(Lcom/facebook/react/bridge/LifecycleEventListener;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/facebook/react/views/modal/d;->d()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onHostDestroy()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/views/modal/d;->d()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onHostPause()V
    .locals 0

    .line 1
    return-void
.end method

.method public onHostResume()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/views/modal/d;->e()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    .line 1
    return-void
.end method

.method public removeView(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/views/modal/d;->i:Lcom/facebook/react/views/modal/d$b;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public removeViewAt(I)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lcom/facebook/react/views/modal/d;->getChildAt(I)Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iget-object v0, p0, Lcom/facebook/react/views/modal/d;->i:Lcom/facebook/react/views/modal/d$b;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final setAnimationType(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/modal/d;->g:Ljava/lang/String;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lcom/facebook/react/views/modal/d;->j:Z

    .line 5
    .line 6
    return-void
.end method

.method public final setDialogRootViewGroupTestId(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/modal/d;->i:Lcom/facebook/react/views/modal/d$b;

    .line 2
    .line 3
    sget v1, Lcom/facebook/react/l;->v:I

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final setEventDispatcher(Lcom/facebook/react/uimanager/events/EventDispatcher;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/modal/d;->i:Lcom/facebook/react/views/modal/d$b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/facebook/react/views/modal/d$b;->setEventDispatcher$ReactAndroid_release(Lcom/facebook/react/uimanager/events/EventDispatcher;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setHardwareAccelerated(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/facebook/react/views/modal/d;->h:Z

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lcom/facebook/react/views/modal/d;->j:Z

    .line 5
    .line 6
    return-void
.end method

.method public setId(I)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setId(I)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/facebook/react/views/modal/d;->i:Lcom/facebook/react/views/modal/d$b;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroid/view/View;->setId(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final setNavigationBarTranslucent(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/facebook/react/views/modal/d;->f:Z

    .line 2
    .line 3
    iget-boolean p1, p0, Lcom/facebook/react/views/modal/d;->j:Z

    .line 4
    .line 5
    if-nez p1, :cond_1

    .line 6
    .line 7
    invoke-static {}, Lcom/facebook/react/views/view/WindowUtilKt;->isEdgeToEdgeFeatureFlagOn()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 17
    :goto_1
    iput-boolean p1, p0, Lcom/facebook/react/views/modal/d;->j:Z

    .line 18
    .line 19
    return-void
.end method

.method public final setOnRequestCloseListener(Lcom/facebook/react/views/modal/d$c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/modal/d;->d:Lcom/facebook/react/views/modal/d$c;

    .line 2
    .line 3
    return-void
.end method

.method public final setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/modal/d;->c:Landroid/content/DialogInterface$OnShowListener;

    .line 2
    .line 3
    return-void
.end method

.method public final setStateWrapper(Lcom/facebook/react/uimanager/a0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/modal/d;->i:Lcom/facebook/react/views/modal/d$b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/facebook/react/views/modal/d$b;->setStateWrapper$ReactAndroid_release(Lcom/facebook/react/uimanager/a0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setStatusBarTranslucent(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/facebook/react/views/modal/d;->e:Z

    .line 2
    .line 3
    iget-boolean p1, p0, Lcom/facebook/react/views/modal/d;->j:Z

    .line 4
    .line 5
    if-nez p1, :cond_1

    .line 6
    .line 7
    invoke-static {}, Lcom/facebook/react/views/view/WindowUtilKt;->isEdgeToEdgeFeatureFlagOn()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 17
    :goto_1
    iput-boolean p1, p0, Lcom/facebook/react/views/modal/d;->j:Z

    .line 18
    .line 19
    return-void
.end method

.method public final setTransparent(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/facebook/react/views/modal/d;->b:Z

    .line 2
    .line 3
    return-void
.end method
