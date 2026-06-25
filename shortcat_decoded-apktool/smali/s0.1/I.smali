.class final Ls0/I;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ls0/Z0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls0/I$c;,
        Ls0/I$d;
    }
.end annotation


# static fields
.field public static final f:Ls0/I$c;

.field private static g:Z


# instance fields
.field private final a:Landroid/view/ViewGroup;

.field private final b:Ljava/lang/Object;

.field private c:Landroidx/compose/ui/graphics/layer/view/a;

.field private d:Z

.field private final e:Landroid/content/ComponentCallbacks2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ls0/I$c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ls0/I$c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ls0/I;->f:Ls0/I$c;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    sput-boolean v0, Ls0/I;->g:Z

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ls0/I;->a:Landroid/view/ViewGroup;

    .line 5
    .line 6
    new-instance v0, Ljava/lang/Object;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Ls0/I;->b:Ljava/lang/Object;

    .line 12
    .line 13
    new-instance v0, Ls0/I$a;

    .line 14
    .line 15
    invoke-direct {v0, p0}, Ls0/I$a;-><init>(Ls0/I;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Ls0/I;->e:Landroid/content/ComponentCallbacks2;

    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-direct {p0, v0}, Ls0/I;->i(Landroid/content/Context;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    new-instance v0, Ls0/I$b;

    .line 34
    .line 35
    invoke-direct {v0, p0}, Ls0/I$b;-><init>(Ls0/I;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public static final synthetic c(Ls0/I;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ls0/I;->f()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic d(Ls0/I;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ls0/I;->i(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic e(Ls0/I;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ls0/I;->j(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final f()V
    .locals 0

    .line 1
    return-void
.end method

.method private final g(Landroid/view/View;)J
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, Ls0/I$d;->a(Landroid/view/View;)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0

    .line 12
    :cond_0
    const-wide/16 v0, -0x1

    .line 13
    .line 14
    return-wide v0
.end method

.method private final h(Landroid/view/ViewGroup;)Landroidx/compose/ui/graphics/layer/view/a;
    .locals 2

    .line 1
    iget-object v0, p0, Ls0/I;->c:Landroidx/compose/ui/graphics/layer/view/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Landroidx/compose/ui/graphics/layer/view/b;

    .line 10
    .line 11
    invoke-direct {v1, v0}, Landroidx/compose/ui/graphics/layer/view/b;-><init>(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, Ls0/I;->c:Landroidx/compose/ui/graphics/layer/view/a;

    .line 18
    .line 19
    return-object v1

    .line 20
    :cond_0
    return-object v0
.end method

.method private final i(Landroid/content/Context;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Ls0/I;->d:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object v0, p0, Ls0/I;->e:Landroid/content/ComponentCallbacks2;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    iput-boolean p1, p0, Ls0/I;->d:Z

    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method private final j(Landroid/content/Context;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Ls0/I;->d:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object v0, p0, Ls0/I;->e:Landroid/content/ComponentCallbacks2;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroid/content/Context;->unregisterComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    iput-boolean p1, p0, Ls0/I;->d:Z

    .line 16
    .line 17
    :cond_0
    return-void
.end method


# virtual methods
.method public a()Lv0/c;
    .locals 10

    .line 1
    iget-object v1, p0, Ls0/I;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v1

    .line 4
    :try_start_0
    iget-object v0, p0, Ls0/I;->a:Landroid/view/ViewGroup;

    .line 5
    .line 6
    invoke-direct {p0, v0}, Ls0/I;->g(Landroid/view/View;)J

    .line 7
    .line 8
    .line 9
    move-result-wide v4

    .line 10
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 11
    .line 12
    const/16 v2, 0x1d

    .line 13
    .line 14
    if-lt v0, v2, :cond_0

    .line 15
    .line 16
    new-instance v2, Lv0/D;

    .line 17
    .line 18
    const/4 v7, 0x6

    .line 19
    const/4 v8, 0x0

    .line 20
    move-wide v3, v4

    .line 21
    const/4 v5, 0x0

    .line 22
    const/4 v6, 0x0

    .line 23
    invoke-direct/range {v2 .. v8}, Lv0/D;-><init>(JLs0/k0;Lu0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception v0

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    sget-boolean v0, Ls0/I;->g:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    :try_start_1
    new-instance v2, Lv0/f;

    .line 34
    .line 35
    iget-object v3, p0, Ls0/I;->a:Landroid/view/ViewGroup;

    .line 36
    .line 37
    const/16 v8, 0xc

    .line 38
    .line 39
    const/4 v9, 0x0

    .line 40
    const/4 v6, 0x0

    .line 41
    const/4 v7, 0x0

    .line 42
    invoke-direct/range {v2 .. v9}, Lv0/f;-><init>(Landroid/view/View;JLs0/k0;Lu0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_1
    const/4 v0, 0x0

    .line 47
    :try_start_2
    sput-boolean v0, Ls0/I;->g:Z

    .line 48
    .line 49
    new-instance v2, Lv0/E;

    .line 50
    .line 51
    iget-object v0, p0, Ls0/I;->a:Landroid/view/ViewGroup;

    .line 52
    .line 53
    invoke-direct {p0, v0}, Ls0/I;->h(Landroid/view/ViewGroup;)Landroidx/compose/ui/graphics/layer/view/a;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    const/16 v8, 0xc

    .line 58
    .line 59
    const/4 v9, 0x0

    .line 60
    const/4 v6, 0x0

    .line 61
    const/4 v7, 0x0

    .line 62
    invoke-direct/range {v2 .. v9}, Lv0/E;-><init>(Landroidx/compose/ui/graphics/layer/view/a;JLs0/k0;Lu0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    new-instance v2, Lv0/E;

    .line 67
    .line 68
    iget-object v0, p0, Ls0/I;->a:Landroid/view/ViewGroup;

    .line 69
    .line 70
    invoke-direct {p0, v0}, Ls0/I;->h(Landroid/view/ViewGroup;)Landroidx/compose/ui/graphics/layer/view/a;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    const/16 v8, 0xc

    .line 75
    .line 76
    const/4 v9, 0x0

    .line 77
    const/4 v6, 0x0

    .line 78
    const/4 v7, 0x0

    .line 79
    invoke-direct/range {v2 .. v9}, Lv0/E;-><init>(Landroidx/compose/ui/graphics/layer/view/a;JLs0/k0;Lu0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 80
    .line 81
    .line 82
    :goto_0
    new-instance v0, Lv0/c;

    .line 83
    .line 84
    invoke-direct {v0, v2}, Lv0/c;-><init>(Lv0/d;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 85
    .line 86
    .line 87
    monitor-exit v1

    .line 88
    return-object v0

    .line 89
    :goto_1
    monitor-exit v1

    .line 90
    throw v0
.end method

.method public b(Lv0/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ls0/I;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p1}, Lv0/c;->I()V

    .line 5
    .line 6
    .line 7
    sget-object p1, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    monitor-exit v0

    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception p1

    .line 12
    monitor-exit v0

    .line 13
    throw p1
.end method
