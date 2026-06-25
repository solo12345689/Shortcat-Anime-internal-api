.class public abstract LBa/i;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [I

    .line 3
    .line 4
    sput-object v0, LBa/i;->a:[I

    .line 5
    .line 6
    return-void
.end method

.method public static final a(Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 7

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "rect"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-virtual {p1, v2, v2, v0, v1}, Landroid/graphics/Rect;->set(IIII)V

    .line 27
    .line 28
    .line 29
    sget-object v0, LBa/i;->a:[I

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Landroid/view/View;->getLocationInWindow([I)V

    .line 32
    .line 33
    .line 34
    aget p0, v0, v2

    .line 35
    .line 36
    const/4 v1, 0x1

    .line 37
    aget v0, v0, v1

    .line 38
    .line 39
    invoke-virtual {p1, p0, v0}, Landroid/graphics/Rect;->offset(II)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_0
    sget-object v1, LFa/a;->a:LFa/a;

    .line 44
    .line 45
    const/4 v5, 0x4

    .line 46
    const/4 v6, 0x0

    .line 47
    const-string v2, "View.copyBoundsInWindow"

    .line 48
    .line 49
    const-string v3, "Can not copy bounds as view is not attached to window"

    .line 50
    .line 51
    const/4 v4, 0x0

    .line 52
    invoke-static/range {v1 .. v6}, LFa/a;->d(LFa/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public static final b(Landroid/view/View;)[I
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    new-array v0, v0, [I

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public static final c(Landroid/view/View;Landroidx/core/view/L0;ZZ)Landroidx/core/view/L0;
    .locals 6

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "insets"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 12
    .line 13
    const/16 v1, 0x1e

    .line 14
    .line 15
    const-string v2, "onApplyWindowInsets(...)"

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    if-lt v0, v1, :cond_3

    .line 19
    .line 20
    invoke-static {}, Landroidx/core/view/L0$p;->i()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-virtual {p1, v0}, Landroidx/core/view/L0;->f(I)LA1/b;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const-string v1, "getInsets(...)"

    .line 29
    .line 30
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-static {}, Landroidx/core/view/L0$p;->g()I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    invoke-virtual {p1, v4}, Landroidx/core/view/L0;->f(I)LA1/b;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-static {v4, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-static {}, Landroidx/core/view/L0$p;->d()I

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    invoke-virtual {p1, v5}, Landroidx/core/view/L0;->f(I)LA1/b;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    invoke-static {v5, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    if-eqz p2, :cond_0

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    iget v3, v0, LA1/b;->b:I

    .line 59
    .line 60
    :goto_0
    iget p2, v5, LA1/b;->d:I

    .line 61
    .line 62
    if-lez p2, :cond_1

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_1
    iget p2, v4, LA1/b;->d:I

    .line 66
    .line 67
    :goto_1
    new-instance v1, Landroidx/core/view/L0$a;

    .line 68
    .line 69
    invoke-direct {v1, p1}, Landroidx/core/view/L0$a;-><init>(Landroidx/core/view/L0;)V

    .line 70
    .line 71
    .line 72
    invoke-static {}, Landroidx/core/view/L0$p;->i()I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    iget v4, v0, LA1/b;->a:I

    .line 77
    .line 78
    iget v5, v0, LA1/b;->c:I

    .line 79
    .line 80
    if-eqz p3, :cond_2

    .line 81
    .line 82
    iget p2, v0, LA1/b;->d:I

    .line 83
    .line 84
    :cond_2
    invoke-static {v4, v3, v5, p2}, LA1/b;->c(IIII)LA1/b;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    invoke-virtual {v1, p1, p2}, Landroidx/core/view/L0$a;->b(ILA1/b;)Landroidx/core/view/L0$a;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-virtual {p1}, Landroidx/core/view/L0$a;->a()Landroidx/core/view/L0;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    const-string p2, "build(...)"

    .line 97
    .line 98
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-static {p0, p1}, Landroidx/core/view/a0;->W(Landroid/view/View;Landroidx/core/view/L0;)Landroidx/core/view/L0;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    invoke-static {p0, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    return-object p0

    .line 109
    :cond_3
    invoke-static {p0, p1}, Landroidx/core/view/a0;->W(Landroid/view/View;Landroidx/core/view/L0;)Landroidx/core/view/L0;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    invoke-static {p0, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0}, Landroidx/core/view/L0;->k()I

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    if-eqz p2, :cond_4

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_4
    invoke-virtual {p0}, Landroidx/core/view/L0;->m()I

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    :goto_2
    invoke-virtual {p0}, Landroidx/core/view/L0;->l()I

    .line 128
    .line 129
    .line 130
    move-result p2

    .line 131
    invoke-virtual {p0}, Landroidx/core/view/L0;->j()I

    .line 132
    .line 133
    .line 134
    move-result p3

    .line 135
    invoke-virtual {p0, p1, v3, p2, p3}, Landroidx/core/view/L0;->s(IIII)Landroidx/core/view/L0;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    const-string p1, "replaceSystemWindowInsets(...)"

    .line 140
    .line 141
    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    return-object p0
.end method

.method public static final d(Landroid/view/View;)V
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->requestApplyInsets()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    new-instance v0, LBa/i$a;

    .line 17
    .line 18
    invoke-direct {v0}, LBa/i$a;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method
