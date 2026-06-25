.class public final Lq9/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq9/b$a;
    }
.end annotation


# instance fields
.field private final a:Lq9/b$a;

.field private final b:Lq9/b$a;

.field final c:F

.field final d:F

.field final e:F

.field final f:F

.field final g:F

.field final h:F

.field final i:I

.field final j:I

.field k:I

.field l:I


# direct methods
.method constructor <init>(Landroid/content/Context;IIILq9/b$a;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lq9/b$a;

    invoke-direct {v0}, Lq9/b$a;-><init>()V

    iput-object v0, p0, Lq9/b;->b:Lq9/b$a;

    if-nez p5, :cond_0

    .line 3
    new-instance p5, Lq9/b$a;

    invoke-direct {p5}, Lq9/b$a;-><init>()V

    :cond_0
    if-eqz p2, :cond_1

    .line 4
    invoke-static {p5, p2}, Lq9/b$a;->b(Lq9/b$a;I)I

    .line 5
    :cond_1
    invoke-static {p5}, Lq9/b$a;->a(Lq9/b$a;)I

    move-result p2

    invoke-direct {p0, p1, p2, p3, p4}, Lq9/b;->c(Landroid/content/Context;III)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 6
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    .line 7
    sget p4, Lo9/k;->v:I

    const/4 v1, -0x1

    .line 8
    invoke-virtual {p2, p4, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p4

    int-to-float p4, p4

    iput p4, p0, Lq9/b;->c:F

    .line 9
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p4

    sget v2, Lo9/c;->V:I

    .line 10
    invoke-virtual {p4, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p4

    iput p4, p0, Lq9/b;->i:I

    .line 11
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p4

    sget v2, Lo9/c;->X:I

    .line 12
    invoke-virtual {p4, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p4

    iput p4, p0, Lq9/b;->j:I

    .line 13
    sget p4, Lo9/k;->F:I

    .line 14
    invoke-virtual {p2, p4, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p4

    int-to-float p4, p4

    iput p4, p0, Lq9/b;->d:F

    .line 15
    sget p4, Lo9/k;->D:I

    sget v2, Lo9/c;->t:I

    .line 16
    invoke-virtual {p3, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    invoke-virtual {p2, p4, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p4

    iput p4, p0, Lq9/b;->e:F

    .line 17
    sget p4, Lo9/k;->I:I

    sget v2, Lo9/c;->u:I

    .line 18
    invoke-virtual {p3, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    .line 19
    invoke-virtual {p2, p4, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p4

    iput p4, p0, Lq9/b;->g:F

    .line 20
    sget p4, Lo9/k;->u:I

    sget v2, Lo9/c;->t:I

    .line 21
    invoke-virtual {p3, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    invoke-virtual {p2, p4, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p4

    iput p4, p0, Lq9/b;->f:F

    .line 22
    sget p4, Lo9/k;->E:I

    sget v2, Lo9/c;->u:I

    .line 23
    invoke-virtual {p3, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    .line 24
    invoke-virtual {p2, p4, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p4

    iput p4, p0, Lq9/b;->h:F

    .line 25
    sget p4, Lo9/k;->P:I

    const/4 v2, 0x1

    .line 26
    invoke-virtual {p2, p4, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p4

    iput p4, p0, Lq9/b;->k:I

    .line 27
    sget p4, Lo9/k;->s:I

    const/4 v3, 0x0

    .line 28
    invoke-virtual {p2, p4, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p4

    iput p4, p0, Lq9/b;->l:I

    .line 29
    invoke-static {p5}, Lq9/b$a;->c(Lq9/b$a;)I

    move-result p4

    const/4 v4, -0x2

    if-ne p4, v4, :cond_2

    const/16 p4, 0xff

    goto :goto_0

    :cond_2
    invoke-static {p5}, Lq9/b$a;->c(Lq9/b$a;)I

    move-result p4

    :goto_0
    invoke-static {v0, p4}, Lq9/b$a;->f(Lq9/b$a;I)I

    .line 30
    invoke-static {p5}, Lq9/b$a;->E(Lq9/b$a;)I

    move-result p4

    if-eq p4, v4, :cond_3

    .line 31
    invoke-static {p5}, Lq9/b$a;->E(Lq9/b$a;)I

    move-result p4

    invoke-static {v0, p4}, Lq9/b$a;->O(Lq9/b$a;I)I

    goto :goto_1

    .line 32
    :cond_3
    sget p4, Lo9/k;->O:I

    invoke-virtual {p2, p4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p4

    if-eqz p4, :cond_4

    .line 33
    sget p4, Lo9/k;->O:I

    invoke-virtual {p2, p4, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p4

    invoke-static {v0, p4}, Lq9/b$a;->O(Lq9/b$a;I)I

    goto :goto_1

    .line 34
    :cond_4
    invoke-static {v0, v1}, Lq9/b$a;->O(Lq9/b$a;I)I

    .line 35
    :goto_1
    invoke-static {p5}, Lq9/b$a;->n0(Lq9/b$a;)Ljava/lang/String;

    move-result-object p4

    if-eqz p4, :cond_5

    .line 36
    invoke-static {p5}, Lq9/b$a;->n0(Lq9/b$a;)Ljava/lang/String;

    move-result-object p4

    invoke-static {v0, p4}, Lq9/b$a;->o0(Lq9/b$a;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_2

    .line 37
    :cond_5
    sget p4, Lo9/k;->y:I

    invoke-virtual {p2, p4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p4

    if-eqz p4, :cond_6

    .line 38
    sget p4, Lo9/k;->y:I

    invoke-virtual {p2, p4}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p4

    invoke-static {v0, p4}, Lq9/b$a;->o0(Lq9/b$a;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    :cond_6
    :goto_2
    invoke-static {p5}, Lq9/b$a;->p0(Lq9/b$a;)Ljava/lang/CharSequence;

    move-result-object p4

    invoke-static {v0, p4}, Lq9/b$a;->q0(Lq9/b$a;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 40
    invoke-static {p5}, Lq9/b$a;->r0(Lq9/b$a;)Ljava/lang/CharSequence;

    move-result-object p4

    if-nez p4, :cond_7

    .line 41
    sget p4, Lo9/i;->j:I

    invoke-virtual {p1, p4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p4

    goto :goto_3

    .line 42
    :cond_7
    invoke-static {p5}, Lq9/b$a;->r0(Lq9/b$a;)Ljava/lang/CharSequence;

    move-result-object p4

    .line 43
    :goto_3
    invoke-static {v0, p4}, Lq9/b$a;->s0(Lq9/b$a;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 44
    invoke-static {p5}, Lq9/b$a;->t0(Lq9/b$a;)I

    move-result p4

    if-nez p4, :cond_8

    .line 45
    sget p4, Lo9/h;->a:I

    goto :goto_4

    .line 46
    :cond_8
    invoke-static {p5}, Lq9/b$a;->t0(Lq9/b$a;)I

    move-result p4

    .line 47
    :goto_4
    invoke-static {v0, p4}, Lq9/b$a;->u0(Lq9/b$a;I)I

    .line 48
    invoke-static {p5}, Lq9/b$a;->v0(Lq9/b$a;)I

    move-result p4

    if-nez p4, :cond_9

    .line 49
    sget p4, Lo9/i;->o:I

    goto :goto_5

    .line 50
    :cond_9
    invoke-static {p5}, Lq9/b$a;->v0(Lq9/b$a;)I

    move-result p4

    .line 51
    :goto_5
    invoke-static {v0, p4}, Lq9/b$a;->w0(Lq9/b$a;I)I

    .line 52
    invoke-static {p5}, Lq9/b$a;->x0(Lq9/b$a;)Ljava/lang/Boolean;

    move-result-object p4

    if-eqz p4, :cond_b

    invoke-static {p5}, Lq9/b$a;->x0(Lq9/b$a;)Ljava/lang/Boolean;

    move-result-object p4

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p4

    if-eqz p4, :cond_a

    goto :goto_6

    :cond_a
    move v2, v3

    :cond_b
    :goto_6
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p4

    invoke-static {v0, p4}, Lq9/b$a;->y0(Lq9/b$a;Ljava/lang/Boolean;)Ljava/lang/Boolean;

    .line 53
    invoke-static {p5}, Lq9/b$a;->z0(Lq9/b$a;)I

    move-result p4

    if-ne p4, v4, :cond_c

    .line 54
    sget p4, Lo9/k;->M:I

    invoke-virtual {p2, p4, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p4

    goto :goto_7

    .line 55
    :cond_c
    invoke-static {p5}, Lq9/b$a;->z0(Lq9/b$a;)I

    move-result p4

    .line 56
    :goto_7
    invoke-static {v0, p4}, Lq9/b$a;->A0(Lq9/b$a;I)I

    .line 57
    invoke-static {p5}, Lq9/b$a;->d(Lq9/b$a;)I

    move-result p4

    if-ne p4, v4, :cond_d

    .line 58
    sget p4, Lo9/k;->N:I

    invoke-virtual {p2, p4, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p4

    goto :goto_8

    .line 59
    :cond_d
    invoke-static {p5}, Lq9/b$a;->d(Lq9/b$a;)I

    move-result p4

    .line 60
    :goto_8
    invoke-static {v0, p4}, Lq9/b$a;->e(Lq9/b$a;I)I

    .line 61
    invoke-static {p5}, Lq9/b$a;->g(Lq9/b$a;)Ljava/lang/Integer;

    move-result-object p4

    if-nez p4, :cond_e

    .line 62
    sget p4, Lo9/k;->w:I

    sget v1, Lo9/j;->b:I

    invoke-virtual {p2, p4, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p4

    goto :goto_9

    .line 63
    :cond_e
    invoke-static {p5}, Lq9/b$a;->g(Lq9/b$a;)Ljava/lang/Integer;

    move-result-object p4

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result p4

    .line 64
    :goto_9
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    .line 65
    invoke-static {v0, p4}, Lq9/b$a;->h(Lq9/b$a;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 66
    invoke-static {p5}, Lq9/b$a;->i(Lq9/b$a;)Ljava/lang/Integer;

    move-result-object p4

    if-nez p4, :cond_f

    .line 67
    sget p4, Lo9/k;->x:I

    invoke-virtual {p2, p4, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p4

    goto :goto_a

    .line 68
    :cond_f
    invoke-static {p5}, Lq9/b$a;->i(Lq9/b$a;)Ljava/lang/Integer;

    move-result-object p4

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result p4

    .line 69
    :goto_a
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    .line 70
    invoke-static {v0, p4}, Lq9/b$a;->j(Lq9/b$a;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 71
    invoke-static {p5}, Lq9/b$a;->k(Lq9/b$a;)Ljava/lang/Integer;

    move-result-object p4

    if-nez p4, :cond_10

    .line 72
    sget p4, Lo9/k;->G:I

    sget v1, Lo9/j;->b:I

    invoke-virtual {p2, p4, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p4

    goto :goto_b

    .line 73
    :cond_10
    invoke-static {p5}, Lq9/b$a;->k(Lq9/b$a;)Ljava/lang/Integer;

    move-result-object p4

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result p4

    .line 74
    :goto_b
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    .line 75
    invoke-static {v0, p4}, Lq9/b$a;->l(Lq9/b$a;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 76
    invoke-static {p5}, Lq9/b$a;->m(Lq9/b$a;)Ljava/lang/Integer;

    move-result-object p4

    if-nez p4, :cond_11

    .line 77
    sget p4, Lo9/k;->H:I

    invoke-virtual {p2, p4, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p4

    goto :goto_c

    .line 78
    :cond_11
    invoke-static {p5}, Lq9/b$a;->m(Lq9/b$a;)Ljava/lang/Integer;

    move-result-object p4

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result p4

    .line 79
    :goto_c
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    .line 80
    invoke-static {v0, p4}, Lq9/b$a;->o(Lq9/b$a;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 81
    invoke-static {p5}, Lq9/b$a;->q(Lq9/b$a;)Ljava/lang/Integer;

    move-result-object p4

    if-nez p4, :cond_12

    .line 82
    sget p4, Lo9/k;->r:I

    invoke-static {p1, p2, p4}, Lq9/b;->J(Landroid/content/Context;Landroid/content/res/TypedArray;I)I

    move-result p4

    goto :goto_d

    .line 83
    :cond_12
    invoke-static {p5}, Lq9/b$a;->q(Lq9/b$a;)Ljava/lang/Integer;

    move-result-object p4

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result p4

    .line 84
    :goto_d
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    .line 85
    invoke-static {v0, p4}, Lq9/b$a;->r(Lq9/b$a;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 86
    invoke-static {p5}, Lq9/b$a;->s(Lq9/b$a;)Ljava/lang/Integer;

    move-result-object p4

    if-nez p4, :cond_13

    .line 87
    sget p4, Lo9/k;->z:I

    sget v1, Lo9/j;->c:I

    invoke-virtual {p2, p4, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p4

    goto :goto_e

    .line 88
    :cond_13
    invoke-static {p5}, Lq9/b$a;->s(Lq9/b$a;)Ljava/lang/Integer;

    move-result-object p4

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result p4

    .line 89
    :goto_e
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    .line 90
    invoke-static {v0, p4}, Lq9/b$a;->w(Lq9/b$a;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 91
    invoke-static {p5}, Lq9/b$a;->x(Lq9/b$a;)Ljava/lang/Integer;

    move-result-object p4

    if-eqz p4, :cond_14

    .line 92
    invoke-static {p5}, Lq9/b$a;->x(Lq9/b$a;)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v0, p1}, Lq9/b$a;->y(Lq9/b$a;Ljava/lang/Integer;)Ljava/lang/Integer;

    goto :goto_f

    .line 93
    :cond_14
    sget p4, Lo9/k;->A:I

    invoke-virtual {p2, p4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p4

    if-eqz p4, :cond_15

    .line 94
    sget p4, Lo9/k;->A:I

    .line 95
    invoke-static {p1, p2, p4}, Lq9/b;->J(Landroid/content/Context;Landroid/content/res/TypedArray;I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 96
    invoke-static {v0, p1}, Lq9/b$a;->y(Lq9/b$a;Ljava/lang/Integer;)Ljava/lang/Integer;

    goto :goto_f

    .line 97
    :cond_15
    new-instance p4, LE9/e;

    .line 98
    invoke-static {v0}, Lq9/b$a;->s(Lq9/b$a;)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-direct {p4, p1, v1}, LE9/e;-><init>(Landroid/content/Context;I)V

    .line 99
    invoke-virtual {p4}, LE9/e;->j()Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v0, p1}, Lq9/b$a;->y(Lq9/b$a;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 100
    :goto_f
    invoke-static {p5}, Lq9/b$a;->z(Lq9/b$a;)Ljava/lang/Integer;

    move-result-object p1

    if-nez p1, :cond_16

    .line 101
    sget p1, Lo9/k;->t:I

    const p4, 0x800035

    invoke-virtual {p2, p1, p4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    goto :goto_10

    .line 102
    :cond_16
    invoke-static {p5}, Lq9/b$a;->z(Lq9/b$a;)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 103
    :goto_10
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 104
    invoke-static {v0, p1}, Lq9/b$a;->A(Lq9/b$a;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 105
    invoke-static {p5}, Lq9/b$a;->B(Lq9/b$a;)Ljava/lang/Integer;

    move-result-object p1

    if-nez p1, :cond_17

    .line 106
    sget p1, Lo9/k;->C:I

    sget p4, Lo9/c;->W:I

    .line 107
    invoke-virtual {p3, p4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p4

    .line 108
    invoke-virtual {p2, p1, p4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p1

    goto :goto_11

    .line 109
    :cond_17
    invoke-static {p5}, Lq9/b$a;->B(Lq9/b$a;)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 110
    :goto_11
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 111
    invoke-static {v0, p1}, Lq9/b$a;->C(Lq9/b$a;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 112
    invoke-static {p5}, Lq9/b$a;->H(Lq9/b$a;)Ljava/lang/Integer;

    move-result-object p1

    if-nez p1, :cond_18

    .line 113
    sget p1, Lo9/k;->B:I

    sget p4, Lo9/c;->v:I

    .line 114
    invoke-virtual {p3, p4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p3

    .line 115
    invoke-virtual {p2, p1, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p1

    goto :goto_12

    .line 116
    :cond_18
    invoke-static {p5}, Lq9/b$a;->H(Lq9/b$a;)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 117
    :goto_12
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 118
    invoke-static {v0, p1}, Lq9/b$a;->J(Lq9/b$a;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 119
    invoke-static {p5}, Lq9/b$a;->S(Lq9/b$a;)Ljava/lang/Integer;

    move-result-object p1

    if-nez p1, :cond_19

    .line 120
    sget p1, Lo9/k;->J:I

    invoke-virtual {p2, p1, v3}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result p1

    goto :goto_13

    .line 121
    :cond_19
    invoke-static {p5}, Lq9/b$a;->S(Lq9/b$a;)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 122
    :goto_13
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 123
    invoke-static {v0, p1}, Lq9/b$a;->W(Lq9/b$a;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 124
    invoke-static {p5}, Lq9/b$a;->X(Lq9/b$a;)Ljava/lang/Integer;

    move-result-object p1

    if-nez p1, :cond_1a

    .line 125
    sget p1, Lo9/k;->Q:I

    invoke-virtual {p2, p1, v3}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result p1

    goto :goto_14

    .line 126
    :cond_1a
    invoke-static {p5}, Lq9/b$a;->X(Lq9/b$a;)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 127
    :goto_14
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 128
    invoke-static {v0, p1}, Lq9/b$a;->Y(Lq9/b$a;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 129
    invoke-static {p5}, Lq9/b$a;->Z(Lq9/b$a;)Ljava/lang/Integer;

    move-result-object p1

    if-nez p1, :cond_1b

    .line 130
    sget p1, Lo9/k;->K:I

    .line 131
    invoke-static {v0}, Lq9/b$a;->S(Lq9/b$a;)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    .line 132
    invoke-virtual {p2, p1, p3}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result p1

    goto :goto_15

    .line 133
    :cond_1b
    invoke-static {p5}, Lq9/b$a;->Z(Lq9/b$a;)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 134
    :goto_15
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 135
    invoke-static {v0, p1}, Lq9/b$a;->a0(Lq9/b$a;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 136
    invoke-static {p5}, Lq9/b$a;->b0(Lq9/b$a;)Ljava/lang/Integer;

    move-result-object p1

    if-nez p1, :cond_1c

    .line 137
    sget p1, Lo9/k;->R:I

    .line 138
    invoke-static {v0}, Lq9/b$a;->X(Lq9/b$a;)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    .line 139
    invoke-virtual {p2, p1, p3}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result p1

    goto :goto_16

    .line 140
    :cond_1c
    invoke-static {p5}, Lq9/b$a;->b0(Lq9/b$a;)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 141
    :goto_16
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 142
    invoke-static {v0, p1}, Lq9/b$a;->c0(Lq9/b$a;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 143
    invoke-static {p5}, Lq9/b$a;->d0(Lq9/b$a;)Ljava/lang/Integer;

    move-result-object p1

    if-nez p1, :cond_1d

    .line 144
    sget p1, Lo9/k;->L:I

    invoke-virtual {p2, p1, v3}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result p1

    goto :goto_17

    .line 145
    :cond_1d
    invoke-static {p5}, Lq9/b$a;->d0(Lq9/b$a;)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 146
    :goto_17
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 147
    invoke-static {v0, p1}, Lq9/b$a;->e0(Lq9/b$a;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 148
    invoke-static {p5}, Lq9/b$a;->f0(Lq9/b$a;)Ljava/lang/Integer;

    move-result-object p1

    if-nez p1, :cond_1e

    move p1, v3

    goto :goto_18

    :cond_1e
    invoke-static {p5}, Lq9/b$a;->f0(Lq9/b$a;)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    :goto_18
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 149
    invoke-static {v0, p1}, Lq9/b$a;->g0(Lq9/b$a;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 150
    invoke-static {p5}, Lq9/b$a;->h0(Lq9/b$a;)Ljava/lang/Integer;

    move-result-object p1

    if-nez p1, :cond_1f

    move p1, v3

    goto :goto_19

    :cond_1f
    invoke-static {p5}, Lq9/b$a;->h0(Lq9/b$a;)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    :goto_19
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 151
    invoke-static {v0, p1}, Lq9/b$a;->i0(Lq9/b$a;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 152
    invoke-static {p5}, Lq9/b$a;->j0(Lq9/b$a;)Ljava/lang/Boolean;

    move-result-object p1

    if-nez p1, :cond_20

    .line 153
    sget p1, Lo9/k;->q:I

    invoke-virtual {p2, p1, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    goto :goto_1a

    .line 154
    :cond_20
    invoke-static {p5}, Lq9/b$a;->j0(Lq9/b$a;)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    .line 155
    :goto_1a
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    .line 156
    invoke-static {v0, p1}, Lq9/b$a;->k0(Lq9/b$a;Ljava/lang/Boolean;)Ljava/lang/Boolean;

    .line 157
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 158
    invoke-static {p5}, Lq9/b$a;->l0(Lq9/b$a;)Ljava/util/Locale;

    move-result-object p1

    if-nez p1, :cond_21

    .line 159
    sget-object p1, Ljava/util/Locale$Category;->FORMAT:Ljava/util/Locale$Category;

    invoke-static {p1}, Ljava/util/Locale;->getDefault(Ljava/util/Locale$Category;)Ljava/util/Locale;

    move-result-object p1

    .line 160
    invoke-static {v0, p1}, Lq9/b$a;->m0(Lq9/b$a;Ljava/util/Locale;)Ljava/util/Locale;

    goto :goto_1b

    .line 161
    :cond_21
    invoke-static {p5}, Lq9/b$a;->l0(Lq9/b$a;)Ljava/util/Locale;

    move-result-object p1

    invoke-static {v0, p1}, Lq9/b$a;->m0(Lq9/b$a;Ljava/util/Locale;)Ljava/util/Locale;

    .line 162
    :goto_1b
    iput-object p5, p0, Lq9/b;->a:Lq9/b$a;

    return-void
.end method

.method private static J(Landroid/content/Context;Landroid/content/res/TypedArray;I)I
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LE9/c;->a(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method private c(Landroid/content/Context;III)Landroid/content/res/TypedArray;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p2, :cond_0

    .line 3
    .line 4
    const-string v1, "badge"

    .line 5
    .line 6
    invoke-static {p1, p2, v1}, Lcom/google/android/material/drawable/d;->i(Landroid/content/Context;ILjava/lang/CharSequence;)Landroid/util/AttributeSet;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    invoke-interface {p2}, Landroid/util/AttributeSet;->getStyleAttribute()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    :goto_0
    move-object v2, p2

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    const/4 p2, 0x0

    .line 17
    move v1, v0

    .line 18
    goto :goto_0

    .line 19
    :goto_1
    if-nez v1, :cond_1

    .line 20
    .line 21
    move v5, p4

    .line 22
    goto :goto_2

    .line 23
    :cond_1
    move v5, v1

    .line 24
    :goto_2
    sget-object v3, Lo9/k;->p:[I

    .line 25
    .line 26
    new-array v6, v0, [I

    .line 27
    .line 28
    move-object v1, p1

    .line 29
    move v4, p3

    .line 30
    invoke-static/range {v1 .. v6}, Lcom/google/android/material/internal/m;->i(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Landroid/content/res/TypedArray;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1
.end method


# virtual methods
.method A()Lq9/b$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lq9/b;->a:Lq9/b$a;

    .line 2
    .line 3
    return-object v0
.end method

.method B()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lq9/b;->b:Lq9/b$a;

    .line 2
    .line 3
    invoke-static {v0}, Lq9/b$a;->n0(Lq9/b$a;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method C()I
    .locals 1

    .line 1
    iget-object v0, p0, Lq9/b;->b:Lq9/b$a;

    .line 2
    .line 3
    invoke-static {v0}, Lq9/b$a;->s(Lq9/b$a;)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method D()I
    .locals 1

    .line 1
    iget-object v0, p0, Lq9/b;->b:Lq9/b$a;

    .line 2
    .line 3
    invoke-static {v0}, Lq9/b$a;->b0(Lq9/b$a;)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method E()I
    .locals 1

    .line 1
    iget-object v0, p0, Lq9/b;->b:Lq9/b$a;

    .line 2
    .line 3
    invoke-static {v0}, Lq9/b$a;->X(Lq9/b$a;)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method F()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lq9/b;->b:Lq9/b$a;

    .line 2
    .line 3
    invoke-static {v0}, Lq9/b$a;->E(Lq9/b$a;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, -0x1

    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    return v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return v0
.end method

.method G()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lq9/b;->b:Lq9/b$a;

    .line 2
    .line 3
    invoke-static {v0}, Lq9/b$a;->n0(Lq9/b$a;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method H()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lq9/b;->b:Lq9/b$a;

    .line 2
    .line 3
    invoke-static {v0}, Lq9/b$a;->j0(Lq9/b$a;)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method I()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lq9/b;->b:Lq9/b$a;

    .line 2
    .line 3
    invoke-static {v0}, Lq9/b$a;->x0(Lq9/b$a;)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method K(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lq9/b;->a:Lq9/b$a;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lq9/b$a;->f(Lq9/b$a;I)I

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lq9/b;->b:Lq9/b$a;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lq9/b$a;->f(Lq9/b$a;I)I

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method L(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lq9/b;->a:Lq9/b$a;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v0, v1}, Lq9/b$a;->r(Lq9/b$a;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lq9/b;->b:Lq9/b$a;

    .line 11
    .line 12
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {v0, p1}, Lq9/b$a;->r(Lq9/b$a;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method M(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lq9/b;->a:Lq9/b$a;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v0, v1}, Lq9/b$a;->y(Lq9/b$a;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lq9/b;->b:Lq9/b$a;

    .line 11
    .line 12
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {v0, p1}, Lq9/b$a;->y(Lq9/b$a;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method N(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lq9/b;->a:Lq9/b$a;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lq9/b$a;->O(Lq9/b$a;I)I

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lq9/b;->b:Lq9/b$a;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lq9/b$a;->O(Lq9/b$a;I)I

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method O(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lq9/b;->a:Lq9/b$a;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lq9/b$a;->o0(Lq9/b$a;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lq9/b;->b:Lq9/b$a;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lq9/b$a;->o0(Lq9/b$a;Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method P(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lq9/b;->a:Lq9/b$a;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v0, v1}, Lq9/b$a;->y0(Lq9/b$a;Ljava/lang/Boolean;)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lq9/b;->b:Lq9/b$a;

    .line 11
    .line 12
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {v0, p1}, Lq9/b$a;->y0(Lq9/b$a;Ljava/lang/Boolean;)Ljava/lang/Boolean;

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method a()V
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    invoke-virtual {p0, v0}, Lq9/b;->N(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method b()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lq9/b;->O(Ljava/lang/String;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method d()I
    .locals 1

    .line 1
    iget-object v0, p0, Lq9/b;->b:Lq9/b$a;

    .line 2
    .line 3
    invoke-static {v0}, Lq9/b$a;->f0(Lq9/b$a;)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method e()I
    .locals 1

    .line 1
    iget-object v0, p0, Lq9/b;->b:Lq9/b$a;

    .line 2
    .line 3
    invoke-static {v0}, Lq9/b$a;->h0(Lq9/b$a;)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method f()I
    .locals 1

    .line 1
    iget-object v0, p0, Lq9/b;->b:Lq9/b$a;

    .line 2
    .line 3
    invoke-static {v0}, Lq9/b$a;->c(Lq9/b$a;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method g()I
    .locals 1

    .line 1
    iget-object v0, p0, Lq9/b;->b:Lq9/b$a;

    .line 2
    .line 3
    invoke-static {v0}, Lq9/b$a;->q(Lq9/b$a;)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method h()I
    .locals 1

    .line 1
    iget-object v0, p0, Lq9/b;->b:Lq9/b$a;

    .line 2
    .line 3
    invoke-static {v0}, Lq9/b$a;->z(Lq9/b$a;)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method i()I
    .locals 1

    .line 1
    iget-object v0, p0, Lq9/b;->b:Lq9/b$a;

    .line 2
    .line 3
    invoke-static {v0}, Lq9/b$a;->B(Lq9/b$a;)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method j()I
    .locals 1

    .line 1
    iget-object v0, p0, Lq9/b;->b:Lq9/b$a;

    .line 2
    .line 3
    invoke-static {v0}, Lq9/b$a;->i(Lq9/b$a;)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method k()I
    .locals 1

    .line 1
    iget-object v0, p0, Lq9/b;->b:Lq9/b$a;

    .line 2
    .line 3
    invoke-static {v0}, Lq9/b$a;->g(Lq9/b$a;)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method l()I
    .locals 1

    .line 1
    iget-object v0, p0, Lq9/b;->b:Lq9/b$a;

    .line 2
    .line 3
    invoke-static {v0}, Lq9/b$a;->x(Lq9/b$a;)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method m()I
    .locals 1

    .line 1
    iget-object v0, p0, Lq9/b;->b:Lq9/b$a;

    .line 2
    .line 3
    invoke-static {v0}, Lq9/b$a;->H(Lq9/b$a;)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method n()I
    .locals 1

    .line 1
    iget-object v0, p0, Lq9/b;->b:Lq9/b$a;

    .line 2
    .line 3
    invoke-static {v0}, Lq9/b$a;->m(Lq9/b$a;)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method o()I
    .locals 1

    .line 1
    iget-object v0, p0, Lq9/b;->b:Lq9/b$a;

    .line 2
    .line 3
    invoke-static {v0}, Lq9/b$a;->k(Lq9/b$a;)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method p()I
    .locals 1

    .line 1
    iget-object v0, p0, Lq9/b;->b:Lq9/b$a;

    .line 2
    .line 3
    invoke-static {v0}, Lq9/b$a;->v0(Lq9/b$a;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method q()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, Lq9/b;->b:Lq9/b$a;

    .line 2
    .line 3
    invoke-static {v0}, Lq9/b$a;->p0(Lq9/b$a;)Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method r()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, Lq9/b;->b:Lq9/b$a;

    .line 2
    .line 3
    invoke-static {v0}, Lq9/b$a;->r0(Lq9/b$a;)Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method s()I
    .locals 1

    .line 1
    iget-object v0, p0, Lq9/b;->b:Lq9/b$a;

    .line 2
    .line 3
    invoke-static {v0}, Lq9/b$a;->t0(Lq9/b$a;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method t()I
    .locals 1

    .line 1
    iget-object v0, p0, Lq9/b;->b:Lq9/b$a;

    .line 2
    .line 3
    invoke-static {v0}, Lq9/b$a;->Z(Lq9/b$a;)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method u()I
    .locals 1

    .line 1
    iget-object v0, p0, Lq9/b;->b:Lq9/b$a;

    .line 2
    .line 3
    invoke-static {v0}, Lq9/b$a;->S(Lq9/b$a;)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method v()I
    .locals 1

    .line 1
    iget-object v0, p0, Lq9/b;->b:Lq9/b$a;

    .line 2
    .line 3
    invoke-static {v0}, Lq9/b$a;->d0(Lq9/b$a;)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method w()I
    .locals 1

    .line 1
    iget-object v0, p0, Lq9/b;->b:Lq9/b$a;

    .line 2
    .line 3
    invoke-static {v0}, Lq9/b$a;->z0(Lq9/b$a;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method x()I
    .locals 1

    .line 1
    iget-object v0, p0, Lq9/b;->b:Lq9/b$a;

    .line 2
    .line 3
    invoke-static {v0}, Lq9/b$a;->d(Lq9/b$a;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method y()I
    .locals 1

    .line 1
    iget-object v0, p0, Lq9/b;->b:Lq9/b$a;

    .line 2
    .line 3
    invoke-static {v0}, Lq9/b$a;->E(Lq9/b$a;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method z()Ljava/util/Locale;
    .locals 1

    .line 1
    iget-object v0, p0, Lq9/b;->b:Lq9/b$a;

    .line 2
    .line 3
    invoke-static {v0}, Lq9/b$a;->l0(Lq9/b$a;)Ljava/util/Locale;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
