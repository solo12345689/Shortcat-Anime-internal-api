.class public final Lm0/f;
.super Lm0/G;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LR0/p;
.implements Lq0/g;


# instance fields
.field private a:Lm0/M;

.field private final b:LR0/v;

.field private final c:Landroid/view/View;

.field private final d:LS0/b;

.field private final e:Ljava/lang/String;

.field private f:Landroid/graphics/Rect;

.field private g:Landroid/view/autofill/AutofillId;

.field private h:Lt/G;

.field private i:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Lm0/M;LR0/v;Landroid/view/View;LS0/b;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lm0/G;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm0/f;->a:Lm0/M;

    .line 5
    .line 6
    iput-object p2, p0, Lm0/f;->b:LR0/v;

    .line 7
    .line 8
    iput-object p3, p0, Lm0/f;->c:Landroid/view/View;

    .line 9
    .line 10
    iput-object p4, p0, Lm0/f;->d:LS0/b;

    .line 11
    .line 12
    iput-object p5, p0, Lm0/f;->e:Ljava/lang/String;

    .line 13
    .line 14
    new-instance p1, Landroid/graphics/Rect;

    .line 15
    .line 16
    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lm0/f;->f:Landroid/graphics/Rect;

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    invoke-static {p3, p1}, Lm0/c;->a(Landroid/view/View;I)V

    .line 23
    .line 24
    .line 25
    invoke-static {p3}, LN0/e;->a(Landroid/view/View;)LN0/b;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    const/4 p3, 0x0

    .line 30
    if-eqz p2, :cond_0

    .line 31
    .line 32
    invoke-virtual {p2}, LN0/b;->a()Landroid/view/autofill/AutofillId;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move-object p2, p3

    .line 38
    :goto_0
    if-eqz p2, :cond_1

    .line 39
    .line 40
    iput-object p2, p0, Lm0/f;->g:Landroid/view/autofill/AutofillId;

    .line 41
    .line 42
    new-instance p2, Lt/G;

    .line 43
    .line 44
    const/4 p4, 0x0

    .line 45
    invoke-direct {p2, p4, p1, p3}, Lt/G;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 46
    .line 47
    .line 48
    iput-object p2, p0, Lm0/f;->h:Lt/G;

    .line 49
    .line 50
    return-void

    .line 51
    :cond_1
    const-string p1, "Required value was null."

    .line 52
    .line 53
    invoke-static {p1}, LH0/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    .line 54
    .line 55
    .line 56
    new-instance p1, LTd/k;

    .line 57
    .line 58
    invoke-direct {p1}, LTd/k;-><init>()V

    .line 59
    .line 60
    .line 61
    throw p1
.end method

.method public static final synthetic c(Lm0/f;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lm0/f;->c:Landroid/view/View;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public a(LR0/n;Landroidx/compose/ui/semantics/SemanticsConfiguration;)V
    .locals 7

    .line 1
    invoke-interface {p1}, LR0/n;->e()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p1}, LI0/t;->y()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    sget-object v2, LR0/x;->a:LR0/x;

    .line 13
    .line 14
    invoke-virtual {v2}, LR0/x;->o()LR0/B;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-static {p2, v2}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, LU0/e;

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    invoke-virtual {v2}, LU0/e;->j()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move-object v2, v1

    .line 32
    :goto_0
    if-eqz v0, :cond_1

    .line 33
    .line 34
    sget-object v3, LR0/x;->a:LR0/x;

    .line 35
    .line 36
    invoke-virtual {v3}, LR0/x;->o()LR0/B;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-static {v0, v3}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    check-cast v3, LU0/e;

    .line 45
    .line 46
    if-eqz v3, :cond_1

    .line 47
    .line 48
    invoke-virtual {v3}, LU0/e;->j()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    :cond_1
    const/4 v3, 0x0

    .line 53
    const/4 v4, 0x1

    .line 54
    if-eq v2, v1, :cond_4

    .line 55
    .line 56
    if-nez v2, :cond_2

    .line 57
    .line 58
    iget-object v1, p0, Lm0/f;->a:Lm0/M;

    .line 59
    .line 60
    iget-object v2, p0, Lm0/f;->c:Landroid/view/View;

    .line 61
    .line 62
    invoke-interface {v1, v2, p1, v4}, Lm0/M;->c(Landroid/view/View;IZ)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    if-nez v1, :cond_3

    .line 67
    .line 68
    iget-object v1, p0, Lm0/f;->a:Lm0/M;

    .line 69
    .line 70
    iget-object v2, p0, Lm0/f;->c:Landroid/view/View;

    .line 71
    .line 72
    invoke-interface {v1, v2, p1, v3}, Lm0/M;->c(Landroid/view/View;IZ)V

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    sget-object v2, LR0/x;->a:LR0/x;

    .line 77
    .line 78
    invoke-virtual {v2}, LR0/x;->c()LR0/B;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-static {v0, v2}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    check-cast v2, Lm0/I;

    .line 87
    .line 88
    sget-object v5, Lm0/I;->a:Lm0/I$a;

    .line 89
    .line 90
    invoke-virtual {v5}, Lm0/I$a;->a()Lm0/I;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    invoke-static {v2, v5}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-eqz v2, :cond_4

    .line 99
    .line 100
    iget-object v2, p0, Lm0/f;->a:Lm0/M;

    .line 101
    .line 102
    iget-object v5, p0, Lm0/f;->c:Landroid/view/View;

    .line 103
    .line 104
    sget-object v6, Lm0/x;->a:Lm0/x;

    .line 105
    .line 106
    invoke-virtual {v1}, Ljava/lang/String;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-virtual {v6, v1}, Lm0/x;->b(Ljava/lang/String;)Landroid/view/autofill/AutofillValue;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-interface {v2, v5, p1, v1}, Lm0/M;->a(Landroid/view/View;ILandroid/view/autofill/AutofillValue;)V

    .line 115
    .line 116
    .line 117
    :cond_4
    :goto_1
    if-eqz p2, :cond_5

    .line 118
    .line 119
    invoke-static {p2}, Lm0/g;->b(Landroidx/compose/ui/semantics/SemanticsConfiguration;)Z

    .line 120
    .line 121
    .line 122
    move-result p2

    .line 123
    if-ne p2, v4, :cond_5

    .line 124
    .line 125
    move p2, v4

    .line 126
    goto :goto_2

    .line 127
    :cond_5
    move p2, v3

    .line 128
    :goto_2
    if-eqz v0, :cond_6

    .line 129
    .line 130
    invoke-static {v0}, Lm0/g;->b(Landroidx/compose/ui/semantics/SemanticsConfiguration;)Z

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    if-ne v0, v4, :cond_6

    .line 135
    .line 136
    move v3, v4

    .line 137
    :cond_6
    if-eq p2, v3, :cond_8

    .line 138
    .line 139
    if-eqz v3, :cond_7

    .line 140
    .line 141
    iget-object p2, p0, Lm0/f;->h:Lt/G;

    .line 142
    .line 143
    invoke-virtual {p2, p1}, Lt/G;->g(I)Z

    .line 144
    .line 145
    .line 146
    return-void

    .line 147
    :cond_7
    iget-object p2, p0, Lm0/f;->h:Lt/G;

    .line 148
    .line 149
    invoke-virtual {p2, p1}, Lt/G;->r(I)Z

    .line 150
    .line 151
    .line 152
    :cond_8
    return-void
.end method

.method public b(Landroidx/compose/ui/focus/o;Landroidx/compose/ui/focus/o;)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    invoke-static {p1}, LK0/k;->p(LK0/j;)LR0/n;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-interface {p1}, LR0/n;->e()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-static {v1}, Lm0/g;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-ne v1, v0, :cond_0

    .line 21
    .line 22
    iget-object v1, p0, Lm0/f;->a:Lm0/M;

    .line 23
    .line 24
    iget-object v2, p0, Lm0/f;->c:Landroid/view/View;

    .line 25
    .line 26
    invoke-interface {p1}, LI0/t;->y()I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    invoke-interface {v1, v2, p1}, Lm0/M;->b(Landroid/view/View;I)V

    .line 31
    .line 32
    .line 33
    :cond_0
    if-eqz p2, :cond_1

    .line 34
    .line 35
    invoke-static {p2}, LK0/k;->p(LK0/j;)LR0/n;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    invoke-interface {p1}, LR0/n;->e()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    if-eqz p2, :cond_1

    .line 46
    .line 47
    invoke-static {p2}, Lm0/g;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;)Z

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    if-ne p2, v0, :cond_1

    .line 52
    .line 53
    invoke-interface {p1}, LI0/t;->y()I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    iget-object p2, p0, Lm0/f;->d:LS0/b;

    .line 58
    .line 59
    invoke-virtual {p2}, LS0/b;->d()LS0/a;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    new-instance v0, Lm0/f$a;

    .line 64
    .line 65
    invoke-direct {v0, p0, p1}, Lm0/f$a;-><init>(Lm0/f;I)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p2, p1, v0}, LS0/a;->l(ILie/p;)Z

    .line 69
    .line 70
    .line 71
    :cond_1
    return-void
.end method

.method public final d()Lm0/M;
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/f;->a:Lm0/M;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e(LR0/n;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lm0/f;->h:Lt/G;

    .line 2
    .line 3
    invoke-interface {p1}, LI0/t;->y()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {v0, v1}, Lt/G;->r(I)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lm0/f;->a:Lm0/M;

    .line 14
    .line 15
    iget-object v1, p0, Lm0/f;->c:Landroid/view/View;

    .line 16
    .line 17
    invoke-interface {p1}, LI0/t;->y()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-interface {v0, v1, p1, v2}, Lm0/M;->c(Landroid/view/View;IZ)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public final f()V
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/f;->h:Lt/G;

    .line 2
    .line 3
    invoke-virtual {v0}, Lt/q;->c()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-boolean v0, p0, Lm0/f;->i:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lm0/f;->a:Lm0/M;

    .line 14
    .line 15
    invoke-interface {v0}, Lm0/M;->commit()V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput-boolean v0, p0, Lm0/f;->i:Z

    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, Lm0/f;->h:Lt/G;

    .line 22
    .line 23
    invoke-virtual {v0}, Lt/q;->d()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    iput-boolean v0, p0, Lm0/f;->i:Z

    .line 31
    .line 32
    :cond_1
    return-void
.end method

.method public final g(LR0/n;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lm0/f;->h:Lt/G;

    .line 2
    .line 3
    invoke-interface {p1}, LI0/t;->y()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {v0, v1}, Lt/G;->r(I)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lm0/f;->a:Lm0/M;

    .line 14
    .line 15
    iget-object v1, p0, Lm0/f;->c:Landroid/view/View;

    .line 16
    .line 17
    invoke-interface {p1}, LI0/t;->y()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-interface {v0, v1, p1, v2}, Lm0/M;->c(Landroid/view/View;IZ)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public final h(LR0/n;)V
    .locals 3

    .line 1
    invoke-interface {p1}, LR0/n;->e()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {v0}, Lm0/g;->b(Landroidx/compose/ui/semantics/SemanticsConfiguration;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x1

    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lm0/f;->h:Lt/G;

    .line 15
    .line 16
    invoke-interface {p1}, LI0/t;->y()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-virtual {v0, v2}, Lt/G;->g(I)Z

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lm0/f;->a:Lm0/M;

    .line 24
    .line 25
    iget-object v2, p0, Lm0/f;->c:Landroid/view/View;

    .line 26
    .line 27
    invoke-interface {p1}, LI0/t;->y()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    invoke-interface {v0, v2, p1, v1}, Lm0/M;->c(Landroid/view/View;IZ)V

    .line 32
    .line 33
    .line 34
    :cond_0
    return-void
.end method

.method public final i(LR0/n;I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lm0/f;->h:Lt/G;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Lt/G;->r(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lm0/f;->a:Lm0/M;

    .line 10
    .line 11
    iget-object v1, p0, Lm0/f;->c:Landroid/view/View;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-interface {v0, v1, p2, v2}, Lm0/M;->c(Landroid/view/View;IZ)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-interface {p1}, LR0/n;->e()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    if-eqz p2, :cond_1

    .line 22
    .line 23
    invoke-static {p2}, Lm0/g;->b(Landroidx/compose/ui/semantics/SemanticsConfiguration;)Z

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    const/4 v0, 0x1

    .line 28
    if-ne p2, v0, :cond_1

    .line 29
    .line 30
    iget-object p2, p0, Lm0/f;->h:Lt/G;

    .line 31
    .line 32
    invoke-interface {p1}, LI0/t;->y()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    invoke-virtual {p2, v1}, Lt/G;->g(I)Z

    .line 37
    .line 38
    .line 39
    iget-object p2, p0, Lm0/f;->a:Lm0/M;

    .line 40
    .line 41
    iget-object v1, p0, Lm0/f;->c:Landroid/view/View;

    .line 42
    .line 43
    invoke-interface {p1}, LI0/t;->y()I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    invoke-interface {p2, v1, p1, v0}, Lm0/M;->c(Landroid/view/View;IZ)V

    .line 48
    .line 49
    .line 50
    :cond_1
    return-void
.end method

.method public final j(Landroid/util/SparseArray;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_4

    .line 7
    .line 8
    invoke-virtual {p1, v1}, Landroid/util/SparseArray;->keyAt(I)I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    invoke-virtual {p1, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-static {v3}, Lm0/e;->a(Ljava/lang/Object;)Landroid/view/autofill/AutofillValue;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    sget-object v4, Lm0/x;->a:Lm0/x;

    .line 21
    .line 22
    invoke-virtual {v4, v3}, Lm0/x;->e(Landroid/view/autofill/AutofillValue;)Z

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    if-eqz v5, :cond_0

    .line 27
    .line 28
    iget-object v5, p0, Lm0/f;->b:LR0/v;

    .line 29
    .line 30
    invoke-virtual {v5, v2}, LR0/v;->a(I)LR0/n;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    invoke-interface {v2}, LR0/n;->e()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    if-eqz v2, :cond_3

    .line 41
    .line 42
    sget-object v5, LR0/l;->a:LR0/l;

    .line 43
    .line 44
    invoke-virtual {v5}, LR0/l;->k()LR0/B;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    invoke-static {v2, v5}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    check-cast v2, LR0/a;

    .line 53
    .line 54
    if-eqz v2, :cond_3

    .line 55
    .line 56
    invoke-virtual {v2}, LR0/a;->a()LTd/i;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 61
    .line 62
    if-eqz v2, :cond_3

    .line 63
    .line 64
    new-instance v5, LU0/e;

    .line 65
    .line 66
    invoke-virtual {v4, v3}, Lm0/x;->B(Landroid/view/autofill/AutofillValue;)Ljava/lang/CharSequence;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    const/4 v4, 0x2

    .line 75
    const/4 v6, 0x0

    .line 76
    invoke-direct {v5, v3, v6, v4, v6}, LU0/e;-><init>(Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 77
    .line 78
    .line 79
    invoke-interface {v2, v5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    check-cast v2, Ljava/lang/Boolean;

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_0
    invoke-virtual {v4, v3}, Lm0/x;->c(Landroid/view/autofill/AutofillValue;)Z

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    const-string v5, "ComposeAutofillManager"

    .line 91
    .line 92
    if-eqz v2, :cond_1

    .line 93
    .line 94
    const-string v2, "Auto filling Date fields is not yet supported."

    .line 95
    .line 96
    invoke-static {v5, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_1
    invoke-virtual {v4, v3}, Lm0/x;->d(Landroid/view/autofill/AutofillValue;)Z

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    if-eqz v2, :cond_2

    .line 105
    .line 106
    const-string v2, "Auto filling dropdown lists is not yet supported."

    .line 107
    .line 108
    invoke-static {v5, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_2
    invoke-virtual {v4, v3}, Lm0/x;->f(Landroid/view/autofill/AutofillValue;)Z

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    if-eqz v2, :cond_3

    .line 117
    .line 118
    const-string v2, "Auto filling toggle fields are not yet supported."

    .line 119
    .line 120
    invoke-static {v5, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 121
    .line 122
    .line 123
    :cond_3
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_4
    return-void
.end method

.method public final k(Landroid/view/ViewStructure;)V
    .locals 11

    .line 1
    sget-object v0, Lm0/x;->a:Lm0/x;

    .line 2
    .line 3
    iget-object v1, p0, Lm0/f;->b:LR0/v;

    .line 4
    .line 5
    invoke-virtual {v1}, LR0/v;->c()LR0/n;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Lm0/f;->g:Landroid/view/autofill/AutofillId;

    .line 10
    .line 11
    iget-object v3, p0, Lm0/f;->e:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v4, p0, Lm0/f;->d:LS0/b;

    .line 14
    .line 15
    invoke-static {p1, v1, v2, v3, v4}, Lm0/T;->a(Landroid/view/ViewStructure;LR0/n;Landroid/view/autofill/AutofillId;Ljava/lang/String;LS0/b;)V

    .line 16
    .line 17
    .line 18
    invoke-static {v1, p1}, Lt/W;->d(Ljava/lang/Object;Ljava/lang/Object;)Lt/L;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    :cond_0
    invoke-virtual {p1}, Lt/V;->g()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_4

    .line 27
    .line 28
    iget v1, p1, Lt/V;->b:I

    .line 29
    .line 30
    const/4 v2, 0x1

    .line 31
    sub-int/2addr v1, v2

    .line 32
    invoke-virtual {p1, v1}, Lt/L;->r(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    const-string v3, "null cannot be cast to non-null type android.view.ViewStructure"

    .line 37
    .line 38
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    check-cast v1, Landroid/view/ViewStructure;

    .line 42
    .line 43
    iget v3, p1, Lt/V;->b:I

    .line 44
    .line 45
    sub-int/2addr v3, v2

    .line 46
    invoke-virtual {p1, v3}, Lt/L;->r(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    const-string v4, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsInfo"

    .line 51
    .line 52
    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    check-cast v3, LR0/n;

    .line 56
    .line 57
    invoke-interface {v3}, LR0/n;->n()Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    const/4 v5, 0x0

    .line 66
    :goto_0
    if-ge v5, v4, :cond_0

    .line 67
    .line 68
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    check-cast v6, LR0/n;

    .line 73
    .line 74
    invoke-interface {v6}, LI0/t;->z()Z

    .line 75
    .line 76
    .line 77
    move-result v7

    .line 78
    if-nez v7, :cond_3

    .line 79
    .line 80
    invoke-interface {v6}, LI0/t;->b()Z

    .line 81
    .line 82
    .line 83
    move-result v7

    .line 84
    if-eqz v7, :cond_3

    .line 85
    .line 86
    invoke-interface {v6}, LI0/t;->p()Z

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    if-nez v7, :cond_1

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_1
    invoke-interface {v6}, LR0/n;->e()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 94
    .line 95
    .line 96
    move-result-object v7

    .line 97
    if-eqz v7, :cond_2

    .line 98
    .line 99
    invoke-static {v7}, Lm0/g;->c(Landroidx/compose/ui/semantics/SemanticsConfiguration;)Z

    .line 100
    .line 101
    .line 102
    move-result v7

    .line 103
    if-ne v7, v2, :cond_2

    .line 104
    .line 105
    invoke-virtual {v0, v1, v2}, Lm0/x;->a(Landroid/view/ViewStructure;I)I

    .line 106
    .line 107
    .line 108
    move-result v7

    .line 109
    invoke-virtual {v0, v1, v7}, Lm0/x;->g(Landroid/view/ViewStructure;I)Landroid/view/ViewStructure;

    .line 110
    .line 111
    .line 112
    move-result-object v7

    .line 113
    iget-object v8, p0, Lm0/f;->g:Landroid/view/autofill/AutofillId;

    .line 114
    .line 115
    iget-object v9, p0, Lm0/f;->e:Ljava/lang/String;

    .line 116
    .line 117
    iget-object v10, p0, Lm0/f;->d:LS0/b;

    .line 118
    .line 119
    invoke-static {v7, v6, v8, v9, v10}, Lm0/T;->a(Landroid/view/ViewStructure;LR0/n;Landroid/view/autofill/AutofillId;Ljava/lang/String;LS0/b;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1, v6}, Lt/L;->k(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1, v7}, Lt/L;->k(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_2
    invoke-virtual {p1, v6}, Lt/L;->k(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    invoke-virtual {p1, v1}, Lt/L;->k(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    :cond_3
    :goto_1
    add-int/lit8 v5, v5, 0x1

    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_4
    return-void
.end method
