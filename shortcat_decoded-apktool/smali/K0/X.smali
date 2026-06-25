.class public final LK0/X;
.super Landroidx/compose/ui/layout/s;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LI0/A;
.implements LK0/b;
.implements LK0/Z;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LK0/X$a;
    }
.end annotation


# instance fields
.field private A:Z

.field private B:Z

.field private C:J

.field private final D:Lie/a;

.field private final E:Lie/a;

.field private F:F

.field private G:Z

.field private H:Lkotlin/jvm/functions/Function1;

.field private I:Lv0/c;

.field private X:J

.field private Y:F

.field private final Z:Lie/a;

.field private final f:LK0/O;

.field private g:Z

.field private h:I

.field private i:I

.field private j:Z

.field private k:Z

.field private l:LK0/J$g;

.field private l0:Z

.field private m:Z

.field private m0:Z

.field private n:J

.field private o:Lkotlin/jvm/functions/Function1;

.field private p:Lv0/c;

.field private q:F

.field private r:Z

.field private s:Ljava/lang/Object;

.field private t:Z

.field private u:Z

.field private v:Z

.field private w:Z

.field private x:Z

.field private final y:LK0/a;

.field private final z:La0/c;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(LK0/O;)V
    .locals 10

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/layout/s;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LK0/X;->f:LK0/O;

    .line 5
    .line 6
    const p1, 0x7fffffff

    .line 7
    .line 8
    .line 9
    iput p1, p0, LK0/X;->h:I

    .line 10
    .line 11
    iput p1, p0, LK0/X;->i:I

    .line 12
    .line 13
    sget-object p1, LK0/J$g;->c:LK0/J$g;

    .line 14
    .line 15
    iput-object p1, p0, LK0/X;->l:LK0/J$g;

    .line 16
    .line 17
    sget-object p1, Li1/n;->b:Li1/n$a;

    .line 18
    .line 19
    invoke-virtual {p1}, Li1/n$a;->b()J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    iput-wide v0, p0, LK0/X;->n:J

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    iput-boolean v0, p0, LK0/X;->r:Z

    .line 27
    .line 28
    new-instance v1, LK0/K;

    .line 29
    .line 30
    invoke-direct {v1, p0}, LK0/K;-><init>(LK0/b;)V

    .line 31
    .line 32
    .line 33
    iput-object v1, p0, LK0/X;->y:LK0/a;

    .line 34
    .line 35
    new-instance v1, La0/c;

    .line 36
    .line 37
    const/16 v2, 0x10

    .line 38
    .line 39
    new-array v2, v2, [LK0/X;

    .line 40
    .line 41
    const/4 v3, 0x0

    .line 42
    invoke-direct {v1, v2, v3}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 43
    .line 44
    .line 45
    iput-object v1, p0, LK0/X;->z:La0/c;

    .line 46
    .line 47
    iput-boolean v0, p0, LK0/X;->A:Z

    .line 48
    .line 49
    const/16 v8, 0xf

    .line 50
    .line 51
    const/4 v9, 0x0

    .line 52
    const/4 v4, 0x0

    .line 53
    const/4 v5, 0x0

    .line 54
    const/4 v6, 0x0

    .line 55
    const/4 v7, 0x0

    .line 56
    invoke-static/range {v4 .. v9}, Li1/c;->b(IIIIILjava/lang/Object;)J

    .line 57
    .line 58
    .line 59
    move-result-wide v0

    .line 60
    iput-wide v0, p0, LK0/X;->C:J

    .line 61
    .line 62
    new-instance v0, LK0/X$c;

    .line 63
    .line 64
    invoke-direct {v0, p0}, LK0/X$c;-><init>(LK0/X;)V

    .line 65
    .line 66
    .line 67
    iput-object v0, p0, LK0/X;->D:Lie/a;

    .line 68
    .line 69
    new-instance v0, LK0/X$b;

    .line 70
    .line 71
    invoke-direct {v0, p0}, LK0/X$b;-><init>(LK0/X;)V

    .line 72
    .line 73
    .line 74
    iput-object v0, p0, LK0/X;->E:Lie/a;

    .line 75
    .line 76
    invoke-virtual {p1}, Li1/n$a;->b()J

    .line 77
    .line 78
    .line 79
    move-result-wide v0

    .line 80
    iput-wide v0, p0, LK0/X;->X:J

    .line 81
    .line 82
    new-instance p1, LK0/X$d;

    .line 83
    .line 84
    invoke-direct {p1, p0}, LK0/X$d;-><init>(LK0/X;)V

    .line 85
    .line 86
    .line 87
    iput-object p1, p0, LK0/X;->Z:Lie/a;

    .line 88
    .line 89
    return-void
.end method

.method public static final synthetic E1(LK0/X;)J
    .locals 2

    .line 1
    iget-wide v0, p0, LK0/X;->X:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static final synthetic F1(LK0/X;)F
    .locals 0

    .line 1
    iget p0, p0, LK0/X;->Y:F

    .line 2
    .line 3
    return p0
.end method

.method private final G1()V
    .locals 8

    .line 1
    invoke-virtual {p0}, LK0/X;->L1()LK0/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LK0/J;->I0()La0/c;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, v1, La0/c;->a:[Ljava/lang/Object;

    .line 10
    .line 11
    invoke-virtual {v1}, La0/c;->p()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v3, 0x0

    .line 16
    move v4, v3

    .line 17
    :goto_0
    if-ge v4, v1, :cond_2

    .line 18
    .line 19
    aget-object v5, v2, v4

    .line 20
    .line 21
    check-cast v5, LK0/J;

    .line 22
    .line 23
    invoke-virtual {v5}, LK0/J;->l0()LK0/X;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    iget v6, v6, LK0/X;->h:I

    .line 28
    .line 29
    invoke-virtual {v5}, LK0/J;->B0()I

    .line 30
    .line 31
    .line 32
    move-result v7

    .line 33
    if-eq v6, v7, :cond_1

    .line 34
    .line 35
    invoke-virtual {v0}, LK0/J;->t1()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, LK0/J;->P0()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v5}, LK0/J;->B0()I

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    const v7, 0x7fffffff

    .line 46
    .line 47
    .line 48
    if-ne v6, v7, :cond_1

    .line 49
    .line 50
    invoke-virtual {v5}, LK0/J;->d0()LK0/O;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    invoke-virtual {v6}, LK0/O;->h()Z

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    if-eqz v6, :cond_0

    .line 59
    .line 60
    invoke-virtual {v5}, LK0/J;->i0()LK0/V;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    invoke-static {v6}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v6, v3}, LK0/V;->W1(Z)V

    .line 68
    .line 69
    .line 70
    :cond_0
    invoke-virtual {v5}, LK0/J;->l0()LK0/X;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    invoke-direct {v5}, LK0/X;->c2()V

    .line 75
    .line 76
    .line 77
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_2
    return-void
.end method

.method private final H1()V
    .locals 7

    .line 1
    iget-object v0, p0, LK0/X;->f:LK0/O;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, LK0/O;->Y(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LK0/X;->L1()LK0/J;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, LK0/J;->I0()La0/c;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v2, v0, La0/c;->a:[Ljava/lang/Object;

    .line 16
    .line 17
    invoke-virtual {v0}, La0/c;->p()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    move v3, v1

    .line 22
    :goto_0
    if-ge v3, v0, :cond_1

    .line 23
    .line 24
    aget-object v4, v2, v3

    .line 25
    .line 26
    check-cast v4, LK0/J;

    .line 27
    .line 28
    invoke-virtual {v4}, LK0/J;->l0()LK0/X;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    iget v5, v4, LK0/X;->i:I

    .line 33
    .line 34
    iput v5, v4, LK0/X;->h:I

    .line 35
    .line 36
    const v5, 0x7fffffff

    .line 37
    .line 38
    .line 39
    iput v5, v4, LK0/X;->i:I

    .line 40
    .line 41
    iput-boolean v1, v4, LK0/X;->u:Z

    .line 42
    .line 43
    iget-object v5, v4, LK0/X;->l:LK0/J$g;

    .line 44
    .line 45
    sget-object v6, LK0/J$g;->b:LK0/J$g;

    .line 46
    .line 47
    if-ne v5, v6, :cond_0

    .line 48
    .line 49
    sget-object v5, LK0/J$g;->c:LK0/J$g;

    .line 50
    .line 51
    iput-object v5, v4, LK0/X;->l:LK0/J$g;

    .line 52
    .line 53
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    return-void
.end method

.method private final O1()LK0/V;
    .locals 1

    .line 1
    iget-object v0, p0, LK0/X;->f:LK0/O;

    .line 2
    .line 3
    invoke-virtual {v0}, LK0/O;->u()LK0/V;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method private final b2()V
    .locals 8

    .line 1
    invoke-virtual {p0}, LK0/X;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {p0, v1}, LK0/X;->q2(Z)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, LK0/X;->L1()LK0/J;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v2}, LK0/J;->X()LK0/e0;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, LK0/e0;->i3()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2}, LK0/J;->m0()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    const/4 v6, 0x6

    .line 29
    const/4 v7, 0x0

    .line 30
    const/4 v3, 0x1

    .line 31
    const/4 v4, 0x0

    .line 32
    const/4 v5, 0x0

    .line 33
    invoke-static/range {v2 .. v7}, LK0/J;->I1(LK0/J;ZZZILjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-virtual {v2}, LK0/J;->h0()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    const/4 v6, 0x6

    .line 44
    const/4 v7, 0x0

    .line 45
    const/4 v3, 0x1

    .line 46
    const/4 v4, 0x0

    .line 47
    const/4 v5, 0x0

    .line 48
    invoke-static/range {v2 .. v7}, LK0/J;->E1(LK0/J;ZZZILjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    :goto_0
    invoke-virtual {v2}, LK0/J;->w0()LK0/e0;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v2}, LK0/J;->X()LK0/e0;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v1}, LK0/e0;->O2()LK0/e0;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    :goto_1
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-nez v3, :cond_3

    .line 68
    .line 69
    if-eqz v0, :cond_3

    .line 70
    .line 71
    invoke-virtual {v0}, LK0/e0;->F2()Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-eqz v3, :cond_2

    .line 76
    .line 77
    invoke-virtual {v0}, LK0/e0;->Y2()V

    .line 78
    .line 79
    .line 80
    :cond_2
    invoke-virtual {v0}, LK0/e0;->O2()LK0/e0;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    goto :goto_1

    .line 85
    :cond_3
    invoke-virtual {v2}, LK0/J;->I0()La0/c;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    iget-object v1, v0, La0/c;->a:[Ljava/lang/Object;

    .line 90
    .line 91
    invoke-virtual {v0}, La0/c;->p()I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    const/4 v3, 0x0

    .line 96
    :goto_2
    if-ge v3, v0, :cond_5

    .line 97
    .line 98
    aget-object v4, v1, v3

    .line 99
    .line 100
    check-cast v4, LK0/J;

    .line 101
    .line 102
    invoke-virtual {v4}, LK0/J;->B0()I

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    const v6, 0x7fffffff

    .line 107
    .line 108
    .line 109
    if-eq v5, v6, :cond_4

    .line 110
    .line 111
    invoke-virtual {v4}, LK0/J;->l0()LK0/X;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    invoke-direct {v5}, LK0/X;->b2()V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v2, v4}, LK0/J;->J1(LK0/J;)V

    .line 119
    .line 120
    .line 121
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_5
    return-void
.end method

.method private final c2()V
    .locals 4

    .line 1
    invoke-virtual {p0}, LK0/X;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p0, v0}, LK0/X;->q2(Z)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, LK0/X;->L1()LK0/J;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, LK0/J;->w0()LK0/e0;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v1}, LK0/J;->X()LK0/e0;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1}, LK0/e0;->O2()LK0/e0;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    :goto_0
    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-nez v3, :cond_0

    .line 32
    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    invoke-virtual {v2}, LK0/e0;->k3()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2}, LK0/e0;->r3()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2}, LK0/e0;->O2()LK0/e0;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    invoke-virtual {p0}, LK0/X;->L1()LK0/J;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v1}, LK0/J;->I0()La0/c;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    iget-object v2, v1, La0/c;->a:[Ljava/lang/Object;

    .line 55
    .line 56
    invoke-virtual {v1}, La0/c;->p()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    :goto_1
    if-ge v0, v1, :cond_1

    .line 61
    .line 62
    aget-object v3, v2, v0

    .line 63
    .line 64
    check-cast v3, LK0/J;

    .line 65
    .line 66
    invoke-virtual {v3}, LK0/J;->l0()LK0/X;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-direct {v3}, LK0/X;->c2()V

    .line 71
    .line 72
    .line 73
    add-int/lit8 v0, v0, 0x1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_1
    return-void
.end method

.method private final e2()V
    .locals 10

    .line 1
    invoke-virtual {p0}, LK0/X;->L1()LK0/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LK0/J;->I0()La0/c;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, v0, La0/c;->a:[Ljava/lang/Object;

    .line 10
    .line 11
    invoke-virtual {v0}, La0/c;->p()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v2, 0x0

    .line 16
    :goto_0
    if-ge v2, v0, :cond_1

    .line 17
    .line 18
    aget-object v3, v1, v2

    .line 19
    .line 20
    check-cast v3, LK0/J;

    .line 21
    .line 22
    invoke-virtual {v3}, LK0/J;->m0()Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-eqz v4, :cond_0

    .line 27
    .line 28
    invoke-virtual {v3}, LK0/J;->o0()LK0/J$g;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    sget-object v5, LK0/J$g;->a:LK0/J$g;

    .line 33
    .line 34
    if-ne v4, v5, :cond_0

    .line 35
    .line 36
    const/4 v4, 0x0

    .line 37
    const/4 v5, 0x1

    .line 38
    invoke-static {v3, v4, v5, v4}, LK0/J;->x1(LK0/J;Li1/b;ILjava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-eqz v3, :cond_0

    .line 43
    .line 44
    invoke-virtual {p0}, LK0/X;->L1()LK0/J;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    const/4 v8, 0x7

    .line 49
    const/4 v9, 0x0

    .line 50
    const/4 v5, 0x0

    .line 51
    const/4 v6, 0x0

    .line 52
    const/4 v7, 0x0

    .line 53
    invoke-static/range {v4 .. v9}, LK0/J;->I1(LK0/J;ZZZILjava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    return-void
.end method

.method private final f2()V
    .locals 6

    .line 1
    invoke-virtual {p0}, LK0/X;->L1()LK0/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v4, 0x7

    .line 6
    const/4 v5, 0x0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-static/range {v0 .. v5}, LK0/J;->I1(LK0/J;ZZZILjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, LK0/X;->L1()LK0/J;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, LK0/J;->A0()LK0/J;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    invoke-virtual {p0}, LK0/X;->L1()LK0/J;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, LK0/J;->b0()LK0/J$g;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    sget-object v2, LK0/J$g;->c:LK0/J$g;

    .line 32
    .line 33
    if-ne v1, v2, :cond_2

    .line 34
    .line 35
    invoke-virtual {p0}, LK0/X;->L1()LK0/J;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v0}, LK0/J;->f0()LK0/J$e;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    sget-object v3, LK0/X$a;->a:[I

    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    aget v2, v3, v2

    .line 50
    .line 51
    const/4 v3, 0x1

    .line 52
    if-eq v2, v3, :cond_1

    .line 53
    .line 54
    const/4 v3, 0x2

    .line 55
    if-eq v2, v3, :cond_0

    .line 56
    .line 57
    invoke-virtual {v0}, LK0/J;->b0()LK0/J$g;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    goto :goto_0

    .line 62
    :cond_0
    sget-object v0, LK0/J$g;->b:LK0/J$g;

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    sget-object v0, LK0/J$g;->a:LK0/J$g;

    .line 66
    .line 67
    :goto_0
    invoke-virtual {v1, v0}, LK0/J;->R1(LK0/J$g;)V

    .line 68
    .line 69
    .line 70
    :cond_2
    return-void
.end method

.method private final j2(JFLkotlin/jvm/functions/Function1;Lv0/c;)V
    .locals 9

    .line 1
    invoke-virtual {p0}, LK0/X;->L1()LK0/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LK0/J;->z()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const-string v0, "place is called on a deactivated node"

    .line 12
    .line 13
    invoke-static {v0}, LH0/a;->a(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    sget-object v0, LK0/J$e;->c:LK0/J$e;

    .line 17
    .line 18
    invoke-virtual {p0, v0}, LK0/X;->o2(LK0/J$e;)V

    .line 19
    .line 20
    .line 21
    iput-wide p1, p0, LK0/X;->n:J

    .line 22
    .line 23
    iput p3, p0, LK0/X;->q:F

    .line 24
    .line 25
    iput-object p4, p0, LK0/X;->o:Lkotlin/jvm/functions/Function1;

    .line 26
    .line 27
    iput-object p5, p0, LK0/X;->p:Lv0/c;

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    iput-boolean v0, p0, LK0/X;->G:Z

    .line 31
    .line 32
    invoke-virtual {p0}, LK0/X;->L1()LK0/J;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-static {v1}, LK0/N;->b(LK0/J;)LK0/p0;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iget-boolean v2, p0, LK0/X;->w:Z

    .line 41
    .line 42
    if-nez v2, :cond_1

    .line 43
    .line 44
    invoke-virtual {p0}, LK0/X;->p()Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_1

    .line 49
    .line 50
    invoke-virtual {p0}, LK0/X;->R1()LK0/e0;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    move-wide v4, p1

    .line 55
    move v6, p3

    .line 56
    move-object v7, p4

    .line 57
    move-object v8, p5

    .line 58
    invoke-virtual/range {v3 .. v8}, LK0/e0;->o3(JFLkotlin/jvm/functions/Function1;Lv0/c;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, LK0/X;->h2()V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    move-wide v4, p1

    .line 66
    move v6, p3

    .line 67
    move-object v7, p4

    .line 68
    move-object v8, p5

    .line 69
    invoke-virtual {p0}, LK0/X;->z()LK0/a;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {p1, v0}, LK0/a;->r(Z)V

    .line 74
    .line 75
    .line 76
    iget-object p1, p0, LK0/X;->f:LK0/O;

    .line 77
    .line 78
    invoke-virtual {p1, v0}, LK0/O;->N(Z)V

    .line 79
    .line 80
    .line 81
    iput-object v7, p0, LK0/X;->H:Lkotlin/jvm/functions/Function1;

    .line 82
    .line 83
    iput-wide v4, p0, LK0/X;->X:J

    .line 84
    .line 85
    iput v6, p0, LK0/X;->Y:F

    .line 86
    .line 87
    iput-object v8, p0, LK0/X;->I:Lv0/c;

    .line 88
    .line 89
    invoke-interface {v1}, LK0/p0;->getSnapshotObserver()LK0/r0;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-virtual {p0}, LK0/X;->L1()LK0/J;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    iget-object p3, p0, LK0/X;->Z:Lie/a;

    .line 98
    .line 99
    invoke-virtual {p1, p2, v0, p3}, LK0/r0;->c(LK0/J;ZLie/a;)V

    .line 100
    .line 101
    .line 102
    :goto_0
    sget-object p1, LK0/J$e;->e:LK0/J$e;

    .line 103
    .line 104
    invoke-virtual {p0, p1}, LK0/X;->o2(LK0/J$e;)V

    .line 105
    .line 106
    .line 107
    const/4 p1, 0x1

    .line 108
    iput-boolean p1, p0, LK0/X;->k:Z

    .line 109
    .line 110
    return-void
.end method

.method private final k2(JFLkotlin/jvm/functions/Function1;Lv0/c;)V
    .locals 11

    .line 1
    invoke-virtual {p0}, LK0/X;->L1()LK0/J;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    const/4 v0, 0x1

    .line 6
    :try_start_0
    iput-boolean v0, p0, LK0/X;->u:Z

    .line 7
    .line 8
    iget-wide v2, p0, LK0/X;->n:J

    .line 9
    .line 10
    invoke-static {p1, p2, v2, v3}, Li1/n;->j(JJ)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v3, 0x0

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    iget-boolean v2, p0, LK0/X;->l0:Z

    .line 18
    .line 19
    if-eqz v2, :cond_3

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception v0

    .line 23
    move-object p1, v0

    .line 24
    goto/16 :goto_5

    .line 25
    .line 26
    :cond_0
    :goto_0
    iget-object v2, p0, LK0/X;->f:LK0/O;

    .line 27
    .line 28
    invoke-virtual {v2}, LK0/O;->e()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-nez v2, :cond_1

    .line 33
    .line 34
    iget-object v2, p0, LK0/X;->f:LK0/O;

    .line 35
    .line 36
    invoke-virtual {v2}, LK0/O;->f()Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-nez v2, :cond_1

    .line 41
    .line 42
    iget-boolean v2, p0, LK0/X;->l0:Z

    .line 43
    .line 44
    if-eqz v2, :cond_2

    .line 45
    .line 46
    :cond_1
    iput-boolean v0, p0, LK0/X;->w:Z

    .line 47
    .line 48
    iput-boolean v3, p0, LK0/X;->l0:Z

    .line 49
    .line 50
    :cond_2
    invoke-virtual {p0}, LK0/X;->d2()V

    .line 51
    .line 52
    .line 53
    :cond_3
    invoke-direct {p0}, LK0/X;->O1()LK0/V;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    if-eqz v2, :cond_7

    .line 58
    .line 59
    invoke-virtual {v2}, LK0/V;->Q1()Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-ne v2, v0, :cond_7

    .line 64
    .line 65
    invoke-virtual {p0}, LK0/X;->R1()LK0/e0;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {v2}, LK0/e0;->P2()LK0/e0;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    if-eqz v2, :cond_5

    .line 74
    .line 75
    invoke-virtual {v2}, LK0/T;->O1()Landroidx/compose/ui/layout/s$a;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    if-nez v2, :cond_4

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_4
    :goto_1
    move-object v4, v2

    .line 83
    goto :goto_3

    .line 84
    :cond_5
    :goto_2
    invoke-virtual {p0}, LK0/X;->L1()LK0/J;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-static {v2}, LK0/N;->b(LK0/J;)LK0/p0;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-interface {v2}, LK0/p0;->getPlacementScope()Landroidx/compose/ui/layout/s$a;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    goto :goto_1

    .line 97
    :goto_3
    invoke-direct {p0}, LK0/X;->O1()LK0/V;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    invoke-static {v5}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0}, LK0/X;->L1()LK0/J;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    invoke-virtual {v2}, LK0/J;->A0()LK0/J;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    if-eqz v2, :cond_6

    .line 113
    .line 114
    invoke-virtual {v2}, LK0/J;->d0()LK0/O;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    invoke-virtual {v2, v3}, LK0/O;->X(I)V

    .line 119
    .line 120
    .line 121
    :cond_6
    const v2, 0x7fffffff

    .line 122
    .line 123
    .line 124
    invoke-virtual {v5, v2}, LK0/V;->o2(I)V

    .line 125
    .line 126
    .line 127
    invoke-static {p1, p2}, Li1/n;->k(J)I

    .line 128
    .line 129
    .line 130
    move-result v6

    .line 131
    invoke-static {p1, p2}, Li1/n;->l(J)I

    .line 132
    .line 133
    .line 134
    move-result v7

    .line 135
    const/4 v9, 0x4

    .line 136
    const/4 v10, 0x0

    .line 137
    const/4 v8, 0x0

    .line 138
    invoke-static/range {v4 .. v10}, Landroidx/compose/ui/layout/s$a;->N(Landroidx/compose/ui/layout/s$a;Landroidx/compose/ui/layout/s;IIFILjava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    :cond_7
    invoke-direct {p0}, LK0/X;->O1()LK0/V;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    if-eqz v2, :cond_8

    .line 146
    .line 147
    invoke-virtual {v2}, LK0/V;->S1()Z

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    if-nez v2, :cond_8

    .line 152
    .line 153
    goto :goto_4

    .line 154
    :cond_8
    move v0, v3

    .line 155
    :goto_4
    if-eqz v0, :cond_9

    .line 156
    .line 157
    const-string v0, "Error: Placement happened before lookahead."

    .line 158
    .line 159
    invoke-static {v0}, LH0/a;->b(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    :cond_9
    invoke-direct/range {p0 .. p5}, LK0/X;->j2(JFLkotlin/jvm/functions/Function1;Lv0/c;)V

    .line 163
    .line 164
    .line 165
    sget-object p1, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 166
    .line 167
    return-void

    .line 168
    :goto_5
    invoke-virtual {v1, p1}, LK0/J;->M1(Ljava/lang/Throwable;)Ljava/lang/Void;

    .line 169
    .line 170
    .line 171
    new-instance p1, LTd/k;

    .line 172
    .line 173
    invoke-direct {p1}, LTd/k;-><init>()V

    .line 174
    .line 175
    .line 176
    throw p1
.end method

.method public static final synthetic o1(LK0/X;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LK0/X;->G1()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final s2(LK0/J;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, LK0/J;->A0()LK0/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_5

    .line 6
    .line 7
    iget-object v1, p0, LK0/X;->l:LK0/J$g;

    .line 8
    .line 9
    sget-object v2, LK0/J$g;->c:LK0/J$g;

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    if-eq v1, v2, :cond_1

    .line 13
    .line 14
    invoke-virtual {p1}, LK0/J;->M()Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    :goto_0
    move p1, v3

    .line 24
    :goto_1
    if-nez p1, :cond_2

    .line 25
    .line 26
    const-string p1, "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()"

    .line 27
    .line 28
    invoke-static {p1}, LH0/a;->b(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    :cond_2
    invoke-virtual {v0}, LK0/J;->f0()LK0/J$e;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    sget-object v1, LK0/X$a;->a:[I

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    aget p1, v1, p1

    .line 42
    .line 43
    if-eq p1, v3, :cond_4

    .line 44
    .line 45
    const/4 v1, 0x2

    .line 46
    if-ne p1, v1, :cond_3

    .line 47
    .line 48
    sget-object p1, LK0/J$g;->b:LK0/J$g;

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    new-instance v1, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 56
    .line 57
    .line 58
    const-string v2, "Measurable could be only measured from the parent\'s measure or layout block. Parents state is "

    .line 59
    .line 60
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, LK0/J;->f0()LK0/J$e;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw p1

    .line 78
    :cond_4
    sget-object p1, LK0/J$g;->a:LK0/J$g;

    .line 79
    .line 80
    :goto_2
    iput-object p1, p0, LK0/X;->l:LK0/J$g;

    .line 81
    .line 82
    return-void

    .line 83
    :cond_5
    sget-object p1, LK0/J$g;->c:LK0/J$g;

    .line 84
    .line 85
    iput-object p1, p0, LK0/X;->l:LK0/J$g;

    .line 86
    .line 87
    return-void
.end method

.method public static final synthetic u1(LK0/X;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LK0/X;->H1()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic x1(LK0/X;)J
    .locals 2

    .line 1
    iget-wide v0, p0, LK0/X;->C:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static final synthetic y1(LK0/X;)Lv0/c;
    .locals 0

    .line 1
    iget-object p0, p0, LK0/X;->I:Lv0/c;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic z1(LK0/X;)Lkotlin/jvm/functions/Function1;
    .locals 0

    .line 1
    iget-object p0, p0, LK0/X;->H:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public C0(Lkotlin/jvm/functions/Function1;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, LK0/X;->L1()LK0/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LK0/J;->I0()La0/c;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, v0, La0/c;->a:[Ljava/lang/Object;

    .line 10
    .line 11
    invoke-virtual {v0}, La0/c;->p()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v2, 0x0

    .line 16
    :goto_0
    if-ge v2, v0, :cond_0

    .line 17
    .line 18
    aget-object v3, v1, v2

    .line 19
    .line 20
    check-cast v3, LK0/J;

    .line 21
    .line 22
    invoke-virtual {v3}, LK0/J;->d0()LK0/O;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v3}, LK0/O;->b()LK0/b;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-interface {p1, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    add-int/lit8 v2, v2, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    return-void
.end method

.method public G0()V
    .locals 6

    .line 1
    invoke-virtual {p0}, LK0/X;->L1()LK0/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v4, 0x7

    .line 6
    const/4 v5, 0x0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-static/range {v0 .. v5}, LK0/J;->I1(LK0/J;ZZZILjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public I(I)I
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/X;->L1()LK0/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, LK0/P;->a(LK0/J;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-direct {p0}, LK0/X;->O1()LK0/V;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, LK0/V;->I(I)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    return p1

    .line 23
    :cond_0
    invoke-direct {p0}, LK0/X;->f2()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, LK0/X;->R1()LK0/e0;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-interface {v0, p1}, LI0/l;->I(I)I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    return p1
.end method

.method public final I1()Ljava/util/List;
    .locals 8

    .line 1
    invoke-virtual {p0}, LK0/X;->L1()LK0/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LK0/J;->d2()V

    .line 6
    .line 7
    .line 8
    iget-boolean v0, p0, LK0/X;->A:Z

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, LK0/X;->z:La0/c;

    .line 13
    .line 14
    invoke-virtual {v0}, La0/c;->h()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0

    .line 19
    :cond_0
    invoke-virtual {p0}, LK0/X;->L1()LK0/J;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v1, p0, LK0/X;->z:La0/c;

    .line 24
    .line 25
    invoke-virtual {v0}, LK0/J;->I0()La0/c;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    iget-object v3, v2, La0/c;->a:[Ljava/lang/Object;

    .line 30
    .line 31
    invoke-virtual {v2}, La0/c;->p()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    const/4 v4, 0x0

    .line 36
    move v5, v4

    .line 37
    :goto_0
    if-ge v5, v2, :cond_2

    .line 38
    .line 39
    aget-object v6, v3, v5

    .line 40
    .line 41
    check-cast v6, LK0/J;

    .line 42
    .line 43
    invoke-virtual {v1}, La0/c;->p()I

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    if-gt v7, v5, :cond_1

    .line 48
    .line 49
    invoke-virtual {v6}, LK0/J;->d0()LK0/O;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    invoke-virtual {v6}, LK0/O;->v()LK0/X;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    invoke-virtual {v1, v6}, La0/c;->c(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    invoke-virtual {v6}, LK0/J;->d0()LK0/O;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    invoke-virtual {v6}, LK0/O;->v()LK0/X;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    invoke-virtual {v1, v5, v6}, La0/c;->D(ILjava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    :goto_1
    add-int/lit8 v5, v5, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    invoke-virtual {v0}, LK0/J;->P()Ljava/util/List;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    invoke-virtual {v1}, La0/c;->p()I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    invoke-virtual {v1, v0, v2}, La0/c;->z(II)V

    .line 88
    .line 89
    .line 90
    iput-boolean v4, p0, LK0/X;->A:Z

    .line 91
    .line 92
    iget-object v0, p0, LK0/X;->z:La0/c;

    .line 93
    .line 94
    invoke-virtual {v0}, La0/c;->h()Ljava/util/List;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    return-object v0
.end method

.method public final J1()Li1/b;
    .locals 2

    .line 1
    iget-boolean v0, p0, LK0/X;->j:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/compose/ui/layout/s;->T0()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    invoke-static {v0, v1}, Li1/b;->a(J)Li1/b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return-object v0
.end method

.method public final K1()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LK0/X;->B:Z

    .line 2
    .line 3
    return v0
.end method

.method public L()Ljava/util/Map;
    .locals 3

    .line 1
    iget-boolean v0, p0, LK0/X;->m:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    invoke-virtual {p0}, LK0/X;->N1()LK0/J$e;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v2, LK0/J$e;->a:LK0/J$e;

    .line 11
    .line 12
    if-ne v0, v2, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, LK0/X;->z()LK0/a;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0, v1}, LK0/a;->s(Z)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, LK0/X;->z()LK0/a;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, LK0/a;->g()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0}, LK0/X;->Z1()V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {p0}, LK0/X;->z()LK0/a;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0, v1}, LK0/a;->r(Z)V

    .line 40
    .line 41
    .line 42
    :cond_1
    :goto_0
    invoke-virtual {p0}, LK0/X;->f0()LK0/e0;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0, v1}, LK0/T;->a2(Z)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, LK0/X;->Y()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, LK0/X;->f0()LK0/e0;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    const/4 v1, 0x0

    .line 57
    invoke-virtual {v0, v1}, LK0/T;->a2(Z)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, LK0/X;->z()LK0/a;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v0}, LK0/a;->h()Ljava/util/Map;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    return-object v0
.end method

.method public final L1()LK0/J;
    .locals 1

    .line 1
    iget-object v0, p0, LK0/X;->f:LK0/O;

    .line 2
    .line 3
    invoke-virtual {v0}, LK0/O;->l()LK0/J;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final M1()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LK0/X;->w:Z

    .line 2
    .line 3
    return v0
.end method

.method public N(LI0/a;)I
    .locals 4

    .line 1
    invoke-virtual {p0}, LK0/X;->L1()LK0/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LK0/J;->A0()LK0/J;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, LK0/J;->f0()LK0/J$e;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object v0, v1

    .line 18
    :goto_0
    sget-object v2, LK0/J$e;->a:LK0/J$e;

    .line 19
    .line 20
    const/4 v3, 0x1

    .line 21
    if-ne v0, v2, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, LK0/X;->z()LK0/a;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0, v3}, LK0/a;->u(Z)V

    .line 28
    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    invoke-virtual {p0}, LK0/X;->L1()LK0/J;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, LK0/J;->A0()LK0/J;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    invoke-virtual {v0}, LK0/J;->f0()LK0/J$e;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    :cond_2
    sget-object v0, LK0/J$e;->c:LK0/J$e;

    .line 46
    .line 47
    if-ne v1, v0, :cond_3

    .line 48
    .line 49
    invoke-virtual {p0}, LK0/X;->z()LK0/a;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0, v3}, LK0/a;->t(Z)V

    .line 54
    .line 55
    .line 56
    :cond_3
    :goto_1
    iput-boolean v3, p0, LK0/X;->m:Z

    .line 57
    .line 58
    invoke-virtual {p0}, LK0/X;->R1()LK0/e0;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {v0, p1}, LK0/T;->N(LI0/a;)I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    const/4 v0, 0x0

    .line 67
    iput-boolean v0, p0, LK0/X;->m:Z

    .line 68
    .line 69
    return p1
.end method

.method public final N1()LK0/J$e;
    .locals 1

    .line 1
    iget-object v0, p0, LK0/X;->f:LK0/O;

    .line 2
    .line 3
    invoke-virtual {v0}, LK0/O;->n()LK0/J$e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final P1()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LK0/X;->v:Z

    .line 2
    .line 3
    return v0
.end method

.method public Q0()I
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/X;->R1()LK0/e0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/ui/layout/s;->Q0()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public final Q1()LK0/J$g;
    .locals 1

    .line 1
    iget-object v0, p0, LK0/X;->l:LK0/J$g;

    .line 2
    .line 3
    return-object v0
.end method

.method public final R1()LK0/e0;
    .locals 1

    .line 1
    iget-object v0, p0, LK0/X;->f:LK0/O;

    .line 2
    .line 3
    invoke-virtual {v0}, LK0/O;->z()LK0/e0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public S()LK0/b;
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/X;->L1()LK0/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LK0/J;->A0()LK0/J;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, LK0/J;->d0()LK0/O;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, LK0/O;->b()LK0/b;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    return-object v0
.end method

.method public S0()I
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/X;->R1()LK0/e0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/ui/layout/s;->S0()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public final S1()I
    .locals 1

    .line 1
    iget v0, p0, LK0/X;->i:I

    .line 2
    .line 3
    return v0
.end method

.method public final T1()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LK0/X;->k:Z

    .line 2
    .line 3
    return v0
.end method

.method public final U1()F
    .locals 1

    .line 1
    iget v0, p0, LK0/X;->F:F

    .line 2
    .line 3
    return v0
.end method

.method public final V1(Z)V
    .locals 9

    .line 1
    invoke-virtual {p0}, LK0/X;->L1()LK0/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LK0/J;->A0()LK0/J;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, LK0/X;->L1()LK0/J;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, LK0/J;->b0()LK0/J$g;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-eqz v0, :cond_4

    .line 18
    .line 19
    sget-object v2, LK0/J$g;->c:LK0/J$g;

    .line 20
    .line 21
    if-eq v1, v2, :cond_4

    .line 22
    .line 23
    :cond_0
    move-object v3, v0

    .line 24
    invoke-virtual {v3}, LK0/J;->b0()LK0/J$g;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-ne v0, v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {v3}, LK0/J;->A0()LK0/J;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    if-nez v0, :cond_0

    .line 35
    .line 36
    :cond_1
    sget-object v0, LK0/X$a;->b:[I

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    aget v0, v0, v1

    .line 43
    .line 44
    const/4 v1, 0x1

    .line 45
    if-eq v0, v1, :cond_3

    .line 46
    .line 47
    const/4 v1, 0x2

    .line 48
    if-ne v0, v1, :cond_2

    .line 49
    .line 50
    invoke-virtual {v3, p1}, LK0/J;->F1(Z)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    const-string v0, "Intrinsics isn\'t used by the parent"

    .line 57
    .line 58
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw p1

    .line 62
    :cond_3
    const/4 v7, 0x6

    .line 63
    const/4 v8, 0x0

    .line 64
    const/4 v5, 0x0

    .line 65
    const/4 v6, 0x0

    .line 66
    move v4, p1

    .line 67
    invoke-static/range {v3 .. v8}, LK0/J;->I1(LK0/J;ZZZILjava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    :cond_4
    return-void
.end method

.method public W(Z)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/X;->R1()LK0/e0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LK0/T;->T1()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eq p1, v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, LK0/X;->R1()LK0/e0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0, p1}, LK0/T;->Z1(Z)V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    iput-boolean v0, p0, LK0/X;->l0:Z

    .line 20
    .line 21
    :cond_0
    invoke-virtual {p0, p1}, LK0/X;->r2(Z)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final W1()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LK0/X;->r:Z

    .line 3
    .line 4
    return-void
.end method

.method public final X1()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LK0/X;->u:Z

    .line 2
    .line 3
    return v0
.end method

.method public Y()V
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LK0/X;->B:Z

    .line 3
    .line 4
    invoke-virtual {p0}, LK0/X;->z()LK0/a;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-virtual {v1}, LK0/a;->o()V

    .line 9
    .line 10
    .line 11
    iget-boolean v1, p0, LK0/X;->w:Z

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-direct {p0}, LK0/X;->e2()V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-boolean v1, p0, LK0/X;->x:Z

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    iget-boolean v1, p0, LK0/X;->m:Z

    .line 24
    .line 25
    if-nez v1, :cond_3

    .line 26
    .line 27
    invoke-virtual {p0}, LK0/X;->f0()LK0/e0;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1}, LK0/T;->U1()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-nez v1, :cond_3

    .line 36
    .line 37
    iget-boolean v1, p0, LK0/X;->w:Z

    .line 38
    .line 39
    if-eqz v1, :cond_3

    .line 40
    .line 41
    :cond_1
    iput-boolean v2, p0, LK0/X;->w:Z

    .line 42
    .line 43
    invoke-virtual {p0}, LK0/X;->N1()LK0/J$e;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    sget-object v3, LK0/J$e;->c:LK0/J$e;

    .line 48
    .line 49
    invoke-virtual {p0, v3}, LK0/X;->o2(LK0/J$e;)V

    .line 50
    .line 51
    .line 52
    iget-object v3, p0, LK0/X;->f:LK0/O;

    .line 53
    .line 54
    invoke-virtual {v3, v2}, LK0/O;->O(Z)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, LK0/X;->L1()LK0/J;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-static {v3}, LK0/N;->b(LK0/J;)LK0/p0;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-interface {v4}, LK0/p0;->getSnapshotObserver()LK0/r0;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    iget-object v5, p0, LK0/X;->E:Lie/a;

    .line 70
    .line 71
    invoke-virtual {v4, v3, v2, v5}, LK0/r0;->e(LK0/J;ZLie/a;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, v1}, LK0/X;->o2(LK0/J$e;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, LK0/X;->f0()LK0/e0;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {v1}, LK0/T;->U1()Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-eqz v1, :cond_2

    .line 86
    .line 87
    iget-object v1, p0, LK0/X;->f:LK0/O;

    .line 88
    .line 89
    invoke-virtual {v1}, LK0/O;->f()Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-eqz v1, :cond_2

    .line 94
    .line 95
    invoke-virtual {p0}, LK0/X;->requestLayout()V

    .line 96
    .line 97
    .line 98
    :cond_2
    iput-boolean v2, p0, LK0/X;->x:Z

    .line 99
    .line 100
    :cond_3
    invoke-virtual {p0}, LK0/X;->z()LK0/a;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-virtual {v1}, LK0/a;->l()Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-eqz v1, :cond_4

    .line 109
    .line 110
    invoke-virtual {p0}, LK0/X;->z()LK0/a;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-virtual {v1, v0}, LK0/a;->q(Z)V

    .line 115
    .line 116
    .line 117
    :cond_4
    invoke-virtual {p0}, LK0/X;->z()LK0/a;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-virtual {v0}, LK0/a;->g()Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-eqz v0, :cond_5

    .line 126
    .line 127
    invoke-virtual {p0}, LK0/X;->z()LK0/a;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-virtual {v0}, LK0/a;->k()Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-eqz v0, :cond_5

    .line 136
    .line 137
    invoke-virtual {p0}, LK0/X;->z()LK0/a;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-virtual {v0}, LK0/a;->n()V

    .line 142
    .line 143
    .line 144
    :cond_5
    iput-boolean v2, p0, LK0/X;->B:Z

    .line 145
    .line 146
    return-void
.end method

.method protected Y0(JFLkotlin/jvm/functions/Function1;)V
    .locals 6

    .line 1
    const/4 v5, 0x0

    .line 2
    move-object v0, p0

    .line 3
    move-wide v1, p1

    .line 4
    move v3, p3

    .line 5
    move-object v4, p4

    .line 6
    invoke-direct/range {v0 .. v5}, LK0/X;->k2(JFLkotlin/jvm/functions/Function1;Lv0/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final Y1()V
    .locals 2

    .line 1
    iget-object v0, p0, LK0/X;->f:LK0/O;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, LK0/O;->P(Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public Z(I)I
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/X;->L1()LK0/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, LK0/P;->a(LK0/J;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-direct {p0}, LK0/X;->O1()LK0/V;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, LK0/V;->Z(I)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    return p1

    .line 23
    :cond_0
    invoke-direct {p0}, LK0/X;->f2()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, LK0/X;->R1()LK0/e0;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-interface {v0, p1}, LI0/l;->Z(I)I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    return p1
.end method

.method public final Z1()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LK0/X;->w:Z

    .line 3
    .line 4
    iput-boolean v0, p0, LK0/X;->x:Z

    .line 5
    .line 6
    return-void
.end method

.method protected a1(JFLv0/c;)V
    .locals 6

    .line 1
    const/4 v4, 0x0

    .line 2
    move-object v0, p0

    .line 3
    move-wide v1, p1

    .line 4
    move v3, p3

    .line 5
    move-object v5, p4

    .line 6
    invoke-direct/range {v0 .. v5}, LK0/X;->k2(JFLkotlin/jvm/functions/Function1;Lv0/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final a2()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LK0/X;->v:Z

    .line 3
    .line 4
    return-void
.end method

.method public final d2()V
    .locals 8

    .line 1
    iget-object v0, p0, LK0/X;->f:LK0/O;

    .line 2
    .line 3
    invoke-virtual {v0}, LK0/O;->c()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lez v0, :cond_2

    .line 8
    .line 9
    invoke-virtual {p0}, LK0/X;->L1()LK0/J;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, LK0/J;->I0()La0/c;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v1, v0, La0/c;->a:[Ljava/lang/Object;

    .line 18
    .line 19
    invoke-virtual {v0}, La0/c;->p()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v2, 0x0

    .line 24
    move v3, v2

    .line 25
    :goto_0
    if-ge v3, v0, :cond_2

    .line 26
    .line 27
    aget-object v4, v1, v3

    .line 28
    .line 29
    check-cast v4, LK0/J;

    .line 30
    .line 31
    invoke-virtual {v4}, LK0/J;->d0()LK0/O;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    invoke-virtual {v5}, LK0/O;->f()Z

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    if-nez v6, :cond_0

    .line 40
    .line 41
    invoke-virtual {v5}, LK0/O;->e()Z

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    if-eqz v6, :cond_1

    .line 46
    .line 47
    :cond_0
    invoke-virtual {v5}, LK0/O;->m()Z

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    if-nez v6, :cond_1

    .line 52
    .line 53
    const/4 v6, 0x0

    .line 54
    const/4 v7, 0x1

    .line 55
    invoke-static {v4, v2, v7, v6}, LK0/J;->G1(LK0/J;ZILjava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    invoke-virtual {v5}, LK0/O;->v()LK0/X;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-virtual {v4}, LK0/X;->d2()V

    .line 63
    .line 64
    .line 65
    add-int/lit8 v3, v3, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    return-void
.end method

.method public f0()LK0/e0;
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/X;->L1()LK0/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LK0/J;->X()LK0/e0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final g2()V
    .locals 1

    .line 1
    const v0, 0x7fffffff

    .line 2
    .line 3
    .line 4
    iput v0, p0, LK0/X;->i:I

    .line 5
    .line 6
    iput v0, p0, LK0/X;->h:I

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-virtual {p0, v0}, LK0/X;->q2(Z)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final h2()V
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LK0/X;->G:Z

    .line 3
    .line 4
    invoke-virtual {p0}, LK0/X;->L1()LK0/J;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-virtual {v1}, LK0/J;->A0()LK0/J;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {p0}, LK0/X;->f0()LK0/e0;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v2}, LK0/e0;->Q2()F

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-virtual {p0}, LK0/X;->L1()LK0/J;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {v3}, LK0/J;->w0()LK0/e0;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-virtual {v3}, LK0/J;->X()LK0/e0;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    :goto_0
    if-eq v4, v3, :cond_0

    .line 33
    .line 34
    const-string v5, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator"

    .line 35
    .line 36
    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    check-cast v4, LK0/F;

    .line 40
    .line 41
    invoke-virtual {v4}, LK0/e0;->Q2()F

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    add-float/2addr v2, v5

    .line 46
    invoke-virtual {v4}, LK0/e0;->O2()LK0/e0;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    goto :goto_0

    .line 51
    :cond_0
    iget v3, p0, LK0/X;->F:F

    .line 52
    .line 53
    cmpg-float v3, v2, v3

    .line 54
    .line 55
    if-nez v3, :cond_1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    iput v2, p0, LK0/X;->F:F

    .line 59
    .line 60
    if-eqz v1, :cond_2

    .line 61
    .line 62
    invoke-virtual {v1}, LK0/J;->t1()V

    .line 63
    .line 64
    .line 65
    :cond_2
    if-eqz v1, :cond_3

    .line 66
    .line 67
    invoke-virtual {v1}, LK0/J;->P0()V

    .line 68
    .line 69
    .line 70
    :cond_3
    :goto_1
    invoke-virtual {p0}, LK0/X;->p()Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    const/4 v3, 0x0

    .line 75
    if-nez v2, :cond_5

    .line 76
    .line 77
    if-eqz v1, :cond_4

    .line 78
    .line 79
    invoke-virtual {v1}, LK0/J;->P0()V

    .line 80
    .line 81
    .line 82
    :cond_4
    invoke-direct {p0}, LK0/X;->b2()V

    .line 83
    .line 84
    .line 85
    iget-boolean v2, p0, LK0/X;->g:Z

    .line 86
    .line 87
    if-eqz v2, :cond_6

    .line 88
    .line 89
    if-eqz v1, :cond_6

    .line 90
    .line 91
    const/4 v2, 0x0

    .line 92
    invoke-static {v1, v3, v0, v2}, LK0/J;->G1(LK0/J;ZILjava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_5
    invoke-virtual {p0}, LK0/X;->L1()LK0/J;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-virtual {v2}, LK0/J;->X()LK0/e0;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-virtual {v2}, LK0/e0;->i3()V

    .line 105
    .line 106
    .line 107
    :cond_6
    :goto_2
    if-eqz v1, :cond_9

    .line 108
    .line 109
    iget-boolean v2, p0, LK0/X;->g:Z

    .line 110
    .line 111
    if-nez v2, :cond_a

    .line 112
    .line 113
    invoke-virtual {v1}, LK0/J;->f0()LK0/J$e;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    sget-object v4, LK0/J$e;->c:LK0/J$e;

    .line 118
    .line 119
    if-ne v2, v4, :cond_a

    .line 120
    .line 121
    iget v2, p0, LK0/X;->i:I

    .line 122
    .line 123
    const v4, 0x7fffffff

    .line 124
    .line 125
    .line 126
    if-ne v2, v4, :cond_7

    .line 127
    .line 128
    move v3, v0

    .line 129
    :cond_7
    if-nez v3, :cond_8

    .line 130
    .line 131
    const-string v2, "Place was called on a node which was placed already"

    .line 132
    .line 133
    invoke-static {v2}, LH0/a;->b(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    :cond_8
    invoke-virtual {v1}, LK0/J;->d0()LK0/O;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    invoke-virtual {v2}, LK0/O;->y()I

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    iput v2, p0, LK0/X;->i:I

    .line 145
    .line 146
    invoke-virtual {v1}, LK0/J;->d0()LK0/O;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    invoke-virtual {v1}, LK0/O;->y()I

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    add-int/2addr v2, v0

    .line 155
    invoke-virtual {v1, v2}, LK0/O;->Y(I)V

    .line 156
    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_9
    iput v3, p0, LK0/X;->i:I

    .line 160
    .line 161
    :cond_a
    :goto_3
    invoke-virtual {p0}, LK0/X;->Y()V

    .line 162
    .line 163
    .line 164
    return-void
.end method

.method public final i2(J)V
    .locals 4

    .line 1
    invoke-virtual {p0}, LK0/X;->N1()LK0/J$e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, LK0/J$e;->e:LK0/J$e;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move v0, v2

    .line 13
    :goto_0
    if-nez v0, :cond_1

    .line 14
    .line 15
    const-string v0, "layout state is not idle before measure starts"

    .line 16
    .line 17
    invoke-static {v0}, LH0/a;->b(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    iput-wide p1, p0, LK0/X;->C:J

    .line 21
    .line 22
    sget-object p1, LK0/J$e;->a:LK0/J$e;

    .line 23
    .line 24
    invoke-virtual {p0, p1}, LK0/X;->o2(LK0/J$e;)V

    .line 25
    .line 26
    .line 27
    iput-boolean v2, p0, LK0/X;->v:Z

    .line 28
    .line 29
    invoke-virtual {p0}, LK0/X;->L1()LK0/J;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    invoke-static {p2}, LK0/N;->b(LK0/J;)LK0/p0;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-interface {p2}, LK0/p0;->getSnapshotObserver()LK0/r0;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-virtual {p0}, LK0/X;->L1()LK0/J;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget-object v3, p0, LK0/X;->D:Lie/a;

    .line 46
    .line 47
    invoke-virtual {p2, v0, v2, v3}, LK0/r0;->g(LK0/J;ZLie/a;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, LK0/X;->N1()LK0/J$e;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    if-ne p2, p1, :cond_2

    .line 55
    .line 56
    invoke-virtual {p0}, LK0/X;->Z1()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, v1}, LK0/X;->o2(LK0/J$e;)V

    .line 60
    .line 61
    .line 62
    :cond_2
    return-void
.end method

.method public j()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LK0/X;->s:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public l0(I)I
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/X;->L1()LK0/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, LK0/P;->a(LK0/J;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-direct {p0}, LK0/X;->O1()LK0/V;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, LK0/V;->l0(I)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    return p1

    .line 23
    :cond_0
    invoke-direct {p0}, LK0/X;->f2()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, LK0/X;->R1()LK0/e0;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-interface {v0, p1}, LI0/l;->l0(I)I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    return p1
.end method

.method public final l2(J)Z
    .locals 7

    .line 1
    invoke-virtual {p0}, LK0/X;->L1()LK0/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :try_start_0
    invoke-virtual {p0}, LK0/X;->L1()LK0/J;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, LK0/J;->z()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    const-string v1, "measure is called on a deactivated node"

    .line 16
    .line 17
    invoke-static {v1}, LH0/a;->a(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    goto/16 :goto_5

    .line 23
    .line 24
    :cond_0
    :goto_0
    invoke-virtual {p0}, LK0/X;->L1()LK0/J;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {v1}, LK0/N;->b(LK0/J;)LK0/p0;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {p0}, LK0/X;->L1()LK0/J;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v2}, LK0/J;->A0()LK0/J;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {p0}, LK0/X;->L1()LK0/J;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-virtual {p0}, LK0/X;->L1()LK0/J;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-virtual {v4}, LK0/J;->M()Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    const/4 v5, 0x1

    .line 53
    const/4 v6, 0x0

    .line 54
    if-nez v4, :cond_2

    .line 55
    .line 56
    if-eqz v2, :cond_1

    .line 57
    .line 58
    invoke-virtual {v2}, LK0/J;->M()Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_1

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_1
    move v2, v6

    .line 66
    goto :goto_2

    .line 67
    :cond_2
    :goto_1
    move v2, v5

    .line 68
    :goto_2
    invoke-virtual {v3, v2}, LK0/J;->N1(Z)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, LK0/X;->L1()LK0/J;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-virtual {v2}, LK0/J;->m0()Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-nez v2, :cond_4

    .line 80
    .line 81
    invoke-virtual {p0}, Landroidx/compose/ui/layout/s;->T0()J

    .line 82
    .line 83
    .line 84
    move-result-wide v2

    .line 85
    invoke-static {v2, v3, p1, p2}, Li1/b;->f(JJ)Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-nez v2, :cond_3

    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_3
    invoke-virtual {p0}, LK0/X;->L1()LK0/J;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    const/4 p2, 0x2

    .line 97
    const/4 v2, 0x0

    .line 98
    invoke-static {v1, p1, v6, p2, v2}, LK0/p0;->n(LK0/p0;LK0/J;ZILjava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0}, LK0/X;->L1()LK0/J;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {p1}, LK0/J;->L1()V

    .line 106
    .line 107
    .line 108
    return v6

    .line 109
    :cond_4
    :goto_3
    invoke-virtual {p0}, LK0/X;->z()LK0/a;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-virtual {v1, v6}, LK0/a;->s(Z)V

    .line 114
    .line 115
    .line 116
    sget-object v1, LK0/X$e;->a:LK0/X$e;

    .line 117
    .line 118
    invoke-virtual {p0, v1}, LK0/X;->C0(Lkotlin/jvm/functions/Function1;)V

    .line 119
    .line 120
    .line 121
    iput-boolean v5, p0, LK0/X;->j:Z

    .line 122
    .line 123
    invoke-virtual {p0}, LK0/X;->R1()LK0/e0;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-virtual {v1}, LK0/e0;->a()J

    .line 128
    .line 129
    .line 130
    move-result-wide v1

    .line 131
    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/layout/s;->i1(J)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0, p1, p2}, LK0/X;->i2(J)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0}, LK0/X;->R1()LK0/e0;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    invoke-virtual {p1}, LK0/e0;->a()J

    .line 142
    .line 143
    .line 144
    move-result-wide p1

    .line 145
    invoke-static {p1, p2, v1, v2}, Li1/r;->e(JJ)Z

    .line 146
    .line 147
    .line 148
    move-result p1

    .line 149
    if-eqz p1, :cond_6

    .line 150
    .line 151
    invoke-virtual {p0}, LK0/X;->R1()LK0/e0;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    invoke-virtual {p1}, Landroidx/compose/ui/layout/s;->W0()I

    .line 156
    .line 157
    .line 158
    move-result p1

    .line 159
    invoke-virtual {p0}, Landroidx/compose/ui/layout/s;->W0()I

    .line 160
    .line 161
    .line 162
    move-result p2

    .line 163
    if-ne p1, p2, :cond_6

    .line 164
    .line 165
    invoke-virtual {p0}, LK0/X;->R1()LK0/e0;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    invoke-virtual {p1}, Landroidx/compose/ui/layout/s;->P0()I

    .line 170
    .line 171
    .line 172
    move-result p1

    .line 173
    invoke-virtual {p0}, Landroidx/compose/ui/layout/s;->P0()I

    .line 174
    .line 175
    .line 176
    move-result p2

    .line 177
    if-eq p1, p2, :cond_5

    .line 178
    .line 179
    goto :goto_4

    .line 180
    :cond_5
    move v5, v6

    .line 181
    :cond_6
    :goto_4
    invoke-virtual {p0}, LK0/X;->R1()LK0/e0;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    invoke-virtual {p1}, Landroidx/compose/ui/layout/s;->W0()I

    .line 186
    .line 187
    .line 188
    move-result p1

    .line 189
    invoke-virtual {p0}, LK0/X;->R1()LK0/e0;

    .line 190
    .line 191
    .line 192
    move-result-object p2

    .line 193
    invoke-virtual {p2}, Landroidx/compose/ui/layout/s;->P0()I

    .line 194
    .line 195
    .line 196
    move-result p2

    .line 197
    int-to-long v1, p1

    .line 198
    const/16 p1, 0x20

    .line 199
    .line 200
    shl-long/2addr v1, p1

    .line 201
    int-to-long p1, p2

    .line 202
    const-wide v3, 0xffffffffL

    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    and-long/2addr p1, v3

    .line 208
    or-long/2addr p1, v1

    .line 209
    invoke-static {p1, p2}, Li1/r;->c(J)J

    .line 210
    .line 211
    .line 212
    move-result-wide p1

    .line 213
    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/layout/s;->b1(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 214
    .line 215
    .line 216
    return v5

    .line 217
    :goto_5
    invoke-virtual {v0, p1}, LK0/J;->M1(Ljava/lang/Throwable;)Ljava/lang/Void;

    .line 218
    .line 219
    .line 220
    new-instance p1, LTd/k;

    .line 221
    .line 222
    invoke-direct {p1}, LTd/k;-><init>()V

    .line 223
    .line 224
    .line 225
    throw p1
.end method

.method public final m2()V
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    iput-boolean v0, p0, LK0/X;->g:Z

    .line 4
    .line 5
    iget-boolean v2, p0, LK0/X;->k:Z

    .line 6
    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    const-string v2, "replace called on unplaced item"

    .line 10
    .line 11
    invoke-static {v2}, LH0/a;->b(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception v0

    .line 16
    move-object v3, p0

    .line 17
    goto :goto_2

    .line 18
    :cond_0
    :goto_0
    invoke-virtual {p0}, LK0/X;->p()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    iget-wide v4, p0, LK0/X;->n:J

    .line 23
    .line 24
    iget v6, p0, LK0/X;->q:F

    .line 25
    .line 26
    iget-object v7, p0, LK0/X;->o:Lkotlin/jvm/functions/Function1;

    .line 27
    .line 28
    iget-object v8, p0, LK0/X;->p:Lv0/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    move-object v3, p0

    .line 31
    :try_start_1
    invoke-direct/range {v3 .. v8}, LK0/X;->j2(JFLkotlin/jvm/functions/Function1;Lv0/c;)V

    .line 32
    .line 33
    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    iget-boolean v2, v3, LK0/X;->G:Z

    .line 37
    .line 38
    if-nez v2, :cond_1

    .line 39
    .line 40
    invoke-virtual {p0}, LK0/X;->L1()LK0/J;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v2}, LK0/J;->A0()LK0/J;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    if-eqz v2, :cond_1

    .line 49
    .line 50
    const/4 v4, 0x0

    .line 51
    invoke-static {v2, v1, v0, v4}, LK0/J;->G1(LK0/J;ZILjava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :catchall_1
    move-exception v0

    .line 56
    goto :goto_2

    .line 57
    :cond_1
    :goto_1
    iput-boolean v1, v3, LK0/X;->g:Z

    .line 58
    .line 59
    return-void

    .line 60
    :goto_2
    :try_start_2
    invoke-virtual {p0}, LK0/X;->L1()LK0/J;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-virtual {v2, v0}, LK0/J;->M1(Ljava/lang/Throwable;)Ljava/lang/Void;

    .line 65
    .line 66
    .line 67
    new-instance v0, LTd/k;

    .line 68
    .line 69
    invoke-direct {v0}, LTd/k;-><init>()V

    .line 70
    .line 71
    .line 72
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 73
    :catchall_2
    move-exception v0

    .line 74
    iput-boolean v1, v3, LK0/X;->g:Z

    .line 75
    .line 76
    throw v0
.end method

.method public final n2(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LK0/X;->A:Z

    .line 2
    .line 3
    return-void
.end method

.method public final o2(LK0/J$e;)V
    .locals 1

    .line 1
    iget-object v0, p0, LK0/X;->f:LK0/O;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LK0/O;->R(LK0/J$e;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public p()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LK0/X;->t:Z

    .line 2
    .line 3
    return v0
.end method

.method public final p2(LK0/J$g;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK0/X;->l:LK0/J$g;

    .line 2
    .line 3
    return-void
.end method

.method public q0(I)I
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/X;->L1()LK0/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, LK0/P;->a(LK0/J;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-direct {p0}, LK0/X;->O1()LK0/V;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, LK0/V;->q0(I)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    return p1

    .line 23
    :cond_0
    invoke-direct {p0}, LK0/X;->f2()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, LK0/X;->R1()LK0/e0;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-interface {v0, p1}, LI0/l;->q0(I)I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    return p1
.end method

.method public q2(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LK0/X;->t:Z

    .line 2
    .line 3
    return-void
.end method

.method public r2(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LK0/X;->m0:Z

    .line 2
    .line 3
    return-void
.end method

.method public requestLayout()V
    .locals 4

    .line 1
    invoke-virtual {p0}, LK0/X;->L1()LK0/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-static {v0, v3, v1, v2}, LK0/J;->G1(LK0/J;ZILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final t2()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, LK0/X;->j()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, LK0/X;->R1()LK0/e0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, LK0/e0;->j()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    return v1

    .line 19
    :cond_0
    iget-boolean v0, p0, LK0/X;->r:Z

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    return v1

    .line 24
    :cond_1
    iput-boolean v1, p0, LK0/X;->r:Z

    .line 25
    .line 26
    invoke-virtual {p0}, LK0/X;->R1()LK0/e0;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, LK0/e0;->j()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, LK0/X;->s:Ljava/lang/Object;

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    return v0
.end method

.method public v0(J)Landroidx/compose/ui/layout/s;
    .locals 2

    .line 1
    invoke-virtual {p0}, LK0/X;->L1()LK0/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LK0/J;->b0()LK0/J$g;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, LK0/J$g;->c:LK0/J$g;

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, LK0/X;->L1()LK0/J;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, LK0/J;->C()V

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {p0}, LK0/X;->L1()LK0/J;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v0}, LK0/P;->a(LK0/J;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-direct {p0}, LK0/X;->O1()LK0/V;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, LK0/V;->n2(LK0/J$g;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, p1, p2}, LK0/V;->v0(J)Landroidx/compose/ui/layout/s;

    .line 41
    .line 42
    .line 43
    :cond_1
    invoke-virtual {p0}, LK0/X;->L1()LK0/J;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-direct {p0, v0}, LK0/X;->s2(LK0/J;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, p1, p2}, LK0/X;->l2(J)Z

    .line 51
    .line 52
    .line 53
    return-object p0
.end method

.method public z()LK0/a;
    .locals 1

    .line 1
    iget-object v0, p0, LK0/X;->y:LK0/a;

    .line 2
    .line 3
    return-object v0
.end method
