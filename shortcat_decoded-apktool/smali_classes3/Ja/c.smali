.class public final LJa/c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJa/c$a;
    }
.end annotation


# static fields
.field public static final e:LJa/c$a;


# instance fields
.field private final a:Lcom/facebook/react/bridge/ReactApplicationContext;

.field private b:LJa/e;

.field private c:Landroidx/core/view/l1;

.field private d:Ljava/lang/ref/WeakReference;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LJa/c$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LJa/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LJa/c;->e:LJa/c$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 1

    .line 1
    const-string v0, "mReactContext"

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
    iput-object p1, p0, LJa/c;->a:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 10
    .line 11
    new-instance v0, LJa/e;

    .line 12
    .line 13
    invoke-direct {v0, p1}, LJa/e;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, LJa/c;->b:LJa/e;

    .line 17
    .line 18
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-direct {p1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, LJa/c;->d:Ljava/lang/ref/WeakReference;

    .line 25
    .line 26
    return-void
.end method

.method public static synthetic a(LJa/c;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, LJa/c;->j(LJa/c;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(ZLJa/c;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, LJa/c;->h(ZLJa/c;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final d()Landroidx/core/view/l1;
    .locals 8

    .line 1
    iget-object v0, p0, LJa/c;->a:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->getCurrentActivity()Landroid/app/Activity;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, LJa/c;->c:Landroidx/core/view/l1;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, LJa/c;->d:Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    :cond_0
    if-nez v0, :cond_1

    .line 24
    .line 25
    sget-object v2, LFa/a;->a:LFa/a;

    .line 26
    .line 27
    invoke-static {}, LJa/d;->a()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    const/4 v6, 0x4

    .line 32
    const/4 v7, 0x0

    .line 33
    const-string v4, "StatusBarManagerCompatModule: can not get `WindowInsetsControllerCompat` because current activity is null."

    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    invoke-static/range {v2 .. v7}, LFa/a;->d(LFa/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, LJa/c;->c:Landroidx/core/view/l1;

    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_1
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    new-instance v2, Ljava/lang/ref/WeakReference;

    .line 47
    .line 48
    invoke-direct {v2, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iput-object v2, p0, LJa/c;->d:Ljava/lang/ref/WeakReference;

    .line 52
    .line 53
    new-instance v0, Landroidx/core/view/l1;

    .line 54
    .line 55
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-direct {v0, v1, v2}, Landroidx/core/view/l1;-><init>(Landroid/view/Window;Landroid/view/View;)V

    .line 60
    .line 61
    .line 62
    iput-object v0, p0, LJa/c;->c:Landroidx/core/view/l1;

    .line 63
    .line 64
    :cond_2
    iget-object v0, p0, LJa/c;->c:Landroidx/core/view/l1;

    .line 65
    .line 66
    return-object v0
.end method

.method private final e()Z
    .locals 1

    .line 1
    invoke-direct {p0}, LJa/c;->l()LLa/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, LLa/c;->getActive()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return v0
.end method

.method private static final h(ZLJa/c;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-direct {p1}, LJa/c;->d()Landroidx/core/view/l1;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_1

    .line 8
    .line 9
    invoke-static {}, Landroidx/core/view/L0$p;->h()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-virtual {p0, p1}, Landroidx/core/view/l1;->b(I)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-direct {p1}, LJa/c;->d()Landroidx/core/view/l1;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    if-eqz p0, :cond_1

    .line 22
    .line 23
    invoke-static {}, Landroidx/core/view/L0$p;->h()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    invoke-virtual {p0, p1}, Landroidx/core/view/l1;->g(I)V

    .line 28
    .line 29
    .line 30
    :cond_1
    return-void
.end method

.method private static final j(LJa/c;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, LJa/c;->d()Landroidx/core/view/l1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const-string v0, "dark-content"

    .line 8
    .line 9
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-virtual {p0, p1}, Landroidx/core/view/l1;->e(Z)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method private final l()LLa/c;
    .locals 1

    .line 1
    sget-object v0, LLa/e;->a:LLa/e;

    .line 2
    .line 3
    invoke-virtual {v0}, LLa/e;->a()LLa/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method


# virtual methods
.method public final c()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, LJa/c;->b:LJa/e;

    .line 2
    .line 3
    invoke-virtual {v0}, LJa/e;->a()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final f(IZ)V
    .locals 9

    .line 1
    invoke-direct {p0}, LJa/c;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, LJa/c;->b:LJa/e;

    .line 8
    .line 9
    int-to-double v1, p1

    .line 10
    invoke-virtual {v0, v1, v2, p2}, LJa/e;->b(DZ)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    sget-object v3, LFa/a;->a:LFa/a;

    .line 15
    .line 16
    invoke-static {}, LJa/d;->a()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    const/4 v7, 0x4

    .line 21
    const/4 v8, 0x0

    .line 22
    const-string v5, "StatusBarModule: Ignored status bar change, current activity is edge-to-edge."

    .line 23
    .line 24
    const/4 v6, 0x0

    .line 25
    invoke-static/range {v3 .. v8}, LFa/a;->d(LFa/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final g(Z)V
    .locals 1

    .line 1
    new-instance v0, LJa/a;

    .line 2
    .line 3
    invoke-direct {v0, p1, p0}, LJa/a;-><init>(ZLJa/c;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final i(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "style"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, LJa/c;->e()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, LJa/c;->b:LJa/e;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, LJa/e;->c(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    new-instance v0, LJa/b;

    .line 19
    .line 20
    invoke-direct {v0, p0, p1}, LJa/b;-><init>(LJa/c;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final k(Z)V
    .locals 7

    .line 1
    invoke-direct {p0}, LJa/c;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, LJa/c;->b:LJa/e;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, LJa/e;->d(Z)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    sget-object v1, LFa/a;->a:LFa/a;

    .line 14
    .line 15
    invoke-static {}, LJa/d;->a()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const/4 v5, 0x4

    .line 20
    const/4 v6, 0x0

    .line 21
    const-string v3, "StatusBarModule: Ignored status bar change, current activity is edge-to-edge."

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    invoke-static/range {v1 .. v6}, LFa/a;->d(LFa/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method
