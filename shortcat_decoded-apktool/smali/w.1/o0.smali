.class public final Lw/o0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw/o0$a;,
        Lw/o0$b;,
        Lw/o0$c;,
        Lw/o0$d;
    }
.end annotation


# instance fields
.field private final a:Lw/q0;

.field private final b:Lw/o0;

.field private final c:Ljava/lang/String;

.field private final d:LY/C0;

.field private final e:LY/C0;

.field private final f:LY/B0;

.field private final g:LY/B0;

.field private final h:LY/C0;

.field private final i:Li0/E;

.field private final j:Li0/E;

.field private final k:LY/C0;

.field private l:J

.field private final m:LY/h2;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    .line 15
    new-instance v0, Lw/V;

    invoke-direct {v0, p1}, Lw/V;-><init>(Ljava/lang/Object;)V

    const/4 p1, 0x0

    invoke-direct {p0, v0, p1, p2}, Lw/o0;-><init>(Lw/q0;Lw/o0;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lw/q0;Lw/o0;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lw/o0;->a:Lw/q0;

    .line 3
    iput-object p2, p0, Lw/o0;->b:Lw/o0;

    .line 4
    iput-object p3, p0, Lw/o0;->c:Ljava/lang/String;

    .line 5
    invoke-virtual {p0}, Lw/o0;->h()Ljava/lang/Object;

    move-result-object p2

    const/4 p3, 0x0

    const/4 v0, 0x2

    invoke-static {p2, p3, v0, p3}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    move-result-object p2

    iput-object p2, p0, Lw/o0;->d:LY/C0;

    .line 6
    new-instance p2, Lw/o0$c;

    invoke-virtual {p0}, Lw/o0;->h()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0}, Lw/o0;->h()Ljava/lang/Object;

    move-result-object v2

    invoke-direct {p2, v1, v2}, Lw/o0$c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p2, p3, v0, p3}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    move-result-object p2

    iput-object p2, p0, Lw/o0;->e:LY/C0;

    const-wide/16 v1, 0x0

    .line 7
    invoke-static {v1, v2}, LY/M1;->a(J)LY/B0;

    move-result-object p2

    iput-object p2, p0, Lw/o0;->f:LY/B0;

    const-wide/high16 v1, -0x8000000000000000L

    .line 8
    invoke-static {v1, v2}, LY/M1;->a(J)LY/B0;

    move-result-object p2

    iput-object p2, p0, Lw/o0;->g:LY/B0;

    .line 9
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p2, p3, v0, p3}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    move-result-object v1

    iput-object v1, p0, Lw/o0;->h:LY/C0;

    .line 10
    invoke-static {}, LY/U1;->e()Li0/E;

    move-result-object v1

    iput-object v1, p0, Lw/o0;->i:Li0/E;

    .line 11
    invoke-static {}, LY/U1;->e()Li0/E;

    move-result-object v1

    iput-object v1, p0, Lw/o0;->j:Li0/E;

    .line 12
    invoke-static {p2, p3, v0, p3}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    move-result-object p2

    iput-object p2, p0, Lw/o0;->k:LY/C0;

    .line 13
    new-instance p2, Lw/o0$g;

    invoke-direct {p2, p0}, Lw/o0$g;-><init>(Lw/o0;)V

    invoke-static {p2}, LY/U1;->d(Lie/a;)LY/h2;

    move-result-object p2

    iput-object p2, p0, Lw/o0;->m:LY/h2;

    .line 14
    invoke-virtual {p1, p0}, Lw/q0;->e(Lw/o0;)V

    return-void
.end method

.method private final C()V
    .locals 5

    .line 1
    iget-object v0, p0, Lw/o0;->i:Li0/E;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    :goto_0
    if-ge v3, v1, :cond_0

    .line 10
    .line 11
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    check-cast v4, Lw/o0$d;

    .line 16
    .line 17
    invoke-virtual {v4}, Lw/o0$d;->u()V

    .line 18
    .line 19
    .line 20
    add-int/lit8 v3, v3, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object v0, p0, Lw/o0;->j:Li0/E;

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    :goto_1
    if-ge v2, v1, :cond_1

    .line 30
    .line 31
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    check-cast v3, Lw/o0;

    .line 36
    .line 37
    invoke-direct {v3}, Lw/o0;->C()V

    .line 38
    .line 39
    .line 40
    add-int/lit8 v2, v2, 0x1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    return-void
.end method

.method private final G(Lw/o0$b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lw/o0;->e:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private final J(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lw/o0;->h:LY/C0;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private final K(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lw/o0;->f:LY/B0;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, LY/B0;->m(J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static final synthetic a(Lw/o0;)J
    .locals 2

    .line 1
    invoke-direct {p0}, Lw/o0;->f()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public static final synthetic b(Lw/o0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lw/o0;->t()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final f()J
    .locals 8

    .line 1
    iget-object v0, p0, Lw/o0;->i:Li0/E;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    move v5, v4

    .line 11
    :goto_0
    if-ge v5, v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v6

    .line 17
    check-cast v6, Lw/o0$d;

    .line 18
    .line 19
    invoke-virtual {v6}, Lw/o0$d;->n()J

    .line 20
    .line 21
    .line 22
    move-result-wide v6

    .line 23
    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 24
    .line 25
    .line 26
    move-result-wide v2

    .line 27
    add-int/lit8 v5, v5, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iget-object v0, p0, Lw/o0;->j:Li0/E;

    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    :goto_1
    if-ge v4, v1, :cond_1

    .line 37
    .line 38
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    check-cast v5, Lw/o0;

    .line 43
    .line 44
    invoke-direct {v5}, Lw/o0;->f()J

    .line 45
    .line 46
    .line 47
    move-result-wide v5

    .line 48
    invoke-static {v2, v3, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 49
    .line 50
    .line 51
    move-result-wide v2

    .line 52
    add-int/lit8 v4, v4, 0x1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    return-wide v2
.end method

.method private final p()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lw/o0;->h:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method private final q()J
    .locals 2

    .line 1
    iget-object v0, p0, Lw/o0;->f:LY/B0;

    .line 2
    .line 3
    invoke-interface {v0}, LY/s0;->a()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method private final t()V
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lw/o0;->J(Z)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lw/o0;->s()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lw/o0;->i:Li0/E;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x0

    .line 18
    const-wide/16 v3, 0x0

    .line 19
    .line 20
    move v5, v2

    .line 21
    :goto_0
    if-ge v5, v1, :cond_0

    .line 22
    .line 23
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    check-cast v6, Lw/o0$d;

    .line 28
    .line 29
    invoke-virtual {v6}, Lw/o0$d;->n()J

    .line 30
    .line 31
    .line 32
    move-result-wide v7

    .line 33
    invoke-static {v3, v4, v7, v8}, Ljava/lang/Math;->max(JJ)J

    .line 34
    .line 35
    .line 36
    move-result-wide v3

    .line 37
    iget-wide v7, p0, Lw/o0;->l:J

    .line 38
    .line 39
    invoke-virtual {v6, v7, v8}, Lw/o0$d;->v(J)V

    .line 40
    .line 41
    .line 42
    add-int/lit8 v5, v5, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-direct {p0, v2}, Lw/o0;->J(Z)V

    .line 46
    .line 47
    .line 48
    :cond_1
    return-void
.end method


# virtual methods
.method public final A(Lw/o0$d;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lw/o0;->i:Li0/E;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Li0/E;->remove(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final B(Lw/o0;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lw/o0;->j:Li0/E;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Li0/E;->remove(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final D(Ljava/lang/Object;Ljava/lang/Object;J)V
    .locals 5

    .line 1
    const-wide/high16 v0, -0x8000000000000000L

    .line 2
    .line 3
    invoke-virtual {p0, v0, v1}, Lw/o0;->H(J)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lw/o0;->a:Lw/q0;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1}, Lw/q0;->d(Z)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lw/o0;->s()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Lw/o0;->h()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0}, Lw/o0;->o()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {v0, p2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_2

    .line 37
    .line 38
    :cond_0
    invoke-virtual {p0}, Lw/o0;->h()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-nez v0, :cond_1

    .line 47
    .line 48
    iget-object v0, p0, Lw/o0;->a:Lw/q0;

    .line 49
    .line 50
    instance-of v2, v0, Lw/V;

    .line 51
    .line 52
    if-eqz v2, :cond_1

    .line 53
    .line 54
    invoke-virtual {v0, p1}, Lw/q0;->c(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    :cond_1
    invoke-virtual {p0, p2}, Lw/o0;->I(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    const/4 v0, 0x1

    .line 61
    invoke-virtual {p0, v0}, Lw/o0;->F(Z)V

    .line 62
    .line 63
    .line 64
    new-instance v0, Lw/o0$c;

    .line 65
    .line 66
    invoke-direct {v0, p1, p2}, Lw/o0$c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    invoke-direct {p0, v0}, Lw/o0;->G(Lw/o0$b;)V

    .line 70
    .line 71
    .line 72
    :cond_2
    iget-object p1, p0, Lw/o0;->j:Li0/E;

    .line 73
    .line 74
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 75
    .line 76
    .line 77
    move-result p2

    .line 78
    move v0, v1

    .line 79
    :goto_0
    if-ge v0, p2, :cond_4

    .line 80
    .line 81
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    check-cast v2, Lw/o0;

    .line 86
    .line 87
    const-string v3, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>"

    .line 88
    .line 89
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2}, Lw/o0;->s()Z

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    if-eqz v3, :cond_3

    .line 97
    .line 98
    invoke-virtual {v2}, Lw/o0;->h()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    invoke-virtual {v2}, Lw/o0;->o()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    invoke-virtual {v2, v3, v4, p3, p4}, Lw/o0;->D(Ljava/lang/Object;Ljava/lang/Object;J)V

    .line 107
    .line 108
    .line 109
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_4
    iget-object p1, p0, Lw/o0;->i:Li0/E;

    .line 113
    .line 114
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 115
    .line 116
    .line 117
    move-result p2

    .line 118
    :goto_1
    if-ge v1, p2, :cond_5

    .line 119
    .line 120
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    check-cast v0, Lw/o0$d;

    .line 125
    .line 126
    invoke-virtual {v0, p3, p4}, Lw/o0$d;->v(J)V

    .line 127
    .line 128
    .line 129
    add-int/lit8 v1, v1, 0x1

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_5
    iput-wide p3, p0, Lw/o0;->l:J

    .line 133
    .line 134
    return-void
.end method

.method public final E(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lw/o0;->b:Lw/o0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0, p1, p2}, Lw/o0;->K(J)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final F(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lw/o0;->k:LY/C0;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final H(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lw/o0;->g:LY/B0;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, LY/B0;->m(J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final I(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lw/o0;->d:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final L(Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lw/o0;->o()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_2

    .line 10
    .line 11
    new-instance v0, Lw/o0$c;

    .line 12
    .line 13
    invoke-virtual {p0}, Lw/o0;->o()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-direct {v0, v1, p1}, Lw/o0$c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0, v0}, Lw/o0;->G(Lw/o0$b;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lw/o0;->h()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p0}, Lw/o0;->o()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_0

    .line 36
    .line 37
    iget-object v0, p0, Lw/o0;->a:Lw/q0;

    .line 38
    .line 39
    invoke-virtual {p0}, Lw/o0;->o()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v0, v1}, Lw/q0;->c(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    invoke-virtual {p0, p1}, Lw/o0;->I(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lw/o0;->r()Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-nez p1, :cond_1

    .line 54
    .line 55
    const/4 p1, 0x1

    .line 56
    invoke-direct {p0, p1}, Lw/o0;->J(Z)V

    .line 57
    .line 58
    .line 59
    :cond_1
    invoke-direct {p0}, Lw/o0;->C()V

    .line 60
    .line 61
    .line 62
    :cond_2
    return-void
.end method

.method public final c(Lw/o0$d;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lw/o0;->i:Li0/E;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Li0/E;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final d(Lw/o0;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lw/o0;->j:Li0/E;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Li0/E;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final e(Ljava/lang/Object;LY/m;I)V
    .locals 5

    .line 1
    const v0, -0x59064cff

    .line 2
    .line 3
    .line 4
    invoke-interface {p2, v0}, LY/m;->g(I)LY/m;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    and-int/lit8 v1, p3, 0x6

    .line 9
    .line 10
    if-nez v1, :cond_2

    .line 11
    .line 12
    and-int/lit8 v1, p3, 0x8

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    invoke-interface {p2, p1}, LY/m;->U(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-interface {p2, p1}, LY/m;->F(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    :goto_0
    if-eqz v1, :cond_1

    .line 26
    .line 27
    const/4 v1, 0x4

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    const/4 v1, 0x2

    .line 30
    :goto_1
    or-int/2addr v1, p3

    .line 31
    goto :goto_2

    .line 32
    :cond_2
    move v1, p3

    .line 33
    :goto_2
    and-int/lit8 v2, p3, 0x30

    .line 34
    .line 35
    const/16 v3, 0x20

    .line 36
    .line 37
    if-nez v2, :cond_4

    .line 38
    .line 39
    invoke-interface {p2, p0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_3

    .line 44
    .line 45
    move v2, v3

    .line 46
    goto :goto_3

    .line 47
    :cond_3
    const/16 v2, 0x10

    .line 48
    .line 49
    :goto_3
    or-int/2addr v1, v2

    .line 50
    :cond_4
    and-int/lit8 v2, v1, 0x13

    .line 51
    .line 52
    const/16 v4, 0x12

    .line 53
    .line 54
    if-ne v2, v4, :cond_6

    .line 55
    .line 56
    invoke-interface {p2}, LY/m;->i()Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-nez v2, :cond_5

    .line 61
    .line 62
    goto :goto_4

    .line 63
    :cond_5
    invoke-interface {p2}, LY/m;->K()V

    .line 64
    .line 65
    .line 66
    goto/16 :goto_9

    .line 67
    .line 68
    :cond_6
    :goto_4
    invoke-static {}, LY/w;->L()Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-eqz v2, :cond_7

    .line 73
    .line 74
    const/4 v2, -0x1

    .line 75
    const-string v4, "androidx.compose.animation.core.Transition.animateTo (Transition.kt:1211)"

    .line 76
    .line 77
    invoke-static {v0, v1, v2, v4}, LY/w;->U(IIILjava/lang/String;)V

    .line 78
    .line 79
    .line 80
    :cond_7
    invoke-virtual {p0}, Lw/o0;->s()Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-nez v0, :cond_e

    .line 85
    .line 86
    const v0, 0x6ca14252

    .line 87
    .line 88
    .line 89
    invoke-interface {p2, v0}, LY/m;->V(I)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, p1}, Lw/o0;->L(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0}, Lw/o0;->h()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_9

    .line 104
    .line 105
    invoke-virtual {p0}, Lw/o0;->r()Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-nez v0, :cond_9

    .line 110
    .line 111
    invoke-direct {p0}, Lw/o0;->p()Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-eqz v0, :cond_8

    .line 116
    .line 117
    goto :goto_5

    .line 118
    :cond_8
    const v0, 0x6cb7c35b

    .line 119
    .line 120
    .line 121
    invoke-interface {p2, v0}, LY/m;->V(I)V

    .line 122
    .line 123
    .line 124
    invoke-interface {p2}, LY/m;->O()V

    .line 125
    .line 126
    .line 127
    goto :goto_7

    .line 128
    :cond_9
    :goto_5
    const v0, 0x6ca4c9cd

    .line 129
    .line 130
    .line 131
    invoke-interface {p2, v0}, LY/m;->V(I)V

    .line 132
    .line 133
    .line 134
    invoke-interface {p2}, LY/m;->D()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    sget-object v2, LY/m;->a:LY/m$a;

    .line 139
    .line 140
    invoke-virtual {v2}, LY/m$a;->a()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    if-ne v0, v4, :cond_a

    .line 145
    .line 146
    sget-object v0, LZd/j;->a:LZd/j;

    .line 147
    .line 148
    invoke-static {v0, p2}, LY/b0;->i(LZd/i;LY/m;)LGf/O;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    new-instance v4, LY/L;

    .line 153
    .line 154
    invoke-direct {v4, v0}, LY/L;-><init>(LGf/O;)V

    .line 155
    .line 156
    .line 157
    invoke-interface {p2, v4}, LY/m;->u(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    move-object v0, v4

    .line 161
    :cond_a
    check-cast v0, LY/L;

    .line 162
    .line 163
    invoke-virtual {v0}, LY/L;->a()LGf/O;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-interface {p2, v0}, LY/m;->F(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v4

    .line 171
    and-int/lit8 v1, v1, 0x70

    .line 172
    .line 173
    if-ne v1, v3, :cond_b

    .line 174
    .line 175
    const/4 v3, 0x1

    .line 176
    goto :goto_6

    .line 177
    :cond_b
    const/4 v3, 0x0

    .line 178
    :goto_6
    or-int/2addr v3, v4

    .line 179
    invoke-interface {p2}, LY/m;->D()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v4

    .line 183
    if-nez v3, :cond_c

    .line 184
    .line 185
    invoke-virtual {v2}, LY/m$a;->a()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    if-ne v4, v2, :cond_d

    .line 190
    .line 191
    :cond_c
    new-instance v4, Lw/o0$e;

    .line 192
    .line 193
    invoke-direct {v4, v0, p0}, Lw/o0$e;-><init>(LGf/O;Lw/o0;)V

    .line 194
    .line 195
    .line 196
    invoke-interface {p2, v4}, LY/m;->u(Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    :cond_d
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 200
    .line 201
    invoke-static {v0, p0, v4, p2, v1}, LY/b0;->a(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;LY/m;I)V

    .line 202
    .line 203
    .line 204
    invoke-interface {p2}, LY/m;->O()V

    .line 205
    .line 206
    .line 207
    :goto_7
    invoke-interface {p2}, LY/m;->O()V

    .line 208
    .line 209
    .line 210
    goto :goto_8

    .line 211
    :cond_e
    const v0, 0x6cb7ea1b

    .line 212
    .line 213
    .line 214
    invoke-interface {p2, v0}, LY/m;->V(I)V

    .line 215
    .line 216
    .line 217
    invoke-interface {p2}, LY/m;->O()V

    .line 218
    .line 219
    .line 220
    :goto_8
    invoke-static {}, LY/w;->L()Z

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    if-eqz v0, :cond_f

    .line 225
    .line 226
    invoke-static {}, LY/w;->T()V

    .line 227
    .line 228
    .line 229
    :cond_f
    :goto_9
    invoke-interface {p2}, LY/m;->k()LY/B1;

    .line 230
    .line 231
    .line 232
    move-result-object p2

    .line 233
    if-eqz p2, :cond_10

    .line 234
    .line 235
    new-instance v0, Lw/o0$f;

    .line 236
    .line 237
    invoke-direct {v0, p0, p1, p3}, Lw/o0$f;-><init>(Lw/o0;Ljava/lang/Object;I)V

    .line 238
    .line 239
    .line 240
    invoke-interface {p2, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 241
    .line 242
    .line 243
    :cond_10
    return-void
.end method

.method public final g()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lw/o0;->i:Li0/E;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lw/o0;->a:Lw/q0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lw/q0;->a()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final i()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lw/o0;->i:Li0/E;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    :goto_0
    if-ge v3, v1, :cond_0

    .line 10
    .line 11
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    check-cast v4, Lw/o0$d;

    .line 16
    .line 17
    invoke-virtual {v4}, Lw/o0$d;->p()Lw/c0$a;

    .line 18
    .line 19
    .line 20
    add-int/lit8 v3, v3, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object v0, p0, Lw/o0;->j:Li0/E;

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    move v3, v2

    .line 30
    :goto_1
    if-ge v3, v1, :cond_2

    .line 31
    .line 32
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    check-cast v4, Lw/o0;

    .line 37
    .line 38
    invoke-virtual {v4}, Lw/o0;->i()Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_1

    .line 43
    .line 44
    const/4 v0, 0x1

    .line 45
    return v0

    .line 46
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    return v2
.end method

.method public final j()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lw/o0;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lw/o0;->l:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final l()J
    .locals 2

    .line 1
    iget-object v0, p0, Lw/o0;->b:Lw/o0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lw/o0;->l()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0

    .line 10
    :cond_0
    invoke-direct {p0}, Lw/o0;->q()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    return-wide v0
.end method

.method public final m()Lw/o0$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lw/o0;->e:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lw/o0$b;

    .line 8
    .line 9
    return-object v0
.end method

.method public final n()J
    .locals 2

    .line 1
    iget-object v0, p0, Lw/o0;->g:LY/B0;

    .line 2
    .line 3
    invoke-interface {v0}, LY/s0;->a()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final o()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lw/o0;->d:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final r()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Lw/o0;->n()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/high16 v2, -0x8000000000000000L

    .line 6
    .line 7
    cmp-long v0, v0, v2

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method public final s()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lw/o0;->k:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lw/o0;->g()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const-string v2, "Transition animation values: "

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    :goto_0
    if-ge v3, v1, :cond_0

    .line 13
    .line 14
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    check-cast v4, Lw/o0$d;

    .line 19
    .line 20
    new-instance v5, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v2, ", "

    .line 32
    .line 33
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    add-int/lit8 v3, v3, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    return-object v2
.end method

.method public final u()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lw/o0;->x()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lw/o0;->a:Lw/q0;

    .line 5
    .line 6
    invoke-virtual {v0}, Lw/q0;->f()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final v(JF)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lw/o0;->n()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/high16 v2, -0x8000000000000000L

    .line 6
    .line 7
    cmp-long v0, v0, v2

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, p1, p2}, Lw/o0;->y(J)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, Lw/o0;->n()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    sub-long/2addr p1, v0

    .line 19
    const/4 v0, 0x0

    .line 20
    cmpg-float v0, p3, v0

    .line 21
    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    long-to-double p1, p1

    .line 26
    float-to-double v1, p3

    .line 27
    div-double/2addr p1, v1

    .line 28
    invoke-static {p1, p2}, Lke/a;->e(D)J

    .line 29
    .line 30
    .line 31
    move-result-wide p1

    .line 32
    :goto_0
    invoke-virtual {p0, p1, p2}, Lw/o0;->E(J)V

    .line 33
    .line 34
    .line 35
    if-nez v0, :cond_2

    .line 36
    .line 37
    const/4 p3, 0x1

    .line 38
    goto :goto_1

    .line 39
    :cond_2
    const/4 p3, 0x0

    .line 40
    :goto_1
    invoke-virtual {p0, p1, p2, p3}, Lw/o0;->w(JZ)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final w(JZ)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lw/o0;->n()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/high16 v2, -0x8000000000000000L

    .line 6
    .line 7
    cmp-long v0, v0, v2

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, Lw/o0;->y(J)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object v0, p0, Lw/o0;->a:Lw/q0;

    .line 17
    .line 18
    invoke-virtual {v0}, Lw/q0;->b()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    iget-object v0, p0, Lw/o0;->a:Lw/q0;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lw/q0;->d(Z)V

    .line 27
    .line 28
    .line 29
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 30
    invoke-direct {p0, v0}, Lw/o0;->J(Z)V

    .line 31
    .line 32
    .line 33
    iget-object v2, p0, Lw/o0;->i:Li0/E;

    .line 34
    .line 35
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    move v4, v0

    .line 40
    :goto_1
    if-ge v4, v3, :cond_4

    .line 41
    .line 42
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    check-cast v5, Lw/o0$d;

    .line 47
    .line 48
    invoke-virtual {v5}, Lw/o0$d;->s()Z

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    if-nez v6, :cond_2

    .line 53
    .line 54
    invoke-virtual {v5, p1, p2, p3}, Lw/o0$d;->t(JZ)V

    .line 55
    .line 56
    .line 57
    :cond_2
    invoke-virtual {v5}, Lw/o0$d;->s()Z

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    if-nez v5, :cond_3

    .line 62
    .line 63
    move v1, v0

    .line 64
    :cond_3
    add-int/lit8 v4, v4, 0x1

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_4
    iget-object v2, p0, Lw/o0;->j:Li0/E;

    .line 68
    .line 69
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    move v4, v0

    .line 74
    :goto_2
    if-ge v4, v3, :cond_7

    .line 75
    .line 76
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    check-cast v5, Lw/o0;

    .line 81
    .line 82
    invoke-virtual {v5}, Lw/o0;->o()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    invoke-virtual {v5}, Lw/o0;->h()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    invoke-static {v6, v7}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v6

    .line 94
    if-nez v6, :cond_5

    .line 95
    .line 96
    invoke-virtual {v5, p1, p2, p3}, Lw/o0;->w(JZ)V

    .line 97
    .line 98
    .line 99
    :cond_5
    invoke-virtual {v5}, Lw/o0;->o()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    invoke-virtual {v5}, Lw/o0;->h()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    invoke-static {v6, v5}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v5

    .line 111
    if-nez v5, :cond_6

    .line 112
    .line 113
    move v1, v0

    .line 114
    :cond_6
    add-int/lit8 v4, v4, 0x1

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_7
    if-eqz v1, :cond_8

    .line 118
    .line 119
    invoke-virtual {p0}, Lw/o0;->x()V

    .line 120
    .line 121
    .line 122
    :cond_8
    return-void
.end method

.method public final x()V
    .locals 4

    .line 1
    const-wide/high16 v0, -0x8000000000000000L

    .line 2
    .line 3
    invoke-virtual {p0, v0, v1}, Lw/o0;->H(J)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lw/o0;->a:Lw/q0;

    .line 7
    .line 8
    instance-of v1, v0, Lw/V;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lw/o0;->o()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Lw/q0;->c(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    const-wide/16 v0, 0x0

    .line 20
    .line 21
    invoke-virtual {p0, v0, v1}, Lw/o0;->E(J)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lw/o0;->a:Lw/q0;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-virtual {v0, v1}, Lw/q0;->d(Z)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lw/o0;->j:Li0/E;

    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    :goto_0
    if-ge v1, v2, :cond_1

    .line 37
    .line 38
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    check-cast v3, Lw/o0;

    .line 43
    .line 44
    invoke-virtual {v3}, Lw/o0;->x()V

    .line 45
    .line 46
    .line 47
    add-int/lit8 v1, v1, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    return-void
.end method

.method public final y(J)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lw/o0;->H(J)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lw/o0;->a:Lw/q0;

    .line 5
    .line 6
    const/4 p2, 0x1

    .line 7
    invoke-virtual {p1, p2}, Lw/q0;->d(Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final z(Lw/o0$a;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Lw/o0$a;->b()Lw/o0$a$a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Lw/o0$a$a;->i()Lw/o0$d;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lw/o0;->A(Lw/o0$d;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method
