.class public final Lo0/a;
.super Landroid/view/View$DragShadowBuilder;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Li1/d;

.field private final b:J

.field private final c:Lkotlin/jvm/functions/Function1;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method private constructor <init>(Li1/d;JLkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Landroid/view/View$DragShadowBuilder;-><init>()V

    .line 3
    iput-object p1, p0, Lo0/a;->a:Li1/d;

    .line 4
    iput-wide p2, p0, Lo0/a;->b:J

    .line 5
    iput-object p4, p0, Lo0/a;->c:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(Li1/d;JLkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lo0/a;-><init>(Li1/d;JLkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public onDrawShadow(Landroid/graphics/Canvas;)V
    .locals 12

    .line 1
    new-instance v0, Lu0/a;

    .line 2
    .line 3
    invoke-direct {v0}, Lu0/a;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lo0/a;->a:Li1/d;

    .line 7
    .line 8
    iget-wide v2, p0, Lo0/a;->b:J

    .line 9
    .line 10
    sget-object v4, Li1/t;->a:Li1/t;

    .line 11
    .line 12
    invoke-static {p1}, Ls0/E;->b(Landroid/graphics/Canvas;)Ls0/j0;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-object v5, p0, Lo0/a;->c:Lkotlin/jvm/functions/Function1;

    .line 17
    .line 18
    invoke-virtual {v0}, Lu0/a;->N()Lu0/a$a;

    .line 19
    .line 20
    .line 21
    move-result-object v6

    .line 22
    invoke-virtual {v6}, Lu0/a$a;->a()Li1/d;

    .line 23
    .line 24
    .line 25
    move-result-object v7

    .line 26
    invoke-virtual {v6}, Lu0/a$a;->b()Li1/t;

    .line 27
    .line 28
    .line 29
    move-result-object v8

    .line 30
    invoke-virtual {v6}, Lu0/a$a;->c()Ls0/j0;

    .line 31
    .line 32
    .line 33
    move-result-object v9

    .line 34
    invoke-virtual {v6}, Lu0/a$a;->d()J

    .line 35
    .line 36
    .line 37
    move-result-wide v10

    .line 38
    invoke-virtual {v0}, Lu0/a;->N()Lu0/a$a;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    invoke-virtual {v6, v1}, Lu0/a$a;->j(Li1/d;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v6, v4}, Lu0/a$a;->k(Li1/t;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v6, p1}, Lu0/a$a;->i(Ls0/j0;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v6, v2, v3}, Lu0/a$a;->l(J)V

    .line 52
    .line 53
    .line 54
    invoke-interface {p1}, Ls0/j0;->p()V

    .line 55
    .line 56
    .line 57
    invoke-interface {v5, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    invoke-interface {p1}, Ls0/j0;->k()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, Lu0/a;->N()Lu0/a$a;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {p1, v7}, Lu0/a$a;->j(Li1/d;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, v8}, Lu0/a$a;->k(Li1/t;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, v9}, Lu0/a$a;->i(Ls0/j0;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1, v10, v11}, Lu0/a$a;->l(J)V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public onProvideShadowMetrics(Landroid/graphics/Point;Landroid/graphics/Point;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lo0/a;->a:Li1/d;

    .line 2
    .line 3
    iget-wide v1, p0, Lo0/a;->b:J

    .line 4
    .line 5
    const/16 v3, 0x20

    .line 6
    .line 7
    shr-long/2addr v1, v3

    .line 8
    long-to-int v1, v1

    .line 9
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-interface {v0, v1}, Li1/d;->e1(F)F

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-interface {v0, v1}, Li1/d;->s0(F)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    iget-wide v2, p0, Lo0/a;->b:J

    .line 22
    .line 23
    const-wide v4, 0xffffffffL

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    and-long/2addr v2, v4

    .line 29
    long-to-int v2, v2

    .line 30
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    invoke-interface {v0, v2}, Li1/d;->e1(F)F

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    invoke-interface {v0, v2}, Li1/d;->s0(F)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    invoke-virtual {p1, v1, v0}, Landroid/graphics/Point;->set(II)V

    .line 43
    .line 44
    .line 45
    iget v0, p1, Landroid/graphics/Point;->x:I

    .line 46
    .line 47
    div-int/lit8 v0, v0, 0x2

    .line 48
    .line 49
    iget p1, p1, Landroid/graphics/Point;->y:I

    .line 50
    .line 51
    div-int/lit8 p1, p1, 0x2

    .line 52
    .line 53
    invoke-virtual {p2, v0, p1}, Landroid/graphics/Point;->set(II)V

    .line 54
    .line 55
    .line 56
    return-void
.end method
