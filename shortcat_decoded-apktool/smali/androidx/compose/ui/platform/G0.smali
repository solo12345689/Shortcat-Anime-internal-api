.class public final Landroidx/compose/ui/platform/G0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/platform/G0$b;,
        Landroidx/compose/ui/platform/G0$c;
    }
.end annotation


# static fields
.field public static final f:Landroidx/compose/ui/platform/G0$b;

.field public static final g:I

.field private static final h:Landroidx/compose/ui/platform/G0$a;


# instance fields
.field private final a:Landroid/graphics/Rect;

.field private final b:Landroid/graphics/Rect;

.field private final c:Landroid/graphics/Rect;

.field private final d:Landroidx/compose/ui/platform/G0$c;

.field private final e:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/compose/ui/platform/G0$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroidx/compose/ui/platform/G0$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/compose/ui/platform/G0;->f:Landroidx/compose/ui/platform/G0$b;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, Landroidx/compose/ui/platform/G0;->g:I

    .line 12
    .line 13
    new-instance v0, Landroidx/compose/ui/platform/G0$a;

    .line 14
    .line 15
    invoke-direct {v0}, Landroidx/compose/ui/platform/G0$a;-><init>()V

    .line 16
    .line 17
    .line 18
    sput-object v0, Landroidx/compose/ui/platform/G0;->h:Landroidx/compose/ui/platform/G0$a;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/Rect;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/compose/ui/platform/G0;->a:Landroid/graphics/Rect;

    .line 10
    .line 11
    new-instance v0, Landroid/graphics/Rect;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Landroidx/compose/ui/platform/G0;->b:Landroid/graphics/Rect;

    .line 17
    .line 18
    new-instance v0, Landroid/graphics/Rect;

    .line 19
    .line 20
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Landroidx/compose/ui/platform/G0;->c:Landroid/graphics/Rect;

    .line 24
    .line 25
    new-instance v0, Landroidx/compose/ui/platform/G0$c;

    .line 26
    .line 27
    new-instance v1, Landroidx/compose/ui/platform/F0;

    .line 28
    .line 29
    invoke-direct {v1, p0}, Landroidx/compose/ui/platform/F0;-><init>(Landroidx/compose/ui/platform/G0;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {v0, v1}, Landroidx/compose/ui/platform/G0$c;-><init>(Landroidx/compose/ui/platform/G0$c$a;)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Landroidx/compose/ui/platform/G0;->d:Landroidx/compose/ui/platform/G0$c;

    .line 36
    .line 37
    new-instance v0, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, Landroidx/compose/ui/platform/G0;->e:Ljava/util/ArrayList;

    .line 43
    .line 44
    return-void
.end method

.method public static synthetic a(Landroidx/compose/ui/platform/G0;Landroid/view/View;Landroid/view/View;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Landroidx/compose/ui/platform/G0;->p(Landroidx/compose/ui/platform/G0;Landroid/view/View;Landroid/view/View;)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic b()Landroidx/compose/ui/platform/G0$a;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/ui/platform/G0;->h:Landroidx/compose/ui/platform/G0$a;

    .line 2
    .line 3
    return-object v0
.end method

.method private final c(Landroid/view/ViewGroup;Landroid/graphics/Rect;I)Landroid/view/View;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Landroidx/compose/ui/platform/G0;->j(Landroid/view/ViewGroup;Landroid/view/View;)Landroid/view/ViewGroup;

    .line 3
    .line 4
    .line 5
    move-result-object v2

    .line 6
    iget-object v6, p0, Landroidx/compose/ui/platform/G0;->e:Ljava/util/ArrayList;

    .line 7
    .line 8
    :try_start_0
    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    .line 9
    .line 10
    .line 11
    invoke-static {v2, v6, p3}, Landroidx/compose/ui/platform/H0;->a(Landroid/view/View;Ljava/util/ArrayList;I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    move-object v1, p0

    .line 22
    move-object v4, p2

    .line 23
    move v5, p3

    .line 24
    invoke-direct/range {v1 .. v6}, Landroidx/compose/ui/platform/G0;->e(Landroid/view/ViewGroup;Landroid/view/View;Landroid/graphics/Rect;ILjava/util/ArrayList;)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    .line 29
    .line 30
    .line 31
    return-object p1

    .line 32
    :catchall_0
    move-exception v0

    .line 33
    move-object p1, v0

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    .line 36
    .line 37
    .line 38
    return-object v0

    .line 39
    :goto_0
    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    .line 40
    .line 41
    .line 42
    throw p1
.end method

.method private final e(Landroid/view/ViewGroup;Landroid/view/View;Landroid/graphics/Rect;ILjava/util/ArrayList;)Landroid/view/View;
    .locals 7

    .line 1
    iget-object v3, p0, Landroidx/compose/ui/platform/G0;->a:Landroid/graphics/Rect;

    .line 2
    .line 3
    const/16 v0, 0x82

    .line 4
    .line 5
    const/16 v1, 0x42

    .line 6
    .line 7
    const/16 v2, 0x21

    .line 8
    .line 9
    const/16 v4, 0x11

    .line 10
    .line 11
    const/4 v5, 0x2

    .line 12
    const/4 v6, 0x1

    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    invoke-virtual {p2, v3}, Landroid/view/View;->getFocusedRect(Landroid/graphics/Rect;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, p2, v3}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    if-eqz p3, :cond_1

    .line 23
    .line 24
    invoke-virtual {v3, p3}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    if-eq p4, v6, :cond_6

    .line 29
    .line 30
    if-eq p4, v5, :cond_4

    .line 31
    .line 32
    if-eq p4, v4, :cond_3

    .line 33
    .line 34
    if-eq p4, v2, :cond_3

    .line 35
    .line 36
    if-eq p4, v1, :cond_2

    .line 37
    .line 38
    if-eq p4, v0, :cond_2

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    invoke-direct {p0, p1, v3}, Landroidx/compose/ui/platform/G0;->o(Landroid/view/ViewGroup;Landroid/graphics/Rect;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_3
    invoke-direct {p0, p1, v3}, Landroidx/compose/ui/platform/G0;->n(Landroid/view/ViewGroup;Landroid/graphics/Rect;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_4
    invoke-virtual {p1}, Landroid/view/View;->getLayoutDirection()I

    .line 50
    .line 51
    .line 52
    move-result p3

    .line 53
    if-ne p3, v6, :cond_5

    .line 54
    .line 55
    invoke-direct {p0, p1, v3}, Landroidx/compose/ui/platform/G0;->n(Landroid/view/ViewGroup;Landroid/graphics/Rect;)V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_5
    invoke-direct {p0, p1, v3}, Landroidx/compose/ui/platform/G0;->o(Landroid/view/ViewGroup;Landroid/graphics/Rect;)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_6
    invoke-virtual {p1}, Landroid/view/View;->getLayoutDirection()I

    .line 64
    .line 65
    .line 66
    move-result p3

    .line 67
    if-ne p3, v6, :cond_7

    .line 68
    .line 69
    invoke-direct {p0, p1, v3}, Landroidx/compose/ui/platform/G0;->o(Landroid/view/ViewGroup;Landroid/graphics/Rect;)V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_7
    invoke-direct {p0, p1, v3}, Landroidx/compose/ui/platform/G0;->n(Landroid/view/ViewGroup;Landroid/graphics/Rect;)V

    .line 74
    .line 75
    .line 76
    :goto_0
    if-eq p4, v6, :cond_a

    .line 77
    .line 78
    if-eq p4, v5, :cond_a

    .line 79
    .line 80
    if-eq p4, v4, :cond_8

    .line 81
    .line 82
    if-eq p4, v2, :cond_8

    .line 83
    .line 84
    if-eq p4, v1, :cond_8

    .line 85
    .line 86
    if-ne p4, v0, :cond_9

    .line 87
    .line 88
    :cond_8
    move-object v0, p0

    .line 89
    move-object v1, p1

    .line 90
    move-object v2, p2

    .line 91
    move v5, p4

    .line 92
    move-object v4, p5

    .line 93
    goto :goto_1

    .line 94
    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 95
    .line 96
    new-instance p2, Ljava/lang/StringBuilder;

    .line 97
    .line 98
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 99
    .line 100
    .line 101
    const-string p3, "Unknown direction: "

    .line 102
    .line 103
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p2

    .line 113
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    throw p1

    .line 117
    :goto_1
    invoke-direct/range {v0 .. v5}, Landroidx/compose/ui/platform/G0;->g(Landroid/view/ViewGroup;Landroid/view/View;Landroid/graphics/Rect;Ljava/util/ArrayList;I)Landroid/view/View;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    return-object p1

    .line 122
    :cond_a
    move-object v0, p0

    .line 123
    move-object v1, p1

    .line 124
    move-object v2, p2

    .line 125
    move v5, p4

    .line 126
    move-object v4, p5

    .line 127
    invoke-direct {p0, v4, v1, v2, v5}, Landroidx/compose/ui/platform/G0;->h(Ljava/util/ArrayList;Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    return-object p1
.end method

.method private final g(Landroid/view/ViewGroup;Landroid/view/View;Landroid/graphics/Rect;Ljava/util/ArrayList;I)Landroid/view/View;
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/G0;->b:Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-virtual {v0, p3}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 4
    .line 5
    .line 6
    const/16 v0, 0x11

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eq p5, v0, :cond_3

    .line 10
    .line 11
    const/16 v0, 0x21

    .line 12
    .line 13
    if-eq p5, v0, :cond_2

    .line 14
    .line 15
    const/16 v0, 0x42

    .line 16
    .line 17
    if-eq p5, v0, :cond_1

    .line 18
    .line 19
    const/16 v0, 0x82

    .line 20
    .line 21
    if-eq p5, v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/G0;->b:Landroid/graphics/Rect;

    .line 25
    .line 26
    invoke-virtual {p3}, Landroid/graphics/Rect;->height()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    neg-int v2, v2

    .line 31
    add-int/lit8 v2, v2, -0x1

    .line 32
    .line 33
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Rect;->offset(II)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    iget-object v0, p0, Landroidx/compose/ui/platform/G0;->b:Landroid/graphics/Rect;

    .line 38
    .line 39
    invoke-virtual {p3}, Landroid/graphics/Rect;->width()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    neg-int v2, v2

    .line 44
    add-int/lit8 v2, v2, -0x1

    .line 45
    .line 46
    invoke-virtual {v0, v2, v1}, Landroid/graphics/Rect;->offset(II)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    iget-object v0, p0, Landroidx/compose/ui/platform/G0;->b:Landroid/graphics/Rect;

    .line 51
    .line 52
    invoke-virtual {p3}, Landroid/graphics/Rect;->height()I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    add-int/lit8 v2, v2, 0x1

    .line 57
    .line 58
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Rect;->offset(II)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_3
    iget-object v0, p0, Landroidx/compose/ui/platform/G0;->b:Landroid/graphics/Rect;

    .line 63
    .line 64
    invoke-virtual {p3}, Landroid/graphics/Rect;->width()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    add-int/lit8 v2, v2, 0x1

    .line 69
    .line 70
    invoke-virtual {v0, v2, v1}, Landroid/graphics/Rect;->offset(II)V

    .line 71
    .line 72
    .line 73
    :goto_0
    invoke-interface {p4}, Ljava/util/Collection;->size()I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    const/4 v2, 0x0

    .line 78
    :goto_1
    if-ge v1, v0, :cond_6

    .line 79
    .line 80
    invoke-interface {p4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    check-cast v3, Landroid/view/View;

    .line 85
    .line 86
    invoke-static {v3, p2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    if-nez v4, :cond_5

    .line 91
    .line 92
    invoke-static {v3, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    if-nez v4, :cond_5

    .line 97
    .line 98
    iget-object v4, p0, Landroidx/compose/ui/platform/G0;->c:Landroid/graphics/Rect;

    .line 99
    .line 100
    invoke-virtual {v3, v4}, Landroid/view/View;->getFocusedRect(Landroid/graphics/Rect;)V

    .line 101
    .line 102
    .line 103
    iget-object v4, p0, Landroidx/compose/ui/platform/G0;->c:Landroid/graphics/Rect;

    .line 104
    .line 105
    invoke-virtual {p1, v3, v4}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 106
    .line 107
    .line 108
    iget-object v4, p0, Landroidx/compose/ui/platform/G0;->c:Landroid/graphics/Rect;

    .line 109
    .line 110
    invoke-static {v4}, Ls0/s1;->e(Landroid/graphics/Rect;)Lr0/h;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    iget-object v5, p0, Landroidx/compose/ui/platform/G0;->b:Landroid/graphics/Rect;

    .line 115
    .line 116
    invoke-static {v5}, Ls0/s1;->e(Landroid/graphics/Rect;)Lr0/h;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    invoke-static {p3}, Ls0/s1;->e(Landroid/graphics/Rect;)Lr0/h;

    .line 121
    .line 122
    .line 123
    move-result-object v6

    .line 124
    invoke-static {p5}, Landroidx/compose/ui/focus/f;->d(I)Landroidx/compose/ui/focus/d;

    .line 125
    .line 126
    .line 127
    move-result-object v7

    .line 128
    if-eqz v7, :cond_4

    .line 129
    .line 130
    invoke-virtual {v7}, Landroidx/compose/ui/focus/d;->o()I

    .line 131
    .line 132
    .line 133
    move-result v7

    .line 134
    goto :goto_2

    .line 135
    :cond_4
    sget-object v7, Landroidx/compose/ui/focus/d;->b:Landroidx/compose/ui/focus/d$a;

    .line 136
    .line 137
    invoke-virtual {v7}, Landroidx/compose/ui/focus/d$a;->e()I

    .line 138
    .line 139
    .line 140
    move-result v7

    .line 141
    :goto_2
    invoke-static {v4, v5, v6, v7}, Landroidx/compose/ui/focus/w;->m(Lr0/h;Lr0/h;Lr0/h;I)Z

    .line 142
    .line 143
    .line 144
    move-result v4

    .line 145
    if-eqz v4, :cond_5

    .line 146
    .line 147
    iget-object v2, p0, Landroidx/compose/ui/platform/G0;->b:Landroid/graphics/Rect;

    .line 148
    .line 149
    iget-object v4, p0, Landroidx/compose/ui/platform/G0;->c:Landroid/graphics/Rect;

    .line 150
    .line 151
    invoke-virtual {v2, v4}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 152
    .line 153
    .line 154
    move-object v2, v3

    .line 155
    :cond_5
    add-int/lit8 v1, v1, 0x1

    .line 156
    .line 157
    goto :goto_1

    .line 158
    :cond_6
    return-object v2
.end method

.method private final h(Ljava/util/ArrayList;Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;
    .locals 10

    .line 1
    :try_start_0
    iget-object v0, p0, Landroidx/compose/ui/platform/G0;->d:Landroidx/compose/ui/platform/G0$c;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Landroidx/compose/ui/platform/G0$c;->c(Ljava/util/ArrayList;Landroid/view/View;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/compose/ui/platform/G0;->d:Landroidx/compose/ui/platform/G0$c;

    .line 7
    .line 8
    invoke-static {p1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Landroidx/compose/ui/platform/G0;->d:Landroidx/compose/ui/platform/G0$c;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/compose/ui/platform/G0$c;->b()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v1, 0x0

    .line 21
    const/4 v2, 0x2

    .line 22
    if-ge v0, v2, :cond_0

    .line 23
    .line 24
    return-object v1

    .line 25
    :cond_0
    const/4 v3, 0x1

    .line 26
    if-eq p4, v3, :cond_3

    .line 27
    .line 28
    if-eq p4, v2, :cond_2

    .line 29
    .line 30
    const/16 v2, 0x11

    .line 31
    .line 32
    if-eq p4, v2, :cond_1

    .line 33
    .line 34
    const/16 v2, 0x21

    .line 35
    .line 36
    if-eq p4, v2, :cond_1

    .line 37
    .line 38
    const/16 v2, 0x42

    .line 39
    .line 40
    if-eq p4, v2, :cond_1

    .line 41
    .line 42
    const/16 v2, 0x82

    .line 43
    .line 44
    if-eq p4, v2, :cond_1

    .line 45
    .line 46
    move-object v4, p0

    .line 47
    move-object v8, p1

    .line 48
    goto :goto_0

    .line 49
    :cond_1
    iget-object v7, p0, Landroidx/compose/ui/platform/G0;->a:Landroid/graphics/Rect;

    .line 50
    .line 51
    move-object v4, p0

    .line 52
    move-object v8, p1

    .line 53
    move-object v5, p2

    .line 54
    move-object v6, p3

    .line 55
    move v9, p4

    .line 56
    invoke-direct/range {v4 .. v9}, Landroidx/compose/ui/platform/G0;->g(Landroid/view/ViewGroup;Landroid/view/View;Landroid/graphics/Rect;Ljava/util/ArrayList;I)Landroid/view/View;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    goto :goto_0

    .line 61
    :cond_2
    move-object v4, p0

    .line 62
    move-object v8, p1

    .line 63
    move-object v6, p3

    .line 64
    invoke-direct {p0, v6, v8, v0}, Landroidx/compose/ui/platform/G0;->k(Landroid/view/View;Ljava/util/ArrayList;I)Landroid/view/View;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    goto :goto_0

    .line 69
    :cond_3
    move-object v4, p0

    .line 70
    move-object v8, p1

    .line 71
    move-object v6, p3

    .line 72
    invoke-direct {p0, v6, v8, v0}, Landroidx/compose/ui/platform/G0;->l(Landroid/view/View;Ljava/util/ArrayList;I)Landroid/view/View;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    :goto_0
    if-nez v1, :cond_4

    .line 77
    .line 78
    sub-int/2addr v0, v3

    .line 79
    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    check-cast p1, Landroid/view/View;

    .line 84
    .line 85
    return-object p1

    .line 86
    :cond_4
    return-object v1

    .line 87
    :catchall_0
    move-exception v0

    .line 88
    move-object v4, p0

    .line 89
    move-object p1, v0

    .line 90
    iget-object p2, v4, Landroidx/compose/ui/platform/G0;->d:Landroidx/compose/ui/platform/G0$c;

    .line 91
    .line 92
    invoke-virtual {p2}, Landroidx/compose/ui/platform/G0$c;->b()V

    .line 93
    .line 94
    .line 95
    throw p1
.end method

.method private final i(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;
    .locals 4

    .line 1
    invoke-static {p2, p1, p3}, Landroidx/compose/ui/platform/H0;->b(Landroid/view/View;Landroid/view/View;I)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    const/4 v0, 0x1

    .line 6
    move v1, v0

    .line 7
    move-object v0, p2

    .line 8
    :goto_0
    const/4 v2, 0x0

    .line 9
    if-eqz p2, :cond_4

    .line 10
    .line 11
    invoke-virtual {p2}, Landroid/view/View;->isFocusable()Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-eqz v3, :cond_1

    .line 16
    .line 17
    invoke-virtual {p2}, Landroid/view/View;->getVisibility()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-nez v3, :cond_1

    .line 22
    .line 23
    invoke-virtual {p2}, Landroid/view/View;->isInTouchMode()Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    invoke-virtual {p2}, Landroid/view/View;->isFocusableInTouchMode()Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eqz v3, :cond_1

    .line 34
    .line 35
    :cond_0
    return-object p2

    .line 36
    :cond_1
    invoke-static {p2, p1, p3}, Landroidx/compose/ui/platform/H0;->b(Landroid/view/View;Landroid/view/View;I)Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    xor-int/lit8 v3, v1, 0x1

    .line 41
    .line 42
    if-nez v1, :cond_3

    .line 43
    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    invoke-static {v0, p1, p3}, Landroidx/compose/ui/platform/H0;->b(Landroid/view/View;Landroid/view/View;I)Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    goto :goto_1

    .line 51
    :cond_2
    move-object v0, v2

    .line 52
    :goto_1
    if-ne v0, p2, :cond_3

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_3
    move v1, v3

    .line 56
    goto :goto_0

    .line 57
    :cond_4
    :goto_2
    return-object v2
.end method

.method private final j(Landroid/view/ViewGroup;Landroid/view/View;)Landroid/view/ViewGroup;
    .locals 4

    .line 1
    if-eqz p2, :cond_4

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x0

    .line 11
    :goto_0
    instance-of v2, v0, Landroid/view/ViewGroup;

    .line 12
    .line 13
    if-eqz v2, :cond_4

    .line 14
    .line 15
    if-ne v0, p1, :cond_2

    .line 16
    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_1
    return-object v1

    .line 21
    :cond_2
    check-cast v0, Landroid/view/ViewGroup;

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getTouchscreenBlocksFocus()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_3

    .line 28
    .line 29
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    const-string v3, "android.hardware.touchscreen"

    .line 38
    .line 39
    invoke-virtual {v2, v3}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_3

    .line 44
    .line 45
    move-object v1, v0

    .line 46
    :cond_3
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    goto :goto_0

    .line 51
    :cond_4
    :goto_1
    return-object p1
.end method

.method private final k(Landroid/view/View;Ljava/util/ArrayList;I)Landroid/view/View;
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    if-ge p3, v0, :cond_0

    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    return-object p1

    .line 6
    :cond_0
    if-eqz p1, :cond_1

    .line 7
    .line 8
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->lastIndexOf(Ljava/lang/Object;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-ltz p1, :cond_1

    .line 13
    .line 14
    add-int/lit8 p1, p1, 0x1

    .line 15
    .line 16
    if-ge p1, p3, :cond_1

    .line 17
    .line 18
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Landroid/view/View;

    .line 23
    .line 24
    return-object p1

    .line 25
    :cond_1
    const/4 p1, 0x0

    .line 26
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, Landroid/view/View;

    .line 31
    .line 32
    return-object p1
.end method

.method private final l(Landroid/view/View;Ljava/util/ArrayList;I)Landroid/view/View;
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    if-ge p3, v0, :cond_0

    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    return-object p1

    .line 6
    :cond_0
    if-eqz p1, :cond_1

    .line 7
    .line 8
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-lez p1, :cond_1

    .line 13
    .line 14
    add-int/lit8 p1, p1, -0x1

    .line 15
    .line 16
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Landroid/view/View;

    .line 21
    .line 22
    return-object p1

    .line 23
    :cond_1
    add-int/lit8 p3, p3, -0x1

    .line 24
    .line 25
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Landroid/view/View;

    .line 30
    .line 31
    return-object p1
.end method

.method private final m(I)Z
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const/4 v0, -0x1

    .line 4
    if-eq p1, v0, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    return p1

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    return p1
.end method

.method private final n(Landroid/view/ViewGroup;Landroid/graphics/Rect;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/2addr v0, v1

    .line 10
    invoke-virtual {p1}, Landroid/view/View;->getScrollX()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    add-int/2addr v1, p1

    .line 19
    invoke-virtual {p2, v1, v0, v1, v0}, Landroid/graphics/Rect;->set(IIII)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method private final o(Landroid/view/ViewGroup;Landroid/graphics/Rect;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Landroid/view/View;->getScrollX()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-virtual {p2, p1, v0, p1, v0}, Landroid/graphics/Rect;->set(IIII)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method private static final p(Landroidx/compose/ui/platform/G0;Landroid/view/View;Landroid/view/View;)Landroid/view/View;
    .locals 1

    .line 1
    invoke-virtual {p2}, Landroid/view/View;->getNextFocusForwardId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/G0;->m(I)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x2

    .line 12
    invoke-static {p2, p1, p0}, Landroidx/compose/ui/platform/H0;->b(Landroid/view/View;Landroid/view/View;I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method


# virtual methods
.method public final d(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;
    .locals 7

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/compose/ui/platform/G0;->j(Landroid/view/ViewGroup;Landroid/view/View;)Landroid/view/ViewGroup;

    .line 2
    .line 3
    .line 4
    move-result-object v2

    .line 5
    invoke-direct {p0, v2, p2, p3}, Landroidx/compose/ui/platform/G0;->i(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    iget-object v6, p0, Landroidx/compose/ui/platform/G0;->e:Ljava/util/ArrayList;

    .line 13
    .line 14
    :try_start_0
    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    .line 15
    .line 16
    .line 17
    invoke-static {v2, v6, p3}, Landroidx/compose/ui/platform/H0;->a(Landroid/view/View;Ljava/util/ArrayList;I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    move-object v1, p0

    .line 28
    move-object v3, p2

    .line 29
    move v5, p3

    .line 30
    invoke-direct/range {v1 .. v6}, Landroidx/compose/ui/platform/G0;->e(Landroid/view/ViewGroup;Landroid/view/View;Landroid/graphics/Rect;ILjava/util/ArrayList;)Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception v0

    .line 36
    move-object p1, v0

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    :goto_0
    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    .line 39
    .line 40
    .line 41
    return-object p1

    .line 42
    :goto_1
    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    .line 43
    .line 44
    .line 45
    throw p1
.end method

.method public final f(Landroid/view/ViewGroup;Landroid/graphics/Rect;I)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/G0;->a:Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, Landroidx/compose/ui/platform/G0;->a:Landroid/graphics/Rect;

    .line 7
    .line 8
    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/ui/platform/G0;->c(Landroid/view/ViewGroup;Landroid/graphics/Rect;I)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method
