.class public final LLa/c;
.super Lcom/facebook/react/views/view/g;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Lcom/facebook/react/uimanager/b0;

.field private b:Z

.field private c:Z

.field private d:Z

.field private e:Z

.field private f:Z

.field private g:Lcom/facebook/react/views/view/g;

.field private h:Z

.field private i:LEa/k;

.field private final j:LEa/l;

.field private final k:LHa/b;


# direct methods
.method public constructor <init>(Lcom/facebook/react/uimanager/b0;)V
    .locals 5

    .line 1
    const-string v0, "reactContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/facebook/react/views/view/g;-><init>(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LLa/c;->a:Lcom/facebook/react/uimanager/b0;

    .line 10
    .line 11
    new-instance v0, LEa/l;

    .line 12
    .line 13
    invoke-static {}, Landroidx/core/view/L0$p;->i()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-static {}, Landroidx/core/view/L0$p;->d()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/4 v3, 0x1

    .line 22
    iget-boolean v4, p0, LLa/c;->c:Z

    .line 23
    .line 24
    invoke-direct {v0, v1, v2, v3, v4}, LEa/l;-><init>(IIIZ)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, LLa/c;->j:LEa/l;

    .line 28
    .line 29
    new-instance v1, LHa/b;

    .line 30
    .line 31
    new-instance v2, LLa/c$a;

    .line 32
    .line 33
    invoke-direct {v2, p0}, LLa/c$a;-><init>(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-direct {v1, p0, p1, v0, v2}, LHa/b;-><init>(Lcom/facebook/react/views/view/g;Lcom/facebook/react/uimanager/b0;LEa/l;Lie/a;)V

    .line 37
    .line 38
    .line 39
    iput-object v1, p0, LLa/c;->k:LHa/b;

    .line 40
    .line 41
    sget-object p1, LLa/e;->a:LLa/e;

    .line 42
    .line 43
    invoke-virtual {p1, p0}, LLa/e;->b(LLa/c;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public static synthetic B(Lcom/facebook/react/views/view/g;)V
    .locals 0

    .line 1
    invoke-static {p0}, LLa/c;->K(Lcom/facebook/react/views/view/g;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic C(LLa/c;Landroid/view/View;Landroidx/core/view/L0;)Landroidx/core/view/L0;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LLa/c;->O(LLa/c;Landroid/view/View;Landroidx/core/view/L0;)Landroidx/core/view/L0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic D(LLa/c;)LEa/k;
    .locals 0

    .line 1
    invoke-direct {p0}, LLa/c;->getKeyboardCallback()LEa/k;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final E()V
    .locals 1

    .line 1
    invoke-direct {p0}, LLa/c;->M()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LLa/c;->k:LHa/b;

    .line 5
    .line 6
    invoke-virtual {v0}, LHa/b;->c()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private final F()V
    .locals 1

    .line 1
    invoke-direct {p0}, LLa/c;->J()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LLa/c;->k:LHa/b;

    .line 5
    .line 6
    invoke-virtual {v0}, LHa/b;->b()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private final G()V
    .locals 0

    .line 1
    invoke-direct {p0}, LLa/c;->N()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, LLa/c;->F()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private final H()V
    .locals 0

    .line 1
    invoke-direct {p0}, LLa/c;->N()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, LLa/c;->E()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private final I()V
    .locals 0

    .line 1
    invoke-direct {p0}, LLa/c;->N()V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, LBa/i;->d(Landroid/view/View;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private final J()V
    .locals 3

    .line 1
    iget-object v0, p0, LLa/c;->i:LEa/k;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, LEa/k;->e()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, LLa/c;->g:Lcom/facebook/react/views/view/g;

    .line 9
    .line 10
    new-instance v1, Landroid/os/Handler;

    .line 11
    .line 12
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 17
    .line 18
    .line 19
    new-instance v2, LLa/b;

    .line 20
    .line 21
    invoke-direct {v2, v0}, LLa/b;-><init>(Lcom/facebook/react/views/view/g;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method private static final K(Lcom/facebook/react/views/view/g;)V
    .locals 0

    .line 1
    invoke-static {p0}, LBa/h;->a(Landroid/view/ViewGroup;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final M()V
    .locals 8

    .line 1
    iget-object v0, p0, LLa/c;->a:Lcom/facebook/react/uimanager/b0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/b0;->getCurrentActivity()Landroid/app/Activity;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    new-instance v0, Lcom/facebook/react/views/view/g;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-direct {v0, v1}, Lcom/facebook/react/views/view/g;-><init>(Landroid/content/Context;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, LLa/c;->g:Lcom/facebook/react/views/view/g;

    .line 19
    .line 20
    iget-object v0, p0, LLa/c;->a:Lcom/facebook/react/uimanager/b0;

    .line 21
    .line 22
    invoke-static {v0}, LBa/f;->a(Lcom/facebook/react/bridge/ReactContext;)Landroid/view/ViewGroup;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    iget-object v1, p0, LLa/c;->g:Lcom/facebook/react/views/view/g;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    iget-object v0, p0, LLa/c;->a:Lcom/facebook/react/uimanager/b0;

    .line 34
    .line 35
    iget-object v1, p0, LLa/c;->j:LEa/l;

    .line 36
    .line 37
    new-instance v2, LEa/k;

    .line 38
    .line 39
    invoke-direct {v2, p0, p0, v0, v1}, LEa/k;-><init>(Lcom/facebook/react/views/view/g;Landroid/view/View;Lcom/facebook/react/uimanager/b0;LEa/l;)V

    .line 40
    .line 41
    .line 42
    iput-object v2, p0, LLa/c;->i:LEa/k;

    .line 43
    .line 44
    iget-object v0, p0, LLa/c;->g:Lcom/facebook/react/views/view/g;

    .line 45
    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    invoke-static {v0, v2}, Landroidx/core/view/a0;->C0(Landroid/view/View;Landroidx/core/view/p0$b;)V

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, LLa/c;->i:LEa/k;

    .line 52
    .line 53
    invoke-static {v0, v1}, Landroidx/core/view/a0;->w0(Landroid/view/View;Landroidx/core/view/I;)V

    .line 54
    .line 55
    .line 56
    invoke-static {v0}, LBa/i;->d(Landroid/view/View;)V

    .line 57
    .line 58
    .line 59
    :cond_1
    return-void

    .line 60
    :cond_2
    sget-object v2, LFa/a;->a:LFa/a;

    .line 61
    .line 62
    invoke-static {}, LLa/d;->a()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    const/4 v6, 0x4

    .line 67
    const/4 v7, 0x0

    .line 68
    const-string v4, "Can not setup keyboard animation listener, since `currentActivity` is null"

    .line 69
    .line 70
    const/4 v5, 0x0

    .line 71
    invoke-static/range {v2 .. v7}, LFa/a;->d(LFa/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method private final N()V
    .locals 2

    .line 1
    iget-object v0, p0, LLa/c;->a:Lcom/facebook/react/uimanager/b0;

    .line 2
    .line 3
    invoke-static {v0}, LBa/f;->b(Lcom/facebook/react/bridge/ReactContext;)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v1, LLa/a;

    .line 10
    .line 11
    invoke-direct {v1, p0}, LLa/a;-><init>(LLa/c;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Landroidx/core/view/a0;->w0(Landroid/view/View;Landroidx/core/view/I;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method private static final O(LLa/c;Landroid/view/View;Landroidx/core/view/L0;)Landroidx/core/view/L0;
    .locals 8

    .line 1
    const-string v0, "v"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "insets"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LLa/c;->a:Lcom/facebook/react/uimanager/b0;

    .line 12
    .line 13
    invoke-static {v0}, LBa/f;->a(Lcom/facebook/react/bridge/ReactContext;)Landroid/view/ViewGroup;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 18
    .line 19
    const/4 v2, -0x1

    .line 20
    invoke-direct {v1, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 21
    .line 22
    .line 23
    iget-boolean v2, p0, LLa/c;->f:Z

    .line 24
    .line 25
    const/4 v3, 0x1

    .line 26
    const/4 v4, 0x0

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    iget-boolean v5, p0, LLa/c;->b:Z

    .line 30
    .line 31
    if-eqz v5, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move v5, v4

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    :goto_0
    move v5, v3

    .line 37
    :goto_1
    if-eqz v2, :cond_3

    .line 38
    .line 39
    iget-boolean v2, p0, LLa/c;->c:Z

    .line 40
    .line 41
    if-eqz v2, :cond_2

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_2
    move v3, v4

    .line 45
    :cond_3
    :goto_2
    invoke-static {}, Landroidx/core/view/L0$p;->g()I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    invoke-virtual {p2, v2}, Landroidx/core/view/L0;->f(I)LA1/b;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    const-string v6, "getInsets(...)"

    .line 54
    .line 55
    invoke-static {v2, v6}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-static {}, Landroidx/core/view/L0$p;->i()I

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    invoke-virtual {p2, v7}, Landroidx/core/view/L0;->f(I)LA1/b;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    invoke-static {v7, v6}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    iget v6, v2, LA1/b;->a:I

    .line 70
    .line 71
    if-eqz v5, :cond_4

    .line 72
    .line 73
    move v5, v4

    .line 74
    goto :goto_3

    .line 75
    :cond_4
    iget v5, v7, LA1/b;->b:I

    .line 76
    .line 77
    :goto_3
    iget v7, v2, LA1/b;->c:I

    .line 78
    .line 79
    if-eqz v3, :cond_5

    .line 80
    .line 81
    goto :goto_4

    .line 82
    :cond_5
    iget v4, v2, LA1/b;->d:I

    .line 83
    .line 84
    :goto_4
    invoke-virtual {v1, v6, v5, v7, v4}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 85
    .line 86
    .line 87
    if-eqz v0, :cond_6

    .line 88
    .line 89
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 90
    .line 91
    .line 92
    :cond_6
    iget-boolean v0, p0, LLa/c;->b:Z

    .line 93
    .line 94
    iget-boolean p0, p0, LLa/c;->f:Z

    .line 95
    .line 96
    invoke-static {p1, p2, v0, p0}, LBa/i;->c(Landroid/view/View;Landroidx/core/view/L0;ZZ)Landroidx/core/view/L0;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    return-object p0
.end method

.method private final getKeyboardCallback()LEa/k;
    .locals 1

    .line 1
    iget-object v0, p0, LLa/c;->i:LEa/k;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public final L()V
    .locals 3

    .line 1
    iget-boolean v0, p0, LLa/c;->f:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    iget-boolean v0, p0, LLa/c;->d:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    goto :goto_1

    .line 13
    :cond_1
    :goto_0
    move v0, v1

    .line 14
    :goto_1
    iget-boolean v2, p0, LLa/c;->e:Z

    .line 15
    .line 16
    if-eq v2, v0, :cond_3

    .line 17
    .line 18
    iput-boolean v0, p0, LLa/c;->e:Z

    .line 19
    .line 20
    iget-object v0, p0, LLa/c;->a:Lcom/facebook/react/uimanager/b0;

    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/b0;->getCurrentActivity()Landroid/app/Activity;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iget-boolean v2, p0, LLa/c;->e:Z

    .line 33
    .line 34
    xor-int/2addr v1, v2

    .line 35
    invoke-static {v0, v1}, Landroidx/core/view/o0;->b(Landroid/view/Window;Z)V

    .line 36
    .line 37
    .line 38
    :cond_2
    iget-object v0, p0, LLa/c;->a:Lcom/facebook/react/uimanager/b0;

    .line 39
    .line 40
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/b0;->getCurrentActivity()Landroid/app/Activity;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-eqz v0, :cond_3

    .line 45
    .line 46
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    if-eqz v0, :cond_3

    .line 51
    .line 52
    const/16 v1, 0x400

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Landroid/view/Window;->clearFlags(I)V

    .line 55
    .line 56
    .line 57
    :cond_3
    return-void
.end method

.method public final getActive()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LLa/c;->f:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getCallback$react_native_keyboard_controller_release()LEa/k;
    .locals 1

    .line 1
    iget-object v0, p0, LLa/c;->i:LEa/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getReactContext()Lcom/facebook/react/uimanager/b0;
    .locals 1

    .line 1
    iget-object v0, p0, LLa/c;->a:Lcom/facebook/react/uimanager/b0;

    .line 2
    .line 3
    return-object v0
.end method

.method protected onAttachedToWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/facebook/react/views/view/g;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, LLa/c;->h:Z

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, LLa/c;->h:Z

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-direct {p0}, LLa/c;->E()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method protected onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LLa/c;->I()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, LLa/c;->F()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final setActive(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LLa/c;->f:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, LLa/c;->H()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-direct {p0}, LLa/c;->G()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final setCallback$react_native_keyboard_controller_release(LEa/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, LLa/c;->i:LEa/k;

    .line 2
    .line 3
    return-void
.end method

.method public final setNavigationBarTranslucent(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, LLa/c;->c:Z

    .line 2
    .line 3
    iget-object v0, p0, LLa/c;->j:LEa/l;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, LEa/l;->e(Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final setPreserveEdgeToEdge(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LLa/c;->d:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setStatusBarTranslucent(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LLa/c;->b:Z

    .line 2
    .line 3
    return-void
.end method
