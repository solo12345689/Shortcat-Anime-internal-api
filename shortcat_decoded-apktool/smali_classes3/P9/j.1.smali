.class LP9/j;
.super Ljava/util/AbstractMap;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LP9/j$f;,
        LP9/j$d;,
        LP9/j$h;,
        LP9/j$g;,
        LP9/j$e;
    }
.end annotation


# static fields
.field private static final j:Ljava/lang/Object;


# instance fields
.field private transient a:Ljava/lang/Object;

.field transient b:[I

.field transient c:[Ljava/lang/Object;

.field transient d:[Ljava/lang/Object;

.field private transient e:I

.field private transient f:I

.field private transient g:Ljava/util/Set;

.field private transient h:Ljava/util/Set;

.field private transient i:Ljava/util/Collection;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LP9/j;->j:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/util/AbstractMap;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, LP9/j;->J(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static A(I)LP9/j;
    .locals 1

    .line 1
    new-instance v0, LP9/j;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LP9/j;-><init>(I)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private C(I)I
    .locals 1

    .line 1
    invoke-direct {p0}, LP9/j;->Q()[I

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    aget p1, v0, p1

    .line 6
    .line 7
    return p1
.end method

.method private G()I
    .locals 2

    .line 1
    iget v0, p0, LP9/j;->e:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x1f

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    shl-int v0, v1, v0

    .line 7
    .line 8
    sub-int/2addr v0, v1

    .line 9
    return v0
.end method

.method private I(Ljava/lang/Object;)I
    .locals 6

    .line 1
    invoke-virtual {p0}, LP9/j;->O()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-static {p1}, LP9/q;->c(Ljava/lang/Object;)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-direct {p0}, LP9/j;->G()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-direct {p0}, LP9/j;->S()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    and-int v4, v0, v2

    .line 22
    .line 23
    invoke-static {v3, v4}, LP9/k;->h(Ljava/lang/Object;I)I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-nez v3, :cond_1

    .line 28
    .line 29
    return v1

    .line 30
    :cond_1
    invoke-static {v0, v2}, LP9/k;->b(II)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    :cond_2
    add-int/lit8 v3, v3, -0x1

    .line 35
    .line 36
    invoke-direct {p0, v3}, LP9/j;->C(I)I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    invoke-static {v4, v2}, LP9/k;->b(II)I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    if-ne v5, v0, :cond_3

    .line 45
    .line 46
    invoke-direct {p0, v3}, LP9/j;->L(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    invoke-static {p1, v5}, LO9/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    if-eqz v5, :cond_3

    .line 55
    .line 56
    return v3

    .line 57
    :cond_3
    invoke-static {v4, v2}, LP9/k;->c(II)I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-nez v3, :cond_2

    .line 62
    .line 63
    return v1
.end method

.method private L(I)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-direct {p0}, LP9/j;->R()[Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    aget-object p1, v0, p1

    .line 6
    .line 7
    return-object p1
.end method

.method private P(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-virtual {p0}, LP9/j;->O()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object p1, LP9/j;->j:Ljava/lang/Object;

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    invoke-direct {p0}, LP9/j;->G()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    invoke-direct {p0}, LP9/j;->S()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    invoke-direct {p0}, LP9/j;->Q()[I

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    invoke-direct {p0}, LP9/j;->R()[Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    const/4 v6, 0x0

    .line 27
    const/4 v1, 0x0

    .line 28
    move-object v0, p1

    .line 29
    invoke-static/range {v0 .. v6}, LP9/k;->f(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;[I[Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    const/4 v0, -0x1

    .line 34
    if-ne p1, v0, :cond_1

    .line 35
    .line 36
    sget-object p1, LP9/j;->j:Ljava/lang/Object;

    .line 37
    .line 38
    return-object p1

    .line 39
    :cond_1
    invoke-direct {p0, p1}, LP9/j;->b0(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {p0, p1, v2}, LP9/j;->N(II)V

    .line 44
    .line 45
    .line 46
    iget p1, p0, LP9/j;->f:I

    .line 47
    .line 48
    add-int/lit8 p1, p1, -0x1

    .line 49
    .line 50
    iput p1, p0, LP9/j;->f:I

    .line 51
    .line 52
    invoke-virtual {p0}, LP9/j;->H()V

    .line 53
    .line 54
    .line 55
    return-object v0
.end method

.method private Q()[I
    .locals 1

    .line 1
    iget-object v0, p0, LP9/j;->b:[I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    check-cast v0, [I

    .line 7
    .line 8
    return-object v0
.end method

.method private R()[Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LP9/j;->c:[Ljava/lang/Object;

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    check-cast v0, [Ljava/lang/Object;

    .line 7
    .line 8
    return-object v0
.end method

.method private S()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LP9/j;->a:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private T()[Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LP9/j;->d:[Ljava/lang/Object;

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    check-cast v0, [Ljava/lang/Object;

    .line 7
    .line 8
    return-object v0
.end method

.method private V(I)V
    .locals 2

    .line 1
    invoke-direct {p0}, LP9/j;->Q()[I

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v0, v0

    .line 6
    if-le p1, v0, :cond_0

    .line 7
    .line 8
    ushr-int/lit8 p1, v0, 0x1

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    add-int/2addr p1, v0

    .line 16
    or-int/2addr p1, v1

    .line 17
    const v1, 0x3fffffff    # 1.9999999f

    .line 18
    .line 19
    .line 20
    invoke-static {v1, p1}, Ljava/lang/Math;->min(II)I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eq p1, v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0, p1}, LP9/j;->U(I)V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void
.end method

.method private W(IIII)I
    .locals 8

    .line 1
    invoke-static {p2}, LP9/k;->a(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    add-int/lit8 p2, p2, -0x1

    .line 6
    .line 7
    if-eqz p4, :cond_0

    .line 8
    .line 9
    and-int/2addr p3, p2

    .line 10
    add-int/lit8 p4, p4, 0x1

    .line 11
    .line 12
    invoke-static {v0, p3, p4}, LP9/k;->i(Ljava/lang/Object;II)V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-direct {p0}, LP9/j;->S()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    invoke-direct {p0}, LP9/j;->Q()[I

    .line 20
    .line 21
    .line 22
    move-result-object p4

    .line 23
    const/4 v1, 0x0

    .line 24
    :goto_0
    if-gt v1, p1, :cond_2

    .line 25
    .line 26
    invoke-static {p3, v1}, LP9/k;->h(Ljava/lang/Object;I)I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    :goto_1
    if-eqz v2, :cond_1

    .line 31
    .line 32
    add-int/lit8 v3, v2, -0x1

    .line 33
    .line 34
    aget v4, p4, v3

    .line 35
    .line 36
    invoke-static {v4, p1}, LP9/k;->b(II)I

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    or-int/2addr v5, v1

    .line 41
    and-int v6, v5, p2

    .line 42
    .line 43
    invoke-static {v0, v6}, LP9/k;->h(Ljava/lang/Object;I)I

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    invoke-static {v0, v6, v2}, LP9/k;->i(Ljava/lang/Object;II)V

    .line 48
    .line 49
    .line 50
    invoke-static {v5, v7, p2}, LP9/k;->d(III)I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    aput v2, p4, v3

    .line 55
    .line 56
    invoke-static {v4, p1}, LP9/k;->c(II)I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    goto :goto_1

    .line 61
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    iput-object v0, p0, LP9/j;->a:Ljava/lang/Object;

    .line 65
    .line 66
    invoke-direct {p0, p2}, LP9/j;->Y(I)V

    .line 67
    .line 68
    .line 69
    return p2
.end method

.method private X(II)V
    .locals 1

    .line 1
    invoke-direct {p0}, LP9/j;->Q()[I

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    aput p2, v0, p1

    .line 6
    .line 7
    return-void
.end method

.method private Y(I)V
    .locals 2

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    rsub-int/lit8 p1, p1, 0x20

    .line 6
    .line 7
    iget v0, p0, LP9/j;->e:I

    .line 8
    .line 9
    const/16 v1, 0x1f

    .line 10
    .line 11
    invoke-static {v0, p1, v1}, LP9/k;->d(III)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    iput p1, p0, LP9/j;->e:I

    .line 16
    .line 17
    return-void
.end method

.method private Z(ILjava/lang/Object;)V
    .locals 1

    .line 1
    invoke-direct {p0}, LP9/j;->R()[Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    aput-object p2, v0, p1

    .line 6
    .line 7
    return-void
.end method

.method static synthetic a(LP9/j;)I
    .locals 0

    .line 1
    iget p0, p0, LP9/j;->e:I

    .line 2
    .line 3
    return p0
.end method

.method private a0(ILjava/lang/Object;)V
    .locals 1

    .line 1
    invoke-direct {p0}, LP9/j;->T()[Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    aput-object p2, v0, p1

    .line 6
    .line 7
    return-void
.end method

.method static synthetic b(LP9/j;I)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LP9/j;->L(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private b0(I)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-direct {p0}, LP9/j;->T()[Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    aget-object p1, v0, p1

    .line 6
    .line 7
    return-object p1
.end method

.method static synthetic d(LP9/j;)[Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0}, LP9/j;->R()[Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic e(LP9/j;)[Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0}, LP9/j;->T()[Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic f(LP9/j;)I
    .locals 2

    .line 1
    iget v0, p0, LP9/j;->f:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, -0x1

    .line 4
    .line 5
    iput v1, p0, LP9/j;->f:I

    .line 6
    .line 7
    return v0
.end method

.method static synthetic g(LP9/j;ILjava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LP9/j;->a0(ILjava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static synthetic h(LP9/j;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LP9/j;->P(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic i()Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, LP9/j;->j:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method static synthetic j(LP9/j;Ljava/lang/Object;)I
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LP9/j;->I(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method static synthetic k(LP9/j;I)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LP9/j;->b0(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic l(LP9/j;)I
    .locals 0

    .line 1
    invoke-direct {p0}, LP9/j;->G()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method static synthetic m(LP9/j;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0}, LP9/j;->S()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic o(LP9/j;)[I
    .locals 0

    .line 1
    invoke-direct {p0}, LP9/j;->Q()[I

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method B()Ljava/util/Map;
    .locals 2

    .line 1
    iget-object v0, p0, LP9/j;->a:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/util/Map;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ljava/util/Map;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method D()Ljava/util/Iterator;
    .locals 1

    .line 1
    invoke-virtual {p0}, LP9/j;->B()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    :cond_0
    new-instance v0, LP9/j$b;

    .line 17
    .line 18
    invoke-direct {v0, p0}, LP9/j$b;-><init>(LP9/j;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method E()I
    .locals 1

    .line 1
    invoke-virtual {p0}, LP9/j;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method F(I)I
    .locals 1

    .line 1
    add-int/lit8 p1, p1, 0x1

    .line 2
    .line 3
    iget v0, p0, LP9/j;->f:I

    .line 4
    .line 5
    if-ge p1, v0, :cond_0

    .line 6
    .line 7
    return p1

    .line 8
    :cond_0
    const/4 p1, -0x1

    .line 9
    return p1
.end method

.method H()V
    .locals 1

    .line 1
    iget v0, p0, LP9/j;->e:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x20

    .line 4
    .line 5
    iput v0, p0, LP9/j;->e:I

    .line 6
    .line 7
    return-void
.end method

.method J(I)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ltz p1, :cond_0

    .line 3
    .line 4
    move v1, v0

    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 v1, 0x0

    .line 7
    :goto_0
    const-string v2, "Expected size must be >= 0"

    .line 8
    .line 9
    invoke-static {v1, v2}, LO9/n;->e(ZLjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    const v1, 0x3fffffff    # 1.9999999f

    .line 13
    .line 14
    .line 15
    invoke-static {p1, v0, v1}, LS9/f;->g(III)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    iput p1, p0, LP9/j;->e:I

    .line 20
    .line 21
    return-void
.end method

.method K(ILjava/lang/Object;Ljava/lang/Object;II)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p4, v0, p5}, LP9/k;->d(III)I

    .line 3
    .line 4
    .line 5
    move-result p4

    .line 6
    invoke-direct {p0, p1, p4}, LP9/j;->X(II)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0, p1, p2}, LP9/j;->Z(ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, p1, p3}, LP9/j;->a0(ILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method M()Ljava/util/Iterator;
    .locals 1

    .line 1
    invoke-virtual {p0}, LP9/j;->B()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    :cond_0
    new-instance v0, LP9/j$a;

    .line 17
    .line 18
    invoke-direct {v0, p0}, LP9/j$a;-><init>(LP9/j;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method N(II)V
    .locals 10

    .line 1
    invoke-direct {p0}, LP9/j;->S()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0}, LP9/j;->Q()[I

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {p0}, LP9/j;->R()[Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-direct {p0}, LP9/j;->T()[Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {p0}, LP9/j;->size()I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    add-int/lit8 v5, v4, -0x1

    .line 22
    .line 23
    const/4 v6, 0x0

    .line 24
    const/4 v7, 0x0

    .line 25
    if-ge p1, v5, :cond_2

    .line 26
    .line 27
    aget-object v8, v2, v5

    .line 28
    .line 29
    aput-object v8, v2, p1

    .line 30
    .line 31
    aget-object v9, v3, v5

    .line 32
    .line 33
    aput-object v9, v3, p1

    .line 34
    .line 35
    aput-object v7, v2, v5

    .line 36
    .line 37
    aput-object v7, v3, v5

    .line 38
    .line 39
    aget v2, v1, v5

    .line 40
    .line 41
    aput v2, v1, p1

    .line 42
    .line 43
    aput v6, v1, v5

    .line 44
    .line 45
    invoke-static {v8}, LP9/q;->c(Ljava/lang/Object;)I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    and-int/2addr v2, p2

    .line 50
    invoke-static {v0, v2}, LP9/k;->h(Ljava/lang/Object;I)I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-ne v3, v4, :cond_0

    .line 55
    .line 56
    add-int/lit8 p1, p1, 0x1

    .line 57
    .line 58
    invoke-static {v0, v2, p1}, LP9/k;->i(Ljava/lang/Object;II)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_0
    :goto_0
    add-int/lit8 v3, v3, -0x1

    .line 63
    .line 64
    aget v0, v1, v3

    .line 65
    .line 66
    invoke-static {v0, p2}, LP9/k;->c(II)I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-ne v2, v4, :cond_1

    .line 71
    .line 72
    add-int/lit8 p1, p1, 0x1

    .line 73
    .line 74
    invoke-static {v0, p1, p2}, LP9/k;->d(III)I

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    aput p1, v1, v3

    .line 79
    .line 80
    return-void

    .line 81
    :cond_1
    move v3, v2

    .line 82
    goto :goto_0

    .line 83
    :cond_2
    aput-object v7, v2, p1

    .line 84
    .line 85
    aput-object v7, v3, p1

    .line 86
    .line 87
    aput v6, v1, p1

    .line 88
    .line 89
    return-void
.end method

.method O()Z
    .locals 1

    .line 1
    iget-object v0, p0, LP9/j;->a:Ljava/lang/Object;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method U(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, LP9/j;->Q()[I

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([II)[I

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, LP9/j;->b:[I

    .line 10
    .line 11
    invoke-direct {p0}, LP9/j;->R()[Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, LP9/j;->c:[Ljava/lang/Object;

    .line 20
    .line 21
    invoke-direct {p0}, LP9/j;->T()[Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, LP9/j;->d:[Ljava/lang/Object;

    .line 30
    .line 31
    return-void
.end method

.method c0()Ljava/util/Iterator;
    .locals 1

    .line 1
    invoke-virtual {p0}, LP9/j;->B()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    :cond_0
    new-instance v0, LP9/j$c;

    .line 17
    .line 18
    invoke-direct {v0, p0}, LP9/j$c;-><init>(LP9/j;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public clear()V
    .locals 6

    .line 1
    invoke-virtual {p0}, LP9/j;->O()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p0}, LP9/j;->H()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, LP9/j;->B()Ljava/util/Map;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x0

    .line 16
    const/4 v2, 0x0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0}, LP9/j;->size()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    const/4 v4, 0x3

    .line 24
    const v5, 0x3fffffff    # 1.9999999f

    .line 25
    .line 26
    .line 27
    invoke-static {v3, v4, v5}, LS9/f;->g(III)I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    iput v3, p0, LP9/j;->e:I

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 34
    .line 35
    .line 36
    iput-object v1, p0, LP9/j;->a:Ljava/lang/Object;

    .line 37
    .line 38
    iput v2, p0, LP9/j;->f:I

    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    invoke-direct {p0}, LP9/j;->R()[Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget v3, p0, LP9/j;->f:I

    .line 46
    .line 47
    invoke-static {v0, v2, v3, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-direct {p0}, LP9/j;->T()[Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iget v3, p0, LP9/j;->f:I

    .line 55
    .line 56
    invoke-static {v0, v2, v3, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-direct {p0}, LP9/j;->S()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-static {v0}, LP9/k;->g(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    invoke-direct {p0}, LP9/j;->Q()[I

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    iget v1, p0, LP9/j;->f:I

    .line 71
    .line 72
    invoke-static {v0, v2, v1, v2}, Ljava/util/Arrays;->fill([IIII)V

    .line 73
    .line 74
    .line 75
    iput v2, p0, LP9/j;->f:I

    .line 76
    .line 77
    return-void
.end method

.method public containsKey(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, LP9/j;->B()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1

    .line 12
    :cond_0
    invoke-direct {p0, p1}, LP9/j;->I(Ljava/lang/Object;)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    const/4 v0, -0x1

    .line 17
    if-eq p1, v0, :cond_1

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    return p1

    .line 21
    :cond_1
    const/4 p1, 0x0

    .line 22
    return p1
.end method

.method public containsValue(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, LP9/j;->B()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0, p1}, Ljava/util/Map;->containsValue(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    move v1, v0

    .line 14
    :goto_0
    iget v2, p0, LP9/j;->f:I

    .line 15
    .line 16
    if-ge v1, v2, :cond_2

    .line 17
    .line 18
    invoke-direct {p0, v1}, LP9/j;->b0(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-static {p1, v2}, LO9/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    return p1

    .line 30
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    return v0
.end method

.method public entrySet()Ljava/util/Set;
    .locals 1

    .line 1
    iget-object v0, p0, LP9/j;->h:Ljava/util/Set;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LP9/j;->v()Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, LP9/j;->h:Ljava/util/Set;

    .line 10
    .line 11
    :cond_0
    return-object v0
.end method

.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LP9/j;->B()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    :cond_0
    invoke-direct {p0, p1}, LP9/j;->I(Ljava/lang/Object;)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    const/4 v0, -0x1

    .line 17
    if-ne p1, v0, :cond_1

    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    return-object p1

    .line 21
    :cond_1
    invoke-virtual {p0, p1}, LP9/j;->p(I)V

    .line 22
    .line 23
    .line 24
    invoke-direct {p0, p1}, LP9/j;->b0(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1
.end method

.method public isEmpty()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, LP9/j;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public keySet()Ljava/util/Set;
    .locals 1

    .line 1
    iget-object v0, p0, LP9/j;->g:Ljava/util/Set;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LP9/j;->y()Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, LP9/j;->g:Ljava/util/Set;

    .line 10
    .line 11
    :cond_0
    return-object v0
.end method

.method p(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    invoke-virtual {p0}, LP9/j;->O()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, LP9/j;->t()I

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, LP9/j;->B()Ljava/util/Map;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1

    .line 21
    :cond_1
    invoke-direct {p0}, LP9/j;->Q()[I

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-direct {p0}, LP9/j;->R()[Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-direct {p0}, LP9/j;->T()[Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    iget v4, p0, LP9/j;->f:I

    .line 34
    .line 35
    add-int/lit8 v9, v4, 0x1

    .line 36
    .line 37
    invoke-static {p1}, LP9/q;->c(Ljava/lang/Object;)I

    .line 38
    .line 39
    .line 40
    move-result v7

    .line 41
    invoke-direct {p0}, LP9/j;->G()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    and-int v5, v7, v3

    .line 46
    .line 47
    invoke-direct {p0}, LP9/j;->S()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    invoke-static {v6, v5}, LP9/k;->h(Ljava/lang/Object;I)I

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    if-nez v6, :cond_3

    .line 56
    .line 57
    if-le v9, v3, :cond_2

    .line 58
    .line 59
    invoke-static {v3}, LP9/k;->e(I)I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    invoke-direct {p0, v3, v0, v7, v4}, LP9/j;->W(IIII)I

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    :goto_0
    move v8, v3

    .line 68
    goto :goto_2

    .line 69
    :cond_2
    invoke-direct {p0}, LP9/j;->S()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-static {v0, v5, v9}, LP9/k;->i(Ljava/lang/Object;II)V

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_3
    invoke-static {v7, v3}, LP9/k;->b(II)I

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    const/4 v8, 0x0

    .line 82
    :goto_1
    add-int/lit8 v6, v6, -0x1

    .line 83
    .line 84
    aget v10, v0, v6

    .line 85
    .line 86
    invoke-static {v10, v3}, LP9/k;->b(II)I

    .line 87
    .line 88
    .line 89
    move-result v11

    .line 90
    if-ne v11, v5, :cond_4

    .line 91
    .line 92
    aget-object v11, v1, v6

    .line 93
    .line 94
    invoke-static {p1, v11}, LO9/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v11

    .line 98
    if-eqz v11, :cond_4

    .line 99
    .line 100
    aget-object p1, v2, v6

    .line 101
    .line 102
    aput-object p2, v2, v6

    .line 103
    .line 104
    invoke-virtual {p0, v6}, LP9/j;->p(I)V

    .line 105
    .line 106
    .line 107
    return-object p1

    .line 108
    :cond_4
    invoke-static {v10, v3}, LP9/k;->c(II)I

    .line 109
    .line 110
    .line 111
    move-result v11

    .line 112
    add-int/lit8 v8, v8, 0x1

    .line 113
    .line 114
    if-nez v11, :cond_7

    .line 115
    .line 116
    const/16 v1, 0x9

    .line 117
    .line 118
    if-lt v8, v1, :cond_5

    .line 119
    .line 120
    invoke-virtual {p0}, LP9/j;->u()Ljava/util/Map;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    return-object p1

    .line 129
    :cond_5
    if-le v9, v3, :cond_6

    .line 130
    .line 131
    invoke-static {v3}, LP9/k;->e(I)I

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    invoke-direct {p0, v3, v0, v7, v4}, LP9/j;->W(IIII)I

    .line 136
    .line 137
    .line 138
    move-result v3

    .line 139
    goto :goto_0

    .line 140
    :cond_6
    invoke-static {v10, v9, v3}, LP9/k;->d(III)I

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    aput v1, v0, v6

    .line 145
    .line 146
    goto :goto_0

    .line 147
    :goto_2
    invoke-direct {p0, v9}, LP9/j;->V(I)V

    .line 148
    .line 149
    .line 150
    move-object v3, p0

    .line 151
    move-object v5, p1

    .line 152
    move-object v6, p2

    .line 153
    invoke-virtual/range {v3 .. v8}, LP9/j;->K(ILjava/lang/Object;Ljava/lang/Object;II)V

    .line 154
    .line 155
    .line 156
    move-object p1, v3

    .line 157
    iput v9, p1, LP9/j;->f:I

    .line 158
    .line 159
    invoke-virtual {p0}, LP9/j;->H()V

    .line 160
    .line 161
    .line 162
    const/4 p2, 0x0

    .line 163
    return-object p2

    .line 164
    :cond_7
    move-object v6, p2

    .line 165
    move-object p2, p1

    .line 166
    move-object p1, p0

    .line 167
    move-object p1, p2

    .line 168
    move-object p2, v6

    .line 169
    move v6, v11

    .line 170
    goto :goto_1
.end method

.method q(II)I
    .locals 0

    .line 1
    add-int/lit8 p1, p1, -0x1

    .line 2
    .line 3
    return p1
.end method

.method public remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LP9/j;->B()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    :cond_0
    invoke-direct {p0, p1}, LP9/j;->P(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    sget-object v0, LP9/j;->j:Ljava/lang/Object;

    .line 17
    .line 18
    if-ne p1, v0, :cond_1

    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    :cond_1
    return-object p1
.end method

.method public size()I
    .locals 1

    .line 1
    invoke-virtual {p0}, LP9/j;->B()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0

    .line 12
    :cond_0
    iget v0, p0, LP9/j;->f:I

    .line 13
    .line 14
    return v0
.end method

.method t()I
    .locals 3

    .line 1
    invoke-virtual {p0}, LP9/j;->O()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "Arrays already allocated"

    .line 6
    .line 7
    invoke-static {v0, v1}, LO9/n;->q(ZLjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget v0, p0, LP9/j;->e:I

    .line 11
    .line 12
    invoke-static {v0}, LP9/k;->j(I)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-static {v1}, LP9/k;->a(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    iput-object v2, p0, LP9/j;->a:Ljava/lang/Object;

    .line 21
    .line 22
    add-int/lit8 v1, v1, -0x1

    .line 23
    .line 24
    invoke-direct {p0, v1}, LP9/j;->Y(I)V

    .line 25
    .line 26
    .line 27
    new-array v1, v0, [I

    .line 28
    .line 29
    iput-object v1, p0, LP9/j;->b:[I

    .line 30
    .line 31
    new-array v1, v0, [Ljava/lang/Object;

    .line 32
    .line 33
    iput-object v1, p0, LP9/j;->c:[Ljava/lang/Object;

    .line 34
    .line 35
    new-array v1, v0, [Ljava/lang/Object;

    .line 36
    .line 37
    iput-object v1, p0, LP9/j;->d:[Ljava/lang/Object;

    .line 38
    .line 39
    return v0
.end method

.method u()Ljava/util/Map;
    .locals 4

    .line 1
    invoke-direct {p0}, LP9/j;->G()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    invoke-virtual {p0, v0}, LP9/j;->w(I)Ljava/util/Map;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0}, LP9/j;->E()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    :goto_0
    if-ltz v1, :cond_0

    .line 16
    .line 17
    invoke-direct {p0, v1}, LP9/j;->L(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-direct {p0, v1}, LP9/j;->b0(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v1}, LP9/j;->F(I)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iput-object v0, p0, LP9/j;->a:Ljava/lang/Object;

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    iput-object v1, p0, LP9/j;->b:[I

    .line 37
    .line 38
    iput-object v1, p0, LP9/j;->c:[Ljava/lang/Object;

    .line 39
    .line 40
    iput-object v1, p0, LP9/j;->d:[Ljava/lang/Object;

    .line 41
    .line 42
    invoke-virtual {p0}, LP9/j;->H()V

    .line 43
    .line 44
    .line 45
    return-object v0
.end method

.method v()Ljava/util/Set;
    .locals 1

    .line 1
    new-instance v0, LP9/j$d;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LP9/j$d;-><init>(LP9/j;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public values()Ljava/util/Collection;
    .locals 1

    .line 1
    iget-object v0, p0, LP9/j;->i:Ljava/util/Collection;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LP9/j;->z()Ljava/util/Collection;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, LP9/j;->i:Ljava/util/Collection;

    .line 10
    .line 11
    :cond_0
    return-object v0
.end method

.method w(I)Ljava/util/Map;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    const/high16 v1, 0x3f800000    # 1.0f

    .line 4
    .line 5
    invoke-direct {v0, p1, v1}, Ljava/util/LinkedHashMap;-><init>(IF)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method y()Ljava/util/Set;
    .locals 1

    .line 1
    new-instance v0, LP9/j$f;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LP9/j$f;-><init>(LP9/j;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method z()Ljava/util/Collection;
    .locals 1

    .line 1
    new-instance v0, LP9/j$h;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LP9/j$h;-><init>(LP9/j;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
