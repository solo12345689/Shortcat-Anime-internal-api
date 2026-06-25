.class public final LZ/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LZ/b$a;
    }
.end annotation


# static fields
.field public static final m:LZ/b$a;

.field public static final n:I


# instance fields
.field private final a:LY/s;

.field private b:LZ/a;

.field private c:Z

.field private final d:LY/i0;

.field private e:Z

.field private f:I

.field private g:I

.field private final h:Ljava/util/ArrayList;

.field private i:I

.field private j:I

.field private k:I

.field private l:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LZ/b$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LZ/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LZ/b;->m:LZ/b$a;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, LZ/b;->n:I

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(LY/s;LZ/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LZ/b;->a:LY/s;

    .line 5
    .line 6
    iput-object p2, p0, LZ/b;->b:LZ/a;

    .line 7
    .line 8
    new-instance p1, LY/i0;

    .line 9
    .line 10
    invoke-direct {p1}, LY/i0;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, LZ/b;->d:LY/i0;

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    iput-boolean p1, p0, LZ/b;->e:Z

    .line 17
    .line 18
    const/4 p2, 0x0

    .line 19
    invoke-static {p2, p1, p2}, LY/g2;->c(Ljava/util/ArrayList;ILkotlin/jvm/internal/DefaultConstructorMarker;)Ljava/util/ArrayList;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, LZ/b;->h:Ljava/util/ArrayList;

    .line 24
    .line 25
    const/4 p1, -0x1

    .line 26
    iput p1, p0, LZ/b;->i:I

    .line 27
    .line 28
    iput p1, p0, LZ/b;->j:I

    .line 29
    .line 30
    iput p1, p0, LZ/b;->k:I

    .line 31
    .line 32
    return-void
.end method

.method private final B()V
    .locals 0

    .line 1
    invoke-direct {p0}, LZ/b;->C()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final C()V
    .locals 2

    .line 1
    iget v0, p0, LZ/b;->g:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, LZ/b;->b:LZ/a;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, LZ/a;->J(I)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput v0, p0, LZ/b;->g:I

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, LZ/b;->h:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-static {v0}, LY/g2;->f(Ljava/util/ArrayList;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, LZ/b;->b:LZ/a;

    .line 22
    .line 23
    iget-object v1, p0, LZ/b;->h:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-static {v1}, LY/g2;->k(Ljava/util/ArrayList;)[Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v0, v1}, LZ/a;->k([Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, LZ/b;->h:Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-static {v0}, LY/g2;->a(Ljava/util/ArrayList;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    return-void
.end method

.method private final D()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x0

    .line 4
    invoke-static {p0, v2, v0, v1}, LZ/b;->J(LZ/b;ZILjava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LZ/b;->L()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private final E(Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LZ/b;->I(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static synthetic F(LZ/b;ZILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1}, LZ/b;->E(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private final G(III)V
    .locals 1

    .line 1
    invoke-direct {p0}, LZ/b;->B()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LZ/b;->b:LZ/a;

    .line 5
    .line 6
    invoke-virtual {v0, p1, p2, p3}, LZ/a;->v(III)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private final H()V
    .locals 4

    .line 1
    iget v0, p0, LZ/b;->l:I

    .line 2
    .line 3
    if-lez v0, :cond_1

    .line 4
    .line 5
    iget v1, p0, LZ/b;->i:I

    .line 6
    .line 7
    const/4 v2, -0x1

    .line 8
    if-ltz v1, :cond_0

    .line 9
    .line 10
    invoke-direct {p0, v1, v0}, LZ/b;->K(II)V

    .line 11
    .line 12
    .line 13
    iput v2, p0, LZ/b;->i:I

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget v1, p0, LZ/b;->k:I

    .line 17
    .line 18
    iget v3, p0, LZ/b;->j:I

    .line 19
    .line 20
    invoke-direct {p0, v1, v3, v0}, LZ/b;->G(III)V

    .line 21
    .line 22
    .line 23
    iput v2, p0, LZ/b;->j:I

    .line 24
    .line 25
    iput v2, p0, LZ/b;->k:I

    .line 26
    .line 27
    :goto_0
    const/4 v0, 0x0

    .line 28
    iput v0, p0, LZ/b;->l:I

    .line 29
    .line 30
    :cond_1
    return-void
.end method

.method private final I(Z)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-direct {p0}, LZ/b;->r()LY/D1;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, LY/D1;->u()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-direct {p0}, LZ/b;->r()LY/D1;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, LY/D1;->k()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    :goto_0
    iget v0, p0, LZ/b;->f:I

    .line 21
    .line 22
    sub-int v0, p1, v0

    .line 23
    .line 24
    if-ltz v0, :cond_1

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    const/4 v1, 0x0

    .line 29
    :goto_1
    if-nez v1, :cond_2

    .line 30
    .line 31
    const-string v1, "Tried to seek backward"

    .line 32
    .line 33
    invoke-static {v1}, LY/w;->t(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :cond_2
    if-lez v0, :cond_3

    .line 37
    .line 38
    iget-object v1, p0, LZ/b;->b:LZ/a;

    .line 39
    .line 40
    invoke-virtual {v1, v0}, LZ/a;->e(I)V

    .line 41
    .line 42
    .line 43
    iput p1, p0, LZ/b;->f:I

    .line 44
    .line 45
    :cond_3
    return-void
.end method

.method static synthetic J(LZ/b;ZILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1}, LZ/b;->I(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private final K(II)V
    .locals 1

    .line 1
    invoke-direct {p0}, LZ/b;->B()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LZ/b;->b:LZ/a;

    .line 5
    .line 6
    invoke-virtual {v0, p1, p2}, LZ/a;->z(II)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private final l(LY/b;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x1

    .line 4
    invoke-static {p0, v1, v2, v0}, LZ/b;->F(LZ/b;ZILjava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, LZ/b;->b:LZ/a;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, LZ/a;->p(LY/b;)V

    .line 10
    .line 11
    .line 12
    iput-boolean v2, p0, LZ/b;->c:Z

    .line 13
    .line 14
    return-void
.end method

.method private final m()V
    .locals 3

    .line 1
    iget-boolean v0, p0, LZ/b;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, LZ/b;->e:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    const/4 v1, 0x0

    .line 11
    const/4 v2, 0x1

    .line 12
    invoke-static {p0, v0, v2, v1}, LZ/b;->F(LZ/b;ZILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, LZ/b;->b:LZ/a;

    .line 16
    .line 17
    invoke-virtual {v0}, LZ/a;->q()V

    .line 18
    .line 19
    .line 20
    iput-boolean v2, p0, LZ/b;->c:Z

    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method private final r()LY/D1;
    .locals 1

    .line 1
    iget-object v0, p0, LZ/b;->a:LY/s;

    .line 2
    .line 3
    invoke-virtual {v0}, LY/s;->M0()LY/D1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method


# virtual methods
.method public final A()V
    .locals 1

    .line 1
    invoke-direct {p0}, LZ/b;->H()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LZ/b;->h:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-static {v0}, LY/g2;->f(Ljava/util/ArrayList;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, LZ/b;->h:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-static {v0}, LY/g2;->i(Ljava/util/ArrayList;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget v0, p0, LZ/b;->g:I

    .line 19
    .line 20
    add-int/lit8 v0, v0, 0x1

    .line 21
    .line 22
    iput v0, p0, LZ/b;->g:I

    .line 23
    .line 24
    return-void
.end method

.method public final L()V
    .locals 4

    .line 1
    invoke-direct {p0}, LZ/b;->r()LY/D1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LY/D1;->x()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-lez v0, :cond_0

    .line 10
    .line 11
    invoke-direct {p0}, LZ/b;->r()LY/D1;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, LY/D1;->u()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iget-object v2, p0, LZ/b;->d:LY/i0;

    .line 20
    .line 21
    const/4 v3, -0x2

    .line 22
    invoke-virtual {v2, v3}, LY/i0;->f(I)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eq v2, v1, :cond_0

    .line 27
    .line 28
    invoke-direct {p0}, LZ/b;->m()V

    .line 29
    .line 30
    .line 31
    if-lez v1, :cond_0

    .line 32
    .line 33
    invoke-virtual {v0, v1}, LY/D1;->a(I)LY/b;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iget-object v2, p0, LZ/b;->d:LY/i0;

    .line 38
    .line 39
    invoke-virtual {v2, v1}, LY/i0;->h(I)V

    .line 40
    .line 41
    .line 42
    invoke-direct {p0, v0}, LZ/b;->l(LY/b;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    return-void
.end method

.method public final M()V
    .locals 1

    .line 1
    invoke-direct {p0}, LZ/b;->C()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, LZ/b;->c:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, LZ/b;->W()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, LZ/b;->k()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final N(LY/w1;)V
    .locals 1

    .line 1
    iget-object v0, p0, LZ/b;->b:LZ/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LZ/a;->w(LY/w1;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final O(LY/f1;)V
    .locals 1

    .line 1
    iget-object v0, p0, LZ/b;->b:LZ/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LZ/a;->x(LY/f1;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final P()V
    .locals 2

    .line 1
    invoke-direct {p0}, LZ/b;->D()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LZ/b;->b:LZ/a;

    .line 5
    .line 6
    invoke-virtual {v0}, LZ/a;->y()V

    .line 7
    .line 8
    .line 9
    iget v0, p0, LZ/b;->f:I

    .line 10
    .line 11
    invoke-direct {p0}, LZ/b;->r()LY/D1;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, LY/D1;->p()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    add-int/2addr v0, v1

    .line 20
    iput v0, p0, LZ/b;->f:I

    .line 21
    .line 22
    return-void
.end method

.method public final Q(II)V
    .locals 2

    .line 1
    if-lez p2, :cond_3

    .line 2
    .line 3
    if-ltz p1, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    if-nez v0, :cond_1

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v1, "Invalid remove index "

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0}, LY/w;->t(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    iget v0, p0, LZ/b;->i:I

    .line 31
    .line 32
    if-ne v0, p1, :cond_2

    .line 33
    .line 34
    iget p1, p0, LZ/b;->l:I

    .line 35
    .line 36
    add-int/2addr p1, p2

    .line 37
    iput p1, p0, LZ/b;->l:I

    .line 38
    .line 39
    return-void

    .line 40
    :cond_2
    invoke-direct {p0}, LZ/b;->H()V

    .line 41
    .line 42
    .line 43
    iput p1, p0, LZ/b;->i:I

    .line 44
    .line 45
    iput p2, p0, LZ/b;->l:I

    .line 46
    .line 47
    :cond_3
    return-void
.end method

.method public final R()V
    .locals 1

    .line 1
    iget-object v0, p0, LZ/b;->b:LZ/a;

    .line 2
    .line 3
    invoke-virtual {v0}, LZ/a;->A()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final S()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, LZ/b;->c:Z

    .line 3
    .line 4
    iget-object v1, p0, LZ/b;->d:LY/i0;

    .line 5
    .line 6
    invoke-virtual {v1}, LY/i0;->a()V

    .line 7
    .line 8
    .line 9
    iput v0, p0, LZ/b;->f:I

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    iput-boolean v1, p0, LZ/b;->e:Z

    .line 13
    .line 14
    iput v0, p0, LZ/b;->g:I

    .line 15
    .line 16
    iget-object v1, p0, LZ/b;->h:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-static {v1}, LY/g2;->a(Ljava/util/ArrayList;)V

    .line 19
    .line 20
    .line 21
    const/4 v1, -0x1

    .line 22
    iput v1, p0, LZ/b;->i:I

    .line 23
    .line 24
    iput v1, p0, LZ/b;->j:I

    .line 25
    .line 26
    iput v1, p0, LZ/b;->k:I

    .line 27
    .line 28
    iput v0, p0, LZ/b;->l:I

    .line 29
    .line 30
    return-void
.end method

.method public final T(LZ/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, LZ/b;->b:LZ/a;

    .line 2
    .line 3
    return-void
.end method

.method public final U(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LZ/b;->e:Z

    .line 2
    .line 3
    return-void
.end method

.method public final V(Lie/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, LZ/b;->b:LZ/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LZ/a;->B(Lie/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final W()V
    .locals 1

    .line 1
    iget-object v0, p0, LZ/b;->b:LZ/a;

    .line 2
    .line 3
    invoke-virtual {v0}, LZ/a;->C()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final X(LY/f1;)V
    .locals 1

    .line 1
    iget-object v0, p0, LZ/b;->b:LZ/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LZ/a;->D(LY/f1;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final Y(I)V
    .locals 1

    .line 1
    if-lez p1, :cond_0

    .line 2
    .line 3
    invoke-direct {p0}, LZ/b;->D()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LZ/b;->b:LZ/a;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, LZ/a;->E(I)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final Z(Ljava/lang/Object;LY/b;I)V
    .locals 1

    .line 1
    iget-object v0, p0, LZ/b;->b:LZ/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, LZ/a;->F(Ljava/lang/Object;LY/b;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final a(LY/b;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, LZ/b;->b:LZ/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LZ/a;->f(LY/b;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final a0(Ljava/lang/Object;)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x0

    .line 4
    invoke-static {p0, v2, v0, v1}, LZ/b;->F(LZ/b;ZILjava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, LZ/b;->b:LZ/a;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, LZ/a;->G(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final b(Ljava/util/List;Lg0/k;)V
    .locals 1

    .line 1
    iget-object v0, p0, LZ/b;->b:LZ/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LZ/a;->g(Ljava/util/List;Lg0/k;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final b0(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    .locals 1

    .line 1
    invoke-direct {p0}, LZ/b;->B()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LZ/b;->b:LZ/a;

    .line 5
    .line 6
    invoke-virtual {v0, p1, p2}, LZ/a;->H(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final c(LY/x0;LY/y;LY/y0;LY/y0;)V
    .locals 1

    .line 1
    iget-object v0, p0, LZ/b;->b:LZ/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, LZ/a;->h(LY/x0;LY/y;LY/y0;LY/y0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final c0(Ljava/lang/Object;I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, LZ/b;->E(Z)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, LZ/b;->b:LZ/a;

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2}, LZ/a;->I(Ljava/lang/Object;I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final d()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x0

    .line 4
    invoke-static {p0, v2, v0, v1}, LZ/b;->F(LZ/b;ZILjava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, LZ/b;->b:LZ/a;

    .line 8
    .line 9
    invoke-virtual {v0}, LZ/a;->i()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final d0(Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-direct {p0}, LZ/b;->B()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LZ/b;->b:LZ/a;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, LZ/a;->K(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final e(Lg0/k;LY/b;)V
    .locals 1

    .line 1
    invoke-direct {p0}, LZ/b;->C()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LZ/b;->b:LZ/a;

    .line 5
    .line 6
    invoke-virtual {v0, p1, p2}, LZ/a;->j(Lg0/k;LY/b;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final f(Lkotlin/jvm/functions/Function1;LY/x;)V
    .locals 1

    .line 1
    iget-object v0, p0, LZ/b;->b:LZ/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LZ/a;->l(Lkotlin/jvm/functions/Function1;LY/x;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final g()V
    .locals 5

    .line 1
    invoke-direct {p0}, LZ/b;->r()LY/D1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LY/D1;->u()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object v1, p0, LZ/b;->d:LY/i0;

    .line 10
    .line 11
    const/4 v2, -0x1

    .line 12
    invoke-virtual {v1, v2}, LY/i0;->f(I)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v4, 0x1

    .line 18
    if-gt v1, v0, :cond_0

    .line 19
    .line 20
    move v1, v4

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v1, v3

    .line 23
    :goto_0
    if-nez v1, :cond_1

    .line 24
    .line 25
    const-string v1, "Missed recording an endGroup"

    .line 26
    .line 27
    invoke-static {v1}, LY/w;->t(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    iget-object v1, p0, LZ/b;->d:LY/i0;

    .line 31
    .line 32
    invoke-virtual {v1, v2}, LY/i0;->f(I)I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-ne v1, v0, :cond_2

    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    invoke-static {p0, v3, v4, v0}, LZ/b;->F(LZ/b;ZILjava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, LZ/b;->d:LY/i0;

    .line 43
    .line 44
    invoke-virtual {v0}, LY/i0;->g()I

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, LZ/b;->b:LZ/a;

    .line 48
    .line 49
    invoke-virtual {v0}, LZ/a;->m()V

    .line 50
    .line 51
    .line 52
    :cond_2
    return-void
.end method

.method public final h()V
    .locals 1

    .line 1
    iget-object v0, p0, LZ/b;->b:LZ/a;

    .line 2
    .line 3
    invoke-virtual {v0}, LZ/a;->n()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput v0, p0, LZ/b;->f:I

    .line 8
    .line 9
    return-void
.end method

.method public final i()V
    .locals 0

    .line 1
    invoke-direct {p0}, LZ/b;->H()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final j(LY/f1;)V
    .locals 1

    .line 1
    iget-object v0, p0, LZ/b;->b:LZ/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LZ/a;->o(LY/f1;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final k()V
    .locals 3

    .line 1
    iget-boolean v0, p0, LZ/b;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    const/4 v1, 0x1

    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-static {p0, v0, v1, v2}, LZ/b;->F(LZ/b;ZILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0, v0, v1, v2}, LZ/b;->F(LZ/b;ZILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, LZ/b;->b:LZ/a;

    .line 15
    .line 16
    invoke-virtual {v1}, LZ/a;->m()V

    .line 17
    .line 18
    .line 19
    iput-boolean v0, p0, LZ/b;->c:Z

    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public final n()V
    .locals 1

    .line 1
    invoke-direct {p0}, LZ/b;->C()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LZ/b;->d:LY/i0;

    .line 5
    .line 6
    iget v0, v0, LY/i0;->b:I

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    if-nez v0, :cond_1

    .line 14
    .line 15
    const-string v0, "Missed recording an endGroup()"

    .line 16
    .line 17
    invoke-static {v0}, LY/w;->t(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    return-void
.end method

.method public final o()LZ/a;
    .locals 1

    .line 1
    iget-object v0, p0, LZ/b;->b:LZ/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final p()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LZ/b;->e:Z

    .line 2
    .line 3
    return v0
.end method

.method public final q()Z
    .locals 2

    .line 1
    invoke-direct {p0}, LZ/b;->r()LY/D1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LY/D1;->u()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget v1, p0, LZ/b;->f:I

    .line 10
    .line 11
    sub-int/2addr v0, v1

    .line 12
    if-gez v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    return v0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    return v0
.end method

.method public final s(LZ/a;Lg0/k;)V
    .locals 1

    .line 1
    iget-object v0, p0, LZ/b;->b:LZ/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LZ/a;->r(LZ/a;Lg0/k;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final t(LY/b;LY/E1;)V
    .locals 1

    .line 1
    invoke-direct {p0}, LZ/b;->C()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, LZ/b;->D()V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, LZ/b;->H()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, LZ/b;->b:LZ/a;

    .line 11
    .line 12
    invoke-virtual {v0, p1, p2}, LZ/a;->s(LY/b;LY/E1;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final u(LY/b;LY/E1;LZ/c;)V
    .locals 1

    .line 1
    invoke-direct {p0}, LZ/b;->C()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, LZ/b;->D()V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, LZ/b;->H()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, LZ/b;->b:LZ/a;

    .line 11
    .line 12
    invoke-virtual {v0, p1, p2, p3}, LZ/a;->t(LY/b;LY/E1;LZ/c;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final v(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, LZ/b;->D()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LZ/b;->b:LZ/a;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, LZ/a;->u(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final w(Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-direct {p0}, LZ/b;->H()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LZ/b;->h:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-static {v0, p1}, LY/g2;->j(Ljava/util/ArrayList;Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final x(III)V
    .locals 3

    .line 1
    if-lez p3, :cond_1

    .line 2
    .line 3
    iget v0, p0, LZ/b;->l:I

    .line 4
    .line 5
    if-lez v0, :cond_0

    .line 6
    .line 7
    iget v1, p0, LZ/b;->j:I

    .line 8
    .line 9
    sub-int v2, p1, v0

    .line 10
    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    iget v1, p0, LZ/b;->k:I

    .line 14
    .line 15
    sub-int v2, p2, v0

    .line 16
    .line 17
    if-ne v1, v2, :cond_0

    .line 18
    .line 19
    add-int/2addr v0, p3

    .line 20
    iput v0, p0, LZ/b;->l:I

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    invoke-direct {p0}, LZ/b;->H()V

    .line 24
    .line 25
    .line 26
    iput p1, p0, LZ/b;->j:I

    .line 27
    .line 28
    iput p2, p0, LZ/b;->k:I

    .line 29
    .line 30
    iput p3, p0, LZ/b;->l:I

    .line 31
    .line 32
    :cond_1
    return-void
.end method

.method public final y(I)V
    .locals 2

    .line 1
    iget v0, p0, LZ/b;->f:I

    .line 2
    .line 3
    invoke-direct {p0}, LZ/b;->r()LY/D1;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, LY/D1;->k()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    sub-int/2addr p1, v1

    .line 12
    add-int/2addr v0, p1

    .line 13
    iput v0, p0, LZ/b;->f:I

    .line 14
    .line 15
    return-void
.end method

.method public final z(I)V
    .locals 0

    .line 1
    iput p1, p0, LZ/b;->f:I

    .line 2
    .line 3
    return-void
.end method
