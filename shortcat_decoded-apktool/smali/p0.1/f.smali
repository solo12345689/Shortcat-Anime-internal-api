.class public final Lp0/f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Li1/d;


# instance fields
.field private a:Lp0/d;

.field private b:Lp0/j;

.field private c:Lu0/c;

.field private d:Lie/a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lp0/k;->a:Lp0/k;

    .line 5
    .line 6
    iput-object v0, p0, Lp0/f;->a:Lp0/d;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final B(Lp0/j;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lp0/f;->b:Lp0/j;

    .line 2
    .line 3
    return-void
.end method

.method public final I(Lie/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lp0/f;->d:Lie/a;

    .line 2
    .line 3
    return-void
.end method

.method public final b()Lp0/j;
    .locals 1

    .line 1
    iget-object v0, p0, Lp0/f;->b:Lp0/j;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f()J
    .locals 2

    .line 1
    iget-object v0, p0, Lp0/f;->a:Lp0/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lp0/d;->f()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public getDensity()F
    .locals 1

    .line 1
    iget-object v0, p0, Lp0/f;->a:Lp0/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lp0/d;->getDensity()Li1/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Li1/d;->getDensity()F

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public final getLayoutDirection()Li1/t;
    .locals 1

    .line 1
    iget-object v0, p0, Lp0/f;->a:Lp0/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lp0/d;->getLayoutDirection()Li1/t;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final j(Lkotlin/jvm/functions/Function1;)Lp0/j;
    .locals 1

    .line 1
    new-instance v0, Lp0/f$a;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lp0/f$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lp0/f;->p(Lkotlin/jvm/functions/Function1;)Lp0/j;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public j1()F
    .locals 1

    .line 1
    iget-object v0, p0, Lp0/f;->a:Lp0/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lp0/d;->getDensity()Li1/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Li1/l;->j1()F

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public final p(Lkotlin/jvm/functions/Function1;)Lp0/j;
    .locals 1

    .line 1
    new-instance v0, Lp0/j;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lp0/j;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lp0/f;->b:Lp0/j;

    .line 7
    .line 8
    return-object v0
.end method

.method public final q(Lp0/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lp0/f;->a:Lp0/d;

    .line 2
    .line 3
    return-void
.end method

.method public final z(Lu0/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lp0/f;->c:Lu0/c;

    .line 2
    .line 3
    return-void
.end method
