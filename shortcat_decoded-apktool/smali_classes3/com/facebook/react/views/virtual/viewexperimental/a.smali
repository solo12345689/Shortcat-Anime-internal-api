.class public final Lcom/facebook/react/views/virtual/viewexperimental/a;
.super Lcom/facebook/react/views/view/g;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/facebook/react/views/scroll/r;
.implements Landroid/view/View$OnLayoutChangeListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/virtual/viewexperimental/a$a;
    }
.end annotation


# instance fields
.field private a:LQ7/a;

.field private b:LQ7/b;

.field private c:LQ7/e;

.field private d:Lcom/facebook/react/views/scroll/s;

.field private final e:Landroid/graphics/Rect;

.field private final f:Landroid/graphics/Rect;

.field private final g:Landroid/graphics/Rect;

.field private h:I

.field private i:I

.field private j:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    const-string v0, "context"

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
    sget-object p1, LQ7/e;->b:LQ7/e;

    .line 10
    .line 11
    iput-object p1, p0, Lcom/facebook/react/views/virtual/viewexperimental/a;->c:LQ7/e;

    .line 12
    .line 13
    new-instance p1, Landroid/graphics/Rect;

    .line 14
    .line 15
    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lcom/facebook/react/views/virtual/viewexperimental/a;->e:Landroid/graphics/Rect;

    .line 19
    .line 20
    new-instance p1, Landroid/graphics/Rect;

    .line 21
    .line 22
    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lcom/facebook/react/views/virtual/viewexperimental/a;->f:Landroid/graphics/Rect;

    .line 26
    .line 27
    new-instance p1, Landroid/graphics/Rect;

    .line 28
    .line 29
    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Lcom/facebook/react/views/virtual/viewexperimental/a;->g:Landroid/graphics/Rect;

    .line 33
    .line 34
    return-void
.end method

.method private final B()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/facebook/react/views/virtual/viewexperimental/a;->E(Z)Lcom/facebook/react/views/scroll/s;

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method private final D()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/virtual/viewexperimental/a;->e:Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/viewexperimental/a;->getContainerRelativeRect()Landroid/graphics/Rect;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-static {}, Lcom/facebook/react/views/virtual/viewexperimental/b;->a()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    invoke-static {}, Lh7/b;->B()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/viewexperimental/a;->getVirtualViewID()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    new-instance v1, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    const-string v2, "ReactVirtualViewExperimental:["

    .line 35
    .line 36
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v0, "]:"

    .line 43
    .line 44
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v0, "reportRectChangeToContainer"

    .line 48
    .line 49
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/viewexperimental/a;->getContainerRelativeRect()Landroid/graphics/Rect;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    new-instance v2, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    const-string v3, "no rect change "

    .line 66
    .line 67
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-static {v0, v1}, Lz5/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/virtual/viewexperimental/a;->d:Lcom/facebook/react/views/scroll/s;

    .line 82
    .line 83
    if-eqz v0, :cond_2

    .line 84
    .line 85
    if-eqz v0, :cond_1

    .line 86
    .line 87
    invoke-interface {v0}, Lcom/facebook/react/views/scroll/s;->getVirtualViewContainerState()Lcom/facebook/react/views/scroll/v;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    if-eqz v0, :cond_1

    .line 92
    .line 93
    invoke-virtual {v0, p0}, Lcom/facebook/react/views/scroll/v;->m(Lcom/facebook/react/views/scroll/r;)V

    .line 94
    .line 95
    .line 96
    :cond_1
    iget-object v0, p0, Lcom/facebook/react/views/virtual/viewexperimental/a;->e:Landroid/graphics/Rect;

    .line 97
    .line 98
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/viewexperimental/a;->getContainerRelativeRect()Landroid/graphics/Rect;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-virtual {v0, v1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 103
    .line 104
    .line 105
    :cond_2
    return-void
.end method

.method private final E(Z)Lcom/facebook/react/views/scroll/s;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    instance-of v2, v0, Lcom/facebook/react/views/scroll/s;

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    check-cast v0, Lcom/facebook/react/views/scroll/s;

    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    instance-of v2, v0, Lcom/facebook/react/uimanager/M;

    .line 16
    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    return-object v1

    .line 20
    :cond_1
    instance-of v1, v0, Landroid/view/View;

    .line 21
    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    move-object v1, v0

    .line 25
    check-cast v1, Landroid/view/View;

    .line 26
    .line 27
    invoke-virtual {v1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 28
    .line 29
    .line 30
    if-eqz p1, :cond_2

    .line 31
    .line 32
    invoke-virtual {v1, p0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 33
    .line 34
    .line 35
    :cond_2
    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    goto :goto_0

    .line 40
    :cond_3
    return-object v1
.end method

.method private final F()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/virtual/viewexperimental/a;->d:Lcom/facebook/react/views/scroll/s;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v1, 0x0

    .line 7
    iput v1, p0, Lcom/facebook/react/views/virtual/viewexperimental/a;->h:I

    .line 8
    .line 9
    iput v1, p0, Lcom/facebook/react/views/virtual/viewexperimental/a;->i:I

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    :goto_0
    if-eqz v1, :cond_2

    .line 16
    .line 17
    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-nez v2, :cond_2

    .line 22
    .line 23
    instance-of v2, v1, Landroid/view/View;

    .line 24
    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    iget v2, p0, Lcom/facebook/react/views/virtual/viewexperimental/a;->h:I

    .line 28
    .line 29
    move-object v3, v1

    .line 30
    check-cast v3, Landroid/view/View;

    .line 31
    .line 32
    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    add-int/2addr v2, v4

    .line 37
    iput v2, p0, Lcom/facebook/react/views/virtual/viewexperimental/a;->h:I

    .line 38
    .line 39
    iget v2, p0, Lcom/facebook/react/views/virtual/viewexperimental/a;->i:I

    .line 40
    .line 41
    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    add-int/2addr v2, v3

    .line 46
    iput v2, p0, Lcom/facebook/react/views/virtual/viewexperimental/a;->i:I

    .line 47
    .line 48
    :cond_1
    invoke-interface {v1}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    goto :goto_0

    .line 53
    :cond_2
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/viewexperimental/a;->getContainerRelativeRect()Landroid/graphics/Rect;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    iget v2, p0, Lcom/facebook/react/views/virtual/viewexperimental/a;->h:I

    .line 62
    .line 63
    add-int/2addr v1, v2

    .line 64
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    iget v3, p0, Lcom/facebook/react/views/virtual/viewexperimental/a;->i:I

    .line 69
    .line 70
    add-int/2addr v2, v3

    .line 71
    invoke-virtual {p0}, Landroid/view/View;->getRight()I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    iget v4, p0, Lcom/facebook/react/views/virtual/viewexperimental/a;->h:I

    .line 76
    .line 77
    add-int/2addr v3, v4

    .line 78
    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    iget v5, p0, Lcom/facebook/react/views/virtual/viewexperimental/a;->i:I

    .line 83
    .line 84
    add-int/2addr v4, v5

    .line 85
    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Rect;->set(IIII)V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method private final getScrollView()Lcom/facebook/react/views/scroll/s;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lcom/facebook/react/views/virtual/viewexperimental/a;->E(Z)Lcom/facebook/react/views/scroll/s;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    return-object v0
.end method


# virtual methods
.method public final C()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/views/virtual/viewexperimental/a;->getScrollView()Lcom/facebook/react/views/scroll/s;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, Lcom/facebook/react/views/virtual/viewexperimental/a;->d:Lcom/facebook/react/views/scroll/s;

    .line 6
    .line 7
    iget-boolean v0, p0, Lcom/facebook/react/views/virtual/viewexperimental/a;->j:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-direct {p0}, Lcom/facebook/react/views/virtual/viewexperimental/a;->F()V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Lcom/facebook/react/views/virtual/viewexperimental/a;->D()V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-static {}, Lcom/facebook/react/views/virtual/viewexperimental/b;->a()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-static {}, Lh7/b;->B()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/viewexperimental/a;->getVirtualViewID()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    new-instance v1, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    const-string v2, "ReactVirtualViewExperimental:["

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v0, "]:"

    .line 47
    .line 48
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v0, "doAttachedToWindow"

    .line 52
    .line 53
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    const-string v1, ""

    .line 61
    .line 62
    invoke-static {v0, v1}, Lz5/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    :cond_1
    return-void
.end method

.method public getContainerRelativeRect()Landroid/graphics/Rect;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/virtual/viewexperimental/a;->g:Landroid/graphics/Rect;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMode$ReactAndroid_release()LQ7/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/virtual/viewexperimental/a;->a:LQ7/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getModeChangeEmitter$ReactAndroid_release()LQ7/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/virtual/viewexperimental/a;->b:LQ7/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getNativeId$ReactAndroid_release()Ljava/lang/String;
    .locals 2

    .line 1
    sget v0, Lcom/facebook/react/l;->G:I

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    instance-of v1, v0, Ljava/lang/String;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    check-cast v0, Ljava/lang/String;

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return-object v0
.end method

.method public final getRenderState$ReactAndroid_release()LQ7/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/virtual/viewexperimental/a;->c:LQ7/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public getVirtualViewID()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/viewexperimental/a;->getNativeId$ReactAndroid_release()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "unknown"

    .line 8
    .line 9
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    new-instance v2, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v0, ":::"

    .line 22
    .line 23
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    return-object v0
.end method

.method public i(LQ7/a;Landroid/graphics/Rect;)V
    .locals 8

    .line 1
    const-string v0, "newMode"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "thresholdRect"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/facebook/react/views/virtual/viewexperimental/a;->b:LQ7/b;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto/16 :goto_0

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/virtual/viewexperimental/a;->d:Lcom/facebook/react/views/scroll/s;

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    goto/16 :goto_0

    .line 22
    .line 23
    :cond_1
    sget-object v0, LQ7/a;->b:LQ7/a;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    if-ne p1, v0, :cond_2

    .line 27
    .line 28
    invoke-virtual {p0, v1}, Lcom/facebook/react/views/virtual/viewexperimental/a;->updateClippingRect(Ljava/util/Set;)V

    .line 29
    .line 30
    .line 31
    :cond_2
    iget-object v2, p0, Lcom/facebook/react/views/virtual/viewexperimental/a;->a:LQ7/a;

    .line 32
    .line 33
    const-string v3, "]:"

    .line 34
    .line 35
    const-string v4, "ReactVirtualViewExperimental:["

    .line 36
    .line 37
    const-string v5, "onModeChange"

    .line 38
    .line 39
    if-ne p1, v2, :cond_3

    .line 40
    .line 41
    invoke-static {}, Lcom/facebook/react/views/virtual/viewexperimental/b;->a()Z

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    if-eqz p2, :cond_b

    .line 46
    .line 47
    invoke-static {}, Lh7/b;->B()Z

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    if-eqz p2, :cond_b

    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/viewexperimental/a;->getVirtualViewID()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    new-instance v0, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    new-instance v0, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 81
    .line 82
    .line 83
    const-string v1, "no change "

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-static {p2, p1}, Lz5/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :cond_3
    iput-object p1, p0, Lcom/facebook/react/views/virtual/viewexperimental/a;->a:LQ7/a;

    .line 100
    .line 101
    invoke-static {}, Lcom/facebook/react/views/virtual/viewexperimental/b;->a()Z

    .line 102
    .line 103
    .line 104
    move-result v6

    .line 105
    if-eqz v6, :cond_4

    .line 106
    .line 107
    invoke-static {}, Lh7/b;->B()Z

    .line 108
    .line 109
    .line 110
    move-result v6

    .line 111
    if-eqz v6, :cond_4

    .line 112
    .line 113
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/viewexperimental/a;->getVirtualViewID()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v6

    .line 117
    new-instance v7, Ljava/lang/StringBuilder;

    .line 118
    .line 119
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    new-instance v4, Ljava/lang/StringBuilder;

    .line 139
    .line 140
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    const-string v5, "->"

    .line 147
    .line 148
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    invoke-static {v3, v4}, Lz5/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    :cond_4
    if-ne v2, v0, :cond_5

    .line 162
    .line 163
    invoke-virtual {p0, v1}, Lcom/facebook/react/views/virtual/viewexperimental/a;->updateClippingRect(Ljava/util/Set;)V

    .line 164
    .line 165
    .line 166
    :cond_5
    sget-object v1, Lcom/facebook/react/views/virtual/viewexperimental/a$a;->a:[I

    .line 167
    .line 168
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 169
    .line 170
    .line 171
    move-result p1

    .line 172
    aget p1, v1, p1

    .line 173
    .line 174
    const/4 v1, 0x1

    .line 175
    if-eq p1, v1, :cond_8

    .line 176
    .line 177
    const/4 v1, 0x2

    .line 178
    const/4 v3, 0x0

    .line 179
    if-eq p1, v1, :cond_7

    .line 180
    .line 181
    const/4 v0, 0x3

    .line 182
    if-ne p1, v0, :cond_6

    .line 183
    .line 184
    iget-object p1, p0, Lcom/facebook/react/views/virtual/viewexperimental/a;->b:LQ7/b;

    .line 185
    .line 186
    if-eqz p1, :cond_b

    .line 187
    .line 188
    sget-object v0, LQ7/a;->d:LQ7/a;

    .line 189
    .line 190
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/viewexperimental/a;->getContainerRelativeRect()Landroid/graphics/Rect;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    invoke-interface {p1, v0, v1, p2, v3}, LQ7/b;->a(LQ7/a;Landroid/graphics/Rect;Landroid/graphics/Rect;Z)V

    .line 195
    .line 196
    .line 197
    return-void

    .line 198
    :cond_6
    new-instance p1, LTd/r;

    .line 199
    .line 200
    invoke-direct {p1}, LTd/r;-><init>()V

    .line 201
    .line 202
    .line 203
    throw p1

    .line 204
    :cond_7
    if-eq v2, v0, :cond_b

    .line 205
    .line 206
    iget-object p1, p0, Lcom/facebook/react/views/virtual/viewexperimental/a;->b:LQ7/b;

    .line 207
    .line 208
    if-eqz p1, :cond_b

    .line 209
    .line 210
    sget-object v0, LQ7/a;->c:LQ7/a;

    .line 211
    .line 212
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/viewexperimental/a;->getContainerRelativeRect()Landroid/graphics/Rect;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    invoke-interface {p1, v0, v1, p2, v3}, LQ7/b;->a(LQ7/a;Landroid/graphics/Rect;Landroid/graphics/Rect;Z)V

    .line 217
    .line 218
    .line 219
    return-void

    .line 220
    :cond_8
    iget-object p1, p0, Lcom/facebook/react/views/virtual/viewexperimental/a;->c:LQ7/e;

    .line 221
    .line 222
    sget-object v3, LQ7/e;->b:LQ7/e;

    .line 223
    .line 224
    if-ne p1, v3, :cond_9

    .line 225
    .line 226
    iget-object p1, p0, Lcom/facebook/react/views/virtual/viewexperimental/a;->b:LQ7/b;

    .line 227
    .line 228
    if-eqz p1, :cond_b

    .line 229
    .line 230
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/viewexperimental/a;->getContainerRelativeRect()Landroid/graphics/Rect;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    invoke-interface {p1, v0, v2, p2, v1}, LQ7/b;->a(LQ7/a;Landroid/graphics/Rect;Landroid/graphics/Rect;Z)V

    .line 235
    .line 236
    .line 237
    return-void

    .line 238
    :cond_9
    sget-object v3, LQ7/a;->c:LQ7/a;

    .line 239
    .line 240
    if-ne v2, v3, :cond_a

    .line 241
    .line 242
    sget-object v2, LQ7/e;->c:LQ7/e;

    .line 243
    .line 244
    if-ne p1, v2, :cond_a

    .line 245
    .line 246
    return-void

    .line 247
    :cond_a
    iget-object p1, p0, Lcom/facebook/react/views/virtual/viewexperimental/a;->b:LQ7/b;

    .line 248
    .line 249
    if-eqz p1, :cond_b

    .line 250
    .line 251
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/viewexperimental/a;->getContainerRelativeRect()Landroid/graphics/Rect;

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    invoke-interface {p1, v0, v2, p2, v1}, LQ7/b;->a(LQ7/a;Landroid/graphics/Rect;Landroid/graphics/Rect;Z)V

    .line 256
    .line 257
    .line 258
    :cond_b
    :goto_0
    return-void
.end method

.method protected onAttachedToWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/facebook/react/views/view/g;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/viewexperimental/a;->C()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/viewexperimental/a;->recycleView$ReactAndroid_release()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 3

    .line 1
    invoke-super/range {p0 .. p5}, Lcom/facebook/react/views/view/g;->onLayout(ZIIII)V

    .line 2
    .line 3
    .line 4
    move v0, p5

    .line 5
    move p5, p4

    .line 6
    move p4, p3

    .line 7
    move p3, p2

    .line 8
    move p2, p1

    .line 9
    move-object p1, p0

    .line 10
    const/4 v1, 0x1

    .line 11
    iput-boolean v1, p1, Lcom/facebook/react/views/virtual/viewexperimental/a;->j:Z

    .line 12
    .line 13
    if-eqz p2, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/viewexperimental/a;->getContainerRelativeRect()Landroid/graphics/Rect;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    iget v1, p1, Lcom/facebook/react/views/virtual/viewexperimental/a;->h:I

    .line 20
    .line 21
    add-int/2addr p3, v1

    .line 22
    iget v2, p1, Lcom/facebook/react/views/virtual/viewexperimental/a;->i:I

    .line 23
    .line 24
    add-int/2addr p4, v2

    .line 25
    add-int/2addr p5, v1

    .line 26
    add-int/2addr v0, v2

    .line 27
    invoke-virtual {p2, p3, p4, p5, v0}, Landroid/graphics/Rect;->set(IIII)V

    .line 28
    .line 29
    .line 30
    invoke-static {}, Lcom/facebook/react/views/virtual/viewexperimental/b;->a()Z

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    if-eqz p2, :cond_0

    .line 35
    .line 36
    invoke-static {}, Lh7/b;->B()Z

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    if-eqz p2, :cond_0

    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/viewexperimental/a;->getVirtualViewID()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    new-instance p3, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    .line 50
    .line 51
    const-string p4, "ReactVirtualViewExperimental:["

    .line 52
    .line 53
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string p2, "]:"

    .line 60
    .line 61
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string p2, "onLayout"

    .line 65
    .line 66
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/viewexperimental/a;->getContainerRelativeRect()Landroid/graphics/Rect;

    .line 74
    .line 75
    .line 76
    move-result-object p3

    .line 77
    new-instance p4, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 80
    .line 81
    .line 82
    const-string p5, "containerRelativeRect="

    .line 83
    .line 84
    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p3

    .line 94
    invoke-static {p2, p3}, Lz5/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    :cond_0
    invoke-direct {p0}, Lcom/facebook/react/views/virtual/viewexperimental/a;->D()V

    .line 98
    .line 99
    .line 100
    :cond_1
    return-void
.end method

.method public onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 1
    if-ne p6, p2, :cond_1

    .line 2
    .line 3
    if-eq p7, p3, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    return-void

    .line 7
    :cond_1
    :goto_0
    invoke-direct {p0}, Lcom/facebook/react/views/virtual/viewexperimental/a;->F()V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lcom/facebook/react/views/virtual/viewexperimental/b;->a()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_2

    .line 15
    .line 16
    invoke-static {}, Lh7/b;->B()Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_2

    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/viewexperimental/a;->getVirtualViewID()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    new-instance p2, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string p3, "ReactVirtualViewExperimental:["

    .line 32
    .line 33
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string p1, "]:"

    .line 40
    .line 41
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string p1, "onLayoutChange"

    .line 45
    .line 46
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/viewexperimental/a;->getContainerRelativeRect()Landroid/graphics/Rect;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    new-instance p3, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 60
    .line 61
    .line 62
    const-string p4, "containerRelativeRect="

    .line 63
    .line 64
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    invoke-static {p1, p2}, Lz5/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    :cond_2
    invoke-direct {p0}, Lcom/facebook/react/views/virtual/viewexperimental/a;->D()V

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Lcom/facebook/react/views/view/g;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/viewexperimental/a;->getContainerRelativeRect()Landroid/graphics/Rect;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    iget p3, p0, Lcom/facebook/react/views/virtual/viewexperimental/a;->h:I

    .line 13
    .line 14
    add-int/2addr p2, p3

    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    .line 16
    .line 17
    .line 18
    move-result p3

    .line 19
    iget p4, p0, Lcom/facebook/react/views/virtual/viewexperimental/a;->i:I

    .line 20
    .line 21
    add-int/2addr p3, p4

    .line 22
    invoke-virtual {p0}, Landroid/view/View;->getRight()I

    .line 23
    .line 24
    .line 25
    move-result p4

    .line 26
    iget v0, p0, Lcom/facebook/react/views/virtual/viewexperimental/a;->h:I

    .line 27
    .line 28
    add-int/2addr p4, v0

    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    iget v1, p0, Lcom/facebook/react/views/virtual/viewexperimental/a;->i:I

    .line 34
    .line 35
    add-int/2addr v0, v1

    .line 36
    invoke-virtual {p1, p2, p3, p4, v0}, Landroid/graphics/Rect;->set(IIII)V

    .line 37
    .line 38
    .line 39
    invoke-static {}, Lcom/facebook/react/views/virtual/viewexperimental/b;->a()Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_0

    .line 44
    .line 45
    invoke-static {}, Lh7/b;->B()Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-eqz p1, :cond_0

    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/viewexperimental/a;->getVirtualViewID()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    new-instance p2, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 58
    .line 59
    .line 60
    const-string p3, "ReactVirtualViewExperimental:["

    .line 61
    .line 62
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string p1, "]:"

    .line 69
    .line 70
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string p1, "onSizeChanged"

    .line 74
    .line 75
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/viewexperimental/a;->getContainerRelativeRect()Landroid/graphics/Rect;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    new-instance p3, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 89
    .line 90
    .line 91
    const-string p4, "container="

    .line 92
    .line 93
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    invoke-static {p1, p2}, Lz5/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    :cond_0
    invoke-direct {p0}, Lcom/facebook/react/views/virtual/viewexperimental/a;->D()V

    .line 107
    .line 108
    .line 109
    return-void
.end method

.method public recycleView$ReactAndroid_release()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/views/virtual/viewexperimental/a;->B()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/facebook/react/views/virtual/viewexperimental/a;->d:Lcom/facebook/react/views/scroll/s;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-interface {v0}, Lcom/facebook/react/views/scroll/s;->getVirtualViewContainerState()Lcom/facebook/react/views/scroll/v;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0, p0}, Lcom/facebook/react/views/scroll/v;->o(Lcom/facebook/react/views/scroll/r;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, Lcom/facebook/react/views/virtual/viewexperimental/a;->d:Lcom/facebook/react/views/scroll/s;

    .line 19
    .line 20
    iput-object v0, p0, Lcom/facebook/react/views/virtual/viewexperimental/a;->a:LQ7/a;

    .line 21
    .line 22
    iput-object v0, p0, Lcom/facebook/react/views/virtual/viewexperimental/a;->b:LQ7/b;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput-boolean v0, p0, Lcom/facebook/react/views/virtual/viewexperimental/a;->j:Z

    .line 26
    .line 27
    iget-object v0, p0, Lcom/facebook/react/views/virtual/viewexperimental/a;->e:Landroid/graphics/Rect;

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/graphics/Rect;->setEmpty()V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lcom/facebook/react/views/virtual/viewexperimental/a;->f:Landroid/graphics/Rect;

    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/graphics/Rect;->setEmpty()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/viewexperimental/a;->getContainerRelativeRect()Landroid/graphics/Rect;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, Landroid/graphics/Rect;->setEmpty()V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final setMode$ReactAndroid_release(LQ7/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/virtual/viewexperimental/a;->a:LQ7/a;

    .line 2
    .line 3
    return-void
.end method

.method public final setModeChangeEmitter$ReactAndroid_release(LQ7/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/virtual/viewexperimental/a;->b:LQ7/b;

    .line 2
    .line 3
    return-void
.end method

.method public final setRenderState$ReactAndroid_release(LQ7/e;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/facebook/react/views/virtual/viewexperimental/a;->c:LQ7/e;

    .line 7
    .line 8
    return-void
.end method

.method public updateClippingRect(Ljava/util/Set;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/views/view/g;->get_removeClippedSubviews$ReactAndroid_release()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/virtual/viewexperimental/a;->d:Lcom/facebook/react/views/scroll/s;

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    invoke-super {p0, p1}, Lcom/facebook/react/views/view/g;->updateClippingRect(Ljava/util/Set;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/react/views/view/g;->getClippingRect$ReactAndroid_release()Landroid/graphics/Rect;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v1, "Required value was null."

    .line 21
    .line 22
    if-eqz v0, :cond_7

    .line 23
    .line 24
    iget-object v2, p0, Lcom/facebook/react/views/virtual/viewexperimental/a;->d:Lcom/facebook/react/views/scroll/s;

    .line 25
    .line 26
    if-eqz v2, :cond_6

    .line 27
    .line 28
    const-string v1, "null cannot be cast to non-null type com.facebook.react.uimanager.ReactClippingViewGroup"

    .line 29
    .line 30
    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    check-cast v2, Lcom/facebook/react/uimanager/F;

    .line 34
    .line 35
    invoke-static {}, Lh7/b;->z()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_3

    .line 40
    .line 41
    invoke-interface {v2}, Lcom/facebook/react/uimanager/F;->getRemoveClippedSubviews()Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    invoke-interface {v2, v0}, Lcom/facebook/react/uimanager/F;->getClippingRect(Landroid/graphics/Rect;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    check-cast v2, Landroid/view/View;

    .line 52
    .line 53
    invoke-virtual {v2, v0}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_3
    invoke-interface {v2}, Lcom/facebook/react/uimanager/F;->getRemoveClippedSubviews()Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-nez v1, :cond_4

    .line 62
    .line 63
    invoke-super {p0, p1}, Lcom/facebook/react/views/view/g;->updateClippingRect(Ljava/util/Set;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_4
    invoke-interface {v2, v0}, Lcom/facebook/react/uimanager/F;->getClippingRect(Landroid/graphics/Rect;)V

    .line 68
    .line 69
    .line 70
    :goto_0
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/viewexperimental/a;->getContainerRelativeRect()Landroid/graphics/Rect;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {v0, v1}, Landroid/graphics/Rect;->intersect(Landroid/graphics/Rect;)Z

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/viewexperimental/a;->getContainerRelativeRect()Landroid/graphics/Rect;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    iget v1, v1, Landroid/graphics/Rect;->left:I

    .line 82
    .line 83
    neg-int v1, v1

    .line 84
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/viewexperimental/a;->getContainerRelativeRect()Landroid/graphics/Rect;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    iget v2, v2, Landroid/graphics/Rect;->top:I

    .line 89
    .line 90
    neg-int v2, v2

    .line 91
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Rect;->offset(II)V

    .line 92
    .line 93
    .line 94
    iget-object v1, p0, Lcom/facebook/react/views/virtual/viewexperimental/a;->f:Landroid/graphics/Rect;

    .line 95
    .line 96
    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    if-eqz v1, :cond_5

    .line 101
    .line 102
    :goto_1
    return-void

    .line 103
    :cond_5
    invoke-virtual {p0, v0, p1}, Lcom/facebook/react/views/view/g;->updateClippingToRect$ReactAndroid_release(Landroid/graphics/Rect;Ljava/util/Set;)V

    .line 104
    .line 105
    .line 106
    iget-object p1, p0, Lcom/facebook/react/views/virtual/viewexperimental/a;->f:Landroid/graphics/Rect;

    .line 107
    .line 108
    invoke-virtual {p1, v0}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 113
    .line 114
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    throw p1

    .line 118
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 119
    .line 120
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    throw p1
.end method
