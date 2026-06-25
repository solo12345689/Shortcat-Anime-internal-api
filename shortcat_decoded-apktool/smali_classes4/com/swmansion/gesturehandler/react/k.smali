.class public final Lcom/swmansion/gesturehandler/react/k;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/swmansion/gesturehandler/react/k$a;,
        Lcom/swmansion/gesturehandler/react/k$b;
    }
.end annotation


# static fields
.field public static final g:Lcom/swmansion/gesturehandler/react/k$a;


# instance fields
.field private final a:Lcom/facebook/react/bridge/ReactContext;

.field private final b:LQa/i;

.field private final c:LQa/d;

.field private final d:Landroid/view/ViewGroup;

.field private e:Z

.field private f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/swmansion/gesturehandler/react/k$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/swmansion/gesturehandler/react/k$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/swmansion/gesturehandler/react/k;->g:Lcom/swmansion/gesturehandler/react/k$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;Landroid/view/ViewGroup;)V
    .locals 5

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "wrappedView"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/swmansion/gesturehandler/react/k;->a:Lcom/facebook/react/bridge/ReactContext;

    .line 15
    .line 16
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2}, Landroid/view/View;->getId()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const-class v1, Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule;

    .line 24
    .line 25
    invoke-virtual {p1, v1}, Lcom/facebook/react/bridge/ReactContext;->getNativeModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {p1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    check-cast p1, Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule;

    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule;->getRegistry()Lcom/swmansion/gesturehandler/react/i;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    sget-object v2, Lcom/swmansion/gesturehandler/react/k;->g:Lcom/swmansion/gesturehandler/react/k$a;

    .line 39
    .line 40
    invoke-static {v2, p2}, Lcom/swmansion/gesturehandler/react/k$a;->a(Lcom/swmansion/gesturehandler/react/k$a;Landroid/view/ViewGroup;)Landroid/view/ViewGroup;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    iput-object v2, p0, Lcom/swmansion/gesturehandler/react/k;->d:Landroid/view/ViewGroup;

    .line 45
    .line 46
    new-instance v3, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    .line 50
    .line 51
    const-string v4, "[GESTURE HANDLER] Initialize gesture handler for root view "

    .line 52
    .line 53
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    const-string v4, "ReactNative"

    .line 64
    .line 65
    invoke-static {v4, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    new-instance v3, LQa/i;

    .line 69
    .line 70
    new-instance v4, Lcom/swmansion/gesturehandler/react/o;

    .line 71
    .line 72
    invoke-direct {v4}, Lcom/swmansion/gesturehandler/react/o;-><init>()V

    .line 73
    .line 74
    .line 75
    invoke-direct {v3, p2, v1, v4, v2}, LQa/i;-><init>(Landroid/view/ViewGroup;LQa/j;LQa/D;Landroid/view/ViewGroup;)V

    .line 76
    .line 77
    .line 78
    const p2, 0x3dcccccd    # 0.1f

    .line 79
    .line 80
    .line 81
    invoke-virtual {v3, p2}, LQa/i;->F(F)V

    .line 82
    .line 83
    .line 84
    iput-object v3, p0, Lcom/swmansion/gesturehandler/react/k;->b:LQa/i;

    .line 85
    .line 86
    new-instance p2, Lcom/swmansion/gesturehandler/react/k$b;

    .line 87
    .line 88
    neg-int v2, v0

    .line 89
    invoke-direct {p2, p0, v2}, Lcom/swmansion/gesturehandler/react/k$b;-><init>(Lcom/swmansion/gesturehandler/react/k;I)V

    .line 90
    .line 91
    .line 92
    iput-object p2, p0, Lcom/swmansion/gesturehandler/react/k;->c:LQa/d;

    .line 93
    .line 94
    invoke-virtual {v1, p2}, Lcom/swmansion/gesturehandler/react/i;->j(LQa/d;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p2}, LQa/d;->T()I

    .line 98
    .line 99
    .line 100
    move-result p2

    .line 101
    const/4 v2, 0x3

    .line 102
    invoke-virtual {v1, p2, v0, v2}, Lcom/swmansion/gesturehandler/react/i;->c(III)Z

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1, p0}, Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule;->registerRootHelper(Lcom/swmansion/gesturehandler/react/k;)V

    .line 106
    .line 107
    .line 108
    return-void
.end method

.method public static synthetic a(Lcom/swmansion/gesturehandler/react/k;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/swmansion/gesturehandler/react/k;->h(Lcom/swmansion/gesturehandler/react/k;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic b(Lcom/swmansion/gesturehandler/react/k;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/swmansion/gesturehandler/react/k;->e:Z

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic c(Lcom/swmansion/gesturehandler/react/k;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/swmansion/gesturehandler/react/k;->e:Z

    .line 2
    .line 3
    return-void
.end method

.method private static final h(Lcom/swmansion/gesturehandler/react/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/swmansion/gesturehandler/react/k;->k()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final k()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/gesturehandler/react/k;->c:LQa/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, LQa/d;->S()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x2

    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, LQa/d;->k()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, LQa/d;->B()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method


# virtual methods
.method public final d(Landroid/view/View;)V
    .locals 1

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/swmansion/gesturehandler/react/k;->b:LQa/i;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, p1}, LQa/i;->f(Landroid/view/View;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final e(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lcom/swmansion/gesturehandler/react/k;->f:Z

    .line 8
    .line 9
    iget-object v0, p0, Lcom/swmansion/gesturehandler/react/k;->b:LQa/i;

    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, LQa/i;->B(Landroid/view/MotionEvent;)Z

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    iput-boolean p1, p0, Lcom/swmansion/gesturehandler/react/k;->f:Z

    .line 19
    .line 20
    iget-boolean p1, p0, Lcom/swmansion/gesturehandler/react/k;->e:Z

    .line 21
    .line 22
    return p1
.end method

.method public final f()Landroid/view/ViewGroup;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/gesturehandler/react/k;->d:Landroid/view/ViewGroup;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g(IZ)V
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    new-instance p1, Lcom/swmansion/gesturehandler/react/j;

    .line 4
    .line 5
    invoke-direct {p1, p0}, Lcom/swmansion/gesturehandler/react/j;-><init>(Lcom/swmansion/gesturehandler/react/k;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final i()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/gesturehandler/react/k;->b:LQa/i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/swmansion/gesturehandler/react/k;->f:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, Lcom/swmansion/gesturehandler/react/k;->k()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final j()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/gesturehandler/react/k;->d:Landroid/view/ViewGroup;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "[GESTURE HANDLER] Tearing down gesture handler registered for root view "

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v1, "ReactNative"

    .line 21
    .line 22
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lcom/swmansion/gesturehandler/react/k;->a:Lcom/facebook/react/bridge/ReactContext;

    .line 26
    .line 27
    const-string v1, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext"

    .line 28
    .line 29
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    check-cast v0, Lcom/facebook/react/uimanager/b0;

    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/b0;->b()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-class v1, Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ReactContext;->getNativeModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    check-cast v0, Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule;

    .line 48
    .line 49
    invoke-virtual {v0}, Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule;->getRegistry()Lcom/swmansion/gesturehandler/react/i;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    iget-object v2, p0, Lcom/swmansion/gesturehandler/react/k;->c:LQa/d;

    .line 54
    .line 55
    invoke-static {v2}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2}, LQa/d;->T()I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    invoke-virtual {v1, v2}, Lcom/swmansion/gesturehandler/react/i;->g(I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, p0}, Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule;->unregisterRootHelper(Lcom/swmansion/gesturehandler/react/k;)V

    .line 66
    .line 67
    .line 68
    return-void
.end method
