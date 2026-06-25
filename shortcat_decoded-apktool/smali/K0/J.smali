.class public final LK0/J;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LY/i;
.implements LI0/K;
.implements LK0/q0;
.implements LI0/t;
.implements LR0/n;
.implements LK0/g;
.implements LK0/p0$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LK0/J$d;,
        LK0/J$e;,
        LK0/J$f;,
        LK0/J$g;,
        LK0/J$h;
    }
.end annotation


# static fields
.field public static final r0:LK0/J$d;

.field public static final s0:I

.field private static final t0:LK0/J$f;

.field private static final u0:Lie/a;

.field private static final v0:Landroidx/compose/ui/platform/A1;

.field private static final w0:Ljava/util/Comparator;


# instance fields
.field private A:Li1/t;

.field private B:Landroidx/compose/ui/platform/A1;

.field private C:LY/I;

.field private D:LK0/J$g;

.field private E:LK0/J$g;

.field private F:Z

.field private final G:LK0/c0;

.field private final H:LK0/O;

.field private I:Landroidx/compose/ui/layout/j;

.field private X:LK0/e0;

.field private Y:Z

.field private Z:Landroidx/compose/ui/e;

.field private final a:Z

.field private b:I

.field private c:J

.field private d:J

.field private e:J

.field private f:Z

.field private g:I

.field private h:Z

.field private i:LK0/J;

.field private j:I

.field private final k:LK0/a0;

.field private l:La0/c;

.field private l0:Landroidx/compose/ui/e;

.field private m:Z

.field private m0:Lkotlin/jvm/functions/Function1;

.field private n:LK0/J;

.field private n0:Lkotlin/jvm/functions/Function1;

.field private o:LK0/p0;

.field private o0:Z

.field private p:Landroidx/compose/ui/viewinterop/b;

.field private p0:I

.field private q:I

.field private q0:Z

.field private r:Z

.field private s:Z

.field private t:Landroidx/compose/ui/semantics/SemanticsConfiguration;

.field private u:Z

.field private final v:La0/c;

.field private w:Z

.field private x:LI0/B;

.field private y:LK0/A;

.field private z:Li1/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LK0/J$d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LK0/J$d;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LK0/J;->r0:LK0/J$d;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, LK0/J;->s0:I

    .line 12
    .line 13
    new-instance v0, LK0/J$c;

    .line 14
    .line 15
    invoke-direct {v0}, LK0/J$c;-><init>()V

    .line 16
    .line 17
    .line 18
    sput-object v0, LK0/J;->t0:LK0/J$f;

    .line 19
    .line 20
    sget-object v0, LK0/J$a;->a:LK0/J$a;

    .line 21
    .line 22
    sput-object v0, LK0/J;->u0:Lie/a;

    .line 23
    .line 24
    new-instance v0, LK0/J$b;

    .line 25
    .line 26
    invoke-direct {v0}, LK0/J$b;-><init>()V

    .line 27
    .line 28
    .line 29
    sput-object v0, LK0/J;->v0:Landroidx/compose/ui/platform/A1;

    .line 30
    .line 31
    new-instance v0, LK0/I;

    .line 32
    .line 33
    invoke-direct {v0}, LK0/I;-><init>()V

    .line 34
    .line 35
    .line 36
    sput-object v0, LK0/J;->w0:Ljava/util/Comparator;

    .line 37
    .line 38
    return-void
.end method

.method public constructor <init>(ZI)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, LK0/J;->a:Z

    .line 3
    iput p2, p0, LK0/J;->b:I

    .line 4
    sget-object p1, Li1/n;->b:Li1/n$a;

    invoke-virtual {p1}, Li1/n$a;->a()J

    move-result-wide v0

    iput-wide v0, p0, LK0/J;->c:J

    .line 5
    sget-object p2, Li1/r;->b:Li1/r$a;

    invoke-virtual {p2}, Li1/r$a;->a()J

    move-result-wide v0

    iput-wide v0, p0, LK0/J;->d:J

    .line 6
    invoke-virtual {p1}, Li1/n$a;->a()J

    move-result-wide p1

    iput-wide p1, p0, LK0/J;->e:J

    const/4 p1, 0x1

    .line 7
    iput-boolean p1, p0, LK0/J;->f:Z

    .line 8
    new-instance p2, LK0/a0;

    .line 9
    new-instance v0, La0/c;

    const/16 v1, 0x10

    new-array v2, v1, [LK0/J;

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 10
    new-instance v2, LK0/J$i;

    invoke-direct {v2, p0}, LK0/J$i;-><init>(LK0/J;)V

    invoke-direct {p2, v0, v2}, LK0/a0;-><init>(La0/c;Lie/a;)V

    iput-object p2, p0, LK0/J;->k:LK0/a0;

    .line 11
    new-instance p2, La0/c;

    new-array v0, v1, [LK0/J;

    invoke-direct {p2, v0, v3}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 12
    iput-object p2, p0, LK0/J;->v:La0/c;

    .line 13
    iput-boolean p1, p0, LK0/J;->w:Z

    .line 14
    sget-object p2, LK0/J;->t0:LK0/J$f;

    iput-object p2, p0, LK0/J;->x:LI0/B;

    .line 15
    invoke-static {}, LK0/N;->a()Li1/d;

    move-result-object p2

    iput-object p2, p0, LK0/J;->z:Li1/d;

    .line 16
    sget-object p2, Li1/t;->a:Li1/t;

    iput-object p2, p0, LK0/J;->A:Li1/t;

    .line 17
    sget-object p2, LK0/J;->v0:Landroidx/compose/ui/platform/A1;

    iput-object p2, p0, LK0/J;->B:Landroidx/compose/ui/platform/A1;

    .line 18
    sget-object p2, LY/I;->Q:LY/I$a;

    invoke-virtual {p2}, LY/I$a;->a()LY/I;

    move-result-object p2

    iput-object p2, p0, LK0/J;->C:LY/I;

    .line 19
    sget-object p2, LK0/J$g;->c:LK0/J$g;

    iput-object p2, p0, LK0/J;->D:LK0/J$g;

    .line 20
    iput-object p2, p0, LK0/J;->E:LK0/J$g;

    .line 21
    new-instance p2, LK0/c0;

    invoke-direct {p2, p0}, LK0/c0;-><init>(LK0/J;)V

    iput-object p2, p0, LK0/J;->G:LK0/c0;

    .line 22
    new-instance p2, LK0/O;

    invoke-direct {p2, p0}, LK0/O;-><init>(LK0/J;)V

    iput-object p2, p0, LK0/J;->H:LK0/O;

    .line 23
    iput-boolean p1, p0, LK0/J;->Y:Z

    .line 24
    sget-object p1, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    iput-object p1, p0, LK0/J;->Z:Landroidx/compose/ui/e;

    return-void
.end method

.method public synthetic constructor <init>(ZIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    .line 25
    invoke-static {}, LR0/r;->d()I

    move-result p2

    .line 26
    :cond_1
    invoke-direct {p0, p1, p2}, LK0/J;-><init>(ZI)V

    return-void
.end method

.method private final B()Landroidx/compose/ui/semantics/SemanticsConfiguration;
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LK0/J;->u:Z

    .line 3
    .line 4
    new-instance v0, Lkotlin/jvm/internal/N;

    .line 5
    .line 6
    invoke-direct {v0}, Lkotlin/jvm/internal/N;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v1, Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 10
    .line 11
    invoke-direct {v1}, Landroidx/compose/ui/semantics/SemanticsConfiguration;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v1, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 15
    .line 16
    invoke-static {p0}, LK0/N;->b(LK0/J;)LK0/p0;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-interface {v1}, LK0/p0;->getSnapshotObserver()LK0/r0;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    new-instance v2, LK0/J$j;

    .line 25
    .line 26
    invoke-direct {v2, p0, v0}, LK0/J$j;-><init>(LK0/J;Lkotlin/jvm/internal/N;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, p0, v2}, LK0/r0;->j(LK0/J;Lie/a;)V

    .line 30
    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    iput-boolean v1, p0, LK0/J;->u:Z

    .line 34
    .line 35
    iget-object v0, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 38
    .line 39
    return-object v0
.end method

.method public static synthetic C1(LK0/J;ZILjava/lang/Object;)V
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
    invoke-virtual {p0, p1}, LK0/J;->B1(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private final D()V
    .locals 6

    .line 1
    iget-object v0, p0, LK0/J;->D:LK0/J$g;

    .line 2
    .line 3
    iput-object v0, p0, LK0/J;->E:LK0/J$g;

    .line 4
    .line 5
    sget-object v0, LK0/J$g;->c:LK0/J$g;

    .line 6
    .line 7
    iput-object v0, p0, LK0/J;->D:LK0/J$g;

    .line 8
    .line 9
    invoke-virtual {p0}, LK0/J;->I0()La0/c;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, v0, La0/c;->a:[Ljava/lang/Object;

    .line 14
    .line 15
    invoke-virtual {v0}, La0/c;->p()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v2, 0x0

    .line 20
    :goto_0
    if-ge v2, v0, :cond_1

    .line 21
    .line 22
    aget-object v3, v1, v2

    .line 23
    .line 24
    check-cast v3, LK0/J;

    .line 25
    .line 26
    iget-object v4, v3, LK0/J;->D:LK0/J$g;

    .line 27
    .line 28
    sget-object v5, LK0/J$g;->b:LK0/J$g;

    .line 29
    .line 30
    if-ne v4, v5, :cond_0

    .line 31
    .line 32
    invoke-direct {v3}, LK0/J;->D()V

    .line 33
    .line 34
    .line 35
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    return-void
.end method

.method private final D0()Lk0/f;
    .locals 2

    .line 1
    invoke-virtual {p0}, LK0/J;->Q()LY/I;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lk0/j;->c()LY/D;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {v0, v1}, LY/I;->a(LY/D;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lk0/f;

    .line 14
    .line 15
    return-object v0
.end method

.method private final E(I)Ljava/lang/String;
    .locals 7

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    move v2, v1

    .line 8
    :goto_0
    if-ge v2, p1, :cond_0

    .line 9
    .line 10
    const-string v3, "  "

    .line 11
    .line 12
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    add-int/lit8 v2, v2, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-string v2, "|-"

    .line 19
    .line 20
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, LK0/J;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const/16 v2, 0xa

    .line 31
    .line 32
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, LK0/J;->I0()La0/c;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    iget-object v3, v2, La0/c;->a:[Ljava/lang/Object;

    .line 40
    .line 41
    invoke-virtual {v2}, La0/c;->p()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    move v4, v1

    .line 46
    :goto_1
    if-ge v4, v2, :cond_1

    .line 47
    .line 48
    aget-object v5, v3, v4

    .line 49
    .line 50
    check-cast v5, LK0/J;

    .line 51
    .line 52
    add-int/lit8 v6, p1, 0x1

    .line 53
    .line 54
    invoke-direct {v5, v6}, LK0/J;->E(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    add-int/lit8 v4, v4, 0x1

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    if-nez p1, :cond_2

    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    add-int/lit8 p1, p1, -0x1

    .line 75
    .line 76
    invoke-virtual {v0, v1, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    const-string v0, "substring(...)"

    .line 81
    .line 82
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    return-object p1

    .line 86
    :cond_2
    return-object v0
.end method

.method public static synthetic E1(LK0/J;ZZZILjava/lang/Object;)V
    .locals 1

    .line 1
    and-int/lit8 p5, p4, 0x1

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    and-int/lit8 p5, p4, 0x2

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    if-eqz p5, :cond_1

    .line 10
    .line 11
    move p2, v0

    .line 12
    :cond_1
    and-int/lit8 p4, p4, 0x4

    .line 13
    .line 14
    if-eqz p4, :cond_2

    .line 15
    .line 16
    move p3, v0

    .line 17
    :cond_2
    invoke-virtual {p0, p1, p2, p3}, LK0/J;->D1(ZZZ)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method static synthetic F(LK0/J;IILjava/lang/Object;)Ljava/lang/String;
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
    invoke-direct {p0, p1}, LK0/J;->E(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private final G0()F
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/J;->l0()LK0/X;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LK0/X;->U1()F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public static synthetic G1(LK0/J;ZILjava/lang/Object;)V
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
    invoke-virtual {p0, p1}, LK0/J;->F1(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static synthetic I1(LK0/J;ZZZILjava/lang/Object;)V
    .locals 1

    .line 1
    and-int/lit8 p5, p4, 0x1

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    and-int/lit8 p5, p4, 0x2

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    if-eqz p5, :cond_1

    .line 10
    .line 11
    move p2, v0

    .line 12
    :cond_1
    and-int/lit8 p4, p4, 0x4

    .line 13
    .line 14
    if-eqz p4, :cond_2

    .line 15
    .line 16
    move p3, v0

    .line 17
    :cond_2
    invoke-virtual {p0, p1, p2, p3}, LK0/J;->H1(ZZZ)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method private final J(LK0/J;)Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Cannot insert "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string v1, " because it already has a parent or an owner. This tree: "

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    const/4 v2, 0x1

    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-static {p0, v1, v2, v3}, LK0/J;->F(LK0/J;IILjava/lang/Object;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v4, " Other tree: "

    .line 30
    .line 31
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    iget-object p1, p1, LK0/J;->n:LK0/J;

    .line 35
    .line 36
    if-eqz p1, :cond_0

    .line 37
    .line 38
    invoke-static {p1, v1, v2, v3}, LK0/J;->F(LK0/J;IILjava/lang/Object;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    :cond_0
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    return-object p1
.end method

.method private final K1()V
    .locals 1

    .line 1
    iget-object v0, p0, LK0/J;->G:LK0/c0;

    .line 2
    .line 3
    invoke-virtual {v0}, LK0/c0;->y()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic L0(LK0/J;JLK0/w;IZILjava/lang/Object;)V
    .locals 6

    .line 1
    and-int/lit8 p7, p6, 0x4

    .line 2
    .line 3
    if-eqz p7, :cond_0

    .line 4
    .line 5
    sget-object p4, LE0/Q;->a:LE0/Q$a;

    .line 6
    .line 7
    invoke-virtual {p4}, LE0/Q$a;->e()I

    .line 8
    .line 9
    .line 10
    move-result p4

    .line 11
    :cond_0
    move v4, p4

    .line 12
    and-int/lit8 p4, p6, 0x8

    .line 13
    .line 14
    if-eqz p4, :cond_1

    .line 15
    .line 16
    const/4 p5, 0x1

    .line 17
    :cond_1
    move-object v0, p0

    .line 18
    move-wide v1, p1

    .line 19
    move-object v3, p3

    .line 20
    move v5, p5

    .line 21
    invoke-virtual/range {v0 .. v5}, LK0/J;->K0(JLK0/w;IZ)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public static synthetic N0(LK0/J;JLK0/w;IZILjava/lang/Object;)V
    .locals 6

    .line 1
    and-int/lit8 p7, p6, 0x4

    .line 2
    .line 3
    if-eqz p7, :cond_0

    .line 4
    .line 5
    sget-object p4, LE0/Q;->a:LE0/Q$a;

    .line 6
    .line 7
    invoke-virtual {p4}, LE0/Q$a;->d()I

    .line 8
    .line 9
    .line 10
    move-result p4

    .line 11
    :cond_0
    move v4, p4

    .line 12
    and-int/lit8 p4, p6, 0x8

    .line 13
    .line 14
    if-eqz p4, :cond_1

    .line 15
    .line 16
    const/4 p5, 0x1

    .line 17
    :cond_1
    move-object v0, p0

    .line 18
    move-wide v1, p1

    .line 19
    move-object v3, p3

    .line 20
    move v5, p5

    .line 21
    invoke-virtual/range {v0 .. v5}, LK0/J;->M0(JLK0/w;IZ)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method private final T1(LK0/J;)V
    .locals 2

    .line 1
    iget-object v0, p0, LK0/J;->i:LK0/J;

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_2

    .line 8
    .line 9
    iput-object p1, p0, LK0/J;->i:LK0/J;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object p1, p0, LK0/J;->H:LK0/O;

    .line 14
    .line 15
    invoke-virtual {p1}, LK0/O;->a()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, LK0/J;->w0()LK0/e0;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p0}, LK0/J;->X()LK0/e0;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, LK0/e0;->O2()LK0/e0;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :goto_0
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_1

    .line 35
    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    invoke-virtual {p1}, LK0/e0;->x2()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, LK0/e0;->O2()LK0/e0;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    iget-object p1, p0, LK0/J;->H:LK0/O;

    .line 47
    .line 48
    invoke-virtual {p1}, LK0/O;->I()V

    .line 49
    .line 50
    .line 51
    :cond_1
    invoke-virtual {p0}, LK0/J;->R0()V

    .line 52
    .line 53
    .line 54
    :cond_2
    return-void
.end method

.method private final W0()V
    .locals 1

    .line 1
    iget v0, p0, LK0/J;->j:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, LK0/J;->m:Z

    .line 7
    .line 8
    :cond_0
    iget-boolean v0, p0, LK0/J;->a:Z

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, LK0/J;->n:LK0/J;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-direct {v0}, LK0/J;->W0()V

    .line 17
    .line 18
    .line 19
    :cond_1
    return-void
.end method

.method public static synthetic b1(LK0/J;Li1/b;ILjava/lang/Object;)Z
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, LK0/J;->H:LK0/O;

    .line 6
    .line 7
    invoke-virtual {p1}, LK0/O;->k()Li1/b;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    :cond_0
    invoke-virtual {p0, p1}, LK0/J;->a1(Li1/b;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method private final q1(LK0/J;)V
    .locals 4

    .line 1
    iget-object v0, p1, LK0/J;->H:LK0/O;

    .line 2
    .line 3
    invoke-virtual {v0}, LK0/O;->c()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LK0/J;->H:LK0/O;

    .line 10
    .line 11
    invoke-virtual {v0}, LK0/O;->c()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/lit8 v1, v1, -0x1

    .line 16
    .line 17
    invoke-virtual {v0, v1}, LK0/O;->L(I)V

    .line 18
    .line 19
    .line 20
    :cond_0
    iget-object v0, p0, LK0/J;->o:LK0/p0;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {p1}, LK0/J;->G()V

    .line 25
    .line 26
    .line 27
    :cond_1
    const/4 v0, 0x0

    .line 28
    iput-object v0, p1, LK0/J;->n:LK0/J;

    .line 29
    .line 30
    iget v1, p1, LK0/J;->p0:I

    .line 31
    .line 32
    if-lez v1, :cond_2

    .line 33
    .line 34
    iget v1, p0, LK0/J;->p0:I

    .line 35
    .line 36
    add-int/lit8 v1, v1, -0x1

    .line 37
    .line 38
    invoke-virtual {p0, v1}, LK0/J;->O1(I)V

    .line 39
    .line 40
    .line 41
    :cond_2
    invoke-virtual {p1}, LK0/J;->w0()LK0/e0;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v1, v0}, LK0/e0;->w3(LK0/e0;)V

    .line 46
    .line 47
    .line 48
    iget-boolean v1, p1, LK0/J;->a:Z

    .line 49
    .line 50
    if-eqz v1, :cond_3

    .line 51
    .line 52
    iget v1, p0, LK0/J;->j:I

    .line 53
    .line 54
    add-int/lit8 v1, v1, -0x1

    .line 55
    .line 56
    iput v1, p0, LK0/J;->j:I

    .line 57
    .line 58
    iget-object p1, p1, LK0/J;->k:LK0/a0;

    .line 59
    .line 60
    invoke-virtual {p1}, LK0/a0;->c()La0/c;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    iget-object v1, p1, La0/c;->a:[Ljava/lang/Object;

    .line 65
    .line 66
    invoke-virtual {p1}, La0/c;->p()I

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    const/4 v2, 0x0

    .line 71
    :goto_0
    if-ge v2, p1, :cond_3

    .line 72
    .line 73
    aget-object v3, v1, v2

    .line 74
    .line 75
    check-cast v3, LK0/J;

    .line 76
    .line 77
    invoke-virtual {v3}, LK0/J;->w0()LK0/e0;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-virtual {v3, v0}, LK0/e0;->w3(LK0/e0;)V

    .line 82
    .line 83
    .line 84
    add-int/lit8 v2, v2, 0x1

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_3
    invoke-direct {p0}, LK0/J;->W0()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0}, LK0/J;->t1()V

    .line 91
    .line 92
    .line 93
    return-void
.end method

.method public static synthetic r(LK0/J;LK0/J;)I
    .locals 0

    .line 1
    invoke-static {p0, p1}, LK0/J;->s(LK0/J;LK0/J;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private final r1()V
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/J;->R0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LK0/J;->A0()LK0/J;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, LK0/J;->P0()V

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {p0}, LK0/J;->Q0()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method private static final s(LK0/J;LK0/J;)I
    .locals 2

    .line 1
    invoke-direct {p0}, LK0/J;->G0()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-direct {p1}, LK0/J;->G0()F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    cmpg-float v0, v0, v1

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, LK0/J;->B0()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    invoke-virtual {p1}, LK0/J;->B0()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->i(II)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0

    .line 26
    :cond_0
    invoke-direct {p0}, LK0/J;->G0()F

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    invoke-direct {p1}, LK0/J;->G0()F

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    invoke-static {p0, p1}, Ljava/lang/Float;->compare(FF)I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    return p0
.end method

.method public static final synthetic t()Lie/a;
    .locals 1

    .line 1
    sget-object v0, LK0/J;->u0:Lie/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic u()Ljava/util/Comparator;
    .locals 1

    .line 1
    sget-object v0, LK0/J;->w0:Ljava/util/Comparator;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic v(LK0/J;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LK0/J;->r:Z

    .line 2
    .line 3
    return-void
.end method

.method private final v0()LK0/A;
    .locals 2

    .line 1
    iget-object v0, p0, LK0/J;->y:LK0/A;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, LK0/A;

    .line 6
    .line 7
    invoke-virtual {p0}, LK0/J;->n0()LI0/B;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, p0, v1}, LK0/A;-><init>(LK0/J;LI0/B;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, LK0/J;->y:LK0/A;

    .line 15
    .line 16
    :cond_0
    return-object v0
.end method

.method private final v1()V
    .locals 6

    .line 1
    iget-boolean v0, p0, LK0/J;->m:Z

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, LK0/J;->m:Z

    .line 7
    .line 8
    iget-object v1, p0, LK0/J;->l:La0/c;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, La0/c;

    .line 13
    .line 14
    const/16 v2, 0x10

    .line 15
    .line 16
    new-array v2, v2, [LK0/J;

    .line 17
    .line 18
    invoke-direct {v1, v2, v0}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 19
    .line 20
    .line 21
    iput-object v1, p0, LK0/J;->l:La0/c;

    .line 22
    .line 23
    :cond_0
    invoke-virtual {v1}, La0/c;->i()V

    .line 24
    .line 25
    .line 26
    iget-object v2, p0, LK0/J;->k:LK0/a0;

    .line 27
    .line 28
    invoke-virtual {v2}, LK0/a0;->c()La0/c;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    iget-object v3, v2, La0/c;->a:[Ljava/lang/Object;

    .line 33
    .line 34
    invoke-virtual {v2}, La0/c;->p()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    :goto_0
    if-ge v0, v2, :cond_2

    .line 39
    .line 40
    aget-object v4, v3, v0

    .line 41
    .line 42
    check-cast v4, LK0/J;

    .line 43
    .line 44
    iget-boolean v5, v4, LK0/J;->a:Z

    .line 45
    .line 46
    if-eqz v5, :cond_1

    .line 47
    .line 48
    invoke-virtual {v4}, LK0/J;->I0()La0/c;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-virtual {v1}, La0/c;->p()I

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    invoke-virtual {v1, v5, v4}, La0/c;->d(ILa0/c;)Z

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    invoke-virtual {v1, v4}, La0/c;->c(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    iget-object v0, p0, LK0/J;->H:LK0/O;

    .line 67
    .line 68
    invoke-virtual {v0}, LK0/O;->C()V

    .line 69
    .line 70
    .line 71
    :cond_3
    return-void
.end method

.method private final w(Landroidx/compose/ui/e;)V
    .locals 5

    .line 1
    iget-object v0, p0, LK0/J;->G:LK0/c0;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    invoke-static {v1}, LK0/g0;->a(I)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    invoke-virtual {v0, v2}, LK0/c0;->q(I)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget-object v2, p0, LK0/J;->G:LK0/c0;

    .line 14
    .line 15
    const/16 v3, 0x400

    .line 16
    .line 17
    invoke-static {v3}, LK0/g0;->a(I)I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    invoke-virtual {v2, v4}, LK0/c0;->q(I)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    iput-object p1, p0, LK0/J;->Z:Landroidx/compose/ui/e;

    .line 26
    .line 27
    iget-object v4, p0, LK0/J;->G:LK0/c0;

    .line 28
    .line 29
    invoke-virtual {v4, p1}, LK0/c0;->F(Landroidx/compose/ui/e;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, LK0/J;->G:LK0/c0;

    .line 33
    .line 34
    invoke-static {v1}, LK0/g0;->a(I)I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    invoke-virtual {p1, v1}, LK0/c0;->q(I)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    iget-object v1, p0, LK0/J;->G:LK0/c0;

    .line 43
    .line 44
    invoke-static {v3}, LK0/g0;->a(I)I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    invoke-virtual {v1, v3}, LK0/c0;->q(I)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    iget-object v3, p0, LK0/J;->H:LK0/O;

    .line 53
    .line 54
    invoke-virtual {v3}, LK0/O;->Z()V

    .line 55
    .line 56
    .line 57
    iget-object v3, p0, LK0/J;->i:LK0/J;

    .line 58
    .line 59
    if-nez v3, :cond_0

    .line 60
    .line 61
    iget-object v3, p0, LK0/J;->G:LK0/c0;

    .line 62
    .line 63
    const/16 v4, 0x200

    .line 64
    .line 65
    invoke-static {v4}, LK0/g0;->a(I)I

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    invoke-virtual {v3, v4}, LK0/c0;->q(I)Z

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-eqz v3, :cond_0

    .line 74
    .line 75
    invoke-direct {p0, p0}, LK0/J;->T1(LK0/J;)V

    .line 76
    .line 77
    .line 78
    :cond_0
    if-ne v0, p1, :cond_2

    .line 79
    .line 80
    if-eq v2, v1, :cond_1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_1
    return-void

    .line 84
    :cond_2
    :goto_0
    invoke-static {p0}, LK0/N;->b(LK0/J;)LK0/p0;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-interface {v0}, LK0/p0;->getRectManager()LS0/b;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-virtual {v0, p0, v1, p1}, LS0/b;->p(LK0/J;ZZ)V

    .line 93
    .line 94
    .line 95
    return-void
.end method

.method public static synthetic x1(LK0/J;Li1/b;ILjava/lang/Object;)Z
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, LK0/J;->H:LK0/O;

    .line 6
    .line 7
    invoke-virtual {p1}, LK0/O;->j()Li1/b;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    :cond_0
    invoke-virtual {p0, p1}, LK0/J;->w1(Li1/b;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method


# virtual methods
.method public final A(LK0/p0;)V
    .locals 6

    .line 1
    iget-object v0, p0, LK0/J;->o:LK0/p0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    move v0, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v1

    .line 10
    :goto_0
    const/4 v3, 0x0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string v4, "Cannot attach "

    .line 19
    .line 20
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v4, " as it already is attached.  Tree: "

    .line 27
    .line 28
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-static {p0, v1, v2, v3}, LK0/J;->F(LK0/J;IILjava/lang/Object;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {v0}, LH0/a;->b(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    :cond_1
    iget-object v0, p0, LK0/J;->n:LK0/J;

    .line 46
    .line 47
    if-eqz v0, :cond_4

    .line 48
    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    iget-object v0, v0, LK0/J;->o:LK0/p0;

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    move-object v0, v3

    .line 55
    :goto_1
    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_3

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_3
    move v0, v1

    .line 63
    goto :goto_3

    .line 64
    :cond_4
    :goto_2
    move v0, v2

    .line 65
    :goto_3
    if-nez v0, :cond_7

    .line 66
    .line 67
    new-instance v0, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 70
    .line 71
    .line 72
    const-string v4, "Attaching to a different owner("

    .line 73
    .line 74
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string v4, ") than the parent\'s owner("

    .line 81
    .line 82
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, LK0/J;->A0()LK0/J;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    if-eqz v4, :cond_5

    .line 90
    .line 91
    iget-object v4, v4, LK0/J;->o:LK0/p0;

    .line 92
    .line 93
    goto :goto_4

    .line 94
    :cond_5
    move-object v4, v3

    .line 95
    :goto_4
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    const-string v4, "). This tree: "

    .line 99
    .line 100
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-static {p0, v1, v2, v3}, LK0/J;->F(LK0/J;IILjava/lang/Object;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    const-string v4, " Parent tree: "

    .line 111
    .line 112
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    iget-object v4, p0, LK0/J;->n:LK0/J;

    .line 116
    .line 117
    if-eqz v4, :cond_6

    .line 118
    .line 119
    invoke-static {v4, v1, v2, v3}, LK0/J;->F(LK0/J;IILjava/lang/Object;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    goto :goto_5

    .line 124
    :cond_6
    move-object v4, v3

    .line 125
    :goto_5
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-static {v0}, LH0/a;->b(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    :cond_7
    invoke-virtual {p0}, LK0/J;->A0()LK0/J;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    if-nez v0, :cond_8

    .line 140
    .line 141
    invoke-virtual {p0}, LK0/J;->l0()LK0/X;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    invoke-virtual {v4, v2}, LK0/X;->q2(Z)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p0}, LK0/J;->i0()LK0/V;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    if-eqz v4, :cond_8

    .line 153
    .line 154
    invoke-virtual {v4}, LK0/V;->Z1()V

    .line 155
    .line 156
    .line 157
    :cond_8
    invoke-virtual {p0}, LK0/J;->w0()LK0/e0;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    if-eqz v0, :cond_9

    .line 162
    .line 163
    invoke-virtual {v0}, LK0/J;->X()LK0/e0;

    .line 164
    .line 165
    .line 166
    move-result-object v5

    .line 167
    goto :goto_6

    .line 168
    :cond_9
    move-object v5, v3

    .line 169
    :goto_6
    invoke-virtual {v4, v5}, LK0/e0;->w3(LK0/e0;)V

    .line 170
    .line 171
    .line 172
    iput-object p1, p0, LK0/J;->o:LK0/p0;

    .line 173
    .line 174
    if-eqz v0, :cond_a

    .line 175
    .line 176
    iget v4, v0, LK0/J;->q:I

    .line 177
    .line 178
    goto :goto_7

    .line 179
    :cond_a
    const/4 v4, -0x1

    .line 180
    :goto_7
    add-int/2addr v4, v2

    .line 181
    iput v4, p0, LK0/J;->q:I

    .line 182
    .line 183
    iget-object v2, p0, LK0/J;->l0:Landroidx/compose/ui/e;

    .line 184
    .line 185
    if-eqz v2, :cond_b

    .line 186
    .line 187
    invoke-direct {p0, v2}, LK0/J;->w(Landroidx/compose/ui/e;)V

    .line 188
    .line 189
    .line 190
    :cond_b
    iput-object v3, p0, LK0/J;->l0:Landroidx/compose/ui/e;

    .line 191
    .line 192
    sget-boolean v2, Ll0/h;->c:Z

    .line 193
    .line 194
    const/16 v3, 0x8

    .line 195
    .line 196
    if-nez v2, :cond_c

    .line 197
    .line 198
    iget-object v2, p0, LK0/J;->G:LK0/c0;

    .line 199
    .line 200
    invoke-static {v3}, LK0/g0;->a(I)I

    .line 201
    .line 202
    .line 203
    move-result v4

    .line 204
    invoke-virtual {v2, v4}, LK0/c0;->q(I)Z

    .line 205
    .line 206
    .line 207
    move-result v2

    .line 208
    if-eqz v2, :cond_c

    .line 209
    .line 210
    invoke-virtual {p0}, LK0/J;->V0()V

    .line 211
    .line 212
    .line 213
    :cond_c
    invoke-interface {p1, p0}, LK0/p0;->r(LK0/J;)V

    .line 214
    .line 215
    .line 216
    iget-boolean v2, p0, LK0/J;->h:Z

    .line 217
    .line 218
    if-eqz v2, :cond_d

    .line 219
    .line 220
    invoke-direct {p0, p0}, LK0/J;->T1(LK0/J;)V

    .line 221
    .line 222
    .line 223
    goto :goto_8

    .line 224
    :cond_d
    iget-object v2, p0, LK0/J;->n:LK0/J;

    .line 225
    .line 226
    if-eqz v2, :cond_e

    .line 227
    .line 228
    iget-object v2, v2, LK0/J;->i:LK0/J;

    .line 229
    .line 230
    if-nez v2, :cond_f

    .line 231
    .line 232
    :cond_e
    iget-object v2, p0, LK0/J;->i:LK0/J;

    .line 233
    .line 234
    :cond_f
    invoke-direct {p0, v2}, LK0/J;->T1(LK0/J;)V

    .line 235
    .line 236
    .line 237
    iget-object v2, p0, LK0/J;->i:LK0/J;

    .line 238
    .line 239
    if-nez v2, :cond_10

    .line 240
    .line 241
    iget-object v2, p0, LK0/J;->G:LK0/c0;

    .line 242
    .line 243
    const/16 v4, 0x200

    .line 244
    .line 245
    invoke-static {v4}, LK0/g0;->a(I)I

    .line 246
    .line 247
    .line 248
    move-result v4

    .line 249
    invoke-virtual {v2, v4}, LK0/c0;->q(I)Z

    .line 250
    .line 251
    .line 252
    move-result v2

    .line 253
    if-eqz v2, :cond_10

    .line 254
    .line 255
    invoke-direct {p0, p0}, LK0/J;->T1(LK0/J;)V

    .line 256
    .line 257
    .line 258
    :cond_10
    :goto_8
    invoke-virtual {p0}, LK0/J;->z()Z

    .line 259
    .line 260
    .line 261
    move-result v2

    .line 262
    if-nez v2, :cond_11

    .line 263
    .line 264
    iget-object v2, p0, LK0/J;->G:LK0/c0;

    .line 265
    .line 266
    invoke-virtual {v2}, LK0/c0;->t()V

    .line 267
    .line 268
    .line 269
    :cond_11
    iget-object v2, p0, LK0/J;->k:LK0/a0;

    .line 270
    .line 271
    invoke-virtual {v2}, LK0/a0;->c()La0/c;

    .line 272
    .line 273
    .line 274
    move-result-object v2

    .line 275
    iget-object v4, v2, La0/c;->a:[Ljava/lang/Object;

    .line 276
    .line 277
    invoke-virtual {v2}, La0/c;->p()I

    .line 278
    .line 279
    .line 280
    move-result v2

    .line 281
    :goto_9
    if-ge v1, v2, :cond_12

    .line 282
    .line 283
    aget-object v5, v4, v1

    .line 284
    .line 285
    check-cast v5, LK0/J;

    .line 286
    .line 287
    invoke-virtual {v5, p1}, LK0/J;->A(LK0/p0;)V

    .line 288
    .line 289
    .line 290
    add-int/lit8 v1, v1, 0x1

    .line 291
    .line 292
    goto :goto_9

    .line 293
    :cond_12
    invoke-virtual {p0}, LK0/J;->z()Z

    .line 294
    .line 295
    .line 296
    move-result v1

    .line 297
    if-nez v1, :cond_13

    .line 298
    .line 299
    iget-object v1, p0, LK0/J;->G:LK0/c0;

    .line 300
    .line 301
    invoke-virtual {v1}, LK0/c0;->z()V

    .line 302
    .line 303
    .line 304
    :cond_13
    invoke-virtual {p0}, LK0/J;->R0()V

    .line 305
    .line 306
    .line 307
    if-eqz v0, :cond_14

    .line 308
    .line 309
    invoke-virtual {v0}, LK0/J;->R0()V

    .line 310
    .line 311
    .line 312
    :cond_14
    iget-object v0, p0, LK0/J;->m0:Lkotlin/jvm/functions/Function1;

    .line 313
    .line 314
    if-eqz v0, :cond_15

    .line 315
    .line 316
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    :cond_15
    iget-object v0, p0, LK0/J;->H:LK0/O;

    .line 320
    .line 321
    invoke-virtual {v0}, LK0/O;->Z()V

    .line 322
    .line 323
    .line 324
    sget-boolean v0, Ll0/h;->c:Z

    .line 325
    .line 326
    if-eqz v0, :cond_16

    .line 327
    .line 328
    invoke-virtual {p0}, LK0/J;->z()Z

    .line 329
    .line 330
    .line 331
    move-result v0

    .line 332
    if-nez v0, :cond_16

    .line 333
    .line 334
    iget-object v0, p0, LK0/J;->G:LK0/c0;

    .line 335
    .line 336
    invoke-static {v3}, LK0/g0;->a(I)I

    .line 337
    .line 338
    .line 339
    move-result v1

    .line 340
    invoke-virtual {v0, v1}, LK0/c0;->q(I)Z

    .line 341
    .line 342
    .line 343
    move-result v0

    .line 344
    if-eqz v0, :cond_16

    .line 345
    .line 346
    invoke-virtual {p0}, LK0/J;->V0()V

    .line 347
    .line 348
    .line 349
    :cond_16
    invoke-interface {p1, p0}, LK0/p0;->z(LK0/J;)V

    .line 350
    .line 351
    .line 352
    return-void
.end method

.method public final A0()LK0/J;
    .locals 3

    .line 1
    iget-object v0, p0, LK0/J;->n:LK0/J;

    .line 2
    .line 3
    :goto_0
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v1, v0, LK0/J;->a:Z

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    iget-object v0, v0, LK0/J;->n:LK0/J;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    return-object v0
.end method

.method public final A1()V
    .locals 2

    .line 1
    iget-object v0, p0, LK0/J;->D:LK0/J$g;

    .line 2
    .line 3
    sget-object v1, LK0/J$g;->c:LK0/J$g;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, LK0/J;->D()V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, LK0/J;->l0()LK0/X;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, LK0/X;->m2()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final B0()I
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/J;->l0()LK0/X;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LK0/X;->S1()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public final B1(Z)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LK0/J;->f:Z

    .line 3
    .line 4
    iget-boolean v1, p0, LK0/J;->a:Z

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    iget-object v1, p0, LK0/J;->o:LK0/p0;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-interface {v1, p0, v0, p1}, LK0/p0;->y(LK0/J;ZZ)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final C()V
    .locals 6

    .line 1
    iget-object v0, p0, LK0/J;->D:LK0/J$g;

    .line 2
    .line 3
    iput-object v0, p0, LK0/J;->E:LK0/J$g;

    .line 4
    .line 5
    sget-object v0, LK0/J$g;->c:LK0/J$g;

    .line 6
    .line 7
    iput-object v0, p0, LK0/J;->D:LK0/J$g;

    .line 8
    .line 9
    invoke-virtual {p0}, LK0/J;->I0()La0/c;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, v0, La0/c;->a:[Ljava/lang/Object;

    .line 14
    .line 15
    invoke-virtual {v0}, La0/c;->p()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v2, 0x0

    .line 20
    :goto_0
    if-ge v2, v0, :cond_1

    .line 21
    .line 22
    aget-object v3, v1, v2

    .line 23
    .line 24
    check-cast v3, LK0/J;

    .line 25
    .line 26
    iget-object v4, v3, LK0/J;->D:LK0/J$g;

    .line 27
    .line 28
    sget-object v5, LK0/J$g;->c:LK0/J$g;

    .line 29
    .line 30
    if-eq v4, v5, :cond_0

    .line 31
    .line 32
    invoke-virtual {v3}, LK0/J;->C()V

    .line 33
    .line 34
    .line 35
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    return-void
.end method

.method public final C0()Landroidx/compose/ui/layout/j;
    .locals 1

    .line 1
    iget-object v0, p0, LK0/J;->I:Landroidx/compose/ui/layout/j;

    .line 2
    .line 3
    return-object v0
.end method

.method public final D1(ZZZ)V
    .locals 3

    .line 1
    iget-object v0, p0, LK0/J;->i:LK0/J;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move v0, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    if-nez v0, :cond_1

    .line 10
    .line 11
    const-string v0, "Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope"

    .line 12
    .line 13
    invoke-static {v0}, LH0/a;->b(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_1
    iput-boolean v1, p0, LK0/J;->f:Z

    .line 17
    .line 18
    iget-object v0, p0, LK0/J;->o:LK0/p0;

    .line 19
    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_2
    iget-boolean v2, p0, LK0/J;->r:Z

    .line 24
    .line 25
    if-nez v2, :cond_3

    .line 26
    .line 27
    iget-boolean v2, p0, LK0/J;->a:Z

    .line 28
    .line 29
    if-nez v2, :cond_3

    .line 30
    .line 31
    invoke-interface {v0, p0, v1, p1, p2}, LK0/p0;->A(LK0/J;ZZZ)V

    .line 32
    .line 33
    .line 34
    if-eqz p3, :cond_3

    .line 35
    .line 36
    invoke-virtual {p0}, LK0/J;->i0()LK0/V;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-static {p2}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p2, p1}, LK0/V;->T1(Z)V

    .line 44
    .line 45
    .line 46
    :cond_3
    :goto_1
    return-void
.end method

.method public E0()Landroidx/compose/ui/platform/A1;
    .locals 1

    .line 1
    iget-object v0, p0, LK0/J;->B:Landroidx/compose/ui/platform/A1;

    .line 2
    .line 3
    return-object v0
.end method

.method public F0()I
    .locals 1

    .line 1
    iget-object v0, p0, LK0/J;->H:LK0/O;

    .line 2
    .line 3
    invoke-virtual {v0}, LK0/O;->A()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final F1(Z)V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LK0/J;->f:Z

    .line 3
    .line 4
    iget-boolean v0, p0, LK0/J;->a:Z

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget-object v1, p0, LK0/J;->o:LK0/p0;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    const/4 v5, 0x2

    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    move-object v2, p0

    .line 16
    move v4, p1

    .line 17
    invoke-static/range {v1 .. v6}, LK0/p0;->v(LK0/p0;LK0/J;ZZILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final G()V
    .locals 8

    .line 1
    iget-object v0, p0, LK0/J;->o:LK0/p0;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    const-string v4, "Cannot detach node that is already detached!  Tree: "

    .line 14
    .line 15
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, LK0/J;->A0()LK0/J;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    if-eqz v4, :cond_0

    .line 23
    .line 24
    invoke-static {v4, v3, v1, v2}, LK0/J;->F(LK0/J;IILjava/lang/Object;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    :cond_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {v0}, LH0/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    .line 36
    .line 37
    .line 38
    new-instance v0, LTd/k;

    .line 39
    .line 40
    invoke-direct {v0}, LTd/k;-><init>()V

    .line 41
    .line 42
    .line 43
    throw v0

    .line 44
    :cond_1
    invoke-virtual {p0}, LK0/J;->A0()LK0/J;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    if-eqz v4, :cond_2

    .line 49
    .line 50
    invoke-virtual {v4}, LK0/J;->P0()V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v4}, LK0/J;->R0()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, LK0/J;->l0()LK0/X;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    sget-object v5, LK0/J$g;->c:LK0/J$g;

    .line 61
    .line 62
    invoke-virtual {v4, v5}, LK0/X;->p2(LK0/J$g;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, LK0/J;->i0()LK0/V;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    if-eqz v4, :cond_2

    .line 70
    .line 71
    invoke-virtual {v4, v5}, LK0/V;->n2(LK0/J$g;)V

    .line 72
    .line 73
    .line 74
    :cond_2
    iget-object v4, p0, LK0/J;->H:LK0/O;

    .line 75
    .line 76
    invoke-virtual {v4}, LK0/O;->K()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, LK0/J;->w0()LK0/e0;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    invoke-virtual {p0}, LK0/J;->X()LK0/e0;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    invoke-virtual {v5}, LK0/e0;->O2()LK0/e0;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    :goto_0
    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v6

    .line 95
    if-nez v6, :cond_3

    .line 96
    .line 97
    if-eqz v4, :cond_3

    .line 98
    .line 99
    invoke-virtual {v4}, LK0/e0;->f3()V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v4}, LK0/e0;->O2()LK0/e0;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    goto :goto_0

    .line 107
    :cond_3
    iget-object v4, p0, LK0/J;->n0:Lkotlin/jvm/functions/Function1;

    .line 108
    .line 109
    if-eqz v4, :cond_4

    .line 110
    .line 111
    invoke-interface {v4, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    :cond_4
    sget-boolean v4, Ll0/h;->c:Z

    .line 115
    .line 116
    const/16 v5, 0x8

    .line 117
    .line 118
    if-nez v4, :cond_5

    .line 119
    .line 120
    iget-object v4, p0, LK0/J;->G:LK0/c0;

    .line 121
    .line 122
    invoke-static {v5}, LK0/g0;->a(I)I

    .line 123
    .line 124
    .line 125
    move-result v6

    .line 126
    invoke-virtual {v4, v6}, LK0/c0;->q(I)Z

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    if-eqz v4, :cond_5

    .line 131
    .line 132
    invoke-virtual {p0}, LK0/J;->V0()V

    .line 133
    .line 134
    .line 135
    :cond_5
    iget-object v4, p0, LK0/J;->G:LK0/c0;

    .line 136
    .line 137
    invoke-virtual {v4}, LK0/c0;->A()V

    .line 138
    .line 139
    .line 140
    invoke-static {p0, v1}, LK0/J;->v(LK0/J;Z)V

    .line 141
    .line 142
    .line 143
    iget-object v1, p0, LK0/J;->k:LK0/a0;

    .line 144
    .line 145
    invoke-virtual {v1}, LK0/a0;->c()La0/c;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    iget-object v4, v1, La0/c;->a:[Ljava/lang/Object;

    .line 150
    .line 151
    invoke-virtual {v1}, La0/c;->p()I

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    move v6, v3

    .line 156
    :goto_1
    if-ge v6, v1, :cond_6

    .line 157
    .line 158
    aget-object v7, v4, v6

    .line 159
    .line 160
    check-cast v7, LK0/J;

    .line 161
    .line 162
    invoke-virtual {v7}, LK0/J;->G()V

    .line 163
    .line 164
    .line 165
    add-int/lit8 v6, v6, 0x1

    .line 166
    .line 167
    goto :goto_1

    .line 168
    :cond_6
    sget-object v1, LTd/L;->a:LTd/L;

    .line 169
    .line 170
    invoke-static {p0, v3}, LK0/J;->v(LK0/J;Z)V

    .line 171
    .line 172
    .line 173
    iget-object v1, p0, LK0/J;->G:LK0/c0;

    .line 174
    .line 175
    invoke-virtual {v1}, LK0/c0;->u()V

    .line 176
    .line 177
    .line 178
    invoke-interface {v0, p0}, LK0/p0;->e(LK0/J;)V

    .line 179
    .line 180
    .line 181
    iput-object v2, p0, LK0/J;->o:LK0/p0;

    .line 182
    .line 183
    sget-object v1, Li1/n;->b:Li1/n$a;

    .line 184
    .line 185
    invoke-virtual {v1}, Li1/n$a;->a()J

    .line 186
    .line 187
    .line 188
    move-result-wide v6

    .line 189
    iput-wide v6, p0, LK0/J;->c:J

    .line 190
    .line 191
    invoke-direct {p0, v2}, LK0/J;->T1(LK0/J;)V

    .line 192
    .line 193
    .line 194
    iput v3, p0, LK0/J;->q:I

    .line 195
    .line 196
    invoke-virtual {p0}, LK0/J;->l0()LK0/X;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    invoke-virtual {v1}, LK0/X;->g2()V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p0}, LK0/J;->i0()LK0/V;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    if-eqz v1, :cond_7

    .line 208
    .line 209
    invoke-virtual {v1}, LK0/V;->c2()V

    .line 210
    .line 211
    .line 212
    :cond_7
    sget-boolean v1, Ll0/h;->c:Z

    .line 213
    .line 214
    if-eqz v1, :cond_8

    .line 215
    .line 216
    iget-object v1, p0, LK0/J;->G:LK0/c0;

    .line 217
    .line 218
    invoke-static {v5}, LK0/g0;->a(I)I

    .line 219
    .line 220
    .line 221
    move-result v4

    .line 222
    invoke-virtual {v1, v4}, LK0/c0;->q(I)Z

    .line 223
    .line 224
    .line 225
    move-result v1

    .line 226
    if-eqz v1, :cond_8

    .line 227
    .line 228
    iget-object v1, p0, LK0/J;->t:Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 229
    .line 230
    iput-object v2, p0, LK0/J;->t:Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 231
    .line 232
    iput-boolean v3, p0, LK0/J;->s:Z

    .line 233
    .line 234
    invoke-interface {v0}, LK0/p0;->getSemanticsOwner()LR0/v;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    invoke-virtual {v2, p0, v1}, LR0/v;->e(LR0/n;Landroidx/compose/ui/semantics/SemanticsConfiguration;)V

    .line 239
    .line 240
    .line 241
    invoke-interface {v0}, LK0/p0;->H()V

    .line 242
    .line 243
    .line 244
    :cond_8
    return-void
.end method

.method public final H()V
    .locals 11

    .line 1
    invoke-virtual {p0}, LK0/J;->f0()LK0/J$e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, LK0/J$e;->e:LK0/J$e;

    .line 6
    .line 7
    if-ne v0, v1, :cond_a

    .line 8
    .line 9
    invoke-virtual {p0}, LK0/J;->e0()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_a

    .line 14
    .line 15
    invoke-virtual {p0}, LK0/J;->m0()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_a

    .line 20
    .line 21
    invoke-virtual {p0}, LK0/J;->z()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    goto/16 :goto_5

    .line 28
    .line 29
    :cond_0
    invoke-virtual {p0}, LK0/J;->p()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    goto/16 :goto_5

    .line 36
    .line 37
    :cond_1
    iget-object v0, p0, LK0/J;->G:LK0/c0;

    .line 38
    .line 39
    const/16 v1, 0x100

    .line 40
    .line 41
    invoke-static {v1}, LK0/g0;->a(I)I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    invoke-static {v0}, LK0/c0;->c(LK0/c0;)I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    and-int/2addr v3, v2

    .line 50
    if-eqz v3, :cond_a

    .line 51
    .line 52
    invoke-virtual {v0}, LK0/c0;->k()Landroidx/compose/ui/e$c;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    :goto_0
    if-eqz v0, :cond_a

    .line 57
    .line 58
    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    and-int/2addr v3, v2

    .line 63
    if-eqz v3, :cond_9

    .line 64
    .line 65
    const/4 v3, 0x0

    .line 66
    move-object v4, v0

    .line 67
    move-object v5, v3

    .line 68
    :goto_1
    if-eqz v4, :cond_9

    .line 69
    .line 70
    instance-of v6, v4, LK0/v;

    .line 71
    .line 72
    if-eqz v6, :cond_2

    .line 73
    .line 74
    check-cast v4, LK0/v;

    .line 75
    .line 76
    invoke-static {v1}, LK0/g0;->a(I)I

    .line 77
    .line 78
    .line 79
    move-result v6

    .line 80
    invoke-static {v4, v6}, LK0/k;->i(LK0/j;I)LK0/e0;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    invoke-interface {v4, v6}, LK0/v;->p(LI0/p;)V

    .line 85
    .line 86
    .line 87
    goto :goto_4

    .line 88
    :cond_2
    invoke-virtual {v4}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 89
    .line 90
    .line 91
    move-result v6

    .line 92
    and-int/2addr v6, v2

    .line 93
    if-eqz v6, :cond_8

    .line 94
    .line 95
    instance-of v6, v4, LK0/m;

    .line 96
    .line 97
    if-eqz v6, :cond_8

    .line 98
    .line 99
    move-object v6, v4

    .line 100
    check-cast v6, LK0/m;

    .line 101
    .line 102
    invoke-virtual {v6}, LK0/m;->F1()Landroidx/compose/ui/e$c;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    const/4 v7, 0x0

    .line 107
    move v8, v7

    .line 108
    :goto_2
    const/4 v9, 0x1

    .line 109
    if-eqz v6, :cond_7

    .line 110
    .line 111
    invoke-virtual {v6}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 112
    .line 113
    .line 114
    move-result v10

    .line 115
    and-int/2addr v10, v2

    .line 116
    if-eqz v10, :cond_6

    .line 117
    .line 118
    add-int/lit8 v8, v8, 0x1

    .line 119
    .line 120
    if-ne v8, v9, :cond_3

    .line 121
    .line 122
    move-object v4, v6

    .line 123
    goto :goto_3

    .line 124
    :cond_3
    if-nez v5, :cond_4

    .line 125
    .line 126
    new-instance v5, La0/c;

    .line 127
    .line 128
    const/16 v9, 0x10

    .line 129
    .line 130
    new-array v9, v9, [Landroidx/compose/ui/e$c;

    .line 131
    .line 132
    invoke-direct {v5, v9, v7}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 133
    .line 134
    .line 135
    :cond_4
    if-eqz v4, :cond_5

    .line 136
    .line 137
    invoke-virtual {v5, v4}, La0/c;->c(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-object v4, v3

    .line 141
    :cond_5
    invoke-virtual {v5, v6}, La0/c;->c(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    :cond_6
    :goto_3
    invoke-virtual {v6}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 145
    .line 146
    .line 147
    move-result-object v6

    .line 148
    goto :goto_2

    .line 149
    :cond_7
    if-ne v8, v9, :cond_8

    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_8
    :goto_4
    invoke-static {v5}, LK0/k;->b(La0/c;)Landroidx/compose/ui/e$c;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    goto :goto_1

    .line 157
    :cond_9
    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->getAggregateChildKindSet$ui_release()I

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    and-int/2addr v3, v2

    .line 162
    if-eqz v3, :cond_a

    .line 163
    .line 164
    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    goto :goto_0

    .line 169
    :cond_a
    :goto_5
    return-void
.end method

.method public final H0()La0/c;
    .locals 3

    .line 1
    iget-boolean v0, p0, LK0/J;->w:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LK0/J;->v:La0/c;

    .line 6
    .line 7
    invoke-virtual {v0}, La0/c;->i()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, LK0/J;->v:La0/c;

    .line 11
    .line 12
    invoke-virtual {p0}, LK0/J;->I0()La0/c;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0}, La0/c;->p()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-virtual {v0, v2, v1}, La0/c;->d(ILa0/c;)Z

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, LK0/J;->v:La0/c;

    .line 24
    .line 25
    sget-object v1, LK0/J;->w0:Ljava/util/Comparator;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, La0/c;->G(Ljava/util/Comparator;)V

    .line 28
    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    iput-boolean v0, p0, LK0/J;->w:Z

    .line 32
    .line 33
    :cond_0
    iget-object v0, p0, LK0/J;->v:La0/c;

    .line 34
    .line 35
    return-object v0
.end method

.method public final H1(ZZZ)V
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LK0/J;->f:Z

    .line 3
    .line 4
    iget-boolean v0, p0, LK0/J;->r:Z

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    iget-boolean v0, p0, LK0/J;->a:Z

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    iget-object v1, p0, LK0/J;->o:LK0/p0;

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v6, 0x2

    .line 18
    const/4 v7, 0x0

    .line 19
    const/4 v3, 0x0

    .line 20
    move-object v2, p0

    .line 21
    move v4, p1

    .line 22
    move v5, p2

    .line 23
    invoke-static/range {v1 .. v7}, LK0/p0;->I(LK0/p0;LK0/J;ZZZILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    if-eqz p3, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, LK0/J;->l0()LK0/X;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1, v4}, LK0/X;->V1(Z)V

    .line 33
    .line 34
    .line 35
    :cond_1
    :goto_0
    return-void
.end method

.method public final I(Ls0/j0;Lv0/c;)V
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p0}, LK0/J;->w0()LK0/e0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1, p2}, LK0/e0;->u2(Ls0/j0;Lv0/c;)V

    .line 6
    .line 7
    .line 8
    sget-object p1, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception p1

    .line 12
    invoke-virtual {p0, p1}, LK0/J;->M1(Ljava/lang/Throwable;)Ljava/lang/Void;

    .line 13
    .line 14
    .line 15
    new-instance p1, LTd/k;

    .line 16
    .line 17
    invoke-direct {p1}, LTd/k;-><init>()V

    .line 18
    .line 19
    .line 20
    throw p1
.end method

.method public final I0()La0/c;
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/J;->d2()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, LK0/J;->j:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, LK0/J;->k:LK0/a0;

    .line 9
    .line 10
    invoke-virtual {v0}, LK0/a0;->c()La0/c;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    :cond_0
    iget-object v0, p0, LK0/J;->l:La0/c;

    .line 16
    .line 17
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public J0()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/J;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public final J1(LK0/J;)V
    .locals 14

    .line 1
    invoke-virtual {p1}, LK0/J;->f0()LK0/J$e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, LK0/J$h;->a:[I

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    aget v0, v1, v0

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    if-ne v0, v1, :cond_4

    .line 15
    .line 16
    invoke-virtual {p1}, LK0/J;->h0()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    const/4 v6, 0x6

    .line 23
    const/4 v7, 0x0

    .line 24
    const/4 v3, 0x1

    .line 25
    const/4 v4, 0x0

    .line 26
    const/4 v5, 0x0

    .line 27
    move-object v2, p1

    .line 28
    invoke-static/range {v2 .. v7}, LK0/J;->E1(LK0/J;ZZZILjava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    move-object v2, p1

    .line 33
    invoke-virtual {v2}, LK0/J;->g0()Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    invoke-virtual {v2, v1}, LK0/J;->B1(Z)V

    .line 40
    .line 41
    .line 42
    :cond_1
    invoke-virtual {v2}, LK0/J;->m0()Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-eqz p1, :cond_2

    .line 47
    .line 48
    const/4 v12, 0x6

    .line 49
    const/4 v13, 0x0

    .line 50
    const/4 v9, 0x1

    .line 51
    const/4 v10, 0x0

    .line 52
    const/4 v11, 0x0

    .line 53
    move-object v8, v2

    .line 54
    invoke-static/range {v8 .. v13}, LK0/J;->I1(LK0/J;ZZZILjava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_2
    invoke-virtual {v2}, LK0/J;->e0()Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-eqz p1, :cond_3

    .line 63
    .line 64
    invoke-virtual {v2, v1}, LK0/J;->F1(Z)V

    .line 65
    .line 66
    .line 67
    :cond_3
    return-void

    .line 68
    :cond_4
    move-object v2, p1

    .line 69
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 70
    .line 71
    new-instance v0, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 74
    .line 75
    .line 76
    const-string v1, "Unexpected state "

    .line 77
    .line 78
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2}, LK0/J;->f0()LK0/J$e;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    throw p1
.end method

.method public final K()Z
    .locals 3

    .line 1
    iget-object v0, p0, LK0/J;->H:LK0/O;

    .line 2
    .line 3
    invoke-virtual {v0}, LK0/O;->b()LK0/b;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v1}, LK0/b;->z()LK0/a;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, LK0/a;->k()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x1

    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0}, LK0/O;->o()LK0/b;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-interface {v0}, LK0/b;->z()LK0/a;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    invoke-virtual {v0}, LK0/a;->k()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-ne v0, v2, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 v0, 0x0

    .line 38
    return v0

    .line 39
    :cond_1
    :goto_0
    return v2
.end method

.method public final K0(JLK0/w;IZ)V
    .locals 13

    .line 1
    invoke-virtual {p0}, LK0/J;->w0()LK0/e0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v4, 0x2

    .line 6
    const/4 v5, 0x0

    .line 7
    const/4 v3, 0x0

    .line 8
    move-wide v1, p1

    .line 9
    invoke-static/range {v0 .. v5}, LK0/e0;->A2(LK0/e0;JZILjava/lang/Object;)J

    .line 10
    .line 11
    .line 12
    move-result-wide v8

    .line 13
    invoke-virtual {p0}, LK0/J;->w0()LK0/e0;

    .line 14
    .line 15
    .line 16
    move-result-object v6

    .line 17
    sget-object p1, LK0/e0;->n0:LK0/e0$e;

    .line 18
    .line 19
    invoke-virtual {p1}, LK0/e0$e;->a()LK0/e0$f;

    .line 20
    .line 21
    .line 22
    move-result-object v7

    .line 23
    move-object/from16 v10, p3

    .line 24
    .line 25
    move/from16 v11, p4

    .line 26
    .line 27
    move/from16 v12, p5

    .line 28
    .line 29
    invoke-virtual/range {v6 .. v12}, LK0/e0;->W2(LK0/e0$f;JLK0/w;IZ)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final L()Z
    .locals 1

    .line 1
    iget-object v0, p0, LK0/J;->l0:Landroidx/compose/ui/e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

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

.method public final L1()V
    .locals 6

    .line 1
    invoke-virtual {p0}, LK0/J;->I0()La0/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, La0/c;->a:[Ljava/lang/Object;

    .line 6
    .line 7
    invoke-virtual {v0}, La0/c;->p()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v2, 0x0

    .line 12
    :goto_0
    if-ge v2, v0, :cond_1

    .line 13
    .line 14
    aget-object v3, v1, v2

    .line 15
    .line 16
    check-cast v3, LK0/J;

    .line 17
    .line 18
    iget-object v4, v3, LK0/J;->E:LK0/J$g;

    .line 19
    .line 20
    iput-object v4, v3, LK0/J;->D:LK0/J$g;

    .line 21
    .line 22
    sget-object v5, LK0/J$g;->c:LK0/J$g;

    .line 23
    .line 24
    if-eq v4, v5, :cond_0

    .line 25
    .line 26
    invoke-virtual {v3}, LK0/J;->L1()V

    .line 27
    .line 28
    .line 29
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    return-void
.end method

.method public final M()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LK0/J;->F:Z

    .line 2
    .line 3
    return v0
.end method

.method public final M0(JLK0/w;IZ)V
    .locals 13

    .line 1
    invoke-virtual {p0}, LK0/J;->w0()LK0/e0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v4, 0x2

    .line 6
    const/4 v5, 0x0

    .line 7
    const/4 v3, 0x0

    .line 8
    move-wide v1, p1

    .line 9
    invoke-static/range {v0 .. v5}, LK0/e0;->A2(LK0/e0;JZILjava/lang/Object;)J

    .line 10
    .line 11
    .line 12
    move-result-wide v8

    .line 13
    invoke-virtual {p0}, LK0/J;->w0()LK0/e0;

    .line 14
    .line 15
    .line 16
    move-result-object v6

    .line 17
    sget-object p1, LK0/e0;->n0:LK0/e0$e;

    .line 18
    .line 19
    invoke-virtual {p1}, LK0/e0$e;->b()LK0/e0$f;

    .line 20
    .line 21
    .line 22
    move-result-object v7

    .line 23
    sget-object p1, LE0/Q;->a:LE0/Q$a;

    .line 24
    .line 25
    invoke-virtual {p1}, LE0/Q$a;->d()I

    .line 26
    .line 27
    .line 28
    move-result v11

    .line 29
    move-object/from16 v10, p3

    .line 30
    .line 31
    move/from16 v12, p5

    .line 32
    .line 33
    invoke-virtual/range {v6 .. v12}, LK0/e0;->W2(LK0/e0$f;JLK0/w;IZ)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final M1(Ljava/lang/Throwable;)Ljava/lang/Void;
    .locals 1

    .line 1
    invoke-direct {p0}, LK0/J;->D0()Lk0/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0, p1, p0}, Lk0/f;->a(Ljava/lang/Throwable;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    :cond_0
    throw p1
.end method

.method public final N()Ljava/util/List;
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/J;->i0()LK0/V;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, LK0/V;->G1()Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
.end method

.method public final N1(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LK0/J;->F:Z

    .line 2
    .line 3
    return-void
.end method

.method public final O()Ljava/util/List;
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/J;->l0()LK0/X;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LK0/X;->I1()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final O0(ILK0/J;)V
    .locals 2

    .line 1
    iget-object v0, p2, LK0/J;->n:LK0/J;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p2, LK0/J;->o:LK0/p0;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    goto :goto_1

    .line 13
    :cond_1
    :goto_0
    move v0, v1

    .line 14
    :goto_1
    if-nez v0, :cond_2

    .line 15
    .line 16
    invoke-direct {p0, p2}, LK0/J;->J(LK0/J;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0}, LH0/a;->b(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    :cond_2
    iput-object p0, p2, LK0/J;->n:LK0/J;

    .line 24
    .line 25
    iget-object v0, p0, LK0/J;->k:LK0/a0;

    .line 26
    .line 27
    invoke-virtual {v0, p1, p2}, LK0/a0;->a(ILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, LK0/J;->t1()V

    .line 31
    .line 32
    .line 33
    iget-boolean p1, p2, LK0/J;->a:Z

    .line 34
    .line 35
    if-eqz p1, :cond_3

    .line 36
    .line 37
    iget p1, p0, LK0/J;->j:I

    .line 38
    .line 39
    add-int/2addr p1, v1

    .line 40
    iput p1, p0, LK0/J;->j:I

    .line 41
    .line 42
    :cond_3
    invoke-direct {p0}, LK0/J;->W0()V

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, LK0/J;->o:LK0/p0;

    .line 46
    .line 47
    if-eqz p1, :cond_4

    .line 48
    .line 49
    invoke-virtual {p2, p1}, LK0/J;->A(LK0/p0;)V

    .line 50
    .line 51
    .line 52
    :cond_4
    iget-object p1, p2, LK0/J;->H:LK0/O;

    .line 53
    .line 54
    invoke-virtual {p1}, LK0/O;->c()I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-lez p1, :cond_5

    .line 59
    .line 60
    iget-object p1, p0, LK0/J;->H:LK0/O;

    .line 61
    .line 62
    invoke-virtual {p1}, LK0/O;->c()I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    add-int/2addr v0, v1

    .line 67
    invoke-virtual {p1, v0}, LK0/O;->L(I)V

    .line 68
    .line 69
    .line 70
    :cond_5
    iget p1, p2, LK0/J;->p0:I

    .line 71
    .line 72
    if-lez p1, :cond_6

    .line 73
    .line 74
    iget p1, p0, LK0/J;->p0:I

    .line 75
    .line 76
    add-int/2addr p1, v1

    .line 77
    invoke-virtual {p0, p1}, LK0/J;->O1(I)V

    .line 78
    .line 79
    .line 80
    :cond_6
    return-void
.end method

.method public final O1(I)V
    .locals 2

    .line 1
    iget v0, p0, LK0/J;->p0:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_2

    .line 4
    .line 5
    if-lez p1, :cond_0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, LK0/J;->A0()LK0/J;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget v1, v0, LK0/J;->p0:I

    .line 16
    .line 17
    add-int/lit8 v1, v1, 0x1

    .line 18
    .line 19
    invoke-virtual {v0, v1}, LK0/J;->O1(I)V

    .line 20
    .line 21
    .line 22
    :cond_0
    if-nez p1, :cond_1

    .line 23
    .line 24
    iget v0, p0, LK0/J;->p0:I

    .line 25
    .line 26
    if-lez v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, LK0/J;->A0()LK0/J;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    iget v1, v0, LK0/J;->p0:I

    .line 35
    .line 36
    add-int/lit8 v1, v1, -0x1

    .line 37
    .line 38
    invoke-virtual {v0, v1}, LK0/J;->O1(I)V

    .line 39
    .line 40
    .line 41
    :cond_1
    iput p1, p0, LK0/J;->p0:I

    .line 42
    .line 43
    :cond_2
    return-void
.end method

.method public final P()Ljava/util/List;
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/J;->I0()La0/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, La0/c;->h()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final P0()V
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/J;->Y()LK0/e0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, LK0/e0;->Y2()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {p0}, LK0/J;->A0()LK0/J;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0}, LK0/J;->P0()V

    .line 18
    .line 19
    .line 20
    :cond_1
    return-void
.end method

.method public final P1(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LK0/J;->Y:Z

    .line 2
    .line 3
    return-void
.end method

.method public Q()LY/I;
    .locals 1

    .line 1
    iget-object v0, p0, LK0/J;->C:LY/I;

    .line 2
    .line 3
    return-object v0
.end method

.method public final Q0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, LK0/J;->w0()LK0/e0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, LK0/J;->X()LK0/e0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    :goto_0
    if-eq v0, v1, :cond_1

    .line 10
    .line 11
    const-string v2, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator"

    .line 12
    .line 13
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    check-cast v0, LK0/F;

    .line 17
    .line 18
    invoke-virtual {v0}, LK0/e0;->H2()LK0/o0;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    invoke-interface {v2}, LK0/o0;->invalidate()V

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-virtual {v0}, LK0/e0;->O2()LK0/e0;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-virtual {p0}, LK0/J;->X()LK0/e0;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, LK0/e0;->H2()LK0/o0;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    invoke-interface {v0}, LK0/o0;->invalidate()V

    .line 43
    .line 44
    .line 45
    :cond_2
    return-void
.end method

.method public final Q1(Landroidx/compose/ui/viewinterop/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK0/J;->p:Landroidx/compose/ui/viewinterop/b;

    .line 2
    .line 3
    return-void
.end method

.method public R()Li1/d;
    .locals 1

    .line 1
    iget-object v0, p0, LK0/J;->z:Li1/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public final R0()V
    .locals 13

    .line 1
    iget-boolean v0, p0, LK0/J;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, LK0/J;->A0()LK0/J;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, LK0/J;->R0()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void

    .line 15
    :cond_1
    iget-object v0, p0, LK0/J;->i:LK0/J;

    .line 16
    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    const/4 v5, 0x7

    .line 20
    const/4 v6, 0x0

    .line 21
    const/4 v2, 0x0

    .line 22
    const/4 v3, 0x0

    .line 23
    const/4 v4, 0x0

    .line 24
    move-object v1, p0

    .line 25
    invoke-static/range {v1 .. v6}, LK0/J;->E1(LK0/J;ZZZILjava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_2
    const/4 v11, 0x7

    .line 30
    const/4 v12, 0x0

    .line 31
    const/4 v8, 0x0

    .line 32
    const/4 v9, 0x0

    .line 33
    const/4 v10, 0x0

    .line 34
    move-object v7, p0

    .line 35
    invoke-static/range {v7 .. v12}, LK0/J;->I1(LK0/J;ZZZILjava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final R1(LK0/J$g;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK0/J;->D:LK0/J$g;

    .line 2
    .line 3
    return-void
.end method

.method public final S()I
    .locals 1

    .line 1
    iget v0, p0, LK0/J;->q:I

    .line 2
    .line 3
    return v0
.end method

.method public final S0()V
    .locals 5

    .line 1
    iget-wide v0, p0, LK0/J;->c:J

    .line 2
    .line 3
    sget-object v2, Li1/n;->b:Li1/n$a;

    .line 4
    .line 5
    invoke-virtual {v2}, Li1/n$a;->a()J

    .line 6
    .line 7
    .line 8
    move-result-wide v3

    .line 9
    invoke-static {v0, v1, v3, v4}, Li1/n;->j(JJ)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    invoke-virtual {v2}, Li1/n$a;->a()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    iput-wide v0, p0, LK0/J;->c:J

    .line 21
    .line 22
    invoke-virtual {p0}, LK0/J;->I0()La0/c;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object v1, v0, La0/c;->a:[Ljava/lang/Object;

    .line 27
    .line 28
    invoke-virtual {v0}, La0/c;->p()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const/4 v2, 0x0

    .line 33
    :goto_0
    if-ge v2, v0, :cond_1

    .line 34
    .line 35
    aget-object v3, v1, v2

    .line 36
    .line 37
    check-cast v3, LK0/J;

    .line 38
    .line 39
    invoke-virtual {v3}, LK0/J;->S0()V

    .line 40
    .line 41
    .line 42
    add-int/lit8 v2, v2, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    :goto_1
    return-void
.end method

.method public final S1(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, LK0/J;->d:J

    .line 2
    .line 3
    return-void
.end method

.method public final T()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LK0/J;->k:LK0/a0;

    .line 2
    .line 3
    invoke-virtual {v0}, LK0/a0;->c()La0/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, La0/c;->h()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public final T0()V
    .locals 1

    .line 1
    iget v0, p0, LK0/J;->p0:I

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, LK0/J;->e0()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, LK0/J;->m0()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    iget-boolean v0, p0, LK0/J;->o0:Z

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-static {p0}, LK0/N;->b(LK0/J;)LK0/p0;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-interface {v0, p0}, LK0/p0;->D(LK0/J;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    :goto_0
    return-void
.end method

.method public final U()I
    .locals 1

    .line 1
    iget v0, p0, LK0/J;->p0:I

    .line 2
    .line 3
    return v0
.end method

.method public final U0()V
    .locals 1

    .line 1
    iget-object v0, p0, LK0/J;->H:LK0/O;

    .line 2
    .line 3
    invoke-virtual {v0}, LK0/O;->B()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final U1(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LK0/J;->o0:Z

    .line 2
    .line 3
    return-void
.end method

.method public final V()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, LK0/J;->X()LK0/e0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LK0/e0;->G2()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    invoke-static {v0, v1}, Li1/b;->j(J)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    invoke-static {v0, v1}, Li1/b;->i(J)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    return v0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    return v0
.end method

.method public final V0()V
    .locals 3

    .line 1
    iget-boolean v0, p0, LK0/J;->u:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    sget-boolean v0, Ll0/h;->c:Z

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, LK0/J;->t:Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 12
    .line 13
    invoke-static {p0}, LK0/N;->b(LK0/J;)LK0/p0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0}, LK0/p0;->H()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    iget-object v0, p0, LK0/J;->G:LK0/c0;

    .line 22
    .line 23
    invoke-virtual {v0}, LK0/c0;->s()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_3

    .line 28
    .line 29
    invoke-virtual {p0}, LK0/J;->L()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    iget-object v0, p0, LK0/J;->t:Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 37
    .line 38
    invoke-direct {p0}, LK0/J;->B()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    iput-object v1, p0, LK0/J;->t:Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    iput-boolean v1, p0, LK0/J;->s:Z

    .line 46
    .line 47
    invoke-static {p0}, LK0/N;->b(LK0/J;)LK0/p0;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-interface {v1}, LK0/p0;->getSemanticsOwner()LR0/v;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v2, p0, v0}, LR0/v;->e(LR0/n;Landroidx/compose/ui/semantics/SemanticsConfiguration;)V

    .line 56
    .line 57
    .line 58
    invoke-interface {v1}, LK0/p0;->H()V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_3
    :goto_0
    const/4 v0, 0x1

    .line 63
    iput-boolean v0, p0, LK0/J;->s:Z

    .line 64
    .line 65
    return-void
.end method

.method public final V1(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, LK0/J;->c:J

    .line 2
    .line 3
    return-void
.end method

.method public W()I
    .locals 1

    .line 1
    iget-object v0, p0, LK0/J;->H:LK0/O;

    .line 2
    .line 3
    invoke-virtual {v0}, LK0/O;->i()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final W1(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK0/J;->m0:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-void
.end method

.method public final X()LK0/e0;
    .locals 1

    .line 1
    iget-object v0, p0, LK0/J;->G:LK0/c0;

    .line 2
    .line 3
    invoke-virtual {v0}, LK0/c0;->l()LK0/y;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final X0()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/J;->l0()LK0/X;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LK0/X;->X1()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public final X1(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK0/J;->n0:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-void
.end method

.method public final Y()LK0/e0;
    .locals 4

    .line 1
    iget-boolean v0, p0, LK0/J;->Y:Z

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    invoke-virtual {p0}, LK0/J;->X()LK0/e0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, LK0/J;->w0()LK0/e0;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, LK0/e0;->P2()LK0/e0;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/4 v2, 0x0

    .line 18
    iput-object v2, p0, LK0/J;->X:LK0/e0;

    .line 19
    .line 20
    :goto_0
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-nez v3, :cond_3

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {v0}, LK0/e0;->H2()LK0/o0;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    move-object v3, v2

    .line 34
    :goto_1
    if-eqz v3, :cond_1

    .line 35
    .line 36
    iput-object v0, p0, LK0/J;->X:LK0/e0;

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_1
    if-eqz v0, :cond_2

    .line 40
    .line 41
    invoke-virtual {v0}, LK0/e0;->P2()LK0/e0;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    goto :goto_0

    .line 46
    :cond_2
    move-object v0, v2

    .line 47
    goto :goto_0

    .line 48
    :cond_3
    :goto_2
    iget-object v0, p0, LK0/J;->X:LK0/e0;

    .line 49
    .line 50
    if-eqz v0, :cond_5

    .line 51
    .line 52
    invoke-virtual {v0}, LK0/e0;->H2()LK0/o0;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    if-eqz v1, :cond_4

    .line 57
    .line 58
    goto :goto_3

    .line 59
    :cond_4
    const-string v0, "layer was not set"

    .line 60
    .line 61
    invoke-static {v0}, LH0/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    .line 62
    .line 63
    .line 64
    new-instance v0, LTd/k;

    .line 65
    .line 66
    invoke-direct {v0}, LTd/k;-><init>()V

    .line 67
    .line 68
    .line 69
    throw v0

    .line 70
    :cond_5
    :goto_3
    return-object v0
.end method

.method public final Y0()Ljava/lang/Boolean;
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/J;->i0()LK0/V;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, LK0/V;->p()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    return-object v0
.end method

.method public final Y1(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, LK0/J;->e:J

    .line 2
    .line 3
    return-void
.end method

.method public Z()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, LK0/J;->p:Landroidx/compose/ui/viewinterop/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/compose/ui/viewinterop/b;->getInteropView()Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public final Z0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LK0/J;->h:Z

    .line 2
    .line 3
    return v0
.end method

.method public final Z1(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LK0/J;->f:Z

    .line 2
    .line 3
    return-void
.end method

.method public a()V
    .locals 3

    .line 1
    iget-object v0, p0, LK0/J;->p:Landroidx/compose/ui/viewinterop/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/compose/ui/viewinterop/b;->a()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, LK0/J;->I:Landroidx/compose/ui/layout/j;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0}, Landroidx/compose/ui/layout/j;->a()V

    .line 13
    .line 14
    .line 15
    :cond_1
    invoke-virtual {p0}, LK0/J;->w0()LK0/e0;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p0}, LK0/J;->X()LK0/e0;

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
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-nez v2, :cond_2

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    invoke-virtual {v0}, LK0/e0;->j3()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, LK0/e0;->O2()LK0/e0;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    return-void
.end method

.method public final a0()Landroidx/compose/ui/viewinterop/b;
    .locals 1

    .line 1
    iget-object v0, p0, LK0/J;->p:Landroidx/compose/ui/viewinterop/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final a1(Li1/b;)Z
    .locals 3

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, LK0/J;->i:LK0/J;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, LK0/J;->i0()LK0/V;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Li1/b;->r()J

    .line 15
    .line 16
    .line 17
    move-result-wide v1

    .line 18
    invoke-virtual {v0, v1, v2}, LK0/V;->g2(J)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    return p1

    .line 23
    :cond_0
    const/4 p1, 0x0

    .line 24
    return p1
.end method

.method public a2(I)V
    .locals 0

    .line 1
    iput p1, p0, LK0/J;->b:I

    .line 2
    .line 3
    return-void
.end method

.method public b()Z
    .locals 1

    .line 1
    iget-object v0, p0, LK0/J;->o:LK0/p0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

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

.method public final b0()LK0/J$g;
    .locals 1

    .line 1
    iget-object v0, p0, LK0/J;->D:LK0/J$g;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b2(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LK0/J;->s:Z

    .line 2
    .line 3
    return-void
.end method

.method public c(Li1/d;)V
    .locals 1

    .line 1
    iget-object v0, p0, LK0/J;->z:Li1/d;

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
    iput-object p1, p0, LK0/J;->z:Li1/d;

    .line 10
    .line 11
    invoke-direct {p0}, LK0/J;->r1()V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, LK0/J;->G:LK0/c0;

    .line 15
    .line 16
    invoke-virtual {p1}, LK0/c0;->k()Landroidx/compose/ui/e$c;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    :goto_0
    if-eqz p1, :cond_0

    .line 21
    .line 22
    invoke-interface {p1}, LK0/j;->onDensityChange()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    return-void
.end method

.method public final c0()J
    .locals 2

    .line 1
    iget-wide v0, p0, LK0/J;->d:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final c1()V
    .locals 2

    .line 1
    iget-object v0, p0, LK0/J;->D:LK0/J$g;

    .line 2
    .line 3
    sget-object v1, LK0/J$g;->c:LK0/J$g;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, LK0/J;->D()V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, LK0/J;->i0()LK0/V;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, LK0/V;->h2()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final c2(Landroidx/compose/ui/layout/j;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK0/J;->I:Landroidx/compose/ui/layout/j;

    .line 2
    .line 3
    return-void
.end method

.method public d(Li1/t;)V
    .locals 1

    .line 1
    iget-object v0, p0, LK0/J;->A:Li1/t;

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, LK0/J;->A:Li1/t;

    .line 6
    .line 7
    invoke-direct {p0}, LK0/J;->r1()V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, LK0/J;->G:LK0/c0;

    .line 11
    .line 12
    invoke-virtual {p1}, LK0/c0;->k()Landroidx/compose/ui/e$c;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    :goto_0
    if-eqz p1, :cond_0

    .line 17
    .line 18
    invoke-interface {p1}, LK0/j;->onLayoutDirectionChange()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void
.end method

.method public final d0()LK0/O;
    .locals 1

    .line 1
    iget-object v0, p0, LK0/J;->H:LK0/O;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d1()V
    .locals 1

    .line 1
    iget-object v0, p0, LK0/J;->H:LK0/O;

    .line 2
    .line 3
    invoke-virtual {v0}, LK0/O;->D()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final d2()V
    .locals 1

    .line 1
    iget v0, p0, LK0/J;->j:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, LK0/J;->v1()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public e()Landroidx/compose/ui/semantics/SemanticsConfiguration;
    .locals 2

    .line 1
    invoke-virtual {p0}, LK0/J;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {p0}, LK0/J;->z()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_2

    .line 12
    .line 13
    iget-object v0, p0, LK0/J;->G:LK0/c0;

    .line 14
    .line 15
    const/16 v1, 0x8

    .line 16
    .line 17
    invoke-static {v1}, LK0/g0;->a(I)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-virtual {v0, v1}, LK0/c0;->q(I)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    sget-boolean v0, Ll0/h;->c:Z

    .line 29
    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    iget-object v0, p0, LK0/J;->t:Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 33
    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    invoke-direct {p0}, LK0/J;->B()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iput-object v0, p0, LK0/J;->t:Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 41
    .line 42
    :cond_1
    iget-object v0, p0, LK0/J;->t:Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 43
    .line 44
    return-object v0

    .line 45
    :cond_2
    :goto_0
    const/4 v0, 0x0

    .line 46
    return-object v0
.end method

.method public final e0()Z
    .locals 1

    .line 1
    iget-object v0, p0, LK0/J;->H:LK0/O;

    .line 2
    .line 3
    invoke-virtual {v0}, LK0/O;->m()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final e1()V
    .locals 1

    .line 1
    iget-object v0, p0, LK0/J;->H:LK0/O;

    .line 2
    .line 3
    invoke-virtual {v0}, LK0/O;->E()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public f(I)V
    .locals 0

    .line 1
    iput p1, p0, LK0/J;->g:I

    .line 2
    .line 3
    return-void
.end method

.method public final f0()LK0/J$e;
    .locals 1

    .line 1
    iget-object v0, p0, LK0/J;->H:LK0/O;

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

.method public final f1()V
    .locals 1

    .line 1
    iget-object v0, p0, LK0/J;->H:LK0/O;

    .line 2
    .line 3
    invoke-virtual {v0}, LK0/O;->F()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public g()LR0/n;
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/J;->A0()LK0/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final g0()Z
    .locals 1

    .line 1
    iget-object v0, p0, LK0/J;->H:LK0/O;

    .line 2
    .line 3
    invoke-virtual {v0}, LK0/O;->r()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final g1()V
    .locals 1

    .line 1
    iget-object v0, p0, LK0/J;->H:LK0/O;

    .line 2
    .line 3
    invoke-virtual {v0}, LK0/O;->G()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public getLayoutDirection()Li1/t;
    .locals 1

    .line 1
    iget-object v0, p0, LK0/J;->A:Li1/t;

    .line 2
    .line 3
    return-object v0
.end method

.method public h()V
    .locals 1

    .line 1
    iget-object v0, p0, LK0/J;->p:Landroidx/compose/ui/viewinterop/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/compose/ui/viewinterop/b;->h()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, LK0/J;->I:Landroidx/compose/ui/layout/j;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0}, Landroidx/compose/ui/layout/j;->h()V

    .line 13
    .line 14
    .line 15
    :cond_1
    const/4 v0, 0x1

    .line 16
    iput-boolean v0, p0, LK0/J;->q0:Z

    .line 17
    .line 18
    invoke-direct {p0}, LK0/J;->K1()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, LK0/J;->b()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_3

    .line 26
    .line 27
    sget-boolean v0, Ll0/h;->c:Z

    .line 28
    .line 29
    if-nez v0, :cond_2

    .line 30
    .line 31
    invoke-virtual {p0}, LK0/J;->V0()V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    const/4 v0, 0x0

    .line 36
    iput-object v0, p0, LK0/J;->t:Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    iput-boolean v0, p0, LK0/J;->s:Z

    .line 40
    .line 41
    :cond_3
    :goto_0
    iget-object v0, p0, LK0/J;->o:LK0/p0;

    .line 42
    .line 43
    if-eqz v0, :cond_4

    .line 44
    .line 45
    invoke-interface {v0, p0}, LK0/p0;->K(LK0/J;)V

    .line 46
    .line 47
    .line 48
    :cond_4
    return-void
.end method

.method public final h0()Z
    .locals 1

    .line 1
    iget-object v0, p0, LK0/J;->H:LK0/O;

    .line 2
    .line 3
    invoke-virtual {v0}, LK0/O;->t()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final h1(I)I
    .locals 1

    .line 1
    invoke-direct {p0}, LK0/J;->v0()LK0/A;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, LK0/A;->b(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public i()V
    .locals 13

    .line 1
    iget-object v0, p0, LK0/J;->i:LK0/J;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v5, 0x5

    .line 6
    const/4 v6, 0x0

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x0

    .line 10
    move-object v1, p0

    .line 11
    invoke-static/range {v1 .. v6}, LK0/J;->E1(LK0/J;ZZZILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v11, 0x5

    .line 16
    const/4 v12, 0x0

    .line 17
    const/4 v8, 0x0

    .line 18
    const/4 v9, 0x0

    .line 19
    const/4 v10, 0x0

    .line 20
    move-object v7, p0

    .line 21
    invoke-static/range {v7 .. v12}, LK0/J;->I1(LK0/J;ZZZILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    move-object v1, v7

    .line 25
    :goto_0
    iget-object v0, v1, LK0/J;->H:LK0/O;

    .line 26
    .line 27
    invoke-virtual {v0}, LK0/O;->j()Li1/b;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    iget-object v2, v1, LK0/J;->o:LK0/p0;

    .line 34
    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    invoke-virtual {v0}, Li1/b;->r()J

    .line 38
    .line 39
    .line 40
    move-result-wide v3

    .line 41
    invoke-interface {v2, p0, v3, v4}, LK0/p0;->s(LK0/J;J)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_1
    iget-object v0, v1, LK0/J;->o:LK0/p0;

    .line 46
    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    const/4 v2, 0x1

    .line 50
    const/4 v3, 0x0

    .line 51
    const/4 v4, 0x0

    .line 52
    invoke-static {v0, v4, v2, v3}, LK0/p0;->j(LK0/p0;ZILjava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :cond_2
    return-void
.end method

.method public final i0()LK0/V;
    .locals 1

    .line 1
    iget-object v0, p0, LK0/J;->H:LK0/O;

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

.method public final i1(I)I
    .locals 1

    .line 1
    invoke-direct {p0}, LK0/J;->v0()LK0/A;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, LK0/A;->c(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public j(Landroidx/compose/ui/platform/A1;)V
    .locals 10

    .line 1
    iget-object v0, p0, LK0/J;->B:Landroidx/compose/ui/platform/A1;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_8

    .line 8
    .line 9
    iput-object p1, p0, LK0/J;->B:Landroidx/compose/ui/platform/A1;

    .line 10
    .line 11
    iget-object p1, p0, LK0/J;->G:LK0/c0;

    .line 12
    .line 13
    const/16 v0, 0x10

    .line 14
    .line 15
    invoke-static {v0}, LK0/g0;->a(I)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-static {p1}, LK0/c0;->c(LK0/c0;)I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    and-int/2addr v2, v1

    .line 24
    if-eqz v2, :cond_8

    .line 25
    .line 26
    invoke-virtual {p1}, LK0/c0;->k()Landroidx/compose/ui/e$c;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    :goto_0
    if-eqz p1, :cond_8

    .line 31
    .line 32
    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    and-int/2addr v2, v1

    .line 37
    if-eqz v2, :cond_7

    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    move-object v3, p1

    .line 41
    move-object v4, v2

    .line 42
    :goto_1
    if-eqz v3, :cond_7

    .line 43
    .line 44
    instance-of v5, v3, LK0/v0;

    .line 45
    .line 46
    if-eqz v5, :cond_0

    .line 47
    .line 48
    check-cast v3, LK0/v0;

    .line 49
    .line 50
    invoke-interface {v3}, LK0/v0;->x1()V

    .line 51
    .line 52
    .line 53
    goto :goto_4

    .line 54
    :cond_0
    invoke-virtual {v3}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    and-int/2addr v5, v1

    .line 59
    if-eqz v5, :cond_6

    .line 60
    .line 61
    instance-of v5, v3, LK0/m;

    .line 62
    .line 63
    if-eqz v5, :cond_6

    .line 64
    .line 65
    move-object v5, v3

    .line 66
    check-cast v5, LK0/m;

    .line 67
    .line 68
    invoke-virtual {v5}, LK0/m;->F1()Landroidx/compose/ui/e$c;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    const/4 v6, 0x0

    .line 73
    move v7, v6

    .line 74
    :goto_2
    const/4 v8, 0x1

    .line 75
    if-eqz v5, :cond_5

    .line 76
    .line 77
    invoke-virtual {v5}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 78
    .line 79
    .line 80
    move-result v9

    .line 81
    and-int/2addr v9, v1

    .line 82
    if-eqz v9, :cond_4

    .line 83
    .line 84
    add-int/lit8 v7, v7, 0x1

    .line 85
    .line 86
    if-ne v7, v8, :cond_1

    .line 87
    .line 88
    move-object v3, v5

    .line 89
    goto :goto_3

    .line 90
    :cond_1
    if-nez v4, :cond_2

    .line 91
    .line 92
    new-instance v4, La0/c;

    .line 93
    .line 94
    new-array v8, v0, [Landroidx/compose/ui/e$c;

    .line 95
    .line 96
    invoke-direct {v4, v8, v6}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 97
    .line 98
    .line 99
    :cond_2
    if-eqz v3, :cond_3

    .line 100
    .line 101
    invoke-virtual {v4, v3}, La0/c;->c(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-object v3, v2

    .line 105
    :cond_3
    invoke-virtual {v4, v5}, La0/c;->c(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    :cond_4
    :goto_3
    invoke-virtual {v5}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    goto :goto_2

    .line 113
    :cond_5
    if-ne v7, v8, :cond_6

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_6
    :goto_4
    invoke-static {v4}, LK0/k;->b(La0/c;)Landroidx/compose/ui/e$c;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    goto :goto_1

    .line 121
    :cond_7
    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->getAggregateChildKindSet$ui_release()I

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    and-int/2addr v2, v1

    .line 126
    if-eqz v2, :cond_8

    .line 127
    .line 128
    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    goto :goto_0

    .line 133
    :cond_8
    return-void
.end method

.method public final j0()LK0/J;
    .locals 1

    .line 1
    iget-object v0, p0, LK0/J;->i:LK0/J;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j1(I)I
    .locals 1

    .line 1
    invoke-direct {p0}, LK0/J;->v0()LK0/A;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, LK0/A;->d(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public k(LY/I;)V
    .locals 9

    .line 1
    iput-object p1, p0, LK0/J;->C:LY/I;

    .line 2
    .line 3
    invoke-static {}, Landroidx/compose/ui/platform/w0;->e()LY/b1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {p1, v0}, LY/I;->a(LY/D;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Li1/d;

    .line 12
    .line 13
    invoke-virtual {p0, v0}, LK0/J;->c(Li1/d;)V

    .line 14
    .line 15
    .line 16
    invoke-static {}, Landroidx/compose/ui/platform/w0;->k()LY/b1;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {p1, v0}, LY/I;->a(LY/D;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Li1/t;

    .line 25
    .line 26
    invoke-virtual {p0, v0}, LK0/J;->d(Li1/t;)V

    .line 27
    .line 28
    .line 29
    invoke-static {}, Landroidx/compose/ui/platform/w0;->r()LY/b1;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-interface {p1, v0}, LY/I;->a(LY/D;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    check-cast p1, Landroidx/compose/ui/platform/A1;

    .line 38
    .line 39
    invoke-virtual {p0, p1}, LK0/J;->j(Landroidx/compose/ui/platform/A1;)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, LK0/J;->G:LK0/c0;

    .line 43
    .line 44
    const v0, 0x8000

    .line 45
    .line 46
    .line 47
    invoke-static {v0}, LK0/g0;->a(I)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    invoke-static {p1}, LK0/c0;->c(LK0/c0;)I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    and-int/2addr v1, v0

    .line 56
    if-eqz v1, :cond_9

    .line 57
    .line 58
    invoke-virtual {p1}, LK0/c0;->k()Landroidx/compose/ui/e$c;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    :goto_0
    if-eqz p1, :cond_9

    .line 63
    .line 64
    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    and-int/2addr v1, v0

    .line 69
    if-eqz v1, :cond_8

    .line 70
    .line 71
    const/4 v1, 0x0

    .line 72
    move-object v2, p1

    .line 73
    move-object v3, v1

    .line 74
    :goto_1
    if-eqz v2, :cond_8

    .line 75
    .line 76
    instance-of v4, v2, LK0/h;

    .line 77
    .line 78
    const/4 v5, 0x1

    .line 79
    if-eqz v4, :cond_1

    .line 80
    .line 81
    check-cast v2, LK0/h;

    .line 82
    .line 83
    invoke-interface {v2}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-virtual {v2}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    if-eqz v4, :cond_0

    .line 92
    .line 93
    invoke-static {v2}, LK0/h0;->e(Landroidx/compose/ui/e$c;)V

    .line 94
    .line 95
    .line 96
    goto :goto_4

    .line 97
    :cond_0
    invoke-virtual {v2, v5}, Landroidx/compose/ui/e$c;->setUpdatedNodeAwaitingAttachForInvalidation$ui_release(Z)V

    .line 98
    .line 99
    .line 100
    goto :goto_4

    .line 101
    :cond_1
    invoke-virtual {v2}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    and-int/2addr v4, v0

    .line 106
    if-eqz v4, :cond_7

    .line 107
    .line 108
    instance-of v4, v2, LK0/m;

    .line 109
    .line 110
    if-eqz v4, :cond_7

    .line 111
    .line 112
    move-object v4, v2

    .line 113
    check-cast v4, LK0/m;

    .line 114
    .line 115
    invoke-virtual {v4}, LK0/m;->F1()Landroidx/compose/ui/e$c;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    const/4 v6, 0x0

    .line 120
    move v7, v6

    .line 121
    :goto_2
    if-eqz v4, :cond_6

    .line 122
    .line 123
    invoke-virtual {v4}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 124
    .line 125
    .line 126
    move-result v8

    .line 127
    and-int/2addr v8, v0

    .line 128
    if-eqz v8, :cond_5

    .line 129
    .line 130
    add-int/lit8 v7, v7, 0x1

    .line 131
    .line 132
    if-ne v7, v5, :cond_2

    .line 133
    .line 134
    move-object v2, v4

    .line 135
    goto :goto_3

    .line 136
    :cond_2
    if-nez v3, :cond_3

    .line 137
    .line 138
    new-instance v3, La0/c;

    .line 139
    .line 140
    const/16 v8, 0x10

    .line 141
    .line 142
    new-array v8, v8, [Landroidx/compose/ui/e$c;

    .line 143
    .line 144
    invoke-direct {v3, v8, v6}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 145
    .line 146
    .line 147
    :cond_3
    if-eqz v2, :cond_4

    .line 148
    .line 149
    invoke-virtual {v3, v2}, La0/c;->c(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-object v2, v1

    .line 153
    :cond_4
    invoke-virtual {v3, v4}, La0/c;->c(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    :cond_5
    :goto_3
    invoke-virtual {v4}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    goto :goto_2

    .line 161
    :cond_6
    if-ne v7, v5, :cond_7

    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_7
    :goto_4
    invoke-static {v3}, LK0/k;->b(La0/c;)Landroidx/compose/ui/e$c;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    goto :goto_1

    .line 169
    :cond_8
    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->getAggregateChildKindSet$ui_release()I

    .line 170
    .line 171
    .line 172
    move-result v1

    .line 173
    and-int/2addr v1, v0

    .line 174
    if-eqz v1, :cond_9

    .line 175
    .line 176
    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    goto :goto_0

    .line 181
    :cond_9
    return-void
.end method

.method public final k0()LK0/L;
    .locals 1

    .line 1
    invoke-static {p0}, LK0/N;->b(LK0/J;)LK0/p0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, LK0/p0;->getSharedDrawScope()LK0/L;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final k1(I)I
    .locals 1

    .line 1
    invoke-direct {p0}, LK0/J;->v0()LK0/A;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, LK0/A;->e(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public l()V
    .locals 11

    .line 1
    invoke-virtual {p0}, LK0/J;->X()LK0/e0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/16 v1, 0x80

    .line 6
    .line 7
    invoke-static {v1}, LK0/g0;->a(I)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-static {v1}, LK0/h0;->i(I)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-virtual {v0}, LK0/e0;->N2()Landroidx/compose/ui/e$c;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {v3}, Landroidx/compose/ui/e$c;->getParent$ui_release()Landroidx/compose/ui/e$c;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    if-nez v3, :cond_1

    .line 27
    .line 28
    goto/16 :goto_6

    .line 29
    .line 30
    :cond_1
    :goto_0
    invoke-static {v0, v2}, LK0/e0;->k2(LK0/e0;Z)Landroidx/compose/ui/e$c;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    :goto_1
    if-eqz v0, :cond_a

    .line 35
    .line 36
    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->getAggregateChildKindSet$ui_release()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    and-int/2addr v2, v1

    .line 41
    if-eqz v2, :cond_a

    .line 42
    .line 43
    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    and-int/2addr v2, v1

    .line 48
    if-eqz v2, :cond_9

    .line 49
    .line 50
    const/4 v2, 0x0

    .line 51
    move-object v4, v0

    .line 52
    move-object v5, v2

    .line 53
    :goto_2
    if-eqz v4, :cond_9

    .line 54
    .line 55
    instance-of v6, v4, LK0/D;

    .line 56
    .line 57
    if-eqz v6, :cond_2

    .line 58
    .line 59
    check-cast v4, LK0/D;

    .line 60
    .line 61
    invoke-virtual {p0}, LK0/J;->X()LK0/e0;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    invoke-interface {v4, v6}, LK0/D;->L(LI0/p;)V

    .line 66
    .line 67
    .line 68
    goto :goto_5

    .line 69
    :cond_2
    invoke-virtual {v4}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    and-int/2addr v6, v1

    .line 74
    if-eqz v6, :cond_8

    .line 75
    .line 76
    instance-of v6, v4, LK0/m;

    .line 77
    .line 78
    if-eqz v6, :cond_8

    .line 79
    .line 80
    move-object v6, v4

    .line 81
    check-cast v6, LK0/m;

    .line 82
    .line 83
    invoke-virtual {v6}, LK0/m;->F1()Landroidx/compose/ui/e$c;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    const/4 v7, 0x0

    .line 88
    move v8, v7

    .line 89
    :goto_3
    const/4 v9, 0x1

    .line 90
    if-eqz v6, :cond_7

    .line 91
    .line 92
    invoke-virtual {v6}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 93
    .line 94
    .line 95
    move-result v10

    .line 96
    and-int/2addr v10, v1

    .line 97
    if-eqz v10, :cond_6

    .line 98
    .line 99
    add-int/lit8 v8, v8, 0x1

    .line 100
    .line 101
    if-ne v8, v9, :cond_3

    .line 102
    .line 103
    move-object v4, v6

    .line 104
    goto :goto_4

    .line 105
    :cond_3
    if-nez v5, :cond_4

    .line 106
    .line 107
    new-instance v5, La0/c;

    .line 108
    .line 109
    const/16 v9, 0x10

    .line 110
    .line 111
    new-array v9, v9, [Landroidx/compose/ui/e$c;

    .line 112
    .line 113
    invoke-direct {v5, v9, v7}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 114
    .line 115
    .line 116
    :cond_4
    if-eqz v4, :cond_5

    .line 117
    .line 118
    invoke-virtual {v5, v4}, La0/c;->c(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-object v4, v2

    .line 122
    :cond_5
    invoke-virtual {v5, v6}, La0/c;->c(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    :cond_6
    :goto_4
    invoke-virtual {v6}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    goto :goto_3

    .line 130
    :cond_7
    if-ne v8, v9, :cond_8

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_8
    :goto_5
    invoke-static {v5}, LK0/k;->b(La0/c;)Landroidx/compose/ui/e$c;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    goto :goto_2

    .line 138
    :cond_9
    if-eq v0, v3, :cond_a

    .line 139
    .line 140
    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    goto :goto_1

    .line 145
    :cond_a
    :goto_6
    return-void
.end method

.method public final l0()LK0/X;
    .locals 1

    .line 1
    iget-object v0, p0, LK0/J;->H:LK0/O;

    .line 2
    .line 3
    invoke-virtual {v0}, LK0/O;->v()LK0/X;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final l1(I)I
    .locals 1

    .line 1
    invoke-direct {p0}, LK0/J;->v0()LK0/A;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, LK0/A;->f(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public m(Landroidx/compose/ui/e;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, LK0/J;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, LK0/J;->q0()Landroidx/compose/ui/e;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 17
    :goto_1
    if-nez v0, :cond_2

    .line 18
    .line 19
    const-string v0, "Modifiers are not supported on virtual LayoutNodes"

    .line 20
    .line 21
    invoke-static {v0}, LH0/a;->a(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :cond_2
    invoke-virtual {p0}, LK0/J;->z()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_3

    .line 29
    .line 30
    const-string v0, "modifier is updated when deactivated"

    .line 31
    .line 32
    invoke-static {v0}, LH0/a;->a(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    :cond_3
    invoke-virtual {p0}, LK0/J;->b()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_5

    .line 40
    .line 41
    invoke-direct {p0, p1}, LK0/J;->w(Landroidx/compose/ui/e;)V

    .line 42
    .line 43
    .line 44
    iget-boolean p1, p0, LK0/J;->s:Z

    .line 45
    .line 46
    if-eqz p1, :cond_4

    .line 47
    .line 48
    invoke-virtual {p0}, LK0/J;->V0()V

    .line 49
    .line 50
    .line 51
    :cond_4
    return-void

    .line 52
    :cond_5
    iput-object p1, p0, LK0/J;->l0:Landroidx/compose/ui/e;

    .line 53
    .line 54
    return-void
.end method

.method public final m0()Z
    .locals 1

    .line 1
    iget-object v0, p0, LK0/J;->H:LK0/O;

    .line 2
    .line 3
    invoke-virtual {v0}, LK0/O;->w()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final m1(I)I
    .locals 1

    .line 1
    invoke-direct {p0}, LK0/J;->v0()LK0/A;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, LK0/A;->g(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public n()Ljava/util/List;
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/J;->P()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public n0()LI0/B;
    .locals 1

    .line 1
    iget-object v0, p0, LK0/J;->x:LI0/B;

    .line 2
    .line 3
    return-object v0
.end method

.method public final n1(I)I
    .locals 1

    .line 1
    invoke-direct {p0}, LK0/J;->v0()LK0/A;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, LK0/A;->h(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public o(LI0/B;)V
    .locals 1

    .line 1
    iget-object v0, p0, LK0/J;->x:LI0/B;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iput-object p1, p0, LK0/J;->x:LI0/B;

    .line 10
    .line 11
    iget-object p1, p0, LK0/J;->y:LK0/A;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, LK0/J;->n0()LI0/B;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p1, v0}, LK0/A;->k(LI0/B;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {p0}, LK0/J;->R0()V

    .line 23
    .line 24
    .line 25
    :cond_1
    return-void
.end method

.method public final o0()LK0/J$g;
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/J;->l0()LK0/X;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LK0/X;->Q1()LK0/J$g;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final o1(I)I
    .locals 1

    .line 1
    invoke-direct {p0}, LK0/J;->v0()LK0/A;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, LK0/A;->i(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public p()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/J;->l0()LK0/X;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LK0/X;->p()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public final p0()LK0/J$g;
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/J;->i0()LK0/V;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {v0}, LK0/V;->P1()LK0/J$g;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    return-object v0

    .line 15
    :cond_1
    :goto_0
    sget-object v0, LK0/J$g;->c:LK0/J$g;

    .line 16
    .line 17
    return-object v0
.end method

.method public final p1(III)V
    .locals 4

    .line 1
    if-ne p1, p2, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    const/4 v0, 0x0

    .line 5
    :goto_0
    if-ge v0, p3, :cond_3

    .line 6
    .line 7
    if-le p1, p2, :cond_1

    .line 8
    .line 9
    add-int v1, p1, v0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_1
    move v1, p1

    .line 13
    :goto_1
    if-le p1, p2, :cond_2

    .line 14
    .line 15
    add-int v2, p2, v0

    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_2
    add-int v2, p2, p3

    .line 19
    .line 20
    add-int/lit8 v2, v2, -0x2

    .line 21
    .line 22
    :goto_2
    iget-object v3, p0, LK0/J;->k:LK0/a0;

    .line 23
    .line 24
    invoke-virtual {v3, v1}, LK0/a0;->d(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, LK0/J;

    .line 29
    .line 30
    iget-object v3, p0, LK0/J;->k:LK0/a0;

    .line 31
    .line 32
    invoke-virtual {v3, v2, v1}, LK0/a0;->a(ILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    add-int/lit8 v0, v0, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_3
    invoke-virtual {p0}, LK0/J;->t1()V

    .line 39
    .line 40
    .line 41
    invoke-direct {p0}, LK0/J;->W0()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, LK0/J;->R0()V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public q()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/J;->w0()LK0/e0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LK0/e0;->b3()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public q0()Landroidx/compose/ui/e;
    .locals 1

    .line 1
    iget-object v0, p0, LK0/J;->Z:Landroidx/compose/ui/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public r0()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LK0/J;->G:LK0/c0;

    .line 2
    .line 3
    invoke-virtual {v0}, LK0/c0;->n()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final s0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LK0/J;->o0:Z

    .line 2
    .line 3
    return v0
.end method

.method public s1()V
    .locals 3

    .line 1
    invoke-virtual {p0}, LK0/J;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "onReuse is only expected on attached node"

    .line 8
    .line 9
    invoke-static {v0}, LH0/a;->a(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, LK0/J;->p:Landroidx/compose/ui/viewinterop/b;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {v0}, Landroidx/compose/ui/viewinterop/b;->E()V

    .line 17
    .line 18
    .line 19
    :cond_1
    iget-object v0, p0, LK0/J;->I:Landroidx/compose/ui/layout/j;

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    invoke-virtual {v0}, Landroidx/compose/ui/layout/j;->I()V

    .line 24
    .line 25
    .line 26
    :cond_2
    const/4 v0, 0x0

    .line 27
    iput-boolean v0, p0, LK0/J;->u:Z

    .line 28
    .line 29
    invoke-virtual {p0}, LK0/J;->z()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    iput-boolean v0, p0, LK0/J;->q0:Z

    .line 36
    .line 37
    sget-boolean v0, Ll0/h;->c:Z

    .line 38
    .line 39
    if-nez v0, :cond_4

    .line 40
    .line 41
    invoke-virtual {p0}, LK0/J;->V0()V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_3
    invoke-direct {p0}, LK0/J;->K1()V

    .line 46
    .line 47
    .line 48
    :cond_4
    :goto_0
    invoke-virtual {p0}, LK0/J;->y()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    invoke-static {}, LR0/r;->d()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    invoke-virtual {p0, v1}, LK0/J;->a2(I)V

    .line 57
    .line 58
    .line 59
    iget-object v1, p0, LK0/J;->o:LK0/p0;

    .line 60
    .line 61
    if-eqz v1, :cond_5

    .line 62
    .line 63
    invoke-interface {v1, p0, v0}, LK0/p0;->k(LK0/J;I)V

    .line 64
    .line 65
    .line 66
    :cond_5
    iget-object v1, p0, LK0/J;->G:LK0/c0;

    .line 67
    .line 68
    invoke-virtual {v1}, LK0/c0;->t()V

    .line 69
    .line 70
    .line 71
    iget-object v1, p0, LK0/J;->G:LK0/c0;

    .line 72
    .line 73
    invoke-virtual {v1}, LK0/c0;->z()V

    .line 74
    .line 75
    .line 76
    sget-boolean v1, Ll0/h;->c:Z

    .line 77
    .line 78
    if-eqz v1, :cond_6

    .line 79
    .line 80
    iget-object v1, p0, LK0/J;->G:LK0/c0;

    .line 81
    .line 82
    const/16 v2, 0x8

    .line 83
    .line 84
    invoke-static {v2}, LK0/g0;->a(I)I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    invoke-virtual {v1, v2}, LK0/c0;->q(I)Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-eqz v1, :cond_6

    .line 93
    .line 94
    invoke-virtual {p0}, LK0/J;->V0()V

    .line 95
    .line 96
    .line 97
    :cond_6
    invoke-virtual {p0, p0}, LK0/J;->J1(LK0/J;)V

    .line 98
    .line 99
    .line 100
    iget-object v1, p0, LK0/J;->o:LK0/p0;

    .line 101
    .line 102
    if-eqz v1, :cond_7

    .line 103
    .line 104
    invoke-interface {v1, p0, v0}, LK0/p0;->l(LK0/J;I)V

    .line 105
    .line 106
    .line 107
    :cond_7
    return-void
.end method

.method public final t0()LK0/c0;
    .locals 1

    .line 1
    iget-object v0, p0, LK0/J;->G:LK0/c0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final t1()V
    .locals 1

    .line 1
    iget-boolean v0, p0, LK0/J;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, LK0/J;->A0()LK0/J;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, LK0/J;->t1()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void

    .line 15
    :cond_1
    const/4 v0, 0x1

    .line 16
    iput-boolean v0, p0, LK0/J;->w:Z

    .line 17
    .line 18
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-static {p0, v1}, Landroidx/compose/ui/platform/Y0;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string v1, " children: "

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, LK0/J;->P()Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, " measurePolicy: "

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, LK0/J;->n0()LI0/B;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v1, " deactivated: "

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, LK0/J;->z()Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    return-object v0
.end method

.method public final u0()J
    .locals 2

    .line 1
    iget-wide v0, p0, LK0/J;->c:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final u1(II)V
    .locals 8

    .line 1
    iget-object v0, p0, LK0/J;->D:LK0/J$g;

    .line 2
    .line 3
    sget-object v1, LK0/J$g;->c:LK0/J$g;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, LK0/J;->D()V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, LK0/J;->A0()LK0/J;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    invoke-virtual {v0}, LK0/J;->X()LK0/e0;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    invoke-virtual {v0}, LK0/T;->O1()Landroidx/compose/ui/layout/s$a;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    :goto_0
    move-object v1, v0

    .line 30
    goto :goto_2

    .line 31
    :cond_2
    :goto_1
    invoke-static {p0}, LK0/N;->b(LK0/J;)LK0/p0;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-interface {v0}, LK0/p0;->getPlacementScope()Landroidx/compose/ui/layout/s$a;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    goto :goto_0

    .line 40
    :goto_2
    invoke-virtual {p0}, LK0/J;->l0()LK0/X;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    const/4 v6, 0x4

    .line 45
    const/4 v7, 0x0

    .line 46
    const/4 v5, 0x0

    .line 47
    move v3, p1

    .line 48
    move v4, p2

    .line 49
    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/s$a;->W(Landroidx/compose/ui/layout/s$a;Landroidx/compose/ui/layout/s;IIFILjava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public final w0()LK0/e0;
    .locals 1

    .line 1
    iget-object v0, p0, LK0/J;->G:LK0/c0;

    .line 2
    .line 3
    invoke-virtual {v0}, LK0/c0;->o()LK0/e0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final w1(Li1/b;)Z
    .locals 3

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, LK0/J;->D:LK0/J$g;

    .line 4
    .line 5
    sget-object v1, LK0/J$g;->c:LK0/J$g;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, LK0/J;->C()V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0}, LK0/J;->l0()LK0/X;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p1}, Li1/b;->r()J

    .line 17
    .line 18
    .line 19
    move-result-wide v1

    .line 20
    invoke-virtual {v0, v1, v2}, LK0/X;->l2(J)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    return p1

    .line 25
    :cond_1
    const/4 p1, 0x0

    .line 26
    return p1
.end method

.method public x()LI0/p;
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/J;->X()LK0/e0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final x0()J
    .locals 2

    .line 1
    iget-wide v0, p0, LK0/J;->e:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public y()I
    .locals 1

    .line 1
    iget v0, p0, LK0/J;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public final y0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LK0/J;->f:Z

    .line 2
    .line 3
    return v0
.end method

.method public final y1()V
    .locals 2

    .line 1
    iget-object v0, p0, LK0/J;->k:LK0/a0;

    .line 2
    .line 3
    invoke-virtual {v0}, LK0/a0;->c()La0/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, La0/c;->p()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    add-int/lit8 v0, v0, -0x1

    .line 12
    .line 13
    :goto_0
    const/4 v1, -0x1

    .line 14
    if-ge v1, v0, :cond_0

    .line 15
    .line 16
    iget-object v1, p0, LK0/J;->k:LK0/a0;

    .line 17
    .line 18
    invoke-virtual {v1}, LK0/a0;->c()La0/c;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-object v1, v1, La0/c;->a:[Ljava/lang/Object;

    .line 23
    .line 24
    aget-object v1, v1, v0

    .line 25
    .line 26
    check-cast v1, LK0/J;

    .line 27
    .line 28
    invoke-direct {p0, v1}, LK0/J;->q1(LK0/J;)V

    .line 29
    .line 30
    .line 31
    add-int/lit8 v0, v0, -0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    iget-object v0, p0, LK0/J;->k:LK0/a0;

    .line 35
    .line 36
    invoke-virtual {v0}, LK0/a0;->b()V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public z()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LK0/J;->q0:Z

    .line 2
    .line 3
    return v0
.end method

.method public final z0()LK0/p0;
    .locals 1

    .line 1
    iget-object v0, p0, LK0/J;->o:LK0/p0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final z1(II)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ltz p2, :cond_0

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
    if-nez v1, :cond_1

    .line 8
    .line 9
    new-instance v1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v2, "count ("

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v2, ") must be greater than 0"

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {v1}, LH0/a;->a(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    add-int/2addr p2, p1

    .line 35
    sub-int/2addr p2, v0

    .line 36
    if-gt p1, p2, :cond_2

    .line 37
    .line 38
    :goto_1
    iget-object v0, p0, LK0/J;->k:LK0/a0;

    .line 39
    .line 40
    invoke-virtual {v0}, LK0/a0;->c()La0/c;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iget-object v0, v0, La0/c;->a:[Ljava/lang/Object;

    .line 45
    .line 46
    aget-object v0, v0, p2

    .line 47
    .line 48
    check-cast v0, LK0/J;

    .line 49
    .line 50
    invoke-direct {p0, v0}, LK0/J;->q1(LK0/J;)V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, LK0/J;->k:LK0/a0;

    .line 54
    .line 55
    invoke-virtual {v0, p2}, LK0/a0;->d(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    check-cast v0, LK0/J;

    .line 60
    .line 61
    if-eq p2, p1, :cond_2

    .line 62
    .line 63
    add-int/lit8 p2, p2, -0x1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    return-void
.end method
