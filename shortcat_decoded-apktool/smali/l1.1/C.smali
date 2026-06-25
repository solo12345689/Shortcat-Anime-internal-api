.class public final Ll1/C;
.super Lq1/g;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final l:Li1/d;

.field private m:J

.field private n:Li1/t;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Li1/d;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Lq1/g;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll1/C;->l:Li1/d;

    .line 5
    .line 6
    const/16 v4, 0xf

    .line 7
    .line 8
    const/4 v5, 0x0

    .line 9
    const/4 v0, 0x0

    .line 10
    const/4 v1, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-static/range {v0 .. v5}, Li1/c;->b(IIIIILjava/lang/Object;)J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    iput-wide v0, p0, Ll1/C;->m:J

    .line 18
    .line 19
    sget-object p1, Li1/t;->a:Li1/t;

    .line 20
    .line 21
    iput-object p1, p0, Ll1/C;->n:Li1/t;

    .line 22
    .line 23
    new-instance p1, Ll1/B;

    .line 24
    .line 25
    invoke-direct {p1, p0}, Ll1/B;-><init>(Ll1/C;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p1}, Lq1/g;->v(Lq1/c;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public static synthetic D(Ll1/C;F)F
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ll1/C;->E(Ll1/C;F)F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static final E(Ll1/C;F)F
    .locals 0

    .line 1
    iget-object p0, p0, Ll1/C;->l:Li1/d;

    .line 2
    .line 3
    invoke-interface {p0}, Li1/d;->getDensity()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    mul-float/2addr p0, p1

    .line 8
    return p0
.end method


# virtual methods
.method public final F()J
    .locals 2

    .line 1
    iget-wide v0, p0, Ll1/C;->m:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final G(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Ll1/C;->m:J

    .line 2
    .line 3
    return-void
.end method

.method public e(Ljava/lang/Object;)I
    .locals 1

    .line 1
    instance-of v0, p1, Li1/h;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Ll1/C;->l:Li1/d;

    .line 6
    .line 7
    check-cast p1, Li1/h;

    .line 8
    .line 9
    invoke-virtual {p1}, Li1/h;->t()F

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-interface {v0, p1}, Li1/d;->s0(F)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1

    .line 18
    :cond_0
    invoke-super {p0, p1}, Lq1/g;->e(Ljava/lang/Object;)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    return p1
.end method
