.class public final Lo0/d;
.super Landroidx/compose/ui/e$c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LK0/I0;
.implements LK0/j;
.implements Lo0/f;
.implements LK0/D;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo0/d$a;
    }
.end annotation


# static fields
.field private static final g:Lo0/d$a;

.field public static final h:I


# instance fields
.field private a:Lkotlin/jvm/functions/Function2;

.field private final b:Lkotlin/jvm/functions/Function1;

.field private final c:Ljava/lang/Object;

.field private d:Lo0/d;

.field private e:Lo0/f;

.field private f:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lo0/d$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lo0/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lo0/d;->g:Lo0/d$a;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, Lo0/d;->h:I

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    .line 3
    iput-object p1, p0, Lo0/d;->a:Lkotlin/jvm/functions/Function2;

    .line 4
    iput-object p2, p0, Lo0/d;->b:Lkotlin/jvm/functions/Function1;

    .line 5
    sget-object p1, Lo0/d$a$a;->a:Lo0/d$a$a;

    iput-object p1, p0, Lo0/d;->c:Ljava/lang/Object;

    .line 6
    sget-object p1, Li1/r;->b:Li1/r$a;

    invoke-virtual {p1}, Li1/r$a;->a()J

    move-result-wide p1

    iput-wide p1, p0, Lo0/d;->f:J

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move-object p2, v0

    .line 1
    :cond_1
    invoke-direct {p0, p1, p2}, Lo0/d;-><init>(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final synthetic F1(Lo0/d;)Lo0/c;
    .locals 0

    .line 1
    invoke-direct {p0}, Lo0/d;->K1()Lo0/c;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic G1(Lo0/d;)Lkotlin/jvm/functions/Function1;
    .locals 0

    .line 1
    iget-object p0, p0, Lo0/d;->b:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic H1(Lo0/d;)Lo0/f;
    .locals 0

    .line 1
    iget-object p0, p0, Lo0/d;->e:Lo0/f;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic I1(Lo0/d;Lo0/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lo0/d;->d:Lo0/d;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic J1(Lo0/d;Lo0/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lo0/d;->e:Lo0/f;

    .line 2
    .line 3
    return-void
.end method

.method private final K1()Lo0/c;
    .locals 1

    .line 1
    invoke-static {p0}, LK0/k;->o(LK0/j;)LK0/p0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, LK0/p0;->getDragAndDropManager()Lo0/c;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method


# virtual methods
.method public B()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lo0/d;->c:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public E1(Lo0/b;)Z
    .locals 2

    .line 1
    new-instance v0, Lkotlin/jvm/internal/J;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlin/jvm/internal/J;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lo0/d$b;

    .line 7
    .line 8
    invoke-direct {v1, p1, p0, v0}, Lo0/d$b;-><init>(Lo0/b;Lo0/d;Lkotlin/jvm/internal/J;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0, v1}, Lo0/e;->c(LK0/I0;Lkotlin/jvm/functions/Function1;)V

    .line 12
    .line 13
    .line 14
    iget-boolean p1, v0, Lkotlin/jvm/internal/J;->a:Z

    .line 15
    .line 16
    return p1
.end method

.method public I(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lo0/d;->f:J

    .line 2
    .line 3
    return-void
.end method

.method public final L1()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lo0/d;->f:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public Q0(Lo0/b;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lo0/d;->d:Lo0/d;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lo0/d;->e:Lo0/f;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-interface {v0, p1}, Lo0/f;->Q0(Lo0/b;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    return p1

    .line 16
    :cond_1
    invoke-virtual {v0, p1}, Lo0/d;->Q0(Lo0/b;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    return p1
.end method

.method public U(Lo0/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lo0/d;->e:Lo0/f;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lo0/d;->d:Lo0/d;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lo0/d;->U(Lo0/b;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void

    .line 13
    :cond_1
    invoke-interface {v0, p1}, Lo0/f;->U(Lo0/b;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public X0(Lo0/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lo0/d;->e:Lo0/f;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lo0/d;->d:Lo0/d;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lo0/d;->X0(Lo0/b;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void

    .line 13
    :cond_1
    invoke-interface {v0, p1}, Lo0/f;->X0(Lo0/b;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public c0(Lo0/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lo0/d;->e:Lo0/f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lo0/f;->c0(Lo0/b;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lo0/d;->d:Lo0/d;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lo0/d;->c0(Lo0/b;)V

    .line 13
    .line 14
    .line 15
    :cond_1
    const/4 p1, 0x0

    .line 16
    iput-object p1, p0, Lo0/d;->d:Lo0/d;

    .line 17
    .line 18
    return-void
.end method

.method public onDetach()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lo0/d;->e:Lo0/f;

    .line 3
    .line 4
    iput-object v0, p0, Lo0/d;->d:Lo0/d;

    .line 5
    .line 6
    return-void
.end method

.method public v0(Lo0/b;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lo0/d;->d:Lo0/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Lo0/h;->a(Lo0/b;)J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    invoke-static {v0, v1, v2}, Lo0/e;->a(Lo0/d;J)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x1

    .line 14
    if-ne v1, v2, :cond_0

    .line 15
    .line 16
    move-object v1, v0

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    invoke-interface {p0}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_1

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    new-instance v1, Lkotlin/jvm/internal/N;

    .line 31
    .line 32
    invoke-direct {v1}, Lkotlin/jvm/internal/N;-><init>()V

    .line 33
    .line 34
    .line 35
    new-instance v2, Lo0/d$d;

    .line 36
    .line 37
    invoke-direct {v2, v1, p0, p1}, Lo0/d$d;-><init>(Lkotlin/jvm/internal/N;Lo0/d;Lo0/b;)V

    .line 38
    .line 39
    .line 40
    invoke-static {p0, v2}, LK0/J0;->f(LK0/I0;Lkotlin/jvm/functions/Function1;)V

    .line 41
    .line 42
    .line 43
    iget-object v1, v1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v1, LK0/I0;

    .line 46
    .line 47
    :goto_0
    check-cast v1, Lo0/d;

    .line 48
    .line 49
    :goto_1
    if-eqz v1, :cond_2

    .line 50
    .line 51
    if-nez v0, :cond_2

    .line 52
    .line 53
    invoke-static {v1, p1}, Lo0/e;->b(Lo0/f;Lo0/b;)V

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, Lo0/d;->e:Lo0/f;

    .line 57
    .line 58
    if-eqz v0, :cond_8

    .line 59
    .line 60
    invoke-interface {v0, p1}, Lo0/f;->c0(Lo0/b;)V

    .line 61
    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_2
    if-nez v1, :cond_4

    .line 65
    .line 66
    if-eqz v0, :cond_4

    .line 67
    .line 68
    iget-object v2, p0, Lo0/d;->e:Lo0/f;

    .line 69
    .line 70
    if-eqz v2, :cond_3

    .line 71
    .line 72
    invoke-static {v2, p1}, Lo0/e;->b(Lo0/f;Lo0/b;)V

    .line 73
    .line 74
    .line 75
    :cond_3
    invoke-virtual {v0, p1}, Lo0/d;->c0(Lo0/b;)V

    .line 76
    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_4
    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    if-nez v2, :cond_6

    .line 84
    .line 85
    if-eqz v1, :cond_5

    .line 86
    .line 87
    invoke-static {v1, p1}, Lo0/e;->b(Lo0/f;Lo0/b;)V

    .line 88
    .line 89
    .line 90
    :cond_5
    if-eqz v0, :cond_8

    .line 91
    .line 92
    invoke-virtual {v0, p1}, Lo0/d;->c0(Lo0/b;)V

    .line 93
    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_6
    if-eqz v1, :cond_7

    .line 97
    .line 98
    invoke-virtual {v1, p1}, Lo0/d;->v0(Lo0/b;)V

    .line 99
    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_7
    iget-object v0, p0, Lo0/d;->e:Lo0/f;

    .line 103
    .line 104
    if-eqz v0, :cond_8

    .line 105
    .line 106
    invoke-interface {v0, p1}, Lo0/f;->v0(Lo0/b;)V

    .line 107
    .line 108
    .line 109
    :cond_8
    :goto_2
    iput-object v1, p0, Lo0/d;->d:Lo0/d;

    .line 110
    .line 111
    return-void
.end method

.method public w0(Lo0/b;)V
    .locals 1

    .line 1
    new-instance v0, Lo0/d$c;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lo0/d$c;-><init>(Lo0/b;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Lo0/e;->c(LK0/I0;Lkotlin/jvm/functions/Function1;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
