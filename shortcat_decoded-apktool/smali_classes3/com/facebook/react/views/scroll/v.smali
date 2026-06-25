.class public abstract Lcom/facebook/react/views/scroll/v;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/scroll/v$a;
    }
.end annotation


# static fields
.field public static final i:Lcom/facebook/react/views/scroll/v$a;


# instance fields
.field private final a:D

.field private final b:D

.field private final c:Landroid/graphics/Rect;

.field private final d:Landroid/graphics/Rect;

.field private final e:Landroid/graphics/Rect;

.field private final f:Landroid/graphics/Rect;

.field private final g:Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;

.field private final h:Landroid/view/ViewGroup;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/views/scroll/v$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/views/scroll/v$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/views/scroll/v;->i:Lcom/facebook/react/views/scroll/v$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 2

    .line 1
    const-string v0, "scrollView"

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
    invoke-static {}, Lh7/b;->T()D

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    iput-wide v0, p0, Lcom/facebook/react/views/scroll/v;->a:D

    .line 14
    .line 15
    invoke-static {}, Lh7/b;->S()D

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    iput-wide v0, p0, Lcom/facebook/react/views/scroll/v;->b:D

    .line 20
    .line 21
    new-instance v0, Landroid/graphics/Rect;

    .line 22
    .line 23
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lcom/facebook/react/views/scroll/v;->c:Landroid/graphics/Rect;

    .line 27
    .line 28
    new-instance v0, Landroid/graphics/Rect;

    .line 29
    .line 30
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lcom/facebook/react/views/scroll/v;->d:Landroid/graphics/Rect;

    .line 34
    .line 35
    new-instance v0, Landroid/graphics/Rect;

    .line 36
    .line 37
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Lcom/facebook/react/views/scroll/v;->e:Landroid/graphics/Rect;

    .line 41
    .line 42
    new-instance v0, Landroid/graphics/Rect;

    .line 43
    .line 44
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, Lcom/facebook/react/views/scroll/v;->f:Landroid/graphics/Rect;

    .line 48
    .line 49
    invoke-static {}, Lh7/b;->D()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_0

    .line 54
    .line 55
    new-instance v0, Lcom/facebook/react/views/scroll/u;

    .line 56
    .line 57
    invoke-direct {v0, p0}, Lcom/facebook/react/views/scroll/u;-><init>(Lcom/facebook/react/views/scroll/v;)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    const/4 v0, 0x0

    .line 62
    :goto_0
    iput-object v0, p0, Lcom/facebook/react/views/scroll/v;->g:Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;

    .line 63
    .line 64
    iput-object p1, p0, Lcom/facebook/react/views/scroll/v;->h:Landroid/view/ViewGroup;

    .line 65
    .line 66
    if-eqz v0, :cond_1

    .line 67
    .line 68
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {p1, v0}, Landroid/view/ViewTreeObserver;->addOnWindowFocusChangeListener(Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;)V

    .line 73
    .line 74
    .line 75
    :cond_1
    return-void
.end method

.method public static synthetic a(Lcom/facebook/react/views/scroll/v;Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/facebook/react/views/scroll/v;->n(Lcom/facebook/react/views/scroll/v;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final c(Landroid/view/ViewGroup;)Lcom/facebook/react/views/scroll/v;
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/views/scroll/v;->i:Lcom/facebook/react/views/scroll/v$a;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lcom/facebook/react/views/scroll/v$a;->a(Landroid/view/ViewGroup;)Lcom/facebook/react/views/scroll/v;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method private static final n(Lcom/facebook/react/views/scroll/v;Z)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/facebook/react/views/scroll/t;->a()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lh7/b;->B()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    new-instance p1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string v0, "VirtualViewContainerState:"

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v0, "onWindowFocusChanged"

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const-string v0, ""

    .line 33
    .line 34
    invoke-static {p1, v0}, Lz5/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    const/4 p1, 0x1

    .line 38
    const/4 v0, 0x0

    .line 39
    invoke-static {p0, v0, p1, v0}, Lcom/facebook/react/views/scroll/v;->q(Lcom/facebook/react/views/scroll/v;Lcom/facebook/react/views/scroll/r;ILjava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public static synthetic q(Lcom/facebook/react/views/scroll/v;Lcom/facebook/react/views/scroll/r;ILjava/lang/Object;)V
    .locals 0

    .line 1
    if-nez p3, :cond_1

    .line 2
    .line 3
    and-int/lit8 p2, p2, 0x1

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    :cond_0
    invoke-virtual {p0, p1}, Lcom/facebook/react/views/scroll/v;->p(Lcom/facebook/react/views/scroll/r;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 13
    .line 14
    const-string p1, "Super calls with default arguments not supported in this target, function: updateModes"

    .line 15
    .line 16
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p0
.end method


# virtual methods
.method public final b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/v;->g:Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/facebook/react/views/scroll/v;->h:Landroid/view/ViewGroup;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Lcom/facebook/react/views/scroll/v;->g:Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnWindowFocusChangeListener(Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method protected final d()Landroid/graphics/Rect;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/v;->c:Landroid/graphics/Rect;

    .line 2
    .line 3
    return-object v0
.end method

.method protected final e()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/facebook/react/views/scroll/v;->b:D

    .line 2
    .line 3
    return-wide v0
.end method

.method protected final f()Landroid/graphics/Rect;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/v;->f:Landroid/graphics/Rect;

    .line 2
    .line 3
    return-object v0
.end method

.method protected final g()Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/v;->g:Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;

    .line 2
    .line 3
    return-object v0
.end method

.method protected final h()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/facebook/react/views/scroll/v;->a:D

    .line 2
    .line 3
    return-wide v0
.end method

.method protected final i()Landroid/graphics/Rect;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/v;->e:Landroid/graphics/Rect;

    .line 2
    .line 3
    return-object v0
.end method

.method protected final j()Landroid/view/ViewGroup;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/v;->h:Landroid/view/ViewGroup;

    .line 2
    .line 3
    return-object v0
.end method

.method protected abstract k()Ljava/util/Collection;
.end method

.method protected final l()Landroid/graphics/Rect;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/v;->d:Landroid/graphics/Rect;

    .line 2
    .line 3
    return-object v0
.end method

.method public m(Lcom/facebook/react/views/scroll/r;)V
    .locals 4

    .line 1
    const-string v0, "virtualView"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/v;->k()Ljava/util/Collection;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const-string v1, "virtualViewID="

    .line 15
    .line 16
    const-string v2, "VirtualViewContainerState:"

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-static {}, Lcom/facebook/react/views/scroll/t;->a()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-static {}, Lh7/b;->B()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    new-instance v0, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v2, "add"

    .line 41
    .line 42
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-interface {p1}, Lcom/facebook/react/views/scroll/r;->getVirtualViewID()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    new-instance v3, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-static {v0, v1}, Lz5/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    invoke-static {}, Lcom/facebook/react/views/scroll/t;->a()Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_1

    .line 77
    .line 78
    invoke-static {}, Lh7/b;->B()Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_1

    .line 83
    .line 84
    new-instance v0, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v2, "update"

    .line 93
    .line 94
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-interface {p1}, Lcom/facebook/react/views/scroll/r;->getVirtualViewID()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    new-instance v3, Ljava/lang/StringBuilder;

    .line 106
    .line 107
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-static {v0, v1}, Lz5/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    :cond_1
    :goto_0
    invoke-virtual {p0, p1}, Lcom/facebook/react/views/scroll/v;->p(Lcom/facebook/react/views/scroll/r;)V

    .line 124
    .line 125
    .line 126
    return-void
.end method

.method public o(Lcom/facebook/react/views/scroll/r;)V
    .locals 3

    .line 1
    const-string v0, "virtualView"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/v;->k()Ljava/util/Collection;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {v0, p1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    invoke-static {}, Lcom/facebook/react/views/scroll/t;->a()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-static {}, Lh7/b;->B()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    new-instance v0, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    const-string v1, "VirtualViewContainerState:"

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v1, "remove"

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-interface {p1}, Lcom/facebook/react/views/scroll/r;->getVirtualViewID()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    new-instance v1, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 51
    .line 52
    .line 53
    const-string v2, "virtualViewID="

    .line 54
    .line 55
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-static {v0, p1}, Lz5/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    :cond_0
    return-void
.end method

.method protected abstract p(Lcom/facebook/react/views/scroll/r;)V
.end method

.method protected final r()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/v;->h:Landroid/view/ViewGroup;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/facebook/react/views/scroll/v;->d:Landroid/graphics/Rect;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/facebook/react/views/scroll/v;->d:Landroid/graphics/Rect;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/graphics/Rect;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const-string v1, "VirtualViewContainerState:"

    .line 15
    .line 16
    const-string v2, "updateRects"

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-static {}, Lcom/facebook/react/views/scroll/t;->a()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-static {}, Lh7/b;->B()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    new-instance v0, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const-string v1, "scrollView visibleRect is empty"

    .line 48
    .line 49
    invoke-static {v0, v1}, Lz5/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/scroll/v;->e:Landroid/graphics/Rect;

    .line 53
    .line 54
    iget-object v1, p0, Lcom/facebook/react/views/scroll/v;->d:Landroid/graphics/Rect;

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Lcom/facebook/react/views/scroll/v;->f:Landroid/graphics/Rect;

    .line 60
    .line 61
    iget-object v1, p0, Lcom/facebook/react/views/scroll/v;->e:Landroid/graphics/Rect;

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/v;->e:Landroid/graphics/Rect;

    .line 68
    .line 69
    iget-object v3, p0, Lcom/facebook/react/views/scroll/v;->d:Landroid/graphics/Rect;

    .line 70
    .line 71
    invoke-virtual {v0, v3}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 72
    .line 73
    .line 74
    iget-object v0, p0, Lcom/facebook/react/views/scroll/v;->e:Landroid/graphics/Rect;

    .line 75
    .line 76
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    neg-int v3, v3

    .line 81
    int-to-double v3, v3

    .line 82
    iget-wide v5, p0, Lcom/facebook/react/views/scroll/v;->a:D

    .line 83
    .line 84
    mul-double/2addr v3, v5

    .line 85
    double-to-int v3, v3

    .line 86
    iget-object v4, p0, Lcom/facebook/react/views/scroll/v;->e:Landroid/graphics/Rect;

    .line 87
    .line 88
    invoke-virtual {v4}, Landroid/graphics/Rect;->height()I

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    neg-int v4, v4

    .line 93
    int-to-double v4, v4

    .line 94
    iget-wide v6, p0, Lcom/facebook/react/views/scroll/v;->a:D

    .line 95
    .line 96
    mul-double/2addr v4, v6

    .line 97
    double-to-int v4, v4

    .line 98
    invoke-virtual {v0, v3, v4}, Landroid/graphics/Rect;->inset(II)V

    .line 99
    .line 100
    .line 101
    iget-object v0, p0, Lcom/facebook/react/views/scroll/v;->f:Landroid/graphics/Rect;

    .line 102
    .line 103
    iget-object v3, p0, Lcom/facebook/react/views/scroll/v;->e:Landroid/graphics/Rect;

    .line 104
    .line 105
    invoke-virtual {v0, v3}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 106
    .line 107
    .line 108
    iget-object v0, p0, Lcom/facebook/react/views/scroll/v;->f:Landroid/graphics/Rect;

    .line 109
    .line 110
    iget-object v3, p0, Lcom/facebook/react/views/scroll/v;->d:Landroid/graphics/Rect;

    .line 111
    .line 112
    invoke-virtual {v3}, Landroid/graphics/Rect;->width()I

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    neg-int v3, v3

    .line 117
    int-to-double v3, v3

    .line 118
    iget-wide v5, p0, Lcom/facebook/react/views/scroll/v;->b:D

    .line 119
    .line 120
    mul-double/2addr v3, v5

    .line 121
    double-to-int v3, v3

    .line 122
    iget-object v4, p0, Lcom/facebook/react/views/scroll/v;->d:Landroid/graphics/Rect;

    .line 123
    .line 124
    invoke-virtual {v4}, Landroid/graphics/Rect;->height()I

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    neg-int v4, v4

    .line 129
    int-to-double v4, v4

    .line 130
    iget-wide v6, p0, Lcom/facebook/react/views/scroll/v;->b:D

    .line 131
    .line 132
    mul-double/2addr v4, v6

    .line 133
    double-to-int v4, v4

    .line 134
    invoke-virtual {v0, v3, v4}, Landroid/graphics/Rect;->inset(II)V

    .line 135
    .line 136
    .line 137
    invoke-static {}, Lcom/facebook/react/views/scroll/t;->a()Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    if-eqz v0, :cond_2

    .line 142
    .line 143
    invoke-static {}, Lh7/b;->B()Z

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    if-eqz v0, :cond_2

    .line 148
    .line 149
    new-instance v0, Ljava/lang/StringBuilder;

    .line 150
    .line 151
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    iget-object v1, p0, Lcom/facebook/react/views/scroll/v;->d:Landroid/graphics/Rect;

    .line 165
    .line 166
    iget-object v2, p0, Lcom/facebook/react/views/scroll/v;->e:Landroid/graphics/Rect;

    .line 167
    .line 168
    iget-object v3, p0, Lcom/facebook/react/views/scroll/v;->f:Landroid/graphics/Rect;

    .line 169
    .line 170
    new-instance v4, Ljava/lang/StringBuilder;

    .line 171
    .line 172
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 173
    .line 174
    .line 175
    const-string v5, "visibleRect "

    .line 176
    .line 177
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    const-string v1, " prerenderRect "

    .line 184
    .line 185
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    const-string v1, " hysteresisRect "

    .line 192
    .line 193
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    invoke-static {v0, v1}, Lz5/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    :cond_2
    return-void
.end method

.method public final s()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/facebook/react/views/scroll/t;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lh7/b;->B()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string v1, "VirtualViewContainerState:"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, "updateState"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const-string v1, ""

    .line 33
    .line 34
    invoke-static {v0, v1}, Lz5/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    const/4 v0, 0x1

    .line 38
    const/4 v1, 0x0

    .line 39
    invoke-static {p0, v1, v0, v1}, Lcom/facebook/react/views/scroll/v;->q(Lcom/facebook/react/views/scroll/v;Lcom/facebook/react/views/scroll/r;ILjava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method
