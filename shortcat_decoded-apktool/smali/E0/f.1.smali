.class public abstract LE0/f;
.super Landroidx/compose/ui/e$c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LK0/I0;
.implements LK0/v0;
.implements LK0/h;


# instance fields
.field private a:LE0/x;

.field private b:Z

.field private c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(LE0/x;ZLK0/s;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    .line 3
    iput-object p1, p0, LE0/f;->a:LE0/x;

    .line 4
    iput-boolean p2, p0, LE0/f;->b:Z

    return-void
.end method

.method public synthetic constructor <init>(LE0/x;ZLK0/s;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 1
    :cond_1
    invoke-direct {p0, p1, p2, p3}, LE0/f;-><init>(LE0/x;ZLK0/s;)V

    return-void
.end method

.method public static final synthetic E1(LE0/f;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, LE0/f;->c:Z

    .line 2
    .line 3
    return p0
.end method

.method private final F1()V
    .locals 1

    .line 1
    invoke-direct {p0}, LE0/f;->L1()LE0/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, LE0/f;->a:LE0/x;

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, LE0/f;->a:LE0/x;

    .line 12
    .line 13
    :cond_1
    invoke-virtual {p0, v0}, LE0/f;->G1(LE0/x;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method private final H1()V
    .locals 2

    .line 1
    new-instance v0, Lkotlin/jvm/internal/N;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlin/jvm/internal/N;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, LE0/f$a;

    .line 7
    .line 8
    invoke-direct {v1, v0}, LE0/f$a;-><init>(Lkotlin/jvm/internal/N;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0, v1}, LK0/J0;->d(LK0/I0;Lkotlin/jvm/functions/Function1;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, LE0/f;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-direct {v0}, LE0/f;->F1()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    invoke-virtual {p0, v0}, LE0/f;->G1(LE0/x;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method private final I1()V
    .locals 1

    .line 1
    iget-boolean v0, p0, LE0/f;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-boolean v0, p0, LE0/f;->b:Z

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    invoke-direct {p0}, LE0/f;->K1()LE0/f;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    move-object v0, p0

    .line 18
    :goto_0
    invoke-direct {v0}, LE0/f;->F1()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method private final J1()V
    .locals 2

    .line 1
    new-instance v0, Lkotlin/jvm/internal/J;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlin/jvm/internal/J;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    iput-boolean v1, v0, Lkotlin/jvm/internal/J;->a:Z

    .line 8
    .line 9
    iget-boolean v1, p0, LE0/f;->b:Z

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    new-instance v1, LE0/f$b;

    .line 14
    .line 15
    invoke-direct {v1, v0}, LE0/f$b;-><init>(Lkotlin/jvm/internal/J;)V

    .line 16
    .line 17
    .line 18
    invoke-static {p0, v1}, LK0/J0;->f(LK0/I0;Lkotlin/jvm/functions/Function1;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    iget-boolean v0, v0, Lkotlin/jvm/internal/J;->a:Z

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-direct {p0}, LE0/f;->F1()V

    .line 26
    .line 27
    .line 28
    :cond_1
    return-void
.end method

.method private final K1()LE0/f;
    .locals 2

    .line 1
    new-instance v0, Lkotlin/jvm/internal/N;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlin/jvm/internal/N;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, LE0/f$c;

    .line 7
    .line 8
    invoke-direct {v1, v0}, LE0/f$c;-><init>(Lkotlin/jvm/internal/N;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0, v1}, LK0/J0;->f(LK0/I0;Lkotlin/jvm/functions/Function1;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, LE0/f;

    .line 17
    .line 18
    return-object v0
.end method

.method private final L1()LE0/f;
    .locals 2

    .line 1
    new-instance v0, Lkotlin/jvm/internal/N;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlin/jvm/internal/N;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, LE0/f$d;

    .line 7
    .line 8
    invoke-direct {v1, v0}, LE0/f$d;-><init>(Lkotlin/jvm/internal/N;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0, v1}, LK0/J0;->d(LK0/I0;Lkotlin/jvm/functions/Function1;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, LE0/f;

    .line 17
    .line 18
    return-object v0
.end method

.method private final P1()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LE0/f;->c:Z

    .line 3
    .line 4
    invoke-direct {p0}, LE0/f;->J1()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private final Q1()V
    .locals 1

    .line 1
    iget-boolean v0, p0, LE0/f;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, LE0/f;->c:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-direct {p0}, LE0/f;->H1()V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method


# virtual methods
.method public G0()J
    .locals 2

    .line 1
    sget-object v0, LK0/F0;->a:LK0/F0$a;

    .line 2
    .line 3
    invoke-virtual {v0}, LK0/F0$a;->b()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public abstract G1(LE0/x;)V
.end method

.method public final M1()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LE0/f;->b:Z

    .line 2
    .line 3
    return v0
.end method

.method protected final N1()LE0/z;
    .locals 1

    .line 1
    invoke-static {}, Landroidx/compose/ui/platform/w0;->l()LY/b1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0, v0}, LK0/i;->a(LK0/h;LY/D;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, LE0/z;

    .line 10
    .line 11
    return-object v0
.end method

.method public abstract O1(I)Z
.end method

.method public final R1(LE0/x;)V
    .locals 1

    .line 1
    iget-object v0, p0, LE0/f;->a:LE0/x;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iput-object p1, p0, LE0/f;->a:LE0/x;

    .line 10
    .line 11
    iget-boolean p1, p0, LE0/f;->c:Z

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    invoke-direct {p0}, LE0/f;->J1()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public S(LE0/q;LE0/s;J)V
    .locals 1

    .line 1
    sget-object p3, LE0/s;->b:LE0/s;

    .line 2
    .line 3
    if-ne p2, p3, :cond_2

    .line 4
    .line 5
    invoke-virtual {p1}, LE0/q;->c()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 10
    .line 11
    .line 12
    move-result p3

    .line 13
    const/4 p4, 0x0

    .line 14
    :goto_0
    if-ge p4, p3, :cond_2

    .line 15
    .line 16
    invoke-interface {p2, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, LE0/C;

    .line 21
    .line 22
    invoke-virtual {v0}, LE0/C;->n()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    invoke-virtual {p0, v0}, LE0/f;->O1(I)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    invoke-virtual {p1}, LE0/q;->f()I

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    sget-object p3, LE0/u;->a:LE0/u$a;

    .line 37
    .line 38
    invoke-virtual {p3}, LE0/u$a;->a()I

    .line 39
    .line 40
    .line 41
    move-result p4

    .line 42
    invoke-static {p2, p4}, LE0/u;->i(II)Z

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    if-eqz p2, :cond_0

    .line 47
    .line 48
    invoke-direct {p0}, LE0/f;->P1()V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_0
    invoke-virtual {p1}, LE0/q;->f()I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    invoke-virtual {p3}, LE0/u$a;->b()I

    .line 57
    .line 58
    .line 59
    move-result p2

    .line 60
    invoke-static {p1, p2}, LE0/u;->i(II)Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-eqz p1, :cond_2

    .line 65
    .line 66
    invoke-direct {p0}, LE0/f;->Q1()V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_1
    add-int/lit8 p4, p4, 0x1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_2
    return-void
.end method

.method public final S1(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, LE0/f;->b:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_1

    .line 4
    .line 5
    iput-boolean p1, p0, LE0/f;->b:Z

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-boolean p1, p0, LE0/f;->c:Z

    .line 10
    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    invoke-direct {p0}, LE0/f;->F1()V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iget-boolean p1, p0, LE0/f;->c:Z

    .line 18
    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    invoke-direct {p0}, LE0/f;->I1()V

    .line 22
    .line 23
    .line 24
    :cond_1
    return-void
.end method

.method public a1()V
    .locals 0

    .line 1
    invoke-direct {p0}, LE0/f;->Q1()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onDetach()V
    .locals 0

    .line 1
    invoke-direct {p0}, LE0/f;->Q1()V

    .line 2
    .line 3
    .line 4
    invoke-super {p0}, Landroidx/compose/ui/e$c;->onDetach()V

    .line 5
    .line 6
    .line 7
    return-void
.end method
