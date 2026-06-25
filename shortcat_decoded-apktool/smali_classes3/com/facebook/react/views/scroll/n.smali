.class public final Lcom/facebook/react/views/scroll/n;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/scroll/n$a;,
        Lcom/facebook/react/views/scroll/n$b;,
        Lcom/facebook/react/views/scroll/n$c;,
        Lcom/facebook/react/views/scroll/n$d;,
        Lcom/facebook/react/views/scroll/n$e;,
        Lcom/facebook/react/views/scroll/n$f;,
        Lcom/facebook/react/views/scroll/n$g;,
        Lcom/facebook/react/views/scroll/n$h;,
        Lcom/facebook/react/views/scroll/n$i;
    }
.end annotation


# static fields
.field public static final a:Lcom/facebook/react/views/scroll/n;

.field private static final b:Ljava/lang/String;

.field private static final c:Z

.field private static final d:Ljava/util/concurrent/CopyOnWriteArrayList;

.field private static final e:Ljava/util/concurrent/CopyOnWriteArrayList;

.field private static f:I

.field private static g:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/views/scroll/n;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/facebook/react/views/scroll/n;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/facebook/react/views/scroll/n;->a:Lcom/facebook/react/views/scroll/n;

    .line 7
    .line 8
    const-class v0, Lcom/facebook/react/views/scroll/k;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Lcom/facebook/react/views/scroll/n;->b:Ljava/lang/String;

    .line 15
    .line 16
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lcom/facebook/react/views/scroll/n;->d:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 22
    .line 23
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    sput-object v0, Lcom/facebook/react/views/scroll/n;->e:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 29
    .line 30
    const/16 v0, 0xfa

    .line 31
    .line 32
    sput v0, Lcom/facebook/react/views/scroll/n;->f:I

    .line 33
    .line 34
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final B(Landroid/view/ViewGroup;FF)V
    .locals 3

    .line 1
    sget-object v0, Lcom/facebook/react/views/scroll/n;->a:Lcom/facebook/react/views/scroll/n;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-virtual {v0, p0, v1, v2}, Lcom/facebook/react/views/scroll/n;->A(Landroid/view/ViewGroup;II)V

    .line 12
    .line 13
    .line 14
    invoke-static {p0, p1, p2}, Lcom/facebook/react/views/scroll/n;->h(Landroid/view/ViewGroup;FF)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public static final a(Lcom/facebook/react/views/scroll/n$f;)V
    .locals 2

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/facebook/react/views/scroll/n;->e:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 7
    .line 8
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 9
    .line 10
    invoke-direct {v1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static final b(Lcom/facebook/react/views/scroll/n$i;)V
    .locals 2

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/facebook/react/views/scroll/n;->d:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 7
    .line 8
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 9
    .line 10
    invoke-direct {v1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static final c(Landroid/view/ViewGroup;)V
    .locals 2

    .line 1
    move-object v0, p0

    .line 2
    check-cast v0, Lcom/facebook/react/views/scroll/n$a;

    .line 3
    .line 4
    invoke-interface {v0}, Lcom/facebook/react/views/scroll/n$a;->getFlingAnimator()Landroid/animation/ValueAnimator;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    new-instance v1, Lcom/facebook/react/views/scroll/n$j;

    .line 9
    .line 10
    invoke-direct {v1, p0}, Lcom/facebook/react/views/scroll/n$j;-><init>(Landroid/view/ViewGroup;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static final d(Landroid/view/ViewGroup;)V
    .locals 2

    .line 1
    const-string v0, "scrollView"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/facebook/react/views/scroll/n;->e:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "iterator(...)"

    .line 13
    .line 14
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Lcom/facebook/react/views/scroll/n$f;

    .line 34
    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    invoke-interface {v1, p0}, Lcom/facebook/react/views/scroll/n$f;->k(Landroid/view/ViewGroup;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    return-void
.end method

.method public static final e(Landroid/view/ViewGroup;)V
    .locals 2

    .line 1
    const-string v0, "scrollView"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/facebook/react/views/scroll/n;->d:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "iterator(...)"

    .line 13
    .line 14
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Lcom/facebook/react/views/scroll/n$i;

    .line 34
    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    invoke-interface {v1, p0}, Lcom/facebook/react/views/scroll/n$i;->b(Landroid/view/ViewGroup;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    return-void
.end method

.method public static final f(Landroid/view/ViewGroup;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/react/views/scroll/n;->a:Lcom/facebook/react/views/scroll/n;

    .line 2
    .line 3
    sget-object v1, Lcom/facebook/react/views/scroll/p;->b:Lcom/facebook/react/views/scroll/p;

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Lcom/facebook/react/views/scroll/n;->i(Landroid/view/ViewGroup;Lcom/facebook/react/views/scroll/p;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static final g(Landroid/view/ViewGroup;FF)V
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/react/views/scroll/n;->a:Lcom/facebook/react/views/scroll/n;

    .line 2
    .line 3
    sget-object v1, Lcom/facebook/react/views/scroll/p;->c:Lcom/facebook/react/views/scroll/p;

    .line 4
    .line 5
    invoke-direct {v0, p0, v1, p1, p2}, Lcom/facebook/react/views/scroll/n;->j(Landroid/view/ViewGroup;Lcom/facebook/react/views/scroll/p;FF)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static final h(Landroid/view/ViewGroup;FF)V
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/react/views/scroll/n;->a:Lcom/facebook/react/views/scroll/n;

    .line 2
    .line 3
    sget-object v1, Lcom/facebook/react/views/scroll/p;->d:Lcom/facebook/react/views/scroll/p;

    .line 4
    .line 5
    invoke-direct {v0, p0, v1, p1, p2}, Lcom/facebook/react/views/scroll/n;->j(Landroid/view/ViewGroup;Lcom/facebook/react/views/scroll/p;FF)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private final i(Landroid/view/ViewGroup;Lcom/facebook/react/views/scroll/p;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0, v0}, Lcom/facebook/react/views/scroll/n;->j(Landroid/view/ViewGroup;Lcom/facebook/react/views/scroll/p;FF)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method private final j(Landroid/view/ViewGroup;Lcom/facebook/react/views/scroll/p;FF)V
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v4, p2

    .line 4
    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 6
    .line 7
    .line 8
    move-result-wide v13

    .line 9
    sget-object v1, Lcom/facebook/react/views/scroll/p;->d:Lcom/facebook/react/views/scroll/p;

    .line 10
    .line 11
    if-ne v4, v1, :cond_0

    .line 12
    .line 13
    move-object v1, v0

    .line 14
    check-cast v1, Lcom/facebook/react/views/scroll/n$b;

    .line 15
    .line 16
    invoke-interface {v1}, Lcom/facebook/react/views/scroll/n$b;->getScrollEventThrottle()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    int-to-long v2, v2

    .line 21
    invoke-interface {v1}, Lcom/facebook/react/views/scroll/n$b;->getLastScrollDispatchTime()J

    .line 22
    .line 23
    .line 24
    move-result-wide v5

    .line 25
    sub-long v5, v13, v5

    .line 26
    .line 27
    const-wide/16 v7, 0x11

    .line 28
    .line 29
    invoke-static {v7, v8, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 30
    .line 31
    .line 32
    move-result-wide v5

    .line 33
    cmp-long v1, v2, v5

    .line 34
    .line 35
    if-ltz v1, :cond_0

    .line 36
    .line 37
    goto/16 :goto_1

    .line 38
    .line 39
    :cond_0
    const/4 v1, 0x0

    .line 40
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    if-nez v1, :cond_1

    .line 45
    .line 46
    goto/16 :goto_1

    .line 47
    .line 48
    :cond_1
    sget-object v2, Lcom/facebook/react/views/scroll/n;->d:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 49
    .line 50
    invoke-static {v2}, LUd/u;->b1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    :cond_2
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    if-eqz v3, :cond_3

    .line 63
    .line 64
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    check-cast v3, Ljava/lang/ref/WeakReference;

    .line 69
    .line 70
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    check-cast v3, Lcom/facebook/react/views/scroll/n$i;

    .line 75
    .line 76
    move/from16 v7, p3

    .line 77
    .line 78
    move/from16 v8, p4

    .line 79
    .line 80
    if-eqz v3, :cond_2

    .line 81
    .line 82
    invoke-interface {v3, v0, v4, v7, v8}, Lcom/facebook/react/views/scroll/n$i;->h(Landroid/view/ViewGroup;Lcom/facebook/react/views/scroll/p;FF)V

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_3
    move/from16 v7, p3

    .line 87
    .line 88
    move/from16 v8, p4

    .line 89
    .line 90
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    const-string v3, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext"

    .line 95
    .line 96
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    check-cast v2, Lcom/facebook/react/bridge/ReactContext;

    .line 100
    .line 101
    invoke-static {v2}, Lcom/facebook/react/uimanager/f0;->e(Landroid/content/Context;)I

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    invoke-static {v2, v5}, Lcom/facebook/react/uimanager/f0;->c(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 110
    .line 111
    .line 112
    move-result-object v15

    .line 113
    if-eqz v15, :cond_4

    .line 114
    .line 115
    move-object v2, v1

    .line 116
    sget-object v1, Lcom/facebook/react/views/scroll/o;->k:Lcom/facebook/react/views/scroll/o$a;

    .line 117
    .line 118
    move-object v5, v2

    .line 119
    move v2, v3

    .line 120
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    invoke-virtual {v0}, Landroid/view/View;->getScrollX()I

    .line 125
    .line 126
    .line 127
    move-result v6

    .line 128
    int-to-float v6, v6

    .line 129
    invoke-virtual {v0}, Landroid/view/View;->getScrollY()I

    .line 130
    .line 131
    .line 132
    move-result v9

    .line 133
    int-to-float v9, v9

    .line 134
    move-object v10, v5

    .line 135
    move v5, v6

    .line 136
    move v6, v9

    .line 137
    invoke-virtual {v10}, Landroid/view/View;->getWidth()I

    .line 138
    .line 139
    .line 140
    move-result v9

    .line 141
    invoke-virtual {v10}, Landroid/view/View;->getHeight()I

    .line 142
    .line 143
    .line 144
    move-result v10

    .line 145
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 146
    .line 147
    .line 148
    move-result v11

    .line 149
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 150
    .line 151
    .line 152
    move-result v12

    .line 153
    invoke-virtual/range {v1 .. v12}, Lcom/facebook/react/views/scroll/o$a;->a(IILcom/facebook/react/views/scroll/p;FFFFIIII)Lcom/facebook/react/views/scroll/o;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    invoke-interface {v15, v1}, Lcom/facebook/react/uimanager/events/EventDispatcher;->d(Lcom/facebook/react/uimanager/events/d;)V

    .line 158
    .line 159
    .line 160
    sget-object v1, Lcom/facebook/react/views/scroll/p;->d:Lcom/facebook/react/views/scroll/p;

    .line 161
    .line 162
    if-ne v4, v1, :cond_4

    .line 163
    .line 164
    check-cast v0, Lcom/facebook/react/views/scroll/n$b;

    .line 165
    .line 166
    invoke-interface {v0, v13, v14}, Lcom/facebook/react/views/scroll/n$b;->setLastScrollDispatchTime(J)V

    .line 167
    .line 168
    .line 169
    :cond_4
    :goto_1
    return-void
.end method

.method public static final k(Landroid/view/ViewGroup;II)V
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/react/views/scroll/n;->a:Lcom/facebook/react/views/scroll/n;

    .line 2
    .line 3
    sget-object v1, Lcom/facebook/react/views/scroll/p;->e:Lcom/facebook/react/views/scroll/p;

    .line 4
    .line 5
    int-to-float p1, p1

    .line 6
    int-to-float p2, p2

    .line 7
    invoke-direct {v0, p0, v1, p1, p2}, Lcom/facebook/react/views/scroll/n;->j(Landroid/view/ViewGroup;Lcom/facebook/react/views/scroll/p;FF)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static final l(Landroid/view/ViewGroup;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/react/views/scroll/n;->a:Lcom/facebook/react/views/scroll/n;

    .line 2
    .line 3
    sget-object v1, Lcom/facebook/react/views/scroll/p;->f:Lcom/facebook/react/views/scroll/p;

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Lcom/facebook/react/views/scroll/n;->i(Landroid/view/ViewGroup;Lcom/facebook/react/views/scroll/p;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static final m(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;
    .locals 3

    .line 1
    const-string v0, "host"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "focused"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    instance-of v0, p0, Lcom/facebook/react/uimanager/F;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    return-object v1

    .line 17
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v2, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext"

    .line 22
    .line 23
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    check-cast v0, Lcom/facebook/react/bridge/ReactContext;

    .line 27
    .line 28
    const/4 v2, 0x2

    .line 29
    invoke-static {v0, v2}, Lcom/facebook/react/uimanager/f0;->g(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/bridge/UIManager;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    return-object v1

    .line 36
    :cond_1
    check-cast v0, Lcom/facebook/react/fabric/FabricUIManager;

    .line 37
    .line 38
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    invoke-virtual {v0, v2, p1, p2}, Lcom/facebook/react/fabric/FabricUIManager;->findNextFocusableElement(III)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    if-eqz p1, :cond_2

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    const/4 v2, 0x0

    .line 57
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    invoke-virtual {v0, v2, p2}, Lcom/facebook/react/fabric/FabricUIManager;->getRelativeAncestorList(II)[I

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    if-eqz v0, :cond_2

    .line 70
    .line 71
    invoke-static {v0}, LUd/n;->h1([I)Ljava/util/Set;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    if-eqz v0, :cond_2

    .line 76
    .line 77
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-object p1, p0

    .line 81
    check-cast p1, Lcom/facebook/react/uimanager/F;

    .line 82
    .line 83
    invoke-interface {p1, v0}, Lcom/facebook/react/uimanager/F;->updateClippingRect(Ljava/util/Set;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :cond_2
    return-object v1
.end method

.method public static final n(Landroid/view/ViewGroup;)V
    .locals 8

    .line 1
    move-object v0, p0

    .line 2
    check-cast v0, Lcom/facebook/react/views/scroll/n$c;

    .line 3
    .line 4
    invoke-interface {v0}, Lcom/facebook/react/views/scroll/n$c;->getReactScrollViewScrollState()Lcom/facebook/react/views/scroll/n$h;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lcom/facebook/react/views/scroll/n$h;->f()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-virtual {v0}, Lcom/facebook/react/views/scroll/n$h;->e()Landroid/graphics/Point;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget v2, v0, Landroid/graphics/Point;->x:I

    .line 17
    .line 18
    iget v0, v0, Landroid/graphics/Point;->y:I

    .line 19
    .line 20
    sget-boolean v3, Lcom/facebook/react/views/scroll/n;->c:Z

    .line 21
    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    sget-object v3, Lcom/facebook/react/views/scroll/n;->b:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    const-string v7, "updateFabricScrollState[%d] scrollX %d scrollY %d"

    .line 43
    .line 44
    invoke-static {v3, v7, v4, v5, v6}, Lz5/a;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    check-cast p0, Lcom/facebook/react/views/scroll/n$e;

    .line 48
    .line 49
    invoke-interface {p0}, Lcom/facebook/react/views/scroll/n$e;->getStateWrapper()Lcom/facebook/react/uimanager/a0;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    if-eqz p0, :cond_1

    .line 54
    .line 55
    new-instance v3, Lcom/facebook/react/bridge/WritableNativeMap;

    .line 56
    .line 57
    invoke-direct {v3}, Lcom/facebook/react/bridge/WritableNativeMap;-><init>()V

    .line 58
    .line 59
    .line 60
    int-to-float v2, v2

    .line 61
    invoke-static {v2}, Lcom/facebook/react/uimanager/B;->g(F)F

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    float-to-double v4, v2

    .line 66
    const-string v2, "contentOffsetLeft"

    .line 67
    .line 68
    invoke-interface {v3, v2, v4, v5}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 69
    .line 70
    .line 71
    int-to-float v0, v0

    .line 72
    invoke-static {v0}, Lcom/facebook/react/uimanager/B;->g(F)F

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    float-to-double v4, v0

    .line 77
    const-string v0, "contentOffsetTop"

    .line 78
    .line 79
    invoke-interface {v3, v0, v4, v5}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 80
    .line 81
    .line 82
    int-to-float v0, v1

    .line 83
    invoke-static {v0}, Lcom/facebook/react/uimanager/B;->g(F)F

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    float-to-double v0, v0

    .line 88
    const-string v2, "scrollAwayPaddingTop"

    .line 89
    .line 90
    invoke-interface {v3, v2, v0, v1}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 91
    .line 92
    .line 93
    invoke-interface {p0, v3}, Lcom/facebook/react/uimanager/a0;->updateState(Lcom/facebook/react/bridge/WritableMap;)V

    .line 94
    .line 95
    .line 96
    :cond_1
    return-void
.end method

.method public static final o(Landroid/content/Context;)I
    .locals 1

    .line 1
    sget-boolean v0, Lcom/facebook/react/views/scroll/n;->g:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    sput-boolean v0, Lcom/facebook/react/views/scroll/n;->g:Z

    .line 7
    .line 8
    :try_start_0
    new-instance v0, Lcom/facebook/react/views/scroll/n$g;

    .line 9
    .line 10
    invoke-direct {v0, p0}, Lcom/facebook/react/views/scroll/n$g;-><init>(Landroid/content/Context;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/facebook/react/views/scroll/n$g;->a()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    sput p0, Lcom/facebook/react/views/scroll/n;->f:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    :catchall_0
    :cond_0
    sget p0, Lcom/facebook/react/views/scroll/n;->f:I

    .line 20
    .line 21
    return p0
.end method

.method public static final p(Landroid/view/ViewGroup;III)I
    .locals 2

    .line 1
    check-cast p0, Lcom/facebook/react/views/scroll/n$c;

    .line 2
    .line 3
    invoke-interface {p0}, Lcom/facebook/react/views/scroll/n$c;->getReactScrollViewScrollState()Lcom/facebook/react/views/scroll/n$h;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz p3, :cond_0

    .line 9
    .line 10
    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    div-int/2addr p3, v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move p3, v0

    .line 17
    :goto_0
    sub-int v1, p2, p1

    .line 18
    .line 19
    mul-int/2addr p3, v1

    .line 20
    if-lez p3, :cond_1

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/n$h;->h()Z

    .line 24
    .line 25
    .line 26
    move-result p3

    .line 27
    if-eqz p3, :cond_3

    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/n$h;->g()Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-eqz p0, :cond_2

    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    return p1

    .line 39
    :cond_3
    :goto_1
    return p2
.end method

.method public static final q(Landroid/view/ViewGroup;Lcom/facebook/react/uimanager/a0;)V
    .locals 12

    .line 1
    const-string v0, "stateWrapper"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    check-cast p0, Lcom/facebook/react/views/scroll/n$c;

    .line 7
    .line 8
    invoke-interface {p0}, Lcom/facebook/react/views/scroll/n$c;->getReactScrollViewScrollState()Lcom/facebook/react/views/scroll/n$h;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Lcom/facebook/react/views/scroll/n$h;->i()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-interface {p1}, Lcom/facebook/react/uimanager/a0;->getStateData()Lcom/facebook/react/bridge/ReadableNativeMap;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    if-nez p1, :cond_1

    .line 24
    .line 25
    :goto_0
    return-void

    .line 26
    :cond_1
    const-string v0, "contentOffsetLeft"

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Lcom/facebook/react/bridge/ReadableNativeMap;->getDouble(Ljava/lang/String;)D

    .line 29
    .line 30
    .line 31
    move-result-wide v0

    .line 32
    invoke-static {v0, v1}, Lcom/facebook/react/uimanager/B;->h(D)F

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    float-to-int v0, v0

    .line 37
    const-string v1, "contentOffsetTop"

    .line 38
    .line 39
    invoke-virtual {p1, v1}, Lcom/facebook/react/bridge/ReadableNativeMap;->getDouble(Ljava/lang/String;)D

    .line 40
    .line 41
    .line 42
    move-result-wide v1

    .line 43
    invoke-static {v1, v2}, Lcom/facebook/react/uimanager/B;->h(D)F

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    float-to-int v1, v1

    .line 48
    const-string v2, "scrollAwayPaddingTop"

    .line 49
    .line 50
    invoke-virtual {p1, v2}, Lcom/facebook/react/bridge/ReadableNativeMap;->getDouble(Ljava/lang/String;)D

    .line 51
    .line 52
    .line 53
    move-result-wide v2

    .line 54
    invoke-static {v2, v3}, Lcom/facebook/react/uimanager/B;->h(D)F

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    float-to-int v4, p1

    .line 59
    invoke-interface {p0}, Lcom/facebook/react/views/scroll/n$c;->getReactScrollViewScrollState()Lcom/facebook/react/views/scroll/n$h;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    const/16 v10, 0x7d

    .line 64
    .line 65
    const/4 v11, 0x0

    .line 66
    const/4 v3, 0x0

    .line 67
    const/4 v5, 0x0

    .line 68
    const/4 v6, 0x0

    .line 69
    const/4 v7, 0x0

    .line 70
    const/4 v8, 0x0

    .line 71
    const/4 v9, 0x0

    .line 72
    invoke-static/range {v2 .. v11}, Lcom/facebook/react/views/scroll/n$h;->b(Lcom/facebook/react/views/scroll/n$h;Landroid/graphics/Point;ILandroid/graphics/Point;ZZFZILjava/lang/Object;)Lcom/facebook/react/views/scroll/n$h;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {p1, v0, v1}, Lcom/facebook/react/views/scroll/n$h;->n(II)Lcom/facebook/react/views/scroll/n$h;

    .line 77
    .line 78
    .line 79
    invoke-interface {p0, p1}, Lcom/facebook/react/views/scroll/n$c;->setReactScrollViewScrollState(Lcom/facebook/react/views/scroll/n$h;)V

    .line 80
    .line 81
    .line 82
    return-void
.end method

.method public static final r(Landroid/view/ViewGroup;)V
    .locals 2

    .line 1
    const-string v0, "scrollView"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    instance-of v1, v0, Lcom/facebook/react/bridge/ReactContext;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    check-cast v0, Lcom/facebook/react/bridge/ReactContext;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    :goto_0
    if-eqz v0, :cond_1

    .line 19
    .line 20
    const-class v1, Lcom/facebook/react/animated/NativeAnimatedModule;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ReactContext;->getNativeModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Lcom/facebook/react/animated/NativeAnimatedModule;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    invoke-virtual {v0, p0}, Lcom/facebook/react/animated/NativeAnimatedModule;->userDrivenScrollEnded(I)V

    .line 35
    .line 36
    .line 37
    :cond_1
    return-void
.end method

.method public static final s(Ljava/lang/String;)I
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p0, :cond_6

    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    const v2, -0x54506df1

    .line 9
    .line 10
    .line 11
    if-eq v1, v2, :cond_3

    .line 12
    .line 13
    const v2, 0x2dddaf

    .line 14
    .line 15
    .line 16
    if-eq v1, v2, :cond_2

    .line 17
    .line 18
    const v2, 0x63dca8c

    .line 19
    .line 20
    .line 21
    if-eq v1, v2, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const-string v1, "never"

    .line 25
    .line 26
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 p0, 0x2

    .line 34
    return p0

    .line 35
    :cond_2
    const-string v1, "auto"

    .line 36
    .line 37
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_4

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_3
    const-string v1, "always"

    .line 45
    .line 46
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-nez v1, :cond_5

    .line 51
    .line 52
    :cond_4
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    .line 56
    .line 57
    const-string v2, "wrong overScrollMode: "

    .line 58
    .line 59
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    const-string v1, "ReactNative"

    .line 70
    .line 71
    invoke-static {v1, p0}, Lz5/a;->I(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    return v0

    .line 75
    :cond_5
    const/4 p0, 0x0

    .line 76
    return p0

    .line 77
    :cond_6
    :goto_1
    return v0
.end method

.method public static final t(Ljava/lang/String;)I
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const-string v1, "start"

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-static {v1, p0, v2}, LDf/r;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    return v2

    .line 15
    :cond_1
    const-string v1, "center"

    .line 16
    .line 17
    invoke-static {v1, p0, v2}, LDf/r;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    const/4 p0, 0x2

    .line 24
    return p0

    .line 25
    :cond_2
    const-string v1, "end"

    .line 26
    .line 27
    invoke-static {v1, p0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_3

    .line 32
    .line 33
    const/4 p0, 0x3

    .line 34
    return p0

    .line 35
    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    const-string v2, "wrong snap alignment value: "

    .line 41
    .line 42
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    const-string v1, "ReactNative"

    .line 53
    .line 54
    invoke-static {v1, p0}, Lz5/a;->I(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return v0
.end method

.method public static final u(Landroid/view/ViewGroup;IIII)Landroid/graphics/Point;
    .locals 12

    .line 1
    move-object v0, p0

    .line 2
    check-cast v0, Lcom/facebook/react/views/scroll/n$c;

    .line 3
    .line 4
    invoke-interface {v0}, Lcom/facebook/react/views/scroll/n$c;->getReactScrollViewScrollState()Lcom/facebook/react/views/scroll/n$h;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    new-instance v1, Landroid/widget/OverScroller;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-direct {v1, v2}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;)V

    .line 15
    .line 16
    .line 17
    const/high16 v2, 0x3f800000    # 1.0f

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/facebook/react/views/scroll/n$h;->c()F

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    sub-float/2addr v2, v3

    .line 24
    invoke-virtual {v1, v2}, Landroid/widget/OverScroller;->setFriction(F)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    sub-int/2addr v2, v3

    .line 36
    invoke-virtual {p0}, Landroid/view/View;->getPaddingEnd()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    sub-int/2addr v2, v3

    .line 41
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    sub-int/2addr v3, v4

    .line 50
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    sub-int/2addr v3, v4

    .line 55
    invoke-virtual {v0}, Lcom/facebook/react/views/scroll/n$h;->d()Landroid/graphics/Point;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    iget v5, v0, Landroid/graphics/Point;->x:I

    .line 64
    .line 65
    invoke-static {p0, v4, v5, p1}, Lcom/facebook/react/views/scroll/n;->p(Landroid/view/ViewGroup;III)I

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    iget v0, v0, Landroid/graphics/Point;->y:I

    .line 74
    .line 75
    invoke-static {p0, v5, v0, p2}, Lcom/facebook/react/views/scroll/n;->p(Landroid/view/ViewGroup;III)I

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    div-int/lit8 v10, v2, 0x2

    .line 80
    .line 81
    div-int/lit8 v11, v3, 0x2

    .line 82
    .line 83
    const/4 v6, 0x0

    .line 84
    const/4 v8, 0x0

    .line 85
    move v3, p0

    .line 86
    move v5, p2

    .line 87
    move v7, p3

    .line 88
    move/from16 v9, p4

    .line 89
    .line 90
    move v2, v4

    .line 91
    move v4, p1

    .line 92
    invoke-virtual/range {v1 .. v11}, Landroid/widget/OverScroller;->fling(IIIIIIIIII)V

    .line 93
    .line 94
    .line 95
    new-instance p0, Landroid/graphics/Point;

    .line 96
    .line 97
    invoke-virtual {v1}, Landroid/widget/OverScroller;->getFinalX()I

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    invoke-virtual {v1}, Landroid/widget/OverScroller;->getFinalY()I

    .line 102
    .line 103
    .line 104
    move-result p2

    .line 105
    invoke-direct {p0, p1, p2}, Landroid/graphics/Point;-><init>(II)V

    .line 106
    .line 107
    .line 108
    return-object p0
.end method

.method public static final w(Lcom/facebook/react/views/scroll/n$f;)V
    .locals 4

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    sget-object v1, Lcom/facebook/react/views/scroll/n;->e:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const-string v2, "iterator(...)"

    .line 18
    .line 19
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_2

    .line 27
    .line 28
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Lcom/facebook/react/views/scroll/n$f;

    .line 39
    .line 40
    if-eqz v3, :cond_1

    .line 41
    .line 42
    invoke-static {v3, p0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_0

    .line 47
    .line 48
    :cond_1
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    sget-object p0, Lcom/facebook/react/views/scroll/n;->e:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 53
    .line 54
    invoke-virtual {p0, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public static final x(Lcom/facebook/react/views/scroll/n$i;)V
    .locals 4

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    sget-object v1, Lcom/facebook/react/views/scroll/n;->d:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const-string v2, "iterator(...)"

    .line 18
    .line 19
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_2

    .line 27
    .line 28
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Lcom/facebook/react/views/scroll/n$i;

    .line 39
    .line 40
    if-eqz v3, :cond_1

    .line 41
    .line 42
    invoke-static {v3, p0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_0

    .line 47
    .line 48
    :cond_1
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    sget-object p0, Lcom/facebook/react/views/scroll/n;->d:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 53
    .line 54
    invoke-virtual {p0, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public static final y(Landroid/view/ViewGroup;II)V
    .locals 5

    .line 1
    sget-boolean v0, Lcom/facebook/react/views/scroll/n;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/facebook/react/views/scroll/n;->b:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    const-string v4, "smoothScrollTo[%d] x %d y %d"

    .line 24
    .line 25
    invoke-static {v0, v4, v1, v2, v3}, Lz5/a;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    move-object v0, p0

    .line 29
    check-cast v0, Lcom/facebook/react/views/scroll/n$a;

    .line 30
    .line 31
    invoke-interface {v0}, Lcom/facebook/react/views/scroll/n$a;->getFlingAnimator()Landroid/animation/ValueAnimator;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1}, Landroid/animation/Animator;->getListeners()Ljava/util/ArrayList;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    if-eqz v2, :cond_1

    .line 40
    .line 41
    invoke-virtual {v1}, Landroid/animation/Animator;->getListeners()Ljava/util/ArrayList;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-nez v1, :cond_2

    .line 50
    .line 51
    :cond_1
    sget-object v1, Lcom/facebook/react/views/scroll/n;->a:Lcom/facebook/react/views/scroll/n;

    .line 52
    .line 53
    invoke-virtual {v1, p0}, Lcom/facebook/react/views/scroll/n;->v(Landroid/view/ViewGroup;)V

    .line 54
    .line 55
    .line 56
    :cond_2
    move-object v1, p0

    .line 57
    check-cast v1, Lcom/facebook/react/views/scroll/n$c;

    .line 58
    .line 59
    invoke-interface {v1}, Lcom/facebook/react/views/scroll/n$c;->getReactScrollViewScrollState()Lcom/facebook/react/views/scroll/n$h;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v1, p1, p2}, Lcom/facebook/react/views/scroll/n$h;->l(II)Lcom/facebook/react/views/scroll/n$h;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    if-eq v1, p1, :cond_3

    .line 75
    .line 76
    invoke-interface {v0, v1, p1}, Lcom/facebook/react/views/scroll/n$a;->d(II)V

    .line 77
    .line 78
    .line 79
    :cond_3
    if-eq p0, p2, :cond_4

    .line 80
    .line 81
    invoke-interface {v0, p0, p2}, Lcom/facebook/react/views/scroll/n$a;->d(II)V

    .line 82
    .line 83
    .line 84
    :cond_4
    return-void
.end method

.method public static final z(Landroid/view/ViewGroup;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/facebook/react/views/scroll/n;->a:Lcom/facebook/react/views/scroll/n;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-virtual {v0, p0, v1, v2}, Lcom/facebook/react/views/scroll/n;->A(Landroid/view/ViewGroup;II)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final A(Landroid/view/ViewGroup;II)V
    .locals 5

    .line 1
    sget-boolean v0, Lcom/facebook/react/views/scroll/n;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/facebook/react/views/scroll/n;->b:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    const-string v4, "updateFabricScrollState[%d] scrollX %d scrollY %d"

    .line 24
    .line 25
    invoke-static {v0, v4, v1, v2, v3}, Lz5/a;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-static {v0}, LC7/a;->a(I)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    const/4 v1, 0x1

    .line 37
    if-ne v0, v1, :cond_1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    move-object v0, p1

    .line 41
    check-cast v0, Lcom/facebook/react/views/scroll/n$e;

    .line 42
    .line 43
    invoke-interface {v0}, Lcom/facebook/react/views/scroll/n$e;->getStateWrapper()Lcom/facebook/react/uimanager/a0;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    if-nez v0, :cond_2

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    move-object v0, p1

    .line 51
    check-cast v0, Lcom/facebook/react/views/scroll/n$c;

    .line 52
    .line 53
    invoke-interface {v0}, Lcom/facebook/react/views/scroll/n$c;->getReactScrollViewScrollState()Lcom/facebook/react/views/scroll/n$h;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0, v1}, Lcom/facebook/react/views/scroll/n$h;->p(Z)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Lcom/facebook/react/views/scroll/n$h;->e()Landroid/graphics/Point;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v1, p2, p3}, Landroid/graphics/Point;->equals(II)Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-eqz v1, :cond_3

    .line 69
    .line 70
    :goto_0
    return-void

    .line 71
    :cond_3
    invoke-virtual {v0, p2, p3}, Lcom/facebook/react/views/scroll/n$h;->n(II)Lcom/facebook/react/views/scroll/n$h;

    .line 72
    .line 73
    .line 74
    invoke-static {p1}, Lcom/facebook/react/views/scroll/n;->n(Landroid/view/ViewGroup;)V

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public final v(Landroid/view/ViewGroup;)V
    .locals 2

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Lcom/facebook/react/views/scroll/n$a;

    .line 3
    .line 4
    invoke-interface {v0}, Lcom/facebook/react/views/scroll/n$a;->getFlingAnimator()Landroid/animation/ValueAnimator;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    new-instance v1, Lcom/facebook/react/views/scroll/n$k;

    .line 9
    .line 10
    invoke-direct {v1, p1}, Lcom/facebook/react/views/scroll/n$k;-><init>(Landroid/view/ViewGroup;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
