.class public final LC/t;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LI0/v;
.implements LJ0/d;
.implements LJ0/j;


# instance fields
.field private final b:LC/P;

.field private final c:LY/C0;

.field private final d:LY/C0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(LC/P;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LC/t;->b:LC/P;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    const/4 v1, 0x2

    .line 8
    invoke-static {p1, v0, v1, v0}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    iput-object v2, p0, LC/t;->c:LY/C0;

    .line 13
    .line 14
    invoke-static {p1, v0, v1, v0}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, LC/t;->d:LY/C0;

    .line 19
    .line 20
    return-void
.end method

.method private final a()LC/P;
    .locals 1

    .line 1
    iget-object v0, p0, LC/t;->d:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LC/P;

    .line 8
    .line 9
    return-object v0
.end method

.method private final c()LC/P;
    .locals 1

    .line 1
    iget-object v0, p0, LC/t;->c:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LC/P;

    .line 8
    .line 9
    return-object v0
.end method

.method private final i(LC/P;)V
    .locals 1

    .line 1
    iget-object v0, p0, LC/t;->d:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private final j(LC/P;)V
    .locals 1

    .line 1
    iget-object v0, p0, LC/t;->c:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    instance-of v0, p1, LC/t;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_1
    check-cast p1, LC/t;

    .line 12
    .line 13
    iget-object p1, p1, LC/t;->b:LC/P;

    .line 14
    .line 15
    iget-object v0, p0, LC/t;->b:LC/P;

    .line 16
    .line 17
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method public f(LJ0/k;)V
    .locals 1

    .line 1
    invoke-static {}, LC/T;->a()LJ0/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p1, v0}, LJ0/k;->j(LJ0/c;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LC/P;

    .line 10
    .line 11
    iget-object v0, p0, LC/t;->b:LC/P;

    .line 12
    .line 13
    invoke-static {v0, p1}, LC/S;->d(LC/P;LC/P;)LC/P;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-direct {p0, v0}, LC/t;->j(LC/P;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, LC/t;->b:LC/P;

    .line 21
    .line 22
    invoke-static {p1, v0}, LC/S;->f(LC/P;LC/P;)LC/P;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-direct {p0, p1}, LC/t;->i(LC/P;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public getKey()LJ0/l;
    .locals 1

    .line 1
    invoke-static {}, LC/T;->a()LJ0/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic getValue()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LC/t;->h()LC/P;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public h()LC/P;
    .locals 1

    .line 1
    invoke-direct {p0}, LC/t;->a()LC/P;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, LC/t;->b:LC/P;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public measure-3p2s80s(Landroidx/compose/ui/layout/l;LI0/A;J)LI0/C;
    .locals 9

    .line 1
    invoke-direct {p0}, LC/t;->c()LC/P;

    .line 2
    .line 3
    .line 4
    move-result-object v3

    .line 5
    invoke-interface {p1}, LI0/m;->getLayoutDirection()Li1/t;

    .line 6
    .line 7
    .line 8
    move-result-object v4

    .line 9
    invoke-interface {v3, p1, v4}, LC/P;->d(Li1/d;Li1/t;)I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    invoke-direct {p0}, LC/t;->c()LC/P;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    invoke-interface {v4, p1}, LC/P;->b(Li1/d;)I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    invoke-direct {p0}, LC/t;->c()LC/P;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    invoke-interface {p1}, LI0/m;->getLayoutDirection()Li1/t;

    .line 26
    .line 27
    .line 28
    move-result-object v6

    .line 29
    invoke-interface {v5, p1, v6}, LC/P;->c(Li1/d;Li1/t;)I

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    invoke-direct {p0}, LC/t;->c()LC/P;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    invoke-interface {v6, p1}, LC/P;->a(Li1/d;)I

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    add-int/2addr v5, v3

    .line 42
    add-int/2addr v6, v4

    .line 43
    neg-int v7, v5

    .line 44
    neg-int v8, v6

    .line 45
    invoke-static {p3, p4, v7, v8}, Li1/c;->j(JII)J

    .line 46
    .line 47
    .line 48
    move-result-wide v7

    .line 49
    invoke-interface {p2, v7, v8}, LI0/A;->v0(J)Landroidx/compose/ui/layout/s;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    invoke-virtual {v7}, Landroidx/compose/ui/layout/s;->W0()I

    .line 54
    .line 55
    .line 56
    move-result v8

    .line 57
    add-int/2addr v8, v5

    .line 58
    invoke-static {p3, p4, v8}, Li1/c;->g(JI)I

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    invoke-virtual {v7}, Landroidx/compose/ui/layout/s;->P0()I

    .line 63
    .line 64
    .line 65
    move-result v8

    .line 66
    add-int/2addr v8, v6

    .line 67
    invoke-static {p3, p4, v8}, Li1/c;->f(JI)I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    new-instance v1, LC/t$a;

    .line 72
    .line 73
    invoke-direct {v1, v7, v3, v4}, LC/t$a;-><init>(Landroidx/compose/ui/layout/s;II)V

    .line 74
    .line 75
    .line 76
    move-object v4, v1

    .line 77
    move v1, v5

    .line 78
    const/4 v5, 0x4

    .line 79
    const/4 v6, 0x0

    .line 80
    const/4 v3, 0x0

    .line 81
    move-object v0, p1

    .line 82
    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/l;->u0(Landroidx/compose/ui/layout/l;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)LI0/C;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    return-object v0
.end method
