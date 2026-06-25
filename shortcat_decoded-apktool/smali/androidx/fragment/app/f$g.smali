.class final Landroidx/fragment/app/f$g;
.super Landroidx/fragment/app/c0$b;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "g"
.end annotation


# instance fields
.field private final d:Ljava/util/List;

.field private final e:Landroidx/fragment/app/c0$d;

.field private final f:Landroidx/fragment/app/c0$d;

.field private final g:Landroidx/fragment/app/X;

.field private final h:Ljava/lang/Object;

.field private final i:Ljava/util/ArrayList;

.field private final j:Ljava/util/ArrayList;

.field private final k:Lt/a;

.field private final l:Ljava/util/ArrayList;

.field private final m:Ljava/util/ArrayList;

.field private final n:Lt/a;

.field private final o:Lt/a;

.field private final p:Z

.field private final q:LG1/d;

.field private r:Ljava/lang/Object;

.field private s:Z


# direct methods
.method public constructor <init>(Ljava/util/List;Landroidx/fragment/app/c0$d;Landroidx/fragment/app/c0$d;Landroidx/fragment/app/X;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;Lt/a;Ljava/util/ArrayList;Ljava/util/ArrayList;Lt/a;Lt/a;Z)V
    .locals 1

    .line 1
    const-string v0, "transitionInfos"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "transitionImpl"

    .line 7
    .line 8
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "sharedElementFirstOutViews"

    .line 12
    .line 13
    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "sharedElementLastInViews"

    .line 17
    .line 18
    invoke-static {p7, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "sharedElementNameMapping"

    .line 22
    .line 23
    invoke-static {p8, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "enteringNames"

    .line 27
    .line 28
    invoke-static {p9, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string v0, "exitingNames"

    .line 32
    .line 33
    invoke-static {p10, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string v0, "firstOutViews"

    .line 37
    .line 38
    invoke-static {p11, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const-string v0, "lastInViews"

    .line 42
    .line 43
    invoke-static {p12, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-direct {p0}, Landroidx/fragment/app/c0$b;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object p1, p0, Landroidx/fragment/app/f$g;->d:Ljava/util/List;

    .line 50
    .line 51
    iput-object p2, p0, Landroidx/fragment/app/f$g;->e:Landroidx/fragment/app/c0$d;

    .line 52
    .line 53
    iput-object p3, p0, Landroidx/fragment/app/f$g;->f:Landroidx/fragment/app/c0$d;

    .line 54
    .line 55
    iput-object p4, p0, Landroidx/fragment/app/f$g;->g:Landroidx/fragment/app/X;

    .line 56
    .line 57
    iput-object p5, p0, Landroidx/fragment/app/f$g;->h:Ljava/lang/Object;

    .line 58
    .line 59
    iput-object p6, p0, Landroidx/fragment/app/f$g;->i:Ljava/util/ArrayList;

    .line 60
    .line 61
    iput-object p7, p0, Landroidx/fragment/app/f$g;->j:Ljava/util/ArrayList;

    .line 62
    .line 63
    iput-object p8, p0, Landroidx/fragment/app/f$g;->k:Lt/a;

    .line 64
    .line 65
    iput-object p9, p0, Landroidx/fragment/app/f$g;->l:Ljava/util/ArrayList;

    .line 66
    .line 67
    iput-object p10, p0, Landroidx/fragment/app/f$g;->m:Ljava/util/ArrayList;

    .line 68
    .line 69
    iput-object p11, p0, Landroidx/fragment/app/f$g;->n:Lt/a;

    .line 70
    .line 71
    iput-object p12, p0, Landroidx/fragment/app/f$g;->o:Lt/a;

    .line 72
    .line 73
    iput-boolean p13, p0, Landroidx/fragment/app/f$g;->p:Z

    .line 74
    .line 75
    new-instance p1, LG1/d;

    .line 76
    .line 77
    invoke-direct {p1}, LG1/d;-><init>()V

    .line 78
    .line 79
    .line 80
    iput-object p1, p0, Landroidx/fragment/app/f$g;->q:LG1/d;

    .line 81
    .line 82
    return-void
.end method

.method private static final A(Landroidx/fragment/app/c0$d;Landroidx/fragment/app/f$g;)V
    .locals 2

    .line 1
    const-string v0, "$operation"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "this$0"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x2

    .line 12
    invoke-static {v0}, Landroidx/fragment/app/K;->Q0(I)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v1, "Transition for operation "

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v1, " has completed"

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const-string v1, "FragmentManager"

    .line 41
    .line 42
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    :cond_0
    invoke-virtual {p0, p1}, Landroidx/fragment/app/c0$d;->e(Landroidx/fragment/app/c0$b;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method private final B(Ljava/util/ArrayList;Landroid/view/ViewGroup;Lie/a;)V
    .locals 8

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-static {p1, v0}, Landroidx/fragment/app/V;->d(Ljava/util/List;I)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Landroidx/fragment/app/f$g;->g:Landroidx/fragment/app/X;

    .line 6
    .line 7
    iget-object v1, p0, Landroidx/fragment/app/f$g;->j:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroidx/fragment/app/X;->q(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 10
    .line 11
    .line 12
    move-result-object v6

    .line 13
    const/4 v0, 0x2

    .line 14
    invoke-static {v0}, Landroidx/fragment/app/K;->Q0(I)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    const-string v0, ">>>>> Beginning transition <<<<<"

    .line 21
    .line 22
    const-string v1, "FragmentManager"

    .line 23
    .line 24
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    const-string v0, ">>>>> SharedElementFirstOutViews <<<<<"

    .line 28
    .line 29
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Landroidx/fragment/app/f$g;->i:Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    const-string v3, " Name: "

    .line 43
    .line 44
    const-string v4, "View: "

    .line 45
    .line 46
    if-eqz v2, :cond_0

    .line 47
    .line 48
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    const-string v5, "sharedElementFirstOutViews"

    .line 53
    .line 54
    invoke-static {v2, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    check-cast v2, Landroid/view/View;

    .line 58
    .line 59
    new-instance v5, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-static {v2}, Landroidx/core/view/a0;->H(Landroid/view/View;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_0
    const-string v0, ">>>>> SharedElementLastInViews <<<<<"

    .line 89
    .line 90
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 91
    .line 92
    .line 93
    iget-object v0, p0, Landroidx/fragment/app/f$g;->j:Ljava/util/ArrayList;

    .line 94
    .line 95
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    if-eqz v2, :cond_1

    .line 104
    .line 105
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    const-string v5, "sharedElementLastInViews"

    .line 110
    .line 111
    invoke-static {v2, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    check-cast v2, Landroid/view/View;

    .line 115
    .line 116
    new-instance v5, Ljava/lang/StringBuilder;

    .line 117
    .line 118
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-static {v2}, Landroidx/core/view/a0;->H(Landroid/view/View;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 142
    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_1
    invoke-interface {p3}, Lie/a;->invoke()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    iget-object v2, p0, Landroidx/fragment/app/f$g;->g:Landroidx/fragment/app/X;

    .line 149
    .line 150
    iget-object v4, p0, Landroidx/fragment/app/f$g;->i:Ljava/util/ArrayList;

    .line 151
    .line 152
    iget-object v5, p0, Landroidx/fragment/app/f$g;->j:Ljava/util/ArrayList;

    .line 153
    .line 154
    iget-object v7, p0, Landroidx/fragment/app/f$g;->k:Lt/a;

    .line 155
    .line 156
    move-object v3, p2

    .line 157
    invoke-virtual/range {v2 .. v7}, Landroidx/fragment/app/X;->y(Landroid/view/View;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/Map;)V

    .line 158
    .line 159
    .line 160
    const/4 p2, 0x0

    .line 161
    invoke-static {p1, p2}, Landroidx/fragment/app/V;->d(Ljava/util/List;I)V

    .line 162
    .line 163
    .line 164
    iget-object p1, p0, Landroidx/fragment/app/f$g;->g:Landroidx/fragment/app/X;

    .line 165
    .line 166
    iget-object p2, p0, Landroidx/fragment/app/f$g;->h:Ljava/lang/Object;

    .line 167
    .line 168
    iget-object p3, p0, Landroidx/fragment/app/f$g;->i:Ljava/util/ArrayList;

    .line 169
    .line 170
    iget-object v0, p0, Landroidx/fragment/app/f$g;->j:Ljava/util/ArrayList;

    .line 171
    .line 172
    invoke-virtual {p1, p2, p3, v0}, Landroidx/fragment/app/X;->A(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 173
    .line 174
    .line 175
    return-void
.end method

.method public static synthetic h(Landroidx/fragment/app/c0$d;Landroidx/fragment/app/c0$d;Landroidx/fragment/app/f$g;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Landroidx/fragment/app/f$g;->p(Landroidx/fragment/app/c0$d;Landroidx/fragment/app/c0$d;Landroidx/fragment/app/f$g;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic i(Landroidx/fragment/app/X;Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Landroidx/fragment/app/f$g;->q(Landroidx/fragment/app/X;Landroid/view/View;Landroid/graphics/Rect;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic j(Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/fragment/app/f$g;->r(Ljava/util/ArrayList;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic k(Lkotlin/jvm/internal/N;)V
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/fragment/app/f$g;->z(Lkotlin/jvm/internal/N;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic l(Landroidx/fragment/app/c0$d;Landroidx/fragment/app/f$g;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/fragment/app/f$g;->y(Landroidx/fragment/app/c0$d;Landroidx/fragment/app/f$g;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic m(Landroidx/fragment/app/c0$d;Landroidx/fragment/app/f$g;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/fragment/app/f$g;->A(Landroidx/fragment/app/c0$d;Landroidx/fragment/app/f$g;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final n(Ljava/util/ArrayList;Landroid/view/View;)V
    .locals 4

    .line 1
    instance-of v0, p2, Landroid/view/ViewGroup;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Landroid/view/ViewGroup;

    .line 7
    .line 8
    invoke-static {v0}, Landroidx/core/view/f0;->c(Landroid/view/ViewGroup;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_3

    .line 19
    .line 20
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    const/4 v1, 0x0

    .line 29
    :goto_0
    if-ge v1, p2, :cond_3

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-nez v3, :cond_1

    .line 40
    .line 41
    const-string v3, "child"

    .line 42
    .line 43
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-direct {p0, p1, v2}, Landroidx/fragment/app/f$g;->n(Ljava/util/ArrayList;Landroid/view/View;)V

    .line 47
    .line 48
    .line 49
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-nez v0, :cond_3

    .line 57
    .line 58
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    :cond_3
    return-void
.end method

.method private final o(Landroid/view/ViewGroup;Landroidx/fragment/app/c0$d;Landroidx/fragment/app/c0$d;)Lkotlin/Pair;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    new-instance v4, Landroid/view/View;

    .line 10
    .line 11
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    invoke-direct {v4, v5}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 16
    .line 17
    .line 18
    new-instance v5, Landroid/graphics/Rect;

    .line 19
    .line 20
    invoke-direct {v5}, Landroid/graphics/Rect;-><init>()V

    .line 21
    .line 22
    .line 23
    iget-object v6, v0, Landroidx/fragment/app/f$g;->d:Ljava/util/List;

    .line 24
    .line 25
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v6

    .line 29
    const/4 v8, 0x0

    .line 30
    move v10, v8

    .line 31
    const/4 v9, 0x0

    .line 32
    :cond_0
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v11

    .line 36
    if-eqz v11, :cond_3

    .line 37
    .line 38
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v11

    .line 42
    check-cast v11, Landroidx/fragment/app/f$h;

    .line 43
    .line 44
    invoke-virtual {v11}, Landroidx/fragment/app/f$h;->g()Z

    .line 45
    .line 46
    .line 47
    move-result v11

    .line 48
    if-eqz v11, :cond_0

    .line 49
    .line 50
    if-eqz v3, :cond_0

    .line 51
    .line 52
    if-eqz v2, :cond_0

    .line 53
    .line 54
    iget-object v11, v0, Landroidx/fragment/app/f$g;->k:Lt/a;

    .line 55
    .line 56
    invoke-interface {v11}, Ljava/util/Map;->isEmpty()Z

    .line 57
    .line 58
    .line 59
    move-result v11

    .line 60
    if-nez v11, :cond_0

    .line 61
    .line 62
    iget-object v11, v0, Landroidx/fragment/app/f$g;->h:Ljava/lang/Object;

    .line 63
    .line 64
    if-eqz v11, :cond_0

    .line 65
    .line 66
    invoke-virtual {v2}, Landroidx/fragment/app/c0$d;->h()Landroidx/fragment/app/q;

    .line 67
    .line 68
    .line 69
    move-result-object v11

    .line 70
    invoke-virtual {v3}, Landroidx/fragment/app/c0$d;->h()Landroidx/fragment/app/q;

    .line 71
    .line 72
    .line 73
    move-result-object v12

    .line 74
    iget-boolean v13, v0, Landroidx/fragment/app/f$g;->p:Z

    .line 75
    .line 76
    iget-object v14, v0, Landroidx/fragment/app/f$g;->n:Lt/a;

    .line 77
    .line 78
    const/4 v15, 0x1

    .line 79
    invoke-static {v11, v12, v13, v14, v15}, Landroidx/fragment/app/V;->a(Landroidx/fragment/app/q;Landroidx/fragment/app/q;ZLt/a;Z)V

    .line 80
    .line 81
    .line 82
    new-instance v11, Landroidx/fragment/app/j;

    .line 83
    .line 84
    invoke-direct {v11, v2, v3, v0}, Landroidx/fragment/app/j;-><init>(Landroidx/fragment/app/c0$d;Landroidx/fragment/app/c0$d;Landroidx/fragment/app/f$g;)V

    .line 85
    .line 86
    .line 87
    invoke-static {v1, v11}, Landroidx/core/view/L;->a(Landroid/view/View;Ljava/lang/Runnable;)Landroidx/core/view/L;

    .line 88
    .line 89
    .line 90
    iget-object v11, v0, Landroidx/fragment/app/f$g;->i:Ljava/util/ArrayList;

    .line 91
    .line 92
    iget-object v12, v0, Landroidx/fragment/app/f$g;->n:Lt/a;

    .line 93
    .line 94
    invoke-virtual {v12}, Lt/a;->values()Ljava/util/Collection;

    .line 95
    .line 96
    .line 97
    move-result-object v12

    .line 98
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 99
    .line 100
    .line 101
    iget-object v11, v0, Landroidx/fragment/app/f$g;->m:Ljava/util/ArrayList;

    .line 102
    .line 103
    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    .line 104
    .line 105
    .line 106
    move-result v11

    .line 107
    if-nez v11, :cond_1

    .line 108
    .line 109
    iget-object v9, v0, Landroidx/fragment/app/f$g;->m:Ljava/util/ArrayList;

    .line 110
    .line 111
    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v9

    .line 115
    const-string v11, "exitingNames[0]"

    .line 116
    .line 117
    invoke-static {v9, v11}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    check-cast v9, Ljava/lang/String;

    .line 121
    .line 122
    iget-object v11, v0, Landroidx/fragment/app/f$g;->n:Lt/a;

    .line 123
    .line 124
    invoke-virtual {v11, v9}, Lt/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v9

    .line 128
    check-cast v9, Landroid/view/View;

    .line 129
    .line 130
    iget-object v11, v0, Landroidx/fragment/app/f$g;->g:Landroidx/fragment/app/X;

    .line 131
    .line 132
    iget-object v12, v0, Landroidx/fragment/app/f$g;->h:Ljava/lang/Object;

    .line 133
    .line 134
    invoke-virtual {v11, v12, v9}, Landroidx/fragment/app/X;->v(Ljava/lang/Object;Landroid/view/View;)V

    .line 135
    .line 136
    .line 137
    :cond_1
    iget-object v11, v0, Landroidx/fragment/app/f$g;->j:Ljava/util/ArrayList;

    .line 138
    .line 139
    iget-object v12, v0, Landroidx/fragment/app/f$g;->o:Lt/a;

    .line 140
    .line 141
    invoke-virtual {v12}, Lt/a;->values()Ljava/util/Collection;

    .line 142
    .line 143
    .line 144
    move-result-object v12

    .line 145
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 146
    .line 147
    .line 148
    iget-object v11, v0, Landroidx/fragment/app/f$g;->l:Ljava/util/ArrayList;

    .line 149
    .line 150
    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    .line 151
    .line 152
    .line 153
    move-result v11

    .line 154
    if-nez v11, :cond_2

    .line 155
    .line 156
    iget-object v11, v0, Landroidx/fragment/app/f$g;->l:Ljava/util/ArrayList;

    .line 157
    .line 158
    invoke-virtual {v11, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v11

    .line 162
    const-string v12, "enteringNames[0]"

    .line 163
    .line 164
    invoke-static {v11, v12}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    check-cast v11, Ljava/lang/String;

    .line 168
    .line 169
    iget-object v12, v0, Landroidx/fragment/app/f$g;->o:Lt/a;

    .line 170
    .line 171
    invoke-virtual {v12, v11}, Lt/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v11

    .line 175
    check-cast v11, Landroid/view/View;

    .line 176
    .line 177
    if-eqz v11, :cond_2

    .line 178
    .line 179
    iget-object v10, v0, Landroidx/fragment/app/f$g;->g:Landroidx/fragment/app/X;

    .line 180
    .line 181
    new-instance v12, Landroidx/fragment/app/k;

    .line 182
    .line 183
    invoke-direct {v12, v10, v11, v5}, Landroidx/fragment/app/k;-><init>(Landroidx/fragment/app/X;Landroid/view/View;Landroid/graphics/Rect;)V

    .line 184
    .line 185
    .line 186
    invoke-static {v1, v12}, Landroidx/core/view/L;->a(Landroid/view/View;Ljava/lang/Runnable;)Landroidx/core/view/L;

    .line 187
    .line 188
    .line 189
    move v10, v15

    .line 190
    :cond_2
    iget-object v11, v0, Landroidx/fragment/app/f$g;->g:Landroidx/fragment/app/X;

    .line 191
    .line 192
    iget-object v12, v0, Landroidx/fragment/app/f$g;->h:Ljava/lang/Object;

    .line 193
    .line 194
    iget-object v13, v0, Landroidx/fragment/app/f$g;->i:Ljava/util/ArrayList;

    .line 195
    .line 196
    invoke-virtual {v11, v12, v4, v13}, Landroidx/fragment/app/X;->z(Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;)V

    .line 197
    .line 198
    .line 199
    iget-object v14, v0, Landroidx/fragment/app/f$g;->g:Landroidx/fragment/app/X;

    .line 200
    .line 201
    iget-object v15, v0, Landroidx/fragment/app/f$g;->h:Ljava/lang/Object;

    .line 202
    .line 203
    const/16 v19, 0x0

    .line 204
    .line 205
    iget-object v11, v0, Landroidx/fragment/app/f$g;->j:Ljava/util/ArrayList;

    .line 206
    .line 207
    const/16 v16, 0x0

    .line 208
    .line 209
    const/16 v17, 0x0

    .line 210
    .line 211
    const/16 v18, 0x0

    .line 212
    .line 213
    move-object/from16 v20, v15

    .line 214
    .line 215
    move-object/from16 v21, v11

    .line 216
    .line 217
    invoke-virtual/range {v14 .. v21}, Landroidx/fragment/app/X;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V

    .line 218
    .line 219
    .line 220
    goto/16 :goto_0

    .line 221
    .line 222
    :cond_3
    new-instance v6, Ljava/util/ArrayList;

    .line 223
    .line 224
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 225
    .line 226
    .line 227
    iget-object v11, v0, Landroidx/fragment/app/f$g;->d:Ljava/util/List;

    .line 228
    .line 229
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 230
    .line 231
    .line 232
    move-result-object v11

    .line 233
    const/4 v12, 0x0

    .line 234
    const/4 v13, 0x0

    .line 235
    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 236
    .line 237
    .line 238
    move-result v14

    .line 239
    const/16 v16, 0x2

    .line 240
    .line 241
    const-string v15, "FragmentManager"

    .line 242
    .line 243
    if-eqz v14, :cond_e

    .line 244
    .line 245
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v14

    .line 249
    check-cast v14, Landroidx/fragment/app/f$h;

    .line 250
    .line 251
    invoke-virtual {v14}, Landroidx/fragment/app/f$f;->a()Landroidx/fragment/app/c0$d;

    .line 252
    .line 253
    .line 254
    move-result-object v7

    .line 255
    iget-object v8, v0, Landroidx/fragment/app/f$g;->g:Landroidx/fragment/app/X;

    .line 256
    .line 257
    move/from16 v19, v10

    .line 258
    .line 259
    invoke-virtual {v14}, Landroidx/fragment/app/f$h;->f()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v10

    .line 263
    invoke-virtual {v8, v10}, Landroidx/fragment/app/X;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v8

    .line 267
    if-eqz v8, :cond_d

    .line 268
    .line 269
    new-instance v10, Ljava/util/ArrayList;

    .line 270
    .line 271
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 272
    .line 273
    .line 274
    move-object/from16 v28, v11

    .line 275
    .line 276
    invoke-virtual {v7}, Landroidx/fragment/app/c0$d;->h()Landroidx/fragment/app/q;

    .line 277
    .line 278
    .line 279
    move-result-object v11

    .line 280
    iget-object v11, v11, Landroidx/fragment/app/q;->mView:Landroid/view/View;

    .line 281
    .line 282
    move-object/from16 v29, v14

    .line 283
    .line 284
    const-string v14, "operation.fragment.mView"

    .line 285
    .line 286
    invoke-static {v11, v14}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    invoke-direct {v0, v10, v11}, Landroidx/fragment/app/f$g;->n(Ljava/util/ArrayList;Landroid/view/View;)V

    .line 290
    .line 291
    .line 292
    iget-object v11, v0, Landroidx/fragment/app/f$g;->h:Ljava/lang/Object;

    .line 293
    .line 294
    if-eqz v11, :cond_6

    .line 295
    .line 296
    if-eq v7, v3, :cond_4

    .line 297
    .line 298
    if-ne v7, v2, :cond_6

    .line 299
    .line 300
    :cond_4
    if-ne v7, v3, :cond_5

    .line 301
    .line 302
    iget-object v11, v0, Landroidx/fragment/app/f$g;->i:Ljava/util/ArrayList;

    .line 303
    .line 304
    invoke-static {v11}, LUd/u;->f1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 305
    .line 306
    .line 307
    move-result-object v11

    .line 308
    check-cast v11, Ljava/util/Collection;

    .line 309
    .line 310
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 311
    .line 312
    .line 313
    goto :goto_2

    .line 314
    :cond_5
    iget-object v11, v0, Landroidx/fragment/app/f$g;->j:Ljava/util/ArrayList;

    .line 315
    .line 316
    invoke-static {v11}, LUd/u;->f1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 317
    .line 318
    .line 319
    move-result-object v11

    .line 320
    check-cast v11, Ljava/util/Collection;

    .line 321
    .line 322
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 323
    .line 324
    .line 325
    :cond_6
    :goto_2
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    .line 326
    .line 327
    .line 328
    move-result v11

    .line 329
    if-eqz v11, :cond_7

    .line 330
    .line 331
    iget-object v11, v0, Landroidx/fragment/app/f$g;->g:Landroidx/fragment/app/X;

    .line 332
    .line 333
    invoke-virtual {v11, v8, v4}, Landroidx/fragment/app/X;->a(Ljava/lang/Object;Landroid/view/View;)V

    .line 334
    .line 335
    .line 336
    goto :goto_3

    .line 337
    :cond_7
    iget-object v11, v0, Landroidx/fragment/app/f$g;->g:Landroidx/fragment/app/X;

    .line 338
    .line 339
    invoke-virtual {v11, v8, v10}, Landroidx/fragment/app/X;->b(Ljava/lang/Object;Ljava/util/ArrayList;)V

    .line 340
    .line 341
    .line 342
    iget-object v11, v0, Landroidx/fragment/app/f$g;->g:Landroidx/fragment/app/X;

    .line 343
    .line 344
    const/16 v26, 0x0

    .line 345
    .line 346
    const/16 v27, 0x0

    .line 347
    .line 348
    const/16 v24, 0x0

    .line 349
    .line 350
    const/16 v25, 0x0

    .line 351
    .line 352
    move-object/from16 v22, v8

    .line 353
    .line 354
    move-object/from16 v21, v8

    .line 355
    .line 356
    move-object/from16 v23, v10

    .line 357
    .line 358
    move-object/from16 v20, v11

    .line 359
    .line 360
    invoke-virtual/range {v20 .. v27}, Landroidx/fragment/app/X;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v7}, Landroidx/fragment/app/c0$d;->g()Landroidx/fragment/app/c0$d$b;

    .line 364
    .line 365
    .line 366
    move-result-object v11

    .line 367
    sget-object v14, Landroidx/fragment/app/c0$d$b;->d:Landroidx/fragment/app/c0$d$b;

    .line 368
    .line 369
    if-ne v11, v14, :cond_8

    .line 370
    .line 371
    const/4 v11, 0x0

    .line 372
    invoke-virtual {v7, v11}, Landroidx/fragment/app/c0$d;->q(Z)V

    .line 373
    .line 374
    .line 375
    new-instance v14, Ljava/util/ArrayList;

    .line 376
    .line 377
    invoke-direct {v14, v10}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 378
    .line 379
    .line 380
    invoke-virtual {v7}, Landroidx/fragment/app/c0$d;->h()Landroidx/fragment/app/q;

    .line 381
    .line 382
    .line 383
    move-result-object v11

    .line 384
    iget-object v11, v11, Landroidx/fragment/app/q;->mView:Landroid/view/View;

    .line 385
    .line 386
    invoke-virtual {v14, v11}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 387
    .line 388
    .line 389
    iget-object v11, v0, Landroidx/fragment/app/f$g;->g:Landroidx/fragment/app/X;

    .line 390
    .line 391
    invoke-virtual {v7}, Landroidx/fragment/app/c0$d;->h()Landroidx/fragment/app/q;

    .line 392
    .line 393
    .line 394
    move-result-object v2

    .line 395
    iget-object v2, v2, Landroidx/fragment/app/q;->mView:Landroid/view/View;

    .line 396
    .line 397
    invoke-virtual {v11, v8, v2, v14}, Landroidx/fragment/app/X;->r(Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;)V

    .line 398
    .line 399
    .line 400
    new-instance v2, Landroidx/fragment/app/l;

    .line 401
    .line 402
    invoke-direct {v2, v10}, Landroidx/fragment/app/l;-><init>(Ljava/util/ArrayList;)V

    .line 403
    .line 404
    .line 405
    invoke-static {v1, v2}, Landroidx/core/view/L;->a(Landroid/view/View;Ljava/lang/Runnable;)Landroidx/core/view/L;

    .line 406
    .line 407
    .line 408
    :cond_8
    :goto_3
    invoke-virtual {v7}, Landroidx/fragment/app/c0$d;->g()Landroidx/fragment/app/c0$d$b;

    .line 409
    .line 410
    .line 411
    move-result-object v2

    .line 412
    sget-object v7, Landroidx/fragment/app/c0$d$b;->c:Landroidx/fragment/app/c0$d$b;

    .line 413
    .line 414
    const-string v11, "View: "

    .line 415
    .line 416
    const-string v14, "transitioningViews"

    .line 417
    .line 418
    if-ne v2, v7, :cond_a

    .line 419
    .line 420
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 421
    .line 422
    .line 423
    if-eqz v19, :cond_9

    .line 424
    .line 425
    iget-object v2, v0, Landroidx/fragment/app/f$g;->g:Landroidx/fragment/app/X;

    .line 426
    .line 427
    invoke-virtual {v2, v8, v5}, Landroidx/fragment/app/X;->u(Ljava/lang/Object;Landroid/graphics/Rect;)V

    .line 428
    .line 429
    .line 430
    :cond_9
    invoke-static/range {v16 .. v16}, Landroidx/fragment/app/K;->Q0(I)Z

    .line 431
    .line 432
    .line 433
    move-result v2

    .line 434
    if-eqz v2, :cond_b

    .line 435
    .line 436
    new-instance v2, Ljava/lang/StringBuilder;

    .line 437
    .line 438
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 439
    .line 440
    .line 441
    const-string v7, "Entering Transition: "

    .line 442
    .line 443
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 444
    .line 445
    .line 446
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 447
    .line 448
    .line 449
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object v2

    .line 453
    invoke-static {v15, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 454
    .line 455
    .line 456
    const-string v2, ">>>>> EnteringViews <<<<<"

    .line 457
    .line 458
    invoke-static {v15, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 459
    .line 460
    .line 461
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 462
    .line 463
    .line 464
    move-result-object v2

    .line 465
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 466
    .line 467
    .line 468
    move-result v7

    .line 469
    if-eqz v7, :cond_b

    .line 470
    .line 471
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    move-result-object v7

    .line 475
    invoke-static {v7, v14}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 476
    .line 477
    .line 478
    check-cast v7, Landroid/view/View;

    .line 479
    .line 480
    new-instance v10, Ljava/lang/StringBuilder;

    .line 481
    .line 482
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 483
    .line 484
    .line 485
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 486
    .line 487
    .line 488
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 489
    .line 490
    .line 491
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 492
    .line 493
    .line 494
    move-result-object v7

    .line 495
    invoke-static {v15, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 496
    .line 497
    .line 498
    goto :goto_4

    .line 499
    :cond_a
    iget-object v2, v0, Landroidx/fragment/app/f$g;->g:Landroidx/fragment/app/X;

    .line 500
    .line 501
    invoke-virtual {v2, v8, v9}, Landroidx/fragment/app/X;->v(Ljava/lang/Object;Landroid/view/View;)V

    .line 502
    .line 503
    .line 504
    invoke-static/range {v16 .. v16}, Landroidx/fragment/app/K;->Q0(I)Z

    .line 505
    .line 506
    .line 507
    move-result v2

    .line 508
    if-eqz v2, :cond_b

    .line 509
    .line 510
    new-instance v2, Ljava/lang/StringBuilder;

    .line 511
    .line 512
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 513
    .line 514
    .line 515
    const-string v7, "Exiting Transition: "

    .line 516
    .line 517
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 518
    .line 519
    .line 520
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 521
    .line 522
    .line 523
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 524
    .line 525
    .line 526
    move-result-object v2

    .line 527
    invoke-static {v15, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 528
    .line 529
    .line 530
    const-string v2, ">>>>> ExitingViews <<<<<"

    .line 531
    .line 532
    invoke-static {v15, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 533
    .line 534
    .line 535
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 536
    .line 537
    .line 538
    move-result-object v2

    .line 539
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 540
    .line 541
    .line 542
    move-result v7

    .line 543
    if-eqz v7, :cond_b

    .line 544
    .line 545
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 546
    .line 547
    .line 548
    move-result-object v7

    .line 549
    invoke-static {v7, v14}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 550
    .line 551
    .line 552
    check-cast v7, Landroid/view/View;

    .line 553
    .line 554
    new-instance v10, Ljava/lang/StringBuilder;

    .line 555
    .line 556
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 557
    .line 558
    .line 559
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 560
    .line 561
    .line 562
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 563
    .line 564
    .line 565
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 566
    .line 567
    .line 568
    move-result-object v7

    .line 569
    invoke-static {v15, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 570
    .line 571
    .line 572
    goto :goto_5

    .line 573
    :cond_b
    invoke-virtual/range {v29 .. v29}, Landroidx/fragment/app/f$h;->h()Z

    .line 574
    .line 575
    .line 576
    move-result v2

    .line 577
    if-eqz v2, :cond_c

    .line 578
    .line 579
    iget-object v2, v0, Landroidx/fragment/app/f$g;->g:Landroidx/fragment/app/X;

    .line 580
    .line 581
    const/4 v7, 0x0

    .line 582
    invoke-virtual {v2, v12, v8, v7}, Landroidx/fragment/app/X;->p(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 583
    .line 584
    .line 585
    move-result-object v12

    .line 586
    :goto_6
    move-object/from16 v2, p2

    .line 587
    .line 588
    move/from16 v10, v19

    .line 589
    .line 590
    move-object/from16 v11, v28

    .line 591
    .line 592
    :goto_7
    const/4 v8, 0x0

    .line 593
    goto/16 :goto_1

    .line 594
    .line 595
    :cond_c
    const/4 v7, 0x0

    .line 596
    iget-object v2, v0, Landroidx/fragment/app/f$g;->g:Landroidx/fragment/app/X;

    .line 597
    .line 598
    invoke-virtual {v2, v13, v8, v7}, Landroidx/fragment/app/X;->p(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 599
    .line 600
    .line 601
    move-result-object v13

    .line 602
    goto :goto_6

    .line 603
    :cond_d
    move-object/from16 v2, p2

    .line 604
    .line 605
    move/from16 v10, v19

    .line 606
    .line 607
    goto :goto_7

    .line 608
    :cond_e
    iget-object v2, v0, Landroidx/fragment/app/f$g;->g:Landroidx/fragment/app/X;

    .line 609
    .line 610
    iget-object v3, v0, Landroidx/fragment/app/f$g;->h:Ljava/lang/Object;

    .line 611
    .line 612
    invoke-virtual {v2, v12, v13, v3}, Landroidx/fragment/app/X;->o(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 613
    .line 614
    .line 615
    move-result-object v2

    .line 616
    invoke-static/range {v16 .. v16}, Landroidx/fragment/app/K;->Q0(I)Z

    .line 617
    .line 618
    .line 619
    move-result v3

    .line 620
    if-eqz v3, :cond_f

    .line 621
    .line 622
    new-instance v3, Ljava/lang/StringBuilder;

    .line 623
    .line 624
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 625
    .line 626
    .line 627
    const-string v4, "Final merged transition: "

    .line 628
    .line 629
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 630
    .line 631
    .line 632
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 633
    .line 634
    .line 635
    const-string v4, " for container "

    .line 636
    .line 637
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 638
    .line 639
    .line 640
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 641
    .line 642
    .line 643
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 644
    .line 645
    .line 646
    move-result-object v1

    .line 647
    invoke-static {v15, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 648
    .line 649
    .line 650
    :cond_f
    new-instance v1, Lkotlin/Pair;

    .line 651
    .line 652
    invoke-direct {v1, v6, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 653
    .line 654
    .line 655
    return-object v1
.end method

.method private static final p(Landroidx/fragment/app/c0$d;Landroidx/fragment/app/c0$d;Landroidx/fragment/app/f$g;)V
    .locals 2

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/c0$d;->h()Landroidx/fragment/app/q;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p1}, Landroidx/fragment/app/c0$d;->h()Landroidx/fragment/app/q;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-boolean v0, p2, Landroidx/fragment/app/f$g;->p:Z

    .line 15
    .line 16
    iget-object p2, p2, Landroidx/fragment/app/f$g;->o:Lt/a;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-static {p0, p1, v0, p2, v1}, Landroidx/fragment/app/V;->a(Landroidx/fragment/app/q;Landroidx/fragment/app/q;ZLt/a;Z)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method private static final q(Landroidx/fragment/app/X;Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 1

    .line 1
    const-string v0, "$impl"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$lastInEpicenterRect"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1, p2}, Landroidx/fragment/app/X;->k(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private static final r(Ljava/util/ArrayList;)V
    .locals 1

    .line 1
    const-string v0, "$transitioningViews"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x4

    .line 7
    invoke-static {p0, v0}, Landroidx/fragment/app/V;->d(Ljava/util/List;I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private static final y(Landroidx/fragment/app/c0$d;Landroidx/fragment/app/f$g;)V
    .locals 2

    .line 1
    const-string v0, "$operation"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "this$0"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x2

    .line 12
    invoke-static {v0}, Landroidx/fragment/app/K;->Q0(I)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v1, "Transition for operation "

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v1, " has completed"

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const-string v1, "FragmentManager"

    .line 41
    .line 42
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    :cond_0
    invoke-virtual {p0, p1}, Landroidx/fragment/app/c0$d;->e(Landroidx/fragment/app/c0$b;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method private static final z(Lkotlin/jvm/internal/N;)V
    .locals 1

    .line 1
    const-string v0, "$seekCancelLambda"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lie/a;

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    invoke-interface {p0}, Lie/a;->invoke()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method


# virtual methods
.method public final C(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/fragment/app/f$g;->r:Ljava/lang/Object;

    .line 2
    .line 3
    return-void
.end method

.method public final D(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/fragment/app/f$g;->s:Z

    .line 2
    .line 3
    return-void
.end method

.method public b()Z
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/f$g;->g:Landroidx/fragment/app/X;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/X;->m()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_3

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/fragment/app/f$g;->d:Ljava/util/List;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Landroidx/fragment/app/f$h;

    .line 35
    .line 36
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 37
    .line 38
    const/16 v3, 0x22

    .line 39
    .line 40
    if-lt v2, v3, :cond_3

    .line 41
    .line 42
    invoke-virtual {v1}, Landroidx/fragment/app/f$h;->f()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    if-eqz v2, :cond_3

    .line 47
    .line 48
    iget-object v2, p0, Landroidx/fragment/app/f$g;->g:Landroidx/fragment/app/X;

    .line 49
    .line 50
    invoke-virtual {v1}, Landroidx/fragment/app/f$h;->f()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v2, v1}, Landroidx/fragment/app/X;->n(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_3

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    :goto_1
    iget-object v0, p0, Landroidx/fragment/app/f$g;->h:Ljava/lang/Object;

    .line 62
    .line 63
    if-eqz v0, :cond_2

    .line 64
    .line 65
    iget-object v1, p0, Landroidx/fragment/app/f$g;->g:Landroidx/fragment/app/X;

    .line 66
    .line 67
    invoke-virtual {v1, v0}, Landroidx/fragment/app/X;->n(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_3

    .line 72
    .line 73
    :cond_2
    const/4 v0, 0x1

    .line 74
    return v0

    .line 75
    :cond_3
    const/4 v0, 0x0

    .line 76
    return v0
.end method

.method public c(Landroid/view/ViewGroup;)V
    .locals 1

    .line 1
    const-string v0, "container"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Landroidx/fragment/app/f$g;->q:LG1/d;

    .line 7
    .line 8
    invoke-virtual {p1}, LG1/d;->a()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public d(Landroid/view/ViewGroup;)V
    .locals 11

    .line 1
    const-string v0, "container"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/View;->isLaidOut()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x2

    .line 11
    const-string v2, "FragmentManager"

    .line 12
    .line 13
    if-eqz v0, :cond_5

    .line 14
    .line 15
    iget-boolean v0, p0, Landroidx/fragment/app/f$g;->s:Z

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    goto/16 :goto_2

    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/f$g;->r:Ljava/lang/Object;

    .line 22
    .line 23
    const-string v3, " to "

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    iget-object p1, p0, Landroidx/fragment/app/f$g;->g:Landroidx/fragment/app/X;

    .line 28
    .line 29
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v0}, Landroidx/fragment/app/X;->c(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-static {v1}, Landroidx/fragment/app/K;->Q0(I)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_4

    .line 40
    .line 41
    new-instance p1, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    .line 45
    .line 46
    const-string v0, "Ending execution of operations from "

    .line 47
    .line 48
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, Landroidx/fragment/app/f$g;->e:Landroidx/fragment/app/c0$d;

    .line 52
    .line 53
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Landroidx/fragment/app/f$g;->f:Landroidx/fragment/app/c0$d;

    .line 60
    .line 61
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-static {v2, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_1
    iget-object v0, p0, Landroidx/fragment/app/f$g;->f:Landroidx/fragment/app/c0$d;

    .line 73
    .line 74
    iget-object v4, p0, Landroidx/fragment/app/f$g;->e:Landroidx/fragment/app/c0$d;

    .line 75
    .line 76
    invoke-direct {p0, p1, v0, v4}, Landroidx/fragment/app/f$g;->o(Landroid/view/ViewGroup;Landroidx/fragment/app/c0$d;Landroidx/fragment/app/c0$d;)Lkotlin/Pair;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {v0}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    check-cast v4, Ljava/util/ArrayList;

    .line 85
    .line 86
    invoke-virtual {v0}, Lkotlin/Pair;->b()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    iget-object v5, p0, Landroidx/fragment/app/f$g;->d:Ljava/util/List;

    .line 91
    .line 92
    new-instance v6, Ljava/util/ArrayList;

    .line 93
    .line 94
    const/16 v7, 0xa

    .line 95
    .line 96
    invoke-static {v5, v7}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 97
    .line 98
    .line 99
    move-result v7

    .line 100
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 101
    .line 102
    .line 103
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result v7

    .line 111
    if-eqz v7, :cond_2

    .line 112
    .line 113
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v7

    .line 117
    check-cast v7, Landroidx/fragment/app/f$h;

    .line 118
    .line 119
    invoke-virtual {v7}, Landroidx/fragment/app/f$f;->a()Landroidx/fragment/app/c0$d;

    .line 120
    .line 121
    .line 122
    move-result-object v7

    .line 123
    invoke-interface {v6, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_2
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result v6

    .line 135
    if-eqz v6, :cond_3

    .line 136
    .line 137
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v6

    .line 141
    check-cast v6, Landroidx/fragment/app/c0$d;

    .line 142
    .line 143
    iget-object v7, p0, Landroidx/fragment/app/f$g;->g:Landroidx/fragment/app/X;

    .line 144
    .line 145
    invoke-virtual {v6}, Landroidx/fragment/app/c0$d;->h()Landroidx/fragment/app/q;

    .line 146
    .line 147
    .line 148
    move-result-object v8

    .line 149
    iget-object v9, p0, Landroidx/fragment/app/f$g;->q:LG1/d;

    .line 150
    .line 151
    new-instance v10, Landroidx/fragment/app/i;

    .line 152
    .line 153
    invoke-direct {v10, v6, p0}, Landroidx/fragment/app/i;-><init>(Landroidx/fragment/app/c0$d;Landroidx/fragment/app/f$g;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v7, v8, v0, v9, v10}, Landroidx/fragment/app/X;->w(Landroidx/fragment/app/q;Ljava/lang/Object;LG1/d;Ljava/lang/Runnable;)V

    .line 157
    .line 158
    .line 159
    goto :goto_1

    .line 160
    :cond_3
    new-instance v5, Landroidx/fragment/app/f$g$a;

    .line 161
    .line 162
    invoke-direct {v5, p0, p1, v0}, Landroidx/fragment/app/f$g$a;-><init>(Landroidx/fragment/app/f$g;Landroid/view/ViewGroup;Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    invoke-direct {p0, v4, p1, v5}, Landroidx/fragment/app/f$g;->B(Ljava/util/ArrayList;Landroid/view/ViewGroup;Lie/a;)V

    .line 166
    .line 167
    .line 168
    invoke-static {v1}, Landroidx/fragment/app/K;->Q0(I)Z

    .line 169
    .line 170
    .line 171
    move-result p1

    .line 172
    if-eqz p1, :cond_4

    .line 173
    .line 174
    new-instance p1, Ljava/lang/StringBuilder;

    .line 175
    .line 176
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 177
    .line 178
    .line 179
    const-string v0, "Completed executing operations from "

    .line 180
    .line 181
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    iget-object v0, p0, Landroidx/fragment/app/f$g;->e:Landroidx/fragment/app/c0$d;

    .line 185
    .line 186
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    iget-object v0, p0, Landroidx/fragment/app/f$g;->f:Landroidx/fragment/app/c0$d;

    .line 193
    .line 194
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    invoke-static {v2, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 202
    .line 203
    .line 204
    :cond_4
    return-void

    .line 205
    :cond_5
    :goto_2
    iget-object v0, p0, Landroidx/fragment/app/f$g;->d:Ljava/util/List;

    .line 206
    .line 207
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 212
    .line 213
    .line 214
    move-result v3

    .line 215
    if-eqz v3, :cond_8

    .line 216
    .line 217
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v3

    .line 221
    check-cast v3, Landroidx/fragment/app/f$h;

    .line 222
    .line 223
    invoke-virtual {v3}, Landroidx/fragment/app/f$f;->a()Landroidx/fragment/app/c0$d;

    .line 224
    .line 225
    .line 226
    move-result-object v4

    .line 227
    invoke-static {v1}, Landroidx/fragment/app/K;->Q0(I)Z

    .line 228
    .line 229
    .line 230
    move-result v5

    .line 231
    if-eqz v5, :cond_7

    .line 232
    .line 233
    iget-boolean v5, p0, Landroidx/fragment/app/f$g;->s:Z

    .line 234
    .line 235
    if-eqz v5, :cond_6

    .line 236
    .line 237
    new-instance v5, Ljava/lang/StringBuilder;

    .line 238
    .line 239
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 240
    .line 241
    .line 242
    const-string v6, "SpecialEffectsController: TransitionSeekController was not created. Completing operation "

    .line 243
    .line 244
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v4

    .line 254
    invoke-static {v2, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 255
    .line 256
    .line 257
    goto :goto_4

    .line 258
    :cond_6
    new-instance v5, Ljava/lang/StringBuilder;

    .line 259
    .line 260
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 261
    .line 262
    .line 263
    const-string v6, "SpecialEffectsController: Container "

    .line 264
    .line 265
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    const-string v6, " has not been laid out. Completing operation "

    .line 272
    .line 273
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v4

    .line 283
    invoke-static {v2, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 284
    .line 285
    .line 286
    :cond_7
    :goto_4
    invoke-virtual {v3}, Landroidx/fragment/app/f$f;->a()Landroidx/fragment/app/c0$d;

    .line 287
    .line 288
    .line 289
    move-result-object v3

    .line 290
    invoke-virtual {v3, p0}, Landroidx/fragment/app/c0$d;->e(Landroidx/fragment/app/c0$b;)V

    .line 291
    .line 292
    .line 293
    goto :goto_3

    .line 294
    :cond_8
    const/4 p1, 0x0

    .line 295
    iput-boolean p1, p0, Landroidx/fragment/app/f$g;->s:Z

    .line 296
    .line 297
    return-void
.end method

.method public e(Landroidx/activity/b;Landroid/view/ViewGroup;)V
    .locals 1

    .line 1
    const-string v0, "backEvent"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "container"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p2, p0, Landroidx/fragment/app/f$g;->r:Ljava/lang/Object;

    .line 12
    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Landroidx/fragment/app/f$g;->g:Landroidx/fragment/app/X;

    .line 16
    .line 17
    invoke-virtual {p1}, Landroidx/activity/b;->a()F

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    invoke-virtual {v0, p2, p1}, Landroidx/fragment/app/X;->t(Ljava/lang/Object;F)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public f(Landroid/view/ViewGroup;)V
    .locals 10

    .line 1
    const-string v0, "container"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/View;->isLaidOut()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const-string v1, "FragmentManager"

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, Landroidx/fragment/app/f$g;->d:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_5

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Landroidx/fragment/app/f$h;

    .line 31
    .line 32
    invoke-virtual {v2}, Landroidx/fragment/app/f$f;->a()Landroidx/fragment/app/c0$d;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    const/4 v3, 0x2

    .line 37
    invoke-static {v3}, Landroidx/fragment/app/K;->Q0(I)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_0

    .line 42
    .line 43
    new-instance v3, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 46
    .line 47
    .line 48
    const-string v4, "SpecialEffectsController: Container "

    .line 49
    .line 50
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string v4, " has not been laid out. Skipping onStart for operation "

    .line 57
    .line 58
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/f$g;->x()Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_2

    .line 77
    .line 78
    iget-object v0, p0, Landroidx/fragment/app/f$g;->h:Ljava/lang/Object;

    .line 79
    .line 80
    if-eqz v0, :cond_2

    .line 81
    .line 82
    invoke-virtual {p0}, Landroidx/fragment/app/f$g;->b()Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-nez v0, :cond_2

    .line 87
    .line 88
    new-instance v0, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 91
    .line 92
    .line 93
    const-string v2, "Ignoring shared elements transition "

    .line 94
    .line 95
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    iget-object v2, p0, Landroidx/fragment/app/f$g;->h:Ljava/lang/Object;

    .line 99
    .line 100
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string v2, " between "

    .line 104
    .line 105
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    iget-object v2, p0, Landroidx/fragment/app/f$g;->e:Landroidx/fragment/app/c0$d;

    .line 109
    .line 110
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    const-string v2, " and "

    .line 114
    .line 115
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    iget-object v2, p0, Landroidx/fragment/app/f$g;->f:Landroidx/fragment/app/c0$d;

    .line 119
    .line 120
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    const-string v2, " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed."

    .line 124
    .line 125
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 133
    .line 134
    .line 135
    :cond_2
    invoke-virtual {p0}, Landroidx/fragment/app/f$g;->b()Z

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    if-eqz v0, :cond_5

    .line 140
    .line 141
    invoke-virtual {p0}, Landroidx/fragment/app/f$g;->x()Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-eqz v0, :cond_5

    .line 146
    .line 147
    new-instance v0, Lkotlin/jvm/internal/N;

    .line 148
    .line 149
    invoke-direct {v0}, Lkotlin/jvm/internal/N;-><init>()V

    .line 150
    .line 151
    .line 152
    iget-object v1, p0, Landroidx/fragment/app/f$g;->f:Landroidx/fragment/app/c0$d;

    .line 153
    .line 154
    iget-object v2, p0, Landroidx/fragment/app/f$g;->e:Landroidx/fragment/app/c0$d;

    .line 155
    .line 156
    invoke-direct {p0, p1, v1, v2}, Landroidx/fragment/app/f$g;->o(Landroid/view/ViewGroup;Landroidx/fragment/app/c0$d;Landroidx/fragment/app/c0$d;)Lkotlin/Pair;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-virtual {v1}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    check-cast v2, Ljava/util/ArrayList;

    .line 165
    .line 166
    invoke-virtual {v1}, Lkotlin/Pair;->b()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v5

    .line 170
    iget-object v1, p0, Landroidx/fragment/app/f$g;->d:Ljava/util/List;

    .line 171
    .line 172
    new-instance v3, Ljava/util/ArrayList;

    .line 173
    .line 174
    const/16 v4, 0xa

    .line 175
    .line 176
    invoke-static {v1, v4}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 177
    .line 178
    .line 179
    move-result v4

    .line 180
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 181
    .line 182
    .line 183
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 188
    .line 189
    .line 190
    move-result v4

    .line 191
    if-eqz v4, :cond_3

    .line 192
    .line 193
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v4

    .line 197
    check-cast v4, Landroidx/fragment/app/f$h;

    .line 198
    .line 199
    invoke-virtual {v4}, Landroidx/fragment/app/f$f;->a()Landroidx/fragment/app/c0$d;

    .line 200
    .line 201
    .line 202
    move-result-object v4

    .line 203
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    goto :goto_1

    .line 207
    :cond_3
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 212
    .line 213
    .line 214
    move-result v3

    .line 215
    if-eqz v3, :cond_4

    .line 216
    .line 217
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v3

    .line 221
    check-cast v3, Landroidx/fragment/app/c0$d;

    .line 222
    .line 223
    new-instance v7, Landroidx/fragment/app/g;

    .line 224
    .line 225
    invoke-direct {v7, v0}, Landroidx/fragment/app/g;-><init>(Lkotlin/jvm/internal/N;)V

    .line 226
    .line 227
    .line 228
    move-object v4, v3

    .line 229
    iget-object v3, p0, Landroidx/fragment/app/f$g;->g:Landroidx/fragment/app/X;

    .line 230
    .line 231
    move-object v6, v4

    .line 232
    invoke-virtual {v6}, Landroidx/fragment/app/c0$d;->h()Landroidx/fragment/app/q;

    .line 233
    .line 234
    .line 235
    move-result-object v4

    .line 236
    move-object v8, v6

    .line 237
    iget-object v6, p0, Landroidx/fragment/app/f$g;->q:LG1/d;

    .line 238
    .line 239
    move-object v9, v8

    .line 240
    new-instance v8, Landroidx/fragment/app/h;

    .line 241
    .line 242
    invoke-direct {v8, v9, p0}, Landroidx/fragment/app/h;-><init>(Landroidx/fragment/app/c0$d;Landroidx/fragment/app/f$g;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual/range {v3 .. v8}, Landroidx/fragment/app/X;->x(Landroidx/fragment/app/q;Ljava/lang/Object;LG1/d;Ljava/lang/Runnable;Ljava/lang/Runnable;)V

    .line 246
    .line 247
    .line 248
    goto :goto_2

    .line 249
    :cond_4
    new-instance v1, Landroidx/fragment/app/f$g$b;

    .line 250
    .line 251
    invoke-direct {v1, p0, p1, v5, v0}, Landroidx/fragment/app/f$g$b;-><init>(Landroidx/fragment/app/f$g;Landroid/view/ViewGroup;Ljava/lang/Object;Lkotlin/jvm/internal/N;)V

    .line 252
    .line 253
    .line 254
    invoke-direct {p0, v2, p1, v1}, Landroidx/fragment/app/f$g;->B(Ljava/util/ArrayList;Landroid/view/ViewGroup;Lie/a;)V

    .line 255
    .line 256
    .line 257
    :cond_5
    return-void
.end method

.method public final s()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/f$g;->r:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public final t()Landroidx/fragment/app/c0$d;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/f$g;->e:Landroidx/fragment/app/c0$d;

    .line 2
    .line 3
    return-object v0
.end method

.method public final u()Landroidx/fragment/app/c0$d;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/f$g;->f:Landroidx/fragment/app/c0$d;

    .line 2
    .line 3
    return-object v0
.end method

.method public final v()Landroidx/fragment/app/X;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/f$g;->g:Landroidx/fragment/app/X;

    .line 2
    .line 3
    return-object v0
.end method

.method public final w()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/f$g;->d:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final x()Z
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/f$g;->d:Ljava/util/List;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_2

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Landroidx/fragment/app/f$h;

    .line 28
    .line 29
    invoke-virtual {v2}, Landroidx/fragment/app/f$f;->a()Landroidx/fragment/app/c0$d;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v2}, Landroidx/fragment/app/c0$d;->h()Landroidx/fragment/app/q;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    iget-boolean v2, v2, Landroidx/fragment/app/q;->mTransitioning:Z

    .line 38
    .line 39
    if-nez v2, :cond_1

    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    return v0

    .line 43
    :cond_2
    return v1
.end method
