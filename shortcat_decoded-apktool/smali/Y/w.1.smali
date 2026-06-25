.class public abstract LY/w;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static a:Z

.field private static final b:Ljava/lang/Object;

.field private static final c:Ljava/lang/Object;

.field private static final d:Ljava/lang/Object;

.field private static final e:Ljava/lang/Object;

.field private static final f:Ljava/lang/Object;

.field private static final g:Ljava/lang/Object;

.field private static final h:Ljava/util/Comparator;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LY/I0;

    .line 2
    .line 3
    const-string v1, "provider"

    .line 4
    .line 5
    invoke-direct {v0, v1}, LY/I0;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, LY/w;->b:Ljava/lang/Object;

    .line 9
    .line 10
    new-instance v0, LY/I0;

    .line 11
    .line 12
    invoke-direct {v0, v1}, LY/I0;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    sput-object v0, LY/w;->c:Ljava/lang/Object;

    .line 16
    .line 17
    new-instance v0, LY/I0;

    .line 18
    .line 19
    const-string v1, "compositionLocalMap"

    .line 20
    .line 21
    invoke-direct {v0, v1}, LY/I0;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    sput-object v0, LY/w;->d:Ljava/lang/Object;

    .line 25
    .line 26
    new-instance v0, LY/I0;

    .line 27
    .line 28
    const-string v1, "providerValues"

    .line 29
    .line 30
    invoke-direct {v0, v1}, LY/I0;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    sput-object v0, LY/w;->e:Ljava/lang/Object;

    .line 34
    .line 35
    new-instance v0, LY/I0;

    .line 36
    .line 37
    const-string v1, "providers"

    .line 38
    .line 39
    invoke-direct {v0, v1}, LY/I0;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    sput-object v0, LY/w;->f:Ljava/lang/Object;

    .line 43
    .line 44
    new-instance v0, LY/I0;

    .line 45
    .line 46
    const-string v1, "reference"

    .line 47
    .line 48
    invoke-direct {v0, v1}, LY/I0;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    sput-object v0, LY/w;->g:Ljava/lang/Object;

    .line 52
    .line 53
    new-instance v0, LY/u;

    .line 54
    .line 55
    invoke-direct {v0}, LY/u;-><init>()V

    .line 56
    .line 57
    .line 58
    sput-object v0, LY/w;->h:Ljava/util/Comparator;

    .line 59
    .line 60
    return-void
.end method

.method private static final A(Ljava/util/List;II)LY/k0;
    .locals 1

    .line 1
    invoke-static {p0, p1}, LY/w;->y(Ljava/util/List;I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-ge p1, v0, :cond_0

    .line 10
    .line 11
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, LY/k0;

    .line 16
    .line 17
    invoke-virtual {p0}, LY/k0;->b()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-ge p1, p2, :cond_0

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_0
    const/4 p0, 0x0

    .line 25
    return-object p0
.end method

.method public static final B()Z
    .locals 1

    .line 1
    sget-boolean v0, LY/w;->a:Z

    .line 2
    .line 3
    return v0
.end method

.method public static final C()Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, LY/w;->d:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final D()Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, LY/w;->b:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method private static final E(LY/n0;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, LY/n0;->d()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, LY/m0;

    .line 8
    .line 9
    invoke-virtual {p0}, LY/n0;->a()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {p0}, LY/n0;->d()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-direct {v0, v1, p0}, LY/m0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_0
    invoke-virtual {p0}, LY/n0;->a()I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
.end method

.method public static final F()Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, LY/w;->c:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final G()Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, LY/w;->f:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final H()Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, LY/w;->g:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method private static final I(Ljava/util/List;ILY/f1;Ljava/lang/Object;)V
    .locals 3

    .line 1
    invoke-static {p0, p1}, LY/w;->z(Ljava/util/List;I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-gez v0, :cond_1

    .line 7
    .line 8
    add-int/lit8 v0, v0, 0x1

    .line 9
    .line 10
    neg-int v0, v0

    .line 11
    instance-of v2, p3, LY/U;

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object p3, v1

    .line 17
    :goto_0
    new-instance v1, LY/k0;

    .line 18
    .line 19
    invoke-direct {v1, p2, p1, p3}, LY/k0;-><init>(LY/f1;ILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-interface {p0, v0, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, LY/k0;

    .line 31
    .line 32
    instance-of p1, p3, LY/U;

    .line 33
    .line 34
    if-eqz p1, :cond_4

    .line 35
    .line 36
    invoke-virtual {p0}, LY/k0;->a()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    if-nez p1, :cond_2

    .line 41
    .line 42
    invoke-virtual {p0, p3}, LY/k0;->e(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_2
    instance-of p2, p1, Lt/Q;

    .line 47
    .line 48
    if-eqz p2, :cond_3

    .line 49
    .line 50
    check-cast p1, Lt/Q;

    .line 51
    .line 52
    invoke-virtual {p1, p3}, Lt/Q;->h(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_3
    invoke-static {p1, p3}, Lt/f0;->c(Ljava/lang/Object;Ljava/lang/Object;)Lt/Q;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p0, p1}, LY/k0;->e(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_4
    invoke-virtual {p0, v1}, LY/k0;->e(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public static final J(LY/D1;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, LY/D1;->k()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, LY/D1;->u()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    const/4 v1, 0x1

    .line 10
    add-int/2addr p0, v1

    .line 11
    if-le v0, p0, :cond_0

    .line 12
    .line 13
    return v1

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0
.end method

.method public static final K(LY/H1;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, LY/H1;->Z()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, LY/H1;->a0()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    const/4 v1, 0x1

    .line 10
    add-int/2addr p0, v1

    .line 11
    if-le v0, p0, :cond_0

    .line 12
    .line 13
    return v1

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0
.end method

.method public static final L()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method private static final M(I)Lt/P;
    .locals 1

    .line 1
    new-instance v0, Lt/P;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lt/P;-><init>(I)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, La0/b;->d(Lt/P;)Lt/P;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private static final N(LY/D1;III)I
    .locals 4

    .line 1
    if-ne p1, p2, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    if-eq p1, p3, :cond_8

    .line 5
    .line 6
    if-ne p2, p3, :cond_1

    .line 7
    .line 8
    goto :goto_4

    .line 9
    :cond_1
    invoke-virtual {p0, p1}, LY/D1;->Q(I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-ne v0, p2, :cond_2

    .line 14
    .line 15
    return p2

    .line 16
    :cond_2
    invoke-virtual {p0, p2}, LY/D1;->Q(I)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-ne v0, p1, :cond_3

    .line 21
    .line 22
    :goto_0
    return p1

    .line 23
    :cond_3
    invoke-virtual {p0, p1}, LY/D1;->Q(I)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-virtual {p0, p2}, LY/D1;->Q(I)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-ne v0, v1, :cond_4

    .line 32
    .line 33
    invoke-virtual {p0, p1}, LY/D1;->Q(I)I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    return p0

    .line 38
    :cond_4
    invoke-static {p0, p1, p3}, LY/w;->x(LY/D1;II)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    invoke-static {p0, p2, p3}, LY/w;->x(LY/D1;II)I

    .line 43
    .line 44
    .line 45
    move-result p3

    .line 46
    sub-int v1, v0, p3

    .line 47
    .line 48
    const/4 v2, 0x0

    .line 49
    move v3, v2

    .line 50
    :goto_1
    if-ge v3, v1, :cond_5

    .line 51
    .line 52
    invoke-virtual {p0, p1}, LY/D1;->Q(I)I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    add-int/lit8 v3, v3, 0x1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_5
    sub-int/2addr p3, v0

    .line 60
    :goto_2
    if-ge v2, p3, :cond_6

    .line 61
    .line 62
    invoke-virtual {p0, p2}, LY/D1;->Q(I)I

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    add-int/lit8 v2, v2, 0x1

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_6
    :goto_3
    if-eq p1, p2, :cond_7

    .line 70
    .line 71
    invoke-virtual {p0, p1}, LY/D1;->Q(I)I

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    invoke-virtual {p0, p2}, LY/D1;->Q(I)I

    .line 76
    .line 77
    .line 78
    move-result p2

    .line 79
    goto :goto_3

    .line 80
    :cond_7
    return p1

    .line 81
    :cond_8
    :goto_4
    return p3
.end method

.method public static final O(LY/H1;LY/u1;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LY/H1;->Z()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-instance v1, LY/v;

    .line 6
    .line 7
    invoke-direct {v1, p1}, LY/v;-><init>(LY/u1;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0, v1}, LY/H1;->W(ILkotlin/jvm/functions/Function2;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, LY/H1;->J0()Z

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method private static final P(LY/u1;ILjava/lang/Object;)LTd/L;
    .locals 0

    .line 1
    instance-of p1, p2, LY/i;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    move-object p1, p2

    .line 6
    check-cast p1, LY/i;

    .line 7
    .line 8
    invoke-interface {p0, p1}, LY/u1;->b(LY/i;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    instance-of p1, p2, LY/w1;

    .line 12
    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    move-object p1, p2

    .line 16
    check-cast p1, LY/w1;

    .line 17
    .line 18
    invoke-interface {p0, p1}, LY/u1;->a(LY/w1;)V

    .line 19
    .line 20
    .line 21
    :cond_1
    instance-of p0, p2, LY/f1;

    .line 22
    .line 23
    if-eqz p0, :cond_2

    .line 24
    .line 25
    check-cast p2, LY/f1;

    .line 26
    .line 27
    invoke-virtual {p2}, LY/f1;->A()V

    .line 28
    .line 29
    .line 30
    :cond_2
    sget-object p0, LTd/L;->a:LTd/L;

    .line 31
    .line 32
    return-object p0
.end method

.method private static final Q(LY/H1;ILjava/lang/Object;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, LY/H1;->H(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-ne p2, p0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 p1, 0x0

    .line 10
    :goto_0
    if-nez p1, :cond_1

    .line 11
    .line 12
    new-instance p1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string v0, "Slot table is out of sync (expected "

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string p2, ", got "

    .line 26
    .line 27
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const/16 p0, 0x29

    .line 34
    .line 35
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-static {p0}, LY/w;->t(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    :cond_1
    return-void
.end method

.method private static final R(Ljava/util/List;I)LY/k0;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LY/w;->z(Ljava/util/List;I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-ltz p1, :cond_0

    .line 6
    .line 7
    invoke-interface {p0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, LY/k0;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return-object p0
.end method

.method private static final S(Ljava/util/List;II)V
    .locals 1

    .line 1
    invoke-static {p0, p1}, LY/w;->y(Ljava/util/List;I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-ge p1, v0, :cond_0

    .line 10
    .line 11
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, LY/k0;

    .line 16
    .line 17
    invoke-virtual {v0}, LY/k0;->b()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-ge v0, p2, :cond_0

    .line 22
    .line 23
    invoke-interface {p0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, LY/k0;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    return-void
.end method

.method public static final T()V
    .locals 0

    .line 1
    return-void
.end method

.method public static final U(IIILjava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public static synthetic a(LY/u1;ILjava/lang/Object;)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LY/w;->P(LY/u1;ILjava/lang/Object;)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic b(LY/u1;LY/H1;ILjava/lang/Object;)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, LY/w;->w(LY/u1;LY/H1;ILjava/lang/Object;)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic c(LY/k0;LY/k0;)I
    .locals 0

    .line 1
    invoke-static {p0, p1}, LY/w;->d(LY/k0;LY/k0;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static final d(LY/k0;LY/k0;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, LY/k0;->b()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-virtual {p1}, LY/k0;->b()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->i(II)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public static final synthetic e(I)Z
    .locals 0

    .line 1
    invoke-static {p0}, LY/w;->p(I)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic f(Z)I
    .locals 0

    .line 1
    invoke-static {p0}, LY/w;->q(Z)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic g(LY/E1;LY/b;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LY/w;->r(LY/E1;LY/b;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic h(Ljava/util/List;II)LY/k0;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LY/w;->A(Ljava/util/List;II)LY/k0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic i()Ljava/util/Comparator;
    .locals 1

    .line 1
    sget-object v0, LY/w;->h:Ljava/util/Comparator;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic j(LY/n0;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0}, LY/w;->E(LY/n0;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic k(Ljava/util/List;ILY/f1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, LY/w;->I(Ljava/util/List;ILY/f1;Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic l(I)Lt/P;
    .locals 0

    .line 1
    invoke-static {p0}, LY/w;->M(I)Lt/P;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic m(LY/D1;III)I
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, LY/w;->N(LY/D1;III)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic n(Ljava/util/List;I)LY/k0;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LY/w;->R(Ljava/util/List;I)LY/k0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic o(Ljava/util/List;II)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LY/w;->S(Ljava/util/List;II)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final p(I)Z
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_0
    const/4 p0, 0x0

    .line 6
    return p0
.end method

.method private static final q(Z)I
    .locals 0

    .line 1
    return p0
.end method

.method private static final r(LY/E1;LY/b;)Ljava/util/List;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LY/E1;->F()LY/D1;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    :try_start_0
    invoke-virtual {p0, p1}, LY/E1;->d(LY/b;)I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    invoke-static {v1, v0, p0}, LY/w;->s(LY/D1;Ljava/util/List;I)V

    .line 15
    .line 16
    .line 17
    sget-object p0, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    invoke-virtual {v1}, LY/D1;->d()V

    .line 20
    .line 21
    .line 22
    return-object v0

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    invoke-virtual {v1}, LY/D1;->d()V

    .line 25
    .line 26
    .line 27
    throw p0
.end method

.method private static final s(LY/D1;Ljava/util/List;I)V
    .locals 2

    .line 1
    invoke-virtual {p0, p2}, LY/D1;->K(I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p2}, LY/D1;->M(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    add-int/lit8 v0, p2, 0x1

    .line 16
    .line 17
    invoke-virtual {p0, p2}, LY/D1;->F(I)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    add-int/2addr p2, v1

    .line 22
    :goto_0
    if-ge v0, p2, :cond_1

    .line 23
    .line 24
    invoke-static {p0, p1, v0}, LY/w;->s(LY/D1;Ljava/util/List;I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v0}, LY/D1;->F(I)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    add-int/2addr v0, v1

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    return-void
.end method

.method public static final t(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, LY/k;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API ("

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string p0, "). Please report to Google or use https://goo.gle/compose-feedback"

    .line 17
    .line 18
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-direct {v0, p0}, LY/k;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw v0
.end method

.method public static final u(Ljava/lang/String;)Ljava/lang/Void;
    .locals 3

    .line 1
    new-instance v0, LY/k;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API ("

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string p0, "). Please report to Google or use https://goo.gle/compose-feedback"

    .line 17
    .line 18
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-direct {v0, p0}, LY/k;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw v0
.end method

.method public static final v(LY/H1;LY/u1;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LY/H1;->Z()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-instance v1, LY/t;

    .line 6
    .line 7
    invoke-direct {v1, p1, p0}, LY/t;-><init>(LY/u1;LY/H1;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0, v1}, LY/H1;->W(ILkotlin/jvm/functions/Function2;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private static final w(LY/u1;LY/H1;ILjava/lang/Object;)LTd/L;
    .locals 2

    .line 1
    instance-of v0, p3, LY/i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p3, LY/i;

    .line 6
    .line 7
    invoke-interface {p0, p3}, LY/u1;->d(LY/i;)V

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    instance-of v0, p3, LY/w1;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    move-object v0, p3

    .line 16
    check-cast v0, LY/w1;

    .line 17
    .line 18
    invoke-virtual {v0}, LY/w1;->b()LY/v1;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    instance-of v1, v1, LY/z1;

    .line 23
    .line 24
    if-nez v1, :cond_2

    .line 25
    .line 26
    invoke-static {p1, p2, p3}, LY/w;->Q(LY/H1;ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-interface {p0, v0}, LY/u1;->a(LY/w1;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    instance-of p0, p3, LY/f1;

    .line 34
    .line 35
    if-eqz p0, :cond_2

    .line 36
    .line 37
    invoke-static {p1, p2, p3}, LY/w;->Q(LY/H1;ILjava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    check-cast p3, LY/f1;

    .line 41
    .line 42
    invoke-virtual {p3}, LY/f1;->A()V

    .line 43
    .line 44
    .line 45
    :cond_2
    :goto_0
    sget-object p0, LTd/L;->a:LTd/L;

    .line 46
    .line 47
    return-object p0
.end method

.method private static final x(LY/D1;II)I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    if-lez p1, :cond_0

    .line 3
    .line 4
    if-eq p1, p2, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0, p1}, LY/D1;->Q(I)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    add-int/lit8 v0, v0, 0x1

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    return v0
.end method

.method private static final y(Ljava/util/List;I)I
    .locals 0

    .line 1
    invoke-static {p0, p1}, LY/w;->z(Ljava/util/List;I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-gez p0, :cond_0

    .line 6
    .line 7
    add-int/lit8 p0, p0, 0x1

    .line 8
    .line 9
    neg-int p0, p0

    .line 10
    :cond_0
    return p0
.end method

.method private static final z(Ljava/util/List;I)I
    .locals 4

    .line 1
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, -0x1

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    if-gt v1, v0, :cond_2

    .line 9
    .line 10
    add-int v2, v1, v0

    .line 11
    .line 12
    ushr-int/lit8 v2, v2, 0x1

    .line 13
    .line 14
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    check-cast v3, LY/k0;

    .line 19
    .line 20
    invoke-virtual {v3}, LY/k0;->b()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    invoke-static {v3, p1}, Lkotlin/jvm/internal/s;->i(II)I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-gez v3, :cond_0

    .line 29
    .line 30
    add-int/lit8 v1, v2, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    if-lez v3, :cond_1

    .line 34
    .line 35
    add-int/lit8 v0, v2, -0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    return v2

    .line 39
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 40
    .line 41
    neg-int p0, v1

    .line 42
    return p0
.end method
