.class public Lcom/facebook/react/uimanager/e0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field protected a:Ljava/lang/Object;

.field protected final b:Lcom/facebook/react/uimanager/events/EventDispatcher;

.field protected final c:Lcom/facebook/react/bridge/ReactApplicationContext;

.field protected final d:Lcom/facebook/react/uimanager/Y;

.field private final e:Lcom/facebook/react/uimanager/y0;

.field private final f:Lcom/facebook/react/uimanager/j0;

.field private final g:Lcom/facebook/react/uimanager/z;

.field private final h:[I

.field private i:J

.field private volatile j:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "UIImplementation"

    .line 2
    .line 3
    sget-object v1, LW6/a;->b:LW6/a;

    .line 4
    .line 5
    invoke-static {v0, v1}, LW6/b;->a(Ljava/lang/String;LW6/a;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/facebook/react/uimanager/y0;Lcom/facebook/react/uimanager/events/EventDispatcher;I)V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/uimanager/j0;

    new-instance v1, Lcom/facebook/react/uimanager/y;

    invoke-direct {v1, p2}, Lcom/facebook/react/uimanager/y;-><init>(Lcom/facebook/react/uimanager/y0;)V

    invoke-direct {v0, p1, v1, p4}, Lcom/facebook/react/uimanager/j0;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/facebook/react/uimanager/y;I)V

    invoke-direct {p0, p1, p2, v0, p3}, Lcom/facebook/react/uimanager/e0;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/facebook/react/uimanager/y0;Lcom/facebook/react/uimanager/j0;Lcom/facebook/react/uimanager/events/EventDispatcher;)V

    return-void
.end method

.method protected constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/facebook/react/uimanager/y0;Lcom/facebook/react/uimanager/j0;Lcom/facebook/react/uimanager/events/EventDispatcher;)V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/facebook/react/uimanager/e0;->a:Ljava/lang/Object;

    .line 4
    new-instance v0, Lcom/facebook/react/uimanager/Y;

    invoke-direct {v0}, Lcom/facebook/react/uimanager/Y;-><init>()V

    iput-object v0, p0, Lcom/facebook/react/uimanager/e0;->d:Lcom/facebook/react/uimanager/Y;

    const/4 v1, 0x4

    .line 5
    new-array v1, v1, [I

    iput-object v1, p0, Lcom/facebook/react/uimanager/e0;->h:[I

    const-wide/16 v1, 0x0

    .line 6
    iput-wide v1, p0, Lcom/facebook/react/uimanager/e0;->i:J

    const/4 v1, 0x1

    .line 7
    iput-boolean v1, p0, Lcom/facebook/react/uimanager/e0;->j:Z

    .line 8
    iput-object p1, p0, Lcom/facebook/react/uimanager/e0;->c:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 9
    iput-object p2, p0, Lcom/facebook/react/uimanager/e0;->e:Lcom/facebook/react/uimanager/y0;

    .line 10
    iput-object p3, p0, Lcom/facebook/react/uimanager/e0;->f:Lcom/facebook/react/uimanager/j0;

    .line 11
    new-instance p1, Lcom/facebook/react/uimanager/z;

    invoke-direct {p1, p3, v0}, Lcom/facebook/react/uimanager/z;-><init>(Lcom/facebook/react/uimanager/j0;Lcom/facebook/react/uimanager/Y;)V

    iput-object p1, p0, Lcom/facebook/react/uimanager/e0;->g:Lcom/facebook/react/uimanager/z;

    .line 12
    iput-object p4, p0, Lcom/facebook/react/uimanager/e0;->b:Lcom/facebook/react/uimanager/events/EventDispatcher;

    return-void
.end method

.method private A(Lcom/facebook/react/uimanager/O;)V
    .locals 2

    .line 1
    invoke-interface {p1}, Lcom/facebook/react/uimanager/O;->hasUpdates()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    invoke-interface {p1}, Lcom/facebook/react/uimanager/O;->getChildCount()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-ge v0, v1, :cond_1

    .line 14
    .line 15
    invoke-interface {p1, v0}, Lcom/facebook/react/uimanager/O;->getChildAt(I)Lcom/facebook/react/uimanager/O;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-direct {p0, v1}, Lcom/facebook/react/uimanager/e0;->A(Lcom/facebook/react/uimanager/O;)V

    .line 20
    .line 21
    .line 22
    add-int/lit8 v0, v0, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->g:Lcom/facebook/react/uimanager/z;

    .line 26
    .line 27
    invoke-interface {p1, v0}, Lcom/facebook/react/uimanager/O;->onBeforeLayout(Lcom/facebook/react/uimanager/z;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method private L(Lcom/facebook/react/uimanager/O;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lcom/facebook/react/uimanager/z;->j(Lcom/facebook/react/uimanager/O;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->d:Lcom/facebook/react/uimanager/Y;

    .line 5
    .line 6
    invoke-interface {p1}, Lcom/facebook/react/uimanager/O;->getReactTag()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-virtual {v0, v1}, Lcom/facebook/react/uimanager/Y;->g(I)V

    .line 11
    .line 12
    .line 13
    invoke-interface {p1}, Lcom/facebook/react/uimanager/O;->getChildCount()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    add-int/lit8 v0, v0, -0x1

    .line 18
    .line 19
    :goto_0
    if-ltz v0, :cond_0

    .line 20
    .line 21
    invoke-interface {p1, v0}, Lcom/facebook/react/uimanager/O;->getChildAt(I)Lcom/facebook/react/uimanager/O;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-direct {p0, v1}, Lcom/facebook/react/uimanager/e0;->L(Lcom/facebook/react/uimanager/O;)V

    .line 26
    .line 27
    .line 28
    add-int/lit8 v0, v0, -0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-interface {p1}, Lcom/facebook/react/uimanager/O;->removeAndDisposeAllChildren()V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method private c(Lcom/facebook/react/uimanager/O;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->e:Lcom/facebook/react/uimanager/y0;

    .line 2
    .line 3
    invoke-interface {p1}, Lcom/facebook/react/uimanager/O;->getViewClass()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Lcom/facebook/react/uimanager/y0;->g(Ljava/lang/String;)Lcom/facebook/react/uimanager/ViewManager;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, LQ6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lcom/facebook/react/uimanager/ViewManager;

    .line 16
    .line 17
    instance-of v1, v0, Lcom/facebook/react/uimanager/n;

    .line 18
    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    check-cast v0, Lcom/facebook/react/uimanager/n;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-interface {v0}, Lcom/facebook/react/uimanager/n;->needsCustomLayoutForChildren()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    new-instance v0, Lcom/facebook/react/uimanager/o;

    .line 33
    .line 34
    new-instance v1, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    const-string v2, "Trying to measure a view using measureLayout/measureLayoutRelativeToParent relative to an ancestor that requires custom layout for it\'s children ("

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-interface {p1}, Lcom/facebook/react/uimanager/O;->getViewClass()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string p1, "). Use measure instead."

    .line 52
    .line 53
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-direct {v0, p1}, Lcom/facebook/react/uimanager/o;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw v0

    .line 64
    :cond_1
    :goto_0
    return-void

    .line 65
    :cond_2
    new-instance v0, Lcom/facebook/react/uimanager/o;

    .line 66
    .line 67
    new-instance v1, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 70
    .line 71
    .line 72
    const-string v2, "Trying to use view "

    .line 73
    .line 74
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-interface {p1}, Lcom/facebook/react/uimanager/O;->getViewClass()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string p1, " as a parent, but its Manager doesn\'t extends ViewGroupManager"

    .line 85
    .line 86
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-direct {v0, p1}, Lcom/facebook/react/uimanager/o;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    throw v0
.end method

.method private e(ILjava/lang/String;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->d:Lcom/facebook/react/uimanager/Y;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/Y;->c(I)Lcom/facebook/react/uimanager/O;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    return p1

    .line 11
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v1, "Unable to execute operation "

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string p2, " on view with tag: "

    .line 25
    .line 26
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string p1, ", since the view does not exist"

    .line 33
    .line 34
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    sget-boolean p2, LY6/a;->b:Z

    .line 42
    .line 43
    if-nez p2, :cond_1

    .line 44
    .line 45
    const-string p2, "ReactNative"

    .line 46
    .line 47
    invoke-static {p2, p1}, Lz5/a;->I(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 p1, 0x0

    .line 51
    return p1

    .line 52
    :cond_1
    new-instance p2, Lcom/facebook/react/uimanager/o;

    .line 53
    .line 54
    invoke-direct {p2, p1}, Lcom/facebook/react/uimanager/o;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw p2
.end method

.method private n()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->f:Lcom/facebook/react/uimanager/j0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/j0;->U()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, -0x1

    .line 10
    invoke-virtual {p0, v0}, Lcom/facebook/react/uimanager/e0;->m(I)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method private y(II[I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->d:Lcom/facebook/react/uimanager/Y;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/Y;->c(I)Lcom/facebook/react/uimanager/O;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/facebook/react/uimanager/e0;->d:Lcom/facebook/react/uimanager/Y;

    .line 8
    .line 9
    invoke-virtual {v1, p2}, Lcom/facebook/react/uimanager/Y;->c(I)Lcom/facebook/react/uimanager/O;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "Tag "

    .line 14
    .line 15
    if-eqz v0, :cond_3

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    if-eq v0, v1, :cond_2

    .line 21
    .line 22
    invoke-interface {v0}, Lcom/facebook/react/uimanager/O;->getParent()Lcom/facebook/react/uimanager/O;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    :goto_0
    if-eq v3, v1, :cond_2

    .line 27
    .line 28
    if-eqz v3, :cond_1

    .line 29
    .line 30
    invoke-interface {v3}, Lcom/facebook/react/uimanager/O;->getParent()Lcom/facebook/react/uimanager/O;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    new-instance p3, Lcom/facebook/react/uimanager/o;

    .line 36
    .line 37
    new-instance v0, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string p2, " is not an ancestor of tag "

    .line 49
    .line 50
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-direct {p3, p1}, Lcom/facebook/react/uimanager/o;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw p3

    .line 64
    :cond_2
    invoke-direct {p0, v0, v1, p3}, Lcom/facebook/react/uimanager/e0;->z(Lcom/facebook/react/uimanager/O;Lcom/facebook/react/uimanager/O;[I)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_3
    :goto_1
    new-instance p3, Lcom/facebook/react/uimanager/o;

    .line 69
    .line 70
    new-instance v1, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    if-nez v0, :cond_4

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_4
    move p1, p2

    .line 82
    :goto_2
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string p1, " does not exist"

    .line 86
    .line 87
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-direct {p3, p1}, Lcom/facebook/react/uimanager/o;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    throw p3
.end method

.method private z(Lcom/facebook/react/uimanager/O;Lcom/facebook/react/uimanager/O;[I)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eq p1, p2, :cond_1

    .line 3
    .line 4
    invoke-interface {p1}, Lcom/facebook/react/uimanager/O;->isVirtual()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    invoke-interface {p1}, Lcom/facebook/react/uimanager/O;->getLayoutX()F

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-interface {p1}, Lcom/facebook/react/uimanager/O;->getLayoutY()F

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    invoke-interface {p1}, Lcom/facebook/react/uimanager/O;->getParent()Lcom/facebook/react/uimanager/O;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    :goto_0
    if-eq v3, p2, :cond_0

    .line 31
    .line 32
    invoke-static {v3}, LQ6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    invoke-direct {p0, v3}, Lcom/facebook/react/uimanager/e0;->c(Lcom/facebook/react/uimanager/O;)V

    .line 36
    .line 37
    .line 38
    invoke-interface {v3}, Lcom/facebook/react/uimanager/O;->getLayoutX()F

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    add-int/2addr v1, v4

    .line 47
    invoke-interface {v3}, Lcom/facebook/react/uimanager/O;->getLayoutY()F

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    add-int/2addr v2, v4

    .line 56
    invoke-interface {v3}, Lcom/facebook/react/uimanager/O;->getParent()Lcom/facebook/react/uimanager/O;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    goto :goto_0

    .line 61
    :cond_0
    invoke-direct {p0, p2}, Lcom/facebook/react/uimanager/e0;->c(Lcom/facebook/react/uimanager/O;)V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_1
    move v1, v0

    .line 66
    move v2, v1

    .line 67
    :goto_1
    aput v1, p3, v0

    .line 68
    .line 69
    const/4 p2, 0x1

    .line 70
    aput v2, p3, p2

    .line 71
    .line 72
    const/4 p2, 0x2

    .line 73
    invoke-interface {p1}, Lcom/facebook/react/uimanager/O;->getScreenWidth()I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    aput v0, p3, p2

    .line 78
    .line 79
    const/4 p2, 0x3

    .line 80
    invoke-interface {p1}, Lcom/facebook/react/uimanager/O;->getScreenHeight()I

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    aput p1, p3, p2

    .line 85
    .line 86
    return-void
.end method


# virtual methods
.method public B()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/facebook/react/uimanager/e0;->j:Z

    .line 3
    .line 4
    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->e:Lcom/facebook/react/uimanager/y0;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/y0;->j()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public C()V
    .locals 0

    .line 1
    return-void
.end method

.method public D()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->f:Lcom/facebook/react/uimanager/j0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/j0;->V()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public E()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->f:Lcom/facebook/react/uimanager/j0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/j0;->Y()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public F(Lcom/facebook/react/uimanager/d0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->f:Lcom/facebook/react/uimanager/j0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/j0;->W(Lcom/facebook/react/uimanager/d0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public G()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->f:Lcom/facebook/react/uimanager/j0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/j0;->X()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public H(Landroid/view/View;ILcom/facebook/react/uimanager/b0;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/e0;->h()Lcom/facebook/react/uimanager/O;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-interface {v1, p2}, Lcom/facebook/react/uimanager/O;->setReactTag(I)V

    .line 9
    .line 10
    .line 11
    invoke-interface {v1, p3}, Lcom/facebook/react/uimanager/O;->setThemedContext(Lcom/facebook/react/uimanager/b0;)V

    .line 12
    .line 13
    .line 14
    new-instance v2, Lcom/facebook/react/uimanager/e0$a;

    .line 15
    .line 16
    invoke-direct {v2, p0, v1}, Lcom/facebook/react/uimanager/e0$a;-><init>(Lcom/facebook/react/uimanager/e0;Lcom/facebook/react/uimanager/O;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p3, v2}, Lcom/facebook/react/bridge/ReactContext;->runOnNativeModulesQueueThread(Ljava/lang/Runnable;)V

    .line 20
    .line 21
    .line 22
    iget-object p3, p0, Lcom/facebook/react/uimanager/e0;->f:Lcom/facebook/react/uimanager/j0;

    .line 23
    .line 24
    invoke-virtual {p3, p2, p1}, Lcom/facebook/react/uimanager/j0;->y(ILandroid/view/View;)V

    .line 25
    .line 26
    .line 27
    monitor-exit v0

    .line 28
    return-void

    .line 29
    :catchall_0
    move-exception p1

    .line 30
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    throw p1
.end method

.method public I(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/facebook/react/uimanager/e0;->d:Lcom/facebook/react/uimanager/Y;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Lcom/facebook/react/uimanager/Y;->h(I)V

    .line 7
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
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    throw p1
.end method

.method public J(I)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/facebook/react/uimanager/e0;->I(I)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->f:Lcom/facebook/react/uimanager/j0;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/j0;->J(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method protected final K(Lcom/facebook/react/uimanager/O;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/uimanager/e0;->L(Lcom/facebook/react/uimanager/O;)V

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Lcom/facebook/react/uimanager/O;->dispose()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public M(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->d:Lcom/facebook/react/uimanager/Y;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/Y;->f(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return p1

    .line 10
    :cond_0
    invoke-virtual {p0, p1}, Lcom/facebook/react/uimanager/e0;->N(I)Lcom/facebook/react/uimanager/O;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-interface {v0}, Lcom/facebook/react/uimanager/O;->getRootTag()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    return p1

    .line 21
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    const-string v1, "Warning : attempted to resolve a non-existent react shadow node. reactTag="

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    const-string v0, "ReactNative"

    .line 39
    .line 40
    invoke-static {v0, p1}, Lz5/a;->I(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const/4 p1, 0x0

    .line 44
    return p1
.end method

.method public final N(I)Lcom/facebook/react/uimanager/O;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->d:Lcom/facebook/react/uimanager/Y;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/Y;->c(I)Lcom/facebook/react/uimanager/O;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method protected final O(Ljava/lang/String;)Lcom/facebook/react/uimanager/ViewManager;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->e:Lcom/facebook/react/uimanager/y0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/y0;->i(Ljava/lang/String;)Lcom/facebook/react/uimanager/ViewManager;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public P(II)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->f:Lcom/facebook/react/uimanager/j0;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/uimanager/j0;->K(II)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public Q(ILcom/facebook/react/bridge/ReadableArray;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/uimanager/e0;->j:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->a:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    iget-object v1, p0, Lcom/facebook/react/uimanager/e0;->d:Lcom/facebook/react/uimanager/Y;

    .line 10
    .line 11
    invoke-virtual {v1, p1}, Lcom/facebook/react/uimanager/Y;->c(I)Lcom/facebook/react/uimanager/O;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const/4 v1, 0x0

    .line 16
    :goto_0
    invoke-interface {p2}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-ge v1, v2, :cond_2

    .line 21
    .line 22
    iget-object v2, p0, Lcom/facebook/react/uimanager/e0;->d:Lcom/facebook/react/uimanager/Y;

    .line 23
    .line 24
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    invoke-virtual {v2, v3}, Lcom/facebook/react/uimanager/Y;->c(I)Lcom/facebook/react/uimanager/O;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    invoke-interface {p1, v2, v1}, Lcom/facebook/react/uimanager/O;->addChildAt(Lcom/facebook/react/uimanager/O;I)V

    .line 35
    .line 36
    .line 37
    add-int/lit8 v1, v1, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception p1

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p1, Lcom/facebook/react/uimanager/o;

    .line 43
    .line 44
    new-instance v2, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 47
    .line 48
    .line 49
    const-string v3, "Trying to add unknown view tag: "

    .line 50
    .line 51
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    invoke-direct {p1, p2}, Lcom/facebook/react/uimanager/o;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw p1

    .line 69
    :cond_2
    iget-object v1, p0, Lcom/facebook/react/uimanager/e0;->g:Lcom/facebook/react/uimanager/z;

    .line 70
    .line 71
    invoke-virtual {v1, p1, p2}, Lcom/facebook/react/uimanager/z;->k(Lcom/facebook/react/uimanager/O;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 72
    .line 73
    .line 74
    monitor-exit v0

    .line 75
    return-void

    .line 76
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    throw p1
.end method

.method public R(IZ)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->d:Lcom/facebook/react/uimanager/Y;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/Y;->c(I)Lcom/facebook/react/uimanager/O;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    :goto_0
    invoke-interface {v0}, Lcom/facebook/react/uimanager/O;->getNativeKind()Lcom/facebook/react/uimanager/x;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    sget-object v2, Lcom/facebook/react/uimanager/x;->c:Lcom/facebook/react/uimanager/x;

    .line 15
    .line 16
    if-ne v1, v2, :cond_1

    .line 17
    .line 18
    invoke-interface {v0}, Lcom/facebook/react/uimanager/O;->getParent()Lcom/facebook/react/uimanager/O;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    iget-object v1, p0, Lcom/facebook/react/uimanager/e0;->f:Lcom/facebook/react/uimanager/j0;

    .line 24
    .line 25
    invoke-interface {v0}, Lcom/facebook/react/uimanager/O;->getReactTag()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-virtual {v1, v0, p1, p2}, Lcom/facebook/react/uimanager/j0;->L(IIZ)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public S(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->f:Lcom/facebook/react/uimanager/j0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/j0;->M(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public T(LD7/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->f:Lcom/facebook/react/uimanager/j0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/j0;->Z(LD7/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public U(ILjava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->d:Lcom/facebook/react/uimanager/Y;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/Y;->c(I)Lcom/facebook/react/uimanager/O;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance p2, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v0, "Attempt to set local data for view with unknown tag: "

    .line 15
    .line 16
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const-string p2, "ReactNative"

    .line 27
    .line 28
    invoke-static {p2, p1}, Lz5/a;->I(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    invoke-interface {v0, p2}, Lcom/facebook/react/uimanager/O;->setLocalData(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-direct {p0}, Lcom/facebook/react/uimanager/e0;->n()V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public V(ILcom/facebook/react/uimanager/Q;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->f:Lcom/facebook/react/uimanager/j0;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/j0;->S()Lcom/facebook/react/uimanager/y;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/uimanager/y;->B(ILcom/facebook/react/uimanager/Q;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public W(IIIII)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->d:Lcom/facebook/react/uimanager/Y;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/Y;->c(I)Lcom/facebook/react/uimanager/O;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance p2, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string p3, "Tried to update size of non-existent tag: "

    .line 15
    .line 16
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const-string p2, "ReactNative"

    .line 27
    .line 28
    invoke-static {p2, p1}, Lz5/a;->I(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    const/4 p1, 0x4

    .line 33
    int-to-float p3, p3

    .line 34
    invoke-interface {v0, p1, p3}, Lcom/facebook/react/uimanager/O;->setPadding(IF)V

    .line 35
    .line 36
    .line 37
    const/4 p1, 0x1

    .line 38
    int-to-float p2, p2

    .line 39
    invoke-interface {v0, p1, p2}, Lcom/facebook/react/uimanager/O;->setPadding(IF)V

    .line 40
    .line 41
    .line 42
    const/4 p1, 0x5

    .line 43
    int-to-float p2, p5

    .line 44
    invoke-interface {v0, p1, p2}, Lcom/facebook/react/uimanager/O;->setPadding(IF)V

    .line 45
    .line 46
    .line 47
    const/4 p1, 0x3

    .line 48
    int-to-float p2, p4

    .line 49
    invoke-interface {v0, p1, p2}, Lcom/facebook/react/uimanager/O;->setPadding(IF)V

    .line 50
    .line 51
    .line 52
    invoke-direct {p0}, Lcom/facebook/react/uimanager/e0;->n()V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public X(III)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->d:Lcom/facebook/react/uimanager/Y;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/Y;->c(I)Lcom/facebook/react/uimanager/O;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance p2, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string p3, "Tried to update size of non-existent tag: "

    .line 15
    .line 16
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const-string p2, "ReactNative"

    .line 27
    .line 28
    invoke-static {p2, p1}, Lz5/a;->I(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    int-to-float p1, p2

    .line 33
    invoke-interface {v0, p1}, Lcom/facebook/react/uimanager/O;->setStyleWidth(F)V

    .line 34
    .line 35
    .line 36
    int-to-float p1, p3

    .line 37
    invoke-interface {v0, p1}, Lcom/facebook/react/uimanager/O;->setStyleHeight(F)V

    .line 38
    .line 39
    .line 40
    invoke-direct {p0}, Lcom/facebook/react/uimanager/e0;->n()V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public Y(III)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->d:Lcom/facebook/react/uimanager/Y;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/Y;->c(I)Lcom/facebook/react/uimanager/O;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance p2, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string p3, "Tried to update non-existent root tag: "

    .line 15
    .line 16
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const-string p2, "ReactNative"

    .line 27
    .line 28
    invoke-static {p2, p1}, Lz5/a;->I(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    invoke-virtual {p0, v0, p2, p3}, Lcom/facebook/react/uimanager/e0;->Z(Lcom/facebook/react/uimanager/O;II)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public Z(Lcom/facebook/react/uimanager/O;II)V
    .locals 0

    .line 1
    invoke-interface {p1, p2, p3}, Lcom/facebook/react/uimanager/O;->setMeasureSpecs(II)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public a(Lcom/facebook/react/uimanager/d0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->f:Lcom/facebook/react/uimanager/j0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/j0;->N(Lcom/facebook/react/uimanager/d0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public a0(ILjava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/uimanager/e0;->j:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->e:Lcom/facebook/react/uimanager/y0;

    .line 7
    .line 8
    invoke-virtual {v0, p2}, Lcom/facebook/react/uimanager/y0;->g(Ljava/lang/String;)Lcom/facebook/react/uimanager/ViewManager;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_3

    .line 13
    .line 14
    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->d:Lcom/facebook/react/uimanager/Y;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/Y;->c(I)Lcom/facebook/react/uimanager/O;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    if-eqz p3, :cond_1

    .line 23
    .line 24
    new-instance p1, Lcom/facebook/react/uimanager/Q;

    .line 25
    .line 26
    invoke-direct {p1, p3}, Lcom/facebook/react/uimanager/Q;-><init>(Lcom/facebook/react/bridge/ReadableMap;)V

    .line 27
    .line 28
    .line 29
    invoke-interface {v0, p1}, Lcom/facebook/react/uimanager/O;->updateProperties(Lcom/facebook/react/uimanager/Q;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v0, p2, p1}, Lcom/facebook/react/uimanager/e0;->t(Lcom/facebook/react/uimanager/O;Ljava/lang/String;Lcom/facebook/react/uimanager/Q;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    :goto_0
    return-void

    .line 36
    :cond_2
    new-instance p2, Lcom/facebook/react/uimanager/o;

    .line 37
    .line 38
    new-instance p3, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    const-string v0, "Trying to update non-existent view with tag "

    .line 44
    .line 45
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-direct {p2, p1}, Lcom/facebook/react/uimanager/o;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p2

    .line 59
    :cond_3
    new-instance p1, Lcom/facebook/react/uimanager/o;

    .line 60
    .line 61
    new-instance p3, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 64
    .line 65
    .line 66
    const-string v0, "Got unknown view type: "

    .line 67
    .line 68
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    invoke-direct {p1, p2}, Lcom/facebook/react/uimanager/o;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    throw p1
.end method

.method protected b(Lcom/facebook/react/uimanager/O;FFLjava/util/List;)V
    .locals 4

    .line 1
    invoke-interface {p1}, Lcom/facebook/react/uimanager/O;->hasUpdates()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-interface {p1, p2, p3}, Lcom/facebook/react/uimanager/O;->dispatchUpdatesWillChangeLayout(FF)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-interface {p1}, Lcom/facebook/react/uimanager/O;->shouldNotifyOnLayout()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->d:Lcom/facebook/react/uimanager/Y;

    .line 21
    .line 22
    invoke-interface {p1}, Lcom/facebook/react/uimanager/O;->getReactTag()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-virtual {v0, v1}, Lcom/facebook/react/uimanager/Y;->f(I)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    invoke-interface {p4, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    :cond_1
    invoke-interface {p1}, Lcom/facebook/react/uimanager/O;->calculateLayoutOnChildren()Ljava/lang/Iterable;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_2

    .line 50
    .line 51
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    check-cast v1, Lcom/facebook/react/uimanager/O;

    .line 56
    .line 57
    invoke-interface {p1}, Lcom/facebook/react/uimanager/O;->getLayoutX()F

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    add-float/2addr v2, p2

    .line 62
    invoke-interface {p1}, Lcom/facebook/react/uimanager/O;->getLayoutY()F

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    add-float/2addr v3, p3

    .line 67
    invoke-virtual {p0, v1, v2, v3, p4}, Lcom/facebook/react/uimanager/e0;->b(Lcom/facebook/react/uimanager/O;FFLjava/util/List;)V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    iget-object p4, p0, Lcom/facebook/react/uimanager/e0;->f:Lcom/facebook/react/uimanager/j0;

    .line 72
    .line 73
    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->g:Lcom/facebook/react/uimanager/z;

    .line 74
    .line 75
    invoke-interface {p1, p2, p3, p4, v0}, Lcom/facebook/react/uimanager/O;->dispatchUpdates(FFLcom/facebook/react/uimanager/j0;Lcom/facebook/react/uimanager/z;)V

    .line 76
    .line 77
    .line 78
    invoke-interface {p1}, Lcom/facebook/react/uimanager/O;->markUpdateSeen()V

    .line 79
    .line 80
    .line 81
    iget-object p2, p0, Lcom/facebook/react/uimanager/e0;->g:Lcom/facebook/react/uimanager/z;

    .line 82
    .line 83
    invoke-virtual {p2, p1}, Lcom/facebook/react/uimanager/z;->p(Lcom/facebook/react/uimanager/O;)V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method protected b0()V
    .locals 13

    .line 1
    const-string v0, "rootTag"

    .line 2
    .line 3
    const-string v1, "UIImplementation.updateViewHierarchy"

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    invoke-static {v2, v3, v1}, LU7/a;->c(JLjava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    :goto_0
    :try_start_0
    iget-object v4, p0, Lcom/facebook/react/uimanager/e0;->d:Lcom/facebook/react/uimanager/Y;

    .line 12
    .line 13
    invoke-virtual {v4}, Lcom/facebook/react/uimanager/Y;->d()I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    if-ge v1, v4, :cond_2

    .line 18
    .line 19
    iget-object v4, p0, Lcom/facebook/react/uimanager/e0;->d:Lcom/facebook/react/uimanager/Y;

    .line 20
    .line 21
    invoke-virtual {v4, v1}, Lcom/facebook/react/uimanager/Y;->e(I)I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    iget-object v5, p0, Lcom/facebook/react/uimanager/e0;->d:Lcom/facebook/react/uimanager/Y;

    .line 26
    .line 27
    invoke-virtual {v5, v4}, Lcom/facebook/react/uimanager/Y;->c(I)Lcom/facebook/react/uimanager/O;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-interface {v4}, Lcom/facebook/react/uimanager/O;->getWidthMeasureSpec()Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    if-eqz v5, :cond_1

    .line 36
    .line 37
    invoke-interface {v4}, Lcom/facebook/react/uimanager/O;->getHeightMeasureSpec()Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    if-eqz v5, :cond_1

    .line 42
    .line 43
    const-string v5, "UIImplementation.notifyOnBeforeLayoutRecursive"

    .line 44
    .line 45
    invoke-static {v2, v3, v5}, LU7/b;->a(JLjava/lang/String;)LU7/b$a;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    invoke-interface {v4}, Lcom/facebook/react/uimanager/O;->getReactTag()I

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    invoke-virtual {v5, v0, v6}, LU7/b$a;->a(Ljava/lang/String;I)LU7/b$a;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    invoke-virtual {v5}, LU7/b$a;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 58
    .line 59
    .line 60
    :try_start_1
    invoke-direct {p0, v4}, Lcom/facebook/react/uimanager/e0;->A(Lcom/facebook/react/uimanager/O;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 61
    .line 62
    .line 63
    :try_start_2
    invoke-static {v2, v3}, LU7/a;->i(J)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, v4}, Lcom/facebook/react/uimanager/e0;->d(Lcom/facebook/react/uimanager/O;)V

    .line 67
    .line 68
    .line 69
    const-string v5, "UIImplementation.applyUpdatesRecursive"

    .line 70
    .line 71
    invoke-static {v2, v3, v5}, LU7/b;->a(JLjava/lang/String;)LU7/b$a;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    invoke-interface {v4}, Lcom/facebook/react/uimanager/O;->getReactTag()I

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    invoke-virtual {v5, v0, v6}, LU7/b$a;->a(Ljava/lang/String;I)LU7/b$a;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    invoke-virtual {v5}, LU7/b$a;->c()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 84
    .line 85
    .line 86
    :try_start_3
    new-instance v5, Ljava/util/ArrayList;

    .line 87
    .line 88
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 89
    .line 90
    .line 91
    const/4 v6, 0x0

    .line 92
    invoke-virtual {p0, v4, v6, v6, v5}, Lcom/facebook/react/uimanager/e0;->b(Lcom/facebook/react/uimanager/O;FFLjava/util/List;)V

    .line 93
    .line 94
    .line 95
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v5

    .line 103
    if-eqz v5, :cond_0

    .line 104
    .line 105
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    check-cast v5, Lcom/facebook/react/uimanager/O;

    .line 110
    .line 111
    iget-object v6, p0, Lcom/facebook/react/uimanager/e0;->b:Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 112
    .line 113
    invoke-interface {v5}, Lcom/facebook/react/uimanager/O;->getReactTag()I

    .line 114
    .line 115
    .line 116
    move-result v8

    .line 117
    invoke-interface {v5}, Lcom/facebook/react/uimanager/O;->getScreenX()I

    .line 118
    .line 119
    .line 120
    move-result v9

    .line 121
    invoke-interface {v5}, Lcom/facebook/react/uimanager/O;->getScreenY()I

    .line 122
    .line 123
    .line 124
    move-result v10

    .line 125
    invoke-interface {v5}, Lcom/facebook/react/uimanager/O;->getScreenWidth()I

    .line 126
    .line 127
    .line 128
    move-result v11

    .line 129
    invoke-interface {v5}, Lcom/facebook/react/uimanager/O;->getScreenHeight()I

    .line 130
    .line 131
    .line 132
    move-result v12

    .line 133
    const/4 v7, -0x1

    .line 134
    invoke-static/range {v7 .. v12}, Lcom/facebook/react/uimanager/A;->d(IIIIII)Lcom/facebook/react/uimanager/A;

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    invoke-interface {v6, v5}, Lcom/facebook/react/uimanager/events/EventDispatcher;->d(Lcom/facebook/react/uimanager/events/d;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 139
    .line 140
    .line 141
    goto :goto_1

    .line 142
    :catchall_0
    move-exception v0

    .line 143
    goto :goto_2

    .line 144
    :cond_0
    :try_start_4
    invoke-static {v2, v3}, LU7/a;->i(J)V

    .line 145
    .line 146
    .line 147
    goto :goto_3

    .line 148
    :catchall_1
    move-exception v0

    .line 149
    goto :goto_4

    .line 150
    :goto_2
    invoke-static {v2, v3}, LU7/a;->i(J)V

    .line 151
    .line 152
    .line 153
    throw v0

    .line 154
    :catchall_2
    move-exception v0

    .line 155
    invoke-static {v2, v3}, LU7/a;->i(J)V

    .line 156
    .line 157
    .line 158
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 159
    :cond_1
    :goto_3
    add-int/lit8 v1, v1, 0x1

    .line 160
    .line 161
    goto/16 :goto_0

    .line 162
    .line 163
    :cond_2
    invoke-static {v2, v3}, LU7/a;->i(J)V

    .line 164
    .line 165
    .line 166
    return-void

    .line 167
    :goto_4
    invoke-static {v2, v3}, LU7/a;->i(J)V

    .line 168
    .line 169
    .line 170
    throw v0
.end method

.method public c0(IILcom/facebook/react/bridge/Callback;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->d:Lcom/facebook/react/uimanager/Y;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/Y;->c(I)Lcom/facebook/react/uimanager/O;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->d:Lcom/facebook/react/uimanager/Y;

    .line 8
    .line 9
    invoke-virtual {v0, p2}, Lcom/facebook/react/uimanager/Y;->c(I)Lcom/facebook/react/uimanager/O;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    if-nez p2, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-interface {p1, p2}, Lcom/facebook/react/uimanager/O;->isDescendantOf(Lcom/facebook/react/uimanager/O;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-interface {p3, p1}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_1
    :goto_0
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 35
    .line 36
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-interface {p3, p1}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method protected d(Lcom/facebook/react/uimanager/O;)V
    .locals 7

    .line 1
    const-string v0, "cssRoot.calculateLayout"

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    invoke-static {v1, v2, v0}, LU7/b;->a(JLjava/lang/String;)LU7/b$a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v3, "rootTag"

    .line 10
    .line 11
    invoke-interface {p1}, Lcom/facebook/react/uimanager/O;->getReactTag()I

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    invoke-virtual {v0, v3, v4}, LU7/b$a;->a(Ljava/lang/String;I)LU7/b$a;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, LU7/b$a;->c()V

    .line 20
    .line 21
    .line 22
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 23
    .line 24
    .line 25
    move-result-wide v3

    .line 26
    :try_start_0
    invoke-interface {p1}, Lcom/facebook/react/uimanager/O;->getWidthMeasureSpec()Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-interface {p1}, Lcom/facebook/react/uimanager/O;->getHeightMeasureSpec()Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    invoke-static {v0}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    if-nez v6, :cond_0

    .line 47
    .line 48
    sget v0, Lcom/facebook/yoga/g;->b:F

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    move-exception p1

    .line 52
    goto :goto_2

    .line 53
    :cond_0
    invoke-static {v0}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    int-to-float v0, v0

    .line 58
    :goto_0
    invoke-static {v5}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    if-nez v6, :cond_1

    .line 63
    .line 64
    sget v5, Lcom/facebook/yoga/g;->b:F

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_1
    invoke-static {v5}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    int-to-float v5, v5

    .line 72
    :goto_1
    invoke-interface {p1, v0, v5}, Lcom/facebook/react/uimanager/O;->calculateLayout(FF)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    .line 74
    .line 75
    invoke-static {v1, v2}, LU7/a;->i(J)V

    .line 76
    .line 77
    .line 78
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 79
    .line 80
    .line 81
    move-result-wide v0

    .line 82
    sub-long/2addr v0, v3

    .line 83
    iput-wide v0, p0, Lcom/facebook/react/uimanager/e0;->i:J

    .line 84
    .line 85
    return-void

    .line 86
    :goto_2
    invoke-static {v1, v2}, LU7/a;->i(J)V

    .line 87
    .line 88
    .line 89
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 90
    .line 91
    .line 92
    move-result-wide v0

    .line 93
    sub-long/2addr v0, v3

    .line 94
    iput-wide v0, p0, Lcom/facebook/react/uimanager/e0;->i:J

    .line 95
    .line 96
    throw p1
.end method

.method public f()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->f:Lcom/facebook/react/uimanager/j0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/j0;->A()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public g(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Callback;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->f:Lcom/facebook/react/uimanager/j0;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/uimanager/j0;->B(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Callback;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method protected h()Lcom/facebook/react/uimanager/O;
    .locals 3

    .line 1
    new-instance v0, Lcom/facebook/react/uimanager/P;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/facebook/react/uimanager/P;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/facebook/react/modules/i18nmanager/a;->f()Lcom/facebook/react/modules/i18nmanager/a;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iget-object v2, p0, Lcom/facebook/react/uimanager/e0;->c:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Lcom/facebook/react/modules/i18nmanager/a;->i(Landroid/content/Context;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    sget-object v1, Lcom/facebook/yoga/h;->d:Lcom/facebook/yoga/h;

    .line 19
    .line 20
    invoke-interface {v0, v1}, Lcom/facebook/react/uimanager/O;->setLayoutDirection(Lcom/facebook/yoga/h;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    const-string v1, "Root"

    .line 24
    .line 25
    invoke-interface {v0, v1}, Lcom/facebook/react/uimanager/O;->setViewClassName(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-object v0
.end method

.method protected i(Ljava/lang/String;)Lcom/facebook/react/uimanager/O;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->e:Lcom/facebook/react/uimanager/y0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/y0;->g(Ljava/lang/String;)Lcom/facebook/react/uimanager/ViewManager;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->c:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Lcom/facebook/react/uimanager/ViewManager;->createShadowNodeInstance(Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/uimanager/O;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public j(ILjava/lang/String;ILcom/facebook/react/bridge/ReadableMap;)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/uimanager/e0;->j:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->a:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    invoke-virtual {p0, p2}, Lcom/facebook/react/uimanager/e0;->i(Ljava/lang/String;)Lcom/facebook/react/uimanager/O;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p0, Lcom/facebook/react/uimanager/e0;->d:Lcom/facebook/react/uimanager/Y;

    .line 14
    .line 15
    invoke-virtual {v2, p3}, Lcom/facebook/react/uimanager/Y;->c(I)Lcom/facebook/react/uimanager/O;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    new-instance v3, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v4, "Root node with tag "

    .line 25
    .line 26
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v4, " doesn\'t exist"

    .line 33
    .line 34
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-static {v2, v3}, LQ6/a;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    invoke-interface {v1, p1}, Lcom/facebook/react/uimanager/O;->setReactTag(I)V

    .line 45
    .line 46
    .line 47
    invoke-interface {v1, p2}, Lcom/facebook/react/uimanager/O;->setViewClassName(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-interface {v2}, Lcom/facebook/react/uimanager/O;->getReactTag()I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    invoke-interface {v1, p1}, Lcom/facebook/react/uimanager/O;->setRootTag(I)V

    .line 55
    .line 56
    .line 57
    invoke-interface {v2}, Lcom/facebook/react/uimanager/O;->getThemedContext()Lcom/facebook/react/uimanager/b0;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-interface {v1, p1}, Lcom/facebook/react/uimanager/O;->setThemedContext(Lcom/facebook/react/uimanager/b0;)V

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, Lcom/facebook/react/uimanager/e0;->d:Lcom/facebook/react/uimanager/Y;

    .line 65
    .line 66
    invoke-virtual {p1, v1}, Lcom/facebook/react/uimanager/Y;->a(Lcom/facebook/react/uimanager/O;)V

    .line 67
    .line 68
    .line 69
    if-eqz p4, :cond_1

    .line 70
    .line 71
    new-instance p1, Lcom/facebook/react/uimanager/Q;

    .line 72
    .line 73
    invoke-direct {p1, p4}, Lcom/facebook/react/uimanager/Q;-><init>(Lcom/facebook/react/bridge/ReadableMap;)V

    .line 74
    .line 75
    .line 76
    invoke-interface {v1, p1}, Lcom/facebook/react/uimanager/O;->updateProperties(Lcom/facebook/react/uimanager/Q;)V

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :catchall_0
    move-exception p1

    .line 81
    goto :goto_1

    .line 82
    :cond_1
    const/4 p1, 0x0

    .line 83
    :goto_0
    invoke-virtual {p0, v1, p3, p1}, Lcom/facebook/react/uimanager/e0;->s(Lcom/facebook/react/uimanager/O;ILcom/facebook/react/uimanager/Q;)V

    .line 84
    .line 85
    .line 86
    monitor-exit v0

    .line 87
    return-void

    .line 88
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    throw p1
.end method

.method public k(IILcom/facebook/react/bridge/ReadableArray;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "dispatchViewManagerCommand: "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-direct {p0, p1, v0}, Lcom/facebook/react/uimanager/e0;->e(ILjava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->f:Lcom/facebook/react/uimanager/j0;

    .line 26
    .line 27
    invoke-virtual {v0, p1, p2, p3}, Lcom/facebook/react/uimanager/j0;->D(IILcom/facebook/react/bridge/ReadableArray;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public l(ILjava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "dispatchViewManagerCommand: "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-direct {p0, p1, v0}, Lcom/facebook/react/uimanager/e0;->e(ILjava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->f:Lcom/facebook/react/uimanager/j0;

    .line 26
    .line 27
    invoke-virtual {v0, p1, p2, p3}, Lcom/facebook/react/uimanager/j0;->E(ILjava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public m(I)V
    .locals 9

    .line 1
    const-string v0, "UIImplementation.dispatchViewUpdates"

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    invoke-static {v1, v2, v0}, LU7/b;->a(JLjava/lang/String;)LU7/b$a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v3, "batchId"

    .line 10
    .line 11
    invoke-virtual {v0, v3, p1}, LU7/b$a;->a(Ljava/lang/String;I)LU7/b$a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, LU7/b$a;->c()V

    .line 16
    .line 17
    .line 18
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 19
    .line 20
    .line 21
    move-result-wide v5

    .line 22
    :try_start_0
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/e0;->b0()V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->g:Lcom/facebook/react/uimanager/z;

    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/z;->o()V

    .line 28
    .line 29
    .line 30
    iget-object v3, p0, Lcom/facebook/react/uimanager/e0;->f:Lcom/facebook/react/uimanager/j0;

    .line 31
    .line 32
    iget-wide v7, p0, Lcom/facebook/react/uimanager/e0;->i:J

    .line 33
    .line 34
    move v4, p1

    .line 35
    invoke-virtual/range {v3 .. v8}, Lcom/facebook/react/uimanager/j0;->z(IJJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    .line 38
    invoke-static {v1, v2}, LU7/a;->i(J)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :catchall_0
    move-exception v0

    .line 43
    move-object p1, v0

    .line 44
    invoke-static {v1, v2}, LU7/a;->i(J)V

    .line 45
    .line 46
    .line 47
    throw p1
.end method

.method public o(IFFLcom/facebook/react/bridge/Callback;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->f:Lcom/facebook/react/uimanager/j0;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/facebook/react/uimanager/j0;->F(IFFLcom/facebook/react/bridge/Callback;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public p()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->f:Lcom/facebook/react/uimanager/j0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/j0;->T()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public q()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->f:Lcom/facebook/react/uimanager/j0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/j0;->S()Lcom/facebook/react/uimanager/y;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/y;->o()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method r()Lcom/facebook/react/uimanager/j0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->f:Lcom/facebook/react/uimanager/j0;

    .line 2
    .line 3
    return-object v0
.end method

.method protected s(Lcom/facebook/react/uimanager/O;ILcom/facebook/react/uimanager/Q;)V
    .locals 1

    .line 1
    invoke-interface {p1}, Lcom/facebook/react/uimanager/O;->isVirtual()Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    if-nez p2, :cond_0

    .line 6
    .line 7
    iget-object p2, p0, Lcom/facebook/react/uimanager/e0;->g:Lcom/facebook/react/uimanager/z;

    .line 8
    .line 9
    invoke-interface {p1}, Lcom/facebook/react/uimanager/O;->getThemedContext()Lcom/facebook/react/uimanager/b0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p2, p1, v0, p3}, Lcom/facebook/react/uimanager/z;->g(Lcom/facebook/react/uimanager/O;Lcom/facebook/react/uimanager/b0;Lcom/facebook/react/uimanager/Q;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method protected t(Lcom/facebook/react/uimanager/O;Ljava/lang/String;Lcom/facebook/react/uimanager/Q;)V
    .locals 1

    .line 1
    invoke-interface {p1}, Lcom/facebook/react/uimanager/O;->isVirtual()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->g:Lcom/facebook/react/uimanager/z;

    .line 8
    .line 9
    invoke-virtual {v0, p1, p2, p3}, Lcom/facebook/react/uimanager/z;->m(Lcom/facebook/react/uimanager/O;Ljava/lang/String;Lcom/facebook/react/uimanager/Q;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public u(ILcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    move-object/from16 v4, p4

    .line 10
    .line 11
    move-object/from16 v5, p5

    .line 12
    .line 13
    move-object/from16 v6, p6

    .line 14
    .line 15
    iget-boolean v7, v1, Lcom/facebook/react/uimanager/e0;->j:Z

    .line 16
    .line 17
    if-nez v7, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-object v7, v1, Lcom/facebook/react/uimanager/e0;->a:Ljava/lang/Object;

    .line 21
    .line 22
    monitor-enter v7

    .line 23
    :try_start_0
    iget-object v8, v1, Lcom/facebook/react/uimanager/e0;->d:Lcom/facebook/react/uimanager/Y;

    .line 24
    .line 25
    invoke-virtual {v8, v0}, Lcom/facebook/react/uimanager/Y;->c(I)Lcom/facebook/react/uimanager/O;

    .line 26
    .line 27
    .line 28
    move-result-object v8

    .line 29
    if-nez v2, :cond_1

    .line 30
    .line 31
    const/4 v10, 0x0

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    invoke-interface {v2}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 34
    .line 35
    .line 36
    move-result v10

    .line 37
    :goto_0
    if-nez v4, :cond_2

    .line 38
    .line 39
    const/4 v11, 0x0

    .line 40
    goto :goto_1

    .line 41
    :cond_2
    invoke-interface {v4}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 42
    .line 43
    .line 44
    move-result v11

    .line 45
    :goto_1
    if-nez v6, :cond_3

    .line 46
    .line 47
    const/4 v12, 0x0

    .line 48
    goto :goto_2

    .line 49
    :cond_3
    invoke-interface {v6}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 50
    .line 51
    .line 52
    move-result v12

    .line 53
    :goto_2
    if-eqz v10, :cond_5

    .line 54
    .line 55
    if-eqz v3, :cond_4

    .line 56
    .line 57
    invoke-interface {v3}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 58
    .line 59
    .line 60
    move-result v13

    .line 61
    if-ne v10, v13, :cond_4

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :catchall_0
    move-exception v0

    .line 65
    goto/16 :goto_d

    .line 66
    .line 67
    :cond_4
    new-instance v0, Lcom/facebook/react/uimanager/o;

    .line 68
    .line 69
    const-string v2, "Size of moveFrom != size of moveTo!"

    .line 70
    .line 71
    invoke-direct {v0, v2}, Lcom/facebook/react/uimanager/o;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw v0

    .line 75
    :cond_5
    :goto_3
    if-eqz v11, :cond_7

    .line 76
    .line 77
    if-eqz v5, :cond_6

    .line 78
    .line 79
    invoke-interface {v5}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 80
    .line 81
    .line 82
    move-result v13

    .line 83
    if-ne v11, v13, :cond_6

    .line 84
    .line 85
    goto :goto_4

    .line 86
    :cond_6
    new-instance v0, Lcom/facebook/react/uimanager/o;

    .line 87
    .line 88
    const-string v2, "Size of addChildTags != size of addAtIndices!"

    .line 89
    .line 90
    invoke-direct {v0, v2}, Lcom/facebook/react/uimanager/o;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw v0

    .line 94
    :cond_7
    :goto_4
    add-int v13, v10, v11

    .line 95
    .line 96
    new-array v14, v13, [Lcom/facebook/react/uimanager/m0;

    .line 97
    .line 98
    add-int v15, v10, v12

    .line 99
    .line 100
    new-array v9, v15, [I

    .line 101
    .line 102
    move-object/from16 v16, v9

    .line 103
    .line 104
    new-array v9, v15, [I

    .line 105
    .line 106
    move-object/from16 v17, v9

    .line 107
    .line 108
    new-array v9, v12, [I

    .line 109
    .line 110
    if-lez v10, :cond_9

    .line 111
    .line 112
    invoke-static {v2}, LQ6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    invoke-static {v3}, LQ6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-object/from16 v18, v9

    .line 119
    .line 120
    const/4 v9, 0x0

    .line 121
    :goto_5
    if-ge v9, v10, :cond_8

    .line 122
    .line 123
    move/from16 v19, v10

    .line 124
    .line 125
    invoke-interface {v2, v9}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 126
    .line 127
    .line 128
    move-result v10

    .line 129
    invoke-interface {v8, v10}, Lcom/facebook/react/uimanager/O;->getChildAt(I)Lcom/facebook/react/uimanager/O;

    .line 130
    .line 131
    .line 132
    move-result-object v20

    .line 133
    invoke-interface/range {v20 .. v20}, Lcom/facebook/react/uimanager/O;->getReactTag()I

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    move/from16 v20, v10

    .line 138
    .line 139
    new-instance v10, Lcom/facebook/react/uimanager/m0;

    .line 140
    .line 141
    move/from16 v21, v15

    .line 142
    .line 143
    invoke-interface {v3, v9}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 144
    .line 145
    .line 146
    move-result v15

    .line 147
    invoke-direct {v10, v2, v15}, Lcom/facebook/react/uimanager/m0;-><init>(II)V

    .line 148
    .line 149
    .line 150
    aput-object v10, v14, v9

    .line 151
    .line 152
    aput v20, v16, v9

    .line 153
    .line 154
    aput v2, v17, v9

    .line 155
    .line 156
    add-int/lit8 v9, v9, 0x1

    .line 157
    .line 158
    move-object/from16 v2, p2

    .line 159
    .line 160
    move/from16 v10, v19

    .line 161
    .line 162
    move/from16 v15, v21

    .line 163
    .line 164
    goto :goto_5

    .line 165
    :cond_8
    :goto_6
    move/from16 v19, v10

    .line 166
    .line 167
    move/from16 v21, v15

    .line 168
    .line 169
    goto :goto_7

    .line 170
    :cond_9
    move-object/from16 v18, v9

    .line 171
    .line 172
    goto :goto_6

    .line 173
    :goto_7
    if-lez v11, :cond_a

    .line 174
    .line 175
    invoke-static {v4}, LQ6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    invoke-static {v5}, LQ6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    const/4 v2, 0x0

    .line 182
    :goto_8
    if-ge v2, v11, :cond_a

    .line 183
    .line 184
    invoke-interface {v4, v2}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 185
    .line 186
    .line 187
    move-result v3

    .line 188
    invoke-interface {v5, v2}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 189
    .line 190
    .line 191
    move-result v9

    .line 192
    add-int v10, v19, v2

    .line 193
    .line 194
    new-instance v15, Lcom/facebook/react/uimanager/m0;

    .line 195
    .line 196
    invoke-direct {v15, v3, v9}, Lcom/facebook/react/uimanager/m0;-><init>(II)V

    .line 197
    .line 198
    .line 199
    aput-object v15, v14, v10

    .line 200
    .line 201
    add-int/lit8 v2, v2, 0x1

    .line 202
    .line 203
    goto :goto_8

    .line 204
    :cond_a
    if-lez v12, :cond_b

    .line 205
    .line 206
    invoke-static {v6}, LQ6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    const/4 v2, 0x0

    .line 210
    :goto_9
    if-ge v2, v12, :cond_b

    .line 211
    .line 212
    invoke-interface {v6, v2}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 213
    .line 214
    .line 215
    move-result v3

    .line 216
    invoke-interface {v8, v3}, Lcom/facebook/react/uimanager/O;->getChildAt(I)Lcom/facebook/react/uimanager/O;

    .line 217
    .line 218
    .line 219
    move-result-object v4

    .line 220
    invoke-interface {v4}, Lcom/facebook/react/uimanager/O;->getReactTag()I

    .line 221
    .line 222
    .line 223
    move-result v4

    .line 224
    add-int v10, v19, v2

    .line 225
    .line 226
    aput v3, v16, v10

    .line 227
    .line 228
    aput v4, v17, v10

    .line 229
    .line 230
    aput v4, v18, v2

    .line 231
    .line 232
    add-int/lit8 v2, v2, 0x1

    .line 233
    .line 234
    goto :goto_9

    .line 235
    :cond_b
    sget-object v2, Lcom/facebook/react/uimanager/m0;->d:Ljava/util/Comparator;

    .line 236
    .line 237
    invoke-static {v14, v2}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 238
    .line 239
    .line 240
    invoke-static/range {v16 .. v16}, Ljava/util/Arrays;->sort([I)V

    .line 241
    .line 242
    .line 243
    add-int/lit8 v15, v21, -0x1

    .line 244
    .line 245
    const/4 v2, -0x1

    .line 246
    :goto_a
    if-ltz v15, :cond_d

    .line 247
    .line 248
    aget v3, v16, v15

    .line 249
    .line 250
    if-eq v3, v2, :cond_c

    .line 251
    .line 252
    invoke-interface {v8, v3}, Lcom/facebook/react/uimanager/O;->removeChildAt(I)Lcom/facebook/react/uimanager/O;

    .line 253
    .line 254
    .line 255
    aget v2, v16, v15

    .line 256
    .line 257
    add-int/lit8 v15, v15, -0x1

    .line 258
    .line 259
    goto :goto_a

    .line 260
    :cond_c
    new-instance v2, Lcom/facebook/react/uimanager/o;

    .line 261
    .line 262
    new-instance v3, Ljava/lang/StringBuilder;

    .line 263
    .line 264
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 265
    .line 266
    .line 267
    const-string v4, "Repeated indices in Removal list for view tag: "

    .line 268
    .line 269
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    invoke-direct {v2, v0}, Lcom/facebook/react/uimanager/o;-><init>(Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    throw v2

    .line 283
    :cond_d
    const/4 v0, 0x0

    .line 284
    :goto_b
    if-ge v0, v13, :cond_f

    .line 285
    .line 286
    aget-object v2, v14, v0

    .line 287
    .line 288
    iget-object v3, v1, Lcom/facebook/react/uimanager/e0;->d:Lcom/facebook/react/uimanager/Y;

    .line 289
    .line 290
    iget v4, v2, Lcom/facebook/react/uimanager/m0;->a:I

    .line 291
    .line 292
    invoke-virtual {v3, v4}, Lcom/facebook/react/uimanager/Y;->c(I)Lcom/facebook/react/uimanager/O;

    .line 293
    .line 294
    .line 295
    move-result-object v3

    .line 296
    if-eqz v3, :cond_e

    .line 297
    .line 298
    iget v2, v2, Lcom/facebook/react/uimanager/m0;->b:I

    .line 299
    .line 300
    invoke-interface {v8, v3, v2}, Lcom/facebook/react/uimanager/O;->addChildAt(Lcom/facebook/react/uimanager/O;I)V

    .line 301
    .line 302
    .line 303
    add-int/lit8 v0, v0, 0x1

    .line 304
    .line 305
    goto :goto_b

    .line 306
    :cond_e
    new-instance v0, Lcom/facebook/react/uimanager/o;

    .line 307
    .line 308
    new-instance v3, Ljava/lang/StringBuilder;

    .line 309
    .line 310
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 311
    .line 312
    .line 313
    const-string v4, "Trying to add unknown view tag: "

    .line 314
    .line 315
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    .line 318
    iget v2, v2, Lcom/facebook/react/uimanager/m0;->a:I

    .line 319
    .line 320
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 321
    .line 322
    .line 323
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v2

    .line 327
    invoke-direct {v0, v2}, Lcom/facebook/react/uimanager/o;-><init>(Ljava/lang/String;)V

    .line 328
    .line 329
    .line 330
    throw v0

    .line 331
    :cond_f
    iget-object v0, v1, Lcom/facebook/react/uimanager/e0;->g:Lcom/facebook/react/uimanager/z;

    .line 332
    .line 333
    move-object/from16 p1, v0

    .line 334
    .line 335
    move-object/from16 p2, v8

    .line 336
    .line 337
    move-object/from16 p5, v14

    .line 338
    .line 339
    move-object/from16 p3, v16

    .line 340
    .line 341
    move-object/from16 p4, v17

    .line 342
    .line 343
    move-object/from16 p6, v18

    .line 344
    .line 345
    invoke-virtual/range {p1 .. p6}, Lcom/facebook/react/uimanager/z;->i(Lcom/facebook/react/uimanager/O;[I[I[Lcom/facebook/react/uimanager/m0;[I)V

    .line 346
    .line 347
    .line 348
    move-object/from16 v18, p6

    .line 349
    .line 350
    const/4 v9, 0x0

    .line 351
    :goto_c
    if-ge v9, v12, :cond_10

    .line 352
    .line 353
    iget-object v0, v1, Lcom/facebook/react/uimanager/e0;->d:Lcom/facebook/react/uimanager/Y;

    .line 354
    .line 355
    aget v2, v18, v9

    .line 356
    .line 357
    invoke-virtual {v0, v2}, Lcom/facebook/react/uimanager/Y;->c(I)Lcom/facebook/react/uimanager/O;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    invoke-virtual {v1, v0}, Lcom/facebook/react/uimanager/e0;->K(Lcom/facebook/react/uimanager/O;)V

    .line 362
    .line 363
    .line 364
    add-int/lit8 v9, v9, 0x1

    .line 365
    .line 366
    goto :goto_c

    .line 367
    :cond_10
    monitor-exit v7

    .line 368
    return-void

    .line 369
    :goto_d
    monitor-exit v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 370
    throw v0
.end method

.method public v(ILcom/facebook/react/bridge/Callback;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/uimanager/e0;->j:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->f:Lcom/facebook/react/uimanager/j0;

    .line 7
    .line 8
    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/uimanager/j0;->H(ILcom/facebook/react/bridge/Callback;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public w(ILcom/facebook/react/bridge/Callback;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/uimanager/e0;->j:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->f:Lcom/facebook/react/uimanager/j0;

    .line 7
    .line 8
    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/uimanager/j0;->I(ILcom/facebook/react/bridge/Callback;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public x(IILcom/facebook/react/bridge/Callback;Lcom/facebook/react/bridge/Callback;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/uimanager/e0;->j:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->h:[I

    .line 7
    .line 8
    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/react/uimanager/e0;->y(II[I)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/facebook/react/uimanager/e0;->h:[I

    .line 12
    .line 13
    const/4 p2, 0x0

    .line 14
    aget p1, p1, p2

    .line 15
    .line 16
    int-to-float p1, p1

    .line 17
    invoke-static {p1}, Lcom/facebook/react/uimanager/B;->g(F)F

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    iget-object p2, p0, Lcom/facebook/react/uimanager/e0;->h:[I

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    aget p2, p2, v0

    .line 25
    .line 26
    int-to-float p2, p2

    .line 27
    invoke-static {p2}, Lcom/facebook/react/uimanager/B;->g(F)F

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->h:[I

    .line 32
    .line 33
    const/4 v1, 0x2

    .line 34
    aget v0, v0, v1

    .line 35
    .line 36
    int-to-float v0, v0

    .line 37
    invoke-static {v0}, Lcom/facebook/react/uimanager/B;->g(F)F

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    iget-object v1, p0, Lcom/facebook/react/uimanager/e0;->h:[I

    .line 42
    .line 43
    const/4 v2, 0x3

    .line 44
    aget v1, v1, v2

    .line 45
    .line 46
    int-to-float v1, v1

    .line 47
    invoke-static {v1}, Lcom/facebook/react/uimanager/B;->g(F)F

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    filled-new-array {p1, p2, v0, v1}, [Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-interface {p4, p1}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/facebook/react/uimanager/o; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :catch_0
    move-exception p1

    .line 76
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-interface {p3, p1}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    return-void
.end method
